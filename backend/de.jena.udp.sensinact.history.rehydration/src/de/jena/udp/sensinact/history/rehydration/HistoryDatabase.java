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

import java.sql.Connection;
import java.sql.DatabaseMetaData;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Timestamp;
import java.time.Instant;
import java.util.ArrayList;
import java.util.List;

import org.postgresql.ds.PGSimpleDataSource;

/**
 * Read-only access to the sensiNact history database, independent of the
 * history provider itself: the restore has to run before any southbound data
 * arrives, and the provider exposes no way to enumerate the resources it knows.
 * 
 * @author Guido Grune
 * @since Sep 15, 2026
 */
public class HistoryDatabase {

	private final PGSimpleDataSource dataSource = new PGSimpleDataSource();
	private final HistoryValueDecoder decoder = new HistoryValueDecoder();

	public HistoryDatabase(String url, String user, String password) {
		dataSource.setURL(url);
		if (user != null && !user.isBlank()) {
			dataSource.setUser(user);
			dataSource.setPassword(password);
		}
		dataSource.setReadOnly(true);
	}

	public List<HistoryRecord> latestValuesSince(Instant cutOff) throws SQLException {
		try (Connection connection = dataSource.getConnection()) {
			HistorySchema schema = detectSchema(connection);
			return readLatestValues(connection, schema, cutOff);
		}
	}

	private static HistorySchema detectSchema(Connection connection) throws SQLException {
		DatabaseMetaData metaData = connection.getMetaData();
		try (ResultSet tables = metaData.getTables(null, "sensinact", "history", null)) {
			return tables.next() ? HistorySchema.UNIFIED : HistorySchema.LEGACY;
		}
	}

	private List<HistoryRecord> readLatestValues(Connection connection, HistorySchema schema, Instant cutOff)
			throws SQLException {
		List<HistoryRecord> records = new ArrayList<>();
		try (PreparedStatement statement = connection.prepareStatement(schema.latestValuePerResource())) {
			for (int parameter = 1; parameter <= schema.cutOffParameters(); parameter++) {
				statement.setTimestamp(parameter, Timestamp.from(cutOff));
			}
			try (ResultSet rows = statement.executeQuery()) {
				while (rows.next()) {
					records.add(toRecord(rows));
				}
			}
		}
		return records;
	}

	private HistoryRecord toRecord(ResultSet row) throws SQLException {
		Object value = decoder.decode(row.getShort("value_kind"), row.getString("java_type"),
				row.getString("value_num"), row.getString("value_json"));
		return new HistoryRecord(row.getString("modelpackageuri"), row.getString("model"), row.getString("provider"),
				row.getString("service"), row.getString("resource"), row.getTimestamp("time").toInstant(), value);
	}
}
