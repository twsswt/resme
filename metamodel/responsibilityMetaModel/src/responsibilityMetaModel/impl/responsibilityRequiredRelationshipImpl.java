/**
 */
package responsibilityMetaModel.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import responsibilityMetaModel.Responsibility;
import responsibilityMetaModel.ResponsibilityMetaModelPackage;
import responsibilityMetaModel.responsibilityRequiredRelationship;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>responsibility Required Relationship</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link responsibilityMetaModel.impl.responsibilityRequiredRelationshipImpl#getSubRresponsibility <em>Sub Rresponsibility</em>}</li>
 *   <li>{@link responsibilityMetaModel.impl.responsibilityRequiredRelationshipImpl#getSuperResponsibility <em>Super Responsibility</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class responsibilityRequiredRelationshipImpl extends MinimalEObjectImpl.Container implements responsibilityRequiredRelationship {
	/**
	 * The cached value of the '{@link #getSubRresponsibility() <em>Sub Rresponsibility</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSubRresponsibility()
	 * @generated
	 * @ordered
	 */
	protected Responsibility subRresponsibility;

	/**
	 * The cached value of the '{@link #getSuperResponsibility() <em>Super Responsibility</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSuperResponsibility()
	 * @generated
	 * @ordered
	 */
	protected Responsibility superResponsibility;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected responsibilityRequiredRelationshipImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ResponsibilityMetaModelPackage.Literals.RESPONSIBILITY_REQUIRED_RELATIONSHIP;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Responsibility getSubRresponsibility() {
		if (subRresponsibility != null && subRresponsibility.eIsProxy()) {
			InternalEObject oldSubRresponsibility = (InternalEObject)subRresponsibility;
			subRresponsibility = (Responsibility)eResolveProxy(oldSubRresponsibility);
			if (subRresponsibility != oldSubRresponsibility) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ResponsibilityMetaModelPackage.RESPONSIBILITY_REQUIRED_RELATIONSHIP__SUB_RRESPONSIBILITY, oldSubRresponsibility, subRresponsibility));
			}
		}
		return subRresponsibility;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Responsibility basicGetSubRresponsibility() {
		return subRresponsibility;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSubRresponsibility(Responsibility newSubRresponsibility, NotificationChain msgs) {
		Responsibility oldSubRresponsibility = subRresponsibility;
		subRresponsibility = newSubRresponsibility;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ResponsibilityMetaModelPackage.RESPONSIBILITY_REQUIRED_RELATIONSHIP__SUB_RRESPONSIBILITY, oldSubRresponsibility, newSubRresponsibility);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSubRresponsibility(Responsibility newSubRresponsibility) {
		if (newSubRresponsibility != subRresponsibility) {
			NotificationChain msgs = null;
			if (subRresponsibility != null)
				msgs = ((InternalEObject)subRresponsibility).eInverseRemove(this, ResponsibilityMetaModelPackage.RESPONSIBILITY__SUPER_RESPONSIBILITY, Responsibility.class, msgs);
			if (newSubRresponsibility != null)
				msgs = ((InternalEObject)newSubRresponsibility).eInverseAdd(this, ResponsibilityMetaModelPackage.RESPONSIBILITY__SUPER_RESPONSIBILITY, Responsibility.class, msgs);
			msgs = basicSetSubRresponsibility(newSubRresponsibility, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ResponsibilityMetaModelPackage.RESPONSIBILITY_REQUIRED_RELATIONSHIP__SUB_RRESPONSIBILITY, newSubRresponsibility, newSubRresponsibility));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Responsibility getSuperResponsibility() {
		if (superResponsibility != null && superResponsibility.eIsProxy()) {
			InternalEObject oldSuperResponsibility = (InternalEObject)superResponsibility;
			superResponsibility = (Responsibility)eResolveProxy(oldSuperResponsibility);
			if (superResponsibility != oldSuperResponsibility) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ResponsibilityMetaModelPackage.RESPONSIBILITY_REQUIRED_RELATIONSHIP__SUPER_RESPONSIBILITY, oldSuperResponsibility, superResponsibility));
			}
		}
		return superResponsibility;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Responsibility basicGetSuperResponsibility() {
		return superResponsibility;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSuperResponsibility(Responsibility newSuperResponsibility, NotificationChain msgs) {
		Responsibility oldSuperResponsibility = superResponsibility;
		superResponsibility = newSuperResponsibility;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ResponsibilityMetaModelPackage.RESPONSIBILITY_REQUIRED_RELATIONSHIP__SUPER_RESPONSIBILITY, oldSuperResponsibility, newSuperResponsibility);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSuperResponsibility(Responsibility newSuperResponsibility) {
		if (newSuperResponsibility != superResponsibility) {
			NotificationChain msgs = null;
			if (superResponsibility != null)
				msgs = ((InternalEObject)superResponsibility).eInverseRemove(this, ResponsibilityMetaModelPackage.RESPONSIBILITY__SUB_RESPONSIBILITY, Responsibility.class, msgs);
			if (newSuperResponsibility != null)
				msgs = ((InternalEObject)newSuperResponsibility).eInverseAdd(this, ResponsibilityMetaModelPackage.RESPONSIBILITY__SUB_RESPONSIBILITY, Responsibility.class, msgs);
			msgs = basicSetSuperResponsibility(newSuperResponsibility, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ResponsibilityMetaModelPackage.RESPONSIBILITY_REQUIRED_RELATIONSHIP__SUPER_RESPONSIBILITY, newSuperResponsibility, newSuperResponsibility));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ResponsibilityMetaModelPackage.RESPONSIBILITY_REQUIRED_RELATIONSHIP__SUB_RRESPONSIBILITY:
				if (subRresponsibility != null)
					msgs = ((InternalEObject)subRresponsibility).eInverseRemove(this, ResponsibilityMetaModelPackage.RESPONSIBILITY__SUPER_RESPONSIBILITY, Responsibility.class, msgs);
				return basicSetSubRresponsibility((Responsibility)otherEnd, msgs);
			case ResponsibilityMetaModelPackage.RESPONSIBILITY_REQUIRED_RELATIONSHIP__SUPER_RESPONSIBILITY:
				if (superResponsibility != null)
					msgs = ((InternalEObject)superResponsibility).eInverseRemove(this, ResponsibilityMetaModelPackage.RESPONSIBILITY__SUB_RESPONSIBILITY, Responsibility.class, msgs);
				return basicSetSuperResponsibility((Responsibility)otherEnd, msgs);
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
			case ResponsibilityMetaModelPackage.RESPONSIBILITY_REQUIRED_RELATIONSHIP__SUB_RRESPONSIBILITY:
				return basicSetSubRresponsibility(null, msgs);
			case ResponsibilityMetaModelPackage.RESPONSIBILITY_REQUIRED_RELATIONSHIP__SUPER_RESPONSIBILITY:
				return basicSetSuperResponsibility(null, msgs);
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
			case ResponsibilityMetaModelPackage.RESPONSIBILITY_REQUIRED_RELATIONSHIP__SUB_RRESPONSIBILITY:
				if (resolve) return getSubRresponsibility();
				return basicGetSubRresponsibility();
			case ResponsibilityMetaModelPackage.RESPONSIBILITY_REQUIRED_RELATIONSHIP__SUPER_RESPONSIBILITY:
				if (resolve) return getSuperResponsibility();
				return basicGetSuperResponsibility();
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
			case ResponsibilityMetaModelPackage.RESPONSIBILITY_REQUIRED_RELATIONSHIP__SUB_RRESPONSIBILITY:
				setSubRresponsibility((Responsibility)newValue);
				return;
			case ResponsibilityMetaModelPackage.RESPONSIBILITY_REQUIRED_RELATIONSHIP__SUPER_RESPONSIBILITY:
				setSuperResponsibility((Responsibility)newValue);
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
			case ResponsibilityMetaModelPackage.RESPONSIBILITY_REQUIRED_RELATIONSHIP__SUB_RRESPONSIBILITY:
				setSubRresponsibility((Responsibility)null);
				return;
			case ResponsibilityMetaModelPackage.RESPONSIBILITY_REQUIRED_RELATIONSHIP__SUPER_RESPONSIBILITY:
				setSuperResponsibility((Responsibility)null);
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
			case ResponsibilityMetaModelPackage.RESPONSIBILITY_REQUIRED_RELATIONSHIP__SUB_RRESPONSIBILITY:
				return subRresponsibility != null;
			case ResponsibilityMetaModelPackage.RESPONSIBILITY_REQUIRED_RELATIONSHIP__SUPER_RESPONSIBILITY:
				return superResponsibility != null;
		}
		return super.eIsSet(featureID);
	}

} //responsibilityRequiredRelationshipImpl
