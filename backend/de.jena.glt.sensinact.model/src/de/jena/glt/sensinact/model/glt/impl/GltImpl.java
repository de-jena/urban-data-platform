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
package de.jena.glt.sensinact.model.glt.impl;

import de.jena.glt.sensinact.model.glt.Glt;
import de.jena.glt.sensinact.model.glt.GltPackage;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.sensinact.model.core.provider.impl.DynamicProviderImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Glt</b></em>'.
 * <!-- end-user-doc -->
 *
 * @generated
 */
public class GltImpl extends DynamicProviderImpl implements Glt {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected GltImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return GltPackage.Literals.GLT;
	}

} //GltImpl
