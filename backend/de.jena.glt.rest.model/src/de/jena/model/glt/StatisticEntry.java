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
 * A representation of the model object '<em><b>Statistic Entry</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.jena.model.glt.StatisticEntry#getTimeWindow <em>Time Window</em>}</li>
 *   <li>{@link de.jena.model.glt.StatisticEntry#getValues <em>Values</em>}</li>
 * </ul>
 *
 * @see de.jena.model.glt.GltPackage#getStatisticEntry()
 * @model
 * @generated
 */
@ProviderType
public interface StatisticEntry extends EObject {
	/**
	 * Returns the value of the '<em><b>Time Window</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Time Window</em>' containment reference.
	 * @see #setTimeWindow(TimeWindow)
	 * @see de.jena.model.glt.GltPackage#getStatisticEntry_TimeWindow()
	 * @model containment="true"
	 * @generated
	 */
	TimeWindow getTimeWindow();

	/**
	 * Sets the value of the '{@link de.jena.model.glt.StatisticEntry#getTimeWindow <em>Time Window</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Time Window</em>' containment reference.
	 * @see #getTimeWindow()
	 * @generated
	 */
	void setTimeWindow(TimeWindow value);

	/**
	 * Returns the value of the '<em><b>Values</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Values</em>' attribute.
	 * @see #setValues(Object)
	 * @see de.jena.model.glt.GltPackage#getStatisticEntry_Values()
	 * @model unique="false"
	 * @generated
	 */
	Object getValues();

	/**
	 * Sets the value of the '{@link de.jena.model.glt.StatisticEntry#getValues <em>Values</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Values</em>' attribute.
	 * @see #getValues()
	 * @generated
	 */
	void setValues(Object value);

} // StatisticEntry
