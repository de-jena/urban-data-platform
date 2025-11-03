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

import de.jena.model.glt.AddressPojo;
import de.jena.model.glt.GltPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Address Pojo</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link de.jena.model.glt.impl.AddressPojoImpl#getAddress <em>Address</em>}</li>
 *   <li>{@link de.jena.model.glt.impl.AddressPojoImpl#getCommunity <em>Community</em>}</li>
 *   <li>{@link de.jena.model.glt.impl.AddressPojoImpl#getCounty <em>County</em>}</li>
 *   <li>{@link de.jena.model.glt.impl.AddressPojoImpl#getCountry <em>Country</em>}</li>
 *   <li>{@link de.jena.model.glt.impl.AddressPojoImpl#getDescription <em>Description</em>}</li>
 *   <li>{@link de.jena.model.glt.impl.AddressPojoImpl#getDistrict <em>District</em>}</li>
 *   <li>{@link de.jena.model.glt.impl.AddressPojoImpl#getExtended <em>Extended</em>}</li>
 *   <li>{@link de.jena.model.glt.impl.AddressPojoImpl#getFederalState <em>Federal State</em>}</li>
 *   <li>{@link de.jena.model.glt.impl.AddressPojoImpl#getLocation <em>Location</em>}</li>
 *   <li>{@link de.jena.model.glt.impl.AddressPojoImpl#getNumber <em>Number</em>}</li>
 *   <li>{@link de.jena.model.glt.impl.AddressPojoImpl#getPostBox <em>Post Box</em>}</li>
 *   <li>{@link de.jena.model.glt.impl.AddressPojoImpl#getPostCode <em>Post Code</em>}</li>
 *   <li>{@link de.jena.model.glt.impl.AddressPojoImpl#getStreet <em>Street</em>}</li>
 *   <li>{@link de.jena.model.glt.impl.AddressPojoImpl#getRepresentation <em>Representation</em>}</li>
 * </ul>
 *
 * @generated
 */
public class AddressPojoImpl extends MinimalEObjectImpl.Container implements AddressPojo {
	/**
	 * The default value of the '{@link #getAddress() <em>Address</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAddress()
	 * @generated
	 * @ordered
	 */
	protected static final String ADDRESS_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getAddress() <em>Address</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAddress()
	 * @generated
	 * @ordered
	 */
	protected String address = ADDRESS_EDEFAULT;

	/**
	 * The default value of the '{@link #getCommunity() <em>Community</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCommunity()
	 * @generated
	 * @ordered
	 */
	protected static final String COMMUNITY_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getCommunity() <em>Community</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCommunity()
	 * @generated
	 * @ordered
	 */
	protected String community = COMMUNITY_EDEFAULT;

	/**
	 * The default value of the '{@link #getCounty() <em>County</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCounty()
	 * @generated
	 * @ordered
	 */
	protected static final String COUNTY_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getCounty() <em>County</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCounty()
	 * @generated
	 * @ordered
	 */
	protected String county = COUNTY_EDEFAULT;

	/**
	 * The default value of the '{@link #getCountry() <em>Country</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCountry()
	 * @generated
	 * @ordered
	 */
	protected static final String COUNTRY_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getCountry() <em>Country</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCountry()
	 * @generated
	 * @ordered
	 */
	protected String country = COUNTRY_EDEFAULT;

	/**
	 * The default value of the '{@link #getDescription() <em>Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDescription()
	 * @generated
	 * @ordered
	 */
	protected static final String DESCRIPTION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDescription() <em>Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDescription()
	 * @generated
	 * @ordered
	 */
	protected String description = DESCRIPTION_EDEFAULT;

	/**
	 * The default value of the '{@link #getDistrict() <em>District</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDistrict()
	 * @generated
	 * @ordered
	 */
	protected static final String DISTRICT_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDistrict() <em>District</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDistrict()
	 * @generated
	 * @ordered
	 */
	protected String district = DISTRICT_EDEFAULT;

	/**
	 * The default value of the '{@link #getExtended() <em>Extended</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getExtended()
	 * @generated
	 * @ordered
	 */
	protected static final String EXTENDED_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getExtended() <em>Extended</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getExtended()
	 * @generated
	 * @ordered
	 */
	protected String extended = EXTENDED_EDEFAULT;

	/**
	 * The default value of the '{@link #getFederalState() <em>Federal State</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFederalState()
	 * @generated
	 * @ordered
	 */
	protected static final String FEDERAL_STATE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getFederalState() <em>Federal State</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFederalState()
	 * @generated
	 * @ordered
	 */
	protected String federalState = FEDERAL_STATE_EDEFAULT;

	/**
	 * The default value of the '{@link #getLocation() <em>Location</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLocation()
	 * @generated
	 * @ordered
	 */
	protected static final String LOCATION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getLocation() <em>Location</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLocation()
	 * @generated
	 * @ordered
	 */
	protected String location = LOCATION_EDEFAULT;

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
	 * The default value of the '{@link #getPostBox() <em>Post Box</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPostBox()
	 * @generated
	 * @ordered
	 */
	protected static final String POST_BOX_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getPostBox() <em>Post Box</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPostBox()
	 * @generated
	 * @ordered
	 */
	protected String postBox = POST_BOX_EDEFAULT;

	/**
	 * The default value of the '{@link #getPostCode() <em>Post Code</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPostCode()
	 * @generated
	 * @ordered
	 */
	protected static final String POST_CODE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getPostCode() <em>Post Code</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPostCode()
	 * @generated
	 * @ordered
	 */
	protected String postCode = POST_CODE_EDEFAULT;

	/**
	 * The default value of the '{@link #getStreet() <em>Street</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStreet()
	 * @generated
	 * @ordered
	 */
	protected static final String STREET_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getStreet() <em>Street</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStreet()
	 * @generated
	 * @ordered
	 */
	protected String street = STREET_EDEFAULT;

	/**
	 * The default value of the '{@link #getRepresentation() <em>Representation</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRepresentation()
	 * @generated
	 * @ordered
	 */
	protected static final String REPRESENTATION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getRepresentation() <em>Representation</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRepresentation()
	 * @generated
	 * @ordered
	 */
	protected String representation = REPRESENTATION_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AddressPojoImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return GltPackage.eINSTANCE.getAddressPojo();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getAddress() {
		return address;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setAddress(String newAddress) {
		String oldAddress = address;
		address = newAddress;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GltPackage.ADDRESS_POJO__ADDRESS, oldAddress, address));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getCommunity() {
		return community;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setCommunity(String newCommunity) {
		String oldCommunity = community;
		community = newCommunity;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GltPackage.ADDRESS_POJO__COMMUNITY, oldCommunity, community));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getCounty() {
		return county;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setCounty(String newCounty) {
		String oldCounty = county;
		county = newCounty;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GltPackage.ADDRESS_POJO__COUNTY, oldCounty, county));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getCountry() {
		return country;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setCountry(String newCountry) {
		String oldCountry = country;
		country = newCountry;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GltPackage.ADDRESS_POJO__COUNTRY, oldCountry, country));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getDescription() {
		return description;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setDescription(String newDescription) {
		String oldDescription = description;
		description = newDescription;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GltPackage.ADDRESS_POJO__DESCRIPTION, oldDescription, description));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getDistrict() {
		return district;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setDistrict(String newDistrict) {
		String oldDistrict = district;
		district = newDistrict;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GltPackage.ADDRESS_POJO__DISTRICT, oldDistrict, district));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getExtended() {
		return extended;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setExtended(String newExtended) {
		String oldExtended = extended;
		extended = newExtended;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GltPackage.ADDRESS_POJO__EXTENDED, oldExtended, extended));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getFederalState() {
		return federalState;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setFederalState(String newFederalState) {
		String oldFederalState = federalState;
		federalState = newFederalState;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GltPackage.ADDRESS_POJO__FEDERAL_STATE, oldFederalState, federalState));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getLocation() {
		return location;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setLocation(String newLocation) {
		String oldLocation = location;
		location = newLocation;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GltPackage.ADDRESS_POJO__LOCATION, oldLocation, location));
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
			eNotify(new ENotificationImpl(this, Notification.SET, GltPackage.ADDRESS_POJO__NUMBER, oldNumber, number));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getPostBox() {
		return postBox;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setPostBox(String newPostBox) {
		String oldPostBox = postBox;
		postBox = newPostBox;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GltPackage.ADDRESS_POJO__POST_BOX, oldPostBox, postBox));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getPostCode() {
		return postCode;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setPostCode(String newPostCode) {
		String oldPostCode = postCode;
		postCode = newPostCode;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GltPackage.ADDRESS_POJO__POST_CODE, oldPostCode, postCode));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getStreet() {
		return street;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setStreet(String newStreet) {
		String oldStreet = street;
		street = newStreet;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GltPackage.ADDRESS_POJO__STREET, oldStreet, street));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getRepresentation() {
		return representation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setRepresentation(String newRepresentation) {
		String oldRepresentation = representation;
		representation = newRepresentation;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GltPackage.ADDRESS_POJO__REPRESENTATION, oldRepresentation, representation));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case GltPackage.ADDRESS_POJO__ADDRESS:
				return getAddress();
			case GltPackage.ADDRESS_POJO__COMMUNITY:
				return getCommunity();
			case GltPackage.ADDRESS_POJO__COUNTY:
				return getCounty();
			case GltPackage.ADDRESS_POJO__COUNTRY:
				return getCountry();
			case GltPackage.ADDRESS_POJO__DESCRIPTION:
				return getDescription();
			case GltPackage.ADDRESS_POJO__DISTRICT:
				return getDistrict();
			case GltPackage.ADDRESS_POJO__EXTENDED:
				return getExtended();
			case GltPackage.ADDRESS_POJO__FEDERAL_STATE:
				return getFederalState();
			case GltPackage.ADDRESS_POJO__LOCATION:
				return getLocation();
			case GltPackage.ADDRESS_POJO__NUMBER:
				return getNumber();
			case GltPackage.ADDRESS_POJO__POST_BOX:
				return getPostBox();
			case GltPackage.ADDRESS_POJO__POST_CODE:
				return getPostCode();
			case GltPackage.ADDRESS_POJO__STREET:
				return getStreet();
			case GltPackage.ADDRESS_POJO__REPRESENTATION:
				return getRepresentation();
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
			case GltPackage.ADDRESS_POJO__ADDRESS:
				setAddress((String)newValue);
				return;
			case GltPackage.ADDRESS_POJO__COMMUNITY:
				setCommunity((String)newValue);
				return;
			case GltPackage.ADDRESS_POJO__COUNTY:
				setCounty((String)newValue);
				return;
			case GltPackage.ADDRESS_POJO__COUNTRY:
				setCountry((String)newValue);
				return;
			case GltPackage.ADDRESS_POJO__DESCRIPTION:
				setDescription((String)newValue);
				return;
			case GltPackage.ADDRESS_POJO__DISTRICT:
				setDistrict((String)newValue);
				return;
			case GltPackage.ADDRESS_POJO__EXTENDED:
				setExtended((String)newValue);
				return;
			case GltPackage.ADDRESS_POJO__FEDERAL_STATE:
				setFederalState((String)newValue);
				return;
			case GltPackage.ADDRESS_POJO__LOCATION:
				setLocation((String)newValue);
				return;
			case GltPackage.ADDRESS_POJO__NUMBER:
				setNumber((String)newValue);
				return;
			case GltPackage.ADDRESS_POJO__POST_BOX:
				setPostBox((String)newValue);
				return;
			case GltPackage.ADDRESS_POJO__POST_CODE:
				setPostCode((String)newValue);
				return;
			case GltPackage.ADDRESS_POJO__STREET:
				setStreet((String)newValue);
				return;
			case GltPackage.ADDRESS_POJO__REPRESENTATION:
				setRepresentation((String)newValue);
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
			case GltPackage.ADDRESS_POJO__ADDRESS:
				setAddress(ADDRESS_EDEFAULT);
				return;
			case GltPackage.ADDRESS_POJO__COMMUNITY:
				setCommunity(COMMUNITY_EDEFAULT);
				return;
			case GltPackage.ADDRESS_POJO__COUNTY:
				setCounty(COUNTY_EDEFAULT);
				return;
			case GltPackage.ADDRESS_POJO__COUNTRY:
				setCountry(COUNTRY_EDEFAULT);
				return;
			case GltPackage.ADDRESS_POJO__DESCRIPTION:
				setDescription(DESCRIPTION_EDEFAULT);
				return;
			case GltPackage.ADDRESS_POJO__DISTRICT:
				setDistrict(DISTRICT_EDEFAULT);
				return;
			case GltPackage.ADDRESS_POJO__EXTENDED:
				setExtended(EXTENDED_EDEFAULT);
				return;
			case GltPackage.ADDRESS_POJO__FEDERAL_STATE:
				setFederalState(FEDERAL_STATE_EDEFAULT);
				return;
			case GltPackage.ADDRESS_POJO__LOCATION:
				setLocation(LOCATION_EDEFAULT);
				return;
			case GltPackage.ADDRESS_POJO__NUMBER:
				setNumber(NUMBER_EDEFAULT);
				return;
			case GltPackage.ADDRESS_POJO__POST_BOX:
				setPostBox(POST_BOX_EDEFAULT);
				return;
			case GltPackage.ADDRESS_POJO__POST_CODE:
				setPostCode(POST_CODE_EDEFAULT);
				return;
			case GltPackage.ADDRESS_POJO__STREET:
				setStreet(STREET_EDEFAULT);
				return;
			case GltPackage.ADDRESS_POJO__REPRESENTATION:
				setRepresentation(REPRESENTATION_EDEFAULT);
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
			case GltPackage.ADDRESS_POJO__ADDRESS:
				return ADDRESS_EDEFAULT == null ? address != null : !ADDRESS_EDEFAULT.equals(address);
			case GltPackage.ADDRESS_POJO__COMMUNITY:
				return COMMUNITY_EDEFAULT == null ? community != null : !COMMUNITY_EDEFAULT.equals(community);
			case GltPackage.ADDRESS_POJO__COUNTY:
				return COUNTY_EDEFAULT == null ? county != null : !COUNTY_EDEFAULT.equals(county);
			case GltPackage.ADDRESS_POJO__COUNTRY:
				return COUNTRY_EDEFAULT == null ? country != null : !COUNTRY_EDEFAULT.equals(country);
			case GltPackage.ADDRESS_POJO__DESCRIPTION:
				return DESCRIPTION_EDEFAULT == null ? description != null : !DESCRIPTION_EDEFAULT.equals(description);
			case GltPackage.ADDRESS_POJO__DISTRICT:
				return DISTRICT_EDEFAULT == null ? district != null : !DISTRICT_EDEFAULT.equals(district);
			case GltPackage.ADDRESS_POJO__EXTENDED:
				return EXTENDED_EDEFAULT == null ? extended != null : !EXTENDED_EDEFAULT.equals(extended);
			case GltPackage.ADDRESS_POJO__FEDERAL_STATE:
				return FEDERAL_STATE_EDEFAULT == null ? federalState != null : !FEDERAL_STATE_EDEFAULT.equals(federalState);
			case GltPackage.ADDRESS_POJO__LOCATION:
				return LOCATION_EDEFAULT == null ? location != null : !LOCATION_EDEFAULT.equals(location);
			case GltPackage.ADDRESS_POJO__NUMBER:
				return NUMBER_EDEFAULT == null ? number != null : !NUMBER_EDEFAULT.equals(number);
			case GltPackage.ADDRESS_POJO__POST_BOX:
				return POST_BOX_EDEFAULT == null ? postBox != null : !POST_BOX_EDEFAULT.equals(postBox);
			case GltPackage.ADDRESS_POJO__POST_CODE:
				return POST_CODE_EDEFAULT == null ? postCode != null : !POST_CODE_EDEFAULT.equals(postCode);
			case GltPackage.ADDRESS_POJO__STREET:
				return STREET_EDEFAULT == null ? street != null : !STREET_EDEFAULT.equals(street);
			case GltPackage.ADDRESS_POJO__REPRESENTATION:
				return REPRESENTATION_EDEFAULT == null ? representation != null : !REPRESENTATION_EDEFAULT.equals(representation);
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
		result.append(" (address: ");
		result.append(address);
		result.append(", community: ");
		result.append(community);
		result.append(", county: ");
		result.append(county);
		result.append(", country: ");
		result.append(country);
		result.append(", description: ");
		result.append(description);
		result.append(", district: ");
		result.append(district);
		result.append(", extended: ");
		result.append(extended);
		result.append(", federalState: ");
		result.append(federalState);
		result.append(", location: ");
		result.append(location);
		result.append(", number: ");
		result.append(number);
		result.append(", postBox: ");
		result.append(postBox);
		result.append(", postCode: ");
		result.append(postCode);
		result.append(", street: ");
		result.append(street);
		result.append(", representation: ");
		result.append(representation);
		result.append(')');
		return result.toString();
	}

} //AddressPojoImpl
