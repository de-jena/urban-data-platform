/*
 */
package de.jena.mdo.idmt.idmt;

import org.eclipse.emf.ecore.EFactory;

import org.osgi.annotation.versioning.ProviderType;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see de.jena.mdo.idmt.idmt.IdmtPackage
 * @generated
 */
@ProviderType
public interface IdmtFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	IdmtFactory eINSTANCE = de.jena.mdo.idmt.idmt.impl.IdmtFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>ARequest</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>ARequest</em>'.
	 * @generated
	 */
	ARequest createARequest();

	/**
	 * Returns a new object of class '<em>AResponse</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>AResponse</em>'.
	 * @generated
	 */
	AResponse createAResponse();

	/**
	 * Returns a new object of class '<em>ADry Run Response</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>ADry Run Response</em>'.
	 * @generated
	 */
	ADryRunResponse createADryRunResponse();

	/**
	 * Returns a new object of class '<em>AModel Configuration</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>AModel Configuration</em>'.
	 * @generated
	 */
	AModelConfiguration createAModelConfiguration();

	/**
	 * Returns a new object of class '<em>AFeature Configuration</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>AFeature Configuration</em>'.
	 * @generated
	 */
	AFeatureConfiguration createAFeatureConfiguration();

	/**
	 * Returns a new object of class '<em>IDMT Model</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>IDMT Model</em>'.
	 * @generated
	 */
	IDMTModel createIDMTModel();

	/**
	 * Returns a new object of class '<em>IDMT Feature</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>IDMT Feature</em>'.
	 * @generated
	 */
	IDMTFeature createIDMTFeature();

	/**
	 * Returns a new object of class '<em>Regularizer Grad</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Regularizer Grad</em>'.
	 * @generated
	 */
	RegularizerGrad createRegularizerGrad();

	/**
	 * Returns a new object of class '<em>Anonymization Service Description</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Anonymization Service Description</em>'.
	 * @generated
	 */
	AnonymizationServiceDescription createAnonymizationServiceDescription();

	/**
	 * Returns a new object of class '<em>Arx Model</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Arx Model</em>'.
	 * @generated
	 */
	ArxModel createArxModel();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	IdmtPackage getIdmtPackage();

} //IdmtFactory
