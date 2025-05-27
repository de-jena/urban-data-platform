/*
 */
package de.jena.model.glt.impl;

import de.jena.model.glt.CommentPojo;
import de.jena.model.glt.DatalogContentPojo;
import de.jena.model.glt.GltPackage;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EDataTypeUniqueEList;
import org.eclipse.emf.ecore.util.EObjectResolvingEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Datalog Content Pojo</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link de.jena.model.glt.impl.DatalogContentPojoImpl#getSiteId <em>Site Id</em>}</li>
 *   <li>{@link de.jena.model.glt.impl.DatalogContentPojoImpl#getId <em>Id</em>}</li>
 *   <li>{@link de.jena.model.glt.impl.DatalogContentPojoImpl#getName <em>Name</em>}</li>
 *   <li>{@link de.jena.model.glt.impl.DatalogContentPojoImpl#getValueType <em>Value Type</em>}</li>
 *   <li>{@link de.jena.model.glt.impl.DatalogContentPojoImpl#getDatalogType <em>Datalog Type</em>}</li>
 *   <li>{@link de.jena.model.glt.impl.DatalogContentPojoImpl#getPointNumber <em>Point Number</em>}</li>
 *   <li>{@link de.jena.model.glt.impl.DatalogContentPojoImpl#getPointName <em>Point Name</em>}</li>
 *   <li>{@link de.jena.model.glt.impl.DatalogContentPojoImpl#getPointId <em>Point Id</em>}</li>
 *   <li>{@link de.jena.model.glt.impl.DatalogContentPojoImpl#getEntriesT <em>Entries T</em>}</li>
 *   <li>{@link de.jena.model.glt.impl.DatalogContentPojoImpl#getEntriesV <em>Entries V</em>}</li>
 *   <li>{@link de.jena.model.glt.impl.DatalogContentPojoImpl#getTime <em>Time</em>}</li>
 *   <li>{@link de.jena.model.glt.impl.DatalogContentPojoImpl#getTimeController <em>Time Controller</em>}</li>
 *   <li>{@link de.jena.model.glt.impl.DatalogContentPojoImpl#getCounter <em>Counter</em>}</li>
 *   <li>{@link de.jena.model.glt.impl.DatalogContentPojoImpl#getValue <em>Value</em>}</li>
 *   <li>{@link de.jena.model.glt.impl.DatalogContentPojoImpl#getIsUnknown <em>Is Unknown</em>}</li>
 *   <li>{@link de.jena.model.glt.impl.DatalogContentPojoImpl#getIsError <em>Is Error</em>}</li>
 *   <li>{@link de.jena.model.glt.impl.DatalogContentPojoImpl#getComments <em>Comments</em>}</li>
 * </ul>
 *
 * @generated
 */
public class DatalogContentPojoImpl extends MinimalEObjectImpl.Container implements DatalogContentPojo {
	/**
	 * The default value of the '{@link #getSiteId() <em>Site Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSiteId()
	 * @generated
	 * @ordered
	 */
	protected static final Integer SITE_ID_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getSiteId() <em>Site Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSiteId()
	 * @generated
	 * @ordered
	 */
	protected Integer siteId = SITE_ID_EDEFAULT;

	/**
	 * The default value of the '{@link #getId() <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getId()
	 * @generated
	 * @ordered
	 */
	protected static final Integer ID_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getId() <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getId()
	 * @generated
	 * @ordered
	 */
	protected Integer id = ID_EDEFAULT;

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
	 * The default value of the '{@link #getValueType() <em>Value Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getValueType()
	 * @generated
	 * @ordered
	 */
	protected static final String VALUE_TYPE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getValueType() <em>Value Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getValueType()
	 * @generated
	 * @ordered
	 */
	protected String valueType = VALUE_TYPE_EDEFAULT;

	/**
	 * The default value of the '{@link #getDatalogType() <em>Datalog Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDatalogType()
	 * @generated
	 * @ordered
	 */
	protected static final String DATALOG_TYPE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDatalogType() <em>Datalog Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDatalogType()
	 * @generated
	 * @ordered
	 */
	protected String datalogType = DATALOG_TYPE_EDEFAULT;

	/**
	 * The default value of the '{@link #getPointNumber() <em>Point Number</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPointNumber()
	 * @generated
	 * @ordered
	 */
	protected static final Integer POINT_NUMBER_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getPointNumber() <em>Point Number</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPointNumber()
	 * @generated
	 * @ordered
	 */
	protected Integer pointNumber = POINT_NUMBER_EDEFAULT;

	/**
	 * The default value of the '{@link #getPointName() <em>Point Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPointName()
	 * @generated
	 * @ordered
	 */
	protected static final String POINT_NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getPointName() <em>Point Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPointName()
	 * @generated
	 * @ordered
	 */
	protected String pointName = POINT_NAME_EDEFAULT;

	/**
	 * The default value of the '{@link #getPointId() <em>Point Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPointId()
	 * @generated
	 * @ordered
	 */
	protected static final Integer POINT_ID_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getPointId() <em>Point Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPointId()
	 * @generated
	 * @ordered
	 */
	protected Integer pointId = POINT_ID_EDEFAULT;

	/**
	 * The cached value of the '{@link #getEntriesT() <em>Entries T</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEntriesT()
	 * @generated
	 * @ordered
	 */
	protected EList<String> entriesT;

	/**
	 * The cached value of the '{@link #getEntriesV() <em>Entries V</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEntriesV()
	 * @generated
	 * @ordered
	 */
	protected EList<Float> entriesV;

	/**
	 * The default value of the '{@link #getTime() <em>Time</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTime()
	 * @generated
	 * @ordered
	 */
	protected static final String TIME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getTime() <em>Time</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTime()
	 * @generated
	 * @ordered
	 */
	protected String time = TIME_EDEFAULT;

	/**
	 * The default value of the '{@link #getTimeController() <em>Time Controller</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTimeController()
	 * @generated
	 * @ordered
	 */
	protected static final String TIME_CONTROLLER_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getTimeController() <em>Time Controller</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTimeController()
	 * @generated
	 * @ordered
	 */
	protected String timeController = TIME_CONTROLLER_EDEFAULT;

	/**
	 * The default value of the '{@link #getCounter() <em>Counter</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCounter()
	 * @generated
	 * @ordered
	 */
	protected static final Integer COUNTER_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getCounter() <em>Counter</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCounter()
	 * @generated
	 * @ordered
	 */
	protected Integer counter = COUNTER_EDEFAULT;

	/**
	 * The default value of the '{@link #getValue() <em>Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getValue()
	 * @generated
	 * @ordered
	 */
	protected static final Float VALUE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getValue() <em>Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getValue()
	 * @generated
	 * @ordered
	 */
	protected Float value = VALUE_EDEFAULT;

	/**
	 * The default value of the '{@link #getIsUnknown() <em>Is Unknown</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIsUnknown()
	 * @generated
	 * @ordered
	 */
	protected static final Boolean IS_UNKNOWN_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getIsUnknown() <em>Is Unknown</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIsUnknown()
	 * @generated
	 * @ordered
	 */
	protected Boolean isUnknown = IS_UNKNOWN_EDEFAULT;

	/**
	 * The default value of the '{@link #getIsError() <em>Is Error</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIsError()
	 * @generated
	 * @ordered
	 */
	protected static final Boolean IS_ERROR_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getIsError() <em>Is Error</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIsError()
	 * @generated
	 * @ordered
	 */
	protected Boolean isError = IS_ERROR_EDEFAULT;

	/**
	 * The cached value of the '{@link #getComments() <em>Comments</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getComments()
	 * @generated
	 * @ordered
	 */
	protected EList<CommentPojo> comments;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DatalogContentPojoImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return GltPackage.eINSTANCE.getDatalogContentPojo();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Integer getSiteId() {
		return siteId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setSiteId(Integer newSiteId) {
		Integer oldSiteId = siteId;
		siteId = newSiteId;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GltPackage.DATALOG_CONTENT_POJO__SITE_ID, oldSiteId, siteId));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Integer getId() {
		return id;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setId(Integer newId) {
		Integer oldId = id;
		id = newId;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GltPackage.DATALOG_CONTENT_POJO__ID, oldId, id));
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
			eNotify(new ENotificationImpl(this, Notification.SET, GltPackage.DATALOG_CONTENT_POJO__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getValueType() {
		return valueType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setValueType(String newValueType) {
		String oldValueType = valueType;
		valueType = newValueType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GltPackage.DATALOG_CONTENT_POJO__VALUE_TYPE, oldValueType, valueType));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getDatalogType() {
		return datalogType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setDatalogType(String newDatalogType) {
		String oldDatalogType = datalogType;
		datalogType = newDatalogType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GltPackage.DATALOG_CONTENT_POJO__DATALOG_TYPE, oldDatalogType, datalogType));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Integer getPointNumber() {
		return pointNumber;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setPointNumber(Integer newPointNumber) {
		Integer oldPointNumber = pointNumber;
		pointNumber = newPointNumber;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GltPackage.DATALOG_CONTENT_POJO__POINT_NUMBER, oldPointNumber, pointNumber));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getPointName() {
		return pointName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setPointName(String newPointName) {
		String oldPointName = pointName;
		pointName = newPointName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GltPackage.DATALOG_CONTENT_POJO__POINT_NAME, oldPointName, pointName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Integer getPointId() {
		return pointId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setPointId(Integer newPointId) {
		Integer oldPointId = pointId;
		pointId = newPointId;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GltPackage.DATALOG_CONTENT_POJO__POINT_ID, oldPointId, pointId));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<String> getEntriesT() {
		if (entriesT == null) {
			entriesT = new EDataTypeUniqueEList<String>(String.class, this, GltPackage.DATALOG_CONTENT_POJO__ENTRIES_T);
		}
		return entriesT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Float> getEntriesV() {
		if (entriesV == null) {
			entriesV = new EDataTypeUniqueEList<Float>(Float.class, this, GltPackage.DATALOG_CONTENT_POJO__ENTRIES_V);
		}
		return entriesV;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getTime() {
		return time;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setTime(String newTime) {
		String oldTime = time;
		time = newTime;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GltPackage.DATALOG_CONTENT_POJO__TIME, oldTime, time));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getTimeController() {
		return timeController;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setTimeController(String newTimeController) {
		String oldTimeController = timeController;
		timeController = newTimeController;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GltPackage.DATALOG_CONTENT_POJO__TIME_CONTROLLER, oldTimeController, timeController));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Integer getCounter() {
		return counter;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setCounter(Integer newCounter) {
		Integer oldCounter = counter;
		counter = newCounter;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GltPackage.DATALOG_CONTENT_POJO__COUNTER, oldCounter, counter));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Float getValue() {
		return value;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setValue(Float newValue) {
		Float oldValue = value;
		value = newValue;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GltPackage.DATALOG_CONTENT_POJO__VALUE, oldValue, value));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Boolean getIsUnknown() {
		return isUnknown;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setIsUnknown(Boolean newIsUnknown) {
		Boolean oldIsUnknown = isUnknown;
		isUnknown = newIsUnknown;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GltPackage.DATALOG_CONTENT_POJO__IS_UNKNOWN, oldIsUnknown, isUnknown));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Boolean getIsError() {
		return isError;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setIsError(Boolean newIsError) {
		Boolean oldIsError = isError;
		isError = newIsError;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GltPackage.DATALOG_CONTENT_POJO__IS_ERROR, oldIsError, isError));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<CommentPojo> getComments() {
		if (comments == null) {
			comments = new EObjectResolvingEList<CommentPojo>(CommentPojo.class, this, GltPackage.DATALOG_CONTENT_POJO__COMMENTS);
		}
		return comments;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case GltPackage.DATALOG_CONTENT_POJO__SITE_ID:
				return getSiteId();
			case GltPackage.DATALOG_CONTENT_POJO__ID:
				return getId();
			case GltPackage.DATALOG_CONTENT_POJO__NAME:
				return getName();
			case GltPackage.DATALOG_CONTENT_POJO__VALUE_TYPE:
				return getValueType();
			case GltPackage.DATALOG_CONTENT_POJO__DATALOG_TYPE:
				return getDatalogType();
			case GltPackage.DATALOG_CONTENT_POJO__POINT_NUMBER:
				return getPointNumber();
			case GltPackage.DATALOG_CONTENT_POJO__POINT_NAME:
				return getPointName();
			case GltPackage.DATALOG_CONTENT_POJO__POINT_ID:
				return getPointId();
			case GltPackage.DATALOG_CONTENT_POJO__ENTRIES_T:
				return getEntriesT();
			case GltPackage.DATALOG_CONTENT_POJO__ENTRIES_V:
				return getEntriesV();
			case GltPackage.DATALOG_CONTENT_POJO__TIME:
				return getTime();
			case GltPackage.DATALOG_CONTENT_POJO__TIME_CONTROLLER:
				return getTimeController();
			case GltPackage.DATALOG_CONTENT_POJO__COUNTER:
				return getCounter();
			case GltPackage.DATALOG_CONTENT_POJO__VALUE:
				return getValue();
			case GltPackage.DATALOG_CONTENT_POJO__IS_UNKNOWN:
				return getIsUnknown();
			case GltPackage.DATALOG_CONTENT_POJO__IS_ERROR:
				return getIsError();
			case GltPackage.DATALOG_CONTENT_POJO__COMMENTS:
				return getComments();
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
			case GltPackage.DATALOG_CONTENT_POJO__SITE_ID:
				setSiteId((Integer)newValue);
				return;
			case GltPackage.DATALOG_CONTENT_POJO__ID:
				setId((Integer)newValue);
				return;
			case GltPackage.DATALOG_CONTENT_POJO__NAME:
				setName((String)newValue);
				return;
			case GltPackage.DATALOG_CONTENT_POJO__VALUE_TYPE:
				setValueType((String)newValue);
				return;
			case GltPackage.DATALOG_CONTENT_POJO__DATALOG_TYPE:
				setDatalogType((String)newValue);
				return;
			case GltPackage.DATALOG_CONTENT_POJO__POINT_NUMBER:
				setPointNumber((Integer)newValue);
				return;
			case GltPackage.DATALOG_CONTENT_POJO__POINT_NAME:
				setPointName((String)newValue);
				return;
			case GltPackage.DATALOG_CONTENT_POJO__POINT_ID:
				setPointId((Integer)newValue);
				return;
			case GltPackage.DATALOG_CONTENT_POJO__ENTRIES_T:
				getEntriesT().clear();
				getEntriesT().addAll((Collection<? extends String>)newValue);
				return;
			case GltPackage.DATALOG_CONTENT_POJO__ENTRIES_V:
				getEntriesV().clear();
				getEntriesV().addAll((Collection<? extends Float>)newValue);
				return;
			case GltPackage.DATALOG_CONTENT_POJO__TIME:
				setTime((String)newValue);
				return;
			case GltPackage.DATALOG_CONTENT_POJO__TIME_CONTROLLER:
				setTimeController((String)newValue);
				return;
			case GltPackage.DATALOG_CONTENT_POJO__COUNTER:
				setCounter((Integer)newValue);
				return;
			case GltPackage.DATALOG_CONTENT_POJO__VALUE:
				setValue((Float)newValue);
				return;
			case GltPackage.DATALOG_CONTENT_POJO__IS_UNKNOWN:
				setIsUnknown((Boolean)newValue);
				return;
			case GltPackage.DATALOG_CONTENT_POJO__IS_ERROR:
				setIsError((Boolean)newValue);
				return;
			case GltPackage.DATALOG_CONTENT_POJO__COMMENTS:
				getComments().clear();
				getComments().addAll((Collection<? extends CommentPojo>)newValue);
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
			case GltPackage.DATALOG_CONTENT_POJO__SITE_ID:
				setSiteId(SITE_ID_EDEFAULT);
				return;
			case GltPackage.DATALOG_CONTENT_POJO__ID:
				setId(ID_EDEFAULT);
				return;
			case GltPackage.DATALOG_CONTENT_POJO__NAME:
				setName(NAME_EDEFAULT);
				return;
			case GltPackage.DATALOG_CONTENT_POJO__VALUE_TYPE:
				setValueType(VALUE_TYPE_EDEFAULT);
				return;
			case GltPackage.DATALOG_CONTENT_POJO__DATALOG_TYPE:
				setDatalogType(DATALOG_TYPE_EDEFAULT);
				return;
			case GltPackage.DATALOG_CONTENT_POJO__POINT_NUMBER:
				setPointNumber(POINT_NUMBER_EDEFAULT);
				return;
			case GltPackage.DATALOG_CONTENT_POJO__POINT_NAME:
				setPointName(POINT_NAME_EDEFAULT);
				return;
			case GltPackage.DATALOG_CONTENT_POJO__POINT_ID:
				setPointId(POINT_ID_EDEFAULT);
				return;
			case GltPackage.DATALOG_CONTENT_POJO__ENTRIES_T:
				getEntriesT().clear();
				return;
			case GltPackage.DATALOG_CONTENT_POJO__ENTRIES_V:
				getEntriesV().clear();
				return;
			case GltPackage.DATALOG_CONTENT_POJO__TIME:
				setTime(TIME_EDEFAULT);
				return;
			case GltPackage.DATALOG_CONTENT_POJO__TIME_CONTROLLER:
				setTimeController(TIME_CONTROLLER_EDEFAULT);
				return;
			case GltPackage.DATALOG_CONTENT_POJO__COUNTER:
				setCounter(COUNTER_EDEFAULT);
				return;
			case GltPackage.DATALOG_CONTENT_POJO__VALUE:
				setValue(VALUE_EDEFAULT);
				return;
			case GltPackage.DATALOG_CONTENT_POJO__IS_UNKNOWN:
				setIsUnknown(IS_UNKNOWN_EDEFAULT);
				return;
			case GltPackage.DATALOG_CONTENT_POJO__IS_ERROR:
				setIsError(IS_ERROR_EDEFAULT);
				return;
			case GltPackage.DATALOG_CONTENT_POJO__COMMENTS:
				getComments().clear();
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
			case GltPackage.DATALOG_CONTENT_POJO__SITE_ID:
				return SITE_ID_EDEFAULT == null ? siteId != null : !SITE_ID_EDEFAULT.equals(siteId);
			case GltPackage.DATALOG_CONTENT_POJO__ID:
				return ID_EDEFAULT == null ? id != null : !ID_EDEFAULT.equals(id);
			case GltPackage.DATALOG_CONTENT_POJO__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case GltPackage.DATALOG_CONTENT_POJO__VALUE_TYPE:
				return VALUE_TYPE_EDEFAULT == null ? valueType != null : !VALUE_TYPE_EDEFAULT.equals(valueType);
			case GltPackage.DATALOG_CONTENT_POJO__DATALOG_TYPE:
				return DATALOG_TYPE_EDEFAULT == null ? datalogType != null : !DATALOG_TYPE_EDEFAULT.equals(datalogType);
			case GltPackage.DATALOG_CONTENT_POJO__POINT_NUMBER:
				return POINT_NUMBER_EDEFAULT == null ? pointNumber != null : !POINT_NUMBER_EDEFAULT.equals(pointNumber);
			case GltPackage.DATALOG_CONTENT_POJO__POINT_NAME:
				return POINT_NAME_EDEFAULT == null ? pointName != null : !POINT_NAME_EDEFAULT.equals(pointName);
			case GltPackage.DATALOG_CONTENT_POJO__POINT_ID:
				return POINT_ID_EDEFAULT == null ? pointId != null : !POINT_ID_EDEFAULT.equals(pointId);
			case GltPackage.DATALOG_CONTENT_POJO__ENTRIES_T:
				return entriesT != null && !entriesT.isEmpty();
			case GltPackage.DATALOG_CONTENT_POJO__ENTRIES_V:
				return entriesV != null && !entriesV.isEmpty();
			case GltPackage.DATALOG_CONTENT_POJO__TIME:
				return TIME_EDEFAULT == null ? time != null : !TIME_EDEFAULT.equals(time);
			case GltPackage.DATALOG_CONTENT_POJO__TIME_CONTROLLER:
				return TIME_CONTROLLER_EDEFAULT == null ? timeController != null : !TIME_CONTROLLER_EDEFAULT.equals(timeController);
			case GltPackage.DATALOG_CONTENT_POJO__COUNTER:
				return COUNTER_EDEFAULT == null ? counter != null : !COUNTER_EDEFAULT.equals(counter);
			case GltPackage.DATALOG_CONTENT_POJO__VALUE:
				return VALUE_EDEFAULT == null ? value != null : !VALUE_EDEFAULT.equals(value);
			case GltPackage.DATALOG_CONTENT_POJO__IS_UNKNOWN:
				return IS_UNKNOWN_EDEFAULT == null ? isUnknown != null : !IS_UNKNOWN_EDEFAULT.equals(isUnknown);
			case GltPackage.DATALOG_CONTENT_POJO__IS_ERROR:
				return IS_ERROR_EDEFAULT == null ? isError != null : !IS_ERROR_EDEFAULT.equals(isError);
			case GltPackage.DATALOG_CONTENT_POJO__COMMENTS:
				return comments != null && !comments.isEmpty();
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
		result.append(" (siteId: ");
		result.append(siteId);
		result.append(", id: ");
		result.append(id);
		result.append(", name: ");
		result.append(name);
		result.append(", valueType: ");
		result.append(valueType);
		result.append(", datalogType: ");
		result.append(datalogType);
		result.append(", pointNumber: ");
		result.append(pointNumber);
		result.append(", pointName: ");
		result.append(pointName);
		result.append(", pointId: ");
		result.append(pointId);
		result.append(", entriesT: ");
		result.append(entriesT);
		result.append(", entriesV: ");
		result.append(entriesV);
		result.append(", time: ");
		result.append(time);
		result.append(", timeController: ");
		result.append(timeController);
		result.append(", counter: ");
		result.append(counter);
		result.append(", value: ");
		result.append(value);
		result.append(", isUnknown: ");
		result.append(isUnknown);
		result.append(", isError: ");
		result.append(isError);
		result.append(')');
		return result.toString();
	}

} //DatalogContentPojoImpl
