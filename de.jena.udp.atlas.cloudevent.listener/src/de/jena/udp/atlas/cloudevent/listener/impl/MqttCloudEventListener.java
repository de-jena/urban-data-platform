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
package de.jena.udp.atlas.cloudevent.listener.impl;

import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.lang.System.Logger;
import java.lang.System.Logger.Level;
import java.nio.ByteBuffer;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.Date;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import java.util.UUID;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;
import java.util.regex.Pattern;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.BinaryResourceImpl;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.fennec.event.atlas.mapping.InstancePusher;
import org.gecko.osgi.messaging.Message;
import org.gecko.osgi.messaging.MessagingService;
import org.osgi.service.component.annotations.Activate;
import org.osgi.service.component.annotations.Component;
import org.osgi.service.component.annotations.ConfigurationPolicy;
import org.osgi.service.component.annotations.Deactivate;
import org.osgi.service.component.annotations.Reference;
import org.osgi.service.component.annotations.ReferenceCardinality;
import org.osgi.service.component.annotations.ReferencePolicy;
import org.osgi.service.metatype.annotations.AttributeDefinition;
import org.osgi.service.metatype.annotations.Designate;
import org.osgi.service.metatype.annotations.ObjectClassDefinition;
import org.osgi.util.pushstream.PushEvent;
import org.osgi.util.pushstream.PushStream;

import de.jena.udp.atlas.cloudevent.listener.PayloadAggregator;
import io.cloudevents.model.ce.CloudEvent;
import io.cloudevents.model.ce.CloudEventsFactory;

