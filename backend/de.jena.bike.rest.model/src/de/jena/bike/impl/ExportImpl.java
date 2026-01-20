/*
 * Copyright (c) 2012 - 2025 Data In Motion and others.
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
package de.jena.bike.impl;

import de.jena.bike.BikePackage;
import de.jena.bike.Export;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Export</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link de.jena.bike.impl.ExportImpl#getId <em>Id</em>}</li>
 *   <li>{@link de.jena.bike.impl.ExportImpl#getStatus <em>Status</em>}</li>
 *   <li>{@link de.jena.bike.impl.ExportImpl#getUrl <em>Url</em>}</li>
 *   <li>{@link de.jena.bike.impl.ExportImpl#getErrorMessage <em>Error Message</em>}</li>
 *   <li>{@link de.jena.bike.impl.ExportImpl#getEndProcessingDateTime <em>End Processing Date Time</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ExportImpl extends MinimalEObjectImpl.Container implements Export {
	/**
	 * The default value of the '{@link #getId() <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getId()
	 * @generated
	 * @ordered
	 */
	protected static final Integer ID_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getId() <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getId()
	 * @generated
	 * @ordered
	 */
	protected Integer id = ID_EDEFAULT;

	/**
	 * The default value of the '{@link #getStatus() <em>Status</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStatus()
	 * @generated
	 * @ordered
	 */
	protected static final String STATUS_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getStatus() <em>Status</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStatus()
	 * @generated
	 * @ordered
	 */
	protected String status = STATUS_EDEFAULT;

	/**
	 * The default value of the '{@link #getUrl() <em>Url</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUrl()
	 * @generated
	 * @ordered
	 */
	protected static final String URL_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getUrl() <em>Url</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUrl()
	 * @generated
	 * @ordered
	 */
	protected String url = URL_EDEFAULT;

	/**
	 * The default value of the '{@link #getErrorMessage() <em>Error Message</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getErrorMessage()
	 * @generated
	 * @ordered
	 */
	protected static final String ERROR_MESSAGE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getErrorMessage() <em>Error Message</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getErrorMessage()
	 * @generated
	 * @ordered
	 */
	protected String errorMessage = ERROR_MESSAGE_EDEFAULT;

	/**
	 * The default value of the '{@link #getEndProcessingDateTime() <em>End Processing Date Time</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEndProcessingDateTime()
	 * @generated
	 * @ordered
	 */
	protected static final String END_PROCESSING_DATE_TIME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getEndProcessingDateTime() <em>End Processing Date Time</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEndProcessingDateTime()
	 * @generated
	 * @ordered
	 */
	protected String endProcessingDateTime = END_PROCESSING_DATE_TIME_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ExportImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return BikePackage.Literals.EXPORT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Integer getId() {
		return id;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setId(Integer newId) {
		Integer oldId = id;
		id = newId;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BikePackage.EXPORT__ID, oldId, id));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getStatus() {
		return status;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setStatus(String newStatus) {
		String oldStatus = status;
		status = newStatus;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BikePackage.EXPORT__STATUS, oldStatus, status));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getUrl() {
		return url;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setUrl(String newUrl) {
		String oldUrl = url;
		url = newUrl;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BikePackage.EXPORT__URL, oldUrl, url));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getErrorMessage() {
		return errorMessage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setErrorMessage(String newErrorMessage) {
		String oldErrorMessage = errorMessage;
		errorMessage = newErrorMessage;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BikePackage.EXPORT__ERROR_MESSAGE, oldErrorMessage, errorMessage));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getEndProcessingDateTime() {
		return endProcessingDateTime;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setEndProcessingDateTime(String newEndProcessingDateTime) {
		String oldEndProcessingDateTime = endProcessingDateTime;
		endProcessingDateTime = newEndProcessingDateTime;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BikePackage.EXPORT__END_PROCESSING_DATE_TIME, oldEndProcessingDateTime, endProcessingDateTime));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case BikePackage.EXPORT__ID:
				return getId();
			case BikePackage.EXPORT__STATUS:
				return getStatus();
			case BikePackage.EXPORT__URL:
				return getUrl();
			case BikePackage.EXPORT__ERROR_MESSAGE:
				return getErrorMessage();
			case BikePackage.EXPORT__END_PROCESSING_DATE_TIME:
				return getEndProcessingDateTime();
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
			case BikePackage.EXPORT__ID:
				setId((Integer)newValue);
				return;
			case BikePackage.EXPORT__STATUS:
				setStatus((String)newValue);
				return;
			case BikePackage.EXPORT__URL:
				setUrl((String)newValue);
				return;
			case BikePackage.EXPORT__ERROR_MESSAGE:
				setErrorMessage((String)newValue);
				return;
			case BikePackage.EXPORT__END_PROCESSING_DATE_TIME:
				setEndProcessingDateTime((String)newValue);
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
			case BikePackage.EXPORT__ID:
				setId(ID_EDEFAULT);
				return;
			case BikePackage.EXPORT__STATUS:
				setStatus(STATUS_EDEFAULT);
				return;
			case BikePackage.EXPORT__URL:
				setUrl(URL_EDEFAULT);
				return;
			case BikePackage.EXPORT__ERROR_MESSAGE:
				setErrorMessage(ERROR_MESSAGE_EDEFAULT);
				return;
			case BikePackage.EXPORT__END_PROCESSING_DATE_TIME:
				setEndProcessingDateTime(END_PROCESSING_DATE_TIME_EDEFAULT);
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
			case BikePackage.EXPORT__ID:
				return ID_EDEFAULT == null ? id != null : !ID_EDEFAULT.equals(id);
			case BikePackage.EXPORT__STATUS:
				return STATUS_EDEFAULT == null ? status != null : !STATUS_EDEFAULT.equals(status);
			case BikePackage.EXPORT__URL:
				return URL_EDEFAULT == null ? url != null : !URL_EDEFAULT.equals(url);
			case BikePackage.EXPORT__ERROR_MESSAGE:
				return ERROR_MESSAGE_EDEFAULT == null ? errorMessage != null : !ERROR_MESSAGE_EDEFAULT.equals(errorMessage);
			case BikePackage.EXPORT__END_PROCESSING_DATE_TIME:
				return END_PROCESSING_DATE_TIME_EDEFAULT == null ? endProcessingDateTime != null : !END_PROCESSING_DATE_TIME_EDEFAULT.equals(endProcessingDateTime);
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
		result.append(" (id: ");
		result.append(id);
		result.append(", status: ");
		result.append(status);
		result.append(", url: ");
		result.append(url);
		result.append(", errorMessage: ");
		result.append(errorMessage);
		result.append(", endProcessingDateTime: ");
		result.append(endProcessingDateTime);
		result.append(')');
		return result.toString();
	}

} //ExportImpl
