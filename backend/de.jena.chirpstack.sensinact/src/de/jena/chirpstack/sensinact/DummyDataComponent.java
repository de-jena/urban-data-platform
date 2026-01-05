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
package de.jena.chirpstack.sensinact;

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
	private Map<String, Point> fakeSensorMap = Map.ofEntries(Map.entry("fake2", new Point(11.60423,50.94778)), 
			Map.entry("fake1", new Point(11.60401,50.94675)));

	
	ScheduledExecutorService executor = Executors.newSingleThreadScheduledExecutor();

	@Activate
	public void activate() {
		executor.scheduleAtFixedRate(this::updateSensorTeros, 1, 1, TimeUnit.MINUTES);
	}

	@Deactivate
	public void deactivate() {
		executor.shutdown();
	}
	
	private void updateSensorTeros() {
		
		int rand = new Random().nextInt(1, 3);
		if(rand == 1) createAndPushFakeSensor("fake1");
		if(rand == 2) createAndPushFakeSensor("fake2");
		
	}
	
	private void createAndPushFakeSensor(String id) {
		SolidosTeros21 sensor = ChirpstackFactory.eINSTANCE.createSolidosTeros21();
		sensor.setId("chirpstack-"+id);
		Teros21 data = ChirpstackFactory.eINSTANCE.createTeros21();
		data.setBattery(new Random().nextDouble(0, 10.));
		data.setPotentialWater1(new Random().nextDouble(0, 1000.));
		data.setPotentialWater2(new Random().nextDouble(0, 1000.));
		data.setTemperatur1(new Random().nextDouble(0, 10.));
		data.setTemperatur2(new Random().nextDouble(0, 10.));
		sensor.setSensor(data);
		Admin admin = ProviderFactory.eINSTANCE.createAdmin();
		admin.setFriendlyName("FAKE Teros21 Sensor " + id);
		
		
    	Point sensorLocation = fakeSensorMap.get(id);
    	if(sensorLocation != null) {
    		admin.setLocation(sensorLocation);
    	} 
    	sensor.setAdmin(admin);
		sensinact.pushUpdate(sensor).onSuccess(s -> {
			LOGGER.info(String.format("Pushed Fake TEROS %s to Sensinact", id));
		});
		try {
			Thread.sleep(5000l);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
	


	}
