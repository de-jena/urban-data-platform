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

package de.jena.ilsa.sensinact;

import java.time.Instant;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.sensinact.core.annotation.dto.Data;
import org.eclipse.sensinact.core.annotation.dto.Model;
import org.eclipse.sensinact.core.annotation.dto.ModelPackageUri;
import org.eclipse.sensinact.core.annotation.dto.Provider;
import org.eclipse.sensinact.core.annotation.dto.Resource;
import org.eclipse.sensinact.core.annotation.dto.Service;
import org.eclipse.sensinact.core.annotation.dto.ServiceModel;
import org.eclipse.sensinact.core.annotation.dto.Timestamp;

import de.jena.ilsa.sensinact.model.ilsa.IlsaPackage;
import de.jena.udp.model.trafficos.trafficlight.TLSignalState;

@ModelPackageUri(IlsaPackage.eNS_URI)
@Model("Ilsa")
public class TrafficLightDto {

	/**
	 * Creates a new instance.
	 * 
	 * @param intersectionId
	 * @param id
	 * @param signalState
	 */
	public TrafficLightDto(String intersectionId, String id, TLSignalState signalState) {
		intersection = intersectionId;
		signal = id;
		data = signalState.getState();
		timestamp = signalState.getTimestamp().toInstant();
	}

	@Provider
	public String intersection;

	@Service
	public String signal;

	@ServiceModel
	public EClass serviceEClass = IlsaPackage.Literals.SIGNAL;

	@Resource("color")
	@Data
	public String data;

	@Timestamp
	public Instant timestamp;

}