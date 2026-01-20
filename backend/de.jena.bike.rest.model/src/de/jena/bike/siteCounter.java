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
 * A representation of the model object '<em><b>site Counter</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.jena.bike.siteCounter#getId <em>Id</em>}</li>
 *   <li>{@link de.jena.bike.siteCounter#getSerial <em>Serial</em>}</li>
 *   <li>{@link de.jena.bike.siteCounter#getInstallationDate <em>Installation Date</em>}</li>
 *   <li>{@link de.jena.bike.siteCounter#getDetachmentDate <em>Detachment Date</em>}</li>
 * </ul>
 *
 * @see de.jena.bike.BikePackage#getsiteCounter()
 * @model
 * @generated
 */
@ProviderType
public interface siteCounter extends EObject {
	/**
	 * Returns the value of the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Id</em>' attribute.
	 * @see #setId(Integer)
	 * @see de.jena.bike.BikePackage#getsiteCounter_Id()
	 * @model unique="false"
	 * @generated
	 */
	Integer getId();

	/**
	 * Sets the value of the '{@link de.jena.bike.siteCounter#getId <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Id</em>' attribute.
	 * @see #getId()
	 * @generated
	 */
	void setId(Integer value);

	/**
	 * Returns the value of the '<em><b>Serial</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Serial</em>' attribute.
	 * @see #setSerial(String)
	 * @see de.jena.bike.BikePackage#getsiteCounter_Serial()
	 * @model unique="false"
	 * @generated
	 */
	String getSerial();

	/**
	 * Sets the value of the '{@link de.jena.bike.siteCounter#getSerial <em>Serial</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Serial</em>' attribute.
	 * @see #getSerial()
	 * @generated
	 */
	void setSerial(String value);

	/**
	 * Returns the value of the '<em><b>Installation Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Installation Date</em>' attribute.
	 * @see #setInstallationDate(String)
	 * @see de.jena.bike.BikePackage#getsiteCounter_InstallationDate()
	 * @model unique="false"
	 * @generated
	 */
	String getInstallationDate();

	/**
	 * Sets the value of the '{@link de.jena.bike.siteCounter#getInstallationDate <em>Installation Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Installation Date</em>' attribute.
	 * @see #getInstallationDate()
	 * @generated
	 */
	void setInstallationDate(String value);

	/**
	 * Returns the value of the '<em><b>Detachment Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Detachment Date</em>' attribute.
	 * @see #setDetachmentDate(String)
	 * @see de.jena.bike.BikePackage#getsiteCounter_DetachmentDate()
	 * @model unique="false"
	 * @generated
	 */
	String getDetachmentDate();

	/**
	 * Sets the value of the '{@link de.jena.bike.siteCounter#getDetachmentDate <em>Detachment Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Detachment Date</em>' attribute.
	 * @see #getDetachmentDate()
	 * @generated
	 */
	void setDetachmentDate(String value);

} // siteCounter
