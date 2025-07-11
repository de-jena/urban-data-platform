/*
 */
package de.jena.model.glt;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

import org.osgi.annotation.versioning.ProviderType;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Datalog Content Pojo</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.jena.model.glt.DatalogContentPojo#getSystemId <em>System Id</em>}</li>
 *   <li>{@link de.jena.model.glt.DatalogContentPojo#getId <em>Id</em>}</li>
 *   <li>{@link de.jena.model.glt.DatalogContentPojo#getName <em>Name</em>}</li>
 *   <li>{@link de.jena.model.glt.DatalogContentPojo#getValueType <em>Value Type</em>}</li>
 *   <li>{@link de.jena.model.glt.DatalogContentPojo#getDatalogType <em>Datalog Type</em>}</li>
 *   <li>{@link de.jena.model.glt.DatalogContentPojo#getPointNumber <em>Point Number</em>}</li>
 *   <li>{@link de.jena.model.glt.DatalogContentPojo#getPointName <em>Point Name</em>}</li>
 *   <li>{@link de.jena.model.glt.DatalogContentPojo#getPointId <em>Point Id</em>}</li>
 *   <li>{@link de.jena.model.glt.DatalogContentPojo#getEntriesT <em>Entries T</em>}</li>
 *   <li>{@link de.jena.model.glt.DatalogContentPojo#getEntriesV <em>Entries V</em>}</li>
 *   <li>{@link de.jena.model.glt.DatalogContentPojo#getTime <em>Time</em>}</li>
 *   <li>{@link de.jena.model.glt.DatalogContentPojo#getTimeController <em>Time Controller</em>}</li>
 *   <li>{@link de.jena.model.glt.DatalogContentPojo#getCounter <em>Counter</em>}</li>
 *   <li>{@link de.jena.model.glt.DatalogContentPojo#getValue <em>Value</em>}</li>
 *   <li>{@link de.jena.model.glt.DatalogContentPojo#getIsUnknown <em>Is Unknown</em>}</li>
 *   <li>{@link de.jena.model.glt.DatalogContentPojo#getIsError <em>Is Error</em>}</li>
 *   <li>{@link de.jena.model.glt.DatalogContentPojo#getComments <em>Comments</em>}</li>
 * </ul>
 *
 * @see de.jena.model.glt.GltPackage#getDatalogContentPojo()
 * @model
 * @generated
 */
@ProviderType
public interface DatalogContentPojo extends EObject {
	/**
	 * Returns the value of the '<em><b>System Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>System Id</em>' attribute.
	 * @see #setSystemId(Integer)
	 * @see de.jena.model.glt.GltPackage#getDatalogContentPojo_SystemId()
	 * @model unique="false"
	 * @generated
	 */
	Integer getSystemId();

	/**
	 * Sets the value of the '{@link de.jena.model.glt.DatalogContentPojo#getSystemId <em>System Id</em>}' attribute.
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
	 * @see de.jena.model.glt.GltPackage#getDatalogContentPojo_Id()
	 * @model unique="false"
	 * @generated
	 */
	Integer getId();

	/**
	 * Sets the value of the '{@link de.jena.model.glt.DatalogContentPojo#getId <em>Id</em>}' attribute.
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
	 * @see de.jena.model.glt.GltPackage#getDatalogContentPojo_Name()
	 * @model unique="false"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link de.jena.model.glt.DatalogContentPojo#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Value Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Value Type</em>' attribute.
	 * @see #setValueType(String)
	 * @see de.jena.model.glt.GltPackage#getDatalogContentPojo_ValueType()
	 * @model unique="false"
	 * @generated
	 */
	String getValueType();

	/**
	 * Sets the value of the '{@link de.jena.model.glt.DatalogContentPojo#getValueType <em>Value Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Value Type</em>' attribute.
	 * @see #getValueType()
	 * @generated
	 */
	void setValueType(String value);

	/**
	 * Returns the value of the '<em><b>Datalog Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Datalog Type</em>' attribute.
	 * @see #setDatalogType(String)
	 * @see de.jena.model.glt.GltPackage#getDatalogContentPojo_DatalogType()
	 * @model unique="false"
	 * @generated
	 */
	String getDatalogType();

	/**
	 * Sets the value of the '{@link de.jena.model.glt.DatalogContentPojo#getDatalogType <em>Datalog Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Datalog Type</em>' attribute.
	 * @see #getDatalogType()
	 * @generated
	 */
	void setDatalogType(String value);

	/**
	 * Returns the value of the '<em><b>Point Number</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Point Number</em>' attribute.
	 * @see #setPointNumber(Integer)
	 * @see de.jena.model.glt.GltPackage#getDatalogContentPojo_PointNumber()
	 * @model unique="false"
	 * @generated
	 */
	Integer getPointNumber();

	/**
	 * Sets the value of the '{@link de.jena.model.glt.DatalogContentPojo#getPointNumber <em>Point Number</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Point Number</em>' attribute.
	 * @see #getPointNumber()
	 * @generated
	 */
	void setPointNumber(Integer value);

	/**
	 * Returns the value of the '<em><b>Point Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Point Name</em>' attribute.
	 * @see #setPointName(String)
	 * @see de.jena.model.glt.GltPackage#getDatalogContentPojo_PointName()
	 * @model unique="false"
	 * @generated
	 */
	String getPointName();

	/**
	 * Sets the value of the '{@link de.jena.model.glt.DatalogContentPojo#getPointName <em>Point Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Point Name</em>' attribute.
	 * @see #getPointName()
	 * @generated
	 */
	void setPointName(String value);

	/**
	 * Returns the value of the '<em><b>Point Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Point Id</em>' attribute.
	 * @see #setPointId(Integer)
	 * @see de.jena.model.glt.GltPackage#getDatalogContentPojo_PointId()
	 * @model unique="false"
	 * @generated
	 */
	Integer getPointId();

	/**
	 * Sets the value of the '{@link de.jena.model.glt.DatalogContentPojo#getPointId <em>Point Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Point Id</em>' attribute.
	 * @see #getPointId()
	 * @generated
	 */
	void setPointId(Integer value);

	/**
	 * Returns the value of the '<em><b>Entries T</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.String}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Entries T</em>' attribute list.
	 * @see de.jena.model.glt.GltPackage#getDatalogContentPojo_EntriesT()
	 * @model unique="false"
	 * @generated
	 */
	EList<String> getEntriesT();

	/**
	 * Returns the value of the '<em><b>Entries V</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.Float}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Entries V</em>' attribute list.
	 * @see de.jena.model.glt.GltPackage#getDatalogContentPojo_EntriesV()
	 * @model unique="false"
	 * @generated
	 */
	EList<Float> getEntriesV();

	/**
	 * Returns the value of the '<em><b>Time</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Time</em>' attribute.
	 * @see #setTime(String)
	 * @see de.jena.model.glt.GltPackage#getDatalogContentPojo_Time()
	 * @model unique="false"
	 * @generated
	 */
	String getTime();

	/**
	 * Sets the value of the '{@link de.jena.model.glt.DatalogContentPojo#getTime <em>Time</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Time</em>' attribute.
	 * @see #getTime()
	 * @generated
	 */
	void setTime(String value);

	/**
	 * Returns the value of the '<em><b>Time Controller</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Time Controller</em>' attribute.
	 * @see #setTimeController(String)
	 * @see de.jena.model.glt.GltPackage#getDatalogContentPojo_TimeController()
	 * @model unique="false"
	 * @generated
	 */
	String getTimeController();

	/**
	 * Sets the value of the '{@link de.jena.model.glt.DatalogContentPojo#getTimeController <em>Time Controller</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Time Controller</em>' attribute.
	 * @see #getTimeController()
	 * @generated
	 */
	void setTimeController(String value);

	/**
	 * Returns the value of the '<em><b>Counter</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Counter</em>' attribute.
	 * @see #setCounter(Integer)
	 * @see de.jena.model.glt.GltPackage#getDatalogContentPojo_Counter()
	 * @model unique="false"
	 * @generated
	 */
	Integer getCounter();

	/**
	 * Sets the value of the '{@link de.jena.model.glt.DatalogContentPojo#getCounter <em>Counter</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Counter</em>' attribute.
	 * @see #getCounter()
	 * @generated
	 */
	void setCounter(Integer value);

	/**
	 * Returns the value of the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Value</em>' attribute.
	 * @see #setValue(Float)
	 * @see de.jena.model.glt.GltPackage#getDatalogContentPojo_Value()
	 * @model unique="false"
	 * @generated
	 */
	Float getValue();

	/**
	 * Sets the value of the '{@link de.jena.model.glt.DatalogContentPojo#getValue <em>Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Value</em>' attribute.
	 * @see #getValue()
	 * @generated
	 */
	void setValue(Float value);

	/**
	 * Returns the value of the '<em><b>Is Unknown</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Is Unknown</em>' attribute.
	 * @see #setIsUnknown(Boolean)
	 * @see de.jena.model.glt.GltPackage#getDatalogContentPojo_IsUnknown()
	 * @model unique="false"
	 * @generated
	 */
	Boolean getIsUnknown();

	/**
	 * Sets the value of the '{@link de.jena.model.glt.DatalogContentPojo#getIsUnknown <em>Is Unknown</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Is Unknown</em>' attribute.
	 * @see #getIsUnknown()
	 * @generated
	 */
	void setIsUnknown(Boolean value);

	/**
	 * Returns the value of the '<em><b>Is Error</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Is Error</em>' attribute.
	 * @see #setIsError(Boolean)
	 * @see de.jena.model.glt.GltPackage#getDatalogContentPojo_IsError()
	 * @model unique="false"
	 * @generated
	 */
	Boolean getIsError();

	/**
	 * Sets the value of the '{@link de.jena.model.glt.DatalogContentPojo#getIsError <em>Is Error</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Is Error</em>' attribute.
	 * @see #getIsError()
	 * @generated
	 */
	void setIsError(Boolean value);

	/**
	 * Returns the value of the '<em><b>Comments</b></em>' containment reference list.
	 * The list contents are of type {@link de.jena.model.glt.CommentPojo}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Comments</em>' containment reference list.
	 * @see de.jena.model.glt.GltPackage#getDatalogContentPojo_Comments()
	 * @model containment="true"
	 * @generated
	 */
	EList<CommentPojo> getComments();

} // DatalogContentPojo
