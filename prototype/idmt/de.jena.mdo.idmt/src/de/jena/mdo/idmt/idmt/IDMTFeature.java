/*
 */
package de.jena.mdo.idmt.idmt;

import org.eclipse.emf.common.util.EList;

import org.osgi.annotation.versioning.ProviderType;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>IDMT Feature</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.jena.mdo.idmt.idmt.IDMTFeature#getAge <em>Age</em>}</li>
 * </ul>
 *
 * @see de.jena.mdo.idmt.idmt.IdmtPackage#getIDMTFeature()
 * @model
 * @generated
 */
@ProviderType
public interface IDMTFeature extends AFeatureConfiguration {
	/**
	 * Returns the value of the '<em><b>Age</b></em>' attribute list.
	 * The list contents are of type {@link de.jena.mdo.idmt.idmt.ComputeDistanceType}.
	 * The literals are from the enumeration {@link de.jena.mdo.idmt.idmt.ComputeDistanceType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Age</em>' attribute list.
	 * @see de.jena.mdo.idmt.idmt.ComputeDistanceType
	 * @see de.jena.mdo.idmt.idmt.IdmtPackage#getIDMTFeature_Age()
	 * @model required="true"
	 * @generated
	 */
	EList<ComputeDistanceType> getAge();

} // IDMTFeature
