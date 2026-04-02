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
package de.jena.bike.impl;

import de.jena.bike.BikePackage;
import de.jena.bike.site;
import de.jena.bike.site_counters;
import de.jena.bike.site_domain;
import de.jena.bike.site_images;
import de.jena.bike.site_location;
import de.jena.bike.site_segments;
import de.jena.bike.site_tags;
import de.jena.bike.site_travelModes;

import java.math.BigInteger;

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
 * An implementation of the model object '<em><b>site</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link de.jena.bike.impl.siteImpl#getId <em>Id</em>}</li>
 *   <li>{@link de.jena.bike.impl.siteImpl#getName <em>Name</em>}</li>
 *   <li>{@link de.jena.bike.impl.siteImpl#getDescription <em>Description</em>}</li>
 *   <li>{@link de.jena.bike.impl.siteImpl#getCustomId <em>Custom Id</em>}</li>
 *   <li>{@link de.jena.bike.impl.siteImpl#getLocation <em>Location</em>}</li>
 *   <li>{@link de.jena.bike.impl.siteImpl#getSegments <em>Segments</em>}</li>
 *   <li>{@link de.jena.bike.impl.siteImpl#getFirstData <em>First Data</em>}</li>
 *   <li>{@link de.jena.bike.impl.siteImpl#getLastData <em>Last Data</em>}</li>
 *   <li>{@link de.jena.bike.impl.siteImpl#getGranularity <em>Granularity</em>}</li>
 *   <li>{@link de.jena.bike.impl.siteImpl#getTravelModes <em>Travel Modes</em>}</li>
 *   <li>{@link de.jena.bike.impl.siteImpl#getDirectional <em>Directional</em>}</li>
 *   <li>{@link de.jena.bike.impl.siteImpl#getCounters <em>Counters</em>}</li>
 *   <li>{@link de.jena.bike.impl.siteImpl#getDomain <em>Domain</em>}</li>
 *   <li>{@link de.jena.bike.impl.siteImpl#getTags <em>Tags</em>}</li>
 *   <li>{@link de.jena.bike.impl.siteImpl#getImages <em>Images</em>}</li>
 *   <li>{@link de.jena.bike.impl.siteImpl#getAttributes <em>Attributes</em>}</li>
 *   <li>{@link de.jena.bike.impl.siteImpl#getHasTimestampedData <em>Has Timestamped Data</em>}</li>
 *   <li>{@link de.jena.bike.impl.siteImpl#getHasWeather <em>Has Weather</em>}</li>
 * </ul>
 *
 * @generated
 */
public class siteImpl extends MinimalEObjectImpl.Container implements site {
	/**
	 * The default value of the '{@link #getId() <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getId()
	 * @generated
	 * @ordered
	 */
	protected static final BigInteger ID_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getId() <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getId()
	 * @generated
	 * @ordered
	 */
	protected BigInteger id = ID_EDEFAULT;

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
	 * The default value of the '{@link #getCustomId() <em>Custom Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCustomId()
	 * @generated
	 * @ordered
	 */
	protected static final String CUSTOM_ID_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getCustomId() <em>Custom Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCustomId()
	 * @generated
	 * @ordered
	 */
	protected String customId = CUSTOM_ID_EDEFAULT;

	/**
	 * The cached value of the '{@link #getLocation() <em>Location</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLocation()
	 * @generated
	 * @ordered
	 */
	protected site_location location;

	/**
	 * The cached value of the '{@link #getSegments() <em>Segments</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSegments()
	 * @generated
	 * @ordered
	 */
	protected site_segments segments;

	/**
	 * The default value of the '{@link #getFirstData() <em>First Data</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFirstData()
	 * @generated
	 * @ordered
	 */
	protected static final String FIRST_DATA_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getFirstData() <em>First Data</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFirstData()
	 * @generated
	 * @ordered
	 */
	protected String firstData = FIRST_DATA_EDEFAULT;

	/**
	 * The default value of the '{@link #getLastData() <em>Last Data</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLastData()
	 * @generated
	 * @ordered
	 */
	protected static final String LAST_DATA_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getLastData() <em>Last Data</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLastData()
	 * @generated
	 * @ordered
	 */
	protected String lastData = LAST_DATA_EDEFAULT;

	/**
	 * The default value of the '{@link #getGranularity() <em>Granularity</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGranularity()
	 * @generated
	 * @ordered
	 */
	protected static final String GRANULARITY_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getGranularity() <em>Granularity</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGranularity()
	 * @generated
	 * @ordered
	 */
	protected String granularity = GRANULARITY_EDEFAULT;

	/**
	 * The cached value of the '{@link #getTravelModes() <em>Travel Modes</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTravelModes()
	 * @generated
	 * @ordered
	 */
	protected EList<site_travelModes> travelModes;

	/**
	 * The default value of the '{@link #getDirectional() <em>Directional</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDirectional()
	 * @generated
	 * @ordered
	 */
	protected static final Boolean DIRECTIONAL_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDirectional() <em>Directional</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDirectional()
	 * @generated
	 * @ordered
	 */
	protected Boolean directional = DIRECTIONAL_EDEFAULT;

	/**
	 * The cached value of the '{@link #getCounters() <em>Counters</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCounters()
	 * @generated
	 * @ordered
	 */
	protected EList<site_counters> counters;

	/**
	 * The cached value of the '{@link #getDomain() <em>Domain</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDomain()
	 * @generated
	 * @ordered
	 */
	protected site_domain domain;

	/**
	 * The cached value of the '{@link #getTags() <em>Tags</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTags()
	 * @generated
	 * @ordered
	 */
	protected EList<site_tags> tags;

	/**
	 * The cached value of the '{@link #getImages() <em>Images</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getImages()
	 * @generated
	 * @ordered
	 */
	protected EList<site_images> images;

	/**
	 * The default value of the '{@link #getAttributes() <em>Attributes</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAttributes()
	 * @generated
	 * @ordered
	 */
	protected static final Object ATTRIBUTES_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getAttributes() <em>Attributes</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAttributes()
	 * @generated
	 * @ordered
	 */
	protected Object attributes = ATTRIBUTES_EDEFAULT;

	/**
	 * The default value of the '{@link #getHasTimestampedData() <em>Has Timestamped Data</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHasTimestampedData()
	 * @generated
	 * @ordered
	 */
	protected static final Boolean HAS_TIMESTAMPED_DATA_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getHasTimestampedData() <em>Has Timestamped Data</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHasTimestampedData()
	 * @generated
	 * @ordered
	 */
	protected Boolean hasTimestampedData = HAS_TIMESTAMPED_DATA_EDEFAULT;

	/**
	 * The default value of the '{@link #getHasWeather() <em>Has Weather</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHasWeather()
	 * @generated
	 * @ordered
	 */
	protected static final Boolean HAS_WEATHER_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getHasWeather() <em>Has Weather</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHasWeather()
	 * @generated
	 * @ordered
	 */
	protected Boolean hasWeather = HAS_WEATHER_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected siteImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return BikePackage.Literals.SITE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public BigInteger getId() {
		return id;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setId(BigInteger newId) {
		BigInteger oldId = id;
		id = newId;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BikePackage.SITE__ID, oldId, id));
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
			eNotify(new ENotificationImpl(this, Notification.SET, BikePackage.SITE__NAME, oldName, name));
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
			eNotify(new ENotificationImpl(this, Notification.SET, BikePackage.SITE__DESCRIPTION, oldDescription, description));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getCustomId() {
		return customId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setCustomId(String newCustomId) {
		String oldCustomId = customId;
		customId = newCustomId;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BikePackage.SITE__CUSTOM_ID, oldCustomId, customId));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public site_location getLocation() {
		return location;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetLocation(site_location newLocation, NotificationChain msgs) {
		site_location oldLocation = location;
		location = newLocation;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, BikePackage.SITE__LOCATION, oldLocation, newLocation);
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
	public void setLocation(site_location newLocation) {
		if (newLocation != location) {
			NotificationChain msgs = null;
			if (location != null)
				msgs = ((InternalEObject)location).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - BikePackage.SITE__LOCATION, null, msgs);
			if (newLocation != null)
				msgs = ((InternalEObject)newLocation).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - BikePackage.SITE__LOCATION, null, msgs);
			msgs = basicSetLocation(newLocation, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BikePackage.SITE__LOCATION, newLocation, newLocation));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public site_segments getSegments() {
		return segments;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSegments(site_segments newSegments, NotificationChain msgs) {
		site_segments oldSegments = segments;
		segments = newSegments;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, BikePackage.SITE__SEGMENTS, oldSegments, newSegments);
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
	public void setSegments(site_segments newSegments) {
		if (newSegments != segments) {
			NotificationChain msgs = null;
			if (segments != null)
				msgs = ((InternalEObject)segments).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - BikePackage.SITE__SEGMENTS, null, msgs);
			if (newSegments != null)
				msgs = ((InternalEObject)newSegments).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - BikePackage.SITE__SEGMENTS, null, msgs);
			msgs = basicSetSegments(newSegments, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BikePackage.SITE__SEGMENTS, newSegments, newSegments));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getFirstData() {
		return firstData;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setFirstData(String newFirstData) {
		String oldFirstData = firstData;
		firstData = newFirstData;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BikePackage.SITE__FIRST_DATA, oldFirstData, firstData));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getLastData() {
		return lastData;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setLastData(String newLastData) {
		String oldLastData = lastData;
		lastData = newLastData;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BikePackage.SITE__LAST_DATA, oldLastData, lastData));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getGranularity() {
		return granularity;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setGranularity(String newGranularity) {
		String oldGranularity = granularity;
		granularity = newGranularity;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BikePackage.SITE__GRANULARITY, oldGranularity, granularity));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<site_travelModes> getTravelModes() {
		if (travelModes == null) {
			travelModes = new EObjectContainmentEList<site_travelModes>(site_travelModes.class, this, BikePackage.SITE__TRAVEL_MODES);
		}
		return travelModes;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Boolean getDirectional() {
		return directional;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setDirectional(Boolean newDirectional) {
		Boolean oldDirectional = directional;
		directional = newDirectional;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BikePackage.SITE__DIRECTIONAL, oldDirectional, directional));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<site_counters> getCounters() {
		if (counters == null) {
			counters = new EObjectContainmentEList<site_counters>(site_counters.class, this, BikePackage.SITE__COUNTERS);
		}
		return counters;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public site_domain getDomain() {
		return domain;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDomain(site_domain newDomain, NotificationChain msgs) {
		site_domain oldDomain = domain;
		domain = newDomain;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, BikePackage.SITE__DOMAIN, oldDomain, newDomain);
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
	public void setDomain(site_domain newDomain) {
		if (newDomain != domain) {
			NotificationChain msgs = null;
			if (domain != null)
				msgs = ((InternalEObject)domain).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - BikePackage.SITE__DOMAIN, null, msgs);
			if (newDomain != null)
				msgs = ((InternalEObject)newDomain).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - BikePackage.SITE__DOMAIN, null, msgs);
			msgs = basicSetDomain(newDomain, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BikePackage.SITE__DOMAIN, newDomain, newDomain));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<site_tags> getTags() {
		if (tags == null) {
			tags = new EObjectContainmentEList<site_tags>(site_tags.class, this, BikePackage.SITE__TAGS);
		}
		return tags;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<site_images> getImages() {
		if (images == null) {
			images = new EObjectContainmentEList<site_images>(site_images.class, this, BikePackage.SITE__IMAGES);
		}
		return images;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getAttributes() {
		return attributes;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setAttributes(Object newAttributes) {
		Object oldAttributes = attributes;
		attributes = newAttributes;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BikePackage.SITE__ATTRIBUTES, oldAttributes, attributes));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Boolean getHasTimestampedData() {
		return hasTimestampedData;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setHasTimestampedData(Boolean newHasTimestampedData) {
		Boolean oldHasTimestampedData = hasTimestampedData;
		hasTimestampedData = newHasTimestampedData;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BikePackage.SITE__HAS_TIMESTAMPED_DATA, oldHasTimestampedData, hasTimestampedData));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Boolean getHasWeather() {
		return hasWeather;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setHasWeather(Boolean newHasWeather) {
		Boolean oldHasWeather = hasWeather;
		hasWeather = newHasWeather;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BikePackage.SITE__HAS_WEATHER, oldHasWeather, hasWeather));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case BikePackage.SITE__LOCATION:
				return basicSetLocation(null, msgs);
			case BikePackage.SITE__SEGMENTS:
				return basicSetSegments(null, msgs);
			case BikePackage.SITE__TRAVEL_MODES:
				return ((InternalEList<?>)getTravelModes()).basicRemove(otherEnd, msgs);
			case BikePackage.SITE__COUNTERS:
				return ((InternalEList<?>)getCounters()).basicRemove(otherEnd, msgs);
			case BikePackage.SITE__DOMAIN:
				return basicSetDomain(null, msgs);
			case BikePackage.SITE__TAGS:
				return ((InternalEList<?>)getTags()).basicRemove(otherEnd, msgs);
			case BikePackage.SITE__IMAGES:
				return ((InternalEList<?>)getImages()).basicRemove(otherEnd, msgs);
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
			case BikePackage.SITE__ID:
				return getId();
			case BikePackage.SITE__NAME:
				return getName();
			case BikePackage.SITE__DESCRIPTION:
				return getDescription();
			case BikePackage.SITE__CUSTOM_ID:
				return getCustomId();
			case BikePackage.SITE__LOCATION:
				return getLocation();
			case BikePackage.SITE__SEGMENTS:
				return getSegments();
			case BikePackage.SITE__FIRST_DATA:
				return getFirstData();
			case BikePackage.SITE__LAST_DATA:
				return getLastData();
			case BikePackage.SITE__GRANULARITY:
				return getGranularity();
			case BikePackage.SITE__TRAVEL_MODES:
				return getTravelModes();
			case BikePackage.SITE__DIRECTIONAL:
				return getDirectional();
			case BikePackage.SITE__COUNTERS:
				return getCounters();
			case BikePackage.SITE__DOMAIN:
				return getDomain();
			case BikePackage.SITE__TAGS:
				return getTags();
			case BikePackage.SITE__IMAGES:
				return getImages();
			case BikePackage.SITE__ATTRIBUTES:
				return getAttributes();
			case BikePackage.SITE__HAS_TIMESTAMPED_DATA:
				return getHasTimestampedData();
			case BikePackage.SITE__HAS_WEATHER:
				return getHasWeather();
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
			case BikePackage.SITE__ID:
				setId((BigInteger)newValue);
				return;
			case BikePackage.SITE__NAME:
				setName((String)newValue);
				return;
			case BikePackage.SITE__DESCRIPTION:
				setDescription((String)newValue);
				return;
			case BikePackage.SITE__CUSTOM_ID:
				setCustomId((String)newValue);
				return;
			case BikePackage.SITE__LOCATION:
				setLocation((site_location)newValue);
				return;
			case BikePackage.SITE__SEGMENTS:
				setSegments((site_segments)newValue);
				return;
			case BikePackage.SITE__FIRST_DATA:
				setFirstData((String)newValue);
				return;
			case BikePackage.SITE__LAST_DATA:
				setLastData((String)newValue);
				return;
			case BikePackage.SITE__GRANULARITY:
				setGranularity((String)newValue);
				return;
			case BikePackage.SITE__TRAVEL_MODES:
				getTravelModes().clear();
				getTravelModes().addAll((Collection<? extends site_travelModes>)newValue);
				return;
			case BikePackage.SITE__DIRECTIONAL:
				setDirectional((Boolean)newValue);
				return;
			case BikePackage.SITE__COUNTERS:
				getCounters().clear();
				getCounters().addAll((Collection<? extends site_counters>)newValue);
				return;
			case BikePackage.SITE__DOMAIN:
				setDomain((site_domain)newValue);
				return;
			case BikePackage.SITE__TAGS:
				getTags().clear();
				getTags().addAll((Collection<? extends site_tags>)newValue);
				return;
			case BikePackage.SITE__IMAGES:
				getImages().clear();
				getImages().addAll((Collection<? extends site_images>)newValue);
				return;
			case BikePackage.SITE__ATTRIBUTES:
				setAttributes(newValue);
				return;
			case BikePackage.SITE__HAS_TIMESTAMPED_DATA:
				setHasTimestampedData((Boolean)newValue);
				return;
			case BikePackage.SITE__HAS_WEATHER:
				setHasWeather((Boolean)newValue);
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
			case BikePackage.SITE__ID:
				setId(ID_EDEFAULT);
				return;
			case BikePackage.SITE__NAME:
				setName(NAME_EDEFAULT);
				return;
			case BikePackage.SITE__DESCRIPTION:
				setDescription(DESCRIPTION_EDEFAULT);
				return;
			case BikePackage.SITE__CUSTOM_ID:
				setCustomId(CUSTOM_ID_EDEFAULT);
				return;
			case BikePackage.SITE__LOCATION:
				setLocation((site_location)null);
				return;
			case BikePackage.SITE__SEGMENTS:
				setSegments((site_segments)null);
				return;
			case BikePackage.SITE__FIRST_DATA:
				setFirstData(FIRST_DATA_EDEFAULT);
				return;
			case BikePackage.SITE__LAST_DATA:
				setLastData(LAST_DATA_EDEFAULT);
				return;
			case BikePackage.SITE__GRANULARITY:
				setGranularity(GRANULARITY_EDEFAULT);
				return;
			case BikePackage.SITE__TRAVEL_MODES:
				getTravelModes().clear();
				return;
			case BikePackage.SITE__DIRECTIONAL:
				setDirectional(DIRECTIONAL_EDEFAULT);
				return;
			case BikePackage.SITE__COUNTERS:
				getCounters().clear();
				return;
			case BikePackage.SITE__DOMAIN:
				setDomain((site_domain)null);
				return;
			case BikePackage.SITE__TAGS:
				getTags().clear();
				return;
			case BikePackage.SITE__IMAGES:
				getImages().clear();
				return;
			case BikePackage.SITE__ATTRIBUTES:
				setAttributes(ATTRIBUTES_EDEFAULT);
				return;
			case BikePackage.SITE__HAS_TIMESTAMPED_DATA:
				setHasTimestampedData(HAS_TIMESTAMPED_DATA_EDEFAULT);
				return;
			case BikePackage.SITE__HAS_WEATHER:
				setHasWeather(HAS_WEATHER_EDEFAULT);
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
			case BikePackage.SITE__ID:
				return ID_EDEFAULT == null ? id != null : !ID_EDEFAULT.equals(id);
			case BikePackage.SITE__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case BikePackage.SITE__DESCRIPTION:
				return DESCRIPTION_EDEFAULT == null ? description != null : !DESCRIPTION_EDEFAULT.equals(description);
			case BikePackage.SITE__CUSTOM_ID:
				return CUSTOM_ID_EDEFAULT == null ? customId != null : !CUSTOM_ID_EDEFAULT.equals(customId);
			case BikePackage.SITE__LOCATION:
				return location != null;
			case BikePackage.SITE__SEGMENTS:
				return segments != null;
			case BikePackage.SITE__FIRST_DATA:
				return FIRST_DATA_EDEFAULT == null ? firstData != null : !FIRST_DATA_EDEFAULT.equals(firstData);
			case BikePackage.SITE__LAST_DATA:
				return LAST_DATA_EDEFAULT == null ? lastData != null : !LAST_DATA_EDEFAULT.equals(lastData);
			case BikePackage.SITE__GRANULARITY:
				return GRANULARITY_EDEFAULT == null ? granularity != null : !GRANULARITY_EDEFAULT.equals(granularity);
			case BikePackage.SITE__TRAVEL_MODES:
				return travelModes != null && !travelModes.isEmpty();
			case BikePackage.SITE__DIRECTIONAL:
				return DIRECTIONAL_EDEFAULT == null ? directional != null : !DIRECTIONAL_EDEFAULT.equals(directional);
			case BikePackage.SITE__COUNTERS:
				return counters != null && !counters.isEmpty();
			case BikePackage.SITE__DOMAIN:
				return domain != null;
			case BikePackage.SITE__TAGS:
				return tags != null && !tags.isEmpty();
			case BikePackage.SITE__IMAGES:
				return images != null && !images.isEmpty();
			case BikePackage.SITE__ATTRIBUTES:
				return ATTRIBUTES_EDEFAULT == null ? attributes != null : !ATTRIBUTES_EDEFAULT.equals(attributes);
			case BikePackage.SITE__HAS_TIMESTAMPED_DATA:
				return HAS_TIMESTAMPED_DATA_EDEFAULT == null ? hasTimestampedData != null : !HAS_TIMESTAMPED_DATA_EDEFAULT.equals(hasTimestampedData);
			case BikePackage.SITE__HAS_WEATHER:
				return HAS_WEATHER_EDEFAULT == null ? hasWeather != null : !HAS_WEATHER_EDEFAULT.equals(hasWeather);
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
		result.append(", description: ");
		result.append(description);
		result.append(", customId: ");
		result.append(customId);
		result.append(", firstData: ");
		result.append(firstData);
		result.append(", lastData: ");
		result.append(lastData);
		result.append(", granularity: ");
		result.append(granularity);
		result.append(", directional: ");
		result.append(directional);
		result.append(", attributes: ");
		result.append(attributes);
		result.append(", hasTimestampedData: ");
		result.append(hasTimestampedData);
		result.append(", hasWeather: ");
		result.append(hasWeather);
		result.append(')');
		return result.toString();
	}

} //siteImpl
