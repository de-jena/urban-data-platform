/*
 */
package de.jena.udp.reference.area.sensinact.model.sensinactrefarea;

import org.eclipse.emf.ecore.EFactory;

import org.osgi.annotation.versioning.ProviderType;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see de.jena.udp.reference.area.sensinact.model.sensinactrefarea.SensinactRefAreaPackage
 * @generated
 */
@ProviderType
public interface SensinactRefAreaFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	SensinactRefAreaFactory eINSTANCE = de.jena.udp.reference.area.sensinact.model.sensinactrefarea.impl.SensinactRefAreaFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Reference Area Provider</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Reference Area Provider</em>'.
	 * @generated
	 */
	ReferenceAreaProvider createReferenceAreaProvider();

	/**
	 * Returns a new object of class '<em>Reference Area</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Reference Area</em>'.
	 * @generated
	 */
	ReferenceArea createReferenceArea();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	SensinactRefAreaPackage getSensinactRefAreaPackage();

} //SensinactRefAreaFactory
