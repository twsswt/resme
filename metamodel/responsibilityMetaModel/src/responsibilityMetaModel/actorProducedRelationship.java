/**
 */
package responsibilityMetaModel;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>actor Produced Relationship</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link responsibilityMetaModel.actorProducedRelationship#getActor <em>Actor</em>}</li>
 *   <li>{@link responsibilityMetaModel.actorProducedRelationship#getResponsibility <em>Responsibility</em>}</li>
 * </ul>
 *
 * @see responsibilityMetaModel.ResponsibilityMetaModelPackage#getactorProducedRelationship()
 * @model
 * @generated
 */
public interface actorProducedRelationship extends Relation {
	/**
	 * Returns the value of the '<em><b>Actor</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link responsibilityMetaModel.Actor#getProducedBy <em>Produced By</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Actor</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Actor</em>' reference.
	 * @see #setActor(Actor)
	 * @see responsibilityMetaModel.ResponsibilityMetaModelPackage#getactorProducedRelationship_Actor()
	 * @see responsibilityMetaModel.Actor#getProducedBy
	 * @model opposite="producedBy"
	 * @generated
	 */
	Actor getActor();

	/**
	 * Sets the value of the '{@link responsibilityMetaModel.actorProducedRelationship#getActor <em>Actor</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Actor</em>' reference.
	 * @see #getActor()
	 * @generated
	 */
	void setActor(Actor value);

	/**
	 * Returns the value of the '<em><b>Responsibility</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link responsibilityMetaModel.Responsibility#getProducedActor <em>Produced Actor</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Responsibility</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Responsibility</em>' reference.
	 * @see #setResponsibility(Responsibility)
	 * @see responsibilityMetaModel.ResponsibilityMetaModelPackage#getactorProducedRelationship_Responsibility()
	 * @see responsibilityMetaModel.Responsibility#getProducedActor
	 * @model opposite="producedActor"
	 * @generated
	 */
	Responsibility getResponsibility();

	/**
	 * Sets the value of the '{@link responsibilityMetaModel.actorProducedRelationship#getResponsibility <em>Responsibility</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Responsibility</em>' reference.
	 * @see #getResponsibility()
	 * @generated
	 */
	void setResponsibility(Responsibility value);

} // actorProducedRelationship
