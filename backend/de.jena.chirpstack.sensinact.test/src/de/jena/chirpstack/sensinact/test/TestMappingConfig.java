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
package de.jena.chirpstack.sensinact.test;

import static org.junit.jupiter.api.Assertions.fail;

import java.util.Collections;
import java.util.HashMap;
import java.util.List;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EAnnotation;
import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.sensinact.gateway.southbound.device.factory.dto.DeviceMappingConfigurationDTO;
import org.eclipse.sensinact.gateway.southbound.device.factory.dto.DeviceMappingOptionsDTO;
import org.eclipse.sensinact.model.core.provider.ProviderPackage;
import org.junit.jupiter.api.Test;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

import de.jena.chirpstack.moisture.model.moisture.ChirpstackMoisturePackage;

/**
 * 
 * @author grune
 * @since Jul 4, 2025
 */
class TestMappingConfig {

	private static final String CONFIG_STRING = """
			{
			"parser": "json",
			"mapping": {
			"$devEui": "deviceInfo/devEui",
			"@modelPackageUri": {
			"literal": "https://model.data.jena.de/sensinact/chirpstack/moisture/1.0"
			},
			"@model": "deviceInfo/deviceProfileName",
			"@provider": {
			"literal": "chirpstack-${devEui}"
			},
			"@friendlyName": "deviceInfo/deviceName",
			"@latitude": "rxInfo/0/location/latitude",
			"@longitude": "rxInfo/0/location/longitude",
			"@altitude": "rxInfo/0/location/altitude",
			"device/DevEUI": "deviceInfo/devEui",
			"device/name": "deviceInfo/deviceName",
			"device/profileId": "deviceInfo/deviceProfileId",
			"device/profileName": "deviceInfo/deviceProfileName",
			"device/tenantId": "deviceInfo/tenantId",
			"device/tenantName": "deviceInfo/tenantName",
			"device/applicationId": "deviceInfo/applicationId",
			"device/applicationName": "deviceInfo/applicationName",
			"sensor/battery": "object/BatV",
			"sensor/iflag": "object/i_flag",
			"sensor/sflag": "object/s_flag",
			"sensor/Mod": "object/Mod",
			"sensor/temperatureDS18B20": {
			"path": "object/temp_DS18B20",
			"type": "float"
			},
			"soil/temperature": "object/temp_SOIL_f",
			"soil/water": "object/water_SOIL_f",
			"soil/conduct": "object/conduct_SOIL_f"
			}
			}""";

	@Test
	void test() {

		try {
			ObjectMapper objectMapper = new ObjectMapper();
			DeviceMappingConfigurationDTO mappingConfiguration = objectMapper.readValue(CONFIG_STRING,
					DeviceMappingConfigurationDTO.class);

			EClass providerEClass = ProviderPackage.eINSTANCE.getProvider();
			EClass serviceEClass = ProviderPackage.eINSTANCE.getService();

			List<EClass> providers = ChirpstackMoisturePackage.eINSTANCE.getEClassifiers().stream()
					.filter(EClass.class::isInstance)//
					.map(EClass.class::cast)//
					.filter(e -> hasSuperType(providerEClass, e)).toList();
			for (EClass provider : providers) {
				String name = provider.getName();
				DeviceMappingConfigurationDTO dto = new DeviceMappingConfigurationDTO();
				dto.parser = "json";
				dto.mappingOptions = new DeviceMappingOptionsDTO();
				dto.parserOptions = Collections.emptyMap();
				dto.mapping = new HashMap<>();
				dto.mapping.put("$devEui", "deviceInfo/devEui");
				dto.mapping.put("@modelPackageUri",
						Collections.singletonMap("literal", ChirpstackMoisturePackage.eNS_URI));
				dto.mapping.put("@model", "deviceInfo/deviceProfileName");
				dto.mapping.put("@provider", Collections.singletonMap("literal", "chirpstack-${devEui}"));
				dto.mapping.put("@friendlyName", "deviceInfo/deviceName");
				dto.mapping.put("@latitude", "rxInfo/0/location/latitude");
				dto.mapping.put("@longitude", "rxInfo/0/location/longitude");
				dto.mapping.put("@altitude", "rxInfo/0/location/altitude");
				List<EReference> services = provider.getEReferences().stream() //
						.filter(ref -> hasSuperType(serviceEClass, ref.getEReferenceType())).toList();
				for (EReference serviceRef : services) {
					EClass refEclass = serviceRef.getEReferenceType();
					String refName = serviceRef.getName();
					EList<EAttribute> serviceAttributes = refEclass.getEAllAttributes();
					for (EAttribute serviceAttribute : serviceAttributes) {
						EAnnotation mappingAnnotation = serviceAttribute.getEAnnotation("mapping");
						String attrName = serviceAttribute.getName();
						if(mappingAnnotation != null) {
							String lorawanPath = mappingAnnotation.getDetails().get("path");
							String lorawanType = mappingAnnotation.getDetails().get("type");
							if(lorawanPath != null && !lorawanPath.isEmpty()) {
								if(lorawanType == null) {
								dto.mapping.put(refName+"/"+attrName, lorawanPath);
								} else {
									HashMap<String,Object> map = new HashMap<>();
									map.put("path", lorawanPath);
									map.put("type", lorawanType);
									dto.mapping.put(refName+"/"+attrName, map);
								}
							}
						}
					}
				}
				String mapping = objectMapper.writeValueAsString(dto);
				System.out.println(name);
				System.out.println(mapping);
			}

//			List<EReference> serviceRefs = providers.stream() //
//					.flatMap(e -> e.getEAllReferences().stream()) //
//					.filter(ref -> serviceEClass.isInstance(ref.getEReferenceType())).toList();

		} catch (JsonProcessingException e) {
			e.printStackTrace();
		}

		fail("Not yet implemented");
	}

	/**
	 * @param providerEClass
	 * @param e
	 * @return
	 */
	private boolean hasSuperType(EClass providerEClass, EClass e) {
		return e.getESuperTypes().contains(providerEClass);
	}

}
