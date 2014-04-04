/**
 */
package dmss.pouex.pouexmm.impl;

import dmss.pouex.pouexmm.Action;
import dmss.pouex.pouexmm.BodyPart;
import dmss.pouex.pouexmm.Pouex;
import dmss.pouex.pouexmm.PouexFeature;
import dmss.pouex.pouexmm.PouexmmPackage;
import dmss.pouex.pouexmm.State;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Pouex</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link dmss.pouex.pouexmm.impl.PouexImpl#getFeatures <em>Features</em>}</li>
 *   <li>{@link dmss.pouex.pouexmm.impl.PouexImpl#getStates <em>States</em>}</li>
 *   <li>{@link dmss.pouex.pouexmm.impl.PouexImpl#getActions <em>Actions</em>}</li>
 *   <li>{@link dmss.pouex.pouexmm.impl.PouexImpl#getName <em>Name</em>}</li>
 *   <li>{@link dmss.pouex.pouexmm.impl.PouexImpl#getBodyparts <em>Bodyparts</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class PouexImpl extends MinimalEObjectImpl.Container implements Pouex {
	/**
	 * The cached value of the '{@link #getFeatures() <em>Features</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFeatures()
	 * @generated
	 * @ordered
	 */
	protected EList<PouexFeature> features;

	/**
	 * The cached value of the '{@link #getStates() <em>States</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStates()
	 * @generated
	 * @ordered
	 */
	protected EList<State> states;

	/**
	 * The cached value of the '{@link #getActions() <em>Actions</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getActions()
	 * @generated
	 * @ordered
	 */
	protected EList<Action> actions;

	/**
	 * The default value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected static final String NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected String name = NAME_EDEFAULT;

	/**
	 * The cached value of the '{@link #getBodyparts() <em>Bodyparts</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBodyparts()
	 * @generated
	 * @ordered
	 */
	protected EList<BodyPart> bodyparts;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PouexImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return PouexmmPackage.Literals.POUEX;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<PouexFeature> getFeatures() {
		if (features == null) {
			features = new EObjectContainmentEList<PouexFeature>(PouexFeature.class, this, PouexmmPackage.POUEX__FEATURES);
		}
		return features;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<State> getStates() {
		if (states == null) {
			states = new EObjectContainmentEList<State>(State.class, this, PouexmmPackage.POUEX__STATES);
		}
		return states;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Action> getActions() {
		if (actions == null) {
			actions = new EObjectContainmentEList<Action>(Action.class, this, PouexmmPackage.POUEX__ACTIONS);
		}
		return actions;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getName() {
		return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setName(String newName) {
		String oldName = name;
		name = newName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PouexmmPackage.POUEX__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<BodyPart> getBodyparts() {
		if (bodyparts == null) {
			bodyparts = new EObjectContainmentEList<BodyPart>(BodyPart.class, this, PouexmmPackage.POUEX__BODYPARTS);
		}
		return bodyparts;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case PouexmmPackage.POUEX__FEATURES:
				return ((InternalEList<?>)getFeatures()).basicRemove(otherEnd, msgs);
			case PouexmmPackage.POUEX__STATES:
				return ((InternalEList<?>)getStates()).basicRemove(otherEnd, msgs);
			case PouexmmPackage.POUEX__ACTIONS:
				return ((InternalEList<?>)getActions()).basicRemove(otherEnd, msgs);
			case PouexmmPackage.POUEX__BODYPARTS:
				return ((InternalEList<?>)getBodyparts()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case PouexmmPackage.POUEX__FEATURES:
				return getFeatures();
			case PouexmmPackage.POUEX__STATES:
				return getStates();
			case PouexmmPackage.POUEX__ACTIONS:
				return getActions();
			case PouexmmPackage.POUEX__NAME:
				return getName();
			case PouexmmPackage.POUEX__BODYPARTS:
				return getBodyparts();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case PouexmmPackage.POUEX__FEATURES:
				getFeatures().clear();
				getFeatures().addAll((Collection<? extends PouexFeature>)newValue);
				return;
			case PouexmmPackage.POUEX__STATES:
				getStates().clear();
				getStates().addAll((Collection<? extends State>)newValue);
				return;
			case PouexmmPackage.POUEX__ACTIONS:
				getActions().clear();
				getActions().addAll((Collection<? extends Action>)newValue);
				return;
			case PouexmmPackage.POUEX__NAME:
				setName((String)newValue);
				return;
			case PouexmmPackage.POUEX__BODYPARTS:
				getBodyparts().clear();
				getBodyparts().addAll((Collection<? extends BodyPart>)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case PouexmmPackage.POUEX__FEATURES:
				getFeatures().clear();
				return;
			case PouexmmPackage.POUEX__STATES:
				getStates().clear();
				return;
			case PouexmmPackage.POUEX__ACTIONS:
				getActions().clear();
				return;
			case PouexmmPackage.POUEX__NAME:
				setName(NAME_EDEFAULT);
				return;
			case PouexmmPackage.POUEX__BODYPARTS:
				getBodyparts().clear();
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case PouexmmPackage.POUEX__FEATURES:
				return features != null && !features.isEmpty();
			case PouexmmPackage.POUEX__STATES:
				return states != null && !states.isEmpty();
			case PouexmmPackage.POUEX__ACTIONS:
				return actions != null && !actions.isEmpty();
			case PouexmmPackage.POUEX__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case PouexmmPackage.POUEX__BODYPARTS:
				return bodyparts != null && !bodyparts.isEmpty();
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (name: ");
		result.append(name);
		result.append(')');
		return result.toString();
	}

} //PouexImpl
