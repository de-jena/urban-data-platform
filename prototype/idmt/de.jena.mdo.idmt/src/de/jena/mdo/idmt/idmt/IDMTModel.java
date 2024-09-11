/*
 */
package de.jena.mdo.idmt.idmt;

import org.eclipse.emf.common.util.EList;

import org.osgi.annotation.versioning.ProviderType;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>IDMT Model</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Example of a concrete implementation specific anonymization model configuration for the IDMT algorythm
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.jena.mdo.idmt.idmt.IDMTModel#getK <em>K</em>}</li>
 *   <li>{@link de.jena.mdo.idmt.idmt.IDMTModel#getRegGrad <em>Reg Grad</em>}</li>
 *   <li>{@link de.jena.mdo.idmt.idmt.IDMTModel#getNoisy <em>Noisy</em>}</li>
 * </ul>
 *
 * @see de.jena.mdo.idmt.idmt.IdmtPackage#getIDMTModel()
 * @model
 * @generated
 */
@ProviderType
public interface IDMTModel extends AModelConfiguration {
	/**
	 * Returns the value of the '<em><b>K</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.Integer}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Datensatzbasiert
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>K</em>' attribute list.
	 * @see de.jena.mdo.idmt.idmt.IdmtPackage#getIDMTModel_K()
	 * @model default="3"
	 * @generated
	 */
	EList<Integer> getK();

	/**
	 * Returns the value of the '<em><b>Reg Grad</b></em>' containment reference list.
	 * The list contents are of type {@link de.jena.mdo.idmt.idmt.RegularizerGrad}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Datensatzbasiert
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Reg Grad</em>' containment reference list.
	 * @see de.jena.mdo.idmt.idmt.IdmtPackage#getIDMTModel_RegGrad()
	 * @model containment="true" required="true"
	 * @generated
	 */
	EList<RegularizerGrad> getRegGrad();

	/**
	 * Returns the value of the '<em><b>Noisy</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.Boolean}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Datensatzbasiert
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Noisy</em>' attribute list.
	 * @see de.jena.mdo.idmt.idmt.IdmtPackage#getIDMTModel_Noisy()
	 * @model required="true"
	 * @generated
	 */
	EList<Boolean> getNoisy();

} // IDMTModel
