/**
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
package de.jena.chirpstack.model.chirpstack.util;

import de.jena.chirpstack.model.chirpstack.*;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

import org.eclipse.sensinact.model.core.provider.Provider;
import org.eclipse.sensinact.model.core.provider.Service;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see de.jena.chirpstack.model.chirpstack.ChirpstackPackage
 * @generated
 */
public class ChirpstackAdapterFactory extends AdapterFactoryImpl {
	/**
	 * The cached model package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static ChirpstackPackage modelPackage;

	/**
	 * Creates an instance of the adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ChirpstackAdapterFactory() {
		if (modelPackage == null) {
			modelPackage = ChirpstackPackage.eINSTANCE;
		}
	}

	/**
	 * Returns whether this factory is applicable for the type of the object.
	 * <!-- begin-user-doc -->
	 * This implementation returns <code>true</code> if the object is either the model's package or is an instance object of the model.
	 * <!-- end-user-doc -->
	 * @return whether this factory is applicable for the type of the object.
	 * @generated
	 */
	@Override
	public boolean isFactoryForType(Object object) {
		if (object == modelPackage) {
			return true;
		}
		if (object instanceof EObject) {
			return ((EObject)object).eClass().getEPackage() == modelPackage;
		}
		return false;
	}

	/**
	 * The switch that delegates to the <code>createXXX</code> methods.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ChirpstackSwitch<Adapter> modelSwitch =
		new ChirpstackSwitch<Adapter>() {
			@Override
			public Adapter caseDragino(Dragino object) {
				return createDraginoAdapter();
			}
			@Override
			public Adapter caseSensor(Sensor object) {
				return createSensorAdapter();
			}
			@Override
			public Adapter caseSoil(Soil object) {
				return createSoilAdapter();
			}
			@Override
			public Adapter caseDevice(Device object) {
				return createDeviceAdapter();
			}
			@Override
			public Adapter caseSenseCapS2120(SenseCapS2120 object) {
				return createSenseCapS2120Adapter();
			}
			@Override
			public Adapter caseSenseCapS2105(SenseCapS2105 object) {
				return createSenseCapS2105Adapter();
			}
			@Override
			public Adapter caseSenseCap(SenseCap object) {
				return createSenseCapAdapter();
			}
			@Override
			public Adapter caseAir(Air object) {
				return createAirAdapter();
			}
			@Override
			public Adapter caseRain(Rain object) {
				return createRainAdapter();
			}
			@Override
			public Adapter caseLight(Light object) {
				return createLightAdapter();
			}
			@Override
			public Adapter caseTEKTELIC(TEKTELIC object) {
				return createTEKTELICAdapter();
			}
			@Override
			public Adapter caseTSoil(TSoil object) {
				return createTSoilAdapter();
			}
			@Override
			public Adapter caseEM310(EM310 object) {
				return createEM310Adapter();
			}
			@Override
			public Adapter caseTrash(Trash object) {
				return createTrashAdapter();
			}
			@Override
			public Adapter caseSN50(SN50 object) {
				return createSN50Adapter();
			}
			@Override
			public Adapter caseSN(SN object) {
				return createSNAdapter();
			}
			@Override
			public Adapter caseSolidosTeros21(SolidosTeros21 object) {
				return createSolidosTeros21Adapter();
			}
			@Override
			public Adapter caseTeros21(Teros21 object) {
				return createTeros21Adapter();
			}
			@Override
			public Adapter caseProvider(Provider object) {
				return createProviderAdapter();
			}
			@Override
			public Adapter caseService(Service object) {
				return createServiceAdapter();
			}
			@Override
			public Adapter defaultCase(EObject object) {
				return createEObjectAdapter();
			}
		};

	/**
	 * Creates an adapter for the <code>target</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param target the object to adapt.
	 * @return the adapter for the <code>target</code>.
	 * @generated
	 */
	@Override
	public Adapter createAdapter(Notifier target) {
		return modelSwitch.doSwitch((EObject)target);
	}


