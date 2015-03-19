/**
 */
package responsibilityMetaModel.impl;

import java.lang.reflect.InvocationTargetException;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import responsibilityMetaModel.Entity;
import responsibilityMetaModel.ResponsibilityMetaModelPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Entity</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link responsibilityMetaModel.impl.EntityImpl#getName <em>Name</em>}</li>
 *   <li>{@link responsibilityMetaModel.impl.EntityImpl#isEnabled <em>Enabled</em>}</li>
 *   <li>{@link responsibilityMetaModel.impl.EntityImpl#isSatisifed <em>Satisifed</em>}</li>
 *   <li>{@link responsibilityMetaModel.impl.EntityImpl#getSatisfactionCriteria <em>Satisfaction Criteria</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public abstract class EntityImpl extends MinimalEObjectImpl.Container implements Entity {
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
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EntityImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ResponsibilityMetaModelPackage.Literals.ENTITY;
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
			eNotify(new ENotificationImpl(this, Notification.SET, ResponsibilityMetaModelPackage.ENTITY__NAME, oldName, name));
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
			eNotify(new ENotificationImpl(this, Notification.SET, ResponsibilityMetaModelPackage.ENTITY__ENABLED, oldEnabled, enabled));
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
			eNotify(new ENotificationImpl(this, Notification.SET, ResponsibilityMetaModelPackage.ENTITY__SATISIFED, oldSatisifed, satisifed));
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
			eNotify(new ENotificationImpl(this, Notification.SET, ResponsibilityMetaModelPackage.ENTITY__SATISFACTION_CRITERIA, oldSatisfactionCriteria, satisfactionCriteria));
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
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case ResponsibilityMetaModelPackage.ENTITY__NAME:
				return getName();
			case ResponsibilityMetaModelPackage.ENTITY__ENABLED:
				return isEnabled();
			case ResponsibilityMetaModelPackage.ENTITY__SATISIFED:
				return isSatisifed();
			case ResponsibilityMetaModelPackage.ENTITY__SATISFACTION_CRITERIA:
				return getSatisfactionCriteria();
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
			case ResponsibilityMetaModelPackage.ENTITY__NAME:
				setName((String)newValue);
				return;
			case ResponsibilityMetaModelPackage.ENTITY__ENABLED:
				setEnabled((Boolean)newValue);
				return;
			case ResponsibilityMetaModelPackage.ENTITY__SATISIFED:
				setSatisifed((Boolean)newValue);
				return;
			case ResponsibilityMetaModelPackage.ENTITY__SATISFACTION_CRITERIA:
				setSatisfactionCriteria((String)newValue);
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
			case ResponsibilityMetaModelPackage.ENTITY__NAME:
				setName(NAME_EDEFAULT);
				return;
			case ResponsibilityMetaModelPackage.ENTITY__ENABLED:
				setEnabled(ENABLED_EDEFAULT);
				return;
			case ResponsibilityMetaModelPackage.ENTITY__SATISIFED:
				setSatisifed(SATISIFED_EDEFAULT);
				return;
			case ResponsibilityMetaModelPackage.ENTITY__SATISFACTION_CRITERIA:
				setSatisfactionCriteria(SATISFACTION_CRITERIA_EDEFAULT);
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
			case ResponsibilityMetaModelPackage.ENTITY__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case ResponsibilityMetaModelPackage.ENTITY__ENABLED:
				return enabled != ENABLED_EDEFAULT;
			case ResponsibilityMetaModelPackage.ENTITY__SATISIFED:
				return satisifed != SATISIFED_EDEFAULT;
			case ResponsibilityMetaModelPackage.ENTITY__SATISFACTION_CRITERIA:
				return SATISFACTION_CRITERIA_EDEFAULT == null ? satisfactionCriteria != null : !SATISFACTION_CRITERIA_EDEFAULT.equals(satisfactionCriteria);
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
			case ResponsibilityMetaModelPackage.ENTITY___SATISFIED:
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
		result.append(')');
		return result.toString();
	}

} //EntityImpl
