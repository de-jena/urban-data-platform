/*
 */
package geojson;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

import org.osgi.annotation.versioning.ProviderType;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Geometry Type</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see geojson.GeojsonPackage#getGeometryType()
 * @model
 * @generated
 */
@ProviderType
public enum GeometryType implements Enumerator {
	/**
	 * The '<em><b>Point</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #POINT_VALUE
	 * @generated
	 * @ordered
	 */
	POINT(0, "Point", "Point"),

	/**
	 * The '<em><b>Line String</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #LINE_STRING_VALUE
	 * @generated
	 * @ordered
	 */
	LINE_STRING(1, "LineString", "LineString"),

	/**
	 * The '<em><b>Polygon</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #POLYGON_VALUE
	 * @generated
	 * @ordered
	 */
	POLYGON(2, "Polygon", "Polygon"),

	/**
	 * The '<em><b>Multi Point</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #MULTI_POINT_VALUE
	 * @generated
	 * @ordered
	 */
	MULTI_POINT(3, "MultiPoint", "MultiPoint"),

	/**
	 * The '<em><b>Multi Line String</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #MULTI_LINE_STRING_VALUE
	 * @generated
	 * @ordered
	 */
	MULTI_LINE_STRING(4, "MultiLineString", "MultiLineString"),

	/**
	 * The '<em><b>Multi Polygon</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #MULTI_POLYGON_VALUE
	 * @generated
	 * @ordered
	 */
	MULTI_POLYGON(5, "MultiPolygon", "MultiPolygon"),

	/**
	 * The '<em><b>Geometry Collection</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #GEOMETRY_COLLECTION_VALUE
	 * @generated
	 * @ordered
	 */
	GEOMETRY_COLLECTION(6, "GeometryCollection", "GeometryCollection");

	/**
	 * The '<em><b>Point</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #POINT
	 * @model name="Point"
	 * @generated
	 * @ordered
	 */
	public static final int POINT_VALUE = 0;

	/**
	 * The '<em><b>Line String</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #LINE_STRING
	 * @model name="LineString"
	 * @generated
	 * @ordered
	 */
	public static final int LINE_STRING_VALUE = 1;

	/**
	 * The '<em><b>Polygon</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #POLYGON
	 * @model name="Polygon"
	 * @generated
	 * @ordered
	 */
	public static final int POLYGON_VALUE = 2;

	/**
	 * The '<em><b>Multi Point</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #MULTI_POINT
	 * @model name="MultiPoint"
	 * @generated
	 * @ordered
	 */
	public static final int MULTI_POINT_VALUE = 3;

	/**
	 * The '<em><b>Multi Line String</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #MULTI_LINE_STRING
	 * @model name="MultiLineString"
	 * @generated
	 * @ordered
	 */
	public static final int MULTI_LINE_STRING_VALUE = 4;

	/**
	 * The '<em><b>Multi Polygon</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #MULTI_POLYGON
	 * @model name="MultiPolygon"
	 * @generated
	 * @ordered
	 */
	public static final int MULTI_POLYGON_VALUE = 5;

	/**
	 * The '<em><b>Geometry Collection</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #GEOMETRY_COLLECTION
	 * @model name="GeometryCollection"
	 * @generated
	 * @ordered
	 */
	public static final int GEOMETRY_COLLECTION_VALUE = 6;

	/**
	 * An array of all the '<em><b>Geometry Type</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final GeometryType[] VALUES_ARRAY =
		new GeometryType[] {
			POINT,
			LINE_STRING,
			POLYGON,
			MULTI_POINT,
			MULTI_LINE_STRING,
			MULTI_POLYGON,
			GEOMETRY_COLLECTION,
		};

	/**
	 * A public read-only list of all the '<em><b>Geometry Type</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<GeometryType> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Geometry Type</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param literal the literal.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static GeometryType get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			GeometryType result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Geometry Type</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name the name.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static GeometryType getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			GeometryType result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Geometry Type</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the integer value.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static GeometryType get(int value) {
		switch (value) {
			case POINT_VALUE: return POINT;
			case LINE_STRING_VALUE: return LINE_STRING;
			case POLYGON_VALUE: return POLYGON;
			case MULTI_POINT_VALUE: return MULTI_POINT;
			case MULTI_LINE_STRING_VALUE: return MULTI_LINE_STRING;
			case MULTI_POLYGON_VALUE: return MULTI_POLYGON;
			case GEOMETRY_COLLECTION_VALUE: return GEOMETRY_COLLECTION;
		}
		return null;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private final int value;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private final String name;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private final String literal;

	/**
	 * Only this class can construct instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private GeometryType(int value, String name, String literal) {
		this.value = value;
		this.name = name;
		this.literal = literal;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int getValue() {
	  return value;
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
	public String getLiteral() {
	  return literal;
	}

	/**
	 * Returns the literal value of the enumerator, which is its string representation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		return literal;
	}
	
} //GeometryType
