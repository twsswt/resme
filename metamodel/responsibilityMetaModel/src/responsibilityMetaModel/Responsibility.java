/**
 */
package responsibilityMetaModel;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Responsibility</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link responsibilityMetaModel.Responsibility#getRequiredResource <em>Required Resource</em>}</li>
 *   <li>{@link responsibilityMetaModel.Responsibility#getProducedResource <em>Produced Resource</em>}</li>
 *   <li>{@link responsibilityMetaModel.Responsibility#getRequiredActor <em>Required Actor</em>}</li>
 *   <li>{@link responsibilityMetaModel.Responsibility#getHeldBy <em>Held By</em>}</li>
 *   <li>{@link responsibilityMetaModel.Responsibility#getSuperResponsibility <em>Super Responsibility</em>}</li>
 *   <li>{@link responsibilityMetaModel.Responsibility#getSubResponsibility <em>Sub Responsibility</em>}</li>
 *   <li>{@link responsibilityMetaModel.Responsibility#getProducedActor <em>Produced Actor</em>}</li>
 * </ul>
 * </p>
 *
 * @see responsibilityMetaModel.ResponsibilityMetaModelPackage#getResponsibility()
 * @model
 * @generated
 */
public interface Responsibility extends Entity {
	/**
	 * Returns the value of the '<em><b>Required Resource</b></em>' reference list.
	 * The list contents are of type {@link responsibilityMetaModel.resourceRequiredRelationship}.
	 * It is bidirectional and its opposite is '{@link responsibilityMetaModel.resourceRequiredRelationship#getResponsibility <em>Responsibility</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Required Resource</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Required Resource</em>' reference list.
	 * @see responsibilityMetaModel.ResponsibilityMetaModelPackage#getResponsibility_RequiredResource()
	 * @see responsibilityMetaModel.resourceRequiredRelationship#getResponsibility
	 * @model opposite="responsibility"
	 * @generated
	 */
	EList<resourceRequiredRelationship> getRequiredResource();

	/**
	 * Returns the value of the '<em><b>Produced Resource</b></em>' reference list.
	 * The list contents are of type {@link responsibilityMetaModel.resourceProducedRelationship}.
	 * It is bidirectional and its opposite is '{@link responsibilityMetaModel.resourceProducedRelationship#getResponsibility <em>Responsibility</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Produced Resource</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Produced Resource</em>' reference list.
	 * @see responsibilityMetaModel.ResponsibilityMetaModelPackage#getResponsibility_ProducedResource()
	 * @see responsibilityMetaModel.resourceProducedRelationship#getResponsibility
	 * @model opposite="responsibility"
	 * @generated
	 */
	EList<resourceProducedRelationship> getProducedResource();

	/**
	 * Returns the value of the '<em><b>Required Actor</b></em>' reference list.
	 * The list contents are of type {@link responsibilityMetaModel.actorRequiredRelationship}.
	 * It is bidirectional and its opposite is '{@link responsibilityMetaModel.actorRequiredRelationship#getResponsibility <em>Responsibility</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Required Actor</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Required Actor</em>' reference list.
	 * @see responsibilityMetaModel.ResponsibilityMetaModelPackage#getResponsibility_RequiredActor()
	 * @see responsibilityMetaModel.actorRequiredRelationship#getResponsibility
	 * @model opposite="responsibility"
	 * @generated
	 */
	EList<actorRequiredRelationship> getRequiredActor();

	/**
	 * Returns the value of the '<em><b>Held By</b></em>' reference list.
	 * The list contents are of type {@link responsibilityMetaModel.actorHoldsRelationship}.
	 * It is bidirectional and its opposite is '{@link responsibilityMetaModel.actorHoldsRelationship#getResponsibility <em>Responsibility</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Held By</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Held By</em>' reference list.
	 * @see responsibilityMetaModel.ResponsibilityMetaModelPackage#getResponsibility_HeldBy()
	 * @see responsibilityMetaModel.actorHoldsRelationship#getResponsibility
	 * @model opposite="responsibility"
	 * @generated
	 */
	EList<actorHoldsRelationship> getHeldBy();

	/**
	 * Returns the value of the '<em><b>Super Responsibility</b></em>' reference list.
	 * The list contents are of type {@link responsibilityMetaModel.responsibilityRequiredRelationship}.
	 * It is bidirectional and its opposite is '{@link responsibilityMetaModel.responsibilityRequiredRelationship#getSubResponsibility <em>Sub Responsibility</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Super Responsibility</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Super Responsibility</em>' reference list.
	 * @see responsibilityMetaModel.ResponsibilityMetaModelPackage#getResponsibility_SuperResponsibility()
	 * @see responsibilityMetaModel.responsibilityRequiredRelationship#getSubResponsibility
	 * @model opposite="subResponsibility"
	 * @generated
	 */
	EList<responsibilityRequiredRelationship> getSuperResponsibility();

	/**
	 * Returns the value of the '<em><b>Sub Responsibility</b></em>' reference list.
	 * The list contents are of type {@link responsibilityMetaModel.responsibilityRequiredRelationship}.
	 * It is bidirectional and its opposite is '{@link responsibilityMetaModel.responsibilityRequiredRelationship#getSuperResponsibility <em>Super Responsibility</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Sub Responsibility</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Sub Responsibility</em>' reference list.
	 * @see responsibilityMetaModel.ResponsibilityMetaModelPackage#getResponsibility_SubResponsibility()
	 * @see responsibilityMetaModel.responsibilityRequiredRelationship#getSuperResponsibility
	 * @model opposite="superResponsibility"
	 * @generated
	 */
	EList<responsibilityRequiredRelationship> getSubResponsibility();

	/**
	 * Returns the value of the '<em><b>Produced Actor</b></em>' reference list.
	 * The list contents are of type {@link responsibilityMetaModel.actorProducedRelationship}.
	 * It is bidirectional and its opposite is '{@link responsibilityMetaModel.actorProducedRelationship#getResponsibility <em>Responsibility</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Produced Actor</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Produced Actor</em>' reference list.
	 * @see responsibilityMetaModel.ResponsibilityMetaModelPackage#getResponsibility_ProducedActor()
	 * @see responsibilityMetaModel.actorProducedRelationship#getResponsibility
	 * @model opposite="responsibility"
	 * @generated
	 */
	EList<actorProducedRelationship> getProducedActor();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model dataType="org.eclipse.emf.ecore.xml.type.Boolean"
	 * @generated
	 */
	boolean satisfied();

} // Responsibility
