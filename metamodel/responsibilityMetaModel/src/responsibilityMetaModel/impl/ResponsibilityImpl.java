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
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectWithInverseEList;
import org.eclipse.emf.ecore.util.EObjectWithInverseResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;

import responsibilityMetaModel.Actor;
import responsibilityMetaModel.Resource;
import responsibilityMetaModel.Responsibility;
import responsibilityMetaModel.ResponsibilityMetaModelPackage;
import responsibilityMetaModel.resourceRequiredRelationship;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Responsibility</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link responsibilityMetaModel.impl.ResponsibilityImpl#getName <em>Name</em>}</li>
 *   <li>{@link responsibilityMetaModel.impl.ResponsibilityImpl#isEnabled <em>Enabled</em>}</li>
 *   <li>{@link responsibilityMetaModel.impl.ResponsibilityImpl#getSatisfactionCriteria <em>Satisfaction Criteria</em>}</li>
 *   <li>{@link responsibilityMetaModel.impl.ResponsibilityImpl#getHolder <em>Holder</em>}</li>
 *   <li>{@link responsibilityMetaModel.impl.ResponsibilityImpl#getProducedResource <em>Produced Resource</em>}</li>
 *   <li>{@link responsibilityMetaModel.impl.ResponsibilityImpl#getSuperResponsibility <em>Super Responsibility</em>}</li>
 *   <li>{@link responsibilityMetaModel.impl.ResponsibilityImpl#getSubResponsibility <em>Sub Responsibility</em>}</li>
 *   <li>{@link responsibilityMetaModel.impl.ResponsibilityImpl#getActorRequired <em>Actor Required</em>}</li>
 *   <li>{@link responsibilityMetaModel.impl.ResponsibilityImpl#getRequiredResource <em>Required Resource</em>}</li>
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
	 * The cached value of the '{@link #getHolder() <em>Holder</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHolder()
	 * @generated
	 * @ordered
	 */
	protected EList<Actor> holder;

	/**
	 * The cached value of the '{@link #getProducedResource() <em>Produced Resource</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProducedResource()
	 * @generated
	 * @ordered
	 */
	protected EList<Resource> producedResource;

	/**
	 * The cached value of the '{@link #getSuperResponsibility() <em>Super Responsibility</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSuperResponsibility()
	 * @generated
	 * @ordered
	 */
	protected EList<Responsibility> superResponsibility;

	/**
	 * The cached value of the '{@link #getSubResponsibility() <em>Sub Responsibility</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSubResponsibility()
	 * @generated
	 * @ordered
	 */
	protected EList<Responsibility> subResponsibility;

	/**
	 * The cached value of the '{@link #getActorRequired() <em>Actor Required</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getActorRequired()
	 * @generated
	 * @ordered
	 */
	protected EList<Actor> actorRequired;

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
	public EList<Actor> getHolder() {
		if (holder == null) {
			holder = new EObjectWithInverseResolvingEList.ManyInverse<Actor>(Actor.class, this, ResponsibilityMetaModelPackage.RESPONSIBILITY__HOLDER, ResponsibilityMetaModelPackage.ACTOR__HELD_RESPONSIBILITY);
		}
		return holder;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Resource> getProducedResource() {
		if (producedResource == null) {
			producedResource = new EObjectWithInverseResolvingEList.ManyInverse<Resource>(Resource.class, this, ResponsibilityMetaModelPackage.RESPONSIBILITY__PRODUCED_RESOURCE, ResponsibilityMetaModelPackage.RESOURCE__PRODUCER);
		}
		return producedResource;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Responsibility> getSuperResponsibility() {
		if (superResponsibility == null) {
			superResponsibility = new EObjectWithInverseResolvingEList.ManyInverse<Responsibility>(Responsibility.class, this, ResponsibilityMetaModelPackage.RESPONSIBILITY__SUPER_RESPONSIBILITY, ResponsibilityMetaModelPackage.RESPONSIBILITY__SUB_RESPONSIBILITY);
		}
		return superResponsibility;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Responsibility> getSubResponsibility() {
		if (subResponsibility == null) {
			subResponsibility = new EObjectWithInverseEList.ManyInverse<Responsibility>(Responsibility.class, this, ResponsibilityMetaModelPackage.RESPONSIBILITY__SUB_RESPONSIBILITY, ResponsibilityMetaModelPackage.RESPONSIBILITY__SUPER_RESPONSIBILITY);
		}
		return subResponsibility;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Actor> getActorRequired() {
		if (actorRequired == null) {
			actorRequired = new EObjectWithInverseResolvingEList.ManyInverse<Actor>(Actor.class, this, ResponsibilityMetaModelPackage.RESPONSIBILITY__ACTOR_REQUIRED, ResponsibilityMetaModelPackage.ACTOR__REQUIRED_BY);
		}
		return actorRequired;
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
	@SuppressWarnings("unchecked")
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ResponsibilityMetaModelPackage.RESPONSIBILITY__HOLDER:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getHolder()).basicAdd(otherEnd, msgs);
			case ResponsibilityMetaModelPackage.RESPONSIBILITY__PRODUCED_RESOURCE:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getProducedResource()).basicAdd(otherEnd, msgs);
			case ResponsibilityMetaModelPackage.RESPONSIBILITY__SUPER_RESPONSIBILITY:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getSuperResponsibility()).basicAdd(otherEnd, msgs);
			case ResponsibilityMetaModelPackage.RESPONSIBILITY__SUB_RESPONSIBILITY:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getSubResponsibility()).basicAdd(otherEnd, msgs);
			case ResponsibilityMetaModelPackage.RESPONSIBILITY__ACTOR_REQUIRED:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getActorRequired()).basicAdd(otherEnd, msgs);
			case ResponsibilityMetaModelPackage.RESPONSIBILITY__REQUIRED_RESOURCE:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getRequiredResource()).basicAdd(otherEnd, msgs);
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
			case ResponsibilityMetaModelPackage.RESPONSIBILITY__HOLDER:
				return ((InternalEList<?>)getHolder()).basicRemove(otherEnd, msgs);
			case ResponsibilityMetaModelPackage.RESPONSIBILITY__PRODUCED_RESOURCE:
				return ((InternalEList<?>)getProducedResource()).basicRemove(otherEnd, msgs);
			case ResponsibilityMetaModelPackage.RESPONSIBILITY__SUPER_RESPONSIBILITY:
				return ((InternalEList<?>)getSuperResponsibility()).basicRemove(otherEnd, msgs);
			case ResponsibilityMetaModelPackage.RESPONSIBILITY__SUB_RESPONSIBILITY:
				return ((InternalEList<?>)getSubResponsibility()).basicRemove(otherEnd, msgs);
			case ResponsibilityMetaModelPackage.RESPONSIBILITY__ACTOR_REQUIRED:
				return ((InternalEList<?>)getActorRequired()).basicRemove(otherEnd, msgs);
			case ResponsibilityMetaModelPackage.RESPONSIBILITY__REQUIRED_RESOURCE:
				return ((InternalEList<?>)getRequiredResource()).basicRemove(otherEnd, msgs);
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
			case ResponsibilityMetaModelPackage.RESPONSIBILITY__SATISFACTION_CRITERIA:
				return getSatisfactionCriteria();
			case ResponsibilityMetaModelPackage.RESPONSIBILITY__HOLDER:
				return getHolder();
			case ResponsibilityMetaModelPackage.RESPONSIBILITY__PRODUCED_RESOURCE:
				return getProducedResource();
			case ResponsibilityMetaModelPackage.RESPONSIBILITY__SUPER_RESPONSIBILITY:
				return getSuperResponsibility();
			case ResponsibilityMetaModelPackage.RESPONSIBILITY__SUB_RESPONSIBILITY:
				return getSubResponsibility();
			case ResponsibilityMetaModelPackage.RESPONSIBILITY__ACTOR_REQUIRED:
				return getActorRequired();
			case ResponsibilityMetaModelPackage.RESPONSIBILITY__REQUIRED_RESOURCE:
				return getRequiredResource();
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
			case ResponsibilityMetaModelPackage.RESPONSIBILITY__SATISFACTION_CRITERIA:
				setSatisfactionCriteria((String)newValue);
				return;
			case ResponsibilityMetaModelPackage.RESPONSIBILITY__HOLDER:
				getHolder().clear();
				getHolder().addAll((Collection<? extends Actor>)newValue);
				return;
			case ResponsibilityMetaModelPackage.RESPONSIBILITY__PRODUCED_RESOURCE:
				getProducedResource().clear();
				getProducedResource().addAll((Collection<? extends Resource>)newValue);
				return;
			case ResponsibilityMetaModelPackage.RESPONSIBILITY__SUPER_RESPONSIBILITY:
				getSuperResponsibility().clear();
				getSuperResponsibility().addAll((Collection<? extends Responsibility>)newValue);
				return;
			case ResponsibilityMetaModelPackage.RESPONSIBILITY__SUB_RESPONSIBILITY:
				getSubResponsibility().clear();
				getSubResponsibility().addAll((Collection<? extends Responsibility>)newValue);
				return;
			case ResponsibilityMetaModelPackage.RESPONSIBILITY__ACTOR_REQUIRED:
				getActorRequired().clear();
				getActorRequired().addAll((Collection<? extends Actor>)newValue);
				return;
			case ResponsibilityMetaModelPackage.RESPONSIBILITY__REQUIRED_RESOURCE:
				getRequiredResource().clear();
				getRequiredResource().addAll((Collection<? extends resourceRequiredRelationship>)newValue);
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
			case ResponsibilityMetaModelPackage.RESPONSIBILITY__SATISFACTION_CRITERIA:
				setSatisfactionCriteria(SATISFACTION_CRITERIA_EDEFAULT);
				return;
			case ResponsibilityMetaModelPackage.RESPONSIBILITY__HOLDER:
				getHolder().clear();
				return;
			case ResponsibilityMetaModelPackage.RESPONSIBILITY__PRODUCED_RESOURCE:
				getProducedResource().clear();
				return;
			case ResponsibilityMetaModelPackage.RESPONSIBILITY__SUPER_RESPONSIBILITY:
				getSuperResponsibility().clear();
				return;
			case ResponsibilityMetaModelPackage.RESPONSIBILITY__SUB_RESPONSIBILITY:
				getSubResponsibility().clear();
				return;
			case ResponsibilityMetaModelPackage.RESPONSIBILITY__ACTOR_REQUIRED:
				getActorRequired().clear();
				return;
			case ResponsibilityMetaModelPackage.RESPONSIBILITY__REQUIRED_RESOURCE:
				getRequiredResource().clear();
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
			case ResponsibilityMetaModelPackage.RESPONSIBILITY__SATISFACTION_CRITERIA:
				return SATISFACTION_CRITERIA_EDEFAULT == null ? satisfactionCriteria != null : !SATISFACTION_CRITERIA_EDEFAULT.equals(satisfactionCriteria);
			case ResponsibilityMetaModelPackage.RESPONSIBILITY__HOLDER:
				return holder != null && !holder.isEmpty();
			case ResponsibilityMetaModelPackage.RESPONSIBILITY__PRODUCED_RESOURCE:
				return producedResource != null && !producedResource.isEmpty();
			case ResponsibilityMetaModelPackage.RESPONSIBILITY__SUPER_RESPONSIBILITY:
				return superResponsibility != null && !superResponsibility.isEmpty();
			case ResponsibilityMetaModelPackage.RESPONSIBILITY__SUB_RESPONSIBILITY:
				return subResponsibility != null && !subResponsibility.isEmpty();
			case ResponsibilityMetaModelPackage.RESPONSIBILITY__ACTOR_REQUIRED:
				return actorRequired != null && !actorRequired.isEmpty();
			case ResponsibilityMetaModelPackage.RESPONSIBILITY__REQUIRED_RESOURCE:
				return requiredResource != null && !requiredResource.isEmpty();
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
		result.append(", satisfactionCriteria: ");
		result.append(satisfactionCriteria);
		result.append(')');
		return result.toString();
	}

} //ResponsibilityImpl
