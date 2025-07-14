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
package de.jena.chirpstack.moisture.model.moisture;

import org.eclipse.sensinact.model.core.provider.Service;

import org.osgi.annotation.versioning.ProviderType;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Air</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.jena.chirpstack.moisture.model.moisture.Air#getAirTemperature <em>Air Temperature</em>}</li>
 *   <li>{@link de.jena.chirpstack.moisture.model.moisture.Air#getAirHumidity <em>Air Humidity</em>}</li>
 *   <li>{@link de.jena.chirpstack.moisture.model.moisture.Air#getBarometricPressure <em>Barometric Pressure</em>}</li>
 *   <li>{@link de.jena.chirpstack.moisture.model.moisture.Air#getPeakWindGust <em>Peak Wind Gust</em>}</li>
 *   <li>{@link de.jena.chirpstack.moisture.model.moisture.Air#getWindSpeed <em>Wind Speed</em>}</li>
 *   <li>{@link de.jena.chirpstack.moisture.model.moisture.Air#getWindDirectionSensor <em>Wind Direction Sensor</em>}</li>
 * </ul>
 *
 * @see de.jena.chirpstack.moisture.model.moisture.ChirpstackMoisturePackage#getAir()
 * @model
 * @generated
 */
@ProviderType
public interface Air extends Service {
	/**
	 * Returns the value of the '<em><b>Air Temperature</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Air Temperature</em>' attribute.
	 * @see #setAirTemperature(double)
	 * @see de.jena.chirpstack.moisture.model.moisture.ChirpstackMoisturePackage#getAir_AirTemperature()
	 * @model annotation="mapping path='object/messages/0/0/measurementValue'"
	 * @generated
	 */
	double getAirTemperature();

	/**
	 * Sets the value of the '{@link de.jena.chirpstack.moisture.model.moisture.Air#getAirTemperature <em>Air Temperature</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Air Temperature</em>' attribute.
	 * @see #getAirTemperature()
	 * @generated
	 */
	void setAirTemperature(double value);

	/**
	 * Returns the value of the '<em><b>Air Humidity</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Air Humidity</em>' attribute.
	 * @see #setAirHumidity(double)
	 * @see de.jena.chirpstack.moisture.model.moisture.ChirpstackMoisturePackage#getAir_AirHumidity()
	 * @model annotation="mapping path='object/messages/0/1/measurementValue'"
	 * @generated
	 */
	double getAirHumidity();

	/**
	 * Sets the value of the '{@link de.jena.chirpstack.moisture.model.moisture.Air#getAirHumidity <em>Air Humidity</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Air Humidity</em>' attribute.
	 * @see #getAirHumidity()
	 * @generated
	 */
	void setAirHumidity(double value);

	/**
	 * Returns the value of the '<em><b>Barometric Pressure</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Barometric Pressure</em>' attribute.
	 * @see #setBarometricPressure(double)
	 * @see de.jena.chirpstack.moisture.model.moisture.ChirpstackMoisturePackage#getAir_BarometricPressure()
	 * @model annotation="mapping path='object/messages/1/2/measurementValue'"
	 * @generated
	 */
	double getBarometricPressure();

	/**
	 * Sets the value of the '{@link de.jena.chirpstack.moisture.model.moisture.Air#getBarometricPressure <em>Barometric Pressure</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Barometric Pressure</em>' attribute.
	 * @see #getBarometricPressure()
	 * @generated
	 */
	void setBarometricPressure(double value);

	/**
	 * Returns the value of the '<em><b>Peak Wind Gust</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Peak Wind Gust</em>' attribute.
	 * @see #setPeakWindGust(double)
	 * @see de.jena.chirpstack.moisture.model.moisture.ChirpstackMoisturePackage#getAir_PeakWindGust()
	 * @model annotation="mapping path='object/messages/2/0/measurementValue'"
	 * @generated
	 */
	double getPeakWindGust();

	/**
	 * Sets the value of the '{@link de.jena.chirpstack.moisture.model.moisture.Air#getPeakWindGust <em>Peak Wind Gust</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Peak Wind Gust</em>' attribute.
	 * @see #getPeakWindGust()
	 * @generated
	 */
	void setPeakWindGust(double value);

	/**
	 * Returns the value of the '<em><b>Wind Speed</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Wind Speed</em>' attribute.
	 * @see #setWindSpeed(double)
	 * @see de.jena.chirpstack.moisture.model.moisture.ChirpstackMoisturePackage#getAir_WindSpeed()
	 * @model annotation="mapping path='object/messages/0/4/measurementValue'"
	 * @generated
	 */
	double getWindSpeed();

	/**
	 * Sets the value of the '{@link de.jena.chirpstack.moisture.model.moisture.Air#getWindSpeed <em>Wind Speed</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Wind Speed</em>' attribute.
	 * @see #getWindSpeed()
	 * @generated
	 */
	void setWindSpeed(double value);

	/**
	 * Returns the value of the '<em><b>Wind Direction Sensor</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Wind Direction Sensor</em>' attribute.
	 * @see #setWindDirectionSensor(double)
	 * @see de.jena.chirpstack.moisture.model.moisture.ChirpstackMoisturePackage#getAir_WindDirectionSensor()
	 * @model annotation="mapping path='object/messages/1/0/measurementValue'"
	 * @generated
	 */
	double getWindDirectionSensor();

	/**
	 * Sets the value of the '{@link de.jena.chirpstack.moisture.model.moisture.Air#getWindDirectionSensor <em>Wind Direction Sensor</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Wind Direction Sensor</em>' attribute.
	 * @see #getWindDirectionSensor()
	 * @generated
	 */
	void setWindDirectionSensor(double value);

} // Air
