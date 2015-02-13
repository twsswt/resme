/**
 */
package responsibilityMetaModel;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Resource</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link responsibilityMetaModel.Resource#getProducer <em>Producer</em>}</li>
 *   <li>{@link responsibilityMetaModel.Resource#getRequiredBy <em>Required By</em>}</li>
 * </ul>
 * </p>
 *
 * @see responsibilityMetaModel.ResponsibilityMetaModelPackage#getResource()
 * @model
 * @generated
 */
public interface Resource extends Entity {
	/**
	 * Returns the value of the '<em><b>Producer</b></em>' reference list.
	 * The list contents are of type {@link responsibilityMetaModel.Responsibility}.
	 * It is bidirectional and its opposite is '{@link responsibilityMetaModel.Responsibility#getProducedResource <em>Produced Resource</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Producer</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Producer</em>' reference list.
	 * @see responsibilityMetaModel.ResponsibilityMetaModelPackage#getResource_Producer()
	 * @see responsibilityMetaModel.Responsibility#getProducedResource
	 * @model opposite="producedResource"
	 * @generated
	 */
	EList<Responsibility> getProducer();

	/**
	 * Returns the value of the '<em><b>Required By</b></em>' reference list.
	 * The list contents are of type {@link responsibilityMetaModel.resourceRequiredRelationship}.
	 * It is bidirectional and its opposite is '{@link responsibilityMetaModel.resourceRequiredRelationship#getResource <em>Resource</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Required By</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Required By</em>' reference list.
	 * @see responsibilityMetaModel.ResponsibilityMetaModelPackage#getResource_RequiredBy()
	 * @see responsibilityMetaModel.resourceRequiredRelationship#getResource
	 * @model opposite="resource"
	 * @generated
	 */
	EList<resourceRequiredRelationship> getRequiredBy();

} // Resource
