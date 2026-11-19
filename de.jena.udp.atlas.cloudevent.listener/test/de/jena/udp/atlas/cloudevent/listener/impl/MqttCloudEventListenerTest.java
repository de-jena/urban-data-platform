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

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertInstanceOf;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertNull;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.io.ByteArrayOutputStream;
import java.io.InputStream;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.lang.annotation.Annotation;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Date;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.function.Predicate;
import java.util.function.UnaryOperator;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EClassifier;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.EcoreFactory;
import org.eclipse.emf.ecore.EcorePackage;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.BinaryResourceImpl;
import org.eclipse.emf.ecore.resource.impl.ResourceImpl;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.ecore.xmi.impl.XMIResourceFactoryImpl;
import org.eclipse.fennec.event.atlas.mapping.InstancePusher;
import org.gecko.osgi.messaging.Message;
import org.gecko.osgi.messaging.MessagingContext;
import org.gecko.osgi.messaging.MessagingService;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.osgi.util.pushstream.PushEventSource;
import org.osgi.util.pushstream.PushStream;
import org.osgi.util.pushstream.PushStreamProvider;

import de.jena.udp.atlas.cloudevent.listener.PayloadAggregator;
import io.cloudevents.model.ce.CloudEvent;

/**
 * What the listener puts around a payload, and when an aggregator holds one back.
 * <p>
 * The listener is reusable, so these tests read a payload model built here rather than the
 * domain model of any adapter: a {@code Reading} and a {@code Setting}, which is as much as
 * it takes to tell a payload of the configured EClass from one of another. What an envelope
 * is then mapped to is the mapping's business and is not asserted here.
 */
class MqttCloudEventListenerTest {

	private static final String BINARY = "application/octet-stream";
	private static final String XMI = "application/xmi";
	private static final String TEXT = "text/plain";
	private static final String NS_URI = "https://jena.de/models/cloudevent/test/1.0";
	private static final String READING_SCHEMA = NS_URI + "#//Reading";
	private static final String SETTING_SCHEMA = NS_URI + "#//Setting";

	private final List<EObject> pushed = new ArrayList<>();
	private final Map<String, Object> recordedOptions = new LinkedHashMap<>();
	private ResourceSet resourceSet;
	private EPackage model;
	private EClass reading;
	private EClass setting;

	@BeforeEach
	void createPayloadModel() {
		reading = eClass("Reading", "sensor", EcorePackage.Literals.ESTRING, "value", EcorePackage.Literals.EDOUBLE);
		setting = eClass("Setting", "sensor", EcorePackage.Literals.ESTRING, "unit", EcorePackage.Literals.ESTRING);
		model = EcoreFactory.eINSTANCE.createEPackage();
		model.setName("cloudeventtest");
		model.setNsPrefix("cet");
		model.setNsURI(NS_URI);
		model.getEClassifiers().add(reading);
		model.getEClassifiers().add(setting);
		// Nothing reads it; it is here so that a payload.feature naming a reference has
		// something to name.
		reading.getEStructuralFeatures().add(reference("related", setting));

		resourceSet = new ResourceSetImpl();
		resourceSet.getResourceFactoryRegistry().getExtensionToFactoryMap().put("xmi", new XMIResourceFactoryImpl());
		// Stands in for a format whose resource reads load options - the Fennec JSON codec, in
		// the runtime. It records them and produces a payload of the configured EClass.
		Resource.Factory recording = uri -> new ResourceImpl(uri) {

			@Override
			protected void doLoad(InputStream inputStream, Map<?, ?> options) {
				options.forEach((key, value) -> recordedOptions.put(String.valueOf(key), value));
				getContents().add(reading("a", 21.5));
			}
		};
		resourceSet.getResourceFactoryRegistry().getExtensionToFactoryMap().put("rec", recording);
		// The schema is resolved through the resource set, so the model needs a resource in
		// it - which is what a generated EPackage brings along and a dynamic one does not.
		Resource modelResource = new ResourceImpl(URI.createURI(NS_URI));
		modelResource.getContents().add(model);
		resourceSet.getResources().add(modelResource);
		resourceSet.getPackageRegistry().put(NS_URI, model);
	}

