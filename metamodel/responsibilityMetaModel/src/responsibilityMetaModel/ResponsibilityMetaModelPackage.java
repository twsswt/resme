/**
 */
package responsibilityMetaModel;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EOperation;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each operation of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see responsibilityMetaModel.ResponsibilityMetaModelFactory
 * @model kind="package"
 * @generated
 */
public interface ResponsibilityMetaModelPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "responsibilityMetaModel";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://www.example.org/responsibilityMetaModel";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "responsibilityMetaModel";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	ResponsibilityMetaModelPackage eINSTANCE = responsibilityMetaModel.impl.ResponsibilityMetaModelPackageImpl.init();

	/**
	 * The meta object id for the '{@link responsibilityMetaModel.Entity <em>Entity</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see responsibilityMetaModel.Entity
	 * @see responsibilityMetaModel.impl.ResponsibilityMetaModelPackageImpl#getEntity()
	 * @generated
	 */
	int ENTITY = 4;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTITY__NAME = 0;

	/**
	 * The feature id for the '<em><b>Enabled</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTITY__ENABLED = 1;

	/**
	 * The feature id for the '<em><b>Satisifed</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTITY__SATISIFED = 2;

	/**
	 * The number of structural features of the '<em>Entity</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTITY_FEATURE_COUNT = 3;

	/**
	 * The operation id for the '<em>Satisfied</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTITY___SATISFIED = 0;

	/**
	 * The number of operations of the '<em>Entity</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTITY_OPERATION_COUNT = 1;

	/**
	 * The meta object id for the '{@link responsibilityMetaModel.impl.ResponsibilityImpl <em>Responsibility</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see responsibilityMetaModel.impl.ResponsibilityImpl
	 * @see responsibilityMetaModel.impl.ResponsibilityMetaModelPackageImpl#getResponsibility()
	 * @generated
	 */
	int RESPONSIBILITY = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESPONSIBILITY__NAME = ENTITY__NAME;

	/**
	 * The feature id for the '<em><b>Enabled</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESPONSIBILITY__ENABLED = ENTITY__ENABLED;

	/**
	 * The feature id for the '<em><b>Satisifed</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESPONSIBILITY__SATISIFED = ENTITY__SATISIFED;

	/**
	 * The feature id for the '<em><b>Satisfaction Criteria</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESPONSIBILITY__SATISFACTION_CRITERIA = ENTITY_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Required Resource</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESPONSIBILITY__REQUIRED_RESOURCE = ENTITY_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Produced Resource</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESPONSIBILITY__PRODUCED_RESOURCE = ENTITY_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Required Actor</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESPONSIBILITY__REQUIRED_ACTOR = ENTITY_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Held By</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESPONSIBILITY__HELD_BY = ENTITY_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Super Responsibility</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESPONSIBILITY__SUPER_RESPONSIBILITY = ENTITY_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Sub Responsibility</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESPONSIBILITY__SUB_RESPONSIBILITY = ENTITY_FEATURE_COUNT + 6;

	/**
	 * The number of structural features of the '<em>Responsibility</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESPONSIBILITY_FEATURE_COUNT = ENTITY_FEATURE_COUNT + 7;

	/**
	 * The operation id for the '<em>Satisfied</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESPONSIBILITY___SATISFIED = ENTITY_OPERATION_COUNT + 0;

	/**
	 * The number of operations of the '<em>Responsibility</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESPONSIBILITY_OPERATION_COUNT = ENTITY_OPERATION_COUNT + 1;

	/**
	 * The meta object id for the '{@link responsibilityMetaModel.impl.ResourceImpl <em>Resource</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see responsibilityMetaModel.impl.ResourceImpl
	 * @see responsibilityMetaModel.impl.ResponsibilityMetaModelPackageImpl#getResource()
	 * @generated
	 */
	int RESOURCE = 1;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE__NAME = ENTITY__NAME;

	/**
	 * The feature id for the '<em><b>Enabled</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE__ENABLED = ENTITY__ENABLED;

	/**
	 * The feature id for the '<em><b>Satisifed</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE__SATISIFED = ENTITY__SATISIFED;

	/**
	 * The feature id for the '<em><b>Required By</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE__REQUIRED_BY = ENTITY_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Produced By</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE__PRODUCED_BY = ENTITY_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Resource</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE_FEATURE_COUNT = ENTITY_FEATURE_COUNT + 2;

	/**
	 * The operation id for the '<em>Satisfied</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE___SATISFIED = ENTITY_OPERATION_COUNT + 0;

	/**
	 * The number of operations of the '<em>Resource</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE_OPERATION_COUNT = ENTITY_OPERATION_COUNT + 1;

	/**
	 * The meta object id for the '{@link responsibilityMetaModel.impl.ActorImpl <em>Actor</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see responsibilityMetaModel.impl.ActorImpl
	 * @see responsibilityMetaModel.impl.ResponsibilityMetaModelPackageImpl#getActor()
	 * @generated
	 */
	int ACTOR = 2;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTOR__NAME = ENTITY__NAME;

	/**
	 * The feature id for the '<em><b>Enabled</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTOR__ENABLED = ENTITY__ENABLED;

	/**
	 * The feature id for the '<em><b>Satisifed</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTOR__SATISIFED = ENTITY__SATISIFED;

	/**
	 * The feature id for the '<em><b>Required By</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTOR__REQUIRED_BY = ENTITY_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Held Responsibility</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTOR__HELD_RESPONSIBILITY = ENTITY_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Actor</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTOR_FEATURE_COUNT = ENTITY_FEATURE_COUNT + 2;

	/**
	 * The operation id for the '<em>Satisfied</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTOR___SATISFIED = ENTITY_OPERATION_COUNT + 0;

	/**
	 * The number of operations of the '<em>Actor</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTOR_OPERATION_COUNT = ENTITY_OPERATION_COUNT + 1;

	/**
	 * The meta object id for the '{@link responsibilityMetaModel.impl.ScenarioImpl <em>Scenario</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see responsibilityMetaModel.impl.ScenarioImpl
	 * @see responsibilityMetaModel.impl.ResponsibilityMetaModelPackageImpl#getScenario()
	 * @generated
	 */
	int SCENARIO = 3;

	/**
	 * The feature id for the '<em><b>Resources</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCENARIO__RESOURCES = 0;

	/**
	 * The feature id for the '<em><b>Responsibilities</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCENARIO__RESPONSIBILITIES = 1;

	/**
	 * The feature id for the '<em><b>Actors</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCENARIO__ACTORS = 2;

	/**
	 * The feature id for the '<em><b>Relations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCENARIO__RELATIONS = 3;

	/**
	 * The number of structural features of the '<em>Scenario</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCENARIO_FEATURE_COUNT = 4;

	/**
	 * The number of operations of the '<em>Scenario</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCENARIO_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link responsibilityMetaModel.Relation <em>Relation</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see responsibilityMetaModel.Relation
	 * @see responsibilityMetaModel.impl.ResponsibilityMetaModelPackageImpl#getRelation()
	 * @generated
	 */
	int RELATION = 6;

	/**
	 * The number of structural features of the '<em>Relation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELATION_FEATURE_COUNT = 0;

	/**
	 * The number of operations of the '<em>Relation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELATION_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link responsibilityMetaModel.impl.resourceRequiredRelationshipImpl <em>resource Required Relationship</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see responsibilityMetaModel.impl.resourceRequiredRelationshipImpl
	 * @see responsibilityMetaModel.impl.ResponsibilityMetaModelPackageImpl#getresourceRequiredRelationship()
	 * @generated
	 */
	int RESOURCE_REQUIRED_RELATIONSHIP = 5;

	/**
	 * The feature id for the '<em><b>Responsibility</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE_REQUIRED_RELATIONSHIP__RESPONSIBILITY = RELATION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Resource</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE_REQUIRED_RELATIONSHIP__RESOURCE = RELATION_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>resource Required Relationship</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE_REQUIRED_RELATIONSHIP_FEATURE_COUNT = RELATION_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>resource Required Relationship</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE_REQUIRED_RELATIONSHIP_OPERATION_COUNT = RELATION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link responsibilityMetaModel.impl.resourceProducedRelationshipImpl <em>resource Produced Relationship</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see responsibilityMetaModel.impl.resourceProducedRelationshipImpl
	 * @see responsibilityMetaModel.impl.ResponsibilityMetaModelPackageImpl#getresourceProducedRelationship()
	 * @generated
	 */
	int RESOURCE_PRODUCED_RELATIONSHIP = 7;

	/**
	 * The feature id for the '<em><b>Responsibility</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE_PRODUCED_RELATIONSHIP__RESPONSIBILITY = RELATION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Resource</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE_PRODUCED_RELATIONSHIP__RESOURCE = RELATION_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>resource Produced Relationship</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE_PRODUCED_RELATIONSHIP_FEATURE_COUNT = RELATION_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>resource Produced Relationship</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE_PRODUCED_RELATIONSHIP_OPERATION_COUNT = RELATION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link responsibilityMetaModel.impl.actorRequiredRelationshipImpl <em>actor Required Relationship</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see responsibilityMetaModel.impl.actorRequiredRelationshipImpl
	 * @see responsibilityMetaModel.impl.ResponsibilityMetaModelPackageImpl#getactorRequiredRelationship()
	 * @generated
	 */
	int ACTOR_REQUIRED_RELATIONSHIP = 8;

	/**
	 * The feature id for the '<em><b>Responsibility</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTOR_REQUIRED_RELATIONSHIP__RESPONSIBILITY = RELATION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Actor</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTOR_REQUIRED_RELATIONSHIP__ACTOR = RELATION_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>actor Required Relationship</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTOR_REQUIRED_RELATIONSHIP_FEATURE_COUNT = RELATION_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>actor Required Relationship</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTOR_REQUIRED_RELATIONSHIP_OPERATION_COUNT = RELATION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link responsibilityMetaModel.impl.actorHoldsRelationshipImpl <em>actor Holds Relationship</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see responsibilityMetaModel.impl.actorHoldsRelationshipImpl
	 * @see responsibilityMetaModel.impl.ResponsibilityMetaModelPackageImpl#getactorHoldsRelationship()
	 * @generated
	 */
	int ACTOR_HOLDS_RELATIONSHIP = 9;

	/**
	 * The feature id for the '<em><b>Responsibility</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTOR_HOLDS_RELATIONSHIP__RESPONSIBILITY = RELATION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Actor</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTOR_HOLDS_RELATIONSHIP__ACTOR = RELATION_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>actor Holds Relationship</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTOR_HOLDS_RELATIONSHIP_FEATURE_COUNT = RELATION_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>actor Holds Relationship</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTOR_HOLDS_RELATIONSHIP_OPERATION_COUNT = RELATION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link responsibilityMetaModel.impl.responsibilityRequiredRelationshipImpl <em>responsibility Required Relationship</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see responsibilityMetaModel.impl.responsibilityRequiredRelationshipImpl
	 * @see responsibilityMetaModel.impl.ResponsibilityMetaModelPackageImpl#getresponsibilityRequiredRelationship()
	 * @generated
	 */
	int RESPONSIBILITY_REQUIRED_RELATIONSHIP = 10;

	/**
	 * The feature id for the '<em><b>Sub Rresponsibility</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESPONSIBILITY_REQUIRED_RELATIONSHIP__SUB_RRESPONSIBILITY = RELATION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Super Responsibility</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESPONSIBILITY_REQUIRED_RELATIONSHIP__SUPER_RESPONSIBILITY = RELATION_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>responsibility Required Relationship</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESPONSIBILITY_REQUIRED_RELATIONSHIP_FEATURE_COUNT = RELATION_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>responsibility Required Relationship</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESPONSIBILITY_REQUIRED_RELATIONSHIP_OPERATION_COUNT = RELATION_OPERATION_COUNT + 0;


	/**
	 * Returns the meta object for class '{@link responsibilityMetaModel.Responsibility <em>Responsibility</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Responsibility</em>'.
	 * @see responsibilityMetaModel.Responsibility
	 * @generated
	 */
	EClass getResponsibility();

	/**
	 * Returns the meta object for the attribute '{@link responsibilityMetaModel.Responsibility#getSatisfactionCriteria <em>Satisfaction Criteria</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Satisfaction Criteria</em>'.
	 * @see responsibilityMetaModel.Responsibility#getSatisfactionCriteria()
	 * @see #getResponsibility()
	 * @generated
	 */
	EAttribute getResponsibility_SatisfactionCriteria();

	/**
	 * Returns the meta object for the reference list '{@link responsibilityMetaModel.Responsibility#getRequiredResource <em>Required Resource</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Required Resource</em>'.
	 * @see responsibilityMetaModel.Responsibility#getRequiredResource()
	 * @see #getResponsibility()
	 * @generated
	 */
	EReference getResponsibility_RequiredResource();

	/**
	 * Returns the meta object for the reference list '{@link responsibilityMetaModel.Responsibility#getProducedResource <em>Produced Resource</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Produced Resource</em>'.
	 * @see responsibilityMetaModel.Responsibility#getProducedResource()
	 * @see #getResponsibility()
	 * @generated
	 */
	EReference getResponsibility_ProducedResource();

	/**
	 * Returns the meta object for the reference list '{@link responsibilityMetaModel.Responsibility#getRequiredActor <em>Required Actor</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Required Actor</em>'.
	 * @see responsibilityMetaModel.Responsibility#getRequiredActor()
	 * @see #getResponsibility()
	 * @generated
	 */
	EReference getResponsibility_RequiredActor();

	/**
	 * Returns the meta object for the reference list '{@link responsibilityMetaModel.Responsibility#getHeldBy <em>Held By</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Held By</em>'.
	 * @see responsibilityMetaModel.Responsibility#getHeldBy()
	 * @see #getResponsibility()
	 * @generated
	 */
	EReference getResponsibility_HeldBy();

	/**
	 * Returns the meta object for the reference list '{@link responsibilityMetaModel.Responsibility#getSuperResponsibility <em>Super Responsibility</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Super Responsibility</em>'.
	 * @see responsibilityMetaModel.Responsibility#getSuperResponsibility()
	 * @see #getResponsibility()
	 * @generated
	 */
	EReference getResponsibility_SuperResponsibility();

	/**
	 * Returns the meta object for the reference list '{@link responsibilityMetaModel.Responsibility#getSubResponsibility <em>Sub Responsibility</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Sub Responsibility</em>'.
	 * @see responsibilityMetaModel.Responsibility#getSubResponsibility()
	 * @see #getResponsibility()
	 * @generated
	 */
	EReference getResponsibility_SubResponsibility();

	/**
	 * Returns the meta object for the '{@link responsibilityMetaModel.Responsibility#satisfied() <em>Satisfied</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Satisfied</em>' operation.
	 * @see responsibilityMetaModel.Responsibility#satisfied()
	 * @generated
	 */
	EOperation getResponsibility__Satisfied();

	/**
	 * Returns the meta object for class '{@link responsibilityMetaModel.Resource <em>Resource</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Resource</em>'.
	 * @see responsibilityMetaModel.Resource
	 * @generated
	 */
	EClass getResource();

	/**
	 * Returns the meta object for the reference list '{@link responsibilityMetaModel.Resource#getRequiredBy <em>Required By</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Required By</em>'.
	 * @see responsibilityMetaModel.Resource#getRequiredBy()
	 * @see #getResource()
	 * @generated
	 */
	EReference getResource_RequiredBy();

	/**
	 * Returns the meta object for the reference list '{@link responsibilityMetaModel.Resource#getProducedBy <em>Produced By</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Produced By</em>'.
	 * @see responsibilityMetaModel.Resource#getProducedBy()
	 * @see #getResource()
	 * @generated
	 */
	EReference getResource_ProducedBy();

	/**
	 * Returns the meta object for the '{@link responsibilityMetaModel.Resource#satisfied() <em>Satisfied</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Satisfied</em>' operation.
	 * @see responsibilityMetaModel.Resource#satisfied()
	 * @generated
	 */
	EOperation getResource__Satisfied();

	/**
	 * Returns the meta object for class '{@link responsibilityMetaModel.Actor <em>Actor</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Actor</em>'.
	 * @see responsibilityMetaModel.Actor
	 * @generated
	 */
	EClass getActor();

	/**
	 * Returns the meta object for the reference list '{@link responsibilityMetaModel.Actor#getRequiredBy <em>Required By</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Required By</em>'.
	 * @see responsibilityMetaModel.Actor#getRequiredBy()
	 * @see #getActor()
	 * @generated
	 */
	EReference getActor_RequiredBy();

	/**
	 * Returns the meta object for the reference list '{@link responsibilityMetaModel.Actor#getHeldResponsibility <em>Held Responsibility</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Held Responsibility</em>'.
	 * @see responsibilityMetaModel.Actor#getHeldResponsibility()
	 * @see #getActor()
	 * @generated
	 */
	EReference getActor_HeldResponsibility();

	/**
	 * Returns the meta object for the '{@link responsibilityMetaModel.Actor#satisfied() <em>Satisfied</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Satisfied</em>' operation.
	 * @see responsibilityMetaModel.Actor#satisfied()
	 * @generated
	 */
	EOperation getActor__Satisfied();

	/**
	 * Returns the meta object for class '{@link responsibilityMetaModel.Scenario <em>Scenario</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Scenario</em>'.
	 * @see responsibilityMetaModel.Scenario
	 * @generated
	 */
	EClass getScenario();

	/**
	 * Returns the meta object for the containment reference list '{@link responsibilityMetaModel.Scenario#getResources <em>Resources</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Resources</em>'.
	 * @see responsibilityMetaModel.Scenario#getResources()
	 * @see #getScenario()
	 * @generated
	 */
	EReference getScenario_Resources();

	/**
	 * Returns the meta object for the containment reference list '{@link responsibilityMetaModel.Scenario#getResponsibilities <em>Responsibilities</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Responsibilities</em>'.
	 * @see responsibilityMetaModel.Scenario#getResponsibilities()
	 * @see #getScenario()
	 * @generated
	 */
	EReference getScenario_Responsibilities();

	/**
	 * Returns the meta object for the containment reference list '{@link responsibilityMetaModel.Scenario#getActors <em>Actors</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Actors</em>'.
	 * @see responsibilityMetaModel.Scenario#getActors()
	 * @see #getScenario()
	 * @generated
	 */
	EReference getScenario_Actors();

	/**
	 * Returns the meta object for the containment reference list '{@link responsibilityMetaModel.Scenario#getRelations <em>Relations</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Relations</em>'.
	 * @see responsibilityMetaModel.Scenario#getRelations()
	 * @see #getScenario()
	 * @generated
	 */
	EReference getScenario_Relations();

	/**
	 * Returns the meta object for class '{@link responsibilityMetaModel.Entity <em>Entity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Entity</em>'.
	 * @see responsibilityMetaModel.Entity
	 * @generated
	 */
	EClass getEntity();

	/**
	 * Returns the meta object for the attribute '{@link responsibilityMetaModel.Entity#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see responsibilityMetaModel.Entity#getName()
	 * @see #getEntity()
	 * @generated
	 */
	EAttribute getEntity_Name();

	/**
	 * Returns the meta object for the attribute '{@link responsibilityMetaModel.Entity#isEnabled <em>Enabled</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Enabled</em>'.
	 * @see responsibilityMetaModel.Entity#isEnabled()
	 * @see #getEntity()
	 * @generated
	 */
	EAttribute getEntity_Enabled();

	/**
	 * Returns the meta object for the attribute '{@link responsibilityMetaModel.Entity#isSatisifed <em>Satisifed</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Satisifed</em>'.
	 * @see responsibilityMetaModel.Entity#isSatisifed()
	 * @see #getEntity()
	 * @generated
	 */
	EAttribute getEntity_Satisifed();

	/**
	 * Returns the meta object for the '{@link responsibilityMetaModel.Entity#satisfied() <em>Satisfied</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Satisfied</em>' operation.
	 * @see responsibilityMetaModel.Entity#satisfied()
	 * @generated
	 */
	EOperation getEntity__Satisfied();

	/**
	 * Returns the meta object for class '{@link responsibilityMetaModel.resourceRequiredRelationship <em>resource Required Relationship</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>resource Required Relationship</em>'.
	 * @see responsibilityMetaModel.resourceRequiredRelationship
	 * @generated
	 */
	EClass getresourceRequiredRelationship();

	/**
	 * Returns the meta object for the reference '{@link responsibilityMetaModel.resourceRequiredRelationship#getResponsibility <em>Responsibility</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Responsibility</em>'.
	 * @see responsibilityMetaModel.resourceRequiredRelationship#getResponsibility()
	 * @see #getresourceRequiredRelationship()
	 * @generated
	 */
	EReference getresourceRequiredRelationship_Responsibility();

	/**
	 * Returns the meta object for the reference '{@link responsibilityMetaModel.resourceRequiredRelationship#getResource <em>Resource</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Resource</em>'.
	 * @see responsibilityMetaModel.resourceRequiredRelationship#getResource()
	 * @see #getresourceRequiredRelationship()
	 * @generated
	 */
	EReference getresourceRequiredRelationship_Resource();

	/**
	 * Returns the meta object for class '{@link responsibilityMetaModel.Relation <em>Relation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Relation</em>'.
	 * @see responsibilityMetaModel.Relation
	 * @generated
	 */
	EClass getRelation();

	/**
	 * Returns the meta object for class '{@link responsibilityMetaModel.resourceProducedRelationship <em>resource Produced Relationship</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>resource Produced Relationship</em>'.
	 * @see responsibilityMetaModel.resourceProducedRelationship
	 * @generated
	 */
	EClass getresourceProducedRelationship();

	/**
	 * Returns the meta object for the reference '{@link responsibilityMetaModel.resourceProducedRelationship#getResponsibility <em>Responsibility</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Responsibility</em>'.
	 * @see responsibilityMetaModel.resourceProducedRelationship#getResponsibility()
	 * @see #getresourceProducedRelationship()
	 * @generated
	 */
	EReference getresourceProducedRelationship_Responsibility();

	/**
	 * Returns the meta object for the reference '{@link responsibilityMetaModel.resourceProducedRelationship#getResource <em>Resource</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Resource</em>'.
	 * @see responsibilityMetaModel.resourceProducedRelationship#getResource()
	 * @see #getresourceProducedRelationship()
	 * @generated
	 */
	EReference getresourceProducedRelationship_Resource();

	/**
	 * Returns the meta object for class '{@link responsibilityMetaModel.actorRequiredRelationship <em>actor Required Relationship</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>actor Required Relationship</em>'.
	 * @see responsibilityMetaModel.actorRequiredRelationship
	 * @generated
	 */
	EClass getactorRequiredRelationship();

	/**
	 * Returns the meta object for the reference '{@link responsibilityMetaModel.actorRequiredRelationship#getResponsibility <em>Responsibility</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Responsibility</em>'.
	 * @see responsibilityMetaModel.actorRequiredRelationship#getResponsibility()
	 * @see #getactorRequiredRelationship()
	 * @generated
	 */
	EReference getactorRequiredRelationship_Responsibility();

	/**
	 * Returns the meta object for the reference '{@link responsibilityMetaModel.actorRequiredRelationship#getActor <em>Actor</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Actor</em>'.
	 * @see responsibilityMetaModel.actorRequiredRelationship#getActor()
	 * @see #getactorRequiredRelationship()
	 * @generated
	 */
	EReference getactorRequiredRelationship_Actor();

	/**
	 * Returns the meta object for class '{@link responsibilityMetaModel.actorHoldsRelationship <em>actor Holds Relationship</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>actor Holds Relationship</em>'.
	 * @see responsibilityMetaModel.actorHoldsRelationship
	 * @generated
	 */
	EClass getactorHoldsRelationship();

	/**
	 * Returns the meta object for the reference '{@link responsibilityMetaModel.actorHoldsRelationship#getResponsibility <em>Responsibility</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Responsibility</em>'.
	 * @see responsibilityMetaModel.actorHoldsRelationship#getResponsibility()
	 * @see #getactorHoldsRelationship()
	 * @generated
	 */
	EReference getactorHoldsRelationship_Responsibility();

	/**
	 * Returns the meta object for the reference '{@link responsibilityMetaModel.actorHoldsRelationship#getActor <em>Actor</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Actor</em>'.
	 * @see responsibilityMetaModel.actorHoldsRelationship#getActor()
	 * @see #getactorHoldsRelationship()
	 * @generated
	 */
	EReference getactorHoldsRelationship_Actor();

	/**
	 * Returns the meta object for class '{@link responsibilityMetaModel.responsibilityRequiredRelationship <em>responsibility Required Relationship</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>responsibility Required Relationship</em>'.
	 * @see responsibilityMetaModel.responsibilityRequiredRelationship
	 * @generated
	 */
	EClass getresponsibilityRequiredRelationship();

	/**
	 * Returns the meta object for the reference '{@link responsibilityMetaModel.responsibilityRequiredRelationship#getSubRresponsibility <em>Sub Rresponsibility</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Sub Rresponsibility</em>'.
	 * @see responsibilityMetaModel.responsibilityRequiredRelationship#getSubRresponsibility()
	 * @see #getresponsibilityRequiredRelationship()
	 * @generated
	 */
	EReference getresponsibilityRequiredRelationship_SubRresponsibility();

	/**
	 * Returns the meta object for the reference '{@link responsibilityMetaModel.responsibilityRequiredRelationship#getSuperResponsibility <em>Super Responsibility</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Super Responsibility</em>'.
	 * @see responsibilityMetaModel.responsibilityRequiredRelationship#getSuperResponsibility()
	 * @see #getresponsibilityRequiredRelationship()
	 * @generated
	 */
	EReference getresponsibilityRequiredRelationship_SuperResponsibility();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	ResponsibilityMetaModelFactory getResponsibilityMetaModelFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each operation of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link responsibilityMetaModel.impl.ResponsibilityImpl <em>Responsibility</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see responsibilityMetaModel.impl.ResponsibilityImpl
		 * @see responsibilityMetaModel.impl.ResponsibilityMetaModelPackageImpl#getResponsibility()
		 * @generated
		 */
		EClass RESPONSIBILITY = eINSTANCE.getResponsibility();

		/**
		 * The meta object literal for the '<em><b>Satisfaction Criteria</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RESPONSIBILITY__SATISFACTION_CRITERIA = eINSTANCE.getResponsibility_SatisfactionCriteria();

		/**
		 * The meta object literal for the '<em><b>Required Resource</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RESPONSIBILITY__REQUIRED_RESOURCE = eINSTANCE.getResponsibility_RequiredResource();

		/**
		 * The meta object literal for the '<em><b>Produced Resource</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RESPONSIBILITY__PRODUCED_RESOURCE = eINSTANCE.getResponsibility_ProducedResource();

		/**
		 * The meta object literal for the '<em><b>Required Actor</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RESPONSIBILITY__REQUIRED_ACTOR = eINSTANCE.getResponsibility_RequiredActor();

		/**
		 * The meta object literal for the '<em><b>Held By</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RESPONSIBILITY__HELD_BY = eINSTANCE.getResponsibility_HeldBy();

		/**
		 * The meta object literal for the '<em><b>Super Responsibility</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RESPONSIBILITY__SUPER_RESPONSIBILITY = eINSTANCE.getResponsibility_SuperResponsibility();

		/**
		 * The meta object literal for the '<em><b>Sub Responsibility</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RESPONSIBILITY__SUB_RESPONSIBILITY = eINSTANCE.getResponsibility_SubResponsibility();

		/**
		 * The meta object literal for the '<em><b>Satisfied</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation RESPONSIBILITY___SATISFIED = eINSTANCE.getResponsibility__Satisfied();

		/**
		 * The meta object literal for the '{@link responsibilityMetaModel.impl.ResourceImpl <em>Resource</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see responsibilityMetaModel.impl.ResourceImpl
		 * @see responsibilityMetaModel.impl.ResponsibilityMetaModelPackageImpl#getResource()
		 * @generated
		 */
		EClass RESOURCE = eINSTANCE.getResource();

		/**
		 * The meta object literal for the '<em><b>Required By</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RESOURCE__REQUIRED_BY = eINSTANCE.getResource_RequiredBy();

		/**
		 * The meta object literal for the '<em><b>Produced By</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RESOURCE__PRODUCED_BY = eINSTANCE.getResource_ProducedBy();

		/**
		 * The meta object literal for the '<em><b>Satisfied</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation RESOURCE___SATISFIED = eINSTANCE.getResource__Satisfied();

		/**
		 * The meta object literal for the '{@link responsibilityMetaModel.impl.ActorImpl <em>Actor</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see responsibilityMetaModel.impl.ActorImpl
		 * @see responsibilityMetaModel.impl.ResponsibilityMetaModelPackageImpl#getActor()
		 * @generated
		 */
		EClass ACTOR = eINSTANCE.getActor();

		/**
		 * The meta object literal for the '<em><b>Required By</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ACTOR__REQUIRED_BY = eINSTANCE.getActor_RequiredBy();

		/**
		 * The meta object literal for the '<em><b>Held Responsibility</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ACTOR__HELD_RESPONSIBILITY = eINSTANCE.getActor_HeldResponsibility();

		/**
		 * The meta object literal for the '<em><b>Satisfied</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation ACTOR___SATISFIED = eINSTANCE.getActor__Satisfied();

		/**
		 * The meta object literal for the '{@link responsibilityMetaModel.impl.ScenarioImpl <em>Scenario</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see responsibilityMetaModel.impl.ScenarioImpl
		 * @see responsibilityMetaModel.impl.ResponsibilityMetaModelPackageImpl#getScenario()
		 * @generated
		 */
		EClass SCENARIO = eINSTANCE.getScenario();

		/**
		 * The meta object literal for the '<em><b>Resources</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SCENARIO__RESOURCES = eINSTANCE.getScenario_Resources();

		/**
		 * The meta object literal for the '<em><b>Responsibilities</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SCENARIO__RESPONSIBILITIES = eINSTANCE.getScenario_Responsibilities();

		/**
		 * The meta object literal for the '<em><b>Actors</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SCENARIO__ACTORS = eINSTANCE.getScenario_Actors();

		/**
		 * The meta object literal for the '<em><b>Relations</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SCENARIO__RELATIONS = eINSTANCE.getScenario_Relations();

		/**
		 * The meta object literal for the '{@link responsibilityMetaModel.Entity <em>Entity</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see responsibilityMetaModel.Entity
		 * @see responsibilityMetaModel.impl.ResponsibilityMetaModelPackageImpl#getEntity()
		 * @generated
		 */
		EClass ENTITY = eINSTANCE.getEntity();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ENTITY__NAME = eINSTANCE.getEntity_Name();

		/**
		 * The meta object literal for the '<em><b>Enabled</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ENTITY__ENABLED = eINSTANCE.getEntity_Enabled();

		/**
		 * The meta object literal for the '<em><b>Satisifed</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ENTITY__SATISIFED = eINSTANCE.getEntity_Satisifed();

		/**
		 * The meta object literal for the '<em><b>Satisfied</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation ENTITY___SATISFIED = eINSTANCE.getEntity__Satisfied();

		/**
		 * The meta object literal for the '{@link responsibilityMetaModel.impl.resourceRequiredRelationshipImpl <em>resource Required Relationship</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see responsibilityMetaModel.impl.resourceRequiredRelationshipImpl
		 * @see responsibilityMetaModel.impl.ResponsibilityMetaModelPackageImpl#getresourceRequiredRelationship()
		 * @generated
		 */
		EClass RESOURCE_REQUIRED_RELATIONSHIP = eINSTANCE.getresourceRequiredRelationship();

		/**
		 * The meta object literal for the '<em><b>Responsibility</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RESOURCE_REQUIRED_RELATIONSHIP__RESPONSIBILITY = eINSTANCE.getresourceRequiredRelationship_Responsibility();

		/**
		 * The meta object literal for the '<em><b>Resource</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RESOURCE_REQUIRED_RELATIONSHIP__RESOURCE = eINSTANCE.getresourceRequiredRelationship_Resource();

		/**
		 * The meta object literal for the '{@link responsibilityMetaModel.Relation <em>Relation</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see responsibilityMetaModel.Relation
		 * @see responsibilityMetaModel.impl.ResponsibilityMetaModelPackageImpl#getRelation()
		 * @generated
		 */
		EClass RELATION = eINSTANCE.getRelation();

		/**
		 * The meta object literal for the '{@link responsibilityMetaModel.impl.resourceProducedRelationshipImpl <em>resource Produced Relationship</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see responsibilityMetaModel.impl.resourceProducedRelationshipImpl
		 * @see responsibilityMetaModel.impl.ResponsibilityMetaModelPackageImpl#getresourceProducedRelationship()
		 * @generated
		 */
		EClass RESOURCE_PRODUCED_RELATIONSHIP = eINSTANCE.getresourceProducedRelationship();

		/**
		 * The meta object literal for the '<em><b>Responsibility</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RESOURCE_PRODUCED_RELATIONSHIP__RESPONSIBILITY = eINSTANCE.getresourceProducedRelationship_Responsibility();

		/**
		 * The meta object literal for the '<em><b>Resource</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RESOURCE_PRODUCED_RELATIONSHIP__RESOURCE = eINSTANCE.getresourceProducedRelationship_Resource();

		/**
		 * The meta object literal for the '{@link responsibilityMetaModel.impl.actorRequiredRelationshipImpl <em>actor Required Relationship</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see responsibilityMetaModel.impl.actorRequiredRelationshipImpl
		 * @see responsibilityMetaModel.impl.ResponsibilityMetaModelPackageImpl#getactorRequiredRelationship()
		 * @generated
		 */
		EClass ACTOR_REQUIRED_RELATIONSHIP = eINSTANCE.getactorRequiredRelationship();

		/**
		 * The meta object literal for the '<em><b>Responsibility</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ACTOR_REQUIRED_RELATIONSHIP__RESPONSIBILITY = eINSTANCE.getactorRequiredRelationship_Responsibility();

		/**
		 * The meta object literal for the '<em><b>Actor</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ACTOR_REQUIRED_RELATIONSHIP__ACTOR = eINSTANCE.getactorRequiredRelationship_Actor();

		/**
		 * The meta object literal for the '{@link responsibilityMetaModel.impl.actorHoldsRelationshipImpl <em>actor Holds Relationship</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see responsibilityMetaModel.impl.actorHoldsRelationshipImpl
		 * @see responsibilityMetaModel.impl.ResponsibilityMetaModelPackageImpl#getactorHoldsRelationship()
		 * @generated
		 */
		EClass ACTOR_HOLDS_RELATIONSHIP = eINSTANCE.getactorHoldsRelationship();

		/**
		 * The meta object literal for the '<em><b>Responsibility</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ACTOR_HOLDS_RELATIONSHIP__RESPONSIBILITY = eINSTANCE.getactorHoldsRelationship_Responsibility();

		/**
		 * The meta object literal for the '<em><b>Actor</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ACTOR_HOLDS_RELATIONSHIP__ACTOR = eINSTANCE.getactorHoldsRelationship_Actor();

		/**
		 * The meta object literal for the '{@link responsibilityMetaModel.impl.responsibilityRequiredRelationshipImpl <em>responsibility Required Relationship</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see responsibilityMetaModel.impl.responsibilityRequiredRelationshipImpl
		 * @see responsibilityMetaModel.impl.ResponsibilityMetaModelPackageImpl#getresponsibilityRequiredRelationship()
		 * @generated
		 */
		EClass RESPONSIBILITY_REQUIRED_RELATIONSHIP = eINSTANCE.getresponsibilityRequiredRelationship();

		/**
		 * The meta object literal for the '<em><b>Sub Rresponsibility</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RESPONSIBILITY_REQUIRED_RELATIONSHIP__SUB_RRESPONSIBILITY = eINSTANCE.getresponsibilityRequiredRelationship_SubRresponsibility();

		/**
		 * The meta object literal for the '<em><b>Super Responsibility</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RESPONSIBILITY_REQUIRED_RELATIONSHIP__SUPER_RESPONSIBILITY = eINSTANCE.getresponsibilityRequiredRelationship_SuperResponsibility();

	}

} //ResponsibilityMetaModelPackage
