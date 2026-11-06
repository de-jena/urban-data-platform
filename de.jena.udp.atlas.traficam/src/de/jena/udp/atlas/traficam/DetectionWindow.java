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

import de.jena.traficam.TrafiCamObject;

/**
 * The objects one camera saw in one class since the last flush: one entry per object id, the
 * first sighting of each, in the order the camera reported them.
 * <p>
 * This is the part the mapping engine cannot do. It holds state between payloads - the engine
 * sees one payload and holds none - so the reduction stays here, and what leaves is an
 * aggregate the engine can map.
 * <p>
 * A detection without GPS coordinates is not a sighting: there is no place to put it, and a
 * window holding only such detections would look occupied while rendering nothing. Dropping
 * them here keeps "the window is empty" and "the window produces no objects" the same thing.
 */
class DetectionWindow {

	private final Map<Long, TrafiCamObject> seen = new LinkedHashMap<>();
	private boolean emptyReported;

	synchronized void add(TrafiCamObject detection) {
		if (detection.getGpsCoordinates().isEmpty()) {
			return;
		}
		seen.putIfAbsent(detection.getId(), detection);
	}

	/**
	 * The objects of this window, and the window starts over.
	 * <p>
	 * An empty optional means there is nothing to say: the window was empty and has already
	 * reported that once. An empty list means the window is empty <em>now</em>, which is news
	 * exactly once - the twin has to hear that the camera stopped seeing things.
	 * @return the sightings, empty where the window has nothing new to report
	 */
	synchronized Optional<List<TrafiCamObject>> flush() {
		if (seen.isEmpty()) {
			if (emptyReported) {
				return Optional.empty();
			}
			emptyReported = true;
			return Optional.of(List.of());
		}
		List<TrafiCamObject> detections = new ArrayList<>(seen.values());
		seen.clear();
		emptyReported = false;
		return Optional.of(detections);
	}
}
