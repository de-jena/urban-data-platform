/*
 */
package de.jena.model.glt.impl;

import de.jena.model.glt.AddressPojo;
import de.jena.model.glt.GltPackage;
import de.jena.model.glt.SystemDescriptionPojo;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectResolvingEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>System Description Pojo</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link de.jena.model.glt.impl.SystemDescriptionPojoImpl#getId <em>Id</em>}</li>
 *   <li>{@link de.jena.model.glt.impl.SystemDescriptionPojoImpl#getName <em>Name</em>}</li>
 *   <li>{@link de.jena.model.glt.impl.SystemDescriptionPojoImpl#getPrefix <em>Prefix</em>}</li>
 *   <li>{@link de.jena.model.glt.impl.SystemDescriptionPojoImpl#getIp <em>Ip</em>}</li>
 *   <li>{@link de.jena.model.glt.impl.SystemDescriptionPojoImpl#getDirectory <em>Directory</em>}</li>
 *   <li>{@link de.jena.model.glt.impl.SystemDescriptionPojoImpl#getPort <em>Port</em>}</li>
 *   <li>{@link de.jena.model.glt.impl.SystemDescriptionPojoImpl#getLon <em>Lon</em>}</li>
 *   <li>{@link de.jena.model.glt.impl.SystemDescriptionPojoImpl#getLat <em>Lat</em>}</li>
 *   <li>{@link de.jena.model.glt.impl.SystemDescriptionPojoImpl#getShallow <em>Shallow</em>}</li>
 *   <li>{@link de.jena.model.glt.impl.SystemDescriptionPojoImpl#getExcluded <em>Excluded</em>}</li>
 *   <li>{@link de.jena.model.glt.impl.SystemDescriptionPojoImpl#getExternalId <em>External Id</em>}</li>
 *   <li>{@link de.jena.model.glt.impl.SystemDescriptionPojoImpl#getAddress <em>Address</em>}</li>
 *   <li>{@link de.jena.model.glt.impl.SystemDescriptionPojoImpl#getSource <em>Source</em>}</li>
 *   <li>{@link de.jena.model.glt.impl.SystemDescriptionPojoImpl#getChildren <em>Children</em>}</li>
 *   <li>{@link de.jena.model.glt.impl.SystemDescriptionPojoImpl#getFlags <em>Flags</em>}</li>
 *   <li>{@link de.jena.model.glt.impl.SystemDescriptionPojoImpl#getCylonNetwork <em>Cylon Network</em>}</li>
 * </ul>
 *
 * @generated
 */
public class SystemDescriptionPojoImpl extends MinimalEObjectImpl.Container implements SystemDescriptionPojo {
	/**
	 * The default value of the '{@link #getId() <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getId()
	 * @generated
	 * @ordered
	 */
	protected static final String ID_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getId() <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getId()
	 * @generated
	 * @ordered
	 */
	protected String id = ID_EDEFAULT;

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
	 * The default value of the '{@link #getPrefix() <em>Prefix</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPrefix()
	 * @generated
	 * @ordered
	 */
	protected static final String PREFIX_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getPrefix() <em>Prefix</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPrefix()
	 * @generated
	 * @ordered
	 */
	protected String prefix = PREFIX_EDEFAULT;

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
	 * The default value of the '{@link #getDirectory() <em>Directory</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDirectory()
	 * @generated
	 * @ordered
	 */
	protected static final String DIRECTORY_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDirectory() <em>Directory</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDirectory()
	 * @generated
	 * @ordered
	 */
	protected String directory = DIRECTORY_EDEFAULT;

	/**
	 * The default value of the '{@link #getPort() <em>Port</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPort()
	 * @generated
	 * @ordered
	 */
	protected static final Integer PORT_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getPort() <em>Port</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPort()
	 * @generated
	 * @ordered
	 */
	protected Integer port = PORT_EDEFAULT;

	/**
	 * The default value of the '{@link #getLon() <em>Lon</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLon()
	 * @generated
	 * @ordered
	 */
	protected static final Double LON_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getLon() <em>Lon</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLon()
	 * @generated
	 * @ordered
	 */
	protected Double lon = LON_EDEFAULT;

	/**
	 * The default value of the '{@link #getLat() <em>Lat</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLat()
	 * @generated
	 * @ordered
	 */
	protected static final Double LAT_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getLat() <em>Lat</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLat()
	 * @generated
	 * @ordered
	 */
	protected Double lat = LAT_EDEFAULT;

	/**
	 * The default value of the '{@link #getShallow() <em>Shallow</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getShallow()
	 * @generated
	 * @ordered
	 */
	protected static final Boolean SHALLOW_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getShallow() <em>Shallow</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getShallow()
	 * @generated
	 * @ordered
	 */
	protected Boolean shallow = SHALLOW_EDEFAULT;

	/**
	 * The default value of the '{@link #getExcluded() <em>Excluded</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getExcluded()
	 * @generated
	 * @ordered
	 */
	protected static final Boolean EXCLUDED_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getExcluded() <em>Excluded</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getExcluded()
	 * @generated
	 * @ordered
	 */
	protected Boolean excluded = EXCLUDED_EDEFAULT;

	/**
	 * The default value of the '{@link #getExternalId() <em>External Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getExternalId()
	 * @generated
	 * @ordered
	 */
	protected static final Integer EXTERNAL_ID_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getExternalId() <em>External Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getExternalId()
	 * @generated
	 * @ordered
	 */
	protected Integer externalId = EXTERNAL_ID_EDEFAULT;

	/**
	 * The cached value of the '{@link #getAddress() <em>Address</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAddress()
	 * @generated
	 * @ordered
	 */
	protected AddressPojo address;

	/**
	 * The default value of the '{@link #getSource() <em>Source</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSource()
	 * @generated
	 * @ordered
	 */
	protected static final String SOURCE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getSource() <em>Source</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSource()
	 * @generated
	 * @ordered
	 */
	protected String source = SOURCE_EDEFAULT;

	/**
	 * The cached value of the '{@link #getChildren() <em>Children</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getChildren()
	 * @generated
	 * @ordered
	 */
	protected EList<SystemDescriptionPojo> children;

	/**
	 * The default value of the '{@link #getFlags() <em>Flags</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFlags()
	 * @generated
	 * @ordered
	 */
	protected static final Integer FLAGS_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getFlags() <em>Flags</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFlags()
	 * @generated
	 * @ordered
	 */
	protected Integer flags = FLAGS_EDEFAULT;

	/**
	 * The default value of the '{@link #getCylonNetwork() <em>Cylon Network</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCylonNetwork()
	 * @generated
	 * @ordered
	 */
	protected static final Boolean CYLON_NETWORK_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getCylonNetwork() <em>Cylon Network</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCylonNetwork()
	 * @generated
	 * @ordered
	 */
	protected Boolean cylonNetwork = CYLON_NETWORK_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SystemDescriptionPojoImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return GltPackage.eINSTANCE.getSystemDescriptionPojo();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getId() {
		return id;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setId(String newId) {
		String oldId = id;
		id = newId;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GltPackage.SYSTEM_DESCRIPTION_POJO__ID, oldId, id));
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
			eNotify(new ENotificationImpl(this, Notification.SET, GltPackage.SYSTEM_DESCRIPTION_POJO__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getPrefix() {
		return prefix;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setPrefix(String newPrefix) {
		String oldPrefix = prefix;
		prefix = newPrefix;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GltPackage.SYSTEM_DESCRIPTION_POJO__PREFIX, oldPrefix, prefix));
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
			eNotify(new ENotificationImpl(this, Notification.SET, GltPackage.SYSTEM_DESCRIPTION_POJO__IP, oldIp, ip));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getDirectory() {
		return directory;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setDirectory(String newDirectory) {
		String oldDirectory = directory;
		directory = newDirectory;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GltPackage.SYSTEM_DESCRIPTION_POJO__DIRECTORY, oldDirectory, directory));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Integer getPort() {
		return port;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setPort(Integer newPort) {
		Integer oldPort = port;
		port = newPort;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GltPackage.SYSTEM_DESCRIPTION_POJO__PORT, oldPort, port));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Double getLon() {
		return lon;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setLon(Double newLon) {
		Double oldLon = lon;
		lon = newLon;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GltPackage.SYSTEM_DESCRIPTION_POJO__LON, oldLon, lon));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Double getLat() {
		return lat;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setLat(Double newLat) {
		Double oldLat = lat;
		lat = newLat;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GltPackage.SYSTEM_DESCRIPTION_POJO__LAT, oldLat, lat));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Boolean getShallow() {
		return shallow;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setShallow(Boolean newShallow) {
		Boolean oldShallow = shallow;
		shallow = newShallow;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GltPackage.SYSTEM_DESCRIPTION_POJO__SHALLOW, oldShallow, shallow));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Boolean getExcluded() {
		return excluded;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setExcluded(Boolean newExcluded) {
		Boolean oldExcluded = excluded;
		excluded = newExcluded;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GltPackage.SYSTEM_DESCRIPTION_POJO__EXCLUDED, oldExcluded, excluded));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Integer getExternalId() {
		return externalId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setExternalId(Integer newExternalId) {
		Integer oldExternalId = externalId;
		externalId = newExternalId;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GltPackage.SYSTEM_DESCRIPTION_POJO__EXTERNAL_ID, oldExternalId, externalId));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public AddressPojo getAddress() {
		if (address != null && address.eIsProxy()) {
			InternalEObject oldAddress = (InternalEObject)address;
			address = (AddressPojo)eResolveProxy(oldAddress);
			if (address != oldAddress) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, GltPackage.SYSTEM_DESCRIPTION_POJO__ADDRESS, oldAddress, address));
			}
		}
		return address;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AddressPojo basicGetAddress() {
		return address;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setAddress(AddressPojo newAddress) {
		AddressPojo oldAddress = address;
		address = newAddress;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GltPackage.SYSTEM_DESCRIPTION_POJO__ADDRESS, oldAddress, address));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getSource() {
		return source;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setSource(String newSource) {
		String oldSource = source;
		source = newSource;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GltPackage.SYSTEM_DESCRIPTION_POJO__SOURCE, oldSource, source));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<SystemDescriptionPojo> getChildren() {
		if (children == null) {
			children = new EObjectResolvingEList<SystemDescriptionPojo>(SystemDescriptionPojo.class, this, GltPackage.SYSTEM_DESCRIPTION_POJO__CHILDREN);
		}
		return children;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Integer getFlags() {
		return flags;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setFlags(Integer newFlags) {
		Integer oldFlags = flags;
		flags = newFlags;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GltPackage.SYSTEM_DESCRIPTION_POJO__FLAGS, oldFlags, flags));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Boolean getCylonNetwork() {
		return cylonNetwork;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setCylonNetwork(Boolean newCylonNetwork) {
		Boolean oldCylonNetwork = cylonNetwork;
		cylonNetwork = newCylonNetwork;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GltPackage.SYSTEM_DESCRIPTION_POJO__CYLON_NETWORK, oldCylonNetwork, cylonNetwork));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case GltPackage.SYSTEM_DESCRIPTION_POJO__ID:
				return getId();
			case GltPackage.SYSTEM_DESCRIPTION_POJO__NAME:
				return getName();
			case GltPackage.SYSTEM_DESCRIPTION_POJO__PREFIX:
				return getPrefix();
			case GltPackage.SYSTEM_DESCRIPTION_POJO__IP:
				return getIp();
			case GltPackage.SYSTEM_DESCRIPTION_POJO__DIRECTORY:
				return getDirectory();
			case GltPackage.SYSTEM_DESCRIPTION_POJO__PORT:
				return getPort();
			case GltPackage.SYSTEM_DESCRIPTION_POJO__LON:
				return getLon();
			case GltPackage.SYSTEM_DESCRIPTION_POJO__LAT:
				return getLat();
			case GltPackage.SYSTEM_DESCRIPTION_POJO__SHALLOW:
				return getShallow();
			case GltPackage.SYSTEM_DESCRIPTION_POJO__EXCLUDED:
				return getExcluded();
			case GltPackage.SYSTEM_DESCRIPTION_POJO__EXTERNAL_ID:
				return getExternalId();
			case GltPackage.SYSTEM_DESCRIPTION_POJO__ADDRESS:
				if (resolve) return getAddress();
				return basicGetAddress();
			case GltPackage.SYSTEM_DESCRIPTION_POJO__SOURCE:
				return getSource();
			case GltPackage.SYSTEM_DESCRIPTION_POJO__CHILDREN:
				return getChildren();
			case GltPackage.SYSTEM_DESCRIPTION_POJO__FLAGS:
				return getFlags();
			case GltPackage.SYSTEM_DESCRIPTION_POJO__CYLON_NETWORK:
				return getCylonNetwork();
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
			case GltPackage.SYSTEM_DESCRIPTION_POJO__ID:
				setId((String)newValue);
				return;
			case GltPackage.SYSTEM_DESCRIPTION_POJO__NAME:
				setName((String)newValue);
				return;
			case GltPackage.SYSTEM_DESCRIPTION_POJO__PREFIX:
				setPrefix((String)newValue);
				return;
			case GltPackage.SYSTEM_DESCRIPTION_POJO__IP:
				setIp((String)newValue);
				return;
			case GltPackage.SYSTEM_DESCRIPTION_POJO__DIRECTORY:
				setDirectory((String)newValue);
				return;
			case GltPackage.SYSTEM_DESCRIPTION_POJO__PORT:
				setPort((Integer)newValue);
				return;
			case GltPackage.SYSTEM_DESCRIPTION_POJO__LON:
				setLon((Double)newValue);
				return;
			case GltPackage.SYSTEM_DESCRIPTION_POJO__LAT:
				setLat((Double)newValue);
				return;
			case GltPackage.SYSTEM_DESCRIPTION_POJO__SHALLOW:
				setShallow((Boolean)newValue);
				return;
			case GltPackage.SYSTEM_DESCRIPTION_POJO__EXCLUDED:
				setExcluded((Boolean)newValue);
				return;
			case GltPackage.SYSTEM_DESCRIPTION_POJO__EXTERNAL_ID:
				setExternalId((Integer)newValue);
				return;
			case GltPackage.SYSTEM_DESCRIPTION_POJO__ADDRESS:
				setAddress((AddressPojo)newValue);
				return;
			case GltPackage.SYSTEM_DESCRIPTION_POJO__SOURCE:
				setSource((String)newValue);
				return;
			case GltPackage.SYSTEM_DESCRIPTION_POJO__CHILDREN:
				getChildren().clear();
				getChildren().addAll((Collection<? extends SystemDescriptionPojo>)newValue);
				return;
			case GltPackage.SYSTEM_DESCRIPTION_POJO__FLAGS:
				setFlags((Integer)newValue);
				return;
			case GltPackage.SYSTEM_DESCRIPTION_POJO__CYLON_NETWORK:
				setCylonNetwork((Boolean)newValue);
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
			case GltPackage.SYSTEM_DESCRIPTION_POJO__ID:
				setId(ID_EDEFAULT);
				return;
			case GltPackage.SYSTEM_DESCRIPTION_POJO__NAME:
				setName(NAME_EDEFAULT);
				return;
			case GltPackage.SYSTEM_DESCRIPTION_POJO__PREFIX:
				setPrefix(PREFIX_EDEFAULT);
				return;
			case GltPackage.SYSTEM_DESCRIPTION_POJO__IP:
				setIp(IP_EDEFAULT);
				return;
			case GltPackage.SYSTEM_DESCRIPTION_POJO__DIRECTORY:
				setDirectory(DIRECTORY_EDEFAULT);
				return;
			case GltPackage.SYSTEM_DESCRIPTION_POJO__PORT:
				setPort(PORT_EDEFAULT);
				return;
			case GltPackage.SYSTEM_DESCRIPTION_POJO__LON:
				setLon(LON_EDEFAULT);
				return;
			case GltPackage.SYSTEM_DESCRIPTION_POJO__LAT:
				setLat(LAT_EDEFAULT);
				return;
			case GltPackage.SYSTEM_DESCRIPTION_POJO__SHALLOW:
				setShallow(SHALLOW_EDEFAULT);
				return;
			case GltPackage.SYSTEM_DESCRIPTION_POJO__EXCLUDED:
				setExcluded(EXCLUDED_EDEFAULT);
				return;
			case GltPackage.SYSTEM_DESCRIPTION_POJO__EXTERNAL_ID:
				setExternalId(EXTERNAL_ID_EDEFAULT);
				return;
			case GltPackage.SYSTEM_DESCRIPTION_POJO__ADDRESS:
				setAddress((AddressPojo)null);
				return;
			case GltPackage.SYSTEM_DESCRIPTION_POJO__SOURCE:
				setSource(SOURCE_EDEFAULT);
				return;
			case GltPackage.SYSTEM_DESCRIPTION_POJO__CHILDREN:
				getChildren().clear();
				return;
			case GltPackage.SYSTEM_DESCRIPTION_POJO__FLAGS:
				setFlags(FLAGS_EDEFAULT);
				return;
			case GltPackage.SYSTEM_DESCRIPTION_POJO__CYLON_NETWORK:
				setCylonNetwork(CYLON_NETWORK_EDEFAULT);
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
			case GltPackage.SYSTEM_DESCRIPTION_POJO__ID:
				return ID_EDEFAULT == null ? id != null : !ID_EDEFAULT.equals(id);
			case GltPackage.SYSTEM_DESCRIPTION_POJO__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case GltPackage.SYSTEM_DESCRIPTION_POJO__PREFIX:
				return PREFIX_EDEFAULT == null ? prefix != null : !PREFIX_EDEFAULT.equals(prefix);
			case GltPackage.SYSTEM_DESCRIPTION_POJO__IP:
				return IP_EDEFAULT == null ? ip != null : !IP_EDEFAULT.equals(ip);
			case GltPackage.SYSTEM_DESCRIPTION_POJO__DIRECTORY:
				return DIRECTORY_EDEFAULT == null ? directory != null : !DIRECTORY_EDEFAULT.equals(directory);
			case GltPackage.SYSTEM_DESCRIPTION_POJO__PORT:
				return PORT_EDEFAULT == null ? port != null : !PORT_EDEFAULT.equals(port);
			case GltPackage.SYSTEM_DESCRIPTION_POJO__LON:
				return LON_EDEFAULT == null ? lon != null : !LON_EDEFAULT.equals(lon);
			case GltPackage.SYSTEM_DESCRIPTION_POJO__LAT:
				return LAT_EDEFAULT == null ? lat != null : !LAT_EDEFAULT.equals(lat);
			case GltPackage.SYSTEM_DESCRIPTION_POJO__SHALLOW:
				return SHALLOW_EDEFAULT == null ? shallow != null : !SHALLOW_EDEFAULT.equals(shallow);
			case GltPackage.SYSTEM_DESCRIPTION_POJO__EXCLUDED:
				return EXCLUDED_EDEFAULT == null ? excluded != null : !EXCLUDED_EDEFAULT.equals(excluded);
			case GltPackage.SYSTEM_DESCRIPTION_POJO__EXTERNAL_ID:
				return EXTERNAL_ID_EDEFAULT == null ? externalId != null : !EXTERNAL_ID_EDEFAULT.equals(externalId);
			case GltPackage.SYSTEM_DESCRIPTION_POJO__ADDRESS:
				return address != null;
			case GltPackage.SYSTEM_DESCRIPTION_POJO__SOURCE:
				return SOURCE_EDEFAULT == null ? source != null : !SOURCE_EDEFAULT.equals(source);
			case GltPackage.SYSTEM_DESCRIPTION_POJO__CHILDREN:
				return children != null && !children.isEmpty();
			case GltPackage.SYSTEM_DESCRIPTION_POJO__FLAGS:
				return FLAGS_EDEFAULT == null ? flags != null : !FLAGS_EDEFAULT.equals(flags);
			case GltPackage.SYSTEM_DESCRIPTION_POJO__CYLON_NETWORK:
				return CYLON_NETWORK_EDEFAULT == null ? cylonNetwork != null : !CYLON_NETWORK_EDEFAULT.equals(cylonNetwork);
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
		result.append(" (id: ");
		result.append(id);
		result.append(", name: ");
		result.append(name);
		result.append(", prefix: ");
		result.append(prefix);
		result.append(", ip: ");
		result.append(ip);
		result.append(", directory: ");
		result.append(directory);
		result.append(", port: ");
		result.append(port);
		result.append(", lon: ");
		result.append(lon);
		result.append(", lat: ");
		result.append(lat);
		result.append(", shallow: ");
		result.append(shallow);
		result.append(", excluded: ");
		result.append(excluded);
		result.append(", externalId: ");
		result.append(externalId);
		result.append(", source: ");
		result.append(source);
		result.append(", flags: ");
		result.append(flags);
		result.append(", cylonNetwork: ");
		result.append(cylonNetwork);
		result.append(')');
		return result.toString();
	}

} //SystemDescriptionPojoImpl
