/*
 */
package de.jena.model.glt;

import org.eclipse.emf.ecore.EObject;

import org.osgi.annotation.versioning.ProviderType;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Alarm Request</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.jena.model.glt.AlarmRequest#getName <em>Name</em>}</li>
 *   <li>{@link de.jena.model.glt.AlarmRequest#getPrioritySummer <em>Priority Summer</em>}</li>
 *   <li>{@link de.jena.model.glt.AlarmRequest#getPriorityWinter <em>Priority Winter</em>}</li>
 *   <li>{@link de.jena.model.glt.AlarmRequest#getFlags <em>Flags</em>}</li>
 *   <li>{@link de.jena.model.glt.AlarmRequest#getDescription <em>Description</em>}</li>
 *   <li>{@link de.jena.model.glt.AlarmRequest#getConsequence <em>Consequence</em>}</li>
 *   <li>{@link de.jena.model.glt.AlarmRequest#getCause <em>Cause</em>}</li>
 *   <li>{@link de.jena.model.glt.AlarmRequest#getSl24Schedule <em>Sl24 Schedule</em>}</li>
 * </ul>
 *
 * @see de.jena.model.glt.GltPackage#getAlarmRequest()
 * @model
 * @generated
 */
@ProviderType
public interface AlarmRequest extends EObject {
	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see de.jena.model.glt.GltPackage#getAlarmRequest_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link de.jena.model.glt.AlarmRequest#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Priority Summer</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Priority Summer</em>' attribute.
	 * @see #setPrioritySummer(Integer)
	 * @see de.jena.model.glt.GltPackage#getAlarmRequest_PrioritySummer()
	 * @model
	 * @generated
	 */
	Integer getPrioritySummer();

	/**
	 * Sets the value of the '{@link de.jena.model.glt.AlarmRequest#getPrioritySummer <em>Priority Summer</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Priority Summer</em>' attribute.
	 * @see #getPrioritySummer()
	 * @generated
	 */
	void setPrioritySummer(Integer value);

	/**
	 * Returns the value of the '<em><b>Priority Winter</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Priority Winter</em>' attribute.
	 * @see #setPriorityWinter(Integer)
	 * @see de.jena.model.glt.GltPackage#getAlarmRequest_PriorityWinter()
	 * @model
	 * @generated
	 */
	Integer getPriorityWinter();

	/**
	 * Sets the value of the '{@link de.jena.model.glt.AlarmRequest#getPriorityWinter <em>Priority Winter</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Priority Winter</em>' attribute.
	 * @see #getPriorityWinter()
	 * @generated
	 */
	void setPriorityWinter(Integer value);

	/**
	 * Returns the value of the '<em><b>Flags</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Flags</em>' attribute.
	 * @see #setFlags(Integer)
	 * @see de.jena.model.glt.GltPackage#getAlarmRequest_Flags()
	 * @model
	 * @generated
	 */
	Integer getFlags();

	/**
	 * Sets the value of the '{@link de.jena.model.glt.AlarmRequest#getFlags <em>Flags</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Flags</em>' attribute.
	 * @see #getFlags()
	 * @generated
	 */
	void setFlags(Integer value);

	/**
	 * Returns the value of the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Description</em>' attribute.
	 * @see #setDescription(Integer)
	 * @see de.jena.model.glt.GltPackage#getAlarmRequest_Description()
	 * @model
	 * @generated
	 */
	Integer getDescription();

	/**
	 * Sets the value of the '{@link de.jena.model.glt.AlarmRequest#getDescription <em>Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Description</em>' attribute.
	 * @see #getDescription()
	 * @generated
	 */
	void setDescription(Integer value);

	/**
	 * Returns the value of the '<em><b>Consequence</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Consequence</em>' attribute.
	 * @see #setConsequence(Integer)
	 * @see de.jena.model.glt.GltPackage#getAlarmRequest_Consequence()
	 * @model
	 * @generated
	 */
	Integer getConsequence();

	/**
	 * Sets the value of the '{@link de.jena.model.glt.AlarmRequest#getConsequence <em>Consequence</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Consequence</em>' attribute.
	 * @see #getConsequence()
	 * @generated
	 */
	void setConsequence(Integer value);

	/**
	 * Returns the value of the '<em><b>Cause</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Cause</em>' attribute.
	 * @see #setCause(Integer)
	 * @see de.jena.model.glt.GltPackage#getAlarmRequest_Cause()
	 * @model
	 * @generated
	 */
	Integer getCause();

	/**
	 * Sets the value of the '{@link de.jena.model.glt.AlarmRequest#getCause <em>Cause</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Cause</em>' attribute.
	 * @see #getCause()
	 * @generated
	 */
	void setCause(Integer value);

	/**
	 * Returns the value of the '<em><b>Sl24 Schedule</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Sl24 Schedule</em>' attribute.
	 * @see #setSl24Schedule(Integer)
	 * @see de.jena.model.glt.GltPackage#getAlarmRequest_Sl24Schedule()
	 * @model
	 * @generated
	 */
	Integer getSl24Schedule();

	/**
	 * Sets the value of the '{@link de.jena.model.glt.AlarmRequest#getSl24Schedule <em>Sl24 Schedule</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Sl24 Schedule</em>' attribute.
	 * @see #getSl24Schedule()
	 * @generated
	 */
	void setSl24Schedule(Integer value);

} // AlarmRequest
