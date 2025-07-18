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

package de.jena.ibis.sensinact;

import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.lang.System.Logger;
import java.lang.System.Logger.Level;
import java.util.Collections;
import java.util.Map;
import java.util.Optional;
import java.util.UUID;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.fennec.qvt.osgi.api.ModelTransformator;
import org.eclipse.sensinact.core.push.DataUpdate;
import org.eclipse.sensinact.gateway.geojson.utils.GeoJsonUtils;
import org.eclipse.sensinact.model.core.provider.Service;
import org.gecko.emf.json.annotation.RequireEMFJson;
import org.gecko.emf.json.constants.EMFJs;
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

import de.jena.model.sensinact.ibis.CustomerInfoAll;
import de.jena.model.sensinact.ibis.CustomerInfoCurrentAnnouncement;
import de.jena.model.sensinact.ibis.CustomerInfoCurrentConnection;
import de.jena.model.sensinact.ibis.CustomerInfoCurrentDisplayContent;
import de.jena.model.sensinact.ibis.CustomerInfoCurrentStopIndex;
import de.jena.model.sensinact.ibis.CustomerInfoCurrentStopPoint;
import de.jena.model.sensinact.ibis.CustomerInfoTrip;
import de.jena.model.sensinact.ibis.CustomerInfoVehicle;
import de.jena.model.sensinact.ibis.GNSSLocation;
import de.jena.model.sensinact.ibis.GNSSLocationData;
import de.jena.model.sensinact.ibis.IbisResource;
import de.jena.model.sensinact.ibis.IbisSensinactPackage;

/**
 * This sensiNact connector for ibis data send by the bus, tram, etc via MQTT
 * 
 */
@RequireEMFJson
@Requirement(namespace = "osgi.identity", filter = "(osgi.identity=de.jena.ibis.sensinact.mmt)")
@Component(name = "IbisConnector")
public class IbisConnector {

	private static final Logger LOGGER = System.getLogger(IbisConnector.class.getName());
	private static final String TOPIC = "5g/ibis/";
	private static final Map<String, Object> EMF_CONFIG = Collections.singletonMap(EMFJs.OPTION_DATE_FORMAT,
			"yyyy-MM-dd'T'HH:mm:ss.SSS'Z'zzz");

	@Reference(target = "(" + EMFNamespaces.EMF_CONFIGURATOR_NAME
			+ "=EMFJson)", scope = ReferenceScope.PROTOTYPE_REQUIRED)
	private ComponentServiceObjects<ResourceSet> serviceObjects;

	@Reference(target = ("(transformator.id=ibisToSensinact)"))
	private ModelTransformator transformator;

	@Reference
	DataUpdate sensiNact;

	@Reference(target = "(id=read)")
	private MessagingService messaging;

	private PushStream<Message> subscription;

	@Activate
	public void activate() {
		try {
			subscription = messaging.subscribe(TOPIC + "#");
			subscription.forEachEvent(this::handle);
		} catch (Exception e) {
			LOGGER.log(Level.ERROR, "Error subscribing mqtt {0}.\n{1}", TOPIC, e);
		}
		LOGGER.log(Level.INFO, "Ibis connector is active!");
	}

	@Deactivate
	private void deactivate() {
		subscription.close();
	}

