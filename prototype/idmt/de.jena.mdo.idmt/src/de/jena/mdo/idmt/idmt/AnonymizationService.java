/*
 */
package de.jena.mdo.idmt.idmt;

import org.eclipse.emf.ecore.EObject;

import org.osgi.annotation.versioning.ProviderType;

import org.osgi.util.promise.Promise;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Anonymization Service</b></em>'.
 * <!-- end-user-doc -->
 *
 *
 * @see de.jena.mdo.idmt.idmt.IdmtPackage#getAnonymizationService()
 * @model interface="true" abstract="true"
 * @generated
 */
@ProviderType
public interface AnonymizationService extends EObject {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Return a best guessing for the runtime of this anonymization process. This method returns immediatly.
	 * 
	 * Request Topic:
	 * <prefix>/anonymization/dryRun/req
	 * Response Topic:
	 * <prefix>/anonymization/dryRun/resp
	 * <!-- end-model-doc -->
	 * @model required="true" requestRequired="true"
	 *        annotation="Service requestUri='${prefix}/anonymization/dryRun/req/${providerId}' responseUri='${prefix}/anonymization/dryRun/resp/${consumerId}/${requestId}'"
	 * @generated
	 */
	ADryRunResponse doAnonymizationDryRun(ARequest request);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Executes an anonymization process synchronously. This call is blocking and only returns once the execution finished. Even on error this method returns a result, that contains the corresponding error information.
	 * 
	 * Request Topic:
	 * <prefix>/anonymization/sync/req
	 * Response Topic:
	 * <prefix>/anonymization/sync/resp
	 * <!-- end-model-doc -->
	 * @model required="true" requestRequired="true"
	 *        annotation="Service requestUri='${prefix}/anonymization/sync/req/${providerId}' responseUri='${prefix}/anonymization/sync/resp/${consumerId}/${requestId}'"
	 * @generated
	 */
	AResponse doAnonymization(ARequest request);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Executes an anonymization process asynchronously. This call is non-blocking and returns immediately with a promise. Once the execution is finished, the promise resolves with the result. If an error occurs this method also resolves with  a result, that contains the corresponding error information.
	 * 
	 * Request Topic:
	 * <prefix>/anonymization/async/req
	 * Response Topic:
	 * <prefix>/anonymization/async/resp
	 * <!-- end-model-doc -->
	 * @model dataType="de.jena.mdo.idmt.idmt.ResultPromise&lt;de.jena.mdo.idmt.idmt.AResponse&gt;" required="true" requestRequired="true"
	 *        annotation="Service requestUri='${prefix}/anonymization/async/req/${providerId}' responseUri='${prefix}/anonymization/async/resp/${consumerId}/${requestId}'"
	 * @generated
	 */
	Promise<AResponse> doAnonymizationAsync(ARequest request);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Executes an anonymization process asynchronously. This call is non-blocking and returns immediately with a result object. The response object contains intermediate information. These information can be used to get the current request status, using the corresponding operation.
	 * 
	 * Request Topic:
	 * <prefix>/anonymization/immediate/req
	 * Response Topic:
	 * <prefix>/anonymization/immediate/resp
	 * <!-- end-model-doc -->
	 * @model required="true" requestRequired="true"
	 *        annotation="Service requestUri='${prefix}/anonymization/immediate/req/${providerId}' responseUri='${prefix}/anonymization/immediate/resp/${consumerId}/${requestId}'"
	 * @generated
	 */
	AResponse doAnonymizationImmediateAsync(ARequest request);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Cancels a current request. The response is returned as soon as cancellation was executed either successfully or not.
	 * 
	 * Topic:
	 * <prefix>/anonymization/immediate/cancel
	 * <!-- end-model-doc -->
	 * @model dataType="de.jena.mdo.idmt.idmt.ResultPromise&lt;de.jena.mdo.idmt.idmt.AResponse&gt;" providerIdRequired="true" requestIdRequired="true"
	 *        annotation="Service requestUri='${prefix}/anonymization/cancel/${providerId}/${requestId}'"
	 * @generated
	 */
	Promise<AResponse> cancelRequest(String providerId, String requestId);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * When a immediate asynchronous call was executed a result is returned immediately even if the operation is still in progress. The get information about the running operation, this method can be called.
	 * 
	 * Topic:
	 * <prefix>/anonymization/immediate/status
	 * <!-- end-model-doc -->
	 * @model requestRequired="true"
	 *        annotation="Service responseUri='${prefix}/anonymization/status/${consumerId}/${requestId}'"
	 * @generated
	 */
	AResponse getRequestStatus(ARequest request);

} // AnonymizationService
