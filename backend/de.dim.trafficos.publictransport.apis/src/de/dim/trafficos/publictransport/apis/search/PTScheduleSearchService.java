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

import java.time.LocalDate;
import java.time.LocalTime;
import java.util.List;

import org.osgi.annotation.versioning.ProviderType;

import de.jena.udp.model.trafficos.publictransport.PTSchedule;

/**
 * 
 * @author ilenia
 * @since Jul 3, 2023
 */
@ProviderType
public interface PTScheduleSearchService {
	
	PTSchedule searchScheduleById(String scheduleId);
	
	List<PTSchedule> searchScheduleByDay(LocalDate day);
	
	List<PTSchedule> searchScheduleByDayAndLine(LocalDate day, int... lineNumbers);
	
	List<PTSchedule> searchScheduleByDayAndTime(LocalDate day, LocalTime startTime, LocalTime endTime);
	
	List<PTSchedule> searchScheduleByDayAndStopDHIds(LocalDate day, String... stopDHIds);
	
	List<PTSchedule> searchScheduleByDayAndStopNames(LocalDate day, String... stopNames);

}
