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
import static org.junit.jupiter.api.Assertions.assertNull;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.util.List;
import java.util.Map;

import org.eclipse.sensinact.gateway.geojson.Feature;
import org.eclipse.sensinact.gateway.geojson.FeatureCollection;
import org.eclipse.sensinact.gateway.geojson.Point;
import org.junit.jupiter.api.Test;

import de.jena.traficam.GpsCoordinates;
import de.jena.traficam.ObservedClass;
import de.jena.traficam.TrafiCamFactory;
import de.jena.traficam.TrafiCamObject;

class FeatureCollectionValueFunctionTest {

	private final FeatureCollectionValueFunction function = new FeatureCollectionValueFunction();

	@Test
	void everyObjectBecomesAFeatureAtItsFirstPosition() {
		ObservedClass observed = observedClass(detection(7L, 11.58, 50.92, 12.0, 180.0),
				detection(8L, 11.59, 50.93, 30.0, 10.0));

		FeatureCollection collection = assertInstanceOf(FeatureCollection.class, function.apply(observed));

		assertEquals(2, collection.features().size());
		Feature first = collection.features().get(0);
		assertEquals("7", first.id());
		// Longitude first.
		assertEquals(new Point(11.58, 50.92), first.geometry());
		assertEquals(Map.of("id", 7L, "speed", 12.0, "heading", 180.0), first.properties());
		assertEquals("8", collection.features().get(1).id());
	}

	@Test
	void theListTheFeaturePathFoundIsAcceptedJustLikeTheClass() {
		ObservedClass observed = observedClass(detection(7L, 11.58, 50.92, 12.0, 180.0),
				detection(8L, 11.59, 50.93, 30.0, 10.0));

		// What ValueMapperImpl.followPathForFunction hands over for ObservedClass/objects.
		FeatureCollection fromList = assertInstanceOf(FeatureCollection.class,
				function.apply(observed.getObjects()));

		assertEquals(function.apply(observed), fromList);
		assertEquals(2, fromList.features().size());
	}

	@Test
	void anEmptyListIsStillAnEmptyCollection() {
		FeatureCollection collection = assertInstanceOf(FeatureCollection.class, function.apply(List.of()));

		assertTrue(collection.features().isEmpty());
	}

	@Test
	void theIdKeepsItsTypeInsteadOfBecomingADouble() {
		ObservedClass observed = observedClass(detection(7L, 11.58, 50.92, 12.0, 180.0));

		FeatureCollection collection = (FeatureCollection) function.apply(observed);

		assertInstanceOf(Long.class, collection.features().get(0).properties().get("id"));
	}

	@Test
	void aClassThatSawNothingYieldsAnEmptyCollectionAndNotNull() {
		FeatureCollection collection = assertInstanceOf(FeatureCollection.class,
				function.apply(observedClass()));

		assertTrue(collection.features().isEmpty());
	}

	@Test
	void aDetectionThatCannotBePlacedIsLeftOut() {
		TrafiCamObject blind = TrafiCamFactory.eINSTANCE.createTrafiCamObject();
		blind.setId(9L);
		ObservedClass observed = observedClass(blind, detection(7L, 11.58, 50.92, 12.0, 180.0));

		FeatureCollection collection = (FeatureCollection) function.apply(observed);

		assertEquals(List.of("7"), collection.features().stream().map(Feature::id).toList());
	}

	@Test
	void aSingleDetectionIsRefusedBecauseTheMappingNamedAPath() {
		// What the engine hands over when a valueMapping names a path into the collection:
		// one element, the rest already discarded. Half a collection is a wrong one.
		assertNull(function.apply(detection(7L, 11.58, 50.92, 12.0, 180.0)));
	}

	@Test
	void anythingThatIsNoClassOfObjectsYieldsNothing() {
		assertNull(function.apply("not an EObject"));
		assertNull(function.apply(null));
		assertNull(function.apply(TrafiCamFactory.eINSTANCE.createCamConfig()));
	}

	static ObservedClass observedClass(TrafiCamObject... detections) {
		ObservedClass observed = TrafiCamFactory.eINSTANCE.createObservedClass();
		observed.setClassId("2");
		observed.getObjects().addAll(List.of(detections));
		return observed;
	}

	static TrafiCamObject detection(long id, double lon, double lat, double speed, double heading) {
		TrafiCamObject detection = TrafiCamFactory.eINSTANCE.createTrafiCamObject();
		detection.setId(id);
		detection.setSpeed(speed);
		GpsCoordinates gps = TrafiCamFactory.eINSTANCE.createGpsCoordinates();
		gps.setLongitude(lon);
		gps.setLatitude(lat);
		gps.setHeading(heading);
		detection.getGpsCoordinates().add(gps);
		return detection;
	}
}
