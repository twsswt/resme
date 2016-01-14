/**
 */
package responsibilityMetaModel.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import responsibilityMetaModel.Actor;
import responsibilityMetaModel.Responsibility;
import responsibilityMetaModel.ResponsibilityMetaModelPackage;
import responsibilityMetaModel.actorHoldsRelationship;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>actor Holds Relationship</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link responsibilityMetaModel.impl.actorHoldsRelationshipImpl#getResponsibility <em>Responsibility</em>}</li>
 *   <li>{@link responsibilityMetaModel.impl.actorHoldsRelationshipImpl#getActor <em>Actor</em>}</li>
 * </ul>
 *
 * @generated
 */
public class actorHoldsRelationshipImpl extends EObjectImpl implements actorHoldsRelationship {
	/**
	 * The cached value of the '{@link #getResponsibility() <em>Responsibility</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getResponsibility()
	 * @generated
	 * @ordered
	 */
	protected Responsibility responsibility;

	/**
	 * The cached value of the '{@link #getActor() <em>Actor</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getActor()
	 * @generated
	 * @ordered
	 */
	protected Actor actor;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected actorHoldsRelationshipImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ResponsibilityMetaModelPackage.Literals.ACTOR_HOLDS_RELATIONSHIP;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Responsibility getResponsibility() {
		if (responsibility != null && responsibility.eIsProxy()) {
			InternalEObject oldResponsibility = (InternalEObject)responsibility;
			responsibility = (Responsibility)eResolveProxy(oldResponsibility);
			if (responsibility != oldResponsibility) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ResponsibilityMetaModelPackage.ACTOR_HOLDS_RELATIONSHIP__RESPONSIBILITY, oldResponsibility, responsibility));
			}
		}
		return responsibility;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Responsibility basicGetResponsibility() {
		return responsibility;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetResponsibility(Responsibility newResponsibility, NotificationChain msgs) {
		Responsibility oldResponsibility = responsibility;
		responsibility = newResponsibility;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ResponsibilityMetaModelPackage.ACTOR_HOLDS_RELATIONSHIP__RESPONSIBILITY, oldResponsibility, newResponsibility);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setResponsibility(Responsibility newResponsibility) {
		if (newResponsibility != responsibility) {
			NotificationChain msgs = null;
			if (responsibility != null)
				msgs = ((InternalEObject)responsibility).eInverseRemove(this, ResponsibilityMetaModelPackage.RESPONSIBILITY__HELD_BY, Responsibility.class, msgs);
			if (newResponsibility != null)
				msgs = ((InternalEObject)newResponsibility).eInverseAdd(this, ResponsibilityMetaModelPackage.RESPONSIBILITY__HELD_BY, Responsibility.class, msgs);
			msgs = basicSetResponsibility(newResponsibility, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ResponsibilityMetaModelPackage.ACTOR_HOLDS_RELATIONSHIP__RESPONSIBILITY, newResponsibility, newResponsibility));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Actor getActor() {
		if (actor != null && actor.eIsProxy()) {
			InternalEObject oldActor = (InternalEObject)actor;
			actor = (Actor)eResolveProxy(oldActor);
			if (actor != oldActor) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ResponsibilityMetaModelPackage.ACTOR_HOLDS_RELATIONSHIP__ACTOR, oldActor, actor));
			}
		}
		return actor;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Actor basicGetActor() {
		return actor;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetActor(Actor newActor, NotificationChain msgs) {
		Actor oldActor = actor;
		actor = newActor;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ResponsibilityMetaModelPackage.ACTOR_HOLDS_RELATIONSHIP__ACTOR, oldActor, newActor);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setActor(Actor newActor) {
		if (newActor != actor) {
			NotificationChain msgs = null;
			if (actor != null)
				msgs = ((InternalEObject)actor).eInverseRemove(this, ResponsibilityMetaModelPackage.ACTOR__HELD_RESPONSIBILITY, Actor.class, msgs);
			if (newActor != null)
				msgs = ((InternalEObject)newActor).eInverseAdd(this, ResponsibilityMetaModelPackage.ACTOR__HELD_RESPONSIBILITY, Actor.class, msgs);
			msgs = basicSetActor(newActor, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ResponsibilityMetaModelPackage.ACTOR_HOLDS_RELATIONSHIP__ACTOR, newActor, newActor));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ResponsibilityMetaModelPackage.ACTOR_HOLDS_RELATIONSHIP__RESPONSIBILITY:
				if (responsibility != null)
					msgs = ((InternalEObject)responsibility).eInverseRemove(this, ResponsibilityMetaModelPackage.RESPONSIBILITY__HELD_BY, Responsibility.class, msgs);
				return basicSetResponsibility((Responsibility)otherEnd, msgs);
			case ResponsibilityMetaModelPackage.ACTOR_HOLDS_RELATIONSHIP__ACTOR:
				if (actor != null)
					msgs = ((InternalEObject)actor).eInverseRemove(this, ResponsibilityMetaModelPackage.ACTOR__HELD_RESPONSIBILITY, Actor.class, msgs);
				return basicSetActor((Actor)otherEnd, msgs);
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
			case ResponsibilityMetaModelPackage.ACTOR_HOLDS_RELATIONSHIP__RESPONSIBILITY:
				return basicSetResponsibility(null, msgs);
			case ResponsibilityMetaModelPackage.ACTOR_HOLDS_RELATIONSHIP__ACTOR:
				return basicSetActor(null, msgs);
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
			case ResponsibilityMetaModelPackage.ACTOR_HOLDS_RELATIONSHIP__RESPONSIBILITY:
				if (resolve) return getResponsibility();
				return basicGetResponsibility();
			case ResponsibilityMetaModelPackage.ACTOR_HOLDS_RELATIONSHIP__ACTOR:
				if (resolve) return getActor();
				return basicGetActor();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case ResponsibilityMetaModelPackage.ACTOR_HOLDS_RELATIONSHIP__RESPONSIBILITY:
				setResponsibility((Responsibility)newValue);
				return;
			case ResponsibilityMetaModelPackage.ACTOR_HOLDS_RELATIONSHIP__ACTOR:
				setActor((Actor)newValue);
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
			case ResponsibilityMetaModelPackage.ACTOR_HOLDS_RELATIONSHIP__RESPONSIBILITY:
				setResponsibility((Responsibility)null);
				return;
			case ResponsibilityMetaModelPackage.ACTOR_HOLDS_RELATIONSHIP__ACTOR:
				setActor((Actor)null);
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
			case ResponsibilityMetaModelPackage.ACTOR_HOLDS_RELATIONSHIP__RESPONSIBILITY:
				return responsibility != null;
			case ResponsibilityMetaModelPackage.ACTOR_HOLDS_RELATIONSHIP__ACTOR:
				return actor != null;
		}
		return super.eIsSet(featureID);
	}

} //actorHoldsRelationshipImpl
