/*
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
package de.jena.chirpstack.sensinact;

import java.lang.System.Logger;
import java.lang.System.Logger.Level;
import java.util.Dictionary;
import java.util.Hashtable;
import java.util.Optional;
import java.util.function.Predicate;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EAnnotation;
import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.sensinact.core.push.DataUpdate;
import org.eclipse.sensinact.gateway.geojson.Point;
import org.eclipse.sensinact.gateway.southbound.mqtt.api.IMqttMessage;
import org.eclipse.sensinact.gateway.southbound.mqtt.api.IMqttMessageListener;
import org.eclipse.sensinact.model.core.provider.Admin;
import org.eclipse.sensinact.model.core.provider.Provider;
import org.eclipse.sensinact.model.core.provider.ProviderFactory;
import org.eclipse.sensinact.model.core.provider.ProviderPackage;
import org.gecko.emf.osgi.constants.EMFNamespaces;
import org.osgi.framework.BundleContext;
import org.osgi.framework.ServiceRegistration;
import org.osgi.service.component.ComponentServiceObjects;
import org.osgi.service.component.annotations.Activate;
import org.osgi.service.component.annotations.Component;
import org.osgi.service.component.annotations.ConfigurationPolicy;
import org.osgi.service.component.annotations.Deactivate;
import org.osgi.service.component.annotations.Reference;
import org.osgi.util.promise.Promise;

import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;

import de.jena.chirpstack.model.chirpstack.ChirpstackPackage;

/**
 * Generic reflective ChirpStack MQTT device factory handler that uses EMF model annotations
 * to automatically detect sensor types and map JSON paths to model attributes.
 */
@Component(service = {}, configurationPid = ChirpstackDeviceFactoryHandler.PID, configurationPolicy = ConfigurationPolicy.REQUIRE)
public class ChirpstackDeviceFactoryHandler implements IMqttMessageListener {

	public static final String PID = "chirpstack.reflective.device.factory";

	private static final Logger logger = System.getLogger(ChirpstackDeviceFactoryHandler.class.getName());
	
	@Reference
	ChirpstackLocationComponent chirpstackLocationComponent;
	
	@Reference(target = "(" + EMFNamespaces.EMF_CONFIGURATOR_NAME + "=CodecJson)")
    private ComponentServiceObjects<ResourceSet> serviceObjects;

    @Reference
    private DataUpdate sensiNact;

    private ServiceRegistration<IMqttMessageListener> svcReg;
    private ObjectMapper objectMapper = new ObjectMapper();
    
    @Reference
    private ChirpstackPackage chirpstackPackage;
    
    private EClass providerEClass = ProviderPackage.eINSTANCE.getProvider();
//    private EClass serviceEClass = ProviderPackage.eINSTANCE.getService();

    public @interface ChirpstackConfiguration {
        /**
         * Allowed topics (null to accept all from the handler)
         */
        String[] mqttTopics();

        /**
         * Name for the {@link IMqttMessageListener} service
         */
        String name() default "ChirpstackHandler";
    }

    @Activate
    void activate(final BundleContext context, final ChirpstackConfiguration conf) {
        String[] topics = conf.mqttTopics();
        if (topics == null || topics.length == 0) {
        	topics = new String[] { "#" };
        }

        if (topics.length == 1 && topics[0].contains(",")) {
            topics = topics[0].split(",");
        }

        // Register the listener service
        Dictionary<String, Object> properties = new Hashtable<>();
        properties.put(MQTT_TOPICS_FILTERS, topics);
        properties.put("name", conf.name());
        svcReg = context.registerService(IMqttMessageListener.class, this, properties);

        logger.log(Level.INFO, "ChirpStack Device Factory Handler activated for topics: {0}", String.join(", ", topics));
    }

    @Deactivate
    void deactivate() {
        if (svcReg != null) {
            svcReg.unregister();
            svcReg = null;
        }
    }

