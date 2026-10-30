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
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import org.eclipse.sensinact.core.notification.LifecycleNotification;
import org.eclipse.sensinact.core.notification.LifecycleNotification.Status;
import org.eclipse.sensinact.core.push.DataUpdate;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.osgi.util.promise.Promise;
import org.osgi.util.promise.Promises;

import de.jena.udp.reference.area.sensinact.model.sensinactrefarea.ReferenceAreaProvider;

class KmlLocationsTest {

	private final List<Object> pushed = new ArrayList<>();
	private final List<String> located = new ArrayList<>();
	private final KmlLocations locations = new KmlLocations();

	@BeforeEach
	void loadTheCityKml() throws IOException {
		locations.sensiNact = new RecordingDataUpdate(pushed);
		locations.locationWriter = (provider, location) -> {
			located.add(provider + "@" + location.coordinates().longitude());
			return Promises.resolved(null);
		};
		try (InputStream kml = Files.newInputStream(Path.of(KmlLocations.BUNDLED_KML))) {
			locations.load(kml, "refflaechen_smartcity", "sensoren");
		}
	}

	@Test
	void loadingPushesEveryReferenceArea() {
		assertEquals(12, pushed.size());
		assertTrue(pushed.stream().allMatch(ReferenceAreaProvider.class::isInstance));
	}

	@Test
	void aCreatedProviderWithAKnownEuiGetsItsLocation() {
		locations.notify("LIFECYCLE/Solidos_Teros21/8cf95720000d4adc", created("8cf95720000d4adc"));

		assertEquals(List.of("8cf95720000d4adc@11.6284330375707"), located);
	}

	@Test
	void otherProvidersAndOtherLifecycleEventsAreIgnored() {
		locations.notify("LIFECYCLE/Ilsa/K440", created("K440"));
		locations.notify("LIFECYCLE/Solidos_Teros21/8cf95720000d4adc/sensor", new LifecycleNotification(null,
				"Solidos_Teros21", "8cf95720000d4adc", "sensor", null, Status.SERVICE_CREATED, null, Map.of()));

		assertTrue(located.isEmpty());
	}

	private static LifecycleNotification created(String provider) {
		return new LifecycleNotification(null, "Solidos_Teros21", provider, null, null, Status.PROVIDER_CREATED, null,
				Map.of());
	}

	record RecordingDataUpdate(List<Object> pushed) implements DataUpdate {
		@Override
		public Promise<?> pushUpdate(Object update) {
			pushed.add(update);
			return Promises.resolved(update);
		}
	}
}
