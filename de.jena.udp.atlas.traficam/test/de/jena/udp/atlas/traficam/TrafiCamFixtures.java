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

import de.jena.traficam.CamConfig;
import de.jena.traficam.GpsCoordinates;
import de.jena.traficam.Scene;
import de.jena.traficam.TrafiCamFactory;
import de.jena.traficam.TrafiCamObject;

/**
 * The TrafiCam payloads the tests are written against: one camera at the Fischergasse, its
 * scene, and the detections it reports.
 * <p>
 * They lived in the test of the payload-rooted listener until that listener was removed. They
 * are fixtures rather than anything that listener owned, so they outlived it here.
 */
final class TrafiCamFixtures {

	private TrafiCamFixtures() {
	}

	static TrafiCamObject trafiCamObject(long id, double lon, double lat) {
		return trafiCamObject(id, lon, lat, 12.0, 180.0);
	}

	static TrafiCamObject trafiCamObject(long id, double lon, double lat, double speed, double heading) {
		TrafiCamObject detection = TrafiCamFactory.eINSTANCE.createTrafiCamObject();
		detection.setId(id);
		detection.setClassId((short) 2);
		detection.setSpeed(speed);
		GpsCoordinates gps = gps(lon, lat);
		gps.setHeading(heading);
		detection.getGpsCoordinates().add(gps);
		return detection;
	}

	static CamConfig camConfig() {
		TrafiCamFactory factory = TrafiCamFactory.eINSTANCE;
		CamConfig config = factory.createCamConfig();
		config.setLocation(gps(11.5812, 50.9209));
		Scene scene = factory.createScene();
		scene.setLeftBottom(gps(11.581, 50.920));
		scene.setRightBottom(gps(11.582, 50.920));
		scene.setRightTop(gps(11.582, 50.921));
		scene.setLeftTop(gps(11.581, 50.921));
		config.setScene(scene);
		config.getClassMap().put("2", "car");
		return config;
	}

	static GpsCoordinates gps(double lon, double lat) {
		GpsCoordinates gps = TrafiCamFactory.eINSTANCE.createGpsCoordinates();
		gps.setLongitude(lon);
		gps.setLatitude(lat);
		return gps;
	}
}
