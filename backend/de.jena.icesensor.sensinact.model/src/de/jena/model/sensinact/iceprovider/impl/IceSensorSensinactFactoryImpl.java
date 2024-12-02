/**
 * Copyright (c) 2012 - 2024 Data In Motion and others.
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
package de.jena.model.sensinact.iceprovider.impl;

import de.jena.model.sensinact.iceprovider.*;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class IceSensorSensinactFactoryImpl extends EFactoryImpl implements IceSensorSensinactFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static IceSensorSensinactFactory init() {
		try {
			IceSensorSensinactFactory theIceSensorSensinactFactory = (IceSensorSensinactFactory)EPackage.Registry.INSTANCE.getEFactory(IceSensorSensinactPackage.eNS_URI);
			if (theIceSensorSensinactFactory != null) {
				return theIceSensorSensinactFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new IceSensorSensinactFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IceSensorSensinactFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
			case IceSensorSensinactPackage.ICE_SENSOR: return createIceSensor();
			case IceSensorSensinactPackage.SENSOR_DATA: return createSensorData();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public IceSensor createIceSensor() {
		IceSensorImpl iceSensor = new IceSensorImpl();
		return iceSensor;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public SensorData createSensorData() {
		SensorDataImpl sensorData = new SensorDataImpl();
		return sensorData;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public IceSensorSensinactPackage getIceSensorSensinactPackage() {
		return (IceSensorSensinactPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static IceSensorSensinactPackage getPackage() {
		return IceSensorSensinactPackage.eINSTANCE;
	}

} //IceSensorSensinactFactoryImpl
