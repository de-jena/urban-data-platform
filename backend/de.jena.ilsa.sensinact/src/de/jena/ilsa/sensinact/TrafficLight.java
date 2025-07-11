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

package de.jena.ilsa.sensinact;

import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.lang.System.Logger;
import java.lang.System.Logger.Level;
import java.nio.CharBuffer;
import java.nio.charset.StandardCharsets;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import org.eclipse.emf.common.util.EMap;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.ETypedElement;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.fennec.qvt.osgi.api.ModelTransformator;
import org.eclipse.sensinact.core.push.DataUpdate;
import org.eclipse.sensinact.core.push.dto.GenericDto;
import org.eclipse.sensinact.gateway.geojson.Coordinates;
import org.eclipse.sensinact.gateway.geojson.Point;
import org.eclipse.sensinact.model.core.provider.Admin;
import org.eclipse.sensinact.model.core.provider.MetadataValue;
import org.eclipse.sensinact.model.core.provider.ProviderFactory;
import org.eclipse.sensinact.model.core.provider.ResourceValueMetadata;
import org.eclipse.sensinact.model.core.provider.Service;
import org.gecko.codec.constants.CodecResourceOptions;
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
import org.osgi.util.promise.Promise;
import org.osgi.util.pushstream.PushEvent;
import org.osgi.util.pushstream.PushEvent.EventType;
import org.osgi.util.pushstream.PushStream;

import de.jena.ilsa.sensinact.model.ilsa.Ilsa;
import de.jena.ilsa.sensinact.model.ilsa.IlsaPackage;
import de.jena.udp.model.geojson.GeoJSON;
import de.jena.udp.model.trafficos.trafficlight.TLConfiguration;
import de.jena.udp.model.trafficos.trafficlight.TLSignal;
import de.jena.udp.model.trafficos.trafficlight.TLSignalState;
import de.jena.udp.model.trafficos.trafficlight.TOSTrafficLightPackage;

@RequireEMFJson
@Requirement(namespace = "osgi.identity", filter = "(osgi.identity=de.jena.ilsa.sensinact.mmt)")
@Component(name = "TrafficLightComponent")
public class TrafficLight {

	private static final Logger logger = System.getLogger(TrafficLight.class.getName());

	private static final String TOPIC = "5g/ilsa/";
	private static final Pattern TOPIC_PATTERN = Pattern.compile(TOPIC + "(\\w+)/(\\w+)/([A-Za-z0-9-]+)/([0-9])");
	private static final URI TEMP_URI = URI.createFileURI("temp.json");

	@Reference(target = "(" + EMFNamespaces.EMF_CONFIGURATOR_NAME
			+ "=EMFJson)", scope = ReferenceScope.PROTOTYPE_REQUIRED)
	private ComponentServiceObjects<ResourceSet> serviceObjects;

	@Reference
	private DataUpdate sensiNact;

