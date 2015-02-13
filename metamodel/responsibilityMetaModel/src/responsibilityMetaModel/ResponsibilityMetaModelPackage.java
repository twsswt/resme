/**
 */
package responsibilityMetaModel;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
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
	 * The number of structural features of the '<em>Entity</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTITY_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Entity</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTITY_OPERATION_COUNT = 0;

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
	 * The feature id for the '<em><b>Satisfaction Criteria</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESPONSIBILITY__SATISFACTION_CRITERIA = ENTITY_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Holder</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESPONSIBILITY__HOLDER = ENTITY_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Produced Resource</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESPONSIBILITY__PRODUCED_RESOURCE = ENTITY_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Super Responsibility</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESPONSIBILITY__SUPER_RESPONSIBILITY = ENTITY_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Sub Responsibility</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESPONSIBILITY__SUB_RESPONSIBILITY = ENTITY_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Actor Required</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESPONSIBILITY__ACTOR_REQUIRED = ENTITY_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Required Resource</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESPONSIBILITY__REQUIRED_RESOURCE = ENTITY_FEATURE_COUNT + 6;

	/**
	 * The number of structural features of the '<em>Responsibility</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESPONSIBILITY_FEATURE_COUNT = ENTITY_FEATURE_COUNT + 7;

	/**
	 * The number of operations of the '<em>Responsibility</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESPONSIBILITY_OPERATION_COUNT = ENTITY_OPERATION_COUNT + 0;

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
	 * The feature id for the '<em><b>Producer</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE__PRODUCER = ENTITY_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Required By</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE__REQUIRED_BY = ENTITY_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Resource</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE_FEATURE_COUNT = ENTITY_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Resource</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE_OPERATION_COUNT = ENTITY_OPERATION_COUNT + 0;

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
	 * The feature id for the '<em><b>Held Responsibility</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTOR__HELD_RESPONSIBILITY = ENTITY_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Required By</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTOR__REQUIRED_BY = ENTITY_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Actor</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTOR_FEATURE_COUNT = ENTITY_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Actor</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTOR_OPERATION_COUNT = ENTITY_OPERATION_COUNT + 0;

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
	 * Returns the meta object for the reference list '{@link responsibilityMetaModel.Responsibility#getHolder <em>Holder</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Holder</em>'.
	 * @see responsibilityMetaModel.Responsibility#getHolder()
	 * @see #getResponsibility()
	 * @generated
	 */
	EReference getResponsibility_Holder();

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
	 * Returns the meta object for the reference list '{@link responsibilityMetaModel.Responsibility#getActorRequired <em>Actor Required</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Actor Required</em>'.
	 * @see responsibilityMetaModel.Responsibility#getActorRequired()
	 * @see #getResponsibility()
	 * @generated
	 */
	EReference getResponsibility_ActorRequired();

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
	 * Returns the meta object for class '{@link responsibilityMetaModel.Resource <em>Resource</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Resource</em>'.
	 * @see responsibilityMetaModel.Resource
	 * @generated
	 */
	EClass getResource();

	/**
	 * Returns the meta object for the reference list '{@link responsibilityMetaModel.Resource#getProducer <em>Producer</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Producer</em>'.
	 * @see responsibilityMetaModel.Resource#getProducer()
	 * @see #getResource()
	 * @generated
	 */
	EReference getResource_Producer();

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
	 * Returns the meta object for class '{@link responsibilityMetaModel.Actor <em>Actor</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Actor</em>'.
	 * @see responsibilityMetaModel.Actor
	 * @generated
	 */
	EClass getActor();

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
		 * The meta object literal for the '<em><b>Holder</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RESPONSIBILITY__HOLDER = eINSTANCE.getResponsibility_Holder();

		/**
		 * The meta object literal for the '<em><b>Produced Resource</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RESPONSIBILITY__PRODUCED_RESOURCE = eINSTANCE.getResponsibility_ProducedResource();

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
		 * The meta object literal for the '<em><b>Actor Required</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RESPONSIBILITY__ACTOR_REQUIRED = eINSTANCE.getResponsibility_ActorRequired();

		/**
		 * The meta object literal for the '<em><b>Required Resource</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RESPONSIBILITY__REQUIRED_RESOURCE = eINSTANCE.getResponsibility_RequiredResource();

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
		 * The meta object literal for the '<em><b>Producer</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RESOURCE__PRODUCER = eINSTANCE.getResource_Producer();

		/**
		 * The meta object literal for the '<em><b>Required By</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RESOURCE__REQUIRED_BY = eINSTANCE.getResource_RequiredBy();

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
		 * The meta object literal for the '<em><b>Held Responsibility</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ACTOR__HELD_RESPONSIBILITY = eINSTANCE.getActor_HeldResponsibility();

		/**
		 * The meta object literal for the '<em><b>Required By</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ACTOR__REQUIRED_BY = eINSTANCE.getActor_RequiredBy();

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

	}

} //ResponsibilityMetaModelPackage
