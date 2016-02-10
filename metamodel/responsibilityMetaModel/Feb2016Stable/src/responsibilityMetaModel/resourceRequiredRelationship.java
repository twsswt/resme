/**
 */
package responsibilityMetaModel;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>resource Required Relationship</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link responsibilityMetaModel.resourceRequiredRelationship#getResponsibility <em>Responsibility</em>}</li>
 *   <li>{@link responsibilityMetaModel.resourceRequiredRelationship#getResource <em>Resource</em>}</li>
 * </ul>
 * </p>
 *
 * @see responsibilityMetaModel.ResponsibilityMetaModelPackage#getresourceRequiredRelationship()
 * @model
 * @generated
 */
public interface resourceRequiredRelationship extends Relation {
	/**
	 * Returns the value of the '<em><b>Responsibility</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link responsibilityMetaModel.Responsibility#getRequiredResource <em>Required Resource</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Responsibility</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Responsibility</em>' reference.
	 * @see #setResponsibility(Responsibility)
	 * @see responsibilityMetaModel.ResponsibilityMetaModelPackage#getresourceRequiredRelationship_Responsibility()
	 * @see responsibilityMetaModel.Responsibility#getRequiredResource
	 * @model opposite="requiredResource"
	 * @generated
	 */
	Responsibility getResponsibility();

	/**
	 * Sets the value of the '{@link responsibilityMetaModel.resourceRequiredRelationship#getResponsibility <em>Responsibility</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Responsibility</em>' reference.
	 * @see #getResponsibility()
	 * @generated
	 */
	void setResponsibility(Responsibility value);

	/**
	 * Returns the value of the '<em><b>Resource</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link responsibilityMetaModel.Resource#getRequiredBy <em>Required By</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Resource</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Resource</em>' reference.
	 * @see #setResource(Resource)
	 * @see responsibilityMetaModel.ResponsibilityMetaModelPackage#getresourceRequiredRelationship_Resource()
	 * @see responsibilityMetaModel.Resource#getRequiredBy
	 * @model opposite="requiredBy"
	 * @generated
	 */
	Resource getResource();

	/**
	 * Sets the value of the '{@link responsibilityMetaModel.resourceRequiredRelationship#getResource <em>Resource</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Resource</em>' reference.
	 * @see #getResource()
	 * @generated
	 */
	void setResource(Resource value);

} // resourceRequiredRelationship