    @Override
    public void onMqttMessage(String handlerId, String topic, IMqttMessage message) {
        try {
            JsonNode payload = objectMapper.readTree(message.getPayload());
            
            // Extract device information
            JsonNode deviceInfo = payload.path("deviceInfo");
            String devEui = deviceInfo.path("devEui").asText();
            String deviceProfileName = deviceInfo.path("deviceProfileName").asText();
            String deviceProfileId = deviceInfo.path("deviceProfileId").asText();
            String deviceName = deviceInfo.path("deviceName").asText();
            
            if (devEui.isEmpty()) {
                logger.log(Level.WARNING, "No devEui found in ChirpStack message, skipping");
                return;
            }

            Optional<EClass> providerClass = findProviderClassByName(deviceProfileId);
            if (providerClass.isEmpty()) {
                logger.log(Level.WARNING, "No provider found for device profile: {0} ({1})", deviceProfileId, deviceProfileName);
                return;
            }

            // Create provider instance and populate it reflectively
            Provider providerInstance = (Provider) chirpstackPackage.getChirpstackFactory().create(providerClass.get());
            populateProviderFromJson(providerInstance, payload);

            // Set provider ID and location
            String providerId = "chirpstack-" + devEui;
            setProviderMetadata(providerInstance, providerId, deviceName, payload);

            // Create EMF resource and push to SensinAct
            ResourceSet resourceSet = serviceObjects.getService();
            try {
                URI tempUri = URI.createURI("temp://" + providerId + ".json");
                Resource resource = resourceSet.createResource(tempUri);
                resource.getContents().add(providerInstance);

                Promise<?> promise = sensiNact.pushUpdate(providerInstance);
                promise.onSuccess(result -> 
                    logger.log(Level.INFO, "Successfully updated ChirpStack device: {0} ({1}) using provider: {2} and setting provider id to {3}", 
                        deviceName, deviceProfileName, providerClass.get().getName(), providerInstance.getId())
                ).onFailure(error -> 
                    logger.log(Level.ERROR, "Error updating ChirpStack device {0}: {1}", deviceName, error.getMessage())
                );

            } finally {
                serviceObjects.ungetService(resourceSet);
            }

        } catch (Exception e) {
            logger.log(Level.ERROR, "Error processing ChirpStack MQTT message from {0}: {1}", handlerId, e.getMessage(), e);
        }
    }

	/**
	 * Find provider EClass by matching deviceProfileName with model annotation
	 * "name"
	 */
	private Optional<EClass> findProviderClassByName(String deviceProfileName) {
		return chirpstackPackage.getEClassifiers().stream().filter(EClass.class::isInstance)//
				.map(EClass.class::cast) //
				.filter(e -> hasSuperType(providerEClass, e)) //
				.filter((Predicate<? super EClass>) ec -> {
					EAnnotation eAnnotation = ec.getEAnnotation("model");
					return eAnnotation != null && deviceProfileName.equals(eAnnotation.getDetails().get("profileId"));
				}).findFirst();
	}
	private boolean hasSuperType(EClass providerEClass, EClass e) {
		return e.getESuperTypes().contains(providerEClass);
	}
    /**
     * Populate provider instance reflectively using EMF annotations
     */
    private void populateProviderFromJson(EObject provider, JsonNode payload) {
        EClass providerClass = provider.eClass();
        
        // Process all references (services)
        for (EReference reference : providerClass.getEReferences()) {
            if (reference.isContainment()) {
                EClass serviceClass = (EClass) reference.getEType();
                EObject serviceInstance = chirpstackPackage.getChirpstackFactory().create(serviceClass);
                populateServiceFromJson(serviceInstance, payload);
                provider.eSet(reference, serviceInstance);
                logger.log(Level.DEBUG, "Created and populated service {0} for provider {1}", 
                    serviceClass.getName(), providerClass.getName());
            }
        }

        // Process direct provider attributes (if any)
        for (EAttribute attribute : providerClass.getEAllAttributes()) {
            populateAttributeFromJson(provider, attribute, payload);
        }
    }

    /**
     * Populate service attributes using mapping annotations
     */
    private void populateServiceFromJson(EObject service, JsonNode payload) {
        for (EAttribute attribute : service.eClass().getEAllAttributes()) {
            populateAttributeFromJson(service, attribute, payload);
        }
    }

