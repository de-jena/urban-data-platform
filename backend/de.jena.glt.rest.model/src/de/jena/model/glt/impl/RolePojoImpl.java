/*
 */
package de.jena.model.glt.impl;

import de.jena.model.glt.GltPackage;
import de.jena.model.glt.RolePojo;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EDataTypeEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Role Pojo</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link de.jena.model.glt.impl.RolePojoImpl#getName <em>Name</em>}</li>
 *   <li>{@link de.jena.model.glt.impl.RolePojoImpl#getType <em>Type</em>}</li>
 *   <li>{@link de.jena.model.glt.impl.RolePojoImpl#getGroups <em>Groups</em>}</li>
 *   <li>{@link de.jena.model.glt.impl.RolePojoImpl#getRoles <em>Roles</em>}</li>
 *   <li>{@link de.jena.model.glt.impl.RolePojoImpl#getMembers <em>Members</em>}</li>
 *   <li>{@link de.jena.model.glt.impl.RolePojoImpl#getProperties <em>Properties</em>}</li>
 * </ul>
 *
 * @generated
 */
public class RolePojoImpl extends MinimalEObjectImpl.Container implements RolePojo {
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
	 * The default value of the '{@link #getType() <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getType()
	 * @generated
	 * @ordered
	 */
	protected static final String TYPE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getType() <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getType()
	 * @generated
	 * @ordered
	 */
	protected String type = TYPE_EDEFAULT;

	/**
	 * The cached value of the '{@link #getGroups() <em>Groups</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGroups()
	 * @generated
	 * @ordered
	 */
	protected EList<String> groups;

	/**
	 * The cached value of the '{@link #getRoles() <em>Roles</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRoles()
	 * @generated
	 * @ordered
	 */
	protected EList<String> roles;

	/**
	 * The cached value of the '{@link #getMembers() <em>Members</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMembers()
	 * @generated
	 * @ordered
	 */
	protected EList<String> members;

	/**
	 * The default value of the '{@link #getProperties() <em>Properties</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProperties()
	 * @generated
	 * @ordered
	 */
	protected static final Object PROPERTIES_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getProperties() <em>Properties</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProperties()
	 * @generated
	 * @ordered
	 */
	protected Object properties = PROPERTIES_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected RolePojoImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return GltPackage.eINSTANCE.getRolePojo();
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
			eNotify(new ENotificationImpl(this, Notification.SET, GltPackage.ROLE_POJO__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getType() {
		return type;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setType(String newType) {
		String oldType = type;
		type = newType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GltPackage.ROLE_POJO__TYPE, oldType, type));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<String> getGroups() {
		if (groups == null) {
			groups = new EDataTypeEList<String>(String.class, this, GltPackage.ROLE_POJO__GROUPS);
		}
		return groups;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<String> getRoles() {
		if (roles == null) {
			roles = new EDataTypeEList<String>(String.class, this, GltPackage.ROLE_POJO__ROLES);
		}
		return roles;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<String> getMembers() {
		if (members == null) {
			members = new EDataTypeEList<String>(String.class, this, GltPackage.ROLE_POJO__MEMBERS);
		}
		return members;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getProperties() {
		return properties;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setProperties(Object newProperties) {
		Object oldProperties = properties;
		properties = newProperties;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GltPackage.ROLE_POJO__PROPERTIES, oldProperties, properties));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case GltPackage.ROLE_POJO__NAME:
				return getName();
			case GltPackage.ROLE_POJO__TYPE:
				return getType();
			case GltPackage.ROLE_POJO__GROUPS:
				return getGroups();
			case GltPackage.ROLE_POJO__ROLES:
				return getRoles();
			case GltPackage.ROLE_POJO__MEMBERS:
				return getMembers();
			case GltPackage.ROLE_POJO__PROPERTIES:
				return getProperties();
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
			case GltPackage.ROLE_POJO__NAME:
				setName((String)newValue);
				return;
			case GltPackage.ROLE_POJO__TYPE:
				setType((String)newValue);
				return;
			case GltPackage.ROLE_POJO__GROUPS:
				getGroups().clear();
				getGroups().addAll((Collection<? extends String>)newValue);
				return;
			case GltPackage.ROLE_POJO__ROLES:
				getRoles().clear();
				getRoles().addAll((Collection<? extends String>)newValue);
				return;
			case GltPackage.ROLE_POJO__MEMBERS:
				getMembers().clear();
				getMembers().addAll((Collection<? extends String>)newValue);
				return;
			case GltPackage.ROLE_POJO__PROPERTIES:
				setProperties(newValue);
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
			case GltPackage.ROLE_POJO__NAME:
				setName(NAME_EDEFAULT);
				return;
			case GltPackage.ROLE_POJO__TYPE:
				setType(TYPE_EDEFAULT);
				return;
			case GltPackage.ROLE_POJO__GROUPS:
				getGroups().clear();
				return;
			case GltPackage.ROLE_POJO__ROLES:
				getRoles().clear();
				return;
			case GltPackage.ROLE_POJO__MEMBERS:
				getMembers().clear();
				return;
			case GltPackage.ROLE_POJO__PROPERTIES:
				setProperties(PROPERTIES_EDEFAULT);
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
			case GltPackage.ROLE_POJO__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case GltPackage.ROLE_POJO__TYPE:
				return TYPE_EDEFAULT == null ? type != null : !TYPE_EDEFAULT.equals(type);
			case GltPackage.ROLE_POJO__GROUPS:
				return groups != null && !groups.isEmpty();
			case GltPackage.ROLE_POJO__ROLES:
				return roles != null && !roles.isEmpty();
			case GltPackage.ROLE_POJO__MEMBERS:
				return members != null && !members.isEmpty();
			case GltPackage.ROLE_POJO__PROPERTIES:
				return PROPERTIES_EDEFAULT == null ? properties != null : !PROPERTIES_EDEFAULT.equals(properties);
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
		result.append(", type: ");
		result.append(type);
		result.append(", groups: ");
		result.append(groups);
		result.append(", roles: ");
		result.append(roles);
		result.append(", members: ");
		result.append(members);
		result.append(", properties: ");
		result.append(properties);
		result.append(')');
		return result.toString();
	}

} //RolePojoImpl
