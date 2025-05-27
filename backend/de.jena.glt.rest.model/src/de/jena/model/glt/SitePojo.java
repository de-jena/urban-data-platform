/*
 */
package de.jena.model.glt;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

import org.osgi.annotation.versioning.ProviderType;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Site Pojo</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.jena.model.glt.SitePojo#getId <em>Id</em>}</li>
 *   <li>{@link de.jena.model.glt.SitePojo#getName <em>Name</em>}</li>
 *   <li>{@link de.jena.model.glt.SitePojo#getPrefix <em>Prefix</em>}</li>
 *   <li>{@link de.jena.model.glt.SitePojo#getIp <em>Ip</em>}</li>
 *   <li>{@link de.jena.model.glt.SitePojo#getDirectory <em>Directory</em>}</li>
 *   <li>{@link de.jena.model.glt.SitePojo#getPort <em>Port</em>}</li>
 *   <li>{@link de.jena.model.glt.SitePojo#getLon <em>Lon</em>}</li>
 *   <li>{@link de.jena.model.glt.SitePojo#getLat <em>Lat</em>}</li>
 *   <li>{@link de.jena.model.glt.SitePojo#getShallow <em>Shallow</em>}</li>
 *   <li>{@link de.jena.model.glt.SitePojo#getExcluded <em>Excluded</em>}</li>
 *   <li>{@link de.jena.model.glt.SitePojo#getExternalId <em>External Id</em>}</li>
 *   <li>{@link de.jena.model.glt.SitePojo#getAddress <em>Address</em>}</li>
 *   <li>{@link de.jena.model.glt.SitePojo#getSource <em>Source</em>}</li>
 *   <li>{@link de.jena.model.glt.SitePojo#getChildren <em>Children</em>}</li>
 *   <li>{@link de.jena.model.glt.SitePojo#getFlags <em>Flags</em>}</li>
 *   <li>{@link de.jena.model.glt.SitePojo#getCylonNetwork <em>Cylon Network</em>}</li>
 * </ul>
 *
 * @see de.jena.model.glt.GltPackage#getSitePojo()
 * @model
 * @generated
 */
@ProviderType
public interface SitePojo extends EObject {
	/**
	 * Returns the value of the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Id</em>' attribute.
	 * @see #setId(String)
	 * @see de.jena.model.glt.GltPackage#getSitePojo_Id()
	 * @model
	 * @generated
	 */
	String getId();

	/**
	 * Sets the value of the '{@link de.jena.model.glt.SitePojo#getId <em>Id</em>}' attribute.
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
	 * @see de.jena.model.glt.GltPackage#getSitePojo_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link de.jena.model.glt.SitePojo#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Prefix</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Prefix</em>' attribute.
	 * @see #setPrefix(String)
	 * @see de.jena.model.glt.GltPackage#getSitePojo_Prefix()
	 * @model
	 * @generated
	 */
	String getPrefix();

	/**
	 * Sets the value of the '{@link de.jena.model.glt.SitePojo#getPrefix <em>Prefix</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Prefix</em>' attribute.
	 * @see #getPrefix()
	 * @generated
	 */
	void setPrefix(String value);

	/**
	 * Returns the value of the '<em><b>Ip</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Ip</em>' attribute.
	 * @see #setIp(String)
	 * @see de.jena.model.glt.GltPackage#getSitePojo_Ip()
	 * @model
	 * @generated
	 */
	String getIp();

	/**
	 * Sets the value of the '{@link de.jena.model.glt.SitePojo#getIp <em>Ip</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Ip</em>' attribute.
	 * @see #getIp()
	 * @generated
	 */
	void setIp(String value);

	/**
	 * Returns the value of the '<em><b>Directory</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Directory</em>' attribute.
	 * @see #setDirectory(String)
	 * @see de.jena.model.glt.GltPackage#getSitePojo_Directory()
	 * @model
	 * @generated
	 */
	String getDirectory();

	/**
	 * Sets the value of the '{@link de.jena.model.glt.SitePojo#getDirectory <em>Directory</em>}' attribute.
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
	 * @see de.jena.model.glt.GltPackage#getSitePojo_Port()
	 * @model
	 * @generated
	 */
	Integer getPort();

	/**
	 * Sets the value of the '{@link de.jena.model.glt.SitePojo#getPort <em>Port</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Port</em>' attribute.
	 * @see #getPort()
	 * @generated
	 */
	void setPort(Integer value);

	/**
	 * Returns the value of the '<em><b>Lon</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Lon</em>' attribute.
	 * @see #setLon(Double)
	 * @see de.jena.model.glt.GltPackage#getSitePojo_Lon()
	 * @model
	 * @generated
	 */
	Double getLon();

	/**
	 * Sets the value of the '{@link de.jena.model.glt.SitePojo#getLon <em>Lon</em>}' attribute.
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
	 * @see de.jena.model.glt.GltPackage#getSitePojo_Lat()
	 * @model
	 * @generated
	 */
	Double getLat();

	/**
	 * Sets the value of the '{@link de.jena.model.glt.SitePojo#getLat <em>Lat</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Lat</em>' attribute.
	 * @see #getLat()
	 * @generated
	 */
	void setLat(Double value);

	/**
	 * Returns the value of the '<em><b>Shallow</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Shallow</em>' attribute.
	 * @see #setShallow(Boolean)
	 * @see de.jena.model.glt.GltPackage#getSitePojo_Shallow()
	 * @model
	 * @generated
	 */
	Boolean getShallow();

	/**
	 * Sets the value of the '{@link de.jena.model.glt.SitePojo#getShallow <em>Shallow</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Shallow</em>' attribute.
	 * @see #getShallow()
	 * @generated
	 */
	void setShallow(Boolean value);

	/**
	 * Returns the value of the '<em><b>Excluded</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Excluded</em>' attribute.
	 * @see #setExcluded(Boolean)
	 * @see de.jena.model.glt.GltPackage#getSitePojo_Excluded()
	 * @model
	 * @generated
	 */
	Boolean getExcluded();

	/**
	 * Sets the value of the '{@link de.jena.model.glt.SitePojo#getExcluded <em>Excluded</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Excluded</em>' attribute.
	 * @see #getExcluded()
	 * @generated
	 */
	void setExcluded(Boolean value);

	/**
	 * Returns the value of the '<em><b>External Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>External Id</em>' attribute.
	 * @see #setExternalId(Integer)
	 * @see de.jena.model.glt.GltPackage#getSitePojo_ExternalId()
	 * @model
	 * @generated
	 */
	Integer getExternalId();

	/**
	 * Sets the value of the '{@link de.jena.model.glt.SitePojo#getExternalId <em>External Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>External Id</em>' attribute.
	 * @see #getExternalId()
	 * @generated
	 */
	void setExternalId(Integer value);

	/**
	 * Returns the value of the '<em><b>Address</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Address</em>' reference.
	 * @see #setAddress(AddressPojo)
	 * @see de.jena.model.glt.GltPackage#getSitePojo_Address()
	 * @model
	 * @generated
	 */
	AddressPojo getAddress();

	/**
	 * Sets the value of the '{@link de.jena.model.glt.SitePojo#getAddress <em>Address</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Address</em>' reference.
	 * @see #getAddress()
	 * @generated
	 */
	void setAddress(AddressPojo value);

	/**
	 * Returns the value of the '<em><b>Source</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Source</em>' attribute.
	 * @see #setSource(String)
	 * @see de.jena.model.glt.GltPackage#getSitePojo_Source()
	 * @model
	 * @generated
	 */
	String getSource();

	/**
	 * Sets the value of the '{@link de.jena.model.glt.SitePojo#getSource <em>Source</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Source</em>' attribute.
	 * @see #getSource()
	 * @generated
	 */
	void setSource(String value);

	/**
	 * Returns the value of the '<em><b>Children</b></em>' reference list.
	 * The list contents are of type {@link de.jena.model.glt.SitePojo}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Children</em>' reference list.
	 * @see de.jena.model.glt.GltPackage#getSitePojo_Children()
	 * @model
	 * @generated
	 */
	EList<SitePojo> getChildren();

	/**
	 * Returns the value of the '<em><b>Flags</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Flags</em>' attribute.
	 * @see #setFlags(Integer)
	 * @see de.jena.model.glt.GltPackage#getSitePojo_Flags()
	 * @model
	 * @generated
	 */
	Integer getFlags();

	/**
	 * Sets the value of the '{@link de.jena.model.glt.SitePojo#getFlags <em>Flags</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Flags</em>' attribute.
	 * @see #getFlags()
	 * @generated
	 */
	void setFlags(Integer value);

	/**
	 * Returns the value of the '<em><b>Cylon Network</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Cylon Network</em>' attribute.
	 * @see #setCylonNetwork(Boolean)
	 * @see de.jena.model.glt.GltPackage#getSitePojo_CylonNetwork()
	 * @model
	 * @generated
	 */
	Boolean getCylonNetwork();

	/**
	 * Sets the value of the '{@link de.jena.model.glt.SitePojo#getCylonNetwork <em>Cylon Network</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Cylon Network</em>' attribute.
	 * @see #getCylonNetwork()
	 * @generated
	 */
	void setCylonNetwork(Boolean value);

} // SitePojo
