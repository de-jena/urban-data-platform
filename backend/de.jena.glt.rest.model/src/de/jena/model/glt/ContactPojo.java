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
package de.jena.model.glt;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

import org.osgi.annotation.versioning.ProviderType;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Contact Pojo</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.jena.model.glt.ContactPojo#getName <em>Name</em>}</li>
 *   <li>{@link de.jena.model.glt.ContactPojo#getTask <em>Task</em>}</li>
 *   <li>{@link de.jena.model.glt.ContactPojo#getAdditional <em>Additional</em>}</li>
 *   <li>{@link de.jena.model.glt.ContactPojo#getFirstName <em>First Name</em>}</li>
 *   <li>{@link de.jena.model.glt.ContactPojo#getLastName <em>Last Name</em>}</li>
 *   <li>{@link de.jena.model.glt.ContactPojo#getSalutation <em>Salutation</em>}</li>
 *   <li>{@link de.jena.model.glt.ContactPojo#getShortName <em>Short Name</em>}</li>
 *   <li>{@link de.jena.model.glt.ContactPojo#getTitle <em>Title</em>}</li>
 *   <li>{@link de.jena.model.glt.ContactPojo#getAddress <em>Address</em>}</li>
 *   <li>{@link de.jena.model.glt.ContactPojo#getPhones <em>Phones</em>}</li>
 *   <li>{@link de.jena.model.glt.ContactPojo#getEmails <em>Emails</em>}</li>
 *   <li>{@link de.jena.model.glt.ContactPojo#getComments <em>Comments</em>}</li>
 * </ul>
 *
 * @see de.jena.model.glt.GltPackage#getContactPojo()
 * @model
 * @generated
 */
@ProviderType
public interface ContactPojo extends EObject {
	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see de.jena.model.glt.GltPackage#getContactPojo_Name()
	 * @model unique="false"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link de.jena.model.glt.ContactPojo#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Task</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Task</em>' attribute.
	 * @see #setTask(String)
	 * @see de.jena.model.glt.GltPackage#getContactPojo_Task()
	 * @model unique="false"
	 * @generated
	 */
	String getTask();

	/**
	 * Sets the value of the '{@link de.jena.model.glt.ContactPojo#getTask <em>Task</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Task</em>' attribute.
	 * @see #getTask()
	 * @generated
	 */
	void setTask(String value);

	/**
	 * Returns the value of the '<em><b>Additional</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Additional</em>' attribute.
	 * @see #setAdditional(String)
	 * @see de.jena.model.glt.GltPackage#getContactPojo_Additional()
	 * @model unique="false"
	 * @generated
	 */
	String getAdditional();

	/**
	 * Sets the value of the '{@link de.jena.model.glt.ContactPojo#getAdditional <em>Additional</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Additional</em>' attribute.
	 * @see #getAdditional()
	 * @generated
	 */
	void setAdditional(String value);

	/**
	 * Returns the value of the '<em><b>First Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>First Name</em>' attribute.
	 * @see #setFirstName(String)
	 * @see de.jena.model.glt.GltPackage#getContactPojo_FirstName()
	 * @model unique="false"
	 * @generated
	 */
	String getFirstName();

	/**
	 * Sets the value of the '{@link de.jena.model.glt.ContactPojo#getFirstName <em>First Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>First Name</em>' attribute.
	 * @see #getFirstName()
	 * @generated
	 */
	void setFirstName(String value);

	/**
	 * Returns the value of the '<em><b>Last Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Last Name</em>' attribute.
	 * @see #setLastName(String)
	 * @see de.jena.model.glt.GltPackage#getContactPojo_LastName()
	 * @model unique="false"
	 * @generated
	 */
	String getLastName();

	/**
	 * Sets the value of the '{@link de.jena.model.glt.ContactPojo#getLastName <em>Last Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Last Name</em>' attribute.
	 * @see #getLastName()
	 * @generated
	 */
	void setLastName(String value);

	/**
	 * Returns the value of the '<em><b>Salutation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Salutation</em>' attribute.
	 * @see #setSalutation(String)
	 * @see de.jena.model.glt.GltPackage#getContactPojo_Salutation()
	 * @model unique="false"
	 * @generated
	 */
	String getSalutation();

	/**
	 * Sets the value of the '{@link de.jena.model.glt.ContactPojo#getSalutation <em>Salutation</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Salutation</em>' attribute.
	 * @see #getSalutation()
	 * @generated
	 */
	void setSalutation(String value);

	/**
	 * Returns the value of the '<em><b>Short Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Short Name</em>' attribute.
	 * @see #setShortName(String)
	 * @see de.jena.model.glt.GltPackage#getContactPojo_ShortName()
	 * @model unique="false"
	 * @generated
	 */
	String getShortName();

	/**
	 * Sets the value of the '{@link de.jena.model.glt.ContactPojo#getShortName <em>Short Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Short Name</em>' attribute.
	 * @see #getShortName()
	 * @generated
	 */
	void setShortName(String value);

	/**
	 * Returns the value of the '<em><b>Title</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Title</em>' attribute.
	 * @see #setTitle(String)
	 * @see de.jena.model.glt.GltPackage#getContactPojo_Title()
	 * @model unique="false"
	 * @generated
	 */
	String getTitle();

	/**
	 * Sets the value of the '{@link de.jena.model.glt.ContactPojo#getTitle <em>Title</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Title</em>' attribute.
	 * @see #getTitle()
	 * @generated
	 */
	void setTitle(String value);

	/**
	 * Returns the value of the '<em><b>Address</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Address</em>' containment reference.
	 * @see #setAddress(AddressPojo)
	 * @see de.jena.model.glt.GltPackage#getContactPojo_Address()
	 * @model containment="true"
	 * @generated
	 */
	AddressPojo getAddress();

	/**
	 * Sets the value of the '{@link de.jena.model.glt.ContactPojo#getAddress <em>Address</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Address</em>' containment reference.
	 * @see #getAddress()
	 * @generated
	 */
	void setAddress(AddressPojo value);

	/**
	 * Returns the value of the '<em><b>Phones</b></em>' containment reference list.
	 * The list contents are of type {@link de.jena.model.glt.PhonePojo}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Phones</em>' containment reference list.
	 * @see de.jena.model.glt.GltPackage#getContactPojo_Phones()
	 * @model containment="true"
	 * @generated
	 */
	EList<PhonePojo> getPhones();

	/**
	 * Returns the value of the '<em><b>Emails</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.String}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Emails</em>' attribute list.
	 * @see de.jena.model.glt.GltPackage#getContactPojo_Emails()
	 * @model unique="false"
	 * @generated
	 */
	EList<String> getEmails();

	/**
	 * Returns the value of the '<em><b>Comments</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.String}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Comments</em>' attribute list.
	 * @see de.jena.model.glt.GltPackage#getContactPojo_Comments()
	 * @model unique="false"
	 * @generated
	 */
	EList<String> getComments();

} // ContactPojo
