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

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.util.List;
import java.util.Map;

import org.eclipse.sensinact.gateway.geojson.Coordinates;
import org.eclipse.sensinact.gateway.geojson.Feature;
import org.eclipse.sensinact.gateway.geojson.FeatureCollection;
import org.eclipse.sensinact.gateway.geojson.Point;
import org.eclipse.sensinact.gateway.geojson.Polygon;
import org.junit.jupiter.api.Test;

class GeoJsonInsideTest {

	static final List<Coordinates> SQUARE = ring(11.60, 50.95, 11.62, 50.97);
	static final List<Coordinates> HOLE = ring(11.605, 50.955, 11.61, 50.96);

	@Test
	void aPointInsideTheExteriorRingIsInside() {
		assertTrue(GeoJsonInside.contains(new Polygon(List.of(SQUARE), null, null), new Point(11.615, 50.965)));
		assertFalse(GeoJsonInside.contains(new Polygon(List.of(SQUARE), null, null), new Point(11.63, 50.965)));
	}

	@Test
	void aPointInAHoleIsOutside() {
		Polygon withHole = new Polygon(List.of(SQUARE, HOLE), null, null);

		assertFalse(GeoJsonInside.contains(withHole, new Point(11.607, 50.957)));
		assertTrue(GeoJsonInside.contains(withHole, new Point(11.615, 50.965)));
	}

	@Test
	void featureCollectionsAreSearchedFeatureByFeature() {
		FeatureCollection areas = new FeatureCollection(List.of(
				new Feature("a", new Polygon(List.of(HOLE), null, null), Map.of(), null, null),
				new Feature("b", new Polygon(List.of(SQUARE), null, null), Map.of(), null, null)), null, null);

		assertTrue(GeoJsonInside.contains(areas, new Point(11.615, 50.965)));
		assertFalse(GeoJsonInside.contains(areas, new Point(11.7, 50.965)));
	}

	static List<Coordinates> ring(double west, double south, double east, double north) {
		return List.of(new Coordinates(west, south), new Coordinates(east, south), new Coordinates(east, north),
				new Coordinates(west, north), new Coordinates(west, south));
	}
}
