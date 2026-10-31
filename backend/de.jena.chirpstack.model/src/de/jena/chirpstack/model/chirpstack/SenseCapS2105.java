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
 *   <li>{@link de.jena.chirpstack.model.chirpstack.SenseCapS2105#getSoil <em>Soil</em>}</li>
 * </ul>
 *
 * @see de.jena.chirpstack.model.chirpstack.ChirpstackPackage#getSenseCapS2105()
 * @model annotation="model name='SenseCAP_S2105-LoRaWAN_Soil_Moisture_Temperature_and_EC_Sensor' profileName='SenseCAP S2105-LoRaWAN\256 Soil Moisture, Temperature and EC Sensor' profileId='f74bb315-56ca-48c0-82f8-f7b837f4d917'"
 * @generated
 */
@ProviderType
public interface SenseCapS2105 extends Provider {
	/**
	 * Returns the value of the '<em><b>Soil</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Soil</em>' containment reference.
	 * @see #setSoil(SenseCapSoil)
	 * @see de.jena.chirpstack.model.chirpstack.ChirpstackPackage#getSenseCapS2105_Soil()
	 * @model containment="true"
	 * @generated
	 */
	SenseCapSoil getSoil();

	/**
	 * Sets the value of the '{@link de.jena.chirpstack.model.chirpstack.SenseCapS2105#getSoil <em>Soil</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Soil</em>' containment reference.
	 * @see #getSoil()
	 * @generated
	 */
	void setSoil(SenseCapSoil value);

} // SenseCapS2105
