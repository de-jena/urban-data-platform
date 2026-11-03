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

import java.lang.System.Logger;
import java.lang.System.Logger.Level;
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
import org.eclipse.sensinact.southbound.rules.api.ResourceUpdater;
import org.eclipse.sensinact.southbound.rules.api.ResourceUpdater.BatchUpdate;
import org.eclipse.sensinact.southbound.rules.api.RuleDefinition;
import org.osgi.service.component.annotations.Activate;
import org.osgi.service.component.annotations.Component;
import org.osgi.service.component.annotations.ConfigurationPolicy;

/**
 * The DWD forecast reports temperatures in Kelvin; every resource of the station whose unit is
 * {@code K} is written in degrees Celsius to the same service of {@code <station>-derived}.
 */
@Component(name = WeatherCelsiusRule.NAME, configurationPid = WeatherCelsiusRule.NAME,
		configurationPolicy = ConfigurationPolicy.OPTIONAL, property = RuleDefinition.RULE_NAME_PROPERTY + "=" + WeatherCelsiusRule.NAME)
public class WeatherCelsiusRule implements RuleDefinition {

	static final String NAME = "WeatherCelsiusRule";
	static final String KELVIN = "K";

	public @interface Config {
		/** The DWD station provider. */
		String provider() default "10567";
	}

	private static final Logger logger = System.getLogger(WeatherCelsiusRule.class.getName());

	private String station = "10567";

	@Activate
	void activate(Config config) {
		station = config.provider();
	}

	@Override
	public ICriterion getInputFilter() {
		return new StationCriterion(station);
	}

	@Override
	public void evaluate(List<ProviderSnapshot> providers, ResourceUpdater updater) {
		BatchUpdate batch = updater.updateBatch();
		int converted = 0;
		for (ProviderSnapshot provider : providers) {
			for (ServiceSnapshot service : provider.getServices()) {
				for (ResourceSnapshot resource : service.getResources()) {
					if (isKelvin(resource) && resource.isSet() && resource.getValue().getValue() instanceof Number kelvin) {
						batch.updateResource(Derived.of(provider.getName()), service.getName(), resource.getName(),
								celsius(kelvin), resource.getValue().getTimestamp());
						converted++;
					}
				}
			}
		}
		batch.completeBatch();
		logger.log(Level.DEBUG, "converted {0} temperatures of {1} to degrees Celsius", converted, station);
	}

	static boolean isKelvin(ResourceSnapshot resource) {
		return KELVIN.equals(resource.getMetadata().get("unit"));
	}

	static float celsius(Number kelvin) {
		return kelvin.floatValue() - 273.15f;
	}

	record StationCriterion(String station) implements ICriterion {

		@Override
		public BiPredicate<ProviderSnapshot, GeoJsonObject> getLocationFilter() {
			return null;
		}

		@Override
		public Predicate<ProviderSnapshot> getProviderFilter() {
			return provider -> station.equals(provider.getName());
		}

		@Override
		public Predicate<ServiceSnapshot> getServiceFilter() {
			return service -> !Set.of("admin").contains(service.getName());
		}

		@Override
		public Predicate<ResourceSnapshot> getResourceFilter() {
			return WeatherCelsiusRule::isKelvin;
		}

		@Override
		public ResourceValueFilter getResourceValueFilter() {
			return null;
		}
	}
}
