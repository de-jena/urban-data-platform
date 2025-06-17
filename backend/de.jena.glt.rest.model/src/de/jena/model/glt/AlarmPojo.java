/*
 */
package de.jena.model.glt;

import org.eclipse.emf.ecore.EObject;

import org.osgi.annotation.versioning.ProviderType;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Alarm Pojo</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.jena.model.glt.AlarmPojo#getId <em>Id</em>}</li>
 *   <li>{@link de.jena.model.glt.AlarmPojo#getName <em>Name</em>}</li>
 *   <li>{@link de.jena.model.glt.AlarmPojo#getDescription <em>Description</em>}</li>
 *   <li>{@link de.jena.model.glt.AlarmPojo#getFlags <em>Flags</em>}</li>
 *   <li>{@link de.jena.model.glt.AlarmPojo#getConsequence <em>Consequence</em>}</li>
 *   <li>{@link de.jena.model.glt.AlarmPojo#getCause <em>Cause</em>}</li>
 *   <li>{@link de.jena.model.glt.AlarmPojo#getSl24schedule <em>Sl24schedule</em>}</li>
 *   <li>{@link de.jena.model.glt.AlarmPojo#getPrioritySummer <em>Priority Summer</em>}</li>
 *   <li>{@link de.jena.model.glt.AlarmPojo#getPriorityWinter <em>Priority Winter</em>}</li>
 * </ul>
 *
 * @see de.jena.model.glt.GltPackage#getAlarmPojo()
 * @model
 * @generated
 */
@ProviderType
public interface AlarmPojo extends EObject {
	/**
	 * Returns the value of the '<em><b>Id</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Id</em>' containment reference.
	 * @see #setId(AlarmId)
	 * @see de.jena.model.glt.GltPackage#getAlarmPojo_Id()
	 * @model containment="true"
	 * @generated
	 */
	AlarmId getId();

	/**
	 * Sets the value of the '{@link de.jena.model.glt.AlarmPojo#getId <em>Id</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Id</em>' containment reference.
	 * @see #getId()
	 * @generated
	 */
	void setId(AlarmId value);

	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see de.jena.model.glt.GltPackage#getAlarmPojo_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link de.jena.model.glt.AlarmPojo#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Description</em>' attribute.
	 * @see #setDescription(Integer)
	 * @see de.jena.model.glt.GltPackage#getAlarmPojo_Description()
	 * @model
	 * @generated
	 */
	Integer getDescription();

	/**
	 * Sets the value of the '{@link de.jena.model.glt.AlarmPojo#getDescription <em>Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Description</em>' attribute.
	 * @see #getDescription()
	 * @generated
	 */
	void setDescription(Integer value);

	/**
	 * Returns the value of the '<em><b>Flags</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Flags</em>' attribute.
	 * @see #setFlags(Integer)
	 * @see de.jena.model.glt.GltPackage#getAlarmPojo_Flags()
	 * @model
	 * @generated
	 */
	Integer getFlags();

	/**
	 * Sets the value of the '{@link de.jena.model.glt.AlarmPojo#getFlags <em>Flags</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Flags</em>' attribute.
	 * @see #getFlags()
	 * @generated
	 */
	void setFlags(Integer value);

	/**
	 * Returns the value of the '<em><b>Consequence</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Consequence</em>' attribute.
	 * @see #setConsequence(Integer)
	 * @see de.jena.model.glt.GltPackage#getAlarmPojo_Consequence()
	 * @model
	 * @generated
	 */
	Integer getConsequence();

	/**
	 * Sets the value of the '{@link de.jena.model.glt.AlarmPojo#getConsequence <em>Consequence</em>}' attribute.
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
	 * @see de.jena.model.glt.GltPackage#getAlarmPojo_Cause()
	 * @model
	 * @generated
	 */
	Integer getCause();

	/**
	 * Sets the value of the '{@link de.jena.model.glt.AlarmPojo#getCause <em>Cause</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Cause</em>' attribute.
	 * @see #getCause()
	 * @generated
	 */
	void setCause(Integer value);

	/**
	 * Returns the value of the '<em><b>Sl24schedule</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Sl24schedule</em>' attribute.
	 * @see #setSl24schedule(Integer)
	 * @see de.jena.model.glt.GltPackage#getAlarmPojo_Sl24schedule()
	 * @model
	 * @generated
	 */
	Integer getSl24schedule();

	/**
	 * Sets the value of the '{@link de.jena.model.glt.AlarmPojo#getSl24schedule <em>Sl24schedule</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Sl24schedule</em>' attribute.
	 * @see #getSl24schedule()
	 * @generated
	 */
	void setSl24schedule(Integer value);

	/**
	 * Returns the value of the '<em><b>Priority Summer</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Priority Summer</em>' attribute.
	 * @see #setPrioritySummer(Integer)
	 * @see de.jena.model.glt.GltPackage#getAlarmPojo_PrioritySummer()
	 * @model
	 * @generated
	 */
	Integer getPrioritySummer();

	/**
	 * Sets the value of the '{@link de.jena.model.glt.AlarmPojo#getPrioritySummer <em>Priority Summer</em>}' attribute.
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
	 * @see de.jena.model.glt.GltPackage#getAlarmPojo_PriorityWinter()
	 * @model
	 * @generated
	 */
	Integer getPriorityWinter();

	/**
	 * Sets the value of the '{@link de.jena.model.glt.AlarmPojo#getPriorityWinter <em>Priority Winter</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Priority Winter</em>' attribute.
	 * @see #getPriorityWinter()
	 * @generated
	 */
	void setPriorityWinter(Integer value);

} // AlarmPojo
