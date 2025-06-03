/*
 */
package de.jena.model.glt.impl;

import de.jena.model.glt.AlarmId;
import de.jena.model.glt.GltPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Alarm Id</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link de.jena.model.glt.impl.AlarmIdImpl#getSystemId <em>System Id</em>}</li>
 *   <li>{@link de.jena.model.glt.impl.AlarmIdImpl#getBuildingId <em>Building Id</em>}</li>
 *   <li>{@link de.jena.model.glt.impl.AlarmIdImpl#getAlarmId <em>Alarm Id</em>}</li>
 * </ul>
 *
 * @generated
 */
public class AlarmIdImpl extends MinimalEObjectImpl.Container implements AlarmId {
	/**
	 * The default value of the '{@link #getSystemId() <em>System Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSystemId()
	 * @generated
	 * @ordered
	 */
	protected static final String SYSTEM_ID_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getSystemId() <em>System Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSystemId()
	 * @generated
	 * @ordered
	 */
	protected String systemId = SYSTEM_ID_EDEFAULT;

	/**
	 * The default value of the '{@link #getBuildingId() <em>Building Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBuildingId()
	 * @generated
	 * @ordered
	 */
	protected static final String BUILDING_ID_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getBuildingId() <em>Building Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBuildingId()
	 * @generated
	 * @ordered
	 */
	protected String buildingId = BUILDING_ID_EDEFAULT;

	/**
	 * The default value of the '{@link #getAlarmId() <em>Alarm Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAlarmId()
	 * @generated
	 * @ordered
	 */
	protected static final String ALARM_ID_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getAlarmId() <em>Alarm Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAlarmId()
	 * @generated
	 * @ordered
	 */
	protected String alarmId = ALARM_ID_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AlarmIdImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return GltPackage.eINSTANCE.getAlarmId();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getSystemId() {
		return systemId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setSystemId(String newSystemId) {
		String oldSystemId = systemId;
		systemId = newSystemId;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GltPackage.ALARM_ID__SYSTEM_ID, oldSystemId, systemId));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getBuildingId() {
		return buildingId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setBuildingId(String newBuildingId) {
		String oldBuildingId = buildingId;
		buildingId = newBuildingId;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GltPackage.ALARM_ID__BUILDING_ID, oldBuildingId, buildingId));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getAlarmId() {
		return alarmId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setAlarmId(String newAlarmId) {
		String oldAlarmId = alarmId;
		alarmId = newAlarmId;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GltPackage.ALARM_ID__ALARM_ID, oldAlarmId, alarmId));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case GltPackage.ALARM_ID__SYSTEM_ID:
				return getSystemId();
			case GltPackage.ALARM_ID__BUILDING_ID:
				return getBuildingId();
			case GltPackage.ALARM_ID__ALARM_ID:
				return getAlarmId();
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
			case GltPackage.ALARM_ID__SYSTEM_ID:
				setSystemId((String)newValue);
				return;
			case GltPackage.ALARM_ID__BUILDING_ID:
				setBuildingId((String)newValue);
				return;
			case GltPackage.ALARM_ID__ALARM_ID:
				setAlarmId((String)newValue);
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
			case GltPackage.ALARM_ID__SYSTEM_ID:
				setSystemId(SYSTEM_ID_EDEFAULT);
				return;
			case GltPackage.ALARM_ID__BUILDING_ID:
				setBuildingId(BUILDING_ID_EDEFAULT);
				return;
			case GltPackage.ALARM_ID__ALARM_ID:
				setAlarmId(ALARM_ID_EDEFAULT);
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
			case GltPackage.ALARM_ID__SYSTEM_ID:
				return SYSTEM_ID_EDEFAULT == null ? systemId != null : !SYSTEM_ID_EDEFAULT.equals(systemId);
			case GltPackage.ALARM_ID__BUILDING_ID:
				return BUILDING_ID_EDEFAULT == null ? buildingId != null : !BUILDING_ID_EDEFAULT.equals(buildingId);
			case GltPackage.ALARM_ID__ALARM_ID:
				return ALARM_ID_EDEFAULT == null ? alarmId != null : !ALARM_ID_EDEFAULT.equals(alarmId);
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
		result.append(" (systemId: ");
		result.append(systemId);
		result.append(", buildingId: ");
		result.append(buildingId);
		result.append(", alarmId: ");
		result.append(alarmId);
		result.append(')');
		return result.toString();
	}

} //AlarmIdImpl
