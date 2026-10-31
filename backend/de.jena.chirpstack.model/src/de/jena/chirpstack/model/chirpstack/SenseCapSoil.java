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
 * A representation of the model object '<em><b>Sense Cap Soil</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.jena.chirpstack.model.chirpstack.SenseCapSoil#getSoilTemperature <em>Soil Temperature</em>}</li>
 *   <li>{@link de.jena.chirpstack.model.chirpstack.SenseCapSoil#getSoilMoisture <em>Soil Moisture</em>}</li>
 *   <li>{@link de.jena.chirpstack.model.chirpstack.SenseCapSoil#getSoilConductivity <em>Soil Conductivity</em>}</li>
 * </ul>
 *
 * @see de.jena.chirpstack.model.chirpstack.ChirpstackPackage#getSenseCapSoil()
 * @model
 * @generated
 */
@ProviderType
public interface SenseCapSoil extends Service {
	/**
	 * Returns the value of the '<em><b>Soil Temperature</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Soil Temperature</em>' attribute.
	 * @see #setSoilTemperature(double)
	 * @see de.jena.chirpstack.model.chirpstack.ChirpstackPackage#getSenseCapSoil_SoilTemperature()
	 * @model annotation="mapping path='object/messages/0/0/measurementValue' measurementId='4102'"
	 * @generated
	 */
	double getSoilTemperature();

	/**
	 * Sets the value of the '{@link de.jena.chirpstack.model.chirpstack.SenseCapSoil#getSoilTemperature <em>Soil Temperature</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Soil Temperature</em>' attribute.
	 * @see #getSoilTemperature()
	 * @generated
	 */
	void setSoilTemperature(double value);

	/**
	 * Returns the value of the '<em><b>Soil Moisture</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Soil Moisture</em>' attribute.
	 * @see #setSoilMoisture(double)
	 * @see de.jena.chirpstack.model.chirpstack.ChirpstackPackage#getSenseCapSoil_SoilMoisture()
	 * @model annotation="mapping path='object/messages/0/1/measurementValue' measurementId='4103'"
	 * @generated
	 */
	double getSoilMoisture();

	/**
	 * Sets the value of the '{@link de.jena.chirpstack.model.chirpstack.SenseCapSoil#getSoilMoisture <em>Soil Moisture</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Soil Moisture</em>' attribute.
	 * @see #getSoilMoisture()
	 * @generated
	 */
	void setSoilMoisture(double value);

	/**
	 * Returns the value of the '<em><b>Soil Conductivity</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Soil Conductivity</em>' attribute.
	 * @see #setSoilConductivity(double)
	 * @see de.jena.chirpstack.model.chirpstack.ChirpstackPackage#getSenseCapSoil_SoilConductivity()
	 * @model annotation="mapping path='object/messages/0/2/measurementValue' measurementId='4108'"
	 * @generated
	 */
	double getSoilConductivity();

	/**
	 * Sets the value of the '{@link de.jena.chirpstack.model.chirpstack.SenseCapSoil#getSoilConductivity <em>Soil Conductivity</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Soil Conductivity</em>' attribute.
	 * @see #getSoilConductivity()
	 * @generated
	 */
	void setSoilConductivity(double value);

} // SenseCapSoil