	@Test
	void aPayloadBecomesOneCloudEventCarryingTheTopicAsItsSource() throws Exception {
		MqttCloudEventListener listener = listener(config("sensors/+/reading", READING_SCHEMA, 0), null);

		listener.handle("sensors/a/reading", binary(reading("a", 21.5)));

		CloudEvent event = assertInstanceOf(CloudEvent.class, pushed.get(0));
		assertEquals("sensors/a/reading", event.getSource());
		assertEquals("de.jena.udp.test", event.getType());
		assertEquals(READING_SCHEMA, event.getDataschema());
		assertEquals(BINARY, event.getDatacontenttype());
		assertNotNull(event.getEventId());
		assertNotNull(event.getTime());
		assertEquals("a", assertInstanceOf(EObject.class, event.getData()).eGet(reading.getEStructuralFeature("sensor")));
	}

	/**
	 * One flow is one payload EClass over as many topics as carry it, so a payload that is
	 * none of that EClass is an error rather than something to push.
	 */
	@Test
	void aPayloadOfAnotherEClassIsRejected() throws Exception {
		MqttCloudEventListener listener = listener(config("sensors/+/reading", READING_SCHEMA, 0), null);

		byte[] payload = binary(setting("a", "celsius"));

		assertThrows(IOException.class, () -> listener.handle("sensors/a/reading", payload));
		assertTrue(pushed.isEmpty());
	}

	/**
	 * The format is a media type, because it is also what the envelope reports - but EMF
	 * keys its resource factories by file extension, so the subtype is what is looked up.
	 */
	@Test
	void aMediaTypeNamesTheEmfFactoryByItsSubtype() throws Exception {
		MqttCloudEventListener listener = listener(
				config(new String[] { "sensors/+/reading" }, READING_SCHEMA, 0, "", XMI), null);

		listener.handle("sensors/a/reading", xmi(reading("a", 21.5)));

		CloudEvent event = assertInstanceOf(CloudEvent.class, pushed.get(0));
		assertEquals(XMI, event.getDatacontenttype());
		assertEquals("a", assertInstanceOf(EObject.class, event.getData()).eGet(reading.getEStructuralFeature("sensor")));
	}

	/** A bare extension is what the property held before it was a media type. */
	@Test
	void aBareExtensionIsStillRead() throws Exception {
		MqttCloudEventListener listener = listener(
				config(new String[] { "sensors/+/reading" }, READING_SCHEMA, 0, "", "xmi"), null);

		listener.handle("sensors/a/reading", xmi(reading("a", 21.5)));

		assertEquals("xmi", assertInstanceOf(CloudEvent.class, pushed.get(0)).getDatacontenttype());
	}

	@Test
	void theBinaryMediaTypeIsReadAsEmfBinary() throws Exception {
		MqttCloudEventListener listener = listener(
				config(new String[] { "sensors/+/reading" }, READING_SCHEMA, 0, "", BINARY), null);

		listener.handle("sensors/a/reading", binary(reading("a", 21.5)));

		assertEquals(BINARY, assertInstanceOf(CloudEvent.class, pushed.get(0)).getDatacontenttype());
	}

	@Test
	void aFormatThatNamesNoFormatIsRejected() {
		MqttCloudEventListener listener = newListener(null);

		assertThrows(IllegalArgumentException.class, () -> listener
				.configure(config(new String[] { "sensors/+/reading" }, READING_SCHEMA, 0, "", "application/")));
	}

	@Test
	void aConfigurationWithoutAUsableTopicIsRejected() {
		MqttCloudEventListener listener = newListener(null);

		assertThrows(IllegalArgumentException.class,
				() -> listener.configure(config(new String[0], READING_SCHEMA, 0, "")));
		assertThrows(IllegalArgumentException.class,
				() -> listener.configure(config(new String[] { "sensors/+/reading", " " }, READING_SCHEMA, 0, "")));
	}

