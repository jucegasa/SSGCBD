/**
 */
package gestionmodelosconsultas.sysinfo.provider;


import gestionmodelosconsultas.memoms.MemomsFactory;

import gestionmodelosconsultas.memoms.comunicacion.ComunicacionFactory;

import gestionmodelosconsultas.modeloconsultas.como.ComoFactory;

import gestionmodelosconsultas.modeloconsultas.cuando.CuandoFactory;

import gestionmodelosconsultas.modeloconsultas.donde.DondeFactory;

import gestionmodelosconsultas.modeloconsultas.model.ModelFactory;

import gestionmodelosconsultas.modeloconsultas.que.QueFactory;

import gestionmodelosconsultas.modeloconsultas.quien.QuienFactory;

import gestionmodelosconsultas.provider.GestionModelosConsultasEditPlugin;

import gestionmodelosconsultas.sysinfo.Paquete;
import gestionmodelosconsultas.sysinfo.SysinfoFactory;
import gestionmodelosconsultas.sysinfo.SysinfoPackage;

import gestionmodelosconsultas.sysinfo.core.CoreFactory;

import gestionmodelosconsultas.sysinfo.core.provider.ElementoModeloItemProvider;

import gestionmodelosconsultas.sysinfo.data.DataFactory;

import gestionmodelosconsultas.sysinfo.data.docmgt.DocmgtFactory;

import gestionmodelosconsultas.sysinfo.function.FunctionFactory;

import gestionmodelosconsultas.sysinfo.network.NetworkFactory;

import gestionmodelosconsultas.sysinfo.people.PeopleFactory;

import gestionmodelosconsultas.sysinfo.time.TimeFactory;

import gestionmodelosconsultas.sysinfo.vision.VisionFactory;

import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.ResourceLocator;

import org.eclipse.emf.ecore.EStructuralFeature;

import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ViewerNotification;

