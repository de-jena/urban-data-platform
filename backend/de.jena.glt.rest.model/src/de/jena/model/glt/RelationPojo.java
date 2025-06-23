/*
 */
package de.jena.model.glt;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

import org.osgi.annotation.versioning.ProviderType;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Relation Pojo</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.jena.model.glt.RelationPojo#getCondition <em>Condition</em>}</li>
 *   <li>{@link de.jena.model.glt.RelationPojo#getInstructions <em>Instructions</em>}</li>
 * </ul>
 *
 * @see de.jena.model.glt.GltPackage#getRelationPojo()
 * @model
 * @generated
 */
@ProviderType
public interface RelationPojo extends EObject {
	/**
	 * Returns the value of the '<em><b>Condition</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Condition</em>' attribute.
	 * @see #setCondition(Integer)
	 * @see de.jena.model.glt.GltPackage#getRelationPojo_Condition()
	 * @model unique="false"
	 * @generated
	 */
	Integer getCondition();

	/**
	 * Sets the value of the '{@link de.jena.model.glt.RelationPojo#getCondition <em>Condition</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Condition</em>' attribute.
	 * @see #getCondition()
	 * @generated
	 */
	void setCondition(Integer value);

	/**
	 * Returns the value of the '<em><b>Instructions</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.Integer}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Instructions</em>' attribute list.
	 * @see de.jena.model.glt.GltPackage#getRelationPojo_Instructions()
	 * @model unique="false"
	 * @generated
	 */
	EList<Integer> getInstructions();

} // RelationPojo
