/*
 */
package de.jena.model.glt.impl;

import de.jena.model.glt.CommentPojo;
import de.jena.model.glt.GltPackage;
import de.jena.model.glt.TimeScheduleBlockPojo;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Time Schedule Block Pojo</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link de.jena.model.glt.impl.TimeScheduleBlockPojoImpl#getSystemId <em>System Id</em>}</li>
 *   <li>{@link de.jena.model.glt.impl.TimeScheduleBlockPojoImpl#getId <em>Id</em>}</li>
 *   <li>{@link de.jena.model.glt.impl.TimeScheduleBlockPojoImpl#getBlock <em>Block</em>}</li>
 *   <li>{@link de.jena.model.glt.impl.TimeScheduleBlockPojoImpl#getExceptionStartDay <em>Exception Start Day</em>}</li>
 *   <li>{@link de.jena.model.glt.impl.TimeScheduleBlockPojoImpl#getExceptionStartMonth <em>Exception Start Month</em>}</li>
 *   <li>{@link de.jena.model.glt.impl.TimeScheduleBlockPojoImpl#getExceptionEndDay <em>Exception End Day</em>}</li>
 *   <li>{@link de.jena.model.glt.impl.TimeScheduleBlockPojoImpl#getExceptionEndMonth <em>Exception End Month</em>}</li>
 *   <li>{@link de.jena.model.glt.impl.TimeScheduleBlockPojoImpl#getYear <em>Year</em>}</li>
 *   <li>{@link de.jena.model.glt.impl.TimeScheduleBlockPojoImpl#getTimes <em>Times</em>}</li>
 *   <li>{@link de.jena.model.glt.impl.TimeScheduleBlockPojoImpl#getTime <em>Time</em>}</li>
 *   <li>{@link de.jena.model.glt.impl.TimeScheduleBlockPojoImpl#getIsUnknown <em>Is Unknown</em>}</li>
 *   <li>{@link de.jena.model.glt.impl.TimeScheduleBlockPojoImpl#getComments <em>Comments</em>}</li>
 * </ul>
 *
 * @generated
 */
public class TimeScheduleBlockPojoImpl extends MinimalEObjectImpl.Container implements TimeScheduleBlockPojo {
	/**
	 * The default value of the '{@link #getSystemId() <em>System Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSystemId()
	 * @generated
	 * @ordered
	 */
	protected static final Integer SYSTEM_ID_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getSystemId() <em>System Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSystemId()
	 * @generated
	 * @ordered
	 */
	protected Integer systemId = SYSTEM_ID_EDEFAULT;

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
	 * The default value of the '{@link #getBlock() <em>Block</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBlock()
	 * @generated
	 * @ordered
	 */
	protected static final Integer BLOCK_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getBlock() <em>Block</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBlock()
	 * @generated
	 * @ordered
	 */
	protected Integer block = BLOCK_EDEFAULT;

	/**
	 * The default value of the '{@link #getExceptionStartDay() <em>Exception Start Day</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getExceptionStartDay()
	 * @generated
	 * @ordered
	 */
	protected static final Integer EXCEPTION_START_DAY_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getExceptionStartDay() <em>Exception Start Day</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getExceptionStartDay()
	 * @generated
	 * @ordered
	 */
	protected Integer exceptionStartDay = EXCEPTION_START_DAY_EDEFAULT;

	/**
	 * The default value of the '{@link #getExceptionStartMonth() <em>Exception Start Month</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getExceptionStartMonth()
	 * @generated
	 * @ordered
	 */
	protected static final Integer EXCEPTION_START_MONTH_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getExceptionStartMonth() <em>Exception Start Month</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getExceptionStartMonth()
	 * @generated
	 * @ordered
	 */
	protected Integer exceptionStartMonth = EXCEPTION_START_MONTH_EDEFAULT;

	/**
	 * The default value of the '{@link #getExceptionEndDay() <em>Exception End Day</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getExceptionEndDay()
	 * @generated
	 * @ordered
	 */
	protected static final Integer EXCEPTION_END_DAY_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getExceptionEndDay() <em>Exception End Day</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getExceptionEndDay()
	 * @generated
	 * @ordered
	 */
	protected Integer exceptionEndDay = EXCEPTION_END_DAY_EDEFAULT;

	/**
	 * The default value of the '{@link #getExceptionEndMonth() <em>Exception End Month</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getExceptionEndMonth()
	 * @generated
	 * @ordered
	 */
	protected static final Integer EXCEPTION_END_MONTH_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getExceptionEndMonth() <em>Exception End Month</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getExceptionEndMonth()
	 * @generated
	 * @ordered
	 */
	protected Integer exceptionEndMonth = EXCEPTION_END_MONTH_EDEFAULT;

	/**
	 * The default value of the '{@link #getYear() <em>Year</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getYear()
	 * @generated
	 * @ordered
	 */
	protected static final Integer YEAR_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getYear() <em>Year</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getYear()
	 * @generated
	 * @ordered
	 */
	protected Integer year = YEAR_EDEFAULT;

	/**
	 * The default value of the '{@link #getTimes() <em>Times</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTimes()
	 * @generated
	 * @ordered
	 */
	protected static final Object TIMES_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getTimes() <em>Times</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTimes()
	 * @generated
	 * @ordered
	 */
	protected Object times = TIMES_EDEFAULT;

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
	 * The cached value of the '{@link #getComments() <em>Comments</em>}' containment reference list.
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
	protected TimeScheduleBlockPojoImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return GltPackage.eINSTANCE.getTimeScheduleBlockPojo();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Integer getSystemId() {
		return systemId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setSystemId(Integer newSystemId) {
		Integer oldSystemId = systemId;
		systemId = newSystemId;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GltPackage.TIME_SCHEDULE_BLOCK_POJO__SYSTEM_ID, oldSystemId, systemId));
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
			eNotify(new ENotificationImpl(this, Notification.SET, GltPackage.TIME_SCHEDULE_BLOCK_POJO__ID, oldId, id));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Integer getBlock() {
		return block;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setBlock(Integer newBlock) {
		Integer oldBlock = block;
		block = newBlock;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GltPackage.TIME_SCHEDULE_BLOCK_POJO__BLOCK, oldBlock, block));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Integer getExceptionStartDay() {
		return exceptionStartDay;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setExceptionStartDay(Integer newExceptionStartDay) {
		Integer oldExceptionStartDay = exceptionStartDay;
		exceptionStartDay = newExceptionStartDay;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GltPackage.TIME_SCHEDULE_BLOCK_POJO__EXCEPTION_START_DAY, oldExceptionStartDay, exceptionStartDay));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Integer getExceptionStartMonth() {
		return exceptionStartMonth;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setExceptionStartMonth(Integer newExceptionStartMonth) {
		Integer oldExceptionStartMonth = exceptionStartMonth;
		exceptionStartMonth = newExceptionStartMonth;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GltPackage.TIME_SCHEDULE_BLOCK_POJO__EXCEPTION_START_MONTH, oldExceptionStartMonth, exceptionStartMonth));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Integer getExceptionEndDay() {
		return exceptionEndDay;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setExceptionEndDay(Integer newExceptionEndDay) {
		Integer oldExceptionEndDay = exceptionEndDay;
		exceptionEndDay = newExceptionEndDay;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GltPackage.TIME_SCHEDULE_BLOCK_POJO__EXCEPTION_END_DAY, oldExceptionEndDay, exceptionEndDay));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Integer getExceptionEndMonth() {
		return exceptionEndMonth;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setExceptionEndMonth(Integer newExceptionEndMonth) {
		Integer oldExceptionEndMonth = exceptionEndMonth;
		exceptionEndMonth = newExceptionEndMonth;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GltPackage.TIME_SCHEDULE_BLOCK_POJO__EXCEPTION_END_MONTH, oldExceptionEndMonth, exceptionEndMonth));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Integer getYear() {
		return year;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setYear(Integer newYear) {
		Integer oldYear = year;
		year = newYear;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GltPackage.TIME_SCHEDULE_BLOCK_POJO__YEAR, oldYear, year));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getTimes() {
		return times;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setTimes(Object newTimes) {
		Object oldTimes = times;
		times = newTimes;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GltPackage.TIME_SCHEDULE_BLOCK_POJO__TIMES, oldTimes, times));
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
			eNotify(new ENotificationImpl(this, Notification.SET, GltPackage.TIME_SCHEDULE_BLOCK_POJO__TIME, oldTime, time));
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
			eNotify(new ENotificationImpl(this, Notification.SET, GltPackage.TIME_SCHEDULE_BLOCK_POJO__IS_UNKNOWN, oldIsUnknown, isUnknown));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<CommentPojo> getComments() {
		if (comments == null) {
			comments = new EObjectContainmentEList<CommentPojo>(CommentPojo.class, this, GltPackage.TIME_SCHEDULE_BLOCK_POJO__COMMENTS);
		}
		return comments;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case GltPackage.TIME_SCHEDULE_BLOCK_POJO__COMMENTS:
				return ((InternalEList<?>)getComments()).basicRemove(otherEnd, msgs);
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
			case GltPackage.TIME_SCHEDULE_BLOCK_POJO__SYSTEM_ID:
				return getSystemId();
			case GltPackage.TIME_SCHEDULE_BLOCK_POJO__ID:
				return getId();
			case GltPackage.TIME_SCHEDULE_BLOCK_POJO__BLOCK:
				return getBlock();
			case GltPackage.TIME_SCHEDULE_BLOCK_POJO__EXCEPTION_START_DAY:
				return getExceptionStartDay();
			case GltPackage.TIME_SCHEDULE_BLOCK_POJO__EXCEPTION_START_MONTH:
				return getExceptionStartMonth();
			case GltPackage.TIME_SCHEDULE_BLOCK_POJO__EXCEPTION_END_DAY:
				return getExceptionEndDay();
			case GltPackage.TIME_SCHEDULE_BLOCK_POJO__EXCEPTION_END_MONTH:
				return getExceptionEndMonth();
			case GltPackage.TIME_SCHEDULE_BLOCK_POJO__YEAR:
				return getYear();
			case GltPackage.TIME_SCHEDULE_BLOCK_POJO__TIMES:
				return getTimes();
			case GltPackage.TIME_SCHEDULE_BLOCK_POJO__TIME:
				return getTime();
			case GltPackage.TIME_SCHEDULE_BLOCK_POJO__IS_UNKNOWN:
				return getIsUnknown();
			case GltPackage.TIME_SCHEDULE_BLOCK_POJO__COMMENTS:
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
			case GltPackage.TIME_SCHEDULE_BLOCK_POJO__SYSTEM_ID:
				setSystemId((Integer)newValue);
				return;
			case GltPackage.TIME_SCHEDULE_BLOCK_POJO__ID:
				setId((Integer)newValue);
				return;
			case GltPackage.TIME_SCHEDULE_BLOCK_POJO__BLOCK:
				setBlock((Integer)newValue);
				return;
			case GltPackage.TIME_SCHEDULE_BLOCK_POJO__EXCEPTION_START_DAY:
				setExceptionStartDay((Integer)newValue);
				return;
			case GltPackage.TIME_SCHEDULE_BLOCK_POJO__EXCEPTION_START_MONTH:
				setExceptionStartMonth((Integer)newValue);
				return;
			case GltPackage.TIME_SCHEDULE_BLOCK_POJO__EXCEPTION_END_DAY:
				setExceptionEndDay((Integer)newValue);
				return;
			case GltPackage.TIME_SCHEDULE_BLOCK_POJO__EXCEPTION_END_MONTH:
				setExceptionEndMonth((Integer)newValue);
				return;
			case GltPackage.TIME_SCHEDULE_BLOCK_POJO__YEAR:
				setYear((Integer)newValue);
				return;
			case GltPackage.TIME_SCHEDULE_BLOCK_POJO__TIMES:
				setTimes(newValue);
				return;
			case GltPackage.TIME_SCHEDULE_BLOCK_POJO__TIME:
				setTime((String)newValue);
				return;
			case GltPackage.TIME_SCHEDULE_BLOCK_POJO__IS_UNKNOWN:
				setIsUnknown((Boolean)newValue);
				return;
			case GltPackage.TIME_SCHEDULE_BLOCK_POJO__COMMENTS:
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
			case GltPackage.TIME_SCHEDULE_BLOCK_POJO__SYSTEM_ID:
				setSystemId(SYSTEM_ID_EDEFAULT);
				return;
			case GltPackage.TIME_SCHEDULE_BLOCK_POJO__ID:
				setId(ID_EDEFAULT);
				return;
			case GltPackage.TIME_SCHEDULE_BLOCK_POJO__BLOCK:
				setBlock(BLOCK_EDEFAULT);
				return;
			case GltPackage.TIME_SCHEDULE_BLOCK_POJO__EXCEPTION_START_DAY:
				setExceptionStartDay(EXCEPTION_START_DAY_EDEFAULT);
				return;
			case GltPackage.TIME_SCHEDULE_BLOCK_POJO__EXCEPTION_START_MONTH:
				setExceptionStartMonth(EXCEPTION_START_MONTH_EDEFAULT);
				return;
			case GltPackage.TIME_SCHEDULE_BLOCK_POJO__EXCEPTION_END_DAY:
				setExceptionEndDay(EXCEPTION_END_DAY_EDEFAULT);
				return;
			case GltPackage.TIME_SCHEDULE_BLOCK_POJO__EXCEPTION_END_MONTH:
				setExceptionEndMonth(EXCEPTION_END_MONTH_EDEFAULT);
				return;
			case GltPackage.TIME_SCHEDULE_BLOCK_POJO__YEAR:
				setYear(YEAR_EDEFAULT);
				return;
			case GltPackage.TIME_SCHEDULE_BLOCK_POJO__TIMES:
				setTimes(TIMES_EDEFAULT);
				return;
			case GltPackage.TIME_SCHEDULE_BLOCK_POJO__TIME:
				setTime(TIME_EDEFAULT);
				return;
			case GltPackage.TIME_SCHEDULE_BLOCK_POJO__IS_UNKNOWN:
				setIsUnknown(IS_UNKNOWN_EDEFAULT);
				return;
			case GltPackage.TIME_SCHEDULE_BLOCK_POJO__COMMENTS:
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
			case GltPackage.TIME_SCHEDULE_BLOCK_POJO__SYSTEM_ID:
				return SYSTEM_ID_EDEFAULT == null ? systemId != null : !SYSTEM_ID_EDEFAULT.equals(systemId);
			case GltPackage.TIME_SCHEDULE_BLOCK_POJO__ID:
				return ID_EDEFAULT == null ? id != null : !ID_EDEFAULT.equals(id);
			case GltPackage.TIME_SCHEDULE_BLOCK_POJO__BLOCK:
				return BLOCK_EDEFAULT == null ? block != null : !BLOCK_EDEFAULT.equals(block);
			case GltPackage.TIME_SCHEDULE_BLOCK_POJO__EXCEPTION_START_DAY:
				return EXCEPTION_START_DAY_EDEFAULT == null ? exceptionStartDay != null : !EXCEPTION_START_DAY_EDEFAULT.equals(exceptionStartDay);
			case GltPackage.TIME_SCHEDULE_BLOCK_POJO__EXCEPTION_START_MONTH:
				return EXCEPTION_START_MONTH_EDEFAULT == null ? exceptionStartMonth != null : !EXCEPTION_START_MONTH_EDEFAULT.equals(exceptionStartMonth);
			case GltPackage.TIME_SCHEDULE_BLOCK_POJO__EXCEPTION_END_DAY:
				return EXCEPTION_END_DAY_EDEFAULT == null ? exceptionEndDay != null : !EXCEPTION_END_DAY_EDEFAULT.equals(exceptionEndDay);
			case GltPackage.TIME_SCHEDULE_BLOCK_POJO__EXCEPTION_END_MONTH:
				return EXCEPTION_END_MONTH_EDEFAULT == null ? exceptionEndMonth != null : !EXCEPTION_END_MONTH_EDEFAULT.equals(exceptionEndMonth);
			case GltPackage.TIME_SCHEDULE_BLOCK_POJO__YEAR:
				return YEAR_EDEFAULT == null ? year != null : !YEAR_EDEFAULT.equals(year);
			case GltPackage.TIME_SCHEDULE_BLOCK_POJO__TIMES:
				return TIMES_EDEFAULT == null ? times != null : !TIMES_EDEFAULT.equals(times);
			case GltPackage.TIME_SCHEDULE_BLOCK_POJO__TIME:
				return TIME_EDEFAULT == null ? time != null : !TIME_EDEFAULT.equals(time);
			case GltPackage.TIME_SCHEDULE_BLOCK_POJO__IS_UNKNOWN:
				return IS_UNKNOWN_EDEFAULT == null ? isUnknown != null : !IS_UNKNOWN_EDEFAULT.equals(isUnknown);
			case GltPackage.TIME_SCHEDULE_BLOCK_POJO__COMMENTS:
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
		result.append(" (systemId: ");
		result.append(systemId);
		result.append(", id: ");
		result.append(id);
		result.append(", block: ");
		result.append(block);
		result.append(", exceptionStartDay: ");
		result.append(exceptionStartDay);
		result.append(", exceptionStartMonth: ");
		result.append(exceptionStartMonth);
		result.append(", exceptionEndDay: ");
		result.append(exceptionEndDay);
		result.append(", exceptionEndMonth: ");
		result.append(exceptionEndMonth);
		result.append(", year: ");
		result.append(year);
		result.append(", times: ");
		result.append(times);
		result.append(", time: ");
		result.append(time);
		result.append(", isUnknown: ");
		result.append(isUnknown);
		result.append(')');
		return result.toString();
	}

} //TimeScheduleBlockPojoImpl
