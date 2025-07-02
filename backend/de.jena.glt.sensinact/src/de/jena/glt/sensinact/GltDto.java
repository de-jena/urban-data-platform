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

package de.jena.glt.sensinact;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.sensinact.core.annotation.dto.Data;
import org.eclipse.sensinact.core.annotation.dto.Model;
import org.eclipse.sensinact.core.annotation.dto.ModelPackageUri;
import org.eclipse.sensinact.core.annotation.dto.Provider;
import org.eclipse.sensinact.core.annotation.dto.Resource;
import org.eclipse.sensinact.core.annotation.dto.Service;
import org.eclipse.sensinact.core.annotation.dto.Timestamp;

import de.jena.glt.sensinact.model.glt.GltPackage;

@ModelPackageUri(GltPackage.eNS_URI)
@Model("Glt")
public class GltDto {

	public GltDto(String systemId, String classId, Number value, String timestamp) {
		this.system = systemId;
		this.value = value;
		this.timestamp = timestamp;
	}

	@Provider
	public String system;

	@Service
	public EClass serviceEClass = GltPackage.Literals.MONITORING_DATA;

	@Resource("value")
	@Data
	public Number value;

	@Timestamp
	public String timestamp;

}