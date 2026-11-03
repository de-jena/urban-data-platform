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

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertInstanceOf;
import static org.junit.jupiter.api.Assertions.assertNull;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.nio.file.Files;
import java.nio.file.Path;
import java.time.Instant;
import java.util.GregorianCalendar;
import java.util.List;
import java.util.TimeZone;

import javax.xml.datatype.DatatypeFactory;

import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EcorePackage;
import org.eclipse.emf.ecore.impl.EPackageRegistryImpl;
import org.eclipse.sensinact.model.core.provider.ProviderPackage;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import de.jena.model.ibis.common.GNSSCoordinate;
import de.jena.model.ibis.common.IBISIPDate;
import de.jena.model.ibis.common.IBISIPDateTime;
import de.jena.model.ibis.common.IBISIPDouble;
import de.jena.model.ibis.common.IBISIPInt;
import de.jena.model.ibis.common.IBISIPNMTOKEN;
import de.jena.model.ibis.common.IBISIPString;
import de.jena.model.ibis.common.IbisCommonFactory;
import de.jena.model.ibis.common.IbisCommonPackage;
import de.jena.model.ibis.common.InternationalTextType;
import de.jena.model.ibis.common.StopInformation;
import de.jena.model.ibis.customerinformationservice.CurrentStopPointData;
import de.jena.model.ibis.customerinformationservice.CurrentStopPointResponse;
import de.jena.model.ibis.customerinformationservice.IbisCustomerInformationServiceFactory;
import de.jena.model.ibis.customerinformationservice.IbisCustomerInformationServicePackage;
import de.jena.model.ibis.enumerations.DoorOpenStateEnumeration;
import de.jena.model.ibis.enumerations.GNSSQualityEnumeration;
import de.jena.model.ibis.enumerations.IbisEnumerationsPackage;
import de.jena.model.ibis.enumerations.VehicleModeEnumeration;
import de.jena.model.ibis.gnsslocationservice.GNSSLocationData;
import de.jena.model.ibis.gnsslocationservice.IbisGNSSLocationServiceFactory;
import de.jena.model.ibis.gnsslocationservice.IbisGNSSLocationServicePackage;
import de.jena.model.ibis.ticketvalidationservice.IbisTicketValidationServiceFactory;
import de.jena.model.ibis.ticketvalidationservice.IbisTicketValidationServicePackage;
import de.jena.model.ibis.ticketvalidationservice.VehicleData;
import de.jena.model.ibis.ticketvalidationservice.VehicleDataResponse;
import de.jena.model.sensinact.ibis.CustomerInfoCurrentStopPoint;
import de.jena.model.sensinact.ibis.CustomerInfoCurrentStopPointData;
import de.jena.model.sensinact.ibis.GNSSLocation;
import de.jena.model.sensinact.ibis.IbisSensinactPackage;
import de.jena.model.sensinact.ibis.TicketValidationVehicle;
import de.jena.model.sensinact.ibis.TicketValidationVehicleData;

class IbisTransformationTest {

	static final IbisCommonFactory COMMON = IbisCommonFactory.eINSTANCE;
	static final Instant NOON = Instant.parse("2026-01-07T11:00:00Z");

	private IbisTransformation transformation;

	@BeforeEach
	void createTransformation() throws Exception {
		EPackage.Registry registry = new EPackageRegistryImpl();
		for (EPackage ePackage : new EPackage[] { EcorePackage.eINSTANCE, IbisCommonPackage.eINSTANCE, IbisEnumerationsPackage.eINSTANCE,
				IbisCustomerInformationServicePackage.eINSTANCE, IbisGNSSLocationServicePackage.eINSTANCE,
				IbisTicketValidationServicePackage.eINSTANCE, IbisSensinactPackage.eINSTANCE, ProviderPackage.eINSTANCE }) {
			registry.put(ePackage.getNsURI(), ePackage);
		}
		transformation = new IbisTransformation(registry, Files.readString(Path.of(IbisTransformation.TRANSFORMATION)));
	}

	@Test
	void gnssLocationBecomesTheGnssServiceWithInstants() {
		GNSSLocationData position = IbisGNSSLocationServiceFactory.eINSTANCE.createGNSSLocationData();
		position.setLatitude(coordinate(50.92, "north"));
		position.setLongitude(coordinate(11.58, "east"));
		position.setAltitude(number(300.5));
		position.setTime(dateTime(NOON));
		position.setDate(date(NOON));
		position.setNumberOfSatellites(integer(7));
		position.setSignalQuality(GNSSQualityEnumeration.GPS);

		GNSSLocation service = assertInstanceOf(GNSSLocation.class, transformation.transform(position).orElseThrow());

		de.jena.model.sensinact.ibis.GNSSLocationData data = service.getResource();
		assertEquals(50.92, data.getLatitudeDegree());
		assertEquals(11.58, data.getLongitudeDegree());
		assertEquals("north", data.getLatitudeDirection());
		assertEquals(300.5, data.getAltitude());
		assertEquals(7, data.getNumberOfSatellites());
		assertEquals(NOON, data.getTimestamp());
		assertEquals(NOON, data.getTime());
		assertEquals("GNSSLocationService", data.getServiceName());
		assertEquals(GNSSQualityEnumeration.GPS.getLiteral(), data.getSignalQuality());
		assertEquals(IbisSensinactPackage.Literals.IBIS_DEVICE__GNSS_LOCATION, IbisListener.serviceReference(service));
	}

