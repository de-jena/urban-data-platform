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
 * A representation of the model object '<em><b>Io Traffic</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.jena.chirpstack.model.chirpstack.IoTraffic#getCounter <em>Counter</em>}</li>
 *   <li>{@link de.jena.chirpstack.model.chirpstack.IoTraffic#getStatus <em>Status</em>}</li>
 * </ul>
 *
 * @see de.jena.chirpstack.model.chirpstack.ChirpstackPackage#getIoTraffic()
 * @model annotation="model name='iotec_iotraffic_Camera' profileName='iotec iotraffic Camera' profileId='ef645c43-546c-4594-a0e5-9e0852faf29b'"
 * @generated
 */
@ProviderType
public interface IoTraffic extends Provider {
	/**
	 * Returns the value of the '<em><b>Counter</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Counter</em>' containment reference.
	 * @see #setCounter(IoTrafficCounter)
	 * @see de.jena.chirpstack.model.chirpstack.ChirpstackPackage#getIoTraffic_Counter()
	 * @model containment="true"
	 * @generated
	 */
	IoTrafficCounter getCounter();

	/**
	 * Sets the value of the '{@link de.jena.chirpstack.model.chirpstack.IoTraffic#getCounter <em>Counter</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Counter</em>' containment reference.
	 * @see #getCounter()
	 * @generated
	 */
	void setCounter(IoTrafficCounter value);

	/**
	 * Returns the value of the '<em><b>Status</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Status</em>' containment reference.
	 * @see #setStatus(IoTrafficStatus)
	 * @see de.jena.chirpstack.model.chirpstack.ChirpstackPackage#getIoTraffic_Status()
	 * @model containment="true"
	 * @generated
	 */
	IoTrafficStatus getStatus();

	/**
	 * Sets the value of the '{@link de.jena.chirpstack.model.chirpstack.IoTraffic#getStatus <em>Status</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Status</em>' containment reference.
	 * @see #getStatus()
	 * @generated
	 */
	void setStatus(IoTrafficStatus value);

} // IoTraffic
