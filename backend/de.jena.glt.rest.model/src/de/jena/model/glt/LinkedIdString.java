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
 * A representation of the model object '<em><b>Linked Id String</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.jena.model.glt.LinkedIdString#getId <em>Id</em>}</li>
 *   <li>{@link de.jena.model.glt.LinkedIdString#getLinks <em>Links</em>}</li>
 * </ul>
 *
 * @see de.jena.model.glt.GltPackage#getLinkedIdString()
 * @model
 * @generated
 */
@ProviderType
public interface LinkedIdString extends EObject {
	/**
	 * Returns the value of the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Id</em>' attribute.
	 * @see #setId(String)
	 * @see de.jena.model.glt.GltPackage#getLinkedIdString_Id()
	 * @model unique="false"
	 * @generated
	 */
	String getId();

	/**
	 * Sets the value of the '{@link de.jena.model.glt.LinkedIdString#getId <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Id</em>' attribute.
	 * @see #getId()
	 * @generated
	 */
	void setId(String value);

	/**
	 * Returns the value of the '<em><b>Links</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Links</em>' attribute.
	 * @see #setLinks(Object)
	 * @see de.jena.model.glt.GltPackage#getLinkedIdString_Links()
	 * @model unique="false"
	 * @generated
	 */
	Object getLinks();

	/**
	 * Sets the value of the '{@link de.jena.model.glt.LinkedIdString#getLinks <em>Links</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Links</em>' attribute.
	 * @see #getLinks()
	 * @generated
	 */
	void setLinks(Object value);

} // LinkedIdString
