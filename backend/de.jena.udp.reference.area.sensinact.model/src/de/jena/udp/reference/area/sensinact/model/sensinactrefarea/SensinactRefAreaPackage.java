/*
 */
package de.jena.udp.reference.area.sensinact.model.sensinactrefarea;


import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.sensinact.model.core.provider.ProviderPackage;

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
 * @see de.jena.udp.reference.area.sensinact.model.sensinactrefarea.SensinactRefAreaFactory
 * @model kind="package"
 *        annotation="Version value='1.0'"
 * @generated
 */
@ProviderType
@EPackage(uri = SensinactRefAreaPackage.eNS_URI, genModel = "/model/sensinact-refarea.genmodel", genModelSourceLocations = {"model/sensinact-refarea.genmodel","de.jena.udp.reference.area.sensinact.model/model/sensinact-refarea.genmodel"}, ecore="/model/sensinact-refarea.ecore", ecoreSourceLocations="/model/sensinact-refarea.ecore")
public interface SensinactRefAreaPackage extends org.eclipse.emf.ecore.EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "sensinactrefarea";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "https://model.data.jena.de/sensinact/refarea/1.0";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "sensinact-refarea";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	SensinactRefAreaPackage eINSTANCE = de.jena.udp.reference.area.sensinact.model.sensinactrefarea.impl.SensinactRefAreaPackageImpl.init();

	/**
	 * The meta object id for the '{@link de.jena.udp.reference.area.sensinact.model.sensinactrefarea.impl.ReferenceAreaProviderImpl <em>Reference Area Provider</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.jena.udp.reference.area.sensinact.model.sensinactrefarea.impl.ReferenceAreaProviderImpl
	 * @see de.jena.udp.reference.area.sensinact.model.sensinactrefarea.impl.SensinactRefAreaPackageImpl#getReferenceAreaProvider()
	 * @generated
	 */
	int REFERENCE_AREA_PROVIDER = 0;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REFERENCE_AREA_PROVIDER__ID = ProviderPackage.PROVIDER__ID;

	/**
	 * The feature id for the '<em><b>Admin</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REFERENCE_AREA_PROVIDER__ADMIN = ProviderPackage.PROVIDER__ADMIN;

	/**
	 * The feature id for the '<em><b>Linked Providers</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REFERENCE_AREA_PROVIDER__LINKED_PROVIDERS = ProviderPackage.PROVIDER__LINKED_PROVIDERS;

	/**
	 * The feature id for the '<em><b>Reference Area</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REFERENCE_AREA_PROVIDER__REFERENCE_AREA = ProviderPackage.PROVIDER_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Reference Area Provider</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REFERENCE_AREA_PROVIDER_FEATURE_COUNT = ProviderPackage.PROVIDER_FEATURE_COUNT + 1;

	/**
	 * The operation id for the '<em>Get Service</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REFERENCE_AREA_PROVIDER___GET_SERVICE__STRING = ProviderPackage.PROVIDER___GET_SERVICE__STRING;

	/**
	 * The operation id for the '<em>Get Service EClass</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REFERENCE_AREA_PROVIDER___GET_SERVICE_ECLASS__STRING = ProviderPackage.PROVIDER___GET_SERVICE_ECLASS__STRING;

	/**
	 * The number of operations of the '<em>Reference Area Provider</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REFERENCE_AREA_PROVIDER_OPERATION_COUNT = ProviderPackage.PROVIDER_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link de.jena.udp.reference.area.sensinact.model.sensinactrefarea.impl.ReferenceAreaImpl <em>Reference Area</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.jena.udp.reference.area.sensinact.model.sensinactrefarea.impl.ReferenceAreaImpl
	 * @see de.jena.udp.reference.area.sensinact.model.sensinactrefarea.impl.SensinactRefAreaPackageImpl#getReferenceArea()
	 * @generated
	 */
	int REFERENCE_AREA = 1;

	/**
	 * The feature id for the '<em><b>Metadata</b></em>' map.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REFERENCE_AREA__METADATA = ProviderPackage.SERVICE__METADATA;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REFERENCE_AREA__NAME = ProviderPackage.SERVICE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Gid</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REFERENCE_AREA__GID = ProviderPackage.SERVICE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Sensor Count</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REFERENCE_AREA__SENSOR_COUNT = ProviderPackage.SERVICE_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Tour Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REFERENCE_AREA__TOUR_NAME = ProviderPackage.SERVICE_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Color</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REFERENCE_AREA__COLOR = ProviderPackage.SERVICE_FEATURE_COUNT + 4;

	/**
	 * The number of structural features of the '<em>Reference Area</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REFERENCE_AREA_FEATURE_COUNT = ProviderPackage.SERVICE_FEATURE_COUNT + 5;

	/**
	 * The operation id for the '<em>EIs Set</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REFERENCE_AREA___EIS_SET__ESTRUCTURALFEATURE = ProviderPackage.SERVICE___EIS_SET__ESTRUCTURALFEATURE;

	/**
	 * The number of operations of the '<em>Reference Area</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REFERENCE_AREA_OPERATION_COUNT = ProviderPackage.SERVICE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link de.jena.udp.reference.area.sensinact.model.sensinactrefarea.ColorType <em>Color Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.jena.udp.reference.area.sensinact.model.sensinactrefarea.ColorType
	 * @see de.jena.udp.reference.area.sensinact.model.sensinactrefarea.impl.SensinactRefAreaPackageImpl#getColorType()
	 * @generated
	 */
	int COLOR_TYPE = 2;


	/**
	 * Returns the meta object for class '{@link de.jena.udp.reference.area.sensinact.model.sensinactrefarea.ReferenceAreaProvider <em>Reference Area Provider</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Reference Area Provider</em>'.
	 * @see de.jena.udp.reference.area.sensinact.model.sensinactrefarea.ReferenceAreaProvider
	 * @generated
	 */
	EClass getReferenceAreaProvider();

	/**
	 * Returns the meta object for the containment reference '{@link de.jena.udp.reference.area.sensinact.model.sensinactrefarea.ReferenceAreaProvider#getReferenceArea <em>Reference Area</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Reference Area</em>'.
	 * @see de.jena.udp.reference.area.sensinact.model.sensinactrefarea.ReferenceAreaProvider#getReferenceArea()
	 * @see #getReferenceAreaProvider()
	 * @generated
	 */
	EReference getReferenceAreaProvider_ReferenceArea();

	/**
	 * Returns the meta object for class '{@link de.jena.udp.reference.area.sensinact.model.sensinactrefarea.ReferenceArea <em>Reference Area</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Reference Area</em>'.
	 * @see de.jena.udp.reference.area.sensinact.model.sensinactrefarea.ReferenceArea
	 * @generated
	 */
	EClass getReferenceArea();

	/**
	 * Returns the meta object for the attribute '{@link de.jena.udp.reference.area.sensinact.model.sensinactrefarea.ReferenceArea#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see de.jena.udp.reference.area.sensinact.model.sensinactrefarea.ReferenceArea#getName()
	 * @see #getReferenceArea()
	 * @generated
	 */
	EAttribute getReferenceArea_Name();

	/**
	 * Returns the meta object for the attribute '{@link de.jena.udp.reference.area.sensinact.model.sensinactrefarea.ReferenceArea#getGid <em>Gid</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Gid</em>'.
	 * @see de.jena.udp.reference.area.sensinact.model.sensinactrefarea.ReferenceArea#getGid()
	 * @see #getReferenceArea()
	 * @generated
	 */
	EAttribute getReferenceArea_Gid();

	/**
	 * Returns the meta object for the attribute '{@link de.jena.udp.reference.area.sensinact.model.sensinactrefarea.ReferenceArea#getSensorCount <em>Sensor Count</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Sensor Count</em>'.
	 * @see de.jena.udp.reference.area.sensinact.model.sensinactrefarea.ReferenceArea#getSensorCount()
	 * @see #getReferenceArea()
	 * @generated
	 */
	EAttribute getReferenceArea_SensorCount();

	/**
	 * Returns the meta object for the attribute '{@link de.jena.udp.reference.area.sensinact.model.sensinactrefarea.ReferenceArea#getTourName <em>Tour Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Tour Name</em>'.
	 * @see de.jena.udp.reference.area.sensinact.model.sensinactrefarea.ReferenceArea#getTourName()
	 * @see #getReferenceArea()
	 * @generated
	 */
	EAttribute getReferenceArea_TourName();

	/**
	 * Returns the meta object for the attribute '{@link de.jena.udp.reference.area.sensinact.model.sensinactrefarea.ReferenceArea#getColor <em>Color</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Color</em>'.
	 * @see de.jena.udp.reference.area.sensinact.model.sensinactrefarea.ReferenceArea#getColor()
	 * @see #getReferenceArea()
	 * @generated
	 */
	EAttribute getReferenceArea_Color();

	/**
	 * Returns the meta object for enum '{@link de.jena.udp.reference.area.sensinact.model.sensinactrefarea.ColorType <em>Color Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Color Type</em>'.
	 * @see de.jena.udp.reference.area.sensinact.model.sensinactrefarea.ColorType
	 * @generated
	 */
	EEnum getColorType();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	SensinactRefAreaFactory getSensinactRefAreaFactory();

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
		 * The meta object literal for the '{@link de.jena.udp.reference.area.sensinact.model.sensinactrefarea.impl.ReferenceAreaProviderImpl <em>Reference Area Provider</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.jena.udp.reference.area.sensinact.model.sensinactrefarea.impl.ReferenceAreaProviderImpl
		 * @see de.jena.udp.reference.area.sensinact.model.sensinactrefarea.impl.SensinactRefAreaPackageImpl#getReferenceAreaProvider()
		 * @generated
		 */
		EClass REFERENCE_AREA_PROVIDER = eINSTANCE.getReferenceAreaProvider();

		/**
		 * The meta object literal for the '<em><b>Reference Area</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference REFERENCE_AREA_PROVIDER__REFERENCE_AREA = eINSTANCE.getReferenceAreaProvider_ReferenceArea();

		/**
		 * The meta object literal for the '{@link de.jena.udp.reference.area.sensinact.model.sensinactrefarea.impl.ReferenceAreaImpl <em>Reference Area</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.jena.udp.reference.area.sensinact.model.sensinactrefarea.impl.ReferenceAreaImpl
		 * @see de.jena.udp.reference.area.sensinact.model.sensinactrefarea.impl.SensinactRefAreaPackageImpl#getReferenceArea()
		 * @generated
		 */
		EClass REFERENCE_AREA = eINSTANCE.getReferenceArea();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute REFERENCE_AREA__NAME = eINSTANCE.getReferenceArea_Name();

		/**
		 * The meta object literal for the '<em><b>Gid</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute REFERENCE_AREA__GID = eINSTANCE.getReferenceArea_Gid();

		/**
		 * The meta object literal for the '<em><b>Sensor Count</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute REFERENCE_AREA__SENSOR_COUNT = eINSTANCE.getReferenceArea_SensorCount();

		/**
		 * The meta object literal for the '<em><b>Tour Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute REFERENCE_AREA__TOUR_NAME = eINSTANCE.getReferenceArea_TourName();

		/**
		 * The meta object literal for the '<em><b>Color</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute REFERENCE_AREA__COLOR = eINSTANCE.getReferenceArea_Color();

		/**
		 * The meta object literal for the '{@link de.jena.udp.reference.area.sensinact.model.sensinactrefarea.ColorType <em>Color Type</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.jena.udp.reference.area.sensinact.model.sensinactrefarea.ColorType
		 * @see de.jena.udp.reference.area.sensinact.model.sensinactrefarea.impl.SensinactRefAreaPackageImpl#getColorType()
		 * @generated
		 */
		EEnum COLOR_TYPE = eINSTANCE.getColorType();

	}

} //SensinactRefAreaPackage
