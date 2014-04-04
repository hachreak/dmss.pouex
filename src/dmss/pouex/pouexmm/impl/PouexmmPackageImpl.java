/**
 */
package dmss.pouex.pouexmm.impl;

import dmss.pouex.pouexmm.Action;
import dmss.pouex.pouexmm.ActionStatus;
import dmss.pouex.pouexmm.ActivationCondition;
import dmss.pouex.pouexmm.BodyPart;
import dmss.pouex.pouexmm.Emotional;
import dmss.pouex.pouexmm.Game;
import dmss.pouex.pouexmm.Influence;
import dmss.pouex.pouexmm.InfluenceType;
import dmss.pouex.pouexmm.MathematicOperator;
import dmss.pouex.pouexmm.MaxThresholdActivationCondition;
import dmss.pouex.pouexmm.MinThresholdActivationCondition;
import dmss.pouex.pouexmm.Physic;
import dmss.pouex.pouexmm.Pouex;
import dmss.pouex.pouexmm.PouexAction;
import dmss.pouex.pouexmm.PouexActionFeature;
import dmss.pouex.pouexmm.PouexFeature;
import dmss.pouex.pouexmm.PouexmmFactory;
import dmss.pouex.pouexmm.PouexmmPackage;
import dmss.pouex.pouexmm.RepeatedAction;
import dmss.pouex.pouexmm.State;
import dmss.pouex.pouexmm.ThresholdActivationCondition;
import dmss.pouex.pouexmm.TimeEvent;

import dmss.pouex.pouexmm.util.PouexmmValidator;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.EValidator;

