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
 * A representation of the model object '<em><b>Kalyx</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.jena.chirpstack.model.chirpstack.Kalyx#getRain <em>Rain</em>}</li>
 *   <li>{@link de.jena.chirpstack.model.chirpstack.Kalyx#getStatus <em>Status</em>}</li>
 * </ul>
 *
 * @see de.jena.chirpstack.model.chirpstack.ChirpstackPackage#getKalyx()
 * @model annotation="model name='Kalyx' profileName='Kalyx' profileId='89daf367-01ce-4b57-8554-2508558a05db'"
 * @generated
 */
@ProviderType
public interface Kalyx extends Provider {
	/**
	 * Returns the value of the '<em><b>Rain</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Rain</em>' containment reference.
	 * @see #setRain(KalyxRain)
	 * @see de.jena.chirpstack.model.chirpstack.ChirpstackPackage#getKalyx_Rain()
	 * @model containment="true"
	 * @generated
	 */
	KalyxRain getRain();

	/**
	 * Sets the value of the '{@link de.jena.chirpstack.model.chirpstack.Kalyx#getRain <em>Rain</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Rain</em>' containment reference.
	 * @see #getRain()
	 * @generated
	 */
	void setRain(KalyxRain value);

	/**
	 * Returns the value of the '<em><b>Status</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Status</em>' containment reference.
	 * @see #setStatus(KalyxStatus)
	 * @see de.jena.chirpstack.model.chirpstack.ChirpstackPackage#getKalyx_Status()
	 * @model containment="true"
	 * @generated
	 */
	KalyxStatus getStatus();

	/**
	 * Sets the value of the '{@link de.jena.chirpstack.model.chirpstack.Kalyx#getStatus <em>Status</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Status</em>' containment reference.
	 * @see #getStatus()
	 * @generated
	 */
	void setStatus(KalyxStatus value);

} // Kalyx