	/**
	 * Several topics are one flow as long as they carry the same payload: the listener
	 * subscribes to each of them, and closes each again when it goes away.
	 */
	@Test
	void everyTopicOfTheConfigurationIsSubscribedAndClosedAgain() throws Exception {
		RecordingMessaging messaging = new RecordingMessaging();
		MqttCloudEventListener listener = newListener(null);
		listener.messaging = messaging;

		listener.activate(config(new String[] { "sensors/+/setting", "sensors/+/setting/retained" }, SETTING_SCHEMA,
				0, ""));

		assertEquals(List.of("sensors/+/setting", "sensors/+/setting/retained"), messaging.subscribed);

		listener.deactivate();

		assertEquals(List.of("sensors/+/setting", "sensors/+/setting/retained"), messaging.closed);
	}

	@Test
	void anExcludedTopicIsNeitherReadNorPushed() throws Exception {
		MqttCloudEventListener listener = listener(
				config("sensors/#", READING_SCHEMA, 0, ".*/(lifesign|setting/retained)$"), null);

		// no payload a Reading could be read from, and none is attempted
		listener.handle("sensors/a/lifesign", new byte[] { 1 });

		assertTrue(pushed.isEmpty());
	}

	@Test
	void aCollectedPayloadWaitsForTheFlush() throws Exception {
		CollectingAggregator aggregator = new CollectingAggregator(reading::isInstance);
		MqttCloudEventListener listener = listener(config("sensors/+/reading", READING_SCHEMA, 2), aggregator);

		listener.handle("sensors/a/reading", binary(reading("a", 21.5)));

		assertTrue(pushed.isEmpty());

		listener.flush();

		CloudEvent event = assertInstanceOf(CloudEvent.class, pushed.get(0));
		// source and time are the aggregator's: the aggregate stands for several messages
		assertEquals("window of sensors/a/reading", event.getSource());
		assertEquals(aggregator.flushed, event.getTime());
	}

	/**
	 * The dataschema is the EClass of what the envelope carries, which on a windowed flow is
	 * what the aggregator built rather than what arrived - and it is the attribute a mapping
	 * selects on, so reporting the configured one would offer the aggregate under the name
	 * of its payloads.
	 */
	@Test
	void anAggregateIsReportedUnderItsOwnEClass() throws Exception {
		CollectingAggregator aggregator = new CollectingAggregator(reading::isInstance,
				_ -> setting("a", "celsius"));
		MqttCloudEventListener listener = listener(config("sensors/+/reading", READING_SCHEMA, 2), aggregator);

		listener.handle("sensors/a/reading", binary(reading("a", 21.5)));
		listener.flush();

		CloudEvent event = assertInstanceOf(CloudEvent.class, pushed.get(0));
		assertEquals(SETTING_SCHEMA, event.getDataschema());
		assertTrue(setting.isInstance(event.getData()));
		// and it reports no content type: nothing serialized it
		assertNull(event.getDatacontenttype());
	}

	/**
	 * An aggregator that only wants to read a flow - to keep context for the flows it does
	 * window - leaves the payload to the listener, which pushes it as it arrives.
	 */
	@Test
	void aPayloadTheAggregatorDeclinesIsPushedStraightAway() throws Exception {
		CollectingAggregator aggregator = new CollectingAggregator(_ -> false);
		MqttCloudEventListener listener = listener(config("sensors/+/setting", SETTING_SCHEMA, 0), aggregator);

		listener.handle("sensors/a/setting", binary(setting("a", "celsius")));

		assertEquals("sensors/a/setting", assertInstanceOf(CloudEvent.class, pushed.get(0)).getSource());
		listener.flush();
		assertEquals(1, pushed.size());
	}

