/**
 */
package dmss.pouex.pouexmm;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Pouex Feature</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link dmss.pouex.pouexmm.PouexFeature#getDefault <em>Default</em>}</li>
 *   <li>{@link dmss.pouex.pouexmm.PouexFeature#getMinimum <em>Minimum</em>}</li>
 *   <li>{@link dmss.pouex.pouexmm.PouexFeature#getMaximum <em>Maximum</em>}</li>
 *   <li>{@link dmss.pouex.pouexmm.PouexFeature#getType <em>Type</em>}</li>
 *   <li>{@link dmss.pouex.pouexmm.PouexFeature#getName <em>Name</em>}</li>
 * </ul>
 * </p>
 *
 * @see dmss.pouex.pouexmm.PouexmmPackage#getPouexFeature()
 * @model abstract="true"
 *        annotation="http://www.eclipse.org/emf/2002/Ecore constraints='coherentValueMinDefaultMax'"
 *        annotation="http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot coherentValueMinDefaultMax='self.minimum <= self.default and self.default <= self.maximum'"
 * @generated
 */
public interface PouexFeature extends EObject {
	/**
	 * Returns the value of the '<em><b>Default</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Default</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Default</em>' attribute.
	 * @see #setDefault(double)
	 * @see dmss.pouex.pouexmm.PouexmmPackage#getPouexFeature_Default()
	 * @model required="true"
	 * @generated
	 */
	double getDefault();

	/**
	 * Sets the value of the '{@link dmss.pouex.pouexmm.PouexFeature#getDefault <em>Default</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Default</em>' attribute.
	 * @see #getDefault()
	 * @generated
	 */
	void setDefault(double value);

	/**
	 * Returns the value of the '<em><b>Minimum</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Minimum</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Minimum</em>' attribute.
	 * @see #setMinimum(double)
	 * @see dmss.pouex.pouexmm.PouexmmPackage#getPouexFeature_Minimum()
	 * @model required="true"
	 * @generated
	 */
	double getMinimum();

	/**
	 * Sets the value of the '{@link dmss.pouex.pouexmm.PouexFeature#getMinimum <em>Minimum</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Minimum</em>' attribute.
	 * @see #getMinimum()
	 * @generated
	 */
	void setMinimum(double value);

	/**
	 * Returns the value of the '<em><b>Maximum</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Maximum</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Maximum</em>' attribute.
	 * @see #setMaximum(double)
	 * @see dmss.pouex.pouexmm.PouexmmPackage#getPouexFeature_Maximum()
	 * @model required="true"
	 * @generated
	 */
	double getMaximum();

	/**
	 * Sets the value of the '{@link dmss.pouex.pouexmm.PouexFeature#getMaximum <em>Maximum</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Maximum</em>' attribute.
	 * @see #getMaximum()
	 * @generated
	 */
	void setMaximum(double value);

	/**
	 * Returns the value of the '<em><b>Type</b></em>' attribute.
	 * The literals are from the enumeration {@link dmss.pouex.pouexmm.InfluenceType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Type</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Type</em>' attribute.
	 * @see dmss.pouex.pouexmm.InfluenceType
	 * @see #setType(InfluenceType)
	 * @see dmss.pouex.pouexmm.PouexmmPackage#getPouexFeature_Type()
	 * @model required="true"
	 * @generated
	 */
	InfluenceType getType();

	/**
	 * Sets the value of the '{@link dmss.pouex.pouexmm.PouexFeature#getType <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type</em>' attribute.
	 * @see dmss.pouex.pouexmm.InfluenceType
	 * @see #getType()
	 * @generated
	 */
	void setType(InfluenceType value);

	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see dmss.pouex.pouexmm.PouexmmPackage#getPouexFeature_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link dmss.pouex.pouexmm.PouexFeature#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

} // PouexFeature
