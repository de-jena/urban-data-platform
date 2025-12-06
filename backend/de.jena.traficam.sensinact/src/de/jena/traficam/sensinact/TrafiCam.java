/*
 * Copyright (c) 2012 - 2024 Data In Motion and others.
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

package de.jena.traficam.sensinact;

import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.lang.System.Logger;
import java.lang.System.Logger.Level;
import java.time.Duration;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.concurrent.Executors;
import java.util.concurrent.atomic.AtomicBoolean;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.impl.BinaryResourceImpl;
import org.eclipse.sensinact.core.push.DataUpdate;
import org.eclipse.sensinact.gateway.geojson.Geometry;
import org.eclipse.sensinact.gateway.geojson.GeometryCollection;
import org.eclipse.sensinact.gateway.geojson.Point;
import org.gecko.emf.json.annotation.RequireEMFJson;
import org.gecko.osgi.messaging.Message;
import org.gecko.osgi.messaging.MessagingContext;
import org.gecko.osgi.messaging.MessagingService;
import org.gecko.osgi.messaging.SimpleMessagingContextBuilder;
import org.gecko.util.pushstream.OptionPushStreamContext;
import org.gecko.util.pushstream.PushStreamConstants;
import org.osgi.service.component.annotations.Activate;
import org.osgi.service.component.annotations.Component;
import org.osgi.service.component.annotations.Deactivate;
import org.osgi.service.component.annotations.Reference;
import org.osgi.util.promise.Promise;
import org.osgi.util.pushstream.PushEvent;
import org.osgi.util.pushstream.PushEvent.EventType;
import org.osgi.util.pushstream.PushStream;
import org.osgi.util.pushstream.PushStreamProvider;
import org.osgi.util.pushstream.QueuePolicyOption;
import org.osgi.util.pushstream.SimplePushEventSource;

import de.jena.traficam.CamConfig;
import de.jena.traficam.GpsCoordinates;
import de.jena.traficam.Scene;
import de.jena.traficam.TrafiCamObject;
import de.jena.traficam.sensinact.model.traficamprovider.ObservedObjects;
import de.jena.traficam.sensinact.model.traficamprovider.TraficamAdmin;
import de.jena.traficam.sensinact.model.traficamprovider.TraficamProvider;
import de.jena.traficam.sensinact.model.traficamprovider.TraficamproviderFactory;

@RequireEMFJson
@Component(name = "TrafiCamComponent")
public class TrafiCam {

	private static final Logger logger = System.getLogger(TrafiCam.class.getName());

	private static final String CONFIG_TOPIC = "5g/config/traficam/";
	private static final String TOPIC = "5g/traficam/";

	@Reference
	private DataUpdate sensiNact;

	@Reference(target = "(id=read)")
	private MessagingService messaging;

	private PushStreamProvider psp = new PushStreamProvider();
	private PushStream<Message> subscription;

	private Map<String, Map<String, SimplePushEventSource<Message>>> sources = Collections
			.synchronizedMap(new HashMap<>());
	private Map<String, CamConfig> configs = new HashMap<>();

	private PushStream<Message> configSubscription;

	@Activate
	public void activate() {
		Map<String, Object> pushOptions = Map.of(PushStreamConstants.PROP_BUFFER_SIZE, 3200,
				PushStreamConstants.PROP_PARALLELISM, 10, PushStreamConstants.PROP_QUEUE_POLICY_OPTION,
				QueuePolicyOption.BLOCK, PushStreamConstants.PROP_EXECUTOR, Executors.newCachedThreadPool());

		MessagingContext messagingContext = new SimpleMessagingContextBuilder()
				.withPushstreamContext(new OptionPushStreamContext<>(pushOptions)).build();
		try {
			subscription = messaging.subscribe(TOPIC + "#", messagingContext);
			subscription.forEachEvent(this::handle);
			configSubscription = messaging.subscribe(CONFIG_TOPIC + "#", messagingContext);
			configSubscription.forEachEvent(this::handleConfig);
		} catch (Exception e) {
			logger.log(Level.ERROR, "Error subscribing mqtt {0}.\n{1}", TOPIC, e);
		}
		logger.log(Level.INFO, "Sensinact TrafiCam started.");
	}

	@Deactivate
	private void deactivate() {
		subscription.close();
		configSubscription.close();
		sources.values().forEach(m -> m.values().forEach(s -> s.close()));
	}

	private long handleConfig(PushEvent<? extends Message> event) {
		EventType type = event.getType();
		switch (type) {
		case CLOSE:
			logger.log(Level.INFO, "PushStream closed.");
			break;
		case DATA:
			onConfig(event.getData());
			break;
		case ERROR:
			event.getFailure().printStackTrace();
			break;
		default:
			break;
		}
		return 0;
	}

	private long handle(PushEvent<? extends Message> event) {
		EventType type = event.getType();
		switch (type) {
		case CLOSE:
			logger.log(Level.INFO, "PushStream closed.");
			break;
		case DATA:
			onMessage(event.getData());
			break;
		case ERROR:
			event.getFailure().printStackTrace();
			break;
		default:
			break;
		}
		return 0;
	}

	private void onConfig(Message message) {
		String topic = message.topic();
		String[] split = topic.split("/");
		String camId = split[3];
		updateConfig(message, camId);
	}

	private void onMessage(Message message) {
		String topic = message.topic();
		String[] split = topic.split("/");
		String camId = split[2];
		String classId = split[3];
		if (topic.endsWith("config/retained")) {
			updateConfig(message, camId);
		} else if (topic.endsWith("lifesign")) {
		} else {
			if (split.length >= 4) {
				update(message, camId, classId);
			}
		}
	}

	private void update(Message message, String camId, String classId) {

		Map<String, SimplePushEventSource<Message>> s = sources.computeIfAbsent(camId,
				k -> Collections.synchronizedMap(new HashMap<>()));
		SimplePushEventSource<Message> source = s.computeIfAbsent(classId, k -> createSource(camId, classId));
		source.publish(message);
	}

	private SimplePushEventSource<Message> createSource(String camId, String classId) {
		String className = getClassName(camId, classId);
		final SimplePushEventSource<Message> source = psp.buildSimpleEventSource(Message.class)
				.withQueuePolicy(QueuePolicyOption.BLOCK).build();
		final AtomicBoolean sendEmpty = new AtomicBoolean(false);
		PushStream<GeometryCollection> stream = psp.buildStream(source).unbuffered().build()
				.window(Duration.ofSeconds(2), messages -> {
					List<Geometry> geometries = new ArrayList<>();
					List<String> seenIds = new ArrayList<>();
					for (Message message : messages) {
						Optional<TrafiCamObject> optionalTC = loadTrafiCamObject(message);
						if (optionalTC.isPresent()) {
							TrafiCamObject tc = optionalTC.get();
							GpsCoordinates gps = tc.getGpsCoordinates().get(0);
							if (gps != null) {
								String id = "" + tc.getId();
								if (!seenIds.contains(id)) {
//									Map<String, Object> properties = new HashMap<>();
//									properties.put("id", id);
//									properties.put("class", classId);
//									properties.put("className", className);
//									properties.put("speed", tc.getSpeed());
//									properties.put("heading", gps.getHeading());
//									properties.put("time", tc.getTime().getTime());

									Point point = createGeometry(gps);
									geometries.add(point);
									seenIds.add(id);
									sendEmpty.set(false);
								}
							}
						}
					}
					return new GeometryCollection(geometries, null, null);
				});
		stream.forEach(geo -> {
			if (!geo.isEmpty() || !sendEmpty.getAndSet(true)) {
				TrafiCamDto dto = new TrafiCamDto(camId, classId, className, geo);
				dto.timestamp = new Date().getTime();
				Promise<?> promise = sensiNact.pushUpdate(dto);
				promise.onFailure(e -> logger.log(Level.ERROR, "Error while pushing update to sensinact.\n{0}", e));
			}
		});
		return source;
	}

	private Optional<TrafiCamObject> loadTrafiCamObject(Message message) {
		try {
			BinaryResourceImpl resource = new BinaryResourceImpl();
			resource.load(new ByteArrayInputStream(message.payload().array()), Collections.emptyMap());
			EList<EObject> contents = resource.getContents();
			if (contents.isEmpty()) {
				logger.log(Level.WARNING, "Can't load Traficam from {0}.", message);
				return Optional.empty();
			}
			return Optional.of((TrafiCamObject) contents.get(0));
		} catch (IOException e) {
			logger.log(Level.ERROR, "Error while parsing json {0}.\n{1}", new String(message.payload().array()), e);
			return Optional.empty();
		}
	}

	private String getClassName(String camId, String classId) {
		CamConfig camConfig = configs.get(camId);
		if (camConfig == null) {
			logger.log(Level.WARNING, "Warn: configuration for {0} not loaded.", camId);
			return classId;
		}
		return camConfig.getClassMap().get(classId);
	}

	private GeometryCollection createGeometryCollection(String camId) {
		CamConfig camConfig = configs.get(camId);
		if (camConfig == null) {
			logger.log(Level.WARNING, "Warn: configuration for {0} not loaded.", camId);
			return null;
		}
		Scene scene = camConfig.getScene();
		GpsCoordinates gps = scene.getLeftBottom();
		if (gps == null) {
			return null;
		}
		List<Geometry> geometries = Arrays.asList(createGeometry(scene.getLeftBottom()),
				createGeometry(scene.getRightBottom()), //
				createGeometry(scene.getRightTop()), //
				createGeometry(scene.getLeftTop()));

		return new GeometryCollection(geometries, null, null);
	}

	private Point createGeometry(GpsCoordinates x) {
		return new Point(x.getLongitude(), x.getLatitude());
	}

	private Point createLocation(String camId) {

		CamConfig camConfig = configs.get(camId);
		if (camConfig == null) {
			logger.log(Level.WARNING, "Warn: configuration for {0} not loaded.", camId);
			return null;
		}

		GpsCoordinates gps = camConfig.getLocation();
		if (gps == null) {
			return null;
		}
		return createGeometry(gps);
	}

	private void updateConfig(Message message, String camId) {
		Resource resource = new BinaryResourceImpl();
		try {
			resource.load(new ByteArrayInputStream(message.payload().array()), Collections.emptyMap());
			CamConfig configuration = (CamConfig) resource.getContents().get(0);
			configs.put(camId, configuration);
			TraficamProvider traficamProvider = TraficamproviderFactory.eINSTANCE.createTraficamProvider();
			TraficamAdmin traficamAdmin = TraficamproviderFactory.eINSTANCE.createTraficamAdmin();
			traficamProvider.setId(camId);
			traficamProvider.setAdmin(traficamAdmin);
			traficamAdmin.setLocation(createLocation(camId));
			traficamAdmin.setFriendlyName("Camera " + camId);

			GeometryCollection viewport = createGeometryCollection(camId);
			traficamAdmin.setViewport(viewport);
			ObservedObjects area = TraficamproviderFactory.eINSTANCE.createObservedObjects();
			area.setObjects(viewport);
			traficamProvider.getServices().put("observedArea", area);
			Promise<?> promise = sensiNact.pushUpdate(traficamProvider);
			promise.onFailure(e -> logger.log(Level.ERROR, "Error while pushing configuration to sensinact.", e));

		} catch (IOException e) {
			logger.log(Level.ERROR, "Error while parsing json.\n{0}", e);
		}
	}
}