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
package de.jena.chirpstack.model.dummymoisture;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

import org.osgi.annotation.versioning.ProviderType;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Soil Type</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see de.jena.chirpstack.model.dummymoisture.DummyMoisturePackage#getSoilType()
 * @model
 * @generated
 */
@ProviderType
public enum SoilType implements Enumerator {
	/**
	 * The '<em><b>Sand</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #SAND_VALUE
	 * @generated
	 * @ordered
	 */
	SAND(0, "sand", "sand"),

	/**
	 * The '<em><b>Silt</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #SILT_VALUE
	 * @generated
	 * @ordered
	 */
	SILT(1, "silt", "silt"),

	/**
	 * The '<em><b>Loam</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #LOAM_VALUE
	 * @generated
	 * @ordered
	 */
	LOAM(2, "loam", "loam"),

	/**
	 * The '<em><b>Clay</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CLAY_VALUE
	 * @generated
	 * @ordered
	 */
	CLAY(3, "clay", "clay");

	/**
	 * The '<em><b>Sand</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #SAND
	 * @model name="sand"
	 * @generated
	 * @ordered
	 */
	public static final int SAND_VALUE = 0;

	/**
	 * The '<em><b>Silt</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #SILT
	 * @model name="silt"
	 * @generated
	 * @ordered
	 */
	public static final int SILT_VALUE = 1;

	/**
	 * The '<em><b>Loam</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #LOAM
	 * @model name="loam"
	 * @generated
	 * @ordered
	 */
	public static final int LOAM_VALUE = 2;

	/**
	 * The '<em><b>Clay</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CLAY
	 * @model name="clay"
	 * @generated
	 * @ordered
	 */
	public static final int CLAY_VALUE = 3;

	/**
	 * An array of all the '<em><b>Soil Type</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final SoilType[] VALUES_ARRAY =
		new SoilType[] {
			SAND,
			SILT,
			LOAM,
			CLAY,
		};

	/**
	 * A public read-only list of all the '<em><b>Soil Type</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<SoilType> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Soil Type</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param literal the literal.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static SoilType get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			SoilType result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Soil Type</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name the name.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static SoilType getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			SoilType result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Soil Type</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the integer value.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static SoilType get(int value) {
		switch (value) {
			case SAND_VALUE: return SAND;
			case SILT_VALUE: return SILT;
			case LOAM_VALUE: return LOAM;
			case CLAY_VALUE: return CLAY;
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
	private SoilType(int value, String name, String literal) {
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
	
} //SoilType
