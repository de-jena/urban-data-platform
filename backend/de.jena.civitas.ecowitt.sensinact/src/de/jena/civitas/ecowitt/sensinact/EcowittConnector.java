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

package de.jena.civitas.ecowitt.sensinact;

import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.lang.System.Logger;
import java.lang.System.Logger.Level;
import java.util.TimeZone;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.sensinact.core.push.DataUpdate;
import org.eclipse.sensinact.gateway.geojson.Point;
import org.eclipse.sensinact.gateway.geojson.utils.GeoJsonUtils;
import org.gecko.emf.json.annotation.RequireEMFJson;
import org.gecko.emf.osgi.constants.EMFNamespaces;
import org.gecko.osgi.messaging.Message;
import org.gecko.osgi.messaging.MessagingService;
import org.osgi.annotation.bundle.Requirement;
import org.osgi.service.component.ComponentServiceObjects;
import org.osgi.service.component.annotations.Activate;
import org.osgi.service.component.annotations.Component;
import org.osgi.service.component.annotations.Deactivate;
import org.osgi.service.component.annotations.Reference;
import org.osgi.service.component.annotations.ReferenceScope;
import org.osgi.util.pushstream.PushEvent;
import org.osgi.util.pushstream.PushEvent.EventType;
import org.osgi.util.pushstream.PushStream;

@RequireEMFJson
@Requirement(namespace = "osgi.identity", filter = "(osgi.identity=de.jena.ilsa.sensinact.mmt)")
@Component(name = "TrafficLightComponent")
public class EcowittConnector {

	private static final Logger logger = System.getLogger(EcowittConnector.class.getName());

	private static final String TOPIC = "/ecowitt/bielefeld";
	private static final Pattern TOPIC_PATTERN = Pattern.compile(TOPIC + "(\\w+)/(\\w+)/([A-Za-z0-9-]+)/([0-9])");
	private static final URI TEMP_URI = URI.createFileURI("temp.json");
//	private static final Map<String, Object> EMF_CONFIG = Collections.singletonMap(EMFJs.OPTION_DATE_FORMAT,
//			"yyyy-MM-dd'T'HH:mm:ss.SSS'Z'zzz");

	@Reference(target = "(" + EMFNamespaces.EMF_CONFIGURATOR_NAME
			+ "=EMFJson)", scope = ReferenceScope.PROTOTYPE_REQUIRED)
	private ComponentServiceObjects<ResourceSet> serviceObjects;

	@Reference
	private DataUpdate sensiNact;

	@Reference(target = "(id=read)")
	private MessagingService messaging;

	private PushStream<Message> subscription;

	@Activate
	public void activate() {
		try {
			subscription = messaging.subscribe(TOPIC + "#");
			subscription.forEachEvent(this::handle);
		} catch (Exception e) {
			logger.log(Level.ERROR, "Error subscribing mqtt {0}.\n{1}", TOPIC, e);
		}
		logger.log(Level.INFO, "Sensinact Traffic Light started.");

		logger.log(Level.INFO, "+++ default TimeZone " + TimeZone.getDefault());

	}

	@Deactivate
	private void deactivate() {
		subscription.close();
	}

	private long handle(PushEvent<? extends Message> event) {
		EventType type = event.getType();
		switch (type) {
		case CLOSE:
			logger.log(Level.INFO, "PushStream closed.");
			break;
		case DATA:
			onMessage(event.getData());
			break;
		case ERROR:
			event.getFailure().printStackTrace();
			break;
		default:
			break;
		}
		return 0;
	}

	private void onMessage(Message message) {
		String topic = message.topic();
		Matcher matcher = TOPIC_PATTERN.matcher(topic);
		if (matcher.find()) {
			updateSignal(message, matcher.group(1));
		}
	}

	private void updateSignal(Message message, String intersectionId) {
		ResourceSet resourceSet = serviceObjects.getService();
		Resource resource = resourceSet.createResource(TEMP_URI);
		try (ByteArrayInputStream bas = new ByteArrayInputStream(message.payload().array())) {

			logger.log(Level.INFO, "Getting data from " + TOPIC + ": " + new String(message.payload().array()));
//			resource.load(bas, EMF_CONFIG);
//			EObject xxx = resource.getContents().get(0);
//			Promise<?> promise = sensiNact.pushUpdate(xxx);
//			promise.onFailure(e -> logger.log(Level.ERROR, "Error while pushing to sensinact.", e));
		} catch (IOException e) {
			logger.log(Level.ERROR, "Error while parsing json.", e);
		} finally {
			serviceObjects.ungetService(resourceSet);
		}
	}

	private Point getLocation() {
		return GeoJsonUtils.point(8.531689, 51.952503);
	}

}
