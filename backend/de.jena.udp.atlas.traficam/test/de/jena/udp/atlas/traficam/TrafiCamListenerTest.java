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
import org.eclipse.sensinact.core.push.DataUpdate;
import org.eclipse.sensinact.gateway.geojson.Feature;
import org.eclipse.sensinact.gateway.geojson.FeatureCollection;
import org.eclipse.sensinact.gateway.geojson.GeometryCollection;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.osgi.util.promise.Promise;
import org.osgi.util.promise.Promises;

import de.jena.traficam.CamConfig;
import de.jena.traficam.GpsCoordinates;
import de.jena.traficam.Scene;
import de.jena.traficam.TrafiCamFactory;
import de.jena.traficam.TrafiCamObject;
import de.jena.traficam.sensinact.model.traficamprovider.TraficamAdmin;
import de.jena.traficam.sensinact.model.traficamprovider.TraficamProvider;

class TrafiCamListenerTest {

	private final List<Object> pushed = new ArrayList<>();
	private TrafiCamListener listener;

	@BeforeEach
	void createListener() {
		listener = new TrafiCamListener();
		listener.sensiNact = new RecordingDataUpdate(pushed);
	}

	@Test
	void detectionsOfOneClassAreFlushedAsOneFeatureCollectionWithSpeedAndHeading() throws Exception {
		listener.handle("5g/traficam/cam1/2", detection(7L, 11.58, 50.92));
		listener.handle("5g/traficam/cam1/2", detection(8L, 11.59, 50.93));
		listener.handle("5g/traficam/cam1/2", detection(7L, 11.58, 50.92));

		listener.flushWindows();

		TrafiCamDto dto = assertInstanceOf(TrafiCamDto.class, pushed.get(0));
		assertEquals("cam1", dto.camId);
		assertEquals("2", dto.classification);
		FeatureCollection objects = assertInstanceOf(FeatureCollection.class, dto.objects);
		assertEquals(2, objects.features().size());
		Feature first = objects.features().get(0);
		assertEquals("7", first.id());
		assertEquals(Map.of("id", 7L, "speed", 12.0, "heading", 180.0), first.properties());
	}

	@Test
	void aQuietClassReportsEmptyOnceAndThenStaysSilent() throws Exception {
		listener.handle("5g/traficam/cam1/2", detection(7L, 11.58, 50.92));
		listener.flushWindows();

		listener.flushWindows();
		listener.flushWindows();

		assertEquals(2, pushed.size());
		assertTrue(((FeatureCollection) ((TrafiCamDto) pushed.get(1)).objects).features().isEmpty());
	}

	@Test
	void configurationBecomesTheProviderWithItsViewportAndNamesTheClasses() throws Exception {
		listener.handle("5g/config/traficam/cam1", configuration());
		listener.handle("5g/traficam/cam1/2", detection(7L, 11.58, 50.92));
		listener.flushWindows();

		TraficamProvider provider = assertInstanceOf(TraficamProvider.class, pushed.get(0));
		assertEquals("cam1", provider.getId());
		assertEquals("Camera cam1", provider.getAdmin().getFriendlyName());
		assertEquals(4, ((GeometryCollection) ((TraficamAdmin) provider.getAdmin()).getViewport()).geometries().size());
		assertEquals("car", ((TrafiCamDto) pushed.get(1)).classificationName);
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

	record RecordingDataUpdate(List<Object> pushed) implements DataUpdate {
		@Override
		public Promise<?> pushUpdate(Object update) {
			pushed.add(update);
			return Promises.resolved(update);
		}
	}
}
