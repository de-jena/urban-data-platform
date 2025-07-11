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

import de.jena.model.sensinact.ibis.CustomerInfoCurrentDisplayContentData;
import de.jena.model.sensinact.ibis.IbisSensinactPackage;

import java.time.Instant;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Customer Info Current Display Content Data</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link de.jena.model.sensinact.ibis.impl.CustomerInfoCurrentDisplayContentDataImpl#getServiceName <em>Service Name</em>}</li>
 *   <li>{@link de.jena.model.sensinact.ibis.impl.CustomerInfoCurrentDisplayContentDataImpl#getServiceOperation <em>Service Operation</em>}</li>
 *   <li>{@link de.jena.model.sensinact.ibis.impl.CustomerInfoCurrentDisplayContentDataImpl#getTimestamp <em>Timestamp</em>}</li>
 *   <li>{@link de.jena.model.sensinact.ibis.impl.CustomerInfoCurrentDisplayContentDataImpl#getDestinationName <em>Destination Name</em>}</li>
 *   <li>{@link de.jena.model.sensinact.ibis.impl.CustomerInfoCurrentDisplayContentDataImpl#getLineName <em>Line Name</em>}</li>
 * </ul>
 *
 * @generated
 */
public class CustomerInfoCurrentDisplayContentDataImpl extends IbisResourceImpl implements CustomerInfoCurrentDisplayContentData {
	/**
	 * The default value of the '{@link #getServiceName() <em>Service Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getServiceName()
	 * @generated
	 * @ordered
	 */
	protected static final String SERVICE_NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getServiceName() <em>Service Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getServiceName()
	 * @generated
	 * @ordered
	 */
	protected String serviceName = SERVICE_NAME_EDEFAULT;

	/**
	 * The default value of the '{@link #getServiceOperation() <em>Service Operation</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getServiceOperation()
	 * @generated
	 * @ordered
	 */
	protected static final String SERVICE_OPERATION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getServiceOperation() <em>Service Operation</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getServiceOperation()
	 * @generated
	 * @ordered
	 */
	protected String serviceOperation = SERVICE_OPERATION_EDEFAULT;

	/**
	 * The default value of the '{@link #getTimestamp() <em>Timestamp</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTimestamp()
	 * @generated
	 * @ordered
	 */
	protected static final Instant TIMESTAMP_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getTimestamp() <em>Timestamp</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTimestamp()
	 * @generated
	 * @ordered
	 */
	protected Instant timestamp = TIMESTAMP_EDEFAULT;

	/**
	 * The default value of the '{@link #getDestinationName() <em>Destination Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDestinationName()
	 * @generated
	 * @ordered
	 */
	protected static final String DESTINATION_NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDestinationName() <em>Destination Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDestinationName()
	 * @generated
	 * @ordered
	 */
	protected String destinationName = DESTINATION_NAME_EDEFAULT;

	/**
	 * The default value of the '{@link #getLineName() <em>Line Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLineName()
	 * @generated
	 * @ordered
	 */
	protected static final String LINE_NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getLineName() <em>Line Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLineName()
	 * @generated
	 * @ordered
	 */
	protected String lineName = LINE_NAME_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CustomerInfoCurrentDisplayContentDataImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return IbisSensinactPackage.Literals.CUSTOMER_INFO_CURRENT_DISPLAY_CONTENT_DATA;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getServiceName() {
		return serviceName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setServiceName(String newServiceName) {
		String oldServiceName = serviceName;
		serviceName = newServiceName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, IbisSensinactPackage.CUSTOMER_INFO_CURRENT_DISPLAY_CONTENT_DATA__SERVICE_NAME, oldServiceName, serviceName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getServiceOperation() {
		return serviceOperation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setServiceOperation(String newServiceOperation) {
		String oldServiceOperation = serviceOperation;
		serviceOperation = newServiceOperation;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, IbisSensinactPackage.CUSTOMER_INFO_CURRENT_DISPLAY_CONTENT_DATA__SERVICE_OPERATION, oldServiceOperation, serviceOperation));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Instant getTimestamp() {
		return timestamp;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setTimestamp(Instant newTimestamp) {
		Instant oldTimestamp = timestamp;
		timestamp = newTimestamp;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, IbisSensinactPackage.CUSTOMER_INFO_CURRENT_DISPLAY_CONTENT_DATA__TIMESTAMP, oldTimestamp, timestamp));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getDestinationName() {
		return destinationName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setDestinationName(String newDestinationName) {
		String oldDestinationName = destinationName;
		destinationName = newDestinationName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, IbisSensinactPackage.CUSTOMER_INFO_CURRENT_DISPLAY_CONTENT_DATA__DESTINATION_NAME, oldDestinationName, destinationName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getLineName() {
		return lineName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setLineName(String newLineName) {
		String oldLineName = lineName;
		lineName = newLineName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, IbisSensinactPackage.CUSTOMER_INFO_CURRENT_DISPLAY_CONTENT_DATA__LINE_NAME, oldLineName, lineName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case IbisSensinactPackage.CUSTOMER_INFO_CURRENT_DISPLAY_CONTENT_DATA__SERVICE_NAME:
				return getServiceName();
			case IbisSensinactPackage.CUSTOMER_INFO_CURRENT_DISPLAY_CONTENT_DATA__SERVICE_OPERATION:
				return getServiceOperation();
			case IbisSensinactPackage.CUSTOMER_INFO_CURRENT_DISPLAY_CONTENT_DATA__TIMESTAMP:
				return getTimestamp();
			case IbisSensinactPackage.CUSTOMER_INFO_CURRENT_DISPLAY_CONTENT_DATA__DESTINATION_NAME:
				return getDestinationName();
			case IbisSensinactPackage.CUSTOMER_INFO_CURRENT_DISPLAY_CONTENT_DATA__LINE_NAME:
				return getLineName();
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
			case IbisSensinactPackage.CUSTOMER_INFO_CURRENT_DISPLAY_CONTENT_DATA__SERVICE_NAME:
				setServiceName((String)newValue);
				return;
			case IbisSensinactPackage.CUSTOMER_INFO_CURRENT_DISPLAY_CONTENT_DATA__SERVICE_OPERATION:
				setServiceOperation((String)newValue);
				return;
			case IbisSensinactPackage.CUSTOMER_INFO_CURRENT_DISPLAY_CONTENT_DATA__TIMESTAMP:
				setTimestamp((Instant)newValue);
				return;
			case IbisSensinactPackage.CUSTOMER_INFO_CURRENT_DISPLAY_CONTENT_DATA__DESTINATION_NAME:
				setDestinationName((String)newValue);
				return;
			case IbisSensinactPackage.CUSTOMER_INFO_CURRENT_DISPLAY_CONTENT_DATA__LINE_NAME:
				setLineName((String)newValue);
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
			case IbisSensinactPackage.CUSTOMER_INFO_CURRENT_DISPLAY_CONTENT_DATA__SERVICE_NAME:
				setServiceName(SERVICE_NAME_EDEFAULT);
				return;
			case IbisSensinactPackage.CUSTOMER_INFO_CURRENT_DISPLAY_CONTENT_DATA__SERVICE_OPERATION:
				setServiceOperation(SERVICE_OPERATION_EDEFAULT);
				return;
			case IbisSensinactPackage.CUSTOMER_INFO_CURRENT_DISPLAY_CONTENT_DATA__TIMESTAMP:
				setTimestamp(TIMESTAMP_EDEFAULT);
				return;
			case IbisSensinactPackage.CUSTOMER_INFO_CURRENT_DISPLAY_CONTENT_DATA__DESTINATION_NAME:
				setDestinationName(DESTINATION_NAME_EDEFAULT);
				return;
			case IbisSensinactPackage.CUSTOMER_INFO_CURRENT_DISPLAY_CONTENT_DATA__LINE_NAME:
				setLineName(LINE_NAME_EDEFAULT);
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
			case IbisSensinactPackage.CUSTOMER_INFO_CURRENT_DISPLAY_CONTENT_DATA__SERVICE_NAME:
				return SERVICE_NAME_EDEFAULT == null ? serviceName != null : !SERVICE_NAME_EDEFAULT.equals(serviceName);
			case IbisSensinactPackage.CUSTOMER_INFO_CURRENT_DISPLAY_CONTENT_DATA__SERVICE_OPERATION:
				return SERVICE_OPERATION_EDEFAULT == null ? serviceOperation != null : !SERVICE_OPERATION_EDEFAULT.equals(serviceOperation);
			case IbisSensinactPackage.CUSTOMER_INFO_CURRENT_DISPLAY_CONTENT_DATA__TIMESTAMP:
				return TIMESTAMP_EDEFAULT == null ? timestamp != null : !TIMESTAMP_EDEFAULT.equals(timestamp);
			case IbisSensinactPackage.CUSTOMER_INFO_CURRENT_DISPLAY_CONTENT_DATA__DESTINATION_NAME:
				return DESTINATION_NAME_EDEFAULT == null ? destinationName != null : !DESTINATION_NAME_EDEFAULT.equals(destinationName);
			case IbisSensinactPackage.CUSTOMER_INFO_CURRENT_DISPLAY_CONTENT_DATA__LINE_NAME:
				return LINE_NAME_EDEFAULT == null ? lineName != null : !LINE_NAME_EDEFAULT.equals(lineName);
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuilder result = new StringBuilder(super.toString());
		result.append(" (serviceName: ");
		result.append(serviceName);
		result.append(", serviceOperation: ");
		result.append(serviceOperation);
		result.append(", timestamp: ");
		result.append(timestamp);
		result.append(", destinationName: ");
		result.append(destinationName);
		result.append(", lineName: ");
		result.append(lineName);
		result.append(')');
		return result.toString();
	}

} //CustomerInfoCurrentDisplayContentDataImpl
