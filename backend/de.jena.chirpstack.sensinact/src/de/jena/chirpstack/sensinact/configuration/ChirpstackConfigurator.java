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

package de.jena.chirpstack.sensinact.configuration;

import java.io.IOException;
import java.lang.System.Logger;
import java.lang.System.Logger.Level;
import java.util.Collections;
import java.util.Dictionary;
import java.util.HashMap;
import java.util.Hashtable;
import java.util.List;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EAnnotation;
import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.sensinact.gateway.southbound.device.factory.dto.DeviceMappingConfigurationDTO;
import org.eclipse.sensinact.gateway.southbound.device.factory.dto.DeviceMappingOptionsDTO;
import org.eclipse.sensinact.model.core.provider.ProviderPackage;
import org.osgi.service.cm.Configuration;
import org.osgi.service.cm.ConfigurationAdmin;
import org.osgi.service.component.annotations.Activate;
import org.osgi.service.component.annotations.Component;
import org.osgi.service.component.annotations.Modified;
import org.osgi.service.component.annotations.Reference;
import org.osgi.service.metatype.annotations.AttributeDefinition;

import com.fasterxml.jackson.databind.ObjectMapper;

import de.jena.chirpstack.moisture.model.moisture.ChirpstackMoisturePackage;

@Component(configurationPid = "ChirpstackConfig")
public class ChirpstackConfigurator {
	private static final Logger logger = System.getLogger(ChirpstackConfigurator.class.getName());

	private static final String DEVICE_FACTORY_PID = "sensinact.mqtt.device.factory";
	private static final String MQTT_PID = "sensinact.southbound.mqtt";

	EClass providerEClass = ProviderPackage.eINSTANCE.getProvider();
	EClass serviceEClass = ProviderPackage.eINSTANCE.getService();

	@interface ChirpstackConfig {
		@AttributeDefinition(name = "id", description = "Identifier to bind mqtt gateway to device factory")
		String id();

		@AttributeDefinition(name = "protocol", description = "Network protocol to communicate with the chirpstack gateway")
		String protocol() default "ssl";

		@AttributeDefinition(name = "host", description = "Hostname of the chirpstack gateway")
		String host();

		@AttributeDefinition(name = "port", description = "Network port of the chirpstack gateway")
		int port();

		@AttributeDefinition(name = "topics", description = "mqtt topics of the chirpstack applications")
		String[] topics();

		@AttributeDefinition(name = "certPath", description = "Absolute path to the file containing the client certificate (.pem)")
		String certPath();

		@AttributeDefinition(name = "certKey", description = "Absolute path to the file containing the client key (.key)")
		String certKey();

		@AttributeDefinition(name = "caPath", description = "Absolute path to the file containing the ca certificate (.pem)")
		String caPath();

		@AttributeDefinition(name = "caChainPath", description = "List of absolute paths to the files containing the ca cert chain")
		String[] caChainPath();
	}

	@Reference
	private ConfigurationAdmin configAdmin;

	private final ObjectMapper objectMapper = new ObjectMapper();

	@Activate
	public void activate(ChirpstackConfig config) {
		String id = config.id();
		logger.log(Level.DEBUG, "Start loading chirpstack configuration {0}", id);
		try {
			init(config, id);
		} catch (Exception e) {
			logger.log(Level.ERROR, () -> "Error while reading configuration from " + id, e);
		}
	}

	@Modified
	public void modify(ChirpstackConfig config) {
		String id = config.id();
		logger.log(Level.DEBUG, "Update chirpstack configuration {0}", id);
		try {
			init(config, id);
		} catch (Exception e) {
			logger.log(Level.ERROR, () -> "Error while reading configuration from " + id, e);
		}
	}

	private void init(ChirpstackConfig config, String id) throws IOException {
		List<EClass> providers = ChirpstackMoisturePackage.eINSTANCE.getEClassifiers().stream()
				.filter(EClass.class::isInstance) //
				.map(EClass.class::cast) //
				.filter(e -> hasSuperType(providerEClass, e)).toList();
		configureGateway(id, config);
		for (EClass provider : providers) {
			String name = provider.getName();
			logger.log(Level.INFO, () -> "try to create device config for " + name);
			configureDeviceFactory(id, provider);
		}
	}

