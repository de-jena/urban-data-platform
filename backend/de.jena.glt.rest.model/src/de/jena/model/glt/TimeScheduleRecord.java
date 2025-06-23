/*
 */
package de.jena.model.glt;

import org.eclipse.emf.ecore.EObject;

import org.osgi.annotation.versioning.ProviderType;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Time Schedule Record</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.jena.model.glt.TimeScheduleRecord#getSystemId <em>System Id</em>}</li>
 *   <li>{@link de.jena.model.glt.TimeScheduleRecord#getId <em>Id</em>}</li>
 *   <li>{@link de.jena.model.glt.TimeScheduleRecord#getAddress <em>Address</em>}</li>
 *   <li>{@link de.jena.model.glt.TimeScheduleRecord#getOldValue <em>Old Value</em>}</li>
 *   <li>{@link de.jena.model.glt.TimeScheduleRecord#getNewValue <em>New Value</em>}</li>
 *   <li>{@link de.jena.model.glt.TimeScheduleRecord#getNote <em>Note</em>}</li>
 *   <li>{@link de.jena.model.glt.TimeScheduleRecord#getAuthor <em>Author</em>}</li>
 * </ul>
 *
 * @see de.jena.model.glt.GltPackage#getTimeScheduleRecord()
 * @model
 * @generated
 */
@ProviderType
public interface TimeScheduleRecord extends EObject {
	/**
	 * Returns the value of the '<em><b>System Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>System Id</em>' attribute.
	 * @see #setSystemId(Integer)
	 * @see de.jena.model.glt.GltPackage#getTimeScheduleRecord_SystemId()
	 * @model unique="false"
	 * @generated
	 */
	Integer getSystemId();

	/**
	 * Sets the value of the '{@link de.jena.model.glt.TimeScheduleRecord#getSystemId <em>System Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>System Id</em>' attribute.
	 * @see #getSystemId()
	 * @generated
	 */
	void setSystemId(Integer value);

	/**
	 * Returns the value of the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Id</em>' attribute.
	 * @see #setId(Integer)
	 * @see de.jena.model.glt.GltPackage#getTimeScheduleRecord_Id()
	 * @model unique="false"
	 * @generated
	 */
	Integer getId();

	/**
	 * Sets the value of the '{@link de.jena.model.glt.TimeScheduleRecord#getId <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Id</em>' attribute.
	 * @see #getId()
	 * @generated
	 */
	void setId(Integer value);

	/**
	 * Returns the value of the '<em><b>Address</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Address</em>' attribute.
	 * @see #setAddress(String)
	 * @see de.jena.model.glt.GltPackage#getTimeScheduleRecord_Address()
	 * @model unique="false"
	 * @generated
	 */
	String getAddress();

	/**
	 * Sets the value of the '{@link de.jena.model.glt.TimeScheduleRecord#getAddress <em>Address</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Address</em>' attribute.
	 * @see #getAddress()
	 * @generated
	 */
	void setAddress(String value);

	/**
	 * Returns the value of the '<em><b>Old Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Old Value</em>' attribute.
	 * @see #setOldValue(String)
	 * @see de.jena.model.glt.GltPackage#getTimeScheduleRecord_OldValue()
	 * @model unique="false"
	 * @generated
	 */
	String getOldValue();

	/**
	 * Sets the value of the '{@link de.jena.model.glt.TimeScheduleRecord#getOldValue <em>Old Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Old Value</em>' attribute.
	 * @see #getOldValue()
	 * @generated
	 */
	void setOldValue(String value);

	/**
	 * Returns the value of the '<em><b>New Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>New Value</em>' attribute.
	 * @see #setNewValue(String)
	 * @see de.jena.model.glt.GltPackage#getTimeScheduleRecord_NewValue()
	 * @model unique="false"
	 * @generated
	 */
	String getNewValue();

	/**
	 * Sets the value of the '{@link de.jena.model.glt.TimeScheduleRecord#getNewValue <em>New Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>New Value</em>' attribute.
	 * @see #getNewValue()
	 * @generated
	 */
	void setNewValue(String value);

	/**
	 * Returns the value of the '<em><b>Note</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Note</em>' attribute.
	 * @see #setNote(String)
	 * @see de.jena.model.glt.GltPackage#getTimeScheduleRecord_Note()
	 * @model unique="false"
	 * @generated
	 */
	String getNote();

	/**
	 * Sets the value of the '{@link de.jena.model.glt.TimeScheduleRecord#getNote <em>Note</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Note</em>' attribute.
	 * @see #getNote()
	 * @generated
	 */
	void setNote(String value);

	/**
	 * Returns the value of the '<em><b>Author</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Author</em>' attribute.
	 * @see #setAuthor(String)
	 * @see de.jena.model.glt.GltPackage#getTimeScheduleRecord_Author()
	 * @model unique="false"
	 * @generated
	 */
	String getAuthor();

	/**
	 * Sets the value of the '{@link de.jena.model.glt.TimeScheduleRecord#getAuthor <em>Author</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Author</em>' attribute.
	 * @see #getAuthor()
	 * @generated
	 */
	void setAuthor(String value);

} // TimeScheduleRecord
