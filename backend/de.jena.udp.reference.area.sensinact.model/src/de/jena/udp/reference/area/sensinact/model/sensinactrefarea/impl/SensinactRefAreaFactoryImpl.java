/**
 */
package de.jena.udp.reference.area.sensinact.model.sensinactrefarea.impl;

import de.jena.udp.reference.area.sensinact.model.sensinactrefarea.*;

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
public class SensinactRefAreaFactoryImpl extends EFactoryImpl implements SensinactRefAreaFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static SensinactRefAreaFactory init() {
		try {
			SensinactRefAreaFactory theSensinactRefAreaFactory = (SensinactRefAreaFactory)EPackage.Registry.INSTANCE.getEFactory(SensinactRefAreaPackage.eNS_URI);
			if (theSensinactRefAreaFactory != null) {
				return theSensinactRefAreaFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new SensinactRefAreaFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SensinactRefAreaFactoryImpl() {
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
			case SensinactRefAreaPackage.REFERENCE_AREA_PROVIDER: return createReferenceAreaProvider();
			case SensinactRefAreaPackage.REFERENCE_AREA: return createReferenceArea();
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
	public ReferenceAreaProvider createReferenceAreaProvider() {
		ReferenceAreaProviderImpl referenceAreaProvider = new ReferenceAreaProviderImpl();
		return referenceAreaProvider;
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
	public SensinactRefAreaPackage getSensinactRefAreaPackage() {
		return (SensinactRefAreaPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static SensinactRefAreaPackage getPackage() {
		return SensinactRefAreaPackage.eINSTANCE;
	}

} //SensinactRefAreaFactoryImpl
