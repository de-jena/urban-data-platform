/*
 */
package de.jena.model.glt.impl;

import de.jena.model.glt.Alarm;
import de.jena.model.glt.AlarmId;
import de.jena.model.glt.GltPackage;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Alarm</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link de.jena.model.glt.impl.AlarmImpl#getFlags <em>Flags</em>}</li>
 *   <li>{@link de.jena.model.glt.impl.AlarmImpl#getId <em>Id</em>}</li>
 *   <li>{@link de.jena.model.glt.impl.AlarmImpl#getName <em>Name</em>}</li>
 *   <li>{@link de.jena.model.glt.impl.AlarmImpl#getDescription <em>Description</em>}</li>
 *   <li>{@link de.jena.model.glt.impl.AlarmImpl#getConsequence <em>Consequence</em>}</li>
 *   <li>{@link de.jena.model.glt.impl.AlarmImpl#getCause <em>Cause</em>}</li>
 *   <li>{@link de.jena.model.glt.impl.AlarmImpl#getSl24schedule <em>Sl24schedule</em>}</li>
 *   <li>{@link de.jena.model.glt.impl.AlarmImpl#getPrioritySummer <em>Priority Summer</em>}</li>
 *   <li>{@link de.jena.model.glt.impl.AlarmImpl#getPriorityWinter <em>Priority Winter</em>}</li>
 *   <li>{@link de.jena.model.glt.impl.AlarmImpl#getSystemId <em>System Id</em>}</li>
 *   <li>{@link de.jena.model.glt.impl.AlarmImpl#getFlag <em>Flag</em>}</li>
 * </ul>
 *
 * @generated
 */
public class AlarmImpl extends MinimalEObjectImpl.Container implements Alarm {
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
	 * The cached value of the '{@link #getId() <em>Id</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getId()
	 * @generated
	 * @ordered
	 */
	protected AlarmId id;

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
	 * The default value of the '{@link #getDescription() <em>Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDescription()
	 * @generated
	 * @ordered
	 */
	protected static final Integer DESCRIPTION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDescription() <em>Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDescription()
	 * @generated
	 * @ordered
	 */
	protected Integer description = DESCRIPTION_EDEFAULT;

	/**
	 * The default value of the '{@link #getConsequence() <em>Consequence</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConsequence()
	 * @generated
	 * @ordered
	 */
	protected static final Integer CONSEQUENCE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getConsequence() <em>Consequence</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConsequence()
	 * @generated
	 * @ordered
	 */
	protected Integer consequence = CONSEQUENCE_EDEFAULT;

	/**
	 * The default value of the '{@link #getCause() <em>Cause</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCause()
	 * @generated
	 * @ordered
	 */
	protected static final Integer CAUSE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getCause() <em>Cause</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCause()
	 * @generated
	 * @ordered
	 */
	protected Integer cause = CAUSE_EDEFAULT;

	/**
	 * The default value of the '{@link #getSl24schedule() <em>Sl24schedule</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSl24schedule()
	 * @generated
	 * @ordered
	 */
	protected static final Integer SL24SCHEDULE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getSl24schedule() <em>Sl24schedule</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSl24schedule()
	 * @generated
	 * @ordered
	 */
	protected Integer sl24schedule = SL24SCHEDULE_EDEFAULT;

	/**
	 * The default value of the '{@link #getPrioritySummer() <em>Priority Summer</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPrioritySummer()
	 * @generated
	 * @ordered
	 */
	protected static final Integer PRIORITY_SUMMER_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getPrioritySummer() <em>Priority Summer</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPrioritySummer()
	 * @generated
	 * @ordered
	 */
	protected Integer prioritySummer = PRIORITY_SUMMER_EDEFAULT;

	/**
	 * The default value of the '{@link #getPriorityWinter() <em>Priority Winter</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPriorityWinter()
	 * @generated
	 * @ordered
	 */
	protected static final Integer PRIORITY_WINTER_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getPriorityWinter() <em>Priority Winter</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPriorityWinter()
	 * @generated
	 * @ordered
	 */
	protected Integer priorityWinter = PRIORITY_WINTER_EDEFAULT;

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
	 * The default value of the '{@link #getFlag() <em>Flag</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFlag()
	 * @generated
	 * @ordered
	 */
	protected static final String FLAG_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getFlag() <em>Flag</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFlag()
	 * @generated
	 * @ordered
	 */
	protected String flag = FLAG_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AlarmImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return GltPackage.eINSTANCE.getAlarm();
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
			eNotify(new ENotificationImpl(this, Notification.SET, GltPackage.ALARM__FLAGS, oldFlags, flags));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public AlarmId getId() {
		return id;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetId(AlarmId newId, NotificationChain msgs) {
		AlarmId oldId = id;
		id = newId;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, GltPackage.ALARM__ID, oldId, newId);
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
	public void setId(AlarmId newId) {
		if (newId != id) {
			NotificationChain msgs = null;
			if (id != null)
				msgs = ((InternalEObject)id).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - GltPackage.ALARM__ID, null, msgs);
			if (newId != null)
				msgs = ((InternalEObject)newId).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - GltPackage.ALARM__ID, null, msgs);
			msgs = basicSetId(newId, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GltPackage.ALARM__ID, newId, newId));
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
			eNotify(new ENotificationImpl(this, Notification.SET, GltPackage.ALARM__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Integer getDescription() {
		return description;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setDescription(Integer newDescription) {
		Integer oldDescription = description;
		description = newDescription;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GltPackage.ALARM__DESCRIPTION, oldDescription, description));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Integer getConsequence() {
		return consequence;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setConsequence(Integer newConsequence) {
		Integer oldConsequence = consequence;
		consequence = newConsequence;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GltPackage.ALARM__CONSEQUENCE, oldConsequence, consequence));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Integer getCause() {
		return cause;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setCause(Integer newCause) {
		Integer oldCause = cause;
		cause = newCause;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GltPackage.ALARM__CAUSE, oldCause, cause));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Integer getSl24schedule() {
		return sl24schedule;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setSl24schedule(Integer newSl24schedule) {
		Integer oldSl24schedule = sl24schedule;
		sl24schedule = newSl24schedule;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GltPackage.ALARM__SL24SCHEDULE, oldSl24schedule, sl24schedule));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Integer getPrioritySummer() {
		return prioritySummer;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setPrioritySummer(Integer newPrioritySummer) {
		Integer oldPrioritySummer = prioritySummer;
		prioritySummer = newPrioritySummer;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GltPackage.ALARM__PRIORITY_SUMMER, oldPrioritySummer, prioritySummer));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Integer getPriorityWinter() {
		return priorityWinter;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setPriorityWinter(Integer newPriorityWinter) {
		Integer oldPriorityWinter = priorityWinter;
		priorityWinter = newPriorityWinter;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GltPackage.ALARM__PRIORITY_WINTER, oldPriorityWinter, priorityWinter));
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
			eNotify(new ENotificationImpl(this, Notification.SET, GltPackage.ALARM__SYSTEM_ID, oldSystemId, systemId));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getFlag() {
		return flag;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setFlag(String newFlag) {
		String oldFlag = flag;
		flag = newFlag;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GltPackage.ALARM__FLAG, oldFlag, flag));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case GltPackage.ALARM__ID:
				return basicSetId(null, msgs);
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
			case GltPackage.ALARM__FLAGS:
				return getFlags();
			case GltPackage.ALARM__ID:
				return getId();
			case GltPackage.ALARM__NAME:
				return getName();
			case GltPackage.ALARM__DESCRIPTION:
				return getDescription();
			case GltPackage.ALARM__CONSEQUENCE:
				return getConsequence();
			case GltPackage.ALARM__CAUSE:
				return getCause();
			case GltPackage.ALARM__SL24SCHEDULE:
				return getSl24schedule();
			case GltPackage.ALARM__PRIORITY_SUMMER:
				return getPrioritySummer();
			case GltPackage.ALARM__PRIORITY_WINTER:
				return getPriorityWinter();
			case GltPackage.ALARM__SYSTEM_ID:
				return getSystemId();
			case GltPackage.ALARM__FLAG:
				return getFlag();
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
			case GltPackage.ALARM__FLAGS:
				setFlags((Integer)newValue);
				return;
			case GltPackage.ALARM__ID:
				setId((AlarmId)newValue);
				return;
			case GltPackage.ALARM__NAME:
				setName((String)newValue);
				return;
			case GltPackage.ALARM__DESCRIPTION:
				setDescription((Integer)newValue);
				return;
			case GltPackage.ALARM__CONSEQUENCE:
				setConsequence((Integer)newValue);
				return;
			case GltPackage.ALARM__CAUSE:
				setCause((Integer)newValue);
				return;
			case GltPackage.ALARM__SL24SCHEDULE:
				setSl24schedule((Integer)newValue);
				return;
			case GltPackage.ALARM__PRIORITY_SUMMER:
				setPrioritySummer((Integer)newValue);
				return;
			case GltPackage.ALARM__PRIORITY_WINTER:
				setPriorityWinter((Integer)newValue);
				return;
			case GltPackage.ALARM__SYSTEM_ID:
				setSystemId((String)newValue);
				return;
			case GltPackage.ALARM__FLAG:
				setFlag((String)newValue);
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
			case GltPackage.ALARM__FLAGS:
				setFlags(FLAGS_EDEFAULT);
				return;
			case GltPackage.ALARM__ID:
				setId((AlarmId)null);
				return;
			case GltPackage.ALARM__NAME:
				setName(NAME_EDEFAULT);
				return;
			case GltPackage.ALARM__DESCRIPTION:
				setDescription(DESCRIPTION_EDEFAULT);
				return;
			case GltPackage.ALARM__CONSEQUENCE:
				setConsequence(CONSEQUENCE_EDEFAULT);
				return;
			case GltPackage.ALARM__CAUSE:
				setCause(CAUSE_EDEFAULT);
				return;
			case GltPackage.ALARM__SL24SCHEDULE:
				setSl24schedule(SL24SCHEDULE_EDEFAULT);
				return;
			case GltPackage.ALARM__PRIORITY_SUMMER:
				setPrioritySummer(PRIORITY_SUMMER_EDEFAULT);
				return;
			case GltPackage.ALARM__PRIORITY_WINTER:
				setPriorityWinter(PRIORITY_WINTER_EDEFAULT);
				return;
			case GltPackage.ALARM__SYSTEM_ID:
				setSystemId(SYSTEM_ID_EDEFAULT);
				return;
			case GltPackage.ALARM__FLAG:
				setFlag(FLAG_EDEFAULT);
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
			case GltPackage.ALARM__FLAGS:
				return FLAGS_EDEFAULT == null ? flags != null : !FLAGS_EDEFAULT.equals(flags);
			case GltPackage.ALARM__ID:
				return id != null;
			case GltPackage.ALARM__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case GltPackage.ALARM__DESCRIPTION:
				return DESCRIPTION_EDEFAULT == null ? description != null : !DESCRIPTION_EDEFAULT.equals(description);
			case GltPackage.ALARM__CONSEQUENCE:
				return CONSEQUENCE_EDEFAULT == null ? consequence != null : !CONSEQUENCE_EDEFAULT.equals(consequence);
			case GltPackage.ALARM__CAUSE:
				return CAUSE_EDEFAULT == null ? cause != null : !CAUSE_EDEFAULT.equals(cause);
			case GltPackage.ALARM__SL24SCHEDULE:
				return SL24SCHEDULE_EDEFAULT == null ? sl24schedule != null : !SL24SCHEDULE_EDEFAULT.equals(sl24schedule);
			case GltPackage.ALARM__PRIORITY_SUMMER:
				return PRIORITY_SUMMER_EDEFAULT == null ? prioritySummer != null : !PRIORITY_SUMMER_EDEFAULT.equals(prioritySummer);
			case GltPackage.ALARM__PRIORITY_WINTER:
				return PRIORITY_WINTER_EDEFAULT == null ? priorityWinter != null : !PRIORITY_WINTER_EDEFAULT.equals(priorityWinter);
			case GltPackage.ALARM__SYSTEM_ID:
				return SYSTEM_ID_EDEFAULT == null ? systemId != null : !SYSTEM_ID_EDEFAULT.equals(systemId);
			case GltPackage.ALARM__FLAG:
				return FLAG_EDEFAULT == null ? flag != null : !FLAG_EDEFAULT.equals(flag);
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
		result.append(" (flags: ");
		result.append(flags);
		result.append(", name: ");
		result.append(name);
		result.append(", description: ");
		result.append(description);
		result.append(", consequence: ");
		result.append(consequence);
		result.append(", cause: ");
		result.append(cause);
		result.append(", sl24schedule: ");
		result.append(sl24schedule);
		result.append(", prioritySummer: ");
		result.append(prioritySummer);
		result.append(", priorityWinter: ");
		result.append(priorityWinter);
		result.append(", systemId: ");
		result.append(systemId);
		result.append(", flag: ");
		result.append(flag);
		result.append(')');
		return result.toString();
	}

} //AlarmImpl
