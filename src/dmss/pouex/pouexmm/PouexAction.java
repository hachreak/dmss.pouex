/**
 */
package dmss.pouex.pouexmm;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Pouex Action</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link dmss.pouex.pouexmm.PouexAction#getSubtype <em>Subtype</em>}</li>
 *   <li>{@link dmss.pouex.pouexmm.PouexAction#getFeatures <em>Features</em>}</li>
 * </ul>
 * </p>
 *
 * @see dmss.pouex.pouexmm.PouexmmPackage#getPouexAction()
 * @model
 * @generated
 */
public interface PouexAction extends Action {
	/**
	 * Returns the value of the '<em><b>Subtype</b></em>' containment reference list.
	 * The list contents are of type {@link dmss.pouex.pouexmm.PouexAction}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Subtype</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Subtype</em>' containment reference list.
	 * @see dmss.pouex.pouexmm.PouexmmPackage#getPouexAction_Subtype()
	 * @model containment="true"
	 * @generated
	 */
	EList<PouexAction> getSubtype();

	/**
	 * Returns the value of the '<em><b>Features</b></em>' containment reference list.
	 * The list contents are of type {@link dmss.pouex.pouexmm.PouexActionFeature}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Features</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Features</em>' containment reference list.
	 * @see dmss.pouex.pouexmm.PouexmmPackage#getPouexAction_Features()
	 * @model containment="true"
	 * @generated
	 */
	EList<PouexActionFeature> getFeatures();

} // PouexAction
