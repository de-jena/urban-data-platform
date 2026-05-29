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
 * A representation of the model object '<em><b>DDS45</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.jena.chirpstack.model.chirpstack.DDS45#getDistance <em>Distance</em>}</li>
 *   <li>{@link de.jena.chirpstack.model.chirpstack.DDS45#getStatus <em>Status</em>}</li>
 * </ul>
 *
 * @see de.jena.chirpstack.model.chirpstack.ChirpstackPackage#getDDS45()
 * @model annotation="model name='Dragino DDS45-LB' profileName='Dragino DDS45-LB' profileId='47cda612-0895-4c4a-828f-e3f509907eda'"
 * @generated
 */
@ProviderType
public interface DDS45 extends Provider {
	/**
	 * Returns the value of the '<em><b>Distance</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Distance</em>' containment reference.
	 * @see #setDistance(DDS45Distance)
	 * @see de.jena.chirpstack.model.chirpstack.ChirpstackPackage#getDDS45_Distance()
	 * @model containment="true"
	 * @generated
	 */
	DDS45Distance getDistance();

	/**
	 * Sets the value of the '{@link de.jena.chirpstack.model.chirpstack.DDS45#getDistance <em>Distance</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Distance</em>' containment reference.
	 * @see #getDistance()
	 * @generated
	 */
	void setDistance(DDS45Distance value);

	/**
	 * Returns the value of the '<em><b>Status</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Status</em>' containment reference.
	 * @see #setStatus(DDS45Status)
	 * @see de.jena.chirpstack.model.chirpstack.ChirpstackPackage#getDDS45_Status()
	 * @model containment="true"
	 * @generated
	 */
	DDS45Status getStatus();

	/**
	 * Sets the value of the '{@link de.jena.chirpstack.model.chirpstack.DDS45#getStatus <em>Status</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Status</em>' containment reference.
	 * @see #getStatus()
	 * @generated
	 */
	void setStatus(DDS45Status value);

} // DDS45
