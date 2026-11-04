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
package de.jena.udp.atlas.ibis;

import java.time.Instant;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.sensinact.core.annotation.dto.Data;
import org.eclipse.sensinact.core.annotation.dto.Model;
import org.eclipse.sensinact.core.annotation.dto.Provider;
import org.eclipse.sensinact.core.annotation.dto.Resource;
import org.eclipse.sensinact.core.annotation.dto.Service;
import org.eclipse.sensinact.core.annotation.dto.Timestamp;

import de.jena.model.sensinact.ibis.IbisResource;
import de.jena.model.sensinact.ibis.IbisSensinactPackage;

/** One IBIS service response as the {@code resource} of its IbisDevice service. */
public class IbisDto {

	@Model
	public EClass model = IbisSensinactPackage.Literals.IBIS_DEVICE;

	@Provider
	public String id;

	@Service
	public EReference service;

	@Resource("resource")
	@Data
	public IbisResource data;

	@Timestamp
	public Instant timestamp;

	public IbisDto(String id, EReference service, IbisResource data) {
		this.id = id;
		this.service = service;
		this.data = data;
		this.timestamp = data.getTimestamp() != null ? data.getTimestamp() : Instant.now();
	}
}
