/*
 */
package de.jena.model.glt;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

import org.osgi.annotation.versioning.ProviderType;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Point Value Pojo</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.jena.model.glt.PointValuePojo#getSystemId <em>System Id</em>}</li>
 *   <li>{@link de.jena.model.glt.PointValuePojo#getId <em>Id</em>}</li>
 *   <li>{@link de.jena.model.glt.PointValuePojo#getName <em>Name</em>}</li>
 *   <li>{@link de.jena.model.glt.PointValuePojo#getValue <em>Value</em>}</li>
 *   <li>{@link de.jena.model.glt.PointValuePojo#getValuePrev <em>Value Prev</em>}</li>
 *   <li>{@link de.jena.model.glt.PointValuePojo#getTime <em>Time</em>}</li>
 *   <li>{@link de.jena.model.glt.PointValuePojo#getOverrideState <em>Override State</em>}</li>
 *   <li>{@link de.jena.model.glt.PointValuePojo#getIsUnknown <em>Is Unknown</em>}</li>
 *   <li>{@link de.jena.model.glt.PointValuePojo#getComments <em>Comments</em>}</li>
 * </ul>
 *
 * @see de.jena.model.glt.GltPackage#getPointValuePojo()
 * @model
 * @generated
 */
@ProviderType
public interface PointValuePojo extends EObject {
	/**
	 * Returns the value of the '<em><b>System Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>System Id</em>' attribute.
	 * @see #setSystemId(Integer)
	 * @see de.jena.model.glt.GltPackage#getPointValuePojo_SystemId()
	 * @model
	 * @generated
	 */
	Integer getSystemId();

	/**
	 * Sets the value of the '{@link de.jena.model.glt.PointValuePojo#getSystemId <em>System Id</em>}' attribute.
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
	 * @see de.jena.model.glt.GltPackage#getPointValuePojo_Id()
	 * @model
	 * @generated
	 */
	Integer getId();

	/**
	 * Sets the value of the '{@link de.jena.model.glt.PointValuePojo#getId <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Id</em>' attribute.
	 * @see #getId()
	 * @generated
	 */
	void setId(Integer value);

	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see de.jena.model.glt.GltPackage#getPointValuePojo_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link de.jena.model.glt.PointValuePojo#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Value</em>' attribute.
	 * @see #setValue(Float)
	 * @see de.jena.model.glt.GltPackage#getPointValuePojo_Value()
	 * @model
	 * @generated
	 */
	Float getValue();

	/**
	 * Sets the value of the '{@link de.jena.model.glt.PointValuePojo#getValue <em>Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Value</em>' attribute.
	 * @see #getValue()
	 * @generated
	 */
	void setValue(Float value);

	/**
	 * Returns the value of the '<em><b>Value Prev</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Value Prev</em>' attribute.
	 * @see #setValuePrev(Float)
	 * @see de.jena.model.glt.GltPackage#getPointValuePojo_ValuePrev()
	 * @model
	 * @generated
	 */
	Float getValuePrev();

	/**
	 * Sets the value of the '{@link de.jena.model.glt.PointValuePojo#getValuePrev <em>Value Prev</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Value Prev</em>' attribute.
	 * @see #getValuePrev()
	 * @generated
	 */
	void setValuePrev(Float value);

	/**
	 * Returns the value of the '<em><b>Time</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Time</em>' attribute.
	 * @see #setTime(String)
	 * @see de.jena.model.glt.GltPackage#getPointValuePojo_Time()
	 * @model
	 * @generated
	 */
	String getTime();

	/**
	 * Sets the value of the '{@link de.jena.model.glt.PointValuePojo#getTime <em>Time</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Time</em>' attribute.
	 * @see #getTime()
	 * @generated
	 */
	void setTime(String value);

	/**
	 * Returns the value of the '<em><b>Override State</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Override State</em>' attribute.
	 * @see #setOverrideState(Integer)
	 * @see de.jena.model.glt.GltPackage#getPointValuePojo_OverrideState()
	 * @model
	 * @generated
	 */
	Integer getOverrideState();

	/**
	 * Sets the value of the '{@link de.jena.model.glt.PointValuePojo#getOverrideState <em>Override State</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Override State</em>' attribute.
	 * @see #getOverrideState()
	 * @generated
	 */
	void setOverrideState(Integer value);

	/**
	 * Returns the value of the '<em><b>Is Unknown</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Is Unknown</em>' attribute.
	 * @see #setIsUnknown(Boolean)
	 * @see de.jena.model.glt.GltPackage#getPointValuePojo_IsUnknown()
	 * @model
	 * @generated
	 */
	Boolean getIsUnknown();

	/**
	 * Sets the value of the '{@link de.jena.model.glt.PointValuePojo#getIsUnknown <em>Is Unknown</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Is Unknown</em>' attribute.
	 * @see #getIsUnknown()
	 * @generated
	 */
	void setIsUnknown(Boolean value);

	/**
	 * Returns the value of the '<em><b>Comments</b></em>' reference list.
	 * The list contents are of type {@link de.jena.model.glt.CommentPojo}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Comments</em>' reference list.
	 * @see de.jena.model.glt.GltPackage#getPointValuePojo_Comments()
	 * @model
	 * @generated
	 */
	EList<CommentPojo> getComments();

} // PointValuePojo
