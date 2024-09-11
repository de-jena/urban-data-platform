/**
 */
package de.jena.mdo.idmt.idmt.impl;

import de.jena.mdo.idmt.idmt.ADryRunResponse;
import de.jena.mdo.idmt.idmt.AFeatureConfiguration;
import de.jena.mdo.idmt.idmt.AModelConfiguration;
import de.jena.mdo.idmt.idmt.ARequest;
import de.jena.mdo.idmt.idmt.AResponse;
import de.jena.mdo.idmt.idmt.AnonymizationService;
import de.jena.mdo.idmt.idmt.AnonymizationServiceDescription;
import de.jena.mdo.idmt.idmt.AnonymizationServiceLifeCycleState;
import de.jena.mdo.idmt.idmt.ArxModel;
import de.jena.mdo.idmt.idmt.ComputeDistanceType;
import de.jena.mdo.idmt.idmt.FeatureStrategyType;
import de.jena.mdo.idmt.idmt.GradType;
import de.jena.mdo.idmt.idmt.IDMTFeature;
import de.jena.mdo.idmt.idmt.IDMTModel;
import de.jena.mdo.idmt.idmt.IdmtFactory;
import de.jena.mdo.idmt.idmt.IdmtPackage;
import de.jena.mdo.idmt.idmt.ModelStrategyType;
import de.jena.mdo.idmt.idmt.RegularizerGrad;
import de.jena.mdo.idmt.idmt.RegularizerType;
import de.jena.mdo.idmt.idmt.ResponseType;

import de.jena.service.remote.service.ServicePackage;

import de.jena.service.remote.service.impl.ServicePackageImpl;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EGenericType;
import org.eclipse.emf.ecore.EOperation;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.ETypeParameter;
import org.eclipse.emf.ecore.EcorePackage;

import org.eclipse.emf.ecore.impl.EPackageImpl;

