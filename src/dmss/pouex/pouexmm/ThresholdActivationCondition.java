/**
 */
package dmss.pouex.pouexmm;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Threshold Activation Condition</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link dmss.pouex.pouexmm.ThresholdActivationCondition#getThreshold <em>Threshold</em>}</li>
 * </ul>
 * </p>
 *
 * @see dmss.pouex.pouexmm.PouexmmPackage#getThresholdActivationCondition()
 * @model abstract="true"
 * @generated
 */
public interface ThresholdActivationCondition extends ActivationCondition {
	/**
	 * Returns the value of the '<em><b>Threshold</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Threshold</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Threshold</em>' attribute.
	 * @see #setThreshold(double)
	 * @see dmss.pouex.pouexmm.PouexmmPackage#getThresholdActivationCondition_Threshold()
	 * @model required="true"
	 * @generated
	 */
	double getThreshold();

	/**
	 * Sets the value of the '{@link dmss.pouex.pouexmm.ThresholdActivationCondition#getThreshold <em>Threshold</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Threshold</em>' attribute.
	 * @see #getThreshold()
	 * @generated
	 */
	void setThreshold(double value);

} // ThresholdActivationCondition
