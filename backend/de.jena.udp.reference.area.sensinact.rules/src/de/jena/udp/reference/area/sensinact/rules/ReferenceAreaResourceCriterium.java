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
package de.jena.udp.reference.area.sensinact.rules;

import java.util.function.BiPredicate;
import java.util.function.Predicate;

import org.eclipse.sensinact.core.snapshot.ICriterion;
import org.eclipse.sensinact.core.snapshot.ProviderSnapshot;
import org.eclipse.sensinact.core.snapshot.ResourceSnapshot;
import org.eclipse.sensinact.core.snapshot.ResourceValueFilter;
import org.eclipse.sensinact.core.snapshot.ServiceSnapshot;
import org.eclipse.sensinact.gateway.geojson.GeoJsonObject;

/**
 * 
 * @author ilenia
 * @since Nov 4, 2025
 */
public class ReferenceAreaResourceCriterium implements ICriterion{

	/* 
	 * (non-Javadoc)
	 * @see org.eclipse.sensinact.core.snapshot.ICriterion#getLocationFilter()
	 */
	@Override
	public BiPredicate<ProviderSnapshot, GeoJsonObject> getLocationFilter() {
		return (snapshot, geo) -> true;
	}

	/* 
	 * (non-Javadoc)
	 * @see org.eclipse.sensinact.core.snapshot.ICriterion#getProviderFilter()
	 */
	@Override
	public Predicate<ProviderSnapshot> getProviderFilter() {
		return snapshot -> {
			return snapshot.getName().startsWith("chirpstack") && snapshot.getName().endsWith("-derived");
		};
	}

	/* 
	 * (non-Javadoc)
	 * @see org.eclipse.sensinact.core.snapshot.ICriterion#getServiceFilter()
	 */
	@Override
	public Predicate<ServiceSnapshot> getServiceFilter() {
		return snapshot -> {
			return snapshot.getName().equals("derivedQuantities");
		};
	}

	/* 
	 * (non-Javadoc)
	 * @see org.eclipse.sensinact.core.snapshot.ICriterion#getResourceFilter()
	 */
	@Override
	public Predicate<ResourceSnapshot> getResourceFilter() {
		return snapshot -> {
			return snapshot.getName().startsWith("pfWert");
		};
	}

	/* 
	 * (non-Javadoc)
	 * @see org.eclipse.sensinact.core.snapshot.ICriterion#getResourceValueFilter()
	 */
	@Override
	public ResourceValueFilter getResourceValueFilter() {
		return (provider, resources) -> true;
	}

}
