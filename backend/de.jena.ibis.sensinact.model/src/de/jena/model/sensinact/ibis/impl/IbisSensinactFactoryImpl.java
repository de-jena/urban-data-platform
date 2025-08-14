/**
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
package de.jena.model.sensinact.ibis.impl;

import de.jena.model.sensinact.ibis.*;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class IbisSensinactFactoryImpl extends EFactoryImpl implements IbisSensinactFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static IbisSensinactFactory init() {
		try {
			IbisSensinactFactory theIbisSensinactFactory = (IbisSensinactFactory)EPackage.Registry.INSTANCE.getEFactory(IbisSensinactPackage.eNS_URI);
			if (theIbisSensinactFactory != null) {
				return theIbisSensinactFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new IbisSensinactFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IbisSensinactFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
			case IbisSensinactPackage.IBIS_DEVICE: return createIbisDevice();
			case IbisSensinactPackage.IBIS_RESOURCE: return createIbisResource();
			case IbisSensinactPackage.CUSTOMER_INFO_ALL: return createCustomerInfoAll();
			case IbisSensinactPackage.CUSTOMER_INFO_ALL_DATA: return createCustomerInfoAllData();
			case IbisSensinactPackage.CUSTOMER_INFO_CURRENT_STOP_INDEX: return createCustomerInfoCurrentStopIndex();
			case IbisSensinactPackage.CUSTOMER_INFO_CURRENT_STOP_INDEX_DATA: return createCustomerInfoCurrentStopIndexData();
			case IbisSensinactPackage.CUSTOMER_INFO_CURRENT_STOP_POINT: return createCustomerInfoCurrentStopPoint();
			case IbisSensinactPackage.CUSTOMER_INFO_CURRENT_STOP_POINT_DATA: return createCustomerInfoCurrentStopPointData();
			case IbisSensinactPackage.CUSTOMER_INFO_TRIP: return createCustomerInfoTrip();
			case IbisSensinactPackage.CUSTOMER_INFO_TRIP_DATA: return createCustomerInfoTripData();
			case IbisSensinactPackage.CUSTOMER_INFO_VEHICLE: return createCustomerInfoVehicle();
			case IbisSensinactPackage.CUSTOMER_INFO_VEHICLE_DATA: return createCustomerInfoVehicleData();
			case IbisSensinactPackage.CUSTOMER_INFO_CURRENT_ANNOUNCEMENT: return createCustomerInfoCurrentAnnouncement();
			case IbisSensinactPackage.CUSTOMER_INFO_CURRENT_ANNOUNCEMENT_DATA: return createCustomerInfoCurrentAnnouncementData();
			case IbisSensinactPackage.CUSTOMER_INFO_CURRENT_CONNECTION: return createCustomerInfoCurrentConnection();
			case IbisSensinactPackage.CUSTOMER_INFO_CURRENT_CONNECTION_DATA: return createCustomerInfoCurrentConnectionData();
			case IbisSensinactPackage.CUSTOMER_INFO_CURRENT_DISPLAY_CONTENT: return createCustomerInfoCurrentDisplayContent();
			case IbisSensinactPackage.CUSTOMER_INFO_CURRENT_DISPLAY_CONTENT_DATA: return createCustomerInfoCurrentDisplayContentData();
			case IbisSensinactPackage.IBIS_ADMIN: return createIbisAdmin();
			case IbisSensinactPackage.PASSENGER_COUNTING_DOOR_COUNTING: return createPassengerCountingDoorCounting();
			case IbisSensinactPackage.PASSENGER_COUNTING_DOOR_COUNTING_STATE: return createPassengerCountingDoorCountingState();
			case IbisSensinactPackage.DOOR: return createDoor();
			case IbisSensinactPackage.DOOR_STATE: return createDoorState();
			case IbisSensinactPackage.STOP_REQUESTED: return createStopRequested();
			case IbisSensinactPackage.GNSS_LOCATION: return createGNSSLocation();
			case IbisSensinactPackage.GNSS_LOCATION_DATA: return createGNSSLocationData();
			case IbisSensinactPackage.TICKET_VALIDATION_CURRENT_TARIFF_STOP: return createTicketValidationCurrentTariffStop();
			case IbisSensinactPackage.TICKET_VALIDATION_CURRENT_TARIFF_STOP_DATA: return createTicketValidationCurrentTariffStopData();
			case IbisSensinactPackage.TICKET_VALIDATION_RAZZIA: return createTicketValidationRazzia();
			case IbisSensinactPackage.TICKET_VALIDATION_RAZZIA_DATA: return createTicketValidationRazziaData();
			case IbisSensinactPackage.TICKET_VALIDATION_CURRENT_LINE: return createTicketValidationCurrentLine();
			case IbisSensinactPackage.TICKET_VALIDATION_CURRENT_LINE_DATA: return createTicketValidationCurrentLineData();
			case IbisSensinactPackage.TICKET_VALIDATION_VEHICLE: return createTicketValidationVehicle();
			case IbisSensinactPackage.TICKET_VALIDATION_VEHICLE_DATA: return createTicketValidationVehicleData();
			case IbisSensinactPackage.TRIP_INFO: return createTripInfo();
			case IbisSensinactPackage.TRIP_INFO_DATA: return createTripInfoData();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public IbisDevice createIbisDevice() {
		IbisDeviceImpl ibisDevice = new IbisDeviceImpl();
		return ibisDevice;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public IbisResource createIbisResource() {
		IbisResourceImpl ibisResource = new IbisResourceImpl();
		return ibisResource;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CustomerInfoAll createCustomerInfoAll() {
		CustomerInfoAllImpl customerInfoAll = new CustomerInfoAllImpl();
		return customerInfoAll;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CustomerInfoAllData createCustomerInfoAllData() {
		CustomerInfoAllDataImpl customerInfoAllData = new CustomerInfoAllDataImpl();
		return customerInfoAllData;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CustomerInfoCurrentStopIndex createCustomerInfoCurrentStopIndex() {
		CustomerInfoCurrentStopIndexImpl customerInfoCurrentStopIndex = new CustomerInfoCurrentStopIndexImpl();
		return customerInfoCurrentStopIndex;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CustomerInfoCurrentStopIndexData createCustomerInfoCurrentStopIndexData() {
		CustomerInfoCurrentStopIndexDataImpl customerInfoCurrentStopIndexData = new CustomerInfoCurrentStopIndexDataImpl();
		return customerInfoCurrentStopIndexData;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CustomerInfoCurrentStopPoint createCustomerInfoCurrentStopPoint() {
		CustomerInfoCurrentStopPointImpl customerInfoCurrentStopPoint = new CustomerInfoCurrentStopPointImpl();
		return customerInfoCurrentStopPoint;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CustomerInfoCurrentStopPointData createCustomerInfoCurrentStopPointData() {
		CustomerInfoCurrentStopPointDataImpl customerInfoCurrentStopPointData = new CustomerInfoCurrentStopPointDataImpl();
		return customerInfoCurrentStopPointData;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CustomerInfoTrip createCustomerInfoTrip() {
		CustomerInfoTripImpl customerInfoTrip = new CustomerInfoTripImpl();
		return customerInfoTrip;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CustomerInfoTripData createCustomerInfoTripData() {
		CustomerInfoTripDataImpl customerInfoTripData = new CustomerInfoTripDataImpl();
		return customerInfoTripData;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CustomerInfoVehicle createCustomerInfoVehicle() {
		CustomerInfoVehicleImpl customerInfoVehicle = new CustomerInfoVehicleImpl();
		return customerInfoVehicle;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CustomerInfoVehicleData createCustomerInfoVehicleData() {
		CustomerInfoVehicleDataImpl customerInfoVehicleData = new CustomerInfoVehicleDataImpl();
		return customerInfoVehicleData;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CustomerInfoCurrentAnnouncement createCustomerInfoCurrentAnnouncement() {
		CustomerInfoCurrentAnnouncementImpl customerInfoCurrentAnnouncement = new CustomerInfoCurrentAnnouncementImpl();
		return customerInfoCurrentAnnouncement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CustomerInfoCurrentAnnouncementData createCustomerInfoCurrentAnnouncementData() {
		CustomerInfoCurrentAnnouncementDataImpl customerInfoCurrentAnnouncementData = new CustomerInfoCurrentAnnouncementDataImpl();
		return customerInfoCurrentAnnouncementData;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CustomerInfoCurrentConnection createCustomerInfoCurrentConnection() {
		CustomerInfoCurrentConnectionImpl customerInfoCurrentConnection = new CustomerInfoCurrentConnectionImpl();
		return customerInfoCurrentConnection;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CustomerInfoCurrentConnectionData createCustomerInfoCurrentConnectionData() {
		CustomerInfoCurrentConnectionDataImpl customerInfoCurrentConnectionData = new CustomerInfoCurrentConnectionDataImpl();
		return customerInfoCurrentConnectionData;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CustomerInfoCurrentDisplayContent createCustomerInfoCurrentDisplayContent() {
		CustomerInfoCurrentDisplayContentImpl customerInfoCurrentDisplayContent = new CustomerInfoCurrentDisplayContentImpl();
		return customerInfoCurrentDisplayContent;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CustomerInfoCurrentDisplayContentData createCustomerInfoCurrentDisplayContentData() {
		CustomerInfoCurrentDisplayContentDataImpl customerInfoCurrentDisplayContentData = new CustomerInfoCurrentDisplayContentDataImpl();
		return customerInfoCurrentDisplayContentData;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public IbisAdmin createIbisAdmin() {
		IbisAdminImpl ibisAdmin = new IbisAdminImpl();
		return ibisAdmin;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public PassengerCountingDoorCounting createPassengerCountingDoorCounting() {
		PassengerCountingDoorCountingImpl passengerCountingDoorCounting = new PassengerCountingDoorCountingImpl();
		return passengerCountingDoorCounting;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public PassengerCountingDoorCountingState createPassengerCountingDoorCountingState() {
		PassengerCountingDoorCountingStateImpl passengerCountingDoorCountingState = new PassengerCountingDoorCountingStateImpl();
		return passengerCountingDoorCountingState;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Door createDoor() {
		DoorImpl door = new DoorImpl();
		return door;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DoorState createDoorState() {
		DoorStateImpl doorState = new DoorStateImpl();
		return doorState;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public StopRequested createStopRequested() {
		StopRequestedImpl stopRequested = new StopRequestedImpl();
		return stopRequested;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public GNSSLocation createGNSSLocation() {
		GNSSLocationImpl gnssLocation = new GNSSLocationImpl();
		return gnssLocation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public GNSSLocationData createGNSSLocationData() {
		GNSSLocationDataImpl gnssLocationData = new GNSSLocationDataImpl();
		return gnssLocationData;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public TicketValidationCurrentTariffStop createTicketValidationCurrentTariffStop() {
		TicketValidationCurrentTariffStopImpl ticketValidationCurrentTariffStop = new TicketValidationCurrentTariffStopImpl();
		return ticketValidationCurrentTariffStop;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public TicketValidationCurrentTariffStopData createTicketValidationCurrentTariffStopData() {
		TicketValidationCurrentTariffStopDataImpl ticketValidationCurrentTariffStopData = new TicketValidationCurrentTariffStopDataImpl();
		return ticketValidationCurrentTariffStopData;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public TicketValidationRazzia createTicketValidationRazzia() {
		TicketValidationRazziaImpl ticketValidationRazzia = new TicketValidationRazziaImpl();
		return ticketValidationRazzia;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public TicketValidationRazziaData createTicketValidationRazziaData() {
		TicketValidationRazziaDataImpl ticketValidationRazziaData = new TicketValidationRazziaDataImpl();
		return ticketValidationRazziaData;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public TicketValidationCurrentLine createTicketValidationCurrentLine() {
		TicketValidationCurrentLineImpl ticketValidationCurrentLine = new TicketValidationCurrentLineImpl();
		return ticketValidationCurrentLine;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public TicketValidationCurrentLineData createTicketValidationCurrentLineData() {
		TicketValidationCurrentLineDataImpl ticketValidationCurrentLineData = new TicketValidationCurrentLineDataImpl();
		return ticketValidationCurrentLineData;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public TicketValidationVehicle createTicketValidationVehicle() {
		TicketValidationVehicleImpl ticketValidationVehicle = new TicketValidationVehicleImpl();
		return ticketValidationVehicle;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public TicketValidationVehicleData createTicketValidationVehicleData() {
		TicketValidationVehicleDataImpl ticketValidationVehicleData = new TicketValidationVehicleDataImpl();
		return ticketValidationVehicleData;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public TripInfo createTripInfo() {
		TripInfoImpl tripInfo = new TripInfoImpl();
		return tripInfo;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public TripInfoData createTripInfoData() {
		TripInfoDataImpl tripInfoData = new TripInfoDataImpl();
		return tripInfoData;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public IbisSensinactPackage getIbisSensinactPackage() {
		return (IbisSensinactPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static IbisSensinactPackage getPackage() {
		return IbisSensinactPackage.eINSTANCE;
	}

} //IbisSensinactFactoryImpl
