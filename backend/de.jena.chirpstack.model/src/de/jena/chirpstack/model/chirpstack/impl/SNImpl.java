/*
 */
package de.jena.chirpstack.model.chirpstack.impl;

import de.jena.chirpstack.model.chirpstack.ChirpstackPackage;
import de.jena.chirpstack.model.chirpstack.SN;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.sensinact.model.core.provider.impl.ServiceImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>SN</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link de.jena.chirpstack.model.chirpstack.impl.SNImpl#getAdc1v <em>Adc1v</em>}</li>
 *   <li>{@link de.jena.chirpstack.model.chirpstack.impl.SNImpl#getBattery <em>Battery</em>}</li>
 *   <li>{@link de.jena.chirpstack.model.chirpstack.impl.SNImpl#getAdc2 <em>Adc2</em>}</li>
 *   <li>{@link de.jena.chirpstack.model.chirpstack.impl.SNImpl#getAdc3 <em>Adc3</em>}</li>
 * </ul>
 *
 * @generated
 */
public class SNImpl extends ServiceImpl implements SN {
	/**
	 * The default value of the '{@link #getAdc1v() <em>Adc1v</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAdc1v()
	 * @generated
	 * @ordered
	 */
	protected static final double ADC1V_EDEFAULT = 0.0;

	/**
	 * The cached value of the '{@link #getAdc1v() <em>Adc1v</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAdc1v()
	 * @generated
	 * @ordered
	 */
	protected double adc1v = ADC1V_EDEFAULT;

	/**
	 * The default value of the '{@link #getBattery() <em>Battery</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBattery()
	 * @generated
	 * @ordered
	 */
	protected static final double BATTERY_EDEFAULT = 0.0;

	/**
	 * The cached value of the '{@link #getBattery() <em>Battery</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBattery()
	 * @generated
	 * @ordered
	 */
	protected double battery = BATTERY_EDEFAULT;

	/**
	 * The default value of the '{@link #getAdc2() <em>Adc2</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAdc2()
	 * @generated
	 * @ordered
	 */
	protected static final double ADC2_EDEFAULT = 0.0;

	/**
	 * The cached value of the '{@link #getAdc2() <em>Adc2</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAdc2()
	 * @generated
	 * @ordered
	 */
	protected double adc2 = ADC2_EDEFAULT;

	/**
	 * The default value of the '{@link #getAdc3() <em>Adc3</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAdc3()
	 * @generated
	 * @ordered
	 */
	protected static final double ADC3_EDEFAULT = 0.0;

	/**
	 * The cached value of the '{@link #getAdc3() <em>Adc3</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAdc3()
	 * @generated
	 * @ordered
	 */
	protected double adc3 = ADC3_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SNImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ChirpstackPackage.Literals.SN;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public double getAdc1v() {
		return adc1v;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setAdc1v(double newAdc1v) {
		double oldAdc1v = adc1v;
		adc1v = newAdc1v;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ChirpstackPackage.SN__ADC1V, oldAdc1v, adc1v));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public double getBattery() {
		return battery;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setBattery(double newBattery) {
		double oldBattery = battery;
		battery = newBattery;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ChirpstackPackage.SN__BATTERY, oldBattery, battery));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public double getAdc2() {
		return adc2;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setAdc2(double newAdc2) {
		double oldAdc2 = adc2;
		adc2 = newAdc2;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ChirpstackPackage.SN__ADC2, oldAdc2, adc2));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public double getAdc3() {
		return adc3;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setAdc3(double newAdc3) {
		double oldAdc3 = adc3;
		adc3 = newAdc3;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ChirpstackPackage.SN__ADC3, oldAdc3, adc3));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case ChirpstackPackage.SN__ADC1V:
				return getAdc1v();
			case ChirpstackPackage.SN__BATTERY:
				return getBattery();
			case ChirpstackPackage.SN__ADC2:
				return getAdc2();
			case ChirpstackPackage.SN__ADC3:
				return getAdc3();
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
			case ChirpstackPackage.SN__ADC1V:
				setAdc1v((Double)newValue);
				return;
			case ChirpstackPackage.SN__BATTERY:
				setBattery((Double)newValue);
				return;
			case ChirpstackPackage.SN__ADC2:
				setAdc2((Double)newValue);
				return;
			case ChirpstackPackage.SN__ADC3:
				setAdc3((Double)newValue);
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
			case ChirpstackPackage.SN__ADC1V:
				setAdc1v(ADC1V_EDEFAULT);
				return;
			case ChirpstackPackage.SN__BATTERY:
				setBattery(BATTERY_EDEFAULT);
				return;
			case ChirpstackPackage.SN__ADC2:
				setAdc2(ADC2_EDEFAULT);
				return;
			case ChirpstackPackage.SN__ADC3:
				setAdc3(ADC3_EDEFAULT);
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
			case ChirpstackPackage.SN__ADC1V:
				return adc1v != ADC1V_EDEFAULT;
			case ChirpstackPackage.SN__BATTERY:
				return battery != BATTERY_EDEFAULT;
			case ChirpstackPackage.SN__ADC2:
				return adc2 != ADC2_EDEFAULT;
			case ChirpstackPackage.SN__ADC3:
				return adc3 != ADC3_EDEFAULT;
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuilder result = new StringBuilder(super.toString());
		result.append(" (adc1v: ");
		result.append(adc1v);
		result.append(", battery: ");
		result.append(battery);
		result.append(", adc2: ");
		result.append(adc2);
		result.append(", adc3: ");
		result.append(adc3);
		result.append(')');
		return result.toString();
	}

} //SNImpl
