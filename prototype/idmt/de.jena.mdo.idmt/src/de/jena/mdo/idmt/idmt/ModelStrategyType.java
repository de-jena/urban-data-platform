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
 * A representation of the literals of the enumeration '<em><b>Model Strategy Type</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * <!-- begin-model-doc -->
 * A strategy enumeration, how to handle a configuration. This stategy defines, how the column should be handled as well.
 * <!-- end-model-doc -->
 * @see de.jena.mdo.idmt.idmt.IdmtPackage#getModelStrategyType()
 * @model
 * @generated
 */
@ProviderType
public enum ModelStrategyType implements Enumerator {
	/**
	 * The '<em><b>PER DATASET</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The whole dataset resp. model configuration has priority. It is applied to all fields / column in the dataset. Column specific configruation overwrite this general setup.
	 * <!-- end-model-doc -->
	 * @see #PER_DATASET_VALUE
	 * @generated
	 * @ordered
	 */
	PER_DATASET(0, "PER_DATASET", "PER_DATASET"),

	/**
	 * The '<em><b>PER COLUMN IGNORE</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The whole dataset resp. model configuration is completely ignored. Only the column specific configruation are taken into account. Columns in the dataset that have no configuration are ignored
	 * <!-- end-model-doc -->
	 * @see #PER_COLUMN_IGNORE_VALUE
	 * @generated
	 * @ordered
	 */
	PER_COLUMN_IGNORE(1, "PER_COLUMN_IGNORE", "PER_COLUMN_IGNORE"),

	/**
	 * The '<em><b>PER COLUMN AS IS</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The whole dataset resp. model configuration is completely ignored. Only the column specific configruation are taken into account. Columns in the dataset that have no configuration are ignored
	 * <!-- end-model-doc -->
	 * @see #PER_COLUMN_AS_IS_VALUE
	 * @generated
	 * @ordered
	 */
	PER_COLUMN_AS_IS(1, "PER_COLUMN_AS_IS", "PER_COLUMN_AS_IS");

	/**
	 * The '<em><b>PER DATASET</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The whole dataset resp. model configuration has priority. It is applied to all fields / column in the dataset. Column specific configruation overwrite this general setup.
	 * <!-- end-model-doc -->
	 * @see #PER_DATASET
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int PER_DATASET_VALUE = 0;

	/**
	 * The '<em><b>PER COLUMN IGNORE</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The whole dataset resp. model configuration is completely ignored. Only the column specific configruation are taken into account. Columns in the dataset that have no configuration are ignored
	 * <!-- end-model-doc -->
	 * @see #PER_COLUMN_IGNORE
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int PER_COLUMN_IGNORE_VALUE = 1;

	/**
	 * The '<em><b>PER COLUMN AS IS</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The whole dataset resp. model configuration is completely ignored. Only the column specific configruation are taken into account. Columns in the dataset that have no configuration are ignored
	 * <!-- end-model-doc -->
	 * @see #PER_COLUMN_AS_IS
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int PER_COLUMN_AS_IS_VALUE = 1;

	/**
	 * An array of all the '<em><b>Model Strategy Type</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final ModelStrategyType[] VALUES_ARRAY =
		new ModelStrategyType[] {
			PER_DATASET,
			PER_COLUMN_IGNORE,
			PER_COLUMN_AS_IS,
		};

	/**
	 * A public read-only list of all the '<em><b>Model Strategy Type</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<ModelStrategyType> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Model Strategy Type</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param literal the literal.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static ModelStrategyType get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			ModelStrategyType result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Model Strategy Type</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name the name.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static ModelStrategyType getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			ModelStrategyType result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Model Strategy Type</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the integer value.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static ModelStrategyType get(int value) {
		switch (value) {
			case PER_DATASET_VALUE: return PER_DATASET;
			case PER_COLUMN_IGNORE_VALUE: return PER_COLUMN_IGNORE;
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
	private ModelStrategyType(int value, String name, String literal) {
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
	
} //ModelStrategyType
