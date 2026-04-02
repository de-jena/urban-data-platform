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

import java.math.BigInteger;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

import org.osgi.annotation.versioning.ProviderType;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>validation Job Created</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.jena.bike.validationJobCreated#getId <em>Id</em>}</li>
 *   <li>{@link de.jena.bike.validationJobCreated#getStatus <em>Status</em>}</li>
 *   <li>{@link de.jena.bike.validationJobCreated#getSiteIds <em>Site Ids</em>}</li>
 *   <li>{@link de.jena.bike.validationJobCreated#getStartDate <em>Start Date</em>}</li>
 *   <li>{@link de.jena.bike.validationJobCreated#getEndDate <em>End Date</em>}</li>
 * </ul>
 *
 * @see de.jena.bike.BikePackage#getvalidationJobCreated()
 * @model
 * @generated
 */
@ProviderType
public interface validationJobCreated extends EObject {
	/**
	 * Returns the value of the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Id</em>' attribute.
	 * @see #setId(BigInteger)
	 * @see de.jena.bike.BikePackage#getvalidationJobCreated_Id()
	 * @model unique="false"
	 * @generated
	 */
	BigInteger getId();

	/**
	 * Sets the value of the '{@link de.jena.bike.validationJobCreated#getId <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Id</em>' attribute.
	 * @see #getId()
	 * @generated
	 */
	void setId(BigInteger value);

	/**
	 * Returns the value of the '<em><b>Status</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Status</em>' containment reference.
	 * @see #setStatus(validationJobCreated_status)
	 * @see de.jena.bike.BikePackage#getvalidationJobCreated_Status()
	 * @model containment="true"
	 * @generated
	 */
	validationJobCreated_status getStatus();

	/**
	 * Sets the value of the '{@link de.jena.bike.validationJobCreated#getStatus <em>Status</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Status</em>' containment reference.
	 * @see #getStatus()
	 * @generated
	 */
	void setStatus(validationJobCreated_status value);

	/**
	 * Returns the value of the '<em><b>Site Ids</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.Integer}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Site Ids</em>' attribute list.
	 * @see de.jena.bike.BikePackage#getvalidationJobCreated_SiteIds()
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
	 * @see de.jena.bike.BikePackage#getvalidationJobCreated_StartDate()
	 * @model unique="false"
	 * @generated
	 */
	String getStartDate();

	/**
	 * Sets the value of the '{@link de.jena.bike.validationJobCreated#getStartDate <em>Start Date</em>}' attribute.
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
	 * @see de.jena.bike.BikePackage#getvalidationJobCreated_EndDate()
	 * @model unique="false"
	 * @generated
	 */
	String getEndDate();

	/**
	 * Sets the value of the '{@link de.jena.bike.validationJobCreated#getEndDate <em>End Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>End Date</em>' attribute.
	 * @see #getEndDate()
	 * @generated
	 */
	void setEndDate(String value);

} // validationJobCreated
