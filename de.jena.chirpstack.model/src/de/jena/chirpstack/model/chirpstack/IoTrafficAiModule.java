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
 * A representation of the model object '<em><b>Io Traffic Ai Module</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.jena.chirpstack.model.chirpstack.IoTrafficAiModule#getCpuPct <em>Cpu Pct</em>}</li>
 *   <li>{@link de.jena.chirpstack.model.chirpstack.IoTrafficAiModule#getCpuTempC <em>Cpu Temp C</em>}</li>
 *   <li>{@link de.jena.chirpstack.model.chirpstack.IoTrafficAiModule#getGpuTempC <em>Gpu Temp C</em>}</li>
 *   <li>{@link de.jena.chirpstack.model.chirpstack.IoTrafficAiModule#getGpuUsagePct <em>Gpu Usage Pct</em>}</li>
 *   <li>{@link de.jena.chirpstack.model.chirpstack.IoTrafficAiModule#getRamPct <em>Ram Pct</em>}</li>
 *   <li>{@link de.jena.chirpstack.model.chirpstack.IoTrafficAiModule#getVmemPct <em>Vmem Pct</em>}</li>
 *   <li>{@link de.jena.chirpstack.model.chirpstack.IoTrafficAiModule#getSwapPct <em>Swap Pct</em>}</li>
 *   <li>{@link de.jena.chirpstack.model.chirpstack.IoTrafficAiModule#getDiskPct <em>Disk Pct</em>}</li>
 *   <li>{@link de.jena.chirpstack.model.chirpstack.IoTrafficAiModule#getOsLoad1Average <em>Os Load1 Average</em>}</li>
 *   <li>{@link de.jena.chirpstack.model.chirpstack.IoTrafficAiModule#getOsLoad5Average <em>Os Load5 Average</em>}</li>
 *   <li>{@link de.jena.chirpstack.model.chirpstack.IoTrafficAiModule#getOsLoad15Average <em>Os Load15 Average</em>}</li>
 *   <li>{@link de.jena.chirpstack.model.chirpstack.IoTrafficAiModule#getUptimeMinutes <em>Uptime Minutes</em>}</li>
 *   <li>{@link de.jena.chirpstack.model.chirpstack.IoTrafficAiModule#getUptimeHours <em>Uptime Hours</em>}</li>
 *   <li>{@link de.jena.chirpstack.model.chirpstack.IoTrafficAiModule#getUptimeDays <em>Uptime Days</em>}</li>
 *   <li>{@link de.jena.chirpstack.model.chirpstack.IoTrafficAiModule#getVoltageV <em>Voltage V</em>}</li>
 *   <li>{@link de.jena.chirpstack.model.chirpstack.IoTrafficAiModule#getVoltageMv <em>Voltage Mv</em>}</li>
 *   <li>{@link de.jena.chirpstack.model.chirpstack.IoTrafficAiModule#isWifiActive <em>Wifi Active</em>}</li>
 *   <li>{@link de.jena.chirpstack.model.chirpstack.IoTrafficAiModule#isEthernetActive <em>Ethernet Active</em>}</li>
 *   <li>{@link de.jena.chirpstack.model.chirpstack.IoTrafficAiModule#getNetworkIfStatus <em>Network If Status</em>}</li>
 *   <li>{@link de.jena.chirpstack.model.chirpstack.IoTrafficAiModule#getErrorCode <em>Error Code</em>}</li>
 *   <li>{@link de.jena.chirpstack.model.chirpstack.IoTrafficAiModule#getTimestamp <em>Timestamp</em>}</li>
 *   <li>{@link de.jena.chirpstack.model.chirpstack.IoTrafficAiModule#getTimestampIso <em>Timestamp Iso</em>}</li>
 * </ul>
 *
 * @see de.jena.chirpstack.model.chirpstack.ChirpstackPackage#getIoTrafficAiModule()
 * @model
 * @generated
 */
@ProviderType
public interface IoTrafficAiModule extends Service {
	/**
	 * Returns the value of the '<em><b>Cpu Pct</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Cpu Pct</em>' attribute.
	 * @see #setCpuPct(double)
	 * @see de.jena.chirpstack.model.chirpstack.ChirpstackPackage#getIoTrafficAiModule_CpuPct()
	 * @model annotation="mapping path='object/cpu_pct'"
	 * @generated
	 */
	double getCpuPct();

	/**
	 * Sets the value of the '{@link de.jena.chirpstack.model.chirpstack.IoTrafficAiModule#getCpuPct <em>Cpu Pct</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Cpu Pct</em>' attribute.
	 * @see #getCpuPct()
	 * @generated
	 */
	void setCpuPct(double value);

	/**
	 * Returns the value of the '<em><b>Cpu Temp C</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Cpu Temp C</em>' attribute.
	 * @see #setCpuTempC(double)
	 * @see de.jena.chirpstack.model.chirpstack.ChirpstackPackage#getIoTrafficAiModule_CpuTempC()
	 * @model annotation="mapping path='object/cpu_temp_c'"
	 * @generated
	 */
	double getCpuTempC();

	/**
	 * Sets the value of the '{@link de.jena.chirpstack.model.chirpstack.IoTrafficAiModule#getCpuTempC <em>Cpu Temp C</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Cpu Temp C</em>' attribute.
	 * @see #getCpuTempC()
	 * @generated
	 */
	void setCpuTempC(double value);

	/**
	 * Returns the value of the '<em><b>Gpu Temp C</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Gpu Temp C</em>' attribute.
	 * @see #setGpuTempC(double)
	 * @see de.jena.chirpstack.model.chirpstack.ChirpstackPackage#getIoTrafficAiModule_GpuTempC()
	 * @model annotation="mapping path='object/gpu_temp_c'"
	 * @generated
	 */
	double getGpuTempC();

	/**
	 * Sets the value of the '{@link de.jena.chirpstack.model.chirpstack.IoTrafficAiModule#getGpuTempC <em>Gpu Temp C</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Gpu Temp C</em>' attribute.
	 * @see #getGpuTempC()
	 * @generated
	 */
	void setGpuTempC(double value);

	/**
	 * Returns the value of the '<em><b>Gpu Usage Pct</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Gpu Usage Pct</em>' attribute.
	 * @see #setGpuUsagePct(double)
	 * @see de.jena.chirpstack.model.chirpstack.ChirpstackPackage#getIoTrafficAiModule_GpuUsagePct()
	 * @model annotation="mapping path='object/gpu_usage_pct'"
	 * @generated
	 */
	double getGpuUsagePct();

	/**
	 * Sets the value of the '{@link de.jena.chirpstack.model.chirpstack.IoTrafficAiModule#getGpuUsagePct <em>Gpu Usage Pct</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Gpu Usage Pct</em>' attribute.
	 * @see #getGpuUsagePct()
	 * @generated
	 */
	void setGpuUsagePct(double value);

	/**
	 * Returns the value of the '<em><b>Ram Pct</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Ram Pct</em>' attribute.
	 * @see #setRamPct(double)
	 * @see de.jena.chirpstack.model.chirpstack.ChirpstackPackage#getIoTrafficAiModule_RamPct()
	 * @model annotation="mapping path='object/ram_pct'"
	 * @generated
	 */
	double getRamPct();

	/**
	 * Sets the value of the '{@link de.jena.chirpstack.model.chirpstack.IoTrafficAiModule#getRamPct <em>Ram Pct</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Ram Pct</em>' attribute.
	 * @see #getRamPct()
	 * @generated
	 */
	void setRamPct(double value);

	/**
	 * Returns the value of the '<em><b>Vmem Pct</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Vmem Pct</em>' attribute.
	 * @see #setVmemPct(double)
	 * @see de.jena.chirpstack.model.chirpstack.ChirpstackPackage#getIoTrafficAiModule_VmemPct()
	 * @model annotation="mapping path='object/vmem_pct'"
	 * @generated
	 */
	double getVmemPct();

	/**
	 * Sets the value of the '{@link de.jena.chirpstack.model.chirpstack.IoTrafficAiModule#getVmemPct <em>Vmem Pct</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Vmem Pct</em>' attribute.
	 * @see #getVmemPct()
	 * @generated
	 */
	void setVmemPct(double value);

	/**
	 * Returns the value of the '<em><b>Swap Pct</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Swap Pct</em>' attribute.
	 * @see #setSwapPct(double)
	 * @see de.jena.chirpstack.model.chirpstack.ChirpstackPackage#getIoTrafficAiModule_SwapPct()
	 * @model annotation="mapping path='object/swap_pct'"
	 * @generated
	 */
	double getSwapPct();

	/**
	 * Sets the value of the '{@link de.jena.chirpstack.model.chirpstack.IoTrafficAiModule#getSwapPct <em>Swap Pct</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Swap Pct</em>' attribute.
	 * @see #getSwapPct()
	 * @generated
	 */
	void setSwapPct(double value);

	/**
	 * Returns the value of the '<em><b>Disk Pct</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Disk Pct</em>' attribute.
	 * @see #setDiskPct(double)
	 * @see de.jena.chirpstack.model.chirpstack.ChirpstackPackage#getIoTrafficAiModule_DiskPct()
	 * @model annotation="mapping path='object/disk_pct'"
	 * @generated
	 */
	double getDiskPct();

	/**
	 * Sets the value of the '{@link de.jena.chirpstack.model.chirpstack.IoTrafficAiModule#getDiskPct <em>Disk Pct</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Disk Pct</em>' attribute.
	 * @see #getDiskPct()
	 * @generated
	 */
	void setDiskPct(double value);

	/**
	 * Returns the value of the '<em><b>Os Load1 Average</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Os Load1 Average</em>' attribute.
	 * @see #setOsLoad1Average(double)
	 * @see de.jena.chirpstack.model.chirpstack.ChirpstackPackage#getIoTrafficAiModule_OsLoad1Average()
	 * @model annotation="mapping path='object/os_load_1_average'"
	 * @generated
	 */
	double getOsLoad1Average();

	/**
	 * Sets the value of the '{@link de.jena.chirpstack.model.chirpstack.IoTrafficAiModule#getOsLoad1Average <em>Os Load1 Average</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Os Load1 Average</em>' attribute.
	 * @see #getOsLoad1Average()
	 * @generated
	 */
	void setOsLoad1Average(double value);

	/**
	 * Returns the value of the '<em><b>Os Load5 Average</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Os Load5 Average</em>' attribute.
	 * @see #setOsLoad5Average(double)
	 * @see de.jena.chirpstack.model.chirpstack.ChirpstackPackage#getIoTrafficAiModule_OsLoad5Average()
	 * @model annotation="mapping path='object/os_load_5_average'"
	 * @generated
	 */
	double getOsLoad5Average();

	/**
	 * Sets the value of the '{@link de.jena.chirpstack.model.chirpstack.IoTrafficAiModule#getOsLoad5Average <em>Os Load5 Average</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Os Load5 Average</em>' attribute.
	 * @see #getOsLoad5Average()
	 * @generated
	 */
	void setOsLoad5Average(double value);

	/**
	 * Returns the value of the '<em><b>Os Load15 Average</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Os Load15 Average</em>' attribute.
	 * @see #setOsLoad15Average(double)
	 * @see de.jena.chirpstack.model.chirpstack.ChirpstackPackage#getIoTrafficAiModule_OsLoad15Average()
	 * @model annotation="mapping path='object/os_load_15_average'"
	 * @generated
	 */
	double getOsLoad15Average();

	/**
	 * Sets the value of the '{@link de.jena.chirpstack.model.chirpstack.IoTrafficAiModule#getOsLoad15Average <em>Os Load15 Average</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Os Load15 Average</em>' attribute.
	 * @see #getOsLoad15Average()
	 * @generated
	 */
	void setOsLoad15Average(double value);

	/**
	 * Returns the value of the '<em><b>Uptime Minutes</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Uptime Minutes</em>' attribute.
	 * @see #setUptimeMinutes(double)
	 * @see de.jena.chirpstack.model.chirpstack.ChirpstackPackage#getIoTrafficAiModule_UptimeMinutes()
	 * @model annotation="mapping path='object/uptime_minutes'"
	 * @generated
	 */
	double getUptimeMinutes();

	/**
	 * Sets the value of the '{@link de.jena.chirpstack.model.chirpstack.IoTrafficAiModule#getUptimeMinutes <em>Uptime Minutes</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Uptime Minutes</em>' attribute.
	 * @see #getUptimeMinutes()
	 * @generated
	 */
	void setUptimeMinutes(double value);

	/**
	 * Returns the value of the '<em><b>Uptime Hours</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Uptime Hours</em>' attribute.
	 * @see #setUptimeHours(double)
	 * @see de.jena.chirpstack.model.chirpstack.ChirpstackPackage#getIoTrafficAiModule_UptimeHours()
	 * @model annotation="mapping path='object/uptime_hours'"
	 * @generated
	 */
	double getUptimeHours();

	/**
	 * Sets the value of the '{@link de.jena.chirpstack.model.chirpstack.IoTrafficAiModule#getUptimeHours <em>Uptime Hours</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Uptime Hours</em>' attribute.
	 * @see #getUptimeHours()
	 * @generated
	 */
	void setUptimeHours(double value);

	/**
	 * Returns the value of the '<em><b>Uptime Days</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Uptime Days</em>' attribute.
	 * @see #setUptimeDays(double)
	 * @see de.jena.chirpstack.model.chirpstack.ChirpstackPackage#getIoTrafficAiModule_UptimeDays()
	 * @model annotation="mapping path='object/uptime_days'"
	 * @generated
	 */
	double getUptimeDays();

	/**
	 * Sets the value of the '{@link de.jena.chirpstack.model.chirpstack.IoTrafficAiModule#getUptimeDays <em>Uptime Days</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Uptime Days</em>' attribute.
	 * @see #getUptimeDays()
	 * @generated
	 */
	void setUptimeDays(double value);

	/**
	 * Returns the value of the '<em><b>Voltage V</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Voltage V</em>' attribute.
	 * @see #setVoltageV(double)
	 * @see de.jena.chirpstack.model.chirpstack.ChirpstackPackage#getIoTrafficAiModule_VoltageV()
	 * @model annotation="mapping path='object/voltage_v'"
	 * @generated
	 */
	double getVoltageV();

	/**
	 * Sets the value of the '{@link de.jena.chirpstack.model.chirpstack.IoTrafficAiModule#getVoltageV <em>Voltage V</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Voltage V</em>' attribute.
	 * @see #getVoltageV()
	 * @generated
	 */
	void setVoltageV(double value);

	/**
	 * Returns the value of the '<em><b>Voltage Mv</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Voltage Mv</em>' attribute.
	 * @see #setVoltageMv(double)
	 * @see de.jena.chirpstack.model.chirpstack.ChirpstackPackage#getIoTrafficAiModule_VoltageMv()
	 * @model annotation="mapping path='object/voltage_mv'"
	 * @generated
	 */
	double getVoltageMv();

	/**
	 * Sets the value of the '{@link de.jena.chirpstack.model.chirpstack.IoTrafficAiModule#getVoltageMv <em>Voltage Mv</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Voltage Mv</em>' attribute.
	 * @see #getVoltageMv()
	 * @generated
	 */
	void setVoltageMv(double value);

	/**
	 * Returns the value of the '<em><b>Wifi Active</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Wifi Active</em>' attribute.
	 * @see #setWifiActive(boolean)
	 * @see de.jena.chirpstack.model.chirpstack.ChirpstackPackage#getIoTrafficAiModule_WifiActive()
	 * @model annotation="mapping path='object/wifi_active'"
	 * @generated
	 */
	boolean isWifiActive();

	/**
	 * Sets the value of the '{@link de.jena.chirpstack.model.chirpstack.IoTrafficAiModule#isWifiActive <em>Wifi Active</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Wifi Active</em>' attribute.
	 * @see #isWifiActive()
	 * @generated
	 */
	void setWifiActive(boolean value);

	/**
	 * Returns the value of the '<em><b>Ethernet Active</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Ethernet Active</em>' attribute.
	 * @see #setEthernetActive(boolean)
	 * @see de.jena.chirpstack.model.chirpstack.ChirpstackPackage#getIoTrafficAiModule_EthernetActive()
	 * @model annotation="mapping path='object/ethernet_active'"
	 * @generated
	 */
	boolean isEthernetActive();

	/**
	 * Sets the value of the '{@link de.jena.chirpstack.model.chirpstack.IoTrafficAiModule#isEthernetActive <em>Ethernet Active</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Ethernet Active</em>' attribute.
	 * @see #isEthernetActive()
	 * @generated
	 */
	void setEthernetActive(boolean value);

	/**
	 * Returns the value of the '<em><b>Network If Status</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Network If Status</em>' attribute.
	 * @see #setNetworkIfStatus(double)
	 * @see de.jena.chirpstack.model.chirpstack.ChirpstackPackage#getIoTrafficAiModule_NetworkIfStatus()
	 * @model annotation="mapping path='object/network_if_status'"
	 * @generated
	 */
	double getNetworkIfStatus();

	/**
	 * Sets the value of the '{@link de.jena.chirpstack.model.chirpstack.IoTrafficAiModule#getNetworkIfStatus <em>Network If Status</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Network If Status</em>' attribute.
	 * @see #getNetworkIfStatus()
	 * @generated
	 */
	void setNetworkIfStatus(double value);

	/**
	 * Returns the value of the '<em><b>Error Code</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Error Code</em>' attribute.
	 * @see #setErrorCode(double)
	 * @see de.jena.chirpstack.model.chirpstack.ChirpstackPackage#getIoTrafficAiModule_ErrorCode()
	 * @model annotation="mapping path='object/error_code'"
	 * @generated
	 */
	double getErrorCode();

	/**
	 * Sets the value of the '{@link de.jena.chirpstack.model.chirpstack.IoTrafficAiModule#getErrorCode <em>Error Code</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Error Code</em>' attribute.
	 * @see #getErrorCode()
	 * @generated
	 */
	void setErrorCode(double value);

	/**
	 * Returns the value of the '<em><b>Timestamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Timestamp</em>' attribute.
	 * @see #setTimestamp(double)
	 * @see de.jena.chirpstack.model.chirpstack.ChirpstackPackage#getIoTrafficAiModule_Timestamp()
	 * @model annotation="mapping path='object/timestamp'"
	 * @generated
	 */
	double getTimestamp();

	/**
	 * Sets the value of the '{@link de.jena.chirpstack.model.chirpstack.IoTrafficAiModule#getTimestamp <em>Timestamp</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Timestamp</em>' attribute.
	 * @see #getTimestamp()
	 * @generated
	 */
	void setTimestamp(double value);

	/**
	 * Returns the value of the '<em><b>Timestamp Iso</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Timestamp Iso</em>' attribute.
	 * @see #setTimestampIso(String)
	 * @see de.jena.chirpstack.model.chirpstack.ChirpstackPackage#getIoTrafficAiModule_TimestampIso()
	 * @model annotation="mapping path='object/timestamp_iso'"
	 * @generated
	 */
	String getTimestampIso();

	/**
	 * Sets the value of the '{@link de.jena.chirpstack.model.chirpstack.IoTrafficAiModule#getTimestampIso <em>Timestamp Iso</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Timestamp Iso</em>' attribute.
	 * @see #getTimestampIso()
	 * @generated
	 */
	void setTimestampIso(String value);

} // IoTrafficAiModule
