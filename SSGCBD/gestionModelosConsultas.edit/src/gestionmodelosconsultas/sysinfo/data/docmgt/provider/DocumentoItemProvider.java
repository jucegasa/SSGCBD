/**
 */
package gestionmodelosconsultas.sysinfo.data.docmgt.provider;


import gestionmodelosconsultas.memoms.info.InfoFactory;

import gestionmodelosconsultas.provider.GestionModelosConsultasEditPlugin;

import gestionmodelosconsultas.sysinfo.core.provider.ElementoModeloItemProvider;

import gestionmodelosconsultas.sysinfo.data.docmgt.DocmgtFactory;
import gestionmodelosconsultas.sysinfo.data.docmgt.DocmgtPackage;
import gestionmodelosconsultas.sysinfo.data.docmgt.Documento;

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
 * This is the item provider adapter for a {@link gestionmodelosconsultas.sysinfo.data.docmgt.Documento} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class DocumentoItemProvider extends ElementoModeloItemProvider {
	/**
	 * This constructs an instance from a factory and a notifier.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DocumentoItemProvider(AdapterFactory adapterFactory) {
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

			addDescripcionPropertyDescriptor(object);
			addTituloPropertyDescriptor(object);
			addEdicionPropertyDescriptor(object);
			addVigenciaPropertyDescriptor(object);
			addEstadoPropertyDescriptor(object);
			addSuVersionPropertyDescriptor(object);
			addContextoDocumentoPropertyDescriptor(object);
			addPalabraClavePropertyDescriptor(object);
			addSuItemPropertyDescriptor(object);
			addDerivadasPropertyDescriptor(object);
			addBasePropertyDescriptor(object);
			addTheTipoDocumentoPropertyDescriptor(object);
			addProductoPropertyDescriptor(object);
			addTheRolPropertyDescriptor(object);
			addAsociadoPropertyDescriptor(object);
			addTablaRetencionDocumentalPropertyDescriptor(object);
			addExpedientePropertyDescriptor(object);
		}
		return itemPropertyDescriptors;
	}

	/**
	 * This adds a property descriptor for the Descripcion feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addDescripcionPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Documento_descripcion_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Documento_descripcion_feature", "_UI_Documento_type"),
				 DocmgtPackage.Literals.DOCUMENTO__DESCRIPCION,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Titulo feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addTituloPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Documento_titulo_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Documento_titulo_feature", "_UI_Documento_type"),
				 DocmgtPackage.Literals.DOCUMENTO__TITULO,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Edicion feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addEdicionPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Documento_edicion_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Documento_edicion_feature", "_UI_Documento_type"),
				 DocmgtPackage.Literals.DOCUMENTO__EDICION,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Vigencia feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addVigenciaPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Documento_vigencia_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Documento_vigencia_feature", "_UI_Documento_type"),
				 DocmgtPackage.Literals.DOCUMENTO__VIGENCIA,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Estado feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addEstadoPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Documento_estado_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Documento_estado_feature", "_UI_Documento_type"),
				 DocmgtPackage.Literals.DOCUMENTO__ESTADO,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Su Version feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addSuVersionPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Documento_suVersion_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Documento_suVersion_feature", "_UI_Documento_type"),
				 DocmgtPackage.Literals.DOCUMENTO__SU_VERSION,
				 true,
				 false,
				 true,
				 null,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Contexto Documento feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addContextoDocumentoPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Documento_contextoDocumento_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Documento_contextoDocumento_feature", "_UI_Documento_type"),
				 DocmgtPackage.Literals.DOCUMENTO__CONTEXTO_DOCUMENTO,
				 true,
				 false,
				 true,
				 null,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Palabra Clave feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addPalabraClavePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Documento_PalabraClave_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Documento_PalabraClave_feature", "_UI_Documento_type"),
				 DocmgtPackage.Literals.DOCUMENTO__PALABRA_CLAVE,
				 true,
				 false,
				 true,
				 null,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Su Item feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addSuItemPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Documento_suItem_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Documento_suItem_feature", "_UI_Documento_type"),
				 DocmgtPackage.Literals.DOCUMENTO__SU_ITEM,
				 true,
				 false,
				 true,
				 null,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Derivadas feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addDerivadasPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Documento_derivadas_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Documento_derivadas_feature", "_UI_Documento_type"),
				 DocmgtPackage.Literals.DOCUMENTO__DERIVADAS,
				 true,
				 false,
				 true,
				 null,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Base feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addBasePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Documento_base_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Documento_base_feature", "_UI_Documento_type"),
				 DocmgtPackage.Literals.DOCUMENTO__BASE,
				 true,
				 false,
				 true,
				 null,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the The Tipo Documento feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addTheTipoDocumentoPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Documento_theTipoDocumento_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Documento_theTipoDocumento_feature", "_UI_Documento_type"),
				 DocmgtPackage.Literals.DOCUMENTO__THE_TIPO_DOCUMENTO,
				 true,
				 false,
				 true,
				 null,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Producto feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addProductoPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Documento_Producto_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Documento_Producto_feature", "_UI_Documento_type"),
				 DocmgtPackage.Literals.DOCUMENTO__PRODUCTO,
				 true,
				 false,
				 true,
				 null,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the The Rol feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addTheRolPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Documento_theRol_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Documento_theRol_feature", "_UI_Documento_type"),
				 DocmgtPackage.Literals.DOCUMENTO__THE_ROL,
				 true,
				 false,
				 true,
				 null,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Asociado feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addAsociadoPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Documento_asociado_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Documento_asociado_feature", "_UI_Documento_type"),
				 DocmgtPackage.Literals.DOCUMENTO__ASOCIADO,
				 true,
				 false,
				 true,
				 null,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Tabla Retencion Documental feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addTablaRetencionDocumentalPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Documento_TablaRetencionDocumental_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Documento_TablaRetencionDocumental_feature", "_UI_Documento_type"),
				 DocmgtPackage.Literals.DOCUMENTO__TABLA_RETENCION_DOCUMENTAL,
				 true,
				 false,
				 true,
				 null,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Expediente feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addExpedientePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Documento_Expediente_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Documento_Expediente_feature", "_UI_Documento_type"),
				 DocmgtPackage.Literals.DOCUMENTO__EXPEDIENTE,
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
			childrenFeatures.add(DocmgtPackage.Literals.DOCUMENTO__SU_CONTENIDO);
			childrenFeatures.add(DocmgtPackage.Literals.DOCUMENTO__SU_BASELINE);
			childrenFeatures.add(DocmgtPackage.Literals.DOCUMENTO__OBSERVACION);
			childrenFeatures.add(DocmgtPackage.Literals.DOCUMENTO__ANEXO);
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
	 * This returns Documento.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/Documento"));
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getText(Object object) {
		String label = ((Documento)object).getNombre();
		return label == null || label.length() == 0 ?
			getString("_UI_Documento_type") :
			getString("_UI_Documento_type") + " " + label;
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

		switch (notification.getFeatureID(Documento.class)) {
			case DocmgtPackage.DOCUMENTO__DESCRIPCION:
			case DocmgtPackage.DOCUMENTO__TITULO:
			case DocmgtPackage.DOCUMENTO__EDICION:
			case DocmgtPackage.DOCUMENTO__VIGENCIA:
			case DocmgtPackage.DOCUMENTO__ESTADO:
				fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), false, true));
				return;
			case DocmgtPackage.DOCUMENTO__SU_CONTENIDO:
			case DocmgtPackage.DOCUMENTO__SU_BASELINE:
			case DocmgtPackage.DOCUMENTO__OBSERVACION:
			case DocmgtPackage.DOCUMENTO__ANEXO:
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
				(DocmgtPackage.Literals.DOCUMENTO__SU_CONTENIDO,
				 DocmgtFactory.eINSTANCE.createContenido()));

		newChildDescriptors.add
			(createChildParameter
				(DocmgtPackage.Literals.DOCUMENTO__SU_BASELINE,
				 DocmgtFactory.eINSTANCE.createBaseline()));

		newChildDescriptors.add
			(createChildParameter
				(DocmgtPackage.Literals.DOCUMENTO__OBSERVACION,
				 InfoFactory.eINSTANCE.createObservacion()));

		newChildDescriptors.add
			(createChildParameter
				(DocmgtPackage.Literals.DOCUMENTO__ANEXO,
				 InfoFactory.eINSTANCE.createAnexo()));
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