	/**
	 * Creates a new adapter for an object of class '{@link de.jena.chirpstack.model.chirpstack.Dragino <em>Dragino</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.jena.chirpstack.model.chirpstack.Dragino
	 * @generated
	 */
	public Adapter createDraginoAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.jena.chirpstack.model.chirpstack.Sensor <em>Sensor</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.jena.chirpstack.model.chirpstack.Sensor
	 * @generated
	 */
	public Adapter createSensorAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.jena.chirpstack.model.chirpstack.Soil <em>Soil</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.jena.chirpstack.model.chirpstack.Soil
	 * @generated
	 */
	public Adapter createSoilAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.jena.chirpstack.model.chirpstack.Device <em>Device</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.jena.chirpstack.model.chirpstack.Device
	 * @generated
	 */
	public Adapter createDeviceAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.jena.chirpstack.model.chirpstack.SenseCapS2120 <em>Sense Cap S2120</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.jena.chirpstack.model.chirpstack.SenseCapS2120
	 * @generated
	 */
	public Adapter createSenseCapS2120Adapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.jena.chirpstack.model.chirpstack.SenseCapS2105 <em>Sense Cap S2105</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.jena.chirpstack.model.chirpstack.SenseCapS2105
	 * @generated
	 */
	public Adapter createSenseCapS2105Adapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.jena.chirpstack.model.chirpstack.SenseCap <em>Sense Cap</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.jena.chirpstack.model.chirpstack.SenseCap
	 * @generated
	 */
	public Adapter createSenseCapAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.jena.chirpstack.model.chirpstack.Air <em>Air</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.jena.chirpstack.model.chirpstack.Air
	 * @generated
	 */
	public Adapter createAirAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.jena.chirpstack.model.chirpstack.Rain <em>Rain</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.jena.chirpstack.model.chirpstack.Rain
	 * @generated
	 */
	public Adapter createRainAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.jena.chirpstack.model.chirpstack.Light <em>Light</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.jena.chirpstack.model.chirpstack.Light
	 * @generated
	 */
	public Adapter createLightAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.jena.chirpstack.model.chirpstack.TEKTELIC <em>TEKTELIC</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.jena.chirpstack.model.chirpstack.TEKTELIC
	 * @generated
	 */
	public Adapter createTEKTELICAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.jena.chirpstack.model.chirpstack.TSoil <em>TSoil</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.jena.chirpstack.model.chirpstack.TSoil
	 * @generated
	 */
	public Adapter createTSoilAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.jena.chirpstack.model.chirpstack.EM310 <em>EM310</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.jena.chirpstack.model.chirpstack.EM310
	 * @generated
	 */
	public Adapter createEM310Adapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.jena.chirpstack.model.chirpstack.Trash <em>Trash</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.jena.chirpstack.model.chirpstack.Trash
	 * @generated
	 */
	public Adapter createTrashAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.jena.chirpstack.model.chirpstack.SN50 <em>SN50</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.jena.chirpstack.model.chirpstack.SN50
	 * @generated
	 */
	public Adapter createSN50Adapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.jena.chirpstack.model.chirpstack.SN <em>SN</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.jena.chirpstack.model.chirpstack.SN
	 * @generated
	 */
	public Adapter createSNAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.jena.chirpstack.model.chirpstack.SolidosTeros21 <em>Solidos Teros21</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.jena.chirpstack.model.chirpstack.SolidosTeros21
	 * @generated
	 */
	public Adapter createSolidosTeros21Adapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.jena.chirpstack.model.chirpstack.Teros21 <em>Teros21</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.jena.chirpstack.model.chirpstack.Teros21
	 * @generated
	 */
	public Adapter createTeros21Adapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.sensinact.model.core.provider.Provider <em>Provider</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.sensinact.model.core.provider.Provider
	 * @generated
	 */
	public Adapter createProviderAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.sensinact.model.core.provider.Service <em>Service</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.sensinact.model.core.provider.Service
	 * @generated
	 */
	public Adapter createServiceAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for the default case.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @generated
	 */
	public Adapter createEObjectAdapter() {
		return null;
	}

} //ChirpstackAdapterFactory
