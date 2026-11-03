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

import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Optional;

import org.eclipse.sensinact.gateway.geojson.Coordinates;
import org.eclipse.sensinact.gateway.geojson.Point;

import net.opengis.kml.PlacemarkType;
import net.opengis.kml.PointType;

/** The sensor points of the KML keyed by EUI, looked up by the provider name ChirpStack gives the device. */
final class SensorLocations {

	private final Map<String, Point> byEui;

	private SensorLocations(Map<String, Point> byEui) {
		this.byEui = byEui;
	}

	static SensorLocations none() {
		return new SensorLocations(Map.of());
	}

	/** Placemarks without an {@code eui} or without a Point are skipped. */
	static SensorLocations of(List<PlacemarkType> placemarks) {
		Map<String, Point> byEui = new HashMap<>();
		for (PlacemarkType placemark : placemarks) {
			String eui = KmlPlacemarks.extendedData(placemark).get("eui");
			if (eui != null && placemark.getAbstractGeometryGroup() instanceof PointType point) {
				List<Coordinates> coordinates = KmlPlacemarks.coordinates(point.getCoordinates());
				if (!coordinates.isEmpty()) {
					byEui.put(key(eui), new Point(coordinates.get(0), null, null));
				}
			}
		}
		return new SensorLocations(byEui);
	}

	Optional<Point> of(String providerName) {
		return Optional.ofNullable(byEui.get(key(providerName)));
	}

	int size() {
		return byEui.size();
	}

	private static String key(String eui) {
		return eui.toLowerCase(Locale.ROOT);
	}
}
