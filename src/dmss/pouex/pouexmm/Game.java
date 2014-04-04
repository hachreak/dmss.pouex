/**
 */
package dmss.pouex.pouexmm;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Game</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link dmss.pouex.pouexmm.Game#getPouex <em>Pouex</em>}</li>
 * </ul>
 * </p>
 *
 * @see dmss.pouex.pouexmm.PouexmmPackage#getGame()
 * @model
 * @generated
 */
public interface Game extends EObject {
	/**
	 * Returns the value of the '<em><b>Pouex</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Pouex</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Pouex</em>' containment reference.
	 * @see #setPouex(Pouex)
	 * @see dmss.pouex.pouexmm.PouexmmPackage#getGame_Pouex()
	 * @model containment="true" required="true"
	 * @generated
	 */
	Pouex getPouex();

	/**
	 * Sets the value of the '{@link dmss.pouex.pouexmm.Game#getPouex <em>Pouex</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Pouex</em>' containment reference.
	 * @see #getPouex()
	 * @generated
	 */
	void setPouex(Pouex value);

} // Game
