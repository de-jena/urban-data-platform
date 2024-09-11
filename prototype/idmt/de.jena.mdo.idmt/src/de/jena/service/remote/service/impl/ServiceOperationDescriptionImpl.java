/*
 */
package de.jena.service.remote.service.impl;

import de.jena.service.remote.service.ServiceOperationDescription;
import de.jena.service.remote.service.ServicePackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EOperation;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Operation Description</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link de.jena.service.remote.service.impl.ServiceOperationDescriptionImpl#getOperationId <em>Operation Id</em>}</li>
 *   <li>{@link de.jena.service.remote.service.impl.ServiceOperationDescriptionImpl#getName <em>Name</em>}</li>
 *   <li>{@link de.jena.service.remote.service.impl.ServiceOperationDescriptionImpl#getOperationRequestUri <em>Operation Request Uri</em>}</li>
 *   <li>{@link de.jena.service.remote.service.impl.ServiceOperationDescriptionImpl#getOperationResponseUri <em>Operation Response Uri</em>}</li>
 *   <li>{@link de.jena.service.remote.service.impl.ServiceOperationDescriptionImpl#getOperation <em>Operation</em>}</li>
 *   <li>{@link de.jena.service.remote.service.impl.ServiceOperationDescriptionImpl#getOperationType <em>Operation Type</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ServiceOperationDescriptionImpl extends MinimalEObjectImpl.Container implements ServiceOperationDescription {
	/**
	 * The default value of the '{@link #getOperationId() <em>Operation Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOperationId()
	 * @generated
	 * @ordered
	 */
	protected static final String OPERATION_ID_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getOperationId() <em>Operation Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOperationId()
	 * @generated
	 * @ordered
	 */
	protected String operationId = OPERATION_ID_EDEFAULT;

	/**
	 * The default value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected static final String NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected String name = NAME_EDEFAULT;

	/**
	 * The default value of the '{@link #getOperationRequestUri() <em>Operation Request Uri</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOperationRequestUri()
	 * @generated
	 * @ordered
	 */
	protected static final String OPERATION_REQUEST_URI_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getOperationRequestUri() <em>Operation Request Uri</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOperationRequestUri()
	 * @generated
	 * @ordered
	 */
	protected String operationRequestUri = OPERATION_REQUEST_URI_EDEFAULT;

	/**
	 * The default value of the '{@link #getOperationResponseUri() <em>Operation Response Uri</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOperationResponseUri()
	 * @generated
	 * @ordered
	 */
	protected static final String OPERATION_RESPONSE_URI_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getOperationResponseUri() <em>Operation Response Uri</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOperationResponseUri()
	 * @generated
	 * @ordered
	 */
	protected String operationResponseUri = OPERATION_RESPONSE_URI_EDEFAULT;

	/**
	 * The cached value of the '{@link #getOperation() <em>Operation</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOperation()
	 * @generated
	 * @ordered
	 */
	protected EOperation operation;

	/**
	 * The default value of the '{@link #getOperationType() <em>Operation Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOperationType()
	 * @generated
	 * @ordered
	 */
	protected static final String OPERATION_TYPE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getOperationType() <em>Operation Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOperationType()
	 * @generated
	 * @ordered
	 */
	protected String operationType = OPERATION_TYPE_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ServiceOperationDescriptionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ServicePackage.Literals.SERVICE_OPERATION_DESCRIPTION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getOperationId() {
		return operationId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setOperationId(String newOperationId) {
		String oldOperationId = operationId;
		operationId = newOperationId;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ServicePackage.SERVICE_OPERATION_DESCRIPTION__OPERATION_ID, oldOperationId, operationId));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getName() {
		return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setName(String newName) {
		String oldName = name;
		name = newName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ServicePackage.SERVICE_OPERATION_DESCRIPTION__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getOperationRequestUri() {
		return operationRequestUri;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setOperationRequestUri(String newOperationRequestUri) {
		String oldOperationRequestUri = operationRequestUri;
		operationRequestUri = newOperationRequestUri;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ServicePackage.SERVICE_OPERATION_DESCRIPTION__OPERATION_REQUEST_URI, oldOperationRequestUri, operationRequestUri));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getOperationResponseUri() {
		return operationResponseUri;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setOperationResponseUri(String newOperationResponseUri) {
		String oldOperationResponseUri = operationResponseUri;
		operationResponseUri = newOperationResponseUri;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ServicePackage.SERVICE_OPERATION_DESCRIPTION__OPERATION_RESPONSE_URI, oldOperationResponseUri, operationResponseUri));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getOperation() {
		if (operation != null && operation.eIsProxy()) {
			InternalEObject oldOperation = (InternalEObject)operation;
			operation = (EOperation)eResolveProxy(oldOperation);
			if (operation != oldOperation) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ServicePackage.SERVICE_OPERATION_DESCRIPTION__OPERATION, oldOperation, operation));
			}
		}
		return operation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation basicGetOperation() {
		return operation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setOperation(EOperation newOperation) {
		EOperation oldOperation = operation;
		operation = newOperation;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ServicePackage.SERVICE_OPERATION_DESCRIPTION__OPERATION, oldOperation, operation));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getOperationType() {
		return operationType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setOperationType(String newOperationType) {
		String oldOperationType = operationType;
		operationType = newOperationType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ServicePackage.SERVICE_OPERATION_DESCRIPTION__OPERATION_TYPE, oldOperationType, operationType));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case ServicePackage.SERVICE_OPERATION_DESCRIPTION__OPERATION_ID:
				return getOperationId();
			case ServicePackage.SERVICE_OPERATION_DESCRIPTION__NAME:
				return getName();
			case ServicePackage.SERVICE_OPERATION_DESCRIPTION__OPERATION_REQUEST_URI:
				return getOperationRequestUri();
			case ServicePackage.SERVICE_OPERATION_DESCRIPTION__OPERATION_RESPONSE_URI:
				return getOperationResponseUri();
			case ServicePackage.SERVICE_OPERATION_DESCRIPTION__OPERATION:
				if (resolve) return getOperation();
				return basicGetOperation();
			case ServicePackage.SERVICE_OPERATION_DESCRIPTION__OPERATION_TYPE:
				return getOperationType();
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
			case ServicePackage.SERVICE_OPERATION_DESCRIPTION__OPERATION_ID:
				setOperationId((String)newValue);
				return;
			case ServicePackage.SERVICE_OPERATION_DESCRIPTION__NAME:
				setName((String)newValue);
				return;
			case ServicePackage.SERVICE_OPERATION_DESCRIPTION__OPERATION_REQUEST_URI:
				setOperationRequestUri((String)newValue);
				return;
			case ServicePackage.SERVICE_OPERATION_DESCRIPTION__OPERATION_RESPONSE_URI:
				setOperationResponseUri((String)newValue);
				return;
			case ServicePackage.SERVICE_OPERATION_DESCRIPTION__OPERATION:
				setOperation((EOperation)newValue);
				return;
			case ServicePackage.SERVICE_OPERATION_DESCRIPTION__OPERATION_TYPE:
				setOperationType((String)newValue);
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
			case ServicePackage.SERVICE_OPERATION_DESCRIPTION__OPERATION_ID:
				setOperationId(OPERATION_ID_EDEFAULT);
				return;
			case ServicePackage.SERVICE_OPERATION_DESCRIPTION__NAME:
				setName(NAME_EDEFAULT);
				return;
			case ServicePackage.SERVICE_OPERATION_DESCRIPTION__OPERATION_REQUEST_URI:
				setOperationRequestUri(OPERATION_REQUEST_URI_EDEFAULT);
				return;
			case ServicePackage.SERVICE_OPERATION_DESCRIPTION__OPERATION_RESPONSE_URI:
				setOperationResponseUri(OPERATION_RESPONSE_URI_EDEFAULT);
				return;
			case ServicePackage.SERVICE_OPERATION_DESCRIPTION__OPERATION:
				setOperation((EOperation)null);
				return;
			case ServicePackage.SERVICE_OPERATION_DESCRIPTION__OPERATION_TYPE:
				setOperationType(OPERATION_TYPE_EDEFAULT);
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
			case ServicePackage.SERVICE_OPERATION_DESCRIPTION__OPERATION_ID:
				return OPERATION_ID_EDEFAULT == null ? operationId != null : !OPERATION_ID_EDEFAULT.equals(operationId);
			case ServicePackage.SERVICE_OPERATION_DESCRIPTION__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case ServicePackage.SERVICE_OPERATION_DESCRIPTION__OPERATION_REQUEST_URI:
				return OPERATION_REQUEST_URI_EDEFAULT == null ? operationRequestUri != null : !OPERATION_REQUEST_URI_EDEFAULT.equals(operationRequestUri);
			case ServicePackage.SERVICE_OPERATION_DESCRIPTION__OPERATION_RESPONSE_URI:
				return OPERATION_RESPONSE_URI_EDEFAULT == null ? operationResponseUri != null : !OPERATION_RESPONSE_URI_EDEFAULT.equals(operationResponseUri);
			case ServicePackage.SERVICE_OPERATION_DESCRIPTION__OPERATION:
				return operation != null;
			case ServicePackage.SERVICE_OPERATION_DESCRIPTION__OPERATION_TYPE:
				return OPERATION_TYPE_EDEFAULT == null ? operationType != null : !OPERATION_TYPE_EDEFAULT.equals(operationType);
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
		result.append(" (operationId: ");
		result.append(operationId);
		result.append(", name: ");
		result.append(name);
		result.append(", operationRequestUri: ");
		result.append(operationRequestUri);
		result.append(", operationResponseUri: ");
		result.append(operationResponseUri);
		result.append(", operationType: ");
		result.append(operationType);
		result.append(')');
		return result.toString();
	}

} //ServiceOperationDescriptionImpl
