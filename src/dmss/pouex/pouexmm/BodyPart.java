/**
 */
package dmss.pouex.pouexmm;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Body Part</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link dmss.pouex.pouexmm.BodyPart#getSubparts <em>Subparts</em>}</li>
 *   <li>{@link dmss.pouex.pouexmm.BodyPart#getName <em>Name</em>}</li>
 * </ul>
 * </p>
 *
 * @see dmss.pouex.pouexmm.PouexmmPackage#getBodyPart()
 * @model
 * @generated
 */
public interface BodyPart extends EObject {
	/**
	 * Returns the value of the '<em><b>Subparts</b></em>' containment reference list.
	 * The list contents are of type {@link dmss.pouex.pouexmm.BodyPart}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Subparts</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Subparts</em>' containment reference list.
	 * @see dmss.pouex.pouexmm.PouexmmPackage#getBodyPart_Subparts()
	 * @model containment="true"
	 * @generated
	 */
	EList<BodyPart> getSubparts();

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
	 * @see dmss.pouex.pouexmm.PouexmmPackage#getBodyPart_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link dmss.pouex.pouexmm.BodyPart#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

} // BodyPart
