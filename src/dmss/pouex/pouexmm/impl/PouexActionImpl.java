/**
 */
package dmss.pouex.pouexmm.impl;

import dmss.pouex.pouexmm.PouexAction;
import dmss.pouex.pouexmm.PouexActionFeature;
import dmss.pouex.pouexmm.PouexmmPackage;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Pouex Action</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link dmss.pouex.pouexmm.impl.PouexActionImpl#getSubtype <em>Subtype</em>}</li>
 *   <li>{@link dmss.pouex.pouexmm.impl.PouexActionImpl#getFeatures <em>Features</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class PouexActionImpl extends ActionImpl implements PouexAction {
	/**
	 * The cached value of the '{@link #getSubtype() <em>Subtype</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSubtype()
	 * @generated
	 * @ordered
	 */
	protected EList<PouexAction> subtype;

	/**
	 * The cached value of the '{@link #getFeatures() <em>Features</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFeatures()
	 * @generated
	 * @ordered
	 */
	protected EList<PouexActionFeature> features;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PouexActionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return PouexmmPackage.Literals.POUEX_ACTION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<PouexAction> getSubtype() {
		if (subtype == null) {
			subtype = new EObjectContainmentEList<PouexAction>(PouexAction.class, this, PouexmmPackage.POUEX_ACTION__SUBTYPE);
		}
		return subtype;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<PouexActionFeature> getFeatures() {
		if (features == null) {
			features = new EObjectContainmentEList<PouexActionFeature>(PouexActionFeature.class, this, PouexmmPackage.POUEX_ACTION__FEATURES);
		}
		return features;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case PouexmmPackage.POUEX_ACTION__SUBTYPE:
				return ((InternalEList<?>)getSubtype()).basicRemove(otherEnd, msgs);
			case PouexmmPackage.POUEX_ACTION__FEATURES:
				return ((InternalEList<?>)getFeatures()).basicRemove(otherEnd, msgs);
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
			case PouexmmPackage.POUEX_ACTION__SUBTYPE:
				return getSubtype();
			case PouexmmPackage.POUEX_ACTION__FEATURES:
				return getFeatures();
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
			case PouexmmPackage.POUEX_ACTION__SUBTYPE:
				getSubtype().clear();
				getSubtype().addAll((Collection<? extends PouexAction>)newValue);
				return;
			case PouexmmPackage.POUEX_ACTION__FEATURES:
				getFeatures().clear();
				getFeatures().addAll((Collection<? extends PouexActionFeature>)newValue);
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
			case PouexmmPackage.POUEX_ACTION__SUBTYPE:
				getSubtype().clear();
				return;
			case PouexmmPackage.POUEX_ACTION__FEATURES:
				getFeatures().clear();
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
			case PouexmmPackage.POUEX_ACTION__SUBTYPE:
				return subtype != null && !subtype.isEmpty();
			case PouexmmPackage.POUEX_ACTION__FEATURES:
				return features != null && !features.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //PouexActionImpl
