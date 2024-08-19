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

package de.jena.sensinact.sthbnd.rest.tlc.control;

import java.util.List;

import org.apache.felix.service.command.annotations.GogoCommand;
import org.osgi.service.component.annotations.Component;
import org.osgi.service.component.annotations.Reference;
import org.osgi.service.component.annotations.ReferenceCardinality;
import org.osgi.service.jakartars.runtime.JakartarsServiceRuntime;
import org.osgi.service.jakartars.runtime.dto.RuntimeDTO;

/**
 * 
 * @author ungei
 * @since 25 Jan 2023
 */
@Component(service= JakartaGogoCommand.class)
@GogoCommand(scope = "jakartars", function = "jakartaRuntimes")
public class JakartaGogoCommand {

	@Reference(cardinality = ReferenceCardinality.MULTIPLE)
	List<JakartarsServiceRuntime> runtimes;
	
	public void jakartaRuntimes() {
		runtimes.forEach(this::printRuntime);
	}
	
	void printRuntime(JakartarsServiceRuntime runtime) {
		RuntimeDTO runtimeDTO = runtime.getRuntimeDTO();
		System.out.println("Runtime: " + runtimeDTO.serviceDTO.id);
		System.out.println(runtimeDTO.toString());
	}
}
