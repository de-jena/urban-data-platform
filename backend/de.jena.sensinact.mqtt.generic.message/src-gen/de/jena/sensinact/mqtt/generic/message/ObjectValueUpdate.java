/*
 * Copyright (c) 2012 - 2024 Data In Motion and others.
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
package de.jena.sensinact.mqtt.generic.message;

import org.osgi.annotation.versioning.ProviderType;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Object Value Update</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.jena.sensinact.mqtt.generic.message.ObjectValueUpdate#getOldValue <em>Old Value</em>}</li>
 *   <li>{@link de.jena.sensinact.mqtt.generic.message.ObjectValueUpdate#getNewValue <em>New Value</em>}</li>
 * </ul>
 *
 * @see de.jena.sensinact.mqtt.generic.message.MessagePackage#getObjectValueUpdate()
 * @model
 * @generated
 */
@ProviderType
public interface ObjectValueUpdate extends UpdateMessage {
	/**
	 * Returns the value of the '<em><b>Old Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Old Value</em>' attribute.
	 * @see #setOldValue(Object)
	 * @see de.jena.sensinact.mqtt.generic.message.MessagePackage#getObjectValueUpdate_OldValue()
	 * @model
	 * @generated
	 */
	Object getOldValue();

	/**
	 * Sets the value of the '{@link de.jena.sensinact.mqtt.generic.message.ObjectValueUpdate#getOldValue <em>Old Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Old Value</em>' attribute.
	 * @see #getOldValue()
	 * @generated
	 */
	void setOldValue(Object value);

	/**
	 * Returns the value of the '<em><b>New Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>New Value</em>' attribute.
	 * @see #setNewValue(Object)
	 * @see de.jena.sensinact.mqtt.generic.message.MessagePackage#getObjectValueUpdate_NewValue()
	 * @model
	 * @generated
	 */
	Object getNewValue();

	/**
	 * Sets the value of the '{@link de.jena.sensinact.mqtt.generic.message.ObjectValueUpdate#getNewValue <em>New Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>New Value</em>' attribute.
	 * @see #getNewValue()
	 * @generated
	 */
	void setNewValue(Object value);

} // ObjectValueUpdate
