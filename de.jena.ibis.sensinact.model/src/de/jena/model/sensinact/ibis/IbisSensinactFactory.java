/*
 * Copyright (c) 2012 - 2024 Data In Motion and others.
 * All rights reserved. 
 * 
 * This program and the accompanying materials are made
 * available under the terms of the Eclipse Public License 2.0
 * which is available at https://www.eclipse.org/legal/epl-2.0/
 * 
 * SPDX-License-Identifier: EPL-2.0
 * 
 * Contributors:
 *     Data In Motion - initial API and implementation
 */
package de.jena.model.sensinact.ibis;

import org.eclipse.emf.ecore.EFactory;

import org.osgi.annotation.versioning.ProviderType;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see de.jena.model.sensinact.ibis.IbisSensinactPackage
 * @generated
 */
@ProviderType
public interface IbisSensinactFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	IbisSensinactFactory eINSTANCE = de.jena.model.sensinact.ibis.impl.IbisSensinactFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Ibis Device</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Ibis Device</em>'.
	 * @generated
	 */
	IbisDevice createIbisDevice();

	/**
	 * Returns a new object of class '<em>Ibis Resource</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Ibis Resource</em>'.
	 * @generated
	 */
	IbisResource createIbisResource();

	/**
	 * Returns a new object of class '<em>Customer Info All</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Customer Info All</em>'.
	 * @generated
	 */
	CustomerInfoAll createCustomerInfoAll();

	/**
	 * Returns a new object of class '<em>Customer Info All Data</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Customer Info All Data</em>'.
	 * @generated
	 */
	CustomerInfoAllData createCustomerInfoAllData();

	/**
	 * Returns a new object of class '<em>Customer Info Current Stop Index</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Customer Info Current Stop Index</em>'.
	 * @generated
	 */
	CustomerInfoCurrentStopIndex createCustomerInfoCurrentStopIndex();

	/**
	 * Returns a new object of class '<em>Customer Info Current Stop Index Data</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Customer Info Current Stop Index Data</em>'.
	 * @generated
	 */
	CustomerInfoCurrentStopIndexData createCustomerInfoCurrentStopIndexData();

	/**
	 * Returns a new object of class '<em>Customer Info Current Stop Point</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Customer Info Current Stop Point</em>'.
	 * @generated
	 */
	CustomerInfoCurrentStopPoint createCustomerInfoCurrentStopPoint();

	/**
	 * Returns a new object of class '<em>Customer Info Current Stop Point Data</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Customer Info Current Stop Point Data</em>'.
	 * @generated
	 */
	CustomerInfoCurrentStopPointData createCustomerInfoCurrentStopPointData();

	/**
	 * Returns a new object of class '<em>Customer Info Trip</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Customer Info Trip</em>'.
	 * @generated
	 */
	CustomerInfoTrip createCustomerInfoTrip();

	/**
	 * Returns a new object of class '<em>Customer Info Trip Data</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Customer Info Trip Data</em>'.
	 * @generated
	 */
	CustomerInfoTripData createCustomerInfoTripData();

	/**
	 * Returns a new object of class '<em>Customer Info Vehicle</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Customer Info Vehicle</em>'.
	 * @generated
	 */
	CustomerInfoVehicle createCustomerInfoVehicle();

	/**
	 * Returns a new object of class '<em>Customer Info Vehicle Data</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Customer Info Vehicle Data</em>'.
	 * @generated
	 */
	CustomerInfoVehicleData createCustomerInfoVehicleData();

	/**
	 * Returns a new object of class '<em>Customer Info Current Announcement</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Customer Info Current Announcement</em>'.
	 * @generated
	 */
	CustomerInfoCurrentAnnouncement createCustomerInfoCurrentAnnouncement();

	/**
	 * Returns a new object of class '<em>Customer Info Current Announcement Data</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Customer Info Current Announcement Data</em>'.
	 * @generated
	 */
	CustomerInfoCurrentAnnouncementData createCustomerInfoCurrentAnnouncementData();

	/**
	 * Returns a new object of class '<em>Customer Info Current Connection</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Customer Info Current Connection</em>'.
	 * @generated
	 */
	CustomerInfoCurrentConnection createCustomerInfoCurrentConnection();

	/**
	 * Returns a new object of class '<em>Customer Info Current Connection Data</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Customer Info Current Connection Data</em>'.
	 * @generated
	 */
	CustomerInfoCurrentConnectionData createCustomerInfoCurrentConnectionData();

	/**
	 * Returns a new object of class '<em>Customer Info Current Display Content</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Customer Info Current Display Content</em>'.
	 * @generated
	 */
	CustomerInfoCurrentDisplayContent createCustomerInfoCurrentDisplayContent();

	/**
	 * Returns a new object of class '<em>Customer Info Current Display Content Data</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Customer Info Current Display Content Data</em>'.
	 * @generated
	 */
	CustomerInfoCurrentDisplayContentData createCustomerInfoCurrentDisplayContentData();

	/**
	 * Returns a new object of class '<em>Ibis Admin</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Ibis Admin</em>'.
	 * @generated
	 */
	IbisAdmin createIbisAdmin();

	/**
	 * Returns a new object of class '<em>Passenger Counting Door Counting</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Passenger Counting Door Counting</em>'.
	 * @generated
	 */
	PassengerCountingDoorCounting createPassengerCountingDoorCounting();

	/**
	 * Returns a new object of class '<em>Passenger Counting Door Counting State</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Passenger Counting Door Counting State</em>'.
	 * @generated
	 */
	PassengerCountingDoorCountingState createPassengerCountingDoorCountingState();

	/**
	 * Returns a new object of class '<em>Door</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Door</em>'.
	 * @generated
	 */
	Door createDoor();

	/**
	 * Returns a new object of class '<em>Door State</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Door State</em>'.
	 * @generated
	 */
	DoorState createDoorState();

	/**
	 * Returns a new object of class '<em>Stop Requested</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Stop Requested</em>'.
	 * @generated
	 */
	StopRequested createStopRequested();

	/**
	 * Returns a new object of class '<em>GNSS Location</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>GNSS Location</em>'.
	 * @generated
	 */
	GNSSLocation createGNSSLocation();

	/**
	 * Returns a new object of class '<em>GNSS Location Data</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>GNSS Location Data</em>'.
	 * @generated
	 */
	GNSSLocationData createGNSSLocationData();

	/**
	 * Returns a new object of class '<em>Ticket Validation Current Tariff Stop</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Ticket Validation Current Tariff Stop</em>'.
	 * @generated
	 */
	TicketValidationCurrentTariffStop createTicketValidationCurrentTariffStop();

	/**
	 * Returns a new object of class '<em>Ticket Validation Current Tariff Stop Data</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Ticket Validation Current Tariff Stop Data</em>'.
	 * @generated
	 */
	TicketValidationCurrentTariffStopData createTicketValidationCurrentTariffStopData();

	/**
	 * Returns a new object of class '<em>Ticket Validation Razzia</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Ticket Validation Razzia</em>'.
	 * @generated
	 */
	TicketValidationRazzia createTicketValidationRazzia();

	/**
	 * Returns a new object of class '<em>Ticket Validation Razzia Data</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Ticket Validation Razzia Data</em>'.
	 * @generated
	 */
	TicketValidationRazziaData createTicketValidationRazziaData();

	/**
	 * Returns a new object of class '<em>Ticket Validation Current Line</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Ticket Validation Current Line</em>'.
	 * @generated
	 */
	TicketValidationCurrentLine createTicketValidationCurrentLine();

	/**
	 * Returns a new object of class '<em>Ticket Validation Current Line Data</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Ticket Validation Current Line Data</em>'.
	 * @generated
	 */
	TicketValidationCurrentLineData createTicketValidationCurrentLineData();

	/**
	 * Returns a new object of class '<em>Ticket Validation Vehicle</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Ticket Validation Vehicle</em>'.
	 * @generated
	 */
	TicketValidationVehicle createTicketValidationVehicle();

	/**
	 * Returns a new object of class '<em>Ticket Validation Vehicle Data</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Ticket Validation Vehicle Data</em>'.
	 * @generated
	 */
	TicketValidationVehicleData createTicketValidationVehicleData();

	/**
	 * Returns a new object of class '<em>Trip Info</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Trip Info</em>'.
	 * @generated
	 */
	TripInfo createTripInfo();

	/**
	 * Returns a new object of class '<em>Trip Info Data</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Trip Info Data</em>'.
	 * @generated
	 */
	TripInfoData createTripInfoData();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	IbisSensinactPackage getIbisSensinactPackage();

} //IbisSensinactFactory
