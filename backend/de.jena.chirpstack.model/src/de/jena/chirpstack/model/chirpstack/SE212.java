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
 * A representation of the model object '<em><b>SE212</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.jena.chirpstack.model.chirpstack.SE212#getLight <em>Light</em>}</li>
 *   <li>{@link de.jena.chirpstack.model.chirpstack.SE212#getStatus <em>Status</em>}</li>
 * </ul>
 *
 * @see de.jena.chirpstack.model.chirpstack.ChirpstackPackage#getSE212()
 * @model annotation="model name='SE-212' profileName='SE-212' profileId='f5b5ae47-348e-4dc2-a59d-34c61f74a86a'"
 * @generated
 */
@ProviderType
public interface SE212 extends Provider {
	/**
	 * Returns the value of the '<em><b>Light</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Light</em>' containment reference.
	 * @see #setLight(SE212Light)
	 * @see de.jena.chirpstack.model.chirpstack.ChirpstackPackage#getSE212_Light()
	 * @model containment="true"
	 * @generated
	 */
	SE212Light getLight();

	/**
	 * Sets the value of the '{@link de.jena.chirpstack.model.chirpstack.SE212#getLight <em>Light</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Light</em>' containment reference.
	 * @see #getLight()
	 * @generated
	 */
	void setLight(SE212Light value);

	/**
	 * Returns the value of the '<em><b>Status</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Status</em>' containment reference.
	 * @see #setStatus(SE212Status)
	 * @see de.jena.chirpstack.model.chirpstack.ChirpstackPackage#getSE212_Status()
	 * @model containment="true"
	 * @generated
	 */
	SE212Status getStatus();

	/**
	 * Sets the value of the '{@link de.jena.chirpstack.model.chirpstack.SE212#getStatus <em>Status</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Status</em>' containment reference.
	 * @see #getStatus()
	 * @generated
	 */
	void setStatus(SE212Status value);

} // SE212
