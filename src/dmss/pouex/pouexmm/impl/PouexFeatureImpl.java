/**
 */
package dmss.pouex.pouexmm.impl;

import dmss.pouex.pouexmm.InfluenceType;
import dmss.pouex.pouexmm.PouexFeature;
import dmss.pouex.pouexmm.PouexmmPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Pouex Feature</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link dmss.pouex.pouexmm.impl.PouexFeatureImpl#getDefault <em>Default</em>}</li>
 *   <li>{@link dmss.pouex.pouexmm.impl.PouexFeatureImpl#getMinimum <em>Minimum</em>}</li>
 *   <li>{@link dmss.pouex.pouexmm.impl.PouexFeatureImpl#getMaximum <em>Maximum</em>}</li>
 *   <li>{@link dmss.pouex.pouexmm.impl.PouexFeatureImpl#getType <em>Type</em>}</li>
 *   <li>{@link dmss.pouex.pouexmm.impl.PouexFeatureImpl#getName <em>Name</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public abstract class PouexFeatureImpl extends MinimalEObjectImpl.Container implements PouexFeature {
	/**
	 * The default value of the '{@link #getDefault() <em>Default</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDefault()
	 * @generated
	 * @ordered
	 */
	protected static final double DEFAULT_EDEFAULT = 0.0;

	/**
	 * The cached value of the '{@link #getDefault() <em>Default</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDefault()
	 * @generated
	 * @ordered
	 */
	protected double default_ = DEFAULT_EDEFAULT;

	/**
	 * The default value of the '{@link #getMinimum() <em>Minimum</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMinimum()
	 * @generated
	 * @ordered
	 */
	protected static final double MINIMUM_EDEFAULT = 0.0;

	/**
	 * The cached value of the '{@link #getMinimum() <em>Minimum</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMinimum()
	 * @generated
	 * @ordered
	 */
	protected double minimum = MINIMUM_EDEFAULT;

	/**
	 * The default value of the '{@link #getMaximum() <em>Maximum</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMaximum()
	 * @generated
	 * @ordered
	 */
	protected static final double MAXIMUM_EDEFAULT = 0.0;

	/**
	 * The cached value of the '{@link #getMaximum() <em>Maximum</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMaximum()
	 * @generated
	 * @ordered
	 */
	protected double maximum = MAXIMUM_EDEFAULT;

	/**
	 * The default value of the '{@link #getType() <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getType()
	 * @generated
	 * @ordered
	 */
	protected static final InfluenceType TYPE_EDEFAULT = InfluenceType.POSITIVE;

	/**
	 * The cached value of the '{@link #getType() <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getType()
	 * @generated
	 * @ordered
	 */
	protected InfluenceType type = TYPE_EDEFAULT;

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
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PouexFeatureImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return PouexmmPackage.Literals.POUEX_FEATURE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public double getDefault() {
		return default_;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDefault(double newDefault) {
		double oldDefault = default_;
		default_ = newDefault;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PouexmmPackage.POUEX_FEATURE__DEFAULT, oldDefault, default_));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public double getMinimum() {
		return minimum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMinimum(double newMinimum) {
		double oldMinimum = minimum;
		minimum = newMinimum;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PouexmmPackage.POUEX_FEATURE__MINIMUM, oldMinimum, minimum));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public double getMaximum() {
		return maximum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMaximum(double newMaximum) {
		double oldMaximum = maximum;
		maximum = newMaximum;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PouexmmPackage.POUEX_FEATURE__MAXIMUM, oldMaximum, maximum));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public InfluenceType getType() {
		return type;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setType(InfluenceType newType) {
		InfluenceType oldType = type;
		type = newType == null ? TYPE_EDEFAULT : newType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PouexmmPackage.POUEX_FEATURE__TYPE, oldType, type));
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
			eNotify(new ENotificationImpl(this, Notification.SET, PouexmmPackage.POUEX_FEATURE__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case PouexmmPackage.POUEX_FEATURE__DEFAULT:
				return getDefault();
			case PouexmmPackage.POUEX_FEATURE__MINIMUM:
				return getMinimum();
			case PouexmmPackage.POUEX_FEATURE__MAXIMUM:
				return getMaximum();
			case PouexmmPackage.POUEX_FEATURE__TYPE:
				return getType();
			case PouexmmPackage.POUEX_FEATURE__NAME:
				return getName();
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
			case PouexmmPackage.POUEX_FEATURE__DEFAULT:
				setDefault((Double)newValue);
				return;
			case PouexmmPackage.POUEX_FEATURE__MINIMUM:
				setMinimum((Double)newValue);
				return;
			case PouexmmPackage.POUEX_FEATURE__MAXIMUM:
				setMaximum((Double)newValue);
				return;
			case PouexmmPackage.POUEX_FEATURE__TYPE:
				setType((InfluenceType)newValue);
				return;
			case PouexmmPackage.POUEX_FEATURE__NAME:
				setName((String)newValue);
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
			case PouexmmPackage.POUEX_FEATURE__DEFAULT:
				setDefault(DEFAULT_EDEFAULT);
				return;
			case PouexmmPackage.POUEX_FEATURE__MINIMUM:
				setMinimum(MINIMUM_EDEFAULT);
				return;
			case PouexmmPackage.POUEX_FEATURE__MAXIMUM:
				setMaximum(MAXIMUM_EDEFAULT);
				return;
			case PouexmmPackage.POUEX_FEATURE__TYPE:
				setType(TYPE_EDEFAULT);
				return;
			case PouexmmPackage.POUEX_FEATURE__NAME:
				setName(NAME_EDEFAULT);
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
			case PouexmmPackage.POUEX_FEATURE__DEFAULT:
				return default_ != DEFAULT_EDEFAULT;
			case PouexmmPackage.POUEX_FEATURE__MINIMUM:
				return minimum != MINIMUM_EDEFAULT;
			case PouexmmPackage.POUEX_FEATURE__MAXIMUM:
				return maximum != MAXIMUM_EDEFAULT;
			case PouexmmPackage.POUEX_FEATURE__TYPE:
				return type != TYPE_EDEFAULT;
			case PouexmmPackage.POUEX_FEATURE__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
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
		result.append(" (default: ");
		result.append(default_);
		result.append(", minimum: ");
		result.append(minimum);
		result.append(", maximum: ");
		result.append(maximum);
		result.append(", type: ");
		result.append(type);
		result.append(", name: ");
		result.append(name);
		result.append(')');
		return result.toString();
	}

} //PouexFeatureImpl
