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

import org.eclipse.emf.ecore.EPackage;

import org.osgi.annotation.versioning.ProviderType;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>EPackage Resource</b></em>'.
 * <!-- end-user-doc -->
 *
 *
 * @see de.jena.upd.modelling.ui.api.modellingApi.ModellingApiPackage#getEPackageResource()
 * @model interface="true" abstract="true"
 *        annotation="jakarta.ws.rs.Path value='/epackage'"
 * @generated
 */
@ProviderType
public interface EPackageResource {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model exceptions="de.jena.upd.modelling.ui.api.modellingApi.EWebApplicationException"
	 *        annotation="jakarta.ws.rs.GET"
	 * @generated
	 */
	EPackage load(String ePackageUri) throws WebApplicationException;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Returns a List of Package URIs
	 * <!-- end-model-doc -->
	 * @model exceptions="de.jena.upd.modelling.ui.api.modellingApi.EWebApplicationException"
	 *        annotation="jakarta.ws.rs.GET"
	 * @generated
	 */
	EList<String> loadAll() throws WebApplicationException;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model dataType="de.jena.upd.modelling.ui.api.modellingApi.EResponse"
	 *        annotation="jakarta.ws.rs.POST"
	 * @generated
	 */
	Response save(EPackage ePackage);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model dataType="de.jena.upd.modelling.ui.api.modellingApi.EResponse" exceptions="de.jena.upd.modelling.ui.api.modellingApi.EWebApplicationException"
	 *        annotation="jakarta.ws.rs.DELETE"
	 * @generated
	 */
	Response delete(String ePackageUri) throws WebApplicationException;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model dataType="de.jena.upd.modelling.ui.api.modellingApi.EResponse" exceptions="de.jena.upd.modelling.ui.api.modellingApi.EWebApplicationException"
	 *        annotation="jakarta.ws.rs.HEAD"
	 * @generated
	 */
	Response exists(String ePackageUri) throws WebApplicationException;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model dataType="de.jena.upd.modelling.ui.api.modellingApi.EResponse" ePackageMany="true"
	 *        annotation="jakarta.ws.rs.POST"
	 * @generated
	 */
	Response saveAll(EList<EPackage> ePackage);

} // EPackageResource
