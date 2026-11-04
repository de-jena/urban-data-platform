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
package de.jena.chirpstack.model.chirpstack.impl;

import de.jena.chirpstack.model.chirpstack.ChirpstackPackage;
import de.jena.chirpstack.model.chirpstack.IoTrafficAiModule;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.sensinact.model.core.provider.impl.ServiceImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Io Traffic Ai Module</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link de.jena.chirpstack.model.chirpstack.impl.IoTrafficAiModuleImpl#getCpuPct <em>Cpu Pct</em>}</li>
 *   <li>{@link de.jena.chirpstack.model.chirpstack.impl.IoTrafficAiModuleImpl#getCpuTempC <em>Cpu Temp C</em>}</li>
 *   <li>{@link de.jena.chirpstack.model.chirpstack.impl.IoTrafficAiModuleImpl#getGpuTempC <em>Gpu Temp C</em>}</li>
 *   <li>{@link de.jena.chirpstack.model.chirpstack.impl.IoTrafficAiModuleImpl#getGpuUsagePct <em>Gpu Usage Pct</em>}</li>
 *   <li>{@link de.jena.chirpstack.model.chirpstack.impl.IoTrafficAiModuleImpl#getRamPct <em>Ram Pct</em>}</li>
 *   <li>{@link de.jena.chirpstack.model.chirpstack.impl.IoTrafficAiModuleImpl#getVmemPct <em>Vmem Pct</em>}</li>
 *   <li>{@link de.jena.chirpstack.model.chirpstack.impl.IoTrafficAiModuleImpl#getSwapPct <em>Swap Pct</em>}</li>
 *   <li>{@link de.jena.chirpstack.model.chirpstack.impl.IoTrafficAiModuleImpl#getDiskPct <em>Disk Pct</em>}</li>
 *   <li>{@link de.jena.chirpstack.model.chirpstack.impl.IoTrafficAiModuleImpl#getOsLoad1Average <em>Os Load1 Average</em>}</li>
 *   <li>{@link de.jena.chirpstack.model.chirpstack.impl.IoTrafficAiModuleImpl#getOsLoad5Average <em>Os Load5 Average</em>}</li>
 *   <li>{@link de.jena.chirpstack.model.chirpstack.impl.IoTrafficAiModuleImpl#getOsLoad15Average <em>Os Load15 Average</em>}</li>
 *   <li>{@link de.jena.chirpstack.model.chirpstack.impl.IoTrafficAiModuleImpl#getUptimeMinutes <em>Uptime Minutes</em>}</li>
 *   <li>{@link de.jena.chirpstack.model.chirpstack.impl.IoTrafficAiModuleImpl#getUptimeHours <em>Uptime Hours</em>}</li>
 *   <li>{@link de.jena.chirpstack.model.chirpstack.impl.IoTrafficAiModuleImpl#getUptimeDays <em>Uptime Days</em>}</li>
 *   <li>{@link de.jena.chirpstack.model.chirpstack.impl.IoTrafficAiModuleImpl#getVoltageV <em>Voltage V</em>}</li>
 *   <li>{@link de.jena.chirpstack.model.chirpstack.impl.IoTrafficAiModuleImpl#getVoltageMv <em>Voltage Mv</em>}</li>
 *   <li>{@link de.jena.chirpstack.model.chirpstack.impl.IoTrafficAiModuleImpl#isWifiActive <em>Wifi Active</em>}</li>
 *   <li>{@link de.jena.chirpstack.model.chirpstack.impl.IoTrafficAiModuleImpl#isEthernetActive <em>Ethernet Active</em>}</li>
 *   <li>{@link de.jena.chirpstack.model.chirpstack.impl.IoTrafficAiModuleImpl#getNetworkIfStatus <em>Network If Status</em>}</li>
 *   <li>{@link de.jena.chirpstack.model.chirpstack.impl.IoTrafficAiModuleImpl#getErrorCode <em>Error Code</em>}</li>
 *   <li>{@link de.jena.chirpstack.model.chirpstack.impl.IoTrafficAiModuleImpl#getTimestamp <em>Timestamp</em>}</li>
 *   <li>{@link de.jena.chirpstack.model.chirpstack.impl.IoTrafficAiModuleImpl#getTimestampIso <em>Timestamp Iso</em>}</li>
 * </ul>
 *
 * @generated
 */
public class IoTrafficAiModuleImpl extends ServiceImpl implements IoTrafficAiModule {
	/**
	 * The default value of the '{@link #getCpuPct() <em>Cpu Pct</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCpuPct()
	 * @generated
	 * @ordered
	 */
	protected static final double CPU_PCT_EDEFAULT = 0.0;

	/**
	 * The cached value of the '{@link #getCpuPct() <em>Cpu Pct</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCpuPct()
	 * @generated
	 * @ordered
	 */
	protected double cpuPct = CPU_PCT_EDEFAULT;

	/**
	 * The default value of the '{@link #getCpuTempC() <em>Cpu Temp C</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCpuTempC()
	 * @generated
	 * @ordered
	 */
	protected static final double CPU_TEMP_C_EDEFAULT = 0.0;

	/**
	 * The cached value of the '{@link #getCpuTempC() <em>Cpu Temp C</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCpuTempC()
	 * @generated
	 * @ordered
	 */
	protected double cpuTempC = CPU_TEMP_C_EDEFAULT;

	/**
	 * The default value of the '{@link #getGpuTempC() <em>Gpu Temp C</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGpuTempC()
	 * @generated
	 * @ordered
	 */
	protected static final double GPU_TEMP_C_EDEFAULT = 0.0;

	/**
	 * The cached value of the '{@link #getGpuTempC() <em>Gpu Temp C</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGpuTempC()
	 * @generated
	 * @ordered
	 */
	protected double gpuTempC = GPU_TEMP_C_EDEFAULT;

	/**
	 * The default value of the '{@link #getGpuUsagePct() <em>Gpu Usage Pct</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGpuUsagePct()
	 * @generated
	 * @ordered
	 */
	protected static final double GPU_USAGE_PCT_EDEFAULT = 0.0;

	/**
	 * The cached value of the '{@link #getGpuUsagePct() <em>Gpu Usage Pct</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGpuUsagePct()
	 * @generated
	 * @ordered
	 */
	protected double gpuUsagePct = GPU_USAGE_PCT_EDEFAULT;

	/**
	 * The default value of the '{@link #getRamPct() <em>Ram Pct</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRamPct()
	 * @generated
	 * @ordered
	 */
	protected static final double RAM_PCT_EDEFAULT = 0.0;

	/**
	 * The cached value of the '{@link #getRamPct() <em>Ram Pct</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRamPct()
	 * @generated
	 * @ordered
	 */
	protected double ramPct = RAM_PCT_EDEFAULT;

	/**
	 * The default value of the '{@link #getVmemPct() <em>Vmem Pct</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVmemPct()
	 * @generated
	 * @ordered
	 */
	protected static final double VMEM_PCT_EDEFAULT = 0.0;

	/**
	 * The cached value of the '{@link #getVmemPct() <em>Vmem Pct</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVmemPct()
	 * @generated
	 * @ordered
	 */
	protected double vmemPct = VMEM_PCT_EDEFAULT;

	/**
	 * The default value of the '{@link #getSwapPct() <em>Swap Pct</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSwapPct()
	 * @generated
	 * @ordered
	 */
	protected static final double SWAP_PCT_EDEFAULT = 0.0;

	/**
	 * The cached value of the '{@link #getSwapPct() <em>Swap Pct</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSwapPct()
	 * @generated
	 * @ordered
	 */
	protected double swapPct = SWAP_PCT_EDEFAULT;

	/**
	 * The default value of the '{@link #getDiskPct() <em>Disk Pct</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDiskPct()
	 * @generated
	 * @ordered
	 */
	protected static final double DISK_PCT_EDEFAULT = 0.0;

	/**
	 * The cached value of the '{@link #getDiskPct() <em>Disk Pct</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDiskPct()
	 * @generated
	 * @ordered
	 */
	protected double diskPct = DISK_PCT_EDEFAULT;

	/**
	 * The default value of the '{@link #getOsLoad1Average() <em>Os Load1 Average</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOsLoad1Average()
	 * @generated
	 * @ordered
	 */
	protected static final double OS_LOAD1_AVERAGE_EDEFAULT = 0.0;

	/**
	 * The cached value of the '{@link #getOsLoad1Average() <em>Os Load1 Average</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOsLoad1Average()
	 * @generated
	 * @ordered
	 */
	protected double osLoad1Average = OS_LOAD1_AVERAGE_EDEFAULT;

	/**
	 * The default value of the '{@link #getOsLoad5Average() <em>Os Load5 Average</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOsLoad5Average()
	 * @generated
	 * @ordered
	 */
	protected static final double OS_LOAD5_AVERAGE_EDEFAULT = 0.0;

	/**
	 * The cached value of the '{@link #getOsLoad5Average() <em>Os Load5 Average</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOsLoad5Average()
	 * @generated
	 * @ordered
	 */
	protected double osLoad5Average = OS_LOAD5_AVERAGE_EDEFAULT;

	/**
	 * The default value of the '{@link #getOsLoad15Average() <em>Os Load15 Average</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOsLoad15Average()
	 * @generated
	 * @ordered
	 */
	protected static final double OS_LOAD15_AVERAGE_EDEFAULT = 0.0;

	/**
	 * The cached value of the '{@link #getOsLoad15Average() <em>Os Load15 Average</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOsLoad15Average()
	 * @generated
	 * @ordered
	 */
	protected double osLoad15Average = OS_LOAD15_AVERAGE_EDEFAULT;

	/**
	 * The default value of the '{@link #getUptimeMinutes() <em>Uptime Minutes</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUptimeMinutes()
	 * @generated
	 * @ordered
	 */
	protected static final double UPTIME_MINUTES_EDEFAULT = 0.0;

	/**
	 * The cached value of the '{@link #getUptimeMinutes() <em>Uptime Minutes</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUptimeMinutes()
	 * @generated
	 * @ordered
	 */
	protected double uptimeMinutes = UPTIME_MINUTES_EDEFAULT;

	/**
	 * The default value of the '{@link #getUptimeHours() <em>Uptime Hours</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUptimeHours()
	 * @generated
	 * @ordered
	 */
	protected static final double UPTIME_HOURS_EDEFAULT = 0.0;

	/**
	 * The cached value of the '{@link #getUptimeHours() <em>Uptime Hours</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUptimeHours()
	 * @generated
	 * @ordered
	 */
	protected double uptimeHours = UPTIME_HOURS_EDEFAULT;

	/**
	 * The default value of the '{@link #getUptimeDays() <em>Uptime Days</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUptimeDays()
	 * @generated
	 * @ordered
	 */
	protected static final double UPTIME_DAYS_EDEFAULT = 0.0;

	/**
	 * The cached value of the '{@link #getUptimeDays() <em>Uptime Days</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUptimeDays()
	 * @generated
	 * @ordered
	 */
	protected double uptimeDays = UPTIME_DAYS_EDEFAULT;

	/**
	 * The default value of the '{@link #getVoltageV() <em>Voltage V</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVoltageV()
	 * @generated
	 * @ordered
	 */
	protected static final double VOLTAGE_V_EDEFAULT = 0.0;

	/**
	 * The cached value of the '{@link #getVoltageV() <em>Voltage V</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVoltageV()
	 * @generated
	 * @ordered
	 */
	protected double voltageV = VOLTAGE_V_EDEFAULT;

	/**
	 * The default value of the '{@link #getVoltageMv() <em>Voltage Mv</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVoltageMv()
	 * @generated
	 * @ordered
	 */
	protected static final double VOLTAGE_MV_EDEFAULT = 0.0;

	/**
	 * The cached value of the '{@link #getVoltageMv() <em>Voltage Mv</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVoltageMv()
	 * @generated
	 * @ordered
	 */
	protected double voltageMv = VOLTAGE_MV_EDEFAULT;

	/**
	 * The default value of the '{@link #isWifiActive() <em>Wifi Active</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isWifiActive()
	 * @generated
	 * @ordered
	 */
	protected static final boolean WIFI_ACTIVE_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isWifiActive() <em>Wifi Active</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isWifiActive()
	 * @generated
	 * @ordered
	 */
	protected boolean wifiActive = WIFI_ACTIVE_EDEFAULT;

	/**
	 * The default value of the '{@link #isEthernetActive() <em>Ethernet Active</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isEthernetActive()
	 * @generated
	 * @ordered
	 */
	protected static final boolean ETHERNET_ACTIVE_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isEthernetActive() <em>Ethernet Active</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isEthernetActive()
	 * @generated
	 * @ordered
	 */
	protected boolean ethernetActive = ETHERNET_ACTIVE_EDEFAULT;

	/**
	 * The default value of the '{@link #getNetworkIfStatus() <em>Network If Status</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNetworkIfStatus()
	 * @generated
	 * @ordered
	 */
	protected static final double NETWORK_IF_STATUS_EDEFAULT = 0.0;

	/**
	 * The cached value of the '{@link #getNetworkIfStatus() <em>Network If Status</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNetworkIfStatus()
	 * @generated
	 * @ordered
	 */
	protected double networkIfStatus = NETWORK_IF_STATUS_EDEFAULT;

	/**
	 * The default value of the '{@link #getErrorCode() <em>Error Code</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getErrorCode()
	 * @generated
	 * @ordered
	 */
	protected static final double ERROR_CODE_EDEFAULT = 0.0;

	/**
	 * The cached value of the '{@link #getErrorCode() <em>Error Code</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getErrorCode()
	 * @generated
	 * @ordered
	 */
	protected double errorCode = ERROR_CODE_EDEFAULT;

	/**
	 * The default value of the '{@link #getTimestamp() <em>Timestamp</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTimestamp()
	 * @generated
	 * @ordered
	 */
	protected static final double TIMESTAMP_EDEFAULT = 0.0;

	/**
	 * The cached value of the '{@link #getTimestamp() <em>Timestamp</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTimestamp()
	 * @generated
	 * @ordered
	 */
	protected double timestamp = TIMESTAMP_EDEFAULT;

	/**
	 * The default value of the '{@link #getTimestampIso() <em>Timestamp Iso</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTimestampIso()
	 * @generated
	 * @ordered
	 */
	protected static final String TIMESTAMP_ISO_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getTimestampIso() <em>Timestamp Iso</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTimestampIso()
	 * @generated
	 * @ordered
	 */
	protected String timestampIso = TIMESTAMP_ISO_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected IoTrafficAiModuleImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ChirpstackPackage.Literals.IO_TRAFFIC_AI_MODULE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public double getCpuPct() {
		return cpuPct;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setCpuPct(double newCpuPct) {
		double oldCpuPct = cpuPct;
		cpuPct = newCpuPct;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ChirpstackPackage.IO_TRAFFIC_AI_MODULE__CPU_PCT, oldCpuPct, cpuPct));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public double getCpuTempC() {
		return cpuTempC;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setCpuTempC(double newCpuTempC) {
		double oldCpuTempC = cpuTempC;
		cpuTempC = newCpuTempC;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ChirpstackPackage.IO_TRAFFIC_AI_MODULE__CPU_TEMP_C, oldCpuTempC, cpuTempC));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public double getGpuTempC() {
		return gpuTempC;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setGpuTempC(double newGpuTempC) {
		double oldGpuTempC = gpuTempC;
		gpuTempC = newGpuTempC;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ChirpstackPackage.IO_TRAFFIC_AI_MODULE__GPU_TEMP_C, oldGpuTempC, gpuTempC));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public double getGpuUsagePct() {
		return gpuUsagePct;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setGpuUsagePct(double newGpuUsagePct) {
		double oldGpuUsagePct = gpuUsagePct;
		gpuUsagePct = newGpuUsagePct;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ChirpstackPackage.IO_TRAFFIC_AI_MODULE__GPU_USAGE_PCT, oldGpuUsagePct, gpuUsagePct));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public double getRamPct() {
		return ramPct;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setRamPct(double newRamPct) {
		double oldRamPct = ramPct;
		ramPct = newRamPct;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ChirpstackPackage.IO_TRAFFIC_AI_MODULE__RAM_PCT, oldRamPct, ramPct));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public double getVmemPct() {
		return vmemPct;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setVmemPct(double newVmemPct) {
		double oldVmemPct = vmemPct;
		vmemPct = newVmemPct;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ChirpstackPackage.IO_TRAFFIC_AI_MODULE__VMEM_PCT, oldVmemPct, vmemPct));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public double getSwapPct() {
		return swapPct;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setSwapPct(double newSwapPct) {
		double oldSwapPct = swapPct;
		swapPct = newSwapPct;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ChirpstackPackage.IO_TRAFFIC_AI_MODULE__SWAP_PCT, oldSwapPct, swapPct));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public double getDiskPct() {
		return diskPct;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setDiskPct(double newDiskPct) {
		double oldDiskPct = diskPct;
		diskPct = newDiskPct;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ChirpstackPackage.IO_TRAFFIC_AI_MODULE__DISK_PCT, oldDiskPct, diskPct));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public double getOsLoad1Average() {
		return osLoad1Average;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setOsLoad1Average(double newOsLoad1Average) {
		double oldOsLoad1Average = osLoad1Average;
		osLoad1Average = newOsLoad1Average;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ChirpstackPackage.IO_TRAFFIC_AI_MODULE__OS_LOAD1_AVERAGE, oldOsLoad1Average, osLoad1Average));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public double getOsLoad5Average() {
		return osLoad5Average;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setOsLoad5Average(double newOsLoad5Average) {
		double oldOsLoad5Average = osLoad5Average;
		osLoad5Average = newOsLoad5Average;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ChirpstackPackage.IO_TRAFFIC_AI_MODULE__OS_LOAD5_AVERAGE, oldOsLoad5Average, osLoad5Average));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public double getOsLoad15Average() {
		return osLoad15Average;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setOsLoad15Average(double newOsLoad15Average) {
		double oldOsLoad15Average = osLoad15Average;
		osLoad15Average = newOsLoad15Average;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ChirpstackPackage.IO_TRAFFIC_AI_MODULE__OS_LOAD15_AVERAGE, oldOsLoad15Average, osLoad15Average));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public double getUptimeMinutes() {
		return uptimeMinutes;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setUptimeMinutes(double newUptimeMinutes) {
		double oldUptimeMinutes = uptimeMinutes;
		uptimeMinutes = newUptimeMinutes;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ChirpstackPackage.IO_TRAFFIC_AI_MODULE__UPTIME_MINUTES, oldUptimeMinutes, uptimeMinutes));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public double getUptimeHours() {
		return uptimeHours;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setUptimeHours(double newUptimeHours) {
		double oldUptimeHours = uptimeHours;
		uptimeHours = newUptimeHours;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ChirpstackPackage.IO_TRAFFIC_AI_MODULE__UPTIME_HOURS, oldUptimeHours, uptimeHours));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public double getUptimeDays() {
		return uptimeDays;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setUptimeDays(double newUptimeDays) {
		double oldUptimeDays = uptimeDays;
		uptimeDays = newUptimeDays;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ChirpstackPackage.IO_TRAFFIC_AI_MODULE__UPTIME_DAYS, oldUptimeDays, uptimeDays));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public double getVoltageV() {
		return voltageV;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setVoltageV(double newVoltageV) {
		double oldVoltageV = voltageV;
		voltageV = newVoltageV;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ChirpstackPackage.IO_TRAFFIC_AI_MODULE__VOLTAGE_V, oldVoltageV, voltageV));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public double getVoltageMv() {
		return voltageMv;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setVoltageMv(double newVoltageMv) {
		double oldVoltageMv = voltageMv;
		voltageMv = newVoltageMv;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ChirpstackPackage.IO_TRAFFIC_AI_MODULE__VOLTAGE_MV, oldVoltageMv, voltageMv));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isWifiActive() {
		return wifiActive;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setWifiActive(boolean newWifiActive) {
		boolean oldWifiActive = wifiActive;
		wifiActive = newWifiActive;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ChirpstackPackage.IO_TRAFFIC_AI_MODULE__WIFI_ACTIVE, oldWifiActive, wifiActive));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isEthernetActive() {
		return ethernetActive;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setEthernetActive(boolean newEthernetActive) {
		boolean oldEthernetActive = ethernetActive;
		ethernetActive = newEthernetActive;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ChirpstackPackage.IO_TRAFFIC_AI_MODULE__ETHERNET_ACTIVE, oldEthernetActive, ethernetActive));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public double getNetworkIfStatus() {
		return networkIfStatus;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setNetworkIfStatus(double newNetworkIfStatus) {
		double oldNetworkIfStatus = networkIfStatus;
		networkIfStatus = newNetworkIfStatus;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ChirpstackPackage.IO_TRAFFIC_AI_MODULE__NETWORK_IF_STATUS, oldNetworkIfStatus, networkIfStatus));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public double getErrorCode() {
		return errorCode;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setErrorCode(double newErrorCode) {
		double oldErrorCode = errorCode;
		errorCode = newErrorCode;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ChirpstackPackage.IO_TRAFFIC_AI_MODULE__ERROR_CODE, oldErrorCode, errorCode));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public double getTimestamp() {
		return timestamp;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setTimestamp(double newTimestamp) {
		double oldTimestamp = timestamp;
		timestamp = newTimestamp;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ChirpstackPackage.IO_TRAFFIC_AI_MODULE__TIMESTAMP, oldTimestamp, timestamp));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getTimestampIso() {
		return timestampIso;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setTimestampIso(String newTimestampIso) {
		String oldTimestampIso = timestampIso;
		timestampIso = newTimestampIso;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ChirpstackPackage.IO_TRAFFIC_AI_MODULE__TIMESTAMP_ISO, oldTimestampIso, timestampIso));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case ChirpstackPackage.IO_TRAFFIC_AI_MODULE__CPU_PCT:
				return getCpuPct();
			case ChirpstackPackage.IO_TRAFFIC_AI_MODULE__CPU_TEMP_C:
				return getCpuTempC();
			case ChirpstackPackage.IO_TRAFFIC_AI_MODULE__GPU_TEMP_C:
				return getGpuTempC();
			case ChirpstackPackage.IO_TRAFFIC_AI_MODULE__GPU_USAGE_PCT:
				return getGpuUsagePct();
			case ChirpstackPackage.IO_TRAFFIC_AI_MODULE__RAM_PCT:
				return getRamPct();
			case ChirpstackPackage.IO_TRAFFIC_AI_MODULE__VMEM_PCT:
				return getVmemPct();
			case ChirpstackPackage.IO_TRAFFIC_AI_MODULE__SWAP_PCT:
				return getSwapPct();
			case ChirpstackPackage.IO_TRAFFIC_AI_MODULE__DISK_PCT:
				return getDiskPct();
			case ChirpstackPackage.IO_TRAFFIC_AI_MODULE__OS_LOAD1_AVERAGE:
				return getOsLoad1Average();
			case ChirpstackPackage.IO_TRAFFIC_AI_MODULE__OS_LOAD5_AVERAGE:
				return getOsLoad5Average();
			case ChirpstackPackage.IO_TRAFFIC_AI_MODULE__OS_LOAD15_AVERAGE:
				return getOsLoad15Average();
			case ChirpstackPackage.IO_TRAFFIC_AI_MODULE__UPTIME_MINUTES:
				return getUptimeMinutes();
			case ChirpstackPackage.IO_TRAFFIC_AI_MODULE__UPTIME_HOURS:
				return getUptimeHours();
			case ChirpstackPackage.IO_TRAFFIC_AI_MODULE__UPTIME_DAYS:
				return getUptimeDays();
			case ChirpstackPackage.IO_TRAFFIC_AI_MODULE__VOLTAGE_V:
				return getVoltageV();
			case ChirpstackPackage.IO_TRAFFIC_AI_MODULE__VOLTAGE_MV:
				return getVoltageMv();
			case ChirpstackPackage.IO_TRAFFIC_AI_MODULE__WIFI_ACTIVE:
				return isWifiActive();
			case ChirpstackPackage.IO_TRAFFIC_AI_MODULE__ETHERNET_ACTIVE:
				return isEthernetActive();
			case ChirpstackPackage.IO_TRAFFIC_AI_MODULE__NETWORK_IF_STATUS:
				return getNetworkIfStatus();
			case ChirpstackPackage.IO_TRAFFIC_AI_MODULE__ERROR_CODE:
				return getErrorCode();
			case ChirpstackPackage.IO_TRAFFIC_AI_MODULE__TIMESTAMP:
				return getTimestamp();
			case ChirpstackPackage.IO_TRAFFIC_AI_MODULE__TIMESTAMP_ISO:
				return getTimestampIso();
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
			case ChirpstackPackage.IO_TRAFFIC_AI_MODULE__CPU_PCT:
				setCpuPct((Double)newValue);
				return;
			case ChirpstackPackage.IO_TRAFFIC_AI_MODULE__CPU_TEMP_C:
				setCpuTempC((Double)newValue);
				return;
			case ChirpstackPackage.IO_TRAFFIC_AI_MODULE__GPU_TEMP_C:
				setGpuTempC((Double)newValue);
				return;
			case ChirpstackPackage.IO_TRAFFIC_AI_MODULE__GPU_USAGE_PCT:
				setGpuUsagePct((Double)newValue);
				return;
			case ChirpstackPackage.IO_TRAFFIC_AI_MODULE__RAM_PCT:
				setRamPct((Double)newValue);
				return;
			case ChirpstackPackage.IO_TRAFFIC_AI_MODULE__VMEM_PCT:
				setVmemPct((Double)newValue);
				return;
			case ChirpstackPackage.IO_TRAFFIC_AI_MODULE__SWAP_PCT:
				setSwapPct((Double)newValue);
				return;
			case ChirpstackPackage.IO_TRAFFIC_AI_MODULE__DISK_PCT:
				setDiskPct((Double)newValue);
				return;
			case ChirpstackPackage.IO_TRAFFIC_AI_MODULE__OS_LOAD1_AVERAGE:
				setOsLoad1Average((Double)newValue);
				return;
			case ChirpstackPackage.IO_TRAFFIC_AI_MODULE__OS_LOAD5_AVERAGE:
				setOsLoad5Average((Double)newValue);
				return;
			case ChirpstackPackage.IO_TRAFFIC_AI_MODULE__OS_LOAD15_AVERAGE:
				setOsLoad15Average((Double)newValue);
				return;
			case ChirpstackPackage.IO_TRAFFIC_AI_MODULE__UPTIME_MINUTES:
				setUptimeMinutes((Double)newValue);
				return;
			case ChirpstackPackage.IO_TRAFFIC_AI_MODULE__UPTIME_HOURS:
				setUptimeHours((Double)newValue);
				return;
			case ChirpstackPackage.IO_TRAFFIC_AI_MODULE__UPTIME_DAYS:
				setUptimeDays((Double)newValue);
				return;
			case ChirpstackPackage.IO_TRAFFIC_AI_MODULE__VOLTAGE_V:
				setVoltageV((Double)newValue);
				return;
			case ChirpstackPackage.IO_TRAFFIC_AI_MODULE__VOLTAGE_MV:
				setVoltageMv((Double)newValue);
				return;
			case ChirpstackPackage.IO_TRAFFIC_AI_MODULE__WIFI_ACTIVE:
				setWifiActive((Boolean)newValue);
				return;
			case ChirpstackPackage.IO_TRAFFIC_AI_MODULE__ETHERNET_ACTIVE:
				setEthernetActive((Boolean)newValue);
				return;
			case ChirpstackPackage.IO_TRAFFIC_AI_MODULE__NETWORK_IF_STATUS:
				setNetworkIfStatus((Double)newValue);
				return;
			case ChirpstackPackage.IO_TRAFFIC_AI_MODULE__ERROR_CODE:
				setErrorCode((Double)newValue);
				return;
			case ChirpstackPackage.IO_TRAFFIC_AI_MODULE__TIMESTAMP:
				setTimestamp((Double)newValue);
				return;
			case ChirpstackPackage.IO_TRAFFIC_AI_MODULE__TIMESTAMP_ISO:
				setTimestampIso((String)newValue);
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
			case ChirpstackPackage.IO_TRAFFIC_AI_MODULE__CPU_PCT:
				setCpuPct(CPU_PCT_EDEFAULT);
				return;
			case ChirpstackPackage.IO_TRAFFIC_AI_MODULE__CPU_TEMP_C:
				setCpuTempC(CPU_TEMP_C_EDEFAULT);
				return;
			case ChirpstackPackage.IO_TRAFFIC_AI_MODULE__GPU_TEMP_C:
				setGpuTempC(GPU_TEMP_C_EDEFAULT);
				return;
			case ChirpstackPackage.IO_TRAFFIC_AI_MODULE__GPU_USAGE_PCT:
				setGpuUsagePct(GPU_USAGE_PCT_EDEFAULT);
				return;
			case ChirpstackPackage.IO_TRAFFIC_AI_MODULE__RAM_PCT:
				setRamPct(RAM_PCT_EDEFAULT);
				return;
			case ChirpstackPackage.IO_TRAFFIC_AI_MODULE__VMEM_PCT:
				setVmemPct(VMEM_PCT_EDEFAULT);
				return;
			case ChirpstackPackage.IO_TRAFFIC_AI_MODULE__SWAP_PCT:
				setSwapPct(SWAP_PCT_EDEFAULT);
				return;
			case ChirpstackPackage.IO_TRAFFIC_AI_MODULE__DISK_PCT:
				setDiskPct(DISK_PCT_EDEFAULT);
				return;
			case ChirpstackPackage.IO_TRAFFIC_AI_MODULE__OS_LOAD1_AVERAGE:
				setOsLoad1Average(OS_LOAD1_AVERAGE_EDEFAULT);
				return;
			case ChirpstackPackage.IO_TRAFFIC_AI_MODULE__OS_LOAD5_AVERAGE:
				setOsLoad5Average(OS_LOAD5_AVERAGE_EDEFAULT);
				return;
			case ChirpstackPackage.IO_TRAFFIC_AI_MODULE__OS_LOAD15_AVERAGE:
				setOsLoad15Average(OS_LOAD15_AVERAGE_EDEFAULT);
				return;
			case ChirpstackPackage.IO_TRAFFIC_AI_MODULE__UPTIME_MINUTES:
				setUptimeMinutes(UPTIME_MINUTES_EDEFAULT);
				return;
			case ChirpstackPackage.IO_TRAFFIC_AI_MODULE__UPTIME_HOURS:
				setUptimeHours(UPTIME_HOURS_EDEFAULT);
				return;
			case ChirpstackPackage.IO_TRAFFIC_AI_MODULE__UPTIME_DAYS:
				setUptimeDays(UPTIME_DAYS_EDEFAULT);
				return;
			case ChirpstackPackage.IO_TRAFFIC_AI_MODULE__VOLTAGE_V:
				setVoltageV(VOLTAGE_V_EDEFAULT);
				return;
			case ChirpstackPackage.IO_TRAFFIC_AI_MODULE__VOLTAGE_MV:
				setVoltageMv(VOLTAGE_MV_EDEFAULT);
				return;
			case ChirpstackPackage.IO_TRAFFIC_AI_MODULE__WIFI_ACTIVE:
				setWifiActive(WIFI_ACTIVE_EDEFAULT);
				return;
			case ChirpstackPackage.IO_TRAFFIC_AI_MODULE__ETHERNET_ACTIVE:
				setEthernetActive(ETHERNET_ACTIVE_EDEFAULT);
				return;
			case ChirpstackPackage.IO_TRAFFIC_AI_MODULE__NETWORK_IF_STATUS:
				setNetworkIfStatus(NETWORK_IF_STATUS_EDEFAULT);
				return;
			case ChirpstackPackage.IO_TRAFFIC_AI_MODULE__ERROR_CODE:
				setErrorCode(ERROR_CODE_EDEFAULT);
				return;
			case ChirpstackPackage.IO_TRAFFIC_AI_MODULE__TIMESTAMP:
				setTimestamp(TIMESTAMP_EDEFAULT);
				return;
			case ChirpstackPackage.IO_TRAFFIC_AI_MODULE__TIMESTAMP_ISO:
				setTimestampIso(TIMESTAMP_ISO_EDEFAULT);
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
			case ChirpstackPackage.IO_TRAFFIC_AI_MODULE__CPU_PCT:
				return cpuPct != CPU_PCT_EDEFAULT;
			case ChirpstackPackage.IO_TRAFFIC_AI_MODULE__CPU_TEMP_C:
				return cpuTempC != CPU_TEMP_C_EDEFAULT;
			case ChirpstackPackage.IO_TRAFFIC_AI_MODULE__GPU_TEMP_C:
				return gpuTempC != GPU_TEMP_C_EDEFAULT;
			case ChirpstackPackage.IO_TRAFFIC_AI_MODULE__GPU_USAGE_PCT:
				return gpuUsagePct != GPU_USAGE_PCT_EDEFAULT;
			case ChirpstackPackage.IO_TRAFFIC_AI_MODULE__RAM_PCT:
				return ramPct != RAM_PCT_EDEFAULT;
			case ChirpstackPackage.IO_TRAFFIC_AI_MODULE__VMEM_PCT:
				return vmemPct != VMEM_PCT_EDEFAULT;
			case ChirpstackPackage.IO_TRAFFIC_AI_MODULE__SWAP_PCT:
				return swapPct != SWAP_PCT_EDEFAULT;
			case ChirpstackPackage.IO_TRAFFIC_AI_MODULE__DISK_PCT:
				return diskPct != DISK_PCT_EDEFAULT;
			case ChirpstackPackage.IO_TRAFFIC_AI_MODULE__OS_LOAD1_AVERAGE:
				return osLoad1Average != OS_LOAD1_AVERAGE_EDEFAULT;
			case ChirpstackPackage.IO_TRAFFIC_AI_MODULE__OS_LOAD5_AVERAGE:
				return osLoad5Average != OS_LOAD5_AVERAGE_EDEFAULT;
			case ChirpstackPackage.IO_TRAFFIC_AI_MODULE__OS_LOAD15_AVERAGE:
				return osLoad15Average != OS_LOAD15_AVERAGE_EDEFAULT;
			case ChirpstackPackage.IO_TRAFFIC_AI_MODULE__UPTIME_MINUTES:
				return uptimeMinutes != UPTIME_MINUTES_EDEFAULT;
			case ChirpstackPackage.IO_TRAFFIC_AI_MODULE__UPTIME_HOURS:
				return uptimeHours != UPTIME_HOURS_EDEFAULT;
			case ChirpstackPackage.IO_TRAFFIC_AI_MODULE__UPTIME_DAYS:
				return uptimeDays != UPTIME_DAYS_EDEFAULT;
			case ChirpstackPackage.IO_TRAFFIC_AI_MODULE__VOLTAGE_V:
				return voltageV != VOLTAGE_V_EDEFAULT;
			case ChirpstackPackage.IO_TRAFFIC_AI_MODULE__VOLTAGE_MV:
				return voltageMv != VOLTAGE_MV_EDEFAULT;
			case ChirpstackPackage.IO_TRAFFIC_AI_MODULE__WIFI_ACTIVE:
				return wifiActive != WIFI_ACTIVE_EDEFAULT;
			case ChirpstackPackage.IO_TRAFFIC_AI_MODULE__ETHERNET_ACTIVE:
				return ethernetActive != ETHERNET_ACTIVE_EDEFAULT;
			case ChirpstackPackage.IO_TRAFFIC_AI_MODULE__NETWORK_IF_STATUS:
				return networkIfStatus != NETWORK_IF_STATUS_EDEFAULT;
			case ChirpstackPackage.IO_TRAFFIC_AI_MODULE__ERROR_CODE:
				return errorCode != ERROR_CODE_EDEFAULT;
			case ChirpstackPackage.IO_TRAFFIC_AI_MODULE__TIMESTAMP:
				return timestamp != TIMESTAMP_EDEFAULT;
			case ChirpstackPackage.IO_TRAFFIC_AI_MODULE__TIMESTAMP_ISO:
				return TIMESTAMP_ISO_EDEFAULT == null ? timestampIso != null : !TIMESTAMP_ISO_EDEFAULT.equals(timestampIso);
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
		result.append(" (cpuPct: ");
		result.append(cpuPct);
		result.append(", cpuTempC: ");
		result.append(cpuTempC);
		result.append(", gpuTempC: ");
		result.append(gpuTempC);
		result.append(", gpuUsagePct: ");
		result.append(gpuUsagePct);
		result.append(", ramPct: ");
		result.append(ramPct);
		result.append(", vmemPct: ");
		result.append(vmemPct);
		result.append(", swapPct: ");
		result.append(swapPct);
		result.append(", diskPct: ");
		result.append(diskPct);
		result.append(", osLoad1Average: ");
		result.append(osLoad1Average);
		result.append(", osLoad5Average: ");
		result.append(osLoad5Average);
		result.append(", osLoad15Average: ");
		result.append(osLoad15Average);
		result.append(", uptimeMinutes: ");
		result.append(uptimeMinutes);
		result.append(", uptimeHours: ");
		result.append(uptimeHours);
		result.append(", uptimeDays: ");
		result.append(uptimeDays);
		result.append(", voltageV: ");
		result.append(voltageV);
		result.append(", voltageMv: ");
		result.append(voltageMv);
		result.append(", wifiActive: ");
		result.append(wifiActive);
		result.append(", ethernetActive: ");
		result.append(ethernetActive);
		result.append(", networkIfStatus: ");
		result.append(networkIfStatus);
		result.append(", errorCode: ");
		result.append(errorCode);
		result.append(", timestamp: ");
		result.append(timestamp);
		result.append(", timestampIso: ");
		result.append(timestampIso);
		result.append(')');
		return result.toString();
	}

} //IoTrafficAiModuleImpl
