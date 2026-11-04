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

import org.eclipse.sensinact.gateway.geojson.Feature;
import org.eclipse.sensinact.gateway.geojson.FeatureCollection;
import org.eclipse.sensinact.gateway.geojson.Point;

import de.jena.traficam.GpsCoordinates;
import de.jena.traficam.TrafiCamObject;

/**
 * The objects one camera saw in one class since the last flush: one feature per object id with
 * its first position and the {@code id}, {@code speed} and {@code heading} the camera reported.
 * An empty window is reported once, then stays quiet.
 */
class DetectionWindow {

	private final Map<Long, Feature> seen = new LinkedHashMap<>();
	private boolean emptyReported;

	synchronized void add(TrafiCamObject detection) {
		if (detection.getGpsCoordinates().isEmpty()) {
			return;
		}
		GpsCoordinates gps = detection.getGpsCoordinates().get(0);
		seen.putIfAbsent(detection.getId(), new Feature(String.valueOf(detection.getId()),
				new Point(gps.getLongitude(), gps.getLatitude()),
				Map.of("id", detection.getId(), "speed", detection.getSpeed(), "heading", gps.getHeading()), null, null));
	}

	synchronized Optional<FeatureCollection> flush() {
		if (seen.isEmpty()) {
			if (emptyReported) {
				return Optional.empty();
			}
			emptyReported = true;
			return Optional.of(new FeatureCollection(List.of(), null, null));
		}
		List<Feature> features = new ArrayList<>(seen.values());
		seen.clear();
		emptyReported = false;
		return Optional.of(new FeatureCollection(features, null, null));
	}
}
