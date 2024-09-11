/**
 */
package de.jena.mdo.idmt.idmt.impl;

import de.jena.mdo.idmt.idmt.*;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

import org.osgi.util.promise.Promise;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class IdmtFactoryImpl extends EFactoryImpl implements IdmtFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static IdmtFactory init() {
		try {
			IdmtFactory theIdmtFactory = (IdmtFactory)EPackage.Registry.INSTANCE.getEFactory(IdmtPackage.eNS_URI);
			if (theIdmtFactory != null) {
				return theIdmtFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new IdmtFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IdmtFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
			case IdmtPackage.AREQUEST: return createARequest();
			case IdmtPackage.ARESPONSE: return createAResponse();
			case IdmtPackage.ADRY_RUN_RESPONSE: return createADryRunResponse();
			case IdmtPackage.AMODEL_CONFIGURATION: return createAModelConfiguration();
			case IdmtPackage.AFEATURE_CONFIGURATION: return createAFeatureConfiguration();
			case IdmtPackage.IDMT_MODEL: return createIDMTModel();
			case IdmtPackage.IDMT_FEATURE: return createIDMTFeature();
			case IdmtPackage.REGULARIZER_GRAD: return createRegularizerGrad();
			case IdmtPackage.ANONYMIZATION_SERVICE_DESCRIPTION: return createAnonymizationServiceDescription();
			case IdmtPackage.ARX_MODEL: return createArxModel();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object createFromString(EDataType eDataType, String initialValue) {
		switch (eDataType.getClassifierID()) {
			case IdmtPackage.RESPONSE_TYPE:
				return createResponseTypeFromString(eDataType, initialValue);
			case IdmtPackage.REGULARIZER_TYPE:
				return createRegularizerTypeFromString(eDataType, initialValue);
			case IdmtPackage.GRAD_TYPE:
				return createGradTypeFromString(eDataType, initialValue);
			case IdmtPackage.MODEL_STRATEGY_TYPE:
				return createModelStrategyTypeFromString(eDataType, initialValue);
			case IdmtPackage.COMPUTE_DISTANCE_TYPE:
				return createComputeDistanceTypeFromString(eDataType, initialValue);
			case IdmtPackage.FEATURE_STRATEGY_TYPE:
				return createFeatureStrategyTypeFromString(eDataType, initialValue);
			case IdmtPackage.ANONYMIZATION_SERVICE_LIFE_CYCLE_STATE:
				return createAnonymizationServiceLifeCycleStateFromString(eDataType, initialValue);
			case IdmtPackage.RESULT_PROMISE:
				return createResultPromiseFromString(eDataType, initialValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String convertToString(EDataType eDataType, Object instanceValue) {
		switch (eDataType.getClassifierID()) {
			case IdmtPackage.RESPONSE_TYPE:
				return convertResponseTypeToString(eDataType, instanceValue);
			case IdmtPackage.REGULARIZER_TYPE:
				return convertRegularizerTypeToString(eDataType, instanceValue);
			case IdmtPackage.GRAD_TYPE:
				return convertGradTypeToString(eDataType, instanceValue);
			case IdmtPackage.MODEL_STRATEGY_TYPE:
				return convertModelStrategyTypeToString(eDataType, instanceValue);
			case IdmtPackage.COMPUTE_DISTANCE_TYPE:
				return convertComputeDistanceTypeToString(eDataType, instanceValue);
			case IdmtPackage.FEATURE_STRATEGY_TYPE:
				return convertFeatureStrategyTypeToString(eDataType, instanceValue);
			case IdmtPackage.ANONYMIZATION_SERVICE_LIFE_CYCLE_STATE:
				return convertAnonymizationServiceLifeCycleStateToString(eDataType, instanceValue);
			case IdmtPackage.RESULT_PROMISE:
				return convertResultPromiseToString(eDataType, instanceValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ARequest createARequest() {
		ARequestImpl aRequest = new ARequestImpl();
		return aRequest;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public AResponse createAResponse() {
		AResponseImpl aResponse = new AResponseImpl();
		return aResponse;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ADryRunResponse createADryRunResponse() {
		ADryRunResponseImpl aDryRunResponse = new ADryRunResponseImpl();
		return aDryRunResponse;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public AModelConfiguration createAModelConfiguration() {
		AModelConfigurationImpl aModelConfiguration = new AModelConfigurationImpl();
		return aModelConfiguration;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public AFeatureConfiguration createAFeatureConfiguration() {
		AFeatureConfigurationImpl aFeatureConfiguration = new AFeatureConfigurationImpl();
		return aFeatureConfiguration;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public IDMTModel createIDMTModel() {
		IDMTModelImpl idmtModel = new IDMTModelImpl();
		return idmtModel;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public IDMTFeature createIDMTFeature() {
		IDMTFeatureImpl idmtFeature = new IDMTFeatureImpl();
		return idmtFeature;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public RegularizerGrad createRegularizerGrad() {
		RegularizerGradImpl regularizerGrad = new RegularizerGradImpl();
		return regularizerGrad;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public AnonymizationServiceDescription createAnonymizationServiceDescription() {
		AnonymizationServiceDescriptionImpl anonymizationServiceDescription = new AnonymizationServiceDescriptionImpl();
		return anonymizationServiceDescription;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ArxModel createArxModel() {
		ArxModelImpl arxModel = new ArxModelImpl();
		return arxModel;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ResponseType createResponseTypeFromString(EDataType eDataType, String initialValue) {
		ResponseType result = ResponseType.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertResponseTypeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RegularizerType createRegularizerTypeFromString(EDataType eDataType, String initialValue) {
		RegularizerType result = RegularizerType.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertRegularizerTypeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GradType createGradTypeFromString(EDataType eDataType, String initialValue) {
		GradType result = GradType.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertGradTypeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ModelStrategyType createModelStrategyTypeFromString(EDataType eDataType, String initialValue) {
		ModelStrategyType result = ModelStrategyType.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertModelStrategyTypeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ComputeDistanceType createComputeDistanceTypeFromString(EDataType eDataType, String initialValue) {
		ComputeDistanceType result = ComputeDistanceType.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertComputeDistanceTypeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FeatureStrategyType createFeatureStrategyTypeFromString(EDataType eDataType, String initialValue) {
		FeatureStrategyType result = FeatureStrategyType.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertFeatureStrategyTypeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AnonymizationServiceLifeCycleState createAnonymizationServiceLifeCycleStateFromString(EDataType eDataType, String initialValue) {
		AnonymizationServiceLifeCycleState result = AnonymizationServiceLifeCycleState.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertAnonymizationServiceLifeCycleStateToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Promise<?> createResultPromiseFromString(EDataType eDataType, String initialValue) {
		return (Promise<?>)super.createFromString(initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertResultPromiseToString(EDataType eDataType, Object instanceValue) {
		return super.convertToString(instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public IdmtPackage getIdmtPackage() {
		return (IdmtPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static IdmtPackage getPackage() {
		return IdmtPackage.eINSTANCE;
	}

} //IdmtFactoryImpl
