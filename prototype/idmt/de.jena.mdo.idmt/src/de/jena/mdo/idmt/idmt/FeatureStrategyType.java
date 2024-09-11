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
 * A representation of the literals of the enumeration '<em><b>Feature Strategy Type</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * <!-- begin-model-doc -->
 * A strategy enumeration, how to interpret a field / column in the anonymization process.
 * <!-- end-model-doc -->
 * @see de.jena.mdo.idmt.idmt.IdmtPackage#getFeatureStrategyType()
 * @model
 * @generated
 */
@ProviderType
public enum FeatureStrategyType implements Enumerator {
	/**
	 * The '<em><b>ANONYMIZE</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Anonymize this field / column
	 * <!-- end-model-doc -->
	 * @see #ANONYMIZE_VALUE
	 * @generated
	 * @ordered
	 */
	ANONYMIZE(0, "ANONYMIZE", "ANONYMIZE"),

	/**
	 * The '<em><b>IGNORE</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Ignore this column. This can be used for deny listing a column.
	 * <!-- end-model-doc -->
	 * @see #IGNORE_VALUE
	 * @generated
	 * @ordered
	 */
	IGNORE(1, "IGNORE", "IGNORE"),

	/**
	 * The '<em><b>DO NOT ANONYMIZE</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Take this column as it is. This can be used for deny listing a column from anonymization.
	 * <!-- end-model-doc -->
	 * @see #DO_NOT_ANONYMIZE_VALUE
	 * @generated
	 * @ordered
	 */
	DO_NOT_ANONYMIZE(2, "DO_NOT_ANONYMIZE", "DO_NOT_ANONYMIZE");

	/**
	 * The '<em><b>ANONYMIZE</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Anonymize this field / column
	 * <!-- end-model-doc -->
	 * @see #ANONYMIZE
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int ANONYMIZE_VALUE = 0;

	/**
	 * The '<em><b>IGNORE</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Ignore this column. This can be used for deny listing a column.
	 * <!-- end-model-doc -->
	 * @see #IGNORE
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int IGNORE_VALUE = 1;

	/**
	 * The '<em><b>DO NOT ANONYMIZE</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Take this column as it is. This can be used for deny listing a column from anonymization.
	 * <!-- end-model-doc -->
	 * @see #DO_NOT_ANONYMIZE
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int DO_NOT_ANONYMIZE_VALUE = 2;

	/**
	 * An array of all the '<em><b>Feature Strategy Type</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final FeatureStrategyType[] VALUES_ARRAY =
		new FeatureStrategyType[] {
			ANONYMIZE,
			IGNORE,
			DO_NOT_ANONYMIZE,
		};

	/**
	 * A public read-only list of all the '<em><b>Feature Strategy Type</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<FeatureStrategyType> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Feature Strategy Type</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param literal the literal.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static FeatureStrategyType get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			FeatureStrategyType result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Feature Strategy Type</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name the name.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static FeatureStrategyType getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			FeatureStrategyType result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Feature Strategy Type</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the integer value.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static FeatureStrategyType get(int value) {
		switch (value) {
			case ANONYMIZE_VALUE: return ANONYMIZE;
			case IGNORE_VALUE: return IGNORE;
			case DO_NOT_ANONYMIZE_VALUE: return DO_NOT_ANONYMIZE;
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
	private FeatureStrategyType(int value, String name, String literal) {
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
	
} //FeatureStrategyType
