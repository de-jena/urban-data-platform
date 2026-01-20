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
 * A representation of the model object '<em><b>Export</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.jena.bike.Export#getId <em>Id</em>}</li>
 *   <li>{@link de.jena.bike.Export#getStatus <em>Status</em>}</li>
 *   <li>{@link de.jena.bike.Export#getUrl <em>Url</em>}</li>
 *   <li>{@link de.jena.bike.Export#getErrorMessage <em>Error Message</em>}</li>
 *   <li>{@link de.jena.bike.Export#getEndProcessingDateTime <em>End Processing Date Time</em>}</li>
 * </ul>
 *
 * @see de.jena.bike.BikePackage#getExport()
 * @model
 * @generated
 */
@ProviderType
public interface Export extends EObject {
	/**
	 * Returns the value of the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Id</em>' attribute.
	 * @see #setId(Integer)
	 * @see de.jena.bike.BikePackage#getExport_Id()
	 * @model unique="false"
	 * @generated
	 */
	Integer getId();

	/**
	 * Sets the value of the '{@link de.jena.bike.Export#getId <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Id</em>' attribute.
	 * @see #getId()
	 * @generated
	 */
	void setId(Integer value);

	/**
	 * Returns the value of the '<em><b>Status</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Status</em>' attribute.
	 * @see #setStatus(String)
	 * @see de.jena.bike.BikePackage#getExport_Status()
	 * @model unique="false"
	 * @generated
	 */
	String getStatus();

	/**
	 * Sets the value of the '{@link de.jena.bike.Export#getStatus <em>Status</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Status</em>' attribute.
	 * @see #getStatus()
	 * @generated
	 */
	void setStatus(String value);

	/**
	 * Returns the value of the '<em><b>Url</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Url</em>' attribute.
	 * @see #setUrl(String)
	 * @see de.jena.bike.BikePackage#getExport_Url()
	 * @model unique="false"
	 * @generated
	 */
	String getUrl();

	/**
	 * Sets the value of the '{@link de.jena.bike.Export#getUrl <em>Url</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Url</em>' attribute.
	 * @see #getUrl()
	 * @generated
	 */
	void setUrl(String value);

	/**
	 * Returns the value of the '<em><b>Error Message</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Error Message</em>' attribute.
	 * @see #setErrorMessage(String)
	 * @see de.jena.bike.BikePackage#getExport_ErrorMessage()
	 * @model unique="false"
	 * @generated
	 */
	String getErrorMessage();

	/**
	 * Sets the value of the '{@link de.jena.bike.Export#getErrorMessage <em>Error Message</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Error Message</em>' attribute.
	 * @see #getErrorMessage()
	 * @generated
	 */
	void setErrorMessage(String value);

	/**
	 * Returns the value of the '<em><b>End Processing Date Time</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>End Processing Date Time</em>' attribute.
	 * @see #setEndProcessingDateTime(String)
	 * @see de.jena.bike.BikePackage#getExport_EndProcessingDateTime()
	 * @model unique="false"
	 * @generated
	 */
	String getEndProcessingDateTime();

	/**
	 * Sets the value of the '{@link de.jena.bike.Export#getEndProcessingDateTime <em>End Processing Date Time</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>End Processing Date Time</em>' attribute.
	 * @see #getEndProcessingDateTime()
	 * @generated
	 */
	void setEndProcessingDateTime(String value);

} // Export