	/**
	 * The aggregator reference is dynamic, so it can arrive after the subscription does. A
	 * windowed flow that has none pushes nothing: its mapping expects what the window adds
	 * up to, and a single payload is not that.
	 */
	@Test
	void aWindowWithoutAnAggregatorPushesNothing() throws Exception {
		MqttCloudEventListener listener = listener(config("sensors/+/reading", READING_SCHEMA, 2), null);

		listener.handle("sensors/a/reading", binary(reading("a", 21.5)));
		listener.flush();

		assertTrue(pushed.isEmpty());
	}

	/**
	 * A topic that carries a bare value, not a serialized object: what arrives is one number,
	 * and the flow says which attribute of the payload EClass it is.
	 */
	@Test
	void aScalarPayloadIsReadIntoTheNamedFeature() throws Exception {
		MqttCloudEventListener listener = listener(config(new String[] { "sensors/+/temperature" },
				READING_SCHEMA, 0, "", TEXT, "value"), null);

		listener.handle("sensors/a/temperature", " 21.5 ".getBytes(StandardCharsets.UTF_8));

		CloudEvent event = assertInstanceOf(CloudEvent.class, pushed.get(0));
		assertEquals(READING_SCHEMA, event.getDataschema());
		assertEquals(TEXT, event.getDatacontenttype());
		EObject data = assertInstanceOf(EObject.class, event.getData());
		assertEquals(21.5, data.eGet(reading.getEStructuralFeature("value")));
	}

	/** The data type decides what the text may say, and a word is no EDouble. */
	@Test
	void aScalarPayloadOfTheWrongTypeIsRejected() throws Exception {
		MqttCloudEventListener listener = listener(config(new String[] { "sensors/+/temperature" },
				READING_SCHEMA, 0, "", TEXT, "value"), null);

		byte[] payload = "warm".getBytes(StandardCharsets.UTF_8);

		assertThrows(IOException.class, () -> listener.handle("sensors/a/temperature", payload));
		assertTrue(pushed.isEmpty());
	}

	/**
	 * Both refusals happen while the configuration can still be refused. A feature resolved
	 * per message would fail once per message instead, for as long as the flow runs.
	 */
	@Test
	void aPayloadFeatureTheEClassDoesNotHaveIsRefused() {
		MqttCloudEventListener listener = newListener(null);

		assertThrows(IllegalArgumentException.class, () -> listener.configure(config(
				new String[] { "sensors/+/temperature" }, READING_SCHEMA, 0, "", TEXT, "temperature")));
	}

	@Test
	void aPayloadFeatureThatIsNoAttributeIsRefused() {
		MqttCloudEventListener listener = newListener(null);

		assertThrows(IllegalArgumentException.class, () -> listener.configure(config(
				new String[] { "sensors/+/temperature" }, READING_SCHEMA, 0, "", TEXT, "related")));
	}

	/**
	 * A payload whose format needs load options - a JSON codec wants the key that types a
	 * nested object. The root type is not configured: the listener knows the EClass already,
	 * and a string could not carry it.
	 */
	@Test
	void theConfiguredLoadOptionsAndTheRootTypeReachTheResource() throws Exception {
		MqttCloudEventListener listener = listener(config(new String[] { "sensors/+/reading" }, READING_SCHEMA, 0,
				"", "application/rec", "", new String[] { "codec.typeKey=eClass" }), null);

		listener.handle("sensors/a/reading", new byte[0]);

		assertEquals(reading, recordedOptions.get("codec.rootType"));
		assertEquals("eClass", recordedOptions.get("codec.typeKey"));
		assertInstanceOf(CloudEvent.class, pushed.get(0));
	}

	@Test
	void aLoadOptionThatIsNoKeyValuePairIsRefused() {
		MqttCloudEventListener listener = newListener(null);

		assertThrows(IllegalArgumentException.class,
				() -> listener.configure(config(new String[] { "sensors/+/reading" }, READING_SCHEMA, 0, "",
						"application/rec", "", new String[] { "codec.typeKey" })));
	}

