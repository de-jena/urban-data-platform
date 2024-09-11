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
 * A representation of the literals of the enumeration '<em><b>Response Type</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * <!-- begin-model-doc -->
 * Defines the type of a response
 * <!-- end-model-doc -->
 * @see de.jena.mdo.idmt.idmt.IdmtPackage#getResponseType()
 * @model
 * @generated
 */
@ProviderType
public enum ResponseType implements Enumerator {
	/**
	 * The '<em><b>DEFAULT</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Default response for a synchronous or asynchronous call
	 * <!-- end-model-doc -->
	 * @see #DEFAULT_VALUE
	 * @generated
	 * @ordered
	 */
	DEFAULT(0, "DEFAULT", "DEFAULT"),

	/**
	 * The '<em><b>DRY RESPONSE</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Reponse for a dry run request
	 * <!-- end-model-doc -->
	 * @see #DRY_RESPONSE_VALUE
	 * @generated
	 * @ordered
	 */
	DRY_RESPONSE(1, "DRY_RESPONSE", "EClassURi"),

	/**
	 * The '<em><b>ASYNC RESPONSE</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Response for an asynchropnous call that returned intermediate information immediately. This response type can be used for very long running operations. The information can be used to get the request status using the corresponding operation
	 * <!-- end-model-doc -->
	 * @see #ASYNC_RESPONSE_VALUE
	 * @generated
	 * @ordered
	 */
	ASYNC_RESPONSE(2, "ASYNC_RESPONSE", "ASYNC_RESPONSE"),

	/**
	 * The '<em><b>ASYNC RUNNING</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Response for an asynchropnous call that returned intermediate information immediately. This response type can be used for very long running operations and status request. It indicates, that the process is still running. If the result finished the ASYNC RESPONSE will be provided.
	 * <!-- end-model-doc -->
	 * @see #ASYNC_RUNNING_VALUE
	 * @generated
	 * @ordered
	 */
	ASYNC_RUNNING(3, "ASYNC_RUNNING", "ASYNC_RUNNING"),

	/**
	 * The '<em><b>ASYNC CANCELLED</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Response for an asynchropnous call that returned intermediate information immediately. This response type can be used for very long running operations and status request. It indicates, that the process is still running. If the result finished the ASYNC RESPONSE will be provided.
	 * <!-- end-model-doc -->
	 * @see #ASYNC_CANCELLED_VALUE
	 * @generated
	 * @ordered
	 */
	ASYNC_CANCELLED(4, "ASYNC_CANCELLED", "ASYNC_CANCELLED"),

	/**
	 * The '<em><b>ERROR</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ERROR_VALUE
	 * @generated
	 * @ordered
	 */
	ERROR(10, "ERROR", "ERROR");

	/**
	 * The '<em><b>DEFAULT</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Default response for a synchronous or asynchronous call
	 * <!-- end-model-doc -->
	 * @see #DEFAULT
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int DEFAULT_VALUE = 0;

	/**
	 * The '<em><b>DRY RESPONSE</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Reponse for a dry run request
	 * <!-- end-model-doc -->
	 * @see #DRY_RESPONSE
	 * @model literal="EClassURi"
	 *        annotation="Codec mappedEClassUri='http://gecko/address#//Person'"
	 * @generated
	 * @ordered
	 */
	public static final int DRY_RESPONSE_VALUE = 1;

	/**
	 * The '<em><b>ASYNC RESPONSE</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Response for an asynchropnous call that returned intermediate information immediately. This response type can be used for very long running operations. The information can be used to get the request status using the corresponding operation
	 * <!-- end-model-doc -->
	 * @see #ASYNC_RESPONSE
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int ASYNC_RESPONSE_VALUE = 2;

	/**
	 * The '<em><b>ASYNC RUNNING</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Response for an asynchropnous call that returned intermediate information immediately. This response type can be used for very long running operations and status request. It indicates, that the process is still running. If the result finished the ASYNC RESPONSE will be provided.
	 * <!-- end-model-doc -->
	 * @see #ASYNC_RUNNING
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int ASYNC_RUNNING_VALUE = 3;

	/**
	 * The '<em><b>ASYNC CANCELLED</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Response for an asynchropnous call that returned intermediate information immediately. This response type can be used for very long running operations and status request. It indicates, that the process is still running. If the result finished the ASYNC RESPONSE will be provided.
	 * <!-- end-model-doc -->
	 * @see #ASYNC_CANCELLED
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int ASYNC_CANCELLED_VALUE = 4;

	/**
	 * The '<em><b>ERROR</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ERROR
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int ERROR_VALUE = 10;

	/**
	 * An array of all the '<em><b>Response Type</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final ResponseType[] VALUES_ARRAY =
		new ResponseType[] {
			DEFAULT,
			DRY_RESPONSE,
			ASYNC_RESPONSE,
			ASYNC_RUNNING,
			ASYNC_CANCELLED,
			ERROR,
		};

	/**
	 * A public read-only list of all the '<em><b>Response Type</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<ResponseType> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Response Type</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param literal the literal.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static ResponseType get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			ResponseType result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Response Type</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name the name.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static ResponseType getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			ResponseType result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Response Type</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the integer value.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static ResponseType get(int value) {
		switch (value) {
			case DEFAULT_VALUE: return DEFAULT;
			case DRY_RESPONSE_VALUE: return DRY_RESPONSE;
			case ASYNC_RESPONSE_VALUE: return ASYNC_RESPONSE;
			case ASYNC_RUNNING_VALUE: return ASYNC_RUNNING;
			case ASYNC_CANCELLED_VALUE: return ASYNC_CANCELLED;
			case ERROR_VALUE: return ERROR;
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
	private ResponseType(int value, String name, String literal) {
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
	
} //ResponseType
