/**
 * Copyright (c) 2012 - 2024 Data In Motion and others.
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
package de.jena.chirpstack.sensinact.configuration;

import java.lang.System.Logger;
import java.lang.System.Logger.Level;
import java.util.ArrayList;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

import org.eclipse.sensinact.core.push.DataUpdate;
import org.eclipse.sensinact.gateway.geojson.Coordinates;
import org.eclipse.sensinact.gateway.geojson.Polygon;
import org.osgi.service.component.annotations.Activate;
import org.osgi.service.component.annotations.Component;
import org.osgi.service.component.annotations.Deactivate;
import org.osgi.service.component.annotations.Reference;

import de.jena.chirpstack.moisture.model.moisture.ChirpstackMoistureFactory;
import de.jena.chirpstack.moisture.model.moisture.MoistureStatus;
import de.jena.chirpstack.moisture.model.moisture.WateringArea;
import de.jena.chirpstack.moisture.model.moisture.WateringAreaAdmin;

/**
 * 
 */
@Component
public class MoistureAreas {
	private static final Logger logger = System.getLogger(MoistureAreas.class.getName());

	@Reference
	private DataUpdate sensiNact;

	private ScheduledExecutorService scheduler;

	@Activate
	public void activate() {
		logger.log(Level.DEBUG, "Start loading Moisture areas.");
		scheduler = Executors.newScheduledThreadPool(1);
		scheduler.scheduleAtFixedRate(this::updateArea, 0, 1, TimeUnit.MINUTES);

		try {
		} catch (Exception e) {
			logger.log(Level.ERROR, "Error while ", e);
		}
	}

	@Deactivate
	public void deactivate() {
		scheduler.shutdown();
	}

	private void updateArea() {
		WateringArea wa = ChirpstackMoistureFactory.eINSTANCE.createWateringArea();
		wa.setName("Jena-Center");
		wa.setId("JC");
		WateringAreaAdmin admin = ChirpstackMoistureFactory.eINSTANCE.createWateringAreaAdmin();
		Polygon l = createPolygon();
		admin.setLocation(l);
		wa.setAdmin(admin);
		MoistureStatus s = ChirpstackMoistureFactory.eINSTANCE.createMoistureStatus();

		s.setStatus(1);
		wa.setStatus(s);
		sensiNact.pushUpdate(wa);
	}

	private Polygon createPolygon() {
		Polygon l = new Polygon();
		ArrayList<Coordinates> coordinates = new ArrayList<>();
		coordinates.add(createCoordinate(11.583249312676969, 50.9293087585084));
		coordinates.add(createCoordinate(11.582909648706107, 50.9293087585084));
		coordinates.add(createCoordinate(11.583714116007002, 50.927931846518476));
		coordinates.add(createCoordinate(11.584153891464808, 50.92925242084712));
		coordinates.add(createCoordinate(11.583249312676969, 50.9293087585084));
		
		l.coordinates = new ArrayList<>();
		l.coordinates.add(coordinates);
		return l;
	}

	private Coordinates createCoordinate(double lon, double lat) {
		Coordinates c = new Coordinates();
		c.longitude = lon;
		c.latitude = lat;
		return c;
	}
}
