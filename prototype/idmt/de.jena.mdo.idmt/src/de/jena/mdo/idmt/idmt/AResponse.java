/*
 */
package de.jena.mdo.idmt.idmt;

import org.eclipse.emf.ecore.EObject;

import org.osgi.annotation.versioning.ProviderType;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>AResponse</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * A response object containing all information about a result and its meta data
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.jena.mdo.idmt.idmt.AResponse#getRequestId <em>Request Id</em>}</li>
 *   <li>{@link de.jena.mdo.idmt.idmt.AResponse#getConfig <em>Config</em>}</li>
 *   <li>{@link de.jena.mdo.idmt.idmt.AResponse#getType <em>Type</em>}</li>
 *   <li>{@link de.jena.mdo.idmt.idmt.AResponse#getStatusMessage <em>Status Message</em>}</li>
 *   <li>{@link de.jena.mdo.idmt.idmt.AResponse#getResultUri <em>Result Uri</em>}</li>
 *   <li>{@link de.jena.mdo.idmt.idmt.AResponse#getResultContentType <em>Result Content Type</em>}</li>
 *   <li>{@link de.jena.mdo.idmt.idmt.AResponse#getElapsedTime <em>Elapsed Time</em>}</li>
 *   <li>{@link de.jena.mdo.idmt.idmt.AResponse#getRemainingTime <em>Remaining Time</em>}</li>
 * </ul>
 *
 * @see de.jena.mdo.idmt.idmt.IdmtPackage#getAResponse()
 * @model
 * @generated
 */
@ProviderType
public interface AResponse extends EObject {
	/**
	 * Returns the value of the '<em><b>Request Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The correlated request id, this reponse belongs to.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Request Id</em>' attribute.
	 * @see #setRequestId(String)
	 * @see de.jena.mdo.idmt.idmt.IdmtPackage#getAResponse_RequestId()
	 * @model id="true" required="true"
	 * @generated
	 */
	String getRequestId();

	/**
	 * Sets the value of the '{@link de.jena.mdo.idmt.idmt.AResponse#getRequestId <em>Request Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Request Id</em>' attribute.
	 * @see #getRequestId()
	 * @generated
	 */
	void setRequestId(String value);

	/**
	 * Returns the value of the '<em><b>Config</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The configuration this result based upon.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Config</em>' containment reference.
	 * @see #setConfig(AModelConfiguration)
	 * @see de.jena.mdo.idmt.idmt.IdmtPackage#getAResponse_Config()
	 * @model containment="true"
	 * @generated
	 */
	AModelConfiguration getConfig();

	/**
	 * Sets the value of the '{@link de.jena.mdo.idmt.idmt.AResponse#getConfig <em>Config</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Config</em>' containment reference.
	 * @see #getConfig()
	 * @generated
	 */
	void setConfig(AModelConfiguration value);

	/**
	 * Returns the value of the '<em><b>Type</b></em>' attribute.
	 * The literals are from the enumeration {@link de.jena.mdo.idmt.idmt.ResponseType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The response type / kind
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Type</em>' attribute.
	 * @see de.jena.mdo.idmt.idmt.ResponseType
	 * @see #setType(ResponseType)
	 * @see de.jena.mdo.idmt.idmt.IdmtPackage#getAResponse_Type()
	 * @model required="true"
	 *        annotation="Codec eClassUri='http://gecko/address#//Person' identityInfo='null' typeInfop='null' name='null'"
	 * @generated
	 */
	ResponseType getType();

	/**
	 * Sets the value of the '{@link de.jena.mdo.idmt.idmt.AResponse#getType <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type</em>' attribute.
	 * @see de.jena.mdo.idmt.idmt.ResponseType
	 * @see #getType()
	 * @generated
	 */
	void setType(ResponseType value);

	/**
	 * Returns the value of the '<em><b>Status Message</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The status message of a response. It contains human readable information, like error messages
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Status Message</em>' attribute.
	 * @see #setStatusMessage(String)
	 * @see de.jena.mdo.idmt.idmt.IdmtPackage#getAResponse_StatusMessage()
	 * @model
	 * @generated
	 */
	String getStatusMessage();

	/**
	 * Sets the value of the '{@link de.jena.mdo.idmt.idmt.AResponse#getStatusMessage <em>Status Message</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Status Message</em>' attribute.
	 * @see #getStatusMessage()
	 * @generated
	 */
	void setStatusMessage(String value);

	/**
	 * Returns the value of the '<em><b>Result Uri</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * An URI under which the result, anonymized data set is available
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Result Uri</em>' attribute.
	 * @see #setResultUri(String)
	 * @see de.jena.mdo.idmt.idmt.IdmtPackage#getAResponse_ResultUri()
	 * @model
	 * @generated
	 */
	String getResultUri();

	/**
	 * Sets the value of the '{@link de.jena.mdo.idmt.idmt.AResponse#getResultUri <em>Result Uri</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Result Uri</em>' attribute.
	 * @see #getResultUri()
	 * @generated
	 */
	void setResultUri(String value);

	/**
	 * Returns the value of the '<em><b>Result Content Type</b></em>' attribute.
	 * The default value is <code>"application/csv"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The content type for the resulting data set
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Result Content Type</em>' attribute.
	 * @see #setResultContentType(String)
	 * @see de.jena.mdo.idmt.idmt.IdmtPackage#getAResponse_ResultContentType()
	 * @model default="application/csv"
	 * @generated
	 */
	String getResultContentType();

	/**
	 * Sets the value of the '{@link de.jena.mdo.idmt.idmt.AResponse#getResultContentType <em>Result Content Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Result Content Type</em>' attribute.
	 * @see #getResultContentType()
	 * @generated
	 */
	void setResultContentType(String value);

	/**
	 * Returns the value of the '<em><b>Elapsed Time</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The actual runtime in ms.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Elapsed Time</em>' attribute.
	 * @see #setElapsedTime(long)
	 * @see de.jena.mdo.idmt.idmt.IdmtPackage#getAResponse_ElapsedTime()
	 * @model
	 * @generated
	 */
	long getElapsedTime();

	/**
	 * Sets the value of the '{@link de.jena.mdo.idmt.idmt.AResponse#getElapsedTime <em>Elapsed Time</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Elapsed Time</em>' attribute.
	 * @see #getElapsedTime()
	 * @generated
	 */
	void setElapsedTime(long value);

	/**
	 * Returns the value of the '<em><b>Remaining Time</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The remaining runtime in ms.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Remaining Time</em>' attribute.
	 * @see #setRemainingTime(long)
	 * @see de.jena.mdo.idmt.idmt.IdmtPackage#getAResponse_RemainingTime()
	 * @model
	 * @generated
	 */
	long getRemainingTime();

	/**
	 * Sets the value of the '{@link de.jena.mdo.idmt.idmt.AResponse#getRemainingTime <em>Remaining Time</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Remaining Time</em>' attribute.
	 * @see #getRemainingTime()
	 * @generated
	 */
	void setRemainingTime(long value);

} // AResponse
