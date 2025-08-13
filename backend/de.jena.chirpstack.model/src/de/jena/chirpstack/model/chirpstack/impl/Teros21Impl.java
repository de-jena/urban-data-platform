/*
 */
package de.jena.chirpstack.model.chirpstack.impl;

import de.jena.chirpstack.model.chirpstack.ChirpstackPackage;
import de.jena.chirpstack.model.chirpstack.Teros21;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.sensinact.model.core.provider.impl.ServiceImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Teros21</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link de.jena.chirpstack.model.chirpstack.impl.Teros21Impl#getPotentialWater1 <em>Potential Water1</em>}</li>
 *   <li>{@link de.jena.chirpstack.model.chirpstack.impl.Teros21Impl#getPotentialWater2 <em>Potential Water2</em>}</li>
 *   <li>{@link de.jena.chirpstack.model.chirpstack.impl.Teros21Impl#getTemperatur1 <em>Temperatur1</em>}</li>
 *   <li>{@link de.jena.chirpstack.model.chirpstack.impl.Teros21Impl#getTemperatur2 <em>Temperatur2</em>}</li>
 *   <li>{@link de.jena.chirpstack.model.chirpstack.impl.Teros21Impl#getBattery <em>Battery</em>}</li>
 * </ul>
 *
 * @generated
 */
public class Teros21Impl extends ServiceImpl implements Teros21 {
	/**
	 * The default value of the '{@link #getPotentialWater1() <em>Potential Water1</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPotentialWater1()
	 * @generated
	 * @ordered
	 */
	protected static final double POTENTIAL_WATER1_EDEFAULT = 0.0;

	/**
	 * The cached value of the '{@link #getPotentialWater1() <em>Potential Water1</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPotentialWater1()
	 * @generated
	 * @ordered
	 */
	protected double potentialWater1 = POTENTIAL_WATER1_EDEFAULT;

	/**
	 * The default value of the '{@link #getPotentialWater2() <em>Potential Water2</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPotentialWater2()
	 * @generated
	 * @ordered
	 */
	protected static final double POTENTIAL_WATER2_EDEFAULT = 0.0;

	/**
	 * The cached value of the '{@link #getPotentialWater2() <em>Potential Water2</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPotentialWater2()
	 * @generated
	 * @ordered
	 */
	protected double potentialWater2 = POTENTIAL_WATER2_EDEFAULT;

	/**
	 * The default value of the '{@link #getTemperatur1() <em>Temperatur1</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTemperatur1()
	 * @generated
	 * @ordered
	 */
	protected static final double TEMPERATUR1_EDEFAULT = 0.0;

	/**
	 * The cached value of the '{@link #getTemperatur1() <em>Temperatur1</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTemperatur1()
	 * @generated
	 * @ordered
	 */
	protected double temperatur1 = TEMPERATUR1_EDEFAULT;

	/**
	 * The default value of the '{@link #getTemperatur2() <em>Temperatur2</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTemperatur2()
	 * @generated
	 * @ordered
	 */
	protected static final double TEMPERATUR2_EDEFAULT = 0.0;

	/**
	 * The cached value of the '{@link #getTemperatur2() <em>Temperatur2</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTemperatur2()
	 * @generated
	 * @ordered
	 */
	protected double temperatur2 = TEMPERATUR2_EDEFAULT;

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
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Teros21Impl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ChirpstackPackage.Literals.TEROS21;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public double getPotentialWater1() {
		return potentialWater1;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setPotentialWater1(double newPotentialWater1) {
		double oldPotentialWater1 = potentialWater1;
		potentialWater1 = newPotentialWater1;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ChirpstackPackage.TEROS21__POTENTIAL_WATER1, oldPotentialWater1, potentialWater1));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public double getPotentialWater2() {
		return potentialWater2;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setPotentialWater2(double newPotentialWater2) {
		double oldPotentialWater2 = potentialWater2;
		potentialWater2 = newPotentialWater2;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ChirpstackPackage.TEROS21__POTENTIAL_WATER2, oldPotentialWater2, potentialWater2));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public double getTemperatur1() {
		return temperatur1;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setTemperatur1(double newTemperatur1) {
		double oldTemperatur1 = temperatur1;
		temperatur1 = newTemperatur1;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ChirpstackPackage.TEROS21__TEMPERATUR1, oldTemperatur1, temperatur1));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public double getTemperatur2() {
		return temperatur2;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setTemperatur2(double newTemperatur2) {
		double oldTemperatur2 = temperatur2;
		temperatur2 = newTemperatur2;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ChirpstackPackage.TEROS21__TEMPERATUR2, oldTemperatur2, temperatur2));
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
			eNotify(new ENotificationImpl(this, Notification.SET, ChirpstackPackage.TEROS21__BATTERY, oldBattery, battery));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case ChirpstackPackage.TEROS21__POTENTIAL_WATER1:
				return getPotentialWater1();
			case ChirpstackPackage.TEROS21__POTENTIAL_WATER2:
				return getPotentialWater2();
			case ChirpstackPackage.TEROS21__TEMPERATUR1:
				return getTemperatur1();
			case ChirpstackPackage.TEROS21__TEMPERATUR2:
				return getTemperatur2();
			case ChirpstackPackage.TEROS21__BATTERY:
				return getBattery();
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
			case ChirpstackPackage.TEROS21__POTENTIAL_WATER1:
				setPotentialWater1((Double)newValue);
				return;
			case ChirpstackPackage.TEROS21__POTENTIAL_WATER2:
				setPotentialWater2((Double)newValue);
				return;
			case ChirpstackPackage.TEROS21__TEMPERATUR1:
				setTemperatur1((Double)newValue);
				return;
			case ChirpstackPackage.TEROS21__TEMPERATUR2:
				setTemperatur2((Double)newValue);
				return;
			case ChirpstackPackage.TEROS21__BATTERY:
				setBattery((Double)newValue);
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
			case ChirpstackPackage.TEROS21__POTENTIAL_WATER1:
				setPotentialWater1(POTENTIAL_WATER1_EDEFAULT);
				return;
			case ChirpstackPackage.TEROS21__POTENTIAL_WATER2:
				setPotentialWater2(POTENTIAL_WATER2_EDEFAULT);
				return;
			case ChirpstackPackage.TEROS21__TEMPERATUR1:
				setTemperatur1(TEMPERATUR1_EDEFAULT);
				return;
			case ChirpstackPackage.TEROS21__TEMPERATUR2:
				setTemperatur2(TEMPERATUR2_EDEFAULT);
				return;
			case ChirpstackPackage.TEROS21__BATTERY:
				setBattery(BATTERY_EDEFAULT);
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
			case ChirpstackPackage.TEROS21__POTENTIAL_WATER1:
				return potentialWater1 != POTENTIAL_WATER1_EDEFAULT;
			case ChirpstackPackage.TEROS21__POTENTIAL_WATER2:
				return potentialWater2 != POTENTIAL_WATER2_EDEFAULT;
			case ChirpstackPackage.TEROS21__TEMPERATUR1:
				return temperatur1 != TEMPERATUR1_EDEFAULT;
			case ChirpstackPackage.TEROS21__TEMPERATUR2:
				return temperatur2 != TEMPERATUR2_EDEFAULT;
			case ChirpstackPackage.TEROS21__BATTERY:
				return battery != BATTERY_EDEFAULT;
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
		result.append(" (potentialWater1: ");
		result.append(potentialWater1);
		result.append(", potentialWater2: ");
		result.append(potentialWater2);
		result.append(", temperatur1: ");
		result.append(temperatur1);
		result.append(", temperatur2: ");
		result.append(temperatur2);
		result.append(", battery: ");
		result.append(battery);
		result.append(')');
		return result.toString();
	}

} //Teros21Impl
