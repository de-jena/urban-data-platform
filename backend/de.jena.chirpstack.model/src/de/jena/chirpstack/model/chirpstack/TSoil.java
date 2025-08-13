/*
 */
package de.jena.chirpstack.model.chirpstack;

import org.eclipse.sensinact.model.core.provider.Service;

import org.osgi.annotation.versioning.ProviderType;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>TSoil</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.jena.chirpstack.model.chirpstack.TSoil#getSoilWaterTension1 <em>Soil Water Tension1</em>}</li>
 *   <li>{@link de.jena.chirpstack.model.chirpstack.TSoil#getSoilWaterTension2 <em>Soil Water Tension2</em>}</li>
 *   <li>{@link de.jena.chirpstack.model.chirpstack.TSoil#getSoilMoistureRaw1 <em>Soil Moisture Raw1</em>}</li>
 *   <li>{@link de.jena.chirpstack.model.chirpstack.TSoil#getSoilMoistureRaw2 <em>Soil Moisture Raw2</em>}</li>
 *   <li>{@link de.jena.chirpstack.model.chirpstack.TSoil#getAmbientLight <em>Ambient Light</em>}</li>
 * </ul>
 *
 * @see de.jena.chirpstack.model.chirpstack.ChirpstackPackage#getTSoil()
 * @model
 * @generated
 */
@ProviderType
public interface TSoil extends Service {
	/**
	 * Returns the value of the '<em><b>Soil Water Tension1</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Soil Water Tension1</em>' attribute.
	 * @see #setSoilWaterTension1(double)
	 * @see de.jena.chirpstack.model.chirpstack.ChirpstackPackage#getTSoil_SoilWaterTension1()
	 * @model annotation="mapping path='object/soil_water_tension1'"
	 * @generated
	 */
	double getSoilWaterTension1();

	/**
	 * Sets the value of the '{@link de.jena.chirpstack.model.chirpstack.TSoil#getSoilWaterTension1 <em>Soil Water Tension1</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Soil Water Tension1</em>' attribute.
	 * @see #getSoilWaterTension1()
	 * @generated
	 */
	void setSoilWaterTension1(double value);

	/**
	 * Returns the value of the '<em><b>Soil Water Tension2</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Soil Water Tension2</em>' attribute.
	 * @see #setSoilWaterTension2(double)
	 * @see de.jena.chirpstack.model.chirpstack.ChirpstackPackage#getTSoil_SoilWaterTension2()
	 * @model annotation="mapping path='object/soil_water_tension2'"
	 * @generated
	 */
	double getSoilWaterTension2();

	/**
	 * Sets the value of the '{@link de.jena.chirpstack.model.chirpstack.TSoil#getSoilWaterTension2 <em>Soil Water Tension2</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Soil Water Tension2</em>' attribute.
	 * @see #getSoilWaterTension2()
	 * @generated
	 */
	void setSoilWaterTension2(double value);

	/**
	 * Returns the value of the '<em><b>Soil Moisture Raw1</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Soil Moisture Raw1</em>' attribute.
	 * @see #setSoilMoistureRaw1(double)
	 * @see de.jena.chirpstack.model.chirpstack.ChirpstackPackage#getTSoil_SoilMoistureRaw1()
	 * @model annotation="mapping path='object/soil_moisture_raw1'"
	 * @generated
	 */
	double getSoilMoistureRaw1();

	/**
	 * Sets the value of the '{@link de.jena.chirpstack.model.chirpstack.TSoil#getSoilMoistureRaw1 <em>Soil Moisture Raw1</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Soil Moisture Raw1</em>' attribute.
	 * @see #getSoilMoistureRaw1()
	 * @generated
	 */
	void setSoilMoistureRaw1(double value);

	/**
	 * Returns the value of the '<em><b>Soil Moisture Raw2</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Soil Moisture Raw2</em>' attribute.
	 * @see #setSoilMoistureRaw2(double)
	 * @see de.jena.chirpstack.model.chirpstack.ChirpstackPackage#getTSoil_SoilMoistureRaw2()
	 * @model annotation="mapping path='object/soil_moisture_raw2'"
	 * @generated
	 */
	double getSoilMoistureRaw2();

	/**
	 * Sets the value of the '{@link de.jena.chirpstack.model.chirpstack.TSoil#getSoilMoistureRaw2 <em>Soil Moisture Raw2</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Soil Moisture Raw2</em>' attribute.
	 * @see #getSoilMoistureRaw2()
	 * @generated
	 */
	void setSoilMoistureRaw2(double value);

	/**
	 * Returns the value of the '<em><b>Ambient Light</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Ambient Light</em>' attribute.
	 * @see #setAmbientLight(double)
	 * @see de.jena.chirpstack.model.chirpstack.ChirpstackPackage#getTSoil_AmbientLight()
	 * @model annotation="mapping path='object/ambient_light'"
	 * @generated
	 */
	double getAmbientLight();

	/**
	 * Sets the value of the '{@link de.jena.chirpstack.model.chirpstack.TSoil#getAmbientLight <em>Ambient Light</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Ambient Light</em>' attribute.
	 * @see #getAmbientLight()
	 * @generated
	 */
	void setAmbientLight(double value);

} // TSoil