/**
 * Reads one or more MQTT topics, deserializes each message into the EClass its configuration
 * names,
 * wraps it in a {@link CloudEvent} that carries the topic as {@code source}, and pushes the
 * envelope through the {@link InstancePusher} - the four steps every envelope-rooted adapter
 * would otherwise write again.
 * <p>
 * One component configuration is one flow: one payload EClass, one CloudEvent type, one
 * window - over as many topics as carry that payload. The two topics a TrafiCam camera
 * configuration arrives on are one flow; the detections, read as another EClass and
 * windowed, are another. A factory configuration {@code MqttCloudEventListener~<name>}
 * creates an instance, and an adapter that reads payloads of several kinds configures one
 * per kind.
 * <p>
 * <b>Windowing.</b> With {@code window.seconds} above zero the instance does not push a
 * message when it arrives. It hands the payload to its {@link PayloadAggregator} and, every
 * {@code window.seconds}, pushes what that aggregator makes of the window - one envelope per
 * {@link PayloadAggregator.Aggregate}, with the source and the time the aggregator reports
 * rather than the single message's. What a window adds up to is domain knowledge, so it
 * lives in the aggregator, which an instance picks with {@code aggregator.target}.
 * <p>
 * An aggregate is another instance than the ones that arrived, so the envelope's
 * {@code dataschema} is read off the EClass of whatever it carries rather than taken from
 * the configuration: {@code payload.eclass.uri} says how to read the wire payload, and a
 * mapping that selects on {@code dataschema} is answered by what the envelope really has.
 * <p>
 * A payload whose format needs load options - the Fennec JSON codec wants the key that types
 * a nested object, and a date format where the dates have one - is read by naming them in
 * {@code payload.load.options}. The root type is never among them: the listener passes the
 * EClass {@code payload.eclass.uri} resolves to.
 * <p>
 * A topic that carries a bare value rather than a serialized object is read by naming
 * {@code payload.feature}: the text is converted to the type of that attribute of the payload
 * EClass and set on a fresh instance of it, and no resource factory is involved. What leaves
 * is an ordinary instance, so the window, the envelope and the mappings see no difference.
 * <p>
 * An instance without a window still offers its payloads to the aggregator it binds, if it
 * binds one: an aggregator that needs to <em>read</em> a flow it does not window - the
 * TrafiCam class names arrive on the configuration topic, not with the detections - sees it
 * that way, and returns {@code false} so the listener pushes it as usual.
 * <p>
 * Configuration properties beyond the metatype, both DS reference targets:
 * {@code messaging.target} selects the gecko messaging service and
 * {@code aggregator.target} the {@link PayloadAggregator}.
 * <p>
 * <b>{@code messaging.target} is required.</b> The reference declares
 * {@code (scope=no-inject)}, which matches nothing on purpose: a flow reads one named broker,
 * and an instance that forgot to say which must not quietly bind whichever messaging service
 * happens to be there. Until the configuration names one - {@code (id=read)} for the broker
 * {@code configs/mqtt.json} registers - the component stays unsatisfied and does not activate.
 * <p>
 * {@code aggregator.target} declares {@code (scope=no-inject)} for the same reason, but the
 * reference is optional: a flow that names no aggregator binds none and pushes every payload
 * as it arrives, rather than binding whichever aggregator is registered and handing it a
 * payload meant for another flow.
 * <p>
 * An example pair of flows, as a configurator JSON - the TrafiCam detections, windowed and
 * aggregated, and the camera configurations, pushed as they arrive:
 *
 * <pre>
 * "MqttCloudEventListener~traficam-detections": {
 *   "name": "traficam-detections",
 *   "messaging.target": "(id=read)",
 *   "topic": ["5g/traficam/#"],
 *   "topic.exclude": ".*&#47;(lifesign|config&#47;retained)$",
 *   "cloud.event.type": "de.jena.traficam.detection",
 *   "payload.eclass.uri": "https://jena.de/models/traficam/1.0#//TrafiCamObject",
 *   "payload.format": "application/octet-stream",
 *   "window.seconds": 2,
 *   "aggregator.target": "(aggregator.id=traficam)"
 * },
 * "MqttCloudEventListener~traficam-config": {
 *   "name": "traficam-config",
 *   "messaging.target": "(id=read)",
 *   "topic": ["5g/config/traficam/#", "5g/traficam/+/config/retained"],
 *   "cloud.event.type": "de.jena.traficam.config",
 *   "payload.eclass.uri": "https://jena.de/models/traficam/1.0#//CamConfig",
 *   "payload.format": "application/octet-stream",
 *   "aggregator.target": "(aggregator.id=traficam)"
 * }
 * </pre>
 *
 * A flow whose payload needs load options - the ILSA signal states, JSON read by the Fennec
 * codec:
 *
 * <pre>
 * "MqttCloudEventListener~ilsa-signal-state": {
 *   "name": "ilsa-signal-state",
 *   "messaging.target": "(id=read)",
 *   "topic": ["5g/ilsa/#"],
 *   "cloud.event.type": "de.jena.ilsa.signal",
 *   "payload.eclass.uri": "http://jena.de/udp/trafficos/trafficlight/1.1.1#//TLSignalState",
 *   "payload.format": "application/json",
 *   "payload.load.options": ["codec.typeKey=eClass", "codec.dateFormat=yyyy-MM-dd'T'HH:mm:ss.SSS'Z'zzz"]
 * }
 * </pre>
 *
 * And a scalar flow - an ILSA thermal topic carrying nothing but the temperature:
 *
 * <pre>
 * "MqttCloudEventListener~ilsa-thermal": {
 *   "name": "ilsa-thermal",
 *   "messaging.target": "(id=read)",
 *   "topic": ["5g/ilsa/+/thermal"],
 *   "cloud.event.type": "de.jena.ilsa.thermal",
 *   "payload.eclass.uri": "https://model.data.jena.de/sensinact/ilsa/1.0#//Thermal",
 *   "payload.feature": "temperature",
 *   "payload.format": "text/plain"
 * }
 * </pre>
 */
@Component(
		name = "MqttCloudEventListener",
		configurationPid = "MqttCloudEventListener",
		configurationPolicy = ConfigurationPolicy.REQUIRE,
		service = MqttCloudEventListener.class,
		immediate = true)
@Designate(ocd = MqttCloudEventListener.Config.class, factory = true)
public class MqttCloudEventListener {

	private static final Logger logger = System.getLogger(MqttCloudEventListener.class.getName());

	/**
	 * The subtypes of {@code payload.format} that mean EMF binary rather than a serialization
	 * EMF has a resource factory for: {@code application/octet-stream}, and the bare
	 * {@code bin} and {@code binary} that were written before the property was a media type.
	 */
	private static final Set<String> BINARY_FORMATS = Set.of("octet-stream", "bin", "binary");

