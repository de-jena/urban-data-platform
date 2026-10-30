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
import java.nio.charset.StandardCharsets;

import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.junit.jupiter.api.Test;

import de.jena.model.ibis.gnsslocationservice.IbisGNSSLocationServicePackage;

class IbisListenerTest {

	@Test
	void rootTypeComesFromTheEClassKeyWhereverItIsInTheObject() throws IOException {
		String payload = """
				{ "latitude": { "Degree": { "Value": 50.9 } },
				  "eClass": "https://jena.de/models/ibis/gnsslocationservice/1.0#//GNSSLocationData",
				  "altitude": { "Value": 155.0 } }""";
		ResourceSet resourceSet = new ResourceSetImpl();
		resourceSet.getPackageRegistry().put(IbisGNSSLocationServicePackage.eNS_URI, IbisGNSSLocationServicePackage.eINSTANCE);

		assertEquals(IbisGNSSLocationServicePackage.eINSTANCE.getGNSSLocationData(),
				IbisListener.rootType(payload.getBytes(StandardCharsets.UTF_8), resourceSet));
	}

	@Test
	void aPayloadWithoutEClassIsRejected() {
		assertThrows(IOException.class,
				() -> IbisListener.rootClassUri("{ \"Value\": 1 }".getBytes(StandardCharsets.UTF_8)));
	}
}
