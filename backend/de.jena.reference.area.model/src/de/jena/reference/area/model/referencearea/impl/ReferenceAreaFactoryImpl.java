/**
 */
package de.jena.reference.area.model.referencearea.impl;

import de.jena.reference.area.model.referencearea.*;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class ReferenceAreaFactoryImpl extends EFactoryImpl implements ReferenceAreaFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static ReferenceAreaFactory init() {
		try {
			ReferenceAreaFactory theReferenceAreaFactory = (ReferenceAreaFactory)EPackage.Registry.INSTANCE.getEFactory(ReferenceAreaPackage.eNS_URI);
			if (theReferenceAreaFactory != null) {
				return theReferenceAreaFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new ReferenceAreaFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ReferenceAreaFactoryImpl() {
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
			case ReferenceAreaPackage.REFERENCE_AREA: return createReferenceArea();
			case ReferenceAreaPackage.REFERENCE_AREA_COLLECTION: return createReferenceAreaCollection();
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
	public ReferenceArea createReferenceArea() {
		ReferenceAreaImpl referenceArea = new ReferenceAreaImpl();
		return referenceArea;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ReferenceAreaCollection createReferenceAreaCollection() {
		ReferenceAreaCollectionImpl referenceAreaCollection = new ReferenceAreaCollectionImpl();
		return referenceAreaCollection;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ReferenceAreaPackage getReferenceAreaPackage() {
		return (ReferenceAreaPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static ReferenceAreaPackage getPackage() {
		return ReferenceAreaPackage.eINSTANCE;
	}

} //ReferenceAreaFactoryImpl
