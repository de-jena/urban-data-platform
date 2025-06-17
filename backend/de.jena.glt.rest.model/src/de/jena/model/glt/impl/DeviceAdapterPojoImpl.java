/*
 */
package de.jena.model.glt.impl;

import de.jena.model.glt.DeviceAdapterPojo;
import de.jena.model.glt.GltPackage;

import java.math.BigInteger;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Device Adapter Pojo</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link de.jena.model.glt.impl.DeviceAdapterPojoImpl#getBuildingId <em>Building Id</em>}</li>
 *   <li>{@link de.jena.model.glt.impl.DeviceAdapterPojoImpl#getDeviceId <em>Device Id</em>}</li>
 *   <li>{@link de.jena.model.glt.impl.DeviceAdapterPojoImpl#getType <em>Type</em>}</li>
 *   <li>{@link de.jena.model.glt.impl.DeviceAdapterPojoImpl#getTimestamp <em>Timestamp</em>}</li>
 *   <li>{@link de.jena.model.glt.impl.DeviceAdapterPojoImpl#getIp <em>Ip</em>}</li>
 *   <li>{@link de.jena.model.glt.impl.DeviceAdapterPojoImpl#getReachable <em>Reachable</em>}</li>
 *   <li>{@link de.jena.model.glt.impl.DeviceAdapterPojoImpl#getSince <em>Since</em>}</li>
 * </ul>
 *
 * @generated
 */
public class DeviceAdapterPojoImpl extends MinimalEObjectImpl.Container implements DeviceAdapterPojo {
	/**
	 * The default value of the '{@link #getBuildingId() <em>Building Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBuildingId()
	 * @generated
	 * @ordered
	 */
	protected static final BigInteger BUILDING_ID_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getBuildingId() <em>Building Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBuildingId()
	 * @generated
	 * @ordered
	 */
	protected BigInteger buildingId = BUILDING_ID_EDEFAULT;

	/**
	 * The default value of the '{@link #getDeviceId() <em>Device Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDeviceId()
	 * @generated
	 * @ordered
	 */
	protected static final BigInteger DEVICE_ID_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDeviceId() <em>Device Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDeviceId()
	 * @generated
	 * @ordered
	 */
	protected BigInteger deviceId = DEVICE_ID_EDEFAULT;

	/**
	 * The default value of the '{@link #getType() <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getType()
	 * @generated
	 * @ordered
	 */
	protected static final String TYPE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getType() <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getType()
	 * @generated
	 * @ordered
	 */
	protected String type = TYPE_EDEFAULT;

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
	protected DeviceAdapterPojoImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return GltPackage.eINSTANCE.getDeviceAdapterPojo();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public BigInteger getBuildingId() {
		return buildingId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setBuildingId(BigInteger newBuildingId) {
		BigInteger oldBuildingId = buildingId;
		buildingId = newBuildingId;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GltPackage.DEVICE_ADAPTER_POJO__BUILDING_ID, oldBuildingId, buildingId));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public BigInteger getDeviceId() {
		return deviceId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setDeviceId(BigInteger newDeviceId) {
		BigInteger oldDeviceId = deviceId;
		deviceId = newDeviceId;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GltPackage.DEVICE_ADAPTER_POJO__DEVICE_ID, oldDeviceId, deviceId));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getType() {
		return type;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setType(String newType) {
		String oldType = type;
		type = newType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GltPackage.DEVICE_ADAPTER_POJO__TYPE, oldType, type));
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
			eNotify(new ENotificationImpl(this, Notification.SET, GltPackage.DEVICE_ADAPTER_POJO__TIMESTAMP, oldTimestamp, timestamp));
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
			eNotify(new ENotificationImpl(this, Notification.SET, GltPackage.DEVICE_ADAPTER_POJO__IP, oldIp, ip));
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
			eNotify(new ENotificationImpl(this, Notification.SET, GltPackage.DEVICE_ADAPTER_POJO__REACHABLE, oldReachable, reachable));
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
			eNotify(new ENotificationImpl(this, Notification.SET, GltPackage.DEVICE_ADAPTER_POJO__SINCE, oldSince, since));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case GltPackage.DEVICE_ADAPTER_POJO__BUILDING_ID:
				return getBuildingId();
			case GltPackage.DEVICE_ADAPTER_POJO__DEVICE_ID:
				return getDeviceId();
			case GltPackage.DEVICE_ADAPTER_POJO__TYPE:
				return getType();
			case GltPackage.DEVICE_ADAPTER_POJO__TIMESTAMP:
				return getTimestamp();
			case GltPackage.DEVICE_ADAPTER_POJO__IP:
				return getIp();
			case GltPackage.DEVICE_ADAPTER_POJO__REACHABLE:
				return getReachable();
			case GltPackage.DEVICE_ADAPTER_POJO__SINCE:
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
			case GltPackage.DEVICE_ADAPTER_POJO__BUILDING_ID:
				setBuildingId((BigInteger)newValue);
				return;
			case GltPackage.DEVICE_ADAPTER_POJO__DEVICE_ID:
				setDeviceId((BigInteger)newValue);
				return;
			case GltPackage.DEVICE_ADAPTER_POJO__TYPE:
				setType((String)newValue);
				return;
			case GltPackage.DEVICE_ADAPTER_POJO__TIMESTAMP:
				setTimestamp((BigInteger)newValue);
				return;
			case GltPackage.DEVICE_ADAPTER_POJO__IP:
				setIp((String)newValue);
				return;
			case GltPackage.DEVICE_ADAPTER_POJO__REACHABLE:
				setReachable((Boolean)newValue);
				return;
			case GltPackage.DEVICE_ADAPTER_POJO__SINCE:
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
			case GltPackage.DEVICE_ADAPTER_POJO__BUILDING_ID:
				setBuildingId(BUILDING_ID_EDEFAULT);
				return;
			case GltPackage.DEVICE_ADAPTER_POJO__DEVICE_ID:
				setDeviceId(DEVICE_ID_EDEFAULT);
				return;
			case GltPackage.DEVICE_ADAPTER_POJO__TYPE:
				setType(TYPE_EDEFAULT);
				return;
			case GltPackage.DEVICE_ADAPTER_POJO__TIMESTAMP:
				setTimestamp(TIMESTAMP_EDEFAULT);
				return;
			case GltPackage.DEVICE_ADAPTER_POJO__IP:
				setIp(IP_EDEFAULT);
				return;
			case GltPackage.DEVICE_ADAPTER_POJO__REACHABLE:
				setReachable(REACHABLE_EDEFAULT);
				return;
			case GltPackage.DEVICE_ADAPTER_POJO__SINCE:
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
			case GltPackage.DEVICE_ADAPTER_POJO__BUILDING_ID:
				return BUILDING_ID_EDEFAULT == null ? buildingId != null : !BUILDING_ID_EDEFAULT.equals(buildingId);
			case GltPackage.DEVICE_ADAPTER_POJO__DEVICE_ID:
				return DEVICE_ID_EDEFAULT == null ? deviceId != null : !DEVICE_ID_EDEFAULT.equals(deviceId);
			case GltPackage.DEVICE_ADAPTER_POJO__TYPE:
				return TYPE_EDEFAULT == null ? type != null : !TYPE_EDEFAULT.equals(type);
			case GltPackage.DEVICE_ADAPTER_POJO__TIMESTAMP:
				return TIMESTAMP_EDEFAULT == null ? timestamp != null : !TIMESTAMP_EDEFAULT.equals(timestamp);
			case GltPackage.DEVICE_ADAPTER_POJO__IP:
				return IP_EDEFAULT == null ? ip != null : !IP_EDEFAULT.equals(ip);
			case GltPackage.DEVICE_ADAPTER_POJO__REACHABLE:
				return REACHABLE_EDEFAULT == null ? reachable != null : !REACHABLE_EDEFAULT.equals(reachable);
			case GltPackage.DEVICE_ADAPTER_POJO__SINCE:
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
		result.append(" (buildingId: ");
		result.append(buildingId);
		result.append(", deviceId: ");
		result.append(deviceId);
		result.append(", type: ");
		result.append(type);
		result.append(", timestamp: ");
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

} //DeviceAdapterPojoImpl
