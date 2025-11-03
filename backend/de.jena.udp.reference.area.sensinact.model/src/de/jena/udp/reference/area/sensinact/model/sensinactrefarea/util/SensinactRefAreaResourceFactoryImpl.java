/*
 */
package de.jena.udp.reference.area.sensinact.model.sensinactrefarea.util;

import de.jena.udp.reference.area.sensinact.model.sensinactrefarea.SensinactRefAreaPackage;

import java.util.HashMap;
import java.util.Map;

import org.eclipse.emf.common.util.URI;

import org.eclipse.emf.ecore.resource.Resource;

import org.eclipse.emf.ecore.resource.impl.ResourceFactoryImpl;

import org.gecko.emf.osgi.constants.EMFNamespaces;

/**
 * <!-- begin-user-doc -->
 * The <b>Resource Factory</b> associated with the package.
 * <!-- end-user-doc -->
 * @see de.jena.udp.reference.area.sensinact.model.sensinactrefarea.util.SensinactRefAreaResourceImpl
 * @generated
 */
public class SensinactRefAreaResourceFactoryImpl extends ResourceFactoryImpl {
	/**
	 * Creates an instance of the resource factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SensinactRefAreaResourceFactoryImpl() {
		super();
	}

	/**
	 * Creates an instance of the resource.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Resource createResource(URI uri) {
		Resource result = new SensinactRefAreaResourceImpl(uri);
		return result;
	}

	/**
	 * A method providing the Properties the services around this ResourceFactory should be registered with.
	 * @generated
	 */
	public Map<String, Object> getServiceProperties() {
		Map<String, Object> properties = new HashMap<String, Object>();
		properties.put(EMFNamespaces.EMF_CONFIGURATOR_NAME, SensinactRefAreaPackage.eNAME);
		properties.put(EMFNamespaces.EMF_MODEL_FILE_EXT, "sensinactrefarea");
		properties.put(EMFNamespaces.EMF_MODEL_VERSION, "1.0");
		return properties;
	}

} //SensinactRefAreaResourceFactoryImpl
