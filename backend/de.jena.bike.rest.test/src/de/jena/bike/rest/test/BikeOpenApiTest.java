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
package de.jena.bike.rest.test;

import static org.assertj.core.api.Assertions.assertThat;

import java.math.BigInteger;
import java.time.Instant;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;
import org.gecko.emf.osgi.annotation.require.RequireEMF;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.osgi.framework.BundleContext;
import org.osgi.test.common.annotation.InjectBundleContext;
import org.osgi.test.common.annotation.InjectService;
import org.osgi.test.common.annotation.Property;
import org.osgi.test.common.annotation.config.WithFactoryConfiguration;
import org.osgi.test.common.service.ServiceAware;
import org.osgi.test.junit5.cm.ConfigurationExtension;
import org.osgi.test.junit5.context.BundleContextExtension;
import org.osgi.test.junit5.service.ServiceExtension;

import de.jena.bike.BikeFactory;
import de.jena.bike.DateRange;
import de.jena.bike.HistoricalRawTraffic;
import de.jena.bike.HistoricalRawTraffic_data;
import de.jena.bike.Response;
import de.jena.bike.site;
import de.jena.bike.rest.BikeOpenApi;

//import org.mockito.Mock;
//import org.mockito.junit.jupiter.MockitoExtension;

/**
 * See documentation here: https://github.com/osgi/osgi-test
 * https://github.com/osgi/osgi-test/wiki Examples:
 * https://github.com/osgi/osgi-test/tree/main/examples
 */
@RequireEMF
@ExtendWith(BundleContextExtension.class)
@ExtendWith(ServiceExtension.class)
@ExtendWith(ConfigurationExtension.class)
@WithFactoryConfiguration(factoryPid = "DefaultCodecFactoryConfigurator", location = "?", name = "test", properties = {
		@Property(key = "type", value = "json") })
@WithFactoryConfiguration(factoryPid = "DefaultObjectMapperConfigurator", location = "?", name = "test", properties = {
		@Property(key = "type", value = "json") })
@WithFactoryConfiguration(factoryPid = "DefaultCodecModuleConfigurator", location = "?", name = "test", properties = {
		@Property(key = "type", value = "json") })
@WithFactoryConfiguration(factoryPid = "BikeOpenApi", location = "?", name = "bike", properties = {
		@Property(key = "url", value = "https://api.eco-counter.com/api/v2"),
		@Property(key = "apiKey", value = "lV2HZMcifr6G6GxDd5a8") })
public class BikeOpenApiTest {

//	@Mock
//	TestInterface test;

	@BeforeEach
	public void before(@InjectBundleContext BundleContext ctx) {

	}

	@Test
	public void test(@InjectService(cardinality = 0) ServiceAware<BikeOpenApi> swBike) throws InterruptedException {
		BikeOpenApi api = swBike.waitForService(500);
		assertThat(api).isNotNull();
		Response response = api.GetSites(1, null, null, null, null, null, null, null, null);
		assertThat(response).isNotNull();
		EList<EObject> result = response.getResult();
		assertThat(result).hasSize(6);
		assertThat(result.get(0)).isInstanceOf(site.class);
		site site = (site) result.get(0);
		assertThat(site.getId()).isEqualTo(100046725);
		assertThat(site.getName()).isEqualTo("Jena-Goldbergrampe");
		String dateEnd = DateTimeFormatter.ISO_LOCAL_DATE.format(LocalDate.now());
		String dateStart = DateTimeFormatter.ISO_LOCAL_DATE.format(LocalDate.now().minus(5, ChronoUnit.DAYS));
		Response rawResponse = api.GetRawTraffic(BigInteger.valueOf(100046725), null, dateStart, dateEnd, null, null, null, null, null, null);
		EList<EObject> rawResult = rawResponse.getResult();
		for (EObject eObject : rawResult) {
			HistoricalRawTraffic hrt = (HistoricalRawTraffic) eObject;
			EList<HistoricalRawTraffic_data> data = hrt.getData();
		}
		DateRange range = BikeFactory.eINSTANCE.createDateRange();
		Response totalResponse = api.GetTotalTraffic(null, BigInteger.valueOf(100046725), range , null, null, null, null, false);

	}

}
