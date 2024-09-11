/*
 */
package de.jena.mdo.idmt.idmt.impl;

import de.jena.mdo.idmt.idmt.AModelConfiguration;
import de.jena.mdo.idmt.idmt.ARequest;
import de.jena.mdo.idmt.idmt.IdmtPackage;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>ARequest</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link de.jena.mdo.idmt.idmt.impl.ARequestImpl#getRequestId <em>Request Id</em>}</li>
 *   <li>{@link de.jena.mdo.idmt.idmt.impl.ARequestImpl#getConsumerId <em>Consumer Id</em>}</li>
 *   <li>{@link de.jena.mdo.idmt.idmt.impl.ARequestImpl#getConfig <em>Config</em>}</li>
 *   <li>{@link de.jena.mdo.idmt.idmt.impl.ARequestImpl#getSrcUri <em>Src Uri</em>}</li>
 *   <li>{@link de.jena.mdo.idmt.idmt.impl.ARequestImpl#getContentType <em>Content Type</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ARequestImpl extends MinimalEObjectImpl.Container implements ARequest {
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
	 * The default value of the '{@link #getConsumerId() <em>Consumer Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConsumerId()
	 * @generated
	 * @ordered
	 */
	protected static final String CONSUMER_ID_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getConsumerId() <em>Consumer Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConsumerId()
	 * @generated
	 * @ordered
	 */
	protected String consumerId = CONSUMER_ID_EDEFAULT;

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
	 * The default value of the '{@link #getSrcUri() <em>Src Uri</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSrcUri()
	 * @generated
	 * @ordered
	 */
	protected static final String SRC_URI_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getSrcUri() <em>Src Uri</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSrcUri()
	 * @generated
	 * @ordered
	 */
	protected String srcUri = SRC_URI_EDEFAULT;

	/**
	 * The default value of the '{@link #getContentType() <em>Content Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getContentType()
	 * @generated
	 * @ordered
	 */
	protected static final String CONTENT_TYPE_EDEFAULT = "application/csv";

	/**
	 * The cached value of the '{@link #getContentType() <em>Content Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getContentType()
	 * @generated
	 * @ordered
	 */
	protected String contentType = CONTENT_TYPE_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ARequestImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return IdmtPackage.Literals.AREQUEST;
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
			eNotify(new ENotificationImpl(this, Notification.SET, IdmtPackage.AREQUEST__REQUEST_ID, oldRequestId, requestId));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getConsumerId() {
		return consumerId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setConsumerId(String newConsumerId) {
		String oldConsumerId = consumerId;
		consumerId = newConsumerId;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, IdmtPackage.AREQUEST__CONSUMER_ID, oldConsumerId, consumerId));
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, IdmtPackage.AREQUEST__CONFIG, oldConfig, newConfig);
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
				msgs = ((InternalEObject)config).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - IdmtPackage.AREQUEST__CONFIG, null, msgs);
			if (newConfig != null)
				msgs = ((InternalEObject)newConfig).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - IdmtPackage.AREQUEST__CONFIG, null, msgs);
			msgs = basicSetConfig(newConfig, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, IdmtPackage.AREQUEST__CONFIG, newConfig, newConfig));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getSrcUri() {
		return srcUri;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setSrcUri(String newSrcUri) {
		String oldSrcUri = srcUri;
		srcUri = newSrcUri;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, IdmtPackage.AREQUEST__SRC_URI, oldSrcUri, srcUri));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getContentType() {
		return contentType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setContentType(String newContentType) {
		String oldContentType = contentType;
		contentType = newContentType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, IdmtPackage.AREQUEST__CONTENT_TYPE, oldContentType, contentType));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case IdmtPackage.AREQUEST__CONFIG:
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
			case IdmtPackage.AREQUEST__REQUEST_ID:
				return getRequestId();
			case IdmtPackage.AREQUEST__CONSUMER_ID:
				return getConsumerId();
			case IdmtPackage.AREQUEST__CONFIG:
				return getConfig();
			case IdmtPackage.AREQUEST__SRC_URI:
				return getSrcUri();
			case IdmtPackage.AREQUEST__CONTENT_TYPE:
				return getContentType();
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
			case IdmtPackage.AREQUEST__REQUEST_ID:
				setRequestId((String)newValue);
				return;
			case IdmtPackage.AREQUEST__CONSUMER_ID:
				setConsumerId((String)newValue);
				return;
			case IdmtPackage.AREQUEST__CONFIG:
				setConfig((AModelConfiguration)newValue);
				return;
			case IdmtPackage.AREQUEST__SRC_URI:
				setSrcUri((String)newValue);
				return;
			case IdmtPackage.AREQUEST__CONTENT_TYPE:
				setContentType((String)newValue);
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
			case IdmtPackage.AREQUEST__REQUEST_ID:
				setRequestId(REQUEST_ID_EDEFAULT);
				return;
			case IdmtPackage.AREQUEST__CONSUMER_ID:
				setConsumerId(CONSUMER_ID_EDEFAULT);
				return;
			case IdmtPackage.AREQUEST__CONFIG:
				setConfig((AModelConfiguration)null);
				return;
			case IdmtPackage.AREQUEST__SRC_URI:
				setSrcUri(SRC_URI_EDEFAULT);
				return;
			case IdmtPackage.AREQUEST__CONTENT_TYPE:
				setContentType(CONTENT_TYPE_EDEFAULT);
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
			case IdmtPackage.AREQUEST__REQUEST_ID:
				return REQUEST_ID_EDEFAULT == null ? requestId != null : !REQUEST_ID_EDEFAULT.equals(requestId);
			case IdmtPackage.AREQUEST__CONSUMER_ID:
				return CONSUMER_ID_EDEFAULT == null ? consumerId != null : !CONSUMER_ID_EDEFAULT.equals(consumerId);
			case IdmtPackage.AREQUEST__CONFIG:
				return config != null;
			case IdmtPackage.AREQUEST__SRC_URI:
				return SRC_URI_EDEFAULT == null ? srcUri != null : !SRC_URI_EDEFAULT.equals(srcUri);
			case IdmtPackage.AREQUEST__CONTENT_TYPE:
				return CONTENT_TYPE_EDEFAULT == null ? contentType != null : !CONTENT_TYPE_EDEFAULT.equals(contentType);
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
		result.append(", consumerId: ");
		result.append(consumerId);
		result.append(", srcUri: ");
		result.append(srcUri);
		result.append(", contentType: ");
		result.append(contentType);
		result.append(')');
		return result.toString();
	}

} //ARequestImpl
