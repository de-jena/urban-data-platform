/*
 * Copyright (c) 2012 - 2026 Data In Motion and others.
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
package de.jena.udp.atlas.ilsa;

import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.lang.System.Logger;
import java.lang.System.Logger.Level;
import java.nio.charset.StandardCharsets;
import java.util.Dictionary;
import java.util.HashMap;
import java.util.Hashtable;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicLong;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import org.eclipse.emf.common.util.EMap;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.ETypedElement;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.fennec.emf.osgi.ResourceSetFactory;
import org.eclipse.fennec.emf.osgi.metadata.MetadataWhiteboard;
import org.eclipse.sensinact.core.push.DataUpdate;
import org.eclipse.sensinact.core.push.dto.GenericDto;
import org.eclipse.sensinact.gateway.geojson.Point;
import org.eclipse.sensinact.gateway.southbound.mqtt.api.IMqttMessage;
import org.eclipse.sensinact.gateway.southbound.mqtt.api.IMqttMessageListener;
import org.eclipse.sensinact.model.core.provider.MetadataValue;
import org.eclipse.sensinact.model.core.provider.ProviderFactory;
import org.eclipse.sensinact.model.core.provider.ResourceValueMetadata;
import org.eclipse.sensinact.model.core.provider.Service;
import org.osgi.framework.BundleContext;
import org.osgi.framework.ServiceRegistration;
import org.osgi.service.component.annotations.Activate;
import org.osgi.service.component.annotations.Component;
import org.osgi.service.component.annotations.Deactivate;
import org.osgi.service.component.annotations.Reference;

import de.jena.ilsa.sensinact.model.ilsa.Ilsa;
import de.jena.ilsa.sensinact.model.ilsa.IlsaPackage;
import de.jena.udp.model.geojson.GeoJSON;
import de.jena.udp.model.geojson.GeojsonPackage;
import de.jena.udp.model.trafficos.common.TOSCommonPackage;
import de.jena.udp.model.trafficos.trafficlight.TLConfiguration;
import de.jena.udp.model.trafficos.trafficlight.TLSignal;
import de.jena.udp.model.trafficos.trafficlight.TLSignalState;
import de.jena.udp.model.trafficos.trafficlight.TOSTrafficLightPackage;

/**
 * Listens on {@code 5g/ilsa/#} of the runtime's sensiNact MQTT client:
 * {@code .../<intersection>/config/retained} carries a TLConfiguration (JSON), {@code .../thermal}
 * a temperature and every other topic a TLSignalState (JSON).
 */
@Component(service = {}, immediate = true)
public class IlsaListener implements IMqttMessageListener {

	private static final Logger logger = System.getLogger(IlsaListener.class.getName());

	static final String TOPIC = "5g/ilsa/";
	static final Pattern SIGNAL_TOPIC = Pattern.compile(TOPIC + "(\\w+)/(\\w+)/([A-Za-z0-9-]+)(/([0-9]))*");
	/** The signal state timestamps look like {@code 2026-01-06T14:48:15.288ZCET}. */
	static final String DATE_FORMAT = "yyyy-MM-dd'T'HH:mm:ss.SSS'Z'zzz";

	@Reference
	private DataUpdate sensiNact;

	@Reference
	private ResourceSetFactory resourceSetFactory;

	@Reference
	private IlsaTransformation transformation;

	// the payload models: the codec resolves the eClass of nested objects through the metadata
	// service, which only knows packages registered with it
	@Reference
	private MetadataWhiteboard metadata;
	@Reference
	private TOSTrafficLightPackage trafficLightPackage;
	@Reference
	private TOSCommonPackage commonPackage;
	@Reference
	private GeojsonPackage geojsonPackage;

	private ServiceRegistration<IMqttMessageListener> registration;
	private ExecutorService workers;
	private final AtomicLong sequence = new AtomicLong();

	@Activate
	void activate(BundleContext context) {
		payloadPackages().forEach(metadata::registerPackage);
		workers = Executors.newFixedThreadPool(4, runnable -> {
			Thread thread = new Thread(runnable, "udp-ilsa");
			thread.setDaemon(true);
			return thread;
		});
		Dictionary<String, Object> properties = new Hashtable<>();
		properties.put(MQTT_TOPICS_FILTERS, new String[] { TOPIC + "#" });
		properties.put("name", "udp-ilsa");
		registration = context.registerService(IMqttMessageListener.class, this, properties);
		logger.log(Level.INFO, "ILSA adapter listening on {0}#", TOPIC);
	}

	@Deactivate
	void deactivate() {
		registration.unregister();
		payloadPackages().forEach(metadata::unregisterPackage);
		workers.shutdown();
		try {
			workers.awaitTermination(30, TimeUnit.SECONDS);
		} catch (InterruptedException e) {
			Thread.currentThread().interrupt();
		}
	}

	@Override
	public void onMqttMessage(String handlerId, String topic, IMqttMessage message) {
		byte[] payload = message.getPayload();
		workers.submit(() -> {
			try {
				handle(topic, payload);
			} catch (Exception e) {
				logger.log(Level.ERROR, "Error processing message on topic " + topic, e);
			}
		});
	}

