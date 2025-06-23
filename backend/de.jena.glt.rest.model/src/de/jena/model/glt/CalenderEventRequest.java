/*
 */
package de.jena.model.glt;

import org.eclipse.emf.ecore.EObject;

import org.osgi.annotation.versioning.ProviderType;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Calender Event Request</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.jena.model.glt.CalenderEventRequest#getFrom <em>From</em>}</li>
 *   <li>{@link de.jena.model.glt.CalenderEventRequest#getTo <em>To</em>}</li>
 *   <li>{@link de.jena.model.glt.CalenderEventRequest#getNote <em>Note</em>}</li>
 *   <li>{@link de.jena.model.glt.CalenderEventRequest#getType <em>Type</em>}</li>
 * </ul>
 *
 * @see de.jena.model.glt.GltPackage#getCalenderEventRequest()
 * @model
 * @generated
 */
@ProviderType
public interface CalenderEventRequest extends EObject {
	/**
	 * Returns the value of the '<em><b>From</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>From</em>' attribute.
	 * @see #setFrom(String)
	 * @see de.jena.model.glt.GltPackage#getCalenderEventRequest_From()
	 * @model unique="false"
	 * @generated
	 */
	String getFrom();

	/**
	 * Sets the value of the '{@link de.jena.model.glt.CalenderEventRequest#getFrom <em>From</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>From</em>' attribute.
	 * @see #getFrom()
	 * @generated
	 */
	void setFrom(String value);

	/**
	 * Returns the value of the '<em><b>To</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>To</em>' attribute.
	 * @see #setTo(String)
	 * @see de.jena.model.glt.GltPackage#getCalenderEventRequest_To()
	 * @model unique="false"
	 * @generated
	 */
	String getTo();

	/**
	 * Sets the value of the '{@link de.jena.model.glt.CalenderEventRequest#getTo <em>To</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>To</em>' attribute.
	 * @see #getTo()
	 * @generated
	 */
	void setTo(String value);

	/**
	 * Returns the value of the '<em><b>Note</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Note</em>' attribute.
	 * @see #setNote(String)
	 * @see de.jena.model.glt.GltPackage#getCalenderEventRequest_Note()
	 * @model unique="false"
	 * @generated
	 */
	String getNote();

	/**
	 * Sets the value of the '{@link de.jena.model.glt.CalenderEventRequest#getNote <em>Note</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Note</em>' attribute.
	 * @see #getNote()
	 * @generated
	 */
	void setNote(String value);

	/**
	 * Returns the value of the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Type</em>' attribute.
	 * @see #setType(String)
	 * @see de.jena.model.glt.GltPackage#getCalenderEventRequest_Type()
	 * @model unique="false"
	 * @generated
	 */
	String getType();

	/**
	 * Sets the value of the '{@link de.jena.model.glt.CalenderEventRequest#getType <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type</em>' attribute.
	 * @see #getType()
	 * @generated
	 */
	void setType(String value);

} // CalenderEventRequest
