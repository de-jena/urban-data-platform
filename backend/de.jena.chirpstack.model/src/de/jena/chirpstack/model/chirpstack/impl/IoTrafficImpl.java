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
import de.jena.chirpstack.model.chirpstack.IoTraffic;
import de.jena.chirpstack.model.chirpstack.IoTrafficAiModule;
import de.jena.chirpstack.model.chirpstack.IoTrafficLine;
import de.jena.chirpstack.model.chirpstack.IoTrafficWindow;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.sensinact.model.core.provider.impl.ProviderImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Io Traffic</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link de.jena.chirpstack.model.chirpstack.impl.IoTrafficImpl#getWindow <em>Window</em>}</li>
 *   <li>{@link de.jena.chirpstack.model.chirpstack.impl.IoTrafficImpl#getLine1 <em>Line1</em>}</li>
 *   <li>{@link de.jena.chirpstack.model.chirpstack.impl.IoTrafficImpl#getLine2 <em>Line2</em>}</li>
 *   <li>{@link de.jena.chirpstack.model.chirpstack.impl.IoTrafficImpl#getLine3 <em>Line3</em>}</li>
 *   <li>{@link de.jena.chirpstack.model.chirpstack.impl.IoTrafficImpl#getLine4 <em>Line4</em>}</li>
 *   <li>{@link de.jena.chirpstack.model.chirpstack.impl.IoTrafficImpl#getLine5 <em>Line5</em>}</li>
 *   <li>{@link de.jena.chirpstack.model.chirpstack.impl.IoTrafficImpl#getLine6 <em>Line6</em>}</li>
 *   <li>{@link de.jena.chirpstack.model.chirpstack.impl.IoTrafficImpl#getLine7 <em>Line7</em>}</li>
 *   <li>{@link de.jena.chirpstack.model.chirpstack.impl.IoTrafficImpl#getLine8 <em>Line8</em>}</li>
 *   <li>{@link de.jena.chirpstack.model.chirpstack.impl.IoTrafficImpl#getLine9 <em>Line9</em>}</li>
 *   <li>{@link de.jena.chirpstack.model.chirpstack.impl.IoTrafficImpl#getAiModule <em>Ai Module</em>}</li>
 * </ul>
 *
 * @generated
 */
public class IoTrafficImpl extends ProviderImpl implements IoTraffic {
	/**
	 * The cached value of the '{@link #getWindow() <em>Window</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWindow()
	 * @generated
	 * @ordered
	 */
	protected IoTrafficWindow window;

	/**
	 * The cached value of the '{@link #getLine1() <em>Line1</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLine1()
	 * @generated
	 * @ordered
	 */
	protected IoTrafficLine line1;

	/**
	 * The cached value of the '{@link #getLine2() <em>Line2</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLine2()
	 * @generated
	 * @ordered
	 */
	protected IoTrafficLine line2;

	/**
	 * The cached value of the '{@link #getLine3() <em>Line3</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLine3()
	 * @generated
	 * @ordered
	 */
	protected IoTrafficLine line3;

	/**
	 * The cached value of the '{@link #getLine4() <em>Line4</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLine4()
	 * @generated
	 * @ordered
	 */
	protected IoTrafficLine line4;

	/**
	 * The cached value of the '{@link #getLine5() <em>Line5</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLine5()
	 * @generated
	 * @ordered
	 */
	protected IoTrafficLine line5;

	/**
	 * The cached value of the '{@link #getLine6() <em>Line6</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLine6()
	 * @generated
	 * @ordered
	 */
	protected IoTrafficLine line6;

	/**
	 * The cached value of the '{@link #getLine7() <em>Line7</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLine7()
	 * @generated
	 * @ordered
	 */
	protected IoTrafficLine line7;

	/**
	 * The cached value of the '{@link #getLine8() <em>Line8</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLine8()
	 * @generated
	 * @ordered
	 */
	protected IoTrafficLine line8;

	/**
	 * The cached value of the '{@link #getLine9() <em>Line9</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLine9()
	 * @generated
	 * @ordered
	 */
	protected IoTrafficLine line9;

	/**
	 * The cached value of the '{@link #getAiModule() <em>Ai Module</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAiModule()
	 * @generated
	 * @ordered
	 */
	protected IoTrafficAiModule aiModule;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected IoTrafficImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ChirpstackPackage.Literals.IO_TRAFFIC;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public IoTrafficWindow getWindow() {
		return window;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetWindow(IoTrafficWindow newWindow, NotificationChain msgs) {
		IoTrafficWindow oldWindow = window;
		window = newWindow;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ChirpstackPackage.IO_TRAFFIC__WINDOW, oldWindow, newWindow);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setWindow(IoTrafficWindow newWindow) {
		if (newWindow != window) {
			NotificationChain msgs = null;
			if (window != null)
				msgs = ((InternalEObject)window).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ChirpstackPackage.IO_TRAFFIC__WINDOW, null, msgs);
			if (newWindow != null)
				msgs = ((InternalEObject)newWindow).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ChirpstackPackage.IO_TRAFFIC__WINDOW, null, msgs);
			msgs = basicSetWindow(newWindow, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ChirpstackPackage.IO_TRAFFIC__WINDOW, newWindow, newWindow));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public IoTrafficLine getLine1() {
		return line1;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetLine1(IoTrafficLine newLine1, NotificationChain msgs) {
		IoTrafficLine oldLine1 = line1;
		line1 = newLine1;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ChirpstackPackage.IO_TRAFFIC__LINE1, oldLine1, newLine1);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setLine1(IoTrafficLine newLine1) {
		if (newLine1 != line1) {
			NotificationChain msgs = null;
			if (line1 != null)
				msgs = ((InternalEObject)line1).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ChirpstackPackage.IO_TRAFFIC__LINE1, null, msgs);
			if (newLine1 != null)
				msgs = ((InternalEObject)newLine1).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ChirpstackPackage.IO_TRAFFIC__LINE1, null, msgs);
			msgs = basicSetLine1(newLine1, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ChirpstackPackage.IO_TRAFFIC__LINE1, newLine1, newLine1));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public IoTrafficLine getLine2() {
		return line2;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetLine2(IoTrafficLine newLine2, NotificationChain msgs) {
		IoTrafficLine oldLine2 = line2;
		line2 = newLine2;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ChirpstackPackage.IO_TRAFFIC__LINE2, oldLine2, newLine2);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setLine2(IoTrafficLine newLine2) {
		if (newLine2 != line2) {
			NotificationChain msgs = null;
			if (line2 != null)
				msgs = ((InternalEObject)line2).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ChirpstackPackage.IO_TRAFFIC__LINE2, null, msgs);
			if (newLine2 != null)
				msgs = ((InternalEObject)newLine2).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ChirpstackPackage.IO_TRAFFIC__LINE2, null, msgs);
			msgs = basicSetLine2(newLine2, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ChirpstackPackage.IO_TRAFFIC__LINE2, newLine2, newLine2));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public IoTrafficLine getLine3() {
		return line3;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetLine3(IoTrafficLine newLine3, NotificationChain msgs) {
		IoTrafficLine oldLine3 = line3;
		line3 = newLine3;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ChirpstackPackage.IO_TRAFFIC__LINE3, oldLine3, newLine3);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setLine3(IoTrafficLine newLine3) {
		if (newLine3 != line3) {
			NotificationChain msgs = null;
			if (line3 != null)
				msgs = ((InternalEObject)line3).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ChirpstackPackage.IO_TRAFFIC__LINE3, null, msgs);
			if (newLine3 != null)
				msgs = ((InternalEObject)newLine3).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ChirpstackPackage.IO_TRAFFIC__LINE3, null, msgs);
			msgs = basicSetLine3(newLine3, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ChirpstackPackage.IO_TRAFFIC__LINE3, newLine3, newLine3));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public IoTrafficLine getLine4() {
		return line4;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetLine4(IoTrafficLine newLine4, NotificationChain msgs) {
		IoTrafficLine oldLine4 = line4;
		line4 = newLine4;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ChirpstackPackage.IO_TRAFFIC__LINE4, oldLine4, newLine4);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setLine4(IoTrafficLine newLine4) {
		if (newLine4 != line4) {
			NotificationChain msgs = null;
			if (line4 != null)
				msgs = ((InternalEObject)line4).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ChirpstackPackage.IO_TRAFFIC__LINE4, null, msgs);
			if (newLine4 != null)
				msgs = ((InternalEObject)newLine4).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ChirpstackPackage.IO_TRAFFIC__LINE4, null, msgs);
			msgs = basicSetLine4(newLine4, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ChirpstackPackage.IO_TRAFFIC__LINE4, newLine4, newLine4));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public IoTrafficLine getLine5() {
		return line5;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetLine5(IoTrafficLine newLine5, NotificationChain msgs) {
		IoTrafficLine oldLine5 = line5;
		line5 = newLine5;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ChirpstackPackage.IO_TRAFFIC__LINE5, oldLine5, newLine5);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setLine5(IoTrafficLine newLine5) {
		if (newLine5 != line5) {
			NotificationChain msgs = null;
			if (line5 != null)
				msgs = ((InternalEObject)line5).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ChirpstackPackage.IO_TRAFFIC__LINE5, null, msgs);
			if (newLine5 != null)
				msgs = ((InternalEObject)newLine5).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ChirpstackPackage.IO_TRAFFIC__LINE5, null, msgs);
			msgs = basicSetLine5(newLine5, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ChirpstackPackage.IO_TRAFFIC__LINE5, newLine5, newLine5));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public IoTrafficLine getLine6() {
		return line6;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetLine6(IoTrafficLine newLine6, NotificationChain msgs) {
		IoTrafficLine oldLine6 = line6;
		line6 = newLine6;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ChirpstackPackage.IO_TRAFFIC__LINE6, oldLine6, newLine6);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setLine6(IoTrafficLine newLine6) {
		if (newLine6 != line6) {
			NotificationChain msgs = null;
			if (line6 != null)
				msgs = ((InternalEObject)line6).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ChirpstackPackage.IO_TRAFFIC__LINE6, null, msgs);
			if (newLine6 != null)
				msgs = ((InternalEObject)newLine6).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ChirpstackPackage.IO_TRAFFIC__LINE6, null, msgs);
			msgs = basicSetLine6(newLine6, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ChirpstackPackage.IO_TRAFFIC__LINE6, newLine6, newLine6));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public IoTrafficLine getLine7() {
		return line7;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetLine7(IoTrafficLine newLine7, NotificationChain msgs) {
		IoTrafficLine oldLine7 = line7;
		line7 = newLine7;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ChirpstackPackage.IO_TRAFFIC__LINE7, oldLine7, newLine7);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setLine7(IoTrafficLine newLine7) {
		if (newLine7 != line7) {
			NotificationChain msgs = null;
			if (line7 != null)
				msgs = ((InternalEObject)line7).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ChirpstackPackage.IO_TRAFFIC__LINE7, null, msgs);
			if (newLine7 != null)
				msgs = ((InternalEObject)newLine7).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ChirpstackPackage.IO_TRAFFIC__LINE7, null, msgs);
			msgs = basicSetLine7(newLine7, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ChirpstackPackage.IO_TRAFFIC__LINE7, newLine7, newLine7));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public IoTrafficLine getLine8() {
		return line8;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetLine8(IoTrafficLine newLine8, NotificationChain msgs) {
		IoTrafficLine oldLine8 = line8;
		line8 = newLine8;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ChirpstackPackage.IO_TRAFFIC__LINE8, oldLine8, newLine8);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setLine8(IoTrafficLine newLine8) {
		if (newLine8 != line8) {
			NotificationChain msgs = null;
			if (line8 != null)
				msgs = ((InternalEObject)line8).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ChirpstackPackage.IO_TRAFFIC__LINE8, null, msgs);
			if (newLine8 != null)
				msgs = ((InternalEObject)newLine8).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ChirpstackPackage.IO_TRAFFIC__LINE8, null, msgs);
			msgs = basicSetLine8(newLine8, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ChirpstackPackage.IO_TRAFFIC__LINE8, newLine8, newLine8));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public IoTrafficLine getLine9() {
		return line9;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetLine9(IoTrafficLine newLine9, NotificationChain msgs) {
		IoTrafficLine oldLine9 = line9;
		line9 = newLine9;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ChirpstackPackage.IO_TRAFFIC__LINE9, oldLine9, newLine9);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setLine9(IoTrafficLine newLine9) {
		if (newLine9 != line9) {
			NotificationChain msgs = null;
			if (line9 != null)
				msgs = ((InternalEObject)line9).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ChirpstackPackage.IO_TRAFFIC__LINE9, null, msgs);
			if (newLine9 != null)
				msgs = ((InternalEObject)newLine9).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ChirpstackPackage.IO_TRAFFIC__LINE9, null, msgs);
			msgs = basicSetLine9(newLine9, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ChirpstackPackage.IO_TRAFFIC__LINE9, newLine9, newLine9));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public IoTrafficAiModule getAiModule() {
		return aiModule;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetAiModule(IoTrafficAiModule newAiModule, NotificationChain msgs) {
		IoTrafficAiModule oldAiModule = aiModule;
		aiModule = newAiModule;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ChirpstackPackage.IO_TRAFFIC__AI_MODULE, oldAiModule, newAiModule);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setAiModule(IoTrafficAiModule newAiModule) {
		if (newAiModule != aiModule) {
			NotificationChain msgs = null;
			if (aiModule != null)
				msgs = ((InternalEObject)aiModule).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ChirpstackPackage.IO_TRAFFIC__AI_MODULE, null, msgs);
			if (newAiModule != null)
				msgs = ((InternalEObject)newAiModule).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ChirpstackPackage.IO_TRAFFIC__AI_MODULE, null, msgs);
			msgs = basicSetAiModule(newAiModule, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ChirpstackPackage.IO_TRAFFIC__AI_MODULE, newAiModule, newAiModule));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ChirpstackPackage.IO_TRAFFIC__WINDOW:
				return basicSetWindow(null, msgs);
			case ChirpstackPackage.IO_TRAFFIC__LINE1:
				return basicSetLine1(null, msgs);
			case ChirpstackPackage.IO_TRAFFIC__LINE2:
				return basicSetLine2(null, msgs);
			case ChirpstackPackage.IO_TRAFFIC__LINE3:
				return basicSetLine3(null, msgs);
			case ChirpstackPackage.IO_TRAFFIC__LINE4:
				return basicSetLine4(null, msgs);
			case ChirpstackPackage.IO_TRAFFIC__LINE5:
				return basicSetLine5(null, msgs);
			case ChirpstackPackage.IO_TRAFFIC__LINE6:
				return basicSetLine6(null, msgs);
			case ChirpstackPackage.IO_TRAFFIC__LINE7:
				return basicSetLine7(null, msgs);
			case ChirpstackPackage.IO_TRAFFIC__LINE8:
				return basicSetLine8(null, msgs);
			case ChirpstackPackage.IO_TRAFFIC__LINE9:
				return basicSetLine9(null, msgs);
			case ChirpstackPackage.IO_TRAFFIC__AI_MODULE:
				return basicSetAiModule(null, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case ChirpstackPackage.IO_TRAFFIC__WINDOW:
				return getWindow();
			case ChirpstackPackage.IO_TRAFFIC__LINE1:
				return getLine1();
			case ChirpstackPackage.IO_TRAFFIC__LINE2:
				return getLine2();
			case ChirpstackPackage.IO_TRAFFIC__LINE3:
				return getLine3();
			case ChirpstackPackage.IO_TRAFFIC__LINE4:
				return getLine4();
			case ChirpstackPackage.IO_TRAFFIC__LINE5:
				return getLine5();
			case ChirpstackPackage.IO_TRAFFIC__LINE6:
				return getLine6();
			case ChirpstackPackage.IO_TRAFFIC__LINE7:
				return getLine7();
			case ChirpstackPackage.IO_TRAFFIC__LINE8:
				return getLine8();
			case ChirpstackPackage.IO_TRAFFIC__LINE9:
				return getLine9();
			case ChirpstackPackage.IO_TRAFFIC__AI_MODULE:
				return getAiModule();
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
			case ChirpstackPackage.IO_TRAFFIC__WINDOW:
				setWindow((IoTrafficWindow)newValue);
				return;
			case ChirpstackPackage.IO_TRAFFIC__LINE1:
				setLine1((IoTrafficLine)newValue);
				return;
			case ChirpstackPackage.IO_TRAFFIC__LINE2:
				setLine2((IoTrafficLine)newValue);
				return;
			case ChirpstackPackage.IO_TRAFFIC__LINE3:
				setLine3((IoTrafficLine)newValue);
				return;
			case ChirpstackPackage.IO_TRAFFIC__LINE4:
				setLine4((IoTrafficLine)newValue);
				return;
			case ChirpstackPackage.IO_TRAFFIC__LINE5:
				setLine5((IoTrafficLine)newValue);
				return;
			case ChirpstackPackage.IO_TRAFFIC__LINE6:
				setLine6((IoTrafficLine)newValue);
				return;
			case ChirpstackPackage.IO_TRAFFIC__LINE7:
				setLine7((IoTrafficLine)newValue);
				return;
			case ChirpstackPackage.IO_TRAFFIC__LINE8:
				setLine8((IoTrafficLine)newValue);
				return;
			case ChirpstackPackage.IO_TRAFFIC__LINE9:
				setLine9((IoTrafficLine)newValue);
				return;
			case ChirpstackPackage.IO_TRAFFIC__AI_MODULE:
				setAiModule((IoTrafficAiModule)newValue);
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
			case ChirpstackPackage.IO_TRAFFIC__WINDOW:
				setWindow((IoTrafficWindow)null);
				return;
			case ChirpstackPackage.IO_TRAFFIC__LINE1:
				setLine1((IoTrafficLine)null);
				return;
			case ChirpstackPackage.IO_TRAFFIC__LINE2:
				setLine2((IoTrafficLine)null);
				return;
			case ChirpstackPackage.IO_TRAFFIC__LINE3:
				setLine3((IoTrafficLine)null);
				return;
			case ChirpstackPackage.IO_TRAFFIC__LINE4:
				setLine4((IoTrafficLine)null);
				return;
			case ChirpstackPackage.IO_TRAFFIC__LINE5:
				setLine5((IoTrafficLine)null);
				return;
			case ChirpstackPackage.IO_TRAFFIC__LINE6:
				setLine6((IoTrafficLine)null);
				return;
			case ChirpstackPackage.IO_TRAFFIC__LINE7:
				setLine7((IoTrafficLine)null);
				return;
			case ChirpstackPackage.IO_TRAFFIC__LINE8:
				setLine8((IoTrafficLine)null);
				return;
			case ChirpstackPackage.IO_TRAFFIC__LINE9:
				setLine9((IoTrafficLine)null);
				return;
			case ChirpstackPackage.IO_TRAFFIC__AI_MODULE:
				setAiModule((IoTrafficAiModule)null);
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
			case ChirpstackPackage.IO_TRAFFIC__WINDOW:
				return window != null;
			case ChirpstackPackage.IO_TRAFFIC__LINE1:
				return line1 != null;
			case ChirpstackPackage.IO_TRAFFIC__LINE2:
				return line2 != null;
			case ChirpstackPackage.IO_TRAFFIC__LINE3:
				return line3 != null;
			case ChirpstackPackage.IO_TRAFFIC__LINE4:
				return line4 != null;
			case ChirpstackPackage.IO_TRAFFIC__LINE5:
				return line5 != null;
			case ChirpstackPackage.IO_TRAFFIC__LINE6:
				return line6 != null;
			case ChirpstackPackage.IO_TRAFFIC__LINE7:
				return line7 != null;
			case ChirpstackPackage.IO_TRAFFIC__LINE8:
				return line8 != null;
			case ChirpstackPackage.IO_TRAFFIC__LINE9:
				return line9 != null;
			case ChirpstackPackage.IO_TRAFFIC__AI_MODULE:
				return aiModule != null;
		}
		return super.eIsSet(featureID);
	}

} //IoTrafficImpl
