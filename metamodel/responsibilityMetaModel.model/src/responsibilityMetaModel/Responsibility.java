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
 *   <li>{@link responsibilityMetaModel.Responsibility#getSatisfactionCriteria <em>Satisfaction Criteria</em>}</li>
 *   <li>{@link responsibilityMetaModel.Responsibility#getHolder <em>Holder</em>}</li>
 *   <li>{@link responsibilityMetaModel.Responsibility#getProducedResource <em>Produced Resource</em>}</li>
 *   <li>{@link responsibilityMetaModel.Responsibility#getSuperResponsibility <em>Super Responsibility</em>}</li>
 *   <li>{@link responsibilityMetaModel.Responsibility#getSubResponsibility <em>Sub Responsibility</em>}</li>
 *   <li>{@link responsibilityMetaModel.Responsibility#getActorRequired <em>Actor Required</em>}</li>
 *   <li>{@link responsibilityMetaModel.Responsibility#getRequiredResource <em>Required Resource</em>}</li>
 * </ul>
 * </p>
 *
 * @see responsibilityMetaModel.ResponsibilityMetaModelPackage#getResponsibility()
 * @model
 * @generated
 */
public interface Responsibility extends Entity {
	/**
	 * Returns the value of the '<em><b>Satisfaction Criteria</b></em>' attribute.
	 * The default value is <code>""</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Satisfaction Criteria</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Satisfaction Criteria</em>' attribute.
	 * @see #setSatisfactionCriteria(String)
	 * @see responsibilityMetaModel.ResponsibilityMetaModelPackage#getResponsibility_SatisfactionCriteria()
	 * @model default="" dataType="org.eclipse.emf.ecore.xml.type.String"
	 * @generated
	 */
	String getSatisfactionCriteria();

	/**
	 * Sets the value of the '{@link responsibilityMetaModel.Responsibility#getSatisfactionCriteria <em>Satisfaction Criteria</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Satisfaction Criteria</em>' attribute.
	 * @see #getSatisfactionCriteria()
	 * @generated
	 */
	void setSatisfactionCriteria(String value);

	/**
	 * Returns the value of the '<em><b>Holder</b></em>' reference list.
	 * The list contents are of type {@link responsibilityMetaModel.Actor}.
	 * It is bidirectional and its opposite is '{@link responsibilityMetaModel.Actor#getHeldResponsibility <em>Held Responsibility</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Holder</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Holder</em>' reference list.
	 * @see responsibilityMetaModel.ResponsibilityMetaModelPackage#getResponsibility_Holder()
	 * @see responsibilityMetaModel.Actor#getHeldResponsibility
	 * @model opposite="heldResponsibility"
	 * @generated
	 */
	EList<Actor> getHolder();

	/**
	 * Returns the value of the '<em><b>Produced Resource</b></em>' reference list.
	 * The list contents are of type {@link responsibilityMetaModel.Resource}.
	 * It is bidirectional and its opposite is '{@link responsibilityMetaModel.Resource#getProducer <em>Producer</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Produced Resource</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Produced Resource</em>' reference list.
	 * @see responsibilityMetaModel.ResponsibilityMetaModelPackage#getResponsibility_ProducedResource()
	 * @see responsibilityMetaModel.Resource#getProducer
	 * @model opposite="producer"
	 * @generated
	 */
	EList<Resource> getProducedResource();

	/**
	 * Returns the value of the '<em><b>Super Responsibility</b></em>' reference list.
	 * The list contents are of type {@link responsibilityMetaModel.Responsibility}.
	 * It is bidirectional and its opposite is '{@link responsibilityMetaModel.Responsibility#getSubResponsibility <em>Sub Responsibility</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Super Responsibility</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Super Responsibility</em>' reference list.
	 * @see responsibilityMetaModel.ResponsibilityMetaModelPackage#getResponsibility_SuperResponsibility()
	 * @see responsibilityMetaModel.Responsibility#getSubResponsibility
	 * @model opposite="subResponsibility"
	 * @generated
	 */
	EList<Responsibility> getSuperResponsibility();

	/**
	 * Returns the value of the '<em><b>Sub Responsibility</b></em>' reference list.
	 * The list contents are of type {@link responsibilityMetaModel.Responsibility}.
	 * It is bidirectional and its opposite is '{@link responsibilityMetaModel.Responsibility#getSuperResponsibility <em>Super Responsibility</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Sub Responsibility</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Sub Responsibility</em>' reference list.
	 * @see responsibilityMetaModel.ResponsibilityMetaModelPackage#getResponsibility_SubResponsibility()
	 * @see responsibilityMetaModel.Responsibility#getSuperResponsibility
	 * @model opposite="superResponsibility" resolveProxies="false"
	 * @generated
	 */
	EList<Responsibility> getSubResponsibility();

	/**
	 * Returns the value of the '<em><b>Actor Required</b></em>' reference list.
	 * The list contents are of type {@link responsibilityMetaModel.Actor}.
	 * It is bidirectional and its opposite is '{@link responsibilityMetaModel.Actor#getRequiredBy <em>Required By</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Actor Required</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Actor Required</em>' reference list.
	 * @see responsibilityMetaModel.ResponsibilityMetaModelPackage#getResponsibility_ActorRequired()
	 * @see responsibilityMetaModel.Actor#getRequiredBy
	 * @model opposite="requiredBy"
	 * @generated
	 */
	EList<Actor> getActorRequired();

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

} // Responsibility
