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
package de.jena.bike;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

import org.osgi.annotation.versioning.ProviderType;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Granularity</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see de.jena.bike.BikePackage#getGranularity()
 * @model
 * @generated
 */
@ProviderType
public enum Granularity implements Enumerator {
	/**
	 * The '<em><b>PT15M</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #PT15M_VALUE
	 * @generated
	 * @ordered
	 */
	PT15M(0, "PT15M", "PT15M"),

	/**
	 * The '<em><b>PT1H</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #PT1H_VALUE
	 * @generated
	 * @ordered
	 */
	PT1H(1, "PT1H", "PT1H"),

	/**
	 * The '<em><b>P1D</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #P1D_VALUE
	 * @generated
	 * @ordered
	 */
	P1D(2, "P1D", "P1D"),

	/**
	 * The '<em><b>P1W</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #P1W_VALUE
	 * @generated
	 * @ordered
	 */
	P1W(3, "P1W", "P1W"),

	/**
	 * The '<em><b>P1M</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #P1M_VALUE
	 * @generated
	 * @ordered
	 */
	P1M(4, "P1M", "P1M"),

	/**
	 * The '<em><b>P1Y</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #P1Y_VALUE
	 * @generated
	 * @ordered
	 */
	P1Y(5, "P1Y", "P1Y");

	/**
	 * The '<em><b>PT15M</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #PT15M
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int PT15M_VALUE = 0;

	/**
	 * The '<em><b>PT1H</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #PT1H
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int PT1H_VALUE = 1;

	/**
	 * The '<em><b>P1D</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #P1D
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int P1D_VALUE = 2;

	/**
	 * The '<em><b>P1W</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #P1W
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int P1W_VALUE = 3;

	/**
	 * The '<em><b>P1M</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #P1M
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int P1M_VALUE = 4;

	/**
	 * The '<em><b>P1Y</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #P1Y
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int P1Y_VALUE = 5;

	/**
	 * An array of all the '<em><b>Granularity</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final Granularity[] VALUES_ARRAY =
		new Granularity[] {
			PT15M,
			PT1H,
			P1D,
			P1W,
			P1M,
			P1Y,
		};

	/**
	 * A public read-only list of all the '<em><b>Granularity</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<Granularity> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Granularity</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param literal the literal.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static Granularity get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			Granularity result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Granularity</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name the name.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static Granularity getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			Granularity result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Granularity</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the integer value.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static Granularity get(int value) {
		switch (value) {
			case PT15M_VALUE: return PT15M;
			case PT1H_VALUE: return PT1H;
			case P1D_VALUE: return P1D;
			case P1W_VALUE: return P1W;
			case P1M_VALUE: return P1M;
			case P1Y_VALUE: return P1Y;
		}
		return null;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private final int value;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private final String name;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private final String literal;

	/**
	 * Only this class can construct instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private Granularity(int value, String name, String literal) {
		this.value = value;
		this.name = name;
		this.literal = literal;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int getValue() {
	  return value;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getName() {
	  return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getLiteral() {
	  return literal;
	}

	/**
	 * Returns the literal value of the enumerator, which is its string representation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		return literal;
	}
	
} //Granularity