	/**
	 * The load option every flow needs and none configures: the EClass to read the payload
	 * as. The listener already knows it from {@code payload.eclass.uri}, and a resource that
	 * does not know the option ignores it.
	 */
	private static final String CODEC_ROOT_TYPE = "codec.rootType";

	@Reference
	InstancePusher pusher;

	/** The default target matches nothing: every instance names its broker in the config. */
	@Reference(target = "(scope=no-inject)")
	MessagingService messaging;

	@Reference
	ResourceSet resourceSet;

	/**
	 * Optional: only a windowing instance needs one, and the configuration targets it. Bound
	 * through {@link #bindAggregator(PayloadAggregator)}, so the reference is declared there -
	 * an AtomicReference is no field type DS can inject into.
	 */
	private final AtomicReference<PayloadAggregator> aggregator = new AtomicReference<>();

	private final AtomicLong sequence = new AtomicLong();

	private final List<PushStream<Message>> subscriptions = new ArrayList<>();

	/**
	 * The topics this flow has seen, so each is reported once. A subscription is a filter, and
	 * what it actually matches - which topics exist, at which depth, carrying what - is
	 * otherwise nowhere in the log: a filter that matches nothing looks exactly like a quiet
	 * broker.
	 */
	private final Set<String> seenTopics = ConcurrentHashMap.newKeySet();
	private Config config;
	private ScheduledExecutorService scheduler;
	private EClass payloadEClass;
	/** The attribute a scalar payload is read into, or <code>null</code> where it is an object. */
	private EAttribute scalarFeature;
	private Map<String, Object> loadOptions = Map.of();
	private Pattern exclude;

	@ObjectClassDefinition(name = "MQTT CloudEvent listener",
			description = "Reads one MQTT topic, wraps each payload in a CloudEvent and pushes it to the digital twin.")
	public @interface Config {

		@AttributeDefinition(name = "Name", description = "The name this flow is logged under")
		String name() default "MqttCloudEventListener";

		@AttributeDefinition(name = "Topics",
				description = "The MQTT topic filters to subscribe to. Several of them are one flow as long as "
						+ "they carry the same payload EClass, e.g. the two topics a TrafiCam camera configuration "
						+ "arrives on; a payload read as another EClass is another configuration")
		String[] topic();

		@AttributeDefinition(name = "Topic exclude", required = false,
				description = "A regular expression; messages whose topic matches it are ignored. "
						+ "What a topic filter cannot exclude - a lifesign below the topic the flow reads - goes here")
		String topic_exclude() default "";

		@AttributeDefinition(name = "CloudEvent type", description = "The CloudEvent type attribute of every event of this flow")
		String cloud_event_type() default "MQTT";

		@AttributeDefinition(name = "Payload EClass URI",
				description = "The URI of the EClass the payloads on these topics are read as, e.g. "
						+ "https://jena.de/models/traficam/1.0#//TrafiCamObject. The CloudEvent dataschema is not "
						+ "this but the EClass of what the envelope carries, which on a windowed flow is what the "
						+ "aggregator built")
		String payload_eclass_uri();

		@AttributeDefinition(name = "Payload format",
				description = "The media type of the payload on these topics, e.g. application/xmi, "
						+ "application/json, or application/octet-stream for EMF binary. EMF picks its resource "
						+ "factory by file extension, so the subtype is what is asked for - a bare xmi or json "
						+ "works too. It is reported as the CloudEvent datacontenttype of a payload pushed as it "
						+ "arrives, and of nothing else: an aggregate was built in memory and never serialized")
		String payload_format() default "application/xmi";

		@AttributeDefinition(name = "Payload feature", required = false,
				description = "Reads the payload as a scalar rather than as a serialized object: the text is "
						+ "converted to the type of this attribute of the payload EClass and set on a fresh "
						+ "instance of it, e.g. temperature for a topic carrying a bare number. Empty - the "
						+ "default - means the payload is a serialized instance and payload.format says how to "
						+ "read it")
		String payload_feature() default "";

