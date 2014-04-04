/**
 */
package dmss.pouex.pouexmm;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see dmss.pouex.pouexmm.PouexmmPackage
 * @generated
 */
public interface PouexmmFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	PouexmmFactory eINSTANCE = dmss.pouex.pouexmm.impl.PouexmmFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Game</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Game</em>'.
	 * @generated
	 */
	Game createGame();

	/**
	 * Returns a new object of class '<em>Pouex</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Pouex</em>'.
	 * @generated
	 */
	Pouex createPouex();

	/**
	 * Returns a new object of class '<em>Physic</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Physic</em>'.
	 * @generated
	 */
	Physic createPhysic();

	/**
	 * Returns a new object of class '<em>Emotional</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Emotional</em>'.
	 * @generated
	 */
	Emotional createEmotional();

	/**
	 * Returns a new object of class '<em>State</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>State</em>'.
	 * @generated
	 */
	State createState();

	/**
	 * Returns a new object of class '<em>Time Event</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Time Event</em>'.
	 * @generated
	 */
	TimeEvent createTimeEvent();

	/**
	 * Returns a new object of class '<em>Influence</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Influence</em>'.
	 * @generated
	 */
	Influence createInfluence();

	/**
	 * Returns a new object of class '<em>Body Part</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Body Part</em>'.
	 * @generated
	 */
	BodyPart createBodyPart();

	/**
	 * Returns a new object of class '<em>Pouex Action</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Pouex Action</em>'.
	 * @generated
	 */
	PouexAction createPouexAction();

	/**
	 * Returns a new object of class '<em>Pouex Action Feature</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Pouex Action Feature</em>'.
	 * @generated
	 */
	PouexActionFeature createPouexActionFeature();

	/**
	 * Returns a new object of class '<em>Min Threshold Activation Condition</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Min Threshold Activation Condition</em>'.
	 * @generated
	 */
	MinThresholdActivationCondition createMinThresholdActivationCondition();

	/**
	 * Returns a new object of class '<em>Max Threshold Activation Condition</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Max Threshold Activation Condition</em>'.
	 * @generated
	 */
	MaxThresholdActivationCondition createMaxThresholdActivationCondition();

	/**
	 * Returns a new object of class '<em>Repeated Action</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Repeated Action</em>'.
	 * @generated
	 */
	RepeatedAction createRepeatedAction();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	PouexmmPackage getPouexmmPackage();

} //PouexmmFactory
