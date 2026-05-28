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
 * A representation of the model object '<em><b>PMXTCR</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.jena.chirpstack.model.chirpstack.PMXTCR#getCounter <em>Counter</em>}</li>
 *   <li>{@link de.jena.chirpstack.model.chirpstack.PMXTCR#getStatus <em>Status</em>}</li>
 * </ul>
 *
 * @see de.jena.chirpstack.model.chirpstack.ChirpstackPackage#getPMXTCR()
 * @model annotation="model name='PMX_TCR' profileName='PMX TCR' profileId='3ad23c8d-1965-4535-8ef0-ab56ca502f03'"
 * @generated
 */
@ProviderType
public interface PMXTCR extends Provider {
	/**
	 * Returns the value of the '<em><b>Counter</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Counter</em>' containment reference.
	 * @see #setCounter(PMXCounter)
	 * @see de.jena.chirpstack.model.chirpstack.ChirpstackPackage#getPMXTCR_Counter()
	 * @model containment="true"
	 * @generated
	 */
	PMXCounter getCounter();

	/**
	 * Sets the value of the '{@link de.jena.chirpstack.model.chirpstack.PMXTCR#getCounter <em>Counter</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Counter</em>' containment reference.
	 * @see #getCounter()
	 * @generated
	 */
	void setCounter(PMXCounter value);

	/**
	 * Returns the value of the '<em><b>Status</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Status</em>' containment reference.
	 * @see #setStatus(PMXStatus)
	 * @see de.jena.chirpstack.model.chirpstack.ChirpstackPackage#getPMXTCR_Status()
	 * @model containment="true"
	 * @generated
	 */
	PMXStatus getStatus();

	/**
	 * Sets the value of the '{@link de.jena.chirpstack.model.chirpstack.PMXTCR#getStatus <em>Status</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Status</em>' containment reference.
	 * @see #getStatus()
	 * @generated
	 */
	void setStatus(PMXStatus value);

} // PMXTCR
