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

package de.dim.trafficos.publictransport.apis.search;

import java.util.List;

import org.osgi.annotation.versioning.ProviderType;

import de.jena.udp.model.trafficos.publictransport.PTUpdate;
import de.jena.udp.model.trafficos.publictransport.PTUpdateValueType;

/**
 * 
 * @author ilenia
 * @since Jul 12, 2023
 */
@ProviderType
public interface PTUpdateSearchService {
	
	PTUpdate getLatestUpdateByTypeAndVehicle(String vehicleId, PTUpdateValueType type);
	
	List<PTUpdate> getLatestUpdatesByType(PTUpdateValueType type);

}
