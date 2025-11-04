/*
 */
package de.jena.reference.area.model.referencearea;

import org.eclipse.emf.ecore.EFactory;

import org.osgi.annotation.versioning.ProviderType;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see de.jena.reference.area.model.referencearea.ReferenceAreaPackage
 * @generated
 */
@ProviderType
public interface ReferenceAreaFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	ReferenceAreaFactory eINSTANCE = de.jena.reference.area.model.referencearea.impl.ReferenceAreaFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Reference Area</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Reference Area</em>'.
	 * @generated
	 */
	ReferenceArea createReferenceArea();

	/**
	 * Returns a new object of class '<em>Collection</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Collection</em>'.
	 * @generated
	 */
	ReferenceAreaCollection createReferenceAreaCollection();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	ReferenceAreaPackage getReferenceAreaPackage();

} //ReferenceAreaFactory
