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
package de.jena.udp.reference.area.sensinact.rules;

import java.lang.System.Logger;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.lang.System.Logger.Level;

import org.eclipse.sensinact.core.notification.ResourceDataNotification;
import org.eclipse.sensinact.gateway.geojson.GeoJsonObject;
import org.eclipse.sensinact.gateway.geojson.Point;
import org.osgi.service.component.annotations.Component;
import org.osgi.service.component.annotations.ConfigurationPolicy;
import org.osgi.service.metatype.annotations.AttributeDefinition;
import org.osgi.service.metatype.annotations.Designate;
import org.osgi.service.metatype.annotations.ObjectClassDefinition;
import org.osgi.service.typedevent.TypedEventHandler;

/**
 * 
 * @author ilenia
 * @since Nov 4, 2025
 */
@Component(name = "LocationNotification", service = {TypedEventHandler.class, LocationNotification.class}, 
configurationPid = "LocationNotification", configurationPolicy = ConfigurationPolicy.REQUIRE)
@Designate(ocd = de.jena.udp.reference.area.sensinact.rules.LocationNotification.LocationNotificationConfig.class)
public class LocationNotification implements TypedEventHandler<ResourceDataNotification> {

	@ObjectClassDefinition(name = "Location Notification Configuration")
	public @interface LocationNotificationConfig {		
		
		@AttributeDefinition(description =  "An identifier for the service to be used in target filter")
		String identifier();
		
		@AttributeDefinition(description =  "The event topics the handler is listening to")
		String[] event_topics();
	}
	
	private static final Logger LOGGER = System.getLogger(LocationNotification.class.getName());
	private Map<String, GeoJsonObject> providerLocationMap = new ConcurrentHashMap<>();

	
	/* 
	 * (non-Javadoc)
	 * @see org.osgi.service.typedevent.TypedEventHandler#notify(java.lang.String, java.lang.Object)
	 */
	@Override
	public void notify(String topic, ResourceDataNotification event) {
		if(!topic.endsWith("admin/location")) return; 
		providerLocationMap.put(event.provider(), (GeoJsonObject) event.newValue());	
		if(event.newValue() instanceof Point point) {
			LOGGER.log(Level.INFO, "Set location to [{0},{1}] for {2}", 
					point.coordinates().latitude(), point.coordinates().longitude(), topic);
			
		}
		
	}
	
	public Map<String, GeoJsonObject> getProviderLocationMap() {
		return Map.copyOf(providerLocationMap);
	}

}
