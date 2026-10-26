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
import de.jena.chirpstack.model.chirpstack.IoTrafficLine;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.sensinact.model.core.provider.impl.ServiceImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Io Traffic Line</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link de.jena.chirpstack.model.chirpstack.impl.IoTrafficLineImpl#getLineNumber <em>Line Number</em>}</li>
 *   <li>{@link de.jena.chirpstack.model.chirpstack.impl.IoTrafficLineImpl#getPerson <em>Person</em>}</li>
 *   <li>{@link de.jena.chirpstack.model.chirpstack.impl.IoTrafficLineImpl#getBicycle <em>Bicycle</em>}</li>
 *   <li>{@link de.jena.chirpstack.model.chirpstack.impl.IoTrafficLineImpl#getCar <em>Car</em>}</li>
 *   <li>{@link de.jena.chirpstack.model.chirpstack.impl.IoTrafficLineImpl#getBus <em>Bus</em>}</li>
 *   <li>{@link de.jena.chirpstack.model.chirpstack.impl.IoTrafficLineImpl#getTruck <em>Truck</em>}</li>
 *   <li>{@link de.jena.chirpstack.model.chirpstack.impl.IoTrafficLineImpl#getMotorbike <em>Motorbike</em>}</li>
 *   <li>{@link de.jena.chirpstack.model.chirpstack.impl.IoTrafficLineImpl#getTrain <em>Train</em>}</li>
 *   <li>{@link de.jena.chirpstack.model.chirpstack.impl.IoTrafficLineImpl#getTotal <em>Total</em>}</li>
 * </ul>
 *
 * @generated
 */
public class IoTrafficLineImpl extends ServiceImpl implements IoTrafficLine {
	/**
	 * The default value of the '{@link #getLineNumber() <em>Line Number</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLineNumber()
	 * @generated
	 * @ordered
	 */
	protected static final double LINE_NUMBER_EDEFAULT = 0.0;

	/**
	 * The cached value of the '{@link #getLineNumber() <em>Line Number</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLineNumber()
	 * @generated
	 * @ordered
	 */
	protected double lineNumber = LINE_NUMBER_EDEFAULT;

	/**
	 * The default value of the '{@link #getPerson() <em>Person</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPerson()
	 * @generated
	 * @ordered
	 */
	protected static final double PERSON_EDEFAULT = 0.0;

	/**
	 * The cached value of the '{@link #getPerson() <em>Person</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPerson()
	 * @generated
	 * @ordered
	 */
	protected double person = PERSON_EDEFAULT;

	/**
	 * The default value of the '{@link #getBicycle() <em>Bicycle</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBicycle()
	 * @generated
	 * @ordered
	 */
	protected static final double BICYCLE_EDEFAULT = 0.0;

	/**
	 * The cached value of the '{@link #getBicycle() <em>Bicycle</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBicycle()
	 * @generated
	 * @ordered
	 */
	protected double bicycle = BICYCLE_EDEFAULT;

	/**
	 * The default value of the '{@link #getCar() <em>Car</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCar()
	 * @generated
	 * @ordered
	 */
	protected static final double CAR_EDEFAULT = 0.0;

	/**
	 * The cached value of the '{@link #getCar() <em>Car</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCar()
	 * @generated
	 * @ordered
	 */
	protected double car = CAR_EDEFAULT;

	/**
	 * The default value of the '{@link #getBus() <em>Bus</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBus()
	 * @generated
	 * @ordered
	 */
	protected static final double BUS_EDEFAULT = 0.0;

	/**
	 * The cached value of the '{@link #getBus() <em>Bus</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBus()
	 * @generated
	 * @ordered
	 */
	protected double bus = BUS_EDEFAULT;

	/**
	 * The default value of the '{@link #getTruck() <em>Truck</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTruck()
	 * @generated
	 * @ordered
	 */
	protected static final double TRUCK_EDEFAULT = 0.0;

	/**
	 * The cached value of the '{@link #getTruck() <em>Truck</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTruck()
	 * @generated
	 * @ordered
	 */
	protected double truck = TRUCK_EDEFAULT;

	/**
	 * The default value of the '{@link #getMotorbike() <em>Motorbike</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMotorbike()
	 * @generated
	 * @ordered
	 */
	protected static final double MOTORBIKE_EDEFAULT = 0.0;

	/**
	 * The cached value of the '{@link #getMotorbike() <em>Motorbike</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMotorbike()
	 * @generated
	 * @ordered
	 */
	protected double motorbike = MOTORBIKE_EDEFAULT;

	/**
	 * The default value of the '{@link #getTrain() <em>Train</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTrain()
	 * @generated
	 * @ordered
	 */
	protected static final double TRAIN_EDEFAULT = 0.0;

	/**
	 * The cached value of the '{@link #getTrain() <em>Train</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTrain()
	 * @generated
	 * @ordered
	 */
	protected double train = TRAIN_EDEFAULT;

	/**
	 * The default value of the '{@link #getTotal() <em>Total</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTotal()
	 * @generated
	 * @ordered
	 */
	protected static final double TOTAL_EDEFAULT = 0.0;

	/**
	 * The cached value of the '{@link #getTotal() <em>Total</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTotal()
	 * @generated
	 * @ordered
	 */
	protected double total = TOTAL_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected IoTrafficLineImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ChirpstackPackage.Literals.IO_TRAFFIC_LINE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public double getLineNumber() {
		return lineNumber;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setLineNumber(double newLineNumber) {
		double oldLineNumber = lineNumber;
		lineNumber = newLineNumber;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ChirpstackPackage.IO_TRAFFIC_LINE__LINE_NUMBER, oldLineNumber, lineNumber));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public double getPerson() {
		return person;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setPerson(double newPerson) {
		double oldPerson = person;
		person = newPerson;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ChirpstackPackage.IO_TRAFFIC_LINE__PERSON, oldPerson, person));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public double getBicycle() {
		return bicycle;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setBicycle(double newBicycle) {
		double oldBicycle = bicycle;
		bicycle = newBicycle;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ChirpstackPackage.IO_TRAFFIC_LINE__BICYCLE, oldBicycle, bicycle));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public double getCar() {
		return car;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setCar(double newCar) {
		double oldCar = car;
		car = newCar;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ChirpstackPackage.IO_TRAFFIC_LINE__CAR, oldCar, car));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public double getBus() {
		return bus;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setBus(double newBus) {
		double oldBus = bus;
		bus = newBus;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ChirpstackPackage.IO_TRAFFIC_LINE__BUS, oldBus, bus));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public double getTruck() {
		return truck;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setTruck(double newTruck) {
		double oldTruck = truck;
		truck = newTruck;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ChirpstackPackage.IO_TRAFFIC_LINE__TRUCK, oldTruck, truck));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public double getMotorbike() {
		return motorbike;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setMotorbike(double newMotorbike) {
		double oldMotorbike = motorbike;
		motorbike = newMotorbike;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ChirpstackPackage.IO_TRAFFIC_LINE__MOTORBIKE, oldMotorbike, motorbike));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public double getTrain() {
		return train;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setTrain(double newTrain) {
		double oldTrain = train;
		train = newTrain;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ChirpstackPackage.IO_TRAFFIC_LINE__TRAIN, oldTrain, train));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public double getTotal() {
		return total;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setTotal(double newTotal) {
		double oldTotal = total;
		total = newTotal;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ChirpstackPackage.IO_TRAFFIC_LINE__TOTAL, oldTotal, total));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case ChirpstackPackage.IO_TRAFFIC_LINE__LINE_NUMBER:
				return getLineNumber();
			case ChirpstackPackage.IO_TRAFFIC_LINE__PERSON:
				return getPerson();
			case ChirpstackPackage.IO_TRAFFIC_LINE__BICYCLE:
				return getBicycle();
			case ChirpstackPackage.IO_TRAFFIC_LINE__CAR:
				return getCar();
			case ChirpstackPackage.IO_TRAFFIC_LINE__BUS:
				return getBus();
			case ChirpstackPackage.IO_TRAFFIC_LINE__TRUCK:
				return getTruck();
			case ChirpstackPackage.IO_TRAFFIC_LINE__MOTORBIKE:
				return getMotorbike();
			case ChirpstackPackage.IO_TRAFFIC_LINE__TRAIN:
				return getTrain();
			case ChirpstackPackage.IO_TRAFFIC_LINE__TOTAL:
				return getTotal();
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
			case ChirpstackPackage.IO_TRAFFIC_LINE__LINE_NUMBER:
				setLineNumber((Double)newValue);
				return;
			case ChirpstackPackage.IO_TRAFFIC_LINE__PERSON:
				setPerson((Double)newValue);
				return;
			case ChirpstackPackage.IO_TRAFFIC_LINE__BICYCLE:
				setBicycle((Double)newValue);
				return;
			case ChirpstackPackage.IO_TRAFFIC_LINE__CAR:
				setCar((Double)newValue);
				return;
			case ChirpstackPackage.IO_TRAFFIC_LINE__BUS:
				setBus((Double)newValue);
				return;
			case ChirpstackPackage.IO_TRAFFIC_LINE__TRUCK:
				setTruck((Double)newValue);
				return;
			case ChirpstackPackage.IO_TRAFFIC_LINE__MOTORBIKE:
				setMotorbike((Double)newValue);
				return;
			case ChirpstackPackage.IO_TRAFFIC_LINE__TRAIN:
				setTrain((Double)newValue);
				return;
			case ChirpstackPackage.IO_TRAFFIC_LINE__TOTAL:
				setTotal((Double)newValue);
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
			case ChirpstackPackage.IO_TRAFFIC_LINE__LINE_NUMBER:
				setLineNumber(LINE_NUMBER_EDEFAULT);
				return;
			case ChirpstackPackage.IO_TRAFFIC_LINE__PERSON:
				setPerson(PERSON_EDEFAULT);
				return;
			case ChirpstackPackage.IO_TRAFFIC_LINE__BICYCLE:
				setBicycle(BICYCLE_EDEFAULT);
				return;
			case ChirpstackPackage.IO_TRAFFIC_LINE__CAR:
				setCar(CAR_EDEFAULT);
				return;
			case ChirpstackPackage.IO_TRAFFIC_LINE__BUS:
				setBus(BUS_EDEFAULT);
				return;
			case ChirpstackPackage.IO_TRAFFIC_LINE__TRUCK:
				setTruck(TRUCK_EDEFAULT);
				return;
			case ChirpstackPackage.IO_TRAFFIC_LINE__MOTORBIKE:
				setMotorbike(MOTORBIKE_EDEFAULT);
				return;
			case ChirpstackPackage.IO_TRAFFIC_LINE__TRAIN:
				setTrain(TRAIN_EDEFAULT);
				return;
			case ChirpstackPackage.IO_TRAFFIC_LINE__TOTAL:
				setTotal(TOTAL_EDEFAULT);
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
			case ChirpstackPackage.IO_TRAFFIC_LINE__LINE_NUMBER:
				return lineNumber != LINE_NUMBER_EDEFAULT;
			case ChirpstackPackage.IO_TRAFFIC_LINE__PERSON:
				return person != PERSON_EDEFAULT;
			case ChirpstackPackage.IO_TRAFFIC_LINE__BICYCLE:
				return bicycle != BICYCLE_EDEFAULT;
			case ChirpstackPackage.IO_TRAFFIC_LINE__CAR:
				return car != CAR_EDEFAULT;
			case ChirpstackPackage.IO_TRAFFIC_LINE__BUS:
				return bus != BUS_EDEFAULT;
			case ChirpstackPackage.IO_TRAFFIC_LINE__TRUCK:
				return truck != TRUCK_EDEFAULT;
			case ChirpstackPackage.IO_TRAFFIC_LINE__MOTORBIKE:
				return motorbike != MOTORBIKE_EDEFAULT;
			case ChirpstackPackage.IO_TRAFFIC_LINE__TRAIN:
				return train != TRAIN_EDEFAULT;
			case ChirpstackPackage.IO_TRAFFIC_LINE__TOTAL:
				return total != TOTAL_EDEFAULT;
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
		result.append(" (lineNumber: ");
		result.append(lineNumber);
		result.append(", person: ");
		result.append(person);
		result.append(", bicycle: ");
		result.append(bicycle);
		result.append(", car: ");
		result.append(car);
		result.append(", bus: ");
		result.append(bus);
		result.append(", truck: ");
		result.append(truck);
		result.append(", motorbike: ");
		result.append(motorbike);
		result.append(", train: ");
		result.append(train);
		result.append(", total: ");
		result.append(total);
		result.append(')');
		return result.toString();
	}

} //IoTrafficLineImpl
