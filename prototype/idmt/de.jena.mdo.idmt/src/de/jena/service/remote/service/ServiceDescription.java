/*
 */
package de.jena.service.remote.service;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClassifier;
import org.eclipse.emf.ecore.EObject;

import org.osgi.annotation.versioning.ProviderType;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Description</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * An abstract service description
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.jena.service.remote.service.ServiceDescription#getServiceId <em>Service Id</em>}</li>
 *   <li>{@link de.jena.service.remote.service.ServiceDescription#getProviderId <em>Provider Id</em>}</li>
 *   <li>{@link de.jena.service.remote.service.ServiceDescription#getName <em>Name</em>}</li>
 *   <li>{@link de.jena.service.remote.service.ServiceDescription#getVendor <em>Vendor</em>}</li>
 *   <li>{@link de.jena.service.remote.service.ServiceDescription#getRank <em>Rank</em>}</li>
 *   <li>{@link de.jena.service.remote.service.ServiceDescription#getSourceUri <em>Source Uri</em>}</li>
 *   <li>{@link de.jena.service.remote.service.ServiceDescription#getContentType <em>Content Type</em>}</li>
 *   <li>{@link de.jena.service.remote.service.ServiceDescription#getLifeCycleState <em>Life Cycle State</em>}</li>
 *   <li>{@link de.jena.service.remote.service.ServiceDescription#getServiceType <em>Service Type</em>}</li>
 *   <li>{@link de.jena.service.remote.service.ServiceDescription#getServiceClass <em>Service Class</em>}</li>
 *   <li>{@link de.jena.service.remote.service.ServiceDescription#getOperation <em>Operation</em>}</li>
 * </ul>
 *
 * @see de.jena.service.remote.service.ServicePackage#getServiceDescription()
 * @model
 * @generated
 */
@ProviderType
public interface ServiceDescription extends EObject {
	/**
	 * Returns the value of the '<em><b>Service Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Service Id</em>' attribute.
	 * @see #setServiceId(String)
	 * @see de.jena.service.remote.service.ServicePackage#getServiceDescription_ServiceId()
	 * @model id="true" required="true"
	 * @generated
	 */
	String getServiceId();

	/**
	 * Sets the value of the '{@link de.jena.service.remote.service.ServiceDescription#getServiceId <em>Service Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Service Id</em>' attribute.
	 * @see #getServiceId()
	 * @generated
	 */
	void setServiceId(String value);

	/**
	 * Returns the value of the '<em><b>Provider Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The identifier for the service provider
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Provider Id</em>' attribute.
	 * @see #setProviderId(String)
	 * @see de.jena.service.remote.service.ServicePackage#getServiceDescription_ProviderId()
	 * @model required="true"
	 * @generated
	 */
	String getProviderId();

	/**
	 * Sets the value of the '{@link de.jena.service.remote.service.ServiceDescription#getProviderId <em>Provider Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Provider Id</em>' attribute.
	 * @see #getProviderId()
	 * @generated
	 */
	void setProviderId(String value);

	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see de.jena.service.remote.service.ServicePackage#getServiceDescription_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link de.jena.service.remote.service.ServiceDescription#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Vendor</b></em>' attribute.
	 * The default value is <code>"application/csv"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Vendor</em>' attribute.
	 * @see #setVendor(String)
	 * @see de.jena.service.remote.service.ServicePackage#getServiceDescription_Vendor()
	 * @model default="application/csv"
	 * @generated
	 */
	String getVendor();

	/**
	 * Sets the value of the '{@link de.jena.service.remote.service.ServiceDescription#getVendor <em>Vendor</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Vendor</em>' attribute.
	 * @see #getVendor()
	 * @generated
	 */
	void setVendor(String value);

	/**
	 * Returns the value of the '<em><b>Rank</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Rank</em>' attribute.
	 * @see #setRank(int)
	 * @see de.jena.service.remote.service.ServicePackage#getServiceDescription_Rank()
	 * @model
	 * @generated
	 */
	int getRank();

	/**
	 * Sets the value of the '{@link de.jena.service.remote.service.ServiceDescription#getRank <em>Rank</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Rank</em>' attribute.
	 * @see #getRank()
	 * @generated
	 */
	void setRank(int value);

	/**
	 * Returns the value of the '<em><b>Source Uri</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Source Uri</em>' attribute.
	 * @see #setSourceUri(String)
	 * @see de.jena.service.remote.service.ServicePackage#getServiceDescription_SourceUri()
	 * @model
	 * @generated
	 */
	String getSourceUri();

	/**
	 * Sets the value of the '{@link de.jena.service.remote.service.ServiceDescription#getSourceUri <em>Source Uri</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Source Uri</em>' attribute.
	 * @see #getSourceUri()
	 * @generated
	 */
	void setSourceUri(String value);

	/**
	 * Returns the value of the '<em><b>Content Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Content Type</em>' attribute.
	 * @see #setContentType(String)
	 * @see de.jena.service.remote.service.ServicePackage#getServiceDescription_ContentType()
	 * @model
	 * @generated
	 */
	String getContentType();

	/**
	 * Sets the value of the '{@link de.jena.service.remote.service.ServiceDescription#getContentType <em>Content Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Content Type</em>' attribute.
	 * @see #getContentType()
	 * @generated
	 */
	void setContentType(String value);

	/**
	 * Returns the value of the '<em><b>Life Cycle State</b></em>' attribute.
	 * The literals are from the enumeration {@link de.jena.service.remote.service.ServiceLifeCycleState}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Life Cycle State</em>' attribute.
	 * @see de.jena.service.remote.service.ServiceLifeCycleState
	 * @see #setLifeCycleState(ServiceLifeCycleState)
	 * @see de.jena.service.remote.service.ServicePackage#getServiceDescription_LifeCycleState()
	 * @model
	 * @generated
	 */
	ServiceLifeCycleState getLifeCycleState();

	/**
	 * Sets the value of the '{@link de.jena.service.remote.service.ServiceDescription#getLifeCycleState <em>Life Cycle State</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Life Cycle State</em>' attribute.
	 * @see de.jena.service.remote.service.ServiceLifeCycleState
	 * @see #getLifeCycleState()
	 * @generated
	 */
	void setLifeCycleState(ServiceLifeCycleState value);

	/**
	 * Returns the value of the '<em><b>Service Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Service Type</em>' attribute.
	 * @see #setServiceType(String)
	 * @see de.jena.service.remote.service.ServicePackage#getServiceDescription_ServiceType()
	 * @model
	 * @generated
	 */
	String getServiceType();

	/**
	 * Sets the value of the '{@link de.jena.service.remote.service.ServiceDescription#getServiceType <em>Service Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Service Type</em>' attribute.
	 * @see #getServiceType()
	 * @generated
	 */
	void setServiceType(String value);

	/**
	 * Returns the value of the '<em><b>Service Class</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Service Class</em>' reference.
	 * @see #setServiceClass(EClassifier)
	 * @see de.jena.service.remote.service.ServicePackage#getServiceDescription_ServiceClass()
	 * @model transient="true"
	 * @generated
	 */
	EClassifier getServiceClass();

	/**
	 * Sets the value of the '{@link de.jena.service.remote.service.ServiceDescription#getServiceClass <em>Service Class</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Service Class</em>' reference.
	 * @see #getServiceClass()
	 * @generated
	 */
	void setServiceClass(EClassifier value);

	/**
	 * Returns the value of the '<em><b>Operation</b></em>' containment reference list.
	 * The list contents are of type {@link de.jena.service.remote.service.ServiceOperationDescription}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Operation</em>' containment reference list.
	 * @see de.jena.service.remote.service.ServicePackage#getServiceDescription_Operation()
	 * @model containment="true" keys="name"
	 * @generated
	 */
	EList<ServiceOperationDescription> getOperation();

} // ServiceDescription
