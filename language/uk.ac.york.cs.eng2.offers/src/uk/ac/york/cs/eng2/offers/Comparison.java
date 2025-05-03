/**
 */
package uk.ac.york.cs.eng2.offers;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Comparison</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see uk.ac.york.cs.eng2.offers.OffersPackage#getComparison()
 * @model
 * @generated
 */
public enum Comparison implements Enumerator {
	/**
	 * The '<em><b>EQUAL</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #EQUAL_VALUE
	 * @generated
	 * @ordered
	 */
	EQUAL(0, "EQUAL", "EQUAL"),

	/**
	 * The '<em><b>NOT EQUAL</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #NOT_EQUAL_VALUE
	 * @generated
	 * @ordered
	 */
	NOT_EQUAL(1, "NOT_EQUAL", "NOT_EQUAL"),

	/**
	 * The '<em><b>LESS THAN</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #LESS_THAN_VALUE
	 * @generated
	 * @ordered
	 */
	LESS_THAN(2, "LESS_THAN", "LESS_THAN"),

	/**
	 * The '<em><b>LESS THAN EQUAL</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #LESS_THAN_EQUAL_VALUE
	 * @generated
	 * @ordered
	 */
	LESS_THAN_EQUAL(3, "LESS_THAN_EQUAL", "LESS_THAN_EQUAL"),

	/**
	 * The '<em><b>GREATER THAN</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #GREATER_THAN_VALUE
	 * @generated
	 * @ordered
	 */
	GREATER_THAN(4, "GREATER_THAN", "GREATER_THAN"),

	/**
	 * The '<em><b>GREATER THAN EQUAL</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #GREATER_THAN_EQUAL_VALUE
	 * @generated
	 * @ordered
	 */
	GREATER_THAN_EQUAL(5, "GREATER_THAN_EQUAL", "GREATER_THAN_EQUAL");

	/**
	 * The '<em><b>EQUAL</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #EQUAL
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int EQUAL_VALUE = 0;

	/**
	 * The '<em><b>NOT EQUAL</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #NOT_EQUAL
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int NOT_EQUAL_VALUE = 1;

	/**
	 * The '<em><b>LESS THAN</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #LESS_THAN
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int LESS_THAN_VALUE = 2;

	/**
	 * The '<em><b>LESS THAN EQUAL</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #LESS_THAN_EQUAL
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int LESS_THAN_EQUAL_VALUE = 3;

	/**
	 * The '<em><b>GREATER THAN</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #GREATER_THAN
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int GREATER_THAN_VALUE = 4;

	/**
	 * The '<em><b>GREATER THAN EQUAL</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #GREATER_THAN_EQUAL
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int GREATER_THAN_EQUAL_VALUE = 5;

	/**
	 * An array of all the '<em><b>Comparison</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final Comparison[] VALUES_ARRAY =
		new Comparison[] {
			EQUAL,
			NOT_EQUAL,
			LESS_THAN,
			LESS_THAN_EQUAL,
			GREATER_THAN,
			GREATER_THAN_EQUAL,
		};

	/**
	 * A public read-only list of all the '<em><b>Comparison</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<Comparison> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Comparison</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param literal the literal.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static Comparison get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			Comparison result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Comparison</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name the name.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static Comparison getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			Comparison result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Comparison</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the integer value.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static Comparison get(int value) {
		switch (value) {
			case EQUAL_VALUE: return EQUAL;
			case NOT_EQUAL_VALUE: return NOT_EQUAL;
			case LESS_THAN_VALUE: return LESS_THAN;
			case LESS_THAN_EQUAL_VALUE: return LESS_THAN_EQUAL;
			case GREATER_THAN_VALUE: return GREATER_THAN;
			case GREATER_THAN_EQUAL_VALUE: return GREATER_THAN_EQUAL;
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
	private Comparison(int value, String name, String literal) {
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
	
} //Comparison
