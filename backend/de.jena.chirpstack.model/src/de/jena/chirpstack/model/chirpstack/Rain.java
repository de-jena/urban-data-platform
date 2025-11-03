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
 * A representation of the model object '<em><b>Rain</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.jena.chirpstack.model.chirpstack.Rain#getRainGauge <em>Rain Gauge</em>}</li>
 *   <li>{@link de.jena.chirpstack.model.chirpstack.Rain#getRainAccumulation <em>Rain Accumulation</em>}</li>
 * </ul>
 *
 * @see de.jena.chirpstack.model.chirpstack.ChirpstackPackage#getRain()
 * @model
 * @generated
 */
@ProviderType
public interface Rain extends Service {
	/**
	 * Returns the value of the '<em><b>Rain Gauge</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Rain Gauge</em>' attribute.
	 * @see #setRainGauge(double)
	 * @see de.jena.chirpstack.model.chirpstack.ChirpstackPackage#getRain_RainGauge()
	 * @model annotation="mapping path='object/messages/1/1/measurementValue'"
	 * @generated
	 */
	double getRainGauge();

	/**
	 * Sets the value of the '{@link de.jena.chirpstack.model.chirpstack.Rain#getRainGauge <em>Rain Gauge</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Rain Gauge</em>' attribute.
	 * @see #getRainGauge()
	 * @generated
	 */
	void setRainGauge(double value);

	/**
	 * Returns the value of the '<em><b>Rain Accumulation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Rain Accumulation</em>' attribute.
	 * @see #setRainAccumulation(double)
	 * @see de.jena.chirpstack.model.chirpstack.ChirpstackPackage#getRain_RainAccumulation()
	 * @model annotation="mapping path='object/messages/2/1/measurementValue'"
	 * @generated
	 */
	double getRainAccumulation();

	/**
	 * Sets the value of the '{@link de.jena.chirpstack.model.chirpstack.Rain#getRainAccumulation <em>Rain Accumulation</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Rain Accumulation</em>' attribute.
	 * @see #getRainAccumulation()
	 * @generated
	 */
	void setRainAccumulation(double value);

} // Rain
