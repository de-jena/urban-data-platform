/*
 * Copyright (c) 2012 - 2024 Data In Motion and others.
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
package de.jena.conflict.sensinact.model.conflictProvider;

import org.eclipse.sensinact.gateway.geojson.GeoJsonObject;

import org.eclipse.sensinact.model.core.provider.Admin;

import org.osgi.annotation.versioning.ProviderType;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Traffic Conflict Admin</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.jena.conflict.sensinact.model.conflictProvider.TrafficConflictAdmin#getViewport <em>Viewport</em>}</li>
 * </ul>
 *
 * @see de.jena.conflict.sensinact.model.conflictProvider.ConflictPackage#getTrafficConflictAdmin()
 * @model
 * @generated
 */
@ProviderType
public interface TrafficConflictAdmin extends Admin {
	/**
	 * Returns the value of the '<em><b>Viewport</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Viewport</em>' attribute.
	 * @see #setViewport(GeoJsonObject)
	 * @see de.jena.conflict.sensinact.model.conflictProvider.ConflictPackage#getTrafficConflictAdmin_Viewport()
	 * @model dataType="org.eclipse.sensinact.model.core.provider.EGeoJsonObject"
	 *        annotation="Metadata sensorthings.observedArea='true'"
	 * @generated
	 */
	GeoJsonObject getViewport();

	/**
	 * Sets the value of the '{@link de.jena.conflict.sensinact.model.conflictProvider.TrafficConflictAdmin#getViewport <em>Viewport</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Viewport</em>' attribute.
	 * @see #getViewport()
	 * @generated
	 */
	void setViewport(GeoJsonObject value);

} // TrafficConflictAdmin
