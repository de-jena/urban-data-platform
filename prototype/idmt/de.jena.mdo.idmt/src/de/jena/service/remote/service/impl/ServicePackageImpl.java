/**
 */
package de.jena.service.remote.service.impl;

import de.jena.mdo.idmt.idmt.IdmtPackage;

import de.jena.mdo.idmt.idmt.impl.IdmtPackageImpl;

import de.jena.service.remote.service.DiscoveryConsumerService;
import de.jena.service.remote.service.DiscoveryProviderService;
import de.jena.service.remote.service.ServiceDescription;
import de.jena.service.remote.service.ServiceFactory;
import de.jena.service.remote.service.ServiceLifeCycleState;
import de.jena.service.remote.service.ServiceOperationDescription;
import de.jena.service.remote.service.ServicePackage;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EOperation;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.EcorePackage;

import org.eclipse.emf.ecore.impl.EPackageImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class ServicePackageImpl extends EPackageImpl implements ServicePackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass serviceDescriptionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass serviceOperationDescriptionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass discoveryProviderServiceEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass discoveryConsumerServiceEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum serviceLifeCycleStateEEnum = null;

	/**
	 * Creates an instance of the model <b>Package</b>, registered with
	 * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
	 * package URI value.
	 * <p>Note: the correct way to create the package is via the static
	 * factory method {@link #init init()}, which also performs
	 * initialization of the package, or returns the registered package,
	 * if one already exists.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.ecore.EPackage.Registry
	 * @see de.jena.service.remote.service.ServicePackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private ServicePackageImpl() {
		super(eNS_URI, ServiceFactory.eINSTANCE);
	}
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static boolean isInited = false;

	/**
	 * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
	 *
	 * <p>This method is used to initialize {@link ServicePackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static ServicePackage init() {
		if (isInited) return (ServicePackage)EPackage.Registry.INSTANCE.getEPackage(ServicePackage.eNS_URI);

		// Obtain or create and register package
		Object registeredServicePackage = EPackage.Registry.INSTANCE.get(eNS_URI);
		ServicePackageImpl theServicePackage = registeredServicePackage instanceof ServicePackageImpl ? (ServicePackageImpl)registeredServicePackage : new ServicePackageImpl();

		isInited = true;

		// Initialize simple dependencies
		EcorePackage.eINSTANCE.eClass();

		// Obtain or create and register interdependencies
		Object registeredPackage = EPackage.Registry.INSTANCE.getEPackage(IdmtPackage.eNS_URI);
		IdmtPackageImpl theIdmtPackage = (IdmtPackageImpl)(registeredPackage instanceof IdmtPackageImpl ? registeredPackage : IdmtPackage.eINSTANCE);

		// Create package meta-data objects
		theServicePackage.createPackageContents();
		theIdmtPackage.createPackageContents();

		// Initialize created meta-data
		theServicePackage.initializePackageContents();
		theIdmtPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theServicePackage.freeze();

		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(ServicePackage.eNS_URI, theServicePackage);
		return theServicePackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getServiceDescription() {
		return serviceDescriptionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getServiceDescription_ServiceId() {
		return (EAttribute)serviceDescriptionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getServiceDescription_ProviderId() {
		return (EAttribute)serviceDescriptionEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getServiceDescription_Name() {
		return (EAttribute)serviceDescriptionEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getServiceDescription_Vendor() {
		return (EAttribute)serviceDescriptionEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getServiceDescription_Rank() {
		return (EAttribute)serviceDescriptionEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getServiceDescription_SourceUri() {
		return (EAttribute)serviceDescriptionEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getServiceDescription_ContentType() {
		return (EAttribute)serviceDescriptionEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getServiceDescription_LifeCycleState() {
		return (EAttribute)serviceDescriptionEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getServiceDescription_ServiceType() {
		return (EAttribute)serviceDescriptionEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getServiceDescription_ServiceClass() {
		return (EReference)serviceDescriptionEClass.getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getServiceDescription_Operation() {
		return (EReference)serviceDescriptionEClass.getEStructuralFeatures().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getServiceOperationDescription() {
		return serviceOperationDescriptionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getServiceOperationDescription_OperationId() {
		return (EAttribute)serviceOperationDescriptionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getServiceOperationDescription_Name() {
		return (EAttribute)serviceOperationDescriptionEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getServiceOperationDescription_OperationRequestUri() {
		return (EAttribute)serviceOperationDescriptionEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getServiceOperationDescription_OperationResponseUri() {
		return (EAttribute)serviceOperationDescriptionEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getServiceOperationDescription_Operation() {
		return (EReference)serviceOperationDescriptionEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getServiceOperationDescription_OperationType() {
		return (EAttribute)serviceOperationDescriptionEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getDiscoveryProviderService() {
		return discoveryProviderServiceEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getDiscoveryProviderService__Announce__ServiceDescription() {
		return discoveryProviderServiceEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getDiscoveryConsumerService() {
		return discoveryConsumerServiceEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getDiscoveryConsumerService__OnServiceAnnounced__ServiceDescription() {
		return discoveryConsumerServiceEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EEnum getServiceLifeCycleState() {
		return serviceLifeCycleStateEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ServiceFactory getServiceFactory() {
		return (ServiceFactory)getEFactoryInstance();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isCreated = false;

	/**
	 * Creates the meta-model objects for the package.  This method is
	 * guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void createPackageContents() {
		if (isCreated) return;
		isCreated = true;

		// Create classes and their features
		serviceDescriptionEClass = createEClass(SERVICE_DESCRIPTION);
		createEAttribute(serviceDescriptionEClass, SERVICE_DESCRIPTION__SERVICE_ID);
		createEAttribute(serviceDescriptionEClass, SERVICE_DESCRIPTION__PROVIDER_ID);
		createEAttribute(serviceDescriptionEClass, SERVICE_DESCRIPTION__NAME);
		createEAttribute(serviceDescriptionEClass, SERVICE_DESCRIPTION__VENDOR);
		createEAttribute(serviceDescriptionEClass, SERVICE_DESCRIPTION__RANK);
		createEAttribute(serviceDescriptionEClass, SERVICE_DESCRIPTION__SOURCE_URI);
		createEAttribute(serviceDescriptionEClass, SERVICE_DESCRIPTION__CONTENT_TYPE);
		createEAttribute(serviceDescriptionEClass, SERVICE_DESCRIPTION__LIFE_CYCLE_STATE);
		createEAttribute(serviceDescriptionEClass, SERVICE_DESCRIPTION__SERVICE_TYPE);
		createEReference(serviceDescriptionEClass, SERVICE_DESCRIPTION__SERVICE_CLASS);
		createEReference(serviceDescriptionEClass, SERVICE_DESCRIPTION__OPERATION);

		serviceOperationDescriptionEClass = createEClass(SERVICE_OPERATION_DESCRIPTION);
		createEAttribute(serviceOperationDescriptionEClass, SERVICE_OPERATION_DESCRIPTION__OPERATION_ID);
		createEAttribute(serviceOperationDescriptionEClass, SERVICE_OPERATION_DESCRIPTION__NAME);
		createEAttribute(serviceOperationDescriptionEClass, SERVICE_OPERATION_DESCRIPTION__OPERATION_REQUEST_URI);
		createEAttribute(serviceOperationDescriptionEClass, SERVICE_OPERATION_DESCRIPTION__OPERATION_RESPONSE_URI);
		createEReference(serviceOperationDescriptionEClass, SERVICE_OPERATION_DESCRIPTION__OPERATION);
		createEAttribute(serviceOperationDescriptionEClass, SERVICE_OPERATION_DESCRIPTION__OPERATION_TYPE);

		discoveryProviderServiceEClass = createEClass(DISCOVERY_PROVIDER_SERVICE);
		createEOperation(discoveryProviderServiceEClass, DISCOVERY_PROVIDER_SERVICE___ANNOUNCE__SERVICEDESCRIPTION);

		discoveryConsumerServiceEClass = createEClass(DISCOVERY_CONSUMER_SERVICE);
		createEOperation(discoveryConsumerServiceEClass, DISCOVERY_CONSUMER_SERVICE___ON_SERVICE_ANNOUNCED__SERVICEDESCRIPTION);

		// Create enums
		serviceLifeCycleStateEEnum = createEEnum(SERVICE_LIFE_CYCLE_STATE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isInitialized = false;

	/**
	 * Complete the initialization of the package and its meta-model.  This
	 * method is guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void initializePackageContents() {
		if (isInitialized) return;
		isInitialized = true;

		// Initialize package
		setName(eNAME);
		setNsPrefix(eNS_PREFIX);
		setNsURI(eNS_URI);

		// Obtain other dependent packages
		EcorePackage theEcorePackage = (EcorePackage)EPackage.Registry.INSTANCE.getEPackage(EcorePackage.eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes

		// Initialize classes, features, and operations; add parameters
		initEClass(serviceDescriptionEClass, ServiceDescription.class, "ServiceDescription", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getServiceDescription_ServiceId(), ecorePackage.getEString(), "serviceId", null, 1, 1, ServiceDescription.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getServiceDescription_ProviderId(), theEcorePackage.getEString(), "providerId", null, 1, 1, ServiceDescription.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getServiceDescription_Name(), ecorePackage.getEString(), "name", null, 0, 1, ServiceDescription.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getServiceDescription_Vendor(), ecorePackage.getEString(), "vendor", "application/csv", 0, 1, ServiceDescription.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getServiceDescription_Rank(), ecorePackage.getEInt(), "rank", null, 0, 1, ServiceDescription.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getServiceDescription_SourceUri(), ecorePackage.getEString(), "sourceUri", null, 0, 1, ServiceDescription.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getServiceDescription_ContentType(), ecorePackage.getEString(), "contentType", null, 0, 1, ServiceDescription.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getServiceDescription_LifeCycleState(), this.getServiceLifeCycleState(), "lifeCycleState", null, 0, 1, ServiceDescription.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getServiceDescription_ServiceType(), theEcorePackage.getEString(), "serviceType", null, 0, 1, ServiceDescription.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getServiceDescription_ServiceClass(), theEcorePackage.getEClassifier(), null, "serviceClass", null, 0, 1, ServiceDescription.class, IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getServiceDescription_Operation(), this.getServiceOperationDescription(), null, "operation", null, 0, -1, ServiceDescription.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		getServiceDescription_Operation().getEKeys().add(this.getServiceOperationDescription_Name());

		initEClass(serviceOperationDescriptionEClass, ServiceOperationDescription.class, "ServiceOperationDescription", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getServiceOperationDescription_OperationId(), ecorePackage.getEString(), "operationId", null, 1, 1, ServiceOperationDescription.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getServiceOperationDescription_Name(), ecorePackage.getEString(), "name", null, 1, 1, ServiceOperationDescription.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getServiceOperationDescription_OperationRequestUri(), ecorePackage.getEString(), "operationRequestUri", null, 0, 1, ServiceOperationDescription.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getServiceOperationDescription_OperationResponseUri(), ecorePackage.getEString(), "operationResponseUri", null, 0, 1, ServiceOperationDescription.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getServiceOperationDescription_Operation(), theEcorePackage.getEOperation(), null, "operation", null, 0, 1, ServiceOperationDescription.class, IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getServiceOperationDescription_OperationType(), theEcorePackage.getEString(), "operationType", null, 0, 1, ServiceOperationDescription.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(discoveryProviderServiceEClass, DiscoveryProviderService.class, "DiscoveryProviderService", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		EOperation op = initEOperation(getDiscoveryProviderService__Announce__ServiceDescription(), null, "announce", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getServiceDescription(), "description", 1, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(discoveryConsumerServiceEClass, DiscoveryConsumerService.class, "DiscoveryConsumerService", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		op = initEOperation(getDiscoveryConsumerService__OnServiceAnnounced__ServiceDescription(), null, "onServiceAnnounced", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getServiceDescription(), "description", 1, 1, IS_UNIQUE, IS_ORDERED);

		// Initialize enums and add enum literals
		initEEnum(serviceLifeCycleStateEEnum, ServiceLifeCycleState.class, "ServiceLifeCycleState");
		addEEnumLiteral(serviceLifeCycleStateEEnum, ServiceLifeCycleState.ANNOUNCE);
		addEEnumLiteral(serviceLifeCycleStateEEnum, ServiceLifeCycleState.CHANGE);
		addEEnumLiteral(serviceLifeCycleStateEEnum, ServiceLifeCycleState.REMOVE);

		// Create resource
		createResource(eNS_URI);

		// Create annotations
		// Version
		createVersionAnnotations();
		// http://www.eclipse.org/emf/2002/GenModel
		createGenModelAnnotations();
	}

	/**
	 * Initializes the annotations for <b>Version</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void createVersionAnnotations() {
		String source = "Version";
		addAnnotation
		  (this,
		   source,
		   new String[] {
			   "value", "1.0"
		   });
	}

	/**
	 * Initializes the annotations for <b>http://www.eclipse.org/emf/2002/GenModel</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void createGenModelAnnotations() {
		String source = "http://www.eclipse.org/emf/2002/GenModel";
		addAnnotation
		  (this,
		   source,
		   new String[] {
			   "basePackage", "de.jena.service.remote"
		   });
		addAnnotation
		  (serviceDescriptionEClass,
		   source,
		   new String[] {
			   "documentation", "An abstract service description"
		   });
		addAnnotation
		  (getServiceDescription_ProviderId(),
		   source,
		   new String[] {
			   "documentation", "The identifier for the service provider"
		   });
		addAnnotation
		  (serviceOperationDescriptionEClass,
		   source,
		   new String[] {
			   "documentation", "A response object containing all information about a result and its meta data"
		   });
		addAnnotation
		  (getServiceOperationDescription_OperationId(),
		   source,
		   new String[] {
			   "documentation", "The correlated request id, this reponse belongs to."
		   });
		addAnnotation
		  (getServiceOperationDescription_OperationRequestUri(),
		   source,
		   new String[] {
			   "documentation", "The Uri to listen "
		   });
		addAnnotation
		  (discoveryProviderServiceEClass,
		   source,
		   new String[] {
			   "documentation", "Method to announce a service providing a service description and a corresponding service lifecycle. This needs to implemented by a service provider.\n\nNew service description or their changes or removals should published to topic\n<prefix>/services"
		   });
		addAnnotation
		  (discoveryConsumerServiceEClass,
		   source,
		   new String[] {
			   "documentation", "The consumer side to retrieve a service description. Service consumer implement this interface, to listen for service changes.\n\nConsumers should listen to topic:\n<prefix>/services\nto get informed about service descriptions"
		   });
	}

} //ServicePackageImpl
