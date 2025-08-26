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

import org.eclipse.emf.ecore.EObject;

import org.osgi.annotation.versioning.ProviderType;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Point Record</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.jena.model.glt.PointRecord#getSystemId <em>System Id</em>}</li>
 *   <li>{@link de.jena.model.glt.PointRecord#getId <em>Id</em>}</li>
 *   <li>{@link de.jena.model.glt.PointRecord#getAddress <em>Address</em>}</li>
 *   <li>{@link de.jena.model.glt.PointRecord#getNewValue <em>New Value</em>}</li>
 *   <li>{@link de.jena.model.glt.PointRecord#getOldValue <em>Old Value</em>}</li>
 *   <li>{@link de.jena.model.glt.PointRecord#getOverrideStatus <em>Override Status</em>}</li>
 *   <li>{@link de.jena.model.glt.PointRecord#getNote <em>Note</em>}</li>
 *   <li>{@link de.jena.model.glt.PointRecord#getAuthor <em>Author</em>}</li>
 * </ul>
 *
 * @see de.jena.model.glt.GltPackage#getPointRecord()
 * @model
 * @generated
 */
@ProviderType
public interface PointRecord extends EObject {
	/**
	 * Returns the value of the '<em><b>System Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>System Id</em>' attribute.
	 * @see #setSystemId(Integer)
	 * @see de.jena.model.glt.GltPackage#getPointRecord_SystemId()
	 * @model unique="false"
	 * @generated
	 */
	Integer getSystemId();

	/**
	 * Sets the value of the '{@link de.jena.model.glt.PointRecord#getSystemId <em>System Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>System Id</em>' attribute.
	 * @see #getSystemId()
	 * @generated
	 */
	void setSystemId(Integer value);

	/**
	 * Returns the value of the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Id</em>' attribute.
	 * @see #setId(Integer)
	 * @see de.jena.model.glt.GltPackage#getPointRecord_Id()
	 * @model unique="false"
	 * @generated
	 */
	Integer getId();

	/**
	 * Sets the value of the '{@link de.jena.model.glt.PointRecord#getId <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Id</em>' attribute.
	 * @see #getId()
	 * @generated
	 */
	void setId(Integer value);

	/**
	 * Returns the value of the '<em><b>Address</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Address</em>' attribute.
	 * @see #setAddress(String)
	 * @see de.jena.model.glt.GltPackage#getPointRecord_Address()
	 * @model unique="false"
	 * @generated
	 */
	String getAddress();

	/**
	 * Sets the value of the '{@link de.jena.model.glt.PointRecord#getAddress <em>Address</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Address</em>' attribute.
	 * @see #getAddress()
	 * @generated
	 */
	void setAddress(String value);

	/**
	 * Returns the value of the '<em><b>New Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>New Value</em>' attribute.
	 * @see #setNewValue(Float)
	 * @see de.jena.model.glt.GltPackage#getPointRecord_NewValue()
	 * @model unique="false"
	 * @generated
	 */
	Float getNewValue();

	/**
	 * Sets the value of the '{@link de.jena.model.glt.PointRecord#getNewValue <em>New Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>New Value</em>' attribute.
	 * @see #getNewValue()
	 * @generated
	 */
	void setNewValue(Float value);

	/**
	 * Returns the value of the '<em><b>Old Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Old Value</em>' attribute.
	 * @see #setOldValue(Float)
	 * @see de.jena.model.glt.GltPackage#getPointRecord_OldValue()
	 * @model unique="false"
	 * @generated
	 */
	Float getOldValue();

	/**
	 * Sets the value of the '{@link de.jena.model.glt.PointRecord#getOldValue <em>Old Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Old Value</em>' attribute.
	 * @see #getOldValue()
	 * @generated
	 */
	void setOldValue(Float value);

	/**
	 * Returns the value of the '<em><b>Override Status</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Override Status</em>' attribute.
	 * @see #setOverrideStatus(Integer)
	 * @see de.jena.model.glt.GltPackage#getPointRecord_OverrideStatus()
	 * @model unique="false"
	 * @generated
	 */
	Integer getOverrideStatus();

	/**
	 * Sets the value of the '{@link de.jena.model.glt.PointRecord#getOverrideStatus <em>Override Status</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Override Status</em>' attribute.
	 * @see #getOverrideStatus()
	 * @generated
	 */
	void setOverrideStatus(Integer value);

	/**
	 * Returns the value of the '<em><b>Note</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Note</em>' attribute.
	 * @see #setNote(String)
	 * @see de.jena.model.glt.GltPackage#getPointRecord_Note()
	 * @model unique="false"
	 * @generated
	 */
	String getNote();

	/**
	 * Sets the value of the '{@link de.jena.model.glt.PointRecord#getNote <em>Note</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Note</em>' attribute.
	 * @see #getNote()
	 * @generated
	 */
	void setNote(String value);

	/**
	 * Returns the value of the '<em><b>Author</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Author</em>' attribute.
	 * @see #setAuthor(String)
	 * @see de.jena.model.glt.GltPackage#getPointRecord_Author()
	 * @model unique="false"
	 * @generated
	 */
	String getAuthor();

	/**
	 * Sets the value of the '{@link de.jena.model.glt.PointRecord#getAuthor <em>Author</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Author</em>' attribute.
	 * @see #getAuthor()
	 * @generated
	 */
	void setAuthor(String value);

} // PointRecord
