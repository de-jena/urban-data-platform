/**
 * Copyright (c) 2012 - 2025 Data In Motion and others.
 * All rights reserved. 
 * 
 * This program and the accompanying materials are made
 * available under the terms of the Eclipse Public License 2.0
 * which is available at https://www.eclipse.org/legal/epl-2.0/
 * 
 * SPDX-License-Identifier: EPL-2.0
 * 
 * Contributors:
 *     Data In Motion - initial API and implementation
 */
package de.jena.udp.reference.area.sensinact.model.sensinactrefarea.impl;

import de.jena.udp.reference.area.sensinact.model.sensinactrefarea.ColorType;
import de.jena.udp.reference.area.sensinact.model.sensinactrefarea.ReferenceArea;
import de.jena.udp.reference.area.sensinact.model.sensinactrefarea.ReferenceAreaProvider;
import de.jena.udp.reference.area.sensinact.model.sensinactrefarea.SensinactRefAreaFactory;
import de.jena.udp.reference.area.sensinact.model.sensinactrefarea.SensinactRefAreaPackage;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;

import org.eclipse.sensinact.model.core.provider.ProviderPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class SensinactRefAreaPackageImpl extends EPackageImpl implements SensinactRefAreaPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass referenceAreaProviderEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass referenceAreaEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum colorTypeEEnum = null;

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
	 * @see de.jena.udp.reference.area.sensinact.model.sensinactrefarea.SensinactRefAreaPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private SensinactRefAreaPackageImpl() {
		super(eNS_URI, SensinactRefAreaFactory.eINSTANCE);
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
	 * <p>This method is used to initialize {@link SensinactRefAreaPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static SensinactRefAreaPackage init() {
		if (isInited) return (SensinactRefAreaPackage)EPackage.Registry.INSTANCE.getEPackage(SensinactRefAreaPackage.eNS_URI);

		// Obtain or create and register package
		Object registeredSensinactRefAreaPackage = EPackage.Registry.INSTANCE.get(eNS_URI);
		SensinactRefAreaPackageImpl theSensinactRefAreaPackage = registeredSensinactRefAreaPackage instanceof SensinactRefAreaPackageImpl ? (SensinactRefAreaPackageImpl)registeredSensinactRefAreaPackage : new SensinactRefAreaPackageImpl();

		isInited = true;

		// Initialize simple dependencies
		ProviderPackage.eINSTANCE.eClass();

		// Create package meta-data objects
		theSensinactRefAreaPackage.createPackageContents();

		// Initialize created meta-data
		theSensinactRefAreaPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theSensinactRefAreaPackage.freeze();

		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(SensinactRefAreaPackage.eNS_URI, theSensinactRefAreaPackage);
		return theSensinactRefAreaPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getReferenceAreaProvider() {
		return referenceAreaProviderEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getReferenceAreaProvider_ReferenceArea() {
		return (EReference)referenceAreaProviderEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getReferenceArea() {
		return referenceAreaEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getReferenceArea_Name() {
		return (EAttribute)referenceAreaEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getReferenceArea_Gid() {
		return (EAttribute)referenceAreaEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getReferenceArea_SensorCount() {
		return (EAttribute)referenceAreaEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getReferenceArea_TourName() {
		return (EAttribute)referenceAreaEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getReferenceArea_Color() {
		return (EAttribute)referenceAreaEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EEnum getColorType() {
		return colorTypeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public SensinactRefAreaFactory getSensinactRefAreaFactory() {
		return (SensinactRefAreaFactory)getEFactoryInstance();
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
		referenceAreaProviderEClass = createEClass(REFERENCE_AREA_PROVIDER);
		createEReference(referenceAreaProviderEClass, REFERENCE_AREA_PROVIDER__REFERENCE_AREA);

		referenceAreaEClass = createEClass(REFERENCE_AREA);
		createEAttribute(referenceAreaEClass, REFERENCE_AREA__NAME);
		createEAttribute(referenceAreaEClass, REFERENCE_AREA__GID);
		createEAttribute(referenceAreaEClass, REFERENCE_AREA__SENSOR_COUNT);
		createEAttribute(referenceAreaEClass, REFERENCE_AREA__TOUR_NAME);
		createEAttribute(referenceAreaEClass, REFERENCE_AREA__COLOR);

		// Create enums
		colorTypeEEnum = createEEnum(COLOR_TYPE);
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
		ProviderPackage theProviderPackage = (ProviderPackage)EPackage.Registry.INSTANCE.getEPackage(ProviderPackage.eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		referenceAreaProviderEClass.getESuperTypes().add(theProviderPackage.getProvider());
		referenceAreaEClass.getESuperTypes().add(theProviderPackage.getService());

		// Initialize classes, features, and operations; add parameters
		initEClass(referenceAreaProviderEClass, ReferenceAreaProvider.class, "ReferenceAreaProvider", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getReferenceAreaProvider_ReferenceArea(), this.getReferenceArea(), null, "referenceArea", null, 0, 1, ReferenceAreaProvider.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(referenceAreaEClass, ReferenceArea.class, "ReferenceArea", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getReferenceArea_Name(), ecorePackage.getEString(), "name", null, 0, 1, ReferenceArea.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getReferenceArea_Gid(), ecorePackage.getEFloat(), "gid", null, 0, 1, ReferenceArea.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getReferenceArea_SensorCount(), ecorePackage.getEInt(), "sensorCount", null, 0, 1, ReferenceArea.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getReferenceArea_TourName(), ecorePackage.getEString(), "tourName", null, 0, 1, ReferenceArea.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getReferenceArea_Color(), this.getColorType(), "color", null, 0, 1, ReferenceArea.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		// Initialize enums and add enum literals
		initEEnum(colorTypeEEnum, ColorType.class, "ColorType");
		addEEnumLiteral(colorTypeEEnum, ColorType.UNKNOWN);
		addEEnumLiteral(colorTypeEEnum, ColorType.BLUE);
		addEEnumLiteral(colorTypeEEnum, ColorType.GREEN);
		addEEnumLiteral(colorTypeEEnum, ColorType.YELLOW);
		addEEnumLiteral(colorTypeEEnum, ColorType.RED);

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
		  (getReferenceArea_Name(),
		   source,
		   new String[] {
			   "documentation", "The name/identifier of the reference area (e.g., ZW-01, ZW-02)"
		   });
		addAnnotation
		  (getReferenceArea_Gid(),
		   source,
		   new String[] {
			   "documentation", "Unique geographic identifier for the reference area"
		   });
		addAnnotation
		  (getReferenceArea_SensorCount(),
		   source,
		   new String[] {
			   "documentation", "Number of sensors (anzahl_sens) in this reference area"
		   });
		addAnnotation
		  (getReferenceArea_TourName(),
		   source,
		   new String[] {
			   "documentation", "Long tour name describing the location (tour_name_lang)"
		   });
	}

} //SensinactRefAreaPackageImpl