    /**
     * Populate single attribute using its mapping annotation
     */
    private void populateAttributeFromJson(EObject object, EAttribute attribute, JsonNode payload) {
        EAnnotation mappingAnnotation = attribute.getEAnnotation("mapping");
        if (mappingAnnotation == null) {
            return;
        }

        String jsonPath = mappingAnnotation.getDetails().get("path");
        if (jsonPath == null || jsonPath.isEmpty()) {
            return;
        }

        JsonNode valueNode = getJsonValueByPath(payload, jsonPath);
        if (valueNode == null || valueNode.isMissingNode() || valueNode.isNull()) {
            logger.log(Level.DEBUG, "No value found at path {0} for attribute {1}", jsonPath, attribute.getName());
            return;
        }

        // Convert and set the value based on attribute type
        Object value = convertJsonValue(valueNode, attribute.getEAttributeType(), mappingAnnotation);
        if (value != null) {
            object.eSet(attribute, value);
            logger.log(Level.DEBUG, "Set attribute {0} = {1} from path {2}", attribute.getName(), value, jsonPath);
        }
    }

    /**
     * Navigate JSON using dot notation path (e.g., "object/BatV" or "deviceInfo/devEui")
     */
    private JsonNode getJsonValueByPath(JsonNode root, String path) {
        JsonNode current = root;
        String[] segments = path.split("/");
        
        for (String segment : segments) {
            if (segment.matches("\\d+")) {
                // Array index
                int index = Integer.parseInt(segment);
                if (current.isArray() && index < current.size()) {
                    current = current.get(index);
                } else {
                    return null;
                }
            } else {
                // Object property
                current = current.path(segment);
                if (current.isMissingNode()) {
                    return null;
                }
            }
        }
        
        return current;
    }

    /**
     * Convert JSON value to appropriate EMF type
     */
    private Object convertJsonValue(JsonNode valueNode, EDataType dataType, EAnnotation mappingAnnotation) {
        try {
            String typeName = dataType.getInstanceClassName();
            
            // Check if mapping annotation specifies type override
            String typeOverride = mappingAnnotation.getDetails().get("type");
            if (typeOverride != null) {
                typeName = typeOverride;
            }

            // Convert based on target type
			return switch (typeName) {
			case "java.lang.String" -> valueNode.asText();
			case "double", "java.lang.Double" -> valueNode.asDouble();
			case "float", "java.lang.Float" -> (float) valueNode.asDouble();
			case "int", "java.lang.Integer" -> valueNode.asInt();
			case "long", "java.lang.Long" -> valueNode.asLong();
			case "boolean", "java.lang.Boolean" -> valueNode.asBoolean();
			default -> {
				logger.log(Level.WARNING, "Unsupported data type for conversion: {0}", typeName);
				yield null;
			}
			};
            
        } catch (Exception e) {
            logger.log(Level.WARNING, "Error converting value {0} to type {1}: {2}", 
                valueNode.asText(), dataType.getName(), e.getMessage());
            return null;
        }
    }

    /**
     * Set provider metadata like ID, friendly name, location
     */
    private void setProviderMetadata(Provider provider, String providerId, String deviceName, JsonNode payload) {
        // Set provider ID (this might need to be done differently depending on SensiNact requirements)
        // For now, we'll log it as providers are typically identified by their URI/resource location
        
    	provider.setId(providerId);
    	Admin admin = ProviderFactory.eINSTANCE.createAdmin();
    	provider.setAdmin(admin);
    	admin.setDescription(deviceName);
        
    	String eui = providerId.replace("chirpstack-", "").toUpperCase();
    	Point sensorLocation = chirpstackLocationComponent.getSensorLocation(eui);
    	if(sensorLocation != null) {
    		admin.setLocation(sensorLocation);
    		logger.log(Level.INFO, "Device {0} GEO location: lat={1}, lon={2}, alt={3}", providerId, sensorLocation.coordinates().latitude(), sensorLocation.coordinates().longitude());
    	} else {
    		// Extract location from first gateway if available
            JsonNode rxInfo = payload.path("rxInfo");
            if (rxInfo.isArray() && rxInfo.size() > 0) {
                JsonNode location = rxInfo.get(0).path("location");
                double latitude = location.path("latitude").asDouble();
                double longitude = location.path("longitude").asDouble();
                double altitude = location.path("altitude").asDouble();
                if (latitude != 0.0 || longitude != 0.0) {
                	admin.setLocation(new Point(longitude, latitude));
                    logger.log(Level.DEBUG, "Device {0} gateway location: lat={1}, lon={2}, alt={3}", 
                        providerId, latitude, longitude, altitude);
                    // Location setting would depend on your specific model structure
                    // You might need to add location attributes to your ECore model
                }
            }
    	}
    	
        
        logger.log(Level.DEBUG, "Provider {0} created for device {1}", providerId, deviceName);
    }
}