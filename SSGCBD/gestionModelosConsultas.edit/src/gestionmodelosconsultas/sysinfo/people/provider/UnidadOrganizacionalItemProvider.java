/**
 */
package gestionmodelosconsultas.sysinfo.people.provider;


import gestionmodelosconsultas.modeloconsultas.como.ComoFactory;

import gestionmodelosconsultas.modeloconsultas.donde.DondeFactory;

import gestionmodelosconsultas.modeloconsultas.quien.QuienFactory;

import gestionmodelosconsultas.sysinfo.data.docmgt.DocmgtFactory;

import gestionmodelosconsultas.sysinfo.function.FunctionFactory;

import gestionmodelosconsultas.sysinfo.network.NetworkFactory;

import gestionmodelosconsultas.sysinfo.people.PeopleFactory;
import gestionmodelosconsultas.sysinfo.people.PeoplePackage;
import gestionmodelosconsultas.sysinfo.people.UnidadOrganizacional;

import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EStructuralFeature;

import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ViewerNotification;

/**
 * This is the item provider adapter for a {@link gestionmodelosconsultas.sysinfo.people.UnidadOrganizacional} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class UnidadOrganizacionalItemProvider extends QuienItemProvider {
	/**
	 * This constructs an instance from a factory and a notifier.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public UnidadOrganizacionalItemProvider(AdapterFactory adapterFactory) {
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

			addEdificioPropertyDescriptor(object);
		}
		return itemPropertyDescriptors;
	}

	/**
	 * This adds a property descriptor for the Edificio feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addEdificioPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_UnidadOrganizacional_Edificio_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_UnidadOrganizacional_Edificio_feature", "_UI_UnidadOrganizacional_type"),
				 PeoplePackage.Literals.UNIDAD_ORGANIZACIONAL__EDIFICIO,
				 true,
				 false,
				 true,
				 null,
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
			childrenFeatures.add(PeoplePackage.Literals.UNIDAD_ORGANIZACIONAL__ROL);
			childrenFeatures.add(PeoplePackage.Literals.UNIDAD_ORGANIZACIONAL__UNIDAD);
			childrenFeatures.add(PeoplePackage.Literals.UNIDAD_ORGANIZACIONAL__ACTOR);
			childrenFeatures.add(PeoplePackage.Literals.UNIDAD_ORGANIZACIONAL__THE_ACTORES);
			childrenFeatures.add(PeoplePackage.Literals.UNIDAD_ORGANIZACIONAL__ROLES);
			childrenFeatures.add(PeoplePackage.Literals.UNIDAD_ORGANIZACIONAL__DEPOSITOS);
			childrenFeatures.add(PeoplePackage.Literals.UNIDAD_ORGANIZACIONAL__COPIAS);
			childrenFeatures.add(PeoplePackage.Literals.UNIDAD_ORGANIZACIONAL__COPIA);
			childrenFeatures.add(PeoplePackage.Literals.UNIDAD_ORGANIZACIONAL__SUS_DEPOSITOS);
			childrenFeatures.add(PeoplePackage.Literals.UNIDAD_ORGANIZACIONAL__INSTANCIACIONESPROCESOS);
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
	 * This returns UnidadOrganizacional.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/UnidadOrganizacional"));
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getText(Object object) {
		String label = ((UnidadOrganizacional)object).getNombre();
		return label == null || label.length() == 0 ?
			getString("_UI_UnidadOrganizacional_type") :
			getString("_UI_UnidadOrganizacional_type") + " " + label;
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

		switch (notification.getFeatureID(UnidadOrganizacional.class)) {
			case PeoplePackage.UNIDAD_ORGANIZACIONAL__ROL:
			case PeoplePackage.UNIDAD_ORGANIZACIONAL__UNIDAD:
			case PeoplePackage.UNIDAD_ORGANIZACIONAL__ACTOR:
			case PeoplePackage.UNIDAD_ORGANIZACIONAL__THE_ACTORES:
			case PeoplePackage.UNIDAD_ORGANIZACIONAL__ROLES:
			case PeoplePackage.UNIDAD_ORGANIZACIONAL__DEPOSITOS:
			case PeoplePackage.UNIDAD_ORGANIZACIONAL__COPIAS:
			case PeoplePackage.UNIDAD_ORGANIZACIONAL__COPIA:
			case PeoplePackage.UNIDAD_ORGANIZACIONAL__SUS_DEPOSITOS:
			case PeoplePackage.UNIDAD_ORGANIZACIONAL__INSTANCIACIONESPROCESOS:
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
				(PeoplePackage.Literals.UNIDAD_ORGANIZACIONAL__ROL,
				 PeopleFactory.eINSTANCE.createRol()));

		newChildDescriptors.add
			(createChildParameter
				(PeoplePackage.Literals.UNIDAD_ORGANIZACIONAL__ROL,
				 QuienFactory.eINSTANCE.createRol()));

		newChildDescriptors.add
			(createChildParameter
				(PeoplePackage.Literals.UNIDAD_ORGANIZACIONAL__UNIDAD,
				 PeopleFactory.eINSTANCE.createUnidadOrganizacional()));

		newChildDescriptors.add
			(createChildParameter
				(PeoplePackage.Literals.UNIDAD_ORGANIZACIONAL__UNIDAD,
				 QuienFactory.eINSTANCE.createUnidadOrganizacional()));

		newChildDescriptors.add
			(createChildParameter
				(PeoplePackage.Literals.UNIDAD_ORGANIZACIONAL__ACTOR,
				 PeopleFactory.eINSTANCE.createActor()));

		newChildDescriptors.add
			(createChildParameter
				(PeoplePackage.Literals.UNIDAD_ORGANIZACIONAL__ACTOR,
				 QuienFactory.eINSTANCE.createActor()));

		newChildDescriptors.add
			(createChildParameter
				(PeoplePackage.Literals.UNIDAD_ORGANIZACIONAL__THE_ACTORES,
				 PeopleFactory.eINSTANCE.createActores()));

		newChildDescriptors.add
			(createChildParameter
				(PeoplePackage.Literals.UNIDAD_ORGANIZACIONAL__ROLES,
				 PeopleFactory.eINSTANCE.createRoles()));

		newChildDescriptors.add
			(createChildParameter
				(PeoplePackage.Literals.UNIDAD_ORGANIZACIONAL__DEPOSITOS,
				 NetworkFactory.eINSTANCE.createDepositos()));

		newChildDescriptors.add
			(createChildParameter
				(PeoplePackage.Literals.UNIDAD_ORGANIZACIONAL__COPIAS,
				 DocmgtFactory.eINSTANCE.createCopias()));

		newChildDescriptors.add
			(createChildParameter
				(PeoplePackage.Literals.UNIDAD_ORGANIZACIONAL__COPIA,
				 DocmgtFactory.eINSTANCE.createCopia()));

		newChildDescriptors.add
			(createChildParameter
				(PeoplePackage.Literals.UNIDAD_ORGANIZACIONAL__SUS_DEPOSITOS,
				 NetworkFactory.eINSTANCE.createDeposito()));

		newChildDescriptors.add
			(createChildParameter
				(PeoplePackage.Literals.UNIDAD_ORGANIZACIONAL__SUS_DEPOSITOS,
				 NetworkFactory.eINSTANCE.createDisco()));

		newChildDescriptors.add
			(createChildParameter
				(PeoplePackage.Literals.UNIDAD_ORGANIZACIONAL__SUS_DEPOSITOS,
				 NetworkFactory.eINSTANCE.createArmario()));

		newChildDescriptors.add
			(createChildParameter
				(PeoplePackage.Literals.UNIDAD_ORGANIZACIONAL__SUS_DEPOSITOS,
				 DondeFactory.eINSTANCE.createDeposito()));

		newChildDescriptors.add
			(createChildParameter
				(PeoplePackage.Literals.UNIDAD_ORGANIZACIONAL__SUS_DEPOSITOS,
				 DondeFactory.eINSTANCE.createDisco()));

		newChildDescriptors.add
			(createChildParameter
				(PeoplePackage.Literals.UNIDAD_ORGANIZACIONAL__SUS_DEPOSITOS,
				 DondeFactory.eINSTANCE.createArmario()));

		newChildDescriptors.add
			(createChildParameter
				(PeoplePackage.Literals.UNIDAD_ORGANIZACIONAL__INSTANCIACIONESPROCESOS,
				 FunctionFactory.eINSTANCE.createInstanciaProceso()));

		newChildDescriptors.add
			(createChildParameter
				(PeoplePackage.Literals.UNIDAD_ORGANIZACIONAL__INSTANCIACIONESPROCESOS,
				 ComoFactory.eINSTANCE.createInstanciaProceso()));
	}

}