		@AttributeDefinition(name = "Payload load options", required = false,
				description = "EMF load options for the payload, as key=value entries, e.g. "
						+ "codec.typeKey=eClass for a JSON payload that types its nested objects the EMF way, or "
						+ "codec.dateFormat=yyyy-MM-dd'T'HH:mm:ss.SSS'Z'zzz where the dates need a format of their "
						+ "own. Values are passed as strings. codec.rootType is not configured: the listener "
						+ "passes the payload EClass itself")
		String[] payload_load_options() default {};

		@AttributeDefinition(name = "Window seconds", required = false,
				description = "A window interval (in seconds) to push data every X seconds instead of as soon as a new payload "
						+ "arrives. Above zero the flow needs a PayloadAggregator, selected with aggregator.target")
		int window_seconds() default 0;
	}

	@Activate
	void activate(Config config) throws Exception {
		configure(config);
		if (config.window_seconds() > 0) {
			scheduler = Executors.newSingleThreadScheduledExecutor(runnable -> {
				Thread thread = new Thread(runnable, "mqtt-cloud-event-" + config.name());
				thread.setDaemon(true);
				return thread;
			});
			scheduler.scheduleAtFixedRate(this::flush, config.window_seconds(), config.window_seconds(),
					TimeUnit.SECONDS);
		}
		for (String topic : config.topic()) {
			PushStream<Message> subscription = messaging.subscribe(topic);
			subscription.forEachEvent(this::onEvent);
			subscriptions.add(subscription);
		}
		logger.log(Level.INFO, "{0} listening on {1} for data of type {2}{3}", config.name(),
				String.join(", ", config.topic()), config.payload_eclass_uri(),
				config.window_seconds() > 0 ? ", windowed every " + config.window_seconds() + "s" : "");
	}

	/**
	 * Everything the instance needs before the first message, and nothing that talks to the
	 * broker - so a test can configure a listener without one.
	 */
	void configure(Config config) {
		requireTopics(config.topic());
		requireText(config.payload_eclass_uri(), "payload.eclass.uri");
		requireText(config.payload_format(), "payload.format");
		if (extensionOf(config.payload_format()).isEmpty()) {
			throw new IllegalArgumentException(
					"Property payload.format names no format: " + config.payload_format());
		}
		if (config.window_seconds() > 0 && aggregator.get() == null) {
			// The reference is dynamic, so the aggregator may still arrive - but a window
			// without one never pushes anything, and a wrong aggregator.target looks exactly
			// like a service that is late.
			logger.log(Level.WARNING,
					"{0} declares window.seconds {1} but binds no PayloadAggregator yet: check aggregator.target",
					config.name(), config.window_seconds());
		}
		this.config = config;
		this.payloadEClass = payloadEClass(config.payload_eclass_uri());
		this.scalarFeature = scalarFeature(config.payload_feature());
		this.loadOptions = loadOptions(config.payload_load_options());
		if (scalarFeature != null && config.payload_load_options().length > 0) {
			logger.log(Level.WARNING,
					"{0} names payload.load.options and payload.feature: a scalar payload is read without a"
							+ " resource, so the options do nothing",
					config.name());
		}
		this.exclude = config.topic_exclude().isBlank() ? null : Pattern.compile(config.topic_exclude());
	}

	/**
	 * The attribute {@code payload.feature} names, checked against the payload EClass while
	 * the configuration is still refusable - a name that is wrong, or names a reference,
	 * would otherwise fail once per message for as long as the flow runs.
	 * @param name the configured feature name, empty where the payload is an object
	 * @return the attribute to read the payload into, or <code>null</code> where there is none
	 */
	private EAttribute scalarFeature(String name) {
		if (name.isBlank()) {
			return null;
		}
		EStructuralFeature feature = payloadEClass.getEStructuralFeature(name.trim());
		if (feature == null) {
			throw new IllegalArgumentException(String.format(
					"Property payload.feature names '%s', which is no feature of %s",
					name, payloadEClass.getName()));
		}
		if (!(feature instanceof EAttribute attribute) || !(attribute.getEType() instanceof EDataType)) {
			throw new IllegalArgumentException(String.format(
					"Property payload.feature names '%s' of %s, which is no attribute of a data type -"
							+ " a scalar payload has nowhere else to go",
					name, payloadEClass.getName()));
		}
		return attribute;
	}

