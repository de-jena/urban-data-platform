/*
 */
package de.jena.model.glt.impl;

import de.jena.model.glt.DeviceConnectionPojo;
import de.jena.model.glt.GltPackage;

import java.math.BigInteger;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Device Connection Pojo</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link de.jena.model.glt.impl.DeviceConnectionPojoImpl#getTimestamp <em>Timestamp</em>}</li>
 *   <li>{@link de.jena.model.glt.impl.DeviceConnectionPojoImpl#getIp <em>Ip</em>}</li>
 *   <li>{@link de.jena.model.glt.impl.DeviceConnectionPojoImpl#getReachable <em>Reachable</em>}</li>
 *   <li>{@link de.jena.model.glt.impl.DeviceConnectionPojoImpl#getSince <em>Since</em>}</li>
 * </ul>
 *
 * @generated
 */
public class DeviceConnectionPojoImpl extends MinimalEObjectImpl.Container implements DeviceConnectionPojo {
	/**
	 * The default value of the '{@link #getTimestamp() <em>Timestamp</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTimestamp()
	 * @generated
	 * @ordered
	 */
	protected static final BigInteger TIMESTAMP_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getTimestamp() <em>Timestamp</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTimestamp()
	 * @generated
	 * @ordered
	 */
	protected BigInteger timestamp = TIMESTAMP_EDEFAULT;

	/**
	 * The default value of the '{@link #getIp() <em>Ip</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIp()
	 * @generated
	 * @ordered
	 */
	protected static final String IP_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getIp() <em>Ip</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIp()
	 * @generated
	 * @ordered
	 */
	protected String ip = IP_EDEFAULT;

	/**
	 * The default value of the '{@link #getReachable() <em>Reachable</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReachable()
	 * @generated
	 * @ordered
	 */
	protected static final Boolean REACHABLE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getReachable() <em>Reachable</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReachable()
	 * @generated
	 * @ordered
	 */
	protected Boolean reachable = REACHABLE_EDEFAULT;

	/**
	 * The default value of the '{@link #getSince() <em>Since</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSince()
	 * @generated
	 * @ordered
	 */
	protected static final BigInteger SINCE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getSince() <em>Since</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSince()
	 * @generated
	 * @ordered
	 */
	protected BigInteger since = SINCE_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DeviceConnectionPojoImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return GltPackage.eINSTANCE.getDeviceConnectionPojo();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public BigInteger getTimestamp() {
		return timestamp;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setTimestamp(BigInteger newTimestamp) {
		BigInteger oldTimestamp = timestamp;
		timestamp = newTimestamp;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GltPackage.DEVICE_CONNECTION_POJO__TIMESTAMP, oldTimestamp, timestamp));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getIp() {
		return ip;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setIp(String newIp) {
		String oldIp = ip;
		ip = newIp;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GltPackage.DEVICE_CONNECTION_POJO__IP, oldIp, ip));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Boolean getReachable() {
		return reachable;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setReachable(Boolean newReachable) {
		Boolean oldReachable = reachable;
		reachable = newReachable;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GltPackage.DEVICE_CONNECTION_POJO__REACHABLE, oldReachable, reachable));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public BigInteger getSince() {
		return since;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setSince(BigInteger newSince) {
		BigInteger oldSince = since;
		since = newSince;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GltPackage.DEVICE_CONNECTION_POJO__SINCE, oldSince, since));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case GltPackage.DEVICE_CONNECTION_POJO__TIMESTAMP:
				return getTimestamp();
			case GltPackage.DEVICE_CONNECTION_POJO__IP:
				return getIp();
			case GltPackage.DEVICE_CONNECTION_POJO__REACHABLE:
				return getReachable();
			case GltPackage.DEVICE_CONNECTION_POJO__SINCE:
				return getSince();
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
			case GltPackage.DEVICE_CONNECTION_POJO__TIMESTAMP:
				setTimestamp((BigInteger)newValue);
				return;
			case GltPackage.DEVICE_CONNECTION_POJO__IP:
				setIp((String)newValue);
				return;
			case GltPackage.DEVICE_CONNECTION_POJO__REACHABLE:
				setReachable((Boolean)newValue);
				return;
			case GltPackage.DEVICE_CONNECTION_POJO__SINCE:
				setSince((BigInteger)newValue);
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
			case GltPackage.DEVICE_CONNECTION_POJO__TIMESTAMP:
				setTimestamp(TIMESTAMP_EDEFAULT);
				return;
			case GltPackage.DEVICE_CONNECTION_POJO__IP:
				setIp(IP_EDEFAULT);
				return;
			case GltPackage.DEVICE_CONNECTION_POJO__REACHABLE:
				setReachable(REACHABLE_EDEFAULT);
				return;
			case GltPackage.DEVICE_CONNECTION_POJO__SINCE:
				setSince(SINCE_EDEFAULT);
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
			case GltPackage.DEVICE_CONNECTION_POJO__TIMESTAMP:
				return TIMESTAMP_EDEFAULT == null ? timestamp != null : !TIMESTAMP_EDEFAULT.equals(timestamp);
			case GltPackage.DEVICE_CONNECTION_POJO__IP:
				return IP_EDEFAULT == null ? ip != null : !IP_EDEFAULT.equals(ip);
			case GltPackage.DEVICE_CONNECTION_POJO__REACHABLE:
				return REACHABLE_EDEFAULT == null ? reachable != null : !REACHABLE_EDEFAULT.equals(reachable);
			case GltPackage.DEVICE_CONNECTION_POJO__SINCE:
				return SINCE_EDEFAULT == null ? since != null : !SINCE_EDEFAULT.equals(since);
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
		result.append(" (timestamp: ");
		result.append(timestamp);
		result.append(", ip: ");
		result.append(ip);
		result.append(", reachable: ");
		result.append(reachable);
		result.append(", since: ");
		result.append(since);
		result.append(')');
		return result.toString();
	}

} //DeviceConnectionPojoImpl
