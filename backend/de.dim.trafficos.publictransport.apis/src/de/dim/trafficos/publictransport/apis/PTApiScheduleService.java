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

package de.dim.trafficos.publictransport.apis;

import java.time.LocalDate;
import java.time.LocalTime;
import java.util.List;

import de.jena.udp.model.trafficos.publictransport_api.Schedule;

/**
 * 
 * @author ilenia
 * @since Jul 10, 2023
 */
public interface PTApiScheduleService {
	
	Schedule getScheduleById(String scheduleId);
	
	List<Schedule> getScheduleByDay(LocalDate day);
	
	List<Schedule> getScheduleByDayAndLine(LocalDate day, int... lines);
	
	List<Schedule> getScheduleByDayAndTime(LocalDate day, LocalTime startTime, LocalTime endTime);
	
	List<Schedule> getScheduleByDayAndStopDHID(LocalDate day, String... stopDHIDs);
	
	List<Schedule> getScheduleByDayAndStopName(LocalDate day, String... stopNames);

}
