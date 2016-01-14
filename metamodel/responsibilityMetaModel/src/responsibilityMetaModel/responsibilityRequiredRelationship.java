/**
 */
package responsibilityMetaModel;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>responsibility Required Relationship</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link responsibilityMetaModel.responsibilityRequiredRelationship#getSubResponsibility <em>Sub Responsibility</em>}</li>
 *   <li>{@link responsibilityMetaModel.responsibilityRequiredRelationship#getSuperResponsibility <em>Super Responsibility</em>}</li>
 * </ul>
 *
 * @see responsibilityMetaModel.ResponsibilityMetaModelPackage#getresponsibilityRequiredRelationship()
 * @model
 * @generated
 */
public interface responsibilityRequiredRelationship extends Relation {
	/**
	 * Returns the value of the '<em><b>Sub Responsibility</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link responsibilityMetaModel.Responsibility#getSuperResponsibility <em>Super Responsibility</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Sub Responsibility</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Sub Responsibility</em>' reference.
	 * @see #setSubResponsibility(Responsibility)
	 * @see responsibilityMetaModel.ResponsibilityMetaModelPackage#getresponsibilityRequiredRelationship_SubResponsibility()
	 * @see responsibilityMetaModel.Responsibility#getSuperResponsibility
	 * @model opposite="superResponsibility"
	 * @generated
	 */
	Responsibility getSubResponsibility();

	/**
	 * Sets the value of the '{@link responsibilityMetaModel.responsibilityRequiredRelationship#getSubResponsibility <em>Sub Responsibility</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Sub Responsibility</em>' reference.
	 * @see #getSubResponsibility()
	 * @generated
	 */
	void setSubResponsibility(Responsibility value);

	/**
	 * Returns the value of the '<em><b>Super Responsibility</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link responsibilityMetaModel.Responsibility#getSubResponsibility <em>Sub Responsibility</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Super Responsibility</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Super Responsibility</em>' reference.
	 * @see #setSuperResponsibility(Responsibility)
	 * @see responsibilityMetaModel.ResponsibilityMetaModelPackage#getresponsibilityRequiredRelationship_SuperResponsibility()
	 * @see responsibilityMetaModel.Responsibility#getSubResponsibility
	 * @model opposite="subResponsibility"
	 * @generated
	 */
	Responsibility getSuperResponsibility();

	/**
	 * Sets the value of the '{@link responsibilityMetaModel.responsibilityRequiredRelationship#getSuperResponsibility <em>Super Responsibility</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Super Responsibility</em>' reference.
	 * @see #getSuperResponsibility()
	 * @generated
	 */
	void setSuperResponsibility(Responsibility value);

} // responsibilityRequiredRelationship
