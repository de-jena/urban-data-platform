/*
 */
package de.jena.model.glt;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

import org.osgi.annotation.versioning.ProviderType;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Import Statistic Pojo</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.jena.model.glt.ImportStatisticPojo#getAdd <em>Add</em>}</li>
 *   <li>{@link de.jena.model.glt.ImportStatisticPojo#getRemove <em>Remove</em>}</li>
 *   <li>{@link de.jena.model.glt.ImportStatisticPojo#getUpdate <em>Update</em>}</li>
 * </ul>
 *
 * @see de.jena.model.glt.GltPackage#getImportStatisticPojo()
 * @model
 * @generated
 */
@ProviderType
public interface ImportStatisticPojo extends EObject {
	/**
	 * Returns the value of the '<em><b>Add</b></em>' containment reference list.
	 * The list contents are of type {@link de.jena.model.glt.CylonNetworkPojo}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Add</em>' containment reference list.
	 * @see de.jena.model.glt.GltPackage#getImportStatisticPojo_Add()
	 * @model containment="true"
	 * @generated
	 */
	EList<CylonNetworkPojo> getAdd();

	/**
	 * Returns the value of the '<em><b>Remove</b></em>' containment reference list.
	 * The list contents are of type {@link de.jena.model.glt.CylonNetworkPojo}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Remove</em>' containment reference list.
	 * @see de.jena.model.glt.GltPackage#getImportStatisticPojo_Remove()
	 * @model containment="true"
	 * @generated
	 */
	EList<CylonNetworkPojo> getRemove();

	/**
	 * Returns the value of the '<em><b>Update</b></em>' containment reference list.
	 * The list contents are of type {@link de.jena.model.glt.CylonNetworkPojo}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Update</em>' containment reference list.
	 * @see de.jena.model.glt.GltPackage#getImportStatisticPojo_Update()
	 * @model containment="true"
	 * @generated
	 */
	EList<CylonNetworkPojo> getUpdate();

} // ImportStatisticPojo
