/**
 */
package dmss.pouex.pouexmm;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Action</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link dmss.pouex.pouexmm.Action#getInfluences <em>Influences</em>}</li>
 *   <li>{@link dmss.pouex.pouexmm.Action#getName <em>Name</em>}</li>
 *   <li>{@link dmss.pouex.pouexmm.Action#getCurrentStatus <em>Current Status</em>}</li>
 * </ul>
 * </p>
 *
 * @see dmss.pouex.pouexmm.PouexmmPackage#getAction()
 * @model abstract="true"
 *        annotation="http://www.eclipse.org/emf/2002/Ecore constraints='cantModifyFeatureTwiceOrMore'"
 *        annotation="http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot cantModifyFeatureTwiceOrMore='self.influences->isUnique(i: Influence | i.feature.name)'"
 * @generated
 */
public interface Action extends EObject {
	/**
	 * Returns the value of the '<em><b>Influences</b></em>' containment reference list.
	 * The list contents are of type {@link dmss.pouex.pouexmm.Influence}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Influences</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Influences</em>' containment reference list.
	 * @see dmss.pouex.pouexmm.PouexmmPackage#getAction_Influences()
	 * @model containment="true"
	 * @generated
	 */
	EList<Influence> getInfluences();

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
	 * @see dmss.pouex.pouexmm.PouexmmPackage#getAction_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link dmss.pouex.pouexmm.Action#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Current Status</b></em>' attribute.
	 * The literals are from the enumeration {@link dmss.pouex.pouexmm.ActionStatus}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Current Status</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Current Status</em>' attribute.
	 * @see dmss.pouex.pouexmm.ActionStatus
	 * @see #setCurrentStatus(ActionStatus)
	 * @see dmss.pouex.pouexmm.PouexmmPackage#getAction_CurrentStatus()
	 * @model
	 * @generated
	 */
	ActionStatus getCurrentStatus();

	/**
	 * Sets the value of the '{@link dmss.pouex.pouexmm.Action#getCurrentStatus <em>Current Status</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Current Status</em>' attribute.
	 * @see dmss.pouex.pouexmm.ActionStatus
	 * @see #getCurrentStatus()
	 * @generated
	 */
	void setCurrentStatus(ActionStatus value);

} // Action
