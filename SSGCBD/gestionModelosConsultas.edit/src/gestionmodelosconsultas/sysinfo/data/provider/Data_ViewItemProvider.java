/**
 */
package gestionmodelosconsultas.sysinfo.data.provider;


import gestionmodelosconsultas.provider.GestionModelosConsultasEditPlugin;

import gestionmodelosconsultas.sysinfo.SysinfoPackage;

import gestionmodelosconsultas.sysinfo.data.DataPackage;
import gestionmodelosconsultas.sysinfo.data.Data_View;

import gestionmodelosconsultas.sysinfo.data.docmgt.DocmgtFactory;

import gestionmodelosconsultas.sysinfo.provider.PaqueteItemProvider;

import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.ResourceLocator;

import org.eclipse.emf.ecore.EStructuralFeature;

import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ViewerNotification;

/**
 * This is the item provider adapter for a {@link gestionmodelosconsultas.sysinfo.data.Data_View} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class Data_ViewItemProvider extends PaqueteItemProvider {
	/**
	 * This constructs an instance from a factory and a notifier.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Data_ViewItemProvider(AdapterFactory adapterFactory) {
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

		}
		return itemPropertyDescriptors;
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
			childrenFeatures.add(DataPackage.Literals.DATA_VIEW__INDICE);
			childrenFeatures.add(DataPackage.Literals.DATA_VIEW__LIBRERIA);
			childrenFeatures.add(DataPackage.Literals.DATA_VIEW__ORIENTACION);
			childrenFeatures.add(DataPackage.Literals.DATA_VIEW__GLOSARIO);
			childrenFeatures.add(DataPackage.Literals.DATA_VIEW__DISTRIBUCION);
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
	 * This returns Data_View.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/Data_View"));
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getText(Object object) {
		String label = ((Data_View)object).getNombre();
		return label == null || label.length() == 0 ?
			getString("_UI_Data_View_type") :
			getString("_UI_Data_View_type") + " " + label;
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

		switch (notification.getFeatureID(Data_View.class)) {
			case DataPackage.DATA_VIEW__INDICE:
			case DataPackage.DATA_VIEW__LIBRERIA:
			case DataPackage.DATA_VIEW__ORIENTACION:
			case DataPackage.DATA_VIEW__GLOSARIO:
			case DataPackage.DATA_VIEW__DISTRIBUCION:
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
				(DataPackage.Literals.DATA_VIEW__INDICE,
				 DocmgtFactory.eINSTANCE.createIndice()));

		newChildDescriptors.add
			(createChildParameter
				(DataPackage.Literals.DATA_VIEW__LIBRERIA,
				 DocmgtFactory.eINSTANCE.createLibreria()));

		newChildDescriptors.add
			(createChildParameter
				(DataPackage.Literals.DATA_VIEW__ORIENTACION,
				 DocmgtFactory.eINSTANCE.createOrientacion()));

		newChildDescriptors.add
			(createChildParameter
				(DataPackage.Literals.DATA_VIEW__GLOSARIO,
				 DocmgtFactory.eINSTANCE.createGlosario()));

		newChildDescriptors.add
			(createChildParameter
				(DataPackage.Literals.DATA_VIEW__DISTRIBUCION,
				 DocmgtFactory.eINSTANCE.createDistribucion()));
	}

	/**
	 * This returns the label text for {@link org.eclipse.emf.edit.command.CreateChildCommand}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getCreateChildText(Object owner, Object feature, Object child, Collection<?> selection) {
		Object childFeature = feature;
		Object childObject = child;

		boolean qualify =
			childFeature == SysinfoPackage.Literals.PAQUETE__ELEMENT ||
			childFeature == DataPackage.Literals.DATA_VIEW__INDICE ||
			childFeature == DataPackage.Literals.DATA_VIEW__GLOSARIO ||
			childFeature == DataPackage.Literals.DATA_VIEW__LIBRERIA ||
			childFeature == DataPackage.Literals.DATA_VIEW__DISTRIBUCION ||
			childFeature == DataPackage.Literals.DATA_VIEW__ORIENTACION;

		if (qualify) {
			return getString
				("_UI_CreateChild_text2",
				 new Object[] { getTypeText(childObject), getFeatureText(childFeature), getTypeText(owner) });
		}
		return super.getCreateChildText(owner, feature, child, selection);
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
