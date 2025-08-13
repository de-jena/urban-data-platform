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

import org.eclipse.sensinact.model.core.provider.Provider;

import org.osgi.annotation.versioning.ProviderType;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Sense Cap S2105</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.jena.chirpstack.moisture.model.moisture.SenseCapS2105#getAir <em>Air</em>}</li>
 *   <li>{@link de.jena.chirpstack.moisture.model.moisture.SenseCapS2105#getRain <em>Rain</em>}</li>
 *   <li>{@link de.jena.chirpstack.moisture.model.moisture.SenseCapS2105#getLight <em>Light</em>}</li>
 * </ul>
 *
 * @see de.jena.chirpstack.moisture.model.moisture.ChirpstackMoisturePackage#getSenseCapS2105()
 * @model annotation="model name='SenseCAP_S2105-LoRaWAN_Soil_Moisture_Temperature_and_EC_Sensor' profileName='SenseCAP S2105-LoRaWAN\256 Soil Moisture, Temperature and EC Sensor' profileId='f74bb315-56ca-48c0-82f8-f7b837f4d917'"
 * @generated
 */
@ProviderType
public interface SenseCapS2105 extends Provider {
	/**
	 * Returns the value of the '<em><b>Air</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Air</em>' containment reference.
	 * @see #setAir(Air)
	 * @see de.jena.chirpstack.moisture.model.moisture.ChirpstackMoisturePackage#getSenseCapS2105_Air()
	 * @model containment="true"
	 * @generated
	 */
	Air getAir();

	/**
	 * Sets the value of the '{@link de.jena.chirpstack.moisture.model.moisture.SenseCapS2105#getAir <em>Air</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Air</em>' containment reference.
	 * @see #getAir()
	 * @generated
	 */
	void setAir(Air value);

	/**
	 * Returns the value of the '<em><b>Rain</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Rain</em>' containment reference.
	 * @see #setRain(Rain)
	 * @see de.jena.chirpstack.moisture.model.moisture.ChirpstackMoisturePackage#getSenseCapS2105_Rain()
	 * @model containment="true"
	 * @generated
	 */
	Rain getRain();

	/**
	 * Sets the value of the '{@link de.jena.chirpstack.moisture.model.moisture.SenseCapS2105#getRain <em>Rain</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Rain</em>' containment reference.
	 * @see #getRain()
	 * @generated
	 */
	void setRain(Rain value);

	/**
	 * Returns the value of the '<em><b>Light</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Light</em>' containment reference.
	 * @see #setLight(Light)
	 * @see de.jena.chirpstack.moisture.model.moisture.ChirpstackMoisturePackage#getSenseCapS2105_Light()
	 * @model containment="true"
	 * @generated
	 */
	Light getLight();

	/**
	 * Sets the value of the '{@link de.jena.chirpstack.moisture.model.moisture.SenseCapS2105#getLight <em>Light</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Light</em>' containment reference.
	 * @see #getLight()
	 * @generated
	 */
	void setLight(Light value);

} // SenseCapS2105
