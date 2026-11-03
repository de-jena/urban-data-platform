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
 * A representation of the model object '<em><b>Atmos14</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.jena.chirpstack.model.chirpstack.Atmos14#getAtmosphere <em>Atmosphere</em>}</li>
 *   <li>{@link de.jena.chirpstack.model.chirpstack.Atmos14#getStatus <em>Status</em>}</li>
 * </ul>
 *
 * @see de.jena.chirpstack.model.chirpstack.ChirpstackPackage#getAtmos14()
 * @model annotation="model name='Atmos-14' profileName='Atmos-14' profileId='6c6b6dd0-a12c-45f1-ac18-621c12fa2f08'"
 * @generated
 */
@ProviderType
public interface Atmos14 extends Provider {
	/**
	 * Returns the value of the '<em><b>Atmosphere</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Atmosphere</em>' containment reference.
	 * @see #setAtmosphere(Atmosphere)
	 * @see de.jena.chirpstack.model.chirpstack.ChirpstackPackage#getAtmos14_Atmosphere()
	 * @model containment="true"
	 * @generated
	 */
	Atmosphere getAtmosphere();

	/**
	 * Sets the value of the '{@link de.jena.chirpstack.model.chirpstack.Atmos14#getAtmosphere <em>Atmosphere</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Atmosphere</em>' containment reference.
	 * @see #getAtmosphere()
	 * @generated
	 */
	void setAtmosphere(Atmosphere value);

	/**
	 * Returns the value of the '<em><b>Status</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Status</em>' containment reference.
	 * @see #setStatus(AtmosStatus)
	 * @see de.jena.chirpstack.model.chirpstack.ChirpstackPackage#getAtmos14_Status()
	 * @model containment="true"
	 * @generated
	 */
	AtmosStatus getStatus();

	/**
	 * Sets the value of the '{@link de.jena.chirpstack.model.chirpstack.Atmos14#getStatus <em>Status</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Status</em>' containment reference.
	 * @see #getStatus()
	 * @generated
	 */
	void setStatus(AtmosStatus value);

} // Atmos14
