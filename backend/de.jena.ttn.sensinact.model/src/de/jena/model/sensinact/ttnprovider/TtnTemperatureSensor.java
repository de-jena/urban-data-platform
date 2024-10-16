/*
 * Copyright (c) 2022 Contributors to the Eclipse Foundation.
 * 
 * This program and the accompanying materials are made
 * available under the terms of the Eclipse Public License 2.0
 * which is available at https://www.eclipse.org/legal/epl-2.0/
 * 
 * SPDX-License-Identifier: EPL-2.0
 * 
 * Contributors:
 *   Data In Motion - initial API and implementation 
 */
package de.jena.model.sensinact.ttnprovider;

import org.osgi.annotation.versioning.ProviderType;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Ttn Temperature Sensor</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.jena.model.sensinact.ttnprovider.TtnTemperatureSensor#getData <em>Data</em>}</li>
 * </ul>
 *
 * @see de.jena.model.sensinact.ttnprovider.TtnSensorSensinactPackage#getTtnTemperatureSensor()
 * @model
 * @generated
 */
@ProviderType
public interface TtnTemperatureSensor extends AbstractTtnProvider {
	/**
	 * Returns the value of the '<em><b>Data</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Data</em>' containment reference.
	 * @see #setData(TemperaturData)
	 * @see de.jena.model.sensinact.ttnprovider.TtnSensorSensinactPackage#getTtnTemperatureSensor_Data()
	 * @model containment="true"
	 * @generated
	 */
	TemperaturData getData();

	/**
	 * Sets the value of the '{@link de.jena.model.sensinact.ttnprovider.TtnTemperatureSensor#getData <em>Data</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Data</em>' containment reference.
	 * @see #getData()
	 * @generated
	 */
	void setData(TemperaturData value);

} // TtnTemperatureSensor
