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

import org.eclipse.sensinact.model.core.provider.Service;

import org.osgi.annotation.versioning.ProviderType;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>SE212 Light</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.jena.chirpstack.model.chirpstack.SE212Light#getLux <em>Lux</em>}</li>
 * </ul>
 *
 * @see de.jena.chirpstack.model.chirpstack.ChirpstackPackage#getSE212Light()
 * @model
 * @generated
 */
@ProviderType
public interface SE212Light extends Service {
	/**
	 * Returns the value of the '<em><b>Lux</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Lux</em>' attribute.
	 * @see #setLux(double)
	 * @see de.jena.chirpstack.model.chirpstack.ChirpstackPackage#getSE212Light_Lux()
	 * @model annotation="mapping path='object/sensor_0_lux'"
	 * @generated
	 */
	double getLux();

	/**
	 * Sets the value of the '{@link de.jena.chirpstack.model.chirpstack.SE212Light#getLux <em>Lux</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Lux</em>' attribute.
	 * @see #getLux()
	 * @generated
	 */
	void setLux(double value);

} // SE212Light
