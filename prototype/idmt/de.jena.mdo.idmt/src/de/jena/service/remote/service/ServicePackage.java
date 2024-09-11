/*
 */
package de.jena.service.remote.service;


import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EOperation;
import org.eclipse.emf.ecore.EReference;

import org.gecko.emf.osgi.annotation.provide.EPackage;

import org.osgi.annotation.versioning.ProviderType;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each operation of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see de.jena.service.remote.service.ServiceFactory
 * @model kind="package"
 *        annotation="Version value='1.0'"
 *        annotation="http://www.eclipse.org/emf/2002/GenModel basePackage='de.jena.service.remote'"
 * @generated
 */
@ProviderType
@EPackage(uri = ServicePackage.eNS_URI, genModel = "/model/idmt.genmodel", genModelSourceLocations = {"model/idmt.genmodel","de.jena.mdo.idmt/model/idmt.genmodel"}, ecore="/model/service.ecore", ecoreSourceLocations="/model/service.ecore")
public interface ServicePackage extends org.eclipse.emf.ecore.EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "service";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://jena.de/service/1.0";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "service";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	ServicePackage eINSTANCE = de.jena.service.remote.service.impl.ServicePackageImpl.init();

	/**
	 * The meta object id for the '{@link de.jena.service.remote.service.impl.ServiceDescriptionImpl <em>Description</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.jena.service.remote.service.impl.ServiceDescriptionImpl
	 * @see de.jena.service.remote.service.impl.ServicePackageImpl#getServiceDescription()
	 * @generated
	 */
	int SERVICE_DESCRIPTION = 0;

	/**
	 * The feature id for the '<em><b>Service Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_DESCRIPTION__SERVICE_ID = 0;

	/**
	 * The feature id for the '<em><b>Provider Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_DESCRIPTION__PROVIDER_ID = 1;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_DESCRIPTION__NAME = 2;

	/**
	 * The feature id for the '<em><b>Vendor</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_DESCRIPTION__VENDOR = 3;

	/**
	 * The feature id for the '<em><b>Rank</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_DESCRIPTION__RANK = 4;

	/**
	 * The feature id for the '<em><b>Source Uri</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_DESCRIPTION__SOURCE_URI = 5;

	/**
	 * The feature id for the '<em><b>Content Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_DESCRIPTION__CONTENT_TYPE = 6;

	/**
	 * The feature id for the '<em><b>Life Cycle State</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_DESCRIPTION__LIFE_CYCLE_STATE = 7;

	/**
	 * The feature id for the '<em><b>Service Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_DESCRIPTION__SERVICE_TYPE = 8;

	/**
	 * The feature id for the '<em><b>Service Class</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_DESCRIPTION__SERVICE_CLASS = 9;

	/**
	 * The feature id for the '<em><b>Operation</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_DESCRIPTION__OPERATION = 10;

	/**
	 * The number of structural features of the '<em>Description</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_DESCRIPTION_FEATURE_COUNT = 11;

	/**
	 * The number of operations of the '<em>Description</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_DESCRIPTION_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link de.jena.service.remote.service.impl.ServiceOperationDescriptionImpl <em>Operation Description</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.jena.service.remote.service.impl.ServiceOperationDescriptionImpl
	 * @see de.jena.service.remote.service.impl.ServicePackageImpl#getServiceOperationDescription()
	 * @generated
	 */
	int SERVICE_OPERATION_DESCRIPTION = 1;

	/**
	 * The feature id for the '<em><b>Operation Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_OPERATION_DESCRIPTION__OPERATION_ID = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_OPERATION_DESCRIPTION__NAME = 1;

	/**
	 * The feature id for the '<em><b>Operation Request Uri</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_OPERATION_DESCRIPTION__OPERATION_REQUEST_URI = 2;

	/**
	 * The feature id for the '<em><b>Operation Response Uri</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_OPERATION_DESCRIPTION__OPERATION_RESPONSE_URI = 3;

	/**
	 * The feature id for the '<em><b>Operation</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_OPERATION_DESCRIPTION__OPERATION = 4;

	/**
	 * The feature id for the '<em><b>Operation Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_OPERATION_DESCRIPTION__OPERATION_TYPE = 5;

	/**
	 * The number of structural features of the '<em>Operation Description</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_OPERATION_DESCRIPTION_FEATURE_COUNT = 6;

	/**
	 * The number of operations of the '<em>Operation Description</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_OPERATION_DESCRIPTION_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link de.jena.service.remote.service.impl.DiscoveryProviderServiceImpl <em>Discovery Provider Service</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.jena.service.remote.service.impl.DiscoveryProviderServiceImpl
	 * @see de.jena.service.remote.service.impl.ServicePackageImpl#getDiscoveryProviderService()
	 * @generated
	 */
	int DISCOVERY_PROVIDER_SERVICE = 2;

	/**
	 * The number of structural features of the '<em>Discovery Provider Service</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISCOVERY_PROVIDER_SERVICE_FEATURE_COUNT = 0;

	/**
	 * The operation id for the '<em>Announce</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISCOVERY_PROVIDER_SERVICE___ANNOUNCE__SERVICEDESCRIPTION = 0;

	/**
	 * The number of operations of the '<em>Discovery Provider Service</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISCOVERY_PROVIDER_SERVICE_OPERATION_COUNT = 1;

	/**
	 * The meta object id for the '{@link de.jena.service.remote.service.impl.DiscoveryConsumerServiceImpl <em>Discovery Consumer Service</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.jena.service.remote.service.impl.DiscoveryConsumerServiceImpl
	 * @see de.jena.service.remote.service.impl.ServicePackageImpl#getDiscoveryConsumerService()
	 * @generated
	 */
	int DISCOVERY_CONSUMER_SERVICE = 3;

	/**
	 * The number of structural features of the '<em>Discovery Consumer Service</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISCOVERY_CONSUMER_SERVICE_FEATURE_COUNT = 0;

	/**
	 * The operation id for the '<em>On Service Announced</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISCOVERY_CONSUMER_SERVICE___ON_SERVICE_ANNOUNCED__SERVICEDESCRIPTION = 0;

	/**
	 * The number of operations of the '<em>Discovery Consumer Service</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISCOVERY_CONSUMER_SERVICE_OPERATION_COUNT = 1;

	/**
	 * The meta object id for the '{@link de.jena.service.remote.service.ServiceLifeCycleState <em>Life Cycle State</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.jena.service.remote.service.ServiceLifeCycleState
	 * @see de.jena.service.remote.service.impl.ServicePackageImpl#getServiceLifeCycleState()
	 * @generated
	 */
	int SERVICE_LIFE_CYCLE_STATE = 4;


	/**
	 * Returns the meta object for class '{@link de.jena.service.remote.service.ServiceDescription <em>Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Description</em>'.
	 * @see de.jena.service.remote.service.ServiceDescription
	 * @generated
	 */
	EClass getServiceDescription();

	/**
	 * Returns the meta object for the attribute '{@link de.jena.service.remote.service.ServiceDescription#getServiceId <em>Service Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Service Id</em>'.
	 * @see de.jena.service.remote.service.ServiceDescription#getServiceId()
	 * @see #getServiceDescription()
	 * @generated
	 */
	EAttribute getServiceDescription_ServiceId();

	/**
	 * Returns the meta object for the attribute '{@link de.jena.service.remote.service.ServiceDescription#getProviderId <em>Provider Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Provider Id</em>'.
	 * @see de.jena.service.remote.service.ServiceDescription#getProviderId()
	 * @see #getServiceDescription()
	 * @generated
	 */
	EAttribute getServiceDescription_ProviderId();

	/**
	 * Returns the meta object for the attribute '{@link de.jena.service.remote.service.ServiceDescription#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see de.jena.service.remote.service.ServiceDescription#getName()
	 * @see #getServiceDescription()
	 * @generated
	 */
	EAttribute getServiceDescription_Name();

	/**
	 * Returns the meta object for the attribute '{@link de.jena.service.remote.service.ServiceDescription#getVendor <em>Vendor</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Vendor</em>'.
	 * @see de.jena.service.remote.service.ServiceDescription#getVendor()
	 * @see #getServiceDescription()
	 * @generated
	 */
	EAttribute getServiceDescription_Vendor();

	/**
	 * Returns the meta object for the attribute '{@link de.jena.service.remote.service.ServiceDescription#getRank <em>Rank</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Rank</em>'.
	 * @see de.jena.service.remote.service.ServiceDescription#getRank()
	 * @see #getServiceDescription()
	 * @generated
	 */
	EAttribute getServiceDescription_Rank();

	/**
	 * Returns the meta object for the attribute '{@link de.jena.service.remote.service.ServiceDescription#getSourceUri <em>Source Uri</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Source Uri</em>'.
	 * @see de.jena.service.remote.service.ServiceDescription#getSourceUri()
	 * @see #getServiceDescription()
	 * @generated
	 */
	EAttribute getServiceDescription_SourceUri();

	/**
	 * Returns the meta object for the attribute '{@link de.jena.service.remote.service.ServiceDescription#getContentType <em>Content Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Content Type</em>'.
	 * @see de.jena.service.remote.service.ServiceDescription#getContentType()
	 * @see #getServiceDescription()
	 * @generated
	 */
	EAttribute getServiceDescription_ContentType();

	/**
	 * Returns the meta object for the attribute '{@link de.jena.service.remote.service.ServiceDescription#getLifeCycleState <em>Life Cycle State</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Life Cycle State</em>'.
	 * @see de.jena.service.remote.service.ServiceDescription#getLifeCycleState()
	 * @see #getServiceDescription()
	 * @generated
	 */
	EAttribute getServiceDescription_LifeCycleState();

	/**
	 * Returns the meta object for the attribute '{@link de.jena.service.remote.service.ServiceDescription#getServiceType <em>Service Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Service Type</em>'.
	 * @see de.jena.service.remote.service.ServiceDescription#getServiceType()
	 * @see #getServiceDescription()
	 * @generated
	 */
	EAttribute getServiceDescription_ServiceType();

	/**
	 * Returns the meta object for the reference '{@link de.jena.service.remote.service.ServiceDescription#getServiceClass <em>Service Class</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Service Class</em>'.
	 * @see de.jena.service.remote.service.ServiceDescription#getServiceClass()
	 * @see #getServiceDescription()
	 * @generated
	 */
	EReference getServiceDescription_ServiceClass();

	/**
	 * Returns the meta object for the containment reference list '{@link de.jena.service.remote.service.ServiceDescription#getOperation <em>Operation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Operation</em>'.
	 * @see de.jena.service.remote.service.ServiceDescription#getOperation()
	 * @see #getServiceDescription()
	 * @generated
	 */
	EReference getServiceDescription_Operation();

	/**
	 * Returns the meta object for class '{@link de.jena.service.remote.service.ServiceOperationDescription <em>Operation Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Operation Description</em>'.
	 * @see de.jena.service.remote.service.ServiceOperationDescription
	 * @generated
	 */
	EClass getServiceOperationDescription();

	/**
	 * Returns the meta object for the attribute '{@link de.jena.service.remote.service.ServiceOperationDescription#getOperationId <em>Operation Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Operation Id</em>'.
	 * @see de.jena.service.remote.service.ServiceOperationDescription#getOperationId()
	 * @see #getServiceOperationDescription()
	 * @generated
	 */
	EAttribute getServiceOperationDescription_OperationId();

	/**
	 * Returns the meta object for the attribute '{@link de.jena.service.remote.service.ServiceOperationDescription#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see de.jena.service.remote.service.ServiceOperationDescription#getName()
	 * @see #getServiceOperationDescription()
	 * @generated
	 */
	EAttribute getServiceOperationDescription_Name();

	/**
	 * Returns the meta object for the attribute '{@link de.jena.service.remote.service.ServiceOperationDescription#getOperationRequestUri <em>Operation Request Uri</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Operation Request Uri</em>'.
	 * @see de.jena.service.remote.service.ServiceOperationDescription#getOperationRequestUri()
	 * @see #getServiceOperationDescription()
	 * @generated
	 */
	EAttribute getServiceOperationDescription_OperationRequestUri();

	/**
	 * Returns the meta object for the attribute '{@link de.jena.service.remote.service.ServiceOperationDescription#getOperationResponseUri <em>Operation Response Uri</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Operation Response Uri</em>'.
	 * @see de.jena.service.remote.service.ServiceOperationDescription#getOperationResponseUri()
	 * @see #getServiceOperationDescription()
	 * @generated
	 */
	EAttribute getServiceOperationDescription_OperationResponseUri();

	/**
	 * Returns the meta object for the reference '{@link de.jena.service.remote.service.ServiceOperationDescription#getOperation <em>Operation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Operation</em>'.
	 * @see de.jena.service.remote.service.ServiceOperationDescription#getOperation()
	 * @see #getServiceOperationDescription()
	 * @generated
	 */
	EReference getServiceOperationDescription_Operation();

	/**
	 * Returns the meta object for the attribute '{@link de.jena.service.remote.service.ServiceOperationDescription#getOperationType <em>Operation Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Operation Type</em>'.
	 * @see de.jena.service.remote.service.ServiceOperationDescription#getOperationType()
	 * @see #getServiceOperationDescription()
	 * @generated
	 */
	EAttribute getServiceOperationDescription_OperationType();

	/**
	 * Returns the meta object for class '{@link de.jena.service.remote.service.DiscoveryProviderService <em>Discovery Provider Service</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Discovery Provider Service</em>'.
	 * @see de.jena.service.remote.service.DiscoveryProviderService
	 * @generated
	 */
	EClass getDiscoveryProviderService();

	/**
	 * Returns the meta object for the '{@link de.jena.service.remote.service.DiscoveryProviderService#announce(de.jena.service.remote.service.ServiceDescription) <em>Announce</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Announce</em>' operation.
	 * @see de.jena.service.remote.service.DiscoveryProviderService#announce(de.jena.service.remote.service.ServiceDescription)
	 * @generated
	 */
	EOperation getDiscoveryProviderService__Announce__ServiceDescription();

	/**
	 * Returns the meta object for class '{@link de.jena.service.remote.service.DiscoveryConsumerService <em>Discovery Consumer Service</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Discovery Consumer Service</em>'.
	 * @see de.jena.service.remote.service.DiscoveryConsumerService
	 * @generated
	 */
	EClass getDiscoveryConsumerService();

	/**
	 * Returns the meta object for the '{@link de.jena.service.remote.service.DiscoveryConsumerService#onServiceAnnounced(de.jena.service.remote.service.ServiceDescription) <em>On Service Announced</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>On Service Announced</em>' operation.
	 * @see de.jena.service.remote.service.DiscoveryConsumerService#onServiceAnnounced(de.jena.service.remote.service.ServiceDescription)
	 * @generated
	 */
	EOperation getDiscoveryConsumerService__OnServiceAnnounced__ServiceDescription();

	/**
	 * Returns the meta object for enum '{@link de.jena.service.remote.service.ServiceLifeCycleState <em>Life Cycle State</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Life Cycle State</em>'.
	 * @see de.jena.service.remote.service.ServiceLifeCycleState
	 * @generated
	 */
	EEnum getServiceLifeCycleState();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	ServiceFactory getServiceFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each operation of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link de.jena.service.remote.service.impl.ServiceDescriptionImpl <em>Description</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.jena.service.remote.service.impl.ServiceDescriptionImpl
		 * @see de.jena.service.remote.service.impl.ServicePackageImpl#getServiceDescription()
		 * @generated
		 */
		EClass SERVICE_DESCRIPTION = eINSTANCE.getServiceDescription();

		/**
		 * The meta object literal for the '<em><b>Service Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SERVICE_DESCRIPTION__SERVICE_ID = eINSTANCE.getServiceDescription_ServiceId();

		/**
		 * The meta object literal for the '<em><b>Provider Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SERVICE_DESCRIPTION__PROVIDER_ID = eINSTANCE.getServiceDescription_ProviderId();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SERVICE_DESCRIPTION__NAME = eINSTANCE.getServiceDescription_Name();

		/**
		 * The meta object literal for the '<em><b>Vendor</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SERVICE_DESCRIPTION__VENDOR = eINSTANCE.getServiceDescription_Vendor();

		/**
		 * The meta object literal for the '<em><b>Rank</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SERVICE_DESCRIPTION__RANK = eINSTANCE.getServiceDescription_Rank();

		/**
		 * The meta object literal for the '<em><b>Source Uri</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SERVICE_DESCRIPTION__SOURCE_URI = eINSTANCE.getServiceDescription_SourceUri();

		/**
		 * The meta object literal for the '<em><b>Content Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SERVICE_DESCRIPTION__CONTENT_TYPE = eINSTANCE.getServiceDescription_ContentType();

		/**
		 * The meta object literal for the '<em><b>Life Cycle State</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SERVICE_DESCRIPTION__LIFE_CYCLE_STATE = eINSTANCE.getServiceDescription_LifeCycleState();

		/**
		 * The meta object literal for the '<em><b>Service Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SERVICE_DESCRIPTION__SERVICE_TYPE = eINSTANCE.getServiceDescription_ServiceType();

		/**
		 * The meta object literal for the '<em><b>Service Class</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SERVICE_DESCRIPTION__SERVICE_CLASS = eINSTANCE.getServiceDescription_ServiceClass();

		/**
		 * The meta object literal for the '<em><b>Operation</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SERVICE_DESCRIPTION__OPERATION = eINSTANCE.getServiceDescription_Operation();

		/**
		 * The meta object literal for the '{@link de.jena.service.remote.service.impl.ServiceOperationDescriptionImpl <em>Operation Description</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.jena.service.remote.service.impl.ServiceOperationDescriptionImpl
		 * @see de.jena.service.remote.service.impl.ServicePackageImpl#getServiceOperationDescription()
		 * @generated
		 */
		EClass SERVICE_OPERATION_DESCRIPTION = eINSTANCE.getServiceOperationDescription();

		/**
		 * The meta object literal for the '<em><b>Operation Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SERVICE_OPERATION_DESCRIPTION__OPERATION_ID = eINSTANCE.getServiceOperationDescription_OperationId();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SERVICE_OPERATION_DESCRIPTION__NAME = eINSTANCE.getServiceOperationDescription_Name();

		/**
		 * The meta object literal for the '<em><b>Operation Request Uri</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SERVICE_OPERATION_DESCRIPTION__OPERATION_REQUEST_URI = eINSTANCE.getServiceOperationDescription_OperationRequestUri();

		/**
		 * The meta object literal for the '<em><b>Operation Response Uri</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SERVICE_OPERATION_DESCRIPTION__OPERATION_RESPONSE_URI = eINSTANCE.getServiceOperationDescription_OperationResponseUri();

		/**
		 * The meta object literal for the '<em><b>Operation</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SERVICE_OPERATION_DESCRIPTION__OPERATION = eINSTANCE.getServiceOperationDescription_Operation();

		/**
		 * The meta object literal for the '<em><b>Operation Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SERVICE_OPERATION_DESCRIPTION__OPERATION_TYPE = eINSTANCE.getServiceOperationDescription_OperationType();

		/**
		 * The meta object literal for the '{@link de.jena.service.remote.service.impl.DiscoveryProviderServiceImpl <em>Discovery Provider Service</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.jena.service.remote.service.impl.DiscoveryProviderServiceImpl
		 * @see de.jena.service.remote.service.impl.ServicePackageImpl#getDiscoveryProviderService()
		 * @generated
		 */
		EClass DISCOVERY_PROVIDER_SERVICE = eINSTANCE.getDiscoveryProviderService();

		/**
		 * The meta object literal for the '<em><b>Announce</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation DISCOVERY_PROVIDER_SERVICE___ANNOUNCE__SERVICEDESCRIPTION = eINSTANCE.getDiscoveryProviderService__Announce__ServiceDescription();

		/**
		 * The meta object literal for the '{@link de.jena.service.remote.service.impl.DiscoveryConsumerServiceImpl <em>Discovery Consumer Service</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.jena.service.remote.service.impl.DiscoveryConsumerServiceImpl
		 * @see de.jena.service.remote.service.impl.ServicePackageImpl#getDiscoveryConsumerService()
		 * @generated
		 */
		EClass DISCOVERY_CONSUMER_SERVICE = eINSTANCE.getDiscoveryConsumerService();

		/**
		 * The meta object literal for the '<em><b>On Service Announced</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation DISCOVERY_CONSUMER_SERVICE___ON_SERVICE_ANNOUNCED__SERVICEDESCRIPTION = eINSTANCE.getDiscoveryConsumerService__OnServiceAnnounced__ServiceDescription();

		/**
		 * The meta object literal for the '{@link de.jena.service.remote.service.ServiceLifeCycleState <em>Life Cycle State</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.jena.service.remote.service.ServiceLifeCycleState
		 * @see de.jena.service.remote.service.impl.ServicePackageImpl#getServiceLifeCycleState()
		 * @generated
		 */
		EEnum SERVICE_LIFE_CYCLE_STATE = eINSTANCE.getServiceLifeCycleState();

	}

} //ServicePackage