	@Reference(target = "(transformator.id=TLSTrafficLightToIlsa)")
	private ModelTransformator traf;

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
		} else if (topic.endsWith("config/retained")) {
			updateConfig(message);
		} else if (topic.endsWith("thermal")) {
			updateThermal(message, topic.split("/")[3]);
		}
	}

	private void updateThermal(Message message, String intersectionId) {
		CharBuffer decode = StandardCharsets.UTF_8.decode(message.payload());
		GenericDto dto = new GenericDto();
		dto.model = "Ilsa";
		dto.modelPackageUri = IlsaPackage.eNS_URI;
		dto.provider = intersectionId;
		dto.service = "thermal";
		dto.resource = "temperature";
		dto.value = Double.valueOf(decode.toString());
		dto.type = Double.class;
		logger.log(Level.DEBUG, "push thermal {0} ", dto.value);
		Promise<?> promise = sensiNact.pushUpdate(dto);
		promise.onFailure(e -> logger.log(Level.ERROR, "Error while pushing thermal to sensinact.", e));
	}

	private void updateSignal(Message message, String intersectionId) {
		ResourceSet resourceSet = serviceObjects.getService();
		Resource resource = resourceSet.createResource(TEMP_URI);
		try (ByteArrayInputStream bas = new ByteArrayInputStream(message.payload().array())) {
			resource.load(bas, Collections.emptyMap());
			TLSignalState signalState = (TLSignalState) resource.getContents().get(0);
			String serviceId = signalState.getId().replace("/", "_");
			TrafficLightDto dto = new TrafficLightDto(intersectionId, serviceId, signalState.getState());
			dto.timestamp = signalState.getTimestamp().getTime();
			logger.log(Level.DEBUG, "push {0} {1} {2}", intersectionId, serviceId, signalState.getState());
			Promise<?> promise = sensiNact.pushUpdate(dto);
			promise.onFailure(e -> logger.log(Level.ERROR, "Error while pushing signal to sensinact.", e));
		} catch (IOException e) {
			logger.log(Level.ERROR, "Error while parsing json.", e);
		} finally {
			serviceObjects.ungetService(resourceSet);
		}
	}

	private MetadataValue createMetadata(Object value) {
		MetadataValue mv = ProviderFactory.eINSTANCE.createMetadataValue();
		mv.setValue(value);
		return mv;
	}

	private void updateConfig(Message message) {
		Map<String, Object> options = new HashMap<>();
		options.put(CodecResourceOptions.CODEC_ROOT_OBJECT, TOSTrafficLightPackage.eINSTANCE.getTLConfiguration());
		ResourceSet resourceSet = serviceObjects.getService();
		Resource resource = resourceSet.createResource(TEMP_URI);
		try {
			resource.load(new ByteArrayInputStream(message.payload().array()), options);
			TLConfiguration configuration = (TLConfiguration) resource.getContents().get(0);

			Ilsa ilsa = traf.doTransformation(configuration);
			ilsa.setId(configuration.getIntersectionId());
			Admin admin = ilsa.getAdmin();
			Point location = getLocation(configuration);
			admin.setLocation(location);

			EMap<String, Service> services = ilsa.getServices();
			List<TLSignal> signals = configuration.getSubcircles().stream() //
					.flatMap(sc -> sc.getSerialPorts().stream())//
					.flatMap(sp -> sp.getModules().stream()) //
					.flatMap(m -> m.getSignals().stream()).toList();
			signals.forEach(s -> initSignal(services, s));

			Promise<?> promise = sensiNact.pushUpdate(ilsa);
			promise.onFailure(e -> logger.log(Level.ERROR, "Error while pushing configuration to sensinact.", e));
		} catch (IOException e) {
			logger.log(Level.ERROR, "Error while parsing json.", e);
		} finally {
			serviceObjects.ungetService(resourceSet);
		}
	}

	private void initSignal(EMap<String, Service> services, TLSignal signalState) {
		String serviceId = signalState.getId().replace("/", "_");
		Service signal = services.get(serviceId);
		EMap<ETypedElement, ResourceValueMetadata> metadata = signal.getMetadata();
		ResourceValueMetadata md = ProviderFactory.eINSTANCE.createResourceValueMetadata();
		md.getExtra().put("type", createMetadata(signalState.getSignalType()));
		md.getExtra().put("signalGroup", createMetadata(signalState.getSignalGroup().getId()));
		metadata.put(IlsaPackage.eINSTANCE.getSignal_Color(), md);
	}

	private Point getLocation(TLConfiguration configuration) {
		GeoJSON geoJson = configuration.getGeoJson();
		if (geoJson == null || geoJson.getBbox() == null) {
			return null;
		}
		Point location = new Point();
		location.coordinates = new Coordinates();
		location.coordinates.longitude = geoJson.getBbox()[0];
		location.coordinates.latitude = geoJson.getBbox()[1];
		return location;
	}

}
