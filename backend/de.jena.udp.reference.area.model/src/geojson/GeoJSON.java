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
package geojson;

import org.eclipse.emf.ecore.EObject;

import org.osgi.annotation.versioning.ProviderType;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Geo JSON</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link geojson.GeoJSON#getBbox <em>Bbox</em>}</li>
 * </ul>
 *
 * @see geojson.GeojsonPackage#getGeoJSON()
 * @model
 * @generated
 */
@ProviderType
public interface GeoJSON extends EObject {
	/**
	 * Returns the value of the '<em><b>Bbox</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Bbox</em>' attribute.
	 * @see #setBbox(Double[])
	 * @see geojson.GeojsonPackage#getGeoJSON_Bbox()
	 * @model dataType="geojson.Array1D"
	 * @generated
	 */
	Double[] getBbox();

	/**
	 * Sets the value of the '{@link geojson.GeoJSON#getBbox <em>Bbox</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Bbox</em>' attribute.
	 * @see #getBbox()
	 * @generated
	 */
	void setBbox(Double[] value);

} // GeoJSON
