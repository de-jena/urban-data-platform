/*
 * Copyright (c) 2012 - 2024 Data In Motion and others.
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

package de.jena.chirpstack.sensinact.configuration;

import java.lang.System.Logger;
import java.lang.System.Logger.Level;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.Executors;

import org.eclipse.sensinact.core.notification.ResourceDataNotification;
import org.eclipse.sensinact.core.push.DataUpdate;
import org.eclipse.sensinact.gateway.geojson.Coordinates;
import org.eclipse.sensinact.gateway.geojson.Feature;
import org.eclipse.sensinact.gateway.geojson.FeatureCollection;
import org.eclipse.sensinact.gateway.geojson.GeoJsonObject;
import org.eclipse.sensinact.gateway.geojson.Point;
import org.eclipse.sensinact.gateway.geojson.Polygon;
import org.eclipse.sensinact.model.core.provider.Admin;
import org.eclipse.sensinact.model.core.provider.ProviderFactory;
import org.osgi.service.component.annotations.Activate;
import org.osgi.service.component.annotations.Reference;
import org.osgi.service.typedevent.TypedEventHandler;
import org.osgi.service.typedevent.propertytypes.EventTopics;
import org.osgi.util.promise.PromiseFactory;

import de.jena.chirpstack.moisture.model.moisture.ChirpstackMoistureFactory;
import de.jena.chirpstack.moisture.model.moisture.MoistureSensor;
import de.jena.chirpstack.moisture.model.moisture.MoistureStatus;

//@Component(configurationPolicy = ConfigurationPolicy.OPTIONAL)
@EventTopics({ "DATA/Dragino_LSE01/*" })
public class DraginoMoistureAreaNotifier implements TypedEventHandler<ResourceDataNotification> {

	private static final Logger logger = System.getLogger(DraginoMoistureAreaNotifier.class.getName());

	private static final double DISTANCE = 0.0005;

	@Reference
	private DataUpdate sensiNact;

	private PromiseFactory promiseFactory;

	@Activate
	public void activate() {
		promiseFactory = new PromiseFactory(Executors.newCachedThreadPool());
	}

	Map<String, Soil> soilValues = new HashMap<>();

	class Soil {
		double temperature;
		double water;
		double conduct;
		String id;

		Soil(String id) {
			this.id = id;
		}
	}

	@Override
	public void notify(String topic, ResourceDataNotification event) {
		promiseFactory.submit(() -> handleNotify(topic, event))
				.onFailure(e -> logger.log(Level.ERROR, "Error while handling notification from {0}.\n{1}", topic, e));
	}

	public boolean handleNotify(String topic, ResourceDataNotification event) {
		if (topic.contains("soil")) {
			return updateSoil(event);
		}
		if (topic.contains("admin/location")) {
			return updateSensor(event);
		}
		return false;
	}

	private boolean updateSensor(ResourceDataNotification event) {
		logger.log(Level.INFO, "Event: {0} - {1}", event.getTopic(), event.timestamp);
		MoistureSensor ms = ChirpstackMoistureFactory.eINSTANCE.createMoistureSensor();
		String name = event.provider + "-area";
		ms.setName(name);
		ms.setId(name);
		Admin admin = ProviderFactory.eINSTANCE.createAdmin();
		admin.setLocation((Point) event.newValue);
		ms.setAdmin(admin);

		MoistureStatus s = ChirpstackMoistureFactory.eINSTANCE.createMoistureStatus();
		logger.log(Level.INFO, "Send moisture data ({1}%) for {0}.", name, 10);
		s.setValue(10);
		s.setObservedArea(createFeature((Point) event.newValue));

		if (soilValues.containsKey(event.provider)) {
			Soil soil = soilValues.get(event.provider);
			s.setConduct(soil.conduct);
			s.setTemperature(soil.temperature);
			s.setWater(soil.water);
		}
		ms.setStatus(s);
		sensiNact.pushUpdate(ms);

		return true;
	}

	private boolean updateSoil(ResourceDataNotification event) {
		synchronized (soilValues) {
			Soil soil = soilValues.computeIfAbsent(event.provider, Soil::new);
			if ("conduct".equals(event.resource)) {
				soil.conduct = (double) event.newValue;
			} else if ("temperature".equals(event.resource)) {
				soil.temperature = (double) event.newValue;
			} else if ("water".equals(event.resource)) {
				soil.water = (double) event.newValue;
			}
		}
		return true;
	}

	private GeoJsonObject createFeature(Point center) {
		FeatureCollection fc = new FeatureCollection();
		Feature f1 = new Feature();
		f1.geometry = createPolygon(center);
		fc.features = Arrays.asList(f1);
		return fc;
	}

	private Polygon createPolygon(Point center) {
		Polygon l = new Polygon();
		ArrayList<Coordinates> coordinates = new ArrayList<>();
		coordinates
				.add(createCoordinate(center.coordinates.latitude - DISTANCE, center.coordinates.longitude - DISTANCE));
		coordinates
				.add(createCoordinate(center.coordinates.latitude - DISTANCE, center.coordinates.longitude + DISTANCE));
		coordinates
				.add(createCoordinate(center.coordinates.latitude + DISTANCE, center.coordinates.longitude + DISTANCE));
		coordinates
				.add(createCoordinate(center.coordinates.latitude + DISTANCE, center.coordinates.longitude - DISTANCE));
		coordinates
				.add(createCoordinate(center.coordinates.latitude - DISTANCE, center.coordinates.longitude - DISTANCE));

		l.coordinates = new ArrayList<>();
		l.coordinates.add(coordinates);
		return l;
	}

	private Coordinates createCoordinate(double latitude, double longitude) {
		Coordinates c = new Coordinates();
		c.latitude = latitude;
		c.longitude = longitude;
		return c;
	}

}
