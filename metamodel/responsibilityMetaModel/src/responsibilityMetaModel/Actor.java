/**
 */
package responsibilityMetaModel;

import java.util.List;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Actor</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link responsibilityMetaModel.Actor#getRequiredBy <em>Required By</em>}</li>
 *   <li>{@link responsibilityMetaModel.Actor#getHeldResponsibility <em>Held Responsibility</em>}</li>
 *   <li>{@link responsibilityMetaModel.Actor#getProducedBy <em>Produced By</em>}</li>
 * </ul>
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

	/**
	 * Returns the value of the '<em><b>Produced By</b></em>' reference list.
	 * The list contents are of type {@link responsibilityMetaModel.actorProducedRelationship}.
	 * It is bidirectional and its opposite is '{@link responsibilityMetaModel.actorProducedRelationship#getActor <em>Actor</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Produced By</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Produced By</em>' reference list.
	 * @see responsibilityMetaModel.ResponsibilityMetaModelPackage#getActor_ProducedBy()
	 * @see responsibilityMetaModel.actorProducedRelationship#getActor
	 * @model opposite="actor"
	 * @generated
	 */
	EList<actorProducedRelationship> getProducedBy();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model dataType="org.eclipse.emf.ecore.xml.type.Boolean"
	 * @generated
	 */
	boolean satisfied();
	
	
	/**
	 * @generated NOT
	 */
	public List<Actor> reliance();

} // Actor
