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

import java.math.BigDecimal;
import java.math.BigInteger;

import org.eclipse.sensinact.gateway.geojson.GeoJsonObject;

import tools.jackson.core.json.JsonReadFeature;
import tools.jackson.databind.ObjectMapper;
import tools.jackson.databind.json.JsonMapper;

/**
 * Turns the stored columns of a history row back into the Java value the
 * resource had. Mirrors the decoding of the sensiNact Timescale provider so a
 * rehydrated resource carries the same value the history provider would return
 * for it, including the narrowing legacy rows without a Java type fall back to.
 * 
 * @author Guido Grune
 * @since Sep 15, 2026
 */
public class HistoryValueDecoder {

	/** Ordinals of the sensiNact {@code ValueKind} enum, as stored in the schema. */
	public static final short NUMBER = 0;
	public static final short BOOLEAN = 1;
	public static final short STRING = 2;
	public static final short GEOJSON = 3;
	public static final short OBJECT = 4;

	private final ObjectMapper mapper = JsonMapper.builder().enable(JsonReadFeature.ALLOW_NON_NUMERIC_NUMBERS).build();

	public Object decode(short valueKind, String javaType, String numericLiteral, String json) {
		if (valueKind == NUMBER) {
			return decodeNumber(numericLiteral, javaType);
		}
		if (json == null) {
			return null;
		}
		return switch (valueKind) {
		case BOOLEAN -> mapper.readValue(json, Boolean.class);
		case STRING -> mapper.readValue(json, String.class);
		case GEOJSON -> mapper.readValue(json, GeoJsonObject.class);
		case OBJECT -> mapper.readValue(json, Object.class);
		default -> throw new IllegalArgumentException("Unknown history value kind " + valueKind);
		};
	}

	private static Object decodeNumber(String literal, String javaType) {
		if (literal == null) {
			return null;
		}
		if (javaType == null) {
			return decodeUntypedNumber(literal);
		}
		return switch (javaType) {
		case "java.lang.Long" -> Long.valueOf(literal);
		case "java.lang.Integer" -> Integer.valueOf(literal);
		case "java.lang.Short" -> Short.valueOf(literal);
		case "java.lang.Byte" -> Byte.valueOf(literal);
		case "java.lang.Double" -> decodeDouble(literal);
		case "java.lang.Float" -> decodeDouble(literal).floatValue();
		case "java.math.BigInteger" -> new BigInteger(literal);
		default -> new BigDecimal(literal);
		};
	}

	private static Object decodeUntypedNumber(String literal) {
		return switch (literal) {
		case "NaN", "Infinity", "-Infinity" -> decodeDouble(literal);
		default -> {
			BigDecimal stored = new BigDecimal(literal);
			yield stored.scale() <= 0 ? (Object) stored.longValueExact() : (Object) stored.doubleValue();
		}
		};
	}

	private static Double decodeDouble(String literal) {
		return switch (literal) {
		case "NaN" -> Double.NaN;
		case "Infinity" -> Double.POSITIVE_INFINITY;
		case "-Infinity" -> Double.NEGATIVE_INFINITY;
		default -> Double.valueOf(literal);
		};
	}
}