/**
 * This is the item provider adapter for a {@link gestionmodelosconsultas.sysinfo.Paquete} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class PaqueteItemProvider extends ElementoModeloItemProvider {
	/**
	 * This constructs an instance from a factory and a notifier.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PaqueteItemProvider(AdapterFactory adapterFactory) {
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

			addTipoPropertyDescriptor(object);
		}
		return itemPropertyDescriptors;
	}

	/**
	 * This adds a property descriptor for the Tipo feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addTipoPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Paquete_tipo_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Paquete_tipo_feature", "_UI_Paquete_type"),
				 SysinfoPackage.Literals.PAQUETE__TIPO,
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
			childrenFeatures.add(SysinfoPackage.Literals.PAQUETE__ELEMENT);
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
	 * This returns Paquete.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/Paquete"));
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getText(Object object) {
		String label = ((Paquete)object).getNombre();
		return label == null || label.length() == 0 ?
			getString("_UI_Paquete_type") :
			getString("_UI_Paquete_type") + " " + label;
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

		switch (notification.getFeatureID(Paquete.class)) {
			case SysinfoPackage.PAQUETE__TIPO:
				fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), false, true));
				return;
			case SysinfoPackage.PAQUETE__ELEMENT:
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
				(SysinfoPackage.Literals.PAQUETE__ELEMENT,
				 SysinfoFactory.eINSTANCE.createPaquete()));

		newChildDescriptors.add
			(createChildParameter
				(SysinfoPackage.Literals.PAQUETE__ELEMENT,
				 PeopleFactory.eINSTANCE.createPeople_View()));

		newChildDescriptors.add
			(createChildParameter
				(SysinfoPackage.Literals.PAQUETE__ELEMENT,
				 PeopleFactory.eINSTANCE.createQuien()));

		newChildDescriptors.add
			(createChildParameter
				(SysinfoPackage.Literals.PAQUETE__ELEMENT,
				 PeopleFactory.eINSTANCE.createUnidadOrganizacional()));

		newChildDescriptors.add
			(createChildParameter
				(SysinfoPackage.Literals.PAQUETE__ELEMENT,
				 PeopleFactory.eINSTANCE.createRol()));

		newChildDescriptors.add
			(createChildParameter
				(SysinfoPackage.Literals.PAQUETE__ELEMENT,
				 PeopleFactory.eINSTANCE.createContacto()));

		newChildDescriptors.add
			(createChildParameter
				(SysinfoPackage.Literals.PAQUETE__ELEMENT,
				 PeopleFactory.eINSTANCE.createDirectorio()));

		newChildDescriptors.add
			(createChildParameter
				(SysinfoPackage.Literals.PAQUETE__ELEMENT,
				 PeopleFactory.eINSTANCE.createOrganizacion()));

		newChildDescriptors.add
			(createChildParameter
				(SysinfoPackage.Literals.PAQUETE__ELEMENT,
				 PeopleFactory.eINSTANCE.createActor()));

		newChildDescriptors.add
			(createChildParameter
				(SysinfoPackage.Literals.PAQUETE__ELEMENT,
				 DataFactory.eINSTANCE.createData_View()));

		newChildDescriptors.add
			(createChildParameter
				(SysinfoPackage.Literals.PAQUETE__ELEMENT,
				 DocmgtFactory.eINSTANCE.createDocumento()));

		newChildDescriptors.add
			(createChildParameter
				(SysinfoPackage.Literals.PAQUETE__ELEMENT,
				 DocmgtFactory.eINSTANCE.createPlantilla()));

		newChildDescriptors.add
			(createChildParameter
				(SysinfoPackage.Literals.PAQUETE__ELEMENT,
				 DocmgtFactory.eINSTANCE.createGuia()));

		newChildDescriptors.add
			(createChildParameter
				(SysinfoPackage.Literals.PAQUETE__ELEMENT,
				 DocmgtFactory.eINSTANCE.createListaChequeo()));

		newChildDescriptors.add
			(createChildParameter
				(SysinfoPackage.Literals.PAQUETE__ELEMENT,
				 DocmgtFactory.eINSTANCE.createTipoDocumento()));

		newChildDescriptors.add
			(createChildParameter
				(SysinfoPackage.Literals.PAQUETE__ELEMENT,
				 DocmgtFactory.eINSTANCE.createCopia()));

		newChildDescriptors.add
			(createChildParameter
				(SysinfoPackage.Literals.PAQUETE__ELEMENT,
				 DocmgtFactory.eINSTANCE.createVersion()));

		newChildDescriptors.add
			(createChildParameter
				(SysinfoPackage.Literals.PAQUETE__ELEMENT,
				 DocmgtFactory.eINSTANCE.createIndexEntry()));

		newChildDescriptors.add
			(createChildParameter
				(SysinfoPackage.Literals.PAQUETE__ELEMENT,
				 DocmgtFactory.eINSTANCE.createPalabraClave()));

		newChildDescriptors.add
			(createChildParameter
				(SysinfoPackage.Literals.PAQUETE__ELEMENT,
				 DocmgtFactory.eINSTANCE.createIndice()));

		newChildDescriptors.add
			(createChildParameter
				(SysinfoPackage.Literals.PAQUETE__ELEMENT,
				 DocmgtFactory.eINSTANCE.createProducto()));

		newChildDescriptors.add
			(createChildParameter
				(SysinfoPackage.Literals.PAQUETE__ELEMENT,
				 DocmgtFactory.eINSTANCE.createMensaje()));

		newChildDescriptors.add
			(createChildParameter
				(SysinfoPackage.Literals.PAQUETE__ELEMENT,
				 DocmgtFactory.eINSTANCE.createGlosario()));

		newChildDescriptors.add
			(createChildParameter
				(SysinfoPackage.Literals.PAQUETE__ELEMENT,
				 DocmgtFactory.eINSTANCE.createLibreria()));

		newChildDescriptors.add
			(createChildParameter
				(SysinfoPackage.Literals.PAQUETE__ELEMENT,
				 DocmgtFactory.eINSTANCE.createDistribucion()));

		newChildDescriptors.add
			(createChildParameter
				(SysinfoPackage.Literals.PAQUETE__ELEMENT,
				 DocmgtFactory.eINSTANCE.createOrientacion()));

		newChildDescriptors.add
			(createChildParameter
				(SysinfoPackage.Literals.PAQUETE__ELEMENT,
				 DocmgtFactory.eINSTANCE.createDoc()));

		newChildDescriptors.add
			(createChildParameter
				(SysinfoPackage.Literals.PAQUETE__ELEMENT,
				 NetworkFactory.eINSTANCE.createDeposito()));

		newChildDescriptors.add
			(createChildParameter
				(SysinfoPackage.Literals.PAQUETE__ELEMENT,
				 NetworkFactory.eINSTANCE.createDisco()));

		newChildDescriptors.add
			(createChildParameter
				(SysinfoPackage.Literals.PAQUETE__ELEMENT,
				 NetworkFactory.eINSTANCE.createArmario()));

		newChildDescriptors.add
			(createChildParameter
				(SysinfoPackage.Literals.PAQUETE__ELEMENT,
				 NetworkFactory.eINSTANCE.createNetwork_View()));

		newChildDescriptors.add
			(createChildParameter
				(SysinfoPackage.Literals.PAQUETE__ELEMENT,
				 NetworkFactory.eINSTANCE.createEdificio()));

		newChildDescriptors.add
			(createChildParameter
				(SysinfoPackage.Literals.PAQUETE__ELEMENT,
				 FunctionFactory.eINSTANCE.createFunction_View()));

		newChildDescriptors.add
			(createChildParameter
				(SysinfoPackage.Literals.PAQUETE__ELEMENT,
				 FunctionFactory.eINSTANCE.createActividad()));

		newChildDescriptors.add
			(createChildParameter
				(SysinfoPackage.Literals.PAQUETE__ELEMENT,
				 FunctionFactory.eINSTANCE.createInstanciaProceso()));

		newChildDescriptors.add
			(createChildParameter
				(SysinfoPackage.Literals.PAQUETE__ELEMENT,
				 TimeFactory.eINSTANCE.createTime_View()));

		newChildDescriptors.add
			(createChildParameter
				(SysinfoPackage.Literals.PAQUETE__ELEMENT,
				 TimeFactory.eINSTANCE.createFecha()));

		newChildDescriptors.add
			(createChildParameter
				(SysinfoPackage.Literals.PAQUETE__ELEMENT,
				 TimeFactory.eINSTANCE.createAgenda()));

		newChildDescriptors.add
			(createChildParameter
				(SysinfoPackage.Literals.PAQUETE__ELEMENT,
				 VisionFactory.eINSTANCE.createVision_View()));

		newChildDescriptors.add
			(createChildParameter
				(SysinfoPackage.Literals.PAQUETE__ELEMENT,
				 CoreFactory.eINSTANCE.createElementoModelo()));

		newChildDescriptors.add
			(createChildParameter
				(SysinfoPackage.Literals.PAQUETE__ELEMENT,
				 QueFactory.eINSTANCE.createDocumento()));

		newChildDescriptors.add
			(createChildParameter
				(SysinfoPackage.Literals.PAQUETE__ELEMENT,
				 QueFactory.eINSTANCE.createComunicacion()));

		newChildDescriptors.add
			(createChildParameter
				(SysinfoPackage.Literals.PAQUETE__ELEMENT,
				 QuienFactory.eINSTANCE.createUnidadOrganizacional()));

		newChildDescriptors.add
			(createChildParameter
				(SysinfoPackage.Literals.PAQUETE__ELEMENT,
				 QuienFactory.eINSTANCE.createContacto()));

		newChildDescriptors.add
			(createChildParameter
				(SysinfoPackage.Literals.PAQUETE__ELEMENT,
				 QuienFactory.eINSTANCE.createActor()));

		newChildDescriptors.add
			(createChildParameter
				(SysinfoPackage.Literals.PAQUETE__ELEMENT,
				 QuienFactory.eINSTANCE.createRol()));

		newChildDescriptors.add
			(createChildParameter
				(SysinfoPackage.Literals.PAQUETE__ELEMENT,
				 QuienFactory.eINSTANCE.createQuien()));

		newChildDescriptors.add
			(createChildParameter
				(SysinfoPackage.Literals.PAQUETE__ELEMENT,
				 ComoFactory.eINSTANCE.createActividadProceso()));

		newChildDescriptors.add
			(createChildParameter
				(SysinfoPackage.Literals.PAQUETE__ELEMENT,
				 ComoFactory.eINSTANCE.createInstanciaProceso()));

		newChildDescriptors.add
			(createChildParameter
				(SysinfoPackage.Literals.PAQUETE__ELEMENT,
				 CuandoFactory.eINSTANCE.createFecha()));

		newChildDescriptors.add
			(createChildParameter
				(SysinfoPackage.Literals.PAQUETE__ELEMENT,
				 DondeFactory.eINSTANCE.createDeposito()));

		newChildDescriptors.add
			(createChildParameter
				(SysinfoPackage.Literals.PAQUETE__ELEMENT,
				 DondeFactory.eINSTANCE.createDisco()));

		newChildDescriptors.add
			(createChildParameter
				(SysinfoPackage.Literals.PAQUETE__ELEMENT,
				 DondeFactory.eINSTANCE.createArmario()));

		newChildDescriptors.add
			(createChildParameter
				(SysinfoPackage.Literals.PAQUETE__ELEMENT,
				 ModelFactory.eINSTANCE.createRelacion()));

		newChildDescriptors.add
			(createChildParameter
				(SysinfoPackage.Literals.PAQUETE__ELEMENT,
				 MemomsFactory.eINSTANCE.createMemoFactory()));

		newChildDescriptors.add
			(createChildParameter
				(SysinfoPackage.Literals.PAQUETE__ELEMENT,
				 ComunicacionFactory.eINSTANCE.createMemorando()));

		newChildDescriptors.add
			(createChildParameter
				(SysinfoPackage.Literals.PAQUETE__ELEMENT,
				 ComunicacionFactory.eINSTANCE.createCircular()));
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
