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

import org.eclipse.sensinact.core.annotation.dto.Data;
import org.eclipse.sensinact.core.annotation.dto.Model;
import org.eclipse.sensinact.core.annotation.dto.ModelPackageUri;
import org.eclipse.sensinact.core.annotation.dto.Provider;
import org.eclipse.sensinact.core.annotation.dto.Resource;
import org.eclipse.sensinact.core.annotation.dto.Service;
import org.eclipse.sensinact.core.annotation.dto.Timestamp;

import de.jena.glt.sensinact.model.gltSensiNact.GltPackage;

@ModelPackageUri(GltPackage.eNS_URI)
@Model("GltSide")
public class GltDto {

	public GltDto(String systemId, String service, Number value, String timestamp) {
		this.system = systemId;
		this.service = service;
		this.value = value;
		this.timestamp = timestamp;
	}

	@Provider
	public String system;

	@Service
	public String service;

	@Resource("value")
	@Data
	public Number value;

	@Timestamp
	public String timestamp;

}