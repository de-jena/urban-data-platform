/*
 */
package de.jena.upd.modelling.ui.api.modellingApi;

import org.eclipse.emf.ecore.EFactory;

import org.osgi.annotation.versioning.ProviderType;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see de.jena.upd.modelling.ui.api.modellingApi.ModellingApiPackage
 * @generated
 */
@ProviderType
public interface ModellingApiFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	ModellingApiFactory eINSTANCE = de.jena.upd.modelling.ui.api.modellingApi.impl.ModellingApiFactoryImpl.init();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	ModellingApiPackage getModellingApiPackage();

} //ModellingApiFactory
