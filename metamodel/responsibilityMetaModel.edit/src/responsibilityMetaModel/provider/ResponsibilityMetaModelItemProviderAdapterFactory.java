/**
 */
package responsibilityMetaModel.provider;

import java.util.ArrayList;
import java.util.Collection;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.edit.provider.ChangeNotifier;
import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.ComposedAdapterFactory;
import org.eclipse.emf.edit.provider.IChangeNotifier;
import org.eclipse.emf.edit.provider.IDisposable;
import org.eclipse.emf.edit.provider.IEditingDomainItemProvider;
import org.eclipse.emf.edit.provider.IItemLabelProvider;
import org.eclipse.emf.edit.provider.IItemPropertySource;
import org.eclipse.emf.edit.provider.INotifyChangedListener;
import org.eclipse.emf.edit.provider.IStructuredItemContentProvider;
import org.eclipse.emf.edit.provider.ITreeItemContentProvider;

import responsibilityMetaModel.util.ResponsibilityMetaModelAdapterFactory;

/**
 * This is the factory that is used to provide the interfaces needed to support Viewers.
 * The adapters generated by this factory convert EMF adapter notifications into calls to {@link #fireNotifyChanged fireNotifyChanged}.
 * The adapters also support Eclipse property sheets.
 * Note that most of the adapters are shared among multiple instances.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class ResponsibilityMetaModelItemProviderAdapterFactory extends ResponsibilityMetaModelAdapterFactory implements ComposeableAdapterFactory, IChangeNotifier, IDisposable {
	/**
	 * This keeps track of the root adapter factory that delegates to this adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ComposedAdapterFactory parentAdapterFactory;

	/**
	 * This is used to implement {@link org.eclipse.emf.edit.provider.IChangeNotifier}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected IChangeNotifier changeNotifier = new ChangeNotifier();

	/**
	 * This keeps track of all the supported types checked by {@link #isFactoryForType isFactoryForType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Collection<Object> supportedTypes = new ArrayList<Object>();

	/**
	 * This constructs an instance.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ResponsibilityMetaModelItemProviderAdapterFactory() {
		supportedTypes.add(IEditingDomainItemProvider.class);
		supportedTypes.add(IStructuredItemContentProvider.class);
		supportedTypes.add(ITreeItemContentProvider.class);
		supportedTypes.add(IItemLabelProvider.class);
		supportedTypes.add(IItemPropertySource.class);
	}

	/**
	 * This keeps track of the one adapter used for all {@link responsibilityMetaModel.Responsibility} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ResponsibilityItemProvider responsibilityItemProvider;

	/**
	 * This creates an adapter for a {@link responsibilityMetaModel.Responsibility}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createResponsibilityAdapter() {
		if (responsibilityItemProvider == null) {
			responsibilityItemProvider = new ResponsibilityItemProvider(this);
		}

		return responsibilityItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link responsibilityMetaModel.Resource} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ResourceItemProvider resourceItemProvider;

	/**
	 * This creates an adapter for a {@link responsibilityMetaModel.Resource}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createResourceAdapter() {
		if (resourceItemProvider == null) {
			resourceItemProvider = new ResourceItemProvider(this);
		}

		return resourceItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link responsibilityMetaModel.Actor} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ActorItemProvider actorItemProvider;

	/**
	 * This creates an adapter for a {@link responsibilityMetaModel.Actor}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createActorAdapter() {
		if (actorItemProvider == null) {
			actorItemProvider = new ActorItemProvider(this);
		}

		return actorItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link responsibilityMetaModel.Scenario} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ScenarioItemProvider scenarioItemProvider;

	/**
	 * This creates an adapter for a {@link responsibilityMetaModel.Scenario}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createScenarioAdapter() {
		if (scenarioItemProvider == null) {
			scenarioItemProvider = new ScenarioItemProvider(this);
		}

		return scenarioItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link responsibilityMetaModel.resourceRequiredRelationship} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected resourceRequiredRelationshipItemProvider resourceRequiredRelationshipItemProvider;

	/**
	 * This creates an adapter for a {@link responsibilityMetaModel.resourceRequiredRelationship}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createresourceRequiredRelationshipAdapter() {
		if (resourceRequiredRelationshipItemProvider == null) {
			resourceRequiredRelationshipItemProvider = new resourceRequiredRelationshipItemProvider(this);
		}

		return resourceRequiredRelationshipItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link responsibilityMetaModel.resourceProducedRelationship} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected resourceProducedRelationshipItemProvider resourceProducedRelationshipItemProvider;

	/**
	 * This creates an adapter for a {@link responsibilityMetaModel.resourceProducedRelationship}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createresourceProducedRelationshipAdapter() {
		if (resourceProducedRelationshipItemProvider == null) {
			resourceProducedRelationshipItemProvider = new resourceProducedRelationshipItemProvider(this);
		}

		return resourceProducedRelationshipItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link responsibilityMetaModel.actorRequiredRelationship} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected actorRequiredRelationshipItemProvider actorRequiredRelationshipItemProvider;

	/**
	 * This creates an adapter for a {@link responsibilityMetaModel.actorRequiredRelationship}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createactorRequiredRelationshipAdapter() {
		if (actorRequiredRelationshipItemProvider == null) {
			actorRequiredRelationshipItemProvider = new actorRequiredRelationshipItemProvider(this);
		}

		return actorRequiredRelationshipItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link responsibilityMetaModel.actorHoldsRelationship} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected actorHoldsRelationshipItemProvider actorHoldsRelationshipItemProvider;

	/**
	 * This creates an adapter for a {@link responsibilityMetaModel.actorHoldsRelationship}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createactorHoldsRelationshipAdapter() {
		if (actorHoldsRelationshipItemProvider == null) {
			actorHoldsRelationshipItemProvider = new actorHoldsRelationshipItemProvider(this);
		}

		return actorHoldsRelationshipItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link responsibilityMetaModel.responsibilityRequiredRelationship} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected responsibilityRequiredRelationshipItemProvider responsibilityRequiredRelationshipItemProvider;

	/**
	 * This creates an adapter for a {@link responsibilityMetaModel.responsibilityRequiredRelationship}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createresponsibilityRequiredRelationshipAdapter() {
		if (responsibilityRequiredRelationshipItemProvider == null) {
			responsibilityRequiredRelationshipItemProvider = new responsibilityRequiredRelationshipItemProvider(this);
		}

		return responsibilityRequiredRelationshipItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link responsibilityMetaModel.actorProducedRelationship} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected actorProducedRelationshipItemProvider actorProducedRelationshipItemProvider;

	/**
	 * This creates an adapter for a {@link responsibilityMetaModel.actorProducedRelationship}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createactorProducedRelationshipAdapter() {
		if (actorProducedRelationshipItemProvider == null) {
			actorProducedRelationshipItemProvider = new actorProducedRelationshipItemProvider(this);
		}

		return actorProducedRelationshipItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link responsibilityMetaModel.Source} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SourceItemProvider sourceItemProvider;

	/**
	 * This creates an adapter for a {@link responsibilityMetaModel.Source}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createSourceAdapter() {
		if (sourceItemProvider == null) {
			sourceItemProvider = new SourceItemProvider(this);
		}

		return sourceItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link responsibilityMetaModel.attributionRelationship} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected attributionRelationshipItemProvider attributionRelationshipItemProvider;

	/**
	 * This creates an adapter for a {@link responsibilityMetaModel.attributionRelationship}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createattributionRelationshipAdapter() {
		if (attributionRelationshipItemProvider == null) {
			attributionRelationshipItemProvider = new attributionRelationshipItemProvider(this);
		}

		return attributionRelationshipItemProvider;
	}

	/**
	 * This returns the root adapter factory that contains this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ComposeableAdapterFactory getRootAdapterFactory() {
		return parentAdapterFactory == null ? this : parentAdapterFactory.getRootAdapterFactory();
	}

	/**
	 * This sets the composed adapter factory that contains this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setParentAdapterFactory(ComposedAdapterFactory parentAdapterFactory) {
		this.parentAdapterFactory = parentAdapterFactory;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isFactoryForType(Object type) {
		return supportedTypes.contains(type) || super.isFactoryForType(type);
	}

	/**
	 * This implementation substitutes the factory itself as the key for the adapter.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter adapt(Notifier notifier, Object type) {
		return super.adapt(notifier, this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object adapt(Object object, Object type) {
		if (isFactoryForType(type)) {
			Object adapter = super.adapt(object, type);
			if (!(type instanceof Class<?>) || (((Class<?>)type).isInstance(adapter))) {
				return adapter;
			}
		}

		return null;
	}

	/**
	 * This adds a listener.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void addListener(INotifyChangedListener notifyChangedListener) {
		changeNotifier.addListener(notifyChangedListener);
	}

	/**
	 * This removes a listener.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void removeListener(INotifyChangedListener notifyChangedListener) {
		changeNotifier.removeListener(notifyChangedListener);
	}

	/**
	 * This delegates to {@link #changeNotifier} and to {@link #parentAdapterFactory}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void fireNotifyChanged(Notification notification) {
		changeNotifier.fireNotifyChanged(notification);

		if (parentAdapterFactory != null) {
			parentAdapterFactory.fireNotifyChanged(notification);
		}
	}

	/**
	 * This disposes all of the item providers created by this factory. 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void dispose() {
		if (responsibilityItemProvider != null) responsibilityItemProvider.dispose();
		if (resourceItemProvider != null) resourceItemProvider.dispose();
		if (actorItemProvider != null) actorItemProvider.dispose();
		if (scenarioItemProvider != null) scenarioItemProvider.dispose();
		if (resourceRequiredRelationshipItemProvider != null) resourceRequiredRelationshipItemProvider.dispose();
		if (resourceProducedRelationshipItemProvider != null) resourceProducedRelationshipItemProvider.dispose();
		if (actorRequiredRelationshipItemProvider != null) actorRequiredRelationshipItemProvider.dispose();
		if (actorHoldsRelationshipItemProvider != null) actorHoldsRelationshipItemProvider.dispose();
		if (responsibilityRequiredRelationshipItemProvider != null) responsibilityRequiredRelationshipItemProvider.dispose();
		if (actorProducedRelationshipItemProvider != null) actorProducedRelationshipItemProvider.dispose();
		if (sourceItemProvider != null) sourceItemProvider.dispose();
		if (attributionRelationshipItemProvider != null) attributionRelationshipItemProvider.dispose();
	}

}
