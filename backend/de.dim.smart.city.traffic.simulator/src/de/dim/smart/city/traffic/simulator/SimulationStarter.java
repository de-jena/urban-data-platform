/*
 * Copyright (c) 2012 - 2024 Data In Motion and others.
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

package de.dim.smart.city.traffic.simulator;

import org.osgi.service.component.annotations.Activate;
import org.osgi.service.component.annotations.Component;
import org.osgi.service.component.annotations.Deactivate;
import org.osgi.service.component.annotations.Reference;

import de.dim.smart.city.mqtt.api.SimulatorTestService;
import de.dim.trafficos.model.device.Intersection;
import de.dim.trafficos.model.device.PublicTransportLine;

/**
 * 
 * @author ungei
 * @since 17 Jan 2022
 */
@Component
public class SimulationStarter {

	@Reference
	SimulatorTestService simulator;
	
	@Reference(target = "(id=Intersection-Erlanger-Allee)")
	Intersection intersection;
	
	@Reference()
	PublicTransportLine line;
	
	@Activate
	public void activate() {
		simulator.startSimulation();
	}
	
	@Deactivate
	public void deactivate() {
		simulator.stopSimulation();
	}
	
}
