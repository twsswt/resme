/**
 */
package responsibilityMetaModel.impl;

import java.lang.reflect.InvocationTargetException;
import java.util.Collection;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import org.antlr.v4.runtime.ANTLRInputStream;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.UnbufferedTokenStream;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;
import org.eclipse.emf.ecore.util.EObjectWithInverseResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;

import responsibilityMetaModel.Actor;
import responsibilityMetaModel.Entity;
import responsibilityMetaModel.Responsibility;
import responsibilityMetaModel.ResponsibilityMetaModelPackage;
import responsibilityMetaModel.Scenario;
import responsibilityMetaModel.actorHoldsRelationship;
import responsibilityMetaModel.actorProducedRelationship;
import responsibilityMetaModel.actorRequiredRelationship;
import responsibilityMetaModel.attributionRelationship;
import responsibilityMetaModel.resourceProducedRelationship;
import responsibilityMetaModel.resourceRequiredRelationship;
import responsibilityMetaModel.responsibilityRequiredRelationship;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Responsibility</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link responsibilityMetaModel.impl.ResponsibilityImpl#getName <em>Name</em>}</li>
 *   <li>{@link responsibilityMetaModel.impl.ResponsibilityImpl#isEnabled <em>Enabled</em>}</li>
 *   <li>{@link responsibilityMetaModel.impl.ResponsibilityImpl#isSatisifed <em>Satisifed</em>}</li>
 *   <li>{@link responsibilityMetaModel.impl.ResponsibilityImpl#getSatisfactionCriteria <em>Satisfaction Criteria</em>}</li>
 *   <li>{@link responsibilityMetaModel.impl.ResponsibilityImpl#isCritical <em>Critical</em>}</li>
 *   <li>{@link responsibilityMetaModel.impl.ResponsibilityImpl#getCriticalityCount <em>Criticality Count</em>}</li>
 *   <li>{@link responsibilityMetaModel.impl.ResponsibilityImpl#getReferencedBy <em>Referenced By</em>}</li>
 *   <li>{@link responsibilityMetaModel.impl.ResponsibilityImpl#getRequiredResource <em>Required Resource</em>}</li>
 *   <li>{@link responsibilityMetaModel.impl.ResponsibilityImpl#getProducedResource <em>Produced Resource</em>}</li>
 *   <li>{@link responsibilityMetaModel.impl.ResponsibilityImpl#getRequiredActor <em>Required Actor</em>}</li>
 *   <li>{@link responsibilityMetaModel.impl.ResponsibilityImpl#getHeldBy <em>Held By</em>}</li>
 *   <li>{@link responsibilityMetaModel.impl.ResponsibilityImpl#getSuperResponsibility <em>Super Responsibility</em>}</li>
 *   <li>{@link responsibilityMetaModel.impl.ResponsibilityImpl#getSubResponsibility <em>Sub Responsibility</em>}</li>
 *   <li>{@link responsibilityMetaModel.impl.ResponsibilityImpl#getProducedActor <em>Produced Actor</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ResponsibilityImpl extends MinimalEObjectImpl.Container implements Responsibility {
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
	 * The default value of the '{@link #isSatisfied() <em>Satisifed</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSatisfied()
	 * @generated
	 * @ordered
	 */
	protected static final boolean SATISIFED_EDEFAULT = true;

	/**
	 * The cached value of the '{@link #isSatisfied() <em>Satisifed</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSatisfied()
	 * @generated
	 * @ordered
	 */
	protected boolean satisifed = SATISIFED_EDEFAULT;

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
	 * The cached value of the '{@link #getRequiredResource() <em>Required Resource</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRequiredResource()
	 * @generated
	 * @ordered
	 */
	protected EList<resourceRequiredRelationship> requiredResource;

	/**
	 * The cached value of the '{@link #getProducedResource() <em>Produced Resource</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProducedResource()
	 * @generated
	 * @ordered
	 */
	protected EList<resourceProducedRelationship> producedResource;

	/**
	 * The cached value of the '{@link #getRequiredActor() <em>Required Actor</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRequiredActor()
	 * @generated
	 * @ordered
	 */
	protected EList<actorRequiredRelationship> requiredActor;

	/**
	 * The cached value of the '{@link #getHeldBy() <em>Held By</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHeldBy()
	 * @generated
	 * @ordered
	 */
	protected EList<actorHoldsRelationship> heldBy;

	/**
	 * The cached value of the '{@link #getSuperResponsibility() <em>Super Responsibility</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSuperResponsibility()
	 * @generated
	 * @ordered
	 */
	protected EList<responsibilityRequiredRelationship> superResponsibility;

	/**
	 * The cached value of the '{@link #getSubResponsibility() <em>Sub Responsibility</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSubResponsibility()
	 * @generated
	 * @ordered
	 */
	protected EList<responsibilityRequiredRelationship> subResponsibility;

	/**
	 * The cached value of the '{@link #getProducedActor() <em>Produced Actor</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProducedActor()
	 * @generated
	 * @ordered
	 */
	protected EList<actorProducedRelationship> producedActor;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ResponsibilityImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ResponsibilityMetaModelPackage.Literals.RESPONSIBILITY;
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
			eNotify(new ENotificationImpl(this, Notification.SET, ResponsibilityMetaModelPackage.RESPONSIBILITY__NAME, oldName, name));
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
			eNotify(new ENotificationImpl(this, Notification.SET, ResponsibilityMetaModelPackage.RESPONSIBILITY__ENABLED, oldEnabled, enabled));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSatisfied() {
		return satisifed;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSatisfied(boolean newSatisifed) {
		boolean oldSatisifed = satisifed;
		satisifed = newSatisifed;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ResponsibilityMetaModelPackage.RESPONSIBILITY__SATISFIED, oldSatisifed, satisifed));
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
			eNotify(new ENotificationImpl(this, Notification.SET, ResponsibilityMetaModelPackage.RESPONSIBILITY__SATISFACTION_CRITERIA, oldSatisfactionCriteria, satisfactionCriteria));
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
			eNotify(new ENotificationImpl(this, Notification.SET, ResponsibilityMetaModelPackage.RESPONSIBILITY__CRITICAL, oldCritical, critical));
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
			eNotify(new ENotificationImpl(this, Notification.SET, ResponsibilityMetaModelPackage.RESPONSIBILITY__CRITICALITY_COUNT, oldCriticalityCount, criticalityCount));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<attributionRelationship> getReferencedBy() {
		if (referencedBy == null) {
			referencedBy = new EObjectWithInverseResolvingEList<attributionRelationship>(attributionRelationship.class, this, ResponsibilityMetaModelPackage.RESPONSIBILITY__REFERENCED_BY, ResponsibilityMetaModelPackage.ATTRIBUTION_RELATIONSHIP__ENTITY);
		}
		return referencedBy;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<resourceRequiredRelationship> getRequiredResource() {
		if (requiredResource == null) {
			requiredResource = new EObjectWithInverseResolvingEList<resourceRequiredRelationship>(resourceRequiredRelationship.class, this, ResponsibilityMetaModelPackage.RESPONSIBILITY__REQUIRED_RESOURCE, ResponsibilityMetaModelPackage.RESOURCE_REQUIRED_RELATIONSHIP__RESPONSIBILITY);
		}
		return requiredResource;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<resourceProducedRelationship> getProducedResource() {
		if (producedResource == null) {
			producedResource = new EObjectWithInverseResolvingEList<resourceProducedRelationship>(resourceProducedRelationship.class, this, ResponsibilityMetaModelPackage.RESPONSIBILITY__PRODUCED_RESOURCE, ResponsibilityMetaModelPackage.RESOURCE_PRODUCED_RELATIONSHIP__RESPONSIBILITY);
		}
		return producedResource;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<actorRequiredRelationship> getRequiredActor() {
		if (requiredActor == null) {
			requiredActor = new EObjectWithInverseResolvingEList<actorRequiredRelationship>(actorRequiredRelationship.class, this, ResponsibilityMetaModelPackage.RESPONSIBILITY__REQUIRED_ACTOR, ResponsibilityMetaModelPackage.ACTOR_REQUIRED_RELATIONSHIP__RESPONSIBILITY);
		}
		return requiredActor;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<actorHoldsRelationship> getHeldBy() {
		if (heldBy == null) {
			heldBy = new EObjectWithInverseResolvingEList<actorHoldsRelationship>(actorHoldsRelationship.class, this, ResponsibilityMetaModelPackage.RESPONSIBILITY__HELD_BY, ResponsibilityMetaModelPackage.ACTOR_HOLDS_RELATIONSHIP__RESPONSIBILITY);
		}
		return heldBy;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<responsibilityRequiredRelationship> getSuperResponsibility() {
		if (superResponsibility == null) {
			superResponsibility = new EObjectWithInverseResolvingEList<responsibilityRequiredRelationship>(responsibilityRequiredRelationship.class, this, ResponsibilityMetaModelPackage.RESPONSIBILITY__SUPER_RESPONSIBILITY, ResponsibilityMetaModelPackage.RESPONSIBILITY_REQUIRED_RELATIONSHIP__SUB_RESPONSIBILITY);
		}
		return superResponsibility;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<responsibilityRequiredRelationship> getSubResponsibility() {
		if (subResponsibility == null) {
			subResponsibility = new EObjectWithInverseResolvingEList<responsibilityRequiredRelationship>(responsibilityRequiredRelationship.class, this, ResponsibilityMetaModelPackage.RESPONSIBILITY__SUB_RESPONSIBILITY, ResponsibilityMetaModelPackage.RESPONSIBILITY_REQUIRED_RELATIONSHIP__SUPER_RESPONSIBILITY);
		}
		return subResponsibility;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<actorProducedRelationship> getProducedActor() {
		if (producedActor == null) {
			producedActor = new EObjectWithInverseResolvingEList<actorProducedRelationship>(actorProducedRelationship.class, this, ResponsibilityMetaModelPackage.RESPONSIBILITY__PRODUCED_ACTOR, ResponsibilityMetaModelPackage.ACTOR_PRODUCED_RELATIONSHIP__RESPONSIBILITY);
		}
		return producedActor;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 */
	public boolean satisfied() {

		if (!isEnabled()){
			satisifed = false;
			return false;
		}

		else if (this.satisfactionCriteria == null || this.satisfactionCriteria.length()==0){
			satisifed = true;
			return true;
		}

		else{
			try {
				CharStream stream = new ANTLRInputStream(this.satisfactionCriteria);
				satisfactionLexer lexer = new satisfactionLexer(stream); //problem
				UnbufferedTokenStream<Token> t = new UnbufferedTokenStream<>(lexer);
				Scenario s = (Scenario) this.eContainer;
				satisfactionParser sat = new satisfactionParser(t, s.getEntities());
				System.out.println(s.getEntities());
				satisifed = sat.eval().value;
				return satisifed;
			}
			catch (Exception e){ //This is clearly bad
				System.err.println("Error!");
				satisifed = false;
				return false;
			}

		}
		//satisifed = false;
		//return false;


	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 */
	@Override
	public RelianceHelper reliesOn(EList<Entity> visited, EList<Actor> depends){

		//If not already visited, traverse
		//First actors
		for (actorRequiredRelationship a: requiredActor){
			if (a.getActor().isEnabled()){
				//Special treatment to cover 'Produced Actor'
				if (!visited.contains(a.getActor())){
					EList<actorProducedRelationship> pro = a.getActor().getProducedBy(); //get all resps producing actor
					for (actorProducedRelationship aP: pro){
						if (!visited.contains(aP.getResponsibility())){
							depends = aP.getResponsibility().reliesOn(visited, depends).depends;
						}
					}
					visited.add(a.getActor());
				}
				if (!depends.contains(a.getActor())){
					depends.add(a.getActor());
				}
			}
		}

		//Then resources
		for (resourceRequiredRelationship r: requiredResource){
			if (r.getResource().isEnabled()){
				if (!visited.contains(r.getResource())){
					depends = r.getResource().reliesOn(visited, depends).depends; //Update
					visited.add(r.getResource());
				}
			}

		}

		//Then responsibilities

		for (responsibilityRequiredRelationship r: subResponsibility){
			if (r.getSubResponsibility().isEnabled()){
				if (!visited.contains(r.getSubResponsibility())){
					depends = r.getSubResponsibility().reliesOn(visited, depends).depends; //Update
					visited.add(r.getSubResponsibility());
				}
			}

		}


		return new RelianceHelper(visited, depends);

	}

	@Override
	public CriticalityHelper criticalityAnalysis(EList<Entity> visited,
			EList<Responsibility> resps, boolean flag) {

		//For responsibilities, update count and follow required resp and production

		resps.add(this);

		for (resourceProducedRelationship r : producedResource){
			if (r.getResource().isEnabled()){
				if (!visited.contains(r.getResource())){
					visited.add(r.getResource());
					resps.addAll(r.getResource().criticalityAnalysis(visited, resps, false).resps); //Update
				}
			}
		}

		for (responsibilityRequiredRelationship r : superResponsibility){
			if (r.getSuperResponsibility().isEnabled()){
				if (!visited.contains(r.getSuperResponsibility())){
					visited.add(r.getSuperResponsibility());
					resps.addAll(r.getSuperResponsibility().criticalityAnalysis(visited, resps, false).resps); //Update
				}
			}
		}

		for (actorProducedRelationship a : producedActor){
			if (a.getActor().isEnabled()){
				if (!visited.contains(a.getActor())){
					visited.add(a.getActor());
					resps.addAll(a.getActor().criticalityAnalysis(visited, resps, false).resps); //Update
				}
			}
		}
		
		if (flag==true && enabled){
			//Terrible duplicate removal
			Set<Responsibility> x = new HashSet<Responsibility>(resps);
			x.remove(this);
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
			case ResponsibilityMetaModelPackage.RESPONSIBILITY__REFERENCED_BY:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getReferencedBy()).basicAdd(otherEnd, msgs);
			case ResponsibilityMetaModelPackage.RESPONSIBILITY__REQUIRED_RESOURCE:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getRequiredResource()).basicAdd(otherEnd, msgs);
			case ResponsibilityMetaModelPackage.RESPONSIBILITY__PRODUCED_RESOURCE:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getProducedResource()).basicAdd(otherEnd, msgs);
			case ResponsibilityMetaModelPackage.RESPONSIBILITY__REQUIRED_ACTOR:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getRequiredActor()).basicAdd(otherEnd, msgs);
			case ResponsibilityMetaModelPackage.RESPONSIBILITY__HELD_BY:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getHeldBy()).basicAdd(otherEnd, msgs);
			case ResponsibilityMetaModelPackage.RESPONSIBILITY__SUPER_RESPONSIBILITY:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getSuperResponsibility()).basicAdd(otherEnd, msgs);
			case ResponsibilityMetaModelPackage.RESPONSIBILITY__SUB_RESPONSIBILITY:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getSubResponsibility()).basicAdd(otherEnd, msgs);
			case ResponsibilityMetaModelPackage.RESPONSIBILITY__PRODUCED_ACTOR:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getProducedActor()).basicAdd(otherEnd, msgs);
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
			case ResponsibilityMetaModelPackage.RESPONSIBILITY__REFERENCED_BY:
				return ((InternalEList<?>)getReferencedBy()).basicRemove(otherEnd, msgs);
			case ResponsibilityMetaModelPackage.RESPONSIBILITY__REQUIRED_RESOURCE:
				return ((InternalEList<?>)getRequiredResource()).basicRemove(otherEnd, msgs);
			case ResponsibilityMetaModelPackage.RESPONSIBILITY__PRODUCED_RESOURCE:
				return ((InternalEList<?>)getProducedResource()).basicRemove(otherEnd, msgs);
			case ResponsibilityMetaModelPackage.RESPONSIBILITY__REQUIRED_ACTOR:
				return ((InternalEList<?>)getRequiredActor()).basicRemove(otherEnd, msgs);
			case ResponsibilityMetaModelPackage.RESPONSIBILITY__HELD_BY:
				return ((InternalEList<?>)getHeldBy()).basicRemove(otherEnd, msgs);
			case ResponsibilityMetaModelPackage.RESPONSIBILITY__SUPER_RESPONSIBILITY:
				return ((InternalEList<?>)getSuperResponsibility()).basicRemove(otherEnd, msgs);
			case ResponsibilityMetaModelPackage.RESPONSIBILITY__SUB_RESPONSIBILITY:
				return ((InternalEList<?>)getSubResponsibility()).basicRemove(otherEnd, msgs);
			case ResponsibilityMetaModelPackage.RESPONSIBILITY__PRODUCED_ACTOR:
				return ((InternalEList<?>)getProducedActor()).basicRemove(otherEnd, msgs);
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
			case ResponsibilityMetaModelPackage.RESPONSIBILITY__NAME:
				return getName();
			case ResponsibilityMetaModelPackage.RESPONSIBILITY__ENABLED:
				return isEnabled();
			case ResponsibilityMetaModelPackage.RESPONSIBILITY__SATISFIED:
				return isSatisfied();
			case ResponsibilityMetaModelPackage.RESPONSIBILITY__SATISFACTION_CRITERIA:
				return getSatisfactionCriteria();
			case ResponsibilityMetaModelPackage.RESPONSIBILITY__CRITICAL:
				return isCritical();
			case ResponsibilityMetaModelPackage.RESPONSIBILITY__CRITICALITY_COUNT:
				return getCriticalityCount();
			case ResponsibilityMetaModelPackage.RESPONSIBILITY__REFERENCED_BY:
				return getReferencedBy();
			case ResponsibilityMetaModelPackage.RESPONSIBILITY__REQUIRED_RESOURCE:
				return getRequiredResource();
			case ResponsibilityMetaModelPackage.RESPONSIBILITY__PRODUCED_RESOURCE:
				return getProducedResource();
			case ResponsibilityMetaModelPackage.RESPONSIBILITY__REQUIRED_ACTOR:
				return getRequiredActor();
			case ResponsibilityMetaModelPackage.RESPONSIBILITY__HELD_BY:
				return getHeldBy();
			case ResponsibilityMetaModelPackage.RESPONSIBILITY__SUPER_RESPONSIBILITY:
				return getSuperResponsibility();
			case ResponsibilityMetaModelPackage.RESPONSIBILITY__SUB_RESPONSIBILITY:
				return getSubResponsibility();
			case ResponsibilityMetaModelPackage.RESPONSIBILITY__PRODUCED_ACTOR:
				return getProducedActor();
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
			case ResponsibilityMetaModelPackage.RESPONSIBILITY__NAME:
				setName((String)newValue);
				return;
			case ResponsibilityMetaModelPackage.RESPONSIBILITY__ENABLED:
				setEnabled((Boolean)newValue);
				return;
			case ResponsibilityMetaModelPackage.RESPONSIBILITY__SATISFIED:
				setSatisfied((Boolean)newValue);
				return;
			case ResponsibilityMetaModelPackage.RESPONSIBILITY__SATISFACTION_CRITERIA:
				setSatisfactionCriteria((String)newValue);
				return;
			case ResponsibilityMetaModelPackage.RESPONSIBILITY__CRITICAL:
				setCritical((Boolean)newValue);
				return;
			case ResponsibilityMetaModelPackage.RESPONSIBILITY__CRITICALITY_COUNT:
				setCriticalityCount((Integer)newValue);
				return;
			case ResponsibilityMetaModelPackage.RESPONSIBILITY__REFERENCED_BY:
				getReferencedBy().clear();
				getReferencedBy().addAll((Collection<? extends attributionRelationship>)newValue);
				return;
			case ResponsibilityMetaModelPackage.RESPONSIBILITY__REQUIRED_RESOURCE:
				getRequiredResource().clear();
				getRequiredResource().addAll((Collection<? extends resourceRequiredRelationship>)newValue);
				return;
			case ResponsibilityMetaModelPackage.RESPONSIBILITY__PRODUCED_RESOURCE:
				getProducedResource().clear();
				getProducedResource().addAll((Collection<? extends resourceProducedRelationship>)newValue);
				return;
			case ResponsibilityMetaModelPackage.RESPONSIBILITY__REQUIRED_ACTOR:
				getRequiredActor().clear();
				getRequiredActor().addAll((Collection<? extends actorRequiredRelationship>)newValue);
				return;
			case ResponsibilityMetaModelPackage.RESPONSIBILITY__HELD_BY:
				getHeldBy().clear();
				getHeldBy().addAll((Collection<? extends actorHoldsRelationship>)newValue);
				return;
			case ResponsibilityMetaModelPackage.RESPONSIBILITY__SUPER_RESPONSIBILITY:
				getSuperResponsibility().clear();
				getSuperResponsibility().addAll((Collection<? extends responsibilityRequiredRelationship>)newValue);
				return;
			case ResponsibilityMetaModelPackage.RESPONSIBILITY__SUB_RESPONSIBILITY:
				getSubResponsibility().clear();
				getSubResponsibility().addAll((Collection<? extends responsibilityRequiredRelationship>)newValue);
				return;
			case ResponsibilityMetaModelPackage.RESPONSIBILITY__PRODUCED_ACTOR:
				getProducedActor().clear();
				getProducedActor().addAll((Collection<? extends actorProducedRelationship>)newValue);
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
			case ResponsibilityMetaModelPackage.RESPONSIBILITY__NAME:
				setName(NAME_EDEFAULT);
				return;
			case ResponsibilityMetaModelPackage.RESPONSIBILITY__ENABLED:
				setEnabled(ENABLED_EDEFAULT);
				return;
			case ResponsibilityMetaModelPackage.RESPONSIBILITY__SATISFIED:
				setSatisfied(SATISIFED_EDEFAULT);
				return;
			case ResponsibilityMetaModelPackage.RESPONSIBILITY__SATISFACTION_CRITERIA:
				setSatisfactionCriteria(SATISFACTION_CRITERIA_EDEFAULT);
				return;
			case ResponsibilityMetaModelPackage.RESPONSIBILITY__CRITICAL:
				setCritical(CRITICAL_EDEFAULT);
				return;
			case ResponsibilityMetaModelPackage.RESPONSIBILITY__CRITICALITY_COUNT:
				setCriticalityCount(CRITICALITY_COUNT_EDEFAULT);
				return;
			case ResponsibilityMetaModelPackage.RESPONSIBILITY__REFERENCED_BY:
				getReferencedBy().clear();
				return;
			case ResponsibilityMetaModelPackage.RESPONSIBILITY__REQUIRED_RESOURCE:
				getRequiredResource().clear();
				return;
			case ResponsibilityMetaModelPackage.RESPONSIBILITY__PRODUCED_RESOURCE:
				getProducedResource().clear();
				return;
			case ResponsibilityMetaModelPackage.RESPONSIBILITY__REQUIRED_ACTOR:
				getRequiredActor().clear();
				return;
			case ResponsibilityMetaModelPackage.RESPONSIBILITY__HELD_BY:
				getHeldBy().clear();
				return;
			case ResponsibilityMetaModelPackage.RESPONSIBILITY__SUPER_RESPONSIBILITY:
				getSuperResponsibility().clear();
				return;
			case ResponsibilityMetaModelPackage.RESPONSIBILITY__SUB_RESPONSIBILITY:
				getSubResponsibility().clear();
				return;
			case ResponsibilityMetaModelPackage.RESPONSIBILITY__PRODUCED_ACTOR:
				getProducedActor().clear();
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
			case ResponsibilityMetaModelPackage.RESPONSIBILITY__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case ResponsibilityMetaModelPackage.RESPONSIBILITY__ENABLED:
				return enabled != ENABLED_EDEFAULT;
			case ResponsibilityMetaModelPackage.RESPONSIBILITY__SATISFIED:
				return satisifed != SATISIFED_EDEFAULT;
			case ResponsibilityMetaModelPackage.RESPONSIBILITY__SATISFACTION_CRITERIA:
				return SATISFACTION_CRITERIA_EDEFAULT == null ? satisfactionCriteria != null : !SATISFACTION_CRITERIA_EDEFAULT.equals(satisfactionCriteria);
			case ResponsibilityMetaModelPackage.RESPONSIBILITY__CRITICAL:
				return critical != CRITICAL_EDEFAULT;
			case ResponsibilityMetaModelPackage.RESPONSIBILITY__CRITICALITY_COUNT:
				return CRITICALITY_COUNT_EDEFAULT == null ? criticalityCount != null : !CRITICALITY_COUNT_EDEFAULT.equals(criticalityCount);
			case ResponsibilityMetaModelPackage.RESPONSIBILITY__REFERENCED_BY:
				return referencedBy != null && !referencedBy.isEmpty();
			case ResponsibilityMetaModelPackage.RESPONSIBILITY__REQUIRED_RESOURCE:
				return requiredResource != null && !requiredResource.isEmpty();
			case ResponsibilityMetaModelPackage.RESPONSIBILITY__PRODUCED_RESOURCE:
				return producedResource != null && !producedResource.isEmpty();
			case ResponsibilityMetaModelPackage.RESPONSIBILITY__REQUIRED_ACTOR:
				return requiredActor != null && !requiredActor.isEmpty();
			case ResponsibilityMetaModelPackage.RESPONSIBILITY__HELD_BY:
				return heldBy != null && !heldBy.isEmpty();
			case ResponsibilityMetaModelPackage.RESPONSIBILITY__SUPER_RESPONSIBILITY:
				return superResponsibility != null && !superResponsibility.isEmpty();
			case ResponsibilityMetaModelPackage.RESPONSIBILITY__SUB_RESPONSIBILITY:
				return subResponsibility != null && !subResponsibility.isEmpty();
			case ResponsibilityMetaModelPackage.RESPONSIBILITY__PRODUCED_ACTOR:
				return producedActor != null && !producedActor.isEmpty();
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eInvoke(int operationID, EList<?> arguments) throws InvocationTargetException {
		switch (operationID) {
			case ResponsibilityMetaModelPackage.RESPONSIBILITY__SATISFIED:
				return satisfied();
		}
		return super.eInvoke(operationID, arguments);
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
		result.append(", satisifed: ");
		result.append(satisifed);
		result.append(", satisfactionCriteria: ");
		result.append(satisfactionCriteria);
		result.append(", critical: ");
		result.append(critical);
		result.append(", criticalityCount: ");
		result.append(criticalityCount);
		result.append(')');
		return result.toString();
	}

} //ResponsibilityImpl
