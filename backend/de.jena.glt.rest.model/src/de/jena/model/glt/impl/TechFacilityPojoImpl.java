/*
 */
package de.jena.model.glt.impl;

import de.jena.model.glt.ContractPojo;
import de.jena.model.glt.GltPackage;
import de.jena.model.glt.TechFacilityPojo;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectResolvingEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Tech Facility Pojo</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link de.jena.model.glt.impl.TechFacilityPojoImpl#getName <em>Name</em>}</li>
 *   <li>{@link de.jena.model.glt.impl.TechFacilityPojoImpl#getFacilityClass <em>Facility Class</em>}</li>
 *   <li>{@link de.jena.model.glt.impl.TechFacilityPojoImpl#getFacilityClassName <em>Facility Class Name</em>}</li>
 *   <li>{@link de.jena.model.glt.impl.TechFacilityPojoImpl#getRoom <em>Room</em>}</li>
 *   <li>{@link de.jena.model.glt.impl.TechFacilityPojoImpl#getConstructionYear <em>Construction Year</em>}</li>
 *   <li>{@link de.jena.model.glt.impl.TechFacilityPojoImpl#getLaunchDate <em>Launch Date</em>}</li>
 *   <li>{@link de.jena.model.glt.impl.TechFacilityPojoImpl#getContracts <em>Contracts</em>}</li>
 * </ul>
 *
 * @generated
 */
public class TechFacilityPojoImpl extends MinimalEObjectImpl.Container implements TechFacilityPojo {
	/**
	 * The default value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected static final String NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected String name = NAME_EDEFAULT;

	/**
	 * The default value of the '{@link #getFacilityClass() <em>Facility Class</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFacilityClass()
	 * @generated
	 * @ordered
	 */
	protected static final String FACILITY_CLASS_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getFacilityClass() <em>Facility Class</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFacilityClass()
	 * @generated
	 * @ordered
	 */
	protected String facilityClass = FACILITY_CLASS_EDEFAULT;

	/**
	 * The default value of the '{@link #getFacilityClassName() <em>Facility Class Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFacilityClassName()
	 * @generated
	 * @ordered
	 */
	protected static final String FACILITY_CLASS_NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getFacilityClassName() <em>Facility Class Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFacilityClassName()
	 * @generated
	 * @ordered
	 */
	protected String facilityClassName = FACILITY_CLASS_NAME_EDEFAULT;

	/**
	 * The default value of the '{@link #getRoom() <em>Room</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRoom()
	 * @generated
	 * @ordered
	 */
	protected static final String ROOM_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getRoom() <em>Room</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRoom()
	 * @generated
	 * @ordered
	 */
	protected String room = ROOM_EDEFAULT;

	/**
	 * The default value of the '{@link #getConstructionYear() <em>Construction Year</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConstructionYear()
	 * @generated
	 * @ordered
	 */
	protected static final Integer CONSTRUCTION_YEAR_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getConstructionYear() <em>Construction Year</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConstructionYear()
	 * @generated
	 * @ordered
	 */
	protected Integer constructionYear = CONSTRUCTION_YEAR_EDEFAULT;

	/**
	 * The default value of the '{@link #getLaunchDate() <em>Launch Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLaunchDate()
	 * @generated
	 * @ordered
	 */
	protected static final String LAUNCH_DATE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getLaunchDate() <em>Launch Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLaunchDate()
	 * @generated
	 * @ordered
	 */
	protected String launchDate = LAUNCH_DATE_EDEFAULT;

	/**
	 * The cached value of the '{@link #getContracts() <em>Contracts</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getContracts()
	 * @generated
	 * @ordered
	 */
	protected EList<ContractPojo> contracts;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TechFacilityPojoImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return GltPackage.eINSTANCE.getTechFacilityPojo();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getName() {
		return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setName(String newName) {
		String oldName = name;
		name = newName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GltPackage.TECH_FACILITY_POJO__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getFacilityClass() {
		return facilityClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setFacilityClass(String newFacilityClass) {
		String oldFacilityClass = facilityClass;
		facilityClass = newFacilityClass;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GltPackage.TECH_FACILITY_POJO__FACILITY_CLASS, oldFacilityClass, facilityClass));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getFacilityClassName() {
		return facilityClassName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setFacilityClassName(String newFacilityClassName) {
		String oldFacilityClassName = facilityClassName;
		facilityClassName = newFacilityClassName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GltPackage.TECH_FACILITY_POJO__FACILITY_CLASS_NAME, oldFacilityClassName, facilityClassName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getRoom() {
		return room;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setRoom(String newRoom) {
		String oldRoom = room;
		room = newRoom;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GltPackage.TECH_FACILITY_POJO__ROOM, oldRoom, room));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Integer getConstructionYear() {
		return constructionYear;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setConstructionYear(Integer newConstructionYear) {
		Integer oldConstructionYear = constructionYear;
		constructionYear = newConstructionYear;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GltPackage.TECH_FACILITY_POJO__CONSTRUCTION_YEAR, oldConstructionYear, constructionYear));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getLaunchDate() {
		return launchDate;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setLaunchDate(String newLaunchDate) {
		String oldLaunchDate = launchDate;
		launchDate = newLaunchDate;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GltPackage.TECH_FACILITY_POJO__LAUNCH_DATE, oldLaunchDate, launchDate));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<ContractPojo> getContracts() {
		if (contracts == null) {
			contracts = new EObjectResolvingEList<ContractPojo>(ContractPojo.class, this, GltPackage.TECH_FACILITY_POJO__CONTRACTS);
		}
		return contracts;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case GltPackage.TECH_FACILITY_POJO__NAME:
				return getName();
			case GltPackage.TECH_FACILITY_POJO__FACILITY_CLASS:
				return getFacilityClass();
			case GltPackage.TECH_FACILITY_POJO__FACILITY_CLASS_NAME:
				return getFacilityClassName();
			case GltPackage.TECH_FACILITY_POJO__ROOM:
				return getRoom();
			case GltPackage.TECH_FACILITY_POJO__CONSTRUCTION_YEAR:
				return getConstructionYear();
			case GltPackage.TECH_FACILITY_POJO__LAUNCH_DATE:
				return getLaunchDate();
			case GltPackage.TECH_FACILITY_POJO__CONTRACTS:
				return getContracts();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case GltPackage.TECH_FACILITY_POJO__NAME:
				setName((String)newValue);
				return;
			case GltPackage.TECH_FACILITY_POJO__FACILITY_CLASS:
				setFacilityClass((String)newValue);
				return;
			case GltPackage.TECH_FACILITY_POJO__FACILITY_CLASS_NAME:
				setFacilityClassName((String)newValue);
				return;
			case GltPackage.TECH_FACILITY_POJO__ROOM:
				setRoom((String)newValue);
				return;
			case GltPackage.TECH_FACILITY_POJO__CONSTRUCTION_YEAR:
				setConstructionYear((Integer)newValue);
				return;
			case GltPackage.TECH_FACILITY_POJO__LAUNCH_DATE:
				setLaunchDate((String)newValue);
				return;
			case GltPackage.TECH_FACILITY_POJO__CONTRACTS:
				getContracts().clear();
				getContracts().addAll((Collection<? extends ContractPojo>)newValue);
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
			case GltPackage.TECH_FACILITY_POJO__NAME:
				setName(NAME_EDEFAULT);
				return;
			case GltPackage.TECH_FACILITY_POJO__FACILITY_CLASS:
				setFacilityClass(FACILITY_CLASS_EDEFAULT);
				return;
			case GltPackage.TECH_FACILITY_POJO__FACILITY_CLASS_NAME:
				setFacilityClassName(FACILITY_CLASS_NAME_EDEFAULT);
				return;
			case GltPackage.TECH_FACILITY_POJO__ROOM:
				setRoom(ROOM_EDEFAULT);
				return;
			case GltPackage.TECH_FACILITY_POJO__CONSTRUCTION_YEAR:
				setConstructionYear(CONSTRUCTION_YEAR_EDEFAULT);
				return;
			case GltPackage.TECH_FACILITY_POJO__LAUNCH_DATE:
				setLaunchDate(LAUNCH_DATE_EDEFAULT);
				return;
			case GltPackage.TECH_FACILITY_POJO__CONTRACTS:
				getContracts().clear();
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
			case GltPackage.TECH_FACILITY_POJO__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case GltPackage.TECH_FACILITY_POJO__FACILITY_CLASS:
				return FACILITY_CLASS_EDEFAULT == null ? facilityClass != null : !FACILITY_CLASS_EDEFAULT.equals(facilityClass);
			case GltPackage.TECH_FACILITY_POJO__FACILITY_CLASS_NAME:
				return FACILITY_CLASS_NAME_EDEFAULT == null ? facilityClassName != null : !FACILITY_CLASS_NAME_EDEFAULT.equals(facilityClassName);
			case GltPackage.TECH_FACILITY_POJO__ROOM:
				return ROOM_EDEFAULT == null ? room != null : !ROOM_EDEFAULT.equals(room);
			case GltPackage.TECH_FACILITY_POJO__CONSTRUCTION_YEAR:
				return CONSTRUCTION_YEAR_EDEFAULT == null ? constructionYear != null : !CONSTRUCTION_YEAR_EDEFAULT.equals(constructionYear);
			case GltPackage.TECH_FACILITY_POJO__LAUNCH_DATE:
				return LAUNCH_DATE_EDEFAULT == null ? launchDate != null : !LAUNCH_DATE_EDEFAULT.equals(launchDate);
			case GltPackage.TECH_FACILITY_POJO__CONTRACTS:
				return contracts != null && !contracts.isEmpty();
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
		result.append(" (name: ");
		result.append(name);
		result.append(", facilityClass: ");
		result.append(facilityClass);
		result.append(", facilityClassName: ");
		result.append(facilityClassName);
		result.append(", room: ");
		result.append(room);
		result.append(", constructionYear: ");
		result.append(constructionYear);
		result.append(", launchDate: ");
		result.append(launchDate);
		result.append(')');
		return result.toString();
	}

} //TechFacilityPojoImpl
