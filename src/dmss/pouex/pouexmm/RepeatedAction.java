/**
 */
package dmss.pouex.pouexmm;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Repeated Action</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link dmss.pouex.pouexmm.RepeatedAction#getEachMillisec <em>Each Millisec</em>}</li>
 * </ul>
 * </p>
 *
 * @see dmss.pouex.pouexmm.PouexmmPackage#getRepeatedAction()
 * @model
 * @generated
 */
public interface RepeatedAction extends Action {
	/**
	 * Returns the value of the '<em><b>Each Millisec</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Each Millisec</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Each Millisec</em>' attribute.
	 * @see #setEachMillisec(double)
	 * @see dmss.pouex.pouexmm.PouexmmPackage#getRepeatedAction_EachMillisec()
	 * @model required="true"
	 * @generated
	 */
	double getEachMillisec();

	/**
	 * Sets the value of the '{@link dmss.pouex.pouexmm.RepeatedAction#getEachMillisec <em>Each Millisec</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Each Millisec</em>' attribute.
	 * @see #getEachMillisec()
	 * @generated
	 */
	void setEachMillisec(double value);

} // RepeatedAction
