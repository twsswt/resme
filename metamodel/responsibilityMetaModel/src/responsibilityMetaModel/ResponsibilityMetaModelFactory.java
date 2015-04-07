/**
 */
package responsibilityMetaModel;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see responsibilityMetaModel.ResponsibilityMetaModelPackage
 * @generated
 */
public interface ResponsibilityMetaModelFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	ResponsibilityMetaModelFactory eINSTANCE = responsibilityMetaModel.impl.ResponsibilityMetaModelFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Responsibility</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Responsibility</em>'.
	 * @generated
	 */
	Responsibility createResponsibility();

	/**
	 * Returns a new object of class '<em>Resource</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Resource</em>'.
	 * @generated
	 */
	Resource createResource();

	/**
	 * Returns a new object of class '<em>Actor</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Actor</em>'.
	 * @generated
	 */
	Actor createActor();

	/**
	 * Returns a new object of class '<em>Scenario</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Scenario</em>'.
	 * @generated
	 */
	Scenario createScenario();

	/**
	 * Returns a new object of class '<em>resource Required Relationship</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>resource Required Relationship</em>'.
	 * @generated
	 */
	resourceRequiredRelationship createresourceRequiredRelationship();

	/**
	 * Returns a new object of class '<em>resource Produced Relationship</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>resource Produced Relationship</em>'.
	 * @generated
	 */
	resourceProducedRelationship createresourceProducedRelationship();

	/**
	 * Returns a new object of class '<em>actor Required Relationship</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>actor Required Relationship</em>'.
	 * @generated
	 */
	actorRequiredRelationship createactorRequiredRelationship();

	/**
	 * Returns a new object of class '<em>actor Holds Relationship</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>actor Holds Relationship</em>'.
	 * @generated
	 */
	actorHoldsRelationship createactorHoldsRelationship();

	/**
	 * Returns a new object of class '<em>responsibility Required Relationship</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>responsibility Required Relationship</em>'.
	 * @generated
	 */
	responsibilityRequiredRelationship createresponsibilityRequiredRelationship();

	/**
	 * Returns a new object of class '<em>actor Produced Relationship</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>actor Produced Relationship</em>'.
	 * @generated
	 */
	actorProducedRelationship createactorProducedRelationship();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	ResponsibilityMetaModelPackage getResponsibilityMetaModelPackage();

} //ResponsibilityMetaModelFactory
