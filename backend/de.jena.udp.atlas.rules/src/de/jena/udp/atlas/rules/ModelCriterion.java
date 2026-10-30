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

import java.util.List;
import java.util.Set;
import java.util.function.BiPredicate;
import java.util.function.Predicate;

import org.eclipse.sensinact.core.snapshot.ICriterion;
import org.eclipse.sensinact.core.snapshot.ProviderSnapshot;
import org.eclipse.sensinact.core.snapshot.ResourceSnapshot;
import org.eclipse.sensinact.core.snapshot.ResourceValueFilter;
import org.eclipse.sensinact.core.snapshot.ServiceSnapshot;
import org.eclipse.sensinact.gateway.geojson.GeoJsonObject;

/** Selects providers by model name and the resources by service and resource name. */
record ModelCriterion(Set<String> models, Predicate<ProviderSnapshot> moreProviders, Set<String> services,
		Set<String> resources) implements ICriterion {

	static ModelCriterion of(List<String> models, String service, String resource) {
		return new ModelCriterion(Set.copyOf(models), provider -> false, Set.of(service), Set.of(resource));
	}

	@Override
	public BiPredicate<ProviderSnapshot, GeoJsonObject> getLocationFilter() {
		return null;
	}

	@Override
	public Predicate<ProviderSnapshot> getProviderFilter() {
		return provider -> models.contains(provider.getModelName()) || moreProviders.test(provider);
	}

	@Override
	public Predicate<ServiceSnapshot> getServiceFilter() {
		return service -> services.contains(service.getName());
	}

	@Override
	public Predicate<ResourceSnapshot> getResourceFilter() {
		return resource -> resources.contains(resource.getName());
	}

	@Override
	public ResourceValueFilter getResourceValueFilter() {
		return null;
	}
}