	private void configureDeviceFactory(String id, EClass provider) throws IOException {
		HashMap<String, Object> modelMapping = new HashMap<>();
		List<EReference> services = provider.getEReferences().stream() //
				.filter(ref -> hasSuperType(serviceEClass, ref.getEReferenceType())).toList();
		for (EReference serviceRef : services) {
			EClass refEclass = serviceRef.getEReferenceType();
			String refName = serviceRef.getName();
			EList<EAttribute> serviceAttributes = refEclass.getEAllAttributes();
			for (EAttribute serviceAttribute : serviceAttributes) {
				readMappingFromAnnotations(modelMapping, refName, serviceAttribute);
			}
		}
		if (!modelMapping.isEmpty()) {
			String name = provider.getName();
			logger.log(Level.INFO, () -> "create device config for " + name);
			DeviceMappingConfigurationDTO dto = initDto(modelMapping);
			String m = objectMapper.writeValueAsString(dto);
			Dictionary<String, Object> props = new Hashtable<>();
			props.put("mqtt.handler.id", id);
			props.put("mapping", m);

			Configuration config = configAdmin.getFactoryConfiguration(DEVICE_FACTORY_PID, name, "?");
			logger.log(Level.DEBUG, "Update configuration for {0} with {1}", config, props);
			config.updateIfDifferent(props);
		}
	}

	private void readMappingFromAnnotations(HashMap<String, Object> modelMapping, String refName,
			EAttribute serviceAttribute) {
		EAnnotation mappingAnnotation = serviceAttribute.getEAnnotation("mapping");
		String attrName = serviceAttribute.getName();
		if (mappingAnnotation != null) {
			String lorawanPath = mappingAnnotation.getDetails().get("path");
			String lorawanType = mappingAnnotation.getDetails().get("type");
			if (lorawanPath != null && !lorawanPath.isEmpty()) {
				if (lorawanType == null) {
					modelMapping.put(refName + "/" + attrName, lorawanPath);
				} else {
					HashMap<String, Object> map = new HashMap<>();
					map.put("path", lorawanPath);
					map.put("type", lorawanType);
					modelMapping.put(refName + "/" + attrName, map);
				}
			}
		}
	}

	private DeviceMappingConfigurationDTO initDto(HashMap<String, Object> modelMapping) {
		DeviceMappingConfigurationDTO dto = new DeviceMappingConfigurationDTO();
		dto.parser = "json";
		dto.mappingOptions = new DeviceMappingOptionsDTO();
		dto.parserOptions = Collections.emptyMap();
		dto.mapping = modelMapping;
		dto.mapping.put("$devEui", "deviceInfo/devEui");
		dto.mapping.put("$applicationName", "deviceInfo/applicationName");
		dto.mapping.put("$deviceName", "deviceInfo/deviceName");
		dto.mapping.put("@modelPackageUri", Collections.singletonMap("literal", ChirpstackMoisturePackage.eNS_URI));
		dto.mapping.put("@model", "deviceInfo/deviceProfileName");
		dto.mapping.put("@provider", Collections.singletonMap("literal", "chirpstack-${devEui}"));
		dto.mapping.put("@name", Collections.singletonMap("literal", "${applicationName}-${deviceName}"));
		dto.mapping.put("@latitude", "rxInfo/0/location/latitude");
		dto.mapping.put("@longitude", "rxInfo/0/location/longitude");
//		dto.mapping.put("@altitude", "rxInfo/0/location/altitude"); History can't Z axis  
		return dto;
	}

	private boolean hasSuperType(EClass providerEClass, EClass e) {
		return e.getESuperTypes().contains(providerEClass);
	}

	void configureGateway(String name, ChirpstackConfig csConfig) throws IOException {
		Configuration config = configAdmin.getFactoryConfiguration(MQTT_PID, name, "?");
		Dictionary<String, Object> props = new Hashtable<>();
		props.put("id", name);
		props.put("protocol", csConfig.protocol());
		props.put("host", csConfig.host());
		props.put("port", csConfig.port());
		props.put("topics", csConfig.topics());
		props.put("auth.clientcert.path", csConfig.certPath());
		props.put("auth.clientcert.key", csConfig.certKey());
		props.put("auth.clientcert.key.algorithm", "EC");
		props.put("auth.clientcert.ca.path", csConfig.caPath());
		props.put("auth.trusted.certs", csConfig.caChainPath());
		props.put("auth.allow.expired", true);

		logger.log(Level.DEBUG, "Update configuration for {0} with {1}", config, props);
		config.updateIfDifferent(props);
	}

}