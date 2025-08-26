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
 * A representation of the model object '<em><b>Light</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.jena.chirpstack.model.chirpstack.Light#getLightIntensity <em>Light Intensity</em>}</li>
 *   <li>{@link de.jena.chirpstack.model.chirpstack.Light#getUvIndex <em>Uv Index</em>}</li>
 * </ul>
 *
 * @see de.jena.chirpstack.model.chirpstack.ChirpstackPackage#getLight()
 * @model
 * @generated
 */
@ProviderType
public interface Light extends Service {
	/**
	 * Returns the value of the '<em><b>Light Intensity</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Light Intensity</em>' attribute.
	 * @see #setLightIntensity(double)
	 * @see de.jena.chirpstack.model.chirpstack.ChirpstackPackage#getLight_LightIntensity()
	 * @model annotation="mapping path='object/messages/0/2/measurementValue'"
	 * @generated
	 */
	double getLightIntensity();

	/**
	 * Sets the value of the '{@link de.jena.chirpstack.model.chirpstack.Light#getLightIntensity <em>Light Intensity</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Light Intensity</em>' attribute.
	 * @see #getLightIntensity()
	 * @generated
	 */
	void setLightIntensity(double value);

	/**
	 * Returns the value of the '<em><b>Uv Index</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Uv Index</em>' attribute.
	 * @see #setUvIndex(double)
	 * @see de.jena.chirpstack.model.chirpstack.ChirpstackPackage#getLight_UvIndex()
	 * @model annotation="mapping path='object/messages/0/3/measurementValue'"
	 * @generated
	 */
	double getUvIndex();

	/**
	 * Sets the value of the '{@link de.jena.chirpstack.model.chirpstack.Light#getUvIndex <em>Uv Index</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Uv Index</em>' attribute.
	 * @see #getUvIndex()
	 * @generated
	 */
	void setUvIndex(double value);

} // Light
