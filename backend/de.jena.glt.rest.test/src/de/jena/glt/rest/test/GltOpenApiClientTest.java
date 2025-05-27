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
import de.jena.model.glt.SitePojo;

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
		@Property(key = "bearerToken", value = "eyJhbGciOiJSUzI1NiIsInR5cCIgOiAiSldUIiwia2lkIiA6ICJGUUk0R01QZER0RUFVRklYY1FfVWtIQm9oRnhmcVE1OUFaT1Uya3dvRS1NIn0.eyJleHAiOjE3NDgyNDQ5MjgsImlhdCI6MTc0ODI0NDYyOCwiYXV0aF90aW1lIjoxNzQ4MjQzNDY4LCJqdGkiOiI2YzA0MTM0Ni0wOTNiLTQ2ZGQtYTUzMC0xYmQ1MjhhMGNiMDEiLCJpc3MiOiJodHRwczovL2lhbS5qZW5hLmRlL2F1dGgvcmVhbG1zL2plbmEiLCJhdWQiOiJhY2NvdW50Iiwic3ViIjoiMGU2MzdhYzgtMmY0OC00ZDc4LThiMWMtOWRkMmI5NGIwYmU1IiwidHlwIjoiQmVhcmVyIiwiYXpwIjoiZ2x0LmplbmEuZGUiLCJzZXNzaW9uX3N0YXRlIjoiODQ4MjlkNDEtY2ViNi00ZTVjLWE4OTAtMzRiZTI3MmNjYTljIiwiYWxsb3dlZC1vcmlnaW5zIjpbImh0dHBzOi8vZ2x0LmplbmEuZGUiXSwicmVhbG1fYWNjZXNzIjp7InJvbGVzIjpbIm9mZmxpbmVfYWNjZXNzIiwidW1hX2F1dGhvcml6YXRpb24iLCJkZWZhdWx0LXJvbGVzLWplbmEiXX0sInJlc291cmNlX2FjY2VzcyI6eyJhY2NvdW50Ijp7InJvbGVzIjpbIm1hbmFnZS1hY2NvdW50IiwibWFuYWdlLWFjY291bnQtbGlua3MiLCJ2aWV3LXByb2ZpbGUiXX19LCJzY29wZSI6Im9wZW5pZCBwcm9maWxlIGVtYWlsIiwic2lkIjoiODQ4MjlkNDEtY2ViNi00ZTVjLWE4OTAtMzRiZTI3MmNjYTljIiwiZW1haWxfdmVyaWZpZWQiOmZhbHNlLCJuYW1lIjoiR3VpZG8gR3J1bmUiLCJwcmVmZXJyZWRfdXNlcm5hbWUiOiJ4LWdydW5lZyIsImdpdmVuX25hbWUiOiJHdWlkbyIsImZhbWlseV9uYW1lIjoiR3J1bmUifQ.gV0mhPv4IRtRqnArdyNp_DtIvMfnHPK1TkWx07mRjg_ESkW0fOCZt8qNp-SZ9CPPaHoZU0AecVIJbGtugKWomJiaookCFnA79xLuIRpQdgmWOVd6G0EIF5EIKXym-G6wZACJWQ0v8hEbTmHLEr79-V-bcXa2kSjgoq49EFqbS1dopRfdoOGP2D-KZLL4u8Fc8XtfkeAFmny-fAdwWdQsbSonCnHoPeQPgvoApcficnGzJ24vK0585LZGgEjcY20Mqa7dgAAG43buzt7_x0Yy6PqG0r_T9sg_1o7snuSk5Sz-GxrNNIsjIt6WYdIV53FTuCcgnrOrGh02weQDhICTmQ") })
public class GltOpenApiClientTest {

	@BeforeEach
	public void before(@InjectBundleContext BundleContext ctx) {

	}

	@Test
	public void test(@InjectService(cardinality = 0) ServiceAware<GltOpenApi> swGlt) throws InterruptedException {
		GltOpenApi api = swGlt.waitForService(500);
		assertThat(api).isNotNull();
		Response response = api.getSites(false, false);

		assertThat(response).isNotNull();
		assertThat(response.getCode()).isEqualTo(200);
		jakarta.ws.rs.core.Response r = response.getResponse();
		assertThat(r).isNotNull();
		String entity = r.readEntity(String.class);
		assertThat(entity).isNotNull();
	}

	@Test
	public void testGetSites(@InjectService(cardinality = 0) ServiceAware<GltOpenApi> swGlt)
			throws InterruptedException {
		GltOpenApi api = swGlt.waitForService(500);
		assertThat(api).isNotNull();
		Response response = api.getSites(true, false);

		assertThat(response).isNotNull();
		assertThat(response.getCode()).isEqualTo(200);
		jakarta.ws.rs.core.Response r = response.getResponse();
		assertThat(r).isNotNull();
		String entity = r.readEntity(String.class);
		assertThat(entity).isNotNull();
	}

	@Test
	public void testGetSite(@InjectService(cardinality = 0) ServiceAware<GltOpenApi> swGlt)
			throws InterruptedException {
		GltOpenApi api = swGlt.waitForService(500);
		assertThat(api).isNotNull();
		Response response = api.getSite("065", false);

		assertThat(response).isNotNull();
		assertThat(response.getCode()).isEqualTo(200);
		EList<EObject> result = response.getResult();
		assertThat(result).hasSize(1);
		assertThat(result.get(0)).isInstanceOf(SitePojo.class);
		SitePojo site = (SitePojo) result.get(0);
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
}