	/**
	 * The options {@link Resource#load(java.io.InputStream, Map)} is given: what
	 * {@code payload.load.options} configures, plus the root type the listener knows itself.
	 * <p>
	 * They are parsed while the configuration can still be refused, for the same reason the
	 * payload feature is: an entry that is no {@code key=value} pair would otherwise be
	 * discovered one message at a time.
	 * @param entries the configured entries, each {@code key=value}
	 * @return the load options, with {@link #CODEC_ROOT_TYPE} set to the payload EClass
	 */
	private Map<String, Object> loadOptions(String[] entries) {
		Map<String, Object> options = new LinkedHashMap<>();
		options.put(CODEC_ROOT_TYPE, payloadEClass);
		for (String entry : entries) {
			int separator = entry == null ? -1 : entry.indexOf('=');
			if (separator < 0 || entry.substring(0, separator).isBlank()) {
				throw new IllegalArgumentException(String.format(
						"Property payload.load.options takes key=value entries, which '%s' is not", entry));
			}
			String key = entry.substring(0, separator).trim();
			if (CODEC_ROOT_TYPE.equals(key)) {
				throw new IllegalArgumentException(String.format(
						"Property payload.load.options must not name %s: the listener passes the EClass that"
								+ " payload.eclass.uri resolves to, which a string cannot replace",
						CODEC_ROOT_TYPE));
			}
			// Not trimmed: a format string is allowed to end in a space.
			options.put(key, entry.substring(separator + 1));
		}
		return Map.copyOf(options);
	}

	@Deactivate
	void deactivate() {
		subscriptions.forEach(PushStream::close);
		subscriptions.clear();
		seenTopics.clear();
		if (scheduler != null) {
			scheduler.shutdownNow();
		}
	}
	

	/**
	 * The default target matches nothing, as for {@link #messaging}: a flow that windows names
	 * its aggregator, and one that does not must bind none. Without it the reference is
	 * constrained by the interface alone, so a flow that never asked for an aggregator binds
	 * whichever one happens to be registered - and offers it payloads it cannot read.
	 */
	@Reference(name = "aggregator", policy = ReferencePolicy.DYNAMIC,
			cardinality = ReferenceCardinality.OPTIONAL, target = "(scope=no-inject)")
	public void bindAggregator(PayloadAggregator aggregator) {
		this.aggregator.set(aggregator);
	}
	
	
	public void unbindAggregator(PayloadAggregator aggregator) {
		this.aggregator.compareAndSet(aggregator, null);
	}

	private long onEvent(PushEvent<? extends Message> event) {
		switch (event.getType()) {
		case DATA -> {
			Message message = event.getData();
			try {
				handle(message.topic(), bytes(message.payload()));
			} catch (Exception e) {
				logger.log(Level.ERROR, "Error processing message on topic " + message.topic(), e);
			}
		}
		case ERROR -> logger.log(Level.ERROR, "{0} subscription failed: {1}", config.name(), event.getFailure());
		case CLOSE -> logger.log(Level.INFO, "{0} subscription closed", config.name());
		}
		return 0;
	}

	static byte[] bytes(ByteBuffer payload) {
		byte[] bytes = new byte[payload.remaining()];
		payload.duplicate().get(bytes);
		return bytes;
	}

	/**
	 * Reads one message and either hands it to the aggregator or pushes it.
	 * @param topic the topic the message arrived on
	 * @param payload the serialized payload
	 * @throws IOException if the payload is no instance of the configured EClass
	 */
	void handle(String topic, byte[] payload) throws IOException {
		boolean excluded = exclude != null && exclude.matcher(topic).matches();
		if (seenTopics.add(topic)) {
			logger.log(Level.INFO, "{0}: first message on {1}{2}", config.name(), topic,
					excluded ? " - excluded" : "");
		}
		if (excluded) {
			logger.log(Level.DEBUG, "{0} ignores {1}", config.name(), topic);
			return;
		}
		EObject data = load(payload, topic);
		PayloadAggregator current = aggregator.get();
		if (current == null) {
			if (config.window_seconds() > 0) {
				// Pushing it raw is not the lesser evil: this flow's mapping expects what the
				// window adds up to, not a single payload.
				logger.log(Level.WARNING, "{0} drops {1}: no PayloadAggregator for its window",
						config.name(), topic);
				return;
			}
			push(envelope(topic, data, new Date(), config.payload_format()));
			return;
		}
		if (current.collect(topic, data)) {
			return; // it leaves with the next flush
		}
		push(envelope(topic, data, new Date(), config.payload_format()));
	}

