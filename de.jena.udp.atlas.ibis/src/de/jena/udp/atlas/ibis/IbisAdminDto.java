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
import org.eclipse.sensinact.core.annotation.dto.Data;
import org.eclipse.sensinact.core.annotation.dto.Model;
import org.eclipse.sensinact.core.annotation.dto.Provider;
import org.eclipse.sensinact.core.annotation.dto.Resource;
import org.eclipse.sensinact.core.annotation.dto.Service;
import org.eclipse.sensinact.core.annotation.dto.Timestamp;
import org.eclipse.sensinact.gateway.geojson.Point;

import de.jena.model.sensinact.ibis.IbisSensinactPackage;

/** The vehicle position from the GNSS service as the admin location of the IbisDevice. */
public class IbisAdminDto {

	@Model
	public EClass model = IbisSensinactPackage.Literals.IBIS_DEVICE;

	@Provider
	public String id;

	@Service("admin")
	@Resource("location")
	@Data
	public Point location;

	@Timestamp
	public Instant timestamp;

	public IbisAdminDto(String id, Point location, Instant timestamp) {
		this.id = id;
		this.location = location;
		this.timestamp = timestamp != null ? timestamp : Instant.now();
	}
}
