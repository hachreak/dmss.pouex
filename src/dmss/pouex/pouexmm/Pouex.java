/**
 */
package dmss.pouex.pouexmm;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Pouex</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link dmss.pouex.pouexmm.Pouex#getFeatures <em>Features</em>}</li>
 *   <li>{@link dmss.pouex.pouexmm.Pouex#getStates <em>States</em>}</li>
 *   <li>{@link dmss.pouex.pouexmm.Pouex#getActions <em>Actions</em>}</li>
 *   <li>{@link dmss.pouex.pouexmm.Pouex#getName <em>Name</em>}</li>
 *   <li>{@link dmss.pouex.pouexmm.Pouex#getBodyparts <em>Bodyparts</em>}</li>
 * </ul>
 * </p>
 *
 * @see dmss.pouex.pouexmm.PouexmmPackage#getPouex()
 * @model annotation="http://www.eclipse.org/emf/2002/Ecore constraints='defineName cantExistTwoFeatureWithSameName atLeastOneActionForEachFeature'"
 *        annotation="http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot defineName='not self.name.oclIsUndefined() and self.name <> \'\'' cantExistTwoFeatureWithSameName='self.features->isUnique(f: PouexFeature | f.name)' atLeastOneActionForEachFeature='self.features->forAll(f: PouexFeature | self.actions.influences.feature->exists(inf_feature: PouexFeature | inf_feature = f))'"
 * @generated
 */
public interface Pouex extends EObject {
	/**
	 * Returns the value of the '<em><b>Features</b></em>' containment reference list.
	 * The list contents are of type {@link dmss.pouex.pouexmm.PouexFeature}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Features</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Features</em>' containment reference list.
	 * @see dmss.pouex.pouexmm.PouexmmPackage#getPouex_Features()
	 * @model containment="true"
	 * @generated
	 */
	EList<PouexFeature> getFeatures();

	/**
	 * Returns the value of the '<em><b>States</b></em>' containment reference list.
	 * The list contents are of type {@link dmss.pouex.pouexmm.State}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>States</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>States</em>' containment reference list.
	 * @see dmss.pouex.pouexmm.PouexmmPackage#getPouex_States()
	 * @model containment="true"
	 * @generated
	 */
	EList<State> getStates();

	/**
	 * Returns the value of the '<em><b>Actions</b></em>' containment reference list.
	 * The list contents are of type {@link dmss.pouex.pouexmm.Action}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Actions</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Actions</em>' containment reference list.
	 * @see dmss.pouex.pouexmm.PouexmmPackage#getPouex_Actions()
	 * @model containment="true"
	 * @generated
	 */
	EList<Action> getActions();

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
	 * @see dmss.pouex.pouexmm.PouexmmPackage#getPouex_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link dmss.pouex.pouexmm.Pouex#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Bodyparts</b></em>' containment reference list.
	 * The list contents are of type {@link dmss.pouex.pouexmm.BodyPart}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Bodyparts</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Bodyparts</em>' containment reference list.
	 * @see dmss.pouex.pouexmm.PouexmmPackage#getPouex_Bodyparts()
	 * @model containment="true" required="true"
	 * @generated
	 */
	EList<BodyPart> getBodyparts();

} // Pouex
