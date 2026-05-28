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
import de.jena.chirpstack.model.chirpstack.PMXCounter;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.sensinact.model.core.provider.impl.ServiceImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>PMX Counter</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link de.jena.chirpstack.model.chirpstack.impl.PMXCounterImpl#getTotalCount <em>Total Count</em>}</li>
 *   <li>{@link de.jena.chirpstack.model.chirpstack.impl.PMXCounterImpl#getLtrCount <em>Ltr Count</em>}</li>
 *   <li>{@link de.jena.chirpstack.model.chirpstack.impl.PMXCounterImpl#getLtrAvgSpeedKmh <em>Ltr Avg Speed Kmh</em>}</li>
 *   <li>{@link de.jena.chirpstack.model.chirpstack.impl.PMXCounterImpl#getRtlCount <em>Rtl Count</em>}</li>
 *   <li>{@link de.jena.chirpstack.model.chirpstack.impl.PMXCounterImpl#getRtlAvgSpeedKmh <em>Rtl Avg Speed Kmh</em>}</li>
 * </ul>
 *
 * @generated
 */
public class PMXCounterImpl extends ServiceImpl implements PMXCounter {
	/**
	 * The default value of the '{@link #getTotalCount() <em>Total Count</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTotalCount()
	 * @generated
	 * @ordered
	 */
	protected static final double TOTAL_COUNT_EDEFAULT = 0.0;

	/**
	 * The cached value of the '{@link #getTotalCount() <em>Total Count</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTotalCount()
	 * @generated
	 * @ordered
	 */
	protected double totalCount = TOTAL_COUNT_EDEFAULT;

	/**
	 * The default value of the '{@link #getLtrCount() <em>Ltr Count</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLtrCount()
	 * @generated
	 * @ordered
	 */
	protected static final double LTR_COUNT_EDEFAULT = 0.0;

	/**
	 * The cached value of the '{@link #getLtrCount() <em>Ltr Count</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLtrCount()
	 * @generated
	 * @ordered
	 */
	protected double ltrCount = LTR_COUNT_EDEFAULT;

	/**
	 * The default value of the '{@link #getLtrAvgSpeedKmh() <em>Ltr Avg Speed Kmh</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLtrAvgSpeedKmh()
	 * @generated
	 * @ordered
	 */
	protected static final double LTR_AVG_SPEED_KMH_EDEFAULT = 0.0;

	/**
	 * The cached value of the '{@link #getLtrAvgSpeedKmh() <em>Ltr Avg Speed Kmh</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLtrAvgSpeedKmh()
	 * @generated
	 * @ordered
	 */
	protected double ltrAvgSpeedKmh = LTR_AVG_SPEED_KMH_EDEFAULT;

	/**
	 * The default value of the '{@link #getRtlCount() <em>Rtl Count</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRtlCount()
	 * @generated
	 * @ordered
	 */
	protected static final double RTL_COUNT_EDEFAULT = 0.0;

	/**
	 * The cached value of the '{@link #getRtlCount() <em>Rtl Count</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRtlCount()
	 * @generated
	 * @ordered
	 */
	protected double rtlCount = RTL_COUNT_EDEFAULT;

	/**
	 * The default value of the '{@link #getRtlAvgSpeedKmh() <em>Rtl Avg Speed Kmh</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRtlAvgSpeedKmh()
	 * @generated
	 * @ordered
	 */
	protected static final double RTL_AVG_SPEED_KMH_EDEFAULT = 0.0;

	/**
	 * The cached value of the '{@link #getRtlAvgSpeedKmh() <em>Rtl Avg Speed Kmh</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRtlAvgSpeedKmh()
	 * @generated
	 * @ordered
	 */
	protected double rtlAvgSpeedKmh = RTL_AVG_SPEED_KMH_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PMXCounterImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ChirpstackPackage.Literals.PMX_COUNTER;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public double getTotalCount() {
		return totalCount;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setTotalCount(double newTotalCount) {
		double oldTotalCount = totalCount;
		totalCount = newTotalCount;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ChirpstackPackage.PMX_COUNTER__TOTAL_COUNT, oldTotalCount, totalCount));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public double getLtrCount() {
		return ltrCount;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setLtrCount(double newLtrCount) {
		double oldLtrCount = ltrCount;
		ltrCount = newLtrCount;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ChirpstackPackage.PMX_COUNTER__LTR_COUNT, oldLtrCount, ltrCount));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public double getLtrAvgSpeedKmh() {
		return ltrAvgSpeedKmh;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setLtrAvgSpeedKmh(double newLtrAvgSpeedKmh) {
		double oldLtrAvgSpeedKmh = ltrAvgSpeedKmh;
		ltrAvgSpeedKmh = newLtrAvgSpeedKmh;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ChirpstackPackage.PMX_COUNTER__LTR_AVG_SPEED_KMH, oldLtrAvgSpeedKmh, ltrAvgSpeedKmh));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public double getRtlCount() {
		return rtlCount;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setRtlCount(double newRtlCount) {
		double oldRtlCount = rtlCount;
		rtlCount = newRtlCount;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ChirpstackPackage.PMX_COUNTER__RTL_COUNT, oldRtlCount, rtlCount));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public double getRtlAvgSpeedKmh() {
		return rtlAvgSpeedKmh;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setRtlAvgSpeedKmh(double newRtlAvgSpeedKmh) {
		double oldRtlAvgSpeedKmh = rtlAvgSpeedKmh;
		rtlAvgSpeedKmh = newRtlAvgSpeedKmh;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ChirpstackPackage.PMX_COUNTER__RTL_AVG_SPEED_KMH, oldRtlAvgSpeedKmh, rtlAvgSpeedKmh));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case ChirpstackPackage.PMX_COUNTER__TOTAL_COUNT:
				return getTotalCount();
			case ChirpstackPackage.PMX_COUNTER__LTR_COUNT:
				return getLtrCount();
			case ChirpstackPackage.PMX_COUNTER__LTR_AVG_SPEED_KMH:
				return getLtrAvgSpeedKmh();
			case ChirpstackPackage.PMX_COUNTER__RTL_COUNT:
				return getRtlCount();
			case ChirpstackPackage.PMX_COUNTER__RTL_AVG_SPEED_KMH:
				return getRtlAvgSpeedKmh();
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
			case ChirpstackPackage.PMX_COUNTER__TOTAL_COUNT:
				setTotalCount((Double)newValue);
				return;
			case ChirpstackPackage.PMX_COUNTER__LTR_COUNT:
				setLtrCount((Double)newValue);
				return;
			case ChirpstackPackage.PMX_COUNTER__LTR_AVG_SPEED_KMH:
				setLtrAvgSpeedKmh((Double)newValue);
				return;
			case ChirpstackPackage.PMX_COUNTER__RTL_COUNT:
				setRtlCount((Double)newValue);
				return;
			case ChirpstackPackage.PMX_COUNTER__RTL_AVG_SPEED_KMH:
				setRtlAvgSpeedKmh((Double)newValue);
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
			case ChirpstackPackage.PMX_COUNTER__TOTAL_COUNT:
				setTotalCount(TOTAL_COUNT_EDEFAULT);
				return;
			case ChirpstackPackage.PMX_COUNTER__LTR_COUNT:
				setLtrCount(LTR_COUNT_EDEFAULT);
				return;
			case ChirpstackPackage.PMX_COUNTER__LTR_AVG_SPEED_KMH:
				setLtrAvgSpeedKmh(LTR_AVG_SPEED_KMH_EDEFAULT);
				return;
			case ChirpstackPackage.PMX_COUNTER__RTL_COUNT:
				setRtlCount(RTL_COUNT_EDEFAULT);
				return;
			case ChirpstackPackage.PMX_COUNTER__RTL_AVG_SPEED_KMH:
				setRtlAvgSpeedKmh(RTL_AVG_SPEED_KMH_EDEFAULT);
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
			case ChirpstackPackage.PMX_COUNTER__TOTAL_COUNT:
				return totalCount != TOTAL_COUNT_EDEFAULT;
			case ChirpstackPackage.PMX_COUNTER__LTR_COUNT:
				return ltrCount != LTR_COUNT_EDEFAULT;
			case ChirpstackPackage.PMX_COUNTER__LTR_AVG_SPEED_KMH:
				return ltrAvgSpeedKmh != LTR_AVG_SPEED_KMH_EDEFAULT;
			case ChirpstackPackage.PMX_COUNTER__RTL_COUNT:
				return rtlCount != RTL_COUNT_EDEFAULT;
			case ChirpstackPackage.PMX_COUNTER__RTL_AVG_SPEED_KMH:
				return rtlAvgSpeedKmh != RTL_AVG_SPEED_KMH_EDEFAULT;
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
		result.append(" (totalCount: ");
		result.append(totalCount);
		result.append(", ltrCount: ");
		result.append(ltrCount);
		result.append(", ltrAvgSpeedKmh: ");
		result.append(ltrAvgSpeedKmh);
		result.append(", rtlCount: ");
		result.append(rtlCount);
		result.append(", rtlAvgSpeedKmh: ");
		result.append(rtlAvgSpeedKmh);
		result.append(')');
		return result.toString();
	}

} //PMXCounterImpl
