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

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.time.Instant;
import java.util.ArrayList;
import java.util.List;

import org.eclipse.fennec.event.atlas.southbound.common.IngestResult;
import org.eclipse.fennec.event.atlas.southbound.common.PayloadIngest;
import org.eclipse.fennec.event.atlas.southbound.common.UnknownPayload;
import org.junit.jupiter.api.Test;

import tools.jackson.databind.JsonNode;
import tools.jackson.databind.ObjectMapper;

class UplinkFlattenerTest {

	static final Path S2120_UPLINK = Path.of("../de.jena.chirpstack.sensinact/examples/example2.json");
	static final String SOURCE = "chirpstack/application/3a24ad7f-be3e-4679-bdd6-789209c75560/device/2cf7f1c0443002c8/event/up";

	private final List<String> ingested = new ArrayList<>();
	private final UplinkFlattener flattener = new UplinkFlattener();

	@Test
	void theTenMeasurementsOfThreeFramesBecomeMembersKeyedByIdWithAFlatProfile() throws IOException {
		JsonNode flat = read(UplinkFlattener.flatten(Files.readAllBytes(S2120_UPLINK)).orElseThrow());

		assertEquals(10, flat.at("/object/measurements").size());
		assertEquals(24.4, flat.at("/object/measurements/m4097").asDouble());
		assertEquals(278.638, flat.at("/object/measurements/m4213").asDouble());
		assertTrue(flat.at("/object/messages").isMissingNode());
		assertEquals("b6a1cea0-c82d-4261-b32c-cf4d2e1f97fb-flat", flat.at("/deviceInfo/deviceProfileId").asString());
		assertEquals("2cf7f1c0443002c8", flat.at("/deviceInfo/devEui").asString());
	}

	@Test
	void aNumericMeasurementIdOfASingleFrameIsAnIdToo() {
		JsonNode flat = read(UplinkFlattener.flatten(uplink("{\"messages\":[{\"measurementId\":4097.0,\"measurementValue\":15.17}]}")).orElseThrow());

		assertEquals(15.17, flat.at("/object/measurements/m4097").asDouble());
	}

	@Test
	void aListOfObjectsBecomesOneMemberPerElement() {
		JsonNode flat = read(UplinkFlattener.flatten(uplink("{\"sensors\":[{\"wind_speed_ms\":3.2},{\"air_temperature_degC\":11.4}],\"BatV\":3.9}")).orElseThrow());

		assertEquals(3.2, flat.at("/object/sensors_0/wind_speed_ms").asDouble());
		assertEquals(11.4, flat.at("/object/sensors_1/air_temperature_degC").asDouble());
		assertEquals(3.9, flat.at("/object/BatV").asDouble());
		assertTrue(flat.at("/object/sensors").isMissingNode());
	}

	@Test
	void payloadsWithoutListsOrAlreadyFlatOrGarbageAreLeftAlone() throws IOException {
		byte[] alreadyFlat = UplinkFlattener.flatten(Files.readAllBytes(S2120_UPLINK)).orElseThrow();

		assertTrue(UplinkFlattener.flatten(alreadyFlat).isEmpty());
		assertTrue(UplinkFlattener.flatten(uplink("{\"battery\":69,\"tags\":[1,2]}")).isEmpty());
		assertTrue(UplinkFlattener.flatten("not json".getBytes(StandardCharsets.UTF_8)).isEmpty());
	}

	@Test
	void aDroppedUplinkIsIngestedAgainAndItsSourceIsThenExpectedToDrop() throws IOException {
		flattener.ingest = (payload, format, source) -> {
			ingested.add(format + " " + source);
			return IngestResult.applied(1, 1);
		};

		assertFalse(flattener.isCollecting(SOURCE));
		flattener.onUnknownModel(new UnknownPayload(Files.readAllBytes(S2120_UPLINK), PayloadIngest.FORMAT_JSON, SOURCE, null,
				IngestResult.Outcome.EMPTY, Instant.now()));

		assertEquals(List.of("json " + SOURCE), ingested);
		assertTrue(flattener.isCollecting(SOURCE));
	}

	@Test
	void anXmiPayloadIsNotTouched() {
		flattener.ingest = (payload, format, source) -> {
			ingested.add(source);
			return IngestResult.applied(1, 1);
		};

		flattener.onUnknownModel(new UnknownPayload("<xmi/>".getBytes(StandardCharsets.UTF_8), PayloadIngest.FORMAT_XMI, SOURCE, null,
				IngestResult.Outcome.MODEL_UNKNOWN, Instant.now()));

		assertTrue(ingested.isEmpty());
	}

	private static byte[] uplink(String object) {
		return ("{\"deviceInfo\":{\"deviceProfileId\":\"p1\",\"devEui\":\"d1\"},\"object\":" + object + "}").getBytes(StandardCharsets.UTF_8);
	}

	private static JsonNode read(byte[] payload) {
		return new ObjectMapper().readTree(payload);
	}
}
