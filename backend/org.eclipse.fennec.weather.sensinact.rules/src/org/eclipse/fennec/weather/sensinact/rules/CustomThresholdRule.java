/*
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

import org.eclipse.sensinact.core.snapshot.ICriterion;
import org.eclipse.sensinact.core.snapshot.ProviderSnapshot;
import org.eclipse.sensinact.core.snapshot.ResourceSnapshot;
import org.eclipse.sensinact.core.snapshot.ServiceSnapshot;
import org.eclipse.sensinact.southbound.rules.api.ResourceUpdater;
import org.eclipse.sensinact.southbound.rules.api.RuleDefinition;
import org.osgi.service.component.annotations.Activate;
import org.osgi.service.metatype.annotations.Designate;

//@Component(immediate = true, name = "CustomThresholdRule", service = RuleDefinition.class, configurationPid = "CustomThresholdRule", configurationPolicy = ConfigurationPolicy.REQUIRE)
@Designate(ocd = CustomRuleConfig.class)
public class CustomThresholdRule implements RuleDefinition {

	private String providerName;
	private String serviceName;
	private String resourceName;
	private int threshold;

	@Activate
    public void activate(CustomRuleConfig config) {
        this.providerName = config.providerName();
        this.serviceName = config.serviceName();
        this.resourceName = config.resourceName();
        this.threshold = config.threshold();
    }

	/* 
	 * (non-Javadoc)
	 * @see org.eclipse.sensinact.southbound.rules.api.RuleDefinition#evaluate(java.util.List, org.eclipse.sensinact.southbound.rules.api.ResourceUpdater)
	 */
	@Override
	public void evaluate(List<ProviderSnapshot> providerSnapshots, ResourceUpdater resourceUpdater) {
		// The list of snapshots will already be filtered by the ICriterion.
        // We just need to check the value and perform the action.
		System.out.println(providerSnapshots.size());
		
        for (ProviderSnapshot snapshot : providerSnapshots) {
            ServiceSnapshot serviceSnapshot = snapshot.getService(serviceName);
            if (serviceSnapshot != null) {
            	System.out.println("service not null " + serviceName);
                ResourceSnapshot resourceSnapshot = serviceSnapshot.getResource(resourceName);
                if (resourceSnapshot != null && resourceSnapshot.getValue().getValue() instanceof Number) {
                    System.out.println("Res value: " + resourceSnapshot.getValue().getValue());
                	Number value = (Number) resourceSnapshot.getValue().getValue();
                    
                    if (value.intValue() > threshold) {
                        System.out.println("Alert! Value of resource '" + resourceName + "' is above " + threshold + ". Current value: " + value);
                        // Implement other actions here, such as updating a resource via the 'updater'.
                       resourceUpdater.updateResource(providerName, serviceName, "windAlert", true);
                       
                    }
                }
            }
        }

	}

	/* 
	 * (non-Javadoc)
	 * @see org.eclipse.sensinact.southbound.rules.api.RuleDefinition#getInputFilter()
	 */
	@Override
	public ICriterion getInputFilter() {
		return new CustomResourceCriterion(providerName, serviceName, resourceName);
	}

}
