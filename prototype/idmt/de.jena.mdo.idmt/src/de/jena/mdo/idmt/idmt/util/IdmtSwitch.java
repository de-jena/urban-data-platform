/**
 */
package de.jena.mdo.idmt.idmt.util;

import de.jena.mdo.idmt.idmt.*;

import de.jena.service.remote.service.ServiceDescription;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.Switch;

/**
 * <!-- begin-user-doc -->
 * The <b>Switch</b> for the model's inheritance hierarchy.
 * It supports the call {@link #doSwitch(EObject) doSwitch(object)}
 * to invoke the <code>caseXXX</code> method for each class of the model,
 * starting with the actual class of the object
 * and proceeding up the inheritance hierarchy
 * until a non-null result is returned,
 * which is the result of the switch.
 * <!-- end-user-doc -->
 * @see de.jena.mdo.idmt.idmt.IdmtPackage
 * @generated
 */
public class IdmtSwitch<T> extends Switch<T> {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static IdmtPackage modelPackage;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IdmtSwitch() {
		if (modelPackage == null) {
			modelPackage = IdmtPackage.eINSTANCE;
		}
	}

	/**
	 * Checks whether this is a switch for the given package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param ePackage the package in question.
	 * @return whether this is a switch for the given package.
	 * @generated
	 */
	@Override
	protected boolean isSwitchFor(EPackage ePackage) {
		return ePackage == modelPackage;
	}

	/**
	 * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the first non-null result returned by a <code>caseXXX</code> call.
	 * @generated
	 */
	@Override
	protected T doSwitch(int classifierID, EObject theEObject) {
		switch (classifierID) {
			case IdmtPackage.AREQUEST: {
				ARequest aRequest = (ARequest)theEObject;
				T result = caseARequest(aRequest);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case IdmtPackage.ARESPONSE: {
				AResponse aResponse = (AResponse)theEObject;
				T result = caseAResponse(aResponse);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case IdmtPackage.ADRY_RUN_RESPONSE: {
				ADryRunResponse aDryRunResponse = (ADryRunResponse)theEObject;
				T result = caseADryRunResponse(aDryRunResponse);
				if (result == null) result = caseAResponse(aDryRunResponse);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case IdmtPackage.AMODEL_CONFIGURATION: {
				AModelConfiguration aModelConfiguration = (AModelConfiguration)theEObject;
				T result = caseAModelConfiguration(aModelConfiguration);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case IdmtPackage.AFEATURE_CONFIGURATION: {
				AFeatureConfiguration aFeatureConfiguration = (AFeatureConfiguration)theEObject;
				T result = caseAFeatureConfiguration(aFeatureConfiguration);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case IdmtPackage.ANONYMIZATION_SERVICE: {
				AnonymizationService anonymizationService = (AnonymizationService)theEObject;
				T result = caseAnonymizationService(anonymizationService);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case IdmtPackage.IDMT_MODEL: {
				IDMTModel idmtModel = (IDMTModel)theEObject;
				T result = caseIDMTModel(idmtModel);
				if (result == null) result = caseAModelConfiguration(idmtModel);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case IdmtPackage.IDMT_FEATURE: {
				IDMTFeature idmtFeature = (IDMTFeature)theEObject;
				T result = caseIDMTFeature(idmtFeature);
				if (result == null) result = caseAFeatureConfiguration(idmtFeature);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case IdmtPackage.REGULARIZER_GRAD: {
				RegularizerGrad regularizerGrad = (RegularizerGrad)theEObject;
				T result = caseRegularizerGrad(regularizerGrad);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case IdmtPackage.ANONYMIZATION_SERVICE_DESCRIPTION: {
				AnonymizationServiceDescription anonymizationServiceDescription = (AnonymizationServiceDescription)theEObject;
				T result = caseAnonymizationServiceDescription(anonymizationServiceDescription);
				if (result == null) result = caseServiceDescription(anonymizationServiceDescription);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case IdmtPackage.ARX_MODEL: {
				ArxModel arxModel = (ArxModel)theEObject;
				T result = caseArxModel(arxModel);
				if (result == null) result = caseAModelConfiguration(arxModel);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			default: return defaultCase(theEObject);
		}
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>ARequest</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>ARequest</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseARequest(ARequest object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>AResponse</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>AResponse</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAResponse(AResponse object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>ADry Run Response</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>ADry Run Response</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseADryRunResponse(ADryRunResponse object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>AModel Configuration</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>AModel Configuration</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAModelConfiguration(AModelConfiguration object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>AFeature Configuration</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>AFeature Configuration</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAFeatureConfiguration(AFeatureConfiguration object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Anonymization Service</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Anonymization Service</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAnonymizationService(AnonymizationService object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>IDMT Model</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>IDMT Model</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseIDMTModel(IDMTModel object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>IDMT Feature</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>IDMT Feature</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseIDMTFeature(IDMTFeature object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Regularizer Grad</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Regularizer Grad</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRegularizerGrad(RegularizerGrad object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Anonymization Service Description</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Anonymization Service Description</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAnonymizationServiceDescription(AnonymizationServiceDescription object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Arx Model</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Arx Model</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseArxModel(ArxModel object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Description</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Description</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseServiceDescription(ServiceDescription object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch, but this is the last case anyway.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject)
	 * @generated
	 */
	@Override
	public T defaultCase(EObject object) {
		return null;
	}

} //IdmtSwitch
