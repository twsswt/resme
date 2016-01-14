/**
 */
package responsibilityMetaModel;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>actor Required Relationship</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link responsibilityMetaModel.actorRequiredRelationship#getResponsibility <em>Responsibility</em>}</li>
 *   <li>{@link responsibilityMetaModel.actorRequiredRelationship#getActor <em>Actor</em>}</li>
 * </ul>
 *
 * @see responsibilityMetaModel.ResponsibilityMetaModelPackage#getactorRequiredRelationship()
 * @model
 * @generated
 */
public interface actorRequiredRelationship extends Relation {
	/**
	 * Returns the value of the '<em><b>Responsibility</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link responsibilityMetaModel.Responsibility#getRequiredActor <em>Required Actor</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Responsibility</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Responsibility</em>' reference.
	 * @see #setResponsibility(Responsibility)
	 * @see responsibilityMetaModel.ResponsibilityMetaModelPackage#getactorRequiredRelationship_Responsibility()
	 * @see responsibilityMetaModel.Responsibility#getRequiredActor
	 * @model opposite="requiredActor"
	 * @generated
	 */
	Responsibility getResponsibility();

	/**
	 * Sets the value of the '{@link responsibilityMetaModel.actorRequiredRelationship#getResponsibility <em>Responsibility</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Responsibility</em>' reference.
	 * @see #getResponsibility()
	 * @generated
	 */
	void setResponsibility(Responsibility value);

	/**
	 * Returns the value of the '<em><b>Actor</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link responsibilityMetaModel.Actor#getRequiredBy <em>Required By</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Actor</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Actor</em>' reference.
	 * @see #setActor(Actor)
	 * @see responsibilityMetaModel.ResponsibilityMetaModelPackage#getactorRequiredRelationship_Actor()
	 * @see responsibilityMetaModel.Actor#getRequiredBy
	 * @model opposite="requiredBy"
	 * @generated
	 */
	Actor getActor();

	/**
	 * Sets the value of the '{@link responsibilityMetaModel.actorRequiredRelationship#getActor <em>Actor</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Actor</em>' reference.
	 * @see #getActor()
	 * @generated
	 */
	void setActor(Actor value);

} // actorRequiredRelationship
