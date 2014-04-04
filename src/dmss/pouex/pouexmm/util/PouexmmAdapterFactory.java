/**
 */
package dmss.pouex.pouexmm.util;

import dmss.pouex.pouexmm.*;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see dmss.pouex.pouexmm.PouexmmPackage
 * @generated
 */
public class PouexmmAdapterFactory extends AdapterFactoryImpl {
	/**
	 * The cached model package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static PouexmmPackage modelPackage;

	/**
	 * Creates an instance of the adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PouexmmAdapterFactory() {
		if (modelPackage == null) {
			modelPackage = PouexmmPackage.eINSTANCE;
		}
	}

	/**
	 * Returns whether this factory is applicable for the type of the object.
	 * <!-- begin-user-doc -->
	 * This implementation returns <code>true</code> if the object is either the model's package or is an instance object of the model.
	 * <!-- end-user-doc -->
	 * @return whether this factory is applicable for the type of the object.
	 * @generated
	 */
	@Override
	public boolean isFactoryForType(Object object) {
		if (object == modelPackage) {
			return true;
		}
		if (object instanceof EObject) {
			return ((EObject)object).eClass().getEPackage() == modelPackage;
		}
		return false;
	}

	/**
	 * The switch that delegates to the <code>createXXX</code> methods.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PouexmmSwitch<Adapter> modelSwitch =
		new PouexmmSwitch<Adapter>() {
			@Override
			public Adapter caseGame(Game object) {
				return createGameAdapter();
			}
			@Override
			public Adapter casePouex(Pouex object) {
				return createPouexAdapter();
			}
			@Override
			public Adapter casePouexFeature(PouexFeature object) {
				return createPouexFeatureAdapter();
			}
			@Override
			public Adapter casePhysic(Physic object) {
				return createPhysicAdapter();
			}
			@Override
			public Adapter caseEmotional(Emotional object) {
				return createEmotionalAdapter();
			}
			@Override
			public Adapter caseState(State object) {
				return createStateAdapter();
			}
			@Override
			public Adapter caseActivationCondition(ActivationCondition object) {
				return createActivationConditionAdapter();
			}
			@Override
			public Adapter caseAction(Action object) {
				return createActionAdapter();
			}
			@Override
			public Adapter caseTimeEvent(TimeEvent object) {
				return createTimeEventAdapter();
			}
			@Override
			public Adapter caseInfluence(Influence object) {
				return createInfluenceAdapter();
			}
			@Override
			public Adapter caseBodyPart(BodyPart object) {
				return createBodyPartAdapter();
			}
			@Override
			public Adapter casePouexAction(PouexAction object) {
				return createPouexActionAdapter();
			}
			@Override
			public Adapter casePouexActionFeature(PouexActionFeature object) {
				return createPouexActionFeatureAdapter();
			}
			@Override
			public Adapter caseMinThresholdActivationCondition(MinThresholdActivationCondition object) {
				return createMinThresholdActivationConditionAdapter();
			}
			@Override
			public Adapter caseMaxThresholdActivationCondition(MaxThresholdActivationCondition object) {
				return createMaxThresholdActivationConditionAdapter();
			}
			@Override
			public Adapter caseThresholdActivationCondition(ThresholdActivationCondition object) {
				return createThresholdActivationConditionAdapter();
			}
			@Override
			public Adapter caseRepeatedAction(RepeatedAction object) {
				return createRepeatedActionAdapter();
			}
			@Override
			public Adapter defaultCase(EObject object) {
				return createEObjectAdapter();
			}
		};

	/**
	 * Creates an adapter for the <code>target</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param target the object to adapt.
	 * @return the adapter for the <code>target</code>.
	 * @generated
	 */
	@Override
	public Adapter createAdapter(Notifier target) {
		return modelSwitch.doSwitch((EObject)target);
	}


	/**
	 * Creates a new adapter for an object of class '{@link dmss.pouex.pouexmm.Game <em>Game</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see dmss.pouex.pouexmm.Game
	 * @generated
	 */
	public Adapter createGameAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link dmss.pouex.pouexmm.Pouex <em>Pouex</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see dmss.pouex.pouexmm.Pouex
	 * @generated
	 */
	public Adapter createPouexAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link dmss.pouex.pouexmm.PouexFeature <em>Pouex Feature</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see dmss.pouex.pouexmm.PouexFeature
	 * @generated
	 */
	public Adapter createPouexFeatureAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link dmss.pouex.pouexmm.Physic <em>Physic</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see dmss.pouex.pouexmm.Physic
	 * @generated
	 */
	public Adapter createPhysicAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link dmss.pouex.pouexmm.Emotional <em>Emotional</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see dmss.pouex.pouexmm.Emotional
	 * @generated
	 */
	public Adapter createEmotionalAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link dmss.pouex.pouexmm.State <em>State</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see dmss.pouex.pouexmm.State
	 * @generated
	 */
	public Adapter createStateAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link dmss.pouex.pouexmm.ActivationCondition <em>Activation Condition</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see dmss.pouex.pouexmm.ActivationCondition
	 * @generated
	 */
	public Adapter createActivationConditionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link dmss.pouex.pouexmm.Action <em>Action</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see dmss.pouex.pouexmm.Action
	 * @generated
	 */
	public Adapter createActionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link dmss.pouex.pouexmm.TimeEvent <em>Time Event</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see dmss.pouex.pouexmm.TimeEvent
	 * @generated
	 */
	public Adapter createTimeEventAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link dmss.pouex.pouexmm.Influence <em>Influence</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see dmss.pouex.pouexmm.Influence
	 * @generated
	 */
	public Adapter createInfluenceAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link dmss.pouex.pouexmm.BodyPart <em>Body Part</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see dmss.pouex.pouexmm.BodyPart
	 * @generated
	 */
	public Adapter createBodyPartAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link dmss.pouex.pouexmm.PouexAction <em>Pouex Action</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see dmss.pouex.pouexmm.PouexAction
	 * @generated
	 */
	public Adapter createPouexActionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link dmss.pouex.pouexmm.PouexActionFeature <em>Pouex Action Feature</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see dmss.pouex.pouexmm.PouexActionFeature
	 * @generated
	 */
	public Adapter createPouexActionFeatureAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link dmss.pouex.pouexmm.MinThresholdActivationCondition <em>Min Threshold Activation Condition</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see dmss.pouex.pouexmm.MinThresholdActivationCondition
	 * @generated
	 */
	public Adapter createMinThresholdActivationConditionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link dmss.pouex.pouexmm.MaxThresholdActivationCondition <em>Max Threshold Activation Condition</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see dmss.pouex.pouexmm.MaxThresholdActivationCondition
	 * @generated
	 */
	public Adapter createMaxThresholdActivationConditionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link dmss.pouex.pouexmm.ThresholdActivationCondition <em>Threshold Activation Condition</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see dmss.pouex.pouexmm.ThresholdActivationCondition
	 * @generated
	 */
	public Adapter createThresholdActivationConditionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link dmss.pouex.pouexmm.RepeatedAction <em>Repeated Action</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see dmss.pouex.pouexmm.RepeatedAction
	 * @generated
	 */
	public Adapter createRepeatedActionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for the default case.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @generated
	 */
	public Adapter createEObjectAdapter() {
		return null;
	}

} //PouexmmAdapterFactory
