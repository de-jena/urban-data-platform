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
import de.jena.bike.ExportCreation;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EDataTypeEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Export Creation</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link de.jena.bike.impl.ExportCreationImpl#getStartDate <em>Start Date</em>}</li>
 *   <li>{@link de.jena.bike.impl.ExportCreationImpl#getEndDate <em>End Date</em>}</li>
 *   <li>{@link de.jena.bike.impl.ExportCreationImpl#getStartTime <em>Start Time</em>}</li>
 *   <li>{@link de.jena.bike.impl.ExportCreationImpl#getEndTime <em>End Time</em>}</li>
 *   <li>{@link de.jena.bike.impl.ExportCreationImpl#getSchema <em>Schema</em>}</li>
 *   <li>{@link de.jena.bike.impl.ExportCreationImpl#getSiteIds <em>Site Ids</em>}</li>
 *   <li>{@link de.jena.bike.impl.ExportCreationImpl#getGranularity <em>Granularity</em>}</li>
 *   <li>{@link de.jena.bike.impl.ExportCreationImpl#getValidatedDataOnly <em>Validated Data Only</em>}</li>
 *   <li>{@link de.jena.bike.impl.ExportCreationImpl#getGapFilling <em>Gap Filling</em>}</li>
 *   <li>{@link de.jena.bike.impl.ExportCreationImpl#getValidateSchema <em>Validate Schema</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ExportCreationImpl extends MinimalEObjectImpl.Container implements ExportCreation {
	/**
	 * The default value of the '{@link #getStartDate() <em>Start Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStartDate()
	 * @generated
	 * @ordered
	 */
	protected static final String START_DATE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getStartDate() <em>Start Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStartDate()
	 * @generated
	 * @ordered
	 */
	protected String startDate = START_DATE_EDEFAULT;

	/**
	 * The default value of the '{@link #getEndDate() <em>End Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEndDate()
	 * @generated
	 * @ordered
	 */
	protected static final String END_DATE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getEndDate() <em>End Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEndDate()
	 * @generated
	 * @ordered
	 */
	protected String endDate = END_DATE_EDEFAULT;

	/**
	 * The default value of the '{@link #getStartTime() <em>Start Time</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStartTime()
	 * @generated
	 * @ordered
	 */
	protected static final String START_TIME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getStartTime() <em>Start Time</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStartTime()
	 * @generated
	 * @ordered
	 */
	protected String startTime = START_TIME_EDEFAULT;

	/**
	 * The default value of the '{@link #getEndTime() <em>End Time</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEndTime()
	 * @generated
	 * @ordered
	 */
	protected static final String END_TIME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getEndTime() <em>End Time</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEndTime()
	 * @generated
	 * @ordered
	 */
	protected String endTime = END_TIME_EDEFAULT;

	/**
	 * The default value of the '{@link #getSchema() <em>Schema</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSchema()
	 * @generated
	 * @ordered
	 */
	protected static final String SCHEMA_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getSchema() <em>Schema</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSchema()
	 * @generated
	 * @ordered
	 */
	protected String schema = SCHEMA_EDEFAULT;

	/**
	 * The cached value of the '{@link #getSiteIds() <em>Site Ids</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSiteIds()
	 * @generated
	 * @ordered
	 */
	protected EList<Integer> siteIds;

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
	 * The default value of the '{@link #getValidatedDataOnly() <em>Validated Data Only</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getValidatedDataOnly()
	 * @generated
	 * @ordered
	 */
	protected static final Boolean VALIDATED_DATA_ONLY_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getValidatedDataOnly() <em>Validated Data Only</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getValidatedDataOnly()
	 * @generated
	 * @ordered
	 */
	protected Boolean validatedDataOnly = VALIDATED_DATA_ONLY_EDEFAULT;

	/**
	 * The default value of the '{@link #getGapFilling() <em>Gap Filling</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGapFilling()
	 * @generated
	 * @ordered
	 */
	protected static final Boolean GAP_FILLING_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getGapFilling() <em>Gap Filling</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGapFilling()
	 * @generated
	 * @ordered
	 */
	protected Boolean gapFilling = GAP_FILLING_EDEFAULT;

	/**
	 * The default value of the '{@link #getValidateSchema() <em>Validate Schema</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getValidateSchema()
	 * @generated
	 * @ordered
	 */
	protected static final Boolean VALIDATE_SCHEMA_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getValidateSchema() <em>Validate Schema</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getValidateSchema()
	 * @generated
	 * @ordered
	 */
	protected Boolean validateSchema = VALIDATE_SCHEMA_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ExportCreationImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return BikePackage.Literals.EXPORT_CREATION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getStartDate() {
		return startDate;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setStartDate(String newStartDate) {
		String oldStartDate = startDate;
		startDate = newStartDate;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BikePackage.EXPORT_CREATION__START_DATE, oldStartDate, startDate));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getEndDate() {
		return endDate;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setEndDate(String newEndDate) {
		String oldEndDate = endDate;
		endDate = newEndDate;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BikePackage.EXPORT_CREATION__END_DATE, oldEndDate, endDate));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getStartTime() {
		return startTime;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setStartTime(String newStartTime) {
		String oldStartTime = startTime;
		startTime = newStartTime;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BikePackage.EXPORT_CREATION__START_TIME, oldStartTime, startTime));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getEndTime() {
		return endTime;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setEndTime(String newEndTime) {
		String oldEndTime = endTime;
		endTime = newEndTime;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BikePackage.EXPORT_CREATION__END_TIME, oldEndTime, endTime));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getSchema() {
		return schema;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setSchema(String newSchema) {
		String oldSchema = schema;
		schema = newSchema;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BikePackage.EXPORT_CREATION__SCHEMA, oldSchema, schema));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Integer> getSiteIds() {
		if (siteIds == null) {
			siteIds = new EDataTypeEList<Integer>(Integer.class, this, BikePackage.EXPORT_CREATION__SITE_IDS);
		}
		return siteIds;
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
			eNotify(new ENotificationImpl(this, Notification.SET, BikePackage.EXPORT_CREATION__GRANULARITY, oldGranularity, granularity));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Boolean getValidatedDataOnly() {
		return validatedDataOnly;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setValidatedDataOnly(Boolean newValidatedDataOnly) {
		Boolean oldValidatedDataOnly = validatedDataOnly;
		validatedDataOnly = newValidatedDataOnly;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BikePackage.EXPORT_CREATION__VALIDATED_DATA_ONLY, oldValidatedDataOnly, validatedDataOnly));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Boolean getGapFilling() {
		return gapFilling;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setGapFilling(Boolean newGapFilling) {
		Boolean oldGapFilling = gapFilling;
		gapFilling = newGapFilling;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BikePackage.EXPORT_CREATION__GAP_FILLING, oldGapFilling, gapFilling));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Boolean getValidateSchema() {
		return validateSchema;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setValidateSchema(Boolean newValidateSchema) {
		Boolean oldValidateSchema = validateSchema;
		validateSchema = newValidateSchema;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BikePackage.EXPORT_CREATION__VALIDATE_SCHEMA, oldValidateSchema, validateSchema));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case BikePackage.EXPORT_CREATION__START_DATE:
				return getStartDate();
			case BikePackage.EXPORT_CREATION__END_DATE:
				return getEndDate();
			case BikePackage.EXPORT_CREATION__START_TIME:
				return getStartTime();
			case BikePackage.EXPORT_CREATION__END_TIME:
				return getEndTime();
			case BikePackage.EXPORT_CREATION__SCHEMA:
				return getSchema();
			case BikePackage.EXPORT_CREATION__SITE_IDS:
				return getSiteIds();
			case BikePackage.EXPORT_CREATION__GRANULARITY:
				return getGranularity();
			case BikePackage.EXPORT_CREATION__VALIDATED_DATA_ONLY:
				return getValidatedDataOnly();
			case BikePackage.EXPORT_CREATION__GAP_FILLING:
				return getGapFilling();
			case BikePackage.EXPORT_CREATION__VALIDATE_SCHEMA:
				return getValidateSchema();
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
			case BikePackage.EXPORT_CREATION__START_DATE:
				setStartDate((String)newValue);
				return;
			case BikePackage.EXPORT_CREATION__END_DATE:
				setEndDate((String)newValue);
				return;
			case BikePackage.EXPORT_CREATION__START_TIME:
				setStartTime((String)newValue);
				return;
			case BikePackage.EXPORT_CREATION__END_TIME:
				setEndTime((String)newValue);
				return;
			case BikePackage.EXPORT_CREATION__SCHEMA:
				setSchema((String)newValue);
				return;
			case BikePackage.EXPORT_CREATION__SITE_IDS:
				getSiteIds().clear();
				getSiteIds().addAll((Collection<? extends Integer>)newValue);
				return;
			case BikePackage.EXPORT_CREATION__GRANULARITY:
				setGranularity((String)newValue);
				return;
			case BikePackage.EXPORT_CREATION__VALIDATED_DATA_ONLY:
				setValidatedDataOnly((Boolean)newValue);
				return;
			case BikePackage.EXPORT_CREATION__GAP_FILLING:
				setGapFilling((Boolean)newValue);
				return;
			case BikePackage.EXPORT_CREATION__VALIDATE_SCHEMA:
				setValidateSchema((Boolean)newValue);
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
			case BikePackage.EXPORT_CREATION__START_DATE:
				setStartDate(START_DATE_EDEFAULT);
				return;
			case BikePackage.EXPORT_CREATION__END_DATE:
				setEndDate(END_DATE_EDEFAULT);
				return;
			case BikePackage.EXPORT_CREATION__START_TIME:
				setStartTime(START_TIME_EDEFAULT);
				return;
			case BikePackage.EXPORT_CREATION__END_TIME:
				setEndTime(END_TIME_EDEFAULT);
				return;
			case BikePackage.EXPORT_CREATION__SCHEMA:
				setSchema(SCHEMA_EDEFAULT);
				return;
			case BikePackage.EXPORT_CREATION__SITE_IDS:
				getSiteIds().clear();
				return;
			case BikePackage.EXPORT_CREATION__GRANULARITY:
				setGranularity(GRANULARITY_EDEFAULT);
				return;
			case BikePackage.EXPORT_CREATION__VALIDATED_DATA_ONLY:
				setValidatedDataOnly(VALIDATED_DATA_ONLY_EDEFAULT);
				return;
			case BikePackage.EXPORT_CREATION__GAP_FILLING:
				setGapFilling(GAP_FILLING_EDEFAULT);
				return;
			case BikePackage.EXPORT_CREATION__VALIDATE_SCHEMA:
				setValidateSchema(VALIDATE_SCHEMA_EDEFAULT);
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
			case BikePackage.EXPORT_CREATION__START_DATE:
				return START_DATE_EDEFAULT == null ? startDate != null : !START_DATE_EDEFAULT.equals(startDate);
			case BikePackage.EXPORT_CREATION__END_DATE:
				return END_DATE_EDEFAULT == null ? endDate != null : !END_DATE_EDEFAULT.equals(endDate);
			case BikePackage.EXPORT_CREATION__START_TIME:
				return START_TIME_EDEFAULT == null ? startTime != null : !START_TIME_EDEFAULT.equals(startTime);
			case BikePackage.EXPORT_CREATION__END_TIME:
				return END_TIME_EDEFAULT == null ? endTime != null : !END_TIME_EDEFAULT.equals(endTime);
			case BikePackage.EXPORT_CREATION__SCHEMA:
				return SCHEMA_EDEFAULT == null ? schema != null : !SCHEMA_EDEFAULT.equals(schema);
			case BikePackage.EXPORT_CREATION__SITE_IDS:
				return siteIds != null && !siteIds.isEmpty();
			case BikePackage.EXPORT_CREATION__GRANULARITY:
				return GRANULARITY_EDEFAULT == null ? granularity != null : !GRANULARITY_EDEFAULT.equals(granularity);
			case BikePackage.EXPORT_CREATION__VALIDATED_DATA_ONLY:
				return VALIDATED_DATA_ONLY_EDEFAULT == null ? validatedDataOnly != null : !VALIDATED_DATA_ONLY_EDEFAULT.equals(validatedDataOnly);
			case BikePackage.EXPORT_CREATION__GAP_FILLING:
				return GAP_FILLING_EDEFAULT == null ? gapFilling != null : !GAP_FILLING_EDEFAULT.equals(gapFilling);
			case BikePackage.EXPORT_CREATION__VALIDATE_SCHEMA:
				return VALIDATE_SCHEMA_EDEFAULT == null ? validateSchema != null : !VALIDATE_SCHEMA_EDEFAULT.equals(validateSchema);
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
		result.append(" (startDate: ");
		result.append(startDate);
		result.append(", endDate: ");
		result.append(endDate);
		result.append(", startTime: ");
		result.append(startTime);
		result.append(", endTime: ");
		result.append(endTime);
		result.append(", schema: ");
		result.append(schema);
		result.append(", siteIds: ");
		result.append(siteIds);
		result.append(", granularity: ");
		result.append(granularity);
		result.append(", validatedDataOnly: ");
		result.append(validatedDataOnly);
		result.append(", gapFilling: ");
		result.append(gapFilling);
		result.append(", validateSchema: ");
		result.append(validateSchema);
		result.append(')');
		return result.toString();
	}

} //ExportCreationImpl
