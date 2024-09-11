/**
 */
package de.jena.mdo.idmt.idmt.util;

import de.jena.mdo.idmt.idmt.*;

import de.jena.service.remote.service.ServiceDescription;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see de.jena.mdo.idmt.idmt.IdmtPackage
 * @generated
 */
public class IdmtAdapterFactory extends AdapterFactoryImpl {
	/**
	 * The cached model package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static IdmtPackage modelPackage;

	/**
	 * Creates an instance of the adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IdmtAdapterFactory() {
		if (modelPackage == null) {
			modelPackage = IdmtPackage.eINSTANCE;
		}
	}

	/**
	 * Returns whether this factory is applicable for the type of the object.
	 * <!-- begin-user-doc -->
	 * This implementation returns <code>true</code> if the object is either the model's package or is an instance object of the model.
	 * <!-- end-user-doc -->
	 * @return whether this factory is applicable for the type of the object.
	 * @generated
	 */
	@Override
	public boolean isFactoryForType(Object object) {
		if (object == modelPackage) {
			return true;
		}
		if (object instanceof EObject) {
			return ((EObject)object).eClass().getEPackage() == modelPackage;
		}
		return false;
	}

	/**
	 * The switch that delegates to the <code>createXXX</code> methods.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected IdmtSwitch<Adapter> modelSwitch =
		new IdmtSwitch<Adapter>() {
			@Override
			public Adapter caseARequest(ARequest object) {
				return createARequestAdapter();
			}
			@Override
			public Adapter caseAResponse(AResponse object) {
				return createAResponseAdapter();
			}
			@Override
			public Adapter caseADryRunResponse(ADryRunResponse object) {
				return createADryRunResponseAdapter();
			}
			@Override
			public Adapter caseAModelConfiguration(AModelConfiguration object) {
				return createAModelConfigurationAdapter();
			}
			@Override
			public Adapter caseAFeatureConfiguration(AFeatureConfiguration object) {
				return createAFeatureConfigurationAdapter();
			}
			@Override
			public Adapter caseAnonymizationService(AnonymizationService object) {
				return createAnonymizationServiceAdapter();
			}
			@Override
			public Adapter caseIDMTModel(IDMTModel object) {
				return createIDMTModelAdapter();
			}
			@Override
			public Adapter caseIDMTFeature(IDMTFeature object) {
				return createIDMTFeatureAdapter();
			}
			@Override
			public Adapter caseRegularizerGrad(RegularizerGrad object) {
				return createRegularizerGradAdapter();
			}
			@Override
			public Adapter caseAnonymizationServiceDescription(AnonymizationServiceDescription object) {
				return createAnonymizationServiceDescriptionAdapter();
			}
			@Override
			public Adapter caseArxModel(ArxModel object) {
				return createArxModelAdapter();
			}
			@Override
			public Adapter caseServiceDescription(ServiceDescription object) {
				return createServiceDescriptionAdapter();
			}
			@Override
			public Adapter defaultCase(EObject object) {
				return createEObjectAdapter();
			}
		};

	/**
	 * Creates an adapter for the <code>target</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param target the object to adapt.
	 * @return the adapter for the <code>target</code>.
	 * @generated
	 */
	@Override
	public Adapter createAdapter(Notifier target) {
		return modelSwitch.doSwitch((EObject)target);
	}


	/**
	 * Creates a new adapter for an object of class '{@link de.jena.mdo.idmt.idmt.ARequest <em>ARequest</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.jena.mdo.idmt.idmt.ARequest
	 * @generated
	 */
	public Adapter createARequestAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.jena.mdo.idmt.idmt.AResponse <em>AResponse</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.jena.mdo.idmt.idmt.AResponse
	 * @generated
	 */
	public Adapter createAResponseAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.jena.mdo.idmt.idmt.ADryRunResponse <em>ADry Run Response</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.jena.mdo.idmt.idmt.ADryRunResponse
	 * @generated
	 */
	public Adapter createADryRunResponseAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.jena.mdo.idmt.idmt.AModelConfiguration <em>AModel Configuration</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.jena.mdo.idmt.idmt.AModelConfiguration
	 * @generated
	 */
	public Adapter createAModelConfigurationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.jena.mdo.idmt.idmt.AFeatureConfiguration <em>AFeature Configuration</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.jena.mdo.idmt.idmt.AFeatureConfiguration
	 * @generated
	 */
	public Adapter createAFeatureConfigurationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.jena.mdo.idmt.idmt.AnonymizationService <em>Anonymization Service</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.jena.mdo.idmt.idmt.AnonymizationService
	 * @generated
	 */
	public Adapter createAnonymizationServiceAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.jena.mdo.idmt.idmt.IDMTModel <em>IDMT Model</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.jena.mdo.idmt.idmt.IDMTModel
	 * @generated
	 */
	public Adapter createIDMTModelAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.jena.mdo.idmt.idmt.IDMTFeature <em>IDMT Feature</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.jena.mdo.idmt.idmt.IDMTFeature
	 * @generated
	 */
	public Adapter createIDMTFeatureAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.jena.mdo.idmt.idmt.RegularizerGrad <em>Regularizer Grad</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.jena.mdo.idmt.idmt.RegularizerGrad
	 * @generated
	 */
	public Adapter createRegularizerGradAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.jena.mdo.idmt.idmt.AnonymizationServiceDescription <em>Anonymization Service Description</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.jena.mdo.idmt.idmt.AnonymizationServiceDescription
	 * @generated
	 */
	public Adapter createAnonymizationServiceDescriptionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.jena.mdo.idmt.idmt.ArxModel <em>Arx Model</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.jena.mdo.idmt.idmt.ArxModel
	 * @generated
	 */
	public Adapter createArxModelAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.jena.service.remote.service.ServiceDescription <em>Description</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.jena.service.remote.service.ServiceDescription
	 * @generated
	 */
	public Adapter createServiceDescriptionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for the default case.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @generated
	 */
	public Adapter createEObjectAdapter() {
		return null;
	}

} //IdmtAdapterFactory
