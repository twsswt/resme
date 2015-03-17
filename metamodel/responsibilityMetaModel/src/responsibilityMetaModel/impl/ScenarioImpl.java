/**
 */
package responsibilityMetaModel.impl;

import java.lang.reflect.InvocationTargetException;
import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.UniqueEList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;
import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import responsibilityMetaModel.Actor;
import responsibilityMetaModel.Entity;
import responsibilityMetaModel.Relation;
import responsibilityMetaModel.Resource;
import responsibilityMetaModel.Responsibility;
import responsibilityMetaModel.ResponsibilityMetaModelPackage;
import responsibilityMetaModel.Scenario;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Scenario</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link responsibilityMetaModel.impl.ScenarioImpl#getResources <em>Resources</em>}</li>
 *   <li>{@link responsibilityMetaModel.impl.ScenarioImpl#getResponsibilities <em>Responsibilities</em>}</li>
 *   <li>{@link responsibilityMetaModel.impl.ScenarioImpl#getActors <em>Actors</em>}</li>
 *   <li>{@link responsibilityMetaModel.impl.ScenarioImpl#getRelations <em>Relations</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ScenarioImpl extends MinimalEObjectImpl.Container implements Scenario {
	/**
	 * The cached value of the '{@link #getResources() <em>Resources</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getResources()
	 * @generated
	 * @ordered
	 */
	protected EList<Resource> resources;

	/**
	 * The cached value of the '{@link #getResponsibilities() <em>Responsibilities</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getResponsibilities()
	 * @generated
	 * @ordered
	 */
	protected EList<Responsibility> responsibilities;

	/**
	 * The cached value of the '{@link #getActors() <em>Actors</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getActors()
	 * @generated
	 * @ordered
	 */
	protected EList<Actor> actors;

	/**
	 * The cached value of the '{@link #getRelations() <em>Relations</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRelations()
	 * @generated
	 * @ordered
	 */
	protected EList<Relation> relations;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ScenarioImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ResponsibilityMetaModelPackage.Literals.SCENARIO;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Resource> getResources() {
		if (resources == null) {
			resources = new EObjectContainmentEList<Resource>(Resource.class, this, ResponsibilityMetaModelPackage.SCENARIO__RESOURCES);
		}
		return resources;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Responsibility> getResponsibilities() {
		if (responsibilities == null) {
			responsibilities = new EObjectContainmentEList<Responsibility>(Responsibility.class, this, ResponsibilityMetaModelPackage.SCENARIO__RESPONSIBILITIES);
		}
		return responsibilities;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Actor> getActors() {
		if (actors == null) {
			actors = new EObjectContainmentEList<Actor>(Actor.class, this, ResponsibilityMetaModelPackage.SCENARIO__ACTORS);
		}
		return actors;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Relation> getRelations() {
		if (relations == null) {
			relations = new EObjectContainmentEList<Relation>(Relation.class, this, ResponsibilityMetaModelPackage.SCENARIO__RELATIONS);
		}
		return relations;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 */
	public EList<Entity> getEntities() {
		
		EList<Entity> entityList = new UniqueEList<Entity>();
		
		entityList.addAll(getActors());
		entityList.addAll(getResources());
		entityList.addAll(getResponsibilities());
		
		return entityList;


	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 */
	public void criticalityAnalysis() {
		// TODO: implement this method

		//The plan here is to examine each type of entity
		//Determine which is the most critical
		//and set the flag on it
		
		//Not perfect as only 1-deep, but potentially cycle problems
		
		int count = 0;
		int max = 0;
		for (Resource r: resources){
			r.setCritical(false);
			count = r.getRequiredBy().size();
			if (count>max){
				max = count;
			}
		}
		for (Resource r: resources){
			if (r.getRequiredBy().size() == max){
				r.setCritical(true);
			}
		}
		
		//Copy paste, because I am lazy
		
		count = 0;
		max = 0;
		for (Actor a: actors){
			a.setCritical(false);
			count = a.getRequiredBy().size();
			if (count>max){
				max = count;
			}
		}
		for (Actor a: actors){
			if (a.getRequiredBy().size() == max){
				a.setCritical(true);
			}
		}
		
		count = 0;
		max = 0;
		for (Responsibility r: responsibilities){
			r.setCritical(false);
			count = r.getSuperResponsibility().size()+r.getProducedResource().size();
			if (count>max){
				max = count;
			}
		}
		for (Responsibility r: responsibilities){
			count = r.getSuperResponsibility().size()+r.getProducedResource().size();
			if (count == max){
				r.setCritical(true);
			}
		}
		
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ResponsibilityMetaModelPackage.SCENARIO__RESOURCES:
				return ((InternalEList<?>)getResources()).basicRemove(otherEnd, msgs);
			case ResponsibilityMetaModelPackage.SCENARIO__RESPONSIBILITIES:
				return ((InternalEList<?>)getResponsibilities()).basicRemove(otherEnd, msgs);
			case ResponsibilityMetaModelPackage.SCENARIO__ACTORS:
				return ((InternalEList<?>)getActors()).basicRemove(otherEnd, msgs);
			case ResponsibilityMetaModelPackage.SCENARIO__RELATIONS:
				return ((InternalEList<?>)getRelations()).basicRemove(otherEnd, msgs);
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
			case ResponsibilityMetaModelPackage.SCENARIO__RESOURCES:
				return getResources();
			case ResponsibilityMetaModelPackage.SCENARIO__RESPONSIBILITIES:
				return getResponsibilities();
			case ResponsibilityMetaModelPackage.SCENARIO__ACTORS:
				return getActors();
			case ResponsibilityMetaModelPackage.SCENARIO__RELATIONS:
				return getRelations();
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
			case ResponsibilityMetaModelPackage.SCENARIO__RESOURCES:
				getResources().clear();
				getResources().addAll((Collection<? extends Resource>)newValue);
				return;
			case ResponsibilityMetaModelPackage.SCENARIO__RESPONSIBILITIES:
				getResponsibilities().clear();
				getResponsibilities().addAll((Collection<? extends Responsibility>)newValue);
				return;
			case ResponsibilityMetaModelPackage.SCENARIO__ACTORS:
				getActors().clear();
				getActors().addAll((Collection<? extends Actor>)newValue);
				return;
			case ResponsibilityMetaModelPackage.SCENARIO__RELATIONS:
				getRelations().clear();
				getRelations().addAll((Collection<? extends Relation>)newValue);
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
			case ResponsibilityMetaModelPackage.SCENARIO__RESOURCES:
				getResources().clear();
				return;
			case ResponsibilityMetaModelPackage.SCENARIO__RESPONSIBILITIES:
				getResponsibilities().clear();
				return;
			case ResponsibilityMetaModelPackage.SCENARIO__ACTORS:
				getActors().clear();
				return;
			case ResponsibilityMetaModelPackage.SCENARIO__RELATIONS:
				getRelations().clear();
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
			case ResponsibilityMetaModelPackage.SCENARIO__RESOURCES:
				return resources != null && !resources.isEmpty();
			case ResponsibilityMetaModelPackage.SCENARIO__RESPONSIBILITIES:
				return responsibilities != null && !responsibilities.isEmpty();
			case ResponsibilityMetaModelPackage.SCENARIO__ACTORS:
				return actors != null && !actors.isEmpty();
			case ResponsibilityMetaModelPackage.SCENARIO__RELATIONS:
				return relations != null && !relations.isEmpty();
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
			case ResponsibilityMetaModelPackage.SCENARIO___GET_ENTITIES:
				return getEntities();
			case ResponsibilityMetaModelPackage.SCENARIO___CRITICALITY_ANALYSIS:
				criticalityAnalysis();
				return null;
		}
		return super.eInvoke(operationID, arguments);
	}

} //ScenarioImpl
