/**
 */
package gestionmodelosconsultas.modeloconsultas.resultset.provider;


import gestionmodelosconsultas.modeloconsultas.resultset.ElementoModeloResultado;
import gestionmodelosconsultas.modeloconsultas.resultset.ResultsetPackage;

import gestionmodelosconsultas.modeloconsultas.resultset.resultcomo.ResultcomoFactory;

import gestionmodelosconsultas.modeloconsultas.resultset.resultdonde.ResultdondeFactory;

import gestionmodelosconsultas.modeloconsultas.resultset.resultque.ResultqueFactory;

import gestionmodelosconsultas.modeloconsultas.resultset.resultquien.ResultquienFactory;

import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EStructuralFeature;

import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ViewerNotification;

/**
 * This is the item provider adapter for a {@link gestionmodelosconsultas.modeloconsultas.resultset.ElementoModeloResultado} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class ElementoModeloResultadoItemProvider extends ResultElementItemProvider {
	/**
	 * This constructs an instance from a factory and a notifier.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ElementoModeloResultadoItemProvider(AdapterFactory adapterFactory) {
		super(adapterFactory);
	}

	/**
	 * This returns the property descriptors for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public List<IItemPropertyDescriptor> getPropertyDescriptors(Object object) {
		if (itemPropertyDescriptors == null) {
			super.getPropertyDescriptors(object);

			addKeyPropertyDescriptor(object);
		}
		return itemPropertyDescriptors;
	}

	/**
	 * This adds a property descriptor for the Key feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addKeyPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_ElementoModeloResultado_key_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_ElementoModeloResultado_key_feature", "_UI_ElementoModeloResultado_type"),
				 ResultsetPackage.Literals.ELEMENTO_MODELO_RESULTADO__KEY,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This specifies how to implement {@link #getChildren} and is used to deduce an appropriate feature for an
	 * {@link org.eclipse.emf.edit.command.AddCommand}, {@link org.eclipse.emf.edit.command.RemoveCommand} or
	 * {@link org.eclipse.emf.edit.command.MoveCommand} in {@link #createCommand}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Collection<? extends EStructuralFeature> getChildrenFeatures(Object object) {
		if (childrenFeatures == null) {
			super.getChildrenFeatures(object);
			childrenFeatures.add(ResultsetPackage.Literals.ELEMENTO_MODELO_RESULTADO__LIST_ELEMENTO_MODELO_RESULTADO);
		}
		return childrenFeatures;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EStructuralFeature getChildFeature(Object object, Object child) {
		// Check the type of the specified child object and return the proper feature to use for
		// adding (see {@link AddCommand}) it as a child.

		return super.getChildFeature(object, child);
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getText(Object object) {
		String label = ((ElementoModeloResultado)object).getKey();
		return label == null || label.length() == 0 ?
			getString("_UI_ElementoModeloResultado_type") :
			getString("_UI_ElementoModeloResultado_type") + " " + label;
	}
	

	/**
	 * This handles model notifications by calling {@link #updateChildren} to update any cached
	 * children and by creating a viewer notification, which it passes to {@link #fireNotifyChanged}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void notifyChanged(Notification notification) {
		updateChildren(notification);

		switch (notification.getFeatureID(ElementoModeloResultado.class)) {
			case ResultsetPackage.ELEMENTO_MODELO_RESULTADO__KEY:
				fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), false, true));
				return;
			case ResultsetPackage.ELEMENTO_MODELO_RESULTADO__LIST_ELEMENTO_MODELO_RESULTADO:
				fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), true, false));
				return;
		}
		super.notifyChanged(notification);
	}

	/**
	 * This adds {@link org.eclipse.emf.edit.command.CommandParameter}s describing the children
	 * that can be created under this object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected void collectNewChildDescriptors(Collection<Object> newChildDescriptors, Object object) {
		super.collectNewChildDescriptors(newChildDescriptors, object);

		newChildDescriptors.add
			(createChildParameter
				(ResultsetPackage.Literals.ELEMENTO_MODELO_RESULTADO__LIST_ELEMENTO_MODELO_RESULTADO,
				 ResultquienFactory.eINSTANCE.createActor()));

		newChildDescriptors.add
			(createChildParameter
				(ResultsetPackage.Literals.ELEMENTO_MODELO_RESULTADO__LIST_ELEMENTO_MODELO_RESULTADO,
				 ResultquienFactory.eINSTANCE.createUnidadOrganizacional()));

		newChildDescriptors.add
			(createChildParameter
				(ResultsetPackage.Literals.ELEMENTO_MODELO_RESULTADO__LIST_ELEMENTO_MODELO_RESULTADO,
				 ResultquienFactory.eINSTANCE.createRol()));

		newChildDescriptors.add
			(createChildParameter
				(ResultsetPackage.Literals.ELEMENTO_MODELO_RESULTADO__LIST_ELEMENTO_MODELO_RESULTADO,
				 ResultquienFactory.eINSTANCE.createContacto()));

		newChildDescriptors.add
			(createChildParameter
				(ResultsetPackage.Literals.ELEMENTO_MODELO_RESULTADO__LIST_ELEMENTO_MODELO_RESULTADO,
				 ResultqueFactory.eINSTANCE.createDocumento()));

		newChildDescriptors.add
			(createChildParameter
				(ResultsetPackage.Literals.ELEMENTO_MODELO_RESULTADO__LIST_ELEMENTO_MODELO_RESULTADO,
				 ResultqueFactory.eINSTANCE.createComunicacion()));

		newChildDescriptors.add
			(createChildParameter
				(ResultsetPackage.Literals.ELEMENTO_MODELO_RESULTADO__LIST_ELEMENTO_MODELO_RESULTADO,
				 ResultdondeFactory.eINSTANCE.createDeposito()));

		newChildDescriptors.add
			(createChildParameter
				(ResultsetPackage.Literals.ELEMENTO_MODELO_RESULTADO__LIST_ELEMENTO_MODELO_RESULTADO,
				 ResultdondeFactory.eINSTANCE.createDisco()));

		newChildDescriptors.add
			(createChildParameter
				(ResultsetPackage.Literals.ELEMENTO_MODELO_RESULTADO__LIST_ELEMENTO_MODELO_RESULTADO,
				 ResultdondeFactory.eINSTANCE.createArmario()));

		newChildDescriptors.add
			(createChildParameter
				(ResultsetPackage.Literals.ELEMENTO_MODELO_RESULTADO__LIST_ELEMENTO_MODELO_RESULTADO,
				 ResultcomoFactory.eINSTANCE.createInstanciaProceso()));

		newChildDescriptors.add
			(createChildParameter
				(ResultsetPackage.Literals.ELEMENTO_MODELO_RESULTADO__LIST_ELEMENTO_MODELO_RESULTADO,
				 ResultcomoFactory.eINSTANCE.createActividadProceso()));
	}

}
