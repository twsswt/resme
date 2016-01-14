/**
 */
package responsibilityMetaModel;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;

import responsibilityMetaModel.impl.CriticalityHelper;
import responsibilityMetaModel.impl.RelianceHelper;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Entity</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link responsibilityMetaModel.Entity#getName <em>Name</em>}</li>
 *   <li>{@link responsibilityMetaModel.Entity#isEnabled <em>Enabled</em>}</li>
 *   <li>{@link responsibilityMetaModel.Entity#isSatisfied <em>Satisfied</em>}</li>
 *   <li>{@link responsibilityMetaModel.Entity#getSatisfactionCriteria <em>Satisfaction Criteria</em>}</li>
 *   <li>{@link responsibilityMetaModel.Entity#isCritical <em>Critical</em>}</li>
 *   <li>{@link responsibilityMetaModel.Entity#getCriticalityCount <em>Criticality Count</em>}</li>
 * </ul>
 *
 * @see responsibilityMetaModel.ResponsibilityMetaModelPackage#getEntity()
 * @model interface="true" abstract="true"
 * @generated
 */
public interface Entity extends EObject {
	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see responsibilityMetaModel.ResponsibilityMetaModelPackage#getEntity_Name()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link responsibilityMetaModel.Entity#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Enabled</b></em>' attribute.
	 * The default value is <code>"true"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Enabled</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Enabled</em>' attribute.
	 * @see #setEnabled(boolean)
	 * @see responsibilityMetaModel.ResponsibilityMetaModelPackage#getEntity_Enabled()
	 * @model default="true" dataType="org.eclipse.emf.ecore.xml.type.Boolean"
	 * @generated
	 */
	boolean isEnabled();

	/**
	 * Sets the value of the '{@link responsibilityMetaModel.Entity#isEnabled <em>Enabled</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Enabled</em>' attribute.
	 * @see #isEnabled()
	 * @generated
	 */
	void setEnabled(boolean value);

	/**
	 * Returns the value of the '<em><b>Satisfied</b></em>' attribute.
	 * The default value is <code>"true"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Satisfied</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Satisfied</em>' attribute.
	 * @see #setSatisfied(boolean)
	 * @see responsibilityMetaModel.ResponsibilityMetaModelPackage#getEntity_Satisfied()
	 * @model default="true" dataType="org.eclipse.emf.ecore.xml.type.Boolean"
	 * @generated
	 */
	boolean isSatisfied();

	/**
	 * Sets the value of the '{@link responsibilityMetaModel.Entity#isSatisfied <em>Satisfied</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Satisfied</em>' attribute.
	 * @see #isSatisfied()
	 * @generated
	 */
	void setSatisfied(boolean value);

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
	 * @see responsibilityMetaModel.ResponsibilityMetaModelPackage#getEntity_SatisfactionCriteria()
	 * @model default="" dataType="org.eclipse.emf.ecore.xml.type.String"
	 * @generated
	 */
	String getSatisfactionCriteria();

	/**
	 * Sets the value of the '{@link responsibilityMetaModel.Entity#getSatisfactionCriteria <em>Satisfaction Criteria</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Satisfaction Criteria</em>' attribute.
	 * @see #getSatisfactionCriteria()
	 * @generated
	 */
	void setSatisfactionCriteria(String value);

	/**
	 * Returns the value of the '<em><b>Critical</b></em>' attribute.
	 * The default value is <code>"false"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Critical</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Critical</em>' attribute.
	 * @see #setCritical(boolean)
	 * @see responsibilityMetaModel.ResponsibilityMetaModelPackage#getEntity_Critical()
	 * @model default="false" dataType="org.eclipse.emf.ecore.xml.type.Boolean"
	 * @generated
	 */
	boolean isCritical();

	/**
	 * Sets the value of the '{@link responsibilityMetaModel.Entity#isCritical <em>Critical</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Critical</em>' attribute.
	 * @see #isCritical()
	 * @generated
	 */
	void setCritical(boolean value);

	/**
	 * Returns the value of the '<em><b>Criticality Count</b></em>' attribute.
	 * The default value is <code>"0"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Criticality Count</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Criticality Count</em>' attribute.
	 * @see #setCriticalityCount(Integer)
	 * @see responsibilityMetaModel.ResponsibilityMetaModelPackage#getEntity_CriticalityCount()
	 * @model default="0" dataType="org.eclipse.emf.ecore.xml.type.IntObject"
	 * @generated
	 */
	Integer getCriticalityCount();

	/**
	 * Sets the value of the '{@link responsibilityMetaModel.Entity#getCriticalityCount <em>Criticality Count</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Criticality Count</em>' attribute.
	 * @see #getCriticalityCount()
	 * @generated
	 */
	void setCriticalityCount(Integer value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model dataType="org.eclipse.emf.ecore.xml.type.Boolean"
	 * @generated
	 */
	boolean satisfied();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model dataType="org.eclipse.emf.ecore.xml.type.AnySimpleType" ordered="false"
	 * @generated not
	 */
	RelianceHelper reliesOn(EList<Entity> visited, EList<Actor> depends);
	
	/**
	 * @generated not
	 */
	CriticalityHelper criticalityAnalysis(EList<Entity> visited, EList<Responsibility> resps, boolean flag);

} // Entity
