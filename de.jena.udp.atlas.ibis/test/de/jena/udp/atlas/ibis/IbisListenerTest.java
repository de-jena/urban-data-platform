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

import java.util.Map;

import org.junit.jupiter.api.Test;

import de.jena.model.ibis.common.IbisCommonPackage;

class IbisListenerTest {

	@Test
	void loadOptionsHintAnIbisClassWithoutOverridingThePayloadsEClass() {
		Map<String, Object> options = IbisListener.loadOptions(IbisCommonPackage.eINSTANCE, new IbisDateReader());

		assertEquals("eClass", options.get("codec.typeKey"));
		assertEquals("HINT", options.get("codec.typeHintMode"));
		assertEquals(IbisCommonPackage.eINSTANCE.getGeneralResponse(), options.get("codec.rootType"));
	}
}