	/** The root type is the listener's to pass; a configured one would replace it with a string. */
	@Test
	void aLoadOptionNamingTheRootTypeIsRefused() {
		MqttCloudEventListener listener = newListener(null);

		assertThrows(IllegalArgumentException.class,
				() -> listener.configure(config(new String[] { "sensors/+/reading" }, READING_SCHEMA, 0, "",
						"application/rec", "", new String[] { "codec.rootType=Reading" })));
	}

	private MqttCloudEventListener listener(MqttCloudEventListener.Config config, PayloadAggregator aggregator) {
		MqttCloudEventListener listener = newListener(aggregator);
		listener.configure(config);
		return listener;
	}

	private MqttCloudEventListener newListener(PayloadAggregator aggregator) {
		MqttCloudEventListener listener = new MqttCloudEventListener();
		listener.pusher = new RecordingPusher(pushed);
		listener.resourceSet = resourceSet;
		if (aggregator != null) {
			listener.bindAggregator(aggregator);
		}
		return listener;
	}

	private EObject reading(String sensor, double value) {
		EObject instance = model.getEFactoryInstance().create(reading);
		instance.eSet(reading.getEStructuralFeature("sensor"), sensor);
		instance.eSet(reading.getEStructuralFeature("value"), value);
		return instance;
	}

	private EObject setting(String sensor, String unit) {
		EObject instance = model.getEFactoryInstance().create(setting);
		instance.eSet(setting.getEStructuralFeature("sensor"), sensor);
		instance.eSet(setting.getEStructuralFeature("unit"), unit);
		return instance;
	}

	private static EClass eClass(String name, String firstAttribute, EClassifier firstType, String secondAttribute,
			EClassifier secondType) {
		EClass eClass = EcoreFactory.eINSTANCE.createEClass();
		eClass.setName(name);
		eClass.getEStructuralFeatures().add(attribute(firstAttribute, firstType));
		eClass.getEStructuralFeatures().add(attribute(secondAttribute, secondType));
		return eClass;
	}

	private static EReference reference(String name, EClassifier type) {
		EReference reference = EcoreFactory.eINSTANCE.createEReference();
		reference.setName(name);
		reference.setEType(type);
		return reference;
	}

	private static EAttribute attribute(String name, EClassifier type) {
		EAttribute attribute = EcoreFactory.eINSTANCE.createEAttribute();
		attribute.setName(name);
		attribute.setEType(type);
		return attribute;
	}

	byte[] xmi(EObject object) throws IOException {
		Resource resource = resourceSet.createResource(URI.createURI("test/payload.xmi"));
		resource.getContents().add(object);
		ByteArrayOutputStream out = new ByteArrayOutputStream();
		try {
			resource.save(out, Map.of());
		} finally {
			resourceSet.getResources().remove(resource);
		}
		return out.toByteArray();
	}

	static byte[] binary(EObject object) throws IOException {
		BinaryResourceImpl resource = new BinaryResourceImpl();
		resource.getContents().add(object);
		ByteArrayOutputStream out = new ByteArrayOutputStream();
		resource.save(out, Map.of());
		return out.toByteArray();
	}

	static MqttCloudEventListener.Config config(String topic, String schema, int windowSeconds) {
		return config(new String[] { topic }, schema, windowSeconds, "");
	}

	static MqttCloudEventListener.Config config(String topic, String schema, int windowSeconds, String exclude) {
		return config(new String[] { topic }, schema, windowSeconds, exclude);
	}

	static MqttCloudEventListener.Config config(String[] topics, String schema, int windowSeconds, String exclude) {
		return config(topics, schema, windowSeconds, exclude, BINARY);
	}

	static MqttCloudEventListener.Config config(String[] topics, String schema, int windowSeconds, String exclude,
			String format) {
		return config(topics, schema, windowSeconds, exclude, format, "");
	}

