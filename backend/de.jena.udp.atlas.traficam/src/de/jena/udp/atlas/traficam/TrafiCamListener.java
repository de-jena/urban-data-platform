/*
 * Copyright (c) 2012 - 2026 Data In Motion and others.
 * All rights reserved.
 *
 * This program and the accompanying materials are made
 * available under the terms of the Eclipse Public License 2.0
 * which is available at https://www.eclipse.org/legal/epl-2.0/
 * SPDX-License-Identifier: EPL-2.0
 *
 * Contributors:
 *     Data In Motion - initial API and implementation
 */
package de.jena.udp.atlas.traficam;

import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.lang.System.Logger;
import java.lang.System.Logger.Level;
import java.nio.ByteBuffer;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.impl.BinaryResourceImpl;
import org.eclipse.sensinact.core.push.DataUpdate;
import org.eclipse.sensinact.gateway.geojson.Geometry;
import org.eclipse.sensinact.gateway.geojson.GeometryCollection;
import org.eclipse.sensinact.gateway.geojson.Point;
import org.gecko.osgi.messaging.Message;
import org.gecko.osgi.messaging.MessagingService;
import org.osgi.service.component.annotations.Activate;
import org.osgi.service.component.annotations.Component;
import org.osgi.service.component.annotations.Deactivate;
import org.osgi.service.component.annotations.Reference;
import org.osgi.util.pushstream.PushEvent;
import org.osgi.util.pushstream.PushStream;

import de.jena.traficam.CamConfig;
import de.jena.traficam.GpsCoordinates;
import de.jena.traficam.Scene;
import de.jena.traficam.TrafiCamObject;
import de.jena.traficam.TrafiCamPackage;
import de.jena.traficam.sensinact.model.traficamprovider.ObservedObjects;
import de.jena.traficam.sensinact.model.traficamprovider.TraficamAdmin;
import de.jena.traficam.sensinact.model.traficamprovider.TraficamProvider;
import de.jena.traficam.sensinact.model.traficamprovider.TraficamproviderFactory;

/**
 * Subscribes to the TrafiCam topics on the {@code read} gecko messaging service:
 * {@code 5g/traficam/<cam>/<class>} carries one binary EMF {@link TrafiCamObject} per detection,
 * {@code 5g/config/traficam/<cam>} and {@code 5g/traficam/<cam>/config/retained} a binary EMF
 * {@link CamConfig}. Detections are pushed per class every {@link #WINDOW_SECONDS} seconds.
 */
@Component(immediate = true)
public class TrafiCamListener {

	private static final Logger logger = System.getLogger(TrafiCamListener.class.getName());

	static final String TOPIC = "5g/traficam/";
	static final String CONFIG_TOPIC = "5g/config/traficam/";
	static final long WINDOW_SECONDS = 2;

	@Reference
	DataUpdate sensiNact;

	@Reference(target = "(id=read)")
	private MessagingService messaging;

	private final Map<String, CamConfig> configs = new ConcurrentHashMap<>();
	private final Map<String, Map<String, DetectionWindow>> windows = new ConcurrentHashMap<>();
	private PushStream<Message> detections;
	private PushStream<Message> configurations;
	private ScheduledExecutorService scheduler;

	@Activate
	void activate() throws Exception {
		TrafiCamPackage.eINSTANCE.getNsURI(); // registers the payload model for BinaryResourceImpl
		scheduler = Executors.newSingleThreadScheduledExecutor(runnable -> {
			Thread thread = new Thread(runnable, "udp-traficam");
			thread.setDaemon(true);
			return thread;
		});
		scheduler.scheduleAtFixedRate(this::flushWindows, WINDOW_SECONDS, WINDOW_SECONDS, TimeUnit.SECONDS);
		detections = messaging.subscribe(TOPIC + "#");
		detections.forEachEvent(this::onEvent);
		configurations = messaging.subscribe(CONFIG_TOPIC + "#");
		configurations.forEachEvent(this::onEvent);
		logger.log(Level.INFO, "TrafiCam adapter listening on {0}# and {1}#", TOPIC, CONFIG_TOPIC);
	}

	@Deactivate
	void deactivate() {
		detections.close();
		configurations.close();
		scheduler.shutdownNow();
	}

