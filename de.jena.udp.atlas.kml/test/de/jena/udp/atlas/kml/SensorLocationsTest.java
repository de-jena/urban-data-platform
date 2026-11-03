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

import org.eclipse.sensinact.gateway.geojson.Point;
import org.junit.jupiter.api.Test;

class SensorLocationsTest {

	@Test
	void aSensorIsFoundByTheLowerCaseEuiChirpStackUsesAsProviderName() throws IOException {
		SensorLocations sensors = SensorLocations.of(KmlPlacemarksTest.cityKml().inFolder("sensoren"));

		Point location = sensors.of("8cf95720000d4adc").orElseThrow();

		assertEquals(31, sensors.size());
		assertEquals(11.6284330375707, location.coordinates().longitude(), 1e-12);
		assertEquals(50.9664765010618, location.coordinates().latitude(), 1e-12);
		assertTrue(sensors.of("K440").isEmpty());
	}

	@Test
	void theReferenceAreasHaveNoEuiAndAreNoSensors() throws IOException {
		assertEquals(0, SensorLocations.of(KmlPlacemarksTest.cityKml().inFolder("refflaechen_smartcity")).size());
	}
}
