/*
 */
package de.jena.upd.modelling.ui.api.modellingApi;


import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EOperation;

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
 * @see de.jena.upd.modelling.ui.api.modellingApi.ModellingApiFactory
 * @model kind="package"
 *        annotation="Version value='1.0'"
 * @generated
 */
@ProviderType
@EPackage(uri = ModellingApiPackage.eNS_URI, genModel = "/model/api-modelling.genmodel", genModelSourceLocations = {"model/api-modelling.genmodel","de.jena.upd.modelling.ui.api/model/api-modelling.genmodel"}, ecore="/model/api-modelling.ecore", ecoreSourceLocations="/model/api-modelling.ecore")
public interface ModellingApiPackage extends org.eclipse.emf.ecore.EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "modellingApi";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "https://models.jena.de/udp/modelling/api/1.0";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "modellingApi";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	ModellingApiPackage eINSTANCE = de.jena.upd.modelling.ui.api.modellingApi.impl.ModellingApiPackageImpl.init();

	/**
	 * The meta object id for the '{@link de.jena.upd.modelling.ui.api.modellingApi.EPackageResource <em>EPackage Resource</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.jena.upd.modelling.ui.api.modellingApi.EPackageResource
	 * @see de.jena.upd.modelling.ui.api.modellingApi.impl.ModellingApiPackageImpl#getEPackageResource()
	 * @generated
	 */
	int EPACKAGE_RESOURCE = 0;

	/**
	 * The number of structural features of the '<em>EPackage Resource</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EPACKAGE_RESOURCE_FEATURE_COUNT = 0;

	/**
	 * The operation id for the '<em>Load</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EPACKAGE_RESOURCE___LOAD__STRING = 0;

	/**
	 * The operation id for the '<em>Load All</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EPACKAGE_RESOURCE___LOAD_ALL = 1;

	/**
	 * The operation id for the '<em>Save</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EPACKAGE_RESOURCE___SAVE__EPACKAGE = 2;

	/**
	 * The operation id for the '<em>Delete</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EPACKAGE_RESOURCE___DELETE__STRING = 3;

	/**
	 * The operation id for the '<em>Exists</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EPACKAGE_RESOURCE___EXISTS__STRING = 4;

	/**
	 * The operation id for the '<em>Save All</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EPACKAGE_RESOURCE___SAVE_ALL__ELIST = 5;

	/**
	 * The number of operations of the '<em>EPackage Resource</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EPACKAGE_RESOURCE_OPERATION_COUNT = 6;

	/**
	 * The meta object id for the '{@link de.jena.upd.modelling.ui.api.modellingApi.EObjectResource <em>EObject Resource</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.jena.upd.modelling.ui.api.modellingApi.EObjectResource
	 * @see de.jena.upd.modelling.ui.api.modellingApi.impl.ModellingApiPackageImpl#getEObjectResource()
	 * @generated
	 */
	int EOBJECT_RESOURCE = 1;

	/**
	 * The number of structural features of the '<em>EObject Resource</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EOBJECT_RESOURCE_FEATURE_COUNT = 0;

	/**
	 * The operation id for the '<em>Load</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EOBJECT_RESOURCE___LOAD__STRING_STRING = 0;

	/**
	 * The operation id for the '<em>Load All</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EOBJECT_RESOURCE___LOAD_ALL__STRING_ELIST = 1;

	/**
	 * The operation id for the '<em>Save</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EOBJECT_RESOURCE___SAVE__EOBJECT = 2;

	/**
	 * The operation id for the '<em>Delete</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EOBJECT_RESOURCE___DELETE__STRING_STRING = 3;

	/**
	 * The operation id for the '<em>Exists</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EOBJECT_RESOURCE___EXISTS__STRING_STRING = 4;

	/**
	 * The operation id for the '<em>Save All</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EOBJECT_RESOURCE___SAVE_ALL__ELIST = 5;

	/**
	 * The number of operations of the '<em>EObject Resource</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EOBJECT_RESOURCE_OPERATION_COUNT = 6;

	/**
	 * The meta object id for the '<em>EWeb Application Exception</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see jakarta.ws.rs.WebApplicationException
	 * @see de.jena.upd.modelling.ui.api.modellingApi.impl.ModellingApiPackageImpl#getEWebApplicationException()
	 * @generated
	 */
	int EWEB_APPLICATION_EXCEPTION = 2;

	/**
	 * The meta object id for the '<em>EResponse</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see jakarta.ws.rs.core.Response
	 * @see de.jena.upd.modelling.ui.api.modellingApi.impl.ModellingApiPackageImpl#getEResponse()
	 * @generated
	 */
	int ERESPONSE = 3;


	/**
	 * Returns the meta object for class '{@link de.jena.upd.modelling.ui.api.modellingApi.EPackageResource <em>EPackage Resource</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>EPackage Resource</em>'.
	 * @see de.jena.upd.modelling.ui.api.modellingApi.EPackageResource
	 * @generated
	 */
	EClass getEPackageResource();

	/**
	 * Returns the meta object for the '{@link de.jena.upd.modelling.ui.api.modellingApi.EPackageResource#load(java.lang.String) <em>Load</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Load</em>' operation.
	 * @see de.jena.upd.modelling.ui.api.modellingApi.EPackageResource#load(java.lang.String)
	 * @generated
	 */
	EOperation getEPackageResource__Load__String();

	/**
	 * Returns the meta object for the '{@link de.jena.upd.modelling.ui.api.modellingApi.EPackageResource#loadAll() <em>Load All</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Load All</em>' operation.
	 * @see de.jena.upd.modelling.ui.api.modellingApi.EPackageResource#loadAll()
	 * @generated
	 */
	EOperation getEPackageResource__LoadAll();

	/**
	 * Returns the meta object for the '{@link de.jena.upd.modelling.ui.api.modellingApi.EPackageResource#save(org.eclipse.emf.ecore.EPackage) <em>Save</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Save</em>' operation.
	 * @see de.jena.upd.modelling.ui.api.modellingApi.EPackageResource#save(org.eclipse.emf.ecore.EPackage)
	 * @generated
	 */
	EOperation getEPackageResource__Save__EPackage();

	/**
	 * Returns the meta object for the '{@link de.jena.upd.modelling.ui.api.modellingApi.EPackageResource#delete(java.lang.String) <em>Delete</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Delete</em>' operation.
	 * @see de.jena.upd.modelling.ui.api.modellingApi.EPackageResource#delete(java.lang.String)
	 * @generated
	 */
	EOperation getEPackageResource__Delete__String();

	/**
	 * Returns the meta object for the '{@link de.jena.upd.modelling.ui.api.modellingApi.EPackageResource#exists(java.lang.String) <em>Exists</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Exists</em>' operation.
	 * @see de.jena.upd.modelling.ui.api.modellingApi.EPackageResource#exists(java.lang.String)
	 * @generated
	 */
	EOperation getEPackageResource__Exists__String();

	/**
	 * Returns the meta object for the '{@link de.jena.upd.modelling.ui.api.modellingApi.EPackageResource#saveAll(org.eclipse.emf.common.util.EList) <em>Save All</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Save All</em>' operation.
	 * @see de.jena.upd.modelling.ui.api.modellingApi.EPackageResource#saveAll(org.eclipse.emf.common.util.EList)
	 * @generated
	 */
	EOperation getEPackageResource__SaveAll__EList();

	/**
	 * Returns the meta object for class '{@link de.jena.upd.modelling.ui.api.modellingApi.EObjectResource <em>EObject Resource</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>EObject Resource</em>'.
	 * @see de.jena.upd.modelling.ui.api.modellingApi.EObjectResource
	 * @generated
	 */
	EClass getEObjectResource();

	/**
	 * Returns the meta object for the '{@link de.jena.upd.modelling.ui.api.modellingApi.EObjectResource#load(java.lang.String, java.lang.String) <em>Load</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Load</em>' operation.
	 * @see de.jena.upd.modelling.ui.api.modellingApi.EObjectResource#load(java.lang.String, java.lang.String)
	 * @generated
	 */
	EOperation getEObjectResource__Load__String_String();

	/**
	 * Returns the meta object for the '{@link de.jena.upd.modelling.ui.api.modellingApi.EObjectResource#loadAll(java.lang.String, org.eclipse.emf.common.util.EList) <em>Load All</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Load All</em>' operation.
	 * @see de.jena.upd.modelling.ui.api.modellingApi.EObjectResource#loadAll(java.lang.String, org.eclipse.emf.common.util.EList)
	 * @generated
	 */
	EOperation getEObjectResource__LoadAll__String_EList();

	/**
	 * Returns the meta object for the '{@link de.jena.upd.modelling.ui.api.modellingApi.EObjectResource#save(org.eclipse.emf.ecore.EObject) <em>Save</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Save</em>' operation.
	 * @see de.jena.upd.modelling.ui.api.modellingApi.EObjectResource#save(org.eclipse.emf.ecore.EObject)
	 * @generated
	 */
	EOperation getEObjectResource__Save__EObject();

	/**
	 * Returns the meta object for the '{@link de.jena.upd.modelling.ui.api.modellingApi.EObjectResource#delete(java.lang.String, java.lang.String) <em>Delete</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Delete</em>' operation.
	 * @see de.jena.upd.modelling.ui.api.modellingApi.EObjectResource#delete(java.lang.String, java.lang.String)
	 * @generated
	 */
	EOperation getEObjectResource__Delete__String_String();

	/**
	 * Returns the meta object for the '{@link de.jena.upd.modelling.ui.api.modellingApi.EObjectResource#exists(java.lang.String, java.lang.String) <em>Exists</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Exists</em>' operation.
	 * @see de.jena.upd.modelling.ui.api.modellingApi.EObjectResource#exists(java.lang.String, java.lang.String)
	 * @generated
	 */
	EOperation getEObjectResource__Exists__String_String();

	/**
	 * Returns the meta object for the '{@link de.jena.upd.modelling.ui.api.modellingApi.EObjectResource#saveAll(org.eclipse.emf.common.util.EList) <em>Save All</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Save All</em>' operation.
	 * @see de.jena.upd.modelling.ui.api.modellingApi.EObjectResource#saveAll(org.eclipse.emf.common.util.EList)
	 * @generated
	 */
	EOperation getEObjectResource__SaveAll__EList();

	/**
	 * Returns the meta object for data type '{@link jakarta.ws.rs.WebApplicationException <em>EWeb Application Exception</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>EWeb Application Exception</em>'.
	 * @see jakarta.ws.rs.WebApplicationException
	 * @model instanceClass="jakarta.ws.rs.WebApplicationException"
	 * @generated
	 */
	EDataType getEWebApplicationException();

	/**
	 * Returns the meta object for data type '{@link jakarta.ws.rs.core.Response <em>EResponse</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>EResponse</em>'.
	 * @see jakarta.ws.rs.core.Response
	 * @model instanceClass="jakarta.ws.rs.core.Response"
	 * @generated
	 */
	EDataType getEResponse();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	ModellingApiFactory getModellingApiFactory();

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
		 * The meta object literal for the '{@link de.jena.upd.modelling.ui.api.modellingApi.EPackageResource <em>EPackage Resource</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.jena.upd.modelling.ui.api.modellingApi.EPackageResource
		 * @see de.jena.upd.modelling.ui.api.modellingApi.impl.ModellingApiPackageImpl#getEPackageResource()
		 * @generated
		 */
		EClass EPACKAGE_RESOURCE = eINSTANCE.getEPackageResource();

		/**
		 * The meta object literal for the '<em><b>Load</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation EPACKAGE_RESOURCE___LOAD__STRING = eINSTANCE.getEPackageResource__Load__String();

		/**
		 * The meta object literal for the '<em><b>Load All</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation EPACKAGE_RESOURCE___LOAD_ALL = eINSTANCE.getEPackageResource__LoadAll();

		/**
		 * The meta object literal for the '<em><b>Save</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation EPACKAGE_RESOURCE___SAVE__EPACKAGE = eINSTANCE.getEPackageResource__Save__EPackage();

		/**
		 * The meta object literal for the '<em><b>Delete</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation EPACKAGE_RESOURCE___DELETE__STRING = eINSTANCE.getEPackageResource__Delete__String();

		/**
		 * The meta object literal for the '<em><b>Exists</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation EPACKAGE_RESOURCE___EXISTS__STRING = eINSTANCE.getEPackageResource__Exists__String();

		/**
		 * The meta object literal for the '<em><b>Save All</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation EPACKAGE_RESOURCE___SAVE_ALL__ELIST = eINSTANCE.getEPackageResource__SaveAll__EList();

		/**
		 * The meta object literal for the '{@link de.jena.upd.modelling.ui.api.modellingApi.EObjectResource <em>EObject Resource</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.jena.upd.modelling.ui.api.modellingApi.EObjectResource
		 * @see de.jena.upd.modelling.ui.api.modellingApi.impl.ModellingApiPackageImpl#getEObjectResource()
		 * @generated
		 */
		EClass EOBJECT_RESOURCE = eINSTANCE.getEObjectResource();

		/**
		 * The meta object literal for the '<em><b>Load</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation EOBJECT_RESOURCE___LOAD__STRING_STRING = eINSTANCE.getEObjectResource__Load__String_String();

		/**
		 * The meta object literal for the '<em><b>Load All</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation EOBJECT_RESOURCE___LOAD_ALL__STRING_ELIST = eINSTANCE.getEObjectResource__LoadAll__String_EList();

		/**
		 * The meta object literal for the '<em><b>Save</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation EOBJECT_RESOURCE___SAVE__EOBJECT = eINSTANCE.getEObjectResource__Save__EObject();

		/**
		 * The meta object literal for the '<em><b>Delete</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation EOBJECT_RESOURCE___DELETE__STRING_STRING = eINSTANCE.getEObjectResource__Delete__String_String();

		/**
		 * The meta object literal for the '<em><b>Exists</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation EOBJECT_RESOURCE___EXISTS__STRING_STRING = eINSTANCE.getEObjectResource__Exists__String_String();

		/**
		 * The meta object literal for the '<em><b>Save All</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation EOBJECT_RESOURCE___SAVE_ALL__ELIST = eINSTANCE.getEObjectResource__SaveAll__EList();

		/**
		 * The meta object literal for the '<em>EWeb Application Exception</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see jakarta.ws.rs.WebApplicationException
		 * @see de.jena.upd.modelling.ui.api.modellingApi.impl.ModellingApiPackageImpl#getEWebApplicationException()
		 * @generated
		 */
		EDataType EWEB_APPLICATION_EXCEPTION = eINSTANCE.getEWebApplicationException();

		/**
		 * The meta object literal for the '<em>EResponse</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see jakarta.ws.rs.core.Response
		 * @see de.jena.upd.modelling.ui.api.modellingApi.impl.ModellingApiPackageImpl#getEResponse()
		 * @generated
		 */
		EDataType ERESPONSE = eINSTANCE.getEResponse();

	}

} //ModellingApiPackage
