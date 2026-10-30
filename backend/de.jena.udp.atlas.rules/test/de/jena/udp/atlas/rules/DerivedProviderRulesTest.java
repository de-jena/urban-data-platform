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
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.ArgumentMatchers.anyString;
import static org.mockito.ArgumentMatchers.eq;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.never;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

import java.time.Instant;
import java.util.List;
import java.util.Map;

import org.eclipse.sensinact.core.snapshot.ProviderSnapshot;
import org.eclipse.sensinact.gateway.geojson.Point;
import org.eclipse.sensinact.southbound.rules.api.ResourceUpdater;
import org.eclipse.sensinact.southbound.rules.api.ResourceUpdater.BatchUpdate;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.ArgumentCaptor;

class DerivedProviderRulesTest {

	private static final Instant T0 = Instant.parse("2026-10-31T10:00:00Z");
	private final ResourceUpdater updater = mock(ResourceUpdater.class);
	private final BatchUpdate batch = mock(BatchUpdate.class);

	@BeforeEach
	void batchUpdates() {
		when(updater.updateBatch()).thenReturn(batch);
	}

	@Test
	void kelvinResourcesOfTheStationAreWrittenInCelsiusToTheDerivedProvider() {
		ProviderSnapshot station = provider("10567", "dwd-weather-reports",
				service("currentWeather",
						resource("tempAboveSurface200", 281.95f, T0, Map.of("unit", "K")),
						resource("windSpeed", 2.5f, T0, Map.of("unit", "m/s"))));

		new WeatherCelsiusRule().evaluate(List.of(station), updater);

		ArgumentCaptor<Object> celsius = ArgumentCaptor.forClass(Object.class);
		verify(batch).updateResource(eq("10567-derived"), eq("currentWeather"), eq("tempAboveSurface200"), celsius.capture(), eq(T0));
		assertEquals(8.8f, (Float) celsius.getValue(), 0.001f);
		verify(batch, never()).updateResource(anyString(), anyString(), eq("windSpeed"), any(), any());
		verify(batch).completeBatch();
	}

	@Test
	void theSensorLocationIsCopiedToTheDerivedProvider() {
		Point position = new Point(11.61, 50.96);
		ProviderSnapshot sensor = provider("8cf95720000d4a69", "Solidos_Teros21",
				service("admin", resource("location", position, T0)));

		new SensorLocationRule().evaluate(List.of(sensor), updater);

		verify(batch).updateResource("8cf95720000d4a69-derived", "admin", "location", position, T0);
		verify(batch).completeBatch();
	}

	@Test
	void onlyTheConfiguredModelsAndTheStationAreSelected() {
		ProviderSnapshot sensor = provider("x", "Solidos_Teros21");
		ProviderSnapshot camera = provider("cam1", "TraficamProvider");
		ProviderSnapshot station = provider("10567", "dwd-weather-reports");

		assertEquals(true, new SensorLocationRule().getInputFilter().getProviderFilter().test(sensor));
		assertEquals(false, new SensorLocationRule().getInputFilter().getProviderFilter().test(camera));
		assertEquals(true, new WeatherCelsiusRule().getInputFilter().getProviderFilter().test(station));
		assertEquals(false, new WeatherCelsiusRule().getInputFilter().getProviderFilter().test(sensor));
	}
}
