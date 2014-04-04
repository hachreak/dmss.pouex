/**
 */
package dmss.pouex.pouexmm;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each operation of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see dmss.pouex.pouexmm.PouexmmFactory
 * @model kind="package"
 *        annotation="http://www.eclipse.org/OCL/Import ecore='http://www.eclipse.org/emf/2002/Ecore#/'"
 *        annotation="http://www.eclipse.org/emf/2002/Ecore invocationDelegates='http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot' settingDelegates='http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot' validationDelegates='http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot'"
 * @generated
 */
public interface PouexmmPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "pouexmm";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://pouexmm/1.0";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "pouexmm";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	PouexmmPackage eINSTANCE = dmss.pouex.pouexmm.impl.PouexmmPackageImpl.init();

	/**
	 * The meta object id for the '{@link dmss.pouex.pouexmm.impl.GameImpl <em>Game</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see dmss.pouex.pouexmm.impl.GameImpl
	 * @see dmss.pouex.pouexmm.impl.PouexmmPackageImpl#getGame()
	 * @generated
	 */
	int GAME = 0;

	/**
	 * The feature id for the '<em><b>Pouex</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GAME__POUEX = 0;

	/**
	 * The number of structural features of the '<em>Game</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GAME_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Game</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GAME_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link dmss.pouex.pouexmm.impl.PouexImpl <em>Pouex</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see dmss.pouex.pouexmm.impl.PouexImpl
	 * @see dmss.pouex.pouexmm.impl.PouexmmPackageImpl#getPouex()
	 * @generated
	 */
	int POUEX = 1;

	/**
	 * The feature id for the '<em><b>Features</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POUEX__FEATURES = 0;

	/**
	 * The feature id for the '<em><b>States</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POUEX__STATES = 1;

	/**
	 * The feature id for the '<em><b>Actions</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POUEX__ACTIONS = 2;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POUEX__NAME = 3;

	/**
	 * The feature id for the '<em><b>Bodyparts</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POUEX__BODYPARTS = 4;

	/**
	 * The number of structural features of the '<em>Pouex</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POUEX_FEATURE_COUNT = 5;

	/**
	 * The number of operations of the '<em>Pouex</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POUEX_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link dmss.pouex.pouexmm.impl.PouexFeatureImpl <em>Pouex Feature</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see dmss.pouex.pouexmm.impl.PouexFeatureImpl
	 * @see dmss.pouex.pouexmm.impl.PouexmmPackageImpl#getPouexFeature()
	 * @generated
	 */
	int POUEX_FEATURE = 2;

	/**
	 * The feature id for the '<em><b>Default</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POUEX_FEATURE__DEFAULT = 0;

	/**
	 * The feature id for the '<em><b>Minimum</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POUEX_FEATURE__MINIMUM = 1;

	/**
	 * The feature id for the '<em><b>Maximum</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POUEX_FEATURE__MAXIMUM = 2;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POUEX_FEATURE__TYPE = 3;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POUEX_FEATURE__NAME = 4;

	/**
	 * The number of structural features of the '<em>Pouex Feature</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POUEX_FEATURE_FEATURE_COUNT = 5;

	/**
	 * The number of operations of the '<em>Pouex Feature</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POUEX_FEATURE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link dmss.pouex.pouexmm.impl.PhysicImpl <em>Physic</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see dmss.pouex.pouexmm.impl.PhysicImpl
	 * @see dmss.pouex.pouexmm.impl.PouexmmPackageImpl#getPhysic()
	 * @generated
	 */
	int PHYSIC = 3;

	/**
	 * The feature id for the '<em><b>Default</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PHYSIC__DEFAULT = POUEX_FEATURE__DEFAULT;

	/**
	 * The feature id for the '<em><b>Minimum</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PHYSIC__MINIMUM = POUEX_FEATURE__MINIMUM;

	/**
	 * The feature id for the '<em><b>Maximum</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PHYSIC__MAXIMUM = POUEX_FEATURE__MAXIMUM;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PHYSIC__TYPE = POUEX_FEATURE__TYPE;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PHYSIC__NAME = POUEX_FEATURE__NAME;

	/**
	 * The number of structural features of the '<em>Physic</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PHYSIC_FEATURE_COUNT = POUEX_FEATURE_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Physic</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PHYSIC_OPERATION_COUNT = POUEX_FEATURE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link dmss.pouex.pouexmm.impl.EmotionalImpl <em>Emotional</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see dmss.pouex.pouexmm.impl.EmotionalImpl
	 * @see dmss.pouex.pouexmm.impl.PouexmmPackageImpl#getEmotional()
	 * @generated
	 */
	int EMOTIONAL = 4;

	/**
	 * The feature id for the '<em><b>Default</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMOTIONAL__DEFAULT = POUEX_FEATURE__DEFAULT;

	/**
	 * The feature id for the '<em><b>Minimum</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMOTIONAL__MINIMUM = POUEX_FEATURE__MINIMUM;

	/**
	 * The feature id for the '<em><b>Maximum</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMOTIONAL__MAXIMUM = POUEX_FEATURE__MAXIMUM;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMOTIONAL__TYPE = POUEX_FEATURE__TYPE;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMOTIONAL__NAME = POUEX_FEATURE__NAME;

	/**
	 * The number of structural features of the '<em>Emotional</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMOTIONAL_FEATURE_COUNT = POUEX_FEATURE_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Emotional</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMOTIONAL_OPERATION_COUNT = POUEX_FEATURE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link dmss.pouex.pouexmm.impl.StateImpl <em>State</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see dmss.pouex.pouexmm.impl.StateImpl
	 * @see dmss.pouex.pouexmm.impl.PouexmmPackageImpl#getState()
	 * @generated
	 */
	int STATE = 5;

	/**
	 * The feature id for the '<em><b>Activation Conditions</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATE__ACTIVATION_CONDITIONS = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATE__NAME = 1;

	/**
	 * The number of structural features of the '<em>State</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATE_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>State</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link dmss.pouex.pouexmm.impl.ActivationConditionImpl <em>Activation Condition</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see dmss.pouex.pouexmm.impl.ActivationConditionImpl
	 * @see dmss.pouex.pouexmm.impl.PouexmmPackageImpl#getActivationCondition()
	 * @generated
	 */
	int ACTIVATION_CONDITION = 6;

	/**
	 * The feature id for the '<em><b>Features</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVATION_CONDITION__FEATURES = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVATION_CONDITION__NAME = 1;

	/**
	 * The number of structural features of the '<em>Activation Condition</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVATION_CONDITION_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Activation Condition</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVATION_CONDITION_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link dmss.pouex.pouexmm.impl.ActionImpl <em>Action</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see dmss.pouex.pouexmm.impl.ActionImpl
	 * @see dmss.pouex.pouexmm.impl.PouexmmPackageImpl#getAction()
	 * @generated
	 */
	int ACTION = 7;

	/**
	 * The feature id for the '<em><b>Influences</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTION__INFLUENCES = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTION__NAME = 1;

	/**
	 * The feature id for the '<em><b>Current Status</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTION__CURRENT_STATUS = 2;

	/**
	 * The number of structural features of the '<em>Action</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTION_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Action</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTION_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link dmss.pouex.pouexmm.impl.RepeatedActionImpl <em>Repeated Action</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see dmss.pouex.pouexmm.impl.RepeatedActionImpl
	 * @see dmss.pouex.pouexmm.impl.PouexmmPackageImpl#getRepeatedAction()
	 * @generated
	 */
	int REPEATED_ACTION = 16;

	/**
	 * The feature id for the '<em><b>Influences</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REPEATED_ACTION__INFLUENCES = ACTION__INFLUENCES;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REPEATED_ACTION__NAME = ACTION__NAME;

	/**
	 * The feature id for the '<em><b>Current Status</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REPEATED_ACTION__CURRENT_STATUS = ACTION__CURRENT_STATUS;

	/**
	 * The feature id for the '<em><b>Each Millisec</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REPEATED_ACTION__EACH_MILLISEC = ACTION_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Repeated Action</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REPEATED_ACTION_FEATURE_COUNT = ACTION_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Repeated Action</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REPEATED_ACTION_OPERATION_COUNT = ACTION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link dmss.pouex.pouexmm.impl.TimeEventImpl <em>Time Event</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see dmss.pouex.pouexmm.impl.TimeEventImpl
	 * @see dmss.pouex.pouexmm.impl.PouexmmPackageImpl#getTimeEvent()
	 * @generated
	 */
	int TIME_EVENT = 8;

	/**
	 * The feature id for the '<em><b>Influences</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIME_EVENT__INFLUENCES = REPEATED_ACTION__INFLUENCES;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIME_EVENT__NAME = REPEATED_ACTION__NAME;

	/**
	 * The feature id for the '<em><b>Current Status</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIME_EVENT__CURRENT_STATUS = REPEATED_ACTION__CURRENT_STATUS;

	/**
	 * The feature id for the '<em><b>Each Millisec</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIME_EVENT__EACH_MILLISEC = REPEATED_ACTION__EACH_MILLISEC;

	/**
	 * The number of structural features of the '<em>Time Event</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIME_EVENT_FEATURE_COUNT = REPEATED_ACTION_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Time Event</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIME_EVENT_OPERATION_COUNT = REPEATED_ACTION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link dmss.pouex.pouexmm.impl.InfluenceImpl <em>Influence</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see dmss.pouex.pouexmm.impl.InfluenceImpl
	 * @see dmss.pouex.pouexmm.impl.PouexmmPackageImpl#getInfluence()
	 * @generated
	 */
	int INFLUENCE = 9;

	/**
	 * The feature id for the '<em><b>Feature</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INFLUENCE__FEATURE = 0;

	/**
	 * The feature id for the '<em><b>Operator</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INFLUENCE__OPERATOR = 1;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INFLUENCE__VALUE = 2;

	/**
	 * The number of structural features of the '<em>Influence</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INFLUENCE_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Influence</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INFLUENCE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link dmss.pouex.pouexmm.impl.BodyPartImpl <em>Body Part</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see dmss.pouex.pouexmm.impl.BodyPartImpl
	 * @see dmss.pouex.pouexmm.impl.PouexmmPackageImpl#getBodyPart()
	 * @generated
	 */
	int BODY_PART = 10;

	/**
	 * The feature id for the '<em><b>Subparts</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BODY_PART__SUBPARTS = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BODY_PART__NAME = 1;

	/**
	 * The number of structural features of the '<em>Body Part</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BODY_PART_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Body Part</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BODY_PART_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link dmss.pouex.pouexmm.impl.PouexActionImpl <em>Pouex Action</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see dmss.pouex.pouexmm.impl.PouexActionImpl
	 * @see dmss.pouex.pouexmm.impl.PouexmmPackageImpl#getPouexAction()
	 * @generated
	 */
	int POUEX_ACTION = 11;

	/**
	 * The feature id for the '<em><b>Influences</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POUEX_ACTION__INFLUENCES = ACTION__INFLUENCES;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POUEX_ACTION__NAME = ACTION__NAME;

	/**
	 * The feature id for the '<em><b>Current Status</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POUEX_ACTION__CURRENT_STATUS = ACTION__CURRENT_STATUS;

	/**
	 * The feature id for the '<em><b>Subtype</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POUEX_ACTION__SUBTYPE = ACTION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Features</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POUEX_ACTION__FEATURES = ACTION_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Pouex Action</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POUEX_ACTION_FEATURE_COUNT = ACTION_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Pouex Action</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POUEX_ACTION_OPERATION_COUNT = ACTION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link dmss.pouex.pouexmm.impl.PouexActionFeatureImpl <em>Pouex Action Feature</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see dmss.pouex.pouexmm.impl.PouexActionFeatureImpl
	 * @see dmss.pouex.pouexmm.impl.PouexmmPackageImpl#getPouexActionFeature()
	 * @generated
	 */
	int POUEX_ACTION_FEATURE = 12;

	/**
	 * The number of structural features of the '<em>Pouex Action Feature</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POUEX_ACTION_FEATURE_FEATURE_COUNT = 0;

	/**
	 * The number of operations of the '<em>Pouex Action Feature</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POUEX_ACTION_FEATURE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link dmss.pouex.pouexmm.impl.ThresholdActivationConditionImpl <em>Threshold Activation Condition</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see dmss.pouex.pouexmm.impl.ThresholdActivationConditionImpl
	 * @see dmss.pouex.pouexmm.impl.PouexmmPackageImpl#getThresholdActivationCondition()
	 * @generated
	 */
	int THRESHOLD_ACTIVATION_CONDITION = 15;

	/**
	 * The feature id for the '<em><b>Features</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int THRESHOLD_ACTIVATION_CONDITION__FEATURES = ACTIVATION_CONDITION__FEATURES;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int THRESHOLD_ACTIVATION_CONDITION__NAME = ACTIVATION_CONDITION__NAME;

	/**
	 * The feature id for the '<em><b>Threshold</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int THRESHOLD_ACTIVATION_CONDITION__THRESHOLD = ACTIVATION_CONDITION_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Threshold Activation Condition</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int THRESHOLD_ACTIVATION_CONDITION_FEATURE_COUNT = ACTIVATION_CONDITION_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Threshold Activation Condition</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int THRESHOLD_ACTIVATION_CONDITION_OPERATION_COUNT = ACTIVATION_CONDITION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link dmss.pouex.pouexmm.impl.MinThresholdActivationConditionImpl <em>Min Threshold Activation Condition</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see dmss.pouex.pouexmm.impl.MinThresholdActivationConditionImpl
	 * @see dmss.pouex.pouexmm.impl.PouexmmPackageImpl#getMinThresholdActivationCondition()
	 * @generated
	 */
	int MIN_THRESHOLD_ACTIVATION_CONDITION = 13;

	/**
	 * The feature id for the '<em><b>Features</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MIN_THRESHOLD_ACTIVATION_CONDITION__FEATURES = THRESHOLD_ACTIVATION_CONDITION__FEATURES;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MIN_THRESHOLD_ACTIVATION_CONDITION__NAME = THRESHOLD_ACTIVATION_CONDITION__NAME;

	/**
	 * The feature id for the '<em><b>Threshold</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MIN_THRESHOLD_ACTIVATION_CONDITION__THRESHOLD = THRESHOLD_ACTIVATION_CONDITION__THRESHOLD;

	/**
	 * The number of structural features of the '<em>Min Threshold Activation Condition</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MIN_THRESHOLD_ACTIVATION_CONDITION_FEATURE_COUNT = THRESHOLD_ACTIVATION_CONDITION_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Min Threshold Activation Condition</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MIN_THRESHOLD_ACTIVATION_CONDITION_OPERATION_COUNT = THRESHOLD_ACTIVATION_CONDITION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link dmss.pouex.pouexmm.impl.MaxThresholdActivationConditionImpl <em>Max Threshold Activation Condition</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see dmss.pouex.pouexmm.impl.MaxThresholdActivationConditionImpl
	 * @see dmss.pouex.pouexmm.impl.PouexmmPackageImpl#getMaxThresholdActivationCondition()
	 * @generated
	 */
	int MAX_THRESHOLD_ACTIVATION_CONDITION = 14;

	/**
	 * The feature id for the '<em><b>Features</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAX_THRESHOLD_ACTIVATION_CONDITION__FEATURES = THRESHOLD_ACTIVATION_CONDITION__FEATURES;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAX_THRESHOLD_ACTIVATION_CONDITION__NAME = THRESHOLD_ACTIVATION_CONDITION__NAME;

	/**
	 * The feature id for the '<em><b>Threshold</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAX_THRESHOLD_ACTIVATION_CONDITION__THRESHOLD = THRESHOLD_ACTIVATION_CONDITION__THRESHOLD;

	/**
	 * The number of structural features of the '<em>Max Threshold Activation Condition</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAX_THRESHOLD_ACTIVATION_CONDITION_FEATURE_COUNT = THRESHOLD_ACTIVATION_CONDITION_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Max Threshold Activation Condition</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAX_THRESHOLD_ACTIVATION_CONDITION_OPERATION_COUNT = THRESHOLD_ACTIVATION_CONDITION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link dmss.pouex.pouexmm.InfluenceType <em>Influence Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see dmss.pouex.pouexmm.InfluenceType
	 * @see dmss.pouex.pouexmm.impl.PouexmmPackageImpl#getInfluenceType()
	 * @generated
	 */
	int INFLUENCE_TYPE = 17;

	/**
	 * The meta object id for the '{@link dmss.pouex.pouexmm.MathematicOperator <em>Mathematic Operator</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see dmss.pouex.pouexmm.MathematicOperator
	 * @see dmss.pouex.pouexmm.impl.PouexmmPackageImpl#getMathematicOperator()
	 * @generated
	 */
	int MATHEMATIC_OPERATOR = 18;

	/**
	 * The meta object id for the '{@link dmss.pouex.pouexmm.ActionStatus <em>Action Status</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see dmss.pouex.pouexmm.ActionStatus
	 * @see dmss.pouex.pouexmm.impl.PouexmmPackageImpl#getActionStatus()
	 * @generated
	 */
	int ACTION_STATUS = 19;


	/**
	 * Returns the meta object for class '{@link dmss.pouex.pouexmm.Game <em>Game</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Game</em>'.
	 * @see dmss.pouex.pouexmm.Game
	 * @generated
	 */
	EClass getGame();

	/**
	 * Returns the meta object for the containment reference '{@link dmss.pouex.pouexmm.Game#getPouex <em>Pouex</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Pouex</em>'.
	 * @see dmss.pouex.pouexmm.Game#getPouex()
	 * @see #getGame()
	 * @generated
	 */
	EReference getGame_Pouex();

	/**
	 * Returns the meta object for class '{@link dmss.pouex.pouexmm.Pouex <em>Pouex</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Pouex</em>'.
	 * @see dmss.pouex.pouexmm.Pouex
	 * @generated
	 */
	EClass getPouex();

	/**
	 * Returns the meta object for the containment reference list '{@link dmss.pouex.pouexmm.Pouex#getFeatures <em>Features</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Features</em>'.
	 * @see dmss.pouex.pouexmm.Pouex#getFeatures()
	 * @see #getPouex()
	 * @generated
	 */
	EReference getPouex_Features();

	/**
	 * Returns the meta object for the containment reference list '{@link dmss.pouex.pouexmm.Pouex#getStates <em>States</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>States</em>'.
	 * @see dmss.pouex.pouexmm.Pouex#getStates()
	 * @see #getPouex()
	 * @generated
	 */
	EReference getPouex_States();

	/**
	 * Returns the meta object for the containment reference list '{@link dmss.pouex.pouexmm.Pouex#getActions <em>Actions</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Actions</em>'.
	 * @see dmss.pouex.pouexmm.Pouex#getActions()
	 * @see #getPouex()
	 * @generated
	 */
	EReference getPouex_Actions();

	/**
	 * Returns the meta object for the attribute '{@link dmss.pouex.pouexmm.Pouex#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see dmss.pouex.pouexmm.Pouex#getName()
	 * @see #getPouex()
	 * @generated
	 */
	EAttribute getPouex_Name();

	/**
	 * Returns the meta object for the containment reference list '{@link dmss.pouex.pouexmm.Pouex#getBodyparts <em>Bodyparts</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Bodyparts</em>'.
	 * @see dmss.pouex.pouexmm.Pouex#getBodyparts()
	 * @see #getPouex()
	 * @generated
	 */
	EReference getPouex_Bodyparts();

	/**
	 * Returns the meta object for class '{@link dmss.pouex.pouexmm.PouexFeature <em>Pouex Feature</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Pouex Feature</em>'.
	 * @see dmss.pouex.pouexmm.PouexFeature
	 * @generated
	 */
	EClass getPouexFeature();

	/**
	 * Returns the meta object for the attribute '{@link dmss.pouex.pouexmm.PouexFeature#getDefault <em>Default</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Default</em>'.
	 * @see dmss.pouex.pouexmm.PouexFeature#getDefault()
	 * @see #getPouexFeature()
	 * @generated
	 */
	EAttribute getPouexFeature_Default();

	/**
	 * Returns the meta object for the attribute '{@link dmss.pouex.pouexmm.PouexFeature#getMinimum <em>Minimum</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Minimum</em>'.
	 * @see dmss.pouex.pouexmm.PouexFeature#getMinimum()
	 * @see #getPouexFeature()
	 * @generated
	 */
	EAttribute getPouexFeature_Minimum();

	/**
	 * Returns the meta object for the attribute '{@link dmss.pouex.pouexmm.PouexFeature#getMaximum <em>Maximum</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Maximum</em>'.
	 * @see dmss.pouex.pouexmm.PouexFeature#getMaximum()
	 * @see #getPouexFeature()
	 * @generated
	 */
	EAttribute getPouexFeature_Maximum();

	/**
	 * Returns the meta object for the attribute '{@link dmss.pouex.pouexmm.PouexFeature#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type</em>'.
	 * @see dmss.pouex.pouexmm.PouexFeature#getType()
	 * @see #getPouexFeature()
	 * @generated
	 */
	EAttribute getPouexFeature_Type();

	/**
	 * Returns the meta object for the attribute '{@link dmss.pouex.pouexmm.PouexFeature#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see dmss.pouex.pouexmm.PouexFeature#getName()
	 * @see #getPouexFeature()
	 * @generated
	 */
	EAttribute getPouexFeature_Name();

	/**
	 * Returns the meta object for class '{@link dmss.pouex.pouexmm.Physic <em>Physic</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Physic</em>'.
	 * @see dmss.pouex.pouexmm.Physic
	 * @generated
	 */
	EClass getPhysic();

	/**
	 * Returns the meta object for class '{@link dmss.pouex.pouexmm.Emotional <em>Emotional</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Emotional</em>'.
	 * @see dmss.pouex.pouexmm.Emotional
	 * @generated
	 */
	EClass getEmotional();

	/**
	 * Returns the meta object for class '{@link dmss.pouex.pouexmm.State <em>State</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>State</em>'.
	 * @see dmss.pouex.pouexmm.State
	 * @generated
	 */
	EClass getState();

	/**
	 * Returns the meta object for the containment reference list '{@link dmss.pouex.pouexmm.State#getActivationConditions <em>Activation Conditions</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Activation Conditions</em>'.
	 * @see dmss.pouex.pouexmm.State#getActivationConditions()
	 * @see #getState()
	 * @generated
	 */
	EReference getState_ActivationConditions();

	/**
	 * Returns the meta object for the attribute '{@link dmss.pouex.pouexmm.State#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see dmss.pouex.pouexmm.State#getName()
	 * @see #getState()
	 * @generated
	 */
	EAttribute getState_Name();

	/**
	 * Returns the meta object for class '{@link dmss.pouex.pouexmm.ActivationCondition <em>Activation Condition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Activation Condition</em>'.
	 * @see dmss.pouex.pouexmm.ActivationCondition
	 * @generated
	 */
	EClass getActivationCondition();

	/**
	 * Returns the meta object for the reference '{@link dmss.pouex.pouexmm.ActivationCondition#getFeatures <em>Features</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Features</em>'.
	 * @see dmss.pouex.pouexmm.ActivationCondition#getFeatures()
	 * @see #getActivationCondition()
	 * @generated
	 */
	EReference getActivationCondition_Features();

	/**
	 * Returns the meta object for the attribute '{@link dmss.pouex.pouexmm.ActivationCondition#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see dmss.pouex.pouexmm.ActivationCondition#getName()
	 * @see #getActivationCondition()
	 * @generated
	 */
	EAttribute getActivationCondition_Name();

	/**
	 * Returns the meta object for class '{@link dmss.pouex.pouexmm.Action <em>Action</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Action</em>'.
	 * @see dmss.pouex.pouexmm.Action
	 * @generated
	 */
	EClass getAction();

	/**
	 * Returns the meta object for the containment reference list '{@link dmss.pouex.pouexmm.Action#getInfluences <em>Influences</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Influences</em>'.
	 * @see dmss.pouex.pouexmm.Action#getInfluences()
	 * @see #getAction()
	 * @generated
	 */
	EReference getAction_Influences();

	/**
	 * Returns the meta object for the attribute '{@link dmss.pouex.pouexmm.Action#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see dmss.pouex.pouexmm.Action#getName()
	 * @see #getAction()
	 * @generated
	 */
	EAttribute getAction_Name();

	/**
	 * Returns the meta object for the attribute '{@link dmss.pouex.pouexmm.Action#getCurrentStatus <em>Current Status</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Current Status</em>'.
	 * @see dmss.pouex.pouexmm.Action#getCurrentStatus()
	 * @see #getAction()
	 * @generated
	 */
	EAttribute getAction_CurrentStatus();

	/**
	 * Returns the meta object for class '{@link dmss.pouex.pouexmm.TimeEvent <em>Time Event</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Time Event</em>'.
	 * @see dmss.pouex.pouexmm.TimeEvent
	 * @generated
	 */
	EClass getTimeEvent();

	/**
	 * Returns the meta object for class '{@link dmss.pouex.pouexmm.Influence <em>Influence</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Influence</em>'.
	 * @see dmss.pouex.pouexmm.Influence
	 * @generated
	 */
	EClass getInfluence();

	/**
	 * Returns the meta object for the reference '{@link dmss.pouex.pouexmm.Influence#getFeature <em>Feature</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Feature</em>'.
	 * @see dmss.pouex.pouexmm.Influence#getFeature()
	 * @see #getInfluence()
	 * @generated
	 */
	EReference getInfluence_Feature();

	/**
	 * Returns the meta object for the attribute '{@link dmss.pouex.pouexmm.Influence#getOperator <em>Operator</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Operator</em>'.
	 * @see dmss.pouex.pouexmm.Influence#getOperator()
	 * @see #getInfluence()
	 * @generated
	 */
	EAttribute getInfluence_Operator();

	/**
	 * Returns the meta object for the attribute '{@link dmss.pouex.pouexmm.Influence#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see dmss.pouex.pouexmm.Influence#getValue()
	 * @see #getInfluence()
	 * @generated
	 */
	EAttribute getInfluence_Value();

	/**
	 * Returns the meta object for class '{@link dmss.pouex.pouexmm.BodyPart <em>Body Part</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Body Part</em>'.
	 * @see dmss.pouex.pouexmm.BodyPart
	 * @generated
	 */
	EClass getBodyPart();

	/**
	 * Returns the meta object for the containment reference list '{@link dmss.pouex.pouexmm.BodyPart#getSubparts <em>Subparts</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Subparts</em>'.
	 * @see dmss.pouex.pouexmm.BodyPart#getSubparts()
	 * @see #getBodyPart()
	 * @generated
	 */
	EReference getBodyPart_Subparts();

	/**
	 * Returns the meta object for the attribute '{@link dmss.pouex.pouexmm.BodyPart#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see dmss.pouex.pouexmm.BodyPart#getName()
	 * @see #getBodyPart()
	 * @generated
	 */
	EAttribute getBodyPart_Name();

	/**
	 * Returns the meta object for class '{@link dmss.pouex.pouexmm.PouexAction <em>Pouex Action</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Pouex Action</em>'.
	 * @see dmss.pouex.pouexmm.PouexAction
	 * @generated
	 */
	EClass getPouexAction();

	/**
	 * Returns the meta object for the containment reference list '{@link dmss.pouex.pouexmm.PouexAction#getSubtype <em>Subtype</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Subtype</em>'.
	 * @see dmss.pouex.pouexmm.PouexAction#getSubtype()
	 * @see #getPouexAction()
	 * @generated
	 */
	EReference getPouexAction_Subtype();

	/**
	 * Returns the meta object for the containment reference list '{@link dmss.pouex.pouexmm.PouexAction#getFeatures <em>Features</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Features</em>'.
	 * @see dmss.pouex.pouexmm.PouexAction#getFeatures()
	 * @see #getPouexAction()
	 * @generated
	 */
	EReference getPouexAction_Features();

	/**
	 * Returns the meta object for class '{@link dmss.pouex.pouexmm.PouexActionFeature <em>Pouex Action Feature</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Pouex Action Feature</em>'.
	 * @see dmss.pouex.pouexmm.PouexActionFeature
	 * @generated
	 */
	EClass getPouexActionFeature();

	/**
	 * Returns the meta object for class '{@link dmss.pouex.pouexmm.MinThresholdActivationCondition <em>Min Threshold Activation Condition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Min Threshold Activation Condition</em>'.
	 * @see dmss.pouex.pouexmm.MinThresholdActivationCondition
	 * @generated
	 */
	EClass getMinThresholdActivationCondition();

	/**
	 * Returns the meta object for class '{@link dmss.pouex.pouexmm.MaxThresholdActivationCondition <em>Max Threshold Activation Condition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Max Threshold Activation Condition</em>'.
	 * @see dmss.pouex.pouexmm.MaxThresholdActivationCondition
	 * @generated
	 */
	EClass getMaxThresholdActivationCondition();

	/**
	 * Returns the meta object for class '{@link dmss.pouex.pouexmm.ThresholdActivationCondition <em>Threshold Activation Condition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Threshold Activation Condition</em>'.
	 * @see dmss.pouex.pouexmm.ThresholdActivationCondition
	 * @generated
	 */
	EClass getThresholdActivationCondition();

	/**
	 * Returns the meta object for the attribute '{@link dmss.pouex.pouexmm.ThresholdActivationCondition#getThreshold <em>Threshold</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Threshold</em>'.
	 * @see dmss.pouex.pouexmm.ThresholdActivationCondition#getThreshold()
	 * @see #getThresholdActivationCondition()
	 * @generated
	 */
	EAttribute getThresholdActivationCondition_Threshold();

	/**
	 * Returns the meta object for class '{@link dmss.pouex.pouexmm.RepeatedAction <em>Repeated Action</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Repeated Action</em>'.
	 * @see dmss.pouex.pouexmm.RepeatedAction
	 * @generated
	 */
	EClass getRepeatedAction();

	/**
	 * Returns the meta object for the attribute '{@link dmss.pouex.pouexmm.RepeatedAction#getEachMillisec <em>Each Millisec</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Each Millisec</em>'.
	 * @see dmss.pouex.pouexmm.RepeatedAction#getEachMillisec()
	 * @see #getRepeatedAction()
	 * @generated
	 */
	EAttribute getRepeatedAction_EachMillisec();

	/**
	 * Returns the meta object for enum '{@link dmss.pouex.pouexmm.InfluenceType <em>Influence Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Influence Type</em>'.
	 * @see dmss.pouex.pouexmm.InfluenceType
	 * @generated
	 */
	EEnum getInfluenceType();

	/**
	 * Returns the meta object for enum '{@link dmss.pouex.pouexmm.MathematicOperator <em>Mathematic Operator</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Mathematic Operator</em>'.
	 * @see dmss.pouex.pouexmm.MathematicOperator
	 * @generated
	 */
	EEnum getMathematicOperator();

	/**
	 * Returns the meta object for enum '{@link dmss.pouex.pouexmm.ActionStatus <em>Action Status</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Action Status</em>'.
	 * @see dmss.pouex.pouexmm.ActionStatus
	 * @generated
	 */
	EEnum getActionStatus();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	PouexmmFactory getPouexmmFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each operation of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link dmss.pouex.pouexmm.impl.GameImpl <em>Game</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see dmss.pouex.pouexmm.impl.GameImpl
		 * @see dmss.pouex.pouexmm.impl.PouexmmPackageImpl#getGame()
		 * @generated
		 */
		EClass GAME = eINSTANCE.getGame();

		/**
		 * The meta object literal for the '<em><b>Pouex</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference GAME__POUEX = eINSTANCE.getGame_Pouex();

		/**
		 * The meta object literal for the '{@link dmss.pouex.pouexmm.impl.PouexImpl <em>Pouex</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see dmss.pouex.pouexmm.impl.PouexImpl
		 * @see dmss.pouex.pouexmm.impl.PouexmmPackageImpl#getPouex()
		 * @generated
		 */
		EClass POUEX = eINSTANCE.getPouex();

		/**
		 * The meta object literal for the '<em><b>Features</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference POUEX__FEATURES = eINSTANCE.getPouex_Features();

		/**
		 * The meta object literal for the '<em><b>States</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference POUEX__STATES = eINSTANCE.getPouex_States();

		/**
		 * The meta object literal for the '<em><b>Actions</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference POUEX__ACTIONS = eINSTANCE.getPouex_Actions();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute POUEX__NAME = eINSTANCE.getPouex_Name();

		/**
		 * The meta object literal for the '<em><b>Bodyparts</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference POUEX__BODYPARTS = eINSTANCE.getPouex_Bodyparts();

		/**
		 * The meta object literal for the '{@link dmss.pouex.pouexmm.impl.PouexFeatureImpl <em>Pouex Feature</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see dmss.pouex.pouexmm.impl.PouexFeatureImpl
		 * @see dmss.pouex.pouexmm.impl.PouexmmPackageImpl#getPouexFeature()
		 * @generated
		 */
		EClass POUEX_FEATURE = eINSTANCE.getPouexFeature();

		/**
		 * The meta object literal for the '<em><b>Default</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute POUEX_FEATURE__DEFAULT = eINSTANCE.getPouexFeature_Default();

		/**
		 * The meta object literal for the '<em><b>Minimum</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute POUEX_FEATURE__MINIMUM = eINSTANCE.getPouexFeature_Minimum();

		/**
		 * The meta object literal for the '<em><b>Maximum</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute POUEX_FEATURE__MAXIMUM = eINSTANCE.getPouexFeature_Maximum();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute POUEX_FEATURE__TYPE = eINSTANCE.getPouexFeature_Type();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute POUEX_FEATURE__NAME = eINSTANCE.getPouexFeature_Name();

		/**
		 * The meta object literal for the '{@link dmss.pouex.pouexmm.impl.PhysicImpl <em>Physic</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see dmss.pouex.pouexmm.impl.PhysicImpl
		 * @see dmss.pouex.pouexmm.impl.PouexmmPackageImpl#getPhysic()
		 * @generated
		 */
		EClass PHYSIC = eINSTANCE.getPhysic();

		/**
		 * The meta object literal for the '{@link dmss.pouex.pouexmm.impl.EmotionalImpl <em>Emotional</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see dmss.pouex.pouexmm.impl.EmotionalImpl
		 * @see dmss.pouex.pouexmm.impl.PouexmmPackageImpl#getEmotional()
		 * @generated
		 */
		EClass EMOTIONAL = eINSTANCE.getEmotional();

		/**
		 * The meta object literal for the '{@link dmss.pouex.pouexmm.impl.StateImpl <em>State</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see dmss.pouex.pouexmm.impl.StateImpl
		 * @see dmss.pouex.pouexmm.impl.PouexmmPackageImpl#getState()
		 * @generated
		 */
		EClass STATE = eINSTANCE.getState();

		/**
		 * The meta object literal for the '<em><b>Activation Conditions</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference STATE__ACTIVATION_CONDITIONS = eINSTANCE.getState_ActivationConditions();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute STATE__NAME = eINSTANCE.getState_Name();

		/**
		 * The meta object literal for the '{@link dmss.pouex.pouexmm.impl.ActivationConditionImpl <em>Activation Condition</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see dmss.pouex.pouexmm.impl.ActivationConditionImpl
		 * @see dmss.pouex.pouexmm.impl.PouexmmPackageImpl#getActivationCondition()
		 * @generated
		 */
		EClass ACTIVATION_CONDITION = eINSTANCE.getActivationCondition();

		/**
		 * The meta object literal for the '<em><b>Features</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ACTIVATION_CONDITION__FEATURES = eINSTANCE.getActivationCondition_Features();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ACTIVATION_CONDITION__NAME = eINSTANCE.getActivationCondition_Name();

		/**
		 * The meta object literal for the '{@link dmss.pouex.pouexmm.impl.ActionImpl <em>Action</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see dmss.pouex.pouexmm.impl.ActionImpl
		 * @see dmss.pouex.pouexmm.impl.PouexmmPackageImpl#getAction()
		 * @generated
		 */
		EClass ACTION = eINSTANCE.getAction();

		/**
		 * The meta object literal for the '<em><b>Influences</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ACTION__INFLUENCES = eINSTANCE.getAction_Influences();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ACTION__NAME = eINSTANCE.getAction_Name();

		/**
		 * The meta object literal for the '<em><b>Current Status</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ACTION__CURRENT_STATUS = eINSTANCE.getAction_CurrentStatus();

		/**
		 * The meta object literal for the '{@link dmss.pouex.pouexmm.impl.TimeEventImpl <em>Time Event</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see dmss.pouex.pouexmm.impl.TimeEventImpl
		 * @see dmss.pouex.pouexmm.impl.PouexmmPackageImpl#getTimeEvent()
		 * @generated
		 */
		EClass TIME_EVENT = eINSTANCE.getTimeEvent();

		/**
		 * The meta object literal for the '{@link dmss.pouex.pouexmm.impl.InfluenceImpl <em>Influence</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see dmss.pouex.pouexmm.impl.InfluenceImpl
		 * @see dmss.pouex.pouexmm.impl.PouexmmPackageImpl#getInfluence()
		 * @generated
		 */
		EClass INFLUENCE = eINSTANCE.getInfluence();

		/**
		 * The meta object literal for the '<em><b>Feature</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference INFLUENCE__FEATURE = eINSTANCE.getInfluence_Feature();

		/**
		 * The meta object literal for the '<em><b>Operator</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute INFLUENCE__OPERATOR = eINSTANCE.getInfluence_Operator();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute INFLUENCE__VALUE = eINSTANCE.getInfluence_Value();

		/**
		 * The meta object literal for the '{@link dmss.pouex.pouexmm.impl.BodyPartImpl <em>Body Part</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see dmss.pouex.pouexmm.impl.BodyPartImpl
		 * @see dmss.pouex.pouexmm.impl.PouexmmPackageImpl#getBodyPart()
		 * @generated
		 */
		EClass BODY_PART = eINSTANCE.getBodyPart();

		/**
		 * The meta object literal for the '<em><b>Subparts</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BODY_PART__SUBPARTS = eINSTANCE.getBodyPart_Subparts();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BODY_PART__NAME = eINSTANCE.getBodyPart_Name();

		/**
		 * The meta object literal for the '{@link dmss.pouex.pouexmm.impl.PouexActionImpl <em>Pouex Action</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see dmss.pouex.pouexmm.impl.PouexActionImpl
		 * @see dmss.pouex.pouexmm.impl.PouexmmPackageImpl#getPouexAction()
		 * @generated
		 */
		EClass POUEX_ACTION = eINSTANCE.getPouexAction();

		/**
		 * The meta object literal for the '<em><b>Subtype</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference POUEX_ACTION__SUBTYPE = eINSTANCE.getPouexAction_Subtype();

		/**
		 * The meta object literal for the '<em><b>Features</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference POUEX_ACTION__FEATURES = eINSTANCE.getPouexAction_Features();

		/**
		 * The meta object literal for the '{@link dmss.pouex.pouexmm.impl.PouexActionFeatureImpl <em>Pouex Action Feature</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see dmss.pouex.pouexmm.impl.PouexActionFeatureImpl
		 * @see dmss.pouex.pouexmm.impl.PouexmmPackageImpl#getPouexActionFeature()
		 * @generated
		 */
		EClass POUEX_ACTION_FEATURE = eINSTANCE.getPouexActionFeature();

		/**
		 * The meta object literal for the '{@link dmss.pouex.pouexmm.impl.MinThresholdActivationConditionImpl <em>Min Threshold Activation Condition</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see dmss.pouex.pouexmm.impl.MinThresholdActivationConditionImpl
		 * @see dmss.pouex.pouexmm.impl.PouexmmPackageImpl#getMinThresholdActivationCondition()
		 * @generated
		 */
		EClass MIN_THRESHOLD_ACTIVATION_CONDITION = eINSTANCE.getMinThresholdActivationCondition();

		/**
		 * The meta object literal for the '{@link dmss.pouex.pouexmm.impl.MaxThresholdActivationConditionImpl <em>Max Threshold Activation Condition</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see dmss.pouex.pouexmm.impl.MaxThresholdActivationConditionImpl
		 * @see dmss.pouex.pouexmm.impl.PouexmmPackageImpl#getMaxThresholdActivationCondition()
		 * @generated
		 */
		EClass MAX_THRESHOLD_ACTIVATION_CONDITION = eINSTANCE.getMaxThresholdActivationCondition();

		/**
		 * The meta object literal for the '{@link dmss.pouex.pouexmm.impl.ThresholdActivationConditionImpl <em>Threshold Activation Condition</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see dmss.pouex.pouexmm.impl.ThresholdActivationConditionImpl
		 * @see dmss.pouex.pouexmm.impl.PouexmmPackageImpl#getThresholdActivationCondition()
		 * @generated
		 */
		EClass THRESHOLD_ACTIVATION_CONDITION = eINSTANCE.getThresholdActivationCondition();

		/**
		 * The meta object literal for the '<em><b>Threshold</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute THRESHOLD_ACTIVATION_CONDITION__THRESHOLD = eINSTANCE.getThresholdActivationCondition_Threshold();

		/**
		 * The meta object literal for the '{@link dmss.pouex.pouexmm.impl.RepeatedActionImpl <em>Repeated Action</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see dmss.pouex.pouexmm.impl.RepeatedActionImpl
		 * @see dmss.pouex.pouexmm.impl.PouexmmPackageImpl#getRepeatedAction()
		 * @generated
		 */
		EClass REPEATED_ACTION = eINSTANCE.getRepeatedAction();

		/**
		 * The meta object literal for the '<em><b>Each Millisec</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute REPEATED_ACTION__EACH_MILLISEC = eINSTANCE.getRepeatedAction_EachMillisec();

		/**
		 * The meta object literal for the '{@link dmss.pouex.pouexmm.InfluenceType <em>Influence Type</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see dmss.pouex.pouexmm.InfluenceType
		 * @see dmss.pouex.pouexmm.impl.PouexmmPackageImpl#getInfluenceType()
		 * @generated
		 */
		EEnum INFLUENCE_TYPE = eINSTANCE.getInfluenceType();

		/**
		 * The meta object literal for the '{@link dmss.pouex.pouexmm.MathematicOperator <em>Mathematic Operator</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see dmss.pouex.pouexmm.MathematicOperator
		 * @see dmss.pouex.pouexmm.impl.PouexmmPackageImpl#getMathematicOperator()
		 * @generated
		 */
		EEnum MATHEMATIC_OPERATOR = eINSTANCE.getMathematicOperator();

		/**
		 * The meta object literal for the '{@link dmss.pouex.pouexmm.ActionStatus <em>Action Status</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see dmss.pouex.pouexmm.ActionStatus
		 * @see dmss.pouex.pouexmm.impl.PouexmmPackageImpl#getActionStatus()
		 * @generated
		 */
		EEnum ACTION_STATUS = eINSTANCE.getActionStatus();

	}

} //PouexmmPackage
