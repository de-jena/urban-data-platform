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
package de.jena.chirpstack.sensinact;

import java.util.Random;
import java.util.logging.Logger;

import org.eclipse.sensinact.core.push.DataUpdate;
import org.osgi.service.component.annotations.Component;
import org.osgi.service.component.annotations.Reference;

import biz.aQute.scheduler.api.Constants;
import biz.aQute.scheduler.api.CronExpression;
import biz.aQute.scheduler.api.CronJob;
import de.jena.chirpstack.model.chirpstack.ChirpstackFactory;
import de.jena.chirpstack.model.chirpstack.SolidosTeros21;
import de.jena.chirpstack.model.chirpstack.Teros21;

/**
 * 
 * @author ilenia
 * @since Aug 18, 2025
 */
@CronExpression(name = "Chirpstack-Rule-Test", cron = { Constants.CRON_EXPRESSION_MINUTELY,
		Constants.CRON_EXPRESSION_REBOOT })
//@Component(immediate = true, name = "ChirpstackTestComponent")
public class ChirpstackTestComponent implements CronJob{
	
	private static final Logger LOGGER = Logger.getLogger(ChirpstackTestComponent.class.getName());
	
	@Reference
    private DataUpdate sensiNact;

	/* 
	 * (non-Javadoc)
	 * @see biz.aQute.scheduler.api.CronJob#run()
	 */
	@Override
	public void run() throws Exception {
		SolidosTeros21 provider = ChirpstackFactory.eINSTANCE.createSolidosTeros21();
		provider.setId("chirpstack-TEST");
		Teros21 service = ChirpstackFactory.eINSTANCE.createTeros21();
		service.setPotentialWater1(generateRandomDouble());
		service.setPotentialWater2(generateRandomDouble());
		provider.setSensor(service);
		sensiNact.pushUpdate(provider)
			.onSuccess((s) -> LOGGER.info("Updated TEST SOLIDOSTEROS21"))
			.onFailure((t) -> LOGGER.severe("Error updating TEST SOLIDOSTEROS21"));;
	}
	
	/**
     * Generates a random double number between 0.0 (inclusive) and -100000.0 (exclusive).
     *
     * @return A random double within the specified range.
     */
    public static double generateRandomDouble() {
        Random random = new Random();
        return random.nextDouble() * -100000.0;
    }

}
