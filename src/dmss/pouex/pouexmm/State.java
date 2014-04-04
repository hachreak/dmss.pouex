/**
 */
package dmss.pouex.pouexmm;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>State</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link dmss.pouex.pouexmm.State#getActivationConditions <em>Activation Conditions</em>}</li>
 *   <li>{@link dmss.pouex.pouexmm.State#getName <em>Name</em>}</li>
 * </ul>
 * </p>
 *
 * @see dmss.pouex.pouexmm.PouexmmPackage#getState()
 * @model
 * @generated
 */
public interface State extends EObject {
	/**
	 * Returns the value of the '<em><b>Activation Conditions</b></em>' containment reference list.
	 * The list contents are of type {@link dmss.pouex.pouexmm.ActivationCondition}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Activation Conditions</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Activation Conditions</em>' containment reference list.
	 * @see dmss.pouex.pouexmm.PouexmmPackage#getState_ActivationConditions()
	 * @model containment="true" required="true"
	 * @generated
	 */
	EList<ActivationCondition> getActivationConditions();

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
	 * @see dmss.pouex.pouexmm.PouexmmPackage#getState_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link dmss.pouex.pouexmm.State#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

} // State
