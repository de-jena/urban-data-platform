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
 * A representation of the model object '<em><b>Sense Cap3</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.jena.chirpstack.moisture.model.moisture.SenseCap3#getAir <em>Air</em>}</li>
 *   <li>{@link de.jena.chirpstack.moisture.model.moisture.SenseCap3#getRain <em>Rain</em>}</li>
 *   <li>{@link de.jena.chirpstack.moisture.model.moisture.SenseCap3#getLight <em>Light</em>}</li>
 * </ul>
 *
 * @see de.jena.chirpstack.moisture.model.moisture.ChirpstackMoisturePackage#getSenseCap3()
 * @model annotation="model name='SenseCAP_Wetterstation_2_0'"
 * @generated
 */
@ProviderType
public interface SenseCap3 extends Provider {
	/**
	 * Returns the value of the '<em><b>Air</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Air</em>' containment reference.
	 * @see #setAir(Air)
	 * @see de.jena.chirpstack.moisture.model.moisture.ChirpstackMoisturePackage#getSenseCap3_Air()
	 * @model containment="true"
	 * @generated
	 */
	Air getAir();

	/**
	 * Sets the value of the '{@link de.jena.chirpstack.moisture.model.moisture.SenseCap3#getAir <em>Air</em>}' containment reference.
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
	 * @see de.jena.chirpstack.moisture.model.moisture.ChirpstackMoisturePackage#getSenseCap3_Rain()
	 * @model containment="true"
	 * @generated
	 */
	Rain getRain();

	/**
	 * Sets the value of the '{@link de.jena.chirpstack.moisture.model.moisture.SenseCap3#getRain <em>Rain</em>}' containment reference.
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
	 * @see de.jena.chirpstack.moisture.model.moisture.ChirpstackMoisturePackage#getSenseCap3_Light()
	 * @model containment="true"
	 * @generated
	 */
	Light getLight();

	/**
	 * Sets the value of the '{@link de.jena.chirpstack.moisture.model.moisture.SenseCap3#getLight <em>Light</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Light</em>' containment reference.
	 * @see #getLight()
	 * @generated
	 */
	void setLight(Light value);

} // SenseCap3
