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
package de.jena.chirpstack.moisture.model.moisture.impl;

import de.jena.chirpstack.moisture.model.moisture.Air;
import de.jena.chirpstack.moisture.model.moisture.ChirpstackMoisturePackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.sensinact.model.core.provider.impl.ServiceImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Air</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link de.jena.chirpstack.moisture.model.moisture.impl.AirImpl#getAirTemperature <em>Air Temperature</em>}</li>
 *   <li>{@link de.jena.chirpstack.moisture.model.moisture.impl.AirImpl#getAirHumidity <em>Air Humidity</em>}</li>
 *   <li>{@link de.jena.chirpstack.moisture.model.moisture.impl.AirImpl#getBarometricPressure <em>Barometric Pressure</em>}</li>
 *   <li>{@link de.jena.chirpstack.moisture.model.moisture.impl.AirImpl#getPeakWindGust <em>Peak Wind Gust</em>}</li>
 *   <li>{@link de.jena.chirpstack.moisture.model.moisture.impl.AirImpl#getWindSpeed <em>Wind Speed</em>}</li>
 *   <li>{@link de.jena.chirpstack.moisture.model.moisture.impl.AirImpl#getWindDirectionSensor <em>Wind Direction Sensor</em>}</li>
 * </ul>
 *
 * @generated
 */
public class AirImpl extends ServiceImpl implements Air {
	/**
	 * The default value of the '{@link #getAirTemperature() <em>Air Temperature</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAirTemperature()
	 * @generated
	 * @ordered
	 */
	protected static final double AIR_TEMPERATURE_EDEFAULT = 0.0;

	/**
	 * The cached value of the '{@link #getAirTemperature() <em>Air Temperature</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAirTemperature()
	 * @generated
	 * @ordered
	 */
	protected double airTemperature = AIR_TEMPERATURE_EDEFAULT;

	/**
	 * The default value of the '{@link #getAirHumidity() <em>Air Humidity</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAirHumidity()
	 * @generated
	 * @ordered
	 */
	protected static final double AIR_HUMIDITY_EDEFAULT = 0.0;

	/**
	 * The cached value of the '{@link #getAirHumidity() <em>Air Humidity</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAirHumidity()
	 * @generated
	 * @ordered
	 */
	protected double airHumidity = AIR_HUMIDITY_EDEFAULT;

	/**
	 * The default value of the '{@link #getBarometricPressure() <em>Barometric Pressure</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBarometricPressure()
	 * @generated
	 * @ordered
	 */
	protected static final double BAROMETRIC_PRESSURE_EDEFAULT = 0.0;

	/**
	 * The cached value of the '{@link #getBarometricPressure() <em>Barometric Pressure</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBarometricPressure()
	 * @generated
	 * @ordered
	 */
	protected double barometricPressure = BAROMETRIC_PRESSURE_EDEFAULT;

	/**
	 * The default value of the '{@link #getPeakWindGust() <em>Peak Wind Gust</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPeakWindGust()
	 * @generated
	 * @ordered
	 */
	protected static final double PEAK_WIND_GUST_EDEFAULT = 0.0;

	/**
	 * The cached value of the '{@link #getPeakWindGust() <em>Peak Wind Gust</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPeakWindGust()
	 * @generated
	 * @ordered
	 */
	protected double peakWindGust = PEAK_WIND_GUST_EDEFAULT;

	/**
	 * The default value of the '{@link #getWindSpeed() <em>Wind Speed</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWindSpeed()
	 * @generated
	 * @ordered
	 */
	protected static final double WIND_SPEED_EDEFAULT = 0.0;

	/**
	 * The cached value of the '{@link #getWindSpeed() <em>Wind Speed</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWindSpeed()
	 * @generated
	 * @ordered
	 */
	protected double windSpeed = WIND_SPEED_EDEFAULT;

	/**
	 * The default value of the '{@link #getWindDirectionSensor() <em>Wind Direction Sensor</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWindDirectionSensor()
	 * @generated
	 * @ordered
	 */
	protected static final double WIND_DIRECTION_SENSOR_EDEFAULT = 0.0;

	/**
	 * The cached value of the '{@link #getWindDirectionSensor() <em>Wind Direction Sensor</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWindDirectionSensor()
	 * @generated
	 * @ordered
	 */
	protected double windDirectionSensor = WIND_DIRECTION_SENSOR_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AirImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ChirpstackMoisturePackage.Literals.AIR;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public double getAirTemperature() {
		return airTemperature;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setAirTemperature(double newAirTemperature) {
		double oldAirTemperature = airTemperature;
		airTemperature = newAirTemperature;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ChirpstackMoisturePackage.AIR__AIR_TEMPERATURE, oldAirTemperature, airTemperature));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public double getAirHumidity() {
		return airHumidity;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setAirHumidity(double newAirHumidity) {
		double oldAirHumidity = airHumidity;
		airHumidity = newAirHumidity;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ChirpstackMoisturePackage.AIR__AIR_HUMIDITY, oldAirHumidity, airHumidity));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public double getBarometricPressure() {
		return barometricPressure;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setBarometricPressure(double newBarometricPressure) {
		double oldBarometricPressure = barometricPressure;
		barometricPressure = newBarometricPressure;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ChirpstackMoisturePackage.AIR__BAROMETRIC_PRESSURE, oldBarometricPressure, barometricPressure));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public double getPeakWindGust() {
		return peakWindGust;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setPeakWindGust(double newPeakWindGust) {
		double oldPeakWindGust = peakWindGust;
		peakWindGust = newPeakWindGust;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ChirpstackMoisturePackage.AIR__PEAK_WIND_GUST, oldPeakWindGust, peakWindGust));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public double getWindSpeed() {
		return windSpeed;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setWindSpeed(double newWindSpeed) {
		double oldWindSpeed = windSpeed;
		windSpeed = newWindSpeed;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ChirpstackMoisturePackage.AIR__WIND_SPEED, oldWindSpeed, windSpeed));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public double getWindDirectionSensor() {
		return windDirectionSensor;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setWindDirectionSensor(double newWindDirectionSensor) {
		double oldWindDirectionSensor = windDirectionSensor;
		windDirectionSensor = newWindDirectionSensor;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ChirpstackMoisturePackage.AIR__WIND_DIRECTION_SENSOR, oldWindDirectionSensor, windDirectionSensor));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case ChirpstackMoisturePackage.AIR__AIR_TEMPERATURE:
				return getAirTemperature();
			case ChirpstackMoisturePackage.AIR__AIR_HUMIDITY:
				return getAirHumidity();
			case ChirpstackMoisturePackage.AIR__BAROMETRIC_PRESSURE:
				return getBarometricPressure();
			case ChirpstackMoisturePackage.AIR__PEAK_WIND_GUST:
				return getPeakWindGust();
			case ChirpstackMoisturePackage.AIR__WIND_SPEED:
				return getWindSpeed();
			case ChirpstackMoisturePackage.AIR__WIND_DIRECTION_SENSOR:
				return getWindDirectionSensor();
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
			case ChirpstackMoisturePackage.AIR__AIR_TEMPERATURE:
				setAirTemperature((Double)newValue);
				return;
			case ChirpstackMoisturePackage.AIR__AIR_HUMIDITY:
				setAirHumidity((Double)newValue);
				return;
			case ChirpstackMoisturePackage.AIR__BAROMETRIC_PRESSURE:
				setBarometricPressure((Double)newValue);
				return;
			case ChirpstackMoisturePackage.AIR__PEAK_WIND_GUST:
				setPeakWindGust((Double)newValue);
				return;
			case ChirpstackMoisturePackage.AIR__WIND_SPEED:
				setWindSpeed((Double)newValue);
				return;
			case ChirpstackMoisturePackage.AIR__WIND_DIRECTION_SENSOR:
				setWindDirectionSensor((Double)newValue);
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
			case ChirpstackMoisturePackage.AIR__AIR_TEMPERATURE:
				setAirTemperature(AIR_TEMPERATURE_EDEFAULT);
				return;
			case ChirpstackMoisturePackage.AIR__AIR_HUMIDITY:
				setAirHumidity(AIR_HUMIDITY_EDEFAULT);
				return;
			case ChirpstackMoisturePackage.AIR__BAROMETRIC_PRESSURE:
				setBarometricPressure(BAROMETRIC_PRESSURE_EDEFAULT);
				return;
			case ChirpstackMoisturePackage.AIR__PEAK_WIND_GUST:
				setPeakWindGust(PEAK_WIND_GUST_EDEFAULT);
				return;
			case ChirpstackMoisturePackage.AIR__WIND_SPEED:
				setWindSpeed(WIND_SPEED_EDEFAULT);
				return;
			case ChirpstackMoisturePackage.AIR__WIND_DIRECTION_SENSOR:
				setWindDirectionSensor(WIND_DIRECTION_SENSOR_EDEFAULT);
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
			case ChirpstackMoisturePackage.AIR__AIR_TEMPERATURE:
				return airTemperature != AIR_TEMPERATURE_EDEFAULT;
			case ChirpstackMoisturePackage.AIR__AIR_HUMIDITY:
				return airHumidity != AIR_HUMIDITY_EDEFAULT;
			case ChirpstackMoisturePackage.AIR__BAROMETRIC_PRESSURE:
				return barometricPressure != BAROMETRIC_PRESSURE_EDEFAULT;
			case ChirpstackMoisturePackage.AIR__PEAK_WIND_GUST:
				return peakWindGust != PEAK_WIND_GUST_EDEFAULT;
			case ChirpstackMoisturePackage.AIR__WIND_SPEED:
				return windSpeed != WIND_SPEED_EDEFAULT;
			case ChirpstackMoisturePackage.AIR__WIND_DIRECTION_SENSOR:
				return windDirectionSensor != WIND_DIRECTION_SENSOR_EDEFAULT;
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
		result.append(" (airTemperature: ");
		result.append(airTemperature);
		result.append(", airHumidity: ");
		result.append(airHumidity);
		result.append(", barometricPressure: ");
		result.append(barometricPressure);
		result.append(", peakWindGust: ");
		result.append(peakWindGust);
		result.append(", windSpeed: ");
		result.append(windSpeed);
		result.append(", windDirectionSensor: ");
		result.append(windDirectionSensor);
		result.append(')');
		return result.toString();
	}

} //AirImpl
