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
package org.eclipse.fennec.weather.sensinact.rules;

import java.util.List;
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
 * @since Aug 12, 2025
 */
public class CustomResourceCriterion implements ICriterion {
	
	private final String serviceProvider;
    private final String serviceName;
    private final String resourceName;

    public CustomResourceCriterion(String serviceProvider, String serviceName, String resourceName) {
        this.serviceProvider = serviceProvider;
        this.serviceName = serviceName;
        this.resourceName = resourceName;
    }

	/* 
	 * (non-Javadoc)
	 * @see org.eclipse.sensinact.core.snapshot.ICriterion#getProviderFilter()
	 */
	@Override
	public Predicate<ProviderSnapshot> getProviderFilter() {
		 // Filter by the provider's name.
		return snapshot -> {
//		    System.out.println("Checking Provider: " + snapshot.getName());
		    return serviceProvider.equals(snapshot.getName());
		};

	}

	/* 
	 * (non-Javadoc)
	 * @see org.eclipse.sensinact.core.snapshot.ICriterion#getResourceFilter()
	 */
	@Override
	public Predicate<ResourceSnapshot> getResourceFilter() {
		// Filter by the resource's name.
        return snapshot -> {
        	System.out.println("Checking Resource: " + snapshot.getName() + " " + resourceName.equals(snapshot.getName()));
        	return resourceName.equals(snapshot.getName());
        };
	}

	/* 
	 * (non-Javadoc)
	 * @see org.eclipse.sensinact.core.snapshot.ICriterion#getResourceValueFilter()
	 */
	@Override
	public ResourceValueFilter getResourceValueFilter() {
		// Return null here, as the threshold check will be done in the evaluate method.
        // An alternative would be to implement the check here if the API allows it,
        // but for simplicity and to match the 'evaluate' method logic, we'll keep it there.
        return new ResourceValueFilter() {

			@Override
			public boolean test(ProviderSnapshot provider, List<? extends ResourceSnapshot> resources) {
				return true;
			}
		};
	}

	/* 
	 * (non-Javadoc)
	 * @see org.eclipse.sensinact.core.snapshot.ICriterion#getServiceFilter()
	 */
	@Override
	public Predicate<ServiceSnapshot> getServiceFilter() {
		// Filter by the service's name.
        return snapshot -> {
//        	System.out.println("Checking Service: " + snapshot.getName());
        	return serviceName.equals(snapshot.getName());
        };
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see org.eclipse.sensinact.core.snapshot.ICriterion#getLocationFilter()
	 */
	@Override
	public BiPredicate<ProviderSnapshot, GeoJsonObject> getLocationFilter() {
		// We don't care about location, so return a predicate that always returns true.
		return (snapshot, geo) -> true;
	}
}
