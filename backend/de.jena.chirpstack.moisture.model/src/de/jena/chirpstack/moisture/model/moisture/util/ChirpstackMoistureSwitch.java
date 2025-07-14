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
package de.jena.chirpstack.moisture.model.moisture.util;

import de.jena.chirpstack.moisture.model.moisture.*;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.Switch;

import org.eclipse.sensinact.model.core.provider.Admin;
import org.eclipse.sensinact.model.core.provider.Provider;
import org.eclipse.sensinact.model.core.provider.Service;

/**
 * <!-- begin-user-doc -->
 * The <b>Switch</b> for the model's inheritance hierarchy.
 * It supports the call {@link #doSwitch(EObject) doSwitch(object)}
 * to invoke the <code>caseXXX</code> method for each class of the model,
 * starting with the actual class of the object
 * and proceeding up the inheritance hierarchy
 * until a non-null result is returned,
 * which is the result of the switch.
 * <!-- end-user-doc -->
 * @see de.jena.chirpstack.moisture.model.moisture.ChirpstackMoisturePackage
 * @generated
 */
public class ChirpstackMoistureSwitch<T> extends Switch<T> {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static ChirpstackMoisturePackage modelPackage;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ChirpstackMoistureSwitch() {
		if (modelPackage == null) {
			modelPackage = ChirpstackMoisturePackage.eINSTANCE;
		}
	}

	/**
	 * Checks whether this is a switch for the given package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param ePackage the package in question.
	 * @return whether this is a switch for the given package.
	 * @generated
	 */
	@Override
	protected boolean isSwitchFor(EPackage ePackage) {
		return ePackage == modelPackage;
	}

	/**
	 * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the first non-null result returned by a <code>caseXXX</code> call.
	 * @generated
	 */
	@Override
	protected T doSwitch(int classifierID, EObject theEObject) {
		switch (classifierID) {
			case ChirpstackMoisturePackage.DRAGINO: {
				Dragino dragino = (Dragino)theEObject;
				T result = caseDragino(dragino);
				if (result == null) result = caseProvider(dragino);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ChirpstackMoisturePackage.SENSOR: {
				Sensor sensor = (Sensor)theEObject;
				T result = caseSensor(sensor);
				if (result == null) result = caseService(sensor);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ChirpstackMoisturePackage.SOIL: {
				Soil soil = (Soil)theEObject;
				T result = caseSoil(soil);
				if (result == null) result = caseService(soil);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ChirpstackMoisturePackage.DEVICE: {
				Device device = (Device)theEObject;
				T result = caseDevice(device);
				if (result == null) result = caseService(device);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ChirpstackMoisturePackage.MOISTURE_SENSOR: {
				MoistureSensor moistureSensor = (MoistureSensor)theEObject;
				T result = caseMoistureSensor(moistureSensor);
				if (result == null) result = caseProvider(moistureSensor);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ChirpstackMoisturePackage.MOISTURE_STATUS: {
				MoistureStatus moistureStatus = (MoistureStatus)theEObject;
				T result = caseMoistureStatus(moistureStatus);
				if (result == null) result = caseService(moistureStatus);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ChirpstackMoisturePackage.MOISTURE_ADMIN: {
				MoistureAdmin moistureAdmin = (MoistureAdmin)theEObject;
				T result = caseMoistureAdmin(moistureAdmin);
				if (result == null) result = caseAdmin(moistureAdmin);
				if (result == null) result = caseService(moistureAdmin);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ChirpstackMoisturePackage.SENSE_CAP: {
				SenseCap senseCap = (SenseCap)theEObject;
				T result = caseSenseCap(senseCap);
				if (result == null) result = caseProvider(senseCap);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ChirpstackMoisturePackage.SENSE_CAP2: {
				SenseCap2 senseCap2 = (SenseCap2)theEObject;
				T result = caseSenseCap2(senseCap2);
				if (result == null) result = caseProvider(senseCap2);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ChirpstackMoisturePackage.SENSE_CAP3: {
				SenseCap3 senseCap3 = (SenseCap3)theEObject;
				T result = caseSenseCap3(senseCap3);
				if (result == null) result = caseProvider(senseCap3);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ChirpstackMoisturePackage.AIR: {
				Air air = (Air)theEObject;
				T result = caseAir(air);
				if (result == null) result = caseService(air);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ChirpstackMoisturePackage.RAIN: {
				Rain rain = (Rain)theEObject;
				T result = caseRain(rain);
				if (result == null) result = caseService(rain);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ChirpstackMoisturePackage.LIGHT: {
				Light light = (Light)theEObject;
				T result = caseLight(light);
				if (result == null) result = caseService(light);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ChirpstackMoisturePackage.TEKTELIC: {
				TEKTELIC tektelic = (TEKTELIC)theEObject;
				T result = caseTEKTELIC(tektelic);
				if (result == null) result = caseProvider(tektelic);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ChirpstackMoisturePackage.TSOIL: {
				TSoil tSoil = (TSoil)theEObject;
				T result = caseTSoil(tSoil);
				if (result == null) result = caseService(tSoil);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ChirpstackMoisturePackage.EM310: {
				EM310 em310 = (EM310)theEObject;
				T result = caseEM310(em310);
				if (result == null) result = caseProvider(em310);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ChirpstackMoisturePackage.TRASH: {
				Trash trash = (Trash)theEObject;
				T result = caseTrash(trash);
				if (result == null) result = caseService(trash);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ChirpstackMoisturePackage.SN50: {
				SN50 sn50 = (SN50)theEObject;
				T result = caseSN50(sn50);
				if (result == null) result = caseProvider(sn50);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ChirpstackMoisturePackage.SN: {
				SN sn = (SN)theEObject;
				T result = caseSN(sn);
				if (result == null) result = caseService(sn);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			default: return defaultCase(theEObject);
		}
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Dragino</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Dragino</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDragino(Dragino object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Sensor</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Sensor</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSensor(Sensor object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Soil</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Soil</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSoil(Soil object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Device</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Device</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDevice(Device object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Moisture Sensor</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Moisture Sensor</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMoistureSensor(MoistureSensor object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Moisture Status</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Moisture Status</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMoistureStatus(MoistureStatus object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Moisture Admin</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Moisture Admin</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMoistureAdmin(MoistureAdmin object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Sense Cap</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Sense Cap</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSenseCap(SenseCap object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Sense Cap2</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Sense Cap2</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSenseCap2(SenseCap2 object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Sense Cap3</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Sense Cap3</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSenseCap3(SenseCap3 object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Air</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Air</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAir(Air object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Rain</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Rain</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRain(Rain object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Light</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Light</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseLight(Light object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>TEKTELIC</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>TEKTELIC</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTEKTELIC(TEKTELIC object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>TSoil</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>TSoil</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTSoil(TSoil object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>EM310</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>EM310</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseEM310(EM310 object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Trash</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Trash</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTrash(Trash object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>SN50</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>SN50</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSN50(SN50 object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>SN</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>SN</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSN(SN object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Provider</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Provider</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseProvider(Provider object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Service</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Service</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseService(Service object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Admin</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Admin</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAdmin(Admin object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch, but this is the last case anyway.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject)
	 * @generated
	 */
	@Override
	public T defaultCase(EObject object) {
		return null;
	}

} //ChirpstackMoistureSwitch
