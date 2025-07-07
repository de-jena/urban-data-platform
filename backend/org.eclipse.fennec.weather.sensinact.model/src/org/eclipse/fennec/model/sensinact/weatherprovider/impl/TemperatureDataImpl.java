/*
 */
package org.eclipse.fennec.model.sensinact.weatherprovider.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.fennec.model.sensinact.weatherprovider.TemperatureData;
import org.eclipse.fennec.model.sensinact.weatherprovider.WeatherPackage;

import org.eclipse.sensinact.model.core.provider.impl.ServiceImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Temperature Data</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.fennec.model.sensinact.weatherprovider.impl.TemperatureDataImpl#getTempAboveSurface5 <em>Temp Above Surface5</em>}</li>
 *   <li>{@link org.eclipse.fennec.model.sensinact.weatherprovider.impl.TemperatureDataImpl#getTempAboveSurface200 <em>Temp Above Surface200</em>}</li>
 *   <li>{@link org.eclipse.fennec.model.sensinact.weatherprovider.impl.TemperatureDataImpl#getTempDewpointAboveSurface200 <em>Temp Dewpoint Above Surface200</em>}</li>
 *   <li>{@link org.eclipse.fennec.model.sensinact.weatherprovider.impl.TemperatureDataImpl#getTempMinLast12 <em>Temp Min Last12</em>}</li>
 *   <li>{@link org.eclipse.fennec.model.sensinact.weatherprovider.impl.TemperatureDataImpl#getTempMaxLast12 <em>Temp Max Last12</em>}</li>
 * </ul>
 *
 * @generated
 */
public class TemperatureDataImpl extends ServiceImpl implements TemperatureData {
	/**
	 * The default value of the '{@link #getTempAboveSurface5() <em>Temp Above Surface5</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTempAboveSurface5()
	 * @generated
	 * @ordered
	 */
	protected static final Float TEMP_ABOVE_SURFACE5_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getTempAboveSurface5() <em>Temp Above Surface5</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTempAboveSurface5()
	 * @generated
	 * @ordered
	 */
	protected Float tempAboveSurface5 = TEMP_ABOVE_SURFACE5_EDEFAULT;

	/**
	 * The default value of the '{@link #getTempAboveSurface200() <em>Temp Above Surface200</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTempAboveSurface200()
	 * @generated
	 * @ordered
	 */
	protected static final Float TEMP_ABOVE_SURFACE200_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getTempAboveSurface200() <em>Temp Above Surface200</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTempAboveSurface200()
	 * @generated
	 * @ordered
	 */
	protected Float tempAboveSurface200 = TEMP_ABOVE_SURFACE200_EDEFAULT;

	/**
	 * The default value of the '{@link #getTempDewpointAboveSurface200() <em>Temp Dewpoint Above Surface200</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTempDewpointAboveSurface200()
	 * @generated
	 * @ordered
	 */
	protected static final Float TEMP_DEWPOINT_ABOVE_SURFACE200_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getTempDewpointAboveSurface200() <em>Temp Dewpoint Above Surface200</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTempDewpointAboveSurface200()
	 * @generated
	 * @ordered
	 */
	protected Float tempDewpointAboveSurface200 = TEMP_DEWPOINT_ABOVE_SURFACE200_EDEFAULT;

	/**
	 * The default value of the '{@link #getTempMinLast12() <em>Temp Min Last12</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTempMinLast12()
	 * @generated
	 * @ordered
	 */
	protected static final Float TEMP_MIN_LAST12_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getTempMinLast12() <em>Temp Min Last12</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTempMinLast12()
	 * @generated
	 * @ordered
	 */
	protected Float tempMinLast12 = TEMP_MIN_LAST12_EDEFAULT;

	/**
	 * The default value of the '{@link #getTempMaxLast12() <em>Temp Max Last12</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTempMaxLast12()
	 * @generated
	 * @ordered
	 */
	protected static final Float TEMP_MAX_LAST12_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getTempMaxLast12() <em>Temp Max Last12</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTempMaxLast12()
	 * @generated
	 * @ordered
	 */
	protected Float tempMaxLast12 = TEMP_MAX_LAST12_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TemperatureDataImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return WeatherPackage.Literals.TEMPERATURE_DATA;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Float getTempAboveSurface5() {
		return tempAboveSurface5;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setTempAboveSurface5(Float newTempAboveSurface5) {
		Float oldTempAboveSurface5 = tempAboveSurface5;
		tempAboveSurface5 = newTempAboveSurface5;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WeatherPackage.TEMPERATURE_DATA__TEMP_ABOVE_SURFACE5, oldTempAboveSurface5, tempAboveSurface5));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Float getTempAboveSurface200() {
		return tempAboveSurface200;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setTempAboveSurface200(Float newTempAboveSurface200) {
		Float oldTempAboveSurface200 = tempAboveSurface200;
		tempAboveSurface200 = newTempAboveSurface200;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WeatherPackage.TEMPERATURE_DATA__TEMP_ABOVE_SURFACE200, oldTempAboveSurface200, tempAboveSurface200));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Float getTempDewpointAboveSurface200() {
		return tempDewpointAboveSurface200;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setTempDewpointAboveSurface200(Float newTempDewpointAboveSurface200) {
		Float oldTempDewpointAboveSurface200 = tempDewpointAboveSurface200;
		tempDewpointAboveSurface200 = newTempDewpointAboveSurface200;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WeatherPackage.TEMPERATURE_DATA__TEMP_DEWPOINT_ABOVE_SURFACE200, oldTempDewpointAboveSurface200, tempDewpointAboveSurface200));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Float getTempMinLast12() {
		return tempMinLast12;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setTempMinLast12(Float newTempMinLast12) {
		Float oldTempMinLast12 = tempMinLast12;
		tempMinLast12 = newTempMinLast12;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WeatherPackage.TEMPERATURE_DATA__TEMP_MIN_LAST12, oldTempMinLast12, tempMinLast12));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Float getTempMaxLast12() {
		return tempMaxLast12;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setTempMaxLast12(Float newTempMaxLast12) {
		Float oldTempMaxLast12 = tempMaxLast12;
		tempMaxLast12 = newTempMaxLast12;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WeatherPackage.TEMPERATURE_DATA__TEMP_MAX_LAST12, oldTempMaxLast12, tempMaxLast12));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case WeatherPackage.TEMPERATURE_DATA__TEMP_ABOVE_SURFACE5:
				return getTempAboveSurface5();
			case WeatherPackage.TEMPERATURE_DATA__TEMP_ABOVE_SURFACE200:
				return getTempAboveSurface200();
			case WeatherPackage.TEMPERATURE_DATA__TEMP_DEWPOINT_ABOVE_SURFACE200:
				return getTempDewpointAboveSurface200();
			case WeatherPackage.TEMPERATURE_DATA__TEMP_MIN_LAST12:
				return getTempMinLast12();
			case WeatherPackage.TEMPERATURE_DATA__TEMP_MAX_LAST12:
				return getTempMaxLast12();
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
			case WeatherPackage.TEMPERATURE_DATA__TEMP_ABOVE_SURFACE5:
				setTempAboveSurface5((Float)newValue);
				return;
			case WeatherPackage.TEMPERATURE_DATA__TEMP_ABOVE_SURFACE200:
				setTempAboveSurface200((Float)newValue);
				return;
			case WeatherPackage.TEMPERATURE_DATA__TEMP_DEWPOINT_ABOVE_SURFACE200:
				setTempDewpointAboveSurface200((Float)newValue);
				return;
			case WeatherPackage.TEMPERATURE_DATA__TEMP_MIN_LAST12:
				setTempMinLast12((Float)newValue);
				return;
			case WeatherPackage.TEMPERATURE_DATA__TEMP_MAX_LAST12:
				setTempMaxLast12((Float)newValue);
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
			case WeatherPackage.TEMPERATURE_DATA__TEMP_ABOVE_SURFACE5:
				setTempAboveSurface5(TEMP_ABOVE_SURFACE5_EDEFAULT);
				return;
			case WeatherPackage.TEMPERATURE_DATA__TEMP_ABOVE_SURFACE200:
				setTempAboveSurface200(TEMP_ABOVE_SURFACE200_EDEFAULT);
				return;
			case WeatherPackage.TEMPERATURE_DATA__TEMP_DEWPOINT_ABOVE_SURFACE200:
				setTempDewpointAboveSurface200(TEMP_DEWPOINT_ABOVE_SURFACE200_EDEFAULT);
				return;
			case WeatherPackage.TEMPERATURE_DATA__TEMP_MIN_LAST12:
				setTempMinLast12(TEMP_MIN_LAST12_EDEFAULT);
				return;
			case WeatherPackage.TEMPERATURE_DATA__TEMP_MAX_LAST12:
				setTempMaxLast12(TEMP_MAX_LAST12_EDEFAULT);
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
			case WeatherPackage.TEMPERATURE_DATA__TEMP_ABOVE_SURFACE5:
				return TEMP_ABOVE_SURFACE5_EDEFAULT == null ? tempAboveSurface5 != null : !TEMP_ABOVE_SURFACE5_EDEFAULT.equals(tempAboveSurface5);
			case WeatherPackage.TEMPERATURE_DATA__TEMP_ABOVE_SURFACE200:
				return TEMP_ABOVE_SURFACE200_EDEFAULT == null ? tempAboveSurface200 != null : !TEMP_ABOVE_SURFACE200_EDEFAULT.equals(tempAboveSurface200);
			case WeatherPackage.TEMPERATURE_DATA__TEMP_DEWPOINT_ABOVE_SURFACE200:
				return TEMP_DEWPOINT_ABOVE_SURFACE200_EDEFAULT == null ? tempDewpointAboveSurface200 != null : !TEMP_DEWPOINT_ABOVE_SURFACE200_EDEFAULT.equals(tempDewpointAboveSurface200);
			case WeatherPackage.TEMPERATURE_DATA__TEMP_MIN_LAST12:
				return TEMP_MIN_LAST12_EDEFAULT == null ? tempMinLast12 != null : !TEMP_MIN_LAST12_EDEFAULT.equals(tempMinLast12);
			case WeatherPackage.TEMPERATURE_DATA__TEMP_MAX_LAST12:
				return TEMP_MAX_LAST12_EDEFAULT == null ? tempMaxLast12 != null : !TEMP_MAX_LAST12_EDEFAULT.equals(tempMaxLast12);
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
		result.append(" (tempAboveSurface5: ");
		result.append(tempAboveSurface5);
		result.append(", tempAboveSurface200: ");
		result.append(tempAboveSurface200);
		result.append(", tempDewpointAboveSurface200: ");
		result.append(tempDewpointAboveSurface200);
		result.append(", tempMinLast12: ");
		result.append(tempMinLast12);
		result.append(", tempMaxLast12: ");
		result.append(tempMaxLast12);
		result.append(')');
		return result.toString();
	}

} //TemperatureDataImpl
