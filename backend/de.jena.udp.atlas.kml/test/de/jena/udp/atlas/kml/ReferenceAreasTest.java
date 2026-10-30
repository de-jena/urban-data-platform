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
package de.jena.udp.atlas.kml;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertInstanceOf;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.io.IOException;
import java.util.List;

import org.eclipse.sensinact.gateway.geojson.Coordinates;
import org.eclipse.sensinact.gateway.geojson.FeatureCollection;
import org.eclipse.sensinact.gateway.geojson.Polygon;
import org.junit.jupiter.api.Test;

import de.jena.udp.reference.area.sensinact.model.sensinactrefarea.ColorType;
import de.jena.udp.reference.area.sensinact.model.sensinactrefarea.ReferenceAreaProvider;
import net.opengis.kml.PlacemarkType;

class ReferenceAreasTest {

	@Test
	void zw01BecomesAProviderWithItsSchemaDataAndAnUnknownColour() throws IOException {
		ReferenceAreaProvider provider = ReferenceAreas.toProvider(area("ZW-01"));

		assertEquals("ZW-01", provider.getId());
		assertEquals("Reference Area ZW-01", provider.getAdmin().getFriendlyName());
		assertEquals("ZW-01", provider.getReferenceArea().getName());
		assertEquals(1f, provider.getReferenceArea().getGid());
		assertEquals(3, provider.getReferenceArea().getSensorCount());
		assertEquals(ColorType.UNKNOWN, provider.getReferenceArea().getColor());
	}

	@Test
	void aSlashInTheNameBecomesAnUnderscoreInTheProviderIdOnly() throws IOException {
		ReferenceAreaProvider provider = ReferenceAreas.toProvider(area("ZW/Löb-01"));

		assertEquals("ZW_Löb-01", provider.getId());
		assertEquals("ZW/Löb-01", provider.getReferenceArea().getName());
		assertEquals("feature-ZW_Löb-01-0",
				((FeatureCollection) provider.getAdmin().getLocation()).features().get(0).id());
	}

	@Test
	void theMultiGeometryBecomesAFeatureCollectionWithTheAreaProperties() throws IOException {
		ReferenceAreaProvider provider = ReferenceAreas.toProvider(area("ZW-01"));

		FeatureCollection location = assertInstanceOf(FeatureCollection.class, provider.getAdmin().getLocation());
		assertEquals(1, location.features().size());
		assertEquals("feature-ZW-01-0", location.features().get(0).id());
		assertEquals(3, location.features().get(0).properties().get("sensorCount"));
		assertFalse(location.features().get(0).properties().containsKey("color"));
		Polygon polygon = assertInstanceOf(Polygon.class, location.features().get(0).geometry());
		assertEquals(1, polygon.coordinates().size());
		assertTrue(polygon.coordinates().get(0).size() > 10);
	}

	@Test
	void exteriorRingsAreCounterClockwise() throws IOException {
		Polygon polygon = (Polygon) ((FeatureCollection) ReferenceAreas.toProvider(area("ZW-01")).getAdmin().getLocation())
				.features().get(0).geometry();

		assertFalse(ReferenceAreas.isClockwise(polygon.coordinates().get(0)));
	}

	@Test
	void windingIsDetectedByTheShoelaceSum() {
		List<Coordinates> clockwise = List.of(new Coordinates(0, 0), new Coordinates(0, 1), new Coordinates(1, 1),
				new Coordinates(1, 0), new Coordinates(0, 0));

		assertTrue(ReferenceAreas.isClockwise(clockwise));
		assertFalse(ReferenceAreas.isClockwise(clockwise.reversed()));
	}

	private static PlacemarkType area(String name) throws IOException {
		return KmlPlacemarksTest.cityKml().inFolder("refflaechen_smartcity").stream()
				.filter(placemark -> name.equals(placemark.getName()))
				.findFirst().orElseThrow();
	}
}
