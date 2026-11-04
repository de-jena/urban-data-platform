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
package de.jena.udp.atlas.ibis;

import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.lang.System.Logger;
import java.lang.System.Logger.Level;
import java.nio.ByteBuffer;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicLong;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.fennec.codec.value.CodecValueReader;
import org.eclipse.fennec.emf.osgi.ResourceSetFactory;
import org.eclipse.fennec.emf.osgi.metadata.MetadataWhiteboard;
import org.eclipse.sensinact.core.push.DataUpdate;
import org.eclipse.sensinact.gateway.geojson.Point;
import org.eclipse.sensinact.model.core.provider.Service;
import org.gecko.osgi.messaging.Message;
import org.gecko.osgi.messaging.MessagingService;
import org.osgi.service.component.annotations.Activate;
import org.osgi.service.component.annotations.Component;
import org.osgi.service.component.annotations.Deactivate;
import org.osgi.service.component.annotations.Reference;
import org.osgi.util.pushstream.PushEvent;
import org.osgi.util.pushstream.PushStream;

import de.jena.model.ibis.common.IbisCommonPackage;
import de.jena.model.ibis.customerinformationservice.IbisCustomerInformationServicePackage;
import de.jena.model.ibis.enumerations.IbisEnumerationsPackage;
import de.jena.model.ibis.gnsslocationservice.IbisGNSSLocationServicePackage;
import de.jena.model.ibis.ticketvalidationservice.IbisTicketValidationServicePackage;
import de.jena.model.sensinact.ibis.GNSSLocationData;
import de.jena.model.sensinact.ibis.IbisResource;
import de.jena.model.sensinact.ibis.IbisSensinactPackage;

/**
 * Subscribes to {@code 5g/ibis/#} on the {@code read} gecko messaging service. A topic is
 * {@code 5g/ibis/<deviceType>/<deviceId>/<service>}, the payload one IBIS-IP service response as
 * EMF JSON keyed by the XML element names, with an {@code eClass} at the root.
 */
@Component(immediate = true)
public class IbisListener {

	private static final Logger logger = System.getLogger(IbisListener.class.getName());

	static final String TOPIC = "5g/ibis/";

	@Reference
	private DataUpdate sensiNact;

	@Reference(target = "(id=read)")
	private MessagingService messaging;

	@Reference
	private ResourceSetFactory resourceSetFactory;

	@Reference
	private IbisTransformation transformation;

	// the payload models: the codec resolves the root eClass through the metadata service, which
	// only knows packages registered with it
	@Reference
	private MetadataWhiteboard metadata;
	@Reference
	private IbisCommonPackage commonPackage;
	@Reference
	private IbisEnumerationsPackage enumerationsPackage;
	@Reference
	private IbisCustomerInformationServicePackage customerInformationPackage;
	@Reference
	private IbisGNSSLocationServicePackage gnssLocationPackage;
	@Reference
	private IbisTicketValidationServicePackage ticketValidationPackage;

	private final IbisDateReader dateReader = new IbisDateReader();
	private PushStream<Message> subscription;
	private ExecutorService workers;
	private final AtomicLong sequence = new AtomicLong();

	@Activate
	void activate() throws Exception {
		payloadPackages().forEach(metadata::registerPackage);
		workers = Executors.newFixedThreadPool(4, runnable -> {
			Thread thread = new Thread(runnable, "udp-ibis");
			thread.setDaemon(true);
			return thread;
		});
		subscription = messaging.subscribe(TOPIC + "#");
		subscription.forEachEvent(this::onEvent);
		logger.log(Level.INFO, "IBIS adapter listening on {0}#", TOPIC);
	}

	@Deactivate
	void deactivate() {
		subscription.close();
		payloadPackages().forEach(metadata::unregisterPackage);
		workers.shutdown();
		try {
			workers.awaitTermination(30, TimeUnit.SECONDS);
		} catch (InterruptedException e) {
			Thread.currentThread().interrupt();
		}
	}

	private long onEvent(PushEvent<? extends Message> event) {
		switch (event.getType()) {
		case DATA -> {
			Message message = event.getData();
			byte[] payload = bytes(message.payload());
			workers.submit(() -> {
				try {
					handle(message.topic(), payload);
				} catch (Exception e) {
					logger.log(Level.ERROR, "Error processing message on topic " + message.topic(), e);
				}
			});
		}
		case ERROR -> logger.log(Level.ERROR, "IBIS subscription failed", event.getFailure());
		case CLOSE -> logger.log(Level.INFO, "IBIS subscription closed");
		}
		return 0;
	}

