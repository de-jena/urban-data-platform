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
package de.jena.chirpstack.model.dummymoisture;

import org.eclipse.sensinact.model.core.provider.Admin;

import org.osgi.annotation.versioning.ProviderType;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Moisture Admin</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.jena.chirpstack.model.dummymoisture.MoistureAdmin#getSoilType <em>Soil Type</em>}</li>
 * </ul>
 *
 * @see de.jena.chirpstack.model.dummymoisture.DummyMoisturePackage#getMoistureAdmin()
 * @model
 * @generated
 */
@ProviderType
public interface MoistureAdmin extends Admin {
	/**
	 * Returns the value of the '<em><b>Soil Type</b></em>' attribute.
	 * The literals are from the enumeration {@link de.jena.chirpstack.model.dummymoisture.SoilType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Soil Type</em>' attribute.
	 * @see de.jena.chirpstack.model.dummymoisture.SoilType
	 * @see #setSoilType(SoilType)
	 * @see de.jena.chirpstack.model.dummymoisture.DummyMoisturePackage#getMoistureAdmin_SoilType()
	 * @model
	 * @generated
	 */
	SoilType getSoilType();

	/**
	 * Sets the value of the '{@link de.jena.chirpstack.model.dummymoisture.MoistureAdmin#getSoilType <em>Soil Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Soil Type</em>' attribute.
	 * @see de.jena.chirpstack.model.dummymoisture.SoilType
	 * @see #getSoilType()
	 * @generated
	 */
	void setSoilType(SoilType value);

} // MoistureAdmin
