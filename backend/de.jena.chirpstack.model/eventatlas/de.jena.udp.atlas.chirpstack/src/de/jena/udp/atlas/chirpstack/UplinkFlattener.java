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
package de.jena.udp.atlas.chirpstack;

import java.lang.System.Logger;
import java.lang.System.Logger.Level;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.List;

import java.util.Optional;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;

import org.eclipse.fennec.event.atlas.southbound.common.IngestResult;
import org.eclipse.fennec.event.atlas.southbound.common.PayloadIngest;
import org.eclipse.fennec.event.atlas.southbound.common.UnknownModelHandler;
import org.eclipse.fennec.event.atlas.southbound.common.UnknownPayload;
import org.osgi.service.component.annotations.Component;
import org.osgi.service.component.annotations.Reference;

import tools.jackson.databind.JsonNode;
import tools.jackson.databind.ObjectMapper;
import tools.jackson.databind.node.ObjectNode;

/**
 * Some ChirpStack decoders put lists into {@code object} that a mapping cannot read: the SenseCAP
 * message frames ({@code messages[i][j]} of measurements) and sensor lists read beyond element 0
 * (Atmos-22 {@code sensors[1]}). Their uplink classes are generated with the discriminator
 * {@code <profileId>-flat}, so ingest drops the raw payload to this handler, which reshapes it
 * - {@code messages} into {@code measurements.m<id>}, every other list of objects into members
 * {@code <list>_<i>} - marks the profile id and ingests it again.
 */
@Component(name = UplinkFlattener.NAME, immediate = true)
public class UplinkFlattener implements UnknownModelHandler {

	static final String NAME = "UplinkFlattener";
	static final String FLAT = "-flat";

	private static final Logger logger = System.getLogger(UplinkFlattener.class.getName());
	private static final ObjectMapper json = new ObjectMapper();

	@Reference
	PayloadIngest ingest;

	private final Set<String> flattenedSources = ConcurrentHashMap.newKeySet();

	@Override
	public void onUnknownModel(UnknownPayload payload) {
		if (!PayloadIngest.FORMAT_JSON.equals(payload.format()) && !PayloadIngest.FORMAT_AUTO.equals(payload.format())) {
			return;
		}
		Optional<byte[]> flat = flatten(payload.payload());
		if (flat.isEmpty()) {
			return;
		}
		flattenedSources.add(payload.source());
		IngestResult result = ingest.ingest(flat.get(), PayloadIngest.FORMAT_JSON, payload.source());
		logger.log(result.isApplied() ? Level.DEBUG : Level.WARNING, "flattened uplink from {0}: {1}", payload.source(), result);
	}

	/** The drops of a source this handler flattens are expected, so ingest logs them quietly. */
	@Override
	public boolean isCollecting(String source) {
		return flattenedSources.contains(source);
	}

	/** The payload with the lists of {@code object} reshaped and the profile id marked; empty when there is nothing to flatten. */
	static Optional<byte[]> flatten(byte[] payload) {
		JsonNode root;
		try {
			root = json.readTree(payload);
		} catch (RuntimeException e) {
			return Optional.empty();
		}
		JsonNode profile = root.path("deviceInfo").path("deviceProfileId");
		if (!(root.path("object") instanceof ObjectNode object) || !profile.isString() || profile.asString().endsWith(FLAT)) {
			return Optional.empty();
		}
		boolean flattened = false;
		for (String member : List.copyOf(object.propertyNames())) {
			JsonNode list = object.get(member);
			if (!list.isArray() || list.isEmpty()) {
				continue;
			}
			if ("messages".equals(member)) {
				object.set("measurements", measurements(list));
			} else if (list.valueStream().allMatch(JsonNode::isObject)) {
				for (int i = 0; i < list.size(); i++) {
					object.set(member + "_" + i, list.get(i));
				}
			} else {
				continue;
			}
			object.remove(member);
			flattened = true;
		}
		if (!flattened) {
			return Optional.empty();
		}
		((ObjectNode) root.get("deviceInfo")).put("deviceProfileId", profile.asString() + FLAT);
		return Optional.of(root.toString().getBytes(StandardCharsets.UTF_8));
	}

	/** {@code m<measurementId>: measurementValue} over all frames; an id {@code 4097.0} is {@code m4097}. */
	static ObjectNode measurements(JsonNode frames) {
		ObjectNode measurements = json.createObjectNode();
		List<JsonNode> flat = new ArrayList<>();
		frames.forEach(frame -> {
			if (frame.isArray()) {
				frame.forEach(flat::add);
			} else {
				flat.add(frame);
			}
		});
		for (JsonNode measurement : flat) {
			JsonNode id = measurement.path("measurementId");
			if (!id.isMissingNode() && measurement.has("measurementValue")) {
				String key = "m" + (id.isNumber() ? String.valueOf(id.asLong()) : id.asString());
				measurements.set(key, measurement.get("measurementValue"));
			}
		}
		return measurements;
	}

	static Map<String, Object> asMap(JsonNode node) {
		return json.convertValue(node, Map.class);
	}
}
