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

import org.eclipse.sensinact.model.core.provider.Provider;

import org.osgi.annotation.versioning.ProviderType;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Ibis Device</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * This represents the public transport device, meaning the bus, tram, or whatever.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.jena.model.sensinact.ibis.IbisDevice#getIbisAdmin <em>Ibis Admin</em>}</li>
 *   <li>{@link de.jena.model.sensinact.ibis.IbisDevice#getCustomerInfoAll <em>Customer Info All</em>}</li>
 *   <li>{@link de.jena.model.sensinact.ibis.IbisDevice#getCustomerInfoCurrentStopIndex <em>Customer Info Current Stop Index</em>}</li>
 *   <li>{@link de.jena.model.sensinact.ibis.IbisDevice#getCustomerInfoCurrentStopPoint <em>Customer Info Current Stop Point</em>}</li>
 *   <li>{@link de.jena.model.sensinact.ibis.IbisDevice#getCustomerInfoTrip <em>Customer Info Trip</em>}</li>
 *   <li>{@link de.jena.model.sensinact.ibis.IbisDevice#getCustomerInfoVehicle <em>Customer Info Vehicle</em>}</li>
 *   <li>{@link de.jena.model.sensinact.ibis.IbisDevice#getCustomerInfoCurrentAnnouncement <em>Customer Info Current Announcement</em>}</li>
 *   <li>{@link de.jena.model.sensinact.ibis.IbisDevice#getCustomerInfoCurrentConnection <em>Customer Info Current Connection</em>}</li>
 *   <li>{@link de.jena.model.sensinact.ibis.IbisDevice#getCustomerInfoCurrentDisplayContent <em>Customer Info Current Display Content</em>}</li>
 *   <li>{@link de.jena.model.sensinact.ibis.IbisDevice#getDoor1CountingState <em>Door1 Counting State</em>}</li>
 *   <li>{@link de.jena.model.sensinact.ibis.IbisDevice#getDoor2CountingState <em>Door2 Counting State</em>}</li>
 *   <li>{@link de.jena.model.sensinact.ibis.IbisDevice#getDoor3CountingState <em>Door3 Counting State</em>}</li>
 *   <li>{@link de.jena.model.sensinact.ibis.IbisDevice#getDoor4CountingState <em>Door4 Counting State</em>}</li>
 *   <li>{@link de.jena.model.sensinact.ibis.IbisDevice#getDoor1State <em>Door1 State</em>}</li>
 *   <li>{@link de.jena.model.sensinact.ibis.IbisDevice#getDoor2State <em>Door2 State</em>}</li>
 *   <li>{@link de.jena.model.sensinact.ibis.IbisDevice#getDoor3State <em>Door3 State</em>}</li>
 *   <li>{@link de.jena.model.sensinact.ibis.IbisDevice#getDoor4State <em>Door4 State</em>}</li>
 *   <li>{@link de.jena.model.sensinact.ibis.IbisDevice#getStopRequested <em>Stop Requested</em>}</li>
 *   <li>{@link de.jena.model.sensinact.ibis.IbisDevice#getGnssLocation <em>Gnss Location</em>}</li>
 *   <li>{@link de.jena.model.sensinact.ibis.IbisDevice#getCurrentTariffStop <em>Current Tariff Stop</em>}</li>
 *   <li>{@link de.jena.model.sensinact.ibis.IbisDevice#getRazzia <em>Razzia</em>}</li>
 *   <li>{@link de.jena.model.sensinact.ibis.IbisDevice#getCurrentLine <em>Current Line</em>}</li>
 *   <li>{@link de.jena.model.sensinact.ibis.IbisDevice#getVehicle <em>Vehicle</em>}</li>
 *   <li>{@link de.jena.model.sensinact.ibis.IbisDevice#getTripInfo <em>Trip Info</em>}</li>
 * </ul>
 *
 * @see de.jena.model.sensinact.ibis.IbisSensinactPackage#getIbisDevice()
 * @model
 * @generated
 */
@ProviderType
public interface IbisDevice extends Provider {
	/**
	 * Returns the value of the '<em><b>Ibis Admin</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Ibis Admin</em>' containment reference.
	 * @see #setIbisAdmin(IbisAdmin)
	 * @see de.jena.model.sensinact.ibis.IbisSensinactPackage#getIbisDevice_IbisAdmin()
	 * @model containment="true"
	 * @generated
	 */
	IbisAdmin getIbisAdmin();

	/**
	 * Sets the value of the '{@link de.jena.model.sensinact.ibis.IbisDevice#getIbisAdmin <em>Ibis Admin</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Ibis Admin</em>' containment reference.
	 * @see #getIbisAdmin()
	 * @generated
	 */
	void setIbisAdmin(IbisAdmin value);

	/**
	 * Returns the value of the '<em><b>Customer Info All</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Customer Info All</em>' containment reference.
	 * @see #setCustomerInfoAll(CustomerInfoAll)
	 * @see de.jena.model.sensinact.ibis.IbisSensinactPackage#getIbisDevice_CustomerInfoAll()
	 * @model containment="true"
	 * @generated
	 */
	CustomerInfoAll getCustomerInfoAll();

	/**
	 * Sets the value of the '{@link de.jena.model.sensinact.ibis.IbisDevice#getCustomerInfoAll <em>Customer Info All</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Customer Info All</em>' containment reference.
	 * @see #getCustomerInfoAll()
	 * @generated
	 */
	void setCustomerInfoAll(CustomerInfoAll value);

	/**
	 * Returns the value of the '<em><b>Customer Info Current Stop Index</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Customer Info Current Stop Index</em>' containment reference.
	 * @see #setCustomerInfoCurrentStopIndex(CustomerInfoCurrentStopIndex)
	 * @see de.jena.model.sensinact.ibis.IbisSensinactPackage#getIbisDevice_CustomerInfoCurrentStopIndex()
	 * @model containment="true"
	 * @generated
	 */
	CustomerInfoCurrentStopIndex getCustomerInfoCurrentStopIndex();

	/**
	 * Sets the value of the '{@link de.jena.model.sensinact.ibis.IbisDevice#getCustomerInfoCurrentStopIndex <em>Customer Info Current Stop Index</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Customer Info Current Stop Index</em>' containment reference.
	 * @see #getCustomerInfoCurrentStopIndex()
	 * @generated
	 */
	void setCustomerInfoCurrentStopIndex(CustomerInfoCurrentStopIndex value);

	/**
	 * Returns the value of the '<em><b>Customer Info Current Stop Point</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Customer Info Current Stop Point</em>' containment reference.
	 * @see #setCustomerInfoCurrentStopPoint(CustomerInfoCurrentStopPoint)
	 * @see de.jena.model.sensinact.ibis.IbisSensinactPackage#getIbisDevice_CustomerInfoCurrentStopPoint()
	 * @model containment="true"
	 * @generated
	 */
	CustomerInfoCurrentStopPoint getCustomerInfoCurrentStopPoint();

	/**
	 * Sets the value of the '{@link de.jena.model.sensinact.ibis.IbisDevice#getCustomerInfoCurrentStopPoint <em>Customer Info Current Stop Point</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Customer Info Current Stop Point</em>' containment reference.
	 * @see #getCustomerInfoCurrentStopPoint()
	 * @generated
	 */
	void setCustomerInfoCurrentStopPoint(CustomerInfoCurrentStopPoint value);

	/**
	 * Returns the value of the '<em><b>Customer Info Trip</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Customer Info Trip</em>' containment reference.
	 * @see #setCustomerInfoTrip(CustomerInfoTrip)
	 * @see de.jena.model.sensinact.ibis.IbisSensinactPackage#getIbisDevice_CustomerInfoTrip()
	 * @model containment="true"
	 * @generated
	 */
	CustomerInfoTrip getCustomerInfoTrip();

	/**
	 * Sets the value of the '{@link de.jena.model.sensinact.ibis.IbisDevice#getCustomerInfoTrip <em>Customer Info Trip</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Customer Info Trip</em>' containment reference.
	 * @see #getCustomerInfoTrip()
	 * @generated
	 */
	void setCustomerInfoTrip(CustomerInfoTrip value);

	/**
	 * Returns the value of the '<em><b>Customer Info Vehicle</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Customer Info Vehicle</em>' containment reference.
	 * @see #setCustomerInfoVehicle(CustomerInfoVehicle)
	 * @see de.jena.model.sensinact.ibis.IbisSensinactPackage#getIbisDevice_CustomerInfoVehicle()
	 * @model containment="true"
	 * @generated
	 */
	CustomerInfoVehicle getCustomerInfoVehicle();

	/**
	 * Sets the value of the '{@link de.jena.model.sensinact.ibis.IbisDevice#getCustomerInfoVehicle <em>Customer Info Vehicle</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Customer Info Vehicle</em>' containment reference.
	 * @see #getCustomerInfoVehicle()
	 * @generated
	 */
	void setCustomerInfoVehicle(CustomerInfoVehicle value);

	/**
	 * Returns the value of the '<em><b>Customer Info Current Announcement</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Customer Info Current Announcement</em>' containment reference.
	 * @see #setCustomerInfoCurrentAnnouncement(CustomerInfoCurrentAnnouncement)
	 * @see de.jena.model.sensinact.ibis.IbisSensinactPackage#getIbisDevice_CustomerInfoCurrentAnnouncement()
	 * @model containment="true"
	 * @generated
	 */
	CustomerInfoCurrentAnnouncement getCustomerInfoCurrentAnnouncement();

	/**
	 * Sets the value of the '{@link de.jena.model.sensinact.ibis.IbisDevice#getCustomerInfoCurrentAnnouncement <em>Customer Info Current Announcement</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Customer Info Current Announcement</em>' containment reference.
	 * @see #getCustomerInfoCurrentAnnouncement()
	 * @generated
	 */
	void setCustomerInfoCurrentAnnouncement(CustomerInfoCurrentAnnouncement value);

	/**
	 * Returns the value of the '<em><b>Customer Info Current Connection</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Customer Info Current Connection</em>' containment reference.
	 * @see #setCustomerInfoCurrentConnection(CustomerInfoCurrentConnection)
	 * @see de.jena.model.sensinact.ibis.IbisSensinactPackage#getIbisDevice_CustomerInfoCurrentConnection()
	 * @model containment="true"
	 * @generated
	 */
	CustomerInfoCurrentConnection getCustomerInfoCurrentConnection();

	/**
	 * Sets the value of the '{@link de.jena.model.sensinact.ibis.IbisDevice#getCustomerInfoCurrentConnection <em>Customer Info Current Connection</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Customer Info Current Connection</em>' containment reference.
	 * @see #getCustomerInfoCurrentConnection()
	 * @generated
	 */
	void setCustomerInfoCurrentConnection(CustomerInfoCurrentConnection value);

	/**
	 * Returns the value of the '<em><b>Customer Info Current Display Content</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Customer Info Current Display Content</em>' containment reference.
	 * @see #setCustomerInfoCurrentDisplayContent(CustomerInfoCurrentDisplayContent)
	 * @see de.jena.model.sensinact.ibis.IbisSensinactPackage#getIbisDevice_CustomerInfoCurrentDisplayContent()
	 * @model containment="true"
	 * @generated
	 */
	CustomerInfoCurrentDisplayContent getCustomerInfoCurrentDisplayContent();

	/**
	 * Sets the value of the '{@link de.jena.model.sensinact.ibis.IbisDevice#getCustomerInfoCurrentDisplayContent <em>Customer Info Current Display Content</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Customer Info Current Display Content</em>' containment reference.
	 * @see #getCustomerInfoCurrentDisplayContent()
	 * @generated
	 */
	void setCustomerInfoCurrentDisplayContent(CustomerInfoCurrentDisplayContent value);

	/**
	 * Returns the value of the '<em><b>Door1 Counting State</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Door1 Counting State</em>' containment reference.
	 * @see #isSetDoor1CountingState()
	 * @see #unsetDoor1CountingState()
	 * @see #setDoor1CountingState(PassengerCountingDoorCounting)
	 * @see de.jena.model.sensinact.ibis.IbisSensinactPackage#getIbisDevice_Door1CountingState()
	 * @model containment="true" unsettable="true"
	 * @generated
	 */
	PassengerCountingDoorCounting getDoor1CountingState();

	/**
	 * Sets the value of the '{@link de.jena.model.sensinact.ibis.IbisDevice#getDoor1CountingState <em>Door1 Counting State</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Door1 Counting State</em>' containment reference.
	 * @see #isSetDoor1CountingState()
	 * @see #unsetDoor1CountingState()
	 * @see #getDoor1CountingState()
	 * @generated
	 */
	void setDoor1CountingState(PassengerCountingDoorCounting value);

	/**
	 * Unsets the value of the '{@link de.jena.model.sensinact.ibis.IbisDevice#getDoor1CountingState <em>Door1 Counting State</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetDoor1CountingState()
	 * @see #getDoor1CountingState()
	 * @see #setDoor1CountingState(PassengerCountingDoorCounting)
	 * @generated
	 */
	void unsetDoor1CountingState();

	/**
	 * Returns whether the value of the '{@link de.jena.model.sensinact.ibis.IbisDevice#getDoor1CountingState <em>Door1 Counting State</em>}' containment reference is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Door1 Counting State</em>' containment reference is set.
	 * @see #unsetDoor1CountingState()
	 * @see #getDoor1CountingState()
	 * @see #setDoor1CountingState(PassengerCountingDoorCounting)
	 * @generated
	 */
	boolean isSetDoor1CountingState();

	/**
	 * Returns the value of the '<em><b>Door2 Counting State</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Door2 Counting State</em>' containment reference.
	 * @see #isSetDoor2CountingState()
	 * @see #unsetDoor2CountingState()
	 * @see #setDoor2CountingState(PassengerCountingDoorCounting)
	 * @see de.jena.model.sensinact.ibis.IbisSensinactPackage#getIbisDevice_Door2CountingState()
	 * @model containment="true" unsettable="true"
	 * @generated
	 */
	PassengerCountingDoorCounting getDoor2CountingState();

	/**
	 * Sets the value of the '{@link de.jena.model.sensinact.ibis.IbisDevice#getDoor2CountingState <em>Door2 Counting State</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Door2 Counting State</em>' containment reference.
	 * @see #isSetDoor2CountingState()
	 * @see #unsetDoor2CountingState()
	 * @see #getDoor2CountingState()
	 * @generated
	 */
	void setDoor2CountingState(PassengerCountingDoorCounting value);

	/**
	 * Unsets the value of the '{@link de.jena.model.sensinact.ibis.IbisDevice#getDoor2CountingState <em>Door2 Counting State</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetDoor2CountingState()
	 * @see #getDoor2CountingState()
	 * @see #setDoor2CountingState(PassengerCountingDoorCounting)
	 * @generated
	 */
	void unsetDoor2CountingState();

	/**
	 * Returns whether the value of the '{@link de.jena.model.sensinact.ibis.IbisDevice#getDoor2CountingState <em>Door2 Counting State</em>}' containment reference is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Door2 Counting State</em>' containment reference is set.
	 * @see #unsetDoor2CountingState()
	 * @see #getDoor2CountingState()
	 * @see #setDoor2CountingState(PassengerCountingDoorCounting)
	 * @generated
	 */
	boolean isSetDoor2CountingState();

	/**
	 * Returns the value of the '<em><b>Door3 Counting State</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Door3 Counting State</em>' containment reference.
	 * @see #isSetDoor3CountingState()
	 * @see #unsetDoor3CountingState()
	 * @see #setDoor3CountingState(PassengerCountingDoorCounting)
	 * @see de.jena.model.sensinact.ibis.IbisSensinactPackage#getIbisDevice_Door3CountingState()
	 * @model containment="true" unsettable="true"
	 * @generated
	 */
	PassengerCountingDoorCounting getDoor3CountingState();

	/**
	 * Sets the value of the '{@link de.jena.model.sensinact.ibis.IbisDevice#getDoor3CountingState <em>Door3 Counting State</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Door3 Counting State</em>' containment reference.
	 * @see #isSetDoor3CountingState()
	 * @see #unsetDoor3CountingState()
	 * @see #getDoor3CountingState()
	 * @generated
	 */
	void setDoor3CountingState(PassengerCountingDoorCounting value);

	/**
	 * Unsets the value of the '{@link de.jena.model.sensinact.ibis.IbisDevice#getDoor3CountingState <em>Door3 Counting State</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetDoor3CountingState()
	 * @see #getDoor3CountingState()
	 * @see #setDoor3CountingState(PassengerCountingDoorCounting)
	 * @generated
	 */
	void unsetDoor3CountingState();

	/**
	 * Returns whether the value of the '{@link de.jena.model.sensinact.ibis.IbisDevice#getDoor3CountingState <em>Door3 Counting State</em>}' containment reference is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Door3 Counting State</em>' containment reference is set.
	 * @see #unsetDoor3CountingState()
	 * @see #getDoor3CountingState()
	 * @see #setDoor3CountingState(PassengerCountingDoorCounting)
	 * @generated
	 */
	boolean isSetDoor3CountingState();

	/**
	 * Returns the value of the '<em><b>Door4 Counting State</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Door4 Counting State</em>' containment reference.
	 * @see #isSetDoor4CountingState()
	 * @see #unsetDoor4CountingState()
	 * @see #setDoor4CountingState(PassengerCountingDoorCounting)
	 * @see de.jena.model.sensinact.ibis.IbisSensinactPackage#getIbisDevice_Door4CountingState()
	 * @model containment="true" unsettable="true"
	 * @generated
	 */
	PassengerCountingDoorCounting getDoor4CountingState();

	/**
	 * Sets the value of the '{@link de.jena.model.sensinact.ibis.IbisDevice#getDoor4CountingState <em>Door4 Counting State</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Door4 Counting State</em>' containment reference.
	 * @see #isSetDoor4CountingState()
	 * @see #unsetDoor4CountingState()
	 * @see #getDoor4CountingState()
	 * @generated
	 */
	void setDoor4CountingState(PassengerCountingDoorCounting value);

	/**
	 * Unsets the value of the '{@link de.jena.model.sensinact.ibis.IbisDevice#getDoor4CountingState <em>Door4 Counting State</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetDoor4CountingState()
	 * @see #getDoor4CountingState()
	 * @see #setDoor4CountingState(PassengerCountingDoorCounting)
	 * @generated
	 */
	void unsetDoor4CountingState();

	/**
	 * Returns whether the value of the '{@link de.jena.model.sensinact.ibis.IbisDevice#getDoor4CountingState <em>Door4 Counting State</em>}' containment reference is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Door4 Counting State</em>' containment reference is set.
	 * @see #unsetDoor4CountingState()
	 * @see #getDoor4CountingState()
	 * @see #setDoor4CountingState(PassengerCountingDoorCounting)
	 * @generated
	 */
	boolean isSetDoor4CountingState();

	/**
	 * Returns the value of the '<em><b>Door1 State</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Door1 State</em>' containment reference.
	 * @see #setDoor1State(Door)
	 * @see de.jena.model.sensinact.ibis.IbisSensinactPackage#getIbisDevice_Door1State()
	 * @model containment="true"
	 * @generated
	 */
	Door getDoor1State();

	/**
	 * Sets the value of the '{@link de.jena.model.sensinact.ibis.IbisDevice#getDoor1State <em>Door1 State</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Door1 State</em>' containment reference.
	 * @see #getDoor1State()
	 * @generated
	 */
	void setDoor1State(Door value);

	/**
	 * Returns the value of the '<em><b>Door2 State</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Door2 State</em>' containment reference.
	 * @see #setDoor2State(Door)
	 * @see de.jena.model.sensinact.ibis.IbisSensinactPackage#getIbisDevice_Door2State()
	 * @model containment="true"
	 * @generated
	 */
	Door getDoor2State();

	/**
	 * Sets the value of the '{@link de.jena.model.sensinact.ibis.IbisDevice#getDoor2State <em>Door2 State</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Door2 State</em>' containment reference.
	 * @see #getDoor2State()
	 * @generated
	 */
	void setDoor2State(Door value);

	/**
	 * Returns the value of the '<em><b>Door3 State</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Door3 State</em>' containment reference.
	 * @see #setDoor3State(Door)
	 * @see de.jena.model.sensinact.ibis.IbisSensinactPackage#getIbisDevice_Door3State()
	 * @model containment="true"
	 * @generated
	 */
	Door getDoor3State();

	/**
	 * Sets the value of the '{@link de.jena.model.sensinact.ibis.IbisDevice#getDoor3State <em>Door3 State</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Door3 State</em>' containment reference.
	 * @see #getDoor3State()
	 * @generated
	 */
	void setDoor3State(Door value);

	/**
	 * Returns the value of the '<em><b>Door4 State</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Door4 State</em>' containment reference.
	 * @see #setDoor4State(Door)
	 * @see de.jena.model.sensinact.ibis.IbisSensinactPackage#getIbisDevice_Door4State()
	 * @model containment="true"
	 * @generated
	 */
	Door getDoor4State();

	/**
	 * Sets the value of the '{@link de.jena.model.sensinact.ibis.IbisDevice#getDoor4State <em>Door4 State</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Door4 State</em>' containment reference.
	 * @see #getDoor4State()
	 * @generated
	 */
	void setDoor4State(Door value);

	/**
	 * Returns the value of the '<em><b>Stop Requested</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Stop Requested</em>' containment reference.
	 * @see #setStopRequested(StopRequested)
	 * @see de.jena.model.sensinact.ibis.IbisSensinactPackage#getIbisDevice_StopRequested()
	 * @model containment="true"
	 * @generated
	 */
	StopRequested getStopRequested();

	/**
	 * Sets the value of the '{@link de.jena.model.sensinact.ibis.IbisDevice#getStopRequested <em>Stop Requested</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Stop Requested</em>' containment reference.
	 * @see #getStopRequested()
	 * @generated
	 */
	void setStopRequested(StopRequested value);

	/**
	 * Returns the value of the '<em><b>Gnss Location</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Gnss Location</em>' containment reference.
	 * @see #setGnssLocation(GNSSLocation)
	 * @see de.jena.model.sensinact.ibis.IbisSensinactPackage#getIbisDevice_GnssLocation()
	 * @model containment="true"
	 * @generated
	 */
	GNSSLocation getGnssLocation();

	/**
	 * Sets the value of the '{@link de.jena.model.sensinact.ibis.IbisDevice#getGnssLocation <em>Gnss Location</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Gnss Location</em>' containment reference.
	 * @see #getGnssLocation()
	 * @generated
	 */
	void setGnssLocation(GNSSLocation value);

	/**
	 * Returns the value of the '<em><b>Current Tariff Stop</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Current Tariff Stop</em>' containment reference.
	 * @see #setCurrentTariffStop(TicketValidationCurrentTariffStop)
	 * @see de.jena.model.sensinact.ibis.IbisSensinactPackage#getIbisDevice_CurrentTariffStop()
	 * @model containment="true"
	 * @generated
	 */
	TicketValidationCurrentTariffStop getCurrentTariffStop();

	/**
	 * Sets the value of the '{@link de.jena.model.sensinact.ibis.IbisDevice#getCurrentTariffStop <em>Current Tariff Stop</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Current Tariff Stop</em>' containment reference.
	 * @see #getCurrentTariffStop()
	 * @generated
	 */
	void setCurrentTariffStop(TicketValidationCurrentTariffStop value);

	/**
	 * Returns the value of the '<em><b>Razzia</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Razzia</em>' containment reference.
	 * @see #setRazzia(TicketValidationRazzia)
	 * @see de.jena.model.sensinact.ibis.IbisSensinactPackage#getIbisDevice_Razzia()
	 * @model containment="true"
	 * @generated
	 */
	TicketValidationRazzia getRazzia();

	/**
	 * Sets the value of the '{@link de.jena.model.sensinact.ibis.IbisDevice#getRazzia <em>Razzia</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Razzia</em>' containment reference.
	 * @see #getRazzia()
	 * @generated
	 */
	void setRazzia(TicketValidationRazzia value);

	/**
	 * Returns the value of the '<em><b>Current Line</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Current Line</em>' containment reference.
	 * @see #setCurrentLine(TicketValidationCurrentLine)
	 * @see de.jena.model.sensinact.ibis.IbisSensinactPackage#getIbisDevice_CurrentLine()
	 * @model containment="true"
	 * @generated
	 */
	TicketValidationCurrentLine getCurrentLine();

	/**
	 * Sets the value of the '{@link de.jena.model.sensinact.ibis.IbisDevice#getCurrentLine <em>Current Line</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Current Line</em>' containment reference.
	 * @see #getCurrentLine()
	 * @generated
	 */
	void setCurrentLine(TicketValidationCurrentLine value);

	/**
	 * Returns the value of the '<em><b>Vehicle</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Vehicle</em>' containment reference.
	 * @see #setVehicle(TicketValidationVehicle)
	 * @see de.jena.model.sensinact.ibis.IbisSensinactPackage#getIbisDevice_Vehicle()
	 * @model containment="true"
	 * @generated
	 */
	TicketValidationVehicle getVehicle();

	/**
	 * Sets the value of the '{@link de.jena.model.sensinact.ibis.IbisDevice#getVehicle <em>Vehicle</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Vehicle</em>' containment reference.
	 * @see #getVehicle()
	 * @generated
	 */
	void setVehicle(TicketValidationVehicle value);

	/**
	 * Returns the value of the '<em><b>Trip Info</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Trip Info</em>' containment reference.
	 * @see #setTripInfo(TripInfo)
	 * @see de.jena.model.sensinact.ibis.IbisSensinactPackage#getIbisDevice_TripInfo()
	 * @model containment="true"
	 * @generated
	 */
	TripInfo getTripInfo();

	/**
	 * Sets the value of the '{@link de.jena.model.sensinact.ibis.IbisDevice#getTripInfo <em>Trip Info</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Trip Info</em>' containment reference.
	 * @see #getTripInfo()
	 * @generated
	 */
	void setTripInfo(TripInfo value);

} // IbisDevice
