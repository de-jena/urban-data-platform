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

import org.eclipse.sensinact.core.snapshot.ICriterion;
import org.eclipse.sensinact.core.snapshot.ProviderSnapshot;
import org.eclipse.sensinact.core.snapshot.ResourceSnapshot;
import org.eclipse.sensinact.southbound.rules.api.ResourceUpdater;
import org.eclipse.sensinact.southbound.rules.api.ResourceUpdater.BatchUpdate;
import org.eclipse.sensinact.southbound.rules.api.RuleDefinition;
import org.osgi.service.component.annotations.Activate;
import org.osgi.service.component.annotations.Component;
import org.osgi.service.component.annotations.ConfigurationPolicy;

/**
 * Copies the admin location of the soil sensors to their derived providers, so the derived
 * quantities can be found on the map too.
 */
@Component(name = SensorLocationRule.NAME, configurationPid = SensorLocationRule.NAME,
		configurationPolicy = ConfigurationPolicy.OPTIONAL, property = RuleDefinition.RULE_NAME_PROPERTY + "=" + SensorLocationRule.NAME)
public class SensorLocationRule implements RuleDefinition {

	static final String NAME = "SensorLocationRule";

	public @interface Config {
		/** The sensiNact models of the soil sensors. */
		String[] models() default { "Solidos_Teros21" };
	}

	private static final Logger logger = System.getLogger(SensorLocationRule.class.getName());

	private ICriterion criterion = ModelCriterion.of(List.of("Solidos_Teros21"), "admin", "location");

	@Activate
	void activate(Config config) {
		criterion = ModelCriterion.of(List.of(config.models()), "admin", "location");
	}

	@Override
	public ICriterion getInputFilter() {
		return criterion;
	}

	@Override
	public void evaluate(List<ProviderSnapshot> providers, ResourceUpdater updater) {
		BatchUpdate batch = updater.updateBatch();
		int copied = 0;
		for (ProviderSnapshot provider : providers) {
			ResourceSnapshot location = provider.getResource("admin", "location");
			if (location != null && location.isSet() && location.getValue().getValue() != null) {
				batch.updateResource(Derived.of(provider.getName()), "admin", "location", location.getValue().getValue(),
						location.getValue().getTimestamp());
				copied++;
			}
		}
		batch.completeBatch();
		logger.log(Level.DEBUG, "copied the location of {0} sensors to their derived providers", copied);
	}
}
