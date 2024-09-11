/*
 */
package de.jena.service.remote.service.impl;

import de.jena.service.remote.service.ServiceDescription;
import de.jena.service.remote.service.ServiceLifeCycleState;
import de.jena.service.remote.service.ServiceOperationDescription;
import de.jena.service.remote.service.ServicePackage;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EClassifier;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Description</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link de.jena.service.remote.service.impl.ServiceDescriptionImpl#getServiceId <em>Service Id</em>}</li>
 *   <li>{@link de.jena.service.remote.service.impl.ServiceDescriptionImpl#getProviderId <em>Provider Id</em>}</li>
 *   <li>{@link de.jena.service.remote.service.impl.ServiceDescriptionImpl#getName <em>Name</em>}</li>
 *   <li>{@link de.jena.service.remote.service.impl.ServiceDescriptionImpl#getVendor <em>Vendor</em>}</li>
 *   <li>{@link de.jena.service.remote.service.impl.ServiceDescriptionImpl#getRank <em>Rank</em>}</li>
 *   <li>{@link de.jena.service.remote.service.impl.ServiceDescriptionImpl#getSourceUri <em>Source Uri</em>}</li>
 *   <li>{@link de.jena.service.remote.service.impl.ServiceDescriptionImpl#getContentType <em>Content Type</em>}</li>
 *   <li>{@link de.jena.service.remote.service.impl.ServiceDescriptionImpl#getLifeCycleState <em>Life Cycle State</em>}</li>
 *   <li>{@link de.jena.service.remote.service.impl.ServiceDescriptionImpl#getServiceType <em>Service Type</em>}</li>
 *   <li>{@link de.jena.service.remote.service.impl.ServiceDescriptionImpl#getServiceClass <em>Service Class</em>}</li>
 *   <li>{@link de.jena.service.remote.service.impl.ServiceDescriptionImpl#getOperation <em>Operation</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ServiceDescriptionImpl extends MinimalEObjectImpl.Container implements ServiceDescription {
	/**
	 * The default value of the '{@link #getServiceId() <em>Service Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getServiceId()
	 * @generated
	 * @ordered
	 */
	protected static final String SERVICE_ID_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getServiceId() <em>Service Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getServiceId()
	 * @generated
	 * @ordered
	 */
	protected String serviceId = SERVICE_ID_EDEFAULT;

	/**
	 * The default value of the '{@link #getProviderId() <em>Provider Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProviderId()
	 * @generated
	 * @ordered
	 */
	protected static final String PROVIDER_ID_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getProviderId() <em>Provider Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProviderId()
	 * @generated
	 * @ordered
	 */
	protected String providerId = PROVIDER_ID_EDEFAULT;

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
	 * The default value of the '{@link #getVendor() <em>Vendor</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVendor()
	 * @generated
	 * @ordered
	 */
	protected static final String VENDOR_EDEFAULT = "application/csv";

	/**
	 * The cached value of the '{@link #getVendor() <em>Vendor</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVendor()
	 * @generated
	 * @ordered
	 */
	protected String vendor = VENDOR_EDEFAULT;

	/**
	 * The default value of the '{@link #getRank() <em>Rank</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRank()
	 * @generated
	 * @ordered
	 */
	protected static final int RANK_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getRank() <em>Rank</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRank()
	 * @generated
	 * @ordered
	 */
	protected int rank = RANK_EDEFAULT;

	/**
	 * The default value of the '{@link #getSourceUri() <em>Source Uri</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSourceUri()
	 * @generated
	 * @ordered
	 */
	protected static final String SOURCE_URI_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getSourceUri() <em>Source Uri</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSourceUri()
	 * @generated
	 * @ordered
	 */
	protected String sourceUri = SOURCE_URI_EDEFAULT;

	/**
	 * The default value of the '{@link #getContentType() <em>Content Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getContentType()
	 * @generated
	 * @ordered
	 */
	protected static final String CONTENT_TYPE_EDEFAULT = null;

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
	 * The default value of the '{@link #getLifeCycleState() <em>Life Cycle State</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLifeCycleState()
	 * @generated
	 * @ordered
	 */
	protected static final ServiceLifeCycleState LIFE_CYCLE_STATE_EDEFAULT = ServiceLifeCycleState.ANNOUNCE;

	/**
	 * The cached value of the '{@link #getLifeCycleState() <em>Life Cycle State</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLifeCycleState()
	 * @generated
	 * @ordered
	 */
	protected ServiceLifeCycleState lifeCycleState = LIFE_CYCLE_STATE_EDEFAULT;

	/**
	 * The default value of the '{@link #getServiceType() <em>Service Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getServiceType()
	 * @generated
	 * @ordered
	 */
	protected static final String SERVICE_TYPE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getServiceType() <em>Service Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getServiceType()
	 * @generated
	 * @ordered
	 */
	protected String serviceType = SERVICE_TYPE_EDEFAULT;

	/**
	 * The cached value of the '{@link #getServiceClass() <em>Service Class</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getServiceClass()
	 * @generated
	 * @ordered
	 */
	protected EClassifier serviceClass;

	/**
	 * The cached value of the '{@link #getOperation() <em>Operation</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOperation()
	 * @generated
	 * @ordered
	 */
	protected EList<ServiceOperationDescription> operation;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ServiceDescriptionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ServicePackage.Literals.SERVICE_DESCRIPTION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getServiceId() {
		return serviceId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setServiceId(String newServiceId) {
		String oldServiceId = serviceId;
		serviceId = newServiceId;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ServicePackage.SERVICE_DESCRIPTION__SERVICE_ID, oldServiceId, serviceId));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getProviderId() {
		return providerId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setProviderId(String newProviderId) {
		String oldProviderId = providerId;
		providerId = newProviderId;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ServicePackage.SERVICE_DESCRIPTION__PROVIDER_ID, oldProviderId, providerId));
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
			eNotify(new ENotificationImpl(this, Notification.SET, ServicePackage.SERVICE_DESCRIPTION__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getVendor() {
		return vendor;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setVendor(String newVendor) {
		String oldVendor = vendor;
		vendor = newVendor;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ServicePackage.SERVICE_DESCRIPTION__VENDOR, oldVendor, vendor));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int getRank() {
		return rank;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setRank(int newRank) {
		int oldRank = rank;
		rank = newRank;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ServicePackage.SERVICE_DESCRIPTION__RANK, oldRank, rank));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getSourceUri() {
		return sourceUri;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setSourceUri(String newSourceUri) {
		String oldSourceUri = sourceUri;
		sourceUri = newSourceUri;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ServicePackage.SERVICE_DESCRIPTION__SOURCE_URI, oldSourceUri, sourceUri));
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
			eNotify(new ENotificationImpl(this, Notification.SET, ServicePackage.SERVICE_DESCRIPTION__CONTENT_TYPE, oldContentType, contentType));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ServiceLifeCycleState getLifeCycleState() {
		return lifeCycleState;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setLifeCycleState(ServiceLifeCycleState newLifeCycleState) {
		ServiceLifeCycleState oldLifeCycleState = lifeCycleState;
		lifeCycleState = newLifeCycleState == null ? LIFE_CYCLE_STATE_EDEFAULT : newLifeCycleState;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ServicePackage.SERVICE_DESCRIPTION__LIFE_CYCLE_STATE, oldLifeCycleState, lifeCycleState));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getServiceType() {
		return serviceType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setServiceType(String newServiceType) {
		String oldServiceType = serviceType;
		serviceType = newServiceType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ServicePackage.SERVICE_DESCRIPTION__SERVICE_TYPE, oldServiceType, serviceType));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClassifier getServiceClass() {
		if (serviceClass != null && serviceClass.eIsProxy()) {
			InternalEObject oldServiceClass = (InternalEObject)serviceClass;
			serviceClass = (EClassifier)eResolveProxy(oldServiceClass);
			if (serviceClass != oldServiceClass) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ServicePackage.SERVICE_DESCRIPTION__SERVICE_CLASS, oldServiceClass, serviceClass));
			}
		}
		return serviceClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClassifier basicGetServiceClass() {
		return serviceClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setServiceClass(EClassifier newServiceClass) {
		EClassifier oldServiceClass = serviceClass;
		serviceClass = newServiceClass;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ServicePackage.SERVICE_DESCRIPTION__SERVICE_CLASS, oldServiceClass, serviceClass));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<ServiceOperationDescription> getOperation() {
		if (operation == null) {
			operation = new EObjectContainmentEList<ServiceOperationDescription>(ServiceOperationDescription.class, this, ServicePackage.SERVICE_DESCRIPTION__OPERATION);
		}
		return operation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ServicePackage.SERVICE_DESCRIPTION__OPERATION:
				return ((InternalEList<?>)getOperation()).basicRemove(otherEnd, msgs);
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
			case ServicePackage.SERVICE_DESCRIPTION__SERVICE_ID:
				return getServiceId();
			case ServicePackage.SERVICE_DESCRIPTION__PROVIDER_ID:
				return getProviderId();
			case ServicePackage.SERVICE_DESCRIPTION__NAME:
				return getName();
			case ServicePackage.SERVICE_DESCRIPTION__VENDOR:
				return getVendor();
			case ServicePackage.SERVICE_DESCRIPTION__RANK:
				return getRank();
			case ServicePackage.SERVICE_DESCRIPTION__SOURCE_URI:
				return getSourceUri();
			case ServicePackage.SERVICE_DESCRIPTION__CONTENT_TYPE:
				return getContentType();
			case ServicePackage.SERVICE_DESCRIPTION__LIFE_CYCLE_STATE:
				return getLifeCycleState();
			case ServicePackage.SERVICE_DESCRIPTION__SERVICE_TYPE:
				return getServiceType();
			case ServicePackage.SERVICE_DESCRIPTION__SERVICE_CLASS:
				if (resolve) return getServiceClass();
				return basicGetServiceClass();
			case ServicePackage.SERVICE_DESCRIPTION__OPERATION:
				return getOperation();
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
			case ServicePackage.SERVICE_DESCRIPTION__SERVICE_ID:
				setServiceId((String)newValue);
				return;
			case ServicePackage.SERVICE_DESCRIPTION__PROVIDER_ID:
				setProviderId((String)newValue);
				return;
			case ServicePackage.SERVICE_DESCRIPTION__NAME:
				setName((String)newValue);
				return;
			case ServicePackage.SERVICE_DESCRIPTION__VENDOR:
				setVendor((String)newValue);
				return;
			case ServicePackage.SERVICE_DESCRIPTION__RANK:
				setRank((Integer)newValue);
				return;
			case ServicePackage.SERVICE_DESCRIPTION__SOURCE_URI:
				setSourceUri((String)newValue);
				return;
			case ServicePackage.SERVICE_DESCRIPTION__CONTENT_TYPE:
				setContentType((String)newValue);
				return;
			case ServicePackage.SERVICE_DESCRIPTION__LIFE_CYCLE_STATE:
				setLifeCycleState((ServiceLifeCycleState)newValue);
				return;
			case ServicePackage.SERVICE_DESCRIPTION__SERVICE_TYPE:
				setServiceType((String)newValue);
				return;
			case ServicePackage.SERVICE_DESCRIPTION__SERVICE_CLASS:
				setServiceClass((EClassifier)newValue);
				return;
			case ServicePackage.SERVICE_DESCRIPTION__OPERATION:
				getOperation().clear();
				getOperation().addAll((Collection<? extends ServiceOperationDescription>)newValue);
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
			case ServicePackage.SERVICE_DESCRIPTION__SERVICE_ID:
				setServiceId(SERVICE_ID_EDEFAULT);
				return;
			case ServicePackage.SERVICE_DESCRIPTION__PROVIDER_ID:
				setProviderId(PROVIDER_ID_EDEFAULT);
				return;
			case ServicePackage.SERVICE_DESCRIPTION__NAME:
				setName(NAME_EDEFAULT);
				return;
			case ServicePackage.SERVICE_DESCRIPTION__VENDOR:
				setVendor(VENDOR_EDEFAULT);
				return;
			case ServicePackage.SERVICE_DESCRIPTION__RANK:
				setRank(RANK_EDEFAULT);
				return;
			case ServicePackage.SERVICE_DESCRIPTION__SOURCE_URI:
				setSourceUri(SOURCE_URI_EDEFAULT);
				return;
			case ServicePackage.SERVICE_DESCRIPTION__CONTENT_TYPE:
				setContentType(CONTENT_TYPE_EDEFAULT);
				return;
			case ServicePackage.SERVICE_DESCRIPTION__LIFE_CYCLE_STATE:
				setLifeCycleState(LIFE_CYCLE_STATE_EDEFAULT);
				return;
			case ServicePackage.SERVICE_DESCRIPTION__SERVICE_TYPE:
				setServiceType(SERVICE_TYPE_EDEFAULT);
				return;
			case ServicePackage.SERVICE_DESCRIPTION__SERVICE_CLASS:
				setServiceClass((EClassifier)null);
				return;
			case ServicePackage.SERVICE_DESCRIPTION__OPERATION:
				getOperation().clear();
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
			case ServicePackage.SERVICE_DESCRIPTION__SERVICE_ID:
				return SERVICE_ID_EDEFAULT == null ? serviceId != null : !SERVICE_ID_EDEFAULT.equals(serviceId);
			case ServicePackage.SERVICE_DESCRIPTION__PROVIDER_ID:
				return PROVIDER_ID_EDEFAULT == null ? providerId != null : !PROVIDER_ID_EDEFAULT.equals(providerId);
			case ServicePackage.SERVICE_DESCRIPTION__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case ServicePackage.SERVICE_DESCRIPTION__VENDOR:
				return VENDOR_EDEFAULT == null ? vendor != null : !VENDOR_EDEFAULT.equals(vendor);
			case ServicePackage.SERVICE_DESCRIPTION__RANK:
				return rank != RANK_EDEFAULT;
			case ServicePackage.SERVICE_DESCRIPTION__SOURCE_URI:
				return SOURCE_URI_EDEFAULT == null ? sourceUri != null : !SOURCE_URI_EDEFAULT.equals(sourceUri);
			case ServicePackage.SERVICE_DESCRIPTION__CONTENT_TYPE:
				return CONTENT_TYPE_EDEFAULT == null ? contentType != null : !CONTENT_TYPE_EDEFAULT.equals(contentType);
			case ServicePackage.SERVICE_DESCRIPTION__LIFE_CYCLE_STATE:
				return lifeCycleState != LIFE_CYCLE_STATE_EDEFAULT;
			case ServicePackage.SERVICE_DESCRIPTION__SERVICE_TYPE:
				return SERVICE_TYPE_EDEFAULT == null ? serviceType != null : !SERVICE_TYPE_EDEFAULT.equals(serviceType);
			case ServicePackage.SERVICE_DESCRIPTION__SERVICE_CLASS:
				return serviceClass != null;
			case ServicePackage.SERVICE_DESCRIPTION__OPERATION:
				return operation != null && !operation.isEmpty();
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
		result.append(" (serviceId: ");
		result.append(serviceId);
		result.append(", providerId: ");
		result.append(providerId);
		result.append(", name: ");
		result.append(name);
		result.append(", vendor: ");
		result.append(vendor);
		result.append(", rank: ");
		result.append(rank);
		result.append(", sourceUri: ");
		result.append(sourceUri);
		result.append(", contentType: ");
		result.append(contentType);
		result.append(", lifeCycleState: ");
		result.append(lifeCycleState);
		result.append(", serviceType: ");
		result.append(serviceType);
		result.append(')');
		return result.toString();
	}

} //ServiceDescriptionImpl
