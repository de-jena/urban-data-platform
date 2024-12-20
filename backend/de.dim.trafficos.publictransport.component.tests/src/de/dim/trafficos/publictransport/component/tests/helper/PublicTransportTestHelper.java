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

package de.dim.trafficos.publictransport.component.tests.helper;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.util.UUID;

import de.jena.udp.model.trafficos.common.Position;
import de.jena.udp.model.trafficos.common.TOSCommonFactory;
import de.jena.udp.model.trafficos.publictransport.PTRoute;
import de.jena.udp.model.trafficos.publictransport.PTRouteType;
import de.jena.udp.model.trafficos.publictransport.PTScheduleUpdate;
import de.jena.udp.model.trafficos.publictransport.PTStop;
import de.jena.udp.model.trafficos.publictransport.PTTimetableEntry;
import de.jena.udp.model.trafficos.publictransport.PTType;
import de.jena.udp.model.trafficos.publictransport.PTUpdate;
import de.jena.udp.model.trafficos.publictransport.PTUpdateValueType;
import de.jena.udp.model.trafficos.publictransport.PTVehicle;
import de.jena.udp.model.trafficos.publictransport.PTSchedule;
import de.jena.udp.model.trafficos.publictransport.TOSPublicTransportFactory;

/**
 * 
 * @author ilenia
 * @since Jun 30, 2023
 */
public class PublicTransportTestHelper {
	
	public static PTVehicle getTestPTVehicle() {
		PTVehicle publicTransport = TOSPublicTransportFactory.eINSTANCE.createPTVehicle();
		publicTransport.setType(PTType.EBUS);
		return publicTransport;
	}
	
	public static PTRoute getTestPTRoute() {
		PTRoute line =  TOSPublicTransportFactory.eINSTANCE.createPTRoute();
		line.setRouteId(UUID.randomUUID().toString());
		line.setType(PTRouteType.TRAM);
		return line;
	}
	
	public static Position getTestPosition(double lat, double lng) {
		Position position = TOSCommonFactory.eINSTANCE.createPosition();
		position.setLatitude(lat);
		position.setLongitude(lng);
		return position;
	}
	
	public static PTStop getTestPTStop(String name, String dhid, Position position) {
		PTStop stop = TOSPublicTransportFactory.eINSTANCE.createPTStop();
		stop.setStopId(UUID.randomUUID().toString());
		stop.setDHID(dhid);
		stop.setName(name);
		stop.setPosition(position);
		return stop;
	}
	
	public static PTTimetableEntry getTestPTTimetableEntry(String stopRef, LocalTime arrivalTime, LocalTime departureTime, int index) {
		PTTimetableEntry entry = TOSPublicTransportFactory.eINSTANCE.createPTTimetableEntry();
		entry.setRefStopId(stopRef);
		entry.setRefScheduleId(UUID.randomUUID().toString());
		entry.setScheduledArrivalTime(arrivalTime);
		entry.setScheduledDepartureTime(departureTime);
		entry.setEntryIndex(index);
		return entry;
	}
	
	public static PTSchedule getTestPTSchedule(String lineRef, int lineNum, LocalDate startDate, LocalDate endDate) {
		PTSchedule schedule = TOSPublicTransportFactory.eINSTANCE.createPTSchedule();
		schedule.setScheduleId(UUID.randomUUID().toString());
		schedule.setStartDate(startDate);
		schedule.setEndDate(endDate);
		schedule.setRefRouteId(lineRef);
		schedule.setRefRouteNumber(lineNum);
		return schedule;
	}
	
	public static PTUpdate getTestPTUpdate(String vehicleRef) {
		PTUpdate  update = TOSPublicTransportFactory.eINSTANCE.createPTUpdate();
		update.setRefVehicleId(vehicleRef);
		ZonedDateTime zdt = LocalDateTime.now().atZone(ZoneId.of("UTC"));
		update.setTimestamp(zdt.toInstant().toEpochMilli());
		update.setType(PTUpdateValueType.TIMETABLE);
		update.setDataSource("IBIS");
		PTScheduleUpdate value = TOSPublicTransportFactory.eINSTANCE.createPTScheduleUpdate();
		value.setUpdatedSchedule(getTestPTSchedule("2", 2, LocalDate.now(), LocalDate.now().plusDays(1)));
		update.setValue(value);
		return update;
	}
	
	public static PTUpdate getTestPTUpdate(String vehicleRef, PTUpdateValueType type, long timestamp) {
		PTUpdate  update = TOSPublicTransportFactory.eINSTANCE.createPTUpdate();
		update.setRefVehicleId(vehicleRef);
		update.setTimestamp(timestamp);
		update.setType(type);
		return update;
	}
	
}
