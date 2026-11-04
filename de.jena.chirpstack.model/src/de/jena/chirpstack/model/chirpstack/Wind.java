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
package de.jena.chirpstack.model.chirpstack;

import org.eclipse.sensinact.model.core.provider.Service;

import org.osgi.annotation.versioning.ProviderType;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Wind</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.jena.chirpstack.model.chirpstack.Wind#getWindSpeed <em>Wind Speed</em>}</li>
 *   <li>{@link de.jena.chirpstack.model.chirpstack.Wind#getWindGust <em>Wind Gust</em>}</li>
 *   <li>{@link de.jena.chirpstack.model.chirpstack.Wind#getWindDirection <em>Wind Direction</em>}</li>
 *   <li>{@link de.jena.chirpstack.model.chirpstack.Wind#getTemperature <em>Temperature</em>}</li>
 * </ul>
 *
 * @see de.jena.chirpstack.model.chirpstack.ChirpstackPackage#getWind()
 * @model
 * @generated
 */
@ProviderType
public interface Wind extends Service {
	/**
	 * Returns the value of the '<em><b>Wind Speed</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Wind Speed</em>' attribute.
	 * @see #setWindSpeed(double)
	 * @see de.jena.chirpstack.model.chirpstack.ChirpstackPackage#getWind_WindSpeed()
	 * @model annotation="mapping path='object/sensors/0/wind_speed_ms'"
	 * @generated
	 */
	double getWindSpeed();

	/**
	 * Sets the value of the '{@link de.jena.chirpstack.model.chirpstack.Wind#getWindSpeed <em>Wind Speed</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Wind Speed</em>' attribute.
	 * @see #getWindSpeed()
	 * @generated
	 */
	void setWindSpeed(double value);

	/**
	 * Returns the value of the '<em><b>Wind Gust</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Wind Gust</em>' attribute.
	 * @see #setWindGust(double)
	 * @see de.jena.chirpstack.model.chirpstack.ChirpstackPackage#getWind_WindGust()
	 * @model annotation="mapping path='object/sensors/0/gust_ms'"
	 * @generated
	 */
	double getWindGust();

	/**
	 * Sets the value of the '{@link de.jena.chirpstack.model.chirpstack.Wind#getWindGust <em>Wind Gust</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Wind Gust</em>' attribute.
	 * @see #getWindGust()
	 * @generated
	 */
	void setWindGust(double value);

	/**
	 * Returns the value of the '<em><b>Wind Direction</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Wind Direction</em>' attribute.
	 * @see #setWindDirection(double)
	 * @see de.jena.chirpstack.model.chirpstack.ChirpstackPackage#getWind_WindDirection()
	 * @model annotation="mapping path='object/sensors/0/wind_direction_deg'"
	 * @generated
	 */
	double getWindDirection();

	/**
	 * Sets the value of the '{@link de.jena.chirpstack.model.chirpstack.Wind#getWindDirection <em>Wind Direction</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Wind Direction</em>' attribute.
	 * @see #getWindDirection()
	 * @generated
	 */
	void setWindDirection(double value);

	/**
	 * Returns the value of the '<em><b>Temperature</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Temperature</em>' attribute.
	 * @see #setTemperature(double)
	 * @see de.jena.chirpstack.model.chirpstack.ChirpstackPackage#getWind_Temperature()
	 * @model annotation="mapping path='object/sensors/1/air_temperature_degC'"
	 * @generated
	 */
	double getTemperature();

	/**
	 * Sets the value of the '{@link de.jena.chirpstack.model.chirpstack.Wind#getTemperature <em>Temperature</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Temperature</em>' attribute.
	 * @see #getTemperature()
	 * @generated
	 */
	void setTemperature(double value);

} // Wind
