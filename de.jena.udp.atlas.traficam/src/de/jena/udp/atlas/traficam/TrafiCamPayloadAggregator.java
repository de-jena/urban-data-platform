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

import java.lang.System.Logger;
import java.lang.System.Logger.Level;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

import org.eclipse.emf.ecore.EObject;
import org.osgi.service.component.annotations.Component;

import de.jena.traficam.CamConfig;
import de.jena.traficam.ObservedClass;
import de.jena.traficam.TrafiCamDetections;
import de.jena.traficam.TrafiCamFactory;
import de.jena.traficam.TrafiCamObject;
import de.jena.udp.atlas.cloudevent.listener.PayloadAggregator;

/**
 * What the TrafiCam detections add up to over a window: one {@link TrafiCamDetections} per
 * camera, carrying every object class that camera reported.
 * <p>
 * Per camera, not per class: the camera is the provider, and its object classes are services
 * of that provider. One aggregate carrying them all reaches the twin as one update, and the
 * mapping fans the {@code classes} collection out into the services. A class whose window has
 * nothing new to say is left out, and a camera all of whose classes are quiet produces no
 * aggregate at all. That is how a partial payload is meant to read: the services it does not
 * carry keep the values they had.
 * <p>
 * The camera configurations pass through: they are read, for the class names the detections
 * cannot carry themselves, and then left to the listener to push as they arrive. That is why
 * the configuration flow binds this aggregator too - the lookup crosses messages and topics,
 * which is exactly what a mapping cannot do.
 * <p>
 * This is the TrafiCam half of the envelope-rooted flow - the {@link PayloadAggregator} the
 * MQTT CloudEvent listener binds. The payload-rooted listener that used to do the same thing
 * for bare instances has been removed; its mapping seeds are kept in eventatlas/retired/.
 */
@Component(service = PayloadAggregator.class, property = PayloadAggregator.AGGREGATOR_ID + "=traficam")
public class TrafiCamPayloadAggregator implements PayloadAggregator {

	private static final Logger logger = System.getLogger(TrafiCamPayloadAggregator.class.getName());

	/** The detection topic, {@code 5g/traficam/<cam>/<class>} - also the source a flushed window
	 * is attributed to when the camera was never seen on a concrete one. */
	static final String TOPIC = "5g/traficam/";

	/** The live configuration topic, {@code 5g/config/traficam/<cam>}. The retained one is
	 * {@code 5g/traficam/<cam>/config/retained} and is recognised by its suffix instead. */
	static final String CONFIG_TOPIC = "5g/config/traficam/";

	private final Map<String, CamConfig> configs = new ConcurrentHashMap<>();
	private final Map<String, Map<String, DetectionWindow>> windows = new ConcurrentHashMap<>();
	/** The topic that stands for a camera's window: the last one it was seen on. */
	private final Map<String, String> sources = new ConcurrentHashMap<>();

	@Override
	public boolean collect(String topic, EObject payload) {
		if (payload instanceof CamConfig camConfig) {
			configs.put(camId(topic), camConfig);
			return false; // the configuration is pushed as it arrives
		}
		if (payload instanceof TrafiCamObject detection) {
			String[] segments = topic.split("/");
			if (segments.length < 4) {
				logger.log(Level.WARNING, "no camera and class in the detection topic {0}", topic);
				return false;
			}
			windows.computeIfAbsent(segments[2], _ -> new ConcurrentHashMap<>())
					.computeIfAbsent(segments[3], _ -> new DetectionWindow())
					.add(detection);
			sources.put(segments[2], topic);
			return true;
		}
		logger.log(Level.WARNING, "{0} carries neither a detection nor a configuration", topic);
		return false;
	}

	@Override
	public List<Aggregate> flush() {
		Date now = new Date();
		List<Aggregate> aggregates = new ArrayList<>();
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
			aggregates.add(new Aggregate(sources.getOrDefault(camId, TOPIC + camId), detections, now));
		});
		return aggregates;
	}

	/**
	 * The camera a configuration belongs to, which is a different segment on each of the two
	 * topics that carry one: {@code 5g/config/traficam/<cam>} and
	 * {@code 5g/traficam/<cam>/config/retained}.
	 */
	private static String camId(String topic) {
		String[] segments = topic.split("/");
		if (topic.startsWith(CONFIG_TOPIC) && segments.length > 3) {
			return segments[3];
		}
		if (topic.endsWith("config/retained") && segments.length > 2) {
			return segments[2];
		}
		logger.log(Level.WARNING, "no camera in the configuration topic {0}", topic);
		return topic;
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
}
