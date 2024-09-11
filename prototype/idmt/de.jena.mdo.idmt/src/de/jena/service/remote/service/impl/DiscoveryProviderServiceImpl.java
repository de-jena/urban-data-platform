/*
 */
package de.jena.service.remote.service.impl;

import de.jena.service.remote.service.DiscoveryProviderService;
import de.jena.service.remote.service.ServiceDescription;
import de.jena.service.remote.service.ServicePackage;

import java.lang.reflect.InvocationTargetException;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Discovery Provider Service</b></em>'.
 * <!-- end-user-doc -->
 *
 * @generated
 */
public class DiscoveryProviderServiceImpl extends MinimalEObjectImpl.Container implements DiscoveryProviderService {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DiscoveryProviderServiceImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ServicePackage.Literals.DISCOVERY_PROVIDER_SERVICE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void announce(ServiceDescription description) {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eInvoke(int operationID, EList<?> arguments) throws InvocationTargetException {
		switch (operationID) {
			case ServicePackage.DISCOVERY_PROVIDER_SERVICE___ANNOUNCE__SERVICEDESCRIPTION:
				announce((ServiceDescription)arguments.get(0));
				return null;
		}
		return super.eInvoke(operationID, arguments);
	}

} //DiscoveryProviderServiceImpl
