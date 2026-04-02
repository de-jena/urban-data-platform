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
package de.jena.bike;

import java.math.BigInteger;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

import org.osgi.annotation.versioning.ProviderType;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>site</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.jena.bike.site#getId <em>Id</em>}</li>
 *   <li>{@link de.jena.bike.site#getName <em>Name</em>}</li>
 *   <li>{@link de.jena.bike.site#getDescription <em>Description</em>}</li>
 *   <li>{@link de.jena.bike.site#getCustomId <em>Custom Id</em>}</li>
 *   <li>{@link de.jena.bike.site#getLocation <em>Location</em>}</li>
 *   <li>{@link de.jena.bike.site#getSegments <em>Segments</em>}</li>
 *   <li>{@link de.jena.bike.site#getFirstData <em>First Data</em>}</li>
 *   <li>{@link de.jena.bike.site#getLastData <em>Last Data</em>}</li>
 *   <li>{@link de.jena.bike.site#getGranularity <em>Granularity</em>}</li>
 *   <li>{@link de.jena.bike.site#getTravelModes <em>Travel Modes</em>}</li>
 *   <li>{@link de.jena.bike.site#getDirectional <em>Directional</em>}</li>
 *   <li>{@link de.jena.bike.site#getCounters <em>Counters</em>}</li>
 *   <li>{@link de.jena.bike.site#getDomain <em>Domain</em>}</li>
 *   <li>{@link de.jena.bike.site#getTags <em>Tags</em>}</li>
 *   <li>{@link de.jena.bike.site#getImages <em>Images</em>}</li>
 *   <li>{@link de.jena.bike.site#getAttributes <em>Attributes</em>}</li>
 *   <li>{@link de.jena.bike.site#getHasTimestampedData <em>Has Timestamped Data</em>}</li>
 *   <li>{@link de.jena.bike.site#getHasWeather <em>Has Weather</em>}</li>
 * </ul>
 *
 * @see de.jena.bike.BikePackage#getsite()
 * @model
 * @generated
 */
@ProviderType
public interface site extends EObject {
	/**
	 * Returns the value of the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Id</em>' attribute.
	 * @see #setId(BigInteger)
	 * @see de.jena.bike.BikePackage#getsite_Id()
	 * @model unique="false"
	 * @generated
	 */
	BigInteger getId();

	/**
	 * Sets the value of the '{@link de.jena.bike.site#getId <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Id</em>' attribute.
	 * @see #getId()
	 * @generated
	 */
	void setId(BigInteger value);

	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see de.jena.bike.BikePackage#getsite_Name()
	 * @model unique="false"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link de.jena.bike.site#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Description</em>' attribute.
	 * @see #setDescription(String)
	 * @see de.jena.bike.BikePackage#getsite_Description()
	 * @model unique="false"
	 * @generated
	 */
	String getDescription();

	/**
	 * Sets the value of the '{@link de.jena.bike.site#getDescription <em>Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Description</em>' attribute.
	 * @see #getDescription()
	 * @generated
	 */
	void setDescription(String value);

	/**
	 * Returns the value of the '<em><b>Custom Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Custom Id</em>' attribute.
	 * @see #setCustomId(String)
	 * @see de.jena.bike.BikePackage#getsite_CustomId()
	 * @model unique="false"
	 * @generated
	 */
	String getCustomId();

	/**
	 * Sets the value of the '{@link de.jena.bike.site#getCustomId <em>Custom Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Custom Id</em>' attribute.
	 * @see #getCustomId()
	 * @generated
	 */
	void setCustomId(String value);

	/**
	 * Returns the value of the '<em><b>Location</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Location</em>' containment reference.
	 * @see #setLocation(site_location)
	 * @see de.jena.bike.BikePackage#getsite_Location()
	 * @model containment="true"
	 * @generated
	 */
	site_location getLocation();

	/**
	 * Sets the value of the '{@link de.jena.bike.site#getLocation <em>Location</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Location</em>' containment reference.
	 * @see #getLocation()
	 * @generated
	 */
	void setLocation(site_location value);

	/**
	 * Returns the value of the '<em><b>Segments</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Segments</em>' containment reference.
	 * @see #setSegments(site_segments)
	 * @see de.jena.bike.BikePackage#getsite_Segments()
	 * @model containment="true"
	 * @generated
	 */
	site_segments getSegments();

	/**
	 * Sets the value of the '{@link de.jena.bike.site#getSegments <em>Segments</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Segments</em>' containment reference.
	 * @see #getSegments()
	 * @generated
	 */
	void setSegments(site_segments value);

	/**
	 * Returns the value of the '<em><b>First Data</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>First Data</em>' attribute.
	 * @see #setFirstData(String)
	 * @see de.jena.bike.BikePackage#getsite_FirstData()
	 * @model unique="false"
	 * @generated
	 */
	String getFirstData();

	/**
	 * Sets the value of the '{@link de.jena.bike.site#getFirstData <em>First Data</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>First Data</em>' attribute.
	 * @see #getFirstData()
	 * @generated
	 */
	void setFirstData(String value);

	/**
	 * Returns the value of the '<em><b>Last Data</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Last Data</em>' attribute.
	 * @see #setLastData(String)
	 * @see de.jena.bike.BikePackage#getsite_LastData()
	 * @model unique="false"
	 * @generated
	 */
	String getLastData();

	/**
	 * Sets the value of the '{@link de.jena.bike.site#getLastData <em>Last Data</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Last Data</em>' attribute.
	 * @see #getLastData()
	 * @generated
	 */
	void setLastData(String value);

	/**
	 * Returns the value of the '<em><b>Granularity</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Granularity</em>' attribute.
	 * @see #setGranularity(String)
	 * @see de.jena.bike.BikePackage#getsite_Granularity()
	 * @model unique="false"
	 * @generated
	 */
	String getGranularity();

	/**
	 * Sets the value of the '{@link de.jena.bike.site#getGranularity <em>Granularity</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Granularity</em>' attribute.
	 * @see #getGranularity()
	 * @generated
	 */
	void setGranularity(String value);

	/**
	 * Returns the value of the '<em><b>Travel Modes</b></em>' containment reference list.
	 * The list contents are of type {@link de.jena.bike.site_travelModes}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Travel Modes</em>' containment reference list.
	 * @see de.jena.bike.BikePackage#getsite_TravelModes()
	 * @model containment="true"
	 * @generated
	 */
	EList<site_travelModes> getTravelModes();

	/**
	 * Returns the value of the '<em><b>Directional</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Directional</em>' attribute.
	 * @see #setDirectional(Boolean)
	 * @see de.jena.bike.BikePackage#getsite_Directional()
	 * @model unique="false"
	 * @generated
	 */
	Boolean getDirectional();

	/**
	 * Sets the value of the '{@link de.jena.bike.site#getDirectional <em>Directional</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Directional</em>' attribute.
	 * @see #getDirectional()
	 * @generated
	 */
	void setDirectional(Boolean value);

	/**
	 * Returns the value of the '<em><b>Counters</b></em>' containment reference list.
	 * The list contents are of type {@link de.jena.bike.site_counters}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Counters</em>' containment reference list.
	 * @see de.jena.bike.BikePackage#getsite_Counters()
	 * @model containment="true"
	 * @generated
	 */
	EList<site_counters> getCounters();

	/**
	 * Returns the value of the '<em><b>Domain</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Domain</em>' containment reference.
	 * @see #setDomain(site_domain)
	 * @see de.jena.bike.BikePackage#getsite_Domain()
	 * @model containment="true"
	 * @generated
	 */
	site_domain getDomain();

	/**
	 * Sets the value of the '{@link de.jena.bike.site#getDomain <em>Domain</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Domain</em>' containment reference.
	 * @see #getDomain()
	 * @generated
	 */
	void setDomain(site_domain value);

	/**
	 * Returns the value of the '<em><b>Tags</b></em>' containment reference list.
	 * The list contents are of type {@link de.jena.bike.site_tags}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Tags</em>' containment reference list.
	 * @see de.jena.bike.BikePackage#getsite_Tags()
	 * @model containment="true"
	 * @generated
	 */
	EList<site_tags> getTags();

	/**
	 * Returns the value of the '<em><b>Images</b></em>' containment reference list.
	 * The list contents are of type {@link de.jena.bike.site_images}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Images</em>' containment reference list.
	 * @see de.jena.bike.BikePackage#getsite_Images()
	 * @model containment="true"
	 * @generated
	 */
	EList<site_images> getImages();

	/**
	 * Returns the value of the '<em><b>Attributes</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Attributes</em>' attribute.
	 * @see #setAttributes(Object)
	 * @see de.jena.bike.BikePackage#getsite_Attributes()
	 * @model unique="false"
	 * @generated
	 */
	Object getAttributes();

	/**
	 * Sets the value of the '{@link de.jena.bike.site#getAttributes <em>Attributes</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Attributes</em>' attribute.
	 * @see #getAttributes()
	 * @generated
	 */
	void setAttributes(Object value);

	/**
	 * Returns the value of the '<em><b>Has Timestamped Data</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Has Timestamped Data</em>' attribute.
	 * @see #setHasTimestampedData(Boolean)
	 * @see de.jena.bike.BikePackage#getsite_HasTimestampedData()
	 * @model unique="false"
	 * @generated
	 */
	Boolean getHasTimestampedData();

	/**
	 * Sets the value of the '{@link de.jena.bike.site#getHasTimestampedData <em>Has Timestamped Data</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Has Timestamped Data</em>' attribute.
	 * @see #getHasTimestampedData()
	 * @generated
	 */
	void setHasTimestampedData(Boolean value);

	/**
	 * Returns the value of the '<em><b>Has Weather</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Has Weather</em>' attribute.
	 * @see #setHasWeather(Boolean)
	 * @see de.jena.bike.BikePackage#getsite_HasWeather()
	 * @model unique="false"
	 * @generated
	 */
	Boolean getHasWeather();

	/**
	 * Sets the value of the '{@link de.jena.bike.site#getHasWeather <em>Has Weather</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Has Weather</em>' attribute.
	 * @see #getHasWeather()
	 * @generated
	 */
	void setHasWeather(Boolean value);

} // site
