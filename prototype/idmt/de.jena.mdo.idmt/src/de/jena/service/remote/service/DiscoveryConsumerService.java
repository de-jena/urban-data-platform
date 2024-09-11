/*
 */
package de.jena.service.remote.service;

import org.eclipse.emf.ecore.EObject;

import org.osgi.annotation.versioning.ProviderType;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Discovery Consumer Service</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * The consumer side to retrieve a service description. Service consumer implement this interface, to listen for service changes.
 * 
 * Consumers should listen to topic:
 * <prefix>/services
 * to get informed about service descriptions
 * <!-- end-model-doc -->
 *
 *
 * @see de.jena.service.remote.service.ServicePackage#getDiscoveryConsumerService()
 * @model
 * @generated
 */
@ProviderType
public interface DiscoveryConsumerService extends EObject {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model descriptionRequired="true"
	 * @generated
	 */
	void onServiceAnnounced(ServiceDescription description);

} // DiscoveryConsumerService
