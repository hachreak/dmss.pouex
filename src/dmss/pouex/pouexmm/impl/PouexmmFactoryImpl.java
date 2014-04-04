/**
 */
package dmss.pouex.pouexmm.impl;

import dmss.pouex.pouexmm.*;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class PouexmmFactoryImpl extends EFactoryImpl implements PouexmmFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static PouexmmFactory init() {
		try {
			PouexmmFactory thePouexmmFactory = (PouexmmFactory)EPackage.Registry.INSTANCE.getEFactory(PouexmmPackage.eNS_URI);
			if (thePouexmmFactory != null) {
				return thePouexmmFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new PouexmmFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PouexmmFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
			case PouexmmPackage.GAME: return createGame();
			case PouexmmPackage.POUEX: return createPouex();
			case PouexmmPackage.PHYSIC: return createPhysic();
			case PouexmmPackage.EMOTIONAL: return createEmotional();
			case PouexmmPackage.STATE: return createState();
			case PouexmmPackage.TIME_EVENT: return createTimeEvent();
			case PouexmmPackage.INFLUENCE: return createInfluence();
			case PouexmmPackage.BODY_PART: return createBodyPart();
			case PouexmmPackage.POUEX_ACTION: return createPouexAction();
			case PouexmmPackage.POUEX_ACTION_FEATURE: return createPouexActionFeature();
			case PouexmmPackage.MIN_THRESHOLD_ACTIVATION_CONDITION: return createMinThresholdActivationCondition();
			case PouexmmPackage.MAX_THRESHOLD_ACTIVATION_CONDITION: return createMaxThresholdActivationCondition();
			case PouexmmPackage.REPEATED_ACTION: return createRepeatedAction();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object createFromString(EDataType eDataType, String initialValue) {
		switch (eDataType.getClassifierID()) {
			case PouexmmPackage.INFLUENCE_TYPE:
				return createInfluenceTypeFromString(eDataType, initialValue);
			case PouexmmPackage.MATHEMATIC_OPERATOR:
				return createMathematicOperatorFromString(eDataType, initialValue);
			case PouexmmPackage.ACTION_STATUS:
				return createActionStatusFromString(eDataType, initialValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String convertToString(EDataType eDataType, Object instanceValue) {
		switch (eDataType.getClassifierID()) {
			case PouexmmPackage.INFLUENCE_TYPE:
				return convertInfluenceTypeToString(eDataType, instanceValue);
			case PouexmmPackage.MATHEMATIC_OPERATOR:
				return convertMathematicOperatorToString(eDataType, instanceValue);
			case PouexmmPackage.ACTION_STATUS:
				return convertActionStatusToString(eDataType, instanceValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Game createGame() {
		GameImpl game = new GameImpl();
		return game;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Pouex createPouex() {
		PouexImpl pouex = new PouexImpl();
		return pouex;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Physic createPhysic() {
		PhysicImpl physic = new PhysicImpl();
		return physic;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Emotional createEmotional() {
		EmotionalImpl emotional = new EmotionalImpl();
		return emotional;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public State createState() {
		StateImpl state = new StateImpl();
		return state;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TimeEvent createTimeEvent() {
		TimeEventImpl timeEvent = new TimeEventImpl();
		return timeEvent;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Influence createInfluence() {
		InfluenceImpl influence = new InfluenceImpl();
		return influence;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BodyPart createBodyPart() {
		BodyPartImpl bodyPart = new BodyPartImpl();
		return bodyPart;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PouexAction createPouexAction() {
		PouexActionImpl pouexAction = new PouexActionImpl();
		return pouexAction;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PouexActionFeature createPouexActionFeature() {
		PouexActionFeatureImpl pouexActionFeature = new PouexActionFeatureImpl();
		return pouexActionFeature;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MinThresholdActivationCondition createMinThresholdActivationCondition() {
		MinThresholdActivationConditionImpl minThresholdActivationCondition = new MinThresholdActivationConditionImpl();
		return minThresholdActivationCondition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MaxThresholdActivationCondition createMaxThresholdActivationCondition() {
		MaxThresholdActivationConditionImpl maxThresholdActivationCondition = new MaxThresholdActivationConditionImpl();
		return maxThresholdActivationCondition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RepeatedAction createRepeatedAction() {
		RepeatedActionImpl repeatedAction = new RepeatedActionImpl();
		return repeatedAction;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public InfluenceType createInfluenceTypeFromString(EDataType eDataType, String initialValue) {
		InfluenceType result = InfluenceType.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertInfluenceTypeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MathematicOperator createMathematicOperatorFromString(EDataType eDataType, String initialValue) {
		MathematicOperator result = MathematicOperator.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertMathematicOperatorToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ActionStatus createActionStatusFromString(EDataType eDataType, String initialValue) {
		ActionStatus result = ActionStatus.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertActionStatusToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PouexmmPackage getPouexmmPackage() {
		return (PouexmmPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static PouexmmPackage getPackage() {
		return PouexmmPackage.eINSTANCE;
	}

} //PouexmmFactoryImpl
