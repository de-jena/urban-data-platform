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
package de.jena.chirpstack.model.dummymoisture.impl;

import de.jena.chirpstack.model.dummymoisture.DummyMoisturePackage;
import de.jena.chirpstack.model.dummymoisture.MoistureStatus;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.sensinact.gateway.geojson.GeoJsonObject;

import org.eclipse.sensinact.model.core.provider.impl.ServiceImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Moisture Status</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link de.jena.chirpstack.model.dummymoisture.impl.MoistureStatusImpl#getValue <em>Value</em>}</li>
 *   <li>{@link de.jena.chirpstack.model.dummymoisture.impl.MoistureStatusImpl#getObservedArea <em>Observed Area</em>}</li>
 *   <li>{@link de.jena.chirpstack.model.dummymoisture.impl.MoistureStatusImpl#getTemperature <em>Temperature</em>}</li>
 *   <li>{@link de.jena.chirpstack.model.dummymoisture.impl.MoistureStatusImpl#getWater <em>Water</em>}</li>
 *   <li>{@link de.jena.chirpstack.model.dummymoisture.impl.MoistureStatusImpl#getConduct <em>Conduct</em>}</li>
 * </ul>
 *
 * @generated
 */
public class MoistureStatusImpl extends ServiceImpl implements MoistureStatus {
	/**
	 * The default value of the '{@link #getValue() <em>Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getValue()
	 * @generated
	 * @ordered
	 */
	protected static final Integer VALUE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getValue() <em>Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getValue()
	 * @generated
	 * @ordered
	 */
	protected Integer value = VALUE_EDEFAULT;

	/**
	 * The default value of the '{@link #getObservedArea() <em>Observed Area</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getObservedArea()
	 * @generated
	 * @ordered
	 */
	protected static final GeoJsonObject OBSERVED_AREA_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getObservedArea() <em>Observed Area</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getObservedArea()
	 * @generated
	 * @ordered
	 */
	protected GeoJsonObject observedArea = OBSERVED_AREA_EDEFAULT;

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
	 * The default value of the '{@link #getWater() <em>Water</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWater()
	 * @generated
	 * @ordered
	 */
	protected static final double WATER_EDEFAULT = 0.0;

	/**
	 * The cached value of the '{@link #getWater() <em>Water</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWater()
	 * @generated
	 * @ordered
	 */
	protected double water = WATER_EDEFAULT;

	/**
	 * The default value of the '{@link #getConduct() <em>Conduct</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConduct()
	 * @generated
	 * @ordered
	 */
	protected static final double CONDUCT_EDEFAULT = 0.0;

	/**
	 * The cached value of the '{@link #getConduct() <em>Conduct</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConduct()
	 * @generated
	 * @ordered
	 */
	protected double conduct = CONDUCT_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected MoistureStatusImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return DummyMoisturePackage.Literals.MOISTURE_STATUS;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Integer getValue() {
		return value;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setValue(Integer newValue) {
		Integer oldValue = value;
		value = newValue;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DummyMoisturePackage.MOISTURE_STATUS__VALUE, oldValue, value));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public GeoJsonObject getObservedArea() {
		return observedArea;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setObservedArea(GeoJsonObject newObservedArea) {
		GeoJsonObject oldObservedArea = observedArea;
		observedArea = newObservedArea;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DummyMoisturePackage.MOISTURE_STATUS__OBSERVED_AREA, oldObservedArea, observedArea));
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
			eNotify(new ENotificationImpl(this, Notification.SET, DummyMoisturePackage.MOISTURE_STATUS__TEMPERATURE, oldTemperature, temperature));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public double getWater() {
		return water;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setWater(double newWater) {
		double oldWater = water;
		water = newWater;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DummyMoisturePackage.MOISTURE_STATUS__WATER, oldWater, water));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public double getConduct() {
		return conduct;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setConduct(double newConduct) {
		double oldConduct = conduct;
		conduct = newConduct;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DummyMoisturePackage.MOISTURE_STATUS__CONDUCT, oldConduct, conduct));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case DummyMoisturePackage.MOISTURE_STATUS__VALUE:
				return getValue();
			case DummyMoisturePackage.MOISTURE_STATUS__OBSERVED_AREA:
				return getObservedArea();
			case DummyMoisturePackage.MOISTURE_STATUS__TEMPERATURE:
				return getTemperature();
			case DummyMoisturePackage.MOISTURE_STATUS__WATER:
				return getWater();
			case DummyMoisturePackage.MOISTURE_STATUS__CONDUCT:
				return getConduct();
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
			case DummyMoisturePackage.MOISTURE_STATUS__VALUE:
				setValue((Integer)newValue);
				return;
			case DummyMoisturePackage.MOISTURE_STATUS__OBSERVED_AREA:
				setObservedArea((GeoJsonObject)newValue);
				return;
			case DummyMoisturePackage.MOISTURE_STATUS__TEMPERATURE:
				setTemperature((Double)newValue);
				return;
			case DummyMoisturePackage.MOISTURE_STATUS__WATER:
				setWater((Double)newValue);
				return;
			case DummyMoisturePackage.MOISTURE_STATUS__CONDUCT:
				setConduct((Double)newValue);
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
			case DummyMoisturePackage.MOISTURE_STATUS__VALUE:
				setValue(VALUE_EDEFAULT);
				return;
			case DummyMoisturePackage.MOISTURE_STATUS__OBSERVED_AREA:
				setObservedArea(OBSERVED_AREA_EDEFAULT);
				return;
			case DummyMoisturePackage.MOISTURE_STATUS__TEMPERATURE:
				setTemperature(TEMPERATURE_EDEFAULT);
				return;
			case DummyMoisturePackage.MOISTURE_STATUS__WATER:
				setWater(WATER_EDEFAULT);
				return;
			case DummyMoisturePackage.MOISTURE_STATUS__CONDUCT:
				setConduct(CONDUCT_EDEFAULT);
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
			case DummyMoisturePackage.MOISTURE_STATUS__VALUE:
				return VALUE_EDEFAULT == null ? value != null : !VALUE_EDEFAULT.equals(value);
			case DummyMoisturePackage.MOISTURE_STATUS__OBSERVED_AREA:
				return OBSERVED_AREA_EDEFAULT == null ? observedArea != null : !OBSERVED_AREA_EDEFAULT.equals(observedArea);
			case DummyMoisturePackage.MOISTURE_STATUS__TEMPERATURE:
				return temperature != TEMPERATURE_EDEFAULT;
			case DummyMoisturePackage.MOISTURE_STATUS__WATER:
				return water != WATER_EDEFAULT;
			case DummyMoisturePackage.MOISTURE_STATUS__CONDUCT:
				return conduct != CONDUCT_EDEFAULT;
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
		result.append(" (value: ");
		result.append(value);
		result.append(", observedArea: ");
		result.append(observedArea);
		result.append(", temperature: ");
		result.append(temperature);
		result.append(", water: ");
		result.append(water);
		result.append(", conduct: ");
		result.append(conduct);
		result.append(')');
		return result.toString();
	}

} //MoistureStatusImpl
