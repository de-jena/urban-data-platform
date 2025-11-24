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
package de.jena.chirpstack.sensinact.rules;

import java.time.Instant;
import java.util.Comparator;
import java.util.List;
import java.util.logging.Logger;

import org.eclipse.sensinact.core.snapshot.ICriterion;
import org.eclipse.sensinact.core.snapshot.ProviderSnapshot;
import org.eclipse.sensinact.gateway.geojson.GeoJsonObject;
import org.eclipse.sensinact.southbound.rules.api.ResourceUpdater;
import org.eclipse.sensinact.southbound.rules.api.RuleDefinition;
import org.osgi.service.component.annotations.Component;


@Component(immediate = true, name = "ChirpstackLocationRule")
public class ChirpstackLocationRule implements RuleDefinition{


	private static final Logger LOGGER = Logger.getLogger(ChirpstackLocationRule.class.getName());

	/* 
	 * (non-Javadoc)
	 * @see org.eclipse.sensinact.southbound.rules.api.RuleDefinition#evaluate(java.util.List, org.eclipse.sensinact.southbound.rules.api.ResourceUpdater)
	 */
	@Override
	public void evaluate(List<ProviderSnapshot> providerSnapshots, ResourceUpdater resourceUpdater) {

		ProviderSnapshot provider = findRuleTriggerProvider(providerSnapshots);
		if(provider != null) {
			LOGGER.info(String.format("Provider that triggered the rule is %s", provider.getName()));
			//We filter out all the chirpstack-xxxx which are not of type Teros21
			if(provider.getService("sensor") == null) return;
			if(provider.getService("sensor").getResource("potentialWater1") == null) return;

			String providerId = provider.getName();
			GeoJsonObject location = (GeoJsonObject) provider.getService("admin").getResource("location").getValue().getValue();
			if(location != null) {
				resourceUpdater.updateResource(provider.getName().concat("-derived"), "admin", "location", location, Instant.now());
				LOGGER.info(String.format("Updated location for provider %s", providerId));
			}			
		}
	}

	private ProviderSnapshot findRuleTriggerProvider(List<ProviderSnapshot> providerSnapshots) {
		return providerSnapshots.stream().max(Comparator.comparing(p -> p.getService("admin").getResource("location").getValue().getTimestamp())).orElseGet(null);

	}

	/* 
	 * (non-Javadoc)
	 * @see org.eclipse.sensinact.southbound.rules.api.RuleDefinition#getInputFilter()
	 */
	@Override
	public ICriterion getInputFilter() {
		return new ChirpstackLocationRuleCriterium();
	}


}