	/**
	 * Closes the window and pushes one envelope per aggregate.
	 * <p>
	 * Nothing thrown here reaches the scheduler: a flush that fails must not stop the ones
	 * after it.
	 */
	void flush() {
		PayloadAggregator current = aggregator.get();
		if (current == null) {
			logger.log(Level.DEBUG, "{0} has no PayloadAggregator to flush", config.name());
			return;
		}
		try {
			current.flush().forEach(aggregate -> push(
					envelope(aggregate.source(), aggregate.data(), aggregate.time(), null)));
		} catch (Exception e) {
			logger.log(Level.ERROR, "Error flushing the window of " + config.name(), e);
		}
	}

	/**
	 * @param source the topic to report as the event source
	 * @param data the instance the envelope carries
	 * @param time the event time
	 * @param format how {@code data} was serialized, or {@code null} where it never was -
	 * an aggregate is built in memory, so it has no content type to report
	 */
	private CloudEvent envelope(String source, EObject data, Date time, String format) {
		CloudEvent cloudEvent = CloudEventsFactory.eINSTANCE.createCloudEvent();
		cloudEvent.setEventId(UUID.randomUUID().toString());
		cloudEvent.setSource(source);
		cloudEvent.setDatacontenttype(format);
		cloudEvent.setDataschema(schemaOf(data));
		cloudEvent.setType(config.cloud_event_type());
		cloudEvent.setTime(time == null ? new Date() : time);
		// Containment: the payload moves out of the resource it was read from, which has
		// served its purpose.
		cloudEvent.setData(data);
		return cloudEvent;
	}

	/**
	 * The dataschema of an envelope: the EClass of what it carries, not what the
	 * configuration names. The two are the same string for a payload pushed as it arrives,
	 * and they are not for an aggregate - which is a different EClass than the payloads it
	 * was built from, and a mapping selects on this attribute.
	 * @param data the instance the envelope carries
	 * @return its EClass URI, or the configured one where the EClass names no package
	 */
	private String schemaOf(EObject data) {
		EClass eClass = data.eClass();
		EPackage ePackage = eClass.getEPackage();
		return ePackage == null ? config.payload_eclass_uri() : ePackage.getNsURI() + "#//" + eClass.getName();
	}

	private void push(CloudEvent cloudEvent) {
		int applied = pusher.pushInstance(cloudEvent);
		if (applied == 0) {
			logger.log(Level.WARNING, "no provider mapping for event {0} of type {1} from {2}",
					cloudEvent.getEventId(), cloudEvent.getDataschema(), cloudEvent.getSource());
		} else {
			logger.log(Level.DEBUG, "pushed {0} of type {1} from {2}", cloudEvent.getEventId(),
					cloudEvent.getDataschema(), cloudEvent.getSource());
		}
	}

	/**
	 * Reads the payload as the configured EClass.
	 * <p>
	 * The resource is created in the injected resource set, so the payload's EPackage is
	 * resolved the way the runtime registered it, and it leaves the set again right after -
	 * what the caller keeps is the instance, not the resource it came in.
	 */
	private EObject load(byte[] payload, String topic) throws IOException {
		if (scalarFeature != null) {
			return scalar(payload, topic);
		}
		Resource resource = createResource();
		try {
			resource.load(new ByteArrayInputStream(payload), loadOptions);
			if (resource.getContents().isEmpty() || !payloadEClass.isInstance(resource.getContents().get(0))) {
				throw new IOException(String.format("payload on %s is no %s", topic, payloadEClass.getName()));
			}
			return resource.getContents().get(0);
		} finally {
			synchronized (resourceSet) {
				resourceSet.getResources().remove(resource);
			}
		}
	}

