/**
 */
package responsibilityMetaModel.util;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.Switch;

import responsibilityMetaModel.*;

/**
 * <!-- begin-user-doc -->
 * The <b>Switch</b> for the model's inheritance hierarchy.
 * It supports the call {@link #doSwitch(EObject) doSwitch(object)}
 * to invoke the <code>caseXXX</code> method for each class of the model,
 * starting with the actual class of the object
 * and proceeding up the inheritance hierarchy
 * until a non-null result is returned,
 * which is the result of the switch.
 * <!-- end-user-doc -->
 * @see responsibilityMetaModel.ResponsibilityMetaModelPackage
 * @generated
 */
public class ResponsibilityMetaModelSwitch<T> extends Switch<T> {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static ResponsibilityMetaModelPackage modelPackage;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ResponsibilityMetaModelSwitch() {
		if (modelPackage == null) {
			modelPackage = ResponsibilityMetaModelPackage.eINSTANCE;
		}
	}

	/**
	 * Checks whether this is a switch for the given package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param ePackage the package in question.
	 * @return whether this is a switch for the given package.
	 * @generated
	 */
	@Override
	protected boolean isSwitchFor(EPackage ePackage) {
		return ePackage == modelPackage;
	}

	/**
	 * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the first non-null result returned by a <code>caseXXX</code> call.
	 * @generated
	 */
	@Override
	protected T doSwitch(int classifierID, EObject theEObject) {
		switch (classifierID) {
			case ResponsibilityMetaModelPackage.RESPONSIBILITY: {
				Responsibility responsibility = (Responsibility)theEObject;
				T result = caseResponsibility(responsibility);
				if (result == null) result = caseEntity(responsibility);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ResponsibilityMetaModelPackage.RESOURCE: {
				Resource resource = (Resource)theEObject;
				T result = caseResource(resource);
				if (result == null) result = caseEntity(resource);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ResponsibilityMetaModelPackage.ACTOR: {
				Actor actor = (Actor)theEObject;
				T result = caseActor(actor);
				if (result == null) result = caseEntity(actor);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ResponsibilityMetaModelPackage.SCENARIO: {
				Scenario scenario = (Scenario)theEObject;
				T result = caseScenario(scenario);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ResponsibilityMetaModelPackage.ENTITY: {
				Entity entity = (Entity)theEObject;
				T result = caseEntity(entity);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ResponsibilityMetaModelPackage.RESOURCE_REQUIRED_RELATIONSHIP: {
				resourceRequiredRelationship resourceRequiredRelationship = (resourceRequiredRelationship)theEObject;
				T result = caseresourceRequiredRelationship(resourceRequiredRelationship);
				if (result == null) result = caseRelation(resourceRequiredRelationship);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ResponsibilityMetaModelPackage.RELATION: {
				Relation relation = (Relation)theEObject;
				T result = caseRelation(relation);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ResponsibilityMetaModelPackage.RESOURCE_PRODUCED_RELATIONSHIP: {
				resourceProducedRelationship resourceProducedRelationship = (resourceProducedRelationship)theEObject;
				T result = caseresourceProducedRelationship(resourceProducedRelationship);
				if (result == null) result = caseRelation(resourceProducedRelationship);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ResponsibilityMetaModelPackage.ACTOR_REQUIRED_RELATIONSHIP: {
				actorRequiredRelationship actorRequiredRelationship = (actorRequiredRelationship)theEObject;
				T result = caseactorRequiredRelationship(actorRequiredRelationship);
				if (result == null) result = caseRelation(actorRequiredRelationship);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ResponsibilityMetaModelPackage.ACTOR_HOLDS_RELATIONSHIP: {
				actorHoldsRelationship actorHoldsRelationship = (actorHoldsRelationship)theEObject;
				T result = caseactorHoldsRelationship(actorHoldsRelationship);
				if (result == null) result = caseRelation(actorHoldsRelationship);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ResponsibilityMetaModelPackage.RESPONSIBILITY_REQUIRED_RELATIONSHIP: {
				responsibilityRequiredRelationship responsibilityRequiredRelationship = (responsibilityRequiredRelationship)theEObject;
				T result = caseresponsibilityRequiredRelationship(responsibilityRequiredRelationship);
				if (result == null) result = caseRelation(responsibilityRequiredRelationship);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ResponsibilityMetaModelPackage.ACTOR_PRODUCED_RELATIONSHIP: {
				actorProducedRelationship actorProducedRelationship = (actorProducedRelationship)theEObject;
				T result = caseactorProducedRelationship(actorProducedRelationship);
				if (result == null) result = caseRelation(actorProducedRelationship);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			default: return defaultCase(theEObject);
		}
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Responsibility</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Responsibility</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseResponsibility(Responsibility object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Resource</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Resource</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseResource(Resource object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Actor</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Actor</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseActor(Actor object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Scenario</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Scenario</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseScenario(Scenario object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Entity</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Entity</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseEntity(Entity object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>resource Required Relationship</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>resource Required Relationship</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseresourceRequiredRelationship(resourceRequiredRelationship object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Relation</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Relation</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRelation(Relation object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>resource Produced Relationship</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>resource Produced Relationship</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseresourceProducedRelationship(resourceProducedRelationship object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>actor Required Relationship</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>actor Required Relationship</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseactorRequiredRelationship(actorRequiredRelationship object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>actor Holds Relationship</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>actor Holds Relationship</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseactorHoldsRelationship(actorHoldsRelationship object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>responsibility Required Relationship</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>responsibility Required Relationship</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseresponsibilityRequiredRelationship(responsibilityRequiredRelationship object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>actor Produced Relationship</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>actor Produced Relationship</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseactorProducedRelationship(actorProducedRelationship object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch, but this is the last case anyway.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject)
	 * @generated
	 */
	@Override
	public T defaultCase(EObject object) {
		return null;
	}

} //ResponsibilityMetaModelSwitch
