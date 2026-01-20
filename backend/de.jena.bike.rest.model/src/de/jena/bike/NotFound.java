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
package de.jena.bike;

import org.eclipse.emf.ecore.EObject;

import org.osgi.annotation.versioning.ProviderType;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Not Found</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.jena.bike.NotFound#getStatus <em>Status</em>}</li>
 *   <li>{@link de.jena.bike.NotFound#getCode <em>Code</em>}</li>
 *   <li>{@link de.jena.bike.NotFound#getMessage <em>Message</em>}</li>
 * </ul>
 *
 * @see de.jena.bike.BikePackage#getNotFound()
 * @model
 * @generated
 */
@ProviderType
public interface NotFound extends EObject {
	/**
	 * Returns the value of the '<em><b>Status</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Status</em>' attribute.
	 * @see #setStatus(Float)
	 * @see de.jena.bike.BikePackage#getNotFound_Status()
	 * @model unique="false"
	 * @generated
	 */
	Float getStatus();

	/**
	 * Sets the value of the '{@link de.jena.bike.NotFound#getStatus <em>Status</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Status</em>' attribute.
	 * @see #getStatus()
	 * @generated
	 */
	void setStatus(Float value);

	/**
	 * Returns the value of the '<em><b>Code</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Code</em>' attribute.
	 * @see #setCode(String)
	 * @see de.jena.bike.BikePackage#getNotFound_Code()
	 * @model unique="false"
	 * @generated
	 */
	String getCode();

	/**
	 * Sets the value of the '{@link de.jena.bike.NotFound#getCode <em>Code</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Code</em>' attribute.
	 * @see #getCode()
	 * @generated
	 */
	void setCode(String value);

	/**
	 * Returns the value of the '<em><b>Message</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Message</em>' attribute.
	 * @see #setMessage(String)
	 * @see de.jena.bike.BikePackage#getNotFound_Message()
	 * @model unique="false"
	 * @generated
	 */
	String getMessage();

	/**
	 * Sets the value of the '{@link de.jena.bike.NotFound#getMessage <em>Message</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Message</em>' attribute.
	 * @see #getMessage()
	 * @generated
	 */
	void setMessage(String value);

} // NotFound
