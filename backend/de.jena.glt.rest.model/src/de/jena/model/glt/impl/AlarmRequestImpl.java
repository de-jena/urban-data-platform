/*
 * Copyright (c) 2012 - 2025 Data In Motion and others.
 * All rights reserved. 
 * 
 * This program and the accompanying materials are made
 * available under the terms of the Eclipse Public License 2.0
 * which is available at https://www.eclipse.org/legal/epl-2.0/
 * 
 * SPDX-License-Identifier: EPL-2.0
 * 
 * Contributors:
 *     Data In Motion - initial API and implementation
 */
package de.jena.model.glt.impl;

import de.jena.model.glt.AlarmRequest;
import de.jena.model.glt.GltPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Alarm Request</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link de.jena.model.glt.impl.AlarmRequestImpl#getName <em>Name</em>}</li>
 *   <li>{@link de.jena.model.glt.impl.AlarmRequestImpl#getPrioritySummer <em>Priority Summer</em>}</li>
 *   <li>{@link de.jena.model.glt.impl.AlarmRequestImpl#getPriorityWinter <em>Priority Winter</em>}</li>
 *   <li>{@link de.jena.model.glt.impl.AlarmRequestImpl#getFlags <em>Flags</em>}</li>
 *   <li>{@link de.jena.model.glt.impl.AlarmRequestImpl#getDescription <em>Description</em>}</li>
 *   <li>{@link de.jena.model.glt.impl.AlarmRequestImpl#getConsequence <em>Consequence</em>}</li>
 *   <li>{@link de.jena.model.glt.impl.AlarmRequestImpl#getCause <em>Cause</em>}</li>
 *   <li>{@link de.jena.model.glt.impl.AlarmRequestImpl#getSl24Schedule <em>Sl24 Schedule</em>}</li>
 * </ul>
 *
 * @generated
 */
public class AlarmRequestImpl extends MinimalEObjectImpl.Container implements AlarmRequest {
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
	 * The default value of the '{@link #getSl24Schedule() <em>Sl24 Schedule</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSl24Schedule()
	 * @generated
	 * @ordered
	 */
	protected static final Integer SL24_SCHEDULE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getSl24Schedule() <em>Sl24 Schedule</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSl24Schedule()
	 * @generated
	 * @ordered
	 */
	protected Integer sl24Schedule = SL24_SCHEDULE_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AlarmRequestImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return GltPackage.eINSTANCE.getAlarmRequest();
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
			eNotify(new ENotificationImpl(this, Notification.SET, GltPackage.ALARM_REQUEST__NAME, oldName, name));
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
			eNotify(new ENotificationImpl(this, Notification.SET, GltPackage.ALARM_REQUEST__PRIORITY_SUMMER, oldPrioritySummer, prioritySummer));
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
			eNotify(new ENotificationImpl(this, Notification.SET, GltPackage.ALARM_REQUEST__PRIORITY_WINTER, oldPriorityWinter, priorityWinter));
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
			eNotify(new ENotificationImpl(this, Notification.SET, GltPackage.ALARM_REQUEST__FLAGS, oldFlags, flags));
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
			eNotify(new ENotificationImpl(this, Notification.SET, GltPackage.ALARM_REQUEST__DESCRIPTION, oldDescription, description));
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
			eNotify(new ENotificationImpl(this, Notification.SET, GltPackage.ALARM_REQUEST__CONSEQUENCE, oldConsequence, consequence));
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
			eNotify(new ENotificationImpl(this, Notification.SET, GltPackage.ALARM_REQUEST__CAUSE, oldCause, cause));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Integer getSl24Schedule() {
		return sl24Schedule;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setSl24Schedule(Integer newSl24Schedule) {
		Integer oldSl24Schedule = sl24Schedule;
		sl24Schedule = newSl24Schedule;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GltPackage.ALARM_REQUEST__SL24_SCHEDULE, oldSl24Schedule, sl24Schedule));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case GltPackage.ALARM_REQUEST__NAME:
				return getName();
			case GltPackage.ALARM_REQUEST__PRIORITY_SUMMER:
				return getPrioritySummer();
			case GltPackage.ALARM_REQUEST__PRIORITY_WINTER:
				return getPriorityWinter();
			case GltPackage.ALARM_REQUEST__FLAGS:
				return getFlags();
			case GltPackage.ALARM_REQUEST__DESCRIPTION:
				return getDescription();
			case GltPackage.ALARM_REQUEST__CONSEQUENCE:
				return getConsequence();
			case GltPackage.ALARM_REQUEST__CAUSE:
				return getCause();
			case GltPackage.ALARM_REQUEST__SL24_SCHEDULE:
				return getSl24Schedule();
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
			case GltPackage.ALARM_REQUEST__NAME:
				setName((String)newValue);
				return;
			case GltPackage.ALARM_REQUEST__PRIORITY_SUMMER:
				setPrioritySummer((Integer)newValue);
				return;
			case GltPackage.ALARM_REQUEST__PRIORITY_WINTER:
				setPriorityWinter((Integer)newValue);
				return;
			case GltPackage.ALARM_REQUEST__FLAGS:
				setFlags((Integer)newValue);
				return;
			case GltPackage.ALARM_REQUEST__DESCRIPTION:
				setDescription((Integer)newValue);
				return;
			case GltPackage.ALARM_REQUEST__CONSEQUENCE:
				setConsequence((Integer)newValue);
				return;
			case GltPackage.ALARM_REQUEST__CAUSE:
				setCause((Integer)newValue);
				return;
			case GltPackage.ALARM_REQUEST__SL24_SCHEDULE:
				setSl24Schedule((Integer)newValue);
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
			case GltPackage.ALARM_REQUEST__NAME:
				setName(NAME_EDEFAULT);
				return;
			case GltPackage.ALARM_REQUEST__PRIORITY_SUMMER:
				setPrioritySummer(PRIORITY_SUMMER_EDEFAULT);
				return;
			case GltPackage.ALARM_REQUEST__PRIORITY_WINTER:
				setPriorityWinter(PRIORITY_WINTER_EDEFAULT);
				return;
			case GltPackage.ALARM_REQUEST__FLAGS:
				setFlags(FLAGS_EDEFAULT);
				return;
			case GltPackage.ALARM_REQUEST__DESCRIPTION:
				setDescription(DESCRIPTION_EDEFAULT);
				return;
			case GltPackage.ALARM_REQUEST__CONSEQUENCE:
				setConsequence(CONSEQUENCE_EDEFAULT);
				return;
			case GltPackage.ALARM_REQUEST__CAUSE:
				setCause(CAUSE_EDEFAULT);
				return;
			case GltPackage.ALARM_REQUEST__SL24_SCHEDULE:
				setSl24Schedule(SL24_SCHEDULE_EDEFAULT);
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
			case GltPackage.ALARM_REQUEST__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case GltPackage.ALARM_REQUEST__PRIORITY_SUMMER:
				return PRIORITY_SUMMER_EDEFAULT == null ? prioritySummer != null : !PRIORITY_SUMMER_EDEFAULT.equals(prioritySummer);
			case GltPackage.ALARM_REQUEST__PRIORITY_WINTER:
				return PRIORITY_WINTER_EDEFAULT == null ? priorityWinter != null : !PRIORITY_WINTER_EDEFAULT.equals(priorityWinter);
			case GltPackage.ALARM_REQUEST__FLAGS:
				return FLAGS_EDEFAULT == null ? flags != null : !FLAGS_EDEFAULT.equals(flags);
			case GltPackage.ALARM_REQUEST__DESCRIPTION:
				return DESCRIPTION_EDEFAULT == null ? description != null : !DESCRIPTION_EDEFAULT.equals(description);
			case GltPackage.ALARM_REQUEST__CONSEQUENCE:
				return CONSEQUENCE_EDEFAULT == null ? consequence != null : !CONSEQUENCE_EDEFAULT.equals(consequence);
			case GltPackage.ALARM_REQUEST__CAUSE:
				return CAUSE_EDEFAULT == null ? cause != null : !CAUSE_EDEFAULT.equals(cause);
			case GltPackage.ALARM_REQUEST__SL24_SCHEDULE:
				return SL24_SCHEDULE_EDEFAULT == null ? sl24Schedule != null : !SL24_SCHEDULE_EDEFAULT.equals(sl24Schedule);
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
		result.append(" (name: ");
		result.append(name);
		result.append(", prioritySummer: ");
		result.append(prioritySummer);
		result.append(", priorityWinter: ");
		result.append(priorityWinter);
		result.append(", flags: ");
		result.append(flags);
		result.append(", description: ");
		result.append(description);
		result.append(", consequence: ");
		result.append(consequence);
		result.append(", cause: ");
		result.append(cause);
		result.append(", sl24Schedule: ");
		result.append(sl24Schedule);
		result.append(')');
		return result.toString();
	}

} //AlarmRequestImpl
