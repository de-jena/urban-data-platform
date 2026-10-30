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
package de.jena.udp.atlas.rules;

import static org.mockito.ArgumentMatchers.anyString;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

import java.time.Instant;
import java.util.Arrays;
import java.util.List;
import java.util.Map;

import org.eclipse.sensinact.core.snapshot.ProviderSnapshot;
import org.eclipse.sensinact.core.snapshot.ResourceSnapshot;
import org.eclipse.sensinact.core.snapshot.ServiceSnapshot;
import org.eclipse.sensinact.core.twin.TimedValue;

/** Provider snapshots as the rules engine hands them to a rule, built from values. */
final class Snapshots {

	private Snapshots() {
	}

	static ProviderSnapshot provider(String name, String model, ServiceSnapshot... services) {
		ProviderSnapshot provider = mock(ProviderSnapshot.class);
		when(provider.getName()).thenReturn(name);
		when(provider.getModelName()).thenReturn(model);
		List<ServiceSnapshot> list = Arrays.asList(services);
		when(provider.getServices()).thenReturn(list);
		when(provider.getService(anyString())).thenAnswer(call -> list.stream()
				.filter(service -> service.getName().equals(call.getArgument(0))).findFirst().orElse(null));
		when(provider.getResource(anyString(), anyString())).thenAnswer(call -> {
			ServiceSnapshot service = provider.getService(call.getArgument(0));
			return service == null ? null : service.getResource(call.getArgument(1));
		});
		return provider;
	}

	static ServiceSnapshot service(String name, ResourceSnapshot... resources) {
		ServiceSnapshot service = mock(ServiceSnapshot.class);
		when(service.getName()).thenReturn(name);
		List<ResourceSnapshot> list = Arrays.asList(resources);
		when(service.getResources()).thenReturn(list);
		when(service.getResource(anyString())).thenAnswer(call -> list.stream()
				.filter(resource -> resource.getName().equals(call.getArgument(0))).findFirst().orElse(null));
		return service;
	}

	static ResourceSnapshot resource(String name, Object value, Instant timestamp) {
		return resource(name, value, timestamp, Map.of());
	}

	@SuppressWarnings({ "unchecked", "rawtypes" })
	static ResourceSnapshot resource(String name, Object value, Instant timestamp, Map<String, Object> metadata) {
		TimedValue timed = mock(TimedValue.class);
		when(timed.getValue()).thenReturn(value);
		when(timed.getTimestamp()).thenReturn(timestamp);
		ResourceSnapshot resource = mock(ResourceSnapshot.class);
		when(resource.getName()).thenReturn(name);
		when(resource.isSet()).thenReturn(true);
		when(resource.getValue()).thenReturn(timed);
		when(resource.getMetadata()).thenReturn(metadata);
		return resource;
	}
}
