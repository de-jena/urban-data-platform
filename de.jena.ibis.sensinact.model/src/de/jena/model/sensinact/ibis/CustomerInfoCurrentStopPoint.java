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
package de.jena.model.sensinact.ibis;

import org.eclipse.sensinact.model.core.provider.Service;

import org.osgi.annotation.versioning.ProviderType;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Customer Info Current Stop Point</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.jena.model.sensinact.ibis.CustomerInfoCurrentStopPoint#getResource <em>Resource</em>}</li>
 * </ul>
 *
 * @see de.jena.model.sensinact.ibis.IbisSensinactPackage#getCustomerInfoCurrentStopPoint()
 * @model
 * @generated
 */
@ProviderType
public interface CustomerInfoCurrentStopPoint extends Service {
	/**
	 * Returns the value of the '<em><b>Resource</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Resource</em>' containment reference.
	 * @see #setResource(CustomerInfoCurrentStopPointData)
	 * @see de.jena.model.sensinact.ibis.IbisSensinactPackage#getCustomerInfoCurrentStopPoint_Resource()
	 * @model containment="true"
	 * @generated
	 */
	CustomerInfoCurrentStopPointData getResource();

	/**
	 * Sets the value of the '{@link de.jena.model.sensinact.ibis.CustomerInfoCurrentStopPoint#getResource <em>Resource</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Resource</em>' containment reference.
	 * @see #getResource()
	 * @generated
	 */
	void setResource(CustomerInfoCurrentStopPointData value);

} // CustomerInfoCurrentStopPoint
