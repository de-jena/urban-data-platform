/*
 */
package org.eclipse.fennec.model.sensinact.weatherprovider.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.fennec.model.sensinact.weatherprovider.SnowRainData;
import org.eclipse.fennec.model.sensinact.weatherprovider.WeatherPackage;

import org.eclipse.sensinact.model.core.provider.impl.ServiceImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Snow Rain Data</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.fennec.model.sensinact.weatherprovider.impl.SnowRainDataImpl#getSnowRainEqLast1 <em>Snow Rain Eq Last1</em>}</li>
 *   <li>{@link org.eclipse.fennec.model.sensinact.weatherprovider.impl.SnowRainDataImpl#getSnowRainEqLast3 <em>Snow Rain Eq Last3</em>}</li>
 * </ul>
 *
 * @generated
 */
public class SnowRainDataImpl extends ServiceImpl implements SnowRainData {
	/**
	 * The default value of the '{@link #getSnowRainEqLast1() <em>Snow Rain Eq Last1</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSnowRainEqLast1()
	 * @generated
	 * @ordered
	 */
	protected static final Float SNOW_RAIN_EQ_LAST1_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getSnowRainEqLast1() <em>Snow Rain Eq Last1</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSnowRainEqLast1()
	 * @generated
	 * @ordered
	 */
	protected Float snowRainEqLast1 = SNOW_RAIN_EQ_LAST1_EDEFAULT;

	/**
	 * The default value of the '{@link #getSnowRainEqLast3() <em>Snow Rain Eq Last3</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSnowRainEqLast3()
	 * @generated
	 * @ordered
	 */
	protected static final Float SNOW_RAIN_EQ_LAST3_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getSnowRainEqLast3() <em>Snow Rain Eq Last3</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSnowRainEqLast3()
	 * @generated
	 * @ordered
	 */
	protected Float snowRainEqLast3 = SNOW_RAIN_EQ_LAST3_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SnowRainDataImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return WeatherPackage.Literals.SNOW_RAIN_DATA;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Float getSnowRainEqLast1() {
		return snowRainEqLast1;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setSnowRainEqLast1(Float newSnowRainEqLast1) {
		Float oldSnowRainEqLast1 = snowRainEqLast1;
		snowRainEqLast1 = newSnowRainEqLast1;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WeatherPackage.SNOW_RAIN_DATA__SNOW_RAIN_EQ_LAST1, oldSnowRainEqLast1, snowRainEqLast1));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Float getSnowRainEqLast3() {
		return snowRainEqLast3;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setSnowRainEqLast3(Float newSnowRainEqLast3) {
		Float oldSnowRainEqLast3 = snowRainEqLast3;
		snowRainEqLast3 = newSnowRainEqLast3;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WeatherPackage.SNOW_RAIN_DATA__SNOW_RAIN_EQ_LAST3, oldSnowRainEqLast3, snowRainEqLast3));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case WeatherPackage.SNOW_RAIN_DATA__SNOW_RAIN_EQ_LAST1:
				return getSnowRainEqLast1();
			case WeatherPackage.SNOW_RAIN_DATA__SNOW_RAIN_EQ_LAST3:
				return getSnowRainEqLast3();
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
			case WeatherPackage.SNOW_RAIN_DATA__SNOW_RAIN_EQ_LAST1:
				setSnowRainEqLast1((Float)newValue);
				return;
			case WeatherPackage.SNOW_RAIN_DATA__SNOW_RAIN_EQ_LAST3:
				setSnowRainEqLast3((Float)newValue);
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
			case WeatherPackage.SNOW_RAIN_DATA__SNOW_RAIN_EQ_LAST1:
				setSnowRainEqLast1(SNOW_RAIN_EQ_LAST1_EDEFAULT);
				return;
			case WeatherPackage.SNOW_RAIN_DATA__SNOW_RAIN_EQ_LAST3:
				setSnowRainEqLast3(SNOW_RAIN_EQ_LAST3_EDEFAULT);
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
			case WeatherPackage.SNOW_RAIN_DATA__SNOW_RAIN_EQ_LAST1:
				return SNOW_RAIN_EQ_LAST1_EDEFAULT == null ? snowRainEqLast1 != null : !SNOW_RAIN_EQ_LAST1_EDEFAULT.equals(snowRainEqLast1);
			case WeatherPackage.SNOW_RAIN_DATA__SNOW_RAIN_EQ_LAST3:
				return SNOW_RAIN_EQ_LAST3_EDEFAULT == null ? snowRainEqLast3 != null : !SNOW_RAIN_EQ_LAST3_EDEFAULT.equals(snowRainEqLast3);
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
		result.append(" (snowRainEqLast1: ");
		result.append(snowRainEqLast1);
		result.append(", snowRainEqLast3: ");
		result.append(snowRainEqLast3);
		result.append(')');
		return result.toString();
	}

} //SnowRainDataImpl
