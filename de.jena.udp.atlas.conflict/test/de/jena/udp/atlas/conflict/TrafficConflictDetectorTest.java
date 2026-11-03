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
package de.jena.udp.atlas.conflict;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNull;

import java.time.Instant;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;

import org.eclipse.sensinact.core.notification.ResourceDataNotification;
import org.eclipse.sensinact.core.push.DataUpdate;
import org.eclipse.sensinact.gateway.geojson.Feature;
import org.eclipse.sensinact.gateway.geojson.FeatureCollection;
import org.eclipse.sensinact.gateway.geojson.Point;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.osgi.util.promise.Promise;
import org.osgi.util.promise.Promises;

import de.jena.conflict.sensinact.model.conflictProvider.TrafficConflictProvider;

class TrafficConflictDetectorTest {

	private final List<Boolean> reportedConflicts = new ArrayList<>();
	private final List<Long> reportedBikes = new ArrayList<>();
	private final TrafficConflictDetector detector = new TrafficConflictDetector();

	@BeforeEach
	void startAtFelsenkeller() {
		detector.sensiNact = new RecordingDataUpdate();
		detector.start(new TrafficConflictDetector.Settings("Conflict01", "Conflict Bike Car Felsenkeller",
				new Point(11.581274, 50.921142), 7.0, 90.0, 230.0));
	}

	@Test
	void startingReportsNoConflict() {
		assertEquals(List.of(false), reportedConflicts);
	}

	@Test
	void aBikeCrossingWhileCarsHaveGreenIsAConflictUntilTheLightTurnsRed() {
		detector.notify("DATA/Ilsa/K440/K4_1/color", colour("🟢⚪⚪"));
		detector.notify("DATA/TraficamProvider/Felsenkeller/3/objects", objects(bike(31L, 180.0, 12.0)));
		detector.notify("DATA/Ilsa/K440/K4_1/color", colour("⚪⚪🔴"));

		assertEquals(List.of(false, true, false), reportedConflicts);
		assertEquals(Arrays.asList(null, 31L, 31L), reportedBikes);
	}

	@Test
	void aSlowOrNorthboundObjectIsNoConflictAndTheStateIsReportedOnlyWhenItFlips() {
		detector.notify("DATA/Ilsa/K440/K4_1/color", colour("🟢⚪⚪"));
		detector.notify("DATA/TraficamProvider/Felsenkeller/3/objects", objects(bike(31L, 180.0, 5.0), bike(32L, 10.0, 12.0)));
		detector.notify("DATA/Ilsa/K440/K4_1/color", colour("⚪🟡🔴"));

		assertEquals(List.of(false), reportedConflicts);
	}

	@Test
	void bareGeometriesCarryNoBike() {
		assertNull(detector.crossingBike(new Point(11.58, 50.92)));
	}

	private static ResourceDataNotification colour(String state) {
		return new ResourceDataNotification(null, "Ilsa", "K440", "K4_1", "color", null, state, Instant.now(), String.class, Map.of());
	}

	private static ResourceDataNotification objects(Feature... bikes) {
		return new ResourceDataNotification(null, "TraficamProvider", "Felsenkeller", "3", "objects", null,
				new FeatureCollection(List.of(bikes), null, null), Instant.now(), FeatureCollection.class, Map.of());
	}

	private static Feature bike(long id, double heading, double speed) {
		return new Feature(String.valueOf(id), new Point(11.58127, 50.92114), Map.of("id", id, "heading", heading, "speed", speed),
				null, null);
	}

	class RecordingDataUpdate implements DataUpdate {
		@Override
		public Promise<?> pushUpdate(Object update) {
			TrafficConflictProvider provider = (TrafficConflictProvider) update;
			reportedConflicts.add(provider.getConflict().getConflict());
			reportedBikes.add(provider.getConflict().getBikeId());
			return Promises.resolved(update);
		}
	}
}
