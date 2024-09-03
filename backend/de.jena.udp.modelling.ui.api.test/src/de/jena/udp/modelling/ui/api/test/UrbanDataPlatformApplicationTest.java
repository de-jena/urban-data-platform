/**
 * Copyright (c) 2012 - 2023 Data In Motion and others.
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
package de.jena.udp.modelling.ui.api.test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.osgi.service.jakartars.runtime.JakartarsServiceRuntime;
import org.osgi.test.common.annotation.InjectService;
import org.osgi.test.common.service.ServiceAware;
import org.osgi.test.junit5.context.BundleContextExtension;
import org.osgi.test.junit5.service.ServiceExtension;

//import org.mockito.Mock;
//import org.mockito.junit.jupiter.MockitoExtension;

/**
 * See documentation here: https://github.com/osgi/osgi-test
 * https://github.com/osgi/osgi-test/wiki Examples:
 * https://github.com/osgi/osgi-test/tree/main/examples
 */
@ExtendWith(BundleContextExtension.class)
@ExtendWith(ServiceExtension.class)
//@ExtendWith(MockitoExtension.class)
public class UrbanDataPlatformApplicationTest {

//	@Mock
//	TestInterface test;

//	@BeforeEach
//	public void before(@InjectBundleContext BundleContext ctx) {
//
//	}

//	@Test
	public void test(@InjectService(cardinality = 0) ServiceAware<JakartarsServiceRuntime> jsrAware)
			throws InterruptedException {
		JakartarsServiceRuntime jsr = jsrAware.waitForService(1000);
		assertNotNull(jsr);

		assertEquals(1, jsr.getRuntimeDTO().applicationDTOs.length);
	}

}
