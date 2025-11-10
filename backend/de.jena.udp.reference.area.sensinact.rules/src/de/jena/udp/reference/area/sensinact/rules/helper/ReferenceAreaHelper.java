/**
 * Copyright (c) 2012 - 2025 Data In Motion and others.
 * All rights reserved. 
 * 
 * This program and the accompanying materials are made
 * available under the terms of the Eclipse Public License 2.0
 * which is available at https://www.eclipse.org/legal/epl-2.0/
 *
 * SPDX-License-Identifier: EPL-2.0
 * 
 * Contributors:
 *     Data In Motion - initial API and implementation
 */
package de.jena.udp.reference.area.sensinact.rules.helper;

import java.util.List;

import org.eclipse.sensinact.gateway.geojson.Coordinates;
import org.eclipse.sensinact.gateway.geojson.Geometry;
import org.eclipse.sensinact.gateway.geojson.LineString;
import org.eclipse.sensinact.gateway.geojson.MultiLineString;
import org.eclipse.sensinact.gateway.geojson.MultiPoint;
import org.eclipse.sensinact.gateway.geojson.MultiPolygon;
import org.eclipse.sensinact.gateway.geojson.Point;
import org.eclipse.sensinact.gateway.geojson.Polygon;

/**
 *
 * @author ilenia
 * @since Nov 4, 2025
 */
public class ReferenceAreaHelper {

	private static final double EPSILON = 1e-10;

	/**
	 * Checks if a point is inside a given geometry.
	 *
	 * @param point The point to test
	 * @param geometry The geometry to test against (Polygon, MultiPolygon, etc.)
	 * @return true if the point is inside the geometry, false otherwise
	 */
	public static boolean isPointInside(Point point, Geometry geometry) {
		if (point == null || geometry == null || point.isEmpty() || geometry.isEmpty()) {
			return false;
		}

		if (geometry instanceof Polygon) {
			return isPointInPolygon(point.coordinates(), (Polygon) geometry);
		} else if (geometry instanceof MultiPolygon) {
			return isPointInMultiPolygon(point.coordinates(), (MultiPolygon) geometry);
		} else if (geometry instanceof Point) {
			return arePointsEqual(point.coordinates(), ((Point) geometry).coordinates());
		} else if (geometry instanceof MultiPoint) {
			return isPointInMultiPoint(point.coordinates(), (MultiPoint) geometry);
		} else if (geometry instanceof LineString) {
			return isPointOnLineString(point.coordinates(), (LineString) geometry);
		} else if (geometry instanceof MultiLineString) {
			return isPointOnMultiLineString(point.coordinates(), (MultiLineString) geometry);
		}

		return false;
	}

	/**
	 * Checks if a point is inside a polygon using the ray casting algorithm.
	 * This handles polygons with holes correctly.
	 *
	 * @param point The point coordinates
	 * @param polygon The polygon to test
	 * @return true if the point is inside the polygon
	 */
	private static boolean isPointInPolygon(Coordinates point, Polygon polygon) {
		if (polygon.coordinates().isEmpty()) {
			return false;
		}

		// Check each ring
		// First ring is exterior - point must be inside
		// Subsequent rings are holes - point must NOT be inside
		boolean inside = false;

		for (int i = 0; i < polygon.coordinates().size(); i++) {
			List<Coordinates> ring = polygon.coordinates().get(i);
			boolean inThisRing = isPointInRing(point, ring);

			if (i == 0) {
				// Exterior ring
				inside = inThisRing;
				if (!inside) {
					// If not in exterior ring, no need to check holes
					return false;
				}
			} else {
				// Hole ring
				if (inThisRing) {
					// Point is in a hole, so it's not in the polygon
					return false;
				}
			}
		}

		return inside;
	}

