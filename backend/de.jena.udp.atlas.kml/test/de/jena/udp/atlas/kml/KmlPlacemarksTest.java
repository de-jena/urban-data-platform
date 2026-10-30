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
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.io.IOException;
import java.io.InputStream;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.List;
import java.util.Map;

import org.eclipse.sensinact.gateway.geojson.Coordinates;
import org.junit.jupiter.api.Test;

import net.opengis.kml.PlacemarkType;

class KmlPlacemarksTest {

	static KmlPlacemarks cityKml() throws IOException {
		try (InputStream kml = Files.newInputStream(Path.of(KmlLocations.BUNDLED_KML))) {
			return KmlPlacemarks.load(kml);
		}
	}

	@Test
	void theCityKmlHasTwelveReferenceAreasAndThirtyOneSensors() throws IOException {
		KmlPlacemarks placemarks = cityKml();

		assertEquals(12, placemarks.inFolder("refflaechen_smartcity").size());
		assertEquals(31, placemarks.inFolder("sensoren").size());
		assertTrue(placemarks.inFolder("no such folder").isEmpty());
	}

	@Test
	void schemaDataOfASensorIsReadByName() throws IOException {
		PlacemarkType first = cityKml().inFolder("sensoren").get(0);

		Map<String, String> data = KmlPlacemarks.extendedData(first);

		assertEquals("8CF95720000D4ADC", data.get("eui"));
		assertEquals("TEROS21", data.get("model"));
	}

	@Test
	void coordinateTuplesKeepTheElevationAndSkipGarbage() {
		List<Coordinates> coordinates = KmlPlacemarks.coordinates(List.of("11.5,50.9", "11.6,50.8,120", "x,y", "7"));

		assertEquals(List.of(new Coordinates(11.5, 50.9), new Coordinates(11.6, 50.8, 120)), coordinates);
	}
}
