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
package de.jena.reference.area.model.referencearea;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

import org.osgi.annotation.versioning.ProviderType;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Collection</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * A collection of reference areas, typically representing all areas from a KML document
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.jena.reference.area.model.referencearea.ReferenceAreaCollection#getAreas <em>Areas</em>}</li>
 * </ul>
 *
 * @see de.jena.reference.area.model.referencearea.ReferenceAreaPackage#getReferenceAreaCollection()
 * @model
 * @generated
 */
@ProviderType
public interface ReferenceAreaCollection extends EObject {
	/**
	 * Returns the value of the '<em><b>Areas</b></em>' containment reference list.
	 * The list contents are of type {@link de.jena.reference.area.model.referencearea.ReferenceArea}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * List of reference areas
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Areas</em>' containment reference list.
	 * @see de.jena.reference.area.model.referencearea.ReferenceAreaPackage#getReferenceAreaCollection_Areas()
	 * @model containment="true"
	 * @generated
	 */
	EList<ReferenceArea> getAreas();

} // ReferenceAreaCollection
