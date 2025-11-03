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
 * A representation of the model object '<em><b>Solidos Teros21</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.jena.chirpstack.model.chirpstack.SolidosTeros21#getSensor <em>Sensor</em>}</li>
 * </ul>
 *
 * @see de.jena.chirpstack.model.chirpstack.ChirpstackPackage#getSolidosTeros21()
 * @model annotation="model name='Solidos_Teros21' profileName='Solidos Teros21' profileId='7022e9ce-7673-4d0c-b3d1-ed51afc3fe27'"
 * @generated
 */
@ProviderType
public interface SolidosTeros21 extends Provider {
	/**
	 * Returns the value of the '<em><b>Sensor</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Sensor</em>' containment reference.
	 * @see #setSensor(Teros21)
	 * @see de.jena.chirpstack.model.chirpstack.ChirpstackPackage#getSolidosTeros21_Sensor()
	 * @model containment="true"
	 * @generated
	 */
	Teros21 getSensor();

	/**
	 * Sets the value of the '{@link de.jena.chirpstack.model.chirpstack.SolidosTeros21#getSensor <em>Sensor</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Sensor</em>' containment reference.
	 * @see #getSensor()
	 * @generated
	 */
	void setSensor(Teros21 value);

} // SolidosTeros21
