/*
 */
package de.jena.service.remote.service.impl;

import de.jena.service.remote.service.DiscoveryConsumerService;
import de.jena.service.remote.service.ServiceDescription;
import de.jena.service.remote.service.ServicePackage;

import java.lang.reflect.InvocationTargetException;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Discovery Consumer Service</b></em>'.
 * <!-- end-user-doc -->
 *
 * @generated
 */
public class DiscoveryConsumerServiceImpl extends MinimalEObjectImpl.Container implements DiscoveryConsumerService {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DiscoveryConsumerServiceImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ServicePackage.Literals.DISCOVERY_CONSUMER_SERVICE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void onServiceAnnounced(ServiceDescription description) {
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
			case ServicePackage.DISCOVERY_CONSUMER_SERVICE___ON_SERVICE_ANNOUNCED__SERVICEDESCRIPTION:
				onServiceAnnounced((ServiceDescription)arguments.get(0));
				return null;
		}
		return super.eInvoke(operationID, arguments);
	}

} //DiscoveryConsumerServiceImpl
