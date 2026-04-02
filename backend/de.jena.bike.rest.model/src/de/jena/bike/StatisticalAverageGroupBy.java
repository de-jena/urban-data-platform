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
 * A representation of the literals of the enumeration '<em><b>Statistical Average Group By</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see de.jena.bike.BikePackage#getStatisticalAverageGroupBy()
 * @model
 * @generated
 */
@ProviderType
public enum StatisticalAverageGroupBy implements Enumerator {
	/**
	 * The '<em><b>Site</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #SITE_VALUE
	 * @generated
	 * @ordered
	 */
	SITE(0, "site", "site"),

	/**
	 * The '<em><b>Travel Mode</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #TRAVEL_MODE_VALUE
	 * @generated
	 * @ordered
	 */
	TRAVEL_MODE(1, "travelMode", "travelMode"),

	/**
	 * The '<em><b>Direction</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #DIRECTION_VALUE
	 * @generated
	 * @ordered
	 */
	DIRECTION(2, "direction", "direction"),

	/**
	 * The '<em><b>Site And Travel Mode</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #SITE_AND_TRAVEL_MODE_VALUE
	 * @generated
	 * @ordered
	 */
	SITE_AND_TRAVEL_MODE(3, "siteAndTravelMode", "siteAndTravelMode");

	/**
	 * The '<em><b>Site</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #SITE
	 * @model name="site"
	 * @generated
	 * @ordered
	 */
	public static final int SITE_VALUE = 0;

	/**
	 * The '<em><b>Travel Mode</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #TRAVEL_MODE
	 * @model name="travelMode"
	 * @generated
	 * @ordered
	 */
	public static final int TRAVEL_MODE_VALUE = 1;

	/**
	 * The '<em><b>Direction</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #DIRECTION
	 * @model name="direction"
	 * @generated
	 * @ordered
	 */
	public static final int DIRECTION_VALUE = 2;

	/**
	 * The '<em><b>Site And Travel Mode</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #SITE_AND_TRAVEL_MODE
	 * @model name="siteAndTravelMode"
	 * @generated
	 * @ordered
	 */
	public static final int SITE_AND_TRAVEL_MODE_VALUE = 3;

	/**
	 * An array of all the '<em><b>Statistical Average Group By</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final StatisticalAverageGroupBy[] VALUES_ARRAY =
		new StatisticalAverageGroupBy[] {
			SITE,
			TRAVEL_MODE,
			DIRECTION,
			SITE_AND_TRAVEL_MODE,
		};

	/**
	 * A public read-only list of all the '<em><b>Statistical Average Group By</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<StatisticalAverageGroupBy> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Statistical Average Group By</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param literal the literal.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static StatisticalAverageGroupBy get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			StatisticalAverageGroupBy result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Statistical Average Group By</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name the name.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static StatisticalAverageGroupBy getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			StatisticalAverageGroupBy result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Statistical Average Group By</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the integer value.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static StatisticalAverageGroupBy get(int value) {
		switch (value) {
			case SITE_VALUE: return SITE;
			case TRAVEL_MODE_VALUE: return TRAVEL_MODE;
			case DIRECTION_VALUE: return DIRECTION;
			case SITE_AND_TRAVEL_MODE_VALUE: return SITE_AND_TRAVEL_MODE;
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
	private StatisticalAverageGroupBy(int value, String name, String literal) {
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
	
} //StatisticalAverageGroupBy