import org.eclipse.emf.ecore.impl.EPackageImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class PouexmmPackageImpl extends EPackageImpl implements PouexmmPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass gameEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass pouexEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass pouexFeatureEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass physicEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass emotionalEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass stateEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass activationConditionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass actionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass timeEventEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass influenceEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass bodyPartEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass pouexActionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass pouexActionFeatureEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass minThresholdActivationConditionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass maxThresholdActivationConditionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass thresholdActivationConditionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass repeatedActionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum influenceTypeEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum mathematicOperatorEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum actionStatusEEnum = null;

	/**
	 * Creates an instance of the model <b>Package</b>, registered with
	 * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
	 * package URI value.
	 * <p>Note: the correct way to create the package is via the static
	 * factory method {@link #init init()}, which also performs
	 * initialization of the package, or returns the registered package,
	 * if one already exists.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.ecore.EPackage.Registry
	 * @see dmss.pouex.pouexmm.PouexmmPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private PouexmmPackageImpl() {
		super(eNS_URI, PouexmmFactory.eINSTANCE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static boolean isInited = false;

	/**
	 * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
	 * 
	 * <p>This method is used to initialize {@link PouexmmPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static PouexmmPackage init() {
		if (isInited) return (PouexmmPackage)EPackage.Registry.INSTANCE.getEPackage(PouexmmPackage.eNS_URI);

		// Obtain or create and register package
		PouexmmPackageImpl thePouexmmPackage = (PouexmmPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof PouexmmPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new PouexmmPackageImpl());

		isInited = true;

		// Create package meta-data objects
		thePouexmmPackage.createPackageContents();

		// Initialize created meta-data
		thePouexmmPackage.initializePackageContents();

		// Register package validator
		EValidator.Registry.INSTANCE.put
			(thePouexmmPackage, 
			 new EValidator.Descriptor() {
				 public EValidator getEValidator() {
					 return PouexmmValidator.INSTANCE;
				 }
			 });

		// Mark meta-data to indicate it can't be changed
		thePouexmmPackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(PouexmmPackage.eNS_URI, thePouexmmPackage);
		return thePouexmmPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getGame() {
		return gameEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getGame_Pouex() {
		return (EReference)gameEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPouex() {
		return pouexEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPouex_Features() {
		return (EReference)pouexEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPouex_States() {
		return (EReference)pouexEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPouex_Actions() {
		return (EReference)pouexEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPouex_Name() {
		return (EAttribute)pouexEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPouex_Bodyparts() {
		return (EReference)pouexEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPouexFeature() {
		return pouexFeatureEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPouexFeature_Default() {
		return (EAttribute)pouexFeatureEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPouexFeature_Minimum() {
		return (EAttribute)pouexFeatureEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPouexFeature_Maximum() {
		return (EAttribute)pouexFeatureEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPouexFeature_Type() {
		return (EAttribute)pouexFeatureEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPouexFeature_Name() {
		return (EAttribute)pouexFeatureEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPhysic() {
		return physicEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getEmotional() {
		return emotionalEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getState() {
		return stateEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getState_ActivationConditions() {
		return (EReference)stateEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getState_Name() {
		return (EAttribute)stateEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getActivationCondition() {
		return activationConditionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getActivationCondition_Features() {
		return (EReference)activationConditionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getActivationCondition_Name() {
		return (EAttribute)activationConditionEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAction() {
		return actionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAction_Influences() {
		return (EReference)actionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAction_Name() {
		return (EAttribute)actionEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAction_CurrentStatus() {
		return (EAttribute)actionEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTimeEvent() {
		return timeEventEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getInfluence() {
		return influenceEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getInfluence_Feature() {
		return (EReference)influenceEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getInfluence_Operator() {
		return (EAttribute)influenceEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getInfluence_Value() {
		return (EAttribute)influenceEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getBodyPart() {
		return bodyPartEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getBodyPart_Subparts() {
		return (EReference)bodyPartEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getBodyPart_Name() {
		return (EAttribute)bodyPartEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPouexAction() {
		return pouexActionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPouexAction_Subtype() {
		return (EReference)pouexActionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPouexAction_Features() {
		return (EReference)pouexActionEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPouexActionFeature() {
		return pouexActionFeatureEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getMinThresholdActivationCondition() {
		return minThresholdActivationConditionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getMaxThresholdActivationCondition() {
		return maxThresholdActivationConditionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getThresholdActivationCondition() {
		return thresholdActivationConditionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getThresholdActivationCondition_Threshold() {
		return (EAttribute)thresholdActivationConditionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getRepeatedAction() {
		return repeatedActionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRepeatedAction_EachMillisec() {
		return (EAttribute)repeatedActionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getInfluenceType() {
		return influenceTypeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getMathematicOperator() {
		return mathematicOperatorEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getActionStatus() {
		return actionStatusEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PouexmmFactory getPouexmmFactory() {
		return (PouexmmFactory)getEFactoryInstance();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isCreated = false;

	/**
	 * Creates the meta-model objects for the package.  This method is
	 * guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void createPackageContents() {
		if (isCreated) return;
		isCreated = true;

		// Create classes and their features
		gameEClass = createEClass(GAME);
		createEReference(gameEClass, GAME__POUEX);

		pouexEClass = createEClass(POUEX);
		createEReference(pouexEClass, POUEX__FEATURES);
		createEReference(pouexEClass, POUEX__STATES);
		createEReference(pouexEClass, POUEX__ACTIONS);
		createEAttribute(pouexEClass, POUEX__NAME);
		createEReference(pouexEClass, POUEX__BODYPARTS);

		pouexFeatureEClass = createEClass(POUEX_FEATURE);
		createEAttribute(pouexFeatureEClass, POUEX_FEATURE__DEFAULT);
		createEAttribute(pouexFeatureEClass, POUEX_FEATURE__MINIMUM);
		createEAttribute(pouexFeatureEClass, POUEX_FEATURE__MAXIMUM);
		createEAttribute(pouexFeatureEClass, POUEX_FEATURE__TYPE);
		createEAttribute(pouexFeatureEClass, POUEX_FEATURE__NAME);

		physicEClass = createEClass(PHYSIC);

		emotionalEClass = createEClass(EMOTIONAL);

		stateEClass = createEClass(STATE);
		createEReference(stateEClass, STATE__ACTIVATION_CONDITIONS);
		createEAttribute(stateEClass, STATE__NAME);

		activationConditionEClass = createEClass(ACTIVATION_CONDITION);
		createEReference(activationConditionEClass, ACTIVATION_CONDITION__FEATURES);
		createEAttribute(activationConditionEClass, ACTIVATION_CONDITION__NAME);

		actionEClass = createEClass(ACTION);
		createEReference(actionEClass, ACTION__INFLUENCES);
		createEAttribute(actionEClass, ACTION__NAME);
		createEAttribute(actionEClass, ACTION__CURRENT_STATUS);

		timeEventEClass = createEClass(TIME_EVENT);

		influenceEClass = createEClass(INFLUENCE);
		createEReference(influenceEClass, INFLUENCE__FEATURE);
		createEAttribute(influenceEClass, INFLUENCE__OPERATOR);
		createEAttribute(influenceEClass, INFLUENCE__VALUE);

		bodyPartEClass = createEClass(BODY_PART);
		createEReference(bodyPartEClass, BODY_PART__SUBPARTS);
		createEAttribute(bodyPartEClass, BODY_PART__NAME);

		pouexActionEClass = createEClass(POUEX_ACTION);
		createEReference(pouexActionEClass, POUEX_ACTION__SUBTYPE);
		createEReference(pouexActionEClass, POUEX_ACTION__FEATURES);

		pouexActionFeatureEClass = createEClass(POUEX_ACTION_FEATURE);

		minThresholdActivationConditionEClass = createEClass(MIN_THRESHOLD_ACTIVATION_CONDITION);

		maxThresholdActivationConditionEClass = createEClass(MAX_THRESHOLD_ACTIVATION_CONDITION);

		thresholdActivationConditionEClass = createEClass(THRESHOLD_ACTIVATION_CONDITION);
		createEAttribute(thresholdActivationConditionEClass, THRESHOLD_ACTIVATION_CONDITION__THRESHOLD);

		repeatedActionEClass = createEClass(REPEATED_ACTION);
		createEAttribute(repeatedActionEClass, REPEATED_ACTION__EACH_MILLISEC);

		// Create enums
		influenceTypeEEnum = createEEnum(INFLUENCE_TYPE);
		mathematicOperatorEEnum = createEEnum(MATHEMATIC_OPERATOR);
		actionStatusEEnum = createEEnum(ACTION_STATUS);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isInitialized = false;

	/**
	 * Complete the initialization of the package and its meta-model.  This
	 * method is guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void initializePackageContents() {
		if (isInitialized) return;
		isInitialized = true;

		// Initialize package
		setName(eNAME);
		setNsPrefix(eNS_PREFIX);
		setNsURI(eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		physicEClass.getESuperTypes().add(this.getPouexFeature());
		emotionalEClass.getESuperTypes().add(this.getPouexFeature());
		timeEventEClass.getESuperTypes().add(this.getRepeatedAction());
		pouexActionEClass.getESuperTypes().add(this.getAction());
		minThresholdActivationConditionEClass.getESuperTypes().add(this.getThresholdActivationCondition());
		maxThresholdActivationConditionEClass.getESuperTypes().add(this.getThresholdActivationCondition());
		thresholdActivationConditionEClass.getESuperTypes().add(this.getActivationCondition());
		repeatedActionEClass.getESuperTypes().add(this.getAction());

		// Initialize classes, features, and operations; add parameters
		initEClass(gameEClass, Game.class, "Game", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getGame_Pouex(), this.getPouex(), null, "pouex", null, 1, 1, Game.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(pouexEClass, Pouex.class, "Pouex", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getPouex_Features(), this.getPouexFeature(), null, "features", null, 0, -1, Pouex.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getPouex_States(), this.getState(), null, "states", null, 0, -1, Pouex.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getPouex_Actions(), this.getAction(), null, "actions", null, 0, -1, Pouex.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPouex_Name(), ecorePackage.getEString(), "name", null, 0, 1, Pouex.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getPouex_Bodyparts(), this.getBodyPart(), null, "bodyparts", null, 1, -1, Pouex.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(pouexFeatureEClass, PouexFeature.class, "PouexFeature", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getPouexFeature_Default(), ecorePackage.getEDouble(), "default", null, 1, 1, PouexFeature.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPouexFeature_Minimum(), ecorePackage.getEDouble(), "minimum", null, 1, 1, PouexFeature.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPouexFeature_Maximum(), ecorePackage.getEDouble(), "maximum", null, 1, 1, PouexFeature.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPouexFeature_Type(), this.getInfluenceType(), "type", null, 1, 1, PouexFeature.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPouexFeature_Name(), ecorePackage.getEString(), "name", null, 0, 1, PouexFeature.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(physicEClass, Physic.class, "Physic", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(emotionalEClass, Emotional.class, "Emotional", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(stateEClass, State.class, "State", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getState_ActivationConditions(), this.getActivationCondition(), null, "activationConditions", null, 1, -1, State.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getState_Name(), ecorePackage.getEString(), "name", null, 0, 1, State.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(activationConditionEClass, ActivationCondition.class, "ActivationCondition", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getActivationCondition_Features(), this.getPouexFeature(), null, "features", null, 0, 1, ActivationCondition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getActivationCondition_Name(), ecorePackage.getEString(), "name", null, 0, 1, ActivationCondition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(actionEClass, Action.class, "Action", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getAction_Influences(), this.getInfluence(), null, "influences", null, 0, -1, Action.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getAction_Name(), ecorePackage.getEString(), "name", null, 0, 1, Action.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getAction_CurrentStatus(), this.getActionStatus(), "currentStatus", null, 0, 1, Action.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(timeEventEClass, TimeEvent.class, "TimeEvent", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(influenceEClass, Influence.class, "Influence", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getInfluence_Feature(), this.getPouexFeature(), null, "feature", null, 1, 1, Influence.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getInfluence_Operator(), this.getMathematicOperator(), "operator", null, 0, 1, Influence.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getInfluence_Value(), ecorePackage.getEDouble(), "value", null, 0, 1, Influence.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(bodyPartEClass, BodyPart.class, "BodyPart", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getBodyPart_Subparts(), this.getBodyPart(), null, "subparts", null, 0, -1, BodyPart.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getBodyPart_Name(), ecorePackage.getEString(), "name", null, 0, 1, BodyPart.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(pouexActionEClass, PouexAction.class, "PouexAction", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getPouexAction_Subtype(), this.getPouexAction(), null, "subtype", null, 0, -1, PouexAction.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getPouexAction_Features(), this.getPouexActionFeature(), null, "features", null, 0, -1, PouexAction.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(pouexActionFeatureEClass, PouexActionFeature.class, "PouexActionFeature", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(minThresholdActivationConditionEClass, MinThresholdActivationCondition.class, "MinThresholdActivationCondition", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(maxThresholdActivationConditionEClass, MaxThresholdActivationCondition.class, "MaxThresholdActivationCondition", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(thresholdActivationConditionEClass, ThresholdActivationCondition.class, "ThresholdActivationCondition", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getThresholdActivationCondition_Threshold(), ecorePackage.getEDouble(), "threshold", null, 1, 1, ThresholdActivationCondition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(repeatedActionEClass, RepeatedAction.class, "RepeatedAction", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getRepeatedAction_EachMillisec(), ecorePackage.getEDouble(), "eachMillisec", null, 1, 1, RepeatedAction.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		// Initialize enums and add enum literals
		initEEnum(influenceTypeEEnum, InfluenceType.class, "InfluenceType");
		addEEnumLiteral(influenceTypeEEnum, InfluenceType.POSITIVE);
		addEEnumLiteral(influenceTypeEEnum, InfluenceType.NEGATIVE);

		initEEnum(mathematicOperatorEEnum, MathematicOperator.class, "MathematicOperator");
		addEEnumLiteral(mathematicOperatorEEnum, MathematicOperator.ADDITION);
		addEEnumLiteral(mathematicOperatorEEnum, MathematicOperator.SUBTRACTION);
		addEEnumLiteral(mathematicOperatorEEnum, MathematicOperator.MULTIPLICATION);
		addEEnumLiteral(mathematicOperatorEEnum, MathematicOperator.DIVISION);
		addEEnumLiteral(mathematicOperatorEEnum, MathematicOperator.MODULE);

		initEEnum(actionStatusEEnum, ActionStatus.class, "ActionStatus");
		addEEnumLiteral(actionStatusEEnum, ActionStatus.ENABLED);
		addEEnumLiteral(actionStatusEEnum, ActionStatus.DISABLED);

		// Create resource
		createResource(eNS_URI);

		// Create annotations
		// http://www.eclipse.org/OCL/Import
		createImportAnnotations();
		// http://www.eclipse.org/emf/2002/Ecore
		createEcoreAnnotations();
		// http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot
		createPivotAnnotations();
	}

	/**
	 * Initializes the annotations for <b>http://www.eclipse.org/OCL/Import</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void createImportAnnotations() {
		String source = "http://www.eclipse.org/OCL/Import";		
		addAnnotation
		  (this, 
		   source, 
		   new String[] {
			 "ecore", "http://www.eclipse.org/emf/2002/Ecore#/"
		   });							
	}

	/**
	 * Initializes the annotations for <b>http://www.eclipse.org/emf/2002/Ecore</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void createEcoreAnnotations() {
		String source = "http://www.eclipse.org/emf/2002/Ecore";			
		addAnnotation
		  (this, 
		   source, 
		   new String[] {
			 "invocationDelegates", "http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot",
			 "settingDelegates", "http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot",
			 "validationDelegates", "http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot"
		   });		
		addAnnotation
		  (pouexEClass, 
		   source, 
		   new String[] {
			 "constraints", "defineName cantExistTwoFeatureWithSameName atLeastOneActionForEachFeature"
		   });			
		addAnnotation
		  (pouexFeatureEClass, 
		   source, 
		   new String[] {
			 "constraints", "coherentValueMinDefaultMax"
		   });			
		addAnnotation
		  (actionEClass, 
		   source, 
		   new String[] {
			 "constraints", "cantModifyFeatureTwiceOrMore"
		   });	
	}

	/**
	 * Initializes the annotations for <b>http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void createPivotAnnotations() {
		String source = "http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot";					
		addAnnotation
		  (pouexEClass, 
		   source, 
		   new String[] {
			 "defineName", "not self.name.oclIsUndefined() and self.name <> \'\'",
			 "cantExistTwoFeatureWithSameName", "self.features->isUnique(f: PouexFeature | f.name)",
			 "atLeastOneActionForEachFeature", "self.features->forAll(f: PouexFeature | self.actions.influences.feature->exists(inf_feature: PouexFeature | inf_feature = f))"
		   });			
		addAnnotation
		  (pouexFeatureEClass, 
		   source, 
		   new String[] {
			 "coherentValueMinDefaultMax", "self.minimum <= self.default and self.default <= self.maximum"
		   });			
		addAnnotation
		  (actionEClass, 
		   source, 
		   new String[] {
			 "cantModifyFeatureTwiceOrMore", "self.influences->isUnique(i: Influence | i.feature.name)"
		   });
	}

} //PouexmmPackageImpl
