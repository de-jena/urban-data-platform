/*
 */
package org.eclipse.fennec.model.sensinact.weatherprovider.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.fennec.model.sensinact.weatherprovider.SignificantWeatherData;
import org.eclipse.fennec.model.sensinact.weatherprovider.WeatherPackage;

import org.eclipse.sensinact.model.core.provider.impl.ServiceImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Significant Weather Data</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.fennec.model.sensinact.weatherprovider.impl.SignificantWeatherDataImpl#getWw <em>Ww</em>}</li>
 *   <li>{@link org.eclipse.fennec.model.sensinact.weatherprovider.impl.SignificantWeatherDataImpl#getW1w2_w1 <em>W1w2 w1</em>}</li>
 *   <li>{@link org.eclipse.fennec.model.sensinact.weatherprovider.impl.SignificantWeatherDataImpl#getW1w2_w2 <em>W1w2 w2</em>}</li>
 * </ul>
 *
 * @generated
 */
public class SignificantWeatherDataImpl extends ServiceImpl implements SignificantWeatherData {
	/**
	 * The default value of the '{@link #getWw() <em>Ww</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWw()
	 * @generated
	 * @ordered
	 */
	protected static final String WW_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getWw() <em>Ww</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWw()
	 * @generated
	 * @ordered
	 */
	protected String ww = WW_EDEFAULT;

	/**
	 * The default value of the '{@link #getW1w2_w1() <em>W1w2 w1</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getW1w2_w1()
	 * @generated
	 * @ordered
	 */
	protected static final String W1W2_W1_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getW1w2_w1() <em>W1w2 w1</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getW1w2_w1()
	 * @generated
	 * @ordered
	 */
	protected String w1w2_w1 = W1W2_W1_EDEFAULT;

	/**
	 * The default value of the '{@link #getW1w2_w2() <em>W1w2 w2</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getW1w2_w2()
	 * @generated
	 * @ordered
	 */
	protected static final String W1W2_W2_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getW1w2_w2() <em>W1w2 w2</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getW1w2_w2()
	 * @generated
	 * @ordered
	 */
	protected String w1w2_w2 = W1W2_W2_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SignificantWeatherDataImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return WeatherPackage.Literals.SIGNIFICANT_WEATHER_DATA;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getWw() {
		return ww;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setWw(String newWw) {
		String oldWw = ww;
		ww = newWw;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WeatherPackage.SIGNIFICANT_WEATHER_DATA__WW, oldWw, ww));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getW1w2_w1() {
		return w1w2_w1;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setW1w2_w1(String newW1w2_w1) {
		String oldW1w2_w1 = w1w2_w1;
		w1w2_w1 = newW1w2_w1;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WeatherPackage.SIGNIFICANT_WEATHER_DATA__W1W2_W1, oldW1w2_w1, w1w2_w1));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getW1w2_w2() {
		return w1w2_w2;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setW1w2_w2(String newW1w2_w2) {
		String oldW1w2_w2 = w1w2_w2;
		w1w2_w2 = newW1w2_w2;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WeatherPackage.SIGNIFICANT_WEATHER_DATA__W1W2_W2, oldW1w2_w2, w1w2_w2));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case WeatherPackage.SIGNIFICANT_WEATHER_DATA__WW:
				return getWw();
			case WeatherPackage.SIGNIFICANT_WEATHER_DATA__W1W2_W1:
				return getW1w2_w1();
			case WeatherPackage.SIGNIFICANT_WEATHER_DATA__W1W2_W2:
				return getW1w2_w2();
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
			case WeatherPackage.SIGNIFICANT_WEATHER_DATA__WW:
				setWw((String)newValue);
				return;
			case WeatherPackage.SIGNIFICANT_WEATHER_DATA__W1W2_W1:
				setW1w2_w1((String)newValue);
				return;
			case WeatherPackage.SIGNIFICANT_WEATHER_DATA__W1W2_W2:
				setW1w2_w2((String)newValue);
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
			case WeatherPackage.SIGNIFICANT_WEATHER_DATA__WW:
				setWw(WW_EDEFAULT);
				return;
			case WeatherPackage.SIGNIFICANT_WEATHER_DATA__W1W2_W1:
				setW1w2_w1(W1W2_W1_EDEFAULT);
				return;
			case WeatherPackage.SIGNIFICANT_WEATHER_DATA__W1W2_W2:
				setW1w2_w2(W1W2_W2_EDEFAULT);
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
			case WeatherPackage.SIGNIFICANT_WEATHER_DATA__WW:
				return WW_EDEFAULT == null ? ww != null : !WW_EDEFAULT.equals(ww);
			case WeatherPackage.SIGNIFICANT_WEATHER_DATA__W1W2_W1:
				return W1W2_W1_EDEFAULT == null ? w1w2_w1 != null : !W1W2_W1_EDEFAULT.equals(w1w2_w1);
			case WeatherPackage.SIGNIFICANT_WEATHER_DATA__W1W2_W2:
				return W1W2_W2_EDEFAULT == null ? w1w2_w2 != null : !W1W2_W2_EDEFAULT.equals(w1w2_w2);
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
		result.append(" (ww: ");
		result.append(ww);
		result.append(", w1w2_w1: ");
		result.append(w1w2_w1);
		result.append(", w1w2_w2: ");
		result.append(w1w2_w2);
		result.append(')');
		return result.toString();
	}

} //SignificantWeatherDataImpl
