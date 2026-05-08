/**
 * Copyright (c) 2012 - 2026 Data In Motion and others.
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
package de.jena.udp.weather.sensinact.rules;

import java.time.Instant;
import java.util.List;
import java.util.logging.Logger;

import org.eclipse.sensinact.core.snapshot.ICriterion;
import org.eclipse.sensinact.core.snapshot.ProviderSnapshot;
import org.eclipse.sensinact.core.snapshot.ResourceSnapshot;
import org.eclipse.sensinact.core.snapshot.ServiceSnapshot;
import org.eclipse.sensinact.southbound.rules.api.ResourceUpdater;
import org.eclipse.sensinact.southbound.rules.api.ResourceUpdater.BatchUpdate;
import org.eclipse.sensinact.southbound.rules.api.RuleDefinition;
import org.osgi.service.component.annotations.Component;

/**
 * 
 * @author ilenia
 * @since May 8, 2026
 */
@Component(immediate = true, name = "WeatherUnitsConversionRule")
public class WeatherUnitsConversionRule implements RuleDefinition{
	
	public static final Logger LOGGER = Logger.getLogger(WeatherUnitsConversionRule.class.getName());
	public static final String UPDATED_PROVIDER_SUFFIX = "-derived";

	/* 
	 * (non-Javadoc)
	 * @see org.eclipse.sensinact.southbound.rules.api.RuleDefinition#evaluate(java.util.List, org.eclipse.sensinact.southbound.rules.api.ResourceUpdater)
	 */
	@Override
	public void evaluate(List<ProviderSnapshot> providerSnapshots, ResourceUpdater resourceUpdater) {
		if(providerSnapshots.size() != 1) {
			LOGGER.severe("More than one provider found for WeatherUnitsConversionRule. This should not happen");
		}
		ProviderSnapshot provider = providerSnapshots.get(0);
		BatchUpdate updateBatch = resourceUpdater.updateBatch();
		for(ServiceSnapshot service : provider.getServices()) {
			for(ResourceSnapshot resource : service.getResources()) {
				if(resource.getName().startsWith(WeatherRuleCriterium.TEMPERATURE_PREFIX)) {
					float convertedValue = convertTemperatureValue(resource.getValue().getValue());
					updateBatch.updateResource(provider.getName().concat(UPDATED_PROVIDER_SUFFIX), service.getName(), resource.getName(), convertedValue, Instant.now());
				}
			}
		}
		updateBatch.completeBatch();
	}

	/**
	 * @param value
	 * @return
	 */
	private float convertTemperatureValue(Object value) {
		if(value instanceof Float floatValue) {
			return floatValue - 273.15f;
		}
		throw new IllegalArgumentException("Expected a float value as Temperature");
	}

	
	/* 
	 * (non-Javadoc)
	 * @see org.eclipse.sensinact.southbound.rules.api.RuleDefinition#getInputFilter()
	 */
	@Override
	public ICriterion getInputFilter() {
		return new WeatherRuleCriterium();
	}

}
