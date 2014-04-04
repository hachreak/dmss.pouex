/**
 */
package dmss.pouex.pouexmm.util;

import dmss.pouex.pouexmm.*;

import java.util.Map;

import org.eclipse.emf.common.util.Diagnostic;
import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.common.util.ResourceLocator;

import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.EObjectValidator;

/**
 * <!-- begin-user-doc -->
 * The <b>Validator</b> for the model.
 * <!-- end-user-doc -->
 * @see dmss.pouex.pouexmm.PouexmmPackage
 * @generated
 */
public class PouexmmValidator extends EObjectValidator {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final PouexmmValidator INSTANCE = new PouexmmValidator();

	/**
	 * A constant for the {@link org.eclipse.emf.common.util.Diagnostic#getSource() source} of diagnostic {@link org.eclipse.emf.common.util.Diagnostic#getCode() codes} from this package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.common.util.Diagnostic#getSource()
	 * @see org.eclipse.emf.common.util.Diagnostic#getCode()
	 * @generated
	 */
	public static final String DIAGNOSTIC_SOURCE = "dmss.pouex.pouexmm";

	/**
	 * A constant with a fixed name that can be used as the base value for additional hand written constants.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final int GENERATED_DIAGNOSTIC_CODE_COUNT = 0;

	/**
	 * A constant with a fixed name that can be used as the base value for additional hand written constants in a derived class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final int DIAGNOSTIC_CODE_COUNT = GENERATED_DIAGNOSTIC_CODE_COUNT;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PouexmmValidator() {
		super();
	}

	/**
	 * Returns the package of this validator switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EPackage getEPackage() {
	  return PouexmmPackage.eINSTANCE;
	}

	/**
	 * Calls <code>validateXXX</code> for the corresponding classifier of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected boolean validate(int classifierID, Object value, DiagnosticChain diagnostics, Map<Object, Object> context) {
		switch (classifierID) {
			case PouexmmPackage.GAME:
				return validateGame((Game)value, diagnostics, context);
			case PouexmmPackage.POUEX:
				return validatePouex((Pouex)value, diagnostics, context);
			case PouexmmPackage.POUEX_FEATURE:
				return validatePouexFeature((PouexFeature)value, diagnostics, context);
			case PouexmmPackage.PHYSIC:
				return validatePhysic((Physic)value, diagnostics, context);
			case PouexmmPackage.EMOTIONAL:
				return validateEmotional((Emotional)value, diagnostics, context);
			case PouexmmPackage.STATE:
				return validateState((State)value, diagnostics, context);
			case PouexmmPackage.ACTIVATION_CONDITION:
				return validateActivationCondition((ActivationCondition)value, diagnostics, context);
			case PouexmmPackage.ACTION:
				return validateAction((Action)value, diagnostics, context);
			case PouexmmPackage.TIME_EVENT:
				return validateTimeEvent((TimeEvent)value, diagnostics, context);
			case PouexmmPackage.INFLUENCE:
				return validateInfluence((Influence)value, diagnostics, context);
			case PouexmmPackage.BODY_PART:
				return validateBodyPart((BodyPart)value, diagnostics, context);
			case PouexmmPackage.POUEX_ACTION:
				return validatePouexAction((PouexAction)value, diagnostics, context);
			case PouexmmPackage.POUEX_ACTION_FEATURE:
				return validatePouexActionFeature((PouexActionFeature)value, diagnostics, context);
			case PouexmmPackage.MIN_THRESHOLD_ACTIVATION_CONDITION:
				return validateMinThresholdActivationCondition((MinThresholdActivationCondition)value, diagnostics, context);
			case PouexmmPackage.MAX_THRESHOLD_ACTIVATION_CONDITION:
				return validateMaxThresholdActivationCondition((MaxThresholdActivationCondition)value, diagnostics, context);
			case PouexmmPackage.THRESHOLD_ACTIVATION_CONDITION:
				return validateThresholdActivationCondition((ThresholdActivationCondition)value, diagnostics, context);
			case PouexmmPackage.REPEATED_ACTION:
				return validateRepeatedAction((RepeatedAction)value, diagnostics, context);
			case PouexmmPackage.INFLUENCE_TYPE:
				return validateInfluenceType((InfluenceType)value, diagnostics, context);
			case PouexmmPackage.MATHEMATIC_OPERATOR:
				return validateMathematicOperator((MathematicOperator)value, diagnostics, context);
			case PouexmmPackage.ACTION_STATUS:
				return validateActionStatus((ActionStatus)value, diagnostics, context);
			default:
				return true;
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateGame(Game game, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(game, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePouex(Pouex pouex, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(pouex, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(pouex, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(pouex, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(pouex, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(pouex, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(pouex, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(pouex, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(pouex, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(pouex, diagnostics, context);
		if (result || diagnostics != null) result &= validatePouex_defineName(pouex, diagnostics, context);
		if (result || diagnostics != null) result &= validatePouex_cantExistTwoFeatureWithSameName(pouex, diagnostics, context);
		if (result || diagnostics != null) result &= validatePouex_atLeastOneActionForEachFeature(pouex, diagnostics, context);
		return result;
	}

	/**
	 * The cached validation expression for the defineName constraint of '<em>Pouex</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String POUEX__DEFINE_NAME__EEXPRESSION = "not self.name.oclIsUndefined() and self.name <> ''";

	/**
	 * Validates the defineName constraint of '<em>Pouex</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePouex_defineName(Pouex pouex, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(PouexmmPackage.Literals.POUEX,
				 pouex,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot",
				 "defineName",
				 POUEX__DEFINE_NAME__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * The cached validation expression for the cantExistTwoFeatureWithSameName constraint of '<em>Pouex</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String POUEX__CANT_EXIST_TWO_FEATURE_WITH_SAME_NAME__EEXPRESSION = "self.features->isUnique(f: PouexFeature | f.name)";

	/**
	 * Validates the cantExistTwoFeatureWithSameName constraint of '<em>Pouex</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePouex_cantExistTwoFeatureWithSameName(Pouex pouex, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(PouexmmPackage.Literals.POUEX,
				 pouex,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot",
				 "cantExistTwoFeatureWithSameName",
				 POUEX__CANT_EXIST_TWO_FEATURE_WITH_SAME_NAME__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * The cached validation expression for the atLeastOneActionForEachFeature constraint of '<em>Pouex</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String POUEX__AT_LEAST_ONE_ACTION_FOR_EACH_FEATURE__EEXPRESSION = "self.features->forAll(f: PouexFeature | self.actions.influences.feature->exists(inf_feature: PouexFeature | inf_feature = f))";

	/**
	 * Validates the atLeastOneActionForEachFeature constraint of '<em>Pouex</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePouex_atLeastOneActionForEachFeature(Pouex pouex, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(PouexmmPackage.Literals.POUEX,
				 pouex,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot",
				 "atLeastOneActionForEachFeature",
				 POUEX__AT_LEAST_ONE_ACTION_FOR_EACH_FEATURE__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePouexFeature(PouexFeature pouexFeature, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(pouexFeature, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(pouexFeature, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(pouexFeature, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(pouexFeature, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(pouexFeature, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(pouexFeature, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(pouexFeature, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(pouexFeature, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(pouexFeature, diagnostics, context);
		if (result || diagnostics != null) result &= validatePouexFeature_coherentValueMinDefaultMax(pouexFeature, diagnostics, context);
		return result;
	}

	/**
	 * The cached validation expression for the coherentValueMinDefaultMax constraint of '<em>Pouex Feature</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String POUEX_FEATURE__COHERENT_VALUE_MIN_DEFAULT_MAX__EEXPRESSION = "self.minimum <= self.default and self.default <= self.maximum";

	/**
	 * Validates the coherentValueMinDefaultMax constraint of '<em>Pouex Feature</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePouexFeature_coherentValueMinDefaultMax(PouexFeature pouexFeature, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(PouexmmPackage.Literals.POUEX_FEATURE,
				 pouexFeature,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot",
				 "coherentValueMinDefaultMax",
				 POUEX_FEATURE__COHERENT_VALUE_MIN_DEFAULT_MAX__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePhysic(Physic physic, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(physic, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(physic, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(physic, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(physic, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(physic, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(physic, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(physic, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(physic, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(physic, diagnostics, context);
		if (result || diagnostics != null) result &= validatePouexFeature_coherentValueMinDefaultMax(physic, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateEmotional(Emotional emotional, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(emotional, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(emotional, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(emotional, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(emotional, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(emotional, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(emotional, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(emotional, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(emotional, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(emotional, diagnostics, context);
		if (result || diagnostics != null) result &= validatePouexFeature_coherentValueMinDefaultMax(emotional, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateState(State state, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(state, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateActivationCondition(ActivationCondition activationCondition, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(activationCondition, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAction(Action action, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(action, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(action, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(action, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(action, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(action, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(action, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(action, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(action, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(action, diagnostics, context);
		if (result || diagnostics != null) result &= validateAction_cantModifyFeatureTwiceOrMore(action, diagnostics, context);
		return result;
	}

	/**
	 * The cached validation expression for the cantModifyFeatureTwiceOrMore constraint of '<em>Action</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String ACTION__CANT_MODIFY_FEATURE_TWICE_OR_MORE__EEXPRESSION = "self.influences->isUnique(i: Influence | i.feature.name)";

	/**
	 * Validates the cantModifyFeatureTwiceOrMore constraint of '<em>Action</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAction_cantModifyFeatureTwiceOrMore(Action action, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(PouexmmPackage.Literals.ACTION,
				 action,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot",
				 "cantModifyFeatureTwiceOrMore",
				 ACTION__CANT_MODIFY_FEATURE_TWICE_OR_MORE__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTimeEvent(TimeEvent timeEvent, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(timeEvent, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(timeEvent, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(timeEvent, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(timeEvent, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(timeEvent, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(timeEvent, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(timeEvent, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(timeEvent, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(timeEvent, diagnostics, context);
		if (result || diagnostics != null) result &= validateAction_cantModifyFeatureTwiceOrMore(timeEvent, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateInfluence(Influence influence, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(influence, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateBodyPart(BodyPart bodyPart, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(bodyPart, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePouexAction(PouexAction pouexAction, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(pouexAction, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(pouexAction, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(pouexAction, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(pouexAction, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(pouexAction, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(pouexAction, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(pouexAction, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(pouexAction, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(pouexAction, diagnostics, context);
		if (result || diagnostics != null) result &= validateAction_cantModifyFeatureTwiceOrMore(pouexAction, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePouexActionFeature(PouexActionFeature pouexActionFeature, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(pouexActionFeature, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMinThresholdActivationCondition(MinThresholdActivationCondition minThresholdActivationCondition, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(minThresholdActivationCondition, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMaxThresholdActivationCondition(MaxThresholdActivationCondition maxThresholdActivationCondition, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(maxThresholdActivationCondition, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateThresholdActivationCondition(ThresholdActivationCondition thresholdActivationCondition, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(thresholdActivationCondition, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateRepeatedAction(RepeatedAction repeatedAction, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(repeatedAction, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(repeatedAction, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(repeatedAction, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(repeatedAction, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(repeatedAction, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(repeatedAction, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(repeatedAction, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(repeatedAction, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(repeatedAction, diagnostics, context);
		if (result || diagnostics != null) result &= validateAction_cantModifyFeatureTwiceOrMore(repeatedAction, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateInfluenceType(InfluenceType influenceType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMathematicOperator(MathematicOperator mathematicOperator, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateActionStatus(ActionStatus actionStatus, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * Returns the resource locator that will be used to fetch messages for this validator's diagnostics.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ResourceLocator getResourceLocator() {
		// TODO
		// Specialize this to return a resource locator for messages specific to this validator.
		// Ensure that you remove @generated or mark it @generated NOT
		return super.getResourceLocator();
	}

} //PouexmmValidator
