/*
 * Copyright (c) 2012 - 2024 Data In Motion and others.
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
package de.jena.ilsa.sensinact.model.ilsa;

import org.eclipse.sensinact.model.core.provider.Admin;

import org.osgi.annotation.versioning.ProviderType;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Thermal</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.jena.ilsa.sensinact.model.ilsa.Thermal#getTemperature <em>Temperature</em>}</li>
 * </ul>
 *
 * @see de.jena.ilsa.sensinact.model.ilsa.IlsaPackage#getThermal()
 * @model
 * @generated
 */
@ProviderType
public interface Thermal extends Admin {
	/**
	 * Returns the value of the '<em><b>Temperature</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Temperature</em>' attribute.
	 * @see #setTemperature(double)
	 * @see de.jena.ilsa.sensinact.model.ilsa.IlsaPackage#getThermal_Temperature()
	 * @model
	 * @generated
	 */
	double getTemperature();

	/**
	 * Sets the value of the '{@link de.jena.ilsa.sensinact.model.ilsa.Thermal#getTemperature <em>Temperature</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Temperature</em>' attribute.
	 * @see #getTemperature()
	 * @generated
	 */
	void setTemperature(double value);

} // Thermal
