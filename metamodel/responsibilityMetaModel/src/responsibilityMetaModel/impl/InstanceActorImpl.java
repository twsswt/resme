/**
 */
package responsibilityMetaModel.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

import org.eclipse.emf.ecore.util.EObjectWithInverseResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;

import responsibilityMetaModel.Actor;
import responsibilityMetaModel.Entity;
import responsibilityMetaModel.InstanceActor;
import responsibilityMetaModel.Responsibility;
import responsibilityMetaModel.ResponsibilityMetaModelPackage;
import responsibilityMetaModel.actorRealisationRelationship;
import responsibilityMetaModel.attributionRelationship;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Instance Actor</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link responsibilityMetaModel.impl.InstanceActorImpl#getName <em>Name</em>}</li>
 *   <li>{@link responsibilityMetaModel.impl.InstanceActorImpl#isEnabled <em>Enabled</em>}</li>
 *   <li>{@link responsibilityMetaModel.impl.InstanceActorImpl#isSatisfied <em>Satisfied</em>}</li>
 *   <li>{@link responsibilityMetaModel.impl.InstanceActorImpl#getSatisfactionCriteria <em>Satisfaction Criteria</em>}</li>
 *   <li>{@link responsibilityMetaModel.impl.InstanceActorImpl#isCritical <em>Critical</em>}</li>
 *   <li>{@link responsibilityMetaModel.impl.InstanceActorImpl#getCriticalityCount <em>Criticality Count</em>}</li>
 *   <li>{@link responsibilityMetaModel.impl.InstanceActorImpl#getReferencedBy <em>Referenced By</em>}</li>
 *   <li>{@link responsibilityMetaModel.impl.InstanceActorImpl#getRealises <em>Realises</em>}</li>
 * </ul>
 *
 * @generated
 */
public class InstanceActorImpl extends EObjectImpl implements InstanceActor {
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
	 * The cached value of the '{@link #getReferencedBy() <em>Referenced By</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReferencedBy()
	 * @generated
	 * @ordered
	 */
	protected EList<attributionRelationship> referencedBy;

	/**
	 * The cached value of the '{@link #getRealises() <em>Realises</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRealises()
	 * @generated
	 * @ordered
	 */
	protected EList<actorRealisationRelationship> realises;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected InstanceActorImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ResponsibilityMetaModelPackage.Literals.INSTANCE_ACTOR;
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
			eNotify(new ENotificationImpl(this, Notification.SET, ResponsibilityMetaModelPackage.INSTANCE_ACTOR__NAME, oldName, name));
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
			eNotify(new ENotificationImpl(this, Notification.SET, ResponsibilityMetaModelPackage.INSTANCE_ACTOR__ENABLED, oldEnabled, enabled));
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
			eNotify(new ENotificationImpl(this, Notification.SET, ResponsibilityMetaModelPackage.INSTANCE_ACTOR__SATISFIED, oldSatisfied, satisfied));
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
			eNotify(new ENotificationImpl(this, Notification.SET, ResponsibilityMetaModelPackage.INSTANCE_ACTOR__SATISFACTION_CRITERIA, oldSatisfactionCriteria, satisfactionCriteria));
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
			eNotify(new ENotificationImpl(this, Notification.SET, ResponsibilityMetaModelPackage.INSTANCE_ACTOR__CRITICAL, oldCritical, critical));
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
			eNotify(new ENotificationImpl(this, Notification.SET, ResponsibilityMetaModelPackage.INSTANCE_ACTOR__CRITICALITY_COUNT, oldCriticalityCount, criticalityCount));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<attributionRelationship> getReferencedBy() {
		if (referencedBy == null) {
			referencedBy = new EObjectWithInverseResolvingEList<attributionRelationship>(attributionRelationship.class, this, ResponsibilityMetaModelPackage.INSTANCE_ACTOR__REFERENCED_BY, ResponsibilityMetaModelPackage.ATTRIBUTION_RELATIONSHIP__ENTITY);
		}
		return referencedBy;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<actorRealisationRelationship> getRealises() {
		if (realises == null) {
			realises = new EObjectWithInverseResolvingEList<actorRealisationRelationship>(actorRealisationRelationship.class, this, ResponsibilityMetaModelPackage.INSTANCE_ACTOR__REALISES, ResponsibilityMetaModelPackage.ACTOR_REALISATION_RELATIONSHIP__INSTANCEACTOR);
		}
		return realises;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean satisfied() {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<InstanceActor> reliance() {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
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
			case ResponsibilityMetaModelPackage.INSTANCE_ACTOR__REFERENCED_BY:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getReferencedBy()).basicAdd(otherEnd, msgs);
			case ResponsibilityMetaModelPackage.INSTANCE_ACTOR__REALISES:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getRealises()).basicAdd(otherEnd, msgs);
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
			case ResponsibilityMetaModelPackage.INSTANCE_ACTOR__REFERENCED_BY:
				return ((InternalEList<?>)getReferencedBy()).basicRemove(otherEnd, msgs);
			case ResponsibilityMetaModelPackage.INSTANCE_ACTOR__REALISES:
				return ((InternalEList<?>)getRealises()).basicRemove(otherEnd, msgs);
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
			case ResponsibilityMetaModelPackage.INSTANCE_ACTOR__NAME:
				return getName();
			case ResponsibilityMetaModelPackage.INSTANCE_ACTOR__ENABLED:
				return isEnabled();
			case ResponsibilityMetaModelPackage.INSTANCE_ACTOR__SATISFIED:
				return isSatisfied();
			case ResponsibilityMetaModelPackage.INSTANCE_ACTOR__SATISFACTION_CRITERIA:
				return getSatisfactionCriteria();
			case ResponsibilityMetaModelPackage.INSTANCE_ACTOR__CRITICAL:
				return isCritical();
			case ResponsibilityMetaModelPackage.INSTANCE_ACTOR__CRITICALITY_COUNT:
				return getCriticalityCount();
			case ResponsibilityMetaModelPackage.INSTANCE_ACTOR__REFERENCED_BY:
				return getReferencedBy();
			case ResponsibilityMetaModelPackage.INSTANCE_ACTOR__REALISES:
				return getRealises();
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
			case ResponsibilityMetaModelPackage.INSTANCE_ACTOR__NAME:
				setName((String)newValue);
				return;
			case ResponsibilityMetaModelPackage.INSTANCE_ACTOR__ENABLED:
				setEnabled((Boolean)newValue);
				return;
			case ResponsibilityMetaModelPackage.INSTANCE_ACTOR__SATISFIED:
				setSatisfied((Boolean)newValue);
				return;
			case ResponsibilityMetaModelPackage.INSTANCE_ACTOR__SATISFACTION_CRITERIA:
				setSatisfactionCriteria((String)newValue);
				return;
			case ResponsibilityMetaModelPackage.INSTANCE_ACTOR__CRITICAL:
				setCritical((Boolean)newValue);
				return;
			case ResponsibilityMetaModelPackage.INSTANCE_ACTOR__CRITICALITY_COUNT:
				setCriticalityCount((Integer)newValue);
				return;
			case ResponsibilityMetaModelPackage.INSTANCE_ACTOR__REFERENCED_BY:
				getReferencedBy().clear();
				getReferencedBy().addAll((Collection<? extends attributionRelationship>)newValue);
				return;
			case ResponsibilityMetaModelPackage.INSTANCE_ACTOR__REALISES:
				getRealises().clear();
				getRealises().addAll((Collection<? extends actorRealisationRelationship>)newValue);
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
			case ResponsibilityMetaModelPackage.INSTANCE_ACTOR__NAME:
				setName(NAME_EDEFAULT);
				return;
			case ResponsibilityMetaModelPackage.INSTANCE_ACTOR__ENABLED:
				setEnabled(ENABLED_EDEFAULT);
				return;
			case ResponsibilityMetaModelPackage.INSTANCE_ACTOR__SATISFIED:
				setSatisfied(SATISFIED_EDEFAULT);
				return;
			case ResponsibilityMetaModelPackage.INSTANCE_ACTOR__SATISFACTION_CRITERIA:
				setSatisfactionCriteria(SATISFACTION_CRITERIA_EDEFAULT);
				return;
			case ResponsibilityMetaModelPackage.INSTANCE_ACTOR__CRITICAL:
				setCritical(CRITICAL_EDEFAULT);
				return;
			case ResponsibilityMetaModelPackage.INSTANCE_ACTOR__CRITICALITY_COUNT:
				setCriticalityCount(CRITICALITY_COUNT_EDEFAULT);
				return;
			case ResponsibilityMetaModelPackage.INSTANCE_ACTOR__REFERENCED_BY:
				getReferencedBy().clear();
				return;
			case ResponsibilityMetaModelPackage.INSTANCE_ACTOR__REALISES:
				getRealises().clear();
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
			case ResponsibilityMetaModelPackage.INSTANCE_ACTOR__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case ResponsibilityMetaModelPackage.INSTANCE_ACTOR__ENABLED:
				return enabled != ENABLED_EDEFAULT;
			case ResponsibilityMetaModelPackage.INSTANCE_ACTOR__SATISFIED:
				return satisfied != SATISFIED_EDEFAULT;
			case ResponsibilityMetaModelPackage.INSTANCE_ACTOR__SATISFACTION_CRITERIA:
				return SATISFACTION_CRITERIA_EDEFAULT == null ? satisfactionCriteria != null : !SATISFACTION_CRITERIA_EDEFAULT.equals(satisfactionCriteria);
			case ResponsibilityMetaModelPackage.INSTANCE_ACTOR__CRITICAL:
				return critical != CRITICAL_EDEFAULT;
			case ResponsibilityMetaModelPackage.INSTANCE_ACTOR__CRITICALITY_COUNT:
				return CRITICALITY_COUNT_EDEFAULT == null ? criticalityCount != null : !CRITICALITY_COUNT_EDEFAULT.equals(criticalityCount);
			case ResponsibilityMetaModelPackage.INSTANCE_ACTOR__REFERENCED_BY:
				return referencedBy != null && !referencedBy.isEmpty();
			case ResponsibilityMetaModelPackage.INSTANCE_ACTOR__REALISES:
				return realises != null && !realises.isEmpty();
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
	public RelianceHelper reliesOn(EList<Entity> visited, EList<Actor> depends) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public CriticalityHelper criticalityAnalysis(EList<Entity> visited, EList<Responsibility> resps, boolean flag) {
		// TODO Auto-generated method stub
		return null;
	}

} //InstanceActorImpl
