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

import de.jena.model.glt.ContactPojo;
import de.jena.model.glt.ContractPojo;
import de.jena.model.glt.GltPackage;

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
 * An implementation of the model object '<em><b>Contract Pojo</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link de.jena.model.glt.impl.ContractPojoImpl#getArt <em>Art</em>}</li>
 *   <li>{@link de.jena.model.glt.impl.ContractPojoImpl#getName <em>Name</em>}</li>
 *   <li>{@link de.jena.model.glt.impl.ContractPojoImpl#getDisplayname <em>Displayname</em>}</li>
 *   <li>{@link de.jena.model.glt.impl.ContractPojoImpl#getConclusionDate <em>Conclusion Date</em>}</li>
 *   <li>{@link de.jena.model.glt.impl.ContractPojoImpl#getComment <em>Comment</em>}</li>
 *   <li>{@link de.jena.model.glt.impl.ContractPojoImpl#getContacts <em>Contacts</em>}</li>
 *   <li>{@link de.jena.model.glt.impl.ContractPojoImpl#getCustomerId <em>Customer Id</em>}</li>
 *   <li>{@link de.jena.model.glt.impl.ContractPojoImpl#getEnd <em>End</em>}</li>
 *   <li>{@link de.jena.model.glt.impl.ContractPojoImpl#getNumber <em>Number</em>}</li>
 *   <li>{@link de.jena.model.glt.impl.ContractPojoImpl#getPartner <em>Partner</em>}</li>
 *   <li>{@link de.jena.model.glt.impl.ContractPojoImpl#getReferee <em>Referee</em>}</li>
 *   <li>{@link de.jena.model.glt.impl.ContractPojoImpl#getStart <em>Start</em>}</li>
 *   <li>{@link de.jena.model.glt.impl.ContractPojoImpl#getState <em>State</em>}</li>
 *   <li>{@link de.jena.model.glt.impl.ContractPojoImpl#getSubject <em>Subject</em>}</li>
 *   <li>{@link de.jena.model.glt.impl.ContractPojoImpl#getTermination <em>Termination</em>}</li>
 *   <li>{@link de.jena.model.glt.impl.ContractPojoImpl#getType <em>Type</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ContractPojoImpl extends MinimalEObjectImpl.Container implements ContractPojo {
	/**
	 * The default value of the '{@link #getArt() <em>Art</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getArt()
	 * @generated
	 * @ordered
	 */
	protected static final Integer ART_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getArt() <em>Art</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getArt()
	 * @generated
	 * @ordered
	 */
	protected Integer art = ART_EDEFAULT;

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
	 * The default value of the '{@link #getDisplayname() <em>Displayname</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDisplayname()
	 * @generated
	 * @ordered
	 */
	protected static final String DISPLAYNAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDisplayname() <em>Displayname</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDisplayname()
	 * @generated
	 * @ordered
	 */
	protected String displayname = DISPLAYNAME_EDEFAULT;

	/**
	 * The default value of the '{@link #getConclusionDate() <em>Conclusion Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConclusionDate()
	 * @generated
	 * @ordered
	 */
	protected static final String CONCLUSION_DATE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getConclusionDate() <em>Conclusion Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConclusionDate()
	 * @generated
	 * @ordered
	 */
	protected String conclusionDate = CONCLUSION_DATE_EDEFAULT;

	/**
	 * The default value of the '{@link #getComment() <em>Comment</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getComment()
	 * @generated
	 * @ordered
	 */
	protected static final String COMMENT_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getComment() <em>Comment</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getComment()
	 * @generated
	 * @ordered
	 */
	protected String comment = COMMENT_EDEFAULT;

	/**
	 * The cached value of the '{@link #getContacts() <em>Contacts</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getContacts()
	 * @generated
	 * @ordered
	 */
	protected EList<ContactPojo> contacts;

	/**
	 * The default value of the '{@link #getCustomerId() <em>Customer Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCustomerId()
	 * @generated
	 * @ordered
	 */
	protected static final String CUSTOMER_ID_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getCustomerId() <em>Customer Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCustomerId()
	 * @generated
	 * @ordered
	 */
	protected String customerId = CUSTOMER_ID_EDEFAULT;

	/**
	 * The default value of the '{@link #getEnd() <em>End</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEnd()
	 * @generated
	 * @ordered
	 */
	protected static final String END_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getEnd() <em>End</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEnd()
	 * @generated
	 * @ordered
	 */
	protected String end = END_EDEFAULT;

	/**
	 * The default value of the '{@link #getNumber() <em>Number</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNumber()
	 * @generated
	 * @ordered
	 */
	protected static final String NUMBER_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getNumber() <em>Number</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNumber()
	 * @generated
	 * @ordered
	 */
	protected String number = NUMBER_EDEFAULT;

	/**
	 * The cached value of the '{@link #getPartner() <em>Partner</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPartner()
	 * @generated
	 * @ordered
	 */
	protected ContactPojo partner;

	/**
	 * The cached value of the '{@link #getReferee() <em>Referee</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReferee()
	 * @generated
	 * @ordered
	 */
	protected ContactPojo referee;

	/**
	 * The default value of the '{@link #getStart() <em>Start</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStart()
	 * @generated
	 * @ordered
	 */
	protected static final String START_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getStart() <em>Start</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStart()
	 * @generated
	 * @ordered
	 */
	protected String start = START_EDEFAULT;

	/**
	 * The default value of the '{@link #getState() <em>State</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getState()
	 * @generated
	 * @ordered
	 */
	protected static final String STATE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getState() <em>State</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getState()
	 * @generated
	 * @ordered
	 */
	protected String state = STATE_EDEFAULT;

	/**
	 * The default value of the '{@link #getSubject() <em>Subject</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSubject()
	 * @generated
	 * @ordered
	 */
	protected static final String SUBJECT_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getSubject() <em>Subject</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSubject()
	 * @generated
	 * @ordered
	 */
	protected String subject = SUBJECT_EDEFAULT;

	/**
	 * The default value of the '{@link #getTermination() <em>Termination</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTermination()
	 * @generated
	 * @ordered
	 */
	protected static final String TERMINATION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getTermination() <em>Termination</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTermination()
	 * @generated
	 * @ordered
	 */
	protected String termination = TERMINATION_EDEFAULT;

	/**
	 * The default value of the '{@link #getType() <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getType()
	 * @generated
	 * @ordered
	 */
	protected static final Integer TYPE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getType() <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getType()
	 * @generated
	 * @ordered
	 */
	protected Integer type = TYPE_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ContractPojoImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return GltPackage.eINSTANCE.getContractPojo();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Integer getArt() {
		return art;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setArt(Integer newArt) {
		Integer oldArt = art;
		art = newArt;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GltPackage.CONTRACT_POJO__ART, oldArt, art));
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
			eNotify(new ENotificationImpl(this, Notification.SET, GltPackage.CONTRACT_POJO__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getDisplayname() {
		return displayname;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setDisplayname(String newDisplayname) {
		String oldDisplayname = displayname;
		displayname = newDisplayname;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GltPackage.CONTRACT_POJO__DISPLAYNAME, oldDisplayname, displayname));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getConclusionDate() {
		return conclusionDate;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setConclusionDate(String newConclusionDate) {
		String oldConclusionDate = conclusionDate;
		conclusionDate = newConclusionDate;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GltPackage.CONTRACT_POJO__CONCLUSION_DATE, oldConclusionDate, conclusionDate));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getComment() {
		return comment;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setComment(String newComment) {
		String oldComment = comment;
		comment = newComment;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GltPackage.CONTRACT_POJO__COMMENT, oldComment, comment));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<ContactPojo> getContacts() {
		if (contacts == null) {
			contacts = new EObjectContainmentEList<ContactPojo>(ContactPojo.class, this, GltPackage.CONTRACT_POJO__CONTACTS);
		}
		return contacts;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getCustomerId() {
		return customerId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setCustomerId(String newCustomerId) {
		String oldCustomerId = customerId;
		customerId = newCustomerId;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GltPackage.CONTRACT_POJO__CUSTOMER_ID, oldCustomerId, customerId));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getEnd() {
		return end;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setEnd(String newEnd) {
		String oldEnd = end;
		end = newEnd;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GltPackage.CONTRACT_POJO__END, oldEnd, end));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getNumber() {
		return number;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setNumber(String newNumber) {
		String oldNumber = number;
		number = newNumber;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GltPackage.CONTRACT_POJO__NUMBER, oldNumber, number));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ContactPojo getPartner() {
		return partner;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetPartner(ContactPojo newPartner, NotificationChain msgs) {
		ContactPojo oldPartner = partner;
		partner = newPartner;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, GltPackage.CONTRACT_POJO__PARTNER, oldPartner, newPartner);
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
	public void setPartner(ContactPojo newPartner) {
		if (newPartner != partner) {
			NotificationChain msgs = null;
			if (partner != null)
				msgs = ((InternalEObject)partner).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - GltPackage.CONTRACT_POJO__PARTNER, null, msgs);
			if (newPartner != null)
				msgs = ((InternalEObject)newPartner).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - GltPackage.CONTRACT_POJO__PARTNER, null, msgs);
			msgs = basicSetPartner(newPartner, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GltPackage.CONTRACT_POJO__PARTNER, newPartner, newPartner));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ContactPojo getReferee() {
		return referee;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetReferee(ContactPojo newReferee, NotificationChain msgs) {
		ContactPojo oldReferee = referee;
		referee = newReferee;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, GltPackage.CONTRACT_POJO__REFEREE, oldReferee, newReferee);
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
	public void setReferee(ContactPojo newReferee) {
		if (newReferee != referee) {
			NotificationChain msgs = null;
			if (referee != null)
				msgs = ((InternalEObject)referee).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - GltPackage.CONTRACT_POJO__REFEREE, null, msgs);
			if (newReferee != null)
				msgs = ((InternalEObject)newReferee).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - GltPackage.CONTRACT_POJO__REFEREE, null, msgs);
			msgs = basicSetReferee(newReferee, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GltPackage.CONTRACT_POJO__REFEREE, newReferee, newReferee));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getStart() {
		return start;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setStart(String newStart) {
		String oldStart = start;
		start = newStart;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GltPackage.CONTRACT_POJO__START, oldStart, start));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getState() {
		return state;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setState(String newState) {
		String oldState = state;
		state = newState;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GltPackage.CONTRACT_POJO__STATE, oldState, state));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getSubject() {
		return subject;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setSubject(String newSubject) {
		String oldSubject = subject;
		subject = newSubject;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GltPackage.CONTRACT_POJO__SUBJECT, oldSubject, subject));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getTermination() {
		return termination;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setTermination(String newTermination) {
		String oldTermination = termination;
		termination = newTermination;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GltPackage.CONTRACT_POJO__TERMINATION, oldTermination, termination));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Integer getType() {
		return type;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setType(Integer newType) {
		Integer oldType = type;
		type = newType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GltPackage.CONTRACT_POJO__TYPE, oldType, type));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case GltPackage.CONTRACT_POJO__CONTACTS:
				return ((InternalEList<?>)getContacts()).basicRemove(otherEnd, msgs);
			case GltPackage.CONTRACT_POJO__PARTNER:
				return basicSetPartner(null, msgs);
			case GltPackage.CONTRACT_POJO__REFEREE:
				return basicSetReferee(null, msgs);
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
			case GltPackage.CONTRACT_POJO__ART:
				return getArt();
			case GltPackage.CONTRACT_POJO__NAME:
				return getName();
			case GltPackage.CONTRACT_POJO__DISPLAYNAME:
				return getDisplayname();
			case GltPackage.CONTRACT_POJO__CONCLUSION_DATE:
				return getConclusionDate();
			case GltPackage.CONTRACT_POJO__COMMENT:
				return getComment();
			case GltPackage.CONTRACT_POJO__CONTACTS:
				return getContacts();
			case GltPackage.CONTRACT_POJO__CUSTOMER_ID:
				return getCustomerId();
			case GltPackage.CONTRACT_POJO__END:
				return getEnd();
			case GltPackage.CONTRACT_POJO__NUMBER:
				return getNumber();
			case GltPackage.CONTRACT_POJO__PARTNER:
				return getPartner();
			case GltPackage.CONTRACT_POJO__REFEREE:
				return getReferee();
			case GltPackage.CONTRACT_POJO__START:
				return getStart();
			case GltPackage.CONTRACT_POJO__STATE:
				return getState();
			case GltPackage.CONTRACT_POJO__SUBJECT:
				return getSubject();
			case GltPackage.CONTRACT_POJO__TERMINATION:
				return getTermination();
			case GltPackage.CONTRACT_POJO__TYPE:
				return getType();
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
			case GltPackage.CONTRACT_POJO__ART:
				setArt((Integer)newValue);
				return;
			case GltPackage.CONTRACT_POJO__NAME:
				setName((String)newValue);
				return;
			case GltPackage.CONTRACT_POJO__DISPLAYNAME:
				setDisplayname((String)newValue);
				return;
			case GltPackage.CONTRACT_POJO__CONCLUSION_DATE:
				setConclusionDate((String)newValue);
				return;
			case GltPackage.CONTRACT_POJO__COMMENT:
				setComment((String)newValue);
				return;
			case GltPackage.CONTRACT_POJO__CONTACTS:
				getContacts().clear();
				getContacts().addAll((Collection<? extends ContactPojo>)newValue);
				return;
			case GltPackage.CONTRACT_POJO__CUSTOMER_ID:
				setCustomerId((String)newValue);
				return;
			case GltPackage.CONTRACT_POJO__END:
				setEnd((String)newValue);
				return;
			case GltPackage.CONTRACT_POJO__NUMBER:
				setNumber((String)newValue);
				return;
			case GltPackage.CONTRACT_POJO__PARTNER:
				setPartner((ContactPojo)newValue);
				return;
			case GltPackage.CONTRACT_POJO__REFEREE:
				setReferee((ContactPojo)newValue);
				return;
			case GltPackage.CONTRACT_POJO__START:
				setStart((String)newValue);
				return;
			case GltPackage.CONTRACT_POJO__STATE:
				setState((String)newValue);
				return;
			case GltPackage.CONTRACT_POJO__SUBJECT:
				setSubject((String)newValue);
				return;
			case GltPackage.CONTRACT_POJO__TERMINATION:
				setTermination((String)newValue);
				return;
			case GltPackage.CONTRACT_POJO__TYPE:
				setType((Integer)newValue);
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
			case GltPackage.CONTRACT_POJO__ART:
				setArt(ART_EDEFAULT);
				return;
			case GltPackage.CONTRACT_POJO__NAME:
				setName(NAME_EDEFAULT);
				return;
			case GltPackage.CONTRACT_POJO__DISPLAYNAME:
				setDisplayname(DISPLAYNAME_EDEFAULT);
				return;
			case GltPackage.CONTRACT_POJO__CONCLUSION_DATE:
				setConclusionDate(CONCLUSION_DATE_EDEFAULT);
				return;
			case GltPackage.CONTRACT_POJO__COMMENT:
				setComment(COMMENT_EDEFAULT);
				return;
			case GltPackage.CONTRACT_POJO__CONTACTS:
				getContacts().clear();
				return;
			case GltPackage.CONTRACT_POJO__CUSTOMER_ID:
				setCustomerId(CUSTOMER_ID_EDEFAULT);
				return;
			case GltPackage.CONTRACT_POJO__END:
				setEnd(END_EDEFAULT);
				return;
			case GltPackage.CONTRACT_POJO__NUMBER:
				setNumber(NUMBER_EDEFAULT);
				return;
			case GltPackage.CONTRACT_POJO__PARTNER:
				setPartner((ContactPojo)null);
				return;
			case GltPackage.CONTRACT_POJO__REFEREE:
				setReferee((ContactPojo)null);
				return;
			case GltPackage.CONTRACT_POJO__START:
				setStart(START_EDEFAULT);
				return;
			case GltPackage.CONTRACT_POJO__STATE:
				setState(STATE_EDEFAULT);
				return;
			case GltPackage.CONTRACT_POJO__SUBJECT:
				setSubject(SUBJECT_EDEFAULT);
				return;
			case GltPackage.CONTRACT_POJO__TERMINATION:
				setTermination(TERMINATION_EDEFAULT);
				return;
			case GltPackage.CONTRACT_POJO__TYPE:
				setType(TYPE_EDEFAULT);
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
			case GltPackage.CONTRACT_POJO__ART:
				return ART_EDEFAULT == null ? art != null : !ART_EDEFAULT.equals(art);
			case GltPackage.CONTRACT_POJO__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case GltPackage.CONTRACT_POJO__DISPLAYNAME:
				return DISPLAYNAME_EDEFAULT == null ? displayname != null : !DISPLAYNAME_EDEFAULT.equals(displayname);
			case GltPackage.CONTRACT_POJO__CONCLUSION_DATE:
				return CONCLUSION_DATE_EDEFAULT == null ? conclusionDate != null : !CONCLUSION_DATE_EDEFAULT.equals(conclusionDate);
			case GltPackage.CONTRACT_POJO__COMMENT:
				return COMMENT_EDEFAULT == null ? comment != null : !COMMENT_EDEFAULT.equals(comment);
			case GltPackage.CONTRACT_POJO__CONTACTS:
				return contacts != null && !contacts.isEmpty();
			case GltPackage.CONTRACT_POJO__CUSTOMER_ID:
				return CUSTOMER_ID_EDEFAULT == null ? customerId != null : !CUSTOMER_ID_EDEFAULT.equals(customerId);
			case GltPackage.CONTRACT_POJO__END:
				return END_EDEFAULT == null ? end != null : !END_EDEFAULT.equals(end);
			case GltPackage.CONTRACT_POJO__NUMBER:
				return NUMBER_EDEFAULT == null ? number != null : !NUMBER_EDEFAULT.equals(number);
			case GltPackage.CONTRACT_POJO__PARTNER:
				return partner != null;
			case GltPackage.CONTRACT_POJO__REFEREE:
				return referee != null;
			case GltPackage.CONTRACT_POJO__START:
				return START_EDEFAULT == null ? start != null : !START_EDEFAULT.equals(start);
			case GltPackage.CONTRACT_POJO__STATE:
				return STATE_EDEFAULT == null ? state != null : !STATE_EDEFAULT.equals(state);
			case GltPackage.CONTRACT_POJO__SUBJECT:
				return SUBJECT_EDEFAULT == null ? subject != null : !SUBJECT_EDEFAULT.equals(subject);
			case GltPackage.CONTRACT_POJO__TERMINATION:
				return TERMINATION_EDEFAULT == null ? termination != null : !TERMINATION_EDEFAULT.equals(termination);
			case GltPackage.CONTRACT_POJO__TYPE:
				return TYPE_EDEFAULT == null ? type != null : !TYPE_EDEFAULT.equals(type);
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
		result.append(" (art: ");
		result.append(art);
		result.append(", name: ");
		result.append(name);
		result.append(", displayname: ");
		result.append(displayname);
		result.append(", conclusionDate: ");
		result.append(conclusionDate);
		result.append(", comment: ");
		result.append(comment);
		result.append(", customerId: ");
		result.append(customerId);
		result.append(", end: ");
		result.append(end);
		result.append(", number: ");
		result.append(number);
		result.append(", start: ");
		result.append(start);
		result.append(", state: ");
		result.append(state);
		result.append(", subject: ");
		result.append(subject);
		result.append(", termination: ");
		result.append(termination);
		result.append(", type: ");
		result.append(type);
		result.append(')');
		return result.toString();
	}

} //ContractPojoImpl
