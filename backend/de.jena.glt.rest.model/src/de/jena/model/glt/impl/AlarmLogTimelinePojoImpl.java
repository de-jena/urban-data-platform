/*
 */
package de.jena.model.glt.impl;

import de.jena.model.glt.AlarmLogPojo;
import de.jena.model.glt.AlarmLogTimelinePojo;
import de.jena.model.glt.GltPackage;

import java.math.BigInteger;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectResolvingEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Alarm Log Timeline Pojo</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link de.jena.model.glt.impl.AlarmLogTimelinePojoImpl#getAlarmLogs <em>Alarm Logs</em>}</li>
 *   <li>{@link de.jena.model.glt.impl.AlarmLogTimelinePojoImpl#getTotal <em>Total</em>}</li>
 * </ul>
 *
 * @generated
 */
public class AlarmLogTimelinePojoImpl extends MinimalEObjectImpl.Container implements AlarmLogTimelinePojo {
	/**
	 * The cached value of the '{@link #getAlarmLogs() <em>Alarm Logs</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAlarmLogs()
	 * @generated
	 * @ordered
	 */
	protected EList<AlarmLogPojo> alarmLogs;

	/**
	 * The default value of the '{@link #getTotal() <em>Total</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTotal()
	 * @generated
	 * @ordered
	 */
	protected static final BigInteger TOTAL_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getTotal() <em>Total</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTotal()
	 * @generated
	 * @ordered
	 */
	protected BigInteger total = TOTAL_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AlarmLogTimelinePojoImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return GltPackage.eINSTANCE.getAlarmLogTimelinePojo();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<AlarmLogPojo> getAlarmLogs() {
		if (alarmLogs == null) {
			alarmLogs = new EObjectResolvingEList<AlarmLogPojo>(AlarmLogPojo.class, this, GltPackage.ALARM_LOG_TIMELINE_POJO__ALARM_LOGS);
		}
		return alarmLogs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public BigInteger getTotal() {
		return total;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setTotal(BigInteger newTotal) {
		BigInteger oldTotal = total;
		total = newTotal;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GltPackage.ALARM_LOG_TIMELINE_POJO__TOTAL, oldTotal, total));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case GltPackage.ALARM_LOG_TIMELINE_POJO__ALARM_LOGS:
				return getAlarmLogs();
			case GltPackage.ALARM_LOG_TIMELINE_POJO__TOTAL:
				return getTotal();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case GltPackage.ALARM_LOG_TIMELINE_POJO__ALARM_LOGS:
				getAlarmLogs().clear();
				getAlarmLogs().addAll((Collection<? extends AlarmLogPojo>)newValue);
				return;
			case GltPackage.ALARM_LOG_TIMELINE_POJO__TOTAL:
				setTotal((BigInteger)newValue);
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
			case GltPackage.ALARM_LOG_TIMELINE_POJO__ALARM_LOGS:
				getAlarmLogs().clear();
				return;
			case GltPackage.ALARM_LOG_TIMELINE_POJO__TOTAL:
				setTotal(TOTAL_EDEFAULT);
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
			case GltPackage.ALARM_LOG_TIMELINE_POJO__ALARM_LOGS:
				return alarmLogs != null && !alarmLogs.isEmpty();
			case GltPackage.ALARM_LOG_TIMELINE_POJO__TOTAL:
				return TOTAL_EDEFAULT == null ? total != null : !TOTAL_EDEFAULT.equals(total);
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
		result.append(" (total: ");
		result.append(total);
		result.append(')');
		return result.toString();
	}

} //AlarmLogTimelinePojoImpl
