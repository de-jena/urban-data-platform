/*
 */
package de.jena.mdo.idmt.idmt;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

import org.osgi.annotation.versioning.ProviderType;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>AModel Configuration</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * A configuration object for an anonymization model. 
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.jena.mdo.idmt.idmt.AModelConfiguration#getStrategy <em>Strategy</em>}</li>
 *   <li>{@link de.jena.mdo.idmt.idmt.AModelConfiguration#getFeatures <em>Features</em>}</li>
 * </ul>
 *
 * @see de.jena.mdo.idmt.idmt.IdmtPackage#getAModelConfiguration()
 * @model
 * @generated
 */
@ProviderType
public interface AModelConfiguration extends EObject {
	/**
	 * Returns the value of the '<em><b>Strategy</b></em>' attribute.
	 * The literals are from the enumeration {@link de.jena.mdo.idmt.idmt.ModelStrategyType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Strategy</em>' attribute.
	 * @see de.jena.mdo.idmt.idmt.ModelStrategyType
	 * @see #setStrategy(ModelStrategyType)
	 * @see de.jena.mdo.idmt.idmt.IdmtPackage#getAModelConfiguration_Strategy()
	 * @model
	 * @generated
	 */
	ModelStrategyType getStrategy();

	/**
	 * Sets the value of the '{@link de.jena.mdo.idmt.idmt.AModelConfiguration#getStrategy <em>Strategy</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Strategy</em>' attribute.
	 * @see de.jena.mdo.idmt.idmt.ModelStrategyType
	 * @see #getStrategy()
	 * @generated
	 */
	void setStrategy(ModelStrategyType value);

	/**
	 * Returns the value of the '<em><b>Features</b></em>' containment reference list.
	 * The list contents are of type {@link de.jena.mdo.idmt.idmt.AFeatureConfiguration}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A list of column specifica configuration for this anonymization model.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Features</em>' containment reference list.
	 * @see de.jena.mdo.idmt.idmt.IdmtPackage#getAModelConfiguration_Features()
	 * @model containment="true"
	 * @generated
	 */
	EList<AFeatureConfiguration> getFeatures();

} // AModelConfiguration
