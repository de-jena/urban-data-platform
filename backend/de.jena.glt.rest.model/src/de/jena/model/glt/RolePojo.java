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
 * A representation of the model object '<em><b>Role Pojo</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.jena.model.glt.RolePojo#getName <em>Name</em>}</li>
 *   <li>{@link de.jena.model.glt.RolePojo#getType <em>Type</em>}</li>
 *   <li>{@link de.jena.model.glt.RolePojo#getGroups <em>Groups</em>}</li>
 *   <li>{@link de.jena.model.glt.RolePojo#getRoles <em>Roles</em>}</li>
 *   <li>{@link de.jena.model.glt.RolePojo#getMembers <em>Members</em>}</li>
 *   <li>{@link de.jena.model.glt.RolePojo#getProperties <em>Properties</em>}</li>
 * </ul>
 *
 * @see de.jena.model.glt.GltPackage#getRolePojo()
 * @model
 * @generated
 */
@ProviderType
public interface RolePojo extends EObject {
	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see de.jena.model.glt.GltPackage#getRolePojo_Name()
	 * @model unique="false"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link de.jena.model.glt.RolePojo#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Type</em>' attribute.
	 * @see #setType(String)
	 * @see de.jena.model.glt.GltPackage#getRolePojo_Type()
	 * @model unique="false"
	 * @generated
	 */
	String getType();

	/**
	 * Sets the value of the '{@link de.jena.model.glt.RolePojo#getType <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type</em>' attribute.
	 * @see #getType()
	 * @generated
	 */
	void setType(String value);

	/**
	 * Returns the value of the '<em><b>Groups</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.String}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Groups</em>' attribute list.
	 * @see de.jena.model.glt.GltPackage#getRolePojo_Groups()
	 * @model unique="false"
	 * @generated
	 */
	EList<String> getGroups();

	/**
	 * Returns the value of the '<em><b>Roles</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.String}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Roles</em>' attribute list.
	 * @see de.jena.model.glt.GltPackage#getRolePojo_Roles()
	 * @model unique="false"
	 * @generated
	 */
	EList<String> getRoles();

	/**
	 * Returns the value of the '<em><b>Members</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.String}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Members</em>' attribute list.
	 * @see de.jena.model.glt.GltPackage#getRolePojo_Members()
	 * @model unique="false"
	 * @generated
	 */
	EList<String> getMembers();

	/**
	 * Returns the value of the '<em><b>Properties</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Properties</em>' attribute.
	 * @see #setProperties(Object)
	 * @see de.jena.model.glt.GltPackage#getRolePojo_Properties()
	 * @model unique="false"
	 * @generated
	 */
	Object getProperties();

	/**
	 * Sets the value of the '{@link de.jena.model.glt.RolePojo#getProperties <em>Properties</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Properties</em>' attribute.
	 * @see #getProperties()
	 * @generated
	 */
	void setProperties(Object value);

} // RolePojo
