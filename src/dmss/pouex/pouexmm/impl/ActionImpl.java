/**
 */
package dmss.pouex.pouexmm.impl;

import dmss.pouex.pouexmm.Action;
import dmss.pouex.pouexmm.ActionStatus;
import dmss.pouex.pouexmm.Influence;
import dmss.pouex.pouexmm.PouexmmPackage;

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
 * An implementation of the model object '<em><b>Action</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link dmss.pouex.pouexmm.impl.ActionImpl#getInfluences <em>Influences</em>}</li>
 *   <li>{@link dmss.pouex.pouexmm.impl.ActionImpl#getName <em>Name</em>}</li>
 *   <li>{@link dmss.pouex.pouexmm.impl.ActionImpl#getCurrentStatus <em>Current Status</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public abstract class ActionImpl extends MinimalEObjectImpl.Container implements Action {
	/**
	 * The cached value of the '{@link #getInfluences() <em>Influences</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInfluences()
	 * @generated
	 * @ordered
	 */
	protected EList<Influence> influences;

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
	 * The default value of the '{@link #getCurrentStatus() <em>Current Status</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCurrentStatus()
	 * @generated
	 * @ordered
	 */
	protected static final ActionStatus CURRENT_STATUS_EDEFAULT = ActionStatus.ENABLED;

	/**
	 * The cached value of the '{@link #getCurrentStatus() <em>Current Status</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCurrentStatus()
	 * @generated
	 * @ordered
	 */
	protected ActionStatus currentStatus = CURRENT_STATUS_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ActionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return PouexmmPackage.Literals.ACTION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Influence> getInfluences() {
		if (influences == null) {
			influences = new EObjectContainmentEList<Influence>(Influence.class, this, PouexmmPackage.ACTION__INFLUENCES);
		}
		return influences;
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
			eNotify(new ENotificationImpl(this, Notification.SET, PouexmmPackage.ACTION__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ActionStatus getCurrentStatus() {
		return currentStatus;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCurrentStatus(ActionStatus newCurrentStatus) {
		ActionStatus oldCurrentStatus = currentStatus;
		currentStatus = newCurrentStatus == null ? CURRENT_STATUS_EDEFAULT : newCurrentStatus;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PouexmmPackage.ACTION__CURRENT_STATUS, oldCurrentStatus, currentStatus));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case PouexmmPackage.ACTION__INFLUENCES:
				return ((InternalEList<?>)getInfluences()).basicRemove(otherEnd, msgs);
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
			case PouexmmPackage.ACTION__INFLUENCES:
				return getInfluences();
			case PouexmmPackage.ACTION__NAME:
				return getName();
			case PouexmmPackage.ACTION__CURRENT_STATUS:
				return getCurrentStatus();
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
			case PouexmmPackage.ACTION__INFLUENCES:
				getInfluences().clear();
				getInfluences().addAll((Collection<? extends Influence>)newValue);
				return;
			case PouexmmPackage.ACTION__NAME:
				setName((String)newValue);
				return;
			case PouexmmPackage.ACTION__CURRENT_STATUS:
				setCurrentStatus((ActionStatus)newValue);
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
			case PouexmmPackage.ACTION__INFLUENCES:
				getInfluences().clear();
				return;
			case PouexmmPackage.ACTION__NAME:
				setName(NAME_EDEFAULT);
				return;
			case PouexmmPackage.ACTION__CURRENT_STATUS:
				setCurrentStatus(CURRENT_STATUS_EDEFAULT);
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
			case PouexmmPackage.ACTION__INFLUENCES:
				return influences != null && !influences.isEmpty();
			case PouexmmPackage.ACTION__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case PouexmmPackage.ACTION__CURRENT_STATUS:
				return currentStatus != CURRENT_STATUS_EDEFAULT;
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
		result.append(", currentStatus: ");
		result.append(currentStatus);
		result.append(')');
		return result.toString();
	}

} //ActionImpl
