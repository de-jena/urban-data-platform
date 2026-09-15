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

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNull;

import java.time.Instant;
import java.util.List;

import org.eclipse.sensinact.core.push.dto.BulkGenericDto;
import org.eclipse.sensinact.core.push.dto.GenericDto;
import org.junit.jupiter.api.Test;

class TwinUpdatesTest {

	private static final Instant LAST_SEEN = Instant.parse("2026-08-25T04:35:14Z");

	private static HistoryRecord busLocation() {
		return new HistoryRecord("https://jena.de/models/ibis/sensinact/1.0", "IbisDevice", "bus359", "admin",
				"location", LAST_SEEN, "a location");
	}

	@Test
	void addressesTheResourceTheHistoryRowCameFrom() {
		GenericDto update = TwinUpdates.restoring(busLocation());

		assertEquals("https://jena.de/models/ibis/sensinact/1.0", update.modelPackageUri);
		assertEquals("IbisDevice", update.model);
		assertEquals("bus359", update.provider);
		assertEquals("admin", update.service);
		assertEquals("location", update.resource);
		assertEquals("a location", update.value);
	}

	@Test
	void keepsTheOriginalTimestampSoFresherDeviceDataWins() {
		assertEquals(LAST_SEEN, TwinUpdates.restoring(busLocation()).timestamp);
	}

	@Test
	void leavesTheTypeToTheModelInsteadOfGuessingIt() {
		assertNull(TwinUpdates.restoring(busLocation()).type);
	}

	@Test
	void carriesEveryRecordOfABatchIntoOneBulkUpdate() {
		HistoryRecord temperature = new HistoryRecord("https://model.data.jena.de/sensinact/chirpstack/1.0", "DDS45",
				"sensor1", "data", "temperature", LAST_SEEN, 21.5d);

		BulkGenericDto bulk = TwinUpdates.restoring(List.of(busLocation(), temperature));

		assertEquals(2, bulk.dtos.size());
		assertEquals("bus359", bulk.dtos.get(0).provider);
		assertEquals("sensor1", bulk.dtos.get(1).provider);
	}
}
