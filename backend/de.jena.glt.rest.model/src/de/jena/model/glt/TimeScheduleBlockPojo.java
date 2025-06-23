/*
 */
package de.jena.model.glt;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

import org.osgi.annotation.versioning.ProviderType;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Time Schedule Block Pojo</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.jena.model.glt.TimeScheduleBlockPojo#getSystemId <em>System Id</em>}</li>
 *   <li>{@link de.jena.model.glt.TimeScheduleBlockPojo#getId <em>Id</em>}</li>
 *   <li>{@link de.jena.model.glt.TimeScheduleBlockPojo#getBlock <em>Block</em>}</li>
 *   <li>{@link de.jena.model.glt.TimeScheduleBlockPojo#getExceptionStartDay <em>Exception Start Day</em>}</li>
 *   <li>{@link de.jena.model.glt.TimeScheduleBlockPojo#getExceptionStartMonth <em>Exception Start Month</em>}</li>
 *   <li>{@link de.jena.model.glt.TimeScheduleBlockPojo#getExceptionEndDay <em>Exception End Day</em>}</li>
 *   <li>{@link de.jena.model.glt.TimeScheduleBlockPojo#getExceptionEndMonth <em>Exception End Month</em>}</li>
 *   <li>{@link de.jena.model.glt.TimeScheduleBlockPojo#getYear <em>Year</em>}</li>
 *   <li>{@link de.jena.model.glt.TimeScheduleBlockPojo#getTimes <em>Times</em>}</li>
 *   <li>{@link de.jena.model.glt.TimeScheduleBlockPojo#getTime <em>Time</em>}</li>
 *   <li>{@link de.jena.model.glt.TimeScheduleBlockPojo#getIsUnknown <em>Is Unknown</em>}</li>
 *   <li>{@link de.jena.model.glt.TimeScheduleBlockPojo#getAuthor <em>Author</em>}</li>
 *   <li>{@link de.jena.model.glt.TimeScheduleBlockPojo#getComments <em>Comments</em>}</li>
 * </ul>
 *
 * @see de.jena.model.glt.GltPackage#getTimeScheduleBlockPojo()
 * @model
 * @generated
 */
@ProviderType
public interface TimeScheduleBlockPojo extends EObject {
	/**
	 * Returns the value of the '<em><b>System Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>System Id</em>' attribute.
	 * @see #setSystemId(Integer)
	 * @see de.jena.model.glt.GltPackage#getTimeScheduleBlockPojo_SystemId()
	 * @model unique="false"
	 * @generated
	 */
	Integer getSystemId();

	/**
	 * Sets the value of the '{@link de.jena.model.glt.TimeScheduleBlockPojo#getSystemId <em>System Id</em>}' attribute.
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
	 * @see de.jena.model.glt.GltPackage#getTimeScheduleBlockPojo_Id()
	 * @model unique="false"
	 * @generated
	 */
	Integer getId();

	/**
	 * Sets the value of the '{@link de.jena.model.glt.TimeScheduleBlockPojo#getId <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Id</em>' attribute.
	 * @see #getId()
	 * @generated
	 */
	void setId(Integer value);

	/**
	 * Returns the value of the '<em><b>Block</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Block</em>' attribute.
	 * @see #setBlock(Integer)
	 * @see de.jena.model.glt.GltPackage#getTimeScheduleBlockPojo_Block()
	 * @model unique="false"
	 * @generated
	 */
	Integer getBlock();

	/**
	 * Sets the value of the '{@link de.jena.model.glt.TimeScheduleBlockPojo#getBlock <em>Block</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Block</em>' attribute.
	 * @see #getBlock()
	 * @generated
	 */
	void setBlock(Integer value);

	/**
	 * Returns the value of the '<em><b>Exception Start Day</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Exception Start Day</em>' attribute.
	 * @see #setExceptionStartDay(Integer)
	 * @see de.jena.model.glt.GltPackage#getTimeScheduleBlockPojo_ExceptionStartDay()
	 * @model unique="false"
	 * @generated
	 */
	Integer getExceptionStartDay();

	/**
	 * Sets the value of the '{@link de.jena.model.glt.TimeScheduleBlockPojo#getExceptionStartDay <em>Exception Start Day</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Exception Start Day</em>' attribute.
	 * @see #getExceptionStartDay()
	 * @generated
	 */
	void setExceptionStartDay(Integer value);

	/**
	 * Returns the value of the '<em><b>Exception Start Month</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Exception Start Month</em>' attribute.
	 * @see #setExceptionStartMonth(Integer)
	 * @see de.jena.model.glt.GltPackage#getTimeScheduleBlockPojo_ExceptionStartMonth()
	 * @model unique="false"
	 * @generated
	 */
	Integer getExceptionStartMonth();

	/**
	 * Sets the value of the '{@link de.jena.model.glt.TimeScheduleBlockPojo#getExceptionStartMonth <em>Exception Start Month</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Exception Start Month</em>' attribute.
	 * @see #getExceptionStartMonth()
	 * @generated
	 */
	void setExceptionStartMonth(Integer value);

	/**
	 * Returns the value of the '<em><b>Exception End Day</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Exception End Day</em>' attribute.
	 * @see #setExceptionEndDay(Integer)
	 * @see de.jena.model.glt.GltPackage#getTimeScheduleBlockPojo_ExceptionEndDay()
	 * @model unique="false"
	 * @generated
	 */
	Integer getExceptionEndDay();

	/**
	 * Sets the value of the '{@link de.jena.model.glt.TimeScheduleBlockPojo#getExceptionEndDay <em>Exception End Day</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Exception End Day</em>' attribute.
	 * @see #getExceptionEndDay()
	 * @generated
	 */
	void setExceptionEndDay(Integer value);

	/**
	 * Returns the value of the '<em><b>Exception End Month</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Exception End Month</em>' attribute.
	 * @see #setExceptionEndMonth(Integer)
	 * @see de.jena.model.glt.GltPackage#getTimeScheduleBlockPojo_ExceptionEndMonth()
	 * @model unique="false"
	 * @generated
	 */
	Integer getExceptionEndMonth();

	/**
	 * Sets the value of the '{@link de.jena.model.glt.TimeScheduleBlockPojo#getExceptionEndMonth <em>Exception End Month</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Exception End Month</em>' attribute.
	 * @see #getExceptionEndMonth()
	 * @generated
	 */
	void setExceptionEndMonth(Integer value);

	/**
	 * Returns the value of the '<em><b>Year</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Year</em>' attribute.
	 * @see #setYear(Integer)
	 * @see de.jena.model.glt.GltPackage#getTimeScheduleBlockPojo_Year()
	 * @model unique="false"
	 * @generated
	 */
	Integer getYear();

	/**
	 * Sets the value of the '{@link de.jena.model.glt.TimeScheduleBlockPojo#getYear <em>Year</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Year</em>' attribute.
	 * @see #getYear()
	 * @generated
	 */
	void setYear(Integer value);

	/**
	 * Returns the value of the '<em><b>Times</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Times</em>' attribute.
	 * @see #setTimes(Object)
	 * @see de.jena.model.glt.GltPackage#getTimeScheduleBlockPojo_Times()
	 * @model unique="false"
	 * @generated
	 */
	Object getTimes();

	/**
	 * Sets the value of the '{@link de.jena.model.glt.TimeScheduleBlockPojo#getTimes <em>Times</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Times</em>' attribute.
	 * @see #getTimes()
	 * @generated
	 */
	void setTimes(Object value);

	/**
	 * Returns the value of the '<em><b>Time</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Time</em>' attribute.
	 * @see #setTime(String)
	 * @see de.jena.model.glt.GltPackage#getTimeScheduleBlockPojo_Time()
	 * @model unique="false"
	 * @generated
	 */
	String getTime();

	/**
	 * Sets the value of the '{@link de.jena.model.glt.TimeScheduleBlockPojo#getTime <em>Time</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Time</em>' attribute.
	 * @see #getTime()
	 * @generated
	 */
	void setTime(String value);

	/**
	 * Returns the value of the '<em><b>Is Unknown</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Is Unknown</em>' attribute.
	 * @see #setIsUnknown(Boolean)
	 * @see de.jena.model.glt.GltPackage#getTimeScheduleBlockPojo_IsUnknown()
	 * @model unique="false"
	 * @generated
	 */
	Boolean getIsUnknown();

	/**
	 * Sets the value of the '{@link de.jena.model.glt.TimeScheduleBlockPojo#getIsUnknown <em>Is Unknown</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Is Unknown</em>' attribute.
	 * @see #getIsUnknown()
	 * @generated
	 */
	void setIsUnknown(Boolean value);

	/**
	 * Returns the value of the '<em><b>Author</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Author</em>' attribute.
	 * @see #setAuthor(String)
	 * @see de.jena.model.glt.GltPackage#getTimeScheduleBlockPojo_Author()
	 * @model unique="false"
	 * @generated
	 */
	String getAuthor();

	/**
	 * Sets the value of the '{@link de.jena.model.glt.TimeScheduleBlockPojo#getAuthor <em>Author</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Author</em>' attribute.
	 * @see #getAuthor()
	 * @generated
	 */
	void setAuthor(String value);

	/**
	 * Returns the value of the '<em><b>Comments</b></em>' containment reference list.
	 * The list contents are of type {@link de.jena.model.glt.CommentPojo}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Comments</em>' containment reference list.
	 * @see de.jena.model.glt.GltPackage#getTimeScheduleBlockPojo_Comments()
	 * @model containment="true"
	 * @generated
	 */
	EList<CommentPojo> getComments();

} // TimeScheduleBlockPojo