	static MqttCloudEventListener.Config config(String[] topics, String schema, int windowSeconds, String exclude,
			String format, String feature) {
		return config(topics, schema, windowSeconds, exclude, format, feature, new String[0]);
	}

	static MqttCloudEventListener.Config config(String[] topics, String schema, int windowSeconds, String exclude,
			String format, String feature, String[] options) {
		return new MqttCloudEventListener.Config() {

			@Override
			public Class<? extends Annotation> annotationType() {
				return MqttCloudEventListener.Config.class;
			}

			@Override
			public String name() {
				return "test";
			}

			@Override
			public String[] topic() {
				return topics;
			}

			@Override
			public String topic_exclude() {
				return exclude;
			}

			@Override
			public String cloud_event_type() {
				return "de.jena.udp.test";
			}

			@Override
			public String payload_eclass_uri() {
				return schema;
			}

			@Override
			public String payload_format() {
				return format;
			}

			@Override
			public String payload_feature() {
				return feature;
			}

			@Override
			public String[] payload_load_options() {
				return options;
			}

			@Override
			public int window_seconds() {
				return windowSeconds;
			}
		};
	}

	/** Stands in for the mapping engine: records what the listener hands it. */
	record RecordingPusher(List<EObject> pushed) implements InstancePusher {

		@Override
		public int pushInstance(EObject instance) {
			pushed.add(instance);
			return 1;
		}

		/**
		 * The envelope itself is what the mapping engine is handed, so the envelope is what
		 * is recorded - a test that cares about the payload reads it off the event.
		 */
		@Override
		public int pushInstance(CloudEvent cloudEvent) {
			pushed.add(cloudEvent);
			return 1;
		}
	}

	/**
	 * Takes what it is told to take and reports one aggregate per topic it took something
	 * on, with a source of its own - what a real aggregator does with the payloads is
	 * domain knowledge this test has none of.
	 */
	static final class CollectingAggregator implements PayloadAggregator {

		private final Map<String, EObject> collected = new LinkedHashMap<>();
		private final Predicate<EObject> takes;
		private final UnaryOperator<EObject> aggregates;
		Date flushed;

		CollectingAggregator(Predicate<EObject> takes) {
			this(takes, UnaryOperator.identity());
		}

		CollectingAggregator(Predicate<EObject> takes, UnaryOperator<EObject> aggregates) {
			this.takes = takes;
			this.aggregates = aggregates;
		}

		@Override
		public boolean collect(String topic, EObject payload) {
			if (!takes.test(payload)) {
				return false;
			}
			collected.put(topic, payload);
			return true;
		}

		@Override
		public List<Aggregate> flush() {
			flushed = new Date();
			List<Aggregate> window = collected.entrySet().stream()
					.map(entry -> new Aggregate("window of " + entry.getKey(), aggregates.apply(entry.getValue()),
							flushed)).toList();
			collected.clear();
			return window;
		}
	}

	/**
	 * Stands in for the broker: hands out a stream per topic that never emits, and remembers
	 * which topics were subscribed and which streams were closed again.
	 */
	static final class RecordingMessaging implements MessagingService {

		/** A source that opens and then says nothing, so no broker and no thread is needed. */
		private static final PushEventSource<Message> IDLE = _ -> () -> {
		};

		final List<String> subscribed = new ArrayList<>();
		final List<String> closed = new ArrayList<>();
		private final PushStreamProvider provider = new PushStreamProvider();

		@Override
		public PushStream<Message> subscribe(String topic) {
			subscribed.add(topic);
			return provider.createStream(IDLE).onClose(() -> closed.add(topic));
		}

		@Override
		public PushStream<Message> subscribe(String topic, MessagingContext context) {
			return subscribe(topic);
		}

		@Override
		public void publish(String topic, ByteBuffer content) {
			throw new UnsupportedOperationException("a listener does not publish");
		}

		@Override
		public void publish(String topic, ByteBuffer content, MessagingContext context) {
			throw new UnsupportedOperationException("a listener does not publish");
		}
	}
}
