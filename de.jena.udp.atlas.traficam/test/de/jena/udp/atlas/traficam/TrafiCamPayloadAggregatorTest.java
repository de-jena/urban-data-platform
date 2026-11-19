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

import static de.jena.udp.atlas.traficam.TrafiCamFixtures.camConfig;
import static de.jena.udp.atlas.traficam.TrafiCamFixtures.trafiCamObject;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertInstanceOf;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.util.List;

import org.eclipse.emf.ecore.EcoreFactory;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import de.jena.traficam.ObservedClass;
import de.jena.traficam.TrafiCamDetections;
import de.jena.udp.atlas.cloudevent.listener.PayloadAggregator.Aggregate;

/**
 * What the TrafiCam payloads add up to over a window: the half of the envelope-rooted flow
 * that is TrafiCam's. The envelope put around an aggregate belongs to the listener and is
 * tested with it, in the cloudevent listener bundle.
 */
class TrafiCamPayloadAggregatorTest {

	private TrafiCamPayloadAggregator aggregator;

	@BeforeEach
	void createAggregator() {
		aggregator = new TrafiCamPayloadAggregator();
	}

	/**
	 * The detections are what the window is for; a configuration is only read - for the
	 * class names - and left to the listener to push as it arrives.
	 */
	@Test
	void aDetectionIsTakenAndAConfigurationIsLeftToTheListener() {
		assertTrue(aggregator.collect("5g/traficam/cam1/2", trafiCamObject(7L, 11.58, 50.92)));
		assertFalse(aggregator.collect("5g/config/traficam/cam1", camConfig()));
	}

	@Test
	void aPayloadOfNeitherKindIsLeftToTheListener() {
		assertFalse(aggregator.collect("5g/traficam/cam1/2", EcoreFactory.eINSTANCE.createEAnnotation()));
	}

	@Test
	void oneCameraFlushesOneAggregateCarryingEveryClassItSaw() {
		aggregator.collect("5g/traficam/cam1/2", trafiCamObject(7L, 11.58, 50.92));
		aggregator.collect("5g/traficam/cam1/3", trafiCamObject(9L, 11.60, 50.94));
		aggregator.collect("5g/traficam/cam1/2", trafiCamObject(7L, 11.58, 50.92));

		List<Aggregate> aggregates = aggregator.flush();

		assertEquals(1, aggregates.size());
		Aggregate aggregate = aggregates.get(0);
		// the topic that stands for the window is the last one the camera was seen on
		assertEquals("5g/traficam/cam1/2", aggregate.source());
		TrafiCamDetections detections = assertInstanceOf(TrafiCamDetections.class, aggregate.data());
		assertEquals("cam1", detections.getCamId());
		assertNotNull(detections.getTime());
		assertEquals(aggregate.time(), detections.getTime());
		assertEquals(List.of("2", "3"),
				detections.getClasses().stream().map(ObservedClass::getClassId).sorted().toList());
		assertEquals(1, detections.getClasses().stream().filter(observed -> "2".equals(observed.getClassId()))
				.findFirst().orElseThrow().getObjects().size());
	}

	@Test
	void aQuietCameraIsFlushedEmptyOnceAndThenStaysSilent() {
		aggregator.collect("5g/traficam/cam1/2", trafiCamObject(7L, 11.58, 50.92));

		assertEquals(1, aggregator.flush().size());

		List<Aggregate> quiet = aggregator.flush();

		assertEquals(1, quiet.size());
		TrafiCamDetections empty = assertInstanceOf(TrafiCamDetections.class, quiet.get(0).data());
		assertTrue(empty.getClasses().get(0).getObjects().isEmpty());
		assertTrue(aggregator.flush().isEmpty());
	}

	/**
	 * The class names arrive with the camera configuration, on another topic and earlier -
	 * a lookup across messages, which is why it lives here and not in the mapping. A
	 * configuration arrives on either of two topics, and both are one listener flow.
	 */
	@Test
	void theClassNameComesFromAConfigurationThatArrivedOnAnotherTopic() {
		aggregator.collect("5g/config/traficam/cam1", camConfig());
		aggregator.collect("5g/traficam/cam2/config/retained", camConfig());
		aggregator.collect("5g/traficam/cam1/2", trafiCamObject(7L, 11.58, 50.92));
		aggregator.collect("5g/traficam/cam2/2", trafiCamObject(8L, 11.59, 50.93));

		assertEquals(List.of("car", "car"),
				aggregator.flush().stream().map(aggregate -> assertInstanceOf(TrafiCamDetections.class,
						aggregate.data())).map(detections -> detections.getClasses().get(0).getClassificationName())
						.toList());
	}

	@Test
	void theClassIdStandsInWhileNoConfigurationHasArrived() {
		aggregator.collect("5g/traficam/cam1/2", trafiCamObject(7L, 11.58, 50.92));

		TrafiCamDetections detections = assertInstanceOf(TrafiCamDetections.class, aggregator.flush().get(0).data());
		assertEquals("2", detections.getClasses().get(0).getClassificationName());
	}
}
