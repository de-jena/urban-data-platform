/*
 */
package de.jena.model.glt.impl;

import de.jena.model.glt.CommentPojo;
import de.jena.model.glt.GltPackage;
import de.jena.model.glt.StatusPojo;

import java.math.BigInteger;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Comment Pojo</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link de.jena.model.glt.impl.CommentPojoImpl#getId <em>Id</em>}</li>
 *   <li>{@link de.jena.model.glt.impl.CommentPojoImpl#getAuthor <em>Author</em>}</li>
 *   <li>{@link de.jena.model.glt.impl.CommentPojoImpl#getTimestamp <em>Timestamp</em>}</li>
 *   <li>{@link de.jena.model.glt.impl.CommentPojoImpl#getContent <em>Content</em>}</li>
 *   <li>{@link de.jena.model.glt.impl.CommentPojoImpl#getType <em>Type</em>}</li>
 *   <li>{@link de.jena.model.glt.impl.CommentPojoImpl#getOwnerId <em>Owner Id</em>}</li>
 *   <li>{@link de.jena.model.glt.impl.CommentPojoImpl#getOwnerType <em>Owner Type</em>}</li>
 *   <li>{@link de.jena.model.glt.impl.CommentPojoImpl#getStatus <em>Status</em>}</li>
 * </ul>
 *
 * @generated
 */
public class CommentPojoImpl extends MinimalEObjectImpl.Container implements CommentPojo {
	/**
	 * The default value of the '{@link #getId() <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getId()
	 * @generated
	 * @ordered
	 */
	protected static final Integer ID_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getId() <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getId()
	 * @generated
	 * @ordered
	 */
	protected Integer id = ID_EDEFAULT;

	/**
	 * The default value of the '{@link #getAuthor() <em>Author</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAuthor()
	 * @generated
	 * @ordered
	 */
	protected static final String AUTHOR_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getAuthor() <em>Author</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAuthor()
	 * @generated
	 * @ordered
	 */
	protected String author = AUTHOR_EDEFAULT;

	/**
	 * The default value of the '{@link #getTimestamp() <em>Timestamp</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTimestamp()
	 * @generated
	 * @ordered
	 */
	protected static final String TIMESTAMP_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getTimestamp() <em>Timestamp</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTimestamp()
	 * @generated
	 * @ordered
	 */
	protected String timestamp = TIMESTAMP_EDEFAULT;

	/**
	 * The default value of the '{@link #getContent() <em>Content</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getContent()
	 * @generated
	 * @ordered
	 */
	protected static final String CONTENT_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getContent() <em>Content</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getContent()
	 * @generated
	 * @ordered
	 */
	protected String content = CONTENT_EDEFAULT;

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
	 * The default value of the '{@link #getOwnerId() <em>Owner Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOwnerId()
	 * @generated
	 * @ordered
	 */
	protected static final BigInteger OWNER_ID_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getOwnerId() <em>Owner Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOwnerId()
	 * @generated
	 * @ordered
	 */
	protected BigInteger ownerId = OWNER_ID_EDEFAULT;

	/**
	 * The default value of the '{@link #getOwnerType() <em>Owner Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOwnerType()
	 * @generated
	 * @ordered
	 */
	protected static final String OWNER_TYPE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getOwnerType() <em>Owner Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOwnerType()
	 * @generated
	 * @ordered
	 */
	protected String ownerType = OWNER_TYPE_EDEFAULT;

	/**
	 * The cached value of the '{@link #getStatus() <em>Status</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStatus()
	 * @generated
	 * @ordered
	 */
	protected StatusPojo status;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CommentPojoImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return GltPackage.eINSTANCE.getCommentPojo();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Integer getId() {
		return id;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setId(Integer newId) {
		Integer oldId = id;
		id = newId;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GltPackage.COMMENT_POJO__ID, oldId, id));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getAuthor() {
		return author;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setAuthor(String newAuthor) {
		String oldAuthor = author;
		author = newAuthor;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GltPackage.COMMENT_POJO__AUTHOR, oldAuthor, author));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getTimestamp() {
		return timestamp;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setTimestamp(String newTimestamp) {
		String oldTimestamp = timestamp;
		timestamp = newTimestamp;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GltPackage.COMMENT_POJO__TIMESTAMP, oldTimestamp, timestamp));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getContent() {
		return content;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setContent(String newContent) {
		String oldContent = content;
		content = newContent;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GltPackage.COMMENT_POJO__CONTENT, oldContent, content));
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
			eNotify(new ENotificationImpl(this, Notification.SET, GltPackage.COMMENT_POJO__TYPE, oldType, type));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public BigInteger getOwnerId() {
		return ownerId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setOwnerId(BigInteger newOwnerId) {
		BigInteger oldOwnerId = ownerId;
		ownerId = newOwnerId;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GltPackage.COMMENT_POJO__OWNER_ID, oldOwnerId, ownerId));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getOwnerType() {
		return ownerType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setOwnerType(String newOwnerType) {
		String oldOwnerType = ownerType;
		ownerType = newOwnerType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GltPackage.COMMENT_POJO__OWNER_TYPE, oldOwnerType, ownerType));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public StatusPojo getStatus() {
		return status;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetStatus(StatusPojo newStatus, NotificationChain msgs) {
		StatusPojo oldStatus = status;
		status = newStatus;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, GltPackage.COMMENT_POJO__STATUS, oldStatus, newStatus);
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
	public void setStatus(StatusPojo newStatus) {
		if (newStatus != status) {
			NotificationChain msgs = null;
			if (status != null)
				msgs = ((InternalEObject)status).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - GltPackage.COMMENT_POJO__STATUS, null, msgs);
			if (newStatus != null)
				msgs = ((InternalEObject)newStatus).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - GltPackage.COMMENT_POJO__STATUS, null, msgs);
			msgs = basicSetStatus(newStatus, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GltPackage.COMMENT_POJO__STATUS, newStatus, newStatus));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case GltPackage.COMMENT_POJO__STATUS:
				return basicSetStatus(null, msgs);
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
			case GltPackage.COMMENT_POJO__ID:
				return getId();
			case GltPackage.COMMENT_POJO__AUTHOR:
				return getAuthor();
			case GltPackage.COMMENT_POJO__TIMESTAMP:
				return getTimestamp();
			case GltPackage.COMMENT_POJO__CONTENT:
				return getContent();
			case GltPackage.COMMENT_POJO__TYPE:
				return getType();
			case GltPackage.COMMENT_POJO__OWNER_ID:
				return getOwnerId();
			case GltPackage.COMMENT_POJO__OWNER_TYPE:
				return getOwnerType();
			case GltPackage.COMMENT_POJO__STATUS:
				return getStatus();
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
			case GltPackage.COMMENT_POJO__ID:
				setId((Integer)newValue);
				return;
			case GltPackage.COMMENT_POJO__AUTHOR:
				setAuthor((String)newValue);
				return;
			case GltPackage.COMMENT_POJO__TIMESTAMP:
				setTimestamp((String)newValue);
				return;
			case GltPackage.COMMENT_POJO__CONTENT:
				setContent((String)newValue);
				return;
			case GltPackage.COMMENT_POJO__TYPE:
				setType((String)newValue);
				return;
			case GltPackage.COMMENT_POJO__OWNER_ID:
				setOwnerId((BigInteger)newValue);
				return;
			case GltPackage.COMMENT_POJO__OWNER_TYPE:
				setOwnerType((String)newValue);
				return;
			case GltPackage.COMMENT_POJO__STATUS:
				setStatus((StatusPojo)newValue);
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
			case GltPackage.COMMENT_POJO__ID:
				setId(ID_EDEFAULT);
				return;
			case GltPackage.COMMENT_POJO__AUTHOR:
				setAuthor(AUTHOR_EDEFAULT);
				return;
			case GltPackage.COMMENT_POJO__TIMESTAMP:
				setTimestamp(TIMESTAMP_EDEFAULT);
				return;
			case GltPackage.COMMENT_POJO__CONTENT:
				setContent(CONTENT_EDEFAULT);
				return;
			case GltPackage.COMMENT_POJO__TYPE:
				setType(TYPE_EDEFAULT);
				return;
			case GltPackage.COMMENT_POJO__OWNER_ID:
				setOwnerId(OWNER_ID_EDEFAULT);
				return;
			case GltPackage.COMMENT_POJO__OWNER_TYPE:
				setOwnerType(OWNER_TYPE_EDEFAULT);
				return;
			case GltPackage.COMMENT_POJO__STATUS:
				setStatus((StatusPojo)null);
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
			case GltPackage.COMMENT_POJO__ID:
				return ID_EDEFAULT == null ? id != null : !ID_EDEFAULT.equals(id);
			case GltPackage.COMMENT_POJO__AUTHOR:
				return AUTHOR_EDEFAULT == null ? author != null : !AUTHOR_EDEFAULT.equals(author);
			case GltPackage.COMMENT_POJO__TIMESTAMP:
				return TIMESTAMP_EDEFAULT == null ? timestamp != null : !TIMESTAMP_EDEFAULT.equals(timestamp);
			case GltPackage.COMMENT_POJO__CONTENT:
				return CONTENT_EDEFAULT == null ? content != null : !CONTENT_EDEFAULT.equals(content);
			case GltPackage.COMMENT_POJO__TYPE:
				return TYPE_EDEFAULT == null ? type != null : !TYPE_EDEFAULT.equals(type);
			case GltPackage.COMMENT_POJO__OWNER_ID:
				return OWNER_ID_EDEFAULT == null ? ownerId != null : !OWNER_ID_EDEFAULT.equals(ownerId);
			case GltPackage.COMMENT_POJO__OWNER_TYPE:
				return OWNER_TYPE_EDEFAULT == null ? ownerType != null : !OWNER_TYPE_EDEFAULT.equals(ownerType);
			case GltPackage.COMMENT_POJO__STATUS:
				return status != null;
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
		result.append(" (id: ");
		result.append(id);
		result.append(", author: ");
		result.append(author);
		result.append(", timestamp: ");
		result.append(timestamp);
		result.append(", content: ");
		result.append(content);
		result.append(", type: ");
		result.append(type);
		result.append(", ownerId: ");
		result.append(ownerId);
		result.append(", ownerType: ");
		result.append(ownerType);
		result.append(')');
		return result.toString();
	}

} //CommentPojoImpl
