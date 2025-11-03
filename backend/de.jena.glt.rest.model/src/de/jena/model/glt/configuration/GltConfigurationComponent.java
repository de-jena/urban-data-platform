/*
 * Copyright (c) 2012 - 2025 Data In Motion and others.
 * All rights reserved. 
 * 
 * This program and the accompanying materials are made
 * available under the terms of the Eclipse Public License 2.0
 * which is available at https://www.eclipse.org/legal/epl-2.0/
 * 
 * SPDX-License-Identifier: EPL-2.0
 * 
 * Contributors:
 *     Data In Motion - initial API and implementation
 */
package de.jena.model.glt.configuration;

import de.jena.model.glt.GltFactory;
import de.jena.model.glt.GltPackage;

import de.jena.model.glt.impl.GltPackageImpl;

import java.util.Hashtable;

import org.eclipse.emf.ecore.EFactory;
import org.eclipse.emf.ecore.EPackage;

import org.gecko.emf.osgi.configurator.EPackageConfigurator;

import org.osgi.annotation.bundle.Capability;

import org.osgi.framework.BundleContext;
import org.osgi.framework.ServiceRegistration;

import org.osgi.service.component.annotations.Activate;
import org.osgi.service.component.annotations.Component;
import org.osgi.service.component.annotations.Deactivate;

import org.osgi.service.condition.Condition;
/**
 * The <b>PackageConfiguration</b> for the model.
 * The package will be registered into a OSGi base model registry.
 * 
 * @generated
 */
@Component(name = "GltConfigurator")
@Capability( namespace = "osgi.service", attribute = { "objectClass:List<String>=\"de.jena.model.glt.util.GltResourceFactoryImpl, org.eclipse.emf.ecore.resource.Resource$Factory\"" , "uses:=\"org.eclipse.emf.ecore.resource,de.jena.model.glt.util\"" })
@Capability( namespace = "osgi.service", attribute = { "objectClass:List<String>=\"de.jena.model.glt.GltFactory, org.eclipse.emf.ecore.EFactory\"" , "uses:=\"org.eclipse.emf.ecore,de.jena.model.glt\"" })
@Capability( namespace = "osgi.service", attribute = { "objectClass:List<String>=\"de.jena.model.glt.GltPackage, org.eclipse.emf.ecore.EPackage\"" , "uses:=\"org.eclipse.emf.ecore,de.jena.model.glt\"" })
@Capability( namespace = "osgi.service", attribute = { "objectClass:List<String>=\"org.gecko.emf.osgi.configurator.EPackageConfigurator\"" , "uses:=\"org.eclipse.emf.ecore,de.jena.model.glt\"" })
@Capability( namespace = "osgi.service", attribute = { "objectClass:List<String>=\"org.osgi.service.condition.Condition\"" , "uses:=org.osgi.service.condition" })
public class GltConfigurationComponent {
	
	private ServiceRegistration<?> packageRegistration = null;
	private ServiceRegistration<EPackageConfigurator> ePackageConfiguratorRegistration = null;
	private ServiceRegistration<?> eFactoryRegistration = null;
	private ServiceRegistration<?> conditionRegistration = null;

	/**
	 * Activates the Configuration Component.
	 *
	 * @generated
	 */
	@Activate
	public void activate(BundleContext ctx) {
		GltPackage ePackage = GltPackageImpl.eINSTANCE;
		
		// Intialize by is activated. This the package loads the included ecore of the package instead of having the generated code for the package.
		// The references in the Literals interface are assigned lazy using the default registry. If The Bundle was stopped, the Component has been 
		// deactivated and thus the model has been removed, but the Classes not unloaded. Long story short: If we don't do this, calls 
		// on GltPackage references can cause NullPointerExceptions and a lot of questionmarks.
		if(!EPackage.Registry.INSTANCE.containsKey(GltPackage.eNS_URI)){
			EPackage.Registry.INSTANCE.put(GltPackage.eNS_URI, ePackage);
		}
		
		GltEPackageConfigurator packageConfigurator = registerEPackageConfiguratorService(ePackage, ctx);
		registerEPackageService(ePackage, packageConfigurator, ctx);
		registerEFactoryService(ePackage, packageConfigurator, ctx);
		registerConditionService(packageConfigurator, ctx);
	}
	
	/**
	 * Registers the GltEPackageConfigurator as a service.
	 *
	 * @generated
	 */
	private GltEPackageConfigurator registerEPackageConfiguratorService(GltPackage ePackage, BundleContext ctx){
		GltEPackageConfigurator packageConfigurator = new GltEPackageConfigurator(ePackage);
		// register the EPackageConfigurator
		Hashtable<String, Object> properties = new Hashtable<String, Object>();
		properties.putAll(packageConfigurator.getServiceProperties());
		ePackageConfiguratorRegistration = ctx.registerService(EPackageConfigurator.class, packageConfigurator, properties);

		return packageConfigurator;
	}


	/**
	 * Registers the GltPackage as a service.
	 *
	 * @generated
	 */
	private void registerEPackageService(GltPackage ePackage, GltEPackageConfigurator packageConfigurator, BundleContext ctx){
		Hashtable<String, Object> properties = new Hashtable<String, Object>();
		properties.putAll(packageConfigurator.getServiceProperties());
		String[] serviceClasses = new String[] {GltPackage.class.getName(), EPackage.class.getName()};
		packageRegistration = ctx.registerService(serviceClasses, ePackage, properties);
	}

	/**
	 * Registers the GltFactory as a service.
	 *
	 * @generated
	 */
	private void registerEFactoryService(GltPackage ePackage, GltEPackageConfigurator packageConfigurator, BundleContext ctx){
		Hashtable<String, Object> properties = new Hashtable<String, Object>();
		properties.putAll(packageConfigurator.getServiceProperties());
		String[] serviceClasses = new String[] {GltFactory.class.getName(), EFactory.class.getName()};
		eFactoryRegistration = ctx.registerService(serviceClasses, ePackage.getGltFactory(), properties);
	}

	private void registerConditionService(GltEPackageConfigurator packageConfigurator, BundleContext ctx){
		// register the EPackage
		Hashtable<String, Object> properties = new Hashtable<String, Object>();
		properties.putAll(packageConfigurator.getServiceProperties());
		properties.put(Condition.CONDITION_ID, GltPackage.eNS_URI);
		conditionRegistration = ctx.registerService(Condition.class, Condition.INSTANCE, properties);
	}

	/**
	 * Deactivates and unregisters everything.
	 *
	 * @generated
	 */
	@Deactivate
	public void deactivate() {
		conditionRegistration.unregister();
		eFactoryRegistration.unregister();
		packageRegistration.unregister();

		ePackageConfiguratorRegistration.unregister();
		EPackage.Registry.INSTANCE.remove(GltPackage.eNS_URI);
	}
}
