/**
 */
package responsibilityMetaModel;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Actor</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link responsibilityMetaModel.Actor#getHeldResponsibility <em>Held Responsibility</em>}</li>
 *   <li>{@link responsibilityMetaModel.Actor#getRequiredBy <em>Required By</em>}</li>
 * </ul>
 * </p>
 *
 * @see responsibilityMetaModel.ResponsibilityMetaModelPackage#getActor()
 * @model
 * @generated
 */
public interface Actor extends Entity {
	/**
	 * Returns the value of the '<em><b>Held Responsibility</b></em>' reference list.
	 * The list contents are of type {@link responsibilityMetaModel.Responsibility}.
	 * It is bidirectional and its opposite is '{@link responsibilityMetaModel.Responsibility#getHolder <em>Holder</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Held Responsibility</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Held Responsibility</em>' reference list.
	 * @see responsibilityMetaModel.ResponsibilityMetaModelPackage#getActor_HeldResponsibility()
	 * @see responsibilityMetaModel.Responsibility#getHolder
	 * @model opposite="holder"
	 * @generated
	 */
	EList<Responsibility> getHeldResponsibility();

	/**
	 * Returns the value of the '<em><b>Required By</b></em>' reference list.
	 * The list contents are of type {@link responsibilityMetaModel.Responsibility}.
	 * It is bidirectional and its opposite is '{@link responsibilityMetaModel.Responsibility#getActorRequired <em>Actor Required</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Required By</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Required By</em>' reference list.
	 * @see responsibilityMetaModel.ResponsibilityMetaModelPackage#getActor_RequiredBy()
	 * @see responsibilityMetaModel.Responsibility#getActorRequired
	 * @model opposite="actorRequired"
	 * @generated
	 */
	EList<Responsibility> getRequiredBy();

} // Actor
