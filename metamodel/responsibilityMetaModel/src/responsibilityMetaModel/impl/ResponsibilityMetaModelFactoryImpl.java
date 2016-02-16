/**
 */
package responsibilityMetaModel.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

import responsibilityMetaModel.*;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class ResponsibilityMetaModelFactoryImpl extends EFactoryImpl implements ResponsibilityMetaModelFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static ResponsibilityMetaModelFactory init() {
		try {
			ResponsibilityMetaModelFactory theResponsibilityMetaModelFactory = (ResponsibilityMetaModelFactory)EPackage.Registry.INSTANCE.getEFactory(ResponsibilityMetaModelPackage.eNS_URI);
			if (theResponsibilityMetaModelFactory != null) {
				return theResponsibilityMetaModelFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new ResponsibilityMetaModelFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ResponsibilityMetaModelFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
			case ResponsibilityMetaModelPackage.RESPONSIBILITY: return createResponsibility();
			case ResponsibilityMetaModelPackage.RESOURCE: return createResource();
			case ResponsibilityMetaModelPackage.ACTOR: return createActor();
			case ResponsibilityMetaModelPackage.SCENARIO: return createScenario();
			case ResponsibilityMetaModelPackage.RESOURCE_REQUIRED_RELATIONSHIP: return createresourceRequiredRelationship();
			case ResponsibilityMetaModelPackage.RESOURCE_PRODUCED_RELATIONSHIP: return createresourceProducedRelationship();
			case ResponsibilityMetaModelPackage.ACTOR_REQUIRED_RELATIONSHIP: return createactorRequiredRelationship();
			case ResponsibilityMetaModelPackage.ACTOR_HOLDS_RELATIONSHIP: return createactorHoldsRelationship();
			case ResponsibilityMetaModelPackage.RESPONSIBILITY_REQUIRED_RELATIONSHIP: return createresponsibilityRequiredRelationship();
			case ResponsibilityMetaModelPackage.ACTOR_PRODUCED_RELATIONSHIP: return createactorProducedRelationship();
			case ResponsibilityMetaModelPackage.SOURCE: return createSource();
			case ResponsibilityMetaModelPackage.ATTRIBUTION_RELATIONSHIP: return createattributionRelationship();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Responsibility createResponsibility() {
		ResponsibilityImpl responsibility = new ResponsibilityImpl();
		return responsibility;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Resource createResource() {
		ResourceImpl resource = new ResourceImpl();
		return resource;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Actor createActor() {
		ActorImpl actor = new ActorImpl();
		return actor;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Scenario createScenario() {
		ScenarioImpl scenario = new ScenarioImpl();
		return scenario;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public resourceRequiredRelationship createresourceRequiredRelationship() {
		resourceRequiredRelationshipImpl resourceRequiredRelationship = new resourceRequiredRelationshipImpl();
		return resourceRequiredRelationship;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public resourceProducedRelationship createresourceProducedRelationship() {
		resourceProducedRelationshipImpl resourceProducedRelationship = new resourceProducedRelationshipImpl();
		return resourceProducedRelationship;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public actorRequiredRelationship createactorRequiredRelationship() {
		actorRequiredRelationshipImpl actorRequiredRelationship = new actorRequiredRelationshipImpl();
		return actorRequiredRelationship;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public actorHoldsRelationship createactorHoldsRelationship() {
		actorHoldsRelationshipImpl actorHoldsRelationship = new actorHoldsRelationshipImpl();
		return actorHoldsRelationship;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public responsibilityRequiredRelationship createresponsibilityRequiredRelationship() {
		responsibilityRequiredRelationshipImpl responsibilityRequiredRelationship = new responsibilityRequiredRelationshipImpl();
		return responsibilityRequiredRelationship;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public actorProducedRelationship createactorProducedRelationship() {
		actorProducedRelationshipImpl actorProducedRelationship = new actorProducedRelationshipImpl();
		return actorProducedRelationship;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Source createSource() {
		SourceImpl source = new SourceImpl();
		return source;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public attributionRelationship createattributionRelationship() {
		attributionRelationshipImpl attributionRelationship = new attributionRelationshipImpl();
		return attributionRelationship;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ResponsibilityMetaModelPackage getResponsibilityMetaModelPackage() {
		return (ResponsibilityMetaModelPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static ResponsibilityMetaModelPackage getPackage() {
		return ResponsibilityMetaModelPackage.eINSTANCE;
	}

} //ResponsibilityMetaModelFactoryImpl
