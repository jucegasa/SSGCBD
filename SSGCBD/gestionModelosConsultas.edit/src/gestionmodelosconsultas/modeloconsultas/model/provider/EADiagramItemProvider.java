/**
 */
package gestionmodelosconsultas.modeloconsultas.model.provider;


import gestionmodelosconsultas.modeloconsultas.como.ComoFactory;

import gestionmodelosconsultas.modeloconsultas.cuando.CuandoFactory;

import gestionmodelosconsultas.modeloconsultas.donde.DondeFactory;

import gestionmodelosconsultas.modeloconsultas.model.EADiagram;
import gestionmodelosconsultas.modeloconsultas.model.ModelFactory;
import gestionmodelosconsultas.modeloconsultas.model.ModelPackage;

import gestionmodelosconsultas.modeloconsultas.que.QueFactory;

import gestionmodelosconsultas.modeloconsultas.quien.QuienFactory;

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
 * This is the item provider adapter for a {@link gestionmodelosconsultas.modeloconsultas.model.EADiagram} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class EADiagramItemProvider 
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
	public EADiagramItemProvider(AdapterFactory adapterFactory) {
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
				 getString("_UI_EADiagram_nombre_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_EADiagram_nombre_feature", "_UI_EADiagram_type"),
				 ModelPackage.Literals.EA_DIAGRAM__NOMBRE,
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
			childrenFeatures.add(ModelPackage.Literals.EA_DIAGRAM__LIST_RELACION);
			childrenFeatures.add(ModelPackage.Literals.EA_DIAGRAM__LIST_ELEMENTO_CONSULTA);
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
		String label = ((EADiagram)object).getNombre();
		return label == null || label.length() == 0 ?
			getString("_UI_EADiagram_type") :
			getString("_UI_EADiagram_type") + " " + label;
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

		switch (notification.getFeatureID(EADiagram.class)) {
			case ModelPackage.EA_DIAGRAM__NOMBRE:
				fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), false, true));
				return;
			case ModelPackage.EA_DIAGRAM__LIST_RELACION:
			case ModelPackage.EA_DIAGRAM__LIST_ELEMENTO_CONSULTA:
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
				(ModelPackage.Literals.EA_DIAGRAM__LIST_RELACION,
				 ModelFactory.eINSTANCE.createRelacion()));

		newChildDescriptors.add
			(createChildParameter
				(ModelPackage.Literals.EA_DIAGRAM__LIST_ELEMENTO_CONSULTA,
				 QueFactory.eINSTANCE.createDocumento()));

		newChildDescriptors.add
			(createChildParameter
				(ModelPackage.Literals.EA_DIAGRAM__LIST_ELEMENTO_CONSULTA,
				 QueFactory.eINSTANCE.createComunicacion()));

		newChildDescriptors.add
			(createChildParameter
				(ModelPackage.Literals.EA_DIAGRAM__LIST_ELEMENTO_CONSULTA,
				 QuienFactory.eINSTANCE.createUnidadOrganizacional()));

		newChildDescriptors.add
			(createChildParameter
				(ModelPackage.Literals.EA_DIAGRAM__LIST_ELEMENTO_CONSULTA,
				 QuienFactory.eINSTANCE.createContacto()));

		newChildDescriptors.add
			(createChildParameter
				(ModelPackage.Literals.EA_DIAGRAM__LIST_ELEMENTO_CONSULTA,
				 QuienFactory.eINSTANCE.createActor()));

		newChildDescriptors.add
			(createChildParameter
				(ModelPackage.Literals.EA_DIAGRAM__LIST_ELEMENTO_CONSULTA,
				 QuienFactory.eINSTANCE.createRol()));

		newChildDescriptors.add
			(createChildParameter
				(ModelPackage.Literals.EA_DIAGRAM__LIST_ELEMENTO_CONSULTA,
				 QuienFactory.eINSTANCE.createQuien()));

		newChildDescriptors.add
			(createChildParameter
				(ModelPackage.Literals.EA_DIAGRAM__LIST_ELEMENTO_CONSULTA,
				 ComoFactory.eINSTANCE.createActividadProceso()));

		newChildDescriptors.add
			(createChildParameter
				(ModelPackage.Literals.EA_DIAGRAM__LIST_ELEMENTO_CONSULTA,
				 ComoFactory.eINSTANCE.createInstanciaProceso()));

		newChildDescriptors.add
			(createChildParameter
				(ModelPackage.Literals.EA_DIAGRAM__LIST_ELEMENTO_CONSULTA,
				 CuandoFactory.eINSTANCE.createFecha()));

		newChildDescriptors.add
			(createChildParameter
				(ModelPackage.Literals.EA_DIAGRAM__LIST_ELEMENTO_CONSULTA,
				 DondeFactory.eINSTANCE.createDeposito()));

		newChildDescriptors.add
			(createChildParameter
				(ModelPackage.Literals.EA_DIAGRAM__LIST_ELEMENTO_CONSULTA,
				 DondeFactory.eINSTANCE.createDisco()));

		newChildDescriptors.add
			(createChildParameter
				(ModelPackage.Literals.EA_DIAGRAM__LIST_ELEMENTO_CONSULTA,
				 DondeFactory.eINSTANCE.createArmario()));
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
