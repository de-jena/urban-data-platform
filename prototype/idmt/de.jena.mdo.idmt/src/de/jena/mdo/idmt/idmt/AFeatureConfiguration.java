/*
 */
package de.jena.mdo.idmt.idmt;

import org.eclipse.emf.ecore.EObject;

import org.osgi.annotation.versioning.ProviderType;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>AFeature Configuration</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * A column / field specific configuration object for an anonymization model. 
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.jena.mdo.idmt.idmt.AFeatureConfiguration#getName <em>Name</em>}</li>
 *   <li>{@link de.jena.mdo.idmt.idmt.AFeatureConfiguration#getType <em>Type</em>}</li>
 *   <li>{@link de.jena.mdo.idmt.idmt.AFeatureConfiguration#getStrategy <em>Strategy</em>}</li>
 * </ul>
 *
 * @see de.jena.mdo.idmt.idmt.IdmtPackage#getAFeatureConfiguration()
 * @model
 * @generated
 */
@ProviderType
public interface AFeatureConfiguration extends EObject {
	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The name / identifier of a field or column
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see de.jena.mdo.idmt.idmt.IdmtPackage#getAFeatureConfiguration_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link de.jena.mdo.idmt.idmt.AFeatureConfiguration#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Type</em>' attribute.
	 * @see #setType(String)
	 * @see de.jena.mdo.idmt.idmt.IdmtPackage#getAFeatureConfiguration_Type()
	 * @model
	 * @generated
	 */
	String getType();

	/**
	 * Sets the value of the '{@link de.jena.mdo.idmt.idmt.AFeatureConfiguration#getType <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type</em>' attribute.
	 * @see #getType()
	 * @generated
	 */
	void setType(String value);

	/**
	 * Returns the value of the '<em><b>Strategy</b></em>' attribute.
	 * The literals are from the enumeration {@link de.jena.mdo.idmt.idmt.FeatureStrategyType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A strategy how to interpret this field in the anonymization process.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Strategy</em>' attribute.
	 * @see de.jena.mdo.idmt.idmt.FeatureStrategyType
	 * @see #setStrategy(FeatureStrategyType)
	 * @see de.jena.mdo.idmt.idmt.IdmtPackage#getAFeatureConfiguration_Strategy()
	 * @model
	 * @generated
	 */
	FeatureStrategyType getStrategy();

	/**
	 * Sets the value of the '{@link de.jena.mdo.idmt.idmt.AFeatureConfiguration#getStrategy <em>Strategy</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Strategy</em>' attribute.
	 * @see de.jena.mdo.idmt.idmt.FeatureStrategyType
	 * @see #getStrategy()
	 * @generated
	 */
	void setStrategy(FeatureStrategyType value);

} // AFeatureConfiguration
