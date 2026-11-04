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
package de.jena.model.sensinact.ibis.impl;

import de.jena.model.sensinact.ibis.CustomerInfoAll;
import de.jena.model.sensinact.ibis.CustomerInfoCurrentAnnouncement;
import de.jena.model.sensinact.ibis.CustomerInfoCurrentConnection;
import de.jena.model.sensinact.ibis.CustomerInfoCurrentDisplayContent;
import de.jena.model.sensinact.ibis.CustomerInfoCurrentStopIndex;
import de.jena.model.sensinact.ibis.CustomerInfoCurrentStopPoint;
import de.jena.model.sensinact.ibis.CustomerInfoTrip;
import de.jena.model.sensinact.ibis.CustomerInfoVehicle;
import de.jena.model.sensinact.ibis.Door;
import de.jena.model.sensinact.ibis.GNSSLocation;
import de.jena.model.sensinact.ibis.IbisAdmin;
import de.jena.model.sensinact.ibis.IbisDevice;
import de.jena.model.sensinact.ibis.IbisSensinactPackage;
import de.jena.model.sensinact.ibis.PassengerCountingDoorCounting;
import de.jena.model.sensinact.ibis.StopRequested;
import de.jena.model.sensinact.ibis.TicketValidationCurrentLine;
import de.jena.model.sensinact.ibis.TicketValidationCurrentTariffStop;
import de.jena.model.sensinact.ibis.TicketValidationRazzia;
import de.jena.model.sensinact.ibis.TicketValidationVehicle;
import de.jena.model.sensinact.ibis.TripInfo;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.sensinact.model.core.provider.impl.ProviderImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Ibis Device</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link de.jena.model.sensinact.ibis.impl.IbisDeviceImpl#getIbisAdmin <em>Ibis Admin</em>}</li>
 *   <li>{@link de.jena.model.sensinact.ibis.impl.IbisDeviceImpl#getCustomerInfoAll <em>Customer Info All</em>}</li>
 *   <li>{@link de.jena.model.sensinact.ibis.impl.IbisDeviceImpl#getCustomerInfoCurrentStopIndex <em>Customer Info Current Stop Index</em>}</li>
 *   <li>{@link de.jena.model.sensinact.ibis.impl.IbisDeviceImpl#getCustomerInfoCurrentStopPoint <em>Customer Info Current Stop Point</em>}</li>
 *   <li>{@link de.jena.model.sensinact.ibis.impl.IbisDeviceImpl#getCustomerInfoTrip <em>Customer Info Trip</em>}</li>
 *   <li>{@link de.jena.model.sensinact.ibis.impl.IbisDeviceImpl#getCustomerInfoVehicle <em>Customer Info Vehicle</em>}</li>
 *   <li>{@link de.jena.model.sensinact.ibis.impl.IbisDeviceImpl#getCustomerInfoCurrentAnnouncement <em>Customer Info Current Announcement</em>}</li>
 *   <li>{@link de.jena.model.sensinact.ibis.impl.IbisDeviceImpl#getCustomerInfoCurrentConnection <em>Customer Info Current Connection</em>}</li>
 *   <li>{@link de.jena.model.sensinact.ibis.impl.IbisDeviceImpl#getCustomerInfoCurrentDisplayContent <em>Customer Info Current Display Content</em>}</li>
 *   <li>{@link de.jena.model.sensinact.ibis.impl.IbisDeviceImpl#getDoor1CountingState <em>Door1 Counting State</em>}</li>
 *   <li>{@link de.jena.model.sensinact.ibis.impl.IbisDeviceImpl#getDoor2CountingState <em>Door2 Counting State</em>}</li>
 *   <li>{@link de.jena.model.sensinact.ibis.impl.IbisDeviceImpl#getDoor3CountingState <em>Door3 Counting State</em>}</li>
 *   <li>{@link de.jena.model.sensinact.ibis.impl.IbisDeviceImpl#getDoor4CountingState <em>Door4 Counting State</em>}</li>
 *   <li>{@link de.jena.model.sensinact.ibis.impl.IbisDeviceImpl#getDoor1State <em>Door1 State</em>}</li>
 *   <li>{@link de.jena.model.sensinact.ibis.impl.IbisDeviceImpl#getDoor2State <em>Door2 State</em>}</li>
 *   <li>{@link de.jena.model.sensinact.ibis.impl.IbisDeviceImpl#getDoor3State <em>Door3 State</em>}</li>
 *   <li>{@link de.jena.model.sensinact.ibis.impl.IbisDeviceImpl#getDoor4State <em>Door4 State</em>}</li>
 *   <li>{@link de.jena.model.sensinact.ibis.impl.IbisDeviceImpl#getStopRequested <em>Stop Requested</em>}</li>
 *   <li>{@link de.jena.model.sensinact.ibis.impl.IbisDeviceImpl#getGnssLocation <em>Gnss Location</em>}</li>
 *   <li>{@link de.jena.model.sensinact.ibis.impl.IbisDeviceImpl#getCurrentTariffStop <em>Current Tariff Stop</em>}</li>
 *   <li>{@link de.jena.model.sensinact.ibis.impl.IbisDeviceImpl#getRazzia <em>Razzia</em>}</li>
 *   <li>{@link de.jena.model.sensinact.ibis.impl.IbisDeviceImpl#getCurrentLine <em>Current Line</em>}</li>
 *   <li>{@link de.jena.model.sensinact.ibis.impl.IbisDeviceImpl#getVehicle <em>Vehicle</em>}</li>
 *   <li>{@link de.jena.model.sensinact.ibis.impl.IbisDeviceImpl#getTripInfo <em>Trip Info</em>}</li>
 * </ul>
 *
 * @generated
 */
public class IbisDeviceImpl extends ProviderImpl implements IbisDevice {
	/**
	 * The cached value of the '{@link #getIbisAdmin() <em>Ibis Admin</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIbisAdmin()
	 * @generated
	 * @ordered
	 */
	protected IbisAdmin ibisAdmin;

	/**
	 * The cached value of the '{@link #getCustomerInfoAll() <em>Customer Info All</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCustomerInfoAll()
	 * @generated
	 * @ordered
	 */
	protected CustomerInfoAll customerInfoAll;

	/**
	 * The cached value of the '{@link #getCustomerInfoCurrentStopIndex() <em>Customer Info Current Stop Index</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCustomerInfoCurrentStopIndex()
	 * @generated
	 * @ordered
	 */
	protected CustomerInfoCurrentStopIndex customerInfoCurrentStopIndex;

	/**
	 * The cached value of the '{@link #getCustomerInfoCurrentStopPoint() <em>Customer Info Current Stop Point</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCustomerInfoCurrentStopPoint()
	 * @generated
	 * @ordered
	 */
	protected CustomerInfoCurrentStopPoint customerInfoCurrentStopPoint;

	/**
	 * The cached value of the '{@link #getCustomerInfoTrip() <em>Customer Info Trip</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCustomerInfoTrip()
	 * @generated
	 * @ordered
	 */
	protected CustomerInfoTrip customerInfoTrip;

	/**
	 * The cached value of the '{@link #getCustomerInfoVehicle() <em>Customer Info Vehicle</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCustomerInfoVehicle()
	 * @generated
	 * @ordered
	 */
	protected CustomerInfoVehicle customerInfoVehicle;

	/**
	 * The cached value of the '{@link #getCustomerInfoCurrentAnnouncement() <em>Customer Info Current Announcement</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCustomerInfoCurrentAnnouncement()
	 * @generated
	 * @ordered
	 */
	protected CustomerInfoCurrentAnnouncement customerInfoCurrentAnnouncement;

	/**
	 * The cached value of the '{@link #getCustomerInfoCurrentConnection() <em>Customer Info Current Connection</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCustomerInfoCurrentConnection()
	 * @generated
	 * @ordered
	 */
	protected CustomerInfoCurrentConnection customerInfoCurrentConnection;

	/**
	 * The cached value of the '{@link #getCustomerInfoCurrentDisplayContent() <em>Customer Info Current Display Content</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCustomerInfoCurrentDisplayContent()
	 * @generated
	 * @ordered
	 */
	protected CustomerInfoCurrentDisplayContent customerInfoCurrentDisplayContent;

	/**
	 * The cached value of the '{@link #getDoor1CountingState() <em>Door1 Counting State</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDoor1CountingState()
	 * @generated
	 * @ordered
	 */
	protected PassengerCountingDoorCounting door1CountingState;

	/**
	 * This is true if the Door1 Counting State containment reference has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean door1CountingStateESet;

	/**
	 * The cached value of the '{@link #getDoor2CountingState() <em>Door2 Counting State</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDoor2CountingState()
	 * @generated
	 * @ordered
	 */
	protected PassengerCountingDoorCounting door2CountingState;

	/**
	 * This is true if the Door2 Counting State containment reference has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean door2CountingStateESet;

	/**
	 * The cached value of the '{@link #getDoor3CountingState() <em>Door3 Counting State</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDoor3CountingState()
	 * @generated
	 * @ordered
	 */
	protected PassengerCountingDoorCounting door3CountingState;

	/**
	 * This is true if the Door3 Counting State containment reference has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean door3CountingStateESet;

	/**
	 * The cached value of the '{@link #getDoor4CountingState() <em>Door4 Counting State</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDoor4CountingState()
	 * @generated
	 * @ordered
	 */
	protected PassengerCountingDoorCounting door4CountingState;

	/**
	 * This is true if the Door4 Counting State containment reference has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean door4CountingStateESet;

	/**
	 * The cached value of the '{@link #getDoor1State() <em>Door1 State</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDoor1State()
	 * @generated
	 * @ordered
	 */
	protected Door door1State;

	/**
	 * The cached value of the '{@link #getDoor2State() <em>Door2 State</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDoor2State()
	 * @generated
	 * @ordered
	 */
	protected Door door2State;

	/**
	 * The cached value of the '{@link #getDoor3State() <em>Door3 State</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDoor3State()
	 * @generated
	 * @ordered
	 */
	protected Door door3State;

	/**
	 * The cached value of the '{@link #getDoor4State() <em>Door4 State</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDoor4State()
	 * @generated
	 * @ordered
	 */
	protected Door door4State;

	/**
	 * The cached value of the '{@link #getStopRequested() <em>Stop Requested</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStopRequested()
	 * @generated
	 * @ordered
	 */
	protected StopRequested stopRequested;

	/**
	 * The cached value of the '{@link #getGnssLocation() <em>Gnss Location</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGnssLocation()
	 * @generated
	 * @ordered
	 */
	protected GNSSLocation gnssLocation;

	/**
	 * The cached value of the '{@link #getCurrentTariffStop() <em>Current Tariff Stop</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCurrentTariffStop()
	 * @generated
	 * @ordered
	 */
	protected TicketValidationCurrentTariffStop currentTariffStop;

	/**
	 * The cached value of the '{@link #getRazzia() <em>Razzia</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRazzia()
	 * @generated
	 * @ordered
	 */
	protected TicketValidationRazzia razzia;

	/**
	 * The cached value of the '{@link #getCurrentLine() <em>Current Line</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCurrentLine()
	 * @generated
	 * @ordered
	 */
	protected TicketValidationCurrentLine currentLine;

	/**
	 * The cached value of the '{@link #getVehicle() <em>Vehicle</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVehicle()
	 * @generated
	 * @ordered
	 */
	protected TicketValidationVehicle vehicle;

	/**
	 * The cached value of the '{@link #getTripInfo() <em>Trip Info</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTripInfo()
	 * @generated
	 * @ordered
	 */
	protected TripInfo tripInfo;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected IbisDeviceImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return IbisSensinactPackage.Literals.IBIS_DEVICE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public IbisAdmin getIbisAdmin() {
		return ibisAdmin;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetIbisAdmin(IbisAdmin newIbisAdmin, NotificationChain msgs) {
		IbisAdmin oldIbisAdmin = ibisAdmin;
		ibisAdmin = newIbisAdmin;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, IbisSensinactPackage.IBIS_DEVICE__IBIS_ADMIN, oldIbisAdmin, newIbisAdmin);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setIbisAdmin(IbisAdmin newIbisAdmin) {
		if (newIbisAdmin != ibisAdmin) {
			NotificationChain msgs = null;
			if (ibisAdmin != null)
				msgs = ((InternalEObject)ibisAdmin).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - IbisSensinactPackage.IBIS_DEVICE__IBIS_ADMIN, null, msgs);
			if (newIbisAdmin != null)
				msgs = ((InternalEObject)newIbisAdmin).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - IbisSensinactPackage.IBIS_DEVICE__IBIS_ADMIN, null, msgs);
			msgs = basicSetIbisAdmin(newIbisAdmin, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, IbisSensinactPackage.IBIS_DEVICE__IBIS_ADMIN, newIbisAdmin, newIbisAdmin));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CustomerInfoAll getCustomerInfoAll() {
		return customerInfoAll;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetCustomerInfoAll(CustomerInfoAll newCustomerInfoAll, NotificationChain msgs) {
		CustomerInfoAll oldCustomerInfoAll = customerInfoAll;
		customerInfoAll = newCustomerInfoAll;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, IbisSensinactPackage.IBIS_DEVICE__CUSTOMER_INFO_ALL, oldCustomerInfoAll, newCustomerInfoAll);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setCustomerInfoAll(CustomerInfoAll newCustomerInfoAll) {
		if (newCustomerInfoAll != customerInfoAll) {
			NotificationChain msgs = null;
			if (customerInfoAll != null)
				msgs = ((InternalEObject)customerInfoAll).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - IbisSensinactPackage.IBIS_DEVICE__CUSTOMER_INFO_ALL, null, msgs);
			if (newCustomerInfoAll != null)
				msgs = ((InternalEObject)newCustomerInfoAll).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - IbisSensinactPackage.IBIS_DEVICE__CUSTOMER_INFO_ALL, null, msgs);
			msgs = basicSetCustomerInfoAll(newCustomerInfoAll, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, IbisSensinactPackage.IBIS_DEVICE__CUSTOMER_INFO_ALL, newCustomerInfoAll, newCustomerInfoAll));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CustomerInfoCurrentStopIndex getCustomerInfoCurrentStopIndex() {
		return customerInfoCurrentStopIndex;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetCustomerInfoCurrentStopIndex(CustomerInfoCurrentStopIndex newCustomerInfoCurrentStopIndex, NotificationChain msgs) {
		CustomerInfoCurrentStopIndex oldCustomerInfoCurrentStopIndex = customerInfoCurrentStopIndex;
		customerInfoCurrentStopIndex = newCustomerInfoCurrentStopIndex;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, IbisSensinactPackage.IBIS_DEVICE__CUSTOMER_INFO_CURRENT_STOP_INDEX, oldCustomerInfoCurrentStopIndex, newCustomerInfoCurrentStopIndex);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setCustomerInfoCurrentStopIndex(CustomerInfoCurrentStopIndex newCustomerInfoCurrentStopIndex) {
		if (newCustomerInfoCurrentStopIndex != customerInfoCurrentStopIndex) {
			NotificationChain msgs = null;
			if (customerInfoCurrentStopIndex != null)
				msgs = ((InternalEObject)customerInfoCurrentStopIndex).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - IbisSensinactPackage.IBIS_DEVICE__CUSTOMER_INFO_CURRENT_STOP_INDEX, null, msgs);
			if (newCustomerInfoCurrentStopIndex != null)
				msgs = ((InternalEObject)newCustomerInfoCurrentStopIndex).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - IbisSensinactPackage.IBIS_DEVICE__CUSTOMER_INFO_CURRENT_STOP_INDEX, null, msgs);
			msgs = basicSetCustomerInfoCurrentStopIndex(newCustomerInfoCurrentStopIndex, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, IbisSensinactPackage.IBIS_DEVICE__CUSTOMER_INFO_CURRENT_STOP_INDEX, newCustomerInfoCurrentStopIndex, newCustomerInfoCurrentStopIndex));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CustomerInfoCurrentStopPoint getCustomerInfoCurrentStopPoint() {
		return customerInfoCurrentStopPoint;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetCustomerInfoCurrentStopPoint(CustomerInfoCurrentStopPoint newCustomerInfoCurrentStopPoint, NotificationChain msgs) {
		CustomerInfoCurrentStopPoint oldCustomerInfoCurrentStopPoint = customerInfoCurrentStopPoint;
		customerInfoCurrentStopPoint = newCustomerInfoCurrentStopPoint;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, IbisSensinactPackage.IBIS_DEVICE__CUSTOMER_INFO_CURRENT_STOP_POINT, oldCustomerInfoCurrentStopPoint, newCustomerInfoCurrentStopPoint);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setCustomerInfoCurrentStopPoint(CustomerInfoCurrentStopPoint newCustomerInfoCurrentStopPoint) {
		if (newCustomerInfoCurrentStopPoint != customerInfoCurrentStopPoint) {
			NotificationChain msgs = null;
			if (customerInfoCurrentStopPoint != null)
				msgs = ((InternalEObject)customerInfoCurrentStopPoint).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - IbisSensinactPackage.IBIS_DEVICE__CUSTOMER_INFO_CURRENT_STOP_POINT, null, msgs);
			if (newCustomerInfoCurrentStopPoint != null)
				msgs = ((InternalEObject)newCustomerInfoCurrentStopPoint).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - IbisSensinactPackage.IBIS_DEVICE__CUSTOMER_INFO_CURRENT_STOP_POINT, null, msgs);
			msgs = basicSetCustomerInfoCurrentStopPoint(newCustomerInfoCurrentStopPoint, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, IbisSensinactPackage.IBIS_DEVICE__CUSTOMER_INFO_CURRENT_STOP_POINT, newCustomerInfoCurrentStopPoint, newCustomerInfoCurrentStopPoint));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CustomerInfoTrip getCustomerInfoTrip() {
		return customerInfoTrip;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetCustomerInfoTrip(CustomerInfoTrip newCustomerInfoTrip, NotificationChain msgs) {
		CustomerInfoTrip oldCustomerInfoTrip = customerInfoTrip;
		customerInfoTrip = newCustomerInfoTrip;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, IbisSensinactPackage.IBIS_DEVICE__CUSTOMER_INFO_TRIP, oldCustomerInfoTrip, newCustomerInfoTrip);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setCustomerInfoTrip(CustomerInfoTrip newCustomerInfoTrip) {
		if (newCustomerInfoTrip != customerInfoTrip) {
			NotificationChain msgs = null;
			if (customerInfoTrip != null)
				msgs = ((InternalEObject)customerInfoTrip).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - IbisSensinactPackage.IBIS_DEVICE__CUSTOMER_INFO_TRIP, null, msgs);
			if (newCustomerInfoTrip != null)
				msgs = ((InternalEObject)newCustomerInfoTrip).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - IbisSensinactPackage.IBIS_DEVICE__CUSTOMER_INFO_TRIP, null, msgs);
			msgs = basicSetCustomerInfoTrip(newCustomerInfoTrip, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, IbisSensinactPackage.IBIS_DEVICE__CUSTOMER_INFO_TRIP, newCustomerInfoTrip, newCustomerInfoTrip));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CustomerInfoVehicle getCustomerInfoVehicle() {
		return customerInfoVehicle;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetCustomerInfoVehicle(CustomerInfoVehicle newCustomerInfoVehicle, NotificationChain msgs) {
		CustomerInfoVehicle oldCustomerInfoVehicle = customerInfoVehicle;
		customerInfoVehicle = newCustomerInfoVehicle;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, IbisSensinactPackage.IBIS_DEVICE__CUSTOMER_INFO_VEHICLE, oldCustomerInfoVehicle, newCustomerInfoVehicle);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setCustomerInfoVehicle(CustomerInfoVehicle newCustomerInfoVehicle) {
		if (newCustomerInfoVehicle != customerInfoVehicle) {
			NotificationChain msgs = null;
			if (customerInfoVehicle != null)
				msgs = ((InternalEObject)customerInfoVehicle).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - IbisSensinactPackage.IBIS_DEVICE__CUSTOMER_INFO_VEHICLE, null, msgs);
			if (newCustomerInfoVehicle != null)
				msgs = ((InternalEObject)newCustomerInfoVehicle).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - IbisSensinactPackage.IBIS_DEVICE__CUSTOMER_INFO_VEHICLE, null, msgs);
			msgs = basicSetCustomerInfoVehicle(newCustomerInfoVehicle, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, IbisSensinactPackage.IBIS_DEVICE__CUSTOMER_INFO_VEHICLE, newCustomerInfoVehicle, newCustomerInfoVehicle));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CustomerInfoCurrentAnnouncement getCustomerInfoCurrentAnnouncement() {
		return customerInfoCurrentAnnouncement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetCustomerInfoCurrentAnnouncement(CustomerInfoCurrentAnnouncement newCustomerInfoCurrentAnnouncement, NotificationChain msgs) {
		CustomerInfoCurrentAnnouncement oldCustomerInfoCurrentAnnouncement = customerInfoCurrentAnnouncement;
		customerInfoCurrentAnnouncement = newCustomerInfoCurrentAnnouncement;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, IbisSensinactPackage.IBIS_DEVICE__CUSTOMER_INFO_CURRENT_ANNOUNCEMENT, oldCustomerInfoCurrentAnnouncement, newCustomerInfoCurrentAnnouncement);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setCustomerInfoCurrentAnnouncement(CustomerInfoCurrentAnnouncement newCustomerInfoCurrentAnnouncement) {
		if (newCustomerInfoCurrentAnnouncement != customerInfoCurrentAnnouncement) {
			NotificationChain msgs = null;
			if (customerInfoCurrentAnnouncement != null)
				msgs = ((InternalEObject)customerInfoCurrentAnnouncement).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - IbisSensinactPackage.IBIS_DEVICE__CUSTOMER_INFO_CURRENT_ANNOUNCEMENT, null, msgs);
			if (newCustomerInfoCurrentAnnouncement != null)
				msgs = ((InternalEObject)newCustomerInfoCurrentAnnouncement).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - IbisSensinactPackage.IBIS_DEVICE__CUSTOMER_INFO_CURRENT_ANNOUNCEMENT, null, msgs);
			msgs = basicSetCustomerInfoCurrentAnnouncement(newCustomerInfoCurrentAnnouncement, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, IbisSensinactPackage.IBIS_DEVICE__CUSTOMER_INFO_CURRENT_ANNOUNCEMENT, newCustomerInfoCurrentAnnouncement, newCustomerInfoCurrentAnnouncement));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CustomerInfoCurrentConnection getCustomerInfoCurrentConnection() {
		return customerInfoCurrentConnection;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetCustomerInfoCurrentConnection(CustomerInfoCurrentConnection newCustomerInfoCurrentConnection, NotificationChain msgs) {
		CustomerInfoCurrentConnection oldCustomerInfoCurrentConnection = customerInfoCurrentConnection;
		customerInfoCurrentConnection = newCustomerInfoCurrentConnection;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, IbisSensinactPackage.IBIS_DEVICE__CUSTOMER_INFO_CURRENT_CONNECTION, oldCustomerInfoCurrentConnection, newCustomerInfoCurrentConnection);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setCustomerInfoCurrentConnection(CustomerInfoCurrentConnection newCustomerInfoCurrentConnection) {
		if (newCustomerInfoCurrentConnection != customerInfoCurrentConnection) {
			NotificationChain msgs = null;
			if (customerInfoCurrentConnection != null)
				msgs = ((InternalEObject)customerInfoCurrentConnection).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - IbisSensinactPackage.IBIS_DEVICE__CUSTOMER_INFO_CURRENT_CONNECTION, null, msgs);
			if (newCustomerInfoCurrentConnection != null)
				msgs = ((InternalEObject)newCustomerInfoCurrentConnection).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - IbisSensinactPackage.IBIS_DEVICE__CUSTOMER_INFO_CURRENT_CONNECTION, null, msgs);
			msgs = basicSetCustomerInfoCurrentConnection(newCustomerInfoCurrentConnection, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, IbisSensinactPackage.IBIS_DEVICE__CUSTOMER_INFO_CURRENT_CONNECTION, newCustomerInfoCurrentConnection, newCustomerInfoCurrentConnection));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CustomerInfoCurrentDisplayContent getCustomerInfoCurrentDisplayContent() {
		return customerInfoCurrentDisplayContent;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetCustomerInfoCurrentDisplayContent(CustomerInfoCurrentDisplayContent newCustomerInfoCurrentDisplayContent, NotificationChain msgs) {
		CustomerInfoCurrentDisplayContent oldCustomerInfoCurrentDisplayContent = customerInfoCurrentDisplayContent;
		customerInfoCurrentDisplayContent = newCustomerInfoCurrentDisplayContent;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, IbisSensinactPackage.IBIS_DEVICE__CUSTOMER_INFO_CURRENT_DISPLAY_CONTENT, oldCustomerInfoCurrentDisplayContent, newCustomerInfoCurrentDisplayContent);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setCustomerInfoCurrentDisplayContent(CustomerInfoCurrentDisplayContent newCustomerInfoCurrentDisplayContent) {
		if (newCustomerInfoCurrentDisplayContent != customerInfoCurrentDisplayContent) {
			NotificationChain msgs = null;
			if (customerInfoCurrentDisplayContent != null)
				msgs = ((InternalEObject)customerInfoCurrentDisplayContent).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - IbisSensinactPackage.IBIS_DEVICE__CUSTOMER_INFO_CURRENT_DISPLAY_CONTENT, null, msgs);
			if (newCustomerInfoCurrentDisplayContent != null)
				msgs = ((InternalEObject)newCustomerInfoCurrentDisplayContent).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - IbisSensinactPackage.IBIS_DEVICE__CUSTOMER_INFO_CURRENT_DISPLAY_CONTENT, null, msgs);
			msgs = basicSetCustomerInfoCurrentDisplayContent(newCustomerInfoCurrentDisplayContent, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, IbisSensinactPackage.IBIS_DEVICE__CUSTOMER_INFO_CURRENT_DISPLAY_CONTENT, newCustomerInfoCurrentDisplayContent, newCustomerInfoCurrentDisplayContent));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public PassengerCountingDoorCounting getDoor1CountingState() {
		return door1CountingState;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDoor1CountingState(PassengerCountingDoorCounting newDoor1CountingState, NotificationChain msgs) {
		PassengerCountingDoorCounting oldDoor1CountingState = door1CountingState;
		door1CountingState = newDoor1CountingState;
		boolean oldDoor1CountingStateESet = door1CountingStateESet;
		door1CountingStateESet = true;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, IbisSensinactPackage.IBIS_DEVICE__DOOR1_COUNTING_STATE, oldDoor1CountingState, newDoor1CountingState, !oldDoor1CountingStateESet);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setDoor1CountingState(PassengerCountingDoorCounting newDoor1CountingState) {
		if (newDoor1CountingState != door1CountingState) {
			NotificationChain msgs = null;
			if (door1CountingState != null)
				msgs = ((InternalEObject)door1CountingState).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - IbisSensinactPackage.IBIS_DEVICE__DOOR1_COUNTING_STATE, null, msgs);
			if (newDoor1CountingState != null)
				msgs = ((InternalEObject)newDoor1CountingState).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - IbisSensinactPackage.IBIS_DEVICE__DOOR1_COUNTING_STATE, null, msgs);
			msgs = basicSetDoor1CountingState(newDoor1CountingState, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else {
			boolean oldDoor1CountingStateESet = door1CountingStateESet;
			door1CountingStateESet = true;
			if (eNotificationRequired())
				eNotify(new ENotificationImpl(this, Notification.SET, IbisSensinactPackage.IBIS_DEVICE__DOOR1_COUNTING_STATE, newDoor1CountingState, newDoor1CountingState, !oldDoor1CountingStateESet));
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicUnsetDoor1CountingState(NotificationChain msgs) {
		PassengerCountingDoorCounting oldDoor1CountingState = door1CountingState;
		door1CountingState = null;
		boolean oldDoor1CountingStateESet = door1CountingStateESet;
		door1CountingStateESet = false;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.UNSET, IbisSensinactPackage.IBIS_DEVICE__DOOR1_COUNTING_STATE, oldDoor1CountingState, null, oldDoor1CountingStateESet);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void unsetDoor1CountingState() {
		if (door1CountingState != null) {
			NotificationChain msgs = null;
			msgs = ((InternalEObject)door1CountingState).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - IbisSensinactPackage.IBIS_DEVICE__DOOR1_COUNTING_STATE, null, msgs);
			msgs = basicUnsetDoor1CountingState(msgs);
			if (msgs != null) msgs.dispatch();
		}
		else {
			boolean oldDoor1CountingStateESet = door1CountingStateESet;
			door1CountingStateESet = false;
			if (eNotificationRequired())
				eNotify(new ENotificationImpl(this, Notification.UNSET, IbisSensinactPackage.IBIS_DEVICE__DOOR1_COUNTING_STATE, null, null, oldDoor1CountingStateESet));
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isSetDoor1CountingState() {
		return door1CountingStateESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public PassengerCountingDoorCounting getDoor2CountingState() {
		return door2CountingState;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDoor2CountingState(PassengerCountingDoorCounting newDoor2CountingState, NotificationChain msgs) {
		PassengerCountingDoorCounting oldDoor2CountingState = door2CountingState;
		door2CountingState = newDoor2CountingState;
		boolean oldDoor2CountingStateESet = door2CountingStateESet;
		door2CountingStateESet = true;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, IbisSensinactPackage.IBIS_DEVICE__DOOR2_COUNTING_STATE, oldDoor2CountingState, newDoor2CountingState, !oldDoor2CountingStateESet);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setDoor2CountingState(PassengerCountingDoorCounting newDoor2CountingState) {
		if (newDoor2CountingState != door2CountingState) {
			NotificationChain msgs = null;
			if (door2CountingState != null)
				msgs = ((InternalEObject)door2CountingState).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - IbisSensinactPackage.IBIS_DEVICE__DOOR2_COUNTING_STATE, null, msgs);
			if (newDoor2CountingState != null)
				msgs = ((InternalEObject)newDoor2CountingState).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - IbisSensinactPackage.IBIS_DEVICE__DOOR2_COUNTING_STATE, null, msgs);
			msgs = basicSetDoor2CountingState(newDoor2CountingState, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else {
			boolean oldDoor2CountingStateESet = door2CountingStateESet;
			door2CountingStateESet = true;
			if (eNotificationRequired())
				eNotify(new ENotificationImpl(this, Notification.SET, IbisSensinactPackage.IBIS_DEVICE__DOOR2_COUNTING_STATE, newDoor2CountingState, newDoor2CountingState, !oldDoor2CountingStateESet));
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicUnsetDoor2CountingState(NotificationChain msgs) {
		PassengerCountingDoorCounting oldDoor2CountingState = door2CountingState;
		door2CountingState = null;
		boolean oldDoor2CountingStateESet = door2CountingStateESet;
		door2CountingStateESet = false;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.UNSET, IbisSensinactPackage.IBIS_DEVICE__DOOR2_COUNTING_STATE, oldDoor2CountingState, null, oldDoor2CountingStateESet);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void unsetDoor2CountingState() {
		if (door2CountingState != null) {
			NotificationChain msgs = null;
			msgs = ((InternalEObject)door2CountingState).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - IbisSensinactPackage.IBIS_DEVICE__DOOR2_COUNTING_STATE, null, msgs);
			msgs = basicUnsetDoor2CountingState(msgs);
			if (msgs != null) msgs.dispatch();
		}
		else {
			boolean oldDoor2CountingStateESet = door2CountingStateESet;
			door2CountingStateESet = false;
			if (eNotificationRequired())
				eNotify(new ENotificationImpl(this, Notification.UNSET, IbisSensinactPackage.IBIS_DEVICE__DOOR2_COUNTING_STATE, null, null, oldDoor2CountingStateESet));
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isSetDoor2CountingState() {
		return door2CountingStateESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public PassengerCountingDoorCounting getDoor3CountingState() {
		return door3CountingState;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDoor3CountingState(PassengerCountingDoorCounting newDoor3CountingState, NotificationChain msgs) {
		PassengerCountingDoorCounting oldDoor3CountingState = door3CountingState;
		door3CountingState = newDoor3CountingState;
		boolean oldDoor3CountingStateESet = door3CountingStateESet;
		door3CountingStateESet = true;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, IbisSensinactPackage.IBIS_DEVICE__DOOR3_COUNTING_STATE, oldDoor3CountingState, newDoor3CountingState, !oldDoor3CountingStateESet);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setDoor3CountingState(PassengerCountingDoorCounting newDoor3CountingState) {
		if (newDoor3CountingState != door3CountingState) {
			NotificationChain msgs = null;
			if (door3CountingState != null)
				msgs = ((InternalEObject)door3CountingState).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - IbisSensinactPackage.IBIS_DEVICE__DOOR3_COUNTING_STATE, null, msgs);
			if (newDoor3CountingState != null)
				msgs = ((InternalEObject)newDoor3CountingState).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - IbisSensinactPackage.IBIS_DEVICE__DOOR3_COUNTING_STATE, null, msgs);
			msgs = basicSetDoor3CountingState(newDoor3CountingState, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else {
			boolean oldDoor3CountingStateESet = door3CountingStateESet;
			door3CountingStateESet = true;
			if (eNotificationRequired())
				eNotify(new ENotificationImpl(this, Notification.SET, IbisSensinactPackage.IBIS_DEVICE__DOOR3_COUNTING_STATE, newDoor3CountingState, newDoor3CountingState, !oldDoor3CountingStateESet));
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicUnsetDoor3CountingState(NotificationChain msgs) {
		PassengerCountingDoorCounting oldDoor3CountingState = door3CountingState;
		door3CountingState = null;
		boolean oldDoor3CountingStateESet = door3CountingStateESet;
		door3CountingStateESet = false;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.UNSET, IbisSensinactPackage.IBIS_DEVICE__DOOR3_COUNTING_STATE, oldDoor3CountingState, null, oldDoor3CountingStateESet);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void unsetDoor3CountingState() {
		if (door3CountingState != null) {
			NotificationChain msgs = null;
			msgs = ((InternalEObject)door3CountingState).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - IbisSensinactPackage.IBIS_DEVICE__DOOR3_COUNTING_STATE, null, msgs);
			msgs = basicUnsetDoor3CountingState(msgs);
			if (msgs != null) msgs.dispatch();
		}
		else {
			boolean oldDoor3CountingStateESet = door3CountingStateESet;
			door3CountingStateESet = false;
			if (eNotificationRequired())
				eNotify(new ENotificationImpl(this, Notification.UNSET, IbisSensinactPackage.IBIS_DEVICE__DOOR3_COUNTING_STATE, null, null, oldDoor3CountingStateESet));
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isSetDoor3CountingState() {
		return door3CountingStateESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public PassengerCountingDoorCounting getDoor4CountingState() {
		return door4CountingState;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDoor4CountingState(PassengerCountingDoorCounting newDoor4CountingState, NotificationChain msgs) {
		PassengerCountingDoorCounting oldDoor4CountingState = door4CountingState;
		door4CountingState = newDoor4CountingState;
		boolean oldDoor4CountingStateESet = door4CountingStateESet;
		door4CountingStateESet = true;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, IbisSensinactPackage.IBIS_DEVICE__DOOR4_COUNTING_STATE, oldDoor4CountingState, newDoor4CountingState, !oldDoor4CountingStateESet);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setDoor4CountingState(PassengerCountingDoorCounting newDoor4CountingState) {
		if (newDoor4CountingState != door4CountingState) {
			NotificationChain msgs = null;
			if (door4CountingState != null)
				msgs = ((InternalEObject)door4CountingState).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - IbisSensinactPackage.IBIS_DEVICE__DOOR4_COUNTING_STATE, null, msgs);
			if (newDoor4CountingState != null)
				msgs = ((InternalEObject)newDoor4CountingState).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - IbisSensinactPackage.IBIS_DEVICE__DOOR4_COUNTING_STATE, null, msgs);
			msgs = basicSetDoor4CountingState(newDoor4CountingState, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else {
			boolean oldDoor4CountingStateESet = door4CountingStateESet;
			door4CountingStateESet = true;
			if (eNotificationRequired())
				eNotify(new ENotificationImpl(this, Notification.SET, IbisSensinactPackage.IBIS_DEVICE__DOOR4_COUNTING_STATE, newDoor4CountingState, newDoor4CountingState, !oldDoor4CountingStateESet));
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicUnsetDoor4CountingState(NotificationChain msgs) {
		PassengerCountingDoorCounting oldDoor4CountingState = door4CountingState;
		door4CountingState = null;
		boolean oldDoor4CountingStateESet = door4CountingStateESet;
		door4CountingStateESet = false;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.UNSET, IbisSensinactPackage.IBIS_DEVICE__DOOR4_COUNTING_STATE, oldDoor4CountingState, null, oldDoor4CountingStateESet);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void unsetDoor4CountingState() {
		if (door4CountingState != null) {
			NotificationChain msgs = null;
			msgs = ((InternalEObject)door4CountingState).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - IbisSensinactPackage.IBIS_DEVICE__DOOR4_COUNTING_STATE, null, msgs);
			msgs = basicUnsetDoor4CountingState(msgs);
			if (msgs != null) msgs.dispatch();
		}
		else {
			boolean oldDoor4CountingStateESet = door4CountingStateESet;
			door4CountingStateESet = false;
			if (eNotificationRequired())
				eNotify(new ENotificationImpl(this, Notification.UNSET, IbisSensinactPackage.IBIS_DEVICE__DOOR4_COUNTING_STATE, null, null, oldDoor4CountingStateESet));
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isSetDoor4CountingState() {
		return door4CountingStateESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Door getDoor1State() {
		return door1State;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDoor1State(Door newDoor1State, NotificationChain msgs) {
		Door oldDoor1State = door1State;
		door1State = newDoor1State;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, IbisSensinactPackage.IBIS_DEVICE__DOOR1_STATE, oldDoor1State, newDoor1State);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setDoor1State(Door newDoor1State) {
		if (newDoor1State != door1State) {
			NotificationChain msgs = null;
			if (door1State != null)
				msgs = ((InternalEObject)door1State).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - IbisSensinactPackage.IBIS_DEVICE__DOOR1_STATE, null, msgs);
			if (newDoor1State != null)
				msgs = ((InternalEObject)newDoor1State).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - IbisSensinactPackage.IBIS_DEVICE__DOOR1_STATE, null, msgs);
			msgs = basicSetDoor1State(newDoor1State, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, IbisSensinactPackage.IBIS_DEVICE__DOOR1_STATE, newDoor1State, newDoor1State));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Door getDoor2State() {
		return door2State;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDoor2State(Door newDoor2State, NotificationChain msgs) {
		Door oldDoor2State = door2State;
		door2State = newDoor2State;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, IbisSensinactPackage.IBIS_DEVICE__DOOR2_STATE, oldDoor2State, newDoor2State);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setDoor2State(Door newDoor2State) {
		if (newDoor2State != door2State) {
			NotificationChain msgs = null;
			if (door2State != null)
				msgs = ((InternalEObject)door2State).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - IbisSensinactPackage.IBIS_DEVICE__DOOR2_STATE, null, msgs);
			if (newDoor2State != null)
				msgs = ((InternalEObject)newDoor2State).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - IbisSensinactPackage.IBIS_DEVICE__DOOR2_STATE, null, msgs);
			msgs = basicSetDoor2State(newDoor2State, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, IbisSensinactPackage.IBIS_DEVICE__DOOR2_STATE, newDoor2State, newDoor2State));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Door getDoor3State() {
		return door3State;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDoor3State(Door newDoor3State, NotificationChain msgs) {
		Door oldDoor3State = door3State;
		door3State = newDoor3State;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, IbisSensinactPackage.IBIS_DEVICE__DOOR3_STATE, oldDoor3State, newDoor3State);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setDoor3State(Door newDoor3State) {
		if (newDoor3State != door3State) {
			NotificationChain msgs = null;
			if (door3State != null)
				msgs = ((InternalEObject)door3State).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - IbisSensinactPackage.IBIS_DEVICE__DOOR3_STATE, null, msgs);
			if (newDoor3State != null)
				msgs = ((InternalEObject)newDoor3State).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - IbisSensinactPackage.IBIS_DEVICE__DOOR3_STATE, null, msgs);
			msgs = basicSetDoor3State(newDoor3State, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, IbisSensinactPackage.IBIS_DEVICE__DOOR3_STATE, newDoor3State, newDoor3State));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Door getDoor4State() {
		return door4State;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDoor4State(Door newDoor4State, NotificationChain msgs) {
		Door oldDoor4State = door4State;
		door4State = newDoor4State;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, IbisSensinactPackage.IBIS_DEVICE__DOOR4_STATE, oldDoor4State, newDoor4State);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setDoor4State(Door newDoor4State) {
		if (newDoor4State != door4State) {
			NotificationChain msgs = null;
			if (door4State != null)
				msgs = ((InternalEObject)door4State).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - IbisSensinactPackage.IBIS_DEVICE__DOOR4_STATE, null, msgs);
			if (newDoor4State != null)
				msgs = ((InternalEObject)newDoor4State).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - IbisSensinactPackage.IBIS_DEVICE__DOOR4_STATE, null, msgs);
			msgs = basicSetDoor4State(newDoor4State, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, IbisSensinactPackage.IBIS_DEVICE__DOOR4_STATE, newDoor4State, newDoor4State));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public StopRequested getStopRequested() {
		return stopRequested;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetStopRequested(StopRequested newStopRequested, NotificationChain msgs) {
		StopRequested oldStopRequested = stopRequested;
		stopRequested = newStopRequested;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, IbisSensinactPackage.IBIS_DEVICE__STOP_REQUESTED, oldStopRequested, newStopRequested);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setStopRequested(StopRequested newStopRequested) {
		if (newStopRequested != stopRequested) {
			NotificationChain msgs = null;
			if (stopRequested != null)
				msgs = ((InternalEObject)stopRequested).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - IbisSensinactPackage.IBIS_DEVICE__STOP_REQUESTED, null, msgs);
			if (newStopRequested != null)
				msgs = ((InternalEObject)newStopRequested).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - IbisSensinactPackage.IBIS_DEVICE__STOP_REQUESTED, null, msgs);
			msgs = basicSetStopRequested(newStopRequested, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, IbisSensinactPackage.IBIS_DEVICE__STOP_REQUESTED, newStopRequested, newStopRequested));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public GNSSLocation getGnssLocation() {
		return gnssLocation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetGnssLocation(GNSSLocation newGnssLocation, NotificationChain msgs) {
		GNSSLocation oldGnssLocation = gnssLocation;
		gnssLocation = newGnssLocation;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, IbisSensinactPackage.IBIS_DEVICE__GNSS_LOCATION, oldGnssLocation, newGnssLocation);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setGnssLocation(GNSSLocation newGnssLocation) {
		if (newGnssLocation != gnssLocation) {
			NotificationChain msgs = null;
			if (gnssLocation != null)
				msgs = ((InternalEObject)gnssLocation).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - IbisSensinactPackage.IBIS_DEVICE__GNSS_LOCATION, null, msgs);
			if (newGnssLocation != null)
				msgs = ((InternalEObject)newGnssLocation).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - IbisSensinactPackage.IBIS_DEVICE__GNSS_LOCATION, null, msgs);
			msgs = basicSetGnssLocation(newGnssLocation, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, IbisSensinactPackage.IBIS_DEVICE__GNSS_LOCATION, newGnssLocation, newGnssLocation));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public TicketValidationCurrentTariffStop getCurrentTariffStop() {
		return currentTariffStop;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetCurrentTariffStop(TicketValidationCurrentTariffStop newCurrentTariffStop, NotificationChain msgs) {
		TicketValidationCurrentTariffStop oldCurrentTariffStop = currentTariffStop;
		currentTariffStop = newCurrentTariffStop;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, IbisSensinactPackage.IBIS_DEVICE__CURRENT_TARIFF_STOP, oldCurrentTariffStop, newCurrentTariffStop);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setCurrentTariffStop(TicketValidationCurrentTariffStop newCurrentTariffStop) {
		if (newCurrentTariffStop != currentTariffStop) {
			NotificationChain msgs = null;
			if (currentTariffStop != null)
				msgs = ((InternalEObject)currentTariffStop).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - IbisSensinactPackage.IBIS_DEVICE__CURRENT_TARIFF_STOP, null, msgs);
			if (newCurrentTariffStop != null)
				msgs = ((InternalEObject)newCurrentTariffStop).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - IbisSensinactPackage.IBIS_DEVICE__CURRENT_TARIFF_STOP, null, msgs);
			msgs = basicSetCurrentTariffStop(newCurrentTariffStop, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, IbisSensinactPackage.IBIS_DEVICE__CURRENT_TARIFF_STOP, newCurrentTariffStop, newCurrentTariffStop));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public TicketValidationRazzia getRazzia() {
		return razzia;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetRazzia(TicketValidationRazzia newRazzia, NotificationChain msgs) {
		TicketValidationRazzia oldRazzia = razzia;
		razzia = newRazzia;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, IbisSensinactPackage.IBIS_DEVICE__RAZZIA, oldRazzia, newRazzia);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setRazzia(TicketValidationRazzia newRazzia) {
		if (newRazzia != razzia) {
			NotificationChain msgs = null;
			if (razzia != null)
				msgs = ((InternalEObject)razzia).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - IbisSensinactPackage.IBIS_DEVICE__RAZZIA, null, msgs);
			if (newRazzia != null)
				msgs = ((InternalEObject)newRazzia).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - IbisSensinactPackage.IBIS_DEVICE__RAZZIA, null, msgs);
			msgs = basicSetRazzia(newRazzia, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, IbisSensinactPackage.IBIS_DEVICE__RAZZIA, newRazzia, newRazzia));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public TicketValidationCurrentLine getCurrentLine() {
		return currentLine;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetCurrentLine(TicketValidationCurrentLine newCurrentLine, NotificationChain msgs) {
		TicketValidationCurrentLine oldCurrentLine = currentLine;
		currentLine = newCurrentLine;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, IbisSensinactPackage.IBIS_DEVICE__CURRENT_LINE, oldCurrentLine, newCurrentLine);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setCurrentLine(TicketValidationCurrentLine newCurrentLine) {
		if (newCurrentLine != currentLine) {
			NotificationChain msgs = null;
			if (currentLine != null)
				msgs = ((InternalEObject)currentLine).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - IbisSensinactPackage.IBIS_DEVICE__CURRENT_LINE, null, msgs);
			if (newCurrentLine != null)
				msgs = ((InternalEObject)newCurrentLine).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - IbisSensinactPackage.IBIS_DEVICE__CURRENT_LINE, null, msgs);
			msgs = basicSetCurrentLine(newCurrentLine, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, IbisSensinactPackage.IBIS_DEVICE__CURRENT_LINE, newCurrentLine, newCurrentLine));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public TicketValidationVehicle getVehicle() {
		return vehicle;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetVehicle(TicketValidationVehicle newVehicle, NotificationChain msgs) {
		TicketValidationVehicle oldVehicle = vehicle;
		vehicle = newVehicle;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, IbisSensinactPackage.IBIS_DEVICE__VEHICLE, oldVehicle, newVehicle);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setVehicle(TicketValidationVehicle newVehicle) {
		if (newVehicle != vehicle) {
			NotificationChain msgs = null;
			if (vehicle != null)
				msgs = ((InternalEObject)vehicle).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - IbisSensinactPackage.IBIS_DEVICE__VEHICLE, null, msgs);
			if (newVehicle != null)
				msgs = ((InternalEObject)newVehicle).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - IbisSensinactPackage.IBIS_DEVICE__VEHICLE, null, msgs);
			msgs = basicSetVehicle(newVehicle, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, IbisSensinactPackage.IBIS_DEVICE__VEHICLE, newVehicle, newVehicle));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public TripInfo getTripInfo() {
		return tripInfo;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetTripInfo(TripInfo newTripInfo, NotificationChain msgs) {
		TripInfo oldTripInfo = tripInfo;
		tripInfo = newTripInfo;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, IbisSensinactPackage.IBIS_DEVICE__TRIP_INFO, oldTripInfo, newTripInfo);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setTripInfo(TripInfo newTripInfo) {
		if (newTripInfo != tripInfo) {
			NotificationChain msgs = null;
			if (tripInfo != null)
				msgs = ((InternalEObject)tripInfo).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - IbisSensinactPackage.IBIS_DEVICE__TRIP_INFO, null, msgs);
			if (newTripInfo != null)
				msgs = ((InternalEObject)newTripInfo).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - IbisSensinactPackage.IBIS_DEVICE__TRIP_INFO, null, msgs);
			msgs = basicSetTripInfo(newTripInfo, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, IbisSensinactPackage.IBIS_DEVICE__TRIP_INFO, newTripInfo, newTripInfo));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case IbisSensinactPackage.IBIS_DEVICE__IBIS_ADMIN:
				return basicSetIbisAdmin(null, msgs);
			case IbisSensinactPackage.IBIS_DEVICE__CUSTOMER_INFO_ALL:
				return basicSetCustomerInfoAll(null, msgs);
			case IbisSensinactPackage.IBIS_DEVICE__CUSTOMER_INFO_CURRENT_STOP_INDEX:
				return basicSetCustomerInfoCurrentStopIndex(null, msgs);
			case IbisSensinactPackage.IBIS_DEVICE__CUSTOMER_INFO_CURRENT_STOP_POINT:
				return basicSetCustomerInfoCurrentStopPoint(null, msgs);
			case IbisSensinactPackage.IBIS_DEVICE__CUSTOMER_INFO_TRIP:
				return basicSetCustomerInfoTrip(null, msgs);
			case IbisSensinactPackage.IBIS_DEVICE__CUSTOMER_INFO_VEHICLE:
				return basicSetCustomerInfoVehicle(null, msgs);
			case IbisSensinactPackage.IBIS_DEVICE__CUSTOMER_INFO_CURRENT_ANNOUNCEMENT:
				return basicSetCustomerInfoCurrentAnnouncement(null, msgs);
			case IbisSensinactPackage.IBIS_DEVICE__CUSTOMER_INFO_CURRENT_CONNECTION:
				return basicSetCustomerInfoCurrentConnection(null, msgs);
			case IbisSensinactPackage.IBIS_DEVICE__CUSTOMER_INFO_CURRENT_DISPLAY_CONTENT:
				return basicSetCustomerInfoCurrentDisplayContent(null, msgs);
			case IbisSensinactPackage.IBIS_DEVICE__DOOR1_COUNTING_STATE:
				return basicUnsetDoor1CountingState(msgs);
			case IbisSensinactPackage.IBIS_DEVICE__DOOR2_COUNTING_STATE:
				return basicUnsetDoor2CountingState(msgs);
			case IbisSensinactPackage.IBIS_DEVICE__DOOR3_COUNTING_STATE:
				return basicUnsetDoor3CountingState(msgs);
			case IbisSensinactPackage.IBIS_DEVICE__DOOR4_COUNTING_STATE:
				return basicUnsetDoor4CountingState(msgs);
			case IbisSensinactPackage.IBIS_DEVICE__DOOR1_STATE:
				return basicSetDoor1State(null, msgs);
			case IbisSensinactPackage.IBIS_DEVICE__DOOR2_STATE:
				return basicSetDoor2State(null, msgs);
			case IbisSensinactPackage.IBIS_DEVICE__DOOR3_STATE:
				return basicSetDoor3State(null, msgs);
			case IbisSensinactPackage.IBIS_DEVICE__DOOR4_STATE:
				return basicSetDoor4State(null, msgs);
			case IbisSensinactPackage.IBIS_DEVICE__STOP_REQUESTED:
				return basicSetStopRequested(null, msgs);
			case IbisSensinactPackage.IBIS_DEVICE__GNSS_LOCATION:
				return basicSetGnssLocation(null, msgs);
			case IbisSensinactPackage.IBIS_DEVICE__CURRENT_TARIFF_STOP:
				return basicSetCurrentTariffStop(null, msgs);
			case IbisSensinactPackage.IBIS_DEVICE__RAZZIA:
				return basicSetRazzia(null, msgs);
			case IbisSensinactPackage.IBIS_DEVICE__CURRENT_LINE:
				return basicSetCurrentLine(null, msgs);
			case IbisSensinactPackage.IBIS_DEVICE__VEHICLE:
				return basicSetVehicle(null, msgs);
			case IbisSensinactPackage.IBIS_DEVICE__TRIP_INFO:
				return basicSetTripInfo(null, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case IbisSensinactPackage.IBIS_DEVICE__IBIS_ADMIN:
				return getIbisAdmin();
			case IbisSensinactPackage.IBIS_DEVICE__CUSTOMER_INFO_ALL:
				return getCustomerInfoAll();
			case IbisSensinactPackage.IBIS_DEVICE__CUSTOMER_INFO_CURRENT_STOP_INDEX:
				return getCustomerInfoCurrentStopIndex();
			case IbisSensinactPackage.IBIS_DEVICE__CUSTOMER_INFO_CURRENT_STOP_POINT:
				return getCustomerInfoCurrentStopPoint();
			case IbisSensinactPackage.IBIS_DEVICE__CUSTOMER_INFO_TRIP:
				return getCustomerInfoTrip();
			case IbisSensinactPackage.IBIS_DEVICE__CUSTOMER_INFO_VEHICLE:
				return getCustomerInfoVehicle();
			case IbisSensinactPackage.IBIS_DEVICE__CUSTOMER_INFO_CURRENT_ANNOUNCEMENT:
				return getCustomerInfoCurrentAnnouncement();
			case IbisSensinactPackage.IBIS_DEVICE__CUSTOMER_INFO_CURRENT_CONNECTION:
				return getCustomerInfoCurrentConnection();
			case IbisSensinactPackage.IBIS_DEVICE__CUSTOMER_INFO_CURRENT_DISPLAY_CONTENT:
				return getCustomerInfoCurrentDisplayContent();
			case IbisSensinactPackage.IBIS_DEVICE__DOOR1_COUNTING_STATE:
				return getDoor1CountingState();
			case IbisSensinactPackage.IBIS_DEVICE__DOOR2_COUNTING_STATE:
				return getDoor2CountingState();
			case IbisSensinactPackage.IBIS_DEVICE__DOOR3_COUNTING_STATE:
				return getDoor3CountingState();
			case IbisSensinactPackage.IBIS_DEVICE__DOOR4_COUNTING_STATE:
				return getDoor4CountingState();
			case IbisSensinactPackage.IBIS_DEVICE__DOOR1_STATE:
				return getDoor1State();
			case IbisSensinactPackage.IBIS_DEVICE__DOOR2_STATE:
				return getDoor2State();
			case IbisSensinactPackage.IBIS_DEVICE__DOOR3_STATE:
				return getDoor3State();
			case IbisSensinactPackage.IBIS_DEVICE__DOOR4_STATE:
				return getDoor4State();
			case IbisSensinactPackage.IBIS_DEVICE__STOP_REQUESTED:
				return getStopRequested();
			case IbisSensinactPackage.IBIS_DEVICE__GNSS_LOCATION:
				return getGnssLocation();
			case IbisSensinactPackage.IBIS_DEVICE__CURRENT_TARIFF_STOP:
				return getCurrentTariffStop();
			case IbisSensinactPackage.IBIS_DEVICE__RAZZIA:
				return getRazzia();
			case IbisSensinactPackage.IBIS_DEVICE__CURRENT_LINE:
				return getCurrentLine();
			case IbisSensinactPackage.IBIS_DEVICE__VEHICLE:
				return getVehicle();
			case IbisSensinactPackage.IBIS_DEVICE__TRIP_INFO:
				return getTripInfo();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case IbisSensinactPackage.IBIS_DEVICE__IBIS_ADMIN:
				setIbisAdmin((IbisAdmin)newValue);
				return;
			case IbisSensinactPackage.IBIS_DEVICE__CUSTOMER_INFO_ALL:
				setCustomerInfoAll((CustomerInfoAll)newValue);
				return;
			case IbisSensinactPackage.IBIS_DEVICE__CUSTOMER_INFO_CURRENT_STOP_INDEX:
				setCustomerInfoCurrentStopIndex((CustomerInfoCurrentStopIndex)newValue);
				return;
			case IbisSensinactPackage.IBIS_DEVICE__CUSTOMER_INFO_CURRENT_STOP_POINT:
				setCustomerInfoCurrentStopPoint((CustomerInfoCurrentStopPoint)newValue);
				return;
			case IbisSensinactPackage.IBIS_DEVICE__CUSTOMER_INFO_TRIP:
				setCustomerInfoTrip((CustomerInfoTrip)newValue);
				return;
			case IbisSensinactPackage.IBIS_DEVICE__CUSTOMER_INFO_VEHICLE:
				setCustomerInfoVehicle((CustomerInfoVehicle)newValue);
				return;
			case IbisSensinactPackage.IBIS_DEVICE__CUSTOMER_INFO_CURRENT_ANNOUNCEMENT:
				setCustomerInfoCurrentAnnouncement((CustomerInfoCurrentAnnouncement)newValue);
				return;
			case IbisSensinactPackage.IBIS_DEVICE__CUSTOMER_INFO_CURRENT_CONNECTION:
				setCustomerInfoCurrentConnection((CustomerInfoCurrentConnection)newValue);
				return;
			case IbisSensinactPackage.IBIS_DEVICE__CUSTOMER_INFO_CURRENT_DISPLAY_CONTENT:
				setCustomerInfoCurrentDisplayContent((CustomerInfoCurrentDisplayContent)newValue);
				return;
			case IbisSensinactPackage.IBIS_DEVICE__DOOR1_COUNTING_STATE:
				setDoor1CountingState((PassengerCountingDoorCounting)newValue);
				return;
			case IbisSensinactPackage.IBIS_DEVICE__DOOR2_COUNTING_STATE:
				setDoor2CountingState((PassengerCountingDoorCounting)newValue);
				return;
			case IbisSensinactPackage.IBIS_DEVICE__DOOR3_COUNTING_STATE:
				setDoor3CountingState((PassengerCountingDoorCounting)newValue);
				return;
			case IbisSensinactPackage.IBIS_DEVICE__DOOR4_COUNTING_STATE:
				setDoor4CountingState((PassengerCountingDoorCounting)newValue);
				return;
			case IbisSensinactPackage.IBIS_DEVICE__DOOR1_STATE:
				setDoor1State((Door)newValue);
				return;
			case IbisSensinactPackage.IBIS_DEVICE__DOOR2_STATE:
				setDoor2State((Door)newValue);
				return;
			case IbisSensinactPackage.IBIS_DEVICE__DOOR3_STATE:
				setDoor3State((Door)newValue);
				return;
			case IbisSensinactPackage.IBIS_DEVICE__DOOR4_STATE:
				setDoor4State((Door)newValue);
				return;
			case IbisSensinactPackage.IBIS_DEVICE__STOP_REQUESTED:
				setStopRequested((StopRequested)newValue);
				return;
			case IbisSensinactPackage.IBIS_DEVICE__GNSS_LOCATION:
				setGnssLocation((GNSSLocation)newValue);
				return;
			case IbisSensinactPackage.IBIS_DEVICE__CURRENT_TARIFF_STOP:
				setCurrentTariffStop((TicketValidationCurrentTariffStop)newValue);
				return;
			case IbisSensinactPackage.IBIS_DEVICE__RAZZIA:
				setRazzia((TicketValidationRazzia)newValue);
				return;
			case IbisSensinactPackage.IBIS_DEVICE__CURRENT_LINE:
				setCurrentLine((TicketValidationCurrentLine)newValue);
				return;
			case IbisSensinactPackage.IBIS_DEVICE__VEHICLE:
				setVehicle((TicketValidationVehicle)newValue);
				return;
			case IbisSensinactPackage.IBIS_DEVICE__TRIP_INFO:
				setTripInfo((TripInfo)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case IbisSensinactPackage.IBIS_DEVICE__IBIS_ADMIN:
				setIbisAdmin((IbisAdmin)null);
				return;
			case IbisSensinactPackage.IBIS_DEVICE__CUSTOMER_INFO_ALL:
				setCustomerInfoAll((CustomerInfoAll)null);
				return;
			case IbisSensinactPackage.IBIS_DEVICE__CUSTOMER_INFO_CURRENT_STOP_INDEX:
				setCustomerInfoCurrentStopIndex((CustomerInfoCurrentStopIndex)null);
				return;
			case IbisSensinactPackage.IBIS_DEVICE__CUSTOMER_INFO_CURRENT_STOP_POINT:
				setCustomerInfoCurrentStopPoint((CustomerInfoCurrentStopPoint)null);
				return;
			case IbisSensinactPackage.IBIS_DEVICE__CUSTOMER_INFO_TRIP:
				setCustomerInfoTrip((CustomerInfoTrip)null);
				return;
			case IbisSensinactPackage.IBIS_DEVICE__CUSTOMER_INFO_VEHICLE:
				setCustomerInfoVehicle((CustomerInfoVehicle)null);
				return;
			case IbisSensinactPackage.IBIS_DEVICE__CUSTOMER_INFO_CURRENT_ANNOUNCEMENT:
				setCustomerInfoCurrentAnnouncement((CustomerInfoCurrentAnnouncement)null);
				return;
			case IbisSensinactPackage.IBIS_DEVICE__CUSTOMER_INFO_CURRENT_CONNECTION:
				setCustomerInfoCurrentConnection((CustomerInfoCurrentConnection)null);
				return;
			case IbisSensinactPackage.IBIS_DEVICE__CUSTOMER_INFO_CURRENT_DISPLAY_CONTENT:
				setCustomerInfoCurrentDisplayContent((CustomerInfoCurrentDisplayContent)null);
				return;
			case IbisSensinactPackage.IBIS_DEVICE__DOOR1_COUNTING_STATE:
				unsetDoor1CountingState();
				return;
			case IbisSensinactPackage.IBIS_DEVICE__DOOR2_COUNTING_STATE:
				unsetDoor2CountingState();
				return;
			case IbisSensinactPackage.IBIS_DEVICE__DOOR3_COUNTING_STATE:
				unsetDoor3CountingState();
				return;
			case IbisSensinactPackage.IBIS_DEVICE__DOOR4_COUNTING_STATE:
				unsetDoor4CountingState();
				return;
			case IbisSensinactPackage.IBIS_DEVICE__DOOR1_STATE:
				setDoor1State((Door)null);
				return;
			case IbisSensinactPackage.IBIS_DEVICE__DOOR2_STATE:
				setDoor2State((Door)null);
				return;
			case IbisSensinactPackage.IBIS_DEVICE__DOOR3_STATE:
				setDoor3State((Door)null);
				return;
			case IbisSensinactPackage.IBIS_DEVICE__DOOR4_STATE:
				setDoor4State((Door)null);
				return;
			case IbisSensinactPackage.IBIS_DEVICE__STOP_REQUESTED:
				setStopRequested((StopRequested)null);
				return;
			case IbisSensinactPackage.IBIS_DEVICE__GNSS_LOCATION:
				setGnssLocation((GNSSLocation)null);
				return;
			case IbisSensinactPackage.IBIS_DEVICE__CURRENT_TARIFF_STOP:
				setCurrentTariffStop((TicketValidationCurrentTariffStop)null);
				return;
			case IbisSensinactPackage.IBIS_DEVICE__RAZZIA:
				setRazzia((TicketValidationRazzia)null);
				return;
			case IbisSensinactPackage.IBIS_DEVICE__CURRENT_LINE:
				setCurrentLine((TicketValidationCurrentLine)null);
				return;
			case IbisSensinactPackage.IBIS_DEVICE__VEHICLE:
				setVehicle((TicketValidationVehicle)null);
				return;
			case IbisSensinactPackage.IBIS_DEVICE__TRIP_INFO:
				setTripInfo((TripInfo)null);
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case IbisSensinactPackage.IBIS_DEVICE__IBIS_ADMIN:
				return ibisAdmin != null;
			case IbisSensinactPackage.IBIS_DEVICE__CUSTOMER_INFO_ALL:
				return customerInfoAll != null;
			case IbisSensinactPackage.IBIS_DEVICE__CUSTOMER_INFO_CURRENT_STOP_INDEX:
				return customerInfoCurrentStopIndex != null;
			case IbisSensinactPackage.IBIS_DEVICE__CUSTOMER_INFO_CURRENT_STOP_POINT:
				return customerInfoCurrentStopPoint != null;
			case IbisSensinactPackage.IBIS_DEVICE__CUSTOMER_INFO_TRIP:
				return customerInfoTrip != null;
			case IbisSensinactPackage.IBIS_DEVICE__CUSTOMER_INFO_VEHICLE:
				return customerInfoVehicle != null;
			case IbisSensinactPackage.IBIS_DEVICE__CUSTOMER_INFO_CURRENT_ANNOUNCEMENT:
				return customerInfoCurrentAnnouncement != null;
			case IbisSensinactPackage.IBIS_DEVICE__CUSTOMER_INFO_CURRENT_CONNECTION:
				return customerInfoCurrentConnection != null;
			case IbisSensinactPackage.IBIS_DEVICE__CUSTOMER_INFO_CURRENT_DISPLAY_CONTENT:
				return customerInfoCurrentDisplayContent != null;
			case IbisSensinactPackage.IBIS_DEVICE__DOOR1_COUNTING_STATE:
				return isSetDoor1CountingState();
			case IbisSensinactPackage.IBIS_DEVICE__DOOR2_COUNTING_STATE:
				return isSetDoor2CountingState();
			case IbisSensinactPackage.IBIS_DEVICE__DOOR3_COUNTING_STATE:
				return isSetDoor3CountingState();
			case IbisSensinactPackage.IBIS_DEVICE__DOOR4_COUNTING_STATE:
				return isSetDoor4CountingState();
			case IbisSensinactPackage.IBIS_DEVICE__DOOR1_STATE:
				return door1State != null;
			case IbisSensinactPackage.IBIS_DEVICE__DOOR2_STATE:
				return door2State != null;
			case IbisSensinactPackage.IBIS_DEVICE__DOOR3_STATE:
				return door3State != null;
			case IbisSensinactPackage.IBIS_DEVICE__DOOR4_STATE:
				return door4State != null;
			case IbisSensinactPackage.IBIS_DEVICE__STOP_REQUESTED:
				return stopRequested != null;
			case IbisSensinactPackage.IBIS_DEVICE__GNSS_LOCATION:
				return gnssLocation != null;
			case IbisSensinactPackage.IBIS_DEVICE__CURRENT_TARIFF_STOP:
				return currentTariffStop != null;
			case IbisSensinactPackage.IBIS_DEVICE__RAZZIA:
				return razzia != null;
			case IbisSensinactPackage.IBIS_DEVICE__CURRENT_LINE:
				return currentLine != null;
			case IbisSensinactPackage.IBIS_DEVICE__VEHICLE:
				return vehicle != null;
			case IbisSensinactPackage.IBIS_DEVICE__TRIP_INFO:
				return tripInfo != null;
		}
		return super.eIsSet(featureID);
	}

} //IbisDeviceImpl
