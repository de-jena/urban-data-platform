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

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

import org.osgi.annotation.versioning.ProviderType;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Validation Job Create request</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.jena.bike.ValidationJobCreate_request#getSiteIds <em>Site Ids</em>}</li>
 *   <li>{@link de.jena.bike.ValidationJobCreate_request#getStartDate <em>Start Date</em>}</li>
 *   <li>{@link de.jena.bike.ValidationJobCreate_request#getEndDate <em>End Date</em>}</li>
 * </ul>
 *
 * @see de.jena.bike.BikePackage#getValidationJobCreate_request()
 * @model
 * @generated
 */
@ProviderType
public interface ValidationJobCreate_request extends EObject {
	/**
	 * Returns the value of the '<em><b>Site Ids</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.Integer}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Site Ids</em>' attribute list.
	 * @see de.jena.bike.BikePackage#getValidationJobCreate_request_SiteIds()
	 * @model unique="false"
	 * @generated
	 */
	EList<Integer> getSiteIds();

	/**
	 * Returns the value of the '<em><b>Start Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Start Date</em>' attribute.
	 * @see #setStartDate(String)
	 * @see de.jena.bike.BikePackage#getValidationJobCreate_request_StartDate()
	 * @model unique="false"
	 * @generated
	 */
	String getStartDate();

	/**
	 * Sets the value of the '{@link de.jena.bike.ValidationJobCreate_request#getStartDate <em>Start Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Start Date</em>' attribute.
	 * @see #getStartDate()
	 * @generated
	 */
	void setStartDate(String value);

	/**
	 * Returns the value of the '<em><b>End Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>End Date</em>' attribute.
	 * @see #setEndDate(String)
	 * @see de.jena.bike.BikePackage#getValidationJobCreate_request_EndDate()
	 * @model unique="false"
	 * @generated
	 */
	String getEndDate();

	/**
	 * Sets the value of the '{@link de.jena.bike.ValidationJobCreate_request#getEndDate <em>End Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>End Date</em>' attribute.
	 * @see #getEndDate()
	 * @generated
	 */
	void setEndDate(String value);

} // ValidationJobCreate_request
