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
package de.jena.udp.atlas.rules;

import static de.jena.udp.atlas.rules.Snapshots.provider;
import static de.jena.udp.atlas.rules.Snapshots.resource;
import static de.jena.udp.atlas.rules.Snapshots.service;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.ArgumentMatchers.anyString;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.never;
import static org.mockito.Mockito.verify;

import java.time.Instant;
import java.util.List;
import java.util.Map;

import org.eclipse.sensinact.core.snapshot.ProviderSnapshot;
import org.eclipse.sensinact.gateway.geojson.Feature;
import org.eclipse.sensinact.gateway.geojson.FeatureCollection;
import org.eclipse.sensinact.gateway.geojson.Point;
import org.eclipse.sensinact.gateway.geojson.Polygon;
import org.eclipse.sensinact.southbound.rules.api.ResourceUpdater;
import org.junit.jupiter.api.Test;

import de.jena.udp.reference.area.sensinact.model.sensinactrefarea.ColorType;

class ReferenceAreaRuleTest {

	private static final Instant T0 = Instant.parse("2026-10-31T10:00:00Z");
	private final ResourceUpdater updater = mock(ResourceUpdater.class);
	private final ReferenceAreaRule rule = new ReferenceAreaRule();

	private final ProviderSnapshot zw01 = provider("ZW-01", "ReferenceAreaProvider",
			service("admin", resource("location", areaAround(11.60, 50.95, 11.62, 50.97), T0)),
			service("referenceArea", resource("color", ColorType.UNKNOWN, T0)));
	private final ProviderSnapshot sensorA = sensor("a", 11.61, 50.96);
	private final ProviderSnapshot sensorB = sensor("b", 11.615, 50.965);
	private final ProviderSnapshot sensorOutside = sensor("c", 11.70, 50.96);

	@Test
	void theAreaOfTheSensorWithTheNewestAverageIsColouredFromAllItsSensors() {
		rule.evaluate(List.of(zw01, sensorA, sensorB, sensorOutside,
				derived("a", 2.0, T0.plusSeconds(20)), derived("b", 3.9, T0.plusSeconds(10)), derived("c", 5.0, T0)), updater);

		verify(updater).updateResource("ZW-01", "referenceArea", "color", ColorType.GREEN);
	}

	@Test
	void aSensorWithoutAnAverageYetCountsAsZero() {
		rule.evaluate(List.of(zw01, sensorA, sensorB, derived("a", 2.0, T0)), updater);

		verify(updater).updateResource("ZW-01", "referenceArea", "color", ColorType.BLUE);
	}

	@Test
	void aSensorOutsideEveryAreaChangesNothing() {
		rule.evaluate(List.of(zw01, sensorOutside, derived("c", 5.0, T0)), updater);

		verify(updater, never()).updateResource(anyString(), anyString(), anyString(), any());
	}

	@Test
	void onlyANewAverageTriggersTheRule() {
		var filter = rule.getInputFilter().dataEventFilter();

		org.junit.jupiter.api.Assertions.assertTrue(filter.test(event("a-derived", "derivedQuantities", "pfWertAvg")));
		org.junit.jupiter.api.Assertions.assertFalse(filter.test(event("ZW-01", "referenceArea", "color")));
		org.junit.jupiter.api.Assertions.assertFalse(filter.test(event("a", "admin", "location")));
	}

	private static ProviderSnapshot sensor(String name, double lon, double lat) {
		return provider(name, "Solidos_Teros21", service("admin", resource("location", new Point(lon, lat), T0)));
	}

	private static ProviderSnapshot derived(String sensor, double pfAverage, Instant at) {
		return provider(sensor + "-derived", "derived",
				service("derivedQuantities", resource("pfWertAvg", pfAverage, at)));
	}

	private static FeatureCollection areaAround(double west, double south, double east, double north) {
		Polygon polygon = new Polygon(List.of(GeoJsonInsideTest.ring(west, south, east, north)), null, null);
		return new FeatureCollection(List.of(new Feature("feature-ZW-01-0", polygon, Map.of(), null, null)), null, null);
	}

	private static org.eclipse.sensinact.core.notification.ResourceDataNotification event(String provider, String service,
			String resource) {
		return new org.eclipse.sensinact.core.notification.ResourceDataNotification(null, "m", provider, service, resource,
				null, 1.0, T0, Double.class, Map.of());
	}
}
