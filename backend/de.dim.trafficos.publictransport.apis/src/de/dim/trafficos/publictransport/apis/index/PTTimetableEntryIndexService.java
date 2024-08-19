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

package de.dim.trafficos.publictransport.apis.index;

import de.jena.udp.model.trafficos.publictransport.PTTimetableEntry;

/**
 * 
 * @author ilenia
 * @since Jul 4, 2023
 */
public interface PTTimetableEntryIndexService {
	
	void indexPTTimetableEntry(PTTimetableEntry timetableEntry, boolean isFirstSave);
	
	void deletePTTimetableEntry(PTTimetableEntry timetableEntry);
	
	void resetIndex();

}
