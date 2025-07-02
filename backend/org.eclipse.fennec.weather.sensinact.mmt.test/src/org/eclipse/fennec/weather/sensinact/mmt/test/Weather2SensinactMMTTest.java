/**
 * Copyright (c) 2012 - 2023 Data In Motion and others.
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
package org.eclipse.fennec.weather.sensinact.mmt.test;

import static org.assertj.core.api.Assertions.assertThat;

import java.util.UUID;

import org.eclipse.fennec.model.sensinact.weatherprovider.WeatherProvider;
import org.eclipse.fennec.model.sensinact.weatherprovider.WindData;
import org.eclipse.fennec.qvt.osgi.api.ModelTransformator;
import org.eclipse.sensinact.model.core.provider.Admin;
import org.gecko.weather.model.weather.GeoPosition;
import org.gecko.weather.model.weather.MOSMIXSWeatherReport;
import org.gecko.weather.model.weather.Station;
import org.gecko.weather.model.weather.WeatherFactory;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.osgi.framework.BundleContext;
import org.osgi.test.common.annotation.InjectBundleContext;
import org.osgi.test.common.annotation.InjectService;
import org.osgi.test.common.service.ServiceAware;
import org.osgi.test.junit5.context.BundleContextExtension;
import org.osgi.test.junit5.service.ServiceExtension;

//import org.mockito.Mock;
//import org.mockito.junit.jupiter.MockitoExtension;

/**
 * See documentation here: 
 * 	https://github.com/osgi/osgi-test
 * 	https://github.com/osgi/osgi-test/wiki
 * Examples: https://github.com/osgi/osgi-test/tree/main/examples
 */
@ExtendWith(BundleContextExtension.class)
@ExtendWith(ServiceExtension.class)
//@ExtendWith(MockitoExtension.class)
public class Weather2SensinactMMTTest {
	
//	@Mock
//	TestInterface test;
	
	@BeforeEach
	public void before(@InjectBundleContext BundleContext ctx) {
		System.out.println("test");
	}
	
	@Test
	public void testAdmin(@InjectService ServiceAware<ModelTransformator> modelTransformatorAware) {
		assertThat(modelTransformatorAware).isNotNull();
		ModelTransformator transformator = modelTransformatorAware.getService();
		assertThat(transformator).isNotNull();
		
		MOSMIXSWeatherReport report = createBasicReport();
		
		WeatherProvider sensinactReport = transformator.doTransformation(report);
		assertThat(sensinactReport).isNotNull();
		assertThat(sensinactReport.getId()).isEqualTo(report.getId());
		assertThat(sensinactReport.getAdmin()).isNotNull();
		Admin admin = sensinactReport.getAdmin();
		assertThat(admin.getFriendlyName()).isEqualTo(report.getId());
		assertThat(admin.getLocation()).isNotNull();
	}
	
	@Test
	public void testWindData(@InjectService ServiceAware<ModelTransformator> modelTransformatorAware) {
		assertThat(modelTransformatorAware).isNotNull();
		ModelTransformator transformator = modelTransformatorAware.getService();
		assertThat(transformator).isNotNull();
		
		MOSMIXSWeatherReport report = createBasicReport();
		addWindData(report);
		
		WeatherProvider sensinactReport = transformator.doTransformation(report);
		WindData windData = sensinactReport.getWindData();
		assertThat(windData).isNotNull();
		assertThat(windData.getWindDirection()).isEqualTo(report.getWindDirection());
		assertThat(windData.getWindSpeed()).isEqualTo(report.getWindSpeed());
		
	}
	
	private void addWindData(MOSMIXSWeatherReport report) {
		report.setWindDirection(getRandom());
		report.setWindGustLastHour(getRandom());
		report.setWindGustLastThreeHours(getRandom());
		report.setWindGustMaxLast12Hours(getRandom());
		report.setWindGustProb25(getRandom());
		report.setWindGustProb40(getRandom());
		report.setWindGustProb55(getRandom());
		report.setWindSpeed(getRandom());
		
	}
	
	private float getRandom() {
		return  (float) (100 * Math.random());
	}
	
	private MOSMIXSWeatherReport createBasicReport() {
		MOSMIXSWeatherReport report = WeatherFactory.eINSTANCE.createMOSMIXSWeatherReport();
		String id = UUID.randomUUID().toString();
		report.setId(id);
		Station station = WeatherFactory.eINSTANCE.createStation();
		GeoPosition position = WeatherFactory.eINSTANCE.createGeoPosition();
		position.setElevation(200);
		position.setLatitude(53.12);
		position.setLongitude(13.24);
		station.setLocation(position);
		station.setName("TestStation");
		report.setStation(station);
		return report;
	}

}
