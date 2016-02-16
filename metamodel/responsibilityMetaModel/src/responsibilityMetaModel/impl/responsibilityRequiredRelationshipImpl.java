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
 *   <li>{@link responsibilityMetaModel.impl.responsibilityRequiredRelationshipImpl#getSubResponsibility <em>Sub Responsibility</em>}</li>
 *   <li>{@link responsibilityMetaModel.impl.responsibilityRequiredRelationshipImpl#getSuperResponsibility <em>Super Responsibility</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class responsibilityRequiredRelationshipImpl extends MinimalEObjectImpl.Container implements responsibilityRequiredRelationship {
	/**
	 * The cached value of the '{@link #getSubResponsibility() <em>Sub Responsibility</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSubResponsibility()
	 * @generated
	 * @ordered
	 */
	protected Responsibility subResponsibility;

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
	public Responsibility getSubResponsibility() {
		if (subResponsibility != null && subResponsibility.eIsProxy()) {
			InternalEObject oldSubResponsibility = (InternalEObject)subResponsibility;
			subResponsibility = (Responsibility)eResolveProxy(oldSubResponsibility);
			if (subResponsibility != oldSubResponsibility) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ResponsibilityMetaModelPackage.RESPONSIBILITY_REQUIRED_RELATIONSHIP__SUB_RESPONSIBILITY, oldSubResponsibility, subResponsibility));
			}
		}
		return subResponsibility;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Responsibility basicGetSubResponsibility() {
		return subResponsibility;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSubResponsibility(Responsibility newSubResponsibility, NotificationChain msgs) {
		Responsibility oldSubResponsibility = subResponsibility;
		subResponsibility = newSubResponsibility;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ResponsibilityMetaModelPackage.RESPONSIBILITY_REQUIRED_RELATIONSHIP__SUB_RESPONSIBILITY, oldSubResponsibility, newSubResponsibility);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSubResponsibility(Responsibility newSubResponsibility) {
		if (newSubResponsibility != subResponsibility) {
			NotificationChain msgs = null;
			if (subResponsibility != null)
				msgs = ((InternalEObject)subResponsibility).eInverseRemove(this, ResponsibilityMetaModelPackage.RESPONSIBILITY__SUPER_RESPONSIBILITY, Responsibility.class, msgs);
			if (newSubResponsibility != null)
				msgs = ((InternalEObject)newSubResponsibility).eInverseAdd(this, ResponsibilityMetaModelPackage.RESPONSIBILITY__SUPER_RESPONSIBILITY, Responsibility.class, msgs);
			msgs = basicSetSubResponsibility(newSubResponsibility, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ResponsibilityMetaModelPackage.RESPONSIBILITY_REQUIRED_RELATIONSHIP__SUB_RESPONSIBILITY, newSubResponsibility, newSubResponsibility));
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
			case ResponsibilityMetaModelPackage.RESPONSIBILITY_REQUIRED_RELATIONSHIP__SUB_RESPONSIBILITY:
				if (subResponsibility != null)
					msgs = ((InternalEObject)subResponsibility).eInverseRemove(this, ResponsibilityMetaModelPackage.RESPONSIBILITY__SUPER_RESPONSIBILITY, Responsibility.class, msgs);
				return basicSetSubResponsibility((Responsibility)otherEnd, msgs);
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
			case ResponsibilityMetaModelPackage.RESPONSIBILITY_REQUIRED_RELATIONSHIP__SUB_RESPONSIBILITY:
				return basicSetSubResponsibility(null, msgs);
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
			case ResponsibilityMetaModelPackage.RESPONSIBILITY_REQUIRED_RELATIONSHIP__SUB_RESPONSIBILITY:
				if (resolve) return getSubResponsibility();
				return basicGetSubResponsibility();
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
			case ResponsibilityMetaModelPackage.RESPONSIBILITY_REQUIRED_RELATIONSHIP__SUB_RESPONSIBILITY:
				setSubResponsibility((Responsibility)newValue);
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
			case ResponsibilityMetaModelPackage.RESPONSIBILITY_REQUIRED_RELATIONSHIP__SUB_RESPONSIBILITY:
				setSubResponsibility((Responsibility)null);
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
			case ResponsibilityMetaModelPackage.RESPONSIBILITY_REQUIRED_RELATIONSHIP__SUB_RESPONSIBILITY:
				return subResponsibility != null;
			case ResponsibilityMetaModelPackage.RESPONSIBILITY_REQUIRED_RELATIONSHIP__SUPER_RESPONSIBILITY:
				return superResponsibility != null;
		}
		return super.eIsSet(featureID);
	}

} //responsibilityRequiredRelationshipImpl
