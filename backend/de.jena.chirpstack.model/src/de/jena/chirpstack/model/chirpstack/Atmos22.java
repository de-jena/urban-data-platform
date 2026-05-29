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
 * A representation of the model object '<em><b>Atmos22</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.jena.chirpstack.model.chirpstack.Atmos22#getWind <em>Wind</em>}</li>
 *   <li>{@link de.jena.chirpstack.model.chirpstack.Atmos22#getStatus <em>Status</em>}</li>
 * </ul>
 *
 * @see de.jena.chirpstack.model.chirpstack.ChirpstackPackage#getAtmos22()
 * @model annotation="model name='Atmos-22' profileName='Atmos-22' profileId='33bc4671-bad3-461b-8804-8967a7f2434b'"
 * @generated
 */
@ProviderType
public interface Atmos22 extends Provider {
	/**
	 * Returns the value of the '<em><b>Wind</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Wind</em>' containment reference.
	 * @see #setWind(Wind)
	 * @see de.jena.chirpstack.model.chirpstack.ChirpstackPackage#getAtmos22_Wind()
	 * @model containment="true"
	 * @generated
	 */
	Wind getWind();

	/**
	 * Sets the value of the '{@link de.jena.chirpstack.model.chirpstack.Atmos22#getWind <em>Wind</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Wind</em>' containment reference.
	 * @see #getWind()
	 * @generated
	 */
	void setWind(Wind value);

	/**
	 * Returns the value of the '<em><b>Status</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Status</em>' containment reference.
	 * @see #setStatus(Atmos22Status)
	 * @see de.jena.chirpstack.model.chirpstack.ChirpstackPackage#getAtmos22_Status()
	 * @model containment="true"
	 * @generated
	 */
	Atmos22Status getStatus();

	/**
	 * Sets the value of the '{@link de.jena.chirpstack.model.chirpstack.Atmos22#getStatus <em>Status</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Status</em>' containment reference.
	 * @see #getStatus()
	 * @generated
	 */
	void setStatus(Atmos22Status value);

} // Atmos22
