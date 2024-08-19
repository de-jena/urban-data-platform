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

package de.jena.traficam.sensinact.model.traficamprovider.impl;

import de.jena.traficam.sensinact.model.traficamprovider.TraficamProvider;
import de.jena.traficam.sensinact.model.traficamprovider.TraficamproviderPackage;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.sensinact.model.core.provider.impl.DynamicProviderImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Traficam Provider</b></em>'.
 * <!-- end-user-doc -->
 *
 * @generated
 */
public class TraficamProviderImpl extends DynamicProviderImpl implements TraficamProvider {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TraficamProviderImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return TraficamproviderPackage.Literals.TRAFICAM_PROVIDER;
	}

} //TraficamProviderImpl
