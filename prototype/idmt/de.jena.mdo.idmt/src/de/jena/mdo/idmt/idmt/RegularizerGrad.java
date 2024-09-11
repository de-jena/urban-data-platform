/*
 */
package de.jena.mdo.idmt.idmt;

import org.eclipse.emf.ecore.EObject;

import org.osgi.annotation.versioning.ProviderType;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Regularizer Grad</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.jena.mdo.idmt.idmt.RegularizerGrad#getReg <em>Reg</em>}</li>
 *   <li>{@link de.jena.mdo.idmt.idmt.RegularizerGrad#getGrad <em>Grad</em>}</li>
 * </ul>
 *
 * @see de.jena.mdo.idmt.idmt.IdmtPackage#getRegularizerGrad()
 * @model
 * @generated
 */
@ProviderType
public interface RegularizerGrad extends EObject {
	/**
	 * Returns the value of the '<em><b>Reg</b></em>' attribute.
	 * The literals are from the enumeration {@link de.jena.mdo.idmt.idmt.RegularizerType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Reg</em>' attribute.
	 * @see de.jena.mdo.idmt.idmt.RegularizerType
	 * @see #setReg(RegularizerType)
	 * @see de.jena.mdo.idmt.idmt.IdmtPackage#getRegularizerGrad_Reg()
	 * @model required="true"
	 * @generated
	 */
	RegularizerType getReg();

	/**
	 * Sets the value of the '{@link de.jena.mdo.idmt.idmt.RegularizerGrad#getReg <em>Reg</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Reg</em>' attribute.
	 * @see de.jena.mdo.idmt.idmt.RegularizerType
	 * @see #getReg()
	 * @generated
	 */
	void setReg(RegularizerType value);

	/**
	 * Returns the value of the '<em><b>Grad</b></em>' attribute.
	 * The literals are from the enumeration {@link de.jena.mdo.idmt.idmt.GradType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Grad</em>' attribute.
	 * @see de.jena.mdo.idmt.idmt.GradType
	 * @see #setGrad(GradType)
	 * @see de.jena.mdo.idmt.idmt.IdmtPackage#getRegularizerGrad_Grad()
	 * @model required="true"
	 * @generated
	 */
	GradType getGrad();

	/**
	 * Sets the value of the '{@link de.jena.mdo.idmt.idmt.RegularizerGrad#getGrad <em>Grad</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Grad</em>' attribute.
	 * @see de.jena.mdo.idmt.idmt.GradType
	 * @see #getGrad()
	 * @generated
	 */
	void setGrad(GradType value);

} // RegularizerGrad
