/*
 */
package de.jena.model.glt;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

import org.osgi.annotation.versioning.ProviderType;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Response</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.jena.model.glt.Response#getCode <em>Code</em>}</li>
 *   <li>{@link de.jena.model.glt.Response#getDescription <em>Description</em>}</li>
 *   <li>{@link de.jena.model.glt.Response#getResponse <em>Response</em>}</li>
 *   <li>{@link de.jena.model.glt.Response#getResult <em>Result</em>}</li>
 * </ul>
 *
 * @see de.jena.model.glt.GltPackage#getResponse()
 * @model
 * @generated
 */
@ProviderType
public interface Response extends EObject {
	/**
	 * Returns the value of the '<em><b>Code</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Code</em>' attribute.
	 * @see #setCode(int)
	 * @see de.jena.model.glt.GltPackage#getResponse_Code()
	 * @model unique="false"
	 * @generated
	 */
	int getCode();

	/**
	 * Sets the value of the '{@link de.jena.model.glt.Response#getCode <em>Code</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Code</em>' attribute.
	 * @see #getCode()
	 * @generated
	 */
	void setCode(int value);

	/**
	 * Returns the value of the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Description</em>' attribute.
	 * @see #setDescription(String)
	 * @see de.jena.model.glt.GltPackage#getResponse_Description()
	 * @model unique="false"
	 * @generated
	 */
	String getDescription();

	/**
	 * Sets the value of the '{@link de.jena.model.glt.Response#getDescription <em>Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Description</em>' attribute.
	 * @see #getDescription()
	 * @generated
	 */
	void setDescription(String value);

	/**
	 * Returns the value of the '<em><b>Response</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Response</em>' attribute.
	 * @see #setResponse(jakarta.ws.rs.core.Response)
	 * @see de.jena.model.glt.GltPackage#getResponse_Response()
	 * @model unique="false" dataType="de.jena.model.glt.JResponse"
	 * @generated
	 */
	jakarta.ws.rs.core.Response getResponse();

	/**
	 * Sets the value of the '{@link de.jena.model.glt.Response#getResponse <em>Response</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Response</em>' attribute.
	 * @see #getResponse()
	 * @generated
	 */
	void setResponse(jakarta.ws.rs.core.Response value);

	/**
	 * Returns the value of the '<em><b>Result</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.emf.ecore.EObject}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Result</em>' containment reference list.
	 * @see de.jena.model.glt.GltPackage#getResponse_Result()
	 * @model containment="true"
	 * @generated
	 */
	EList<EObject> getResult();

} // Response
