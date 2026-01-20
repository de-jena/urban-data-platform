/**
 * Copyright (c) 2012 - 2026 Data In Motion and others.
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
package de.jena.bike.rest;

import java.lang.System.Logger;
import java.lang.System.Logger.Level;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.stream.Collectors;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.EMap;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.fennec.codec.v2.resource.CodecResource;
import org.gecko.emf.osgi.constants.EMFNamespaces;
import org.gecko.emf.osgi.constants.EMFUriHandlerConstants;
import org.osgi.service.component.ComponentServiceObjects;
import org.osgi.service.component.annotations.Activate;
import org.osgi.service.component.annotations.Component;
import org.osgi.service.component.annotations.Reference;
import org.osgi.service.component.annotations.ServiceScope;
import org.osgi.service.metatype.annotations.ObjectClassDefinition;

import de.jena.bike.BikeFactory;
import de.jena.bike.Response;
import de.jena.bike.impl.BikeOpenApiClientImpl;
import jakarta.ws.rs.client.Client;
import jakarta.ws.rs.client.ClientBuilder;
import jakarta.ws.rs.client.WebTarget;
import jakarta.ws.rs.core.MediaType;
import jakarta.ws.rs.core.MultivaluedHashMap;

/**
 * 
 * @author grune
 * @since Jan 12, 2026
 */
@Component(configurationPid = "BikeOpenApi", service = BikeOpenApi.class, scope = ServiceScope.PROTOTYPE)
public class BikeOpenApi extends BikeOpenApiClientImpl {
	/** GET_FAILED_WITH_HTTP_RESPONSE_CODE */
	private static final String GET_HTTP_ERROR_WITH_CODE = "GET failed with HTTP response code ";

	private static final Logger logger = System.getLogger(BikeOpenApi.class.getName());

	@Reference(target = "(" + EMFNamespaces.EMF_CONFIGURATOR_NAME + "=newCodec)")
	ComponentServiceObjects<ResourceSet> serviceObjects;

	private OpenApiConfig config;

	

	@ObjectClassDefinition(name = "OpenApi Configuration")
	public @interface OpenApiConfig {
		String url();

		String apiKey() default "";
	}

	@Activate
	public void activate(OpenApiConfig config) {
		this.config = config;

	}

	public Response getJakarta(String path, EMap<String, String> templateParameters,
			EMap<String, String> queryParameters) {

		try (Client client = ClientBuilder.newClient()) {
			WebTarget target = client.target(config.url()).path(path);
			for (Entry<String, String> param : templateParameters.entrySet()) {
				target = target.resolveTemplate(param.getKey(), param.getValue());
			}
			for (Entry<String, String> param : queryParameters.entrySet()) {
				target = target.queryParam(param.getKey(), param.getValue());
			}

			jakarta.ws.rs.core.Response response = target.request(MediaType.APPLICATION_JSON)
					.headers(new MultivaluedHashMap<>(getHeader())).get();
			Response gltResponse = BikeFactory.eINSTANCE.createResponse();
			gltResponse.setResponse(response);
			gltResponse.setCode(response.getStatus());
			return gltResponse;

		}
	}

	public Response get(String path, EClass resultEClass, EMap<String, String> pathParameters,
			EMap<String, String> queryParameters) {
		String requestURL = config.url() + path;
		for (Entry<String, String> param : pathParameters.entrySet()) {
			requestURL = requestURL.replace("{" + param.getKey() + "}", param.getValue());
		}
		if (!queryParameters.isEmpty()) {
			requestURL = queryParameters.keySet().stream().filter(key -> !queryParameters.get(key).isEmpty())
					.map(key -> key + "=" + queryParameters.get(key))
					.collect(Collectors.joining("&", requestURL + "?", ""));

		}

		Map<String, Object> options = new HashMap<>();
		options.put(EMFUriHandlerConstants.OPTION_HTTP_METHOD, "GET");
		options.put(EMFUriHandlerConstants.OPTION_HTTP_HEADERS, getHeader());
		options.put(CodecResource.CODEC_ROOT_OBJECT, resultEClass);

		Response gltResponse = BikeFactory.eINSTANCE.createResponse();

		ResourceSet resourceSet = serviceObjects.getService();
		Resource resource = null;
		try {
			resource = resourceSet.createResource(URI.createURI(requestURL), "application/json2");
			resource.load(options);
			gltResponse.setCode(200);
			EList<EObject> contents = resource.getContents();
			EList<EObject> result = gltResponse.getResult();
			for (EObject eObject : contents) {
				result.add(EcoreUtil.copy(eObject));
			}
		} catch (Exception e) {
			resource.getErrors().forEach(err -> logger.log(Level.ERROR, "Error " + err));
			logger.log(Level.ERROR, "Error loading resource ", e);
			String msg = e.getLocalizedMessage();
			gltResponse.setCode(extractCode(msg));
			gltResponse.setDescription(msg);
			return gltResponse;
		} finally {
			serviceObjects.ungetService(resourceSet);
		}
		return gltResponse;

	}

	int extractCode(String msg) {
		if (msg.startsWith(GET_HTTP_ERROR_WITH_CODE)) {
			return Integer.parseInt(msg, GET_HTTP_ERROR_WITH_CODE.length(), msg.length(), 10);
		} else {
			return 500;
		}
	}

	Map<String, Object> getHeader() {
		Map<String, Object> headers = new HashMap<>();
		headers.put("Accept", "*/*");
		headers.put("Content-Type", "application/json");
		headers.put("Method", "GET");
		getAuthHeader(headers);
		return headers;
	}

	void getAuthHeader(Map<String, Object> headers) {
		String apiKey = config.apiKey();
		if (apiKey != null && !apiKey.isEmpty()) {
			headers.put("x-api-key", apiKey);
		} else {
			logger.log(Level.ERROR, "API key for Bike Counter (eco-counter) is missing.");
		}
	}

	@Override
	public Response _get(String endPoint, EClass resultEClass, EMap<String, String> pathParameters,
			EMap<String, String> queryParameters) {
		if (resultEClass == null) {
			return getJakarta(endPoint, pathParameters, queryParameters);
		} else {
			return get(endPoint, resultEClass, pathParameters, queryParameters);
		}
	}
}
