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

import static org.junit.jupiter.api.Assertions.assertDoesNotThrow;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.nio.charset.StandardCharsets;

import org.junit.jupiter.api.Test;

class IlsaListenerTest {

	private final IlsaListener listener = new IlsaListener();

	@Test
	void aBareNumberOnAControlOrPhaseTopicIsIgnoredWithoutDecoding() {
		assertDoesNotThrow(() -> listener.handle("5g/ilsa/K441/control/df9", bytes("3")));
		assertDoesNotThrow(() -> listener.handle("5g/ilsa/K440/tk1/phase", bytes(" 12\n")));
	}

	@Test
	void onlyAJsonObjectCountsAsASignalState() {
		assertTrue(IlsaListener.isJsonObject(bytes("  {\"id\":\"K1/1\"}")));
		assertFalse(IlsaListener.isJsonObject(bytes("3")));
		assertFalse(IlsaListener.isJsonObject(bytes("[1,2]")));
		assertFalse(IlsaListener.isJsonObject(bytes("")));
	}

	private static byte[] bytes(String text) {
		return text.getBytes(StandardCharsets.UTF_8);
	}
}