	static byte[] bytes(ByteBuffer payload) {
		byte[] bytes = new byte[payload.remaining()];
		payload.duplicate().get(bytes);
		return bytes;
	}

	void handle(String topic, byte[] payload) throws IOException {
		String[] segments = topic.substring(TOPIC.length()).split("/");
		if (!topic.startsWith(TOPIC) || segments.length < 2) {
			logger.log(Level.WARNING, "topic {0} carries no device type and id", topic);
			return;
		}
		String deviceId = segments[1];
		EObject response = decode(payload);
		Optional<Service> service = transformation.transform(response);
		if (service.isEmpty()) {
			logger.log(Level.DEBUG, "no mapping for {0} on {1}", response.eClass().getName(), topic);
			return;
		}
		IbisDto dto = new IbisDto(deviceId, serviceReference(service.get()), resourceOf(service.get()));
		push(dto, dto.service.getName() + " of " + deviceId);
		if (dto.data instanceof GNSSLocationData gnss) {
			Point location = new Point(gnss.getLongitudeDegree(), gnss.getLatitudeDegree());
			push(new IbisAdminDto(deviceId, location, gnss.getTimestamp()), "location of " + deviceId);
		}
	}

	EObject decode(byte[] payload) throws IOException {
		ResourceSet resourceSet = resourceSetFactory.createResourceSet();
		payloadPackages().forEach(ePackage -> resourceSet.getPackageRegistry().put(ePackage.getNsURI(), ePackage));
		Resource resource = resourceSet.createResource(URI.createURI("ibis/" + sequence.incrementAndGet() + ".json"));
		resource.load(new ByteArrayInputStream(payload), loadOptions(commonPackage, dateReader));
		if (resource.getContents().isEmpty()) {
			throw new IOException("payload contained no IBIS response"
					+ (resource.getErrors().isEmpty() ? "" : ": " + resource.getErrors().get(0).getMessage()));
		}
		EObject response = resource.getContents().get(0);
		if (response.eClass() == commonPackage.getGeneralResponse()) {
			throw new IOException("payload carries no eClass");
		}
		return response;
	}

	/**
	 * The root type is the {@code eClass} of the payload. The hint only keeps the codec from probing
	 * the discriminator path of an unrelated model such as ChirpStack (eclipse-fennec/emf.codec#285);
	 * in HINT mode the payload's own type wins and only a payload without {@code eClass} becomes a
	 * GeneralResponse.
	 */
	static Map<String, Object> loadOptions(IbisCommonPackage commonPackage, CodecValueReader<?, ?> dateReader) {
		Map<EAttribute, CodecValueReader<?, ?>> dateReaders = Map.of(
				commonPackage.getIBISIPDateTime_Value(), dateReader,
				commonPackage.getIBISIPDate_Value(), dateReader);
		return Map.of(
				"codec.rootType", commonPackage.getGeneralResponse(),
				"codec.typeHintMode", "HINT",
				"codec.typeKey", "eClass",
				"codec.useNamesFromExtendedMetadata", true, // keys are the IBIS-IP XML element names
				"codec.featureValueReaderInstances", dateReaders);
	}

	private List<EPackage> payloadPackages() {
		return List.of(commonPackage, enumerationsPackage, customerInformationPackage, gnssLocationPackage,
				ticketValidationPackage);
	}

	/** The IbisDevice reference whose type the service has, e.g. {@code gnssLocation} for a GNSSLocation. */
	static EReference serviceReference(Service service) {
		return IbisSensinactPackage.Literals.IBIS_DEVICE.getEAllContainments().stream()
				.filter(reference -> reference.getEReferenceType().isSuperTypeOf(service.eClass()))
				.findFirst()
				.orElseThrow(() -> new IllegalStateException("IbisDevice has no service of type " + service.eClass().getName()));
	}

	static IbisResource resourceOf(Service service) {
		return (IbisResource) service.eGet(service.eClass().getEStructuralFeature("resource"));
	}

	private void push(Object update, String what) {
		sensiNact.pushUpdate(update)
				.onFailure(e -> logger.log(Level.ERROR, "Error while pushing " + what + " to sensiNact", e));
	}
}
