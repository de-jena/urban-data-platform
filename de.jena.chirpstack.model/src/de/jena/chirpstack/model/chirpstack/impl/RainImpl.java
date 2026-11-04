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
import de.jena.chirpstack.model.chirpstack.Rain;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.sensinact.model.core.provider.impl.ServiceImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Rain</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link de.jena.chirpstack.model.chirpstack.impl.RainImpl#getRainGauge <em>Rain Gauge</em>}</li>
 *   <li>{@link de.jena.chirpstack.model.chirpstack.impl.RainImpl#getRainAccumulation <em>Rain Accumulation</em>}</li>
 * </ul>
 *
 * @generated
 */
public class RainImpl extends ServiceImpl implements Rain {
	/**
	 * The default value of the '{@link #getRainGauge() <em>Rain Gauge</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRainGauge()
	 * @generated
	 * @ordered
	 */
	protected static final double RAIN_GAUGE_EDEFAULT = 0.0;

	/**
	 * The cached value of the '{@link #getRainGauge() <em>Rain Gauge</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRainGauge()
	 * @generated
	 * @ordered
	 */
	protected double rainGauge = RAIN_GAUGE_EDEFAULT;

	/**
	 * The default value of the '{@link #getRainAccumulation() <em>Rain Accumulation</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRainAccumulation()
	 * @generated
	 * @ordered
	 */
	protected static final double RAIN_ACCUMULATION_EDEFAULT = 0.0;

	/**
	 * The cached value of the '{@link #getRainAccumulation() <em>Rain Accumulation</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRainAccumulation()
	 * @generated
	 * @ordered
	 */
	protected double rainAccumulation = RAIN_ACCUMULATION_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected RainImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ChirpstackPackage.Literals.RAIN;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public double getRainGauge() {
		return rainGauge;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setRainGauge(double newRainGauge) {
		double oldRainGauge = rainGauge;
		rainGauge = newRainGauge;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ChirpstackPackage.RAIN__RAIN_GAUGE, oldRainGauge, rainGauge));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public double getRainAccumulation() {
		return rainAccumulation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setRainAccumulation(double newRainAccumulation) {
		double oldRainAccumulation = rainAccumulation;
		rainAccumulation = newRainAccumulation;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ChirpstackPackage.RAIN__RAIN_ACCUMULATION, oldRainAccumulation, rainAccumulation));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case ChirpstackPackage.RAIN__RAIN_GAUGE:
				return getRainGauge();
			case ChirpstackPackage.RAIN__RAIN_ACCUMULATION:
				return getRainAccumulation();
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
			case ChirpstackPackage.RAIN__RAIN_GAUGE:
				setRainGauge((Double)newValue);
				return;
			case ChirpstackPackage.RAIN__RAIN_ACCUMULATION:
				setRainAccumulation((Double)newValue);
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
			case ChirpstackPackage.RAIN__RAIN_GAUGE:
				setRainGauge(RAIN_GAUGE_EDEFAULT);
				return;
			case ChirpstackPackage.RAIN__RAIN_ACCUMULATION:
				setRainAccumulation(RAIN_ACCUMULATION_EDEFAULT);
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
			case ChirpstackPackage.RAIN__RAIN_GAUGE:
				return rainGauge != RAIN_GAUGE_EDEFAULT;
			case ChirpstackPackage.RAIN__RAIN_ACCUMULATION:
				return rainAccumulation != RAIN_ACCUMULATION_EDEFAULT;
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
		result.append(" (rainGauge: ");
		result.append(rainGauge);
		result.append(", rainAccumulation: ");
		result.append(rainAccumulation);
		result.append(')');
		return result.toString();
	}

} //RainImpl
