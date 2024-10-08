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
import java.util.Arrays;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

import org.eclipse.sensinact.core.push.DataUpdate;
import org.eclipse.sensinact.gateway.geojson.Coordinates;
import org.eclipse.sensinact.gateway.geojson.Feature;
import org.eclipse.sensinact.gateway.geojson.FeatureCollection;
import org.eclipse.sensinact.gateway.geojson.Point;
import org.eclipse.sensinact.gateway.geojson.Polygon;
import org.eclipse.sensinact.model.core.provider.Admin;
import org.eclipse.sensinact.model.core.provider.ProviderFactory;
import org.osgi.service.component.annotations.Activate;
import org.osgi.service.component.annotations.Component;
import org.osgi.service.component.annotations.Deactivate;
import org.osgi.service.component.annotations.Reference;

import de.jena.chirpstack.moisture.model.moisture.ChirpstackMoistureFactory;
import de.jena.chirpstack.moisture.model.moisture.MoistureSensor;
import de.jena.chirpstack.moisture.model.moisture.MoistureStatus;

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
		MoistureSensor ms = ChirpstackMoistureFactory.eINSTANCE.createMoistureSensor();
		String name = "Jena-Center";
		ms.setName(name);
		ms.setId("JC");
		Admin admin = ProviderFactory.eINSTANCE.createAdmin();
		admin.setLocation(createPoint());
		ms.setAdmin(admin);
		
		MoistureStatus s = ChirpstackMoistureFactory.eINSTANCE.createMoistureStatus();
		int value = Long.valueOf(Math.round(Math.random()*100 )).intValue();
		logger.log(Level.INFO, "Send moisture data ({1}%) for {0}.", name, value);
		s.setValue(value);
		s.setObservedArea(createFeature());
		ms.setStatus(s);
		sensiNact.pushUpdate(ms);
	}

	private FeatureCollection createFeature() {
		FeatureCollection fc = new FeatureCollection();
		Feature f1 = new Feature();
		f1.geometry = createPolygon();
		Feature f2 = new Feature();
		f2.geometry = createPoint();
		fc.features = Arrays.asList(f2, f1);
		return fc;
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
	private Point createPoint() {
		Point l = new Point();
		l.coordinates = createCoordinate(11.583479544464922, 50.92860036325317);
		return l;
	}

	private Coordinates createCoordinate(double lon, double lat) {
		Coordinates c = new Coordinates();
		c.longitude = lon;
		c.latitude = lat;
		return c;
	}
}
