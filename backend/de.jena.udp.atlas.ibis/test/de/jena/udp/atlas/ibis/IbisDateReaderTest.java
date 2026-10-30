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
package de.jena.udp.atlas.ibis;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

import java.io.IOException;
import java.time.Instant;
import java.util.Locale;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class IbisDateReaderTest {

	private final IbisDateReader reader = new IbisDateReader();
	private Locale defaultLocale;

	@BeforeEach
	void germanJvm() {
		defaultLocale = Locale.getDefault();
		Locale.setDefault(Locale.GERMANY);
	}

	@AfterEach
	void restoreLocale() {
		Locale.setDefault(defaultLocale);
	}

	@Test
	void bridgeTimestampsAreLocalTimesWithAnEnglishZoneName() throws IOException {
		assertEquals(Instant.parse("2026-01-07T10:07:08Z"), instant("2026-01-07T11:07:08.000ZCET"));
		assertEquals(Instant.parse("2026-07-07T09:07:08Z"), instant("2026-07-07T11:07:08.000ZCEST"));
	}

	@Test
	void xmlSchemaLexicalFormsAreAccepted() throws IOException {
		assertEquals(Instant.parse("2026-01-07T10:07:08Z"), instant("2026-01-07T11:07:08.000+01:00"));
		assertEquals(2026, reader.parse("2026-01-07").getYear());
		assertEquals(7, reader.parse("2026-01-07").getDay());
	}

	@Test
	void anythingElseIsRejected() {
		assertThrows(IOException.class, () -> reader.parse("07.01.2026 11:07"));
	}

	private Instant instant(String text) throws IOException {
		return IbisDateBlackBox.toInstant(reader.parse(text));
	}
}
