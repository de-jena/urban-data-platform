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
package de.jena.chirpstack.model.chirpstack.impl;

import de.jena.chirpstack.model.chirpstack.ChirpstackPackage;
import de.jena.chirpstack.model.chirpstack.PMXStatus;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.sensinact.model.core.provider.impl.ServiceImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>PMX Status</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link de.jena.chirpstack.model.chirpstack.impl.PMXStatusImpl#getVolts <em>Volts</em>}</li>
 *   <li>{@link de.jena.chirpstack.model.chirpstack.impl.PMXStatusImpl#getCounterCategory <em>Counter Category</em>}</li>
 *   <li>{@link de.jena.chirpstack.model.chirpstack.impl.PMXStatusImpl#getCounterKind <em>Counter Kind</em>}</li>
 *   <li>{@link de.jena.chirpstack.model.chirpstack.impl.PMXStatusImpl#getTimestampUtcHhmm <em>Timestamp Utc Hhmm</em>}</li>
 * </ul>
 *
 * @generated
 */
public class PMXStatusImpl extends ServiceImpl implements PMXStatus {
	/**
	 * The default value of the '{@link #getVolts() <em>Volts</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVolts()
	 * @generated
	 * @ordered
	 */
	protected static final double VOLTS_EDEFAULT = 0.0;

	/**
	 * The cached value of the '{@link #getVolts() <em>Volts</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVolts()
	 * @generated
	 * @ordered
	 */
	protected double volts = VOLTS_EDEFAULT;

	/**
	 * The default value of the '{@link #getCounterCategory() <em>Counter Category</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCounterCategory()
	 * @generated
	 * @ordered
	 */
	protected static final double COUNTER_CATEGORY_EDEFAULT = 0.0;

	/**
	 * The cached value of the '{@link #getCounterCategory() <em>Counter Category</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCounterCategory()
	 * @generated
	 * @ordered
	 */
	protected double counterCategory = COUNTER_CATEGORY_EDEFAULT;

	/**
	 * The default value of the '{@link #getCounterKind() <em>Counter Kind</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCounterKind()
	 * @generated
	 * @ordered
	 */
	protected static final String COUNTER_KIND_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getCounterKind() <em>Counter Kind</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCounterKind()
	 * @generated
	 * @ordered
	 */
	protected String counterKind = COUNTER_KIND_EDEFAULT;

	/**
	 * The default value of the '{@link #getTimestampUtcHhmm() <em>Timestamp Utc Hhmm</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTimestampUtcHhmm()
	 * @generated
	 * @ordered
	 */
	protected static final String TIMESTAMP_UTC_HHMM_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getTimestampUtcHhmm() <em>Timestamp Utc Hhmm</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTimestampUtcHhmm()
	 * @generated
	 * @ordered
	 */
	protected String timestampUtcHhmm = TIMESTAMP_UTC_HHMM_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PMXStatusImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ChirpstackPackage.Literals.PMX_STATUS;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public double getVolts() {
		return volts;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setVolts(double newVolts) {
		double oldVolts = volts;
		volts = newVolts;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ChirpstackPackage.PMX_STATUS__VOLTS, oldVolts, volts));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public double getCounterCategory() {
		return counterCategory;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setCounterCategory(double newCounterCategory) {
		double oldCounterCategory = counterCategory;
		counterCategory = newCounterCategory;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ChirpstackPackage.PMX_STATUS__COUNTER_CATEGORY, oldCounterCategory, counterCategory));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getCounterKind() {
		return counterKind;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setCounterKind(String newCounterKind) {
		String oldCounterKind = counterKind;
		counterKind = newCounterKind;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ChirpstackPackage.PMX_STATUS__COUNTER_KIND, oldCounterKind, counterKind));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getTimestampUtcHhmm() {
		return timestampUtcHhmm;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setTimestampUtcHhmm(String newTimestampUtcHhmm) {
		String oldTimestampUtcHhmm = timestampUtcHhmm;
		timestampUtcHhmm = newTimestampUtcHhmm;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ChirpstackPackage.PMX_STATUS__TIMESTAMP_UTC_HHMM, oldTimestampUtcHhmm, timestampUtcHhmm));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case ChirpstackPackage.PMX_STATUS__VOLTS:
				return getVolts();
			case ChirpstackPackage.PMX_STATUS__COUNTER_CATEGORY:
				return getCounterCategory();
			case ChirpstackPackage.PMX_STATUS__COUNTER_KIND:
				return getCounterKind();
			case ChirpstackPackage.PMX_STATUS__TIMESTAMP_UTC_HHMM:
				return getTimestampUtcHhmm();
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
			case ChirpstackPackage.PMX_STATUS__VOLTS:
				setVolts((Double)newValue);
				return;
			case ChirpstackPackage.PMX_STATUS__COUNTER_CATEGORY:
				setCounterCategory((Double)newValue);
				return;
			case ChirpstackPackage.PMX_STATUS__COUNTER_KIND:
				setCounterKind((String)newValue);
				return;
			case ChirpstackPackage.PMX_STATUS__TIMESTAMP_UTC_HHMM:
				setTimestampUtcHhmm((String)newValue);
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
			case ChirpstackPackage.PMX_STATUS__VOLTS:
				setVolts(VOLTS_EDEFAULT);
				return;
			case ChirpstackPackage.PMX_STATUS__COUNTER_CATEGORY:
				setCounterCategory(COUNTER_CATEGORY_EDEFAULT);
				return;
			case ChirpstackPackage.PMX_STATUS__COUNTER_KIND:
				setCounterKind(COUNTER_KIND_EDEFAULT);
				return;
			case ChirpstackPackage.PMX_STATUS__TIMESTAMP_UTC_HHMM:
				setTimestampUtcHhmm(TIMESTAMP_UTC_HHMM_EDEFAULT);
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
			case ChirpstackPackage.PMX_STATUS__VOLTS:
				return volts != VOLTS_EDEFAULT;
			case ChirpstackPackage.PMX_STATUS__COUNTER_CATEGORY:
				return counterCategory != COUNTER_CATEGORY_EDEFAULT;
			case ChirpstackPackage.PMX_STATUS__COUNTER_KIND:
				return COUNTER_KIND_EDEFAULT == null ? counterKind != null : !COUNTER_KIND_EDEFAULT.equals(counterKind);
			case ChirpstackPackage.PMX_STATUS__TIMESTAMP_UTC_HHMM:
				return TIMESTAMP_UTC_HHMM_EDEFAULT == null ? timestampUtcHhmm != null : !TIMESTAMP_UTC_HHMM_EDEFAULT.equals(timestampUtcHhmm);
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
		result.append(" (volts: ");
		result.append(volts);
		result.append(", counterCategory: ");
		result.append(counterCategory);
		result.append(", counterKind: ");
		result.append(counterKind);
		result.append(", timestampUtcHhmm: ");
		result.append(timestampUtcHhmm);
		result.append(')');
		return result.toString();
	}

} //PMXStatusImpl
