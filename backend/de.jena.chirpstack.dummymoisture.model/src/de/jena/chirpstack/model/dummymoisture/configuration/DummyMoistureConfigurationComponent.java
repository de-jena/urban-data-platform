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
package de.jena.chirpstack.model.dummymoisture.configuration;

import de.jena.chirpstack.model.dummymoisture.DummyMoistureFactory;
import de.jena.chirpstack.model.dummymoisture.DummyMoisturePackage;

import de.jena.chirpstack.model.dummymoisture.impl.DummyMoisturePackageImpl;

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
@Component(name = "DummyMoistureConfigurator")
@Capability( namespace = "osgi.service", attribute = { "objectClass:List<String>=\"de.jena.chirpstack.model.dummymoisture.util.DummyMoistureResourceFactoryImpl, org.eclipse.emf.ecore.resource.Resource$Factory\"" , "uses:=\"org.eclipse.emf.ecore.resource,de.jena.chirpstack.model.dummymoisture.util\"" })
@Capability( namespace = "osgi.service", attribute = { "objectClass:List<String>=\"de.jena.chirpstack.model.dummymoisture.DummyMoistureFactory, org.eclipse.emf.ecore.EFactory\"" , "uses:=\"org.eclipse.emf.ecore,de.jena.chirpstack.model.dummymoisture\"" })
@Capability( namespace = "osgi.service", attribute = { "objectClass:List<String>=\"de.jena.chirpstack.model.dummymoisture.DummyMoisturePackage, org.eclipse.emf.ecore.EPackage\"" , "uses:=\"org.eclipse.emf.ecore,de.jena.chirpstack.model.dummymoisture\"" })
@Capability( namespace = "osgi.service", attribute = { "objectClass:List<String>=\"org.gecko.emf.osgi.configurator.EPackageConfigurator\"" , "uses:=\"org.eclipse.emf.ecore,de.jena.chirpstack.model.dummymoisture\"" })
@Capability( namespace = "osgi.service", attribute = { "objectClass:List<String>=\"org.osgi.service.condition.Condition\"" , "uses:=org.osgi.service.condition" })
public class DummyMoistureConfigurationComponent {
	
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
		DummyMoisturePackage ePackage = DummyMoisturePackageImpl.eINSTANCE;
		
		
		DummyMoistureEPackageConfigurator packageConfigurator = registerEPackageConfiguratorService(ePackage, ctx);
		registerEPackageService(ePackage, packageConfigurator, ctx);
		registerEFactoryService(ePackage, packageConfigurator, ctx);
		registerConditionService(packageConfigurator, ctx);
	}
	
	/**
	 * Registers the DummyMoistureEPackageConfigurator as a service.
	 *
	 * @generated
	 */
	private DummyMoistureEPackageConfigurator registerEPackageConfiguratorService(DummyMoisturePackage ePackage, BundleContext ctx){
		DummyMoistureEPackageConfigurator packageConfigurator = new DummyMoistureEPackageConfigurator(ePackage);
		// register the EPackageConfigurator
		Hashtable<String, Object> properties = new Hashtable<String, Object>();
		properties.putAll(packageConfigurator.getServiceProperties());
		ePackageConfiguratorRegistration = ctx.registerService(EPackageConfigurator.class, packageConfigurator, properties);

		return packageConfigurator;
	}


	/**
	 * Registers the DummyMoisturePackage as a service.
	 *
	 * @generated
	 */
	private void registerEPackageService(DummyMoisturePackage ePackage, DummyMoistureEPackageConfigurator packageConfigurator, BundleContext ctx){
		Hashtable<String, Object> properties = new Hashtable<String, Object>();
		properties.putAll(packageConfigurator.getServiceProperties());
		String[] serviceClasses = new String[] {DummyMoisturePackage.class.getName(), EPackage.class.getName()};
		packageRegistration = ctx.registerService(serviceClasses, ePackage, properties);
	}

	/**
	 * Registers the DummyMoistureFactory as a service.
	 *
	 * @generated
	 */
	private void registerEFactoryService(DummyMoisturePackage ePackage, DummyMoistureEPackageConfigurator packageConfigurator, BundleContext ctx){
		Hashtable<String, Object> properties = new Hashtable<String, Object>();
		properties.putAll(packageConfigurator.getServiceProperties());
		String[] serviceClasses = new String[] {DummyMoistureFactory.class.getName(), EFactory.class.getName()};
		eFactoryRegistration = ctx.registerService(serviceClasses, ePackage.getDummyMoistureFactory(), properties);
	}

	private void registerConditionService(DummyMoistureEPackageConfigurator packageConfigurator, BundleContext ctx){
		// register the EPackage
		Hashtable<String, Object> properties = new Hashtable<String, Object>();
		properties.putAll(packageConfigurator.getServiceProperties());
		properties.put(Condition.CONDITION_ID, DummyMoisturePackage.eNS_URI);
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
		EPackage.Registry.INSTANCE.remove(DummyMoisturePackage.eNS_URI);
	}
}
