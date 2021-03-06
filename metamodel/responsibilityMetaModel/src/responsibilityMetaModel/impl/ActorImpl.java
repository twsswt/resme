/**
 */
package responsibilityMetaModel.impl;

import java.lang.reflect.InvocationTargetException;
import java.util.Collection;
import java.util.HashSet;
import java.util.Set;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.BasicEList;
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
import responsibilityMetaModel.Responsibility;
import responsibilityMetaModel.ResponsibilityMetaModelPackage;
import responsibilityMetaModel.actorHoldsRelationship;
import responsibilityMetaModel.actorProducedRelationship;
import responsibilityMetaModel.actorRealisationRelationship;
import responsibilityMetaModel.actorRequiredRelationship;
import responsibilityMetaModel.attributionRelationship;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Actor</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link responsibilityMetaModel.impl.ActorImpl#getName <em>Name</em>}</li>
 *   <li>{@link responsibilityMetaModel.impl.ActorImpl#isEnabled <em>Enabled</em>}</li>
 *   <li>{@link responsibilityMetaModel.impl.ActorImpl#isSatisfied <em>Satisfied</em>}</li>
 *   <li>{@link responsibilityMetaModel.impl.ActorImpl#getSatisfactionCriteria <em>Satisfaction Criteria</em>}</li>
 *   <li>{@link responsibilityMetaModel.impl.ActorImpl#isCritical <em>Critical</em>}</li>
 *   <li>{@link responsibilityMetaModel.impl.ActorImpl#getCriticalityCount <em>Criticality Count</em>}</li>
 *   <li>{@link responsibilityMetaModel.impl.ActorImpl#getReferencedBy <em>Referenced By</em>}</li>
 *   <li>{@link responsibilityMetaModel.impl.ActorImpl#getRequiredBy <em>Required By</em>}</li>
 *   <li>{@link responsibilityMetaModel.impl.ActorImpl#getHeldResponsibility <em>Held Responsibility</em>}</li>
 *   <li>{@link responsibilityMetaModel.impl.ActorImpl#getProducedBy <em>Produced By</em>}</li>
 *   <li>{@link responsibilityMetaModel.impl.ActorImpl#getRealisedBy <em>Realised By</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ActorImpl extends EObjectImpl implements Actor {
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
	 * The cached value of the '{@link #getRequiredBy() <em>Required By</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRequiredBy()
	 * @generated
	 * @ordered
	 */
	protected EList<actorRequiredRelationship> requiredBy;

	/**
	 * The cached value of the '{@link #getHeldResponsibility() <em>Held Responsibility</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHeldResponsibility()
	 * @generated
	 * @ordered
	 */
	protected EList<actorHoldsRelationship> heldResponsibility;

	/**
	 * The cached value of the '{@link #getProducedBy() <em>Produced By</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProducedBy()
	 * @generated
	 * @ordered
	 */
	protected EList<actorProducedRelationship> producedBy;

	/**
	 * The cached value of the '{@link #getRealisedBy() <em>Realised By</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRealisedBy()
	 * @generated
	 * @ordered
	 */
	protected EList<actorRealisationRelationship> realisedBy;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ActorImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ResponsibilityMetaModelPackage.Literals.ACTOR;
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
			eNotify(new ENotificationImpl(this, Notification.SET, ResponsibilityMetaModelPackage.ACTOR__NAME, oldName, name));
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
			eNotify(new ENotificationImpl(this, Notification.SET, ResponsibilityMetaModelPackage.ACTOR__ENABLED, oldEnabled, enabled));
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
			eNotify(new ENotificationImpl(this, Notification.SET, ResponsibilityMetaModelPackage.ACTOR__SATISFIED, oldSatisfied, satisfied));
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
			eNotify(new ENotificationImpl(this, Notification.SET, ResponsibilityMetaModelPackage.ACTOR__SATISFACTION_CRITERIA, oldSatisfactionCriteria, satisfactionCriteria));
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
			eNotify(new ENotificationImpl(this, Notification.SET, ResponsibilityMetaModelPackage.ACTOR__CRITICAL, oldCritical, critical));
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
			eNotify(new ENotificationImpl(this, Notification.SET, ResponsibilityMetaModelPackage.ACTOR__CRITICALITY_COUNT, oldCriticalityCount, criticalityCount));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<attributionRelationship> getReferencedBy() {
		if (referencedBy == null) {
			referencedBy = new EObjectWithInverseResolvingEList<attributionRelationship>(attributionRelationship.class, this, ResponsibilityMetaModelPackage.ACTOR__REFERENCED_BY, ResponsibilityMetaModelPackage.ATTRIBUTION_RELATIONSHIP__ENTITY);
		}
		return referencedBy;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<actorRequiredRelationship> getRequiredBy() {
		if (requiredBy == null) {
			requiredBy = new EObjectWithInverseResolvingEList<actorRequiredRelationship>(actorRequiredRelationship.class, this, ResponsibilityMetaModelPackage.ACTOR__REQUIRED_BY, ResponsibilityMetaModelPackage.ACTOR_REQUIRED_RELATIONSHIP__ACTOR);
		}
		return requiredBy;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<actorHoldsRelationship> getHeldResponsibility() {
		if (heldResponsibility == null) {
			heldResponsibility = new EObjectWithInverseResolvingEList<actorHoldsRelationship>(actorHoldsRelationship.class, this, ResponsibilityMetaModelPackage.ACTOR__HELD_RESPONSIBILITY, ResponsibilityMetaModelPackage.ACTOR_HOLDS_RELATIONSHIP__ACTOR);
		}
		return heldResponsibility;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<actorProducedRelationship> getProducedBy() {
		if (producedBy == null) {
			producedBy = new EObjectWithInverseResolvingEList<actorProducedRelationship>(actorProducedRelationship.class, this, ResponsibilityMetaModelPackage.ACTOR__PRODUCED_BY, ResponsibilityMetaModelPackage.ACTOR_PRODUCED_RELATIONSHIP__ACTOR);
		}
		return producedBy;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<actorRealisationRelationship> getRealisedBy() {
		if (realisedBy == null) {
			realisedBy = new EObjectWithInverseResolvingEList<actorRealisationRelationship>(actorRealisationRelationship.class, this, ResponsibilityMetaModelPackage.ACTOR__REALISED_BY, ResponsibilityMetaModelPackage.ACTOR_REALISATION_RELATIONSHIP__ACTOR);
		}
		return realisedBy;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 */
	public boolean satisfied() {
		//Actors are satisfied as long as they are enabled, unless they are produced
		satisfied = isEnabled();
		if (getProducedBy().size()==0){
		}
		else{
			for (actorProducedRelationship a : producedBy){
				if (a.getResponsibility().satisfied()){ //Hopefully this will not cause cycles
					continue;
				}
				else{
					satisfied = false;
					break;
				}
			}
		}
		return satisfied;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 */
	public EList<Actor> reliance() {
		EList<Entity> visited = new BasicEList<Entity>();
		EList<Actor> depends = new BasicEList<Actor>();

		EList<Actor> val = reliesOn(visited, depends).depends;
		val.remove(this);
		return val;

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 */
	@Override
	public RelianceHelper reliesOn(EList<Entity> visited, EList<Actor> depends){

		//If not already visited, traverse
		for (actorHoldsRelationship a: heldResponsibility){
			if (a.getResponsibility().isEnabled()){
				if (!visited.contains(a.getResponsibility())){ //If not visited, traverse
					visited.add(a.getResponsibility());
					depends = a.getResponsibility().reliesOn(visited, depends).depends; //Update
				}
			}
		}
		return new RelianceHelper(visited, depends);
	}

	@Override
	public CriticalityHelper criticalityAnalysis(EList<Entity> visited,
			EList<Responsibility> resps, boolean flag) {

		//For actor, follow any required

		for (actorRequiredRelationship r : requiredBy){
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

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ResponsibilityMetaModelPackage.ACTOR__REFERENCED_BY:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getReferencedBy()).basicAdd(otherEnd, msgs);
			case ResponsibilityMetaModelPackage.ACTOR__REQUIRED_BY:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getRequiredBy()).basicAdd(otherEnd, msgs);
			case ResponsibilityMetaModelPackage.ACTOR__HELD_RESPONSIBILITY:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getHeldResponsibility()).basicAdd(otherEnd, msgs);
			case ResponsibilityMetaModelPackage.ACTOR__PRODUCED_BY:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getProducedBy()).basicAdd(otherEnd, msgs);
			case ResponsibilityMetaModelPackage.ACTOR__REALISED_BY:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getRealisedBy()).basicAdd(otherEnd, msgs);
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
			case ResponsibilityMetaModelPackage.ACTOR__REFERENCED_BY:
				return ((InternalEList<?>)getReferencedBy()).basicRemove(otherEnd, msgs);
			case ResponsibilityMetaModelPackage.ACTOR__REQUIRED_BY:
				return ((InternalEList<?>)getRequiredBy()).basicRemove(otherEnd, msgs);
			case ResponsibilityMetaModelPackage.ACTOR__HELD_RESPONSIBILITY:
				return ((InternalEList<?>)getHeldResponsibility()).basicRemove(otherEnd, msgs);
			case ResponsibilityMetaModelPackage.ACTOR__PRODUCED_BY:
				return ((InternalEList<?>)getProducedBy()).basicRemove(otherEnd, msgs);
			case ResponsibilityMetaModelPackage.ACTOR__REALISED_BY:
				return ((InternalEList<?>)getRealisedBy()).basicRemove(otherEnd, msgs);
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
			case ResponsibilityMetaModelPackage.ACTOR__NAME:
				return getName();
			case ResponsibilityMetaModelPackage.ACTOR__ENABLED:
				return isEnabled();
			case ResponsibilityMetaModelPackage.ACTOR__SATISFIED:
				return isSatisfied();
			case ResponsibilityMetaModelPackage.ACTOR__SATISFACTION_CRITERIA:
				return getSatisfactionCriteria();
			case ResponsibilityMetaModelPackage.ACTOR__CRITICAL:
				return isCritical();
			case ResponsibilityMetaModelPackage.ACTOR__CRITICALITY_COUNT:
				return getCriticalityCount();
			case ResponsibilityMetaModelPackage.ACTOR__REFERENCED_BY:
				return getReferencedBy();
			case ResponsibilityMetaModelPackage.ACTOR__REQUIRED_BY:
				return getRequiredBy();
			case ResponsibilityMetaModelPackage.ACTOR__HELD_RESPONSIBILITY:
				return getHeldResponsibility();
			case ResponsibilityMetaModelPackage.ACTOR__PRODUCED_BY:
				return getProducedBy();
			case ResponsibilityMetaModelPackage.ACTOR__REALISED_BY:
				return getRealisedBy();
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
			case ResponsibilityMetaModelPackage.ACTOR__NAME:
				setName((String)newValue);
				return;
			case ResponsibilityMetaModelPackage.ACTOR__ENABLED:
				setEnabled((Boolean)newValue);
				return;
			case ResponsibilityMetaModelPackage.ACTOR__SATISFIED:
				setSatisfied((Boolean)newValue);
				return;
			case ResponsibilityMetaModelPackage.ACTOR__SATISFACTION_CRITERIA:
				setSatisfactionCriteria((String)newValue);
				return;
			case ResponsibilityMetaModelPackage.ACTOR__CRITICAL:
				setCritical((Boolean)newValue);
				return;
			case ResponsibilityMetaModelPackage.ACTOR__CRITICALITY_COUNT:
				setCriticalityCount((Integer)newValue);
				return;
			case ResponsibilityMetaModelPackage.ACTOR__REFERENCED_BY:
				getReferencedBy().clear();
				getReferencedBy().addAll((Collection<? extends attributionRelationship>)newValue);
				return;
			case ResponsibilityMetaModelPackage.ACTOR__REQUIRED_BY:
				getRequiredBy().clear();
				getRequiredBy().addAll((Collection<? extends actorRequiredRelationship>)newValue);
				return;
			case ResponsibilityMetaModelPackage.ACTOR__HELD_RESPONSIBILITY:
				getHeldResponsibility().clear();
				getHeldResponsibility().addAll((Collection<? extends actorHoldsRelationship>)newValue);
				return;
			case ResponsibilityMetaModelPackage.ACTOR__PRODUCED_BY:
				getProducedBy().clear();
				getProducedBy().addAll((Collection<? extends actorProducedRelationship>)newValue);
				return;
			case ResponsibilityMetaModelPackage.ACTOR__REALISED_BY:
				getRealisedBy().clear();
				getRealisedBy().addAll((Collection<? extends actorRealisationRelationship>)newValue);
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
			case ResponsibilityMetaModelPackage.ACTOR__NAME:
				setName(NAME_EDEFAULT);
				return;
			case ResponsibilityMetaModelPackage.ACTOR__ENABLED:
				setEnabled(ENABLED_EDEFAULT);
				return;
			case ResponsibilityMetaModelPackage.ACTOR__SATISFIED:
				setSatisfied(SATISFIED_EDEFAULT);
				return;
			case ResponsibilityMetaModelPackage.ACTOR__SATISFACTION_CRITERIA:
				setSatisfactionCriteria(SATISFACTION_CRITERIA_EDEFAULT);
				return;
			case ResponsibilityMetaModelPackage.ACTOR__CRITICAL:
				setCritical(CRITICAL_EDEFAULT);
				return;
			case ResponsibilityMetaModelPackage.ACTOR__CRITICALITY_COUNT:
				setCriticalityCount(CRITICALITY_COUNT_EDEFAULT);
				return;
			case ResponsibilityMetaModelPackage.ACTOR__REFERENCED_BY:
				getReferencedBy().clear();
				return;
			case ResponsibilityMetaModelPackage.ACTOR__REQUIRED_BY:
				getRequiredBy().clear();
				return;
			case ResponsibilityMetaModelPackage.ACTOR__HELD_RESPONSIBILITY:
				getHeldResponsibility().clear();
				return;
			case ResponsibilityMetaModelPackage.ACTOR__PRODUCED_BY:
				getProducedBy().clear();
				return;
			case ResponsibilityMetaModelPackage.ACTOR__REALISED_BY:
				getRealisedBy().clear();
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
			case ResponsibilityMetaModelPackage.ACTOR__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case ResponsibilityMetaModelPackage.ACTOR__ENABLED:
				return enabled != ENABLED_EDEFAULT;
			case ResponsibilityMetaModelPackage.ACTOR__SATISFIED:
				return satisfied != SATISFIED_EDEFAULT;
			case ResponsibilityMetaModelPackage.ACTOR__SATISFACTION_CRITERIA:
				return SATISFACTION_CRITERIA_EDEFAULT == null ? satisfactionCriteria != null : !SATISFACTION_CRITERIA_EDEFAULT.equals(satisfactionCriteria);
			case ResponsibilityMetaModelPackage.ACTOR__CRITICAL:
				return critical != CRITICAL_EDEFAULT;
			case ResponsibilityMetaModelPackage.ACTOR__CRITICALITY_COUNT:
				return CRITICALITY_COUNT_EDEFAULT == null ? criticalityCount != null : !CRITICALITY_COUNT_EDEFAULT.equals(criticalityCount);
			case ResponsibilityMetaModelPackage.ACTOR__REFERENCED_BY:
				return referencedBy != null && !referencedBy.isEmpty();
			case ResponsibilityMetaModelPackage.ACTOR__REQUIRED_BY:
				return requiredBy != null && !requiredBy.isEmpty();
			case ResponsibilityMetaModelPackage.ACTOR__HELD_RESPONSIBILITY:
				return heldResponsibility != null && !heldResponsibility.isEmpty();
			case ResponsibilityMetaModelPackage.ACTOR__PRODUCED_BY:
				return producedBy != null && !producedBy.isEmpty();
			case ResponsibilityMetaModelPackage.ACTOR__REALISED_BY:
				return realisedBy != null && !realisedBy.isEmpty();
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

} //ActorImpl
