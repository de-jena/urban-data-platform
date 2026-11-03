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

import org.eclipse.sensinact.model.core.provider.Provider;

import org.osgi.annotation.versioning.ProviderType;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Io Traffic</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.jena.chirpstack.model.chirpstack.IoTraffic#getWindow <em>Window</em>}</li>
 *   <li>{@link de.jena.chirpstack.model.chirpstack.IoTraffic#getLine1 <em>Line1</em>}</li>
 *   <li>{@link de.jena.chirpstack.model.chirpstack.IoTraffic#getLine2 <em>Line2</em>}</li>
 *   <li>{@link de.jena.chirpstack.model.chirpstack.IoTraffic#getLine3 <em>Line3</em>}</li>
 *   <li>{@link de.jena.chirpstack.model.chirpstack.IoTraffic#getLine4 <em>Line4</em>}</li>
 *   <li>{@link de.jena.chirpstack.model.chirpstack.IoTraffic#getLine5 <em>Line5</em>}</li>
 *   <li>{@link de.jena.chirpstack.model.chirpstack.IoTraffic#getLine6 <em>Line6</em>}</li>
 *   <li>{@link de.jena.chirpstack.model.chirpstack.IoTraffic#getLine7 <em>Line7</em>}</li>
 *   <li>{@link de.jena.chirpstack.model.chirpstack.IoTraffic#getLine8 <em>Line8</em>}</li>
 *   <li>{@link de.jena.chirpstack.model.chirpstack.IoTraffic#getLine9 <em>Line9</em>}</li>
 *   <li>{@link de.jena.chirpstack.model.chirpstack.IoTraffic#getAiModule <em>Ai Module</em>}</li>
 * </ul>
 *
 * @see de.jena.chirpstack.model.chirpstack.ChirpstackPackage#getIoTraffic()
 * @model annotation="model name='iotec_iotraffic_Camera' profileName='iotec iotraffic Camera' profileId='ef645c43-546c-4594-a0e5-9e0852faf29b'"
 * @generated
 */
@ProviderType
public interface IoTraffic extends Provider {
	/**
	 * Returns the value of the '<em><b>Window</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Window</em>' containment reference.
	 * @see #setWindow(IoTrafficWindow)
	 * @see de.jena.chirpstack.model.chirpstack.ChirpstackPackage#getIoTraffic_Window()
	 * @model containment="true"
	 * @generated
	 */
	IoTrafficWindow getWindow();

	/**
	 * Sets the value of the '{@link de.jena.chirpstack.model.chirpstack.IoTraffic#getWindow <em>Window</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Window</em>' containment reference.
	 * @see #getWindow()
	 * @generated
	 */
	void setWindow(IoTrafficWindow value);

	/**
	 * Returns the value of the '<em><b>Line1</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Line1</em>' containment reference.
	 * @see #setLine1(IoTrafficLine)
	 * @see de.jena.chirpstack.model.chirpstack.ChirpstackPackage#getIoTraffic_Line1()
	 * @model containment="true"
	 *        annotation="mapping collection='object/lines' filter='key=line_1'"
	 * @generated
	 */
	IoTrafficLine getLine1();

	/**
	 * Sets the value of the '{@link de.jena.chirpstack.model.chirpstack.IoTraffic#getLine1 <em>Line1</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Line1</em>' containment reference.
	 * @see #getLine1()
	 * @generated
	 */
	void setLine1(IoTrafficLine value);

	/**
	 * Returns the value of the '<em><b>Line2</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Line2</em>' containment reference.
	 * @see #setLine2(IoTrafficLine)
	 * @see de.jena.chirpstack.model.chirpstack.ChirpstackPackage#getIoTraffic_Line2()
	 * @model containment="true"
	 *        annotation="mapping collection='object/lines' filter='key=line_2'"
	 * @generated
	 */
	IoTrafficLine getLine2();

	/**
	 * Sets the value of the '{@link de.jena.chirpstack.model.chirpstack.IoTraffic#getLine2 <em>Line2</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Line2</em>' containment reference.
	 * @see #getLine2()
	 * @generated
	 */
	void setLine2(IoTrafficLine value);

	/**
	 * Returns the value of the '<em><b>Line3</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Line3</em>' containment reference.
	 * @see #setLine3(IoTrafficLine)
	 * @see de.jena.chirpstack.model.chirpstack.ChirpstackPackage#getIoTraffic_Line3()
	 * @model containment="true"
	 *        annotation="mapping collection='object/lines' filter='key=line_3'"
	 * @generated
	 */
	IoTrafficLine getLine3();

	/**
	 * Sets the value of the '{@link de.jena.chirpstack.model.chirpstack.IoTraffic#getLine3 <em>Line3</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Line3</em>' containment reference.
	 * @see #getLine3()
	 * @generated
	 */
	void setLine3(IoTrafficLine value);

	/**
	 * Returns the value of the '<em><b>Line4</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Line4</em>' containment reference.
	 * @see #setLine4(IoTrafficLine)
	 * @see de.jena.chirpstack.model.chirpstack.ChirpstackPackage#getIoTraffic_Line4()
	 * @model containment="true"
	 *        annotation="mapping collection='object/lines' filter='key=line_4'"
	 * @generated
	 */
	IoTrafficLine getLine4();

	/**
	 * Sets the value of the '{@link de.jena.chirpstack.model.chirpstack.IoTraffic#getLine4 <em>Line4</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Line4</em>' containment reference.
	 * @see #getLine4()
	 * @generated
	 */
	void setLine4(IoTrafficLine value);

	/**
	 * Returns the value of the '<em><b>Line5</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Line5</em>' containment reference.
	 * @see #setLine5(IoTrafficLine)
	 * @see de.jena.chirpstack.model.chirpstack.ChirpstackPackage#getIoTraffic_Line5()
	 * @model containment="true"
	 *        annotation="mapping collection='object/lines' filter='key=line_5'"
	 * @generated
	 */
	IoTrafficLine getLine5();

	/**
	 * Sets the value of the '{@link de.jena.chirpstack.model.chirpstack.IoTraffic#getLine5 <em>Line5</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Line5</em>' containment reference.
	 * @see #getLine5()
	 * @generated
	 */
	void setLine5(IoTrafficLine value);

	/**
	 * Returns the value of the '<em><b>Line6</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Line6</em>' containment reference.
	 * @see #setLine6(IoTrafficLine)
	 * @see de.jena.chirpstack.model.chirpstack.ChirpstackPackage#getIoTraffic_Line6()
	 * @model containment="true"
	 *        annotation="mapping collection='object/lines' filter='key=line_6'"
	 * @generated
	 */
	IoTrafficLine getLine6();

	/**
	 * Sets the value of the '{@link de.jena.chirpstack.model.chirpstack.IoTraffic#getLine6 <em>Line6</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Line6</em>' containment reference.
	 * @see #getLine6()
	 * @generated
	 */
	void setLine6(IoTrafficLine value);

	/**
	 * Returns the value of the '<em><b>Line7</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Line7</em>' containment reference.
	 * @see #setLine7(IoTrafficLine)
	 * @see de.jena.chirpstack.model.chirpstack.ChirpstackPackage#getIoTraffic_Line7()
	 * @model containment="true"
	 *        annotation="mapping collection='object/lines' filter='key=line_7'"
	 * @generated
	 */
	IoTrafficLine getLine7();

	/**
	 * Sets the value of the '{@link de.jena.chirpstack.model.chirpstack.IoTraffic#getLine7 <em>Line7</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Line7</em>' containment reference.
	 * @see #getLine7()
	 * @generated
	 */
	void setLine7(IoTrafficLine value);

	/**
	 * Returns the value of the '<em><b>Line8</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Line8</em>' containment reference.
	 * @see #setLine8(IoTrafficLine)
	 * @see de.jena.chirpstack.model.chirpstack.ChirpstackPackage#getIoTraffic_Line8()
	 * @model containment="true"
	 *        annotation="mapping collection='object/lines' filter='key=line_8'"
	 * @generated
	 */
	IoTrafficLine getLine8();

	/**
	 * Sets the value of the '{@link de.jena.chirpstack.model.chirpstack.IoTraffic#getLine8 <em>Line8</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Line8</em>' containment reference.
	 * @see #getLine8()
	 * @generated
	 */
	void setLine8(IoTrafficLine value);

	/**
	 * Returns the value of the '<em><b>Line9</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Line9</em>' containment reference.
	 * @see #setLine9(IoTrafficLine)
	 * @see de.jena.chirpstack.model.chirpstack.ChirpstackPackage#getIoTraffic_Line9()
	 * @model containment="true"
	 *        annotation="mapping collection='object/lines' filter='key=line_9'"
	 * @generated
	 */
	IoTrafficLine getLine9();

	/**
	 * Sets the value of the '{@link de.jena.chirpstack.model.chirpstack.IoTraffic#getLine9 <em>Line9</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Line9</em>' containment reference.
	 * @see #getLine9()
	 * @generated
	 */
	void setLine9(IoTrafficLine value);

	/**
	 * Returns the value of the '<em><b>Ai Module</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Ai Module</em>' containment reference.
	 * @see #setAiModule(IoTrafficAiModule)
	 * @see de.jena.chirpstack.model.chirpstack.ChirpstackPackage#getIoTraffic_AiModule()
	 * @model containment="true"
	 * @generated
	 */
	IoTrafficAiModule getAiModule();

	/**
	 * Sets the value of the '{@link de.jena.chirpstack.model.chirpstack.IoTraffic#getAiModule <em>Ai Module</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Ai Module</em>' containment reference.
	 * @see #getAiModule()
	 * @generated
	 */
	void setAiModule(IoTrafficAiModule value);

} // IoTraffic
