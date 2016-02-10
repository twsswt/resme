/**
 */
package responsibilityMetaModel;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>resource Produced Relationship</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link responsibilityMetaModel.resourceProducedRelationship#getResponsibility <em>Responsibility</em>}</li>
 *   <li>{@link responsibilityMetaModel.resourceProducedRelationship#getResource <em>Resource</em>}</li>
 * </ul>
 * </p>
 *
 * @see responsibilityMetaModel.ResponsibilityMetaModelPackage#getresourceProducedRelationship()
 * @model
 * @generated
 */
public interface resourceProducedRelationship extends Relation {
	/**
	 * Returns the value of the '<em><b>Responsibility</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link responsibilityMetaModel.Responsibility#getProducedResource <em>Produced Resource</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Responsibility</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Responsibility</em>' reference.
	 * @see #setResponsibility(Responsibility)
	 * @see responsibilityMetaModel.ResponsibilityMetaModelPackage#getresourceProducedRelationship_Responsibility()
	 * @see responsibilityMetaModel.Responsibility#getProducedResource
	 * @model opposite="producedResource"
	 * @generated
	 */
	Responsibility getResponsibility();

	/**
	 * Sets the value of the '{@link responsibilityMetaModel.resourceProducedRelationship#getResponsibility <em>Responsibility</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Responsibility</em>' reference.
	 * @see #getResponsibility()
	 * @generated
	 */
	void setResponsibility(Responsibility value);

	/**
	 * Returns the value of the '<em><b>Resource</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link responsibilityMetaModel.Resource#getProducedBy <em>Produced By</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Resource</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Resource</em>' reference.
	 * @see #setResource(Resource)
	 * @see responsibilityMetaModel.ResponsibilityMetaModelPackage#getresourceProducedRelationship_Resource()
	 * @see responsibilityMetaModel.Resource#getProducedBy
	 * @model opposite="producedBy"
	 * @generated
	 */
	Resource getResource();

	/**
	 * Sets the value of the '{@link responsibilityMetaModel.resourceProducedRelationship#getResource <em>Resource</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Resource</em>' reference.
	 * @see #getResource()
	 * @generated
	 */
	void setResource(Resource value);

} // resourceProducedRelationship
