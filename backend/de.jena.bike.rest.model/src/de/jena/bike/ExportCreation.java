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

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

import org.osgi.annotation.versioning.ProviderType;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Export Creation</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.jena.bike.ExportCreation#getStartDate <em>Start Date</em>}</li>
 *   <li>{@link de.jena.bike.ExportCreation#getEndDate <em>End Date</em>}</li>
 *   <li>{@link de.jena.bike.ExportCreation#getStartTime <em>Start Time</em>}</li>
 *   <li>{@link de.jena.bike.ExportCreation#getEndTime <em>End Time</em>}</li>
 *   <li>{@link de.jena.bike.ExportCreation#getSchema <em>Schema</em>}</li>
 *   <li>{@link de.jena.bike.ExportCreation#getSiteIds <em>Site Ids</em>}</li>
 *   <li>{@link de.jena.bike.ExportCreation#getGranularity <em>Granularity</em>}</li>
 *   <li>{@link de.jena.bike.ExportCreation#getValidatedDataOnly <em>Validated Data Only</em>}</li>
 *   <li>{@link de.jena.bike.ExportCreation#getGapFilling <em>Gap Filling</em>}</li>
 *   <li>{@link de.jena.bike.ExportCreation#getValidateSchema <em>Validate Schema</em>}</li>
 * </ul>
 *
 * @see de.jena.bike.BikePackage#getExportCreation()
 * @model
 * @generated
 */
@ProviderType
public interface ExportCreation extends EObject {
	/**
	 * Returns the value of the '<em><b>Start Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Start Date</em>' attribute.
	 * @see #setStartDate(String)
	 * @see de.jena.bike.BikePackage#getExportCreation_StartDate()
	 * @model unique="false"
	 * @generated
	 */
	String getStartDate();

	/**
	 * Sets the value of the '{@link de.jena.bike.ExportCreation#getStartDate <em>Start Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Start Date</em>' attribute.
	 * @see #getStartDate()
	 * @generated
	 */
	void setStartDate(String value);

	/**
	 * Returns the value of the '<em><b>End Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>End Date</em>' attribute.
	 * @see #setEndDate(String)
	 * @see de.jena.bike.BikePackage#getExportCreation_EndDate()
	 * @model unique="false"
	 * @generated
	 */
	String getEndDate();

	/**
	 * Sets the value of the '{@link de.jena.bike.ExportCreation#getEndDate <em>End Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>End Date</em>' attribute.
	 * @see #getEndDate()
	 * @generated
	 */
	void setEndDate(String value);

	/**
	 * Returns the value of the '<em><b>Start Time</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Start Time</em>' attribute.
	 * @see #setStartTime(String)
	 * @see de.jena.bike.BikePackage#getExportCreation_StartTime()
	 * @model unique="false"
	 * @generated
	 */
	String getStartTime();

	/**
	 * Sets the value of the '{@link de.jena.bike.ExportCreation#getStartTime <em>Start Time</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Start Time</em>' attribute.
	 * @see #getStartTime()
	 * @generated
	 */
	void setStartTime(String value);

	/**
	 * Returns the value of the '<em><b>End Time</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>End Time</em>' attribute.
	 * @see #setEndTime(String)
	 * @see de.jena.bike.BikePackage#getExportCreation_EndTime()
	 * @model unique="false"
	 * @generated
	 */
	String getEndTime();

	/**
	 * Sets the value of the '{@link de.jena.bike.ExportCreation#getEndTime <em>End Time</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>End Time</em>' attribute.
	 * @see #getEndTime()
	 * @generated
	 */
	void setEndTime(String value);

	/**
	 * Returns the value of the '<em><b>Schema</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Schema</em>' attribute.
	 * @see #setSchema(String)
	 * @see de.jena.bike.BikePackage#getExportCreation_Schema()
	 * @model unique="false"
	 * @generated
	 */
	String getSchema();

	/**
	 * Sets the value of the '{@link de.jena.bike.ExportCreation#getSchema <em>Schema</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Schema</em>' attribute.
	 * @see #getSchema()
	 * @generated
	 */
	void setSchema(String value);

	/**
	 * Returns the value of the '<em><b>Site Ids</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.Integer}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Site Ids</em>' attribute list.
	 * @see de.jena.bike.BikePackage#getExportCreation_SiteIds()
	 * @model unique="false"
	 * @generated
	 */
	EList<Integer> getSiteIds();

	/**
	 * Returns the value of the '<em><b>Granularity</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Granularity</em>' attribute.
	 * @see #setGranularity(String)
	 * @see de.jena.bike.BikePackage#getExportCreation_Granularity()
	 * @model unique="false"
	 * @generated
	 */
	String getGranularity();

	/**
	 * Sets the value of the '{@link de.jena.bike.ExportCreation#getGranularity <em>Granularity</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Granularity</em>' attribute.
	 * @see #getGranularity()
	 * @generated
	 */
	void setGranularity(String value);

	/**
	 * Returns the value of the '<em><b>Validated Data Only</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Validated Data Only</em>' attribute.
	 * @see #setValidatedDataOnly(Boolean)
	 * @see de.jena.bike.BikePackage#getExportCreation_ValidatedDataOnly()
	 * @model unique="false"
	 * @generated
	 */
	Boolean getValidatedDataOnly();

	/**
	 * Sets the value of the '{@link de.jena.bike.ExportCreation#getValidatedDataOnly <em>Validated Data Only</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Validated Data Only</em>' attribute.
	 * @see #getValidatedDataOnly()
	 * @generated
	 */
	void setValidatedDataOnly(Boolean value);

	/**
	 * Returns the value of the '<em><b>Gap Filling</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Gap Filling</em>' attribute.
	 * @see #setGapFilling(Boolean)
	 * @see de.jena.bike.BikePackage#getExportCreation_GapFilling()
	 * @model unique="false"
	 * @generated
	 */
	Boolean getGapFilling();

	/**
	 * Sets the value of the '{@link de.jena.bike.ExportCreation#getGapFilling <em>Gap Filling</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Gap Filling</em>' attribute.
	 * @see #getGapFilling()
	 * @generated
	 */
	void setGapFilling(Boolean value);

	/**
	 * Returns the value of the '<em><b>Validate Schema</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Validate Schema</em>' attribute.
	 * @see #setValidateSchema(Boolean)
	 * @see de.jena.bike.BikePackage#getExportCreation_ValidateSchema()
	 * @model unique="false"
	 * @generated
	 */
	Boolean getValidateSchema();

	/**
	 * Sets the value of the '{@link de.jena.bike.ExportCreation#getValidateSchema <em>Validate Schema</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Validate Schema</em>' attribute.
	 * @see #getValidateSchema()
	 * @generated
	 */
	void setValidateSchema(Boolean value);

} // ExportCreation
