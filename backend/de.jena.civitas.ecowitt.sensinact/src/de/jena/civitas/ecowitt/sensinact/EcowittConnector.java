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
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.sensinact.core.push.DataUpdate;
import org.eclipse.sensinact.gateway.geojson.Point;
import org.eclipse.sensinact.gateway.geojson.utils.GeoJsonUtils;
import org.gecko.emf.json.annotation.RequireEMFJson;
import org.gecko.emf.osgi.constants.EMFNamespaces;
import org.gecko.osgi.messaging.Message;
import org.gecko.osgi.messaging.MessagingService;
import org.osgi.framework.BundleContext;
import org.osgi.framework.ServiceReference;
import org.osgi.service.component.ComponentContext;
import org.osgi.service.component.ComponentServiceObjects;
import org.osgi.service.component.annotations.Activate;
import org.osgi.service.component.annotations.Component;
import org.osgi.service.component.annotations.ConfigurationPolicy;
import org.osgi.service.component.annotations.Deactivate;
import org.osgi.service.component.annotations.Reference;
import org.osgi.service.component.annotations.ReferenceScope;
import org.osgi.service.metatype.annotations.Designate;
import org.osgi.util.pushstream.PushEvent;
import org.osgi.util.pushstream.PushEvent.EventType;
import org.osgi.util.pushstream.PushStream;

@RequireEMFJson
@Designate(factory = true, ocd = EcowittConfig.class)
@Component(configurationPid = "EcowittConnector", configurationPolicy = ConfigurationPolicy.REQUIRE)
public class EcowittConnector {

	private static final Logger logger = System.getLogger(EcowittConnector.class.getName());

//	private static final URI TEMP_URI = URI.createFileURI("temp.json");
//	private static final Map<String, Object> EMF_CONFIG = Collections.singletonMap(EMFJs.OPTION_DATE_FORMAT,
//			"yyyy-MM-dd'T'HH:mm:ss.SSS'Z'zzz");

	@Reference(target = "(" + EMFNamespaces.EMF_CONFIGURATOR_NAME
			+ "=EMFJson)", scope = ReferenceScope.PROTOTYPE_REQUIRED)
	private ComponentServiceObjects<ResourceSet> serviceObjects;

	@Reference
	private DataUpdate sensiNact;

	private PushStream<Message> subscription;
	private EcowittConfig config;
	private ComponentContext componentContext;
	private ServiceReference<MessagingService> messagingServiceReference;
	private ScheduledExecutorService scheduler;

	@Activate
	public void activate(EcowittConfig config, ComponentContext componentContext) {
		this.config = config;
		this.componentContext = componentContext;
		this.scheduler = Executors.newSingleThreadScheduledExecutor();

		startSubscription();

		// If no service found initially, retry periodically
		if (subscription == null) {
			scheduler.scheduleWithFixedDelay(this::retryStartSubscription, 5, 10, TimeUnit.SECONDS);
		}
	}

	@Deactivate
	private void deactivate() {
		if (scheduler != null) {
			scheduler.shutdownNow();
		}

		if (subscription != null) {
			subscription.close();
			subscription = null;
		}

		if (messagingServiceReference != null) {
			try {
				componentContext.getBundleContext().ungetService(messagingServiceReference);
			} catch (Exception e) {
				logger.log(Level.WARNING, "Error ungetting MessagingService", e);
			}
			messagingServiceReference = null;
		}
	}

	private void retryStartSubscription() {
		if (subscription == null) {
			startSubscription();
			if (subscription != null && scheduler != null) {
				scheduler.shutdown(); // Stop retrying once successful
			}
		}
	}

	private void startSubscription() {
		if (config != null && subscription == null) {
			try {
				MessagingService messaging = getMessagingService();
				if (messaging != null) {
					subscription = messaging.subscribe(config.topic());
					subscription.forEachEvent(this::handle);
					logger.log(Level.INFO,
							"Sensinact Ecowitt Connector started with messaging service ID: {0}, topic: {1}",
							config.messagingServiceId(), config.topic());
				} else {
					logger.log(Level.DEBUG, "MessagingService with ID {0} not yet available, will retry...",
							config.messagingServiceId());
				}
			} catch (Exception e) {
				logger.log(Level.ERROR, "Error subscribing to MQTT topic {0}.\n{1}", config.topic(), e);
			}
		}
	}

	private MessagingService getMessagingService() {
		try {
			BundleContext bundleContext = componentContext.getBundleContext();
			String filter = "(id=" + config.messagingServiceId() + ")";
			ServiceReference<?>[] references = bundleContext.getServiceReferences(MessagingService.class.getName(),
					filter);

			if (references != null && references.length > 0) {
				@SuppressWarnings("unchecked")
				ServiceReference<MessagingService> ref = (ServiceReference<MessagingService>) references[0];
				messagingServiceReference = ref;
				return bundleContext.getService(messagingServiceReference);
			}
		} catch (Exception e) {
			logger.log(Level.ERROR, "Error looking up MessagingService with ID: {0}.\n{1}", config.messagingServiceId(),
					e);
		}
		return null;
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
		ResourceSet resourceSet = serviceObjects.getService();
//		Resource resource = resourceSet.createResource(TEMP_URI);
		try (ByteArrayInputStream bas = new ByteArrayInputStream(message.payload().array())) {

			logger.log(Level.INFO, "Getting data from topic: " + new String(message.payload().array()));
			// resource.load(bas, EMF_CONFIG);
			// EObject xxx = resource.getContents().get(0);
			// Promise<?> promise = sensiNact.pushUpdate(xxx);
			// promise.onFailure(e -> logger.log(Level.ERROR, "Error while pushing to
			// sensinact.", e));
		} catch (IOException e) {
			logger.log(Level.ERROR, "Error while parsing json.", e);
		} finally {
			serviceObjects.ungetService(resourceSet);
		}
	}

	private Point getLocation() {
		return GeoJsonUtils.point(config.longitude(), config.latitude());
	}
}
