/*
 */
package de.jena.mdo.idmt.idmt.impl;

import de.jena.mdo.idmt.idmt.AModelConfiguration;
import de.jena.mdo.idmt.idmt.AResponse;
import de.jena.mdo.idmt.idmt.IdmtPackage;
import de.jena.mdo.idmt.idmt.ResponseType;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>AResponse</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link de.jena.mdo.idmt.idmt.impl.AResponseImpl#getRequestId <em>Request Id</em>}</li>
 *   <li>{@link de.jena.mdo.idmt.idmt.impl.AResponseImpl#getConfig <em>Config</em>}</li>
 *   <li>{@link de.jena.mdo.idmt.idmt.impl.AResponseImpl#getType <em>Type</em>}</li>
 *   <li>{@link de.jena.mdo.idmt.idmt.impl.AResponseImpl#getStatusMessage <em>Status Message</em>}</li>
 *   <li>{@link de.jena.mdo.idmt.idmt.impl.AResponseImpl#getResultUri <em>Result Uri</em>}</li>
 *   <li>{@link de.jena.mdo.idmt.idmt.impl.AResponseImpl#getResultContentType <em>Result Content Type</em>}</li>
 *   <li>{@link de.jena.mdo.idmt.idmt.impl.AResponseImpl#getElapsedTime <em>Elapsed Time</em>}</li>
 *   <li>{@link de.jena.mdo.idmt.idmt.impl.AResponseImpl#getRemainingTime <em>Remaining Time</em>}</li>
 * </ul>
 *
 * @generated
 */
public class AResponseImpl extends MinimalEObjectImpl.Container implements AResponse {
	/**
	 * The default value of the '{@link #getRequestId() <em>Request Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRequestId()
	 * @generated
	 * @ordered
	 */
	protected static final String REQUEST_ID_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getRequestId() <em>Request Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRequestId()
	 * @generated
	 * @ordered
	 */
	protected String requestId = REQUEST_ID_EDEFAULT;

	/**
	 * The cached value of the '{@link #getConfig() <em>Config</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConfig()
	 * @generated
	 * @ordered
	 */
	protected AModelConfiguration config;

	/**
	 * The default value of the '{@link #getType() <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getType()
	 * @generated
	 * @ordered
	 */
	protected static final ResponseType TYPE_EDEFAULT = ResponseType.DEFAULT;

	/**
	 * The cached value of the '{@link #getType() <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getType()
	 * @generated
	 * @ordered
	 */
	protected ResponseType type = TYPE_EDEFAULT;

	/**
	 * The default value of the '{@link #getStatusMessage() <em>Status Message</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStatusMessage()
	 * @generated
	 * @ordered
	 */
	protected static final String STATUS_MESSAGE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getStatusMessage() <em>Status Message</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStatusMessage()
	 * @generated
	 * @ordered
	 */
	protected String statusMessage = STATUS_MESSAGE_EDEFAULT;

	/**
	 * The default value of the '{@link #getResultUri() <em>Result Uri</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getResultUri()
	 * @generated
	 * @ordered
	 */
	protected static final String RESULT_URI_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getResultUri() <em>Result Uri</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getResultUri()
	 * @generated
	 * @ordered
	 */
	protected String resultUri = RESULT_URI_EDEFAULT;

	/**
	 * The default value of the '{@link #getResultContentType() <em>Result Content Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getResultContentType()
	 * @generated
	 * @ordered
	 */
	protected static final String RESULT_CONTENT_TYPE_EDEFAULT = "application/csv";

	/**
	 * The cached value of the '{@link #getResultContentType() <em>Result Content Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getResultContentType()
	 * @generated
	 * @ordered
	 */
	protected String resultContentType = RESULT_CONTENT_TYPE_EDEFAULT;

	/**
	 * The default value of the '{@link #getElapsedTime() <em>Elapsed Time</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getElapsedTime()
	 * @generated
	 * @ordered
	 */
	protected static final long ELAPSED_TIME_EDEFAULT = 0L;

	/**
	 * The cached value of the '{@link #getElapsedTime() <em>Elapsed Time</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getElapsedTime()
	 * @generated
	 * @ordered
	 */
	protected long elapsedTime = ELAPSED_TIME_EDEFAULT;

	/**
	 * The default value of the '{@link #getRemainingTime() <em>Remaining Time</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRemainingTime()
	 * @generated
	 * @ordered
	 */
	protected static final long REMAINING_TIME_EDEFAULT = 0L;

	/**
	 * The cached value of the '{@link #getRemainingTime() <em>Remaining Time</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRemainingTime()
	 * @generated
	 * @ordered
	 */
	protected long remainingTime = REMAINING_TIME_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AResponseImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return IdmtPackage.Literals.ARESPONSE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getRequestId() {
		return requestId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setRequestId(String newRequestId) {
		String oldRequestId = requestId;
		requestId = newRequestId;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, IdmtPackage.ARESPONSE__REQUEST_ID, oldRequestId, requestId));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public AModelConfiguration getConfig() {
		return config;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetConfig(AModelConfiguration newConfig, NotificationChain msgs) {
		AModelConfiguration oldConfig = config;
		config = newConfig;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, IdmtPackage.ARESPONSE__CONFIG, oldConfig, newConfig);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setConfig(AModelConfiguration newConfig) {
		if (newConfig != config) {
			NotificationChain msgs = null;
			if (config != null)
				msgs = ((InternalEObject)config).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - IdmtPackage.ARESPONSE__CONFIG, null, msgs);
			if (newConfig != null)
				msgs = ((InternalEObject)newConfig).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - IdmtPackage.ARESPONSE__CONFIG, null, msgs);
			msgs = basicSetConfig(newConfig, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, IdmtPackage.ARESPONSE__CONFIG, newConfig, newConfig));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ResponseType getType() {
		return type;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setType(ResponseType newType) {
		ResponseType oldType = type;
		type = newType == null ? TYPE_EDEFAULT : newType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, IdmtPackage.ARESPONSE__TYPE, oldType, type));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getStatusMessage() {
		return statusMessage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setStatusMessage(String newStatusMessage) {
		String oldStatusMessage = statusMessage;
		statusMessage = newStatusMessage;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, IdmtPackage.ARESPONSE__STATUS_MESSAGE, oldStatusMessage, statusMessage));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getResultUri() {
		return resultUri;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setResultUri(String newResultUri) {
		String oldResultUri = resultUri;
		resultUri = newResultUri;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, IdmtPackage.ARESPONSE__RESULT_URI, oldResultUri, resultUri));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getResultContentType() {
		return resultContentType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setResultContentType(String newResultContentType) {
		String oldResultContentType = resultContentType;
		resultContentType = newResultContentType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, IdmtPackage.ARESPONSE__RESULT_CONTENT_TYPE, oldResultContentType, resultContentType));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public long getElapsedTime() {
		return elapsedTime;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setElapsedTime(long newElapsedTime) {
		long oldElapsedTime = elapsedTime;
		elapsedTime = newElapsedTime;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, IdmtPackage.ARESPONSE__ELAPSED_TIME, oldElapsedTime, elapsedTime));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public long getRemainingTime() {
		return remainingTime;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setRemainingTime(long newRemainingTime) {
		long oldRemainingTime = remainingTime;
		remainingTime = newRemainingTime;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, IdmtPackage.ARESPONSE__REMAINING_TIME, oldRemainingTime, remainingTime));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case IdmtPackage.ARESPONSE__CONFIG:
				return basicSetConfig(null, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case IdmtPackage.ARESPONSE__REQUEST_ID:
				return getRequestId();
			case IdmtPackage.ARESPONSE__CONFIG:
				return getConfig();
			case IdmtPackage.ARESPONSE__TYPE:
				return getType();
			case IdmtPackage.ARESPONSE__STATUS_MESSAGE:
				return getStatusMessage();
			case IdmtPackage.ARESPONSE__RESULT_URI:
				return getResultUri();
			case IdmtPackage.ARESPONSE__RESULT_CONTENT_TYPE:
				return getResultContentType();
			case IdmtPackage.ARESPONSE__ELAPSED_TIME:
				return getElapsedTime();
			case IdmtPackage.ARESPONSE__REMAINING_TIME:
				return getRemainingTime();
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
			case IdmtPackage.ARESPONSE__REQUEST_ID:
				setRequestId((String)newValue);
				return;
			case IdmtPackage.ARESPONSE__CONFIG:
				setConfig((AModelConfiguration)newValue);
				return;
			case IdmtPackage.ARESPONSE__TYPE:
				setType((ResponseType)newValue);
				return;
			case IdmtPackage.ARESPONSE__STATUS_MESSAGE:
				setStatusMessage((String)newValue);
				return;
			case IdmtPackage.ARESPONSE__RESULT_URI:
				setResultUri((String)newValue);
				return;
			case IdmtPackage.ARESPONSE__RESULT_CONTENT_TYPE:
				setResultContentType((String)newValue);
				return;
			case IdmtPackage.ARESPONSE__ELAPSED_TIME:
				setElapsedTime((Long)newValue);
				return;
			case IdmtPackage.ARESPONSE__REMAINING_TIME:
				setRemainingTime((Long)newValue);
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
			case IdmtPackage.ARESPONSE__REQUEST_ID:
				setRequestId(REQUEST_ID_EDEFAULT);
				return;
			case IdmtPackage.ARESPONSE__CONFIG:
				setConfig((AModelConfiguration)null);
				return;
			case IdmtPackage.ARESPONSE__TYPE:
				setType(TYPE_EDEFAULT);
				return;
			case IdmtPackage.ARESPONSE__STATUS_MESSAGE:
				setStatusMessage(STATUS_MESSAGE_EDEFAULT);
				return;
			case IdmtPackage.ARESPONSE__RESULT_URI:
				setResultUri(RESULT_URI_EDEFAULT);
				return;
			case IdmtPackage.ARESPONSE__RESULT_CONTENT_TYPE:
				setResultContentType(RESULT_CONTENT_TYPE_EDEFAULT);
				return;
			case IdmtPackage.ARESPONSE__ELAPSED_TIME:
				setElapsedTime(ELAPSED_TIME_EDEFAULT);
				return;
			case IdmtPackage.ARESPONSE__REMAINING_TIME:
				setRemainingTime(REMAINING_TIME_EDEFAULT);
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
			case IdmtPackage.ARESPONSE__REQUEST_ID:
				return REQUEST_ID_EDEFAULT == null ? requestId != null : !REQUEST_ID_EDEFAULT.equals(requestId);
			case IdmtPackage.ARESPONSE__CONFIG:
				return config != null;
			case IdmtPackage.ARESPONSE__TYPE:
				return type != TYPE_EDEFAULT;
			case IdmtPackage.ARESPONSE__STATUS_MESSAGE:
				return STATUS_MESSAGE_EDEFAULT == null ? statusMessage != null : !STATUS_MESSAGE_EDEFAULT.equals(statusMessage);
			case IdmtPackage.ARESPONSE__RESULT_URI:
				return RESULT_URI_EDEFAULT == null ? resultUri != null : !RESULT_URI_EDEFAULT.equals(resultUri);
			case IdmtPackage.ARESPONSE__RESULT_CONTENT_TYPE:
				return RESULT_CONTENT_TYPE_EDEFAULT == null ? resultContentType != null : !RESULT_CONTENT_TYPE_EDEFAULT.equals(resultContentType);
			case IdmtPackage.ARESPONSE__ELAPSED_TIME:
				return elapsedTime != ELAPSED_TIME_EDEFAULT;
			case IdmtPackage.ARESPONSE__REMAINING_TIME:
				return remainingTime != REMAINING_TIME_EDEFAULT;
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
		result.append(" (requestId: ");
		result.append(requestId);
		result.append(", type: ");
		result.append(type);
		result.append(", statusMessage: ");
		result.append(statusMessage);
		result.append(", resultUri: ");
		result.append(resultUri);
		result.append(", resultContentType: ");
		result.append(resultContentType);
		result.append(", elapsedTime: ");
		result.append(elapsedTime);
		result.append(", remainingTime: ");
		result.append(remainingTime);
		result.append(')');
		return result.toString();
	}

} //AResponseImpl
