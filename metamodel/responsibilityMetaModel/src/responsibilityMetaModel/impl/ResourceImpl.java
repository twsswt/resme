/**
 */
package responsibilityMetaModel.impl;

import java.lang.reflect.InvocationTargetException;
import java.util.Collection;
import java.util.HashSet;
import java.util.Set;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;
import org.eclipse.emf.ecore.util.EObjectWithInverseResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;

import responsibilityMetaModel.Actor;
import responsibilityMetaModel.Entity;
import responsibilityMetaModel.Resource;
import responsibilityMetaModel.Responsibility;
import responsibilityMetaModel.ResponsibilityMetaModelPackage;
import responsibilityMetaModel.resourceProducedRelationship;
import responsibilityMetaModel.resourceRequiredRelationship;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Resource</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link responsibilityMetaModel.impl.ResourceImpl#getName <em>Name</em>}</li>
 *   <li>{@link responsibilityMetaModel.impl.ResourceImpl#isEnabled <em>Enabled</em>}</li>
 *   <li>{@link responsibilityMetaModel.impl.ResourceImpl#isSatisfied <em>Satisfied</em>}</li>
 *   <li>{@link responsibilityMetaModel.impl.ResourceImpl#getSatisfactionCriteria <em>Satisfaction Criteria</em>}</li>
 *   <li>{@link responsibilityMetaModel.impl.ResourceImpl#isCritical <em>Critical</em>}</li>
 *   <li>{@link responsibilityMetaModel.impl.ResourceImpl#getCriticalityCount <em>Criticality Count</em>}</li>
 *   <li>{@link responsibilityMetaModel.impl.ResourceImpl#getRequiredBy <em>Required By</em>}</li>
 *   <li>{@link responsibilityMetaModel.impl.ResourceImpl#getProducedBy <em>Produced By</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ResourceImpl extends EObjectImpl implements Resource {
	/**
	 * The default value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected static final String NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected String name = NAME_EDEFAULT;

	/**
	 * The default value of the '{@link #isEnabled() <em>Enabled</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isEnabled()
	 * @generated
	 * @ordered
	 */
	protected static final boolean ENABLED_EDEFAULT = true;

	/**
	 * The cached value of the '{@link #isEnabled() <em>Enabled</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isEnabled()
	 * @generated
	 * @ordered
	 */
	protected boolean enabled = ENABLED_EDEFAULT;

	/**
	 * The default value of the '{@link #isSatisfied() <em>Satisfied</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSatisfied()
	 * @generated
	 * @ordered
	 */
	protected static final boolean SATISFIED_EDEFAULT = true;

	/**
	 * The cached value of the '{@link #isSatisfied() <em>Satisfied</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSatisfied()
	 * @generated
	 * @ordered
	 */
	protected boolean satisfied = SATISFIED_EDEFAULT;

	/**
	 * The default value of the '{@link #getSatisfactionCriteria() <em>Satisfaction Criteria</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSatisfactionCriteria()
	 * @generated
	 * @ordered
	 */
	protected static final String SATISFACTION_CRITERIA_EDEFAULT = "";

	/**
	 * The cached value of the '{@link #getSatisfactionCriteria() <em>Satisfaction Criteria</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSatisfactionCriteria()
	 * @generated
	 * @ordered
	 */
	protected String satisfactionCriteria = SATISFACTION_CRITERIA_EDEFAULT;

	/**
	 * The default value of the '{@link #isCritical() <em>Critical</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isCritical()
	 * @generated
	 * @ordered
	 */
	protected static final boolean CRITICAL_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isCritical() <em>Critical</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isCritical()
	 * @generated
	 * @ordered
	 */
	protected boolean critical = CRITICAL_EDEFAULT;

	/**
	 * The default value of the '{@link #getCriticalityCount() <em>Criticality Count</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCriticalityCount()
	 * @generated
	 * @ordered
	 */
	protected static final Integer CRITICALITY_COUNT_EDEFAULT = new Integer(0);

	/**
	 * The cached value of the '{@link #getCriticalityCount() <em>Criticality Count</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCriticalityCount()
	 * @generated
	 * @ordered
	 */
	protected Integer criticalityCount = CRITICALITY_COUNT_EDEFAULT;

	/**
	 * The cached value of the '{@link #getRequiredBy() <em>Required By</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRequiredBy()
	 * @generated
	 * @ordered
	 */
	protected EList<resourceRequiredRelationship> requiredBy;

	/**
	 * The cached value of the '{@link #getProducedBy() <em>Produced By</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProducedBy()
	 * @generated
	 * @ordered
	 */
	protected EList<resourceProducedRelationship> producedBy;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ResourceImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ResponsibilityMetaModelPackage.Literals.RESOURCE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getName() {
		return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setName(String newName) {
		String oldName = name;
		name = newName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ResponsibilityMetaModelPackage.RESOURCE__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isEnabled() {
		return enabled;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEnabled(boolean newEnabled) {
		boolean oldEnabled = enabled;
		enabled = newEnabled;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ResponsibilityMetaModelPackage.RESOURCE__ENABLED, oldEnabled, enabled));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSatisfied() {
		return satisfied;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSatisfied(boolean newSatisfied) {
		boolean oldSatisfied = satisfied;
		satisfied = newSatisfied;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ResponsibilityMetaModelPackage.RESOURCE__SATISFIED, oldSatisfied, satisfied));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getSatisfactionCriteria() {
		return satisfactionCriteria;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSatisfactionCriteria(String newSatisfactionCriteria) {
		String oldSatisfactionCriteria = satisfactionCriteria;
		satisfactionCriteria = newSatisfactionCriteria;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ResponsibilityMetaModelPackage.RESOURCE__SATISFACTION_CRITERIA, oldSatisfactionCriteria, satisfactionCriteria));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isCritical() {
		return critical;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCritical(boolean newCritical) {
		boolean oldCritical = critical;
		critical = newCritical;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ResponsibilityMetaModelPackage.RESOURCE__CRITICAL, oldCritical, critical));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Integer getCriticalityCount() {
		return criticalityCount;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCriticalityCount(Integer newCriticalityCount) {
		Integer oldCriticalityCount = criticalityCount;
		criticalityCount = newCriticalityCount;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ResponsibilityMetaModelPackage.RESOURCE__CRITICALITY_COUNT, oldCriticalityCount, criticalityCount));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<resourceRequiredRelationship> getRequiredBy() {
		if (requiredBy == null) {
			requiredBy = new EObjectWithInverseResolvingEList<resourceRequiredRelationship>(resourceRequiredRelationship.class, this, ResponsibilityMetaModelPackage.RESOURCE__REQUIRED_BY, ResponsibilityMetaModelPackage.RESOURCE_REQUIRED_RELATIONSHIP__RESOURCE);
		}
		return requiredBy;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<resourceProducedRelationship> getProducedBy() {
		if (producedBy == null) {
			producedBy = new EObjectWithInverseResolvingEList<resourceProducedRelationship>(resourceProducedRelationship.class, this, ResponsibilityMetaModelPackage.RESOURCE__PRODUCED_BY, ResponsibilityMetaModelPackage.RESOURCE_PRODUCED_RELATIONSHIP__RESOURCE);
		}
		return producedBy;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 */
	public boolean satisfied() {

		//Resources are satisfied if they are enabled and produced
		for (resourceProducedRelationship r : this.producedBy){
			if (r.getResponsibility().isSatisfied()){
				satisfied = this.isEnabled();
				return this.isEnabled(); //we have found a satisfied producer
			}
		}
		satisfied = false;
		return false; //if no valid producers found, resource not satisfied
	}

	@Override
	public RelianceHelper reliesOn(EList<Entity> visited, EList<Actor> depends){

		//If not already visited, traverse
		for (resourceProducedRelationship r: producedBy){
			if (r.getResponsibility().isEnabled()){
				if (!visited.contains(r.getResponsibility())){
					visited.add(r.getResponsibility());
					depends = r.getResponsibility().reliesOn(visited, depends).depends; //Update
				}
			}
		}
		return new RelianceHelper(visited, depends);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ResponsibilityMetaModelPackage.RESOURCE__REQUIRED_BY:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getRequiredBy()).basicAdd(otherEnd, msgs);
			case ResponsibilityMetaModelPackage.RESOURCE__PRODUCED_BY:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getProducedBy()).basicAdd(otherEnd, msgs);
		}
		return super.eInverseAdd(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ResponsibilityMetaModelPackage.RESOURCE__REQUIRED_BY:
				return ((InternalEList<?>)getRequiredBy()).basicRemove(otherEnd, msgs);
			case ResponsibilityMetaModelPackage.RESOURCE__PRODUCED_BY:
				return ((InternalEList<?>)getProducedBy()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case ResponsibilityMetaModelPackage.RESOURCE__NAME:
				return getName();
			case ResponsibilityMetaModelPackage.RESOURCE__ENABLED:
				return isEnabled();
			case ResponsibilityMetaModelPackage.RESOURCE__SATISFIED:
				return isSatisfied();
			case ResponsibilityMetaModelPackage.RESOURCE__SATISFACTION_CRITERIA:
				return getSatisfactionCriteria();
			case ResponsibilityMetaModelPackage.RESOURCE__CRITICAL:
				return isCritical();
			case ResponsibilityMetaModelPackage.RESOURCE__CRITICALITY_COUNT:
				return getCriticalityCount();
			case ResponsibilityMetaModelPackage.RESOURCE__REQUIRED_BY:
				return getRequiredBy();
			case ResponsibilityMetaModelPackage.RESOURCE__PRODUCED_BY:
				return getProducedBy();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case ResponsibilityMetaModelPackage.RESOURCE__NAME:
				setName((String)newValue);
				return;
			case ResponsibilityMetaModelPackage.RESOURCE__ENABLED:
				setEnabled((Boolean)newValue);
				return;
			case ResponsibilityMetaModelPackage.RESOURCE__SATISFIED:
				setSatisfied((Boolean)newValue);
				return;
			case ResponsibilityMetaModelPackage.RESOURCE__SATISFACTION_CRITERIA:
				setSatisfactionCriteria((String)newValue);
				return;
			case ResponsibilityMetaModelPackage.RESOURCE__CRITICAL:
				setCritical((Boolean)newValue);
				return;
			case ResponsibilityMetaModelPackage.RESOURCE__CRITICALITY_COUNT:
				setCriticalityCount((Integer)newValue);
				return;
			case ResponsibilityMetaModelPackage.RESOURCE__REQUIRED_BY:
				getRequiredBy().clear();
				getRequiredBy().addAll((Collection<? extends resourceRequiredRelationship>)newValue);
				return;
			case ResponsibilityMetaModelPackage.RESOURCE__PRODUCED_BY:
				getProducedBy().clear();
				getProducedBy().addAll((Collection<? extends resourceProducedRelationship>)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case ResponsibilityMetaModelPackage.RESOURCE__NAME:
				setName(NAME_EDEFAULT);
				return;
			case ResponsibilityMetaModelPackage.RESOURCE__ENABLED:
				setEnabled(ENABLED_EDEFAULT);
				return;
			case ResponsibilityMetaModelPackage.RESOURCE__SATISFIED:
				setSatisfied(SATISFIED_EDEFAULT);
				return;
			case ResponsibilityMetaModelPackage.RESOURCE__SATISFACTION_CRITERIA:
				setSatisfactionCriteria(SATISFACTION_CRITERIA_EDEFAULT);
				return;
			case ResponsibilityMetaModelPackage.RESOURCE__CRITICAL:
				setCritical(CRITICAL_EDEFAULT);
				return;
			case ResponsibilityMetaModelPackage.RESOURCE__CRITICALITY_COUNT:
				setCriticalityCount(CRITICALITY_COUNT_EDEFAULT);
				return;
			case ResponsibilityMetaModelPackage.RESOURCE__REQUIRED_BY:
				getRequiredBy().clear();
				return;
			case ResponsibilityMetaModelPackage.RESOURCE__PRODUCED_BY:
				getProducedBy().clear();
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case ResponsibilityMetaModelPackage.RESOURCE__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case ResponsibilityMetaModelPackage.RESOURCE__ENABLED:
				return enabled != ENABLED_EDEFAULT;
			case ResponsibilityMetaModelPackage.RESOURCE__SATISFIED:
				return satisfied != SATISFIED_EDEFAULT;
			case ResponsibilityMetaModelPackage.RESOURCE__SATISFACTION_CRITERIA:
				return SATISFACTION_CRITERIA_EDEFAULT == null ? satisfactionCriteria != null : !SATISFACTION_CRITERIA_EDEFAULT.equals(satisfactionCriteria);
			case ResponsibilityMetaModelPackage.RESOURCE__CRITICAL:
				return critical != CRITICAL_EDEFAULT;
			case ResponsibilityMetaModelPackage.RESOURCE__CRITICALITY_COUNT:
				return CRITICALITY_COUNT_EDEFAULT == null ? criticalityCount != null : !CRITICALITY_COUNT_EDEFAULT.equals(criticalityCount);
			case ResponsibilityMetaModelPackage.RESOURCE__REQUIRED_BY:
				return requiredBy != null && !requiredBy.isEmpty();
			case ResponsibilityMetaModelPackage.RESOURCE__PRODUCED_BY:
				return producedBy != null && !producedBy.isEmpty();
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (name: ");
		result.append(name);
		result.append(", enabled: ");
		result.append(enabled);
		result.append(", satisfied: ");
		result.append(satisfied);
		result.append(", satisfactionCriteria: ");
		result.append(satisfactionCriteria);
		result.append(", critical: ");
		result.append(critical);
		result.append(", criticalityCount: ");
		result.append(criticalityCount);
		result.append(')');
		return result.toString();
	}

	@Override
	public CriticalityHelper criticalityAnalysis(EList<Entity> visited,
			EList<Responsibility> resps, boolean flag) {

		//For resource, follow any consumption

		for (resourceRequiredRelationship r : requiredBy){
			if (r.getResponsibility().isEnabled()){
				if (!visited.contains(r.getResponsibility())){
					visited.add(r.getResponsibility());
					resps.addAll(r.getResponsibility().criticalityAnalysis(visited, resps, false).resps); //Update
				}
			}
		}

		if (flag==true && enabled){
			//Terrible duplicate removal
			Set<Responsibility> x = new HashSet<Responsibility>(resps);
			criticalityCount = x.size();
		}
		return new CriticalityHelper(visited, resps);

	}

} //ResourceImpl
