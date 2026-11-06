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
import java.util.Date;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.impl.BinaryResourceImpl;
import org.eclipse.fennec.event.atlas.mapping.InstancePusher;
import org.gecko.osgi.messaging.Message;
import org.gecko.osgi.messaging.MessagingService;
import org.osgi.service.component.annotations.Activate;
import org.osgi.service.component.annotations.Component;
import org.osgi.service.component.annotations.Deactivate;
import org.osgi.service.component.annotations.Reference;
import org.osgi.util.pushstream.PushEvent;
import org.osgi.util.pushstream.PushStream;

import de.jena.traficam.CamConfig;
import de.jena.traficam.ObservedClass;
import de.jena.traficam.TrafiCamDetections;
import de.jena.traficam.TrafiCamFactory;
import de.jena.traficam.TrafiCamObject;
import de.jena.traficam.TrafiCamPackage;

/**
 * Subscribes to the TrafiCam topics on the {@code read} gecko messaging service:
 * {@code 5g/traficam/<cam>/<class>} carries one binary EMF {@link TrafiCamObject} per detection,
 * {@code 5g/config/traficam/<cam>} and {@code 5g/traficam/<cam>/config/retained} a binary EMF
 * {@link CamConfig}.
 * <p>
 * Both flows leave through the same door: the adapter deserializes the payload and hands an
 * EObject to the {@link InstancePusher}, which finds the mappings registered for its EClass.
 * What the adapter still does itself is the part a mapping cannot express - the binary EMF
 * read, the camera and class ids that live in the topic rather than the payload, the
 * {@link #WINDOW_SECONDS}-second window, and the class name, which comes from a
 * {@link CamConfig} that arrived earlier on another topic.
 */
@Component(immediate = true)
public class TrafiCamListener {

	@Reference
	InstancePusher pusher;

	private static final Logger logger = System.getLogger(TrafiCamListener.class.getName());

	static final String TOPIC = "5g/traficam/";
	static final String CONFIG_TOPIC = "5g/config/traficam/";
	static final long WINDOW_SECONDS = 2;

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

	/**
	 * Closes every window and pushes one {@link TrafiCamDetections} per camera.
	 * <p>
	 * Per camera, not per class: the camera is the provider, and its object classes are
	 * services of that provider. One aggregate carrying them all reaches the twin as one
	 * update, and the mapping fans the {@code classes} collection out into the services.
	 * <p>
	 * A class whose window has nothing new to say is left out, and a camera all of whose
	 * classes are quiet is not pushed at all. That is how a partial payload is meant to read:
	 * the services it does not carry keep the values they had.
	 */
	void flushWindows() {
		Date now = new Date();
		windows.forEach((camId, classes) -> {
			TrafiCamDetections detections = TrafiCamFactory.eINSTANCE.createTrafiCamDetections();
			detections.setCamId(camId);
			detections.setTime(now);
			classes.forEach((classId, window) -> window.flush().ifPresent(objects -> {
				ObservedClass observed = TrafiCamFactory.eINSTANCE.createObservedClass();
				observed.setClassId(classId);
				observed.setClassificationName(className(camId, classId));
				// Containment: the objects move out of the resources they were read from,
				// which have served their purpose.
				observed.getObjects().addAll(objects);
				detections.getClasses().add(observed);
			}));
			if (detections.getClasses().isEmpty()) {
				return;
			}
			int applied = pusher.pushInstance(detections);
			if (applied == 0) {
				logger.log(Level.WARNING, "no provider mapping for the detections of camera {0}", camId);
			} else {
				logger.log(Level.DEBUG, "pushed {0} detection class(es) of camera {1}",
						detections.getClasses().size(), camId);
			}
		});
	}

	private void updateConfig(String camId, byte[] payload) throws IOException {
		CamConfig config = load(payload, CamConfig.class);
		config.setCamId(camId);
		configs.put(camId, config);
		int applied = pusher.pushInstance(config);
		if (applied == 0) {
			logger.log(Level.WARNING, "no provider mapping for the {0} CamConfig",
					config.getCamId());
		} else {
			logger.log(Level.INFO, "pushed {0} CamConfig", config.getCamId());
		}
	}

	/**
	 * The name the camera gives an object class, from the {@code classMap} of its
	 * configuration. The lookup crosses messages - the configuration arrived earlier, on
	 * another topic - so it happens here rather than in the mapping, and the class id stands
	 * in while no configuration has arrived.
	 */
	private String className(String camId, String classId) {
		CamConfig config = configs.get(camId);
		if (config == null) {
			logger.log(Level.WARNING, "no configuration for camera {0} yet", camId);
			return classId;
		}
		String name = config.getClassMap().get(classId);
		return name == null ? classId : name;
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
}
