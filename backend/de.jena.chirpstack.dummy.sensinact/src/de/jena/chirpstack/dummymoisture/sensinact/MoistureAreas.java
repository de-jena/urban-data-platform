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
package de.jena.chirpstack.dummymoisture.sensinact;

import java.lang.System.Logger;
import java.lang.System.Logger.Level;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

import org.eclipse.sensinact.core.push.DataUpdate;
import org.eclipse.sensinact.gateway.geojson.Coordinates;
import org.eclipse.sensinact.gateway.geojson.Feature;
import org.eclipse.sensinact.gateway.geojson.FeatureCollection;
import org.eclipse.sensinact.gateway.geojson.Point;
import org.eclipse.sensinact.gateway.geojson.Polygon;
import org.osgi.service.component.annotations.Activate;
import org.osgi.service.component.annotations.Component;
import org.osgi.service.component.annotations.Deactivate;
import org.osgi.service.component.annotations.Reference;

import de.jena.chirpstack.model.dummymoisture.DummyMoistureFactory;
import de.jena.chirpstack.model.dummymoisture.MoistureAdmin;
import de.jena.chirpstack.model.dummymoisture.MoistureSensor;
import de.jena.chirpstack.model.dummymoisture.MoistureStatus;
import de.jena.chirpstack.model.dummymoisture.SoilType;

/**
 * 
 */
@Component
public class MoistureAreas {
	private static final Logger logger = System.getLogger(MoistureAreas.class.getName());

	private double[][] v1 = new double[][] { { 11.585181724114278, 50.92903179803102 },
			{ 11.58509352954951, 50.928389147960104 }, { 11.584501980636844, 50.9284094851233 },
			{ 11.584471865419005, 50.92828339456577 }, { 11.585194630636323, 50.92817628511429 },
			{ 11.585347357810349, 50.9290141727252 }, { 11.585181724114278, 50.92903179803102 } };
	private double[][] v2 = new double[][] { { 11.587809926981123, 50.92777816483314 },
			{ 11.588360733465436, 50.92778893916781 }, { 11.5883550354676, 50.928462928698934 },
			{ 11.587760544330592, 50.92845933730649 }, { 11.587599101049989, 50.92786795087966 },
			{ 11.587768141661059, 50.927860768002176 }, { 11.587882101623848, 50.928357581068354 },
			{ 11.588223981510424, 50.928350398266474 }, { 11.588189793521678, 50.92787633090137 },
			{ 11.587827020975482, 50.927860768002176 }, { 11.587809926981123, 50.92777816483314 }

	};
	@Reference
	private DataUpdate sensiNact;

	private ScheduledExecutorService scheduler;

	private List<DummySensor> sensors;

	@Activate
	public void activate() {
		logger.log(Level.DEBUG, "Start loading Moisture areas.");
		scheduler = Executors.newScheduledThreadPool(1);
		DummySensor d1 = new DummySensor("Jena-Center", "JC",11.585164896084024, 50.9284176739302, v1);
		DummySensor d2 = new DummySensor("Jena-Markt", "JM", 11.587946678935253, 50.92782245930468,v2);
		sensors = Arrays.asList(d1, d2);
		scheduler.scheduleAtFixedRate(this::updateArea, 0, 1, TimeUnit.MINUTES);
	}

	@Deactivate
	public void deactivate() {
		scheduler.shutdown();
	}

	private void updateArea() {
		sensors.forEach(DummySensor::push);
	}
	
	class DummySensor {
		private int value = 50;
		private double[][] coords;
		private double lon;
		private double lat;
		private String name;
		private String id;
		
		DummySensor(String name, String id, double lon, double lat, double[][] coords) {
			this.name = name;
			this.id = id;
			this.lon = lon;
			this.lat = lat;
			this.coords = coords;
		}
		
		void push() {
			MoistureSensor ms = DummyMoistureFactory.eINSTANCE.createMoistureSensor();
			ms.setName(name);
			ms.setId(id);
			MoistureAdmin admin = DummyMoistureFactory.eINSTANCE.createMoistureAdmin();
			admin.setLocation(createPoint(lon,lat));
			admin.setSoilType(SoilType.CLAY);
			ms.setAdmin(admin);
			
			MoistureStatus s = DummyMoistureFactory.eINSTANCE.createMoistureStatus();
			logger.log(Level.INFO, "Send moisture data ({1}%) for {0}.", name, value);
			updateValue();
			s.setValue(value);
			s.setObservedArea(createFeature(coords));
			ms.setStatus(s);
			sensiNact.pushUpdate(ms);
		}
		
		private void updateValue() {
			value = value + Long.valueOf(Math.round(Math.random() * 10)).intValue() - 5;
			value = Math.min(value, 95);
			value = Math.max(value, 10);
		}

		private FeatureCollection createFeature(double[][] v) {
			FeatureCollection fc = new FeatureCollection();
			Feature f1 = new Feature();
			f1.geometry = createPolygon(v);
			fc.features = Arrays.asList(f1);
			return fc;
		}

		static Polygon createPolygon(double[][] v) {
			Polygon l = new Polygon();
			ArrayList<Coordinates> coordinates = new ArrayList<>();
			for (double[] a : v) {
				coordinates.add(createCoordinate(a[0], a[1]));
			}

			l.coordinates = new ArrayList<>();
			l.coordinates.add(coordinates);
			return l;
		}

		static Point createPoint(double lon, double lat) {
			Point l = new Point();
			l.coordinates = createCoordinate(lon, lat);
			return l;
		}

		static Coordinates createCoordinate(double lon, double lat) {
			Coordinates c = new Coordinates();
			c.longitude = lon;
			c.latitude = lat;
			return c;
		}
	}
	
}
