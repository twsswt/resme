/**
 */
package responsibilityMetaModel.impl;

import java.lang.reflect.InvocationTargetException;
import java.util.Collection;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;
import org.eclipse.emf.ecore.util.EObjectWithInverseResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;
import responsibilityMetaModel.Resource;
import responsibilityMetaModel.ResponsibilityMetaModelPackage;
import responsibilityMetaModel.resourceProducedRelationship;
import responsibilityMetaModel.resourceRequiredRelationship;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Resource</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link responsibilityMetaModel.impl.ResourceImpl#getName <em>Name</em>}</li>
 *   <li>{@link responsibilityMetaModel.impl.ResourceImpl#isEnabled <em>Enabled</em>}</li>
 *   <li>{@link responsibilityMetaModel.impl.ResourceImpl#isSatisifed <em>Satisifed</em>}</li>
 *   <li>{@link responsibilityMetaModel.impl.ResourceImpl#getSatisfactionCriteria <em>Satisfaction Criteria</em>}</li>
 *   <li>{@link responsibilityMetaModel.impl.ResourceImpl#isCritical <em>Critical</em>}</li>
 *   <li>{@link responsibilityMetaModel.impl.ResourceImpl#getRequiredBy <em>Required By</em>}</li>
 *   <li>{@link responsibilityMetaModel.impl.ResourceImpl#getProducedBy <em>Produced By</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ResourceImpl extends MinimalEObjectImpl.Container implements Resource {
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
	 * The default value of the '{@link #isSatisifed() <em>Satisifed</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSatisifed()
	 * @generated
	 * @ordered
	 */
	protected static final boolean SATISIFED_EDEFAULT = true;

	/**
	 * The cached value of the '{@link #isSatisifed() <em>Satisifed</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSatisifed()
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
	public boolean isSatisifed() {
		return satisifed;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSatisifed(boolean newSatisifed) {
		boolean oldSatisifed = satisifed;
		satisifed = newSatisifed;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ResponsibilityMetaModelPackage.RESOURCE__SATISIFED, oldSatisifed, satisifed));
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
			if (r.getResponsibility().isSatisifed()){
				satisifed = this.isEnabled();
				return this.isEnabled(); //we have found a satisfied producer
			}
		}
		satisifed = false;
		return false; //if no valid producers found, resource not satisfied
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
			case ResponsibilityMetaModelPackage.RESOURCE__SATISIFED:
				return isSatisifed();
			case ResponsibilityMetaModelPackage.RESOURCE__SATISFACTION_CRITERIA:
				return getSatisfactionCriteria();
			case ResponsibilityMetaModelPackage.RESOURCE__CRITICAL:
				return isCritical();
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
			case ResponsibilityMetaModelPackage.RESOURCE__SATISIFED:
				setSatisifed((Boolean)newValue);
				return;
			case ResponsibilityMetaModelPackage.RESOURCE__SATISFACTION_CRITERIA:
				setSatisfactionCriteria((String)newValue);
				return;
			case ResponsibilityMetaModelPackage.RESOURCE__CRITICAL:
				setCritical((Boolean)newValue);
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
			case ResponsibilityMetaModelPackage.RESOURCE__SATISIFED:
				setSatisifed(SATISIFED_EDEFAULT);
				return;
			case ResponsibilityMetaModelPackage.RESOURCE__SATISFACTION_CRITERIA:
				setSatisfactionCriteria(SATISFACTION_CRITERIA_EDEFAULT);
				return;
			case ResponsibilityMetaModelPackage.RESOURCE__CRITICAL:
				setCritical(CRITICAL_EDEFAULT);
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
			case ResponsibilityMetaModelPackage.RESOURCE__SATISIFED:
				return satisifed != SATISIFED_EDEFAULT;
			case ResponsibilityMetaModelPackage.RESOURCE__SATISFACTION_CRITERIA:
				return SATISFACTION_CRITERIA_EDEFAULT == null ? satisfactionCriteria != null : !SATISFACTION_CRITERIA_EDEFAULT.equals(satisfactionCriteria);
			case ResponsibilityMetaModelPackage.RESOURCE__CRITICAL:
				return critical != CRITICAL_EDEFAULT;
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
	public Object eInvoke(int operationID, EList<?> arguments) throws InvocationTargetException {
		switch (operationID) {
			case ResponsibilityMetaModelPackage.RESOURCE___SATISFIED:
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
		result.append(')');
		return result.toString();
	}

} //ResourceImpl
