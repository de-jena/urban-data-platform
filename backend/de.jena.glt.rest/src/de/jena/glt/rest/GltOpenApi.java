package de.jena.glt.rest;

import java.lang.System.Logger;
import java.lang.System.Logger.Level;
import java.util.Base64;
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
//import jakarta.ws.rs.client.ClientBuilder;
//import jakarta.ws.rs.client.WebTarget;
//import jakarta.ws.rs.core.MediaType;
import org.gecko.codec.constants.CodecResourceOptions;
import org.gecko.emf.osgi.constants.EMFNamespaces;
import org.gecko.emf.osgi.constants.EMFUriHandlerConstants;
import org.osgi.service.component.ComponentServiceObjects;
import org.osgi.service.component.annotations.Component;
import org.osgi.service.component.annotations.Reference;
import org.osgi.service.component.annotations.ServiceScope;
import org.osgi.service.metatype.annotations.ObjectClassDefinition;

import de.jena.model.glt.GltFactory;
import de.jena.model.glt.Response;
import de.jena.model.glt.impl.GltOpenApiClientImpl;
import jakarta.ws.rs.client.Client;
import jakarta.ws.rs.client.ClientBuilder;
import jakarta.ws.rs.client.WebTarget;
import jakarta.ws.rs.core.MediaType;
import jakarta.ws.rs.core.MultivaluedHashMap;

@Component(configurationPid = "GltOpenApi", service = GltOpenApi.class, scope = ServiceScope.PROTOTYPE)
public class GltOpenApi extends GltOpenApiClientImpl {
	/** GET_FAILED_WITH_HTTP_RESPONSE_CODE */
	private static final String GET_HTTP_ERROR_WITH_CODE = "GET failed with HTTP response code ";

	private static final Logger logger = System.getLogger(GltOpenApi.class.getName());

	@Reference(target = "(" + EMFNamespaces.EMF_CONFIGURATOR_NAME + "=CodecJson)")
	ComponentServiceObjects<ResourceSet> serviceObjects;

	private OpenApiConfig config;

	private String token;

	@ObjectClassDefinition(name = "OpenApi Configuration")
	public @interface OpenApiConfig {
		String url();

		String apiKey() default "";

		String login() default "";

		String password() default "";
		
		String bearerToken() default "";
	}

	public void activate(OpenApiConfig config) {
		this.config = config;
	}

	public void setAuthToken(String token ) {
		this.token = token;
	}
	
	public Response callJakarta(String path, EMap<String, String> templateParameters,
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
					.headers(new MultivaluedHashMap<>(getHeader()))
					.get();
			Response gltResponse = GltFactory.eINSTANCE.createResponse();
			gltResponse.setResponse(response);
			gltResponse.setCode(response.getStatus());
			return gltResponse;

		}
	}

	public Response call(String path, EClass resultEClass, EMap<String,String> pathParameters,
			EMap<String,String> queryParameters) {
		String requestURL = config.url() + path;
		for (Entry<String, String> param : pathParameters.entrySet()) {
			requestURL = requestURL.replace("{" + param.getKey() + "}", param.getValue().toString());
		}
		if (!queryParameters.isEmpty()) {
			requestURL = queryParameters.keySet().stream().map(key -> key + "=" + queryParameters.get(key))
					.collect(Collectors.joining("&", requestURL + "?", ""));

		}

		Map<String, Object> options = new HashMap<>();
		options.put(EMFUriHandlerConstants.OPTION_HTTP_METHOD, "GET");
		options.put(EMFUriHandlerConstants.OPTION_HTTP_HEADERS, getHeader());
		options.put(CodecResourceOptions.CODEC_ROOT_OBJECT, resultEClass);

		Response gltResponse = GltFactory.eINSTANCE.createResponse();

		ResourceSet resourceSet = serviceObjects.getService();
		Resource resource = null;
		try {
			resource = resourceSet.createResource(URI.createURI(requestURL), "application/json");
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

	private int extractCode(String msg) {
		if (msg.startsWith(GET_HTTP_ERROR_WITH_CODE)) {
			return Integer.parseInt(msg, GET_HTTP_ERROR_WITH_CODE.length(), msg.length(), 10);
		} else {
			return 500;
		}
	}

	private Map<String, Object> getHeader() {
		Map<String, Object> headers = new HashMap<>();
		headers.put("Accept", "*/*");
		headers.put("Content-Type", "application/json");
		headers.put("Method", "GET");
		getAuthHeader(headers);
		return headers;
	}
	
	private void getAuthHeader(Map<String, Object> headers) {
		String apiKey = config.apiKey();
		if (isNotEmpty(apiKey)) {
			headers.put("x-api-key", apiKey);
		} else {
			String login = config.login();
			String password = config.password();
			if (isNotEmpty(login) && isNotEmpty(password)) {
				headers.put("Authorization", getBasicAuthHeader(login + ":" + password));
			}
		}
		if (isNotEmpty(config.bearerToken())) {
			headers.put("Authorization", "Bearer " + config.bearerToken());
		}
		if (isNotEmpty(token)) {
			headers.put("Authorization", "Bearer " + token);
		}
	}

	private String getBasicAuthHeader(String basicAuth) {
		return "Basic " + Base64.getEncoder().encodeToString(basicAuth.getBytes());
	}

	private boolean isNotEmpty(String s) {
		return s != null && !s.isEmpty();
	}

	@Override
	public Response _call(String endPoint, EClass resultEClass, EMap<String, String> pathParameters, EMap<String, String> queryParameters) {
		if(resultEClass ==null) {
			return callJakarta(endPoint, pathParameters, queryParameters);
		} else {
			return call(endPoint, resultEClass, pathParameters, queryParameters);
		}
	}

}

