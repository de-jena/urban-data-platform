/*
 */
package de.jena.model.glt.impl;

import de.jena.model.glt.GltPackage;
import de.jena.model.glt.UpdateStateRequest;

import java.math.BigInteger;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Update State Request</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link de.jena.model.glt.impl.UpdateStateRequestImpl#getSystemId <em>System Id</em>}</li>
 *   <li>{@link de.jena.model.glt.impl.UpdateStateRequestImpl#getAlarmId <em>Alarm Id</em>}</li>
 *   <li>{@link de.jena.model.glt.impl.UpdateStateRequestImpl#getState <em>State</em>}</li>
 *   <li>{@link de.jena.model.glt.impl.UpdateStateRequestImpl#getSeverity <em>Severity</em>}</li>
 *   <li>{@link de.jena.model.glt.impl.UpdateStateRequestImpl#getTimestamp <em>Timestamp</em>}</li>
 * </ul>
 *
 * @generated
 */
public class UpdateStateRequestImpl extends MinimalEObjectImpl.Container implements UpdateStateRequest {
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
	 * The default value of the '{@link #getState() <em>State</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getState()
	 * @generated
	 * @ordered
	 */
	protected static final String STATE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getState() <em>State</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getState()
	 * @generated
	 * @ordered
	 */
	protected String state = STATE_EDEFAULT;

	/**
	 * The default value of the '{@link #getSeverity() <em>Severity</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSeverity()
	 * @generated
	 * @ordered
	 */
	protected static final Integer SEVERITY_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getSeverity() <em>Severity</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSeverity()
	 * @generated
	 * @ordered
	 */
	protected Integer severity = SEVERITY_EDEFAULT;

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
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected UpdateStateRequestImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return GltPackage.eINSTANCE.getUpdateStateRequest();
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
			eNotify(new ENotificationImpl(this, Notification.SET, GltPackage.UPDATE_STATE_REQUEST__SYSTEM_ID, oldSystemId, systemId));
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
			eNotify(new ENotificationImpl(this, Notification.SET, GltPackage.UPDATE_STATE_REQUEST__ALARM_ID, oldAlarmId, alarmId));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getState() {
		return state;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setState(String newState) {
		String oldState = state;
		state = newState;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GltPackage.UPDATE_STATE_REQUEST__STATE, oldState, state));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Integer getSeverity() {
		return severity;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setSeverity(Integer newSeverity) {
		Integer oldSeverity = severity;
		severity = newSeverity;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GltPackage.UPDATE_STATE_REQUEST__SEVERITY, oldSeverity, severity));
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
			eNotify(new ENotificationImpl(this, Notification.SET, GltPackage.UPDATE_STATE_REQUEST__TIMESTAMP, oldTimestamp, timestamp));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case GltPackage.UPDATE_STATE_REQUEST__SYSTEM_ID:
				return getSystemId();
			case GltPackage.UPDATE_STATE_REQUEST__ALARM_ID:
				return getAlarmId();
			case GltPackage.UPDATE_STATE_REQUEST__STATE:
				return getState();
			case GltPackage.UPDATE_STATE_REQUEST__SEVERITY:
				return getSeverity();
			case GltPackage.UPDATE_STATE_REQUEST__TIMESTAMP:
				return getTimestamp();
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
			case GltPackage.UPDATE_STATE_REQUEST__SYSTEM_ID:
				setSystemId((String)newValue);
				return;
			case GltPackage.UPDATE_STATE_REQUEST__ALARM_ID:
				setAlarmId((String)newValue);
				return;
			case GltPackage.UPDATE_STATE_REQUEST__STATE:
				setState((String)newValue);
				return;
			case GltPackage.UPDATE_STATE_REQUEST__SEVERITY:
				setSeverity((Integer)newValue);
				return;
			case GltPackage.UPDATE_STATE_REQUEST__TIMESTAMP:
				setTimestamp((BigInteger)newValue);
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
			case GltPackage.UPDATE_STATE_REQUEST__SYSTEM_ID:
				setSystemId(SYSTEM_ID_EDEFAULT);
				return;
			case GltPackage.UPDATE_STATE_REQUEST__ALARM_ID:
				setAlarmId(ALARM_ID_EDEFAULT);
				return;
			case GltPackage.UPDATE_STATE_REQUEST__STATE:
				setState(STATE_EDEFAULT);
				return;
			case GltPackage.UPDATE_STATE_REQUEST__SEVERITY:
				setSeverity(SEVERITY_EDEFAULT);
				return;
			case GltPackage.UPDATE_STATE_REQUEST__TIMESTAMP:
				setTimestamp(TIMESTAMP_EDEFAULT);
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
			case GltPackage.UPDATE_STATE_REQUEST__SYSTEM_ID:
				return SYSTEM_ID_EDEFAULT == null ? systemId != null : !SYSTEM_ID_EDEFAULT.equals(systemId);
			case GltPackage.UPDATE_STATE_REQUEST__ALARM_ID:
				return ALARM_ID_EDEFAULT == null ? alarmId != null : !ALARM_ID_EDEFAULT.equals(alarmId);
			case GltPackage.UPDATE_STATE_REQUEST__STATE:
				return STATE_EDEFAULT == null ? state != null : !STATE_EDEFAULT.equals(state);
			case GltPackage.UPDATE_STATE_REQUEST__SEVERITY:
				return SEVERITY_EDEFAULT == null ? severity != null : !SEVERITY_EDEFAULT.equals(severity);
			case GltPackage.UPDATE_STATE_REQUEST__TIMESTAMP:
				return TIMESTAMP_EDEFAULT == null ? timestamp != null : !TIMESTAMP_EDEFAULT.equals(timestamp);
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
		result.append(", alarmId: ");
		result.append(alarmId);
		result.append(", state: ");
		result.append(state);
		result.append(", severity: ");
		result.append(severity);
		result.append(", timestamp: ");
		result.append(timestamp);
		result.append(')');
		return result.toString();
	}

} //UpdateStateRequestImpl
