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

import de.jena.chirpstack.model.chirpstack.Atmosphere;
import de.jena.chirpstack.model.chirpstack.ChirpstackPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.sensinact.model.core.provider.impl.ServiceImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Atmosphere</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link de.jena.chirpstack.model.chirpstack.impl.AtmosphereImpl#getTemperature <em>Temperature</em>}</li>
 *   <li>{@link de.jena.chirpstack.model.chirpstack.impl.AtmosphereImpl#getRelHumidity <em>Rel Humidity</em>}</li>
 *   <li>{@link de.jena.chirpstack.model.chirpstack.impl.AtmosphereImpl#getAirPressure <em>Air Pressure</em>}</li>
 *   <li>{@link de.jena.chirpstack.model.chirpstack.impl.AtmosphereImpl#getVapourPressure <em>Vapour Pressure</em>}</li>
 * </ul>
 *
 * @generated
 */
public class AtmosphereImpl extends ServiceImpl implements Atmosphere {
	/**
	 * The default value of the '{@link #getTemperature() <em>Temperature</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTemperature()
	 * @generated
	 * @ordered
	 */
	protected static final double TEMPERATURE_EDEFAULT = 0.0;

	/**
	 * The cached value of the '{@link #getTemperature() <em>Temperature</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTemperature()
	 * @generated
	 * @ordered
	 */
	protected double temperature = TEMPERATURE_EDEFAULT;

	/**
	 * The default value of the '{@link #getRelHumidity() <em>Rel Humidity</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRelHumidity()
	 * @generated
	 * @ordered
	 */
	protected static final double REL_HUMIDITY_EDEFAULT = 0.0;

	/**
	 * The cached value of the '{@link #getRelHumidity() <em>Rel Humidity</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRelHumidity()
	 * @generated
	 * @ordered
	 */
	protected double relHumidity = REL_HUMIDITY_EDEFAULT;

	/**
	 * The default value of the '{@link #getAirPressure() <em>Air Pressure</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAirPressure()
	 * @generated
	 * @ordered
	 */
	protected static final double AIR_PRESSURE_EDEFAULT = 0.0;

	/**
	 * The cached value of the '{@link #getAirPressure() <em>Air Pressure</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAirPressure()
	 * @generated
	 * @ordered
	 */
	protected double airPressure = AIR_PRESSURE_EDEFAULT;

	/**
	 * The default value of the '{@link #getVapourPressure() <em>Vapour Pressure</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVapourPressure()
	 * @generated
	 * @ordered
	 */
	protected static final double VAPOUR_PRESSURE_EDEFAULT = 0.0;

	/**
	 * The cached value of the '{@link #getVapourPressure() <em>Vapour Pressure</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVapourPressure()
	 * @generated
	 * @ordered
	 */
	protected double vapourPressure = VAPOUR_PRESSURE_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AtmosphereImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ChirpstackPackage.Literals.ATMOSPHERE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public double getTemperature() {
		return temperature;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setTemperature(double newTemperature) {
		double oldTemperature = temperature;
		temperature = newTemperature;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ChirpstackPackage.ATMOSPHERE__TEMPERATURE, oldTemperature, temperature));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public double getRelHumidity() {
		return relHumidity;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setRelHumidity(double newRelHumidity) {
		double oldRelHumidity = relHumidity;
		relHumidity = newRelHumidity;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ChirpstackPackage.ATMOSPHERE__REL_HUMIDITY, oldRelHumidity, relHumidity));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public double getAirPressure() {
		return airPressure;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setAirPressure(double newAirPressure) {
		double oldAirPressure = airPressure;
		airPressure = newAirPressure;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ChirpstackPackage.ATMOSPHERE__AIR_PRESSURE, oldAirPressure, airPressure));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public double getVapourPressure() {
		return vapourPressure;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setVapourPressure(double newVapourPressure) {
		double oldVapourPressure = vapourPressure;
		vapourPressure = newVapourPressure;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ChirpstackPackage.ATMOSPHERE__VAPOUR_PRESSURE, oldVapourPressure, vapourPressure));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case ChirpstackPackage.ATMOSPHERE__TEMPERATURE:
				return getTemperature();
			case ChirpstackPackage.ATMOSPHERE__REL_HUMIDITY:
				return getRelHumidity();
			case ChirpstackPackage.ATMOSPHERE__AIR_PRESSURE:
				return getAirPressure();
			case ChirpstackPackage.ATMOSPHERE__VAPOUR_PRESSURE:
				return getVapourPressure();
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
			case ChirpstackPackage.ATMOSPHERE__TEMPERATURE:
				setTemperature((Double)newValue);
				return;
			case ChirpstackPackage.ATMOSPHERE__REL_HUMIDITY:
				setRelHumidity((Double)newValue);
				return;
			case ChirpstackPackage.ATMOSPHERE__AIR_PRESSURE:
				setAirPressure((Double)newValue);
				return;
			case ChirpstackPackage.ATMOSPHERE__VAPOUR_PRESSURE:
				setVapourPressure((Double)newValue);
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
			case ChirpstackPackage.ATMOSPHERE__TEMPERATURE:
				setTemperature(TEMPERATURE_EDEFAULT);
				return;
			case ChirpstackPackage.ATMOSPHERE__REL_HUMIDITY:
				setRelHumidity(REL_HUMIDITY_EDEFAULT);
				return;
			case ChirpstackPackage.ATMOSPHERE__AIR_PRESSURE:
				setAirPressure(AIR_PRESSURE_EDEFAULT);
				return;
			case ChirpstackPackage.ATMOSPHERE__VAPOUR_PRESSURE:
				setVapourPressure(VAPOUR_PRESSURE_EDEFAULT);
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
			case ChirpstackPackage.ATMOSPHERE__TEMPERATURE:
				return temperature != TEMPERATURE_EDEFAULT;
			case ChirpstackPackage.ATMOSPHERE__REL_HUMIDITY:
				return relHumidity != REL_HUMIDITY_EDEFAULT;
			case ChirpstackPackage.ATMOSPHERE__AIR_PRESSURE:
				return airPressure != AIR_PRESSURE_EDEFAULT;
			case ChirpstackPackage.ATMOSPHERE__VAPOUR_PRESSURE:
				return vapourPressure != VAPOUR_PRESSURE_EDEFAULT;
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
		result.append(" (temperature: ");
		result.append(temperature);
		result.append(", relHumidity: ");
		result.append(relHumidity);
		result.append(", airPressure: ");
		result.append(airPressure);
		result.append(", vapourPressure: ");
		result.append(vapourPressure);
		result.append(')');
		return result.toString();
	}

} //AtmosphereImpl
