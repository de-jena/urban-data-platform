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
import de.jena.bike.HistoricalAggregatedTraffic_data_weather;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Historical Aggregated Traffic data weather</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link de.jena.bike.impl.HistoricalAggregatedTraffic_data_weatherImpl#getTemperature <em>Temperature</em>}</li>
 *   <li>{@link de.jena.bike.impl.HistoricalAggregatedTraffic_data_weatherImpl#getRainAccumulation <em>Rain Accumulation</em>}</li>
 *   <li>{@link de.jena.bike.impl.HistoricalAggregatedTraffic_data_weatherImpl#getSnowAccumulation <em>Snow Accumulation</em>}</li>
 * </ul>
 *
 * @generated
 */
public class HistoricalAggregatedTraffic_data_weatherImpl extends MinimalEObjectImpl.Container implements HistoricalAggregatedTraffic_data_weather {
	/**
	 * The default value of the '{@link #getTemperature() <em>Temperature</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTemperature()
	 * @generated
	 * @ordered
	 */
	protected static final Float TEMPERATURE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getTemperature() <em>Temperature</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTemperature()
	 * @generated
	 * @ordered
	 */
	protected Float temperature = TEMPERATURE_EDEFAULT;

	/**
	 * The default value of the '{@link #getRainAccumulation() <em>Rain Accumulation</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRainAccumulation()
	 * @generated
	 * @ordered
	 */
	protected static final Float RAIN_ACCUMULATION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getRainAccumulation() <em>Rain Accumulation</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRainAccumulation()
	 * @generated
	 * @ordered
	 */
	protected Float rainAccumulation = RAIN_ACCUMULATION_EDEFAULT;

	/**
	 * The default value of the '{@link #getSnowAccumulation() <em>Snow Accumulation</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSnowAccumulation()
	 * @generated
	 * @ordered
	 */
	protected static final Float SNOW_ACCUMULATION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getSnowAccumulation() <em>Snow Accumulation</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSnowAccumulation()
	 * @generated
	 * @ordered
	 */
	protected Float snowAccumulation = SNOW_ACCUMULATION_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected HistoricalAggregatedTraffic_data_weatherImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return BikePackage.Literals.HISTORICAL_AGGREGATED_TRAFFIC_DATA_WEATHER;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Float getTemperature() {
		return temperature;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setTemperature(Float newTemperature) {
		Float oldTemperature = temperature;
		temperature = newTemperature;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BikePackage.HISTORICAL_AGGREGATED_TRAFFIC_DATA_WEATHER__TEMPERATURE, oldTemperature, temperature));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Float getRainAccumulation() {
		return rainAccumulation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setRainAccumulation(Float newRainAccumulation) {
		Float oldRainAccumulation = rainAccumulation;
		rainAccumulation = newRainAccumulation;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BikePackage.HISTORICAL_AGGREGATED_TRAFFIC_DATA_WEATHER__RAIN_ACCUMULATION, oldRainAccumulation, rainAccumulation));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Float getSnowAccumulation() {
		return snowAccumulation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setSnowAccumulation(Float newSnowAccumulation) {
		Float oldSnowAccumulation = snowAccumulation;
		snowAccumulation = newSnowAccumulation;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BikePackage.HISTORICAL_AGGREGATED_TRAFFIC_DATA_WEATHER__SNOW_ACCUMULATION, oldSnowAccumulation, snowAccumulation));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case BikePackage.HISTORICAL_AGGREGATED_TRAFFIC_DATA_WEATHER__TEMPERATURE:
				return getTemperature();
			case BikePackage.HISTORICAL_AGGREGATED_TRAFFIC_DATA_WEATHER__RAIN_ACCUMULATION:
				return getRainAccumulation();
			case BikePackage.HISTORICAL_AGGREGATED_TRAFFIC_DATA_WEATHER__SNOW_ACCUMULATION:
				return getSnowAccumulation();
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
			case BikePackage.HISTORICAL_AGGREGATED_TRAFFIC_DATA_WEATHER__TEMPERATURE:
				setTemperature((Float)newValue);
				return;
			case BikePackage.HISTORICAL_AGGREGATED_TRAFFIC_DATA_WEATHER__RAIN_ACCUMULATION:
				setRainAccumulation((Float)newValue);
				return;
			case BikePackage.HISTORICAL_AGGREGATED_TRAFFIC_DATA_WEATHER__SNOW_ACCUMULATION:
				setSnowAccumulation((Float)newValue);
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
			case BikePackage.HISTORICAL_AGGREGATED_TRAFFIC_DATA_WEATHER__TEMPERATURE:
				setTemperature(TEMPERATURE_EDEFAULT);
				return;
			case BikePackage.HISTORICAL_AGGREGATED_TRAFFIC_DATA_WEATHER__RAIN_ACCUMULATION:
				setRainAccumulation(RAIN_ACCUMULATION_EDEFAULT);
				return;
			case BikePackage.HISTORICAL_AGGREGATED_TRAFFIC_DATA_WEATHER__SNOW_ACCUMULATION:
				setSnowAccumulation(SNOW_ACCUMULATION_EDEFAULT);
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
			case BikePackage.HISTORICAL_AGGREGATED_TRAFFIC_DATA_WEATHER__TEMPERATURE:
				return TEMPERATURE_EDEFAULT == null ? temperature != null : !TEMPERATURE_EDEFAULT.equals(temperature);
			case BikePackage.HISTORICAL_AGGREGATED_TRAFFIC_DATA_WEATHER__RAIN_ACCUMULATION:
				return RAIN_ACCUMULATION_EDEFAULT == null ? rainAccumulation != null : !RAIN_ACCUMULATION_EDEFAULT.equals(rainAccumulation);
			case BikePackage.HISTORICAL_AGGREGATED_TRAFFIC_DATA_WEATHER__SNOW_ACCUMULATION:
				return SNOW_ACCUMULATION_EDEFAULT == null ? snowAccumulation != null : !SNOW_ACCUMULATION_EDEFAULT.equals(snowAccumulation);
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
		result.append(", rainAccumulation: ");
		result.append(rainAccumulation);
		result.append(", snowAccumulation: ");
		result.append(snowAccumulation);
		result.append(')');
		return result.toString();
	}

} //HistoricalAggregatedTraffic_data_weatherImpl
