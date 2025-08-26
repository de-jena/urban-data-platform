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
 * A representation of the model object '<em><b>Entity Monitoring Settings Pojo</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.jena.model.glt.EntityMonitoringSettingsPojo#getSystemId <em>System Id</em>}</li>
 *   <li>{@link de.jena.model.glt.EntityMonitoringSettingsPojo#getIdentifier <em>Identifier</em>}</li>
 *   <li>{@link de.jena.model.glt.EntityMonitoringSettingsPojo#getName <em>Name</em>}</li>
 *   <li>{@link de.jena.model.glt.EntityMonitoringSettingsPojo#getIncluded <em>Included</em>}</li>
 *   <li>{@link de.jena.model.glt.EntityMonitoringSettingsPojo#getType <em>Type</em>}</li>
 * </ul>
 *
 * @see de.jena.model.glt.GltPackage#getEntityMonitoringSettingsPojo()
 * @model
 * @generated
 */
@ProviderType
public interface EntityMonitoringSettingsPojo extends EObject {
	/**
	 * Returns the value of the '<em><b>System Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>System Id</em>' attribute.
	 * @see #setSystemId(Integer)
	 * @see de.jena.model.glt.GltPackage#getEntityMonitoringSettingsPojo_SystemId()
	 * @model unique="false"
	 * @generated
	 */
	Integer getSystemId();

	/**
	 * Sets the value of the '{@link de.jena.model.glt.EntityMonitoringSettingsPojo#getSystemId <em>System Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>System Id</em>' attribute.
	 * @see #getSystemId()
	 * @generated
	 */
	void setSystemId(Integer value);

	/**
	 * Returns the value of the '<em><b>Identifier</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Identifier</em>' attribute.
	 * @see #setIdentifier(Integer)
	 * @see de.jena.model.glt.GltPackage#getEntityMonitoringSettingsPojo_Identifier()
	 * @model unique="false"
	 * @generated
	 */
	Integer getIdentifier();

	/**
	 * Sets the value of the '{@link de.jena.model.glt.EntityMonitoringSettingsPojo#getIdentifier <em>Identifier</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Identifier</em>' attribute.
	 * @see #getIdentifier()
	 * @generated
	 */
	void setIdentifier(Integer value);

	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see de.jena.model.glt.GltPackage#getEntityMonitoringSettingsPojo_Name()
	 * @model unique="false"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link de.jena.model.glt.EntityMonitoringSettingsPojo#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Included</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Included</em>' attribute.
	 * @see #setIncluded(Boolean)
	 * @see de.jena.model.glt.GltPackage#getEntityMonitoringSettingsPojo_Included()
	 * @model unique="false"
	 * @generated
	 */
	Boolean getIncluded();

	/**
	 * Sets the value of the '{@link de.jena.model.glt.EntityMonitoringSettingsPojo#getIncluded <em>Included</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Included</em>' attribute.
	 * @see #getIncluded()
	 * @generated
	 */
	void setIncluded(Boolean value);

	/**
	 * Returns the value of the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Type</em>' attribute.
	 * @see #setType(String)
	 * @see de.jena.model.glt.GltPackage#getEntityMonitoringSettingsPojo_Type()
	 * @model unique="false"
	 * @generated
	 */
	String getType();

	/**
	 * Sets the value of the '{@link de.jena.model.glt.EntityMonitoringSettingsPojo#getType <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type</em>' attribute.
	 * @see #getType()
	 * @generated
	 */
	void setType(String value);

} // EntityMonitoringSettingsPojo
