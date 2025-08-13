/*
 */
package de.jena.chirpstack.model.dummymoisture.configuration;

import de.jena.chirpstack.model.dummymoisture.DummyMoisturePackage;

import java.util.HashMap;
import java.util.Map;

import org.gecko.emf.osgi.configurator.EPackageConfigurator;

import org.gecko.emf.osgi.constants.EMFNamespaces;

/**
 * <!-- begin-user-doc -->
 * The <b>EPackageConfiguration</b> and <b>ResourceFactoryConfigurator</b> for the model.
 * The package will be registered into a OSGi base model registry.
 * <!-- end-user-doc -->
 * @see EPackageConfigurator
 * @generated
 */
public class DummyMoistureEPackageConfigurator implements EPackageConfigurator {
	
	private DummyMoisturePackage ePackage;

	protected DummyMoistureEPackageConfigurator(DummyMoisturePackage ePackage){
		this.ePackage = ePackage;
	}
	
	/**
	 * (non-Javadoc)
	 * @see org.gecko.emf.osgi.EPackageRegistryConfigurator#configureEPackage(org.eclipse.emf.ecore.EPackage.Registry)
	 * @generated
	 */
	@Override
	public void configureEPackage(org.eclipse.emf.ecore.EPackage.Registry registry) {
		registry.put(DummyMoisturePackage.eNS_URI, ePackage);
	}
	
	/**
	 * (non-Javadoc)
	 * @see org.gecko.emf.osgi.EPackageRegistryConfigurator#unconfigureEPackage(org.eclipse.emf.ecore.EPackage.Registry)
	 * @generated
	 */
	@Override
	public void unconfigureEPackage(org.eclipse.emf.ecore.EPackage.Registry registry) {
		registry.remove(DummyMoisturePackage.eNS_URI);
	}
	
	/**
	 * A method providing the Properties the services around this Model should be registered with.
	 * @generated
	 */
	public Map<String, Object> getServiceProperties() {
		Map<String, Object> properties = new HashMap<String, Object>();
		properties.put(EMFNamespaces.EMF_MODEL_NAME, DummyMoisturePackage.eNAME);
		properties.put(EMFNamespaces.EMF_MODEL_NSURI, DummyMoisturePackage.eNS_URI);
		properties.put(EMFNamespaces.EMF_MODEL_FILE_EXT, "dummymoisture");
		properties.put(EMFNamespaces.EMF_MODEL_VERSION, "1.0");
		return properties;
	}
}