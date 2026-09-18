/*
 * Copyright (c) 2012 - 2026 Data In Motion and others.
 * All rights reserved. 
 * 
 * This program and the accompanying materials are made
 * available under the terms of the Eclipse Public License 2.0
 * which is available at https://www.eclipse.org/legal/epl-2.0/
 * 
 * SPDX-License-Identifier: EPL-2.0
 * 
 * Contributors:
 *     Data In Motion - initial API and implementation
 */
package de.jena.udp.sensinact.history.rehydration;

import static de.jena.udp.sensinact.history.rehydration.HistoryValueDecoder.BOOLEAN;
import static de.jena.udp.sensinact.history.rehydration.HistoryValueDecoder.GEOJSON;
import static de.jena.udp.sensinact.history.rehydration.HistoryValueDecoder.NUMBER;
import static de.jena.udp.sensinact.history.rehydration.HistoryValueDecoder.OBJECT;
import static de.jena.udp.sensinact.history.rehydration.HistoryValueDecoder.STRING;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNull;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.Map;

import org.eclipse.sensinact.gateway.geojson.Point;
import org.junit.jupiter.api.Test;

class HistoryValueDecoderTest {

	private final HistoryValueDecoder decoder = new HistoryValueDecoder();

	@Test
	void restoresTheExactNumberTypeWhenTheRowKnowsIt() {
		assertEquals(42L, decoder.decode(NUMBER, "java.lang.Long", "42", null));
		assertEquals(42, decoder.decode(NUMBER, "java.lang.Integer", "42", null));
		assertEquals((short) 42, decoder.decode(NUMBER, "java.lang.Short", "42", null));
		assertEquals(4.25d, decoder.decode(NUMBER, "java.lang.Double", "4.25", null));
		assertEquals(4.25f, decoder.decode(NUMBER, "java.lang.Float", "4.25", null));
		assertEquals(new BigInteger("42"), decoder.decode(NUMBER, "java.math.BigInteger", "42", null));
		assertEquals(new BigDecimal("4.25"), decoder.decode(NUMBER, "java.math.BigDecimal", "4.25", null));
	}

	@Test
	void narrowsMigratedNumbersWithoutAJavaTypeLikeTheLegacyProviderDid() {
		assertEquals(42L, decoder.decode(NUMBER, null, "42", null));
		assertEquals(4.25d, decoder.decode(NUMBER, null, "4.25", null));
	}

	@Test
	void keepsTheSpecialDoubleLiteralsPostgresStores() {
		assertEquals(Double.NaN, decoder.decode(NUMBER, null, "NaN", null));
		assertEquals(Double.POSITIVE_INFINITY, decoder.decode(NUMBER, null, "Infinity", null));
		assertEquals(Double.NEGATIVE_INFINITY, decoder.decode(NUMBER, "java.lang.Double", "-Infinity", null));
	}

	@Test
	void readsTextAndBooleanBackFromTheirJsonForm() {
		assertEquals("a value", decoder.decode(STRING, "java.lang.String", null, "\"a value\""));
		assertEquals(Boolean.TRUE, decoder.decode(BOOLEAN, "java.lang.Boolean", null, "true"));
	}

	@Test
	void readsALocationBackAsAGeoJsonObject() {
		String json = "{\"type\":\"Point\",\"coordinates\":[11.59049,50.901165]}";

		Object restored = decoder.decode(GEOJSON, null, null, json);

		assertTrue(restored instanceof Point);
		Point location = (Point) restored;
		assertEquals(11.59049, location.coordinates().longitude());
		assertEquals(50.901165, location.coordinates().latitude());
	}

	@Test
	void readsAStructuredValueBackAsAMap() {
		Object restored = decoder.decode(OBJECT, "java.util.Map", null, "{\"count\":3}");

		assertTrue(restored instanceof Map);
	}

	@Test
	void treatsAnAbsentValueAsNull() {
		assertNull(decoder.decode(NUMBER, "java.lang.Long", null, null));
		assertNull(decoder.decode(STRING, "java.lang.String", null, null));
	}
}
