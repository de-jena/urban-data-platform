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
package de.jena.chirpstack.moisture.model.moisture;

import org.eclipse.sensinact.model.core.provider.Provider;

import org.osgi.annotation.versioning.ProviderType;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>TEKTELIC</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.jena.chirpstack.moisture.model.moisture.TEKTELIC#getSoil <em>Soil</em>}</li>
 * </ul>
 *
 * @see de.jena.chirpstack.moisture.model.moisture.ChirpstackMoisturePackage#getTEKTELIC()
 * @model annotation="model name='TEKTELIC_KIWI_Agriculture_Sensor' profileName='TEKTELIC KIWI Agriculture Sensor' profileId='93f37439-1425-4a5f-a7e7-7eb4b75f1936'"
 * @generated
 */
@ProviderType
public interface TEKTELIC extends Provider {
	/**
	 * Returns the value of the '<em><b>Soil</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Soil</em>' containment reference.
	 * @see #setSoil(TSoil)
	 * @see de.jena.chirpstack.moisture.model.moisture.ChirpstackMoisturePackage#getTEKTELIC_Soil()
	 * @model containment="true"
	 * @generated
	 */
	TSoil getSoil();

	/**
	 * Sets the value of the '{@link de.jena.chirpstack.moisture.model.moisture.TEKTELIC#getSoil <em>Soil</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Soil</em>' containment reference.
	 * @see #getSoil()
	 * @generated
	 */
	void setSoil(TSoil value);

} // TEKTELIC
