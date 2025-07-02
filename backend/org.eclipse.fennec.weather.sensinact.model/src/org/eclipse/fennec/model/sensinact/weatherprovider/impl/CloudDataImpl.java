/*
 */
package org.eclipse.fennec.model.sensinact.weatherprovider.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.fennec.model.sensinact.weatherprovider.CloudData;
import org.eclipse.fennec.model.sensinact.weatherprovider.WeatherPackage;

import org.eclipse.sensinact.model.core.provider.impl.ServiceImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Cloud Data</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.fennec.model.sensinact.weatherprovider.impl.CloudDataImpl#getCloudCoverTotal <em>Cloud Cover Total</em>}</li>
 *   <li>{@link org.eclipse.fennec.model.sensinact.weatherprovider.impl.CloudDataImpl#getCloudCoverBelow500 <em>Cloud Cover Below500</em>}</li>
 * </ul>
 *
 * @generated
 */
public class CloudDataImpl extends ServiceImpl implements CloudData {
	/**
	 * The default value of the '{@link #getCloudCoverTotal() <em>Cloud Cover Total</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCloudCoverTotal()
	 * @generated
	 * @ordered
	 */
	protected static final Float CLOUD_COVER_TOTAL_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getCloudCoverTotal() <em>Cloud Cover Total</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCloudCoverTotal()
	 * @generated
	 * @ordered
	 */
	protected Float cloudCoverTotal = CLOUD_COVER_TOTAL_EDEFAULT;

	/**
	 * The default value of the '{@link #getCloudCoverBelow500() <em>Cloud Cover Below500</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCloudCoverBelow500()
	 * @generated
	 * @ordered
	 */
	protected static final Float CLOUD_COVER_BELOW500_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getCloudCoverBelow500() <em>Cloud Cover Below500</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCloudCoverBelow500()
	 * @generated
	 * @ordered
	 */
	protected Float cloudCoverBelow500 = CLOUD_COVER_BELOW500_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CloudDataImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return WeatherPackage.Literals.CLOUD_DATA;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Float getCloudCoverTotal() {
		return cloudCoverTotal;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setCloudCoverTotal(Float newCloudCoverTotal) {
		Float oldCloudCoverTotal = cloudCoverTotal;
		cloudCoverTotal = newCloudCoverTotal;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WeatherPackage.CLOUD_DATA__CLOUD_COVER_TOTAL, oldCloudCoverTotal, cloudCoverTotal));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Float getCloudCoverBelow500() {
		return cloudCoverBelow500;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setCloudCoverBelow500(Float newCloudCoverBelow500) {
		Float oldCloudCoverBelow500 = cloudCoverBelow500;
		cloudCoverBelow500 = newCloudCoverBelow500;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WeatherPackage.CLOUD_DATA__CLOUD_COVER_BELOW500, oldCloudCoverBelow500, cloudCoverBelow500));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case WeatherPackage.CLOUD_DATA__CLOUD_COVER_TOTAL:
				return getCloudCoverTotal();
			case WeatherPackage.CLOUD_DATA__CLOUD_COVER_BELOW500:
				return getCloudCoverBelow500();
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
			case WeatherPackage.CLOUD_DATA__CLOUD_COVER_TOTAL:
				setCloudCoverTotal((Float)newValue);
				return;
			case WeatherPackage.CLOUD_DATA__CLOUD_COVER_BELOW500:
				setCloudCoverBelow500((Float)newValue);
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
			case WeatherPackage.CLOUD_DATA__CLOUD_COVER_TOTAL:
				setCloudCoverTotal(CLOUD_COVER_TOTAL_EDEFAULT);
				return;
			case WeatherPackage.CLOUD_DATA__CLOUD_COVER_BELOW500:
				setCloudCoverBelow500(CLOUD_COVER_BELOW500_EDEFAULT);
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
			case WeatherPackage.CLOUD_DATA__CLOUD_COVER_TOTAL:
				return CLOUD_COVER_TOTAL_EDEFAULT == null ? cloudCoverTotal != null : !CLOUD_COVER_TOTAL_EDEFAULT.equals(cloudCoverTotal);
			case WeatherPackage.CLOUD_DATA__CLOUD_COVER_BELOW500:
				return CLOUD_COVER_BELOW500_EDEFAULT == null ? cloudCoverBelow500 != null : !CLOUD_COVER_BELOW500_EDEFAULT.equals(cloudCoverBelow500);
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
		result.append(" (cloudCoverTotal: ");
		result.append(cloudCoverTotal);
		result.append(", cloudCoverBelow500: ");
		result.append(cloudCoverBelow500);
		result.append(')');
		return result.toString();
	}

} //CloudDataImpl
