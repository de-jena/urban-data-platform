/*
 */
package de.jena.service.remote.service;

import org.eclipse.emf.ecore.EObject;

import org.osgi.annotation.versioning.ProviderType;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Discovery Provider Service</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Method to announce a service providing a service description and a corresponding service lifecycle. This needs to implemented by a service provider.
 * 
 * New service description or their changes or removals should published to topic
 * <prefix>/services
 * <!-- end-model-doc -->
 *
 *
 * @see de.jena.service.remote.service.ServicePackage#getDiscoveryProviderService()
 * @model
 * @generated
 */
@ProviderType
public interface DiscoveryProviderService extends EObject {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model descriptionRequired="true"
	 * @generated
	 */
	void announce(ServiceDescription description);

} // DiscoveryProviderService
