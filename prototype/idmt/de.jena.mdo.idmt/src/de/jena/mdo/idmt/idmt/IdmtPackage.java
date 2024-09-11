/*
 */
package de.jena.mdo.idmt.idmt;


import de.jena.service.remote.service.ServicePackage;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
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
 * @see de.jena.mdo.idmt.idmt.IdmtFactory
 * @model kind="package"
 *        annotation="Version value='1.0'"
 *        annotation="http://www.eclipse.org/emf/2002/GenModel basePackage='de.jena.mdo.idmt' complianceLevel='17.0' fileExtensions='idmt' oSGiCompatible='true' resource='XMI'"
 * @generated
 */
@ProviderType
@EPackage(uri = IdmtPackage.eNS_URI, genModel = "/model/idmt.genmodel", genModelSourceLocations = {"model/idmt.genmodel","de.jena.mdo.idmt/model/idmt.genmodel"}, ecore="/model/idmt.ecore", ecoreSourceLocations="/model/idmt.ecore")
public interface IdmtPackage extends org.eclipse.emf.ecore.EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "idmt";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://jena.de/idmt/1.0";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "idmt";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	IdmtPackage eINSTANCE = de.jena.mdo.idmt.idmt.impl.IdmtPackageImpl.init();

	/**
	 * The meta object id for the '{@link de.jena.mdo.idmt.idmt.impl.ARequestImpl <em>ARequest</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.jena.mdo.idmt.idmt.impl.ARequestImpl
	 * @see de.jena.mdo.idmt.idmt.impl.IdmtPackageImpl#getARequest()
	 * @generated
	 */
	int AREQUEST = 0;

	/**
	 * The feature id for the '<em><b>Request Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AREQUEST__REQUEST_ID = 0;

	/**
	 * The feature id for the '<em><b>Consumer Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AREQUEST__CONSUMER_ID = 1;

	/**
	 * The feature id for the '<em><b>Config</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AREQUEST__CONFIG = 2;

	/**
	 * The feature id for the '<em><b>Src Uri</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AREQUEST__SRC_URI = 3;

	/**
	 * The feature id for the '<em><b>Content Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AREQUEST__CONTENT_TYPE = 4;

	/**
	 * The number of structural features of the '<em>ARequest</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AREQUEST_FEATURE_COUNT = 5;

	/**
	 * The number of operations of the '<em>ARequest</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AREQUEST_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link de.jena.mdo.idmt.idmt.impl.AResponseImpl <em>AResponse</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.jena.mdo.idmt.idmt.impl.AResponseImpl
	 * @see de.jena.mdo.idmt.idmt.impl.IdmtPackageImpl#getAResponse()
	 * @generated
	 */
	int ARESPONSE = 1;

	/**
	 * The feature id for the '<em><b>Request Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARESPONSE__REQUEST_ID = 0;

	/**
	 * The feature id for the '<em><b>Config</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARESPONSE__CONFIG = 1;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARESPONSE__TYPE = 2;

	/**
	 * The feature id for the '<em><b>Status Message</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARESPONSE__STATUS_MESSAGE = 3;

	/**
	 * The feature id for the '<em><b>Result Uri</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARESPONSE__RESULT_URI = 4;

	/**
	 * The feature id for the '<em><b>Result Content Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARESPONSE__RESULT_CONTENT_TYPE = 5;

	/**
	 * The feature id for the '<em><b>Elapsed Time</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARESPONSE__ELAPSED_TIME = 6;

	/**
	 * The feature id for the '<em><b>Remaining Time</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARESPONSE__REMAINING_TIME = 7;

	/**
	 * The number of structural features of the '<em>AResponse</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARESPONSE_FEATURE_COUNT = 8;

	/**
	 * The number of operations of the '<em>AResponse</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARESPONSE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link de.jena.mdo.idmt.idmt.impl.ADryRunResponseImpl <em>ADry Run Response</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.jena.mdo.idmt.idmt.impl.ADryRunResponseImpl
	 * @see de.jena.mdo.idmt.idmt.impl.IdmtPackageImpl#getADryRunResponse()
	 * @generated
	 */
	int ADRY_RUN_RESPONSE = 2;

	/**
	 * The feature id for the '<em><b>Request Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADRY_RUN_RESPONSE__REQUEST_ID = ARESPONSE__REQUEST_ID;

	/**
	 * The feature id for the '<em><b>Config</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADRY_RUN_RESPONSE__CONFIG = ARESPONSE__CONFIG;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADRY_RUN_RESPONSE__TYPE = ARESPONSE__TYPE;

	/**
	 * The feature id for the '<em><b>Status Message</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADRY_RUN_RESPONSE__STATUS_MESSAGE = ARESPONSE__STATUS_MESSAGE;

	/**
	 * The feature id for the '<em><b>Result Uri</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADRY_RUN_RESPONSE__RESULT_URI = ARESPONSE__RESULT_URI;

	/**
	 * The feature id for the '<em><b>Result Content Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADRY_RUN_RESPONSE__RESULT_CONTENT_TYPE = ARESPONSE__RESULT_CONTENT_TYPE;

	/**
	 * The feature id for the '<em><b>Elapsed Time</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADRY_RUN_RESPONSE__ELAPSED_TIME = ARESPONSE__ELAPSED_TIME;

	/**
	 * The feature id for the '<em><b>Remaining Time</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADRY_RUN_RESPONSE__REMAINING_TIME = ARESPONSE__REMAINING_TIME;

	/**
	 * The feature id for the '<em><b>Est Calc Time</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADRY_RUN_RESPONSE__EST_CALC_TIME = ARESPONSE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>ADry Run Response</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADRY_RUN_RESPONSE_FEATURE_COUNT = ARESPONSE_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>ADry Run Response</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADRY_RUN_RESPONSE_OPERATION_COUNT = ARESPONSE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link de.jena.mdo.idmt.idmt.impl.AModelConfigurationImpl <em>AModel Configuration</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.jena.mdo.idmt.idmt.impl.AModelConfigurationImpl
	 * @see de.jena.mdo.idmt.idmt.impl.IdmtPackageImpl#getAModelConfiguration()
	 * @generated
	 */
	int AMODEL_CONFIGURATION = 3;

	/**
	 * The feature id for the '<em><b>Strategy</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AMODEL_CONFIGURATION__STRATEGY = 0;

	/**
	 * The feature id for the '<em><b>Features</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AMODEL_CONFIGURATION__FEATURES = 1;

	/**
	 * The number of structural features of the '<em>AModel Configuration</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AMODEL_CONFIGURATION_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>AModel Configuration</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AMODEL_CONFIGURATION_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link de.jena.mdo.idmt.idmt.impl.AFeatureConfigurationImpl <em>AFeature Configuration</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.jena.mdo.idmt.idmt.impl.AFeatureConfigurationImpl
	 * @see de.jena.mdo.idmt.idmt.impl.IdmtPackageImpl#getAFeatureConfiguration()
	 * @generated
	 */
	int AFEATURE_CONFIGURATION = 4;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AFEATURE_CONFIGURATION__NAME = 0;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AFEATURE_CONFIGURATION__TYPE = 1;

	/**
	 * The feature id for the '<em><b>Strategy</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AFEATURE_CONFIGURATION__STRATEGY = 2;

	/**
	 * The number of structural features of the '<em>AFeature Configuration</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AFEATURE_CONFIGURATION_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>AFeature Configuration</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AFEATURE_CONFIGURATION_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link de.jena.mdo.idmt.idmt.AnonymizationService <em>Anonymization Service</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.jena.mdo.idmt.idmt.AnonymizationService
	 * @see de.jena.mdo.idmt.idmt.impl.IdmtPackageImpl#getAnonymizationService()
	 * @generated
	 */
	int ANONYMIZATION_SERVICE = 5;

	/**
	 * The number of structural features of the '<em>Anonymization Service</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANONYMIZATION_SERVICE_FEATURE_COUNT = 0;

	/**
	 * The operation id for the '<em>Do Anonymization Dry Run</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANONYMIZATION_SERVICE___DO_ANONYMIZATION_DRY_RUN__AREQUEST = 0;

	/**
	 * The operation id for the '<em>Do Anonymization</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANONYMIZATION_SERVICE___DO_ANONYMIZATION__AREQUEST = 1;

	/**
	 * The operation id for the '<em>Do Anonymization Async</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANONYMIZATION_SERVICE___DO_ANONYMIZATION_ASYNC__AREQUEST = 2;

	/**
	 * The operation id for the '<em>Do Anonymization Immediate Async</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANONYMIZATION_SERVICE___DO_ANONYMIZATION_IMMEDIATE_ASYNC__AREQUEST = 3;

	/**
	 * The operation id for the '<em>Cancel Request</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANONYMIZATION_SERVICE___CANCEL_REQUEST__STRING_STRING = 4;

	/**
	 * The operation id for the '<em>Get Request Status</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANONYMIZATION_SERVICE___GET_REQUEST_STATUS__AREQUEST = 5;

	/**
	 * The number of operations of the '<em>Anonymization Service</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANONYMIZATION_SERVICE_OPERATION_COUNT = 6;

	/**
	 * The meta object id for the '{@link de.jena.mdo.idmt.idmt.impl.IDMTModelImpl <em>IDMT Model</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.jena.mdo.idmt.idmt.impl.IDMTModelImpl
	 * @see de.jena.mdo.idmt.idmt.impl.IdmtPackageImpl#getIDMTModel()
	 * @generated
	 */
	int IDMT_MODEL = 6;

	/**
	 * The feature id for the '<em><b>Strategy</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IDMT_MODEL__STRATEGY = AMODEL_CONFIGURATION__STRATEGY;

	/**
	 * The feature id for the '<em><b>Features</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IDMT_MODEL__FEATURES = AMODEL_CONFIGURATION__FEATURES;

	/**
	 * The feature id for the '<em><b>K</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IDMT_MODEL__K = AMODEL_CONFIGURATION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Reg Grad</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IDMT_MODEL__REG_GRAD = AMODEL_CONFIGURATION_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Noisy</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IDMT_MODEL__NOISY = AMODEL_CONFIGURATION_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>IDMT Model</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IDMT_MODEL_FEATURE_COUNT = AMODEL_CONFIGURATION_FEATURE_COUNT + 3;

	/**
	 * The number of operations of the '<em>IDMT Model</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IDMT_MODEL_OPERATION_COUNT = AMODEL_CONFIGURATION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link de.jena.mdo.idmt.idmt.impl.IDMTFeatureImpl <em>IDMT Feature</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.jena.mdo.idmt.idmt.impl.IDMTFeatureImpl
	 * @see de.jena.mdo.idmt.idmt.impl.IdmtPackageImpl#getIDMTFeature()
	 * @generated
	 */
	int IDMT_FEATURE = 7;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IDMT_FEATURE__NAME = AFEATURE_CONFIGURATION__NAME;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IDMT_FEATURE__TYPE = AFEATURE_CONFIGURATION__TYPE;

	/**
	 * The feature id for the '<em><b>Strategy</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IDMT_FEATURE__STRATEGY = AFEATURE_CONFIGURATION__STRATEGY;

	/**
	 * The feature id for the '<em><b>Age</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IDMT_FEATURE__AGE = AFEATURE_CONFIGURATION_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>IDMT Feature</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IDMT_FEATURE_FEATURE_COUNT = AFEATURE_CONFIGURATION_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>IDMT Feature</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IDMT_FEATURE_OPERATION_COUNT = AFEATURE_CONFIGURATION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link de.jena.mdo.idmt.idmt.impl.RegularizerGradImpl <em>Regularizer Grad</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.jena.mdo.idmt.idmt.impl.RegularizerGradImpl
	 * @see de.jena.mdo.idmt.idmt.impl.IdmtPackageImpl#getRegularizerGrad()
	 * @generated
	 */
	int REGULARIZER_GRAD = 8;

	/**
	 * The feature id for the '<em><b>Reg</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REGULARIZER_GRAD__REG = 0;

	/**
	 * The feature id for the '<em><b>Grad</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REGULARIZER_GRAD__GRAD = 1;

	/**
	 * The number of structural features of the '<em>Regularizer Grad</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REGULARIZER_GRAD_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Regularizer Grad</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REGULARIZER_GRAD_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link de.jena.mdo.idmt.idmt.impl.AnonymizationServiceDescriptionImpl <em>Anonymization Service Description</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.jena.mdo.idmt.idmt.impl.AnonymizationServiceDescriptionImpl
	 * @see de.jena.mdo.idmt.idmt.impl.IdmtPackageImpl#getAnonymizationServiceDescription()
	 * @generated
	 */
	int ANONYMIZATION_SERVICE_DESCRIPTION = 9;

	/**
	 * The feature id for the '<em><b>Service Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANONYMIZATION_SERVICE_DESCRIPTION__SERVICE_ID = ServicePackage.SERVICE_DESCRIPTION__SERVICE_ID;

	/**
	 * The feature id for the '<em><b>Provider Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANONYMIZATION_SERVICE_DESCRIPTION__PROVIDER_ID = ServicePackage.SERVICE_DESCRIPTION__PROVIDER_ID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANONYMIZATION_SERVICE_DESCRIPTION__NAME = ServicePackage.SERVICE_DESCRIPTION__NAME;

	/**
	 * The feature id for the '<em><b>Vendor</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANONYMIZATION_SERVICE_DESCRIPTION__VENDOR = ServicePackage.SERVICE_DESCRIPTION__VENDOR;

	/**
	 * The feature id for the '<em><b>Rank</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANONYMIZATION_SERVICE_DESCRIPTION__RANK = ServicePackage.SERVICE_DESCRIPTION__RANK;

	/**
	 * The feature id for the '<em><b>Source Uri</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANONYMIZATION_SERVICE_DESCRIPTION__SOURCE_URI = ServicePackage.SERVICE_DESCRIPTION__SOURCE_URI;

	/**
	 * The feature id for the '<em><b>Content Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANONYMIZATION_SERVICE_DESCRIPTION__CONTENT_TYPE = ServicePackage.SERVICE_DESCRIPTION__CONTENT_TYPE;

	/**
	 * The feature id for the '<em><b>Life Cycle State</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANONYMIZATION_SERVICE_DESCRIPTION__LIFE_CYCLE_STATE = ServicePackage.SERVICE_DESCRIPTION__LIFE_CYCLE_STATE;

	/**
	 * The feature id for the '<em><b>Service Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANONYMIZATION_SERVICE_DESCRIPTION__SERVICE_TYPE = ServicePackage.SERVICE_DESCRIPTION__SERVICE_TYPE;

	/**
	 * The feature id for the '<em><b>Service Class</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANONYMIZATION_SERVICE_DESCRIPTION__SERVICE_CLASS = ServicePackage.SERVICE_DESCRIPTION__SERVICE_CLASS;

	/**
	 * The feature id for the '<em><b>Operation</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANONYMIZATION_SERVICE_DESCRIPTION__OPERATION = ServicePackage.SERVICE_DESCRIPTION__OPERATION;

	/**
	 * The number of structural features of the '<em>Anonymization Service Description</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANONYMIZATION_SERVICE_DESCRIPTION_FEATURE_COUNT = ServicePackage.SERVICE_DESCRIPTION_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Anonymization Service Description</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANONYMIZATION_SERVICE_DESCRIPTION_OPERATION_COUNT = ServicePackage.SERVICE_DESCRIPTION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link de.jena.mdo.idmt.idmt.impl.ArxModelImpl <em>Arx Model</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.jena.mdo.idmt.idmt.impl.ArxModelImpl
	 * @see de.jena.mdo.idmt.idmt.impl.IdmtPackageImpl#getArxModel()
	 * @generated
	 */
	int ARX_MODEL = 10;

	/**
	 * The feature id for the '<em><b>Strategy</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARX_MODEL__STRATEGY = AMODEL_CONFIGURATION__STRATEGY;

	/**
	 * The feature id for the '<em><b>Features</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARX_MODEL__FEATURES = AMODEL_CONFIGURATION__FEATURES;

	/**
	 * The number of structural features of the '<em>Arx Model</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARX_MODEL_FEATURE_COUNT = AMODEL_CONFIGURATION_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Arx Model</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARX_MODEL_OPERATION_COUNT = AMODEL_CONFIGURATION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link de.jena.mdo.idmt.idmt.ResponseType <em>Response Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.jena.mdo.idmt.idmt.ResponseType
	 * @see de.jena.mdo.idmt.idmt.impl.IdmtPackageImpl#getResponseType()
	 * @generated
	 */
	int RESPONSE_TYPE = 11;

	/**
	 * The meta object id for the '{@link de.jena.mdo.idmt.idmt.RegularizerType <em>Regularizer Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.jena.mdo.idmt.idmt.RegularizerType
	 * @see de.jena.mdo.idmt.idmt.impl.IdmtPackageImpl#getRegularizerType()
	 * @generated
	 */
	int REGULARIZER_TYPE = 12;

	/**
	 * The meta object id for the '{@link de.jena.mdo.idmt.idmt.GradType <em>Grad Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.jena.mdo.idmt.idmt.GradType
	 * @see de.jena.mdo.idmt.idmt.impl.IdmtPackageImpl#getGradType()
	 * @generated
	 */
	int GRAD_TYPE = 13;

	/**
	 * The meta object id for the '{@link de.jena.mdo.idmt.idmt.ModelStrategyType <em>Model Strategy Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.jena.mdo.idmt.idmt.ModelStrategyType
	 * @see de.jena.mdo.idmt.idmt.impl.IdmtPackageImpl#getModelStrategyType()
	 * @generated
	 */
	int MODEL_STRATEGY_TYPE = 14;

	/**
	 * The meta object id for the '{@link de.jena.mdo.idmt.idmt.ComputeDistanceType <em>Compute Distance Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.jena.mdo.idmt.idmt.ComputeDistanceType
	 * @see de.jena.mdo.idmt.idmt.impl.IdmtPackageImpl#getComputeDistanceType()
	 * @generated
	 */
	int COMPUTE_DISTANCE_TYPE = 15;

	/**
	 * The meta object id for the '{@link de.jena.mdo.idmt.idmt.FeatureStrategyType <em>Feature Strategy Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.jena.mdo.idmt.idmt.FeatureStrategyType
	 * @see de.jena.mdo.idmt.idmt.impl.IdmtPackageImpl#getFeatureStrategyType()
	 * @generated
	 */
	int FEATURE_STRATEGY_TYPE = 16;

	/**
	 * The meta object id for the '{@link de.jena.mdo.idmt.idmt.AnonymizationServiceLifeCycleState <em>Anonymization Service Life Cycle State</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.jena.mdo.idmt.idmt.AnonymizationServiceLifeCycleState
	 * @see de.jena.mdo.idmt.idmt.impl.IdmtPackageImpl#getAnonymizationServiceLifeCycleState()
	 * @generated
	 */
	int ANONYMIZATION_SERVICE_LIFE_CYCLE_STATE = 17;

	/**
	 * The meta object id for the '<em>Result Promise</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.osgi.util.promise.Promise
	 * @see de.jena.mdo.idmt.idmt.impl.IdmtPackageImpl#getResultPromise()
	 * @generated
	 */
	int RESULT_PROMISE = 18;


	/**
	 * Returns the meta object for class '{@link de.jena.mdo.idmt.idmt.ARequest <em>ARequest</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>ARequest</em>'.
	 * @see de.jena.mdo.idmt.idmt.ARequest
	 * @generated
	 */
	EClass getARequest();

	/**
	 * Returns the meta object for the attribute '{@link de.jena.mdo.idmt.idmt.ARequest#getRequestId <em>Request Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Request Id</em>'.
	 * @see de.jena.mdo.idmt.idmt.ARequest#getRequestId()
	 * @see #getARequest()
	 * @generated
	 */
	EAttribute getARequest_RequestId();

	/**
	 * Returns the meta object for the attribute '{@link de.jena.mdo.idmt.idmt.ARequest#getConsumerId <em>Consumer Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Consumer Id</em>'.
	 * @see de.jena.mdo.idmt.idmt.ARequest#getConsumerId()
	 * @see #getARequest()
	 * @generated
	 */
	EAttribute getARequest_ConsumerId();

	/**
	 * Returns the meta object for the containment reference '{@link de.jena.mdo.idmt.idmt.ARequest#getConfig <em>Config</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Config</em>'.
	 * @see de.jena.mdo.idmt.idmt.ARequest#getConfig()
	 * @see #getARequest()
	 * @generated
	 */
	EReference getARequest_Config();

	/**
	 * Returns the meta object for the attribute '{@link de.jena.mdo.idmt.idmt.ARequest#getSrcUri <em>Src Uri</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Src Uri</em>'.
	 * @see de.jena.mdo.idmt.idmt.ARequest#getSrcUri()
	 * @see #getARequest()
	 * @generated
	 */
	EAttribute getARequest_SrcUri();

	/**
	 * Returns the meta object for the attribute '{@link de.jena.mdo.idmt.idmt.ARequest#getContentType <em>Content Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Content Type</em>'.
	 * @see de.jena.mdo.idmt.idmt.ARequest#getContentType()
	 * @see #getARequest()
	 * @generated
	 */
	EAttribute getARequest_ContentType();

	/**
	 * Returns the meta object for class '{@link de.jena.mdo.idmt.idmt.AResponse <em>AResponse</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>AResponse</em>'.
	 * @see de.jena.mdo.idmt.idmt.AResponse
	 * @generated
	 */
	EClass getAResponse();

	/**
	 * Returns the meta object for the attribute '{@link de.jena.mdo.idmt.idmt.AResponse#getRequestId <em>Request Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Request Id</em>'.
	 * @see de.jena.mdo.idmt.idmt.AResponse#getRequestId()
	 * @see #getAResponse()
	 * @generated
	 */
	EAttribute getAResponse_RequestId();

	/**
	 * Returns the meta object for the containment reference '{@link de.jena.mdo.idmt.idmt.AResponse#getConfig <em>Config</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Config</em>'.
	 * @see de.jena.mdo.idmt.idmt.AResponse#getConfig()
	 * @see #getAResponse()
	 * @generated
	 */
	EReference getAResponse_Config();

	/**
	 * Returns the meta object for the attribute '{@link de.jena.mdo.idmt.idmt.AResponse#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type</em>'.
	 * @see de.jena.mdo.idmt.idmt.AResponse#getType()
	 * @see #getAResponse()
	 * @generated
	 */
	EAttribute getAResponse_Type();

	/**
	 * Returns the meta object for the attribute '{@link de.jena.mdo.idmt.idmt.AResponse#getStatusMessage <em>Status Message</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Status Message</em>'.
	 * @see de.jena.mdo.idmt.idmt.AResponse#getStatusMessage()
	 * @see #getAResponse()
	 * @generated
	 */
	EAttribute getAResponse_StatusMessage();

	/**
	 * Returns the meta object for the attribute '{@link de.jena.mdo.idmt.idmt.AResponse#getResultUri <em>Result Uri</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Result Uri</em>'.
	 * @see de.jena.mdo.idmt.idmt.AResponse#getResultUri()
	 * @see #getAResponse()
	 * @generated
	 */
	EAttribute getAResponse_ResultUri();

	/**
	 * Returns the meta object for the attribute '{@link de.jena.mdo.idmt.idmt.AResponse#getResultContentType <em>Result Content Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Result Content Type</em>'.
	 * @see de.jena.mdo.idmt.idmt.AResponse#getResultContentType()
	 * @see #getAResponse()
	 * @generated
	 */
	EAttribute getAResponse_ResultContentType();

	/**
	 * Returns the meta object for the attribute '{@link de.jena.mdo.idmt.idmt.AResponse#getElapsedTime <em>Elapsed Time</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Elapsed Time</em>'.
	 * @see de.jena.mdo.idmt.idmt.AResponse#getElapsedTime()
	 * @see #getAResponse()
	 * @generated
	 */
	EAttribute getAResponse_ElapsedTime();

	/**
	 * Returns the meta object for the attribute '{@link de.jena.mdo.idmt.idmt.AResponse#getRemainingTime <em>Remaining Time</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Remaining Time</em>'.
	 * @see de.jena.mdo.idmt.idmt.AResponse#getRemainingTime()
	 * @see #getAResponse()
	 * @generated
	 */
	EAttribute getAResponse_RemainingTime();

	/**
	 * Returns the meta object for class '{@link de.jena.mdo.idmt.idmt.ADryRunResponse <em>ADry Run Response</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>ADry Run Response</em>'.
	 * @see de.jena.mdo.idmt.idmt.ADryRunResponse
	 * @generated
	 */
	EClass getADryRunResponse();

	/**
	 * Returns the meta object for the attribute '{@link de.jena.mdo.idmt.idmt.ADryRunResponse#getEstCalcTime <em>Est Calc Time</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Est Calc Time</em>'.
	 * @see de.jena.mdo.idmt.idmt.ADryRunResponse#getEstCalcTime()
	 * @see #getADryRunResponse()
	 * @generated
	 */
	EAttribute getADryRunResponse_EstCalcTime();

	/**
	 * Returns the meta object for class '{@link de.jena.mdo.idmt.idmt.AModelConfiguration <em>AModel Configuration</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>AModel Configuration</em>'.
	 * @see de.jena.mdo.idmt.idmt.AModelConfiguration
	 * @generated
	 */
	EClass getAModelConfiguration();

	/**
	 * Returns the meta object for the attribute '{@link de.jena.mdo.idmt.idmt.AModelConfiguration#getStrategy <em>Strategy</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Strategy</em>'.
	 * @see de.jena.mdo.idmt.idmt.AModelConfiguration#getStrategy()
	 * @see #getAModelConfiguration()
	 * @generated
	 */
	EAttribute getAModelConfiguration_Strategy();

	/**
	 * Returns the meta object for the containment reference list '{@link de.jena.mdo.idmt.idmt.AModelConfiguration#getFeatures <em>Features</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Features</em>'.
	 * @see de.jena.mdo.idmt.idmt.AModelConfiguration#getFeatures()
	 * @see #getAModelConfiguration()
	 * @generated
	 */
	EReference getAModelConfiguration_Features();

	/**
	 * Returns the meta object for class '{@link de.jena.mdo.idmt.idmt.AFeatureConfiguration <em>AFeature Configuration</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>AFeature Configuration</em>'.
	 * @see de.jena.mdo.idmt.idmt.AFeatureConfiguration
	 * @generated
	 */
	EClass getAFeatureConfiguration();

	/**
	 * Returns the meta object for the attribute '{@link de.jena.mdo.idmt.idmt.AFeatureConfiguration#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see de.jena.mdo.idmt.idmt.AFeatureConfiguration#getName()
	 * @see #getAFeatureConfiguration()
	 * @generated
	 */
	EAttribute getAFeatureConfiguration_Name();

	/**
	 * Returns the meta object for the attribute '{@link de.jena.mdo.idmt.idmt.AFeatureConfiguration#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type</em>'.
	 * @see de.jena.mdo.idmt.idmt.AFeatureConfiguration#getType()
	 * @see #getAFeatureConfiguration()
	 * @generated
	 */
	EAttribute getAFeatureConfiguration_Type();

	/**
	 * Returns the meta object for the attribute '{@link de.jena.mdo.idmt.idmt.AFeatureConfiguration#getStrategy <em>Strategy</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Strategy</em>'.
	 * @see de.jena.mdo.idmt.idmt.AFeatureConfiguration#getStrategy()
	 * @see #getAFeatureConfiguration()
	 * @generated
	 */
	EAttribute getAFeatureConfiguration_Strategy();

	/**
	 * Returns the meta object for class '{@link de.jena.mdo.idmt.idmt.AnonymizationService <em>Anonymization Service</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Anonymization Service</em>'.
	 * @see de.jena.mdo.idmt.idmt.AnonymizationService
	 * @generated
	 */
	EClass getAnonymizationService();

	/**
	 * Returns the meta object for the '{@link de.jena.mdo.idmt.idmt.AnonymizationService#doAnonymizationDryRun(de.jena.mdo.idmt.idmt.ARequest) <em>Do Anonymization Dry Run</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Do Anonymization Dry Run</em>' operation.
	 * @see de.jena.mdo.idmt.idmt.AnonymizationService#doAnonymizationDryRun(de.jena.mdo.idmt.idmt.ARequest)
	 * @generated
	 */
	EOperation getAnonymizationService__DoAnonymizationDryRun__ARequest();

	/**
	 * Returns the meta object for the '{@link de.jena.mdo.idmt.idmt.AnonymizationService#doAnonymization(de.jena.mdo.idmt.idmt.ARequest) <em>Do Anonymization</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Do Anonymization</em>' operation.
	 * @see de.jena.mdo.idmt.idmt.AnonymizationService#doAnonymization(de.jena.mdo.idmt.idmt.ARequest)
	 * @generated
	 */
	EOperation getAnonymizationService__DoAnonymization__ARequest();

	/**
	 * Returns the meta object for the '{@link de.jena.mdo.idmt.idmt.AnonymizationService#doAnonymizationAsync(de.jena.mdo.idmt.idmt.ARequest) <em>Do Anonymization Async</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Do Anonymization Async</em>' operation.
	 * @see de.jena.mdo.idmt.idmt.AnonymizationService#doAnonymizationAsync(de.jena.mdo.idmt.idmt.ARequest)
	 * @generated
	 */
	EOperation getAnonymizationService__DoAnonymizationAsync__ARequest();

	/**
	 * Returns the meta object for the '{@link de.jena.mdo.idmt.idmt.AnonymizationService#doAnonymizationImmediateAsync(de.jena.mdo.idmt.idmt.ARequest) <em>Do Anonymization Immediate Async</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Do Anonymization Immediate Async</em>' operation.
	 * @see de.jena.mdo.idmt.idmt.AnonymizationService#doAnonymizationImmediateAsync(de.jena.mdo.idmt.idmt.ARequest)
	 * @generated
	 */
	EOperation getAnonymizationService__DoAnonymizationImmediateAsync__ARequest();

	/**
	 * Returns the meta object for the '{@link de.jena.mdo.idmt.idmt.AnonymizationService#cancelRequest(java.lang.String, java.lang.String) <em>Cancel Request</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Cancel Request</em>' operation.
	 * @see de.jena.mdo.idmt.idmt.AnonymizationService#cancelRequest(java.lang.String, java.lang.String)
	 * @generated
	 */
	EOperation getAnonymizationService__CancelRequest__String_String();

	/**
	 * Returns the meta object for the '{@link de.jena.mdo.idmt.idmt.AnonymizationService#getRequestStatus(de.jena.mdo.idmt.idmt.ARequest) <em>Get Request Status</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Request Status</em>' operation.
	 * @see de.jena.mdo.idmt.idmt.AnonymizationService#getRequestStatus(de.jena.mdo.idmt.idmt.ARequest)
	 * @generated
	 */
	EOperation getAnonymizationService__GetRequestStatus__ARequest();

	/**
	 * Returns the meta object for class '{@link de.jena.mdo.idmt.idmt.IDMTModel <em>IDMT Model</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>IDMT Model</em>'.
	 * @see de.jena.mdo.idmt.idmt.IDMTModel
	 * @generated
	 */
	EClass getIDMTModel();

	/**
	 * Returns the meta object for the attribute list '{@link de.jena.mdo.idmt.idmt.IDMTModel#getK <em>K</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>K</em>'.
	 * @see de.jena.mdo.idmt.idmt.IDMTModel#getK()
	 * @see #getIDMTModel()
	 * @generated
	 */
	EAttribute getIDMTModel_K();

	/**
	 * Returns the meta object for the containment reference list '{@link de.jena.mdo.idmt.idmt.IDMTModel#getRegGrad <em>Reg Grad</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Reg Grad</em>'.
	 * @see de.jena.mdo.idmt.idmt.IDMTModel#getRegGrad()
	 * @see #getIDMTModel()
	 * @generated
	 */
	EReference getIDMTModel_RegGrad();

	/**
	 * Returns the meta object for the attribute list '{@link de.jena.mdo.idmt.idmt.IDMTModel#getNoisy <em>Noisy</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Noisy</em>'.
	 * @see de.jena.mdo.idmt.idmt.IDMTModel#getNoisy()
	 * @see #getIDMTModel()
	 * @generated
	 */
	EAttribute getIDMTModel_Noisy();

	/**
	 * Returns the meta object for class '{@link de.jena.mdo.idmt.idmt.IDMTFeature <em>IDMT Feature</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>IDMT Feature</em>'.
	 * @see de.jena.mdo.idmt.idmt.IDMTFeature
	 * @generated
	 */
	EClass getIDMTFeature();

	/**
	 * Returns the meta object for the attribute list '{@link de.jena.mdo.idmt.idmt.IDMTFeature#getAge <em>Age</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Age</em>'.
	 * @see de.jena.mdo.idmt.idmt.IDMTFeature#getAge()
	 * @see #getIDMTFeature()
	 * @generated
	 */
	EAttribute getIDMTFeature_Age();

	/**
	 * Returns the meta object for class '{@link de.jena.mdo.idmt.idmt.RegularizerGrad <em>Regularizer Grad</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Regularizer Grad</em>'.
	 * @see de.jena.mdo.idmt.idmt.RegularizerGrad
	 * @generated
	 */
	EClass getRegularizerGrad();

	/**
	 * Returns the meta object for the attribute '{@link de.jena.mdo.idmt.idmt.RegularizerGrad#getReg <em>Reg</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Reg</em>'.
	 * @see de.jena.mdo.idmt.idmt.RegularizerGrad#getReg()
	 * @see #getRegularizerGrad()
	 * @generated
	 */
	EAttribute getRegularizerGrad_Reg();

	/**
	 * Returns the meta object for the attribute '{@link de.jena.mdo.idmt.idmt.RegularizerGrad#getGrad <em>Grad</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Grad</em>'.
	 * @see de.jena.mdo.idmt.idmt.RegularizerGrad#getGrad()
	 * @see #getRegularizerGrad()
	 * @generated
	 */
	EAttribute getRegularizerGrad_Grad();

	/**
	 * Returns the meta object for class '{@link de.jena.mdo.idmt.idmt.AnonymizationServiceDescription <em>Anonymization Service Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Anonymization Service Description</em>'.
	 * @see de.jena.mdo.idmt.idmt.AnonymizationServiceDescription
	 * @generated
	 */
	EClass getAnonymizationServiceDescription();

	/**
	 * Returns the meta object for class '{@link de.jena.mdo.idmt.idmt.ArxModel <em>Arx Model</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Arx Model</em>'.
	 * @see de.jena.mdo.idmt.idmt.ArxModel
	 * @generated
	 */
	EClass getArxModel();

	/**
	 * Returns the meta object for enum '{@link de.jena.mdo.idmt.idmt.ResponseType <em>Response Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Response Type</em>'.
	 * @see de.jena.mdo.idmt.idmt.ResponseType
	 * @generated
	 */
	EEnum getResponseType();

	/**
	 * Returns the meta object for enum '{@link de.jena.mdo.idmt.idmt.RegularizerType <em>Regularizer Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Regularizer Type</em>'.
	 * @see de.jena.mdo.idmt.idmt.RegularizerType
	 * @generated
	 */
	EEnum getRegularizerType();

	/**
	 * Returns the meta object for enum '{@link de.jena.mdo.idmt.idmt.GradType <em>Grad Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Grad Type</em>'.
	 * @see de.jena.mdo.idmt.idmt.GradType
	 * @generated
	 */
	EEnum getGradType();

	/**
	 * Returns the meta object for enum '{@link de.jena.mdo.idmt.idmt.ModelStrategyType <em>Model Strategy Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Model Strategy Type</em>'.
	 * @see de.jena.mdo.idmt.idmt.ModelStrategyType
	 * @generated
	 */
	EEnum getModelStrategyType();

	/**
	 * Returns the meta object for enum '{@link de.jena.mdo.idmt.idmt.ComputeDistanceType <em>Compute Distance Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Compute Distance Type</em>'.
	 * @see de.jena.mdo.idmt.idmt.ComputeDistanceType
	 * @generated
	 */
	EEnum getComputeDistanceType();

	/**
	 * Returns the meta object for enum '{@link de.jena.mdo.idmt.idmt.FeatureStrategyType <em>Feature Strategy Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Feature Strategy Type</em>'.
	 * @see de.jena.mdo.idmt.idmt.FeatureStrategyType
	 * @generated
	 */
	EEnum getFeatureStrategyType();

	/**
	 * Returns the meta object for enum '{@link de.jena.mdo.idmt.idmt.AnonymizationServiceLifeCycleState <em>Anonymization Service Life Cycle State</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Anonymization Service Life Cycle State</em>'.
	 * @see de.jena.mdo.idmt.idmt.AnonymizationServiceLifeCycleState
	 * @generated
	 */
	EEnum getAnonymizationServiceLifeCycleState();

	/**
	 * Returns the meta object for data type '{@link org.osgi.util.promise.Promise <em>Result Promise</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Result Promise</em>'.
	 * @see org.osgi.util.promise.Promise
	 * @model instanceClass="org.osgi.util.promise.Promise" typeParameters="T"
	 * @generated
	 */
	EDataType getResultPromise();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	IdmtFactory getIdmtFactory();

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
		 * The meta object literal for the '{@link de.jena.mdo.idmt.idmt.impl.ARequestImpl <em>ARequest</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.jena.mdo.idmt.idmt.impl.ARequestImpl
		 * @see de.jena.mdo.idmt.idmt.impl.IdmtPackageImpl#getARequest()
		 * @generated
		 */
		EClass AREQUEST = eINSTANCE.getARequest();

		/**
		 * The meta object literal for the '<em><b>Request Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute AREQUEST__REQUEST_ID = eINSTANCE.getARequest_RequestId();

		/**
		 * The meta object literal for the '<em><b>Consumer Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute AREQUEST__CONSUMER_ID = eINSTANCE.getARequest_ConsumerId();

		/**
		 * The meta object literal for the '<em><b>Config</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference AREQUEST__CONFIG = eINSTANCE.getARequest_Config();

		/**
		 * The meta object literal for the '<em><b>Src Uri</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute AREQUEST__SRC_URI = eINSTANCE.getARequest_SrcUri();

		/**
		 * The meta object literal for the '<em><b>Content Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute AREQUEST__CONTENT_TYPE = eINSTANCE.getARequest_ContentType();

		/**
		 * The meta object literal for the '{@link de.jena.mdo.idmt.idmt.impl.AResponseImpl <em>AResponse</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.jena.mdo.idmt.idmt.impl.AResponseImpl
		 * @see de.jena.mdo.idmt.idmt.impl.IdmtPackageImpl#getAResponse()
		 * @generated
		 */
		EClass ARESPONSE = eINSTANCE.getAResponse();

		/**
		 * The meta object literal for the '<em><b>Request Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ARESPONSE__REQUEST_ID = eINSTANCE.getAResponse_RequestId();

		/**
		 * The meta object literal for the '<em><b>Config</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ARESPONSE__CONFIG = eINSTANCE.getAResponse_Config();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ARESPONSE__TYPE = eINSTANCE.getAResponse_Type();

		/**
		 * The meta object literal for the '<em><b>Status Message</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ARESPONSE__STATUS_MESSAGE = eINSTANCE.getAResponse_StatusMessage();

		/**
		 * The meta object literal for the '<em><b>Result Uri</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ARESPONSE__RESULT_URI = eINSTANCE.getAResponse_ResultUri();

		/**
		 * The meta object literal for the '<em><b>Result Content Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ARESPONSE__RESULT_CONTENT_TYPE = eINSTANCE.getAResponse_ResultContentType();

		/**
		 * The meta object literal for the '<em><b>Elapsed Time</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ARESPONSE__ELAPSED_TIME = eINSTANCE.getAResponse_ElapsedTime();

		/**
		 * The meta object literal for the '<em><b>Remaining Time</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ARESPONSE__REMAINING_TIME = eINSTANCE.getAResponse_RemainingTime();

		/**
		 * The meta object literal for the '{@link de.jena.mdo.idmt.idmt.impl.ADryRunResponseImpl <em>ADry Run Response</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.jena.mdo.idmt.idmt.impl.ADryRunResponseImpl
		 * @see de.jena.mdo.idmt.idmt.impl.IdmtPackageImpl#getADryRunResponse()
		 * @generated
		 */
		EClass ADRY_RUN_RESPONSE = eINSTANCE.getADryRunResponse();

		/**
		 * The meta object literal for the '<em><b>Est Calc Time</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ADRY_RUN_RESPONSE__EST_CALC_TIME = eINSTANCE.getADryRunResponse_EstCalcTime();

		/**
		 * The meta object literal for the '{@link de.jena.mdo.idmt.idmt.impl.AModelConfigurationImpl <em>AModel Configuration</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.jena.mdo.idmt.idmt.impl.AModelConfigurationImpl
		 * @see de.jena.mdo.idmt.idmt.impl.IdmtPackageImpl#getAModelConfiguration()
		 * @generated
		 */
		EClass AMODEL_CONFIGURATION = eINSTANCE.getAModelConfiguration();

		/**
		 * The meta object literal for the '<em><b>Strategy</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute AMODEL_CONFIGURATION__STRATEGY = eINSTANCE.getAModelConfiguration_Strategy();

		/**
		 * The meta object literal for the '<em><b>Features</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference AMODEL_CONFIGURATION__FEATURES = eINSTANCE.getAModelConfiguration_Features();

		/**
		 * The meta object literal for the '{@link de.jena.mdo.idmt.idmt.impl.AFeatureConfigurationImpl <em>AFeature Configuration</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.jena.mdo.idmt.idmt.impl.AFeatureConfigurationImpl
		 * @see de.jena.mdo.idmt.idmt.impl.IdmtPackageImpl#getAFeatureConfiguration()
		 * @generated
		 */
		EClass AFEATURE_CONFIGURATION = eINSTANCE.getAFeatureConfiguration();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute AFEATURE_CONFIGURATION__NAME = eINSTANCE.getAFeatureConfiguration_Name();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute AFEATURE_CONFIGURATION__TYPE = eINSTANCE.getAFeatureConfiguration_Type();

		/**
		 * The meta object literal for the '<em><b>Strategy</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute AFEATURE_CONFIGURATION__STRATEGY = eINSTANCE.getAFeatureConfiguration_Strategy();

		/**
		 * The meta object literal for the '{@link de.jena.mdo.idmt.idmt.AnonymizationService <em>Anonymization Service</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.jena.mdo.idmt.idmt.AnonymizationService
		 * @see de.jena.mdo.idmt.idmt.impl.IdmtPackageImpl#getAnonymizationService()
		 * @generated
		 */
		EClass ANONYMIZATION_SERVICE = eINSTANCE.getAnonymizationService();

		/**
		 * The meta object literal for the '<em><b>Do Anonymization Dry Run</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation ANONYMIZATION_SERVICE___DO_ANONYMIZATION_DRY_RUN__AREQUEST = eINSTANCE.getAnonymizationService__DoAnonymizationDryRun__ARequest();

		/**
		 * The meta object literal for the '<em><b>Do Anonymization</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation ANONYMIZATION_SERVICE___DO_ANONYMIZATION__AREQUEST = eINSTANCE.getAnonymizationService__DoAnonymization__ARequest();

		/**
		 * The meta object literal for the '<em><b>Do Anonymization Async</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation ANONYMIZATION_SERVICE___DO_ANONYMIZATION_ASYNC__AREQUEST = eINSTANCE.getAnonymizationService__DoAnonymizationAsync__ARequest();

		/**
		 * The meta object literal for the '<em><b>Do Anonymization Immediate Async</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation ANONYMIZATION_SERVICE___DO_ANONYMIZATION_IMMEDIATE_ASYNC__AREQUEST = eINSTANCE.getAnonymizationService__DoAnonymizationImmediateAsync__ARequest();

		/**
		 * The meta object literal for the '<em><b>Cancel Request</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation ANONYMIZATION_SERVICE___CANCEL_REQUEST__STRING_STRING = eINSTANCE.getAnonymizationService__CancelRequest__String_String();

		/**
		 * The meta object literal for the '<em><b>Get Request Status</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation ANONYMIZATION_SERVICE___GET_REQUEST_STATUS__AREQUEST = eINSTANCE.getAnonymizationService__GetRequestStatus__ARequest();

		/**
		 * The meta object literal for the '{@link de.jena.mdo.idmt.idmt.impl.IDMTModelImpl <em>IDMT Model</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.jena.mdo.idmt.idmt.impl.IDMTModelImpl
		 * @see de.jena.mdo.idmt.idmt.impl.IdmtPackageImpl#getIDMTModel()
		 * @generated
		 */
		EClass IDMT_MODEL = eINSTANCE.getIDMTModel();

		/**
		 * The meta object literal for the '<em><b>K</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute IDMT_MODEL__K = eINSTANCE.getIDMTModel_K();

		/**
		 * The meta object literal for the '<em><b>Reg Grad</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference IDMT_MODEL__REG_GRAD = eINSTANCE.getIDMTModel_RegGrad();

		/**
		 * The meta object literal for the '<em><b>Noisy</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute IDMT_MODEL__NOISY = eINSTANCE.getIDMTModel_Noisy();

		/**
		 * The meta object literal for the '{@link de.jena.mdo.idmt.idmt.impl.IDMTFeatureImpl <em>IDMT Feature</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.jena.mdo.idmt.idmt.impl.IDMTFeatureImpl
		 * @see de.jena.mdo.idmt.idmt.impl.IdmtPackageImpl#getIDMTFeature()
		 * @generated
		 */
		EClass IDMT_FEATURE = eINSTANCE.getIDMTFeature();

		/**
		 * The meta object literal for the '<em><b>Age</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute IDMT_FEATURE__AGE = eINSTANCE.getIDMTFeature_Age();

		/**
		 * The meta object literal for the '{@link de.jena.mdo.idmt.idmt.impl.RegularizerGradImpl <em>Regularizer Grad</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.jena.mdo.idmt.idmt.impl.RegularizerGradImpl
		 * @see de.jena.mdo.idmt.idmt.impl.IdmtPackageImpl#getRegularizerGrad()
		 * @generated
		 */
		EClass REGULARIZER_GRAD = eINSTANCE.getRegularizerGrad();

		/**
		 * The meta object literal for the '<em><b>Reg</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute REGULARIZER_GRAD__REG = eINSTANCE.getRegularizerGrad_Reg();

		/**
		 * The meta object literal for the '<em><b>Grad</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute REGULARIZER_GRAD__GRAD = eINSTANCE.getRegularizerGrad_Grad();

		/**
		 * The meta object literal for the '{@link de.jena.mdo.idmt.idmt.impl.AnonymizationServiceDescriptionImpl <em>Anonymization Service Description</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.jena.mdo.idmt.idmt.impl.AnonymizationServiceDescriptionImpl
		 * @see de.jena.mdo.idmt.idmt.impl.IdmtPackageImpl#getAnonymizationServiceDescription()
		 * @generated
		 */
		EClass ANONYMIZATION_SERVICE_DESCRIPTION = eINSTANCE.getAnonymizationServiceDescription();

		/**
		 * The meta object literal for the '{@link de.jena.mdo.idmt.idmt.impl.ArxModelImpl <em>Arx Model</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.jena.mdo.idmt.idmt.impl.ArxModelImpl
		 * @see de.jena.mdo.idmt.idmt.impl.IdmtPackageImpl#getArxModel()
		 * @generated
		 */
		EClass ARX_MODEL = eINSTANCE.getArxModel();

		/**
		 * The meta object literal for the '{@link de.jena.mdo.idmt.idmt.ResponseType <em>Response Type</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.jena.mdo.idmt.idmt.ResponseType
		 * @see de.jena.mdo.idmt.idmt.impl.IdmtPackageImpl#getResponseType()
		 * @generated
		 */
		EEnum RESPONSE_TYPE = eINSTANCE.getResponseType();

		/**
		 * The meta object literal for the '{@link de.jena.mdo.idmt.idmt.RegularizerType <em>Regularizer Type</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.jena.mdo.idmt.idmt.RegularizerType
		 * @see de.jena.mdo.idmt.idmt.impl.IdmtPackageImpl#getRegularizerType()
		 * @generated
		 */
		EEnum REGULARIZER_TYPE = eINSTANCE.getRegularizerType();

		/**
		 * The meta object literal for the '{@link de.jena.mdo.idmt.idmt.GradType <em>Grad Type</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.jena.mdo.idmt.idmt.GradType
		 * @see de.jena.mdo.idmt.idmt.impl.IdmtPackageImpl#getGradType()
		 * @generated
		 */
		EEnum GRAD_TYPE = eINSTANCE.getGradType();

		/**
		 * The meta object literal for the '{@link de.jena.mdo.idmt.idmt.ModelStrategyType <em>Model Strategy Type</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.jena.mdo.idmt.idmt.ModelStrategyType
		 * @see de.jena.mdo.idmt.idmt.impl.IdmtPackageImpl#getModelStrategyType()
		 * @generated
		 */
		EEnum MODEL_STRATEGY_TYPE = eINSTANCE.getModelStrategyType();

		/**
		 * The meta object literal for the '{@link de.jena.mdo.idmt.idmt.ComputeDistanceType <em>Compute Distance Type</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.jena.mdo.idmt.idmt.ComputeDistanceType
		 * @see de.jena.mdo.idmt.idmt.impl.IdmtPackageImpl#getComputeDistanceType()
		 * @generated
		 */
		EEnum COMPUTE_DISTANCE_TYPE = eINSTANCE.getComputeDistanceType();

		/**
		 * The meta object literal for the '{@link de.jena.mdo.idmt.idmt.FeatureStrategyType <em>Feature Strategy Type</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.jena.mdo.idmt.idmt.FeatureStrategyType
		 * @see de.jena.mdo.idmt.idmt.impl.IdmtPackageImpl#getFeatureStrategyType()
		 * @generated
		 */
		EEnum FEATURE_STRATEGY_TYPE = eINSTANCE.getFeatureStrategyType();

		/**
		 * The meta object literal for the '{@link de.jena.mdo.idmt.idmt.AnonymizationServiceLifeCycleState <em>Anonymization Service Life Cycle State</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.jena.mdo.idmt.idmt.AnonymizationServiceLifeCycleState
		 * @see de.jena.mdo.idmt.idmt.impl.IdmtPackageImpl#getAnonymizationServiceLifeCycleState()
		 * @generated
		 */
		EEnum ANONYMIZATION_SERVICE_LIFE_CYCLE_STATE = eINSTANCE.getAnonymizationServiceLifeCycleState();

		/**
		 * The meta object literal for the '<em>Result Promise</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.osgi.util.promise.Promise
		 * @see de.jena.mdo.idmt.idmt.impl.IdmtPackageImpl#getResultPromise()
		 * @generated
		 */
		EDataType RESULT_PROMISE = eINSTANCE.getResultPromise();

	}

} //IdmtPackage