	void handle(String topic, byte[] payload) throws IOException {
		if (topic.endsWith("config/retained")) {
			updateConfig(payload);
			return;
		}
		if (topic.endsWith("/thermal")) {
			String[] segments = topic.split("/");
			updateThermal(segments[segments.length - 2], payload);
			return;
		}
		Matcher matcher = SIGNAL_TOPIC.matcher(topic);
		if (matcher.find()) {
			updateSignal(matcher.group(1), payload);
		} else {
			logger.log(Level.WARNING, "unrecognized topic {0}", topic);
		}
	}

	private void updateThermal(String intersectionId, byte[] payload) {
		GenericDto dto = new GenericDto();
		dto.model = "Ilsa";
		dto.modelPackageUri = IlsaPackage.eNS_URI;
		dto.provider = intersectionId;
		dto.service = "thermal";
		dto.resource = "temperature";
		dto.value = Double.valueOf(new String(payload, StandardCharsets.UTF_8).trim());
		dto.type = Double.class;
		push(dto, "thermal of " + intersectionId);
	}

	private void updateSignal(String intersectionId, byte[] payload) throws IOException {
		TLSignalState signalState = decode(payload, trafficLightPackage.getTLSignalState(),
				Map.of("codec.dateFormat", DATE_FORMAT));
		String serviceId = signalState.getId().replace("/", "_");
		push(new TrafficLightDto(intersectionId, serviceId, signalState), "signal " + serviceId + " of " + intersectionId);
	}

	private void updateConfig(byte[] payload) throws IOException {
		TLConfiguration configuration = decode(payload, trafficLightPackage.getTLConfiguration(), Map.of());
		Ilsa ilsa = transformation.transform(configuration);
		ilsa.setId(configuration.getIntersectionId());
		ilsa.getAdmin().setLocation(location(configuration));
		List<TLSignal> signals = configuration.getSubcircles().stream()
				.flatMap(subcircle -> subcircle.getSerialPorts().stream())
				.flatMap(port -> port.getModules().stream())
				.flatMap(module -> module.getSignals().stream()).toList();
		signals.forEach(signal -> describeSignal(ilsa.getServices(), signal));
		push(ilsa, "configuration of " + configuration.getIntersectionId());
	}

	@SuppressWarnings("unchecked")
	private <T extends EObject> T decode(byte[] payload, EClass rootType, Map<String, Object> options) throws IOException {
		ResourceSet resourceSet = resourceSetFactory.createResourceSet();
		payloadPackages().forEach(ePackage -> resourceSet.getPackageRegistry().put(ePackage.getNsURI(), ePackage));
		Resource resource = resourceSet.createResource(URI.createURI("ilsa/" + sequence.incrementAndGet() + ".json"));
		Map<String, Object> loadOptions = new HashMap<>(options);
		loadOptions.put("codec.rootType", rootType);
		loadOptions.put("codec.typeKey", "eClass"); // the payloads type nested objects the EMF JSON way
		resource.load(new ByteArrayInputStream(payload), loadOptions);
		if (resource.getContents().isEmpty()) {
			throw new IOException("payload contained no " + rootType.getName()
					+ (resource.getErrors().isEmpty() ? "" : ": " + resource.getErrors().get(0).getMessage()));
		}
		return (T) resource.getContents().get(0);
	}

	private List<EPackage> payloadPackages() {
		return List.of(trafficLightPackage, commonPackage, geojsonPackage);
	}

	private static void describeSignal(EMap<String, Service> services, TLSignal signal) {
		Service service = services.get(signal.getId().replace("/", "_"));
		if (service == null) {
			return;
		}
		ResourceValueMetadata metadata = ProviderFactory.eINSTANCE.createResourceValueMetadata();
		metadata.getExtra().put("type", metadataValue(signal.getSignalType().getName()));
		metadata.getExtra().put("signalGroup", metadataValue(signal.getSignalGroup().getId()));
		EMap<ETypedElement, ResourceValueMetadata> serviceMetadata = service.getMetadata();
		serviceMetadata.put(IlsaPackage.Literals.SIGNAL__COLOR, metadata);
	}

	private static MetadataValue metadataValue(Object value) {
		MetadataValue metadataValue = ProviderFactory.eINSTANCE.createMetadataValue();
		metadataValue.setValue(value);
		return metadataValue;
	}

	private static Point location(TLConfiguration configuration) {
		GeoJSON geoJson = configuration.getGeoJson();
		if (geoJson == null || geoJson.getBbox() == null || geoJson.getBbox().length < 2) {
			return null;
		}
		return new Point(geoJson.getBbox()[0], geoJson.getBbox()[1]);
	}

	private void push(Object update, String what) {
		sensiNact.pushUpdate(update)
				.onFailure(e -> logger.log(Level.ERROR, "Error while pushing " + what + " to sensiNact", e));
	}
}
