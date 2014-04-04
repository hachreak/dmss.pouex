/**
 */
package dmss.pouex.pouexmm.util;

import dmss.pouex.pouexmm.*;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.Switch;

/**
 * <!-- begin-user-doc -->
 * The <b>Switch</b> for the model's inheritance hierarchy.
 * It supports the call {@link #doSwitch(EObject) doSwitch(object)}
 * to invoke the <code>caseXXX</code> method for each class of the model,
 * starting with the actual class of the object
 * and proceeding up the inheritance hierarchy
 * until a non-null result is returned,
 * which is the result of the switch.
 * <!-- end-user-doc -->
 * @see dmss.pouex.pouexmm.PouexmmPackage
 * @generated
 */
public class PouexmmSwitch<T> extends Switch<T> {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static PouexmmPackage modelPackage;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PouexmmSwitch() {
		if (modelPackage == null) {
			modelPackage = PouexmmPackage.eINSTANCE;
		}
	}

	/**
	 * Checks whether this is a switch for the given package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @parameter ePackage the package in question.
	 * @return whether this is a switch for the given package.
	 * @generated
	 */
	@Override
	protected boolean isSwitchFor(EPackage ePackage) {
		return ePackage == modelPackage;
	}

	/**
	 * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the first non-null result returned by a <code>caseXXX</code> call.
	 * @generated
	 */
	@Override
	protected T doSwitch(int classifierID, EObject theEObject) {
		switch (classifierID) {
			case PouexmmPackage.GAME: {
				Game game = (Game)theEObject;
				T result = caseGame(game);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case PouexmmPackage.POUEX: {
				Pouex pouex = (Pouex)theEObject;
				T result = casePouex(pouex);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case PouexmmPackage.POUEX_FEATURE: {
				PouexFeature pouexFeature = (PouexFeature)theEObject;
				T result = casePouexFeature(pouexFeature);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case PouexmmPackage.PHYSIC: {
				Physic physic = (Physic)theEObject;
				T result = casePhysic(physic);
				if (result == null) result = casePouexFeature(physic);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case PouexmmPackage.EMOTIONAL: {
				Emotional emotional = (Emotional)theEObject;
				T result = caseEmotional(emotional);
				if (result == null) result = casePouexFeature(emotional);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case PouexmmPackage.STATE: {
				State state = (State)theEObject;
				T result = caseState(state);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case PouexmmPackage.ACTIVATION_CONDITION: {
				ActivationCondition activationCondition = (ActivationCondition)theEObject;
				T result = caseActivationCondition(activationCondition);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case PouexmmPackage.ACTION: {
				Action action = (Action)theEObject;
				T result = caseAction(action);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case PouexmmPackage.TIME_EVENT: {
				TimeEvent timeEvent = (TimeEvent)theEObject;
				T result = caseTimeEvent(timeEvent);
				if (result == null) result = caseRepeatedAction(timeEvent);
				if (result == null) result = caseAction(timeEvent);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case PouexmmPackage.INFLUENCE: {
				Influence influence = (Influence)theEObject;
				T result = caseInfluence(influence);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case PouexmmPackage.BODY_PART: {
				BodyPart bodyPart = (BodyPart)theEObject;
				T result = caseBodyPart(bodyPart);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case PouexmmPackage.POUEX_ACTION: {
				PouexAction pouexAction = (PouexAction)theEObject;
				T result = casePouexAction(pouexAction);
				if (result == null) result = caseAction(pouexAction);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case PouexmmPackage.POUEX_ACTION_FEATURE: {
				PouexActionFeature pouexActionFeature = (PouexActionFeature)theEObject;
				T result = casePouexActionFeature(pouexActionFeature);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case PouexmmPackage.MIN_THRESHOLD_ACTIVATION_CONDITION: {
				MinThresholdActivationCondition minThresholdActivationCondition = (MinThresholdActivationCondition)theEObject;
				T result = caseMinThresholdActivationCondition(minThresholdActivationCondition);
				if (result == null) result = caseThresholdActivationCondition(minThresholdActivationCondition);
				if (result == null) result = caseActivationCondition(minThresholdActivationCondition);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case PouexmmPackage.MAX_THRESHOLD_ACTIVATION_CONDITION: {
				MaxThresholdActivationCondition maxThresholdActivationCondition = (MaxThresholdActivationCondition)theEObject;
				T result = caseMaxThresholdActivationCondition(maxThresholdActivationCondition);
				if (result == null) result = caseThresholdActivationCondition(maxThresholdActivationCondition);
				if (result == null) result = caseActivationCondition(maxThresholdActivationCondition);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case PouexmmPackage.THRESHOLD_ACTIVATION_CONDITION: {
				ThresholdActivationCondition thresholdActivationCondition = (ThresholdActivationCondition)theEObject;
				T result = caseThresholdActivationCondition(thresholdActivationCondition);
				if (result == null) result = caseActivationCondition(thresholdActivationCondition);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case PouexmmPackage.REPEATED_ACTION: {
				RepeatedAction repeatedAction = (RepeatedAction)theEObject;
				T result = caseRepeatedAction(repeatedAction);
				if (result == null) result = caseAction(repeatedAction);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			default: return defaultCase(theEObject);
		}
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Game</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Game</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseGame(Game object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Pouex</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Pouex</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePouex(Pouex object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Pouex Feature</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Pouex Feature</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePouexFeature(PouexFeature object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Physic</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Physic</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePhysic(Physic object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Emotional</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Emotional</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseEmotional(Emotional object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>State</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>State</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseState(State object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Activation Condition</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Activation Condition</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseActivationCondition(ActivationCondition object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Action</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Action</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAction(Action object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Time Event</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Time Event</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTimeEvent(TimeEvent object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Influence</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Influence</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseInfluence(Influence object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Body Part</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Body Part</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseBodyPart(BodyPart object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Pouex Action</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Pouex Action</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePouexAction(PouexAction object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Pouex Action Feature</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Pouex Action Feature</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePouexActionFeature(PouexActionFeature object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Min Threshold Activation Condition</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Min Threshold Activation Condition</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMinThresholdActivationCondition(MinThresholdActivationCondition object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Max Threshold Activation Condition</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Max Threshold Activation Condition</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMaxThresholdActivationCondition(MaxThresholdActivationCondition object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Threshold Activation Condition</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Threshold Activation Condition</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseThresholdActivationCondition(ThresholdActivationCondition object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Repeated Action</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Repeated Action</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRepeatedAction(RepeatedAction object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch, but this is the last case anyway.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject)
	 * @generated
	 */
	@Override
	public T defaultCase(EObject object) {
		return null;
	}

} //PouexmmSwitch
