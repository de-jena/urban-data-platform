/*
 * Copyright (c) 2012 - 2024 Data In Motion and others.
 * All rights reserved. 
 *
 * This program and the accompanying materials are made
 * available under the terms of the Eclipse Public License 2.0
 * which is available at https://www.eclipse.org/legal/epl-2.0/
 * SPDX-License-Identifier: EPL-2.0
 *
 * Contributors:
 *     Data In Motion - initial API and implementation
 */

package de.jena.upd.modelling.ui.api.modellingApi.impl;

import de.jena.upd.modelling.ui.api.modellingApi.EObjectResource;
import de.jena.upd.modelling.ui.api.modellingApi.EPackageResource;
import de.jena.upd.modelling.ui.api.modellingApi.ModellingApiFactory;
import de.jena.upd.modelling.ui.api.modellingApi.ModellingApiPackage;

import jakarta.ws.rs.WebApplicationException;

import jakarta.ws.rs.core.Response;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EOperation;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EPackageImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class ModellingApiPackageImpl extends EPackageImpl implements ModellingApiPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass ePackageResourceEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass eObjectResourceEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType eWebApplicationExceptionEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType eResponseEDataType = null;

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
	 * @see de.jena.upd.modelling.ui.api.modellingApi.ModellingApiPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private ModellingApiPackageImpl() {
		super(eNS_URI, ModellingApiFactory.eINSTANCE);
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
	 * <p>This method is used to initialize {@link ModellingApiPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static ModellingApiPackage init() {
		if (isInited) return (ModellingApiPackage)EPackage.Registry.INSTANCE.getEPackage(ModellingApiPackage.eNS_URI);

		// Obtain or create and register package
		Object registeredModellingApiPackage = EPackage.Registry.INSTANCE.get(eNS_URI);
		ModellingApiPackageImpl theModellingApiPackage = registeredModellingApiPackage instanceof ModellingApiPackageImpl ? (ModellingApiPackageImpl)registeredModellingApiPackage : new ModellingApiPackageImpl();

		isInited = true;

		// Create package meta-data objects
		theModellingApiPackage.createPackageContents();

		// Initialize created meta-data
		theModellingApiPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theModellingApiPackage.freeze();

		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(ModellingApiPackage.eNS_URI, theModellingApiPackage);
		return theModellingApiPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getEPackageResource() {
		return ePackageResourceEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getEPackageResource__Load__String() {
		return ePackageResourceEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getEPackageResource__LoadAll() {
		return ePackageResourceEClass.getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getEPackageResource__Save__EPackage() {
		return ePackageResourceEClass.getEOperations().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getEPackageResource__Delete__String() {
		return ePackageResourceEClass.getEOperations().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getEPackageResource__Exists__String() {
		return ePackageResourceEClass.getEOperations().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getEPackageResource__SaveAll__EList() {
		return ePackageResourceEClass.getEOperations().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getEObjectResource() {
		return eObjectResourceEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getEObjectResource__Load__String_String() {
		return eObjectResourceEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getEObjectResource__LoadAll__String_EList() {
		return eObjectResourceEClass.getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getEObjectResource__Save__EObject() {
		return eObjectResourceEClass.getEOperations().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getEObjectResource__Delete__String_String() {
		return eObjectResourceEClass.getEOperations().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getEObjectResource__Exists__String_String() {
		return eObjectResourceEClass.getEOperations().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getEObjectResource__SaveAll__EList() {
		return eObjectResourceEClass.getEOperations().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EDataType getEWebApplicationException() {
		return eWebApplicationExceptionEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EDataType getEResponse() {
		return eResponseEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ModellingApiFactory getModellingApiFactory() {
		return (ModellingApiFactory)getEFactoryInstance();
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
		ePackageResourceEClass = createEClass(EPACKAGE_RESOURCE);
		createEOperation(ePackageResourceEClass, EPACKAGE_RESOURCE___LOAD__STRING);
		createEOperation(ePackageResourceEClass, EPACKAGE_RESOURCE___LOAD_ALL);
		createEOperation(ePackageResourceEClass, EPACKAGE_RESOURCE___SAVE__EPACKAGE);
		createEOperation(ePackageResourceEClass, EPACKAGE_RESOURCE___DELETE__STRING);
		createEOperation(ePackageResourceEClass, EPACKAGE_RESOURCE___EXISTS__STRING);
		createEOperation(ePackageResourceEClass, EPACKAGE_RESOURCE___SAVE_ALL__ELIST);

		eObjectResourceEClass = createEClass(EOBJECT_RESOURCE);
		createEOperation(eObjectResourceEClass, EOBJECT_RESOURCE___LOAD__STRING_STRING);
		createEOperation(eObjectResourceEClass, EOBJECT_RESOURCE___LOAD_ALL__STRING_ELIST);
		createEOperation(eObjectResourceEClass, EOBJECT_RESOURCE___SAVE__EOBJECT);
		createEOperation(eObjectResourceEClass, EOBJECT_RESOURCE___DELETE__STRING_STRING);
		createEOperation(eObjectResourceEClass, EOBJECT_RESOURCE___EXISTS__STRING_STRING);
		createEOperation(eObjectResourceEClass, EOBJECT_RESOURCE___SAVE_ALL__ELIST);

		// Create data types
		eWebApplicationExceptionEDataType = createEDataType(EWEB_APPLICATION_EXCEPTION);
		eResponseEDataType = createEDataType(ERESPONSE);
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

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes

		// Initialize classes, features, and operations; add parameters
		initEClass(ePackageResourceEClass, EPackageResource.class, "EPackageResource", IS_ABSTRACT, IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		EOperation op = initEOperation(getEPackageResource__Load__String(), ecorePackage.getEPackage(), "load", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEString(), "ePackageUri", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEException(op, this.getEWebApplicationException());

		op = initEOperation(getEPackageResource__LoadAll(), ecorePackage.getEString(), "loadAll", 0, -1, IS_UNIQUE, IS_ORDERED);
		addEException(op, this.getEWebApplicationException());

		op = initEOperation(getEPackageResource__Save__EPackage(), this.getEResponse(), "save", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEPackage(), "ePackage", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getEPackageResource__Delete__String(), this.getEResponse(), "delete", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEString(), "ePackageUri", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEException(op, this.getEWebApplicationException());

		op = initEOperation(getEPackageResource__Exists__String(), this.getEResponse(), "exists", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEString(), "ePackageUri", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEException(op, this.getEWebApplicationException());

		op = initEOperation(getEPackageResource__SaveAll__EList(), this.getEResponse(), "saveAll", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEPackage(), "ePackage", 0, -1, IS_UNIQUE, IS_ORDERED);

		initEClass(eObjectResourceEClass, EObjectResource.class, "EObjectResource", IS_ABSTRACT, IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		op = initEOperation(getEObjectResource__Load__String_String(), ecorePackage.getEObject(), "load", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEString(), "eClassUri", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEString(), "id", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEException(op, this.getEWebApplicationException());

		op = initEOperation(getEObjectResource__LoadAll__String_EList(), ecorePackage.getEObject(), "loadAll", 0, -1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEString(), "eClassUri", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEString(), "projection", 0, -1, IS_UNIQUE, IS_ORDERED);
		addEException(op, this.getEWebApplicationException());

		op = initEOperation(getEObjectResource__Save__EObject(), ecorePackage.getEObject(), "save", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEObject(), "eObject", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getEObjectResource__Delete__String_String(), this.getEResponse(), "delete", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEString(), "eClassUri", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEString(), "id", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEException(op, this.getEWebApplicationException());

		op = initEOperation(getEObjectResource__Exists__String_String(), this.getEResponse(), "exists", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEString(), "eClassUri", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEString(), "id", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEException(op, this.getEWebApplicationException());

		op = initEOperation(getEObjectResource__SaveAll__EList(), ecorePackage.getEObject(), "saveAll", 0, -1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEObject(), "eObjects", 0, -1, IS_UNIQUE, IS_ORDERED);

		// Initialize data types
		initEDataType(eWebApplicationExceptionEDataType, WebApplicationException.class, "EWebApplicationException", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);
		initEDataType(eResponseEDataType, Response.class, "EResponse", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);

		// Create resource
		createResource(eNS_URI);

		// Create annotations
		// Version
		createVersionAnnotations();
		// jakarta.ws.rs.Path
		createJakartaAnnotations();
		// jakarta.ws.rs.GET
		createJakarta_1Annotations();
		// http://www.eclipse.org/emf/2002/GenModel
		createGenModelAnnotations();
		// jakarta.ws.rs.POST
		createJakarta_2Annotations();
		// jakarta.ws.rs.DELETE
		createJakarta_3Annotations();
		// jakarta.ws.rs.HEAD
		createJakarta_4Annotations();
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
	 * Initializes the annotations for <b>jakarta.ws.rs.Path</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void createJakartaAnnotations() {
		String source = "jakarta.ws.rs.Path";
		addAnnotation
		  (ePackageResourceEClass,
		   source,
		   new String[] {
			   "value", "/epackage"
		   });
		addAnnotation
		  (eObjectResourceEClass,
		   source,
		   new String[] {
			   "value", "/eobject"
		   });
	}

	/**
	 * Initializes the annotations for <b>jakarta.ws.rs.GET</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void createJakarta_1Annotations() {
		String source = "jakarta.ws.rs.GET";
		addAnnotation
		  (getEPackageResource__Load__String(),
		   source,
		   new String[] {
		   });
		addAnnotation
		  (getEPackageResource__LoadAll(),
		   source,
		   new String[] {
		   });
		addAnnotation
		  (getEObjectResource__Load__String_String(),
		   source,
		   new String[] {
		   });
		addAnnotation
		  (getEObjectResource__LoadAll__String_EList(),
		   source,
		   new String[] {
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
		  (getEPackageResource__LoadAll(),
		   source,
		   new String[] {
			   "documentation", "Returns a List of Package URIs"
		   });
		addAnnotation
		  (getEObjectResource__LoadAll__String_EList(),
		   source,
		   new String[] {
			   "documentation", "Returns all EObjects found of the requrested EClass type. If no projection is set, all Objects will be returned with all their Features."
		   });
		addAnnotation
		  ((getEObjectResource__LoadAll__String_EList()).getEParameters().get(1),
		   source,
		   new String[] {
			   "documentation", "A Whitelist of Attributes used as Projection for the returning EObjects. The ID Features will always be included. "
		   });
		addAnnotation
		  (getEObjectResource__Save__EObject(),
		   source,
		   new String[] {
			   "documentation", "Returns the saved EObject with only the ID feature set."
		   });
		addAnnotation
		  (getEObjectResource__SaveAll__EList(),
		   source,
		   new String[] {
			   "documentation", "Returns the saved EObjects with only the ID feature set."
		   });
	}

	/**
	 * Initializes the annotations for <b>jakarta.ws.rs.POST</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void createJakarta_2Annotations() {
		String source = "jakarta.ws.rs.POST";
		addAnnotation
		  (getEPackageResource__Save__EPackage(),
		   source,
		   new String[] {
		   });
		addAnnotation
		  (getEPackageResource__SaveAll__EList(),
		   source,
		   new String[] {
		   });
		addAnnotation
		  (getEObjectResource__Save__EObject(),
		   source,
		   new String[] {
		   });
		addAnnotation
		  (getEObjectResource__SaveAll__EList(),
		   source,
		   new String[] {
		   });
	}

	/**
	 * Initializes the annotations for <b>jakarta.ws.rs.DELETE</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void createJakarta_3Annotations() {
		String source = "jakarta.ws.rs.DELETE";
		addAnnotation
		  (getEPackageResource__Delete__String(),
		   source,
		   new String[] {
		   });
		addAnnotation
		  (getEObjectResource__Delete__String_String(),
		   source,
		   new String[] {
		   });
	}

	/**
	 * Initializes the annotations for <b>jakarta.ws.rs.HEAD</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void createJakarta_4Annotations() {
		String source = "jakarta.ws.rs.HEAD";
		addAnnotation
		  (getEPackageResource__Exists__String(),
		   source,
		   new String[] {
		   });
		addAnnotation
		  (getEObjectResource__Exists__String_String(),
		   source,
		   new String[] {
		   });
	}

} //ModellingApiPackageImpl
