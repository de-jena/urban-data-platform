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

/**
 * The two shapes the sensiNact history database can have: the unified
 * {@code sensinact.history} table, and the three typed tables that preceded it.
 * Both queries project the same columns so a single decoder serves either, and
 * both return exactly one row per resource - the newest one within the cut-off.
 * 
 * @author Guido Grune
 * @since Sep 15, 2026
 */
public enum HistorySchema {

	UNIFIED("""
			SELECT DISTINCT ON (provider, service, resource) \
			modelpackageuri, model, provider, service, resource, time, \
			value_kind, java_type, value_num::text AS value_num, value_json::text AS value_json \
			FROM sensinact.history WHERE time >= ? \
			ORDER BY provider, service, resource, time DESC\
			""", 1),

	LEGACY("""
			SELECT DISTINCT ON (provider, service, resource) * FROM ( \
			SELECT modelpackageuri, model, provider, service, resource, time, \
			0::smallint AS value_kind, NULL::text AS java_type, data::text AS value_num, NULL::text AS value_json \
			FROM sensinact.numeric_data WHERE time >= ? \
			UNION ALL \
			SELECT modelpackageuri, model, provider, service, resource, time, \
			2::smallint, 'java.lang.String', NULL::text, to_jsonb(data)::text \
			FROM sensinact.text_data WHERE time >= ? \
			UNION ALL \
			SELECT modelpackageuri, model, provider, service, resource, time, \
			3::smallint, NULL::text, NULL::text, ST_AsGeoJSON(data)::text \
			FROM sensinact.geo_data WHERE time >= ? \
			) latest ORDER BY provider, service, resource, time DESC\
			""", 3);

	private final String latestValuePerResource;
	private final int cutOffParameters;

	HistorySchema(String latestValuePerResource, int cutOffParameters) {
		this.latestValuePerResource = latestValuePerResource;
		this.cutOffParameters = cutOffParameters;
	}

	public String latestValuePerResource() {
		return latestValuePerResource;
	}

	/** How often the cut-off timestamp has to be bound in {@link #latestValuePerResource()}. */
	public int cutOffParameters() {
		return cutOffParameters;
	}
}
