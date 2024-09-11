/*
 */
package de.jena.mdo.idmt.idmt;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

import org.osgi.annotation.versioning.ProviderType;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Compute Distance Type</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see de.jena.mdo.idmt.idmt.IdmtPackage#getComputeDistanceType()
 * @model
 * @generated
 */
@ProviderType
public enum ComputeDistanceType implements Enumerator {
	/**
	 * The '<em><b>DISTANCE SQUARED</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #DISTANCE_SQUARED_VALUE
	 * @generated
	 * @ordered
	 */
	DISTANCE_SQUARED(0, "DISTANCE_SQUARED", "compute_distance_squared"),

	/**
	 * The '<em><b>DISTANCE DIFFERENCE</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #DISTANCE_DIFFERENCE_VALUE
	 * @generated
	 * @ordered
	 */
	DISTANCE_DIFFERENCE(1, "DISTANCE_DIFFERENCE", "compute_distance_difference"),

	/**
	 * The '<em><b>DISTANCE CATEGORICAL 50</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #DISTANCE_CATEGORICAL_50_VALUE
	 * @generated
	 * @ordered
	 */
	DISTANCE_CATEGORICAL_50(2, "DISTANCE_CATEGORICAL_50", "compute_distance_categorical_50"),

	/**
	 * The '<em><b>DISTANCE CATEGORICAL 100</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #DISTANCE_CATEGORICAL_100_VALUE
	 * @generated
	 * @ordered
	 */
	DISTANCE_CATEGORICAL_100(3, "DISTANCE_CATEGORICAL_100", "compute_distance_categorical_100"),

	/**
	 * The '<em><b>DISTANCE CATEGORICAL 200</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #DISTANCE_CATEGORICAL_200_VALUE
	 * @generated
	 * @ordered
	 */
	DISTANCE_CATEGORICAL_200(4, "DISTANCE_CATEGORICAL_200", "compute_distance_categorical_200");

	/**
	 * The '<em><b>DISTANCE SQUARED</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #DISTANCE_SQUARED
	 * @model literal="compute_distance_squared"
	 * @generated
	 * @ordered
	 */
	public static final int DISTANCE_SQUARED_VALUE = 0;

	/**
	 * The '<em><b>DISTANCE DIFFERENCE</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #DISTANCE_DIFFERENCE
	 * @model literal="compute_distance_difference"
	 * @generated
	 * @ordered
	 */
	public static final int DISTANCE_DIFFERENCE_VALUE = 1;

	/**
	 * The '<em><b>DISTANCE CATEGORICAL 50</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #DISTANCE_CATEGORICAL_50
	 * @model literal="compute_distance_categorical_50"
	 * @generated
	 * @ordered
	 */
	public static final int DISTANCE_CATEGORICAL_50_VALUE = 2;

	/**
	 * The '<em><b>DISTANCE CATEGORICAL 100</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #DISTANCE_CATEGORICAL_100
	 * @model literal="compute_distance_categorical_100"
	 * @generated
	 * @ordered
	 */
	public static final int DISTANCE_CATEGORICAL_100_VALUE = 3;

	/**
	 * The '<em><b>DISTANCE CATEGORICAL 200</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #DISTANCE_CATEGORICAL_200
	 * @model literal="compute_distance_categorical_200"
	 * @generated
	 * @ordered
	 */
	public static final int DISTANCE_CATEGORICAL_200_VALUE = 4;

	/**
	 * An array of all the '<em><b>Compute Distance Type</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final ComputeDistanceType[] VALUES_ARRAY =
		new ComputeDistanceType[] {
			DISTANCE_SQUARED,
			DISTANCE_DIFFERENCE,
			DISTANCE_CATEGORICAL_50,
			DISTANCE_CATEGORICAL_100,
			DISTANCE_CATEGORICAL_200,
		};

	/**
	 * A public read-only list of all the '<em><b>Compute Distance Type</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<ComputeDistanceType> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Compute Distance Type</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param literal the literal.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static ComputeDistanceType get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			ComputeDistanceType result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Compute Distance Type</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name the name.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static ComputeDistanceType getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			ComputeDistanceType result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Compute Distance Type</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the integer value.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static ComputeDistanceType get(int value) {
		switch (value) {
			case DISTANCE_SQUARED_VALUE: return DISTANCE_SQUARED;
			case DISTANCE_DIFFERENCE_VALUE: return DISTANCE_DIFFERENCE;
			case DISTANCE_CATEGORICAL_50_VALUE: return DISTANCE_CATEGORICAL_50;
			case DISTANCE_CATEGORICAL_100_VALUE: return DISTANCE_CATEGORICAL_100;
			case DISTANCE_CATEGORICAL_200_VALUE: return DISTANCE_CATEGORICAL_200;
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
	private ComputeDistanceType(int value, String name, String literal) {
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
	
} //ComputeDistanceType
