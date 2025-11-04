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
package de.jena.udp.reference.area.component;

import java.util.List;
import java.util.Map;
import java.util.Random;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import java.util.logging.Logger;

import org.eclipse.sensinact.core.push.DataUpdate;
import org.eclipse.sensinact.gateway.geojson.Point;
import org.eclipse.sensinact.model.core.provider.Admin;
import org.eclipse.sensinact.model.core.provider.ProviderFactory;
import org.osgi.service.component.annotations.Activate;
import org.osgi.service.component.annotations.Component;
import org.osgi.service.component.annotations.Deactivate;
import org.osgi.service.component.annotations.Reference;

import de.jena.chirpstack.model.chirpstack.ChirpstackFactory;
import de.jena.chirpstack.model.chirpstack.SolidosTeros21;
import de.jena.chirpstack.model.chirpstack.Teros21;

/**
 * 
 * @author ilenia
 * @since Nov 4, 2025
 */
//@Component(name = "DummyDataComponent", immediate = true)
public class DummyDataComponent {

	@Reference
	DataUpdate sensinact;

	private static final Logger LOGGER = Logger.getLogger(DummyDataComponent.class.getName());

	private static final Map<String, List<Point>> SENSOR_PER_AREA_MAP =  Map.ofEntries(
			Map.entry("ZW-06", List.of(new Point(11.61972,50.95957))),
			Map.entry("ZW-02", List.of(new Point(11.60001, 50.96222), new Point(11.60557,50.96262))),
			Map.entry("ZW-07", List.of(new Point(11.62404,50.96329), new Point(11.6252,50.96253), new Point(11.62376, 50.96242))),
			Map.entry("ZW-09", List.of(new Point(11.62243,50.96507), new Point(11.62291,50.96492), new Point(11.62347,50.96471), new Point(11.62257,50.9649))),
			Map.entry("ZW-01", List.of(new Point(11.62803, 50.96664), new Point(11.62738,50.96632), new Point(11.62879,50.96633), new Point(11.62783,50.96646), new Point(11.62726,50.96598)))
			);

	private static final List<String> REF_AREA_NAME_LIST = List.of("ZW-06", "ZW-02", "ZW-07", "ZW-09", "ZW-01");

	ScheduledExecutorService executor = Executors.newSingleThreadScheduledExecutor();

	@Activate
	public void activate() {
		executor.scheduleAtFixedRate(this::pushDummyData, 1, 1, TimeUnit.MINUTES);
	}

	@Deactivate
	public void deactivate() {
		executor.shutdown();
	}

	private void pushDummyData() {

		int rand = new Random().nextInt(0, 5);
		String refArea = REF_AREA_NAME_LIST.get(rand);
		List<Point> sensorLocations = SENSOR_PER_AREA_MAP.get(refArea);
		int counter = 0;
		for(Point point : sensorLocations) {
			SolidosTeros21 sensor = generateRandomSensorData(refArea + "-sensor"+counter++, point);
			sensinact.pushUpdate(sensor);
			try {
				Thread.sleep(5000l);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		LOGGER.info(String.format("Generated %d sensors for Reference Area %s", sensorLocations.size(), refArea));
	}

		private SolidosTeros21 generateRandomSensorData(String name, Point point) {
			SolidosTeros21 sensor = ChirpstackFactory.eINSTANCE.createSolidosTeros21();
			sensor.setId("chirpstack-FAKE-"+name);
			Teros21 data = ChirpstackFactory.eINSTANCE.createTeros21();
			data.setBattery(new Random().nextDouble(0, 10.));
			data.setPotentialWater1(new Random().nextDouble(0, 1000.));
			data.setPotentialWater2(new Random().nextDouble(0, 1000.));
			data.setTemperatur1(new Random().nextDouble(0, 10.));
			data.setTemperatur2(new Random().nextDouble(0, 10.));
			sensor.setSensor(data);
			Admin admin = ProviderFactory.eINSTANCE.createAdmin();
			admin.setFriendlyName("FAKE Teros21 Sensor " + name);
			admin.setLocation(point);
			sensor.setAdmin(admin);
			return sensor;
		}

	}
