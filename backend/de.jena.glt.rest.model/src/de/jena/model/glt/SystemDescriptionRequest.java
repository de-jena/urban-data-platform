/*
 */
package de.jena.model.glt;

import org.eclipse.emf.ecore.EObject;

import org.osgi.annotation.versioning.ProviderType;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>System Description Request</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.jena.model.glt.SystemDescriptionRequest#getId <em>Id</em>}</li>
 *   <li>{@link de.jena.model.glt.SystemDescriptionRequest#getName <em>Name</em>}</li>
 *   <li>{@link de.jena.model.glt.SystemDescriptionRequest#getDirectory <em>Directory</em>}</li>
 *   <li>{@link de.jena.model.glt.SystemDescriptionRequest#getPort <em>Port</em>}</li>
 *   <li>{@link de.jena.model.glt.SystemDescriptionRequest#getExternalId <em>External Id</em>}</li>
 *   <li>{@link de.jena.model.glt.SystemDescriptionRequest#getIp <em>Ip</em>}</li>
 *   <li>{@link de.jena.model.glt.SystemDescriptionRequest#getLon <em>Lon</em>}</li>
 *   <li>{@link de.jena.model.glt.SystemDescriptionRequest#getLat <em>Lat</em>}</li>
 *   <li>{@link de.jena.model.glt.SystemDescriptionRequest#getExcluded <em>Excluded</em>}</li>
 *   <li>{@link de.jena.model.glt.SystemDescriptionRequest#getFlags <em>Flags</em>}</li>
 * </ul>
 *
 * @see de.jena.model.glt.GltPackage#getSystemDescriptionRequest()
 * @model
 * @generated
 */
@ProviderType
public interface SystemDescriptionRequest extends EObject {
	/**
	 * Returns the value of the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Id</em>' attribute.
	 * @see #setId(String)
	 * @see de.jena.model.glt.GltPackage#getSystemDescriptionRequest_Id()
	 * @model unique="false"
	 * @generated
	 */
	String getId();

	/**
	 * Sets the value of the '{@link de.jena.model.glt.SystemDescriptionRequest#getId <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Id</em>' attribute.
	 * @see #getId()
	 * @generated
	 */
	void setId(String value);

	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see de.jena.model.glt.GltPackage#getSystemDescriptionRequest_Name()
	 * @model unique="false"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link de.jena.model.glt.SystemDescriptionRequest#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Directory</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Directory</em>' attribute.
	 * @see #setDirectory(String)
	 * @see de.jena.model.glt.GltPackage#getSystemDescriptionRequest_Directory()
	 * @model unique="false"
	 * @generated
	 */
	String getDirectory();

	/**
	 * Sets the value of the '{@link de.jena.model.glt.SystemDescriptionRequest#getDirectory <em>Directory</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Directory</em>' attribute.
	 * @see #getDirectory()
	 * @generated
	 */
	void setDirectory(String value);

	/**
	 * Returns the value of the '<em><b>Port</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Port</em>' attribute.
	 * @see #setPort(Integer)
	 * @see de.jena.model.glt.GltPackage#getSystemDescriptionRequest_Port()
	 * @model unique="false"
	 * @generated
	 */
	Integer getPort();

	/**
	 * Sets the value of the '{@link de.jena.model.glt.SystemDescriptionRequest#getPort <em>Port</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Port</em>' attribute.
	 * @see #getPort()
	 * @generated
	 */
	void setPort(Integer value);

	/**
	 * Returns the value of the '<em><b>External Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>External Id</em>' attribute.
	 * @see #setExternalId(Integer)
	 * @see de.jena.model.glt.GltPackage#getSystemDescriptionRequest_ExternalId()
	 * @model unique="false"
	 * @generated
	 */
	Integer getExternalId();

	/**
	 * Sets the value of the '{@link de.jena.model.glt.SystemDescriptionRequest#getExternalId <em>External Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>External Id</em>' attribute.
	 * @see #getExternalId()
	 * @generated
	 */
	void setExternalId(Integer value);

	/**
	 * Returns the value of the '<em><b>Ip</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Ip</em>' attribute.
	 * @see #setIp(String)
	 * @see de.jena.model.glt.GltPackage#getSystemDescriptionRequest_Ip()
	 * @model unique="false"
	 * @generated
	 */
	String getIp();

	/**
	 * Sets the value of the '{@link de.jena.model.glt.SystemDescriptionRequest#getIp <em>Ip</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Ip</em>' attribute.
	 * @see #getIp()
	 * @generated
	 */
	void setIp(String value);

	/**
	 * Returns the value of the '<em><b>Lon</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Lon</em>' attribute.
	 * @see #setLon(Double)
	 * @see de.jena.model.glt.GltPackage#getSystemDescriptionRequest_Lon()
	 * @model unique="false"
	 * @generated
	 */
	Double getLon();

	/**
	 * Sets the value of the '{@link de.jena.model.glt.SystemDescriptionRequest#getLon <em>Lon</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Lon</em>' attribute.
	 * @see #getLon()
	 * @generated
	 */
	void setLon(Double value);

	/**
	 * Returns the value of the '<em><b>Lat</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Lat</em>' attribute.
	 * @see #setLat(Double)
	 * @see de.jena.model.glt.GltPackage#getSystemDescriptionRequest_Lat()
	 * @model unique="false"
	 * @generated
	 */
	Double getLat();

	/**
	 * Sets the value of the '{@link de.jena.model.glt.SystemDescriptionRequest#getLat <em>Lat</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Lat</em>' attribute.
	 * @see #getLat()
	 * @generated
	 */
	void setLat(Double value);

	/**
	 * Returns the value of the '<em><b>Excluded</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Excluded</em>' attribute.
	 * @see #setExcluded(Boolean)
	 * @see de.jena.model.glt.GltPackage#getSystemDescriptionRequest_Excluded()
	 * @model unique="false"
	 * @generated
	 */
	Boolean getExcluded();

	/**
	 * Sets the value of the '{@link de.jena.model.glt.SystemDescriptionRequest#getExcluded <em>Excluded</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Excluded</em>' attribute.
	 * @see #getExcluded()
	 * @generated
	 */
	void setExcluded(Boolean value);

	/**
	 * Returns the value of the '<em><b>Flags</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Flags</em>' attribute.
	 * @see #setFlags(Integer)
	 * @see de.jena.model.glt.GltPackage#getSystemDescriptionRequest_Flags()
	 * @model unique="false"
	 * @generated
	 */
	Integer getFlags();

	/**
	 * Sets the value of the '{@link de.jena.model.glt.SystemDescriptionRequest#getFlags <em>Flags</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Flags</em>' attribute.
	 * @see #getFlags()
	 * @generated
	 */
	void setFlags(Integer value);

} // SystemDescriptionRequest
