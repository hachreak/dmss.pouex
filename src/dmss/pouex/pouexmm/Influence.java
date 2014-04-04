/**
 */
package dmss.pouex.pouexmm;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Influence</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link dmss.pouex.pouexmm.Influence#getFeature <em>Feature</em>}</li>
 *   <li>{@link dmss.pouex.pouexmm.Influence#getOperator <em>Operator</em>}</li>
 *   <li>{@link dmss.pouex.pouexmm.Influence#getValue <em>Value</em>}</li>
 * </ul>
 * </p>
 *
 * @see dmss.pouex.pouexmm.PouexmmPackage#getInfluence()
 * @model
 * @generated
 */
public interface Influence extends EObject {
	/**
	 * Returns the value of the '<em><b>Feature</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Feature</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Feature</em>' reference.
	 * @see #setFeature(PouexFeature)
	 * @see dmss.pouex.pouexmm.PouexmmPackage#getInfluence_Feature()
	 * @model required="true"
	 * @generated
	 */
	PouexFeature getFeature();

	/**
	 * Sets the value of the '{@link dmss.pouex.pouexmm.Influence#getFeature <em>Feature</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Feature</em>' reference.
	 * @see #getFeature()
	 * @generated
	 */
	void setFeature(PouexFeature value);

	/**
	 * Returns the value of the '<em><b>Operator</b></em>' attribute.
	 * The literals are from the enumeration {@link dmss.pouex.pouexmm.MathematicOperator}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Operator</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Operator</em>' attribute.
	 * @see dmss.pouex.pouexmm.MathematicOperator
	 * @see #setOperator(MathematicOperator)
	 * @see dmss.pouex.pouexmm.PouexmmPackage#getInfluence_Operator()
	 * @model
	 * @generated
	 */
	MathematicOperator getOperator();

	/**
	 * Sets the value of the '{@link dmss.pouex.pouexmm.Influence#getOperator <em>Operator</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Operator</em>' attribute.
	 * @see dmss.pouex.pouexmm.MathematicOperator
	 * @see #getOperator()
	 * @generated
	 */
	void setOperator(MathematicOperator value);

	/**
	 * Returns the value of the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Value</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Value</em>' attribute.
	 * @see #setValue(double)
	 * @see dmss.pouex.pouexmm.PouexmmPackage#getInfluence_Value()
	 * @model
	 * @generated
	 */
	double getValue();

	/**
	 * Sets the value of the '{@link dmss.pouex.pouexmm.Influence#getValue <em>Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Value</em>' attribute.
	 * @see #getValue()
	 * @generated
	 */
	void setValue(double value);

} // Influence
