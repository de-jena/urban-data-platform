/*
 * Copyright (c) 2012 - 2024 Data In Motion and others.
 * All rights reserved. 
 *
 * This program and the accompanying materials are made
 * available under the terms of the Eclipse Public License 2.0
 * which is available at https://www.eclipse.org/legal/epl-2.0/
 * SPDX-License-Identifier: EPL-2.0
 *
 * Contributors:
 *     Data In Motion - initial API and implementation
 */

package de.jena.ilsa.sensinact.model.ilsa;

import org.eclipse.sensinact.model.core.provider.DynamicProvider;

import org.osgi.annotation.versioning.ProviderType;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Ilsa</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.jena.ilsa.sensinact.model.ilsa.Ilsa#getThermal <em>Thermal</em>}</li>
 * </ul>
 *
 * @see de.jena.ilsa.sensinact.model.ilsa.IlsaPackage#getIlsa()
 * @model
 * @generated
 */
@ProviderType
public interface Ilsa extends DynamicProvider {
	/**
	 * Returns the value of the '<em><b>Thermal</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Thermal</em>' reference.
	 * @see #setThermal(Thermal)
	 * @see de.jena.ilsa.sensinact.model.ilsa.IlsaPackage#getIlsa_Thermal()
	 * @model
	 * @generated
	 */
	Thermal getThermal();

	/**
	 * Sets the value of the '{@link de.jena.ilsa.sensinact.model.ilsa.Ilsa#getThermal <em>Thermal</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Thermal</em>' reference.
	 * @see #getThermal()
	 * @generated
	 */
	void setThermal(Thermal value);

} // Ilsa
