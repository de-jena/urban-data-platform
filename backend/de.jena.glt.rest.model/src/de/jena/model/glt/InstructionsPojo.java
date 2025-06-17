/*
 */
package de.jena.model.glt;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

import org.osgi.annotation.versioning.ProviderType;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Instructions Pojo</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.jena.model.glt.InstructionsPojo#getAlarmId <em>Alarm Id</em>}</li>
 *   <li>{@link de.jena.model.glt.InstructionsPojo#getRelations <em>Relations</em>}</li>
 * </ul>
 *
 * @see de.jena.model.glt.GltPackage#getInstructionsPojo()
 * @model
 * @generated
 */
@ProviderType
public interface InstructionsPojo extends EObject {
	/**
	 * Returns the value of the '<em><b>Alarm Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Alarm Id</em>' attribute.
	 * @see #setAlarmId(String)
	 * @see de.jena.model.glt.GltPackage#getInstructionsPojo_AlarmId()
	 * @model
	 * @generated
	 */
	String getAlarmId();

	/**
	 * Sets the value of the '{@link de.jena.model.glt.InstructionsPojo#getAlarmId <em>Alarm Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Alarm Id</em>' attribute.
	 * @see #getAlarmId()
	 * @generated
	 */
	void setAlarmId(String value);

	/**
	 * Returns the value of the '<em><b>Relations</b></em>' containment reference list.
	 * The list contents are of type {@link de.jena.model.glt.RelationPojo}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Relations</em>' containment reference list.
	 * @see de.jena.model.glt.GltPackage#getInstructionsPojo_Relations()
	 * @model containment="true"
	 * @generated
	 */
	EList<RelationPojo> getRelations();

} // InstructionsPojo
