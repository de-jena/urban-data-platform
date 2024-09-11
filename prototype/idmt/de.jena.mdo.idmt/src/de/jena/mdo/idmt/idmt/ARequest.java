/*
 */
package de.jena.mdo.idmt.idmt;

import org.eclipse.emf.ecore.EObject;

import org.osgi.annotation.versioning.ProviderType;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>ARequest</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * A request object containing all information about request paramters that are needed.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.jena.mdo.idmt.idmt.ARequest#getRequestId <em>Request Id</em>}</li>
 *   <li>{@link de.jena.mdo.idmt.idmt.ARequest#getConsumerId <em>Consumer Id</em>}</li>
 *   <li>{@link de.jena.mdo.idmt.idmt.ARequest#getConfig <em>Config</em>}</li>
 *   <li>{@link de.jena.mdo.idmt.idmt.ARequest#getSrcUri <em>Src Uri</em>}</li>
 *   <li>{@link de.jena.mdo.idmt.idmt.ARequest#getContentType <em>Content Type</em>}</li>
 * </ul>
 *
 * @see de.jena.mdo.idmt.idmt.IdmtPackage#getARequest()
 * @model
 * @generated
 */
@ProviderType
public interface ARequest extends EObject {
	/**
	 * Returns the value of the '<em><b>Request Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Identifier for this request. Each request gets an own unique identifier
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Request Id</em>' attribute.
	 * @see #setRequestId(String)
	 * @see de.jena.mdo.idmt.idmt.IdmtPackage#getARequest_RequestId()
	 * @model id="true" required="true"
	 * @generated
	 */
	String getRequestId();

	/**
	 * Sets the value of the '{@link de.jena.mdo.idmt.idmt.ARequest#getRequestId <em>Request Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Request Id</em>' attribute.
	 * @see #getRequestId()
	 * @generated
	 */
	void setRequestId(String value);

	/**
	 * Returns the value of the '<em><b>Consumer Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Identifier for the caller / the requestor, that is the consumer of the service
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Consumer Id</em>' attribute.
	 * @see #setConsumerId(String)
	 * @see de.jena.mdo.idmt.idmt.IdmtPackage#getARequest_ConsumerId()
	 * @model
	 * @generated
	 */
	String getConsumerId();

	/**
	 * Sets the value of the '{@link de.jena.mdo.idmt.idmt.ARequest#getConsumerId <em>Consumer Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Consumer Id</em>' attribute.
	 * @see #getConsumerId()
	 * @generated
	 */
	void setConsumerId(String value);

	/**
	 * Returns the value of the '<em><b>Config</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Config</em>' containment reference.
	 * @see #setConfig(AModelConfiguration)
	 * @see de.jena.mdo.idmt.idmt.IdmtPackage#getARequest_Config()
	 * @model containment="true"
	 * @generated
	 */
	AModelConfiguration getConfig();

	/**
	 * Sets the value of the '{@link de.jena.mdo.idmt.idmt.ARequest#getConfig <em>Config</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Config</em>' containment reference.
	 * @see #getConfig()
	 * @generated
	 */
	void setConfig(AModelConfiguration value);

	/**
	 * Returns the value of the '<em><b>Src Uri</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Src Uri</em>' attribute.
	 * @see #setSrcUri(String)
	 * @see de.jena.mdo.idmt.idmt.IdmtPackage#getARequest_SrcUri()
	 * @model
	 * @generated
	 */
	String getSrcUri();

	/**
	 * Sets the value of the '{@link de.jena.mdo.idmt.idmt.ARequest#getSrcUri <em>Src Uri</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Src Uri</em>' attribute.
	 * @see #getSrcUri()
	 * @generated
	 */
	void setSrcUri(String value);

	/**
	 * Returns the value of the '<em><b>Content Type</b></em>' attribute.
	 * The default value is <code>"application/csv"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Content Type</em>' attribute.
	 * @see #setContentType(String)
	 * @see de.jena.mdo.idmt.idmt.IdmtPackage#getARequest_ContentType()
	 * @model default="application/csv"
	 * @generated
	 */
	String getContentType();

	/**
	 * Sets the value of the '{@link de.jena.mdo.idmt.idmt.ARequest#getContentType <em>Content Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Content Type</em>' attribute.
	 * @see #getContentType()
	 * @generated
	 */
	void setContentType(String value);

} // ARequest
