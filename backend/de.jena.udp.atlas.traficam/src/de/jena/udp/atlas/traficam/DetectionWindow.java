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
package de.jena.udp.atlas.traficam;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Optional;

import org.eclipse.sensinact.gateway.geojson.Geometry;
import org.eclipse.sensinact.gateway.geojson.GeometryCollection;
import org.eclipse.sensinact.gateway.geojson.Point;

import de.jena.traficam.GpsCoordinates;
import de.jena.traficam.TrafiCamObject;

/**
 * Collects the detections of one camera and object class between two flushes. A flush yields the
 * positions seen (one per object id), an empty collection once after the last detection, and
 * nothing while the class stays quiet.
 */
class DetectionWindow {

	private final Map<Long, Point> positions = new LinkedHashMap<>();
	private boolean emptyReported;

	synchronized void add(TrafiCamObject detection) {
		if (detection.getGpsCoordinates().isEmpty()) {
			return;
		}
		GpsCoordinates gps = detection.getGpsCoordinates().get(0);
		positions.putIfAbsent(detection.getId(), new Point(gps.getLongitude(), gps.getLatitude()));
	}

	synchronized Optional<GeometryCollection> flush() {
		if (positions.isEmpty()) {
			if (emptyReported) {
				return Optional.empty();
			}
			emptyReported = true;
			return Optional.of(new GeometryCollection(List.of(), null, null));
		}
		List<Geometry> geometries = new ArrayList<>(positions.values());
		positions.clear();
		emptyReported = false;
		return Optional.of(new GeometryCollection(geometries, null, null));
	}
}
