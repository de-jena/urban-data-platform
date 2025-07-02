/*
 */
package org.eclipse.fennec.model.sensinact.weatherprovider.impl;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.fennec.model.sensinact.weatherprovider.Station;
import org.eclipse.fennec.model.sensinact.weatherprovider.WeatherPackage;

import org.eclipse.sensinact.model.core.provider.impl.AdminImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Station</b></em>'.
 * <!-- end-user-doc -->
 *
 * @generated
 */
public class StationImpl extends AdminImpl implements Station {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected StationImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return WeatherPackage.Literals.STATION;
	}

} //StationImpl
