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

package de.dim.smart.city.r09.importer.api;

import java.io.IOException;
import java.text.ParseException;
import java.util.Date;
import java.util.Map;

import org.osgi.annotation.versioning.ProviderType;

import de.dim.trafficos.model.device.PublicTransportDataEntry;
import de.dim.trafficos.model.device.PublicTransportLine;

/**
 * 
 * @author ilenia
 * @since Jul 30, 2020
 */
@ProviderType
public interface R09ImportService {
	
	public void importR09(String pathToFiles, PublicTransportLine ptLine) throws IOException, ParseException;
	
	public Map<Date, PublicTransportDataEntry> importSingleR09(String line, PublicTransportLine ptLine, 
			Map<Date, PublicTransportDataEntry> dataEntryMap);
	
	public void savePublicTransportDataEntry(Map<Date, PublicTransportDataEntry> dataEntryMap);
}
