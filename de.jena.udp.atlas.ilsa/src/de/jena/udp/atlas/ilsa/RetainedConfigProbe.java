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

import java.io.IOException;
import java.lang.System.Logger;
import java.lang.System.Logger.Level;
import java.nio.ByteBuffer;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

import org.gecko.osgi.messaging.Message;
import org.gecko.osgi.messaging.MessagingService;
import org.osgi.service.component.annotations.Activate;
import org.osgi.service.component.annotations.Component;
import org.osgi.service.component.annotations.Deactivate;
import org.osgi.service.component.annotations.Reference;
import org.osgi.util.pushstream.PushEvent;
import org.osgi.util.pushstream.PushStream;

/**
 * <b>TEMPORARY. Delete this class once the ILSA admin location is settled.</b>
 * <p>
 * Writes the raw bytes of one MQTT topic to a file, so a payload can be read without a broker
 * client and without the credentials the runtime already holds. It exists to answer one
 * question - whether the retained {@code TLConfiguration} carries
 * {@code geoJson.bbox}, which {@code ilsa-configuration-ce-mapping.xmi} reads for the admin
 * location - and it parses nothing, so it cannot be fooled by the codec it is meant to check.
 * <p>
 * The payload goes to a file rather than the log because a retained intersection
 * configuration is tens of kilobytes of signals; only the path is logged. A retained message
 * is delivered on subscribe, so the file appears at startup and is rewritten whenever the
 * topic is republished.
 * <p>
 * The topic is a component property, so another one can be read by adding
 * {@code "de.jena.udp.atlas.ilsa.RetainedConfigProbe": { "topic": "..." }} to the runtime
 * configuration - no rebuild.
 */
@Component(immediate = true, service = RetainedConfigProbe.class)
public class RetainedConfigProbe {

	/** @noreference the activation configuration of a throwaway probe */
	public @interface Config {
		String topic() default "5g/ilsa/K413/config/retained";

		String directory() default "";
	}

	private static final Logger LOG = System.getLogger(RetainedConfigProbe.class.getName());

	private final Path directory;
	private PushStream<Message> subscription;

	/**
	 * @param config the topic to read and where to write it
	 * @param messaging the same broker connection the ILSA flows read, named by its id rather
	 *            than left to whichever service is registered
	 */
	@Activate
	public RetainedConfigProbe(Config config, @Reference(target = "(id=read)") MessagingService messaging) {
		directory = Paths.get(config.directory().isBlank() ? System.getProperty("java.io.tmpdir") : config.directory());
		try {
			subscription = messaging.subscribe(config.topic());
			subscription.forEachEvent(this::onEvent);
			LOG.log(Level.INFO, "RetainedConfigProbe reading {0}, payloads go to {1}", config.topic(), directory);
		} catch (Exception failure) {
			LOG.log(Level.ERROR, "RetainedConfigProbe could not subscribe to " + config.topic(), failure);
		}
	}

	@Deactivate
	void deactivate() {
		if (subscription != null) {
			subscription.close();
		}
	}

	private long onEvent(PushEvent<? extends Message> event) {
		if (event.getType() == PushEvent.EventType.DATA) {
			Message message = event.getData();
			write(message.topic(), bytes(message.payload()));
		}
		return 0;
	}

	private void write(String topic, byte[] payload) {
		Path file = directory.resolve(topic.replace('/', '-') + ".payload");
		try {
			Files.write(file, payload);
			LOG.log(Level.INFO, "RetainedConfigProbe wrote {0} bytes of {1} to {2}", payload.length, topic, file);
		} catch (IOException failure) {
			LOG.log(Level.ERROR, "RetainedConfigProbe could not write " + file, failure);
		}
	}

	private static byte[] bytes(ByteBuffer payload) {
		byte[] bytes = new byte[payload.remaining()];
		payload.duplicate().get(bytes);
		return bytes;
	}
}
