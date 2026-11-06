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

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertInstanceOf;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.impl.BinaryResourceImpl;
import org.eclipse.fennec.event.atlas.mapping.InstancePusher;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import de.jena.traficam.CamConfig;
import de.jena.traficam.GpsCoordinates;
import de.jena.traficam.ObservedClass;
import de.jena.traficam.Scene;
import de.jena.traficam.TrafiCamDetections;
import de.jena.traficam.TrafiCamFactory;
import de.jena.traficam.TrafiCamObject;

/**
 * What the adapter is still responsible for once the provider shaping is a mapping: the
 * aggregate it builds. The GeoJSON, the provider and the services are the mapping's business
 * and are not asserted here.
 */
class TrafiCamListenerTest {

	private final List<EObject> pushed = new ArrayList<>();
	private TrafiCamListener listener;

	@BeforeEach
	void createListener() {
		listener = new TrafiCamListener();
		listener.pusher = new RecordingPusher(pushed);
	}

	@Test
	void theObjectsOfOneClassBecomeOneEntryPerObjectId() throws Exception {
		listener.handle("5g/traficam/cam1/2", detection(7L, 11.58, 50.92));
		listener.handle("5g/traficam/cam1/2", detection(8L, 11.59, 50.93));
		listener.handle("5g/traficam/cam1/2", detection(7L, 11.58, 50.92));

		listener.flushWindows();

		TrafiCamDetections detections = assertInstanceOf(TrafiCamDetections.class, pushed.get(0));
		assertEquals("cam1", detections.getCamId());
		assertNotNull(detections.getTime());
		assertEquals(1, detections.getClasses().size());

		ObservedClass observed = detections.getClasses().get(0);
		assertEquals("2", observed.getClassId());
		assertEquals(2, observed.getObjects().size());

		TrafiCamObject first = observed.getObjects().get(0);
		assertEquals(7L, first.getId());
		assertEquals(12.0, first.getSpeed());
		assertEquals(180.0, first.getGpsCoordinates().get(0).getHeading());
	}

	@Test
	void oneCameraPushesOneAggregateCarryingEveryClassItSaw() throws Exception {
		listener.handle("5g/traficam/cam1/2", detection(7L, 11.58, 50.92));
		listener.handle("5g/traficam/cam1/3", detection(9L, 11.60, 50.94));

		listener.flushWindows();

		assertEquals(1, pushed.size());
		TrafiCamDetections detections = assertInstanceOf(TrafiCamDetections.class, pushed.get(0));
		assertEquals(List.of("2", "3"),
				detections.getClasses().stream().map(ObservedClass::getClassId).sorted().toList());
	}

	@Test
	void aDetectionWithoutCoordinatesIsNoSighting() throws Exception {
		TrafiCamObject blind = TrafiCamFactory.eINSTANCE.createTrafiCamObject();
		blind.setId(7L);
		listener.handle("5g/traficam/cam1/2", binary(blind));

		listener.flushWindows();

		// The window is empty, so it reports empty once - it does not report the object.
		TrafiCamDetections detections = assertInstanceOf(TrafiCamDetections.class, pushed.get(0));
		assertTrue(detections.getClasses().get(0).getObjects().isEmpty());
	}

	@Test
	void aQuietClassReportsEmptyOnceAndThenTheCameraStaysSilent() throws Exception {
		listener.handle("5g/traficam/cam1/2", detection(7L, 11.58, 50.92));
		listener.flushWindows();

		listener.flushWindows();
		listener.flushWindows();

		assertEquals(2, pushed.size());
		TrafiCamDetections empty = assertInstanceOf(TrafiCamDetections.class, pushed.get(1));
		assertTrue(empty.getClasses().get(0).getObjects().isEmpty());
	}

	@Test
	void theClassNameComesFromAConfigurationThatArrivedEarlier() throws Exception {
		listener.handle("5g/config/traficam/cam1", configuration());
		listener.handle("5g/traficam/cam1/2", detection(7L, 11.58, 50.92));
		listener.flushWindows();

		CamConfig config = assertInstanceOf(CamConfig.class, pushed.get(0));
		assertEquals("cam1", config.getCamId());

		TrafiCamDetections detections = assertInstanceOf(TrafiCamDetections.class, pushed.get(1));
		assertEquals("car", detections.getClasses().get(0).getClassificationName());
	}

	@Test
	void theClassIdStandsInWhileNoConfigurationHasArrived() throws Exception {
		listener.handle("5g/traficam/cam1/2", detection(7L, 11.58, 50.92));
		listener.flushWindows();

		TrafiCamDetections detections = assertInstanceOf(TrafiCamDetections.class, pushed.get(0));
		assertEquals("2", detections.getClasses().get(0).getClassificationName());
	}

	@Test
	void samplePayloadsForAReplayAreWrittenWhenAskedFor() throws Exception {
		String directory = System.getenv("TRAFICAM_SAMPLES");
		if (directory == null) {
			return;
		}
		Path samples = Files.createDirectories(Path.of(directory));
		Files.write(samples.resolve("cam1-config.bin"), configuration());
		Files.write(samples.resolve("cam1-class2-object7.bin"), detection(7L, 11.58126, 50.92091));
		Files.write(samples.resolve("cam1-class2-object8.bin"), detection(8L, 11.58131, 50.92095));
		Files.write(samples.resolve("felsenkeller-config.bin"), configuration());
		Files.write(samples.resolve("felsenkeller-class3-south.bin"), detection(31L, 11.58127, 50.92114, 12.0, 180.0));
		Files.write(samples.resolve("felsenkeller-class3-north.bin"), detection(32L, 11.58127, 50.92114, 12.0, 10.0));
	}

	static byte[] detection(long id, double lon, double lat) throws IOException {
		return detection(id, lon, lat, 12.0, 180.0);
	}

	static byte[] detection(long id, double lon, double lat, double speed, double heading) throws IOException {
		TrafiCamObject detection = TrafiCamFactory.eINSTANCE.createTrafiCamObject();
		detection.setId(id);
		detection.setClassId((short) 2);
		detection.setSpeed(speed);
		GpsCoordinates gps = gps(lon, lat);
		gps.setHeading(heading);
		detection.getGpsCoordinates().add(gps);
		return binary(detection);
	}

	static byte[] configuration() throws IOException {
		TrafiCamFactory factory = TrafiCamFactory.eINSTANCE;
		CamConfig config = factory.createCamConfig();
		config.setLocation(gps(11.5812, 50.9209));
		Scene scene = factory.createScene();
		scene.setLeftBottom(gps(11.581, 50.920));
		scene.setRightBottom(gps(11.582, 50.920));
		scene.setRightTop(gps(11.582, 50.921));
		scene.setLeftTop(gps(11.581, 50.921));
		config.setScene(scene);
		config.getClassMap().put("2", "car");
		return binary(config);
	}

	static GpsCoordinates gps(double lon, double lat) {
		GpsCoordinates gps = TrafiCamFactory.eINSTANCE.createGpsCoordinates();
		gps.setLongitude(lon);
		gps.setLatitude(lat);
		return gps;
	}

	static byte[] binary(EObject object) throws IOException {
		BinaryResourceImpl resource = new BinaryResourceImpl();
		resource.getContents().add(object);
		ByteArrayOutputStream out = new ByteArrayOutputStream();
		resource.save(out, Map.of());
		return out.toByteArray();
	}

	/** Stands in for the mapping engine: records what the adapter hands it. */
	record RecordingPusher(List<EObject> pushed) implements InstancePusher {
		@Override
		public int pushInstance(EObject instance) {
			pushed.add(instance);
			return 1;
		}
	}
}
