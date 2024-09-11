/*
 */
package de.jena.service.remote.service;

import org.eclipse.emf.ecore.EFactory;

import org.osgi.annotation.versioning.ProviderType;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see de.jena.service.remote.service.ServicePackage
 * @generated
 */
@ProviderType
public interface ServiceFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	ServiceFactory eINSTANCE = de.jena.service.remote.service.impl.ServiceFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Description</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Description</em>'.
	 * @generated
	 */
	ServiceDescription createServiceDescription();

	/**
	 * Returns a new object of class '<em>Operation Description</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Operation Description</em>'.
	 * @generated
	 */
	ServiceOperationDescription createServiceOperationDescription();

	/**
	 * Returns a new object of class '<em>Discovery Provider Service</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Discovery Provider Service</em>'.
	 * @generated
	 */
	DiscoveryProviderService createDiscoveryProviderService();

	/**
	 * Returns a new object of class '<em>Discovery Consumer Service</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Discovery Consumer Service</em>'.
	 * @generated
	 */
	DiscoveryConsumerService createDiscoveryConsumerService();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	ServicePackage getServicePackage();

} //ServiceFactory
