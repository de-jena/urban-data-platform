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
package de.jena.model.ttn;

import org.eclipse.emf.ecore.EObject;

import org.osgi.annotation.versioning.ProviderType;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Application Id</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.jena.model.ttn.ApplicationId#getApplicationId <em>Application Id</em>}</li>
 * </ul>
 *
 * @see de.jena.model.ttn.TTNPackage#getApplicationId()
 * @model
 * @generated
 */
@ProviderType
public interface ApplicationId extends EObject {
	/**
	 * Returns the value of the '<em><b>Application Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Application Id</em>' attribute.
	 * @see #setApplicationId(String)
	 * @see de.jena.model.ttn.TTNPackage#getApplicationId_ApplicationId()
	 * @model extendedMetaData="name='application_id' kind='element'"
	 * @generated
	 */
	String getApplicationId();

	/**
	 * Sets the value of the '{@link de.jena.model.ttn.ApplicationId#getApplicationId <em>Application Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Application Id</em>' attribute.
	 * @see #getApplicationId()
	 * @generated
	 */
	void setApplicationId(String value);

} // ApplicationId
