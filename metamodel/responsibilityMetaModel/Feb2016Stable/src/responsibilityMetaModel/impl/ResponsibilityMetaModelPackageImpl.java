/**
 */
package responsibilityMetaModel.impl;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EOperation;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.impl.EPackageImpl;
import org.eclipse.emf.ecore.xml.type.XMLTypePackage;
import responsibilityMetaModel.Actor;
import responsibilityMetaModel.Entity;
import responsibilityMetaModel.Relation;
import responsibilityMetaModel.Resource;
import responsibilityMetaModel.Responsibility;
import responsibilityMetaModel.ResponsibilityMetaModelFactory;
import responsibilityMetaModel.ResponsibilityMetaModelPackage;
import responsibilityMetaModel.Scenario;
import responsibilityMetaModel.actorHoldsRelationship;
import responsibilityMetaModel.actorProducedRelationship;
import responsibilityMetaModel.actorRequiredRelationship;
import responsibilityMetaModel.resourceProducedRelationship;
import responsibilityMetaModel.resourceRequiredRelationship;
import responsibilityMetaModel.responsibilityRequiredRelationship;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class ResponsibilityMetaModelPackageImpl extends EPackageImpl implements ResponsibilityMetaModelPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass responsibilityEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass resourceEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass actorEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass scenarioEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass entityEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass resourceRequiredRelationshipEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass relationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass resourceProducedRelationshipEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass actorRequiredRelationshipEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass actorHoldsRelationshipEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass responsibilityRequiredRelationshipEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass actorProducedRelationshipEClass = null;

	/**
	 * Creates an instance of the model <b>Package</b>, registered with
	 * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
	 * package URI value.
	 * <p>Note: the correct way to create the package is via the static
	 * factory method {@link #init init()}, which also performs
	 * initialization of the package, or returns the registered package,
	 * if one already exists.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.ecore.EPackage.Registry
	 * @see responsibilityMetaModel.ResponsibilityMetaModelPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private ResponsibilityMetaModelPackageImpl() {
		super(eNS_URI, ResponsibilityMetaModelFactory.eINSTANCE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static boolean isInited = false;

	/**
	 * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
	 * 
	 * <p>This method is used to initialize {@link ResponsibilityMetaModelPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static ResponsibilityMetaModelPackage init() {
		if (isInited) return (ResponsibilityMetaModelPackage)EPackage.Registry.INSTANCE.getEPackage(ResponsibilityMetaModelPackage.eNS_URI);

		// Obtain or create and register package
		ResponsibilityMetaModelPackageImpl theResponsibilityMetaModelPackage = (ResponsibilityMetaModelPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof ResponsibilityMetaModelPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new ResponsibilityMetaModelPackageImpl());

		isInited = true;

		// Initialize simple dependencies
		XMLTypePackage.eINSTANCE.eClass();

		// Create package meta-data objects
		theResponsibilityMetaModelPackage.createPackageContents();

		// Initialize created meta-data
		theResponsibilityMetaModelPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theResponsibilityMetaModelPackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(ResponsibilityMetaModelPackage.eNS_URI, theResponsibilityMetaModelPackage);
		return theResponsibilityMetaModelPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getResponsibility() {
		return responsibilityEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getResponsibility_RequiredResource() {
		return (EReference)responsibilityEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getResponsibility_ProducedResource() {
		return (EReference)responsibilityEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getResponsibility_RequiredActor() {
		return (EReference)responsibilityEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getResponsibility_HeldBy() {
		return (EReference)responsibilityEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getResponsibility_SuperResponsibility() {
		return (EReference)responsibilityEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getResponsibility_SubResponsibility() {
		return (EReference)responsibilityEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getResponsibility_ProducedActor() {
		return (EReference)responsibilityEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getResponsibility__Satisfied() {
		return responsibilityEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getResource() {
		return resourceEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getResource_RequiredBy() {
		return (EReference)resourceEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getResource_ProducedBy() {
		return (EReference)resourceEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getResource__Satisfied() {
		return resourceEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getActor() {
		return actorEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getActor_RequiredBy() {
		return (EReference)actorEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getActor_HeldResponsibility() {
		return (EReference)actorEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getActor_ProducedBy() {
		return (EReference)actorEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getActor__Satisfied() {
		return actorEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getActor__Reliance() {
		return actorEClass.getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getScenario() {
		return scenarioEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getScenario_Resources() {
		return (EReference)scenarioEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getScenario_Responsibilities() {
		return (EReference)scenarioEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getScenario_Actors() {
		return (EReference)scenarioEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getScenario_Relations() {
		return (EReference)scenarioEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getScenario_Name() {
		return (EAttribute)scenarioEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getScenario__GetEntities() {
		return scenarioEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getScenario__CriticalityAnalysis() {
		return scenarioEClass.getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getEntity() {
		return entityEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getEntity_Name() {
		return (EAttribute)entityEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getEntity_Enabled() {
		return (EAttribute)entityEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getEntity_Satisifed() {
		return (EAttribute)entityEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getEntity_SatisfactionCriteria() {
		return (EAttribute)entityEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getEntity_Critical() {
		return (EAttribute)entityEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getEntity_CriticalityCount() {
		return (EAttribute)entityEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getEntity__Satisfied() {
		return entityEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getresourceRequiredRelationship() {
		return resourceRequiredRelationshipEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getresourceRequiredRelationship_Responsibility() {
		return (EReference)resourceRequiredRelationshipEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getresourceRequiredRelationship_Resource() {
		return (EReference)resourceRequiredRelationshipEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getRelation() {
		return relationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getresourceProducedRelationship() {
		return resourceProducedRelationshipEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getresourceProducedRelationship_Responsibility() {
		return (EReference)resourceProducedRelationshipEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getresourceProducedRelationship_Resource() {
		return (EReference)resourceProducedRelationshipEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getactorRequiredRelationship() {
		return actorRequiredRelationshipEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getactorRequiredRelationship_Responsibility() {
		return (EReference)actorRequiredRelationshipEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getactorRequiredRelationship_Actor() {
		return (EReference)actorRequiredRelationshipEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getactorHoldsRelationship() {
		return actorHoldsRelationshipEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getactorHoldsRelationship_Responsibility() {
		return (EReference)actorHoldsRelationshipEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getactorHoldsRelationship_Actor() {
		return (EReference)actorHoldsRelationshipEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getresponsibilityRequiredRelationship() {
		return responsibilityRequiredRelationshipEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getresponsibilityRequiredRelationship_SubRresponsibility() {
		return (EReference)responsibilityRequiredRelationshipEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getresponsibilityRequiredRelationship_SuperResponsibility() {
		return (EReference)responsibilityRequiredRelationshipEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getactorProducedRelationship() {
		return actorProducedRelationshipEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getactorProducedRelationship_Actor() {
		return (EReference)actorProducedRelationshipEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getactorProducedRelationship_Responsibility() {
		return (EReference)actorProducedRelationshipEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ResponsibilityMetaModelFactory getResponsibilityMetaModelFactory() {
		return (ResponsibilityMetaModelFactory)getEFactoryInstance();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isCreated = false;

	/**
	 * Creates the meta-model objects for the package.  This method is
	 * guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void createPackageContents() {
		if (isCreated) return;
		isCreated = true;

		// Create classes and their features
		responsibilityEClass = createEClass(RESPONSIBILITY);
		createEReference(responsibilityEClass, RESPONSIBILITY__REQUIRED_RESOURCE);
		createEReference(responsibilityEClass, RESPONSIBILITY__PRODUCED_RESOURCE);
		createEReference(responsibilityEClass, RESPONSIBILITY__REQUIRED_ACTOR);
		createEReference(responsibilityEClass, RESPONSIBILITY__HELD_BY);
		createEReference(responsibilityEClass, RESPONSIBILITY__SUPER_RESPONSIBILITY);
		createEReference(responsibilityEClass, RESPONSIBILITY__SUB_RESPONSIBILITY);
		createEReference(responsibilityEClass, RESPONSIBILITY__PRODUCED_ACTOR);
		createEOperation(responsibilityEClass, RESPONSIBILITY___SATISFIED);

		resourceEClass = createEClass(RESOURCE);
		createEReference(resourceEClass, RESOURCE__REQUIRED_BY);
		createEReference(resourceEClass, RESOURCE__PRODUCED_BY);
		createEOperation(resourceEClass, RESOURCE___SATISFIED);

		actorEClass = createEClass(ACTOR);
		createEReference(actorEClass, ACTOR__REQUIRED_BY);
		createEReference(actorEClass, ACTOR__HELD_RESPONSIBILITY);
		createEReference(actorEClass, ACTOR__PRODUCED_BY);
		createEOperation(actorEClass, ACTOR___SATISFIED);
		createEOperation(actorEClass, ACTOR___RELIANCE);

		scenarioEClass = createEClass(SCENARIO);
		createEReference(scenarioEClass, SCENARIO__RESOURCES);
		createEReference(scenarioEClass, SCENARIO__RESPONSIBILITIES);
		createEReference(scenarioEClass, SCENARIO__ACTORS);
		createEReference(scenarioEClass, SCENARIO__RELATIONS);
		createEAttribute(scenarioEClass, SCENARIO__NAME);
		createEOperation(scenarioEClass, SCENARIO___GET_ENTITIES);
		createEOperation(scenarioEClass, SCENARIO___CRITICALITY_ANALYSIS);

		entityEClass = createEClass(ENTITY);
		createEAttribute(entityEClass, ENTITY__NAME);
		createEAttribute(entityEClass, ENTITY__ENABLED);
		createEAttribute(entityEClass, ENTITY__SATISIFED);
		createEAttribute(entityEClass, ENTITY__SATISFACTION_CRITERIA);
		createEAttribute(entityEClass, ENTITY__CRITICAL);
		createEAttribute(entityEClass, ENTITY__CRITICALITY_COUNT);
		createEOperation(entityEClass, ENTITY___SATISFIED);

		resourceRequiredRelationshipEClass = createEClass(RESOURCE_REQUIRED_RELATIONSHIP);
		createEReference(resourceRequiredRelationshipEClass, RESOURCE_REQUIRED_RELATIONSHIP__RESPONSIBILITY);
		createEReference(resourceRequiredRelationshipEClass, RESOURCE_REQUIRED_RELATIONSHIP__RESOURCE);

		relationEClass = createEClass(RELATION);

		resourceProducedRelationshipEClass = createEClass(RESOURCE_PRODUCED_RELATIONSHIP);
		createEReference(resourceProducedRelationshipEClass, RESOURCE_PRODUCED_RELATIONSHIP__RESPONSIBILITY);
		createEReference(resourceProducedRelationshipEClass, RESOURCE_PRODUCED_RELATIONSHIP__RESOURCE);

		actorRequiredRelationshipEClass = createEClass(ACTOR_REQUIRED_RELATIONSHIP);
		createEReference(actorRequiredRelationshipEClass, ACTOR_REQUIRED_RELATIONSHIP__RESPONSIBILITY);
		createEReference(actorRequiredRelationshipEClass, ACTOR_REQUIRED_RELATIONSHIP__ACTOR);

		actorHoldsRelationshipEClass = createEClass(ACTOR_HOLDS_RELATIONSHIP);
		createEReference(actorHoldsRelationshipEClass, ACTOR_HOLDS_RELATIONSHIP__RESPONSIBILITY);
		createEReference(actorHoldsRelationshipEClass, ACTOR_HOLDS_RELATIONSHIP__ACTOR);

		responsibilityRequiredRelationshipEClass = createEClass(RESPONSIBILITY_REQUIRED_RELATIONSHIP);
		createEReference(responsibilityRequiredRelationshipEClass, RESPONSIBILITY_REQUIRED_RELATIONSHIP__SUB_RRESPONSIBILITY);
		createEReference(responsibilityRequiredRelationshipEClass, RESPONSIBILITY_REQUIRED_RELATIONSHIP__SUPER_RESPONSIBILITY);

		actorProducedRelationshipEClass = createEClass(ACTOR_PRODUCED_RELATIONSHIP);
		createEReference(actorProducedRelationshipEClass, ACTOR_PRODUCED_RELATIONSHIP__ACTOR);
		createEReference(actorProducedRelationshipEClass, ACTOR_PRODUCED_RELATIONSHIP__RESPONSIBILITY);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isInitialized = false;

	/**
	 * Complete the initialization of the package and its meta-model.  This
	 * method is guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void initializePackageContents() {
		if (isInitialized) return;
		isInitialized = true;

		// Initialize package
		setName(eNAME);
		setNsPrefix(eNS_PREFIX);
		setNsURI(eNS_URI);

		// Obtain other dependent packages
		XMLTypePackage theXMLTypePackage = (XMLTypePackage)EPackage.Registry.INSTANCE.getEPackage(XMLTypePackage.eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		responsibilityEClass.getESuperTypes().add(this.getEntity());
		resourceEClass.getESuperTypes().add(this.getEntity());
		actorEClass.getESuperTypes().add(this.getEntity());
		resourceRequiredRelationshipEClass.getESuperTypes().add(this.getRelation());
		resourceProducedRelationshipEClass.getESuperTypes().add(this.getRelation());
		actorRequiredRelationshipEClass.getESuperTypes().add(this.getRelation());
		actorHoldsRelationshipEClass.getESuperTypes().add(this.getRelation());
		responsibilityRequiredRelationshipEClass.getESuperTypes().add(this.getRelation());
		actorProducedRelationshipEClass.getESuperTypes().add(this.getRelation());

		// Initialize classes, features, and operations; add parameters
		initEClass(responsibilityEClass, Responsibility.class, "Responsibility", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getResponsibility_RequiredResource(), this.getresourceRequiredRelationship(), this.getresourceRequiredRelationship_Responsibility(), "requiredResource", null, 0, -1, Responsibility.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getResponsibility_ProducedResource(), this.getresourceProducedRelationship(), this.getresourceProducedRelationship_Responsibility(), "producedResource", null, 0, -1, Responsibility.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getResponsibility_RequiredActor(), this.getactorRequiredRelationship(), this.getactorRequiredRelationship_Responsibility(), "requiredActor", null, 0, -1, Responsibility.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getResponsibility_HeldBy(), this.getactorHoldsRelationship(), this.getactorHoldsRelationship_Responsibility(), "heldBy", null, 0, -1, Responsibility.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getResponsibility_SuperResponsibility(), this.getresponsibilityRequiredRelationship(), this.getresponsibilityRequiredRelationship_SubRresponsibility(), "superResponsibility", null, 0, -1, Responsibility.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getResponsibility_SubResponsibility(), this.getresponsibilityRequiredRelationship(), this.getresponsibilityRequiredRelationship_SuperResponsibility(), "subResponsibility", null, 0, -1, Responsibility.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getResponsibility_ProducedActor(), this.getactorProducedRelationship(), this.getactorProducedRelationship_Responsibility(), "producedActor", null, 0, -1, Responsibility.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEOperation(getResponsibility__Satisfied(), theXMLTypePackage.getBoolean(), "satisfied", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(resourceEClass, Resource.class, "Resource", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getResource_RequiredBy(), this.getresourceRequiredRelationship(), this.getresourceRequiredRelationship_Resource(), "requiredBy", null, 0, -1, Resource.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getResource_ProducedBy(), this.getresourceProducedRelationship(), this.getresourceProducedRelationship_Resource(), "producedBy", null, 0, -1, Resource.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEOperation(getResource__Satisfied(), theXMLTypePackage.getBoolean(), "satisfied", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(actorEClass, Actor.class, "Actor", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getActor_RequiredBy(), this.getactorRequiredRelationship(), this.getactorRequiredRelationship_Actor(), "requiredBy", null, 0, -1, Actor.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getActor_HeldResponsibility(), this.getactorHoldsRelationship(), this.getactorHoldsRelationship_Actor(), "heldResponsibility", null, 0, -1, Actor.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getActor_ProducedBy(), this.getactorProducedRelationship(), this.getactorProducedRelationship_Actor(), "producedBy", null, 0, -1, Actor.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEOperation(getActor__Satisfied(), theXMLTypePackage.getBoolean(), "satisfied", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEOperation(getActor__Reliance(), this.getActor(), "reliance", 0, -1, IS_UNIQUE, !IS_ORDERED);

		initEClass(scenarioEClass, Scenario.class, "Scenario", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getScenario_Resources(), this.getResource(), null, "resources", null, 0, -1, Scenario.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getScenario_Responsibilities(), this.getResponsibility(), null, "responsibilities", null, 0, -1, Scenario.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getScenario_Actors(), this.getActor(), null, "actors", null, 0, -1, Scenario.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getScenario_Relations(), this.getRelation(), null, "relations", null, 0, -1, Scenario.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getScenario_Name(), theXMLTypePackage.getString(), "name", null, 0, 1, Scenario.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEOperation(getScenario__GetEntities(), this.getEntity(), "getEntities", 0, -1, IS_UNIQUE, !IS_ORDERED);

		initEOperation(getScenario__CriticalityAnalysis(), null, "criticalityAnalysis", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(entityEClass, Entity.class, "Entity", IS_ABSTRACT, IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getEntity_Name(), theXMLTypePackage.getString(), "name", null, 0, 1, Entity.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getEntity_Enabled(), theXMLTypePackage.getBoolean(), "enabled", "true", 0, 1, Entity.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getEntity_Satisifed(), theXMLTypePackage.getBoolean(), "satisifed", "true", 0, 1, Entity.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getEntity_SatisfactionCriteria(), theXMLTypePackage.getString(), "satisfactionCriteria", "", 0, 1, Entity.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getEntity_Critical(), theXMLTypePackage.getBoolean(), "critical", "false", 0, 1, Entity.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getEntity_CriticalityCount(), theXMLTypePackage.getIntObject(), "criticalityCount", "0", 0, 1, Entity.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEOperation(getEntity__Satisfied(), theXMLTypePackage.getBoolean(), "satisfied", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(resourceRequiredRelationshipEClass, resourceRequiredRelationship.class, "resourceRequiredRelationship", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getresourceRequiredRelationship_Responsibility(), this.getResponsibility(), this.getResponsibility_RequiredResource(), "responsibility", null, 0, 1, resourceRequiredRelationship.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getresourceRequiredRelationship_Resource(), this.getResource(), this.getResource_RequiredBy(), "resource", null, 0, 1, resourceRequiredRelationship.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(relationEClass, Relation.class, "Relation", IS_ABSTRACT, IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(resourceProducedRelationshipEClass, resourceProducedRelationship.class, "resourceProducedRelationship", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getresourceProducedRelationship_Responsibility(), this.getResponsibility(), this.getResponsibility_ProducedResource(), "responsibility", null, 0, 1, resourceProducedRelationship.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getresourceProducedRelationship_Resource(), this.getResource(), this.getResource_ProducedBy(), "resource", null, 0, 1, resourceProducedRelationship.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(actorRequiredRelationshipEClass, actorRequiredRelationship.class, "actorRequiredRelationship", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getactorRequiredRelationship_Responsibility(), this.getResponsibility(), this.getResponsibility_RequiredActor(), "responsibility", null, 0, 1, actorRequiredRelationship.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getactorRequiredRelationship_Actor(), this.getActor(), this.getActor_RequiredBy(), "actor", null, 0, 1, actorRequiredRelationship.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(actorHoldsRelationshipEClass, actorHoldsRelationship.class, "actorHoldsRelationship", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getactorHoldsRelationship_Responsibility(), this.getResponsibility(), this.getResponsibility_HeldBy(), "responsibility", null, 0, 1, actorHoldsRelationship.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getactorHoldsRelationship_Actor(), this.getActor(), this.getActor_HeldResponsibility(), "actor", null, 0, 1, actorHoldsRelationship.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(responsibilityRequiredRelationshipEClass, responsibilityRequiredRelationship.class, "responsibilityRequiredRelationship", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getresponsibilityRequiredRelationship_SubRresponsibility(), this.getResponsibility(), this.getResponsibility_SuperResponsibility(), "subRresponsibility", null, 0, 1, responsibilityRequiredRelationship.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getresponsibilityRequiredRelationship_SuperResponsibility(), this.getResponsibility(), this.getResponsibility_SubResponsibility(), "superResponsibility", null, 0, 1, responsibilityRequiredRelationship.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(actorProducedRelationshipEClass, actorProducedRelationship.class, "actorProducedRelationship", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getactorProducedRelationship_Actor(), this.getActor(), this.getActor_ProducedBy(), "actor", null, 0, 1, actorProducedRelationship.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getactorProducedRelationship_Responsibility(), this.getResponsibility(), this.getResponsibility_ProducedActor(), "responsibility", null, 0, 1, actorProducedRelationship.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		// Create resource
		createResource(eNS_URI);
	}

} //ResponsibilityMetaModelPackageImpl
