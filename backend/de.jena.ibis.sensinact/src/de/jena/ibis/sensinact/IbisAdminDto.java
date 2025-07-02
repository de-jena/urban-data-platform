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

package de.jena.ibis.sensinact;

import java.time.temporal.ChronoUnit;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.sensinact.core.annotation.dto.Data;
import org.eclipse.sensinact.core.annotation.dto.Model;
import org.eclipse.sensinact.core.annotation.dto.Provider;
import org.eclipse.sensinact.core.annotation.dto.Resource;
import org.eclipse.sensinact.core.annotation.dto.Service;
import org.eclipse.sensinact.core.annotation.dto.Timestamp;
import org.eclipse.sensinact.gateway.geojson.Point;

import de.jena.model.sensinact.ibis.IbisSensinactPackage;

public class IbisAdminDto {

	/**
	 * Creates a new instance.
	 * 
	 * @param id
	 * @param point
	 * @param instant 
	 */
	public IbisAdminDto(String id,Point point, long timestamp) {
		this.id = id;
		this.data = point;
		this.timestamp = timestamp;
	}
	@Model
	public EClass ibis = IbisSensinactPackage.Literals.IBIS_DEVICE;
	
	@Provider
	public String id;
	
	@Resource("location")
	@Service("admin")
	@Data
	public Point data;

	@Timestamp(ChronoUnit.SECONDS)
	public long timestamp;

}