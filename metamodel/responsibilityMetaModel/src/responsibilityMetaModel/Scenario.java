/**
 */
package responsibilityMetaModel;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Scenario</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link responsibilityMetaModel.Scenario#getResources <em>Resources</em>}</li>
 *   <li>{@link responsibilityMetaModel.Scenario#getResponsibilities <em>Responsibilities</em>}</li>
 *   <li>{@link responsibilityMetaModel.Scenario#getActors <em>Actors</em>}</li>
 *   <li>{@link responsibilityMetaModel.Scenario#getRelations <em>Relations</em>}</li>
 * </ul>
 * </p>
 *
 * @see responsibilityMetaModel.ResponsibilityMetaModelPackage#getScenario()
 * @model
 * @generated
 */
public interface Scenario extends EObject {
	/**
	 * Returns the value of the '<em><b>Resources</b></em>' containment reference list.
	 * The list contents are of type {@link responsibilityMetaModel.Resource}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Resources</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Resources</em>' containment reference list.
	 * @see responsibilityMetaModel.ResponsibilityMetaModelPackage#getScenario_Resources()
	 * @model containment="true"
	 * @generated
	 */
	EList<Resource> getResources();

	/**
	 * Returns the value of the '<em><b>Responsibilities</b></em>' containment reference list.
	 * The list contents are of type {@link responsibilityMetaModel.Responsibility}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Responsibilities</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Responsibilities</em>' containment reference list.
	 * @see responsibilityMetaModel.ResponsibilityMetaModelPackage#getScenario_Responsibilities()
	 * @model containment="true"
	 * @generated
	 */
	EList<Responsibility> getResponsibilities();

	/**
	 * Returns the value of the '<em><b>Actors</b></em>' containment reference list.
	 * The list contents are of type {@link responsibilityMetaModel.Actor}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Actors</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Actors</em>' containment reference list.
	 * @see responsibilityMetaModel.ResponsibilityMetaModelPackage#getScenario_Actors()
	 * @model containment="true"
	 * @generated
	 */
	EList<Actor> getActors();

	/**
	 * Returns the value of the '<em><b>Relations</b></em>' containment reference list.
	 * The list contents are of type {@link responsibilityMetaModel.Relation}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Relations</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Relations</em>' containment reference list.
	 * @see responsibilityMetaModel.ResponsibilityMetaModelPackage#getScenario_Relations()
	 * @model containment="true"
	 * @generated
	 */
	EList<Relation> getRelations();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation" ordered="false"
	 * @generated
	 */
	EList<Entity> getEntities();

} // Scenario
