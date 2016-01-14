/**
 */
package responsibilityMetaModel.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import responsibilityMetaModel.Resource;
import responsibilityMetaModel.Responsibility;
import responsibilityMetaModel.ResponsibilityMetaModelPackage;
import responsibilityMetaModel.resourceProducedRelationship;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>resource Produced Relationship</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link responsibilityMetaModel.impl.resourceProducedRelationshipImpl#getResponsibility <em>Responsibility</em>}</li>
 *   <li>{@link responsibilityMetaModel.impl.resourceProducedRelationshipImpl#getResource <em>Resource</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class resourceProducedRelationshipImpl extends MinimalEObjectImpl.Container implements resourceProducedRelationship {
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
	 * The cached value of the '{@link #getResource() <em>Resource</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getResource()
	 * @generated
	 * @ordered
	 */
	protected Resource resource;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected resourceProducedRelationshipImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ResponsibilityMetaModelPackage.Literals.RESOURCE_PRODUCED_RELATIONSHIP;
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
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ResponsibilityMetaModelPackage.RESOURCE_PRODUCED_RELATIONSHIP__RESPONSIBILITY, oldResponsibility, responsibility));
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ResponsibilityMetaModelPackage.RESOURCE_PRODUCED_RELATIONSHIP__RESPONSIBILITY, oldResponsibility, newResponsibility);
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
				msgs = ((InternalEObject)responsibility).eInverseRemove(this, ResponsibilityMetaModelPackage.RESPONSIBILITY__PRODUCED_RESOURCE, Responsibility.class, msgs);
			if (newResponsibility != null)
				msgs = ((InternalEObject)newResponsibility).eInverseAdd(this, ResponsibilityMetaModelPackage.RESPONSIBILITY__PRODUCED_RESOURCE, Responsibility.class, msgs);
			msgs = basicSetResponsibility(newResponsibility, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ResponsibilityMetaModelPackage.RESOURCE_PRODUCED_RELATIONSHIP__RESPONSIBILITY, newResponsibility, newResponsibility));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Resource getResource() {
		if (resource != null && resource.eIsProxy()) {
			InternalEObject oldResource = (InternalEObject)resource;
			resource = (Resource)eResolveProxy(oldResource);
			if (resource != oldResource) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ResponsibilityMetaModelPackage.RESOURCE_PRODUCED_RELATIONSHIP__RESOURCE, oldResource, resource));
			}
		}
		return resource;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Resource basicGetResource() {
		return resource;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetResource(Resource newResource, NotificationChain msgs) {
		Resource oldResource = resource;
		resource = newResource;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ResponsibilityMetaModelPackage.RESOURCE_PRODUCED_RELATIONSHIP__RESOURCE, oldResource, newResource);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setResource(Resource newResource) {
		if (newResource != resource) {
			NotificationChain msgs = null;
			if (resource != null)
				msgs = ((InternalEObject)resource).eInverseRemove(this, ResponsibilityMetaModelPackage.RESOURCE__PRODUCED_BY, Resource.class, msgs);
			if (newResource != null)
				msgs = ((InternalEObject)newResource).eInverseAdd(this, ResponsibilityMetaModelPackage.RESOURCE__PRODUCED_BY, Resource.class, msgs);
			msgs = basicSetResource(newResource, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ResponsibilityMetaModelPackage.RESOURCE_PRODUCED_RELATIONSHIP__RESOURCE, newResource, newResource));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ResponsibilityMetaModelPackage.RESOURCE_PRODUCED_RELATIONSHIP__RESPONSIBILITY:
				if (responsibility != null)
					msgs = ((InternalEObject)responsibility).eInverseRemove(this, ResponsibilityMetaModelPackage.RESPONSIBILITY__PRODUCED_RESOURCE, Responsibility.class, msgs);
				return basicSetResponsibility((Responsibility)otherEnd, msgs);
			case ResponsibilityMetaModelPackage.RESOURCE_PRODUCED_RELATIONSHIP__RESOURCE:
				if (resource != null)
					msgs = ((InternalEObject)resource).eInverseRemove(this, ResponsibilityMetaModelPackage.RESOURCE__PRODUCED_BY, Resource.class, msgs);
				return basicSetResource((Resource)otherEnd, msgs);
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
			case ResponsibilityMetaModelPackage.RESOURCE_PRODUCED_RELATIONSHIP__RESPONSIBILITY:
				return basicSetResponsibility(null, msgs);
			case ResponsibilityMetaModelPackage.RESOURCE_PRODUCED_RELATIONSHIP__RESOURCE:
				return basicSetResource(null, msgs);
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
			case ResponsibilityMetaModelPackage.RESOURCE_PRODUCED_RELATIONSHIP__RESPONSIBILITY:
				if (resolve) return getResponsibility();
				return basicGetResponsibility();
			case ResponsibilityMetaModelPackage.RESOURCE_PRODUCED_RELATIONSHIP__RESOURCE:
				if (resolve) return getResource();
				return basicGetResource();
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
			case ResponsibilityMetaModelPackage.RESOURCE_PRODUCED_RELATIONSHIP__RESPONSIBILITY:
				setResponsibility((Responsibility)newValue);
				return;
			case ResponsibilityMetaModelPackage.RESOURCE_PRODUCED_RELATIONSHIP__RESOURCE:
				setResource((Resource)newValue);
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
			case ResponsibilityMetaModelPackage.RESOURCE_PRODUCED_RELATIONSHIP__RESPONSIBILITY:
				setResponsibility((Responsibility)null);
				return;
			case ResponsibilityMetaModelPackage.RESOURCE_PRODUCED_RELATIONSHIP__RESOURCE:
				setResource((Resource)null);
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
			case ResponsibilityMetaModelPackage.RESOURCE_PRODUCED_RELATIONSHIP__RESPONSIBILITY:
				return responsibility != null;
			case ResponsibilityMetaModelPackage.RESOURCE_PRODUCED_RELATIONSHIP__RESOURCE:
				return resource != null;
		}
		return super.eIsSet(featureID);
	}

} //resourceProducedRelationshipImpl
