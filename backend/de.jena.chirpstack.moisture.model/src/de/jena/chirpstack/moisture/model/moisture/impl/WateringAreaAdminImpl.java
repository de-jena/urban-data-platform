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
package de.jena.chirpstack.moisture.model.moisture.impl;

import de.jena.chirpstack.moisture.model.moisture.ChirpstackMoisturePackage;
import de.jena.chirpstack.moisture.model.moisture.WateringAreaAdmin;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.sensinact.model.core.provider.impl.AdminImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Watering Area Admin</b></em>'.
 * <!-- end-user-doc -->
 *
 * @generated
 */
public class WateringAreaAdminImpl extends AdminImpl implements WateringAreaAdmin {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected WateringAreaAdminImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ChirpstackMoisturePackage.Literals.WATERING_AREA_ADMIN;
	}

} //WateringAreaAdminImpl
