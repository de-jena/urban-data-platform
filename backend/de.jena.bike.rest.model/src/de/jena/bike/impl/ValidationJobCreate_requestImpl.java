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
import de.jena.bike.ValidationJobCreate_request;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EDataTypeEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Validation Job Create request</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link de.jena.bike.impl.ValidationJobCreate_requestImpl#getSiteIds <em>Site Ids</em>}</li>
 *   <li>{@link de.jena.bike.impl.ValidationJobCreate_requestImpl#getStartDate <em>Start Date</em>}</li>
 *   <li>{@link de.jena.bike.impl.ValidationJobCreate_requestImpl#getEndDate <em>End Date</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ValidationJobCreate_requestImpl extends MinimalEObjectImpl.Container implements ValidationJobCreate_request {
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
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ValidationJobCreate_requestImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return BikePackage.Literals.VALIDATION_JOB_CREATE_REQUEST;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Integer> getSiteIds() {
		if (siteIds == null) {
			siteIds = new EDataTypeEList<Integer>(Integer.class, this, BikePackage.VALIDATION_JOB_CREATE_REQUEST__SITE_IDS);
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
			eNotify(new ENotificationImpl(this, Notification.SET, BikePackage.VALIDATION_JOB_CREATE_REQUEST__START_DATE, oldStartDate, startDate));
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
			eNotify(new ENotificationImpl(this, Notification.SET, BikePackage.VALIDATION_JOB_CREATE_REQUEST__END_DATE, oldEndDate, endDate));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case BikePackage.VALIDATION_JOB_CREATE_REQUEST__SITE_IDS:
				return getSiteIds();
			case BikePackage.VALIDATION_JOB_CREATE_REQUEST__START_DATE:
				return getStartDate();
			case BikePackage.VALIDATION_JOB_CREATE_REQUEST__END_DATE:
				return getEndDate();
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
			case BikePackage.VALIDATION_JOB_CREATE_REQUEST__SITE_IDS:
				getSiteIds().clear();
				getSiteIds().addAll((Collection<? extends Integer>)newValue);
				return;
			case BikePackage.VALIDATION_JOB_CREATE_REQUEST__START_DATE:
				setStartDate((String)newValue);
				return;
			case BikePackage.VALIDATION_JOB_CREATE_REQUEST__END_DATE:
				setEndDate((String)newValue);
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
			case BikePackage.VALIDATION_JOB_CREATE_REQUEST__SITE_IDS:
				getSiteIds().clear();
				return;
			case BikePackage.VALIDATION_JOB_CREATE_REQUEST__START_DATE:
				setStartDate(START_DATE_EDEFAULT);
				return;
			case BikePackage.VALIDATION_JOB_CREATE_REQUEST__END_DATE:
				setEndDate(END_DATE_EDEFAULT);
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
			case BikePackage.VALIDATION_JOB_CREATE_REQUEST__SITE_IDS:
				return siteIds != null && !siteIds.isEmpty();
			case BikePackage.VALIDATION_JOB_CREATE_REQUEST__START_DATE:
				return START_DATE_EDEFAULT == null ? startDate != null : !START_DATE_EDEFAULT.equals(startDate);
			case BikePackage.VALIDATION_JOB_CREATE_REQUEST__END_DATE:
				return END_DATE_EDEFAULT == null ? endDate != null : !END_DATE_EDEFAULT.equals(endDate);
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
		result.append(" (siteIds: ");
		result.append(siteIds);
		result.append(", startDate: ");
		result.append(startDate);
		result.append(", endDate: ");
		result.append(endDate);
		result.append(')');
		return result.toString();
	}

} //ValidationJobCreate_requestImpl
