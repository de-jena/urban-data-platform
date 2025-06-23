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
package de.jena.glt.rest.test;

import static org.assertj.core.api.Assertions.assertThat;

import org.eclipse.emf.common.util.ECollections;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;
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

import de.jena.glt.rest.GltOpenApi;
import de.jena.model.glt.DatalogContentPojo;
import de.jena.model.glt.Response;
import de.jena.model.glt.SystemDescriptionPojo;

/**
 * See documentation here: https://github.com/osgi/osgi-test
 * https://github.com/osgi/osgi-test/wiki Examples:
 * https://github.com/osgi/osgi-test/tree/main/examples
 */

@ExtendWith(BundleContextExtension.class)
@ExtendWith(ServiceExtension.class)
@ExtendWith(ConfigurationExtension.class)
@WithFactoryConfiguration(factoryPid = "DefaultCodecFactoryConfigurator", location = "?", name = "test", properties = {
		@Property(key = "type", value = "json") })
@WithFactoryConfiguration(factoryPid = "DefaultObjectMapperConfigurator", location = "?", name = "test", properties = {
		@Property(key = "type", value = "json") })
@WithFactoryConfiguration(factoryPid = "DefaultCodecModuleConfigurator", location = "?", name = "test", properties = {
		@Property(key = "type", value = "json") })
@WithFactoryConfiguration(factoryPid = "GltOpenApi", location = "?", name = "glt", properties = {
		@Property(key = "url", value = "https://glt.jena.de/rest/v1"),
		@Property(key = "apiKey", value = "mRi9qsN9y4v2cJMVqKH-vKcFMg57uWJL") })
public class GltOpenApiClientTest {

	@BeforeEach
	public void before(@InjectBundleContext BundleContext ctx) {

	}

	@Test
	public void testGetSites(@InjectService(cardinality = 0) ServiceAware<GltOpenApi> swGlt)
			throws InterruptedException {
		GltOpenApi api = swGlt.waitForService(500);
		assertThat(api).isNotNull();
		Response response = api.getSystems(true);

		assertThat(response).isNotNull();
		assertThat(response.getCode()).isEqualTo(200);
		EList<EObject> result = response.getResult();
		assertThat(result).hasSize(98);
		assertThat(result.get(0)).isInstanceOf(SystemDescriptionPojo.class);
		SystemDescriptionPojo site = (SystemDescriptionPojo) result.get(0);
		assertThat(site.getId()).isEqualTo("001");
		assertThat(site.getName()).isEqualTo("Ferne Anlagen");
	}

	@Test
	public void testGetSite(@InjectService(cardinality = 0) ServiceAware<GltOpenApi> swGlt)
			throws InterruptedException {
		GltOpenApi api = swGlt.waitForService(500);
		assertThat(api).isNotNull();
		Response response = api.getSystem("065", false);

		assertThat(response).isNotNull();
		assertThat(response.getCode()).isEqualTo(200);
		EList<EObject> result = response.getResult();
		assertThat(result).hasSize(1);
		assertThat(result.get(0)).isInstanceOf(SystemDescriptionPojo.class);
		SystemDescriptionPojo site = (SystemDescriptionPojo) result.get(0);
		assertThat(site.getName()).isEqualTo("Funktionsgebäude Leichtathletikstadion");
	}

	@Test
	public void testGetDataLogInfo(@InjectService(cardinality = 0) ServiceAware<GltOpenApi> swGlt)
			throws InterruptedException {
		GltOpenApi api = swGlt.waitForService(500);
		assertThat(api).isNotNull();
		Response response = api.getDatalogInfo(65, null);

		assertThat(response).isNotNull();
		assertThat(response.getCode()).isEqualTo(200);
		EList<EObject> result = response.getResult();
		assertThat(result).hasSize(480);
		assertThat(result.get(0)).isInstanceOf(DatalogContentPojo.class);
		DatalogContentPojo content = (DatalogContentPojo) result.get(0);
		assertThat(content.getName()).isEqualTo("T01 VLT Sonden");
	}

	@Test
	public void testGetDataLogContent(@InjectService(cardinality = 0) ServiceAware<GltOpenApi> swGlt)
			throws InterruptedException {
		GltOpenApi api = swGlt.waitForService(500);
		assertThat(api).isNotNull();
		EList<Integer> points = ECollections.asEList(16842753, 16842754, 16842755);
		Response response = api.getDatalogContent(65, points, "2025-05-10T00:00:00.000+00:00", "2025-05-12T00:00:00.000+00:00");

		assertThat(response).isNotNull();
		assertThat(response.getCode()).isEqualTo(200);
		EList<EObject> result = response.getResult();
		assertThat(result.get(0)).isInstanceOf(DatalogContentPojo.class);
		DatalogContentPojo content = (DatalogContentPojo) result.get(0);
		assertThat(content.getName()).isEqualTo("T01 VLT Sonden");
	}
	@Test
	public void testGetDataLogContent2(@InjectService(cardinality = 0) ServiceAware<GltOpenApi> swGlt)
			throws InterruptedException {
		GltOpenApi api = swGlt.waitForService(500);
		assertThat(api).isNotNull();
		EList<Integer> points = ECollections.asEList(16842753, 16842754, 16842755);
		Response response = api.getDatalogContent(65, points, "2025-06-06T20:02:06.991469615+00:00", "2025-06-06T21:03:06.991846395+00:00");
		
		assertThat(response).isNotNull();
		assertThat(response.getCode()).isEqualTo(200);
		EList<EObject> result = response.getResult();
		assertThat(result.get(0)).isInstanceOf(DatalogContentPojo.class);
		DatalogContentPojo content = (DatalogContentPojo) result.get(0);
		assertThat(content.getName()).isEqualTo("T01 VLT Sonden");
	}
}
