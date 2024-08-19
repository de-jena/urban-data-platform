/*
 * Copyright (c) 2012 - 2024 Data In Motion and others.
 * All rights reserved. 
 *
 * This program and the accompanying materials are made
 * available under the terms of the Eclipse Public License 2.0
 * which is available at https://www.eclipse.org/legal/epl-2.0/
 * SPDX-License-Identifier: EPL-2.0
 *
 * Contributors:
 *     Data In Motion - initial API and implementation
 */

package de.jena.upd.modelling.ui.api.modellingApi;

import jakarta.ws.rs.WebApplicationException;

import jakarta.ws.rs.core.Response;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

import org.osgi.annotation.versioning.ProviderType;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>EObject Resource</b></em>'.
 * <!-- end-user-doc -->
 *
 *
 * @see de.jena.upd.modelling.ui.api.modellingApi.ModellingApiPackage#getEObjectResource()
 * @model interface="true" abstract="true"
 *        annotation="jakarta.ws.rs.Path value='/eobject'"
 * @generated
 */
@ProviderType
public interface EObjectResource {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model exceptions="de.jena.upd.modelling.ui.api.modellingApi.EWebApplicationException"
	 *        annotation="jakarta.ws.rs.GET"
	 * @generated
	 */
	EObject load(String eClassUri, String id) throws WebApplicationException;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Returns all EObjects found of the requrested EClass type. If no projection is set, all Objects will be returned with all their Features.
	 * @param projection A Whitelist of Attributes used as Projection for the returning EObjects. The ID Features will always be included. 
	 * <!-- end-model-doc -->
	 * @model exceptions="de.jena.upd.modelling.ui.api.modellingApi.EWebApplicationException" projectionMany="true"
	 *        annotation="jakarta.ws.rs.GET"
	 * @generated
	 */
	EList<EObject> loadAll(String eClassUri, EList<String> projection) throws WebApplicationException;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Returns the saved EObject with only the ID feature set.
	 * <!-- end-model-doc -->
	 * @model annotation="jakarta.ws.rs.POST"
	 * @generated
	 */
	EObject save(EObject eObject);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model dataType="de.jena.upd.modelling.ui.api.modellingApi.EResponse" exceptions="de.jena.upd.modelling.ui.api.modellingApi.EWebApplicationException"
	 *        annotation="jakarta.ws.rs.DELETE"
	 * @generated
	 */
	Response delete(String eClassUri, String id) throws WebApplicationException;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model dataType="de.jena.upd.modelling.ui.api.modellingApi.EResponse" exceptions="de.jena.upd.modelling.ui.api.modellingApi.EWebApplicationException"
	 *        annotation="jakarta.ws.rs.HEAD"
	 * @generated
	 */
	Response exists(String eClassUri, String id) throws WebApplicationException;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Returns the saved EObjects with only the ID feature set.
	 * <!-- end-model-doc -->
	 * @model eObjectsMany="true"
	 *        annotation="jakarta.ws.rs.POST"
	 * @generated
	 */
	EList<EObject> saveAll(EList<EObject> eObjects);

} // EObjectResource