import org.osgi.util.promise.Promise;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class IdmtPackageImpl extends EPackageImpl implements IdmtPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass aRequestEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass aResponseEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass aDryRunResponseEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass aModelConfigurationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass aFeatureConfigurationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass anonymizationServiceEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass idmtModelEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass idmtFeatureEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass regularizerGradEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass anonymizationServiceDescriptionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass arxModelEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum responseTypeEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum regularizerTypeEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum gradTypeEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum modelStrategyTypeEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum computeDistanceTypeEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum featureStrategyTypeEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum anonymizationServiceLifeCycleStateEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType resultPromiseEDataType = null;

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
	 * @see de.jena.mdo.idmt.idmt.IdmtPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private IdmtPackageImpl() {
		super(eNS_URI, IdmtFactory.eINSTANCE);
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
	 * <p>This method is used to initialize {@link IdmtPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static IdmtPackage init() {
		if (isInited) return (IdmtPackage)EPackage.Registry.INSTANCE.getEPackage(IdmtPackage.eNS_URI);

		// Obtain or create and register package
		Object registeredIdmtPackage = EPackage.Registry.INSTANCE.get(eNS_URI);
		IdmtPackageImpl theIdmtPackage = registeredIdmtPackage instanceof IdmtPackageImpl ? (IdmtPackageImpl)registeredIdmtPackage : new IdmtPackageImpl();

		isInited = true;

		// Initialize simple dependencies
		EcorePackage.eINSTANCE.eClass();

		// Obtain or create and register interdependencies
		Object registeredPackage = EPackage.Registry.INSTANCE.getEPackage(ServicePackage.eNS_URI);
		ServicePackageImpl theServicePackage = (ServicePackageImpl)(registeredPackage instanceof ServicePackageImpl ? registeredPackage : ServicePackage.eINSTANCE);

		// Create package meta-data objects
		theIdmtPackage.createPackageContents();
		theServicePackage.createPackageContents();

		// Initialize created meta-data
		theIdmtPackage.initializePackageContents();
		theServicePackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theIdmtPackage.freeze();

		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(IdmtPackage.eNS_URI, theIdmtPackage);
		return theIdmtPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getARequest() {
		return aRequestEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getARequest_RequestId() {
		return (EAttribute)aRequestEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getARequest_ConsumerId() {
		return (EAttribute)aRequestEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getARequest_Config() {
		return (EReference)aRequestEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getARequest_SrcUri() {
		return (EAttribute)aRequestEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getARequest_ContentType() {
		return (EAttribute)aRequestEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getAResponse() {
		return aResponseEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getAResponse_RequestId() {
		return (EAttribute)aResponseEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getAResponse_Config() {
		return (EReference)aResponseEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getAResponse_Type() {
		return (EAttribute)aResponseEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getAResponse_StatusMessage() {
		return (EAttribute)aResponseEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getAResponse_ResultUri() {
		return (EAttribute)aResponseEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getAResponse_ResultContentType() {
		return (EAttribute)aResponseEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getAResponse_ElapsedTime() {
		return (EAttribute)aResponseEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getAResponse_RemainingTime() {
		return (EAttribute)aResponseEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getADryRunResponse() {
		return aDryRunResponseEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getADryRunResponse_EstCalcTime() {
		return (EAttribute)aDryRunResponseEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getAModelConfiguration() {
		return aModelConfigurationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getAModelConfiguration_Strategy() {
		return (EAttribute)aModelConfigurationEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getAModelConfiguration_Features() {
		return (EReference)aModelConfigurationEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getAFeatureConfiguration() {
		return aFeatureConfigurationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getAFeatureConfiguration_Name() {
		return (EAttribute)aFeatureConfigurationEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getAFeatureConfiguration_Type() {
		return (EAttribute)aFeatureConfigurationEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getAFeatureConfiguration_Strategy() {
		return (EAttribute)aFeatureConfigurationEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getAnonymizationService() {
		return anonymizationServiceEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getAnonymizationService__DoAnonymizationDryRun__ARequest() {
		return anonymizationServiceEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getAnonymizationService__DoAnonymization__ARequest() {
		return anonymizationServiceEClass.getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getAnonymizationService__DoAnonymizationAsync__ARequest() {
		return anonymizationServiceEClass.getEOperations().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getAnonymizationService__DoAnonymizationImmediateAsync__ARequest() {
		return anonymizationServiceEClass.getEOperations().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getAnonymizationService__CancelRequest__String_String() {
		return anonymizationServiceEClass.getEOperations().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getAnonymizationService__GetRequestStatus__ARequest() {
		return anonymizationServiceEClass.getEOperations().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getIDMTModel() {
		return idmtModelEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getIDMTModel_K() {
		return (EAttribute)idmtModelEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getIDMTModel_RegGrad() {
		return (EReference)idmtModelEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getIDMTModel_Noisy() {
		return (EAttribute)idmtModelEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getIDMTFeature() {
		return idmtFeatureEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getIDMTFeature_Age() {
		return (EAttribute)idmtFeatureEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getRegularizerGrad() {
		return regularizerGradEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getRegularizerGrad_Reg() {
		return (EAttribute)regularizerGradEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getRegularizerGrad_Grad() {
		return (EAttribute)regularizerGradEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getAnonymizationServiceDescription() {
		return anonymizationServiceDescriptionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getArxModel() {
		return arxModelEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EEnum getResponseType() {
		return responseTypeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EEnum getRegularizerType() {
		return regularizerTypeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EEnum getGradType() {
		return gradTypeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EEnum getModelStrategyType() {
		return modelStrategyTypeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EEnum getComputeDistanceType() {
		return computeDistanceTypeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EEnum getFeatureStrategyType() {
		return featureStrategyTypeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EEnum getAnonymizationServiceLifeCycleState() {
		return anonymizationServiceLifeCycleStateEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EDataType getResultPromise() {
		return resultPromiseEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public IdmtFactory getIdmtFactory() {
		return (IdmtFactory)getEFactoryInstance();
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
		aRequestEClass = createEClass(AREQUEST);
		createEAttribute(aRequestEClass, AREQUEST__REQUEST_ID);
		createEAttribute(aRequestEClass, AREQUEST__CONSUMER_ID);
		createEReference(aRequestEClass, AREQUEST__CONFIG);
		createEAttribute(aRequestEClass, AREQUEST__SRC_URI);
		createEAttribute(aRequestEClass, AREQUEST__CONTENT_TYPE);

		aResponseEClass = createEClass(ARESPONSE);
		createEAttribute(aResponseEClass, ARESPONSE__REQUEST_ID);
		createEReference(aResponseEClass, ARESPONSE__CONFIG);
		createEAttribute(aResponseEClass, ARESPONSE__TYPE);
		createEAttribute(aResponseEClass, ARESPONSE__STATUS_MESSAGE);
		createEAttribute(aResponseEClass, ARESPONSE__RESULT_URI);
		createEAttribute(aResponseEClass, ARESPONSE__RESULT_CONTENT_TYPE);
		createEAttribute(aResponseEClass, ARESPONSE__ELAPSED_TIME);
		createEAttribute(aResponseEClass, ARESPONSE__REMAINING_TIME);

		aDryRunResponseEClass = createEClass(ADRY_RUN_RESPONSE);
		createEAttribute(aDryRunResponseEClass, ADRY_RUN_RESPONSE__EST_CALC_TIME);

		aModelConfigurationEClass = createEClass(AMODEL_CONFIGURATION);
		createEAttribute(aModelConfigurationEClass, AMODEL_CONFIGURATION__STRATEGY);
		createEReference(aModelConfigurationEClass, AMODEL_CONFIGURATION__FEATURES);

		aFeatureConfigurationEClass = createEClass(AFEATURE_CONFIGURATION);
		createEAttribute(aFeatureConfigurationEClass, AFEATURE_CONFIGURATION__NAME);
		createEAttribute(aFeatureConfigurationEClass, AFEATURE_CONFIGURATION__TYPE);
		createEAttribute(aFeatureConfigurationEClass, AFEATURE_CONFIGURATION__STRATEGY);

		anonymizationServiceEClass = createEClass(ANONYMIZATION_SERVICE);
		createEOperation(anonymizationServiceEClass, ANONYMIZATION_SERVICE___DO_ANONYMIZATION_DRY_RUN__AREQUEST);
		createEOperation(anonymizationServiceEClass, ANONYMIZATION_SERVICE___DO_ANONYMIZATION__AREQUEST);
		createEOperation(anonymizationServiceEClass, ANONYMIZATION_SERVICE___DO_ANONYMIZATION_ASYNC__AREQUEST);
		createEOperation(anonymizationServiceEClass, ANONYMIZATION_SERVICE___DO_ANONYMIZATION_IMMEDIATE_ASYNC__AREQUEST);
		createEOperation(anonymizationServiceEClass, ANONYMIZATION_SERVICE___CANCEL_REQUEST__STRING_STRING);
		createEOperation(anonymizationServiceEClass, ANONYMIZATION_SERVICE___GET_REQUEST_STATUS__AREQUEST);

		idmtModelEClass = createEClass(IDMT_MODEL);
		createEAttribute(idmtModelEClass, IDMT_MODEL__K);
		createEReference(idmtModelEClass, IDMT_MODEL__REG_GRAD);
		createEAttribute(idmtModelEClass, IDMT_MODEL__NOISY);

		idmtFeatureEClass = createEClass(IDMT_FEATURE);
		createEAttribute(idmtFeatureEClass, IDMT_FEATURE__AGE);

		regularizerGradEClass = createEClass(REGULARIZER_GRAD);
		createEAttribute(regularizerGradEClass, REGULARIZER_GRAD__REG);
		createEAttribute(regularizerGradEClass, REGULARIZER_GRAD__GRAD);

		anonymizationServiceDescriptionEClass = createEClass(ANONYMIZATION_SERVICE_DESCRIPTION);

		arxModelEClass = createEClass(ARX_MODEL);

		// Create enums
		responseTypeEEnum = createEEnum(RESPONSE_TYPE);
		regularizerTypeEEnum = createEEnum(REGULARIZER_TYPE);
		gradTypeEEnum = createEEnum(GRAD_TYPE);
		modelStrategyTypeEEnum = createEEnum(MODEL_STRATEGY_TYPE);
		computeDistanceTypeEEnum = createEEnum(COMPUTE_DISTANCE_TYPE);
		featureStrategyTypeEEnum = createEEnum(FEATURE_STRATEGY_TYPE);
		anonymizationServiceLifeCycleStateEEnum = createEEnum(ANONYMIZATION_SERVICE_LIFE_CYCLE_STATE);

		// Create data types
		resultPromiseEDataType = createEDataType(RESULT_PROMISE);
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
		ServicePackage theServicePackage = (ServicePackage)EPackage.Registry.INSTANCE.getEPackage(ServicePackage.eNS_URI);

		// Create type parameters
		ETypeParameter resultPromiseEDataType_T = addETypeParameter(resultPromiseEDataType, "T");

		// Set bounds for type parameters
		EGenericType g1 = createEGenericType(this.getAResponse());
		resultPromiseEDataType_T.getEBounds().add(g1);

		// Add supertypes to classes
		aDryRunResponseEClass.getESuperTypes().add(this.getAResponse());
		idmtModelEClass.getESuperTypes().add(this.getAModelConfiguration());
		idmtFeatureEClass.getESuperTypes().add(this.getAFeatureConfiguration());
		anonymizationServiceDescriptionEClass.getESuperTypes().add(theServicePackage.getServiceDescription());
		arxModelEClass.getESuperTypes().add(this.getAModelConfiguration());

		// Initialize classes, features, and operations; add parameters
		initEClass(aRequestEClass, ARequest.class, "ARequest", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getARequest_RequestId(), ecorePackage.getEString(), "requestId", null, 1, 1, ARequest.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getARequest_ConsumerId(), theEcorePackage.getEString(), "consumerId", null, 0, 1, ARequest.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getARequest_Config(), this.getAModelConfiguration(), null, "config", null, 0, 1, ARequest.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getARequest_SrcUri(), ecorePackage.getEString(), "srcUri", null, 0, 1, ARequest.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getARequest_ContentType(), ecorePackage.getEString(), "contentType", "application/csv", 0, 1, ARequest.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(aResponseEClass, AResponse.class, "AResponse", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getAResponse_RequestId(), ecorePackage.getEString(), "requestId", null, 1, 1, AResponse.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getAResponse_Config(), this.getAModelConfiguration(), null, "config", null, 0, 1, AResponse.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getAResponse_Type(), this.getResponseType(), "type", null, 1, 1, AResponse.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getAResponse_StatusMessage(), ecorePackage.getEString(), "statusMessage", null, 0, 1, AResponse.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getAResponse_ResultUri(), ecorePackage.getEString(), "resultUri", null, 0, 1, AResponse.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getAResponse_ResultContentType(), ecorePackage.getEString(), "resultContentType", "application/csv", 0, 1, AResponse.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getAResponse_ElapsedTime(), ecorePackage.getELong(), "elapsedTime", null, 0, 1, AResponse.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getAResponse_RemainingTime(), ecorePackage.getELong(), "remainingTime", null, 0, 1, AResponse.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(aDryRunResponseEClass, ADryRunResponse.class, "ADryRunResponse", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getADryRunResponse_EstCalcTime(), ecorePackage.getELong(), "estCalcTime", null, 0, 1, ADryRunResponse.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(aModelConfigurationEClass, AModelConfiguration.class, "AModelConfiguration", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getAModelConfiguration_Strategy(), this.getModelStrategyType(), "strategy", null, 0, 1, AModelConfiguration.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getAModelConfiguration_Features(), this.getAFeatureConfiguration(), null, "features", null, 0, -1, AModelConfiguration.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(aFeatureConfigurationEClass, AFeatureConfiguration.class, "AFeatureConfiguration", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getAFeatureConfiguration_Name(), ecorePackage.getEString(), "name", null, 0, 1, AFeatureConfiguration.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getAFeatureConfiguration_Type(), ecorePackage.getEString(), "type", null, 0, 1, AFeatureConfiguration.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getAFeatureConfiguration_Strategy(), this.getFeatureStrategyType(), "strategy", null, 0, 1, AFeatureConfiguration.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(anonymizationServiceEClass, AnonymizationService.class, "AnonymizationService", IS_ABSTRACT, IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		EOperation op = initEOperation(getAnonymizationService__DoAnonymizationDryRun__ARequest(), this.getADryRunResponse(), "doAnonymizationDryRun", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getARequest(), "request", 1, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getAnonymizationService__DoAnonymization__ARequest(), this.getAResponse(), "doAnonymization", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getARequest(), "request", 1, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getAnonymizationService__DoAnonymizationAsync__ARequest(), null, "doAnonymizationAsync", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getARequest(), "request", 1, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(this.getResultPromise());
		EGenericType g2 = createEGenericType(this.getAResponse());
		g1.getETypeArguments().add(g2);
		initEOperation(op, g1);

		op = initEOperation(getAnonymizationService__DoAnonymizationImmediateAsync__ARequest(), this.getAResponse(), "doAnonymizationImmediateAsync", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getARequest(), "request", 1, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getAnonymizationService__CancelRequest__String_String(), null, "cancelRequest", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEString(), "providerId", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEString(), "requestId", 1, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(this.getResultPromise());
		g2 = createEGenericType(this.getAResponse());
		g1.getETypeArguments().add(g2);
		initEOperation(op, g1);

		op = initEOperation(getAnonymizationService__GetRequestStatus__ARequest(), this.getAResponse(), "getRequestStatus", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getARequest(), "request", 1, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(idmtModelEClass, IDMTModel.class, "IDMTModel", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getIDMTModel_K(), ecorePackage.getEInt(), "k", "3", 0, -1, IDMTModel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getIDMTModel_RegGrad(), this.getRegularizerGrad(), null, "regGrad", null, 1, -1, IDMTModel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getIDMTModel_Noisy(), ecorePackage.getEBoolean(), "noisy", null, 1, -1, IDMTModel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(idmtFeatureEClass, IDMTFeature.class, "IDMTFeature", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getIDMTFeature_Age(), this.getComputeDistanceType(), "age", null, 1, -1, IDMTFeature.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(regularizerGradEClass, RegularizerGrad.class, "RegularizerGrad", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getRegularizerGrad_Reg(), this.getRegularizerType(), "reg", null, 1, 1, RegularizerGrad.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getRegularizerGrad_Grad(), this.getGradType(), "grad", null, 1, 1, RegularizerGrad.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(anonymizationServiceDescriptionEClass, AnonymizationServiceDescription.class, "AnonymizationServiceDescription", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(arxModelEClass, ArxModel.class, "ArxModel", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		// Initialize enums and add enum literals
		initEEnum(responseTypeEEnum, ResponseType.class, "ResponseType");
		addEEnumLiteral(responseTypeEEnum, ResponseType.DEFAULT);
		addEEnumLiteral(responseTypeEEnum, ResponseType.DRY_RESPONSE);
		addEEnumLiteral(responseTypeEEnum, ResponseType.ASYNC_RESPONSE);
		addEEnumLiteral(responseTypeEEnum, ResponseType.ASYNC_RUNNING);
		addEEnumLiteral(responseTypeEEnum, ResponseType.ASYNC_CANCELLED);
		addEEnumLiteral(responseTypeEEnum, ResponseType.ERROR);

		initEEnum(regularizerTypeEEnum, RegularizerType.class, "RegularizerType");
		addEEnumLiteral(regularizerTypeEEnum, RegularizerType.DEFAULT);
		addEEnumLiteral(regularizerTypeEEnum, RegularizerType.REGULARIZOR);
		addEEnumLiteral(regularizerTypeEEnum, RegularizerType.ANTI);
		addEEnumLiteral(regularizerTypeEEnum, RegularizerType.MINUS);

		initEEnum(gradTypeEEnum, GradType.class, "GradType");
		addEEnumLiteral(gradTypeEEnum, GradType.F);
		addEEnumLiteral(gradTypeEEnum, GradType.REG);
		addEEnumLiteral(gradTypeEEnum, GradType.ANTI);
		addEEnumLiteral(gradTypeEEnum, GradType.MINUS);

		initEEnum(modelStrategyTypeEEnum, ModelStrategyType.class, "ModelStrategyType");
		addEEnumLiteral(modelStrategyTypeEEnum, ModelStrategyType.PER_DATASET);
		addEEnumLiteral(modelStrategyTypeEEnum, ModelStrategyType.PER_COLUMN_IGNORE);
		addEEnumLiteral(modelStrategyTypeEEnum, ModelStrategyType.PER_COLUMN_AS_IS);

		initEEnum(computeDistanceTypeEEnum, ComputeDistanceType.class, "ComputeDistanceType");
		addEEnumLiteral(computeDistanceTypeEEnum, ComputeDistanceType.DISTANCE_SQUARED);
		addEEnumLiteral(computeDistanceTypeEEnum, ComputeDistanceType.DISTANCE_DIFFERENCE);
		addEEnumLiteral(computeDistanceTypeEEnum, ComputeDistanceType.DISTANCE_CATEGORICAL_50);
		addEEnumLiteral(computeDistanceTypeEEnum, ComputeDistanceType.DISTANCE_CATEGORICAL_100);
		addEEnumLiteral(computeDistanceTypeEEnum, ComputeDistanceType.DISTANCE_CATEGORICAL_200);

		initEEnum(featureStrategyTypeEEnum, FeatureStrategyType.class, "FeatureStrategyType");
		addEEnumLiteral(featureStrategyTypeEEnum, FeatureStrategyType.ANONYMIZE);
		addEEnumLiteral(featureStrategyTypeEEnum, FeatureStrategyType.IGNORE);
		addEEnumLiteral(featureStrategyTypeEEnum, FeatureStrategyType.DO_NOT_ANONYMIZE);

		initEEnum(anonymizationServiceLifeCycleStateEEnum, AnonymizationServiceLifeCycleState.class, "AnonymizationServiceLifeCycleState");
		addEEnumLiteral(anonymizationServiceLifeCycleStateEEnum, AnonymizationServiceLifeCycleState.ANNOUNCE);
		addEEnumLiteral(anonymizationServiceLifeCycleStateEEnum, AnonymizationServiceLifeCycleState.CHANGE);
		addEEnumLiteral(anonymizationServiceLifeCycleStateEEnum, AnonymizationServiceLifeCycleState.REMOVE);

		// Initialize data types
		initEDataType(resultPromiseEDataType, Promise.class, "ResultPromise", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);

		// Create resource
		createResource(eNS_URI);

		// Create annotations
		// Version
		createVersionAnnotations();
		// http://www.eclipse.org/emf/2002/GenModel
		createGenModelAnnotations();
		// Codec
		createCodecAnnotations();
		// Service
		createServiceAnnotations();
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
			   "basePackage", "de.jena.mdo.idmt",
			   "complianceLevel", "17.0",
			   "fileExtensions", "idmt",
			   "oSGiCompatible", "true",
			   "resource", "XMI"
		   });
		addAnnotation
		  (aRequestEClass,
		   source,
		   new String[] {
			   "documentation", "A request object containing all information about request paramters that are needed."
		   });
		addAnnotation
		  (getARequest_RequestId(),
		   source,
		   new String[] {
			   "documentation", "Identifier for this request. Each request gets an own unique identifier"
		   });
		addAnnotation
		  (getARequest_ConsumerId(),
		   source,
		   new String[] {
			   "documentation", "Identifier for the caller / the requestor, that is the consumer of the service"
		   });
		addAnnotation
		  (aResponseEClass,
		   source,
		   new String[] {
			   "documentation", "A response object containing all information about a result and its meta data"
		   });
		addAnnotation
		  (getAResponse_RequestId(),
		   source,
		   new String[] {
			   "documentation", "The correlated request id, this reponse belongs to."
		   });
		addAnnotation
		  (getAResponse_Config(),
		   source,
		   new String[] {
			   "documentation", "The configuration this result based upon."
		   });
		addAnnotation
		  (getAResponse_Type(),
		   source,
		   new String[] {
			   "documentation", "The response type / kind"
		   });
		addAnnotation
		  (getAResponse_StatusMessage(),
		   source,
		   new String[] {
			   "documentation", "The status message of a response. It contains human readable information, like error messages"
		   });
		addAnnotation
		  (getAResponse_ResultUri(),
		   source,
		   new String[] {
			   "documentation", "An URI under which the result, anonymized data set is available"
		   });
		addAnnotation
		  (getAResponse_ResultContentType(),
		   source,
		   new String[] {
			   "documentation", "The content type for the resulting data set"
		   });
		addAnnotation
		  (getAResponse_ElapsedTime(),
		   source,
		   new String[] {
			   "documentation", "The actual runtime in ms."
		   });
		addAnnotation
		  (getAResponse_RemainingTime(),
		   source,
		   new String[] {
			   "documentation", "The remaining runtime in ms."
		   });
		addAnnotation
		  (responseTypeEEnum,
		   source,
		   new String[] {
			   "documentation", "Defines the type of a response"
		   });
		addAnnotation
		  (responseTypeEEnum.getELiterals().get(0),
		   source,
		   new String[] {
			   "documentation", "Default response for a synchronous or asynchronous call"
		   });
		addAnnotation
		  (responseTypeEEnum.getELiterals().get(1),
		   source,
		   new String[] {
			   "documentation", "Reponse for a dry run request"
		   });
		addAnnotation
		  (responseTypeEEnum.getELiterals().get(2),
		   source,
		   new String[] {
			   "documentation", "Response for an asynchropnous call that returned intermediate information immediately. This response type can be used for very long running operations. The information can be used to get the request status using the corresponding operation"
		   });
		addAnnotation
		  (responseTypeEEnum.getELiterals().get(3),
		   source,
		   new String[] {
			   "documentation", "Response for an asynchropnous call that returned intermediate information immediately. This response type can be used for very long running operations and status request. It indicates, that the process is still running. If the result finished the ASYNC RESPONSE will be provided."
		   });
		addAnnotation
		  (responseTypeEEnum.getELiterals().get(4),
		   source,
		   new String[] {
			   "documentation", "Response for an asynchropnous call that returned intermediate information immediately. This response type can be used for very long running operations and status request. It indicates, that the process is still running. If the result finished the ASYNC RESPONSE will be provided."
		   });
		addAnnotation
		  (aDryRunResponseEClass,
		   source,
		   new String[] {
			   "documentation", "A response object containing all information about a dry run execution. It onl\u00f6y contains meta data and not result data."
		   });
		addAnnotation
		  (aModelConfigurationEClass,
		   source,
		   new String[] {
			   "documentation", "A configuration object for an anonymization model. "
		   });
		addAnnotation
		  (getAModelConfiguration_Features(),
		   source,
		   new String[] {
			   "documentation", "A list of column specifica configuration for this anonymization model."
		   });
		addAnnotation
		  (aFeatureConfigurationEClass,
		   source,
		   new String[] {
			   "documentation", "A column / field specific configuration object for an anonymization model. "
		   });
		addAnnotation
		  (getAFeatureConfiguration_Name(),
		   source,
		   new String[] {
			   "documentation", "The name / identifier of a field or column"
		   });
		addAnnotation
		  (getAFeatureConfiguration_Strategy(),
		   source,
		   new String[] {
			   "documentation", "A strategy how to interpret this field in the anonymization process."
		   });
		addAnnotation
		  (getAnonymizationService__DoAnonymizationDryRun__ARequest(),
		   source,
		   new String[] {
			   "documentation", "Return a best guessing for the runtime of this anonymization process. This method returns immediatly.\n\nRequest Topic:\n<prefix>/anonymization/dryRun/req\nResponse Topic:\n<prefix>/anonymization/dryRun/resp"
		   });
		addAnnotation
		  (getAnonymizationService__DoAnonymization__ARequest(),
		   source,
		   new String[] {
			   "documentation", "Executes an anonymization process synchronously. This call is blocking and only returns once the execution finished. Even on error this method returns a result, that contains the corresponding error information.\n\nRequest Topic:\n<prefix>/anonymization/sync/req\nResponse Topic:\n<prefix>/anonymization/sync/resp"
		   });
		addAnnotation
		  (getAnonymizationService__DoAnonymizationAsync__ARequest(),
		   source,
		   new String[] {
			   "documentation", "Executes an anonymization process asynchronously. This call is non-blocking and returns immediately with a promise. Once the execution is finished, the promise resolves with the result. If an error occurs this method also resolves with  a result, that contains the corresponding error information.\n\nRequest Topic:\n<prefix>/anonymization/async/req\nResponse Topic:\n<prefix>/anonymization/async/resp"
		   });
		addAnnotation
		  (getAnonymizationService__DoAnonymizationImmediateAsync__ARequest(),
		   source,
		   new String[] {
			   "documentation", "Executes an anonymization process asynchronously. This call is non-blocking and returns immediately with a result object. The response object contains intermediate information. These information can be used to get the current request status, using the corresponding operation.\n\nRequest Topic:\n<prefix>/anonymization/immediate/req\nResponse Topic:\n<prefix>/anonymization/immediate/resp"
		   });
		addAnnotation
		  (getAnonymizationService__CancelRequest__String_String(),
		   source,
		   new String[] {
			   "documentation", "Cancels a current request. The response is returned as soon as cancellation was executed either successfully or not.\n\nTopic:\n<prefix>/anonymization/immediate/cancel"
		   });
		addAnnotation
		  (getAnonymizationService__GetRequestStatus__ARequest(),
		   source,
		   new String[] {
			   "documentation", "When a immediate asynchronous call was executed a result is returned immediately even if the operation is still in progress. The get information about the running operation, this method can be called.\n\nTopic:\n<prefix>/anonymization/immediate/status"
		   });
		addAnnotation
		  (idmtModelEClass,
		   source,
		   new String[] {
			   "documentation", "Example of a concrete implementation specific anonymization model configuration for the IDMT algorythm"
		   });
		addAnnotation
		  (getIDMTModel_K(),
		   source,
		   new String[] {
			   "documentation", "Datensatzbasiert"
		   });
		addAnnotation
		  (getIDMTModel_RegGrad(),
		   source,
		   new String[] {
			   "documentation", "Datensatzbasiert"
		   });
		addAnnotation
		  (getIDMTModel_Noisy(),
		   source,
		   new String[] {
			   "documentation", "Datensatzbasiert"
		   });
		addAnnotation
		  (modelStrategyTypeEEnum,
		   source,
		   new String[] {
			   "documentation", "A strategy enumeration, how to handle a configuration. This stategy defines, how the column should be handled as well."
		   });
		addAnnotation
		  (modelStrategyTypeEEnum.getELiterals().get(0),
		   source,
		   new String[] {
			   "documentation", "The whole dataset resp. model configuration has priority. It is applied to all fields / column in the dataset. Column specific configruation overwrite this general setup."
		   });
		addAnnotation
		  (modelStrategyTypeEEnum.getELiterals().get(1),
		   source,
		   new String[] {
			   "documentation", "The whole dataset resp. model configuration is completely ignored. Only the column specific configruation are taken into account. Columns in the dataset that have no configuration are ignored"
		   });
		addAnnotation
		  (modelStrategyTypeEEnum.getELiterals().get(2),
		   source,
		   new String[] {
			   "documentation", "The whole dataset resp. model configuration is completely ignored. Only the column specific configruation are taken into account. Columns in the dataset that have no configuration are ignored"
		   });
		addAnnotation
		  (featureStrategyTypeEEnum,
		   source,
		   new String[] {
			   "documentation", "A strategy enumeration, how to interpret a field / column in the anonymization process."
		   });
		addAnnotation
		  (featureStrategyTypeEEnum.getELiterals().get(0),
		   source,
		   new String[] {
			   "documentation", "Anonymize this field / column"
		   });
		addAnnotation
		  (featureStrategyTypeEEnum.getELiterals().get(1),
		   source,
		   new String[] {
			   "documentation", "Ignore this column. This can be used for deny listing a column."
		   });
		addAnnotation
		  (featureStrategyTypeEEnum.getELiterals().get(2),
		   source,
		   new String[] {
			   "documentation", "Take this column as it is. This can be used for deny listing a column from anonymization."
		   });
		addAnnotation
		  (anonymizationServiceDescriptionEClass,
		   source,
		   new String[] {
			   "documentation", "Example of a custom implementation of an anonymization service description."
		   });
	}

	/**
	 * Initializes the annotations for <b>Codec</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void createCodecAnnotations() {
		String source = "Codec";
		addAnnotation
		  (getAResponse_Type(),
		   source,
		   new String[] {
			   "eClassUri", "http://gecko/address#//Person",
			   "identityInfo", null,
			   "typeInfop", null,
			   "name", null
		   });
		addAnnotation
		  (responseTypeEEnum.getELiterals().get(1),
		   source,
		   new String[] {
			   "mappedEClassUri", "http://gecko/address#//Person"
		   });
	}

	/**
	 * Initializes the annotations for <b>Service</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void createServiceAnnotations() {
		String source = "Service";
		addAnnotation
		  (getAnonymizationService__DoAnonymizationDryRun__ARequest(),
		   source,
		   new String[] {
			   "requestUri", "${prefix}/anonymization/dryRun/req/${providerId}",
			   "responseUri", "${prefix}/anonymization/dryRun/resp/${consumerId}/${requestId}"
		   });
		addAnnotation
		  (getAnonymizationService__DoAnonymization__ARequest(),
		   source,
		   new String[] {
			   "requestUri", "${prefix}/anonymization/sync/req/${providerId}",
			   "responseUri", "${prefix}/anonymization/sync/resp/${consumerId}/${requestId}"
		   });
		addAnnotation
		  (getAnonymizationService__DoAnonymizationAsync__ARequest(),
		   source,
		   new String[] {
			   "requestUri", "${prefix}/anonymization/async/req/${providerId}",
			   "responseUri", "${prefix}/anonymization/async/resp/${consumerId}/${requestId}"
		   });
		addAnnotation
		  (getAnonymizationService__DoAnonymizationImmediateAsync__ARequest(),
		   source,
		   new String[] {
			   "requestUri", "${prefix}/anonymization/immediate/req/${providerId}",
			   "responseUri", "${prefix}/anonymization/immediate/resp/${consumerId}/${requestId}"
		   });
		addAnnotation
		  (getAnonymizationService__CancelRequest__String_String(),
		   source,
		   new String[] {
			   "requestUri", "${prefix}/anonymization/cancel/${providerId}/${requestId}"
		   });
		addAnnotation
		  (getAnonymizationService__GetRequestStatus__ARequest(),
		   source,
		   new String[] {
			   "responseUri", "${prefix}/anonymization/status/${consumerId}/${requestId}"
		   });
	}

} //IdmtPackageImpl
