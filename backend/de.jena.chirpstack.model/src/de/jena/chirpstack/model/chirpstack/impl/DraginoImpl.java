/*
 */
package de.jena.chirpstack.model.chirpstack.impl;

import de.jena.chirpstack.model.chirpstack.ChirpstackPackage;
import de.jena.chirpstack.model.chirpstack.Device;
import de.jena.chirpstack.model.chirpstack.Dragino;
import de.jena.chirpstack.model.chirpstack.Sensor;
import de.jena.chirpstack.model.chirpstack.Soil;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.sensinact.model.core.provider.impl.ProviderImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Dragino</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link de.jena.chirpstack.model.chirpstack.impl.DraginoImpl#getSensor <em>Sensor</em>}</li>
 *   <li>{@link de.jena.chirpstack.model.chirpstack.impl.DraginoImpl#getSoil <em>Soil</em>}</li>
 *   <li>{@link de.jena.chirpstack.model.chirpstack.impl.DraginoImpl#getDevice <em>Device</em>}</li>
 * </ul>
 *
 * @generated
 */
public class DraginoImpl extends ProviderImpl implements Dragino {
	/**
	 * The cached value of the '{@link #getSensor() <em>Sensor</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSensor()
	 * @generated
	 * @ordered
	 */
	protected Sensor sensor;

	/**
	 * The cached value of the '{@link #getSoil() <em>Soil</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSoil()
	 * @generated
	 * @ordered
	 */
	protected Soil soil;

	/**
	 * The cached value of the '{@link #getDevice() <em>Device</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDevice()
	 * @generated
	 * @ordered
	 */
	protected Device device;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DraginoImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ChirpstackPackage.Literals.DRAGINO;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Sensor getSensor() {
		return sensor;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSensor(Sensor newSensor, NotificationChain msgs) {
		Sensor oldSensor = sensor;
		sensor = newSensor;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ChirpstackPackage.DRAGINO__SENSOR, oldSensor, newSensor);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setSensor(Sensor newSensor) {
		if (newSensor != sensor) {
			NotificationChain msgs = null;
			if (sensor != null)
				msgs = ((InternalEObject)sensor).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ChirpstackPackage.DRAGINO__SENSOR, null, msgs);
			if (newSensor != null)
				msgs = ((InternalEObject)newSensor).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ChirpstackPackage.DRAGINO__SENSOR, null, msgs);
			msgs = basicSetSensor(newSensor, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ChirpstackPackage.DRAGINO__SENSOR, newSensor, newSensor));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Soil getSoil() {
		return soil;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSoil(Soil newSoil, NotificationChain msgs) {
		Soil oldSoil = soil;
		soil = newSoil;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ChirpstackPackage.DRAGINO__SOIL, oldSoil, newSoil);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setSoil(Soil newSoil) {
		if (newSoil != soil) {
			NotificationChain msgs = null;
			if (soil != null)
				msgs = ((InternalEObject)soil).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ChirpstackPackage.DRAGINO__SOIL, null, msgs);
			if (newSoil != null)
				msgs = ((InternalEObject)newSoil).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ChirpstackPackage.DRAGINO__SOIL, null, msgs);
			msgs = basicSetSoil(newSoil, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ChirpstackPackage.DRAGINO__SOIL, newSoil, newSoil));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Device getDevice() {
		return device;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDevice(Device newDevice, NotificationChain msgs) {
		Device oldDevice = device;
		device = newDevice;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ChirpstackPackage.DRAGINO__DEVICE, oldDevice, newDevice);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setDevice(Device newDevice) {
		if (newDevice != device) {
			NotificationChain msgs = null;
			if (device != null)
				msgs = ((InternalEObject)device).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ChirpstackPackage.DRAGINO__DEVICE, null, msgs);
			if (newDevice != null)
				msgs = ((InternalEObject)newDevice).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ChirpstackPackage.DRAGINO__DEVICE, null, msgs);
			msgs = basicSetDevice(newDevice, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ChirpstackPackage.DRAGINO__DEVICE, newDevice, newDevice));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ChirpstackPackage.DRAGINO__SENSOR:
				return basicSetSensor(null, msgs);
			case ChirpstackPackage.DRAGINO__SOIL:
				return basicSetSoil(null, msgs);
			case ChirpstackPackage.DRAGINO__DEVICE:
				return basicSetDevice(null, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case ChirpstackPackage.DRAGINO__SENSOR:
				return getSensor();
			case ChirpstackPackage.DRAGINO__SOIL:
				return getSoil();
			case ChirpstackPackage.DRAGINO__DEVICE:
				return getDevice();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case ChirpstackPackage.DRAGINO__SENSOR:
				setSensor((Sensor)newValue);
				return;
			case ChirpstackPackage.DRAGINO__SOIL:
				setSoil((Soil)newValue);
				return;
			case ChirpstackPackage.DRAGINO__DEVICE:
				setDevice((Device)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case ChirpstackPackage.DRAGINO__SENSOR:
				setSensor((Sensor)null);
				return;
			case ChirpstackPackage.DRAGINO__SOIL:
				setSoil((Soil)null);
				return;
			case ChirpstackPackage.DRAGINO__DEVICE:
				setDevice((Device)null);
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case ChirpstackPackage.DRAGINO__SENSOR:
				return sensor != null;
			case ChirpstackPackage.DRAGINO__SOIL:
				return soil != null;
			case ChirpstackPackage.DRAGINO__DEVICE:
				return device != null;
		}
		return super.eIsSet(featureID);
	}

} //DraginoImpl
