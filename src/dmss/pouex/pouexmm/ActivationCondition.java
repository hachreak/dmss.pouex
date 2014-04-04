/**
 */
package dmss.pouex.pouexmm;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Activation Condition</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link dmss.pouex.pouexmm.ActivationCondition#getFeatures <em>Features</em>}</li>
 *   <li>{@link dmss.pouex.pouexmm.ActivationCondition#getName <em>Name</em>}</li>
 * </ul>
 * </p>
 *
 * @see dmss.pouex.pouexmm.PouexmmPackage#getActivationCondition()
 * @model abstract="true"
 * @generated
 */
public interface ActivationCondition extends EObject {
	/**
	 * Returns the value of the '<em><b>Features</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Features</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Features</em>' reference.
	 * @see #setFeatures(PouexFeature)
	 * @see dmss.pouex.pouexmm.PouexmmPackage#getActivationCondition_Features()
	 * @model
	 * @generated
	 */
	PouexFeature getFeatures();

	/**
	 * Sets the value of the '{@link dmss.pouex.pouexmm.ActivationCondition#getFeatures <em>Features</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Features</em>' reference.
	 * @see #getFeatures()
	 * @generated
	 */
	void setFeatures(PouexFeature value);

	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see dmss.pouex.pouexmm.PouexmmPackage#getActivationCondition_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link dmss.pouex.pouexmm.ActivationCondition#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

} // ActivationCondition
