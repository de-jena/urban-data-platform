/**
 * Copyright (c) 2012 - 2025 Data In Motion and others.
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
package org.eclipse.fennec.weather.sensinact;

import static java.time.Duration.ofDays;
import java.time.Instant;

import org.eclipse.sensinact.core.push.DataUpdate;
import org.eclipse.sensinact.core.push.dto.GenericDto;
import org.osgi.service.component.annotations.Activate;
import org.osgi.service.component.annotations.Component;
import org.osgi.service.component.annotations.Reference;

/**
 * 
 * @author ilenia
 * @since Jul 10, 2025
 */
//@Component(immediate = true, name = "TestComponent")
public class TestComponent {
	
    private static final Instant TS_2012 = Instant.parse("2024-01-01T00:00:00.00Z");

	
	@Reference
	private DataUpdate push;
	
	@Activate
	public void activate() {
		 for (int i = 0; i < 1000; i++) {
	            createResource("foo", "bar", "baz", String.valueOf(i), TS_2012.plus(ofDays(i)));
	        }
	}
	
	private void createResource(String provider, String service, String resource, Object value, Instant instant) {
        GenericDto dto = new GenericDto();
        dto.provider = provider;
        dto.service = service;
        dto.resource = resource;
        dto.type = value.getClass();
        dto.value = value;
        dto.timestamp = instant;
        try {
            push.pushUpdate(dto).getValue();
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

}
