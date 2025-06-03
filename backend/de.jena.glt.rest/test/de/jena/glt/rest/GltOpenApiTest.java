package de.jena.glt.rest;

import static org.assertj.core.api.Assertions.assertThat;
import static org.mockito.Mockito.when;

import java.util.Map;

import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

import de.jena.glt.rest.GltOpenApi.OpenApiConfig;

class GltOpenApiTest {

	@Test
	void test() {
		GltOpenApi gltOpenApi = new GltOpenApi();
		OpenApiConfig conf = Mockito.mock(OpenApiConfig.class);
		when(conf.apiKey()).thenReturn("1234");
		gltOpenApi.activate(conf);
		Map<String,Object> header = gltOpenApi.getHeader();
		assertThat(header).containsEntry("x-api-key", "1234");
	}

}
