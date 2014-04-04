/**
 */
package dmss.pouex.pouexmm;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Mathematic Operator</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see dmss.pouex.pouexmm.PouexmmPackage#getMathematicOperator()
 * @model
 * @generated
 */
public enum MathematicOperator implements Enumerator {
	/**
	 * The '<em><b>ADDITION</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ADDITION_VALUE
	 * @generated
	 * @ordered
	 */
	ADDITION(0, "ADDITION", "ADDITION"),

	/**
	 * The '<em><b>SUBTRACTION</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #SUBTRACTION_VALUE
	 * @generated
	 * @ordered
	 */
	SUBTRACTION(1, "SUBTRACTION", "SUBTRACTION"),

	/**
	 * The '<em><b>MULTIPLICATION</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #MULTIPLICATION_VALUE
	 * @generated
	 * @ordered
	 */
	MULTIPLICATION(2, "MULTIPLICATION", "MULTIPLICATION"),

	/**
	 * The '<em><b>DIVISION</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #DIVISION_VALUE
	 * @generated
	 * @ordered
	 */
	DIVISION(3, "DIVISION", "DIVISION"),

	/**
	 * The '<em><b>MODULE</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #MODULE_VALUE
	 * @generated
	 * @ordered
	 */
	MODULE(4, "MODULE", "MODULE");

	/**
	 * The '<em><b>ADDITION</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>ADDITION</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #ADDITION
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int ADDITION_VALUE = 0;

	/**
	 * The '<em><b>SUBTRACTION</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>SUBTRACTION</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #SUBTRACTION
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int SUBTRACTION_VALUE = 1;

	/**
	 * The '<em><b>MULTIPLICATION</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>MULTIPLICATION</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #MULTIPLICATION
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int MULTIPLICATION_VALUE = 2;

	/**
	 * The '<em><b>DIVISION</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>DIVISION</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #DIVISION
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int DIVISION_VALUE = 3;

	/**
	 * The '<em><b>MODULE</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>MODULE</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #MODULE
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int MODULE_VALUE = 4;

	/**
	 * An array of all the '<em><b>Mathematic Operator</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final MathematicOperator[] VALUES_ARRAY =
		new MathematicOperator[] {
			ADDITION,
			SUBTRACTION,
			MULTIPLICATION,
			DIVISION,
			MODULE,
		};

	/**
	 * A public read-only list of all the '<em><b>Mathematic Operator</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<MathematicOperator> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Mathematic Operator</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static MathematicOperator get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			MathematicOperator result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Mathematic Operator</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static MathematicOperator getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			MathematicOperator result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Mathematic Operator</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static MathematicOperator get(int value) {
		switch (value) {
			case ADDITION_VALUE: return ADDITION;
			case SUBTRACTION_VALUE: return SUBTRACTION;
			case MULTIPLICATION_VALUE: return MULTIPLICATION;
			case DIVISION_VALUE: return DIVISION;
			case MODULE_VALUE: return MODULE;
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
	private MathematicOperator(int value, String name, String literal) {
		this.value = value;
		this.name = name;
		this.literal = literal;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getValue() {
	  return value;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getName() {
	  return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
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
	
} //MathematicOperator
