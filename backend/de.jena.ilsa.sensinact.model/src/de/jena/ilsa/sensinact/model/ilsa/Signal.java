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
package de.jena.ilsa.sensinact.model.ilsa;

import org.eclipse.sensinact.gateway.geojson.GeoJsonObject;

import org.eclipse.sensinact.model.core.provider.Service;

import org.osgi.annotation.versioning.ProviderType;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Signal</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.jena.ilsa.sensinact.model.ilsa.Signal#getColor <em>Color</em>}</li>
 *   <li>{@link de.jena.ilsa.sensinact.model.ilsa.Signal#getObservedArea <em>Observed Area</em>}</li>
 * </ul>
 *
 * @see de.jena.ilsa.sensinact.model.ilsa.IlsaPackage#getSignal()
 * @model
 * @generated
 */
@ProviderType
public interface Signal extends Service {
	/**
	 * Returns the value of the '<em><b>Color</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Color</em>' attribute.
	 * @see #setColor(String)
	 * @see de.jena.ilsa.sensinact.model.ilsa.IlsaPackage#getSignal_Color()
	 * @model annotation="Metadata sensorthings.unit.name='Farbe'"
	 * @generated
	 */
	String getColor();

	/**
	 * Sets the value of the '{@link de.jena.ilsa.sensinact.model.ilsa.Signal#getColor <em>Color</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Color</em>' attribute.
	 * @see #getColor()
	 * @generated
	 */
	void setColor(String value);

	/**
	 * Returns the value of the '<em><b>Observed Area</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Observed Area</em>' attribute.
	 * @see #setObservedArea(GeoJsonObject)
	 * @see de.jena.ilsa.sensinact.model.ilsa.IlsaPackage#getSignal_ObservedArea()
	 * @model dataType="org.eclipse.sensinact.model.core.provider.EGeoJsonObject"
	 *        annotation="Metadata sensorthings.observedArea='true'"
	 * @generated
	 */
	GeoJsonObject getObservedArea();

	/**
	 * Sets the value of the '{@link de.jena.ilsa.sensinact.model.ilsa.Signal#getObservedArea <em>Observed Area</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Observed Area</em>' attribute.
	 * @see #getObservedArea()
	 * @generated
	 */
	void setObservedArea(GeoJsonObject value);

} // Signal
