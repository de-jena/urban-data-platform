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
 * A representation of the model object '<em><b>Kalyx Rain</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.jena.chirpstack.model.chirpstack.KalyxRain#getRainSum <em>Rain Sum</em>}</li>
 *   <li>{@link de.jena.chirpstack.model.chirpstack.KalyxRain#getCount <em>Count</em>}</li>
 * </ul>
 *
 * @see de.jena.chirpstack.model.chirpstack.ChirpstackPackage#getKalyxRain()
 * @model
 * @generated
 */
@ProviderType
public interface KalyxRain extends Service {
	/**
	 * Returns the value of the '<em><b>Rain Sum</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Rain Sum</em>' attribute.
	 * @see #setRainSum(double)
	 * @see de.jena.chirpstack.model.chirpstack.ChirpstackPackage#getKalyxRain_RainSum()
	 * @model annotation="mapping path='object/rain_sum_mm'"
	 * @generated
	 */
	double getRainSum();

	/**
	 * Sets the value of the '{@link de.jena.chirpstack.model.chirpstack.KalyxRain#getRainSum <em>Rain Sum</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Rain Sum</em>' attribute.
	 * @see #getRainSum()
	 * @generated
	 */
	void setRainSum(double value);

	/**
	 * Returns the value of the '<em><b>Count</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Count</em>' attribute.
	 * @see #setCount(double)
	 * @see de.jena.chirpstack.model.chirpstack.ChirpstackPackage#getKalyxRain_Count()
	 * @model annotation="mapping path='object/Count'"
	 * @generated
	 */
	double getCount();

	/**
	 * Sets the value of the '{@link de.jena.chirpstack.model.chirpstack.KalyxRain#getCount <em>Count</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Count</em>' attribute.
	 * @see #getCount()
	 * @generated
	 */
	void setCount(double value);

} // KalyxRain
