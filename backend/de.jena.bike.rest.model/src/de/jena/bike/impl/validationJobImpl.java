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
import de.jena.bike.validationJob;
import de.jena.bike.validationJobStatus;

import java.math.BigInteger;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EDataTypeEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>validation Job</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link de.jena.bike.impl.validationJobImpl#getId <em>Id</em>}</li>
 *   <li>{@link de.jena.bike.impl.validationJobImpl#getStatus <em>Status</em>}</li>
 *   <li>{@link de.jena.bike.impl.validationJobImpl#getSiteIds <em>Site Ids</em>}</li>
 *   <li>{@link de.jena.bike.impl.validationJobImpl#getStartDate <em>Start Date</em>}</li>
 *   <li>{@link de.jena.bike.impl.validationJobImpl#getEndDate <em>End Date</em>}</li>
 *   <li>{@link de.jena.bike.impl.validationJobImpl#getErrorMessage <em>Error Message</em>}</li>
 *   <li>{@link de.jena.bike.impl.validationJobImpl#getEndProcessingDateTime <em>End Processing Date Time</em>}</li>
 *   <li>{@link de.jena.bike.impl.validationJobImpl#getCreatedAt <em>Created At</em>}</li>
 * </ul>
 *
 * @generated
 */
public class validationJobImpl extends MinimalEObjectImpl.Container implements validationJob {
	/**
	 * The default value of the '{@link #getId() <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getId()
	 * @generated
	 * @ordered
	 */
	protected static final BigInteger ID_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getId() <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getId()
	 * @generated
	 * @ordered
	 */
	protected BigInteger id = ID_EDEFAULT;

	/**
	 * The cached value of the '{@link #getStatus() <em>Status</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStatus()
	 * @generated
	 * @ordered
	 */
	protected validationJobStatus status;

	/**
	 * The cached value of the '{@link #getSiteIds() <em>Site Ids</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSiteIds()
	 * @generated
	 * @ordered
	 */
	protected EList<Integer> siteIds;

	/**
	 * The default value of the '{@link #getStartDate() <em>Start Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStartDate()
	 * @generated
	 * @ordered
	 */
	protected static final String START_DATE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getStartDate() <em>Start Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStartDate()
	 * @generated
	 * @ordered
	 */
	protected String startDate = START_DATE_EDEFAULT;

	/**
	 * The default value of the '{@link #getEndDate() <em>End Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEndDate()
	 * @generated
	 * @ordered
	 */
	protected static final String END_DATE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getEndDate() <em>End Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEndDate()
	 * @generated
	 * @ordered
	 */
	protected String endDate = END_DATE_EDEFAULT;

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
	 * The default value of the '{@link #getCreatedAt() <em>Created At</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCreatedAt()
	 * @generated
	 * @ordered
	 */
	protected static final String CREATED_AT_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getCreatedAt() <em>Created At</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCreatedAt()
	 * @generated
	 * @ordered
	 */
	protected String createdAt = CREATED_AT_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected validationJobImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return BikePackage.Literals.VALIDATION_JOB;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public BigInteger getId() {
		return id;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setId(BigInteger newId) {
		BigInteger oldId = id;
		id = newId;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BikePackage.VALIDATION_JOB__ID, oldId, id));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public validationJobStatus getStatus() {
		return status;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetStatus(validationJobStatus newStatus, NotificationChain msgs) {
		validationJobStatus oldStatus = status;
		status = newStatus;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, BikePackage.VALIDATION_JOB__STATUS, oldStatus, newStatus);
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
	public void setStatus(validationJobStatus newStatus) {
		if (newStatus != status) {
			NotificationChain msgs = null;
			if (status != null)
				msgs = ((InternalEObject)status).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - BikePackage.VALIDATION_JOB__STATUS, null, msgs);
			if (newStatus != null)
				msgs = ((InternalEObject)newStatus).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - BikePackage.VALIDATION_JOB__STATUS, null, msgs);
			msgs = basicSetStatus(newStatus, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BikePackage.VALIDATION_JOB__STATUS, newStatus, newStatus));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Integer> getSiteIds() {
		if (siteIds == null) {
			siteIds = new EDataTypeEList<Integer>(Integer.class, this, BikePackage.VALIDATION_JOB__SITE_IDS);
		}
		return siteIds;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getStartDate() {
		return startDate;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setStartDate(String newStartDate) {
		String oldStartDate = startDate;
		startDate = newStartDate;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BikePackage.VALIDATION_JOB__START_DATE, oldStartDate, startDate));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getEndDate() {
		return endDate;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setEndDate(String newEndDate) {
		String oldEndDate = endDate;
		endDate = newEndDate;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BikePackage.VALIDATION_JOB__END_DATE, oldEndDate, endDate));
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
			eNotify(new ENotificationImpl(this, Notification.SET, BikePackage.VALIDATION_JOB__ERROR_MESSAGE, oldErrorMessage, errorMessage));
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
			eNotify(new ENotificationImpl(this, Notification.SET, BikePackage.VALIDATION_JOB__END_PROCESSING_DATE_TIME, oldEndProcessingDateTime, endProcessingDateTime));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getCreatedAt() {
		return createdAt;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setCreatedAt(String newCreatedAt) {
		String oldCreatedAt = createdAt;
		createdAt = newCreatedAt;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BikePackage.VALIDATION_JOB__CREATED_AT, oldCreatedAt, createdAt));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case BikePackage.VALIDATION_JOB__STATUS:
				return basicSetStatus(null, msgs);
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
			case BikePackage.VALIDATION_JOB__ID:
				return getId();
			case BikePackage.VALIDATION_JOB__STATUS:
				return getStatus();
			case BikePackage.VALIDATION_JOB__SITE_IDS:
				return getSiteIds();
			case BikePackage.VALIDATION_JOB__START_DATE:
				return getStartDate();
			case BikePackage.VALIDATION_JOB__END_DATE:
				return getEndDate();
			case BikePackage.VALIDATION_JOB__ERROR_MESSAGE:
				return getErrorMessage();
			case BikePackage.VALIDATION_JOB__END_PROCESSING_DATE_TIME:
				return getEndProcessingDateTime();
			case BikePackage.VALIDATION_JOB__CREATED_AT:
				return getCreatedAt();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case BikePackage.VALIDATION_JOB__ID:
				setId((BigInteger)newValue);
				return;
			case BikePackage.VALIDATION_JOB__STATUS:
				setStatus((validationJobStatus)newValue);
				return;
			case BikePackage.VALIDATION_JOB__SITE_IDS:
				getSiteIds().clear();
				getSiteIds().addAll((Collection<? extends Integer>)newValue);
				return;
			case BikePackage.VALIDATION_JOB__START_DATE:
				setStartDate((String)newValue);
				return;
			case BikePackage.VALIDATION_JOB__END_DATE:
				setEndDate((String)newValue);
				return;
			case BikePackage.VALIDATION_JOB__ERROR_MESSAGE:
				setErrorMessage((String)newValue);
				return;
			case BikePackage.VALIDATION_JOB__END_PROCESSING_DATE_TIME:
				setEndProcessingDateTime((String)newValue);
				return;
			case BikePackage.VALIDATION_JOB__CREATED_AT:
				setCreatedAt((String)newValue);
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
			case BikePackage.VALIDATION_JOB__ID:
				setId(ID_EDEFAULT);
				return;
			case BikePackage.VALIDATION_JOB__STATUS:
				setStatus((validationJobStatus)null);
				return;
			case BikePackage.VALIDATION_JOB__SITE_IDS:
				getSiteIds().clear();
				return;
			case BikePackage.VALIDATION_JOB__START_DATE:
				setStartDate(START_DATE_EDEFAULT);
				return;
			case BikePackage.VALIDATION_JOB__END_DATE:
				setEndDate(END_DATE_EDEFAULT);
				return;
			case BikePackage.VALIDATION_JOB__ERROR_MESSAGE:
				setErrorMessage(ERROR_MESSAGE_EDEFAULT);
				return;
			case BikePackage.VALIDATION_JOB__END_PROCESSING_DATE_TIME:
				setEndProcessingDateTime(END_PROCESSING_DATE_TIME_EDEFAULT);
				return;
			case BikePackage.VALIDATION_JOB__CREATED_AT:
				setCreatedAt(CREATED_AT_EDEFAULT);
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
			case BikePackage.VALIDATION_JOB__ID:
				return ID_EDEFAULT == null ? id != null : !ID_EDEFAULT.equals(id);
			case BikePackage.VALIDATION_JOB__STATUS:
				return status != null;
			case BikePackage.VALIDATION_JOB__SITE_IDS:
				return siteIds != null && !siteIds.isEmpty();
			case BikePackage.VALIDATION_JOB__START_DATE:
				return START_DATE_EDEFAULT == null ? startDate != null : !START_DATE_EDEFAULT.equals(startDate);
			case BikePackage.VALIDATION_JOB__END_DATE:
				return END_DATE_EDEFAULT == null ? endDate != null : !END_DATE_EDEFAULT.equals(endDate);
			case BikePackage.VALIDATION_JOB__ERROR_MESSAGE:
				return ERROR_MESSAGE_EDEFAULT == null ? errorMessage != null : !ERROR_MESSAGE_EDEFAULT.equals(errorMessage);
			case BikePackage.VALIDATION_JOB__END_PROCESSING_DATE_TIME:
				return END_PROCESSING_DATE_TIME_EDEFAULT == null ? endProcessingDateTime != null : !END_PROCESSING_DATE_TIME_EDEFAULT.equals(endProcessingDateTime);
			case BikePackage.VALIDATION_JOB__CREATED_AT:
				return CREATED_AT_EDEFAULT == null ? createdAt != null : !CREATED_AT_EDEFAULT.equals(createdAt);
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
		result.append(", siteIds: ");
		result.append(siteIds);
		result.append(", startDate: ");
		result.append(startDate);
		result.append(", endDate: ");
		result.append(endDate);
		result.append(", errorMessage: ");
		result.append(errorMessage);
		result.append(", endProcessingDateTime: ");
		result.append(endProcessingDateTime);
		result.append(", createdAt: ");
		result.append(createdAt);
		result.append(')');
		return result.toString();
	}

} //validationJobImpl