	@Test
	void absentOptionalValuesLeaveTheResourceFieldsUnset() {
		GNSSLocationData position = IbisGNSSLocationServiceFactory.eINSTANCE.createGNSSLocationData();
		position.setLatitude(coordinate(50.92, "north"));
		position.setLongitude(coordinate(11.58, "east"));
		position.setTime(dateTime(NOON));

		de.jena.model.sensinact.ibis.GNSSLocationData data = ((GNSSLocation) transformation.transform(position)
				.orElseThrow()).getResource();

		assertEquals(0.0, data.getAltitude());
		assertEquals(0, data.getNumberOfSatellites());
		assertNull(data.getDate());
		assertEquals(defaultSignalQuality().getLiteral(), data.getSignalQuality());
	}

	@Test
	void stopPointCollectsNamesAndFareZones() {
		StopInformation stop = COMMON.createStopInformation();
		stop.setStopIndex(integer(8));
		stop.setStopRef(token("4003"));
		stop.getStopName().add(text("Westbahnhofstraße"));
		stop.getStopName().add(text("West Station Street"));
		stop.getFareZone().add(token("30"));
		stop.setArrivalScheduled(dateTime(NOON));
		CurrentStopPointData stopPointData = IbisCustomerInformationServiceFactory.eINSTANCE.createCurrentStopPointData();
		stopPointData.setTimeStamp(dateTime(NOON));
		stopPointData.setCurrentStopPoint(stop);
		CurrentStopPointResponse response = IbisCustomerInformationServiceFactory.eINSTANCE.createCurrentStopPointResponse();
		response.setCurrentStopPointData(stopPointData);

		CustomerInfoCurrentStopPoint service = assertInstanceOf(CustomerInfoCurrentStopPoint.class,
				transformation.transform(response).orElseThrow());

		CustomerInfoCurrentStopPointData data = service.getResource();
		assertEquals(8, data.getStopIndex());
		assertEquals("4003", data.getStopRef());
		assertEquals(List.of("Westbahnhofstraße", "West Station Street"), data.getStopName());
		assertEquals(List.of("30"), data.getFareZone());
		assertEquals(NOON, data.getArrivalScheduled());
		assertTrue(data.getStopAlternativeName().isEmpty());
	}

	@Test
	void ticketValidationVehicleReportsTheEnumerationsAsText() {
		VehicleData vehicle = IbisTicketValidationServiceFactory.eINSTANCE.createVehicleData();
		vehicle.setTimeStamp(dateTime(NOON));
		vehicle.setVehicleRef(token("bus359"));
		vehicle.setDoorOpenState(DoorOpenStateEnumeration.ALL_DOORS_CLOSED);
		vehicle.setVehicleMode(VehicleModeEnumeration.BUS);
		vehicle.setDriverNumber(string("4711"));
		VehicleDataResponse response = IbisTicketValidationServiceFactory.eINSTANCE.createVehicleDataResponse();
		response.setVehicleData(vehicle);

		TicketValidationVehicle service = assertInstanceOf(TicketValidationVehicle.class,
				transformation.transform(response).orElseThrow());

		TicketValidationVehicleData data = service.getResource();
		assertEquals("bus359", data.getVehicleRef());
		assertEquals(DoorOpenStateEnumeration.ALL_DOORS_CLOSED.getLiteral(), data.getDoorState());
		assertEquals(VehicleModeEnumeration.BUS.getLiteral(), data.getVehicleMode());
		assertEquals("4711", data.getDriverNumber());
		assertEquals(IbisSensinactPackage.Literals.IBIS_DEVICE__VEHICLE, IbisListener.serviceReference(service));
	}

	static GNSSQualityEnumeration defaultSignalQuality() {
		return (GNSSQualityEnumeration) IbisGNSSLocationServicePackage.eINSTANCE.getGNSSLocationData_SignalQuality()
				.getDefaultValue();
	}

	static GNSSCoordinate coordinate(double degree, String direction) {
		GNSSCoordinate coordinate = COMMON.createGNSSCoordinate();
		coordinate.setDegree(number(degree));
		coordinate.setDirection(string(direction));
		return coordinate;
	}

	static IBISIPDouble number(double value) {
		IBISIPDouble number = COMMON.createIBISIPDouble();
		number.setValue(value);
		return number;
	}

	static IBISIPInt integer(int value) {
		IBISIPInt number = COMMON.createIBISIPInt();
		number.setValue(value);
		return number;
	}

	static IBISIPString string(String value) {
		IBISIPString string = COMMON.createIBISIPString();
		string.setValue(value);
		return string;
	}

	static IBISIPNMTOKEN token(String value) {
		IBISIPNMTOKEN token = COMMON.createIBISIPNMTOKEN();
		token.setValue(value);
		return token;
	}

	static InternationalTextType text(String value) {
		InternationalTextType text = COMMON.createInternationalTextType();
		text.setValue(value);
		text.setLanguage("de");
		return text;
	}

	static IBISIPDateTime dateTime(Instant instant) {
		IBISIPDateTime dateTime = COMMON.createIBISIPDateTime();
		dateTime.setValue(calendar(instant));
		return dateTime;
	}

	static IBISIPDate date(Instant instant) {
		IBISIPDate date = COMMON.createIBISIPDate();
		date.setValue(calendar(instant));
		return date;
	}

	static javax.xml.datatype.XMLGregorianCalendar calendar(Instant instant) {
		GregorianCalendar calendar = new GregorianCalendar(TimeZone.getTimeZone("UTC"));
		calendar.setTimeInMillis(instant.toEpochMilli());
		try {
			return DatatypeFactory.newInstance().newXMLGregorianCalendar(calendar);
		} catch (Exception e) {
			throw new IllegalStateException(e);
		}
	}
}