	/**
	 * Reads the payload as one value of the configured EClass: the bare number, flag or word a
	 * topic carries instead of a serialized object. The conversion is the data type's own, so
	 * it is the model that decides what the text may say.
	 * @param payload the payload bytes, read as UTF-8 and trimmed
	 * @param topic the topic it arrived on, for the error
	 * @return a fresh instance of the payload EClass carrying the value
	 * @throws IOException where the text is no value of the attribute's type
	 */
	private EObject scalar(byte[] payload, String topic) throws IOException {
		String text = new String(payload, StandardCharsets.UTF_8).trim();
		EObject data = EcoreUtil.create(payloadEClass);
		try {
			data.eSet(scalarFeature, EcoreUtil.createFromString((EDataType) scalarFeature.getEType(), text));
		} catch (RuntimeException e) {
			throw new IOException(String.format("payload on %s is no %s for %s.%s: '%s'", topic,
					scalarFeature.getEType().getName(), payloadEClass.getName(), scalarFeature.getName(), text), e);
		}
		return data;
	}

	private Resource createResource() throws IOException {
		String format = config.payload_format();
		String extension = extensionOf(format);
		URI uri = URI.createURI("payload/" + sequence.incrementAndGet() + "." + extension);
		synchronized (resourceSet) {
			if (BINARY_FORMATS.contains(extension.toLowerCase(Locale.ROOT))) {
				Resource resource = new BinaryResourceImpl(uri);
				resourceSet.getResources().add(resource);
				return resource;
			}
			Resource resource = resourceSet.createResource(uri);
			if (resource == null) {
				throw new IOException(String.format(
						"no EMF resource factory for the payload.format %s, read as the extension %s",
						format, extension));
			}
			return resource;
		}
	}

	/**
	 * The file extension EMF picks a resource factory by, out of a media type: the subtype,
	 * which is what the extension-to-factory map is keyed by - {@code application/xmi} is
	 * {@code xmi}. The property is a media type because it is also reported as the
	 * CloudEvent datacontenttype; a bare extension is left as it is.
	 * @param format the configured {@code payload.format}
	 * @return the extension it names, empty where it names none
	 */
	static String extensionOf(String format) {
		String trimmed = format.trim();
		return trimmed.substring(trimmed.lastIndexOf('/') + 1);
	}

	/**
	 * The EClass {@code payload.eclass.uri} names.
	 * <p>
	 * It is looked for without a demand load first, which is how a registered EPackage is
	 * found. Only then is the resource set asked to load it, and a failure there is reported
	 * as what it almost always is: no bundle in the runtime provides that model. EMF's own
	 * answer is to fetch the nsURI over HTTP and complain about the host, which names neither
	 * the configuration property at fault nor the model that is missing.
	 * @param schema the configured {@code payload.eclass.uri}
	 * @return the EClass payloads of this flow are read as
	 */
	private EClass payloadEClass(String schema) {
		URI uri = URI.createURI(schema);
		EObject resolved = resourceSet.getEObject(uri, false);
		if (resolved == null) {
			try {
				resolved = resourceSet.getEObject(uri, true);
			} catch (RuntimeException e) {
				throw new IllegalArgumentException(unresolvable(schema, uri), e);
			}
		}
		if (resolved == null) {
			throw new IllegalArgumentException(unresolvable(schema, uri));
		}
		if (!(resolved instanceof EClass eClass)) {
			throw new IllegalArgumentException(String.format(
					"payload.eclass.uri %s does not resolve to an EClass", schema));
		}
		return eClass;
	}

	private static String unresolvable(String schema, URI uri) {
		return String.format(
				"payload.eclass.uri %s cannot be resolved: nothing registers the EPackage %s YET. Either its"
						+ " model bundle is not deployed - a model a mapping names and no bundle imports has to be"
						+ " required by name in the bndrun, or the resolver leaves it out - or it has not activated"
						+ " yet, which an osgi.ds.satisfying.condition.target of (osgi.condition.id=<nsURI>) on this"
						+ " configuration waits for",
				schema, uri.trimFragment());
	}

	private static void requireTopics(String[] topics) {
		if (topics == null || topics.length == 0) {
			throw new IllegalArgumentException("Property topic cannot be empty");
		}
		for (String topic : topics) {
			requireText(topic, "topic");
		}
	}

	private static void requireText(String value, String property) {
		if (value == null || value.isBlank()) {
			throw new IllegalArgumentException("Property " + property + " cannot be empty");
		}
	}
}
