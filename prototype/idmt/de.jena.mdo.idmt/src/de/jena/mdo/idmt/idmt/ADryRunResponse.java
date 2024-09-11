/*
 */
package de.jena.mdo.idmt.idmt;

import org.osgi.annotation.versioning.ProviderType;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>ADry Run Response</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * A response object containing all information about a dry run execution. It onlöy contains meta data and not result data.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.jena.mdo.idmt.idmt.ADryRunResponse#getEstCalcTime <em>Est Calc Time</em>}</li>
 * </ul>
 *
 * @see de.jena.mdo.idmt.idmt.IdmtPackage#getADryRunResponse()
 * @model
 * @generated
 */
@ProviderType
public interface ADryRunResponse extends AResponse {
	/**
	 * Returns the value of the '<em><b>Est Calc Time</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Est Calc Time</em>' attribute.
	 * @see #setEstCalcTime(long)
	 * @see de.jena.mdo.idmt.idmt.IdmtPackage#getADryRunResponse_EstCalcTime()
	 * @model
	 * @generated
	 */
	long getEstCalcTime();

	/**
	 * Sets the value of the '{@link de.jena.mdo.idmt.idmt.ADryRunResponse#getEstCalcTime <em>Est Calc Time</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Est Calc Time</em>' attribute.
	 * @see #getEstCalcTime()
	 * @generated
	 */
	void setEstCalcTime(long value);

} // ADryRunResponse
