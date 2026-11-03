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

package de.jena.traficam.cputemp;

import java.io.BufferedReader;
import java.io.FileReader;
import java.lang.System.Logger;
import java.lang.System.Logger.Level;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

import org.gecko.osgi.messaging.MessagingService;
import org.osgi.service.component.annotations.Activate;
import org.osgi.service.component.annotations.Component;
import org.osgi.service.component.annotations.ConfigurationPolicy;
import org.osgi.service.component.annotations.Deactivate;
import org.osgi.service.component.annotations.Reference;

@Component(configurationPid = "CPUTempMonitor", configurationPolicy = ConfigurationPolicy.REQUIRE)
public class CPUTemp {
	private static final Logger logger = System.getLogger(CPUTemp.class.getName());

	private static final String FILE = "/sys/class/thermal/thermal_zone0/temp";
	private final List<Integer> values = new ArrayList<>();
	@Reference(target = "(id=full)")
	private MessagingService messaging;

	private ScheduledExecutorService executor;

	private String topic;

	@Activate
	public void activate(Map<String,String> config) {
		topic = "5g/admin/" + config.get("id") + "/thermal";
		logger.log(Level.INFO, "Sending CPU temperatures to {0} started.", topic);
		executor = Executors.newScheduledThreadPool(1);
		executor.scheduleAtFixedRate(this::checkTemp, 0, 2, TimeUnit.MINUTES);
	}

	@Deactivate
	public void deactivate() {
		executor.shutdownNow();
	}

	private void checkTemp() {

		try (BufferedReader br = new BufferedReader(new FileReader(FILE))) {
			int value = Integer.parseInt(br.readLine());
			values.add(value);
			int total = values.stream().mapToInt(Integer::valueOf).sum();
			logger.log(Level.INFO, "Now: {0}°C - Average: {1}°C - Number of measurements: {2}", toCelsius(value), toCelsius(total / values.size()),values.size());
			sendMqtt(value);
		} catch (Exception e) {
			logger.log(Level.ERROR, "Error during temperature check: ",e);
		}

	}

	private void sendMqtt(int value) throws Exception {
		ByteBuffer buffer = ByteBuffer.wrap(("" + toCelsius(value)).getBytes());
		messaging.publish(topic, buffer);
	}

	private double toCelsius(int value) {
		return value / 1000d;
	}
}