	/**
	 * Ray casting algorithm: casts a horizontal ray from the point to infinity (to the right)
	 * and counts how many times it crosses the polygon boundary.
	 * Odd number of crossings = inside, even number = outside.
	 */
	private static boolean isPointInRing(Coordinates point, List<Coordinates> ring) {
		if (ring.size() < 3) {
			return false;
		}

		boolean inside = false;
		double x = point.longitude();
		double y = point.latitude();

		for (int i = 0, j = ring.size() - 1; i < ring.size(); j = i++) {
			Coordinates vi = ring.get(i);
			Coordinates vj = ring.get(j);

			double xi = vi.longitude();
			double yi = vi.latitude();
			double xj = vj.longitude();
			double yj = vj.latitude();

			// Check if the ray crosses this edge
			boolean intersect = ((yi > y) != (yj > y)) &&
			                    (x < (xj - xi) * (y - yi) / (yj - yi) + xi);

			if (intersect) {
				inside = !inside;
			}
		}

		return inside;
	}

	/**
	 * Checks if a point is inside any polygon in a MultiPolygon.
	 */
	private static boolean isPointInMultiPolygon(Coordinates point, MultiPolygon multiPolygon) {
		for (List<List<Coordinates>> polygonCoords : multiPolygon.coordinates()) {
			// Create a temporary Polygon to reuse the polygon test logic
			Polygon tempPolygon = new Polygon(polygonCoords, null, null);
			if (isPointInPolygon(point, tempPolygon)) {
				return true;
			}
		}
		return false;
	}

	/**
	 * Checks if two points are equal (within epsilon tolerance).
	 */
	private static boolean arePointsEqual(Coordinates p1, Coordinates p2) {
		return Math.abs(p1.longitude() - p2.longitude()) < EPSILON &&
		       Math.abs(p1.latitude() - p2.latitude()) < EPSILON &&
		       Math.abs(p1.elevation() - p2.elevation()) < EPSILON;
	}

	/**
	 * Checks if a point matches any point in a MultiPoint.
	 */
	private static boolean isPointInMultiPoint(Coordinates point, MultiPoint multiPoint) {
		for (Coordinates mp : multiPoint.coordinates()) {
			if (arePointsEqual(point, mp)) {
				return true;
			}
		}
		return false;
	}

	/**
	 * Checks if a point lies on a line string.
	 * Note: This uses a simple distance-from-segment approach with epsilon tolerance.
	 */
	private static boolean isPointOnLineString(Coordinates point, LineString lineString) {
		List<Coordinates> coords = lineString.coordinates();
		if (coords.size() < 2) {
			return false;
		}

		for (int i = 0; i < coords.size() - 1; i++) {
			if (isPointOnSegment(point, coords.get(i), coords.get(i + 1))) {
				return true;
			}
		}
		return false;
	}

	/**
	 * Checks if a point lies on any line in a MultiLineString.
	 */
	private static boolean isPointOnMultiLineString(Coordinates point, MultiLineString multiLineString) {
		for (List<Coordinates> lineCoords : multiLineString.coordinates()) {
			LineString tempLine = new LineString(lineCoords, null, null);
			if (isPointOnLineString(point, tempLine)) {
				return true;
			}
		}
		return false;
	}

	/**
	 * Checks if a point lies on a line segment.
	 */
	private static boolean isPointOnSegment(Coordinates point, Coordinates segStart, Coordinates segEnd) {
		double px = point.longitude();
		double py = point.latitude();
		double x1 = segStart.longitude();
		double y1 = segStart.latitude();
		double x2 = segEnd.longitude();
		double y2 = segEnd.latitude();

		// Check if point is within bounding box of segment
		if (px < Math.min(x1, x2) - EPSILON || px > Math.max(x1, x2) + EPSILON ||
		    py < Math.min(y1, y2) - EPSILON || py > Math.max(y1, y2) + EPSILON) {
			return false;
		}

		// Calculate distance from point to line segment
		double dx = x2 - x1;
		double dy = y2 - y1;
		double lengthSquared = dx * dx + dy * dy;

		if (lengthSquared < EPSILON) {
			// Segment is actually a point
			return arePointsEqual(point, segStart);
		}

		// Calculate projection of point onto line
		double t = ((px - x1) * dx + (py - y1) * dy) / lengthSquared;
		t = Math.max(0, Math.min(1, t)); // Clamp to segment

		// Calculate closest point on segment
		double closestX = x1 + t * dx;
		double closestY = y1 + t * dy;

		// Check distance
		double distance = Math.sqrt((px - closestX) * (px - closestX) + (py - closestY) * (py - closestY));
		return distance < EPSILON;
	}

}
