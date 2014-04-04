/**
 */
package dmss.pouex.pouexmm.impl;

import dmss.pouex.pouexmm.Game;
import dmss.pouex.pouexmm.Pouex;
import dmss.pouex.pouexmm.PouexmmPackage;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Game</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link dmss.pouex.pouexmm.impl.GameImpl#getPouex <em>Pouex</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class GameImpl extends MinimalEObjectImpl.Container implements Game {
	/**
	 * The cached value of the '{@link #getPouex() <em>Pouex</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPouex()
	 * @generated
	 * @ordered
	 */
	protected Pouex pouex;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected GameImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return PouexmmPackage.Literals.GAME;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Pouex getPouex() {
		return pouex;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetPouex(Pouex newPouex, NotificationChain msgs) {
		Pouex oldPouex = pouex;
		pouex = newPouex;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, PouexmmPackage.GAME__POUEX, oldPouex, newPouex);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPouex(Pouex newPouex) {
		if (newPouex != pouex) {
			NotificationChain msgs = null;
			if (pouex != null)
				msgs = ((InternalEObject)pouex).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - PouexmmPackage.GAME__POUEX, null, msgs);
			if (newPouex != null)
				msgs = ((InternalEObject)newPouex).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - PouexmmPackage.GAME__POUEX, null, msgs);
			msgs = basicSetPouex(newPouex, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PouexmmPackage.GAME__POUEX, newPouex, newPouex));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case PouexmmPackage.GAME__POUEX:
				return basicSetPouex(null, msgs);
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
			case PouexmmPackage.GAME__POUEX:
				return getPouex();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case PouexmmPackage.GAME__POUEX:
				setPouex((Pouex)newValue);
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
			case PouexmmPackage.GAME__POUEX:
				setPouex((Pouex)null);
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
			case PouexmmPackage.GAME__POUEX:
				return pouex != null;
		}
		return super.eIsSet(featureID);
	}

} //GameImpl
