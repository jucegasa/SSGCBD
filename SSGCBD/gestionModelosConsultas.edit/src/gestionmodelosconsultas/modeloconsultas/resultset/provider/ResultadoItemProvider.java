/**
 */
package gestionmodelosconsultas.modeloconsultas.resultset.provider;


import gestionmodelosconsultas.modeloconsultas.resultset.Resultado;
import gestionmodelosconsultas.modeloconsultas.resultset.ResultsetPackage;

import gestionmodelosconsultas.modeloconsultas.resultset.resultcomo.ResultcomoFactory;

import gestionmodelosconsultas.modeloconsultas.resultset.resultdonde.ResultdondeFactory;

import gestionmodelosconsultas.modeloconsultas.resultset.resultque.ResultqueFactory;

import gestionmodelosconsultas.modeloconsultas.resultset.resultquien.ResultquienFactory;

import gestionmodelosconsultas.provider.GestionModelosConsultasEditPlugin;

import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.ResourceLocator;

import org.eclipse.emf.ecore.EStructuralFeature;

import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.IEditingDomainItemProvider;
import org.eclipse.emf.edit.provider.IItemLabelProvider;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.IItemPropertySource;
import org.eclipse.emf.edit.provider.IStructuredItemContentProvider;
import org.eclipse.emf.edit.provider.ITreeItemContentProvider;
import org.eclipse.emf.edit.provider.ItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ItemProviderAdapter;
import org.eclipse.emf.edit.provider.ViewerNotification;

/**
 * This is the item provider adapter for a {@link gestionmodelosconsultas.modeloconsultas.resultset.Resultado} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class ResultadoItemProvider 
	extends ItemProviderAdapter
	implements
		IEditingDomainItemProvider,
		IStructuredItemContentProvider,
		ITreeItemContentProvider,
		IItemLabelProvider,
		IItemPropertySource {
	/**
	 * This constructs an instance from a factory and a notifier.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ResultadoItemProvider(AdapterFactory adapterFactory) {
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

			addNombrePropertyDescriptor(object);
		}
		return itemPropertyDescriptors;
	}

	/**
	 * This adds a property descriptor for the Nombre feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addNombrePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Resultado_nombre_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Resultado_nombre_feature", "_UI_Resultado_type"),
				 ResultsetPackage.Literals.RESULTADO__NOMBRE,
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
			childrenFeatures.add(ResultsetPackage.Literals.RESULTADO__LIST_RESULT_ELEMENT);
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
	 * This returns Resultado.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/Resultado"));
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getText(Object object) {
		String label = ((Resultado)object).getNombre();
		return label == null || label.length() == 0 ?
			getString("_UI_Resultado_type") :
			getString("_UI_Resultado_type") + " " + label;
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

		switch (notification.getFeatureID(Resultado.class)) {
			case ResultsetPackage.RESULTADO__NOMBRE:
				fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), false, true));
				return;
			case ResultsetPackage.RESULTADO__LIST_RESULT_ELEMENT:
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
				(ResultsetPackage.Literals.RESULTADO__LIST_RESULT_ELEMENT,
				 ResultquienFactory.eINSTANCE.createActor()));

		newChildDescriptors.add
			(createChildParameter
				(ResultsetPackage.Literals.RESULTADO__LIST_RESULT_ELEMENT,
				 ResultquienFactory.eINSTANCE.createUnidadOrganizacional()));

		newChildDescriptors.add
			(createChildParameter
				(ResultsetPackage.Literals.RESULTADO__LIST_RESULT_ELEMENT,
				 ResultquienFactory.eINSTANCE.createRol()));

		newChildDescriptors.add
			(createChildParameter
				(ResultsetPackage.Literals.RESULTADO__LIST_RESULT_ELEMENT,
				 ResultquienFactory.eINSTANCE.createContacto()));

		newChildDescriptors.add
			(createChildParameter
				(ResultsetPackage.Literals.RESULTADO__LIST_RESULT_ELEMENT,
				 ResultqueFactory.eINSTANCE.createDocumento()));

		newChildDescriptors.add
			(createChildParameter
				(ResultsetPackage.Literals.RESULTADO__LIST_RESULT_ELEMENT,
				 ResultqueFactory.eINSTANCE.createComunicacion()));

		newChildDescriptors.add
			(createChildParameter
				(ResultsetPackage.Literals.RESULTADO__LIST_RESULT_ELEMENT,
				 ResultdondeFactory.eINSTANCE.createDeposito()));

		newChildDescriptors.add
			(createChildParameter
				(ResultsetPackage.Literals.RESULTADO__LIST_RESULT_ELEMENT,
				 ResultdondeFactory.eINSTANCE.createDisco()));

		newChildDescriptors.add
			(createChildParameter
				(ResultsetPackage.Literals.RESULTADO__LIST_RESULT_ELEMENT,
				 ResultdondeFactory.eINSTANCE.createArmario()));

		newChildDescriptors.add
			(createChildParameter
				(ResultsetPackage.Literals.RESULTADO__LIST_RESULT_ELEMENT,
				 ResultcomoFactory.eINSTANCE.createInstanciaProceso()));

		newChildDescriptors.add
			(createChildParameter
				(ResultsetPackage.Literals.RESULTADO__LIST_RESULT_ELEMENT,
				 ResultcomoFactory.eINSTANCE.createActividadProceso()));
	}

	/**
	 * Return the resource locator for this item provider's resources.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ResourceLocator getResourceLocator() {
		return GestionModelosConsultasEditPlugin.INSTANCE;
	}

}
