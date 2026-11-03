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
package de.jena.chirpstack.model.chirpstack;

import org.eclipse.sensinact.model.core.provider.Service;

import org.osgi.annotation.versioning.ProviderType;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>PMX Counter</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.jena.chirpstack.model.chirpstack.PMXCounter#getTotalCount <em>Total Count</em>}</li>
 *   <li>{@link de.jena.chirpstack.model.chirpstack.PMXCounter#getLtrCount <em>Ltr Count</em>}</li>
 *   <li>{@link de.jena.chirpstack.model.chirpstack.PMXCounter#getLtrAvgSpeedKmh <em>Ltr Avg Speed Kmh</em>}</li>
 *   <li>{@link de.jena.chirpstack.model.chirpstack.PMXCounter#getRtlCount <em>Rtl Count</em>}</li>
 *   <li>{@link de.jena.chirpstack.model.chirpstack.PMXCounter#getRtlAvgSpeedKmh <em>Rtl Avg Speed Kmh</em>}</li>
 * </ul>
 *
 * @see de.jena.chirpstack.model.chirpstack.ChirpstackPackage#getPMXCounter()
 * @model
 * @generated
 */
@ProviderType
public interface PMXCounter extends Service {
	/**
	 * Returns the value of the '<em><b>Total Count</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Total Count</em>' attribute.
	 * @see #setTotalCount(double)
	 * @see de.jena.chirpstack.model.chirpstack.ChirpstackPackage#getPMXCounter_TotalCount()
	 * @model annotation="mapping path='object/total_count'"
	 * @generated
	 */
	double getTotalCount();

	/**
	 * Sets the value of the '{@link de.jena.chirpstack.model.chirpstack.PMXCounter#getTotalCount <em>Total Count</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Total Count</em>' attribute.
	 * @see #getTotalCount()
	 * @generated
	 */
	void setTotalCount(double value);

	/**
	 * Returns the value of the '<em><b>Ltr Count</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Ltr Count</em>' attribute.
	 * @see #setLtrCount(double)
	 * @see de.jena.chirpstack.model.chirpstack.ChirpstackPackage#getPMXCounter_LtrCount()
	 * @model annotation="mapping path='object/ltr/count'"
	 * @generated
	 */
	double getLtrCount();

	/**
	 * Sets the value of the '{@link de.jena.chirpstack.model.chirpstack.PMXCounter#getLtrCount <em>Ltr Count</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Ltr Count</em>' attribute.
	 * @see #getLtrCount()
	 * @generated
	 */
	void setLtrCount(double value);

	/**
	 * Returns the value of the '<em><b>Ltr Avg Speed Kmh</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Ltr Avg Speed Kmh</em>' attribute.
	 * @see #setLtrAvgSpeedKmh(double)
	 * @see de.jena.chirpstack.model.chirpstack.ChirpstackPackage#getPMXCounter_LtrAvgSpeedKmh()
	 * @model annotation="mapping path='object/ltr/avg_speed_kmh'"
	 * @generated
	 */
	double getLtrAvgSpeedKmh();

	/**
	 * Sets the value of the '{@link de.jena.chirpstack.model.chirpstack.PMXCounter#getLtrAvgSpeedKmh <em>Ltr Avg Speed Kmh</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Ltr Avg Speed Kmh</em>' attribute.
	 * @see #getLtrAvgSpeedKmh()
	 * @generated
	 */
	void setLtrAvgSpeedKmh(double value);

	/**
	 * Returns the value of the '<em><b>Rtl Count</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Rtl Count</em>' attribute.
	 * @see #setRtlCount(double)
	 * @see de.jena.chirpstack.model.chirpstack.ChirpstackPackage#getPMXCounter_RtlCount()
	 * @model annotation="mapping path='object/rtl/count'"
	 * @generated
	 */
	double getRtlCount();

	/**
	 * Sets the value of the '{@link de.jena.chirpstack.model.chirpstack.PMXCounter#getRtlCount <em>Rtl Count</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Rtl Count</em>' attribute.
	 * @see #getRtlCount()
	 * @generated
	 */
	void setRtlCount(double value);

	/**
	 * Returns the value of the '<em><b>Rtl Avg Speed Kmh</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Rtl Avg Speed Kmh</em>' attribute.
	 * @see #setRtlAvgSpeedKmh(double)
	 * @see de.jena.chirpstack.model.chirpstack.ChirpstackPackage#getPMXCounter_RtlAvgSpeedKmh()
	 * @model annotation="mapping path='object/rtl/avg_speed_kmh'"
	 * @generated
	 */
	double getRtlAvgSpeedKmh();

	/**
	 * Sets the value of the '{@link de.jena.chirpstack.model.chirpstack.PMXCounter#getRtlAvgSpeedKmh <em>Rtl Avg Speed Kmh</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Rtl Avg Speed Kmh</em>' attribute.
	 * @see #getRtlAvgSpeedKmh()
	 * @generated
	 */
	void setRtlAvgSpeedKmh(double value);

} // PMXCounter
