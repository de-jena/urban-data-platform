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
 *   <li>{@link org.eclipse.fennec.model.sensinact.weatherprovider.impl.CloudDataImpl#getCloudCoverEffective <em>Cloud Cover Effective</em>}</li>
 *   <li>{@link org.eclipse.fennec.model.sensinact.weatherprovider.impl.CloudDataImpl#getCloudCoverHigh <em>Cloud Cover High</em>}</li>
 *   <li>{@link org.eclipse.fennec.model.sensinact.weatherprovider.impl.CloudDataImpl#getCloudCoverMid <em>Cloud Cover Mid</em>}</li>
 *   <li>{@link org.eclipse.fennec.model.sensinact.weatherprovider.impl.CloudDataImpl#getCloudCoverLow <em>Cloud Cover Low</em>}</li>
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
	 * The default value of the '{@link #getCloudCoverEffective() <em>Cloud Cover Effective</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCloudCoverEffective()
	 * @generated
	 * @ordered
	 */
	protected static final Float CLOUD_COVER_EFFECTIVE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getCloudCoverEffective() <em>Cloud Cover Effective</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCloudCoverEffective()
	 * @generated
	 * @ordered
	 */
	protected Float cloudCoverEffective = CLOUD_COVER_EFFECTIVE_EDEFAULT;

	/**
	 * The default value of the '{@link #getCloudCoverHigh() <em>Cloud Cover High</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCloudCoverHigh()
	 * @generated
	 * @ordered
	 */
	protected static final Float CLOUD_COVER_HIGH_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getCloudCoverHigh() <em>Cloud Cover High</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCloudCoverHigh()
	 * @generated
	 * @ordered
	 */
	protected Float cloudCoverHigh = CLOUD_COVER_HIGH_EDEFAULT;

	/**
	 * The default value of the '{@link #getCloudCoverMid() <em>Cloud Cover Mid</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCloudCoverMid()
	 * @generated
	 * @ordered
	 */
	protected static final Float CLOUD_COVER_MID_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getCloudCoverMid() <em>Cloud Cover Mid</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCloudCoverMid()
	 * @generated
	 * @ordered
	 */
	protected Float cloudCoverMid = CLOUD_COVER_MID_EDEFAULT;

	/**
	 * The default value of the '{@link #getCloudCoverLow() <em>Cloud Cover Low</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCloudCoverLow()
	 * @generated
	 * @ordered
	 */
	protected static final Float CLOUD_COVER_LOW_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getCloudCoverLow() <em>Cloud Cover Low</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCloudCoverLow()
	 * @generated
	 * @ordered
	 */
	protected Float cloudCoverLow = CLOUD_COVER_LOW_EDEFAULT;

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
	public Float getCloudCoverEffective() {
		return cloudCoverEffective;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setCloudCoverEffective(Float newCloudCoverEffective) {
		Float oldCloudCoverEffective = cloudCoverEffective;
		cloudCoverEffective = newCloudCoverEffective;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WeatherPackage.CLOUD_DATA__CLOUD_COVER_EFFECTIVE, oldCloudCoverEffective, cloudCoverEffective));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Float getCloudCoverHigh() {
		return cloudCoverHigh;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setCloudCoverHigh(Float newCloudCoverHigh) {
		Float oldCloudCoverHigh = cloudCoverHigh;
		cloudCoverHigh = newCloudCoverHigh;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WeatherPackage.CLOUD_DATA__CLOUD_COVER_HIGH, oldCloudCoverHigh, cloudCoverHigh));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Float getCloudCoverMid() {
		return cloudCoverMid;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setCloudCoverMid(Float newCloudCoverMid) {
		Float oldCloudCoverMid = cloudCoverMid;
		cloudCoverMid = newCloudCoverMid;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WeatherPackage.CLOUD_DATA__CLOUD_COVER_MID, oldCloudCoverMid, cloudCoverMid));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Float getCloudCoverLow() {
		return cloudCoverLow;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setCloudCoverLow(Float newCloudCoverLow) {
		Float oldCloudCoverLow = cloudCoverLow;
		cloudCoverLow = newCloudCoverLow;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WeatherPackage.CLOUD_DATA__CLOUD_COVER_LOW, oldCloudCoverLow, cloudCoverLow));
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
			case WeatherPackage.CLOUD_DATA__CLOUD_COVER_EFFECTIVE:
				return getCloudCoverEffective();
			case WeatherPackage.CLOUD_DATA__CLOUD_COVER_HIGH:
				return getCloudCoverHigh();
			case WeatherPackage.CLOUD_DATA__CLOUD_COVER_MID:
				return getCloudCoverMid();
			case WeatherPackage.CLOUD_DATA__CLOUD_COVER_LOW:
				return getCloudCoverLow();
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
			case WeatherPackage.CLOUD_DATA__CLOUD_COVER_EFFECTIVE:
				setCloudCoverEffective((Float)newValue);
				return;
			case WeatherPackage.CLOUD_DATA__CLOUD_COVER_HIGH:
				setCloudCoverHigh((Float)newValue);
				return;
			case WeatherPackage.CLOUD_DATA__CLOUD_COVER_MID:
				setCloudCoverMid((Float)newValue);
				return;
			case WeatherPackage.CLOUD_DATA__CLOUD_COVER_LOW:
				setCloudCoverLow((Float)newValue);
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
			case WeatherPackage.CLOUD_DATA__CLOUD_COVER_EFFECTIVE:
				setCloudCoverEffective(CLOUD_COVER_EFFECTIVE_EDEFAULT);
				return;
			case WeatherPackage.CLOUD_DATA__CLOUD_COVER_HIGH:
				setCloudCoverHigh(CLOUD_COVER_HIGH_EDEFAULT);
				return;
			case WeatherPackage.CLOUD_DATA__CLOUD_COVER_MID:
				setCloudCoverMid(CLOUD_COVER_MID_EDEFAULT);
				return;
			case WeatherPackage.CLOUD_DATA__CLOUD_COVER_LOW:
				setCloudCoverLow(CLOUD_COVER_LOW_EDEFAULT);
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
			case WeatherPackage.CLOUD_DATA__CLOUD_COVER_EFFECTIVE:
				return CLOUD_COVER_EFFECTIVE_EDEFAULT == null ? cloudCoverEffective != null : !CLOUD_COVER_EFFECTIVE_EDEFAULT.equals(cloudCoverEffective);
			case WeatherPackage.CLOUD_DATA__CLOUD_COVER_HIGH:
				return CLOUD_COVER_HIGH_EDEFAULT == null ? cloudCoverHigh != null : !CLOUD_COVER_HIGH_EDEFAULT.equals(cloudCoverHigh);
			case WeatherPackage.CLOUD_DATA__CLOUD_COVER_MID:
				return CLOUD_COVER_MID_EDEFAULT == null ? cloudCoverMid != null : !CLOUD_COVER_MID_EDEFAULT.equals(cloudCoverMid);
			case WeatherPackage.CLOUD_DATA__CLOUD_COVER_LOW:
				return CLOUD_COVER_LOW_EDEFAULT == null ? cloudCoverLow != null : !CLOUD_COVER_LOW_EDEFAULT.equals(cloudCoverLow);
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
		result.append(", cloudCoverEffective: ");
		result.append(cloudCoverEffective);
		result.append(", cloudCoverHigh: ");
		result.append(cloudCoverHigh);
		result.append(", cloudCoverMid: ");
		result.append(cloudCoverMid);
		result.append(", cloudCoverLow: ");
		result.append(cloudCoverLow);
		result.append(')');
		return result.toString();
	}

} //CloudDataImpl
