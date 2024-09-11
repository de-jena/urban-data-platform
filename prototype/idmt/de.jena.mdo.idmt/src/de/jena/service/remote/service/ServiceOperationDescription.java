/*
 */
package de.jena.service.remote.service;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EOperation;

import org.osgi.annotation.versioning.ProviderType;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Operation Description</b></em>'.
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
 *   <li>{@link de.jena.service.remote.service.ServiceOperationDescription#getOperationId <em>Operation Id</em>}</li>
 *   <li>{@link de.jena.service.remote.service.ServiceOperationDescription#getName <em>Name</em>}</li>
 *   <li>{@link de.jena.service.remote.service.ServiceOperationDescription#getOperationRequestUri <em>Operation Request Uri</em>}</li>
 *   <li>{@link de.jena.service.remote.service.ServiceOperationDescription#getOperationResponseUri <em>Operation Response Uri</em>}</li>
 *   <li>{@link de.jena.service.remote.service.ServiceOperationDescription#getOperation <em>Operation</em>}</li>
 *   <li>{@link de.jena.service.remote.service.ServiceOperationDescription#getOperationType <em>Operation Type</em>}</li>
 * </ul>
 *
 * @see de.jena.service.remote.service.ServicePackage#getServiceOperationDescription()
 * @model
 * @generated
 */
@ProviderType
public interface ServiceOperationDescription extends EObject {
	/**
	 * Returns the value of the '<em><b>Operation Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The correlated request id, this reponse belongs to.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Operation Id</em>' attribute.
	 * @see #setOperationId(String)
	 * @see de.jena.service.remote.service.ServicePackage#getServiceOperationDescription_OperationId()
	 * @model id="true" required="true"
	 * @generated
	 */
	String getOperationId();

	/**
	 * Sets the value of the '{@link de.jena.service.remote.service.ServiceOperationDescription#getOperationId <em>Operation Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Operation Id</em>' attribute.
	 * @see #getOperationId()
	 * @generated
	 */
	void setOperationId(String value);

	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see de.jena.service.remote.service.ServicePackage#getServiceOperationDescription_Name()
	 * @model required="true"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link de.jena.service.remote.service.ServiceOperationDescription#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Operation Request Uri</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The Uri to listen 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Operation Request Uri</em>' attribute.
	 * @see #setOperationRequestUri(String)
	 * @see de.jena.service.remote.service.ServicePackage#getServiceOperationDescription_OperationRequestUri()
	 * @model
	 * @generated
	 */
	String getOperationRequestUri();

	/**
	 * Sets the value of the '{@link de.jena.service.remote.service.ServiceOperationDescription#getOperationRequestUri <em>Operation Request Uri</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Operation Request Uri</em>' attribute.
	 * @see #getOperationRequestUri()
	 * @generated
	 */
	void setOperationRequestUri(String value);

	/**
	 * Returns the value of the '<em><b>Operation Response Uri</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Operation Response Uri</em>' attribute.
	 * @see #setOperationResponseUri(String)
	 * @see de.jena.service.remote.service.ServicePackage#getServiceOperationDescription_OperationResponseUri()
	 * @model
	 * @generated
	 */
	String getOperationResponseUri();

	/**
	 * Sets the value of the '{@link de.jena.service.remote.service.ServiceOperationDescription#getOperationResponseUri <em>Operation Response Uri</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Operation Response Uri</em>' attribute.
	 * @see #getOperationResponseUri()
	 * @generated
	 */
	void setOperationResponseUri(String value);

	/**
	 * Returns the value of the '<em><b>Operation</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Operation</em>' reference.
	 * @see #setOperation(EOperation)
	 * @see de.jena.service.remote.service.ServicePackage#getServiceOperationDescription_Operation()
	 * @model transient="true"
	 * @generated
	 */
	EOperation getOperation();

	/**
	 * Sets the value of the '{@link de.jena.service.remote.service.ServiceOperationDescription#getOperation <em>Operation</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Operation</em>' reference.
	 * @see #getOperation()
	 * @generated
	 */
	void setOperation(EOperation value);

	/**
	 * Returns the value of the '<em><b>Operation Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Operation Type</em>' attribute.
	 * @see #setOperationType(String)
	 * @see de.jena.service.remote.service.ServicePackage#getServiceOperationDescription_OperationType()
	 * @model
	 * @generated
	 */
	String getOperationType();

	/**
	 * Sets the value of the '{@link de.jena.service.remote.service.ServiceOperationDescription#getOperationType <em>Operation Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Operation Type</em>' attribute.
	 * @see #getOperationType()
	 * @generated
	 */
	void setOperationType(String value);

} // ServiceOperationDescription
