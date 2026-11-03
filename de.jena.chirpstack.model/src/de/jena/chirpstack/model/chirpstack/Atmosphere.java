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
 * A representation of the model object '<em><b>Atmosphere</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.jena.chirpstack.model.chirpstack.Atmosphere#getTemperature <em>Temperature</em>}</li>
 *   <li>{@link de.jena.chirpstack.model.chirpstack.Atmosphere#getRelHumidity <em>Rel Humidity</em>}</li>
 *   <li>{@link de.jena.chirpstack.model.chirpstack.Atmosphere#getAirPressure <em>Air Pressure</em>}</li>
 *   <li>{@link de.jena.chirpstack.model.chirpstack.Atmosphere#getVapourPressure <em>Vapour Pressure</em>}</li>
 * </ul>
 *
 * @see de.jena.chirpstack.model.chirpstack.ChirpstackPackage#getAtmosphere()
 * @model
 * @generated
 */
@ProviderType
public interface Atmosphere extends Service {
	/**
	 * Returns the value of the '<em><b>Temperature</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Temperature</em>' attribute.
	 * @see #setTemperature(double)
	 * @see de.jena.chirpstack.model.chirpstack.ChirpstackPackage#getAtmosphere_Temperature()
	 * @model annotation="mapping path='object/sensors/0/temperature_degC'"
	 * @generated
	 */
	double getTemperature();

	/**
	 * Sets the value of the '{@link de.jena.chirpstack.model.chirpstack.Atmosphere#getTemperature <em>Temperature</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Temperature</em>' attribute.
	 * @see #getTemperature()
	 * @generated
	 */
	void setTemperature(double value);

	/**
	 * Returns the value of the '<em><b>Rel Humidity</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Rel Humidity</em>' attribute.
	 * @see #setRelHumidity(double)
	 * @see de.jena.chirpstack.model.chirpstack.ChirpstackPackage#getAtmosphere_RelHumidity()
	 * @model annotation="mapping path='object/sensors/0/rel_humidity'"
	 * @generated
	 */
	double getRelHumidity();

	/**
	 * Sets the value of the '{@link de.jena.chirpstack.model.chirpstack.Atmosphere#getRelHumidity <em>Rel Humidity</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Rel Humidity</em>' attribute.
	 * @see #getRelHumidity()
	 * @generated
	 */
	void setRelHumidity(double value);

	/**
	 * Returns the value of the '<em><b>Air Pressure</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Air Pressure</em>' attribute.
	 * @see #setAirPressure(double)
	 * @see de.jena.chirpstack.model.chirpstack.ChirpstackPackage#getAtmosphere_AirPressure()
	 * @model annotation="mapping path='object/sensors/0/air_pressure_kPa'"
	 * @generated
	 */
	double getAirPressure();

	/**
	 * Sets the value of the '{@link de.jena.chirpstack.model.chirpstack.Atmosphere#getAirPressure <em>Air Pressure</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Air Pressure</em>' attribute.
	 * @see #getAirPressure()
	 * @generated
	 */
	void setAirPressure(double value);

	/**
	 * Returns the value of the '<em><b>Vapour Pressure</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Vapour Pressure</em>' attribute.
	 * @see #setVapourPressure(double)
	 * @see de.jena.chirpstack.model.chirpstack.ChirpstackPackage#getAtmosphere_VapourPressure()
	 * @model annotation="mapping path='object/sensors/0/vapour_pressure_kPa'"
	 * @generated
	 */
	double getVapourPressure();

	/**
	 * Sets the value of the '{@link de.jena.chirpstack.model.chirpstack.Atmosphere#getVapourPressure <em>Vapour Pressure</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Vapour Pressure</em>' attribute.
	 * @see #getVapourPressure()
	 * @generated
	 */
	void setVapourPressure(double value);

} // Atmosphere