	public long handle(PushEvent<? extends Message> event) {
		EventType type = event.getType();
		switch (type) {
		case CLOSE:
			LOGGER.log(Level.INFO, "PushStream closed.");
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
		LOGGER.log(Level.DEBUG, "Event arrived for topic {0}", topic);
		String[] topicSplit = topic.replaceFirst(TOPIC, "").split("/");
		if (topicSplit.length < 2) {
			LOGGER.log(Level.WARNING, "Topic \"{0}\" without deviceId and deviceType.", topic);
			return;
		}
//		String deviceType = topicSplit[0];
		String deviceId = topicSplit[1];

		ResourceSet resourceSet = serviceObjects.getService();
		Resource resource = resourceSet.createResource(URI.createFileURI(UUID.randomUUID() + "-ibis.json"));
		try {
			resource.load(new ByteArrayInputStream(message.payload().array()), EMF_CONFIG);
			Optional<IbisDto> oDto = transform(deviceId, resource.getContents().get(0));
			if (oDto.isPresent()) {
				IbisDto dto = oDto.get();
				sensiNact.pushUpdate(dto)
						.onFailure(e -> LOGGER.log(Level.ERROR, "Error while pushing signal to sensinact.", e));
				if (dto.serviceRef == IbisSensinactPackage.Literals.IBIS_DEVICE__GNSS_LOCATION) {
					updateAdmin(deviceId, dto);
				}
			}
		} catch (IOException e) {
			LOGGER.log(Level.ERROR, "Error while parsing json.", e);
		} finally {
			serviceObjects.ungetService(resourceSet);
		}
	}

	private void updateAdmin(String deviceId, IbisDto dto) {
		GNSSLocationData gnss = (GNSSLocationData) dto.data;
		long timestamp = gnss.getDate().getEpochSecond() + gnss.getTime().getEpochSecond();
		IbisAdminDto adminDto = new IbisAdminDto(deviceId,
				GeoJsonUtils.point(gnss.getLongitudeDegree(), gnss.getLatitudeDegree()), timestamp);
		sensiNact.pushUpdate(adminDto)
				.onFailure(e -> LOGGER.log(Level.ERROR, "Error while pushing signal to sensinact.", e));
	}

	private Optional<IbisDto> transform(String deviceId, EObject eo) {
		Service service = transformator.doTransformation(eo);
		EReference serviceRef = null;
		IbisResource resource = null;
		if (service instanceof CustomerInfoAll ibisService) {
			serviceRef = IbisSensinactPackage.Literals.IBIS_DEVICE__CUSTOMER_INFO_ALL;
			resource = ibisService.getResource();
		}
		if (service instanceof CustomerInfoCurrentAnnouncement ibisService) {
			serviceRef = IbisSensinactPackage.Literals.IBIS_DEVICE__CUSTOMER_INFO_CURRENT_ANNOUNCEMENT;
			resource = ibisService.getResource();
		}
		if (service instanceof CustomerInfoCurrentStopIndex ibisService) {
			serviceRef = IbisSensinactPackage.Literals.IBIS_DEVICE__CUSTOMER_INFO_CURRENT_STOP_INDEX;
			resource = ibisService.getResource();
		}
		if (service instanceof CustomerInfoCurrentStopPoint ibisService) {
			serviceRef = IbisSensinactPackage.Literals.IBIS_DEVICE__CUSTOMER_INFO_CURRENT_STOP_POINT;
			resource = ibisService.getResource();
		}
		if (service instanceof CustomerInfoCurrentConnection ibisService) {
			serviceRef = IbisSensinactPackage.Literals.IBIS_DEVICE__CUSTOMER_INFO_CURRENT_CONNECTION;
			resource = ibisService.getResource();
		}
		if (service instanceof CustomerInfoCurrentDisplayContent ibisService) {
			serviceRef = IbisSensinactPackage.Literals.IBIS_DEVICE__CUSTOMER_INFO_CURRENT_DISPLAY_CONTENT;
			resource = ibisService.getResource();
		}
		if (service instanceof CustomerInfoTrip ibisService) {
			serviceRef = IbisSensinactPackage.Literals.IBIS_DEVICE__CUSTOMER_INFO_TRIP;
			resource = ibisService.getResource();
		}
		if (service instanceof CustomerInfoVehicle ibisService) {
			serviceRef = IbisSensinactPackage.Literals.IBIS_DEVICE__CUSTOMER_INFO_VEHICLE;
			resource = ibisService.getResource();
		}
		if (service instanceof GNSSLocation ibisService) {
			serviceRef = IbisSensinactPackage.Literals.IBIS_DEVICE__GNSS_LOCATION;
			resource = ibisService.getResource();
		}
		return serviceRef != null ? Optional.of(new IbisDto(deviceId, serviceRef, resource)) : Optional.empty();
	}
}
