/*
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
package de.jena.udp.sensinact.history.rehydration;

import java.lang.System.Logger;
import java.lang.System.Logger.Level;
import java.time.Duration;
import java.time.Instant;
import java.util.List;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

import org.eclipse.sensinact.core.push.DataUpdate;
import org.osgi.service.component.annotations.Activate;
import org.osgi.service.component.annotations.Component;
import org.osgi.service.component.annotations.ConfigurationPolicy;
import org.osgi.service.component.annotations.Deactivate;
import org.osgi.service.component.annotations.Reference;
import org.osgi.service.metatype.annotations.AttributeDefinition;
import org.osgi.service.metatype.annotations.AttributeType;
import org.osgi.service.metatype.annotations.Designate;
import org.osgi.service.metatype.annotations.ObjectClassDefinition;

/**
 * Restores providers into the sensiNact digital twin after a restart.
 * 
 * The twin only holds what has been reported since the gateway came up, so the
 * SensorThings API shows nothing for a provider that has been quiet since the
 * last restart - not even the data the history provider still holds for it.
 * This component reads the last value of every historicised resource straight
 * from the history database and pushes it back into the twin, so Things,
 * Datastreams, Observations and Locations are complete again from the first
 * request on.
 * 
 * Each value keeps its original timestamp. sensiNact ignores an update that is
 * not newer than the value a resource already holds, which makes the restore
 * both repeatable and safe while devices are reporting.
 * 
 * @author Guido Grune
 * @since Sep 15, 2026
 */
@Component(name = "TwinRehydration", immediate = true, configurationPid = TwinRehydration.PID, configurationPolicy = ConfigurationPolicy.REQUIRE)
@Designate(ocd = TwinRehydration.Config.class)
public class TwinRehydration {

	public static final String PID = "de.jena.udp.sensinact.history.rehydration";

	@ObjectClassDefinition(name = "sensiNact Twin Rehydration")
	public @interface Config {

		@AttributeDefinition(description = "JDBC url of the sensiNact history database")
		String url();

		@AttributeDefinition(description = "Database user", required = false)
		String user() default "";

		@AttributeDefinition(type = AttributeType.PASSWORD, description = "Database password", required = false)
		String _password() default "";

		@AttributeDefinition(description = "Only resources with a value newer than this ISO-8601 duration are restored", required = false)
		String max_age() default "P30D";

		@AttributeDefinition(description = "Number of resources pushed into the twin per bulk update", required = false)
		int batch_size() default 500;

		@AttributeDefinition(description = "ISO-8601 delay before the restore starts, leaving the southbound adapters time to come up", required = false)
		String start_delay() default "PT15S";
	}

	private static final Logger LOGGER = System.getLogger(TwinRehydration.class.getName());

	@Reference
	DataUpdate sensiNact;

	private ScheduledExecutorService restoreExecutor;

	@Activate
	void activate(Config config) {
		restoreExecutor = Executors.newSingleThreadScheduledExecutor(runnable -> {
			Thread thread = new Thread(runnable, "sensinact-twin-rehydration");
			thread.setDaemon(true);
			return thread;
		});
		long delay = Duration.parse(config.start_delay()).toMillis();
		restoreExecutor.schedule(() -> restore(config), delay, TimeUnit.MILLISECONDS);
		LOGGER.log(Level.INFO, "Twin rehydration scheduled in {0}", config.start_delay());
	}

	@Deactivate
	void deactivate() {
		restoreExecutor.shutdownNow();
	}

	private void restore(Config config) {
		try {
			Instant cutOff = Instant.now().minus(Duration.parse(config.max_age()));
			List<HistoryRecord> records = new HistoryDatabase(config.url(), config.user(), config._password())
					.latestValuesSince(cutOff);
			if (records.isEmpty()) {
				LOGGER.log(Level.INFO, "No historicised resource newer than {0}, nothing to restore", cutOff);
				return;
			}
			pushInBatches(records, config.batch_size());
		} catch (Exception e) {
			LOGGER.log(Level.ERROR, "Twin rehydration failed, providers stay empty until they report again", e);
		}
	}

	private void pushInBatches(List<HistoryRecord> records, int batchSize) {
		int restored = 0;
		for (int start = 0; start < records.size(); start += batchSize) {
			List<HistoryRecord> batch = records.subList(start, Math.min(start + batchSize, records.size()));
			try {
				sensiNact.pushUpdate(TwinUpdates.restoring(batch)).getValue();
				restored += batch.size();
			} catch (Exception e) {
				LOGGER.log(Level.WARNING,
						"Could not restore a batch of " + batch.size() + " resources starting at provider "
								+ batch.get(0).provider(),
						e);
			}
		}
		LOGGER.log(Level.INFO, "Twin rehydration restored {0} of {1} resources", restored, records.size());
	}
}
