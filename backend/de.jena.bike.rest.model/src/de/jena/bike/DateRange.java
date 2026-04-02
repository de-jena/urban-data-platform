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
 * A representation of the literals of the enumeration '<em><b>Date Range</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see de.jena.bike.BikePackage#getDateRange()
 * @model
 * @generated
 */
@ProviderType
public enum DateRange implements Enumerator {
	/**
	 * The '<em><b>Current Year</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CURRENT_YEAR_VALUE
	 * @generated
	 * @ordered
	 */
	CURRENT_YEAR(0, "currentYear", "currentYear"),

	/**
	 * The '<em><b>Last Year</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #LAST_YEAR_VALUE
	 * @generated
	 * @ordered
	 */
	LAST_YEAR(1, "lastYear", "lastYear"),

	/**
	 * The '<em><b>Current Month</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CURRENT_MONTH_VALUE
	 * @generated
	 * @ordered
	 */
	CURRENT_MONTH(2, "currentMonth", "currentMonth"),

	/**
	 * The '<em><b>Last Month</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #LAST_MONTH_VALUE
	 * @generated
	 * @ordered
	 */
	LAST_MONTH(3, "lastMonth", "lastMonth"),

	/**
	 * The '<em><b>Current Week</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CURRENT_WEEK_VALUE
	 * @generated
	 * @ordered
	 */
	CURRENT_WEEK(4, "currentWeek", "currentWeek"),

	/**
	 * The '<em><b>Last Week</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #LAST_WEEK_VALUE
	 * @generated
	 * @ordered
	 */
	LAST_WEEK(5, "lastWeek", "lastWeek"),

	/**
	 * The '<em><b>Yesterday</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #YESTERDAY_VALUE
	 * @generated
	 * @ordered
	 */
	YESTERDAY(6, "yesterday", "yesterday"),

	/**
	 * The '<em><b>Custom</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CUSTOM_VALUE
	 * @generated
	 * @ordered
	 */
	CUSTOM(7, "custom", "custom");

	/**
	 * The '<em><b>Current Year</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CURRENT_YEAR
	 * @model name="currentYear"
	 * @generated
	 * @ordered
	 */
	public static final int CURRENT_YEAR_VALUE = 0;

	/**
	 * The '<em><b>Last Year</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #LAST_YEAR
	 * @model name="lastYear"
	 * @generated
	 * @ordered
	 */
	public static final int LAST_YEAR_VALUE = 1;

	/**
	 * The '<em><b>Current Month</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CURRENT_MONTH
	 * @model name="currentMonth"
	 * @generated
	 * @ordered
	 */
	public static final int CURRENT_MONTH_VALUE = 2;

	/**
	 * The '<em><b>Last Month</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #LAST_MONTH
	 * @model name="lastMonth"
	 * @generated
	 * @ordered
	 */
	public static final int LAST_MONTH_VALUE = 3;

	/**
	 * The '<em><b>Current Week</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CURRENT_WEEK
	 * @model name="currentWeek"
	 * @generated
	 * @ordered
	 */
	public static final int CURRENT_WEEK_VALUE = 4;

	/**
	 * The '<em><b>Last Week</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #LAST_WEEK
	 * @model name="lastWeek"
	 * @generated
	 * @ordered
	 */
	public static final int LAST_WEEK_VALUE = 5;

	/**
	 * The '<em><b>Yesterday</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #YESTERDAY
	 * @model name="yesterday"
	 * @generated
	 * @ordered
	 */
	public static final int YESTERDAY_VALUE = 6;

	/**
	 * The '<em><b>Custom</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CUSTOM
	 * @model name="custom"
	 * @generated
	 * @ordered
	 */
	public static final int CUSTOM_VALUE = 7;

	/**
	 * An array of all the '<em><b>Date Range</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final DateRange[] VALUES_ARRAY =
		new DateRange[] {
			CURRENT_YEAR,
			LAST_YEAR,
			CURRENT_MONTH,
			LAST_MONTH,
			CURRENT_WEEK,
			LAST_WEEK,
			YESTERDAY,
			CUSTOM,
		};

	/**
	 * A public read-only list of all the '<em><b>Date Range</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<DateRange> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Date Range</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param literal the literal.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static DateRange get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			DateRange result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Date Range</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name the name.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static DateRange getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			DateRange result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Date Range</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the integer value.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static DateRange get(int value) {
		switch (value) {
			case CURRENT_YEAR_VALUE: return CURRENT_YEAR;
			case LAST_YEAR_VALUE: return LAST_YEAR;
			case CURRENT_MONTH_VALUE: return CURRENT_MONTH;
			case LAST_MONTH_VALUE: return LAST_MONTH;
			case CURRENT_WEEK_VALUE: return CURRENT_WEEK;
			case LAST_WEEK_VALUE: return LAST_WEEK;
			case YESTERDAY_VALUE: return YESTERDAY;
			case CUSTOM_VALUE: return CUSTOM;
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
	private DateRange(int value, String name, String literal) {
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
	
} //DateRange