	private long onEvent(PushEvent<? extends Message> event) {
		switch (event.getType()) {
		case DATA -> {
			Message message = event.getData();
			try {
				handle(message.topic(), bytes(message.payload()));
			} catch (Exception e) {
				logger.log(Level.ERROR, "Error processing message on topic " + message.topic(), e);
			}
		}
		case ERROR -> logger.log(Level.ERROR, "TrafiCam subscription failed", event.getFailure());
		case CLOSE -> logger.log(Level.INFO, "TrafiCam subscription closed");
		}
		return 0;
	}

	static byte[] bytes(ByteBuffer payload) {
		byte[] bytes = new byte[payload.remaining()];
		payload.duplicate().get(bytes);
		return bytes;
	}

	void handle(String topic, byte[] payload) throws IOException {
		String[] segments = topic.split("/");
		if (topic.startsWith(CONFIG_TOPIC) && segments.length > 3) {
			updateConfig(segments[3], payload);
		} else if (topic.endsWith("config/retained")) {
			updateConfig(segments[2], payload);
		} else if (!topic.endsWith("lifesign") && segments.length >= 4) {
			windows.computeIfAbsent(segments[2], _ -> new ConcurrentHashMap<>())
					.computeIfAbsent(segments[3], _ -> new DetectionWindow())
					.add(load(payload, TrafiCamObject.class));
		}
	}

	void flushWindows() {
		long now = System.currentTimeMillis();
		windows.forEach((camId, classes) -> classes.forEach((classId, window) -> {
			Optional<GeometryCollection> seen = window.flush();
			if (seen.isPresent()) {
				TrafiCamDto dto = new TrafiCamDto(camId, classId, className(camId, classId), seen.get(), now);
				push(dto, "objects of class " + classId + " of camera " + camId);
			}
		}));
	}

	private void updateConfig(String camId, byte[] payload) throws IOException {
		CamConfig config = load(payload, CamConfig.class);
		configs.put(camId, config);
		TraficamproviderFactory factory = TraficamproviderFactory.eINSTANCE;
		TraficamProvider provider = factory.createTraficamProvider();
		provider.setId(camId);
		TraficamAdmin admin = factory.createTraficamAdmin();
		admin.setFriendlyName("Camera " + camId);
		admin.setLocation(point(config.getLocation()));
		GeometryCollection viewport = viewport(config.getScene());
		admin.setViewport(viewport);
		provider.setAdmin(admin);
		ObservedObjects observedArea = factory.createObservedObjects();
		observedArea.setObjects(viewport);
		provider.getServices().put("observedArea", observedArea);
		push(provider, "configuration of camera " + camId);
	}

	private String className(String camId, String classId) {
		CamConfig config = configs.get(camId);
		if (config == null) {
			logger.log(Level.WARNING, "no configuration for camera {0} yet", camId);
			return classId;
		}
		String name = config.getClassMap().get(classId);
		return name == null ? classId : name;
	}

	private static GeometryCollection viewport(Scene scene) {
		if (scene == null || scene.getLeftBottom() == null) {
			return null;
		}
		List<Geometry> corners = List.of(point(scene.getLeftBottom()), point(scene.getRightBottom()),
				point(scene.getRightTop()), point(scene.getLeftTop()));
		return new GeometryCollection(corners, null, null);
	}

	private static Point point(GpsCoordinates gps) {
		return gps == null ? null : new Point(gps.getLongitude(), gps.getLatitude());
	}

	@SuppressWarnings("unchecked")
	private static <T extends EObject> T load(byte[] payload, Class<T> type) throws IOException {
		Resource resource = new BinaryResourceImpl();
		resource.load(new ByteArrayInputStream(payload), Map.of());
		if (resource.getContents().isEmpty() || !type.isInstance(resource.getContents().get(0))) {
			throw new IOException("payload is no " + type.getSimpleName());
		}
		return (T) resource.getContents().get(0);
	}

	private void push(Object update, String what) {
		sensiNact.pushUpdate(update)
				.onFailure(e -> logger.log(Level.ERROR, "Error while pushing " + what + " to sensiNact", e));
	}
}
