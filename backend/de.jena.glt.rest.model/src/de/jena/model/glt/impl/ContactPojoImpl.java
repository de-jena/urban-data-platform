/*
 */
package de.jena.model.glt.impl;

import de.jena.model.glt.AddressPojo;
import de.jena.model.glt.ContactPojo;
import de.jena.model.glt.GltPackage;
import de.jena.model.glt.PhonePojo;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EDataTypeUniqueEList;
import org.eclipse.emf.ecore.util.EObjectResolvingEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Contact Pojo</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link de.jena.model.glt.impl.ContactPojoImpl#getName <em>Name</em>}</li>
 *   <li>{@link de.jena.model.glt.impl.ContactPojoImpl#getTask <em>Task</em>}</li>
 *   <li>{@link de.jena.model.glt.impl.ContactPojoImpl#getAdditional <em>Additional</em>}</li>
 *   <li>{@link de.jena.model.glt.impl.ContactPojoImpl#getFirstName <em>First Name</em>}</li>
 *   <li>{@link de.jena.model.glt.impl.ContactPojoImpl#getLastName <em>Last Name</em>}</li>
 *   <li>{@link de.jena.model.glt.impl.ContactPojoImpl#getSalutation <em>Salutation</em>}</li>
 *   <li>{@link de.jena.model.glt.impl.ContactPojoImpl#getShortName <em>Short Name</em>}</li>
 *   <li>{@link de.jena.model.glt.impl.ContactPojoImpl#getTitle <em>Title</em>}</li>
 *   <li>{@link de.jena.model.glt.impl.ContactPojoImpl#getAddress <em>Address</em>}</li>
 *   <li>{@link de.jena.model.glt.impl.ContactPojoImpl#getPhones <em>Phones</em>}</li>
 *   <li>{@link de.jena.model.glt.impl.ContactPojoImpl#getEmails <em>Emails</em>}</li>
 *   <li>{@link de.jena.model.glt.impl.ContactPojoImpl#getComments <em>Comments</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ContactPojoImpl extends MinimalEObjectImpl.Container implements ContactPojo {
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
	 * The default value of the '{@link #getTask() <em>Task</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTask()
	 * @generated
	 * @ordered
	 */
	protected static final String TASK_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getTask() <em>Task</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTask()
	 * @generated
	 * @ordered
	 */
	protected String task = TASK_EDEFAULT;

	/**
	 * The default value of the '{@link #getAdditional() <em>Additional</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAdditional()
	 * @generated
	 * @ordered
	 */
	protected static final String ADDITIONAL_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getAdditional() <em>Additional</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAdditional()
	 * @generated
	 * @ordered
	 */
	protected String additional = ADDITIONAL_EDEFAULT;

	/**
	 * The default value of the '{@link #getFirstName() <em>First Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFirstName()
	 * @generated
	 * @ordered
	 */
	protected static final String FIRST_NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getFirstName() <em>First Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFirstName()
	 * @generated
	 * @ordered
	 */
	protected String firstName = FIRST_NAME_EDEFAULT;

	/**
	 * The default value of the '{@link #getLastName() <em>Last Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLastName()
	 * @generated
	 * @ordered
	 */
	protected static final String LAST_NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getLastName() <em>Last Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLastName()
	 * @generated
	 * @ordered
	 */
	protected String lastName = LAST_NAME_EDEFAULT;

	/**
	 * The default value of the '{@link #getSalutation() <em>Salutation</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSalutation()
	 * @generated
	 * @ordered
	 */
	protected static final String SALUTATION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getSalutation() <em>Salutation</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSalutation()
	 * @generated
	 * @ordered
	 */
	protected String salutation = SALUTATION_EDEFAULT;

	/**
	 * The default value of the '{@link #getShortName() <em>Short Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getShortName()
	 * @generated
	 * @ordered
	 */
	protected static final String SHORT_NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getShortName() <em>Short Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getShortName()
	 * @generated
	 * @ordered
	 */
	protected String shortName = SHORT_NAME_EDEFAULT;

	/**
	 * The default value of the '{@link #getTitle() <em>Title</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTitle()
	 * @generated
	 * @ordered
	 */
	protected static final String TITLE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getTitle() <em>Title</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTitle()
	 * @generated
	 * @ordered
	 */
	protected String title = TITLE_EDEFAULT;

	/**
	 * The cached value of the '{@link #getAddress() <em>Address</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAddress()
	 * @generated
	 * @ordered
	 */
	protected AddressPojo address;

	/**
	 * The cached value of the '{@link #getPhones() <em>Phones</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPhones()
	 * @generated
	 * @ordered
	 */
	protected EList<PhonePojo> phones;

	/**
	 * The cached value of the '{@link #getEmails() <em>Emails</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEmails()
	 * @generated
	 * @ordered
	 */
	protected EList<String> emails;

	/**
	 * The cached value of the '{@link #getComments() <em>Comments</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getComments()
	 * @generated
	 * @ordered
	 */
	protected EList<String> comments;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ContactPojoImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return GltPackage.eINSTANCE.getContactPojo();
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
			eNotify(new ENotificationImpl(this, Notification.SET, GltPackage.CONTACT_POJO__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getTask() {
		return task;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setTask(String newTask) {
		String oldTask = task;
		task = newTask;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GltPackage.CONTACT_POJO__TASK, oldTask, task));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getAdditional() {
		return additional;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setAdditional(String newAdditional) {
		String oldAdditional = additional;
		additional = newAdditional;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GltPackage.CONTACT_POJO__ADDITIONAL, oldAdditional, additional));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getFirstName() {
		return firstName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setFirstName(String newFirstName) {
		String oldFirstName = firstName;
		firstName = newFirstName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GltPackage.CONTACT_POJO__FIRST_NAME, oldFirstName, firstName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getLastName() {
		return lastName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setLastName(String newLastName) {
		String oldLastName = lastName;
		lastName = newLastName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GltPackage.CONTACT_POJO__LAST_NAME, oldLastName, lastName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getSalutation() {
		return salutation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setSalutation(String newSalutation) {
		String oldSalutation = salutation;
		salutation = newSalutation;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GltPackage.CONTACT_POJO__SALUTATION, oldSalutation, salutation));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getShortName() {
		return shortName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setShortName(String newShortName) {
		String oldShortName = shortName;
		shortName = newShortName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GltPackage.CONTACT_POJO__SHORT_NAME, oldShortName, shortName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getTitle() {
		return title;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setTitle(String newTitle) {
		String oldTitle = title;
		title = newTitle;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GltPackage.CONTACT_POJO__TITLE, oldTitle, title));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public AddressPojo getAddress() {
		if (address != null && address.eIsProxy()) {
			InternalEObject oldAddress = (InternalEObject)address;
			address = (AddressPojo)eResolveProxy(oldAddress);
			if (address != oldAddress) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, GltPackage.CONTACT_POJO__ADDRESS, oldAddress, address));
			}
		}
		return address;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AddressPojo basicGetAddress() {
		return address;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setAddress(AddressPojo newAddress) {
		AddressPojo oldAddress = address;
		address = newAddress;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GltPackage.CONTACT_POJO__ADDRESS, oldAddress, address));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<PhonePojo> getPhones() {
		if (phones == null) {
			phones = new EObjectResolvingEList<PhonePojo>(PhonePojo.class, this, GltPackage.CONTACT_POJO__PHONES);
		}
		return phones;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<String> getEmails() {
		if (emails == null) {
			emails = new EDataTypeUniqueEList<String>(String.class, this, GltPackage.CONTACT_POJO__EMAILS);
		}
		return emails;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<String> getComments() {
		if (comments == null) {
			comments = new EDataTypeUniqueEList<String>(String.class, this, GltPackage.CONTACT_POJO__COMMENTS);
		}
		return comments;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case GltPackage.CONTACT_POJO__NAME:
				return getName();
			case GltPackage.CONTACT_POJO__TASK:
				return getTask();
			case GltPackage.CONTACT_POJO__ADDITIONAL:
				return getAdditional();
			case GltPackage.CONTACT_POJO__FIRST_NAME:
				return getFirstName();
			case GltPackage.CONTACT_POJO__LAST_NAME:
				return getLastName();
			case GltPackage.CONTACT_POJO__SALUTATION:
				return getSalutation();
			case GltPackage.CONTACT_POJO__SHORT_NAME:
				return getShortName();
			case GltPackage.CONTACT_POJO__TITLE:
				return getTitle();
			case GltPackage.CONTACT_POJO__ADDRESS:
				if (resolve) return getAddress();
				return basicGetAddress();
			case GltPackage.CONTACT_POJO__PHONES:
				return getPhones();
			case GltPackage.CONTACT_POJO__EMAILS:
				return getEmails();
			case GltPackage.CONTACT_POJO__COMMENTS:
				return getComments();
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
			case GltPackage.CONTACT_POJO__NAME:
				setName((String)newValue);
				return;
			case GltPackage.CONTACT_POJO__TASK:
				setTask((String)newValue);
				return;
			case GltPackage.CONTACT_POJO__ADDITIONAL:
				setAdditional((String)newValue);
				return;
			case GltPackage.CONTACT_POJO__FIRST_NAME:
				setFirstName((String)newValue);
				return;
			case GltPackage.CONTACT_POJO__LAST_NAME:
				setLastName((String)newValue);
				return;
			case GltPackage.CONTACT_POJO__SALUTATION:
				setSalutation((String)newValue);
				return;
			case GltPackage.CONTACT_POJO__SHORT_NAME:
				setShortName((String)newValue);
				return;
			case GltPackage.CONTACT_POJO__TITLE:
				setTitle((String)newValue);
				return;
			case GltPackage.CONTACT_POJO__ADDRESS:
				setAddress((AddressPojo)newValue);
				return;
			case GltPackage.CONTACT_POJO__PHONES:
				getPhones().clear();
				getPhones().addAll((Collection<? extends PhonePojo>)newValue);
				return;
			case GltPackage.CONTACT_POJO__EMAILS:
				getEmails().clear();
				getEmails().addAll((Collection<? extends String>)newValue);
				return;
			case GltPackage.CONTACT_POJO__COMMENTS:
				getComments().clear();
				getComments().addAll((Collection<? extends String>)newValue);
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
			case GltPackage.CONTACT_POJO__NAME:
				setName(NAME_EDEFAULT);
				return;
			case GltPackage.CONTACT_POJO__TASK:
				setTask(TASK_EDEFAULT);
				return;
			case GltPackage.CONTACT_POJO__ADDITIONAL:
				setAdditional(ADDITIONAL_EDEFAULT);
				return;
			case GltPackage.CONTACT_POJO__FIRST_NAME:
				setFirstName(FIRST_NAME_EDEFAULT);
				return;
			case GltPackage.CONTACT_POJO__LAST_NAME:
				setLastName(LAST_NAME_EDEFAULT);
				return;
			case GltPackage.CONTACT_POJO__SALUTATION:
				setSalutation(SALUTATION_EDEFAULT);
				return;
			case GltPackage.CONTACT_POJO__SHORT_NAME:
				setShortName(SHORT_NAME_EDEFAULT);
				return;
			case GltPackage.CONTACT_POJO__TITLE:
				setTitle(TITLE_EDEFAULT);
				return;
			case GltPackage.CONTACT_POJO__ADDRESS:
				setAddress((AddressPojo)null);
				return;
			case GltPackage.CONTACT_POJO__PHONES:
				getPhones().clear();
				return;
			case GltPackage.CONTACT_POJO__EMAILS:
				getEmails().clear();
				return;
			case GltPackage.CONTACT_POJO__COMMENTS:
				getComments().clear();
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
			case GltPackage.CONTACT_POJO__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case GltPackage.CONTACT_POJO__TASK:
				return TASK_EDEFAULT == null ? task != null : !TASK_EDEFAULT.equals(task);
			case GltPackage.CONTACT_POJO__ADDITIONAL:
				return ADDITIONAL_EDEFAULT == null ? additional != null : !ADDITIONAL_EDEFAULT.equals(additional);
			case GltPackage.CONTACT_POJO__FIRST_NAME:
				return FIRST_NAME_EDEFAULT == null ? firstName != null : !FIRST_NAME_EDEFAULT.equals(firstName);
			case GltPackage.CONTACT_POJO__LAST_NAME:
				return LAST_NAME_EDEFAULT == null ? lastName != null : !LAST_NAME_EDEFAULT.equals(lastName);
			case GltPackage.CONTACT_POJO__SALUTATION:
				return SALUTATION_EDEFAULT == null ? salutation != null : !SALUTATION_EDEFAULT.equals(salutation);
			case GltPackage.CONTACT_POJO__SHORT_NAME:
				return SHORT_NAME_EDEFAULT == null ? shortName != null : !SHORT_NAME_EDEFAULT.equals(shortName);
			case GltPackage.CONTACT_POJO__TITLE:
				return TITLE_EDEFAULT == null ? title != null : !TITLE_EDEFAULT.equals(title);
			case GltPackage.CONTACT_POJO__ADDRESS:
				return address != null;
			case GltPackage.CONTACT_POJO__PHONES:
				return phones != null && !phones.isEmpty();
			case GltPackage.CONTACT_POJO__EMAILS:
				return emails != null && !emails.isEmpty();
			case GltPackage.CONTACT_POJO__COMMENTS:
				return comments != null && !comments.isEmpty();
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
		result.append(", task: ");
		result.append(task);
		result.append(", additional: ");
		result.append(additional);
		result.append(", firstName: ");
		result.append(firstName);
		result.append(", lastName: ");
		result.append(lastName);
		result.append(", salutation: ");
		result.append(salutation);
		result.append(", shortName: ");
		result.append(shortName);
		result.append(", title: ");
		result.append(title);
		result.append(", emails: ");
		result.append(emails);
		result.append(", comments: ");
		result.append(comments);
		result.append(')');
		return result.toString();
	}

} //ContactPojoImpl
