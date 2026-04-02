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
 * A representation of the literals of the enumeration '<em><b>Travel Mode Label</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see de.jena.bike.BikePackage#getTravelModeLabel()
 * @model
 * @generated
 */
@ProviderType
public enum TravelModeLabel implements Enumerator {
	/**
	 * The '<em><b>Pedestrian</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #PEDESTRIAN_VALUE
	 * @generated
	 * @ordered
	 */
	PEDESTRIAN(0, "pedestrian", "pedestrian"),

	/**
	 * The '<em><b>Bike</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #BIKE_VALUE
	 * @generated
	 * @ordered
	 */
	BIKE(1, "bike", "bike"),

	/**
	 * The '<em><b>Horse</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #HORSE_VALUE
	 * @generated
	 * @ordered
	 */
	HORSE(2, "horse", "horse"),

	/**
	 * The '<em><b>Car</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CAR_VALUE
	 * @generated
	 * @ordered
	 */
	CAR(3, "car", "car"),

	/**
	 * The '<em><b>Bus</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #BUS_VALUE
	 * @generated
	 * @ordered
	 */
	BUS(4, "bus", "bus"),

	/**
	 * The '<em><b>Minibus</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #MINIBUS_VALUE
	 * @generated
	 * @ordered
	 */
	MINIBUS(5, "minibus", "minibus"),

	/**
	 * The '<em><b>Undefined</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #UNDEFINED_VALUE
	 * @generated
	 * @ordered
	 */
	UNDEFINED(6, "undefined", "undefined"),

	/**
	 * The '<em><b>Motorbike</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #MOTORBIKE_VALUE
	 * @generated
	 * @ordered
	 */
	MOTORBIKE(7, "motorbike", "motorbike"),

	/**
	 * The '<em><b>Kayak</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #KAYAK_VALUE
	 * @generated
	 * @ordered
	 */
	KAYAK(8, "kayak", "kayak"),

	/**
	 * The '<em><b>Scooter</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #SCOOTER_VALUE
	 * @generated
	 * @ordered
	 */
	SCOOTER(9, "scooter", "scooter"),

	/**
	 * The '<em><b>Truck</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #TRUCK_VALUE
	 * @generated
	 * @ordered
	 */
	TRUCK(10, "truck", "truck"),

	/**
	 * The '<em><b>Cargobike</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CARGOBIKE_VALUE
	 * @generated
	 * @ordered
	 */
	CARGOBIKE(11, "cargobike", "cargobike"),

	/**
	 * The '<em><b>Motorized</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #MOTORIZED_VALUE
	 * @generated
	 * @ordered
	 */
	MOTORIZED(12, "motorized", "motorized");

	/**
	 * The '<em><b>Pedestrian</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #PEDESTRIAN
	 * @model name="pedestrian"
	 * @generated
	 * @ordered
	 */
	public static final int PEDESTRIAN_VALUE = 0;

	/**
	 * The '<em><b>Bike</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #BIKE
	 * @model name="bike"
	 * @generated
	 * @ordered
	 */
	public static final int BIKE_VALUE = 1;

	/**
	 * The '<em><b>Horse</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #HORSE
	 * @model name="horse"
	 * @generated
	 * @ordered
	 */
	public static final int HORSE_VALUE = 2;

	/**
	 * The '<em><b>Car</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CAR
	 * @model name="car"
	 * @generated
	 * @ordered
	 */
	public static final int CAR_VALUE = 3;

	/**
	 * The '<em><b>Bus</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #BUS
	 * @model name="bus"
	 * @generated
	 * @ordered
	 */
	public static final int BUS_VALUE = 4;

	/**
	 * The '<em><b>Minibus</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #MINIBUS
	 * @model name="minibus"
	 * @generated
	 * @ordered
	 */
	public static final int MINIBUS_VALUE = 5;

	/**
	 * The '<em><b>Undefined</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #UNDEFINED
	 * @model name="undefined"
	 * @generated
	 * @ordered
	 */
	public static final int UNDEFINED_VALUE = 6;

	/**
	 * The '<em><b>Motorbike</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #MOTORBIKE
	 * @model name="motorbike"
	 * @generated
	 * @ordered
	 */
	public static final int MOTORBIKE_VALUE = 7;

	/**
	 * The '<em><b>Kayak</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #KAYAK
	 * @model name="kayak"
	 * @generated
	 * @ordered
	 */
	public static final int KAYAK_VALUE = 8;

	/**
	 * The '<em><b>Scooter</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #SCOOTER
	 * @model name="scooter"
	 * @generated
	 * @ordered
	 */
	public static final int SCOOTER_VALUE = 9;

	/**
	 * The '<em><b>Truck</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #TRUCK
	 * @model name="truck"
	 * @generated
	 * @ordered
	 */
	public static final int TRUCK_VALUE = 10;

	/**
	 * The '<em><b>Cargobike</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CARGOBIKE
	 * @model name="cargobike"
	 * @generated
	 * @ordered
	 */
	public static final int CARGOBIKE_VALUE = 11;

	/**
	 * The '<em><b>Motorized</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #MOTORIZED
	 * @model name="motorized"
	 * @generated
	 * @ordered
	 */
	public static final int MOTORIZED_VALUE = 12;

	/**
	 * An array of all the '<em><b>Travel Mode Label</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final TravelModeLabel[] VALUES_ARRAY =
		new TravelModeLabel[] {
			PEDESTRIAN,
			BIKE,
			HORSE,
			CAR,
			BUS,
			MINIBUS,
			UNDEFINED,
			MOTORBIKE,
			KAYAK,
			SCOOTER,
			TRUCK,
			CARGOBIKE,
			MOTORIZED,
		};

	/**
	 * A public read-only list of all the '<em><b>Travel Mode Label</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<TravelModeLabel> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Travel Mode Label</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param literal the literal.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static TravelModeLabel get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			TravelModeLabel result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Travel Mode Label</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name the name.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static TravelModeLabel getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			TravelModeLabel result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Travel Mode Label</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the integer value.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static TravelModeLabel get(int value) {
		switch (value) {
			case PEDESTRIAN_VALUE: return PEDESTRIAN;
			case BIKE_VALUE: return BIKE;
			case HORSE_VALUE: return HORSE;
			case CAR_VALUE: return CAR;
			case BUS_VALUE: return BUS;
			case MINIBUS_VALUE: return MINIBUS;
			case UNDEFINED_VALUE: return UNDEFINED;
			case MOTORBIKE_VALUE: return MOTORBIKE;
			case KAYAK_VALUE: return KAYAK;
			case SCOOTER_VALUE: return SCOOTER;
			case TRUCK_VALUE: return TRUCK;
			case CARGOBIKE_VALUE: return CARGOBIKE;
			case MOTORIZED_VALUE: return MOTORIZED;
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
	private TravelModeLabel(int value, String name, String literal) {
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
	
} //TravelModeLabel
