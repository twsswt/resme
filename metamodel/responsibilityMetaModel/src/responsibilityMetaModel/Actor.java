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
 *   <li>{@link responsibilityMetaModel.Actor#getRequiredBy <em>Required By</em>}</li>
 *   <li>{@link responsibilityMetaModel.Actor#getHeldResponsibility <em>Held Responsibility</em>}</li>
 * </ul>
 * </p>
 *
 * @see responsibilityMetaModel.ResponsibilityMetaModelPackage#getActor()
 * @model
 * @generated
 */
public interface Actor extends Entity {
	/**
	 * Returns the value of the '<em><b>Required By</b></em>' reference list.
	 * The list contents are of type {@link responsibilityMetaModel.actorRequiredRelationship}.
	 * It is bidirectional and its opposite is '{@link responsibilityMetaModel.actorRequiredRelationship#getActor <em>Actor</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Required By</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Required By</em>' reference list.
	 * @see responsibilityMetaModel.ResponsibilityMetaModelPackage#getActor_RequiredBy()
	 * @see responsibilityMetaModel.actorRequiredRelationship#getActor
	 * @model opposite="actor"
	 * @generated
	 */
	EList<actorRequiredRelationship> getRequiredBy();

	/**
	 * Returns the value of the '<em><b>Held Responsibility</b></em>' reference list.
	 * The list contents are of type {@link responsibilityMetaModel.actorHoldsRelationship}.
	 * It is bidirectional and its opposite is '{@link responsibilityMetaModel.actorHoldsRelationship#getActor <em>Actor</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Held Responsibility</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Held Responsibility</em>' reference list.
	 * @see responsibilityMetaModel.ResponsibilityMetaModelPackage#getActor_HeldResponsibility()
	 * @see responsibilityMetaModel.actorHoldsRelationship#getActor
	 * @model opposite="actor"
	 * @generated
	 */
	EList<actorHoldsRelationship> getHeldResponsibility();

} // Actor
