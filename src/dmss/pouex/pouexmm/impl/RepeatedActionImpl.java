/**
 */
package dmss.pouex.pouexmm.impl;

import dmss.pouex.pouexmm.PouexmmPackage;
import dmss.pouex.pouexmm.RepeatedAction;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Repeated Action</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link dmss.pouex.pouexmm.impl.RepeatedActionImpl#getEachMillisec <em>Each Millisec</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class RepeatedActionImpl extends ActionImpl implements RepeatedAction {
	/**
	 * The default value of the '{@link #getEachMillisec() <em>Each Millisec</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEachMillisec()
	 * @generated
	 * @ordered
	 */
	protected static final double EACH_MILLISEC_EDEFAULT = 0.0;

	/**
	 * The cached value of the '{@link #getEachMillisec() <em>Each Millisec</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEachMillisec()
	 * @generated
	 * @ordered
	 */
	protected double eachMillisec = EACH_MILLISEC_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected RepeatedActionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return PouexmmPackage.Literals.REPEATED_ACTION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public double getEachMillisec() {
		return eachMillisec;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEachMillisec(double newEachMillisec) {
		double oldEachMillisec = eachMillisec;
		eachMillisec = newEachMillisec;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PouexmmPackage.REPEATED_ACTION__EACH_MILLISEC, oldEachMillisec, eachMillisec));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case PouexmmPackage.REPEATED_ACTION__EACH_MILLISEC:
				return getEachMillisec();
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
			case PouexmmPackage.REPEATED_ACTION__EACH_MILLISEC:
				setEachMillisec((Double)newValue);
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
			case PouexmmPackage.REPEATED_ACTION__EACH_MILLISEC:
				setEachMillisec(EACH_MILLISEC_EDEFAULT);
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
			case PouexmmPackage.REPEATED_ACTION__EACH_MILLISEC:
				return eachMillisec != EACH_MILLISEC_EDEFAULT;
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
		result.append(" (eachMillisec: ");
		result.append(eachMillisec);
		result.append(')');
		return result.toString();
	}

} //RepeatedActionImpl
