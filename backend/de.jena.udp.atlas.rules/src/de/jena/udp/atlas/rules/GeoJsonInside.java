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

import java.util.List;

import org.eclipse.sensinact.gateway.geojson.Coordinates;
import org.eclipse.sensinact.gateway.geojson.Feature;
import org.eclipse.sensinact.gateway.geojson.FeatureCollection;
import org.eclipse.sensinact.gateway.geojson.GeoJsonObject;
import org.eclipse.sensinact.gateway.geojson.GeometryCollection;
import org.eclipse.sensinact.gateway.geojson.MultiPolygon;
import org.eclipse.sensinact.gateway.geojson.Point;
import org.eclipse.sensinact.gateway.geojson.Polygon;

/** Point-in-area test over the GeoJSON shapes a reference area's location can take. */
final class GeoJsonInside {

	private GeoJsonInside() {
	}

	static boolean contains(GeoJsonObject area, Point point) {
		if (area == null || point == null || point.isEmpty()) {
			return false;
		}
		return switch (area) {
		case Polygon polygon -> inPolygon(polygon.coordinates(), point.coordinates());
		case MultiPolygon multi -> multi.coordinates().stream().anyMatch(rings -> inPolygon(rings, point.coordinates()));
		case Feature feature -> contains(feature.geometry(), point);
		case FeatureCollection collection -> collection.features().stream().anyMatch(feature -> contains(feature, point));
		case GeometryCollection collection -> collection.geometries().stream().anyMatch(geometry -> contains(geometry, point));
		default -> false;
		};
	}

	/** Inside the exterior ring and in none of the holes. */
	private static boolean inPolygon(List<List<Coordinates>> rings, Coordinates point) {
		if (rings.isEmpty() || !inRing(rings.get(0), point)) {
			return false;
		}
		return rings.stream().skip(1).noneMatch(hole -> inRing(hole, point));
	}

	/** Ray casting: an odd number of edges crossed to the right of the point means inside. */
	static boolean inRing(List<Coordinates> ring, Coordinates point) {
		boolean inside = false;
		double x = point.longitude();
		double y = point.latitude();
		for (int i = 0, j = ring.size() - 1; i < ring.size(); j = i++) {
			double xi = ring.get(i).longitude();
			double yi = ring.get(i).latitude();
			double xj = ring.get(j).longitude();
			double yj = ring.get(j).latitude();
			if ((yi > y) != (yj > y) && x < (xj - xi) * (y - yi) / (yj - yi) + xi) {
				inside = !inside;
			}
		}
		return inside;
	}
}
