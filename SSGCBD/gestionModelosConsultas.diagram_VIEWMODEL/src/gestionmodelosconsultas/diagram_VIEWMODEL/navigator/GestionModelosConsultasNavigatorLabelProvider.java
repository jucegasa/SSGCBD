package gestionmodelosconsultas.diagram_VIEWMODEL.navigator;

import gestionmodelosconsultas.modeloconsultas.model.Relacion;
import gestionmodelosconsultas.modeloconsultas.model.ViewModel;

import org.eclipse.gmf.runtime.common.ui.services.parser.IParser;
import org.eclipse.gmf.runtime.common.ui.services.parser.ParserOptions;
import org.eclipse.gmf.runtime.emf.core.util.EObjectAdapter;
import org.eclipse.gmf.runtime.emf.type.core.IElementType;
import org.eclipse.gmf.runtime.notation.View;
import org.eclipse.jface.resource.ImageDescriptor;
import org.eclipse.jface.resource.ImageRegistry;
import org.eclipse.jface.viewers.ITreePathLabelProvider;
import org.eclipse.jface.viewers.LabelProvider;
import org.eclipse.jface.viewers.TreePath;
import org.eclipse.jface.viewers.ViewerLabel;
import org.eclipse.swt.graphics.Image;
import org.eclipse.ui.IMemento;
import org.eclipse.ui.navigator.ICommonContentExtensionSite;
import org.eclipse.ui.navigator.ICommonLabelProvider;

/**
 * @generated
 */
public class GestionModelosConsultasNavigatorLabelProvider extends
		LabelProvider implements ICommonLabelProvider, ITreePathLabelProvider {

	/**
	 * @generated
	 */
	static {
		gestionmodelosconsultas.diagram_VIEWMODEL.part.GestionModelosConsultasDiagramEditorPlugin
				.getInstance()
				.getImageRegistry()
				.put("Navigator?UnknownElement", ImageDescriptor.getMissingImageDescriptor()); //$NON-NLS-1$
		gestionmodelosconsultas.diagram_VIEWMODEL.part.GestionModelosConsultasDiagramEditorPlugin
				.getInstance()
				.getImageRegistry()
				.put("Navigator?ImageNotFound", ImageDescriptor.getMissingImageDescriptor()); //$NON-NLS-1$
	}

	/**
	 * @generated
	 */
	public void updateLabel(ViewerLabel label, TreePath elementPath) {
		Object element = elementPath.getLastSegment();
		if (element instanceof gestionmodelosconsultas.diagram_VIEWMODEL.navigator.GestionModelosConsultasNavigatorItem
				&& !isOwnView(((gestionmodelosconsultas.diagram_VIEWMODEL.navigator.GestionModelosConsultasNavigatorItem) element)
						.getView())) {
			return;
		}
		label.setText(getText(element));
		label.setImage(getImage(element));
	}

	/**
	 * @generated
	 */
	public Image getImage(Object element) {
		if (element instanceof gestionmodelosconsultas.diagram_VIEWMODEL.navigator.GestionModelosConsultasNavigatorGroup) {
			gestionmodelosconsultas.diagram_VIEWMODEL.navigator.GestionModelosConsultasNavigatorGroup group = (gestionmodelosconsultas.diagram_VIEWMODEL.navigator.GestionModelosConsultasNavigatorGroup) element;
			return gestionmodelosconsultas.diagram_VIEWMODEL.part.GestionModelosConsultasDiagramEditorPlugin
					.getInstance().getBundledImage(group.getIcon());
		}

		if (element instanceof gestionmodelosconsultas.diagram_VIEWMODEL.navigator.GestionModelosConsultasNavigatorItem) {
			gestionmodelosconsultas.diagram_VIEWMODEL.navigator.GestionModelosConsultasNavigatorItem navigatorItem = (gestionmodelosconsultas.diagram_VIEWMODEL.navigator.GestionModelosConsultasNavigatorItem) element;
			if (!isOwnView(navigatorItem.getView())) {
				return super.getImage(element);
			}
			return getImage(navigatorItem.getView());
		}

		return super.getImage(element);
	}

	/**
	 * @generated
	 */
	public Image getImage(View view) {
		switch (gestionmodelosconsultas.diagram_VIEWMODEL.part.GestionModelosConsultasVisualIDRegistry
				.getVisualID(view)) {
		case gestionmodelosconsultas.diagram_VIEWMODEL.edit.parts.ViewModelEditPart.VISUAL_ID:
			return getImage(
					"Navigator?Diagram?http:///gestionmodelosconsultas/modeloconsultas/model.ecore?ViewModel", gestionmodelosconsultas.diagram_VIEWMODEL.providers.GestionModelosConsultasElementTypes.ViewModel_1000); //$NON-NLS-1$
		case gestionmodelosconsultas.diagram_VIEWMODEL.edit.parts.UnidadOrganizacionalEditPart.VISUAL_ID:
			return getImage(
					"Navigator?TopLevelNode?http:///gestionmodelosconsultas/modeloconsultas/quien.ecore?UnidadOrganizacional", gestionmodelosconsultas.diagram_VIEWMODEL.providers.GestionModelosConsultasElementTypes.UnidadOrganizacional_2015); //$NON-NLS-1$
		case gestionmodelosconsultas.diagram_VIEWMODEL.edit.parts.DocumentoEditPart.VISUAL_ID:
			return getImage(
					"Navigator?TopLevelNode?http:///gestionmodelosconsultas/modeloconsultas/que.ecore?Documento", gestionmodelosconsultas.diagram_VIEWMODEL.providers.GestionModelosConsultasElementTypes.Documento_2016); //$NON-NLS-1$
		case gestionmodelosconsultas.diagram_VIEWMODEL.edit.parts.ActividadEditPart.VISUAL_ID:
			return getImage(
					"Navigator?TopLevelNode?http:///gestionmodelosconsultas/modeloconsultas/como.ecore?Actividad", gestionmodelosconsultas.diagram_VIEWMODEL.providers.GestionModelosConsultasElementTypes.Actividad_2017); //$NON-NLS-1$
		case gestionmodelosconsultas.diagram_VIEWMODEL.edit.parts.ActorEditPart.VISUAL_ID:
			return getImage(
					"Navigator?TopLevelNode?http:///gestionmodelosconsultas/modeloconsultas/quien.ecore?Actor", gestionmodelosconsultas.diagram_VIEWMODEL.providers.GestionModelosConsultasElementTypes.Actor_2018); //$NON-NLS-1$
		case gestionmodelosconsultas.diagram_VIEWMODEL.edit.parts.ArmarioEditPart.VISUAL_ID:
			return getImage(
					"Navigator?TopLevelNode?http:///gestionmodelosconsultas/modeloconsultas/donde.ecore?Armario", gestionmodelosconsultas.diagram_VIEWMODEL.providers.GestionModelosConsultasElementTypes.Armario_2019); //$NON-NLS-1$
		case gestionmodelosconsultas.diagram_VIEWMODEL.edit.parts.ComunicacionEditPart.VISUAL_ID:
			return getImage(
					"Navigator?TopLevelNode?http:///gestionmodelosconsultas/modeloconsultas/que.ecore?Comunicacion", gestionmodelosconsultas.diagram_VIEWMODEL.providers.GestionModelosConsultasElementTypes.Comunicacion_2020); //$NON-NLS-1$
		case gestionmodelosconsultas.diagram_VIEWMODEL.edit.parts.ContactoEditPart.VISUAL_ID:
			return getImage(
					"Navigator?TopLevelNode?http:///gestionmodelosconsultas/modeloconsultas/quien.ecore?Contacto", gestionmodelosconsultas.diagram_VIEWMODEL.providers.GestionModelosConsultasElementTypes.Contacto_2021); //$NON-NLS-1$
		case gestionmodelosconsultas.diagram_VIEWMODEL.edit.parts.DepositoEditPart.VISUAL_ID:
			return getImage(
					"Navigator?TopLevelNode?http:///gestionmodelosconsultas/modeloconsultas/donde.ecore?Deposito", gestionmodelosconsultas.diagram_VIEWMODEL.providers.GestionModelosConsultasElementTypes.Deposito_2022); //$NON-NLS-1$
		case gestionmodelosconsultas.diagram_VIEWMODEL.edit.parts.DiscoEditPart.VISUAL_ID:
			return getImage(
					"Navigator?TopLevelNode?http:///gestionmodelosconsultas/modeloconsultas/donde.ecore?Disco", gestionmodelosconsultas.diagram_VIEWMODEL.providers.GestionModelosConsultasElementTypes.Disco_2023); //$NON-NLS-1$
		case gestionmodelosconsultas.diagram_VIEWMODEL.edit.parts.InstanciaProcesoEditPart.VISUAL_ID:
			return getImage(
					"Navigator?TopLevelNode?http:///gestionmodelosconsultas/modeloconsultas/como.ecore?InstanciaProceso", gestionmodelosconsultas.diagram_VIEWMODEL.providers.GestionModelosConsultasElementTypes.InstanciaProceso_2024); //$NON-NLS-1$
		case gestionmodelosconsultas.diagram_VIEWMODEL.edit.parts.QuienEditPart.VISUAL_ID:
			return getImage(
					"Navigator?TopLevelNode?http:///gestionmodelosconsultas/modeloconsultas/quien.ecore?Quien", gestionmodelosconsultas.diagram_VIEWMODEL.providers.GestionModelosConsultasElementTypes.Quien_2025); //$NON-NLS-1$
		case gestionmodelosconsultas.diagram_VIEWMODEL.edit.parts.RolEditPart.VISUAL_ID:
			return getImage(
					"Navigator?TopLevelNode?http:///gestionmodelosconsultas/modeloconsultas/quien.ecore?Rol", gestionmodelosconsultas.diagram_VIEWMODEL.providers.GestionModelosConsultasElementTypes.Rol_2026); //$NON-NLS-1$
		case gestionmodelosconsultas.diagram_VIEWMODEL.edit.parts.FechaEditPart.VISUAL_ID:
			return getImage(
					"Navigator?TopLevelNode?http:///gestionmodelosconsultas/modeloconsultas/cuando.ecore?Fecha", gestionmodelosconsultas.diagram_VIEWMODEL.providers.GestionModelosConsultasElementTypes.Fecha_2027); //$NON-NLS-1$
		case gestionmodelosconsultas.diagram_VIEWMODEL.edit.parts.RelacionEditPart.VISUAL_ID:
			return getImage(
					"Navigator?Link?http:///gestionmodelosconsultas/modeloconsultas/model.ecore?Relacion", gestionmodelosconsultas.diagram_VIEWMODEL.providers.GestionModelosConsultasElementTypes.Relacion_4001); //$NON-NLS-1$
		}
		return getImage("Navigator?UnknownElement", null); //$NON-NLS-1$
	}

	/**
	 * @generated
	 */
	private Image getImage(String key, IElementType elementType) {
		ImageRegistry imageRegistry = gestionmodelosconsultas.diagram_VIEWMODEL.part.GestionModelosConsultasDiagramEditorPlugin
				.getInstance().getImageRegistry();
		Image image = imageRegistry.get(key);
		if (image == null
				&& elementType != null
				&& gestionmodelosconsultas.diagram_VIEWMODEL.providers.GestionModelosConsultasElementTypes
						.isKnownElementType(elementType)) {
			image = gestionmodelosconsultas.diagram_VIEWMODEL.providers.GestionModelosConsultasElementTypes
					.getImage(elementType);
			imageRegistry.put(key, image);
		}

		if (image == null) {
			image = imageRegistry.get("Navigator?ImageNotFound"); //$NON-NLS-1$
			imageRegistry.put(key, image);
		}
		return image;
	}

	/**
	 * @generated
	 */
	public String getText(Object element) {
		if (element instanceof gestionmodelosconsultas.diagram_VIEWMODEL.navigator.GestionModelosConsultasNavigatorGroup) {
			gestionmodelosconsultas.diagram_VIEWMODEL.navigator.GestionModelosConsultasNavigatorGroup group = (gestionmodelosconsultas.diagram_VIEWMODEL.navigator.GestionModelosConsultasNavigatorGroup) element;
			return group.getGroupName();
		}

		if (element instanceof gestionmodelosconsultas.diagram_VIEWMODEL.navigator.GestionModelosConsultasNavigatorItem) {
			gestionmodelosconsultas.diagram_VIEWMODEL.navigator.GestionModelosConsultasNavigatorItem navigatorItem = (gestionmodelosconsultas.diagram_VIEWMODEL.navigator.GestionModelosConsultasNavigatorItem) element;
			if (!isOwnView(navigatorItem.getView())) {
				return null;
			}
			return getText(navigatorItem.getView());
		}

		return super.getText(element);
	}

	/**
	 * @generated
	 */
	public String getText(View view) {
		if (view.getElement() != null && view.getElement().eIsProxy()) {
			return getUnresolvedDomainElementProxyText(view);
		}
		switch (gestionmodelosconsultas.diagram_VIEWMODEL.part.GestionModelosConsultasVisualIDRegistry
				.getVisualID(view)) {
		case gestionmodelosconsultas.diagram_VIEWMODEL.edit.parts.ViewModelEditPart.VISUAL_ID:
			return getViewModel_1000Text(view);
		case gestionmodelosconsultas.diagram_VIEWMODEL.edit.parts.UnidadOrganizacionalEditPart.VISUAL_ID:
			return getUnidadOrganizacional_2015Text(view);
		case gestionmodelosconsultas.diagram_VIEWMODEL.edit.parts.DocumentoEditPart.VISUAL_ID:
			return getDocumento_2016Text(view);
		case gestionmodelosconsultas.diagram_VIEWMODEL.edit.parts.ActividadEditPart.VISUAL_ID:
			return getActividad_2017Text(view);
		case gestionmodelosconsultas.diagram_VIEWMODEL.edit.parts.ActorEditPart.VISUAL_ID:
			return getActor_2018Text(view);
		case gestionmodelosconsultas.diagram_VIEWMODEL.edit.parts.ArmarioEditPart.VISUAL_ID:
			return getArmario_2019Text(view);
		case gestionmodelosconsultas.diagram_VIEWMODEL.edit.parts.ComunicacionEditPart.VISUAL_ID:
			return getComunicacion_2020Text(view);
		case gestionmodelosconsultas.diagram_VIEWMODEL.edit.parts.ContactoEditPart.VISUAL_ID:
			return getContacto_2021Text(view);
		case gestionmodelosconsultas.diagram_VIEWMODEL.edit.parts.DepositoEditPart.VISUAL_ID:
			return getDeposito_2022Text(view);
		case gestionmodelosconsultas.diagram_VIEWMODEL.edit.parts.DiscoEditPart.VISUAL_ID:
			return getDisco_2023Text(view);
		case gestionmodelosconsultas.diagram_VIEWMODEL.edit.parts.InstanciaProcesoEditPart.VISUAL_ID:
			return getInstanciaProceso_2024Text(view);
		case gestionmodelosconsultas.diagram_VIEWMODEL.edit.parts.QuienEditPart.VISUAL_ID:
			return getQuien_2025Text(view);
		case gestionmodelosconsultas.diagram_VIEWMODEL.edit.parts.RolEditPart.VISUAL_ID:
			return getRol_2026Text(view);
		case gestionmodelosconsultas.diagram_VIEWMODEL.edit.parts.FechaEditPart.VISUAL_ID:
			return getFecha_2027Text(view);
		case gestionmodelosconsultas.diagram_VIEWMODEL.edit.parts.RelacionEditPart.VISUAL_ID:
			return getRelacion_4001Text(view);
		}
		return getUnknownElementText(view);
	}

	/**
	 * @generated
	 */
	private String getViewModel_1000Text(View view) {
		ViewModel domainModelElement = (ViewModel) view.getElement();
		if (domainModelElement != null) {
			return domainModelElement.getNombre();
		} else {
			gestionmodelosconsultas.diagram_VIEWMODEL.part.GestionModelosConsultasDiagramEditorPlugin
					.getInstance()
					.logError(
							"No domain element for view with visualID = " + 1000); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getUnidadOrganizacional_2015Text(View view) {
		IParser parser = gestionmodelosconsultas.diagram_VIEWMODEL.providers.GestionModelosConsultasParserProvider
				.getParser(
						gestionmodelosconsultas.diagram_VIEWMODEL.providers.GestionModelosConsultasElementTypes.UnidadOrganizacional_2015,
						view.getElement() != null ? view.getElement() : view,
						gestionmodelosconsultas.diagram_VIEWMODEL.part.GestionModelosConsultasVisualIDRegistry
								.getType(gestionmodelosconsultas.diagram_VIEWMODEL.edit.parts.UnidadOrganizacionalNombreEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(
					view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			gestionmodelosconsultas.diagram_VIEWMODEL.part.GestionModelosConsultasDiagramEditorPlugin
					.getInstance().logError(
							"Parser was not found for label " + 5031); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getDocumento_2016Text(View view) {
		IParser parser = gestionmodelosconsultas.diagram_VIEWMODEL.providers.GestionModelosConsultasParserProvider
				.getParser(
						gestionmodelosconsultas.diagram_VIEWMODEL.providers.GestionModelosConsultasElementTypes.Documento_2016,
						view.getElement() != null ? view.getElement() : view,
						gestionmodelosconsultas.diagram_VIEWMODEL.part.GestionModelosConsultasVisualIDRegistry
								.getType(gestionmodelosconsultas.diagram_VIEWMODEL.edit.parts.DocumentoNombreEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(
					view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			gestionmodelosconsultas.diagram_VIEWMODEL.part.GestionModelosConsultasDiagramEditorPlugin
					.getInstance().logError(
							"Parser was not found for label " + 5032); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getActividad_2017Text(View view) {
		IParser parser = gestionmodelosconsultas.diagram_VIEWMODEL.providers.GestionModelosConsultasParserProvider
				.getParser(
						gestionmodelosconsultas.diagram_VIEWMODEL.providers.GestionModelosConsultasElementTypes.Actividad_2017,
						view.getElement() != null ? view.getElement() : view,
						gestionmodelosconsultas.diagram_VIEWMODEL.part.GestionModelosConsultasVisualIDRegistry
								.getType(gestionmodelosconsultas.diagram_VIEWMODEL.edit.parts.ActividadNombreEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(
					view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			gestionmodelosconsultas.diagram_VIEWMODEL.part.GestionModelosConsultasDiagramEditorPlugin
					.getInstance().logError(
							"Parser was not found for label " + 5033); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getActor_2018Text(View view) {
		IParser parser = gestionmodelosconsultas.diagram_VIEWMODEL.providers.GestionModelosConsultasParserProvider
				.getParser(
						gestionmodelosconsultas.diagram_VIEWMODEL.providers.GestionModelosConsultasElementTypes.Actor_2018,
						view.getElement() != null ? view.getElement() : view,
						gestionmodelosconsultas.diagram_VIEWMODEL.part.GestionModelosConsultasVisualIDRegistry
								.getType(gestionmodelosconsultas.diagram_VIEWMODEL.edit.parts.ActorNombreEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(
					view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			gestionmodelosconsultas.diagram_VIEWMODEL.part.GestionModelosConsultasDiagramEditorPlugin
					.getInstance().logError(
							"Parser was not found for label " + 5034); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getArmario_2019Text(View view) {
		IParser parser = gestionmodelosconsultas.diagram_VIEWMODEL.providers.GestionModelosConsultasParserProvider
				.getParser(
						gestionmodelosconsultas.diagram_VIEWMODEL.providers.GestionModelosConsultasElementTypes.Armario_2019,
						view.getElement() != null ? view.getElement() : view,
						gestionmodelosconsultas.diagram_VIEWMODEL.part.GestionModelosConsultasVisualIDRegistry
								.getType(gestionmodelosconsultas.diagram_VIEWMODEL.edit.parts.ArmarioNombreEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(
					view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			gestionmodelosconsultas.diagram_VIEWMODEL.part.GestionModelosConsultasDiagramEditorPlugin
					.getInstance().logError(
							"Parser was not found for label " + 5035); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getComunicacion_2020Text(View view) {
		IParser parser = gestionmodelosconsultas.diagram_VIEWMODEL.providers.GestionModelosConsultasParserProvider
				.getParser(
						gestionmodelosconsultas.diagram_VIEWMODEL.providers.GestionModelosConsultasElementTypes.Comunicacion_2020,
						view.getElement() != null ? view.getElement() : view,
						gestionmodelosconsultas.diagram_VIEWMODEL.part.GestionModelosConsultasVisualIDRegistry
								.getType(gestionmodelosconsultas.diagram_VIEWMODEL.edit.parts.ComunicacionNombreEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(
					view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			gestionmodelosconsultas.diagram_VIEWMODEL.part.GestionModelosConsultasDiagramEditorPlugin
					.getInstance().logError(
							"Parser was not found for label " + 5036); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getContacto_2021Text(View view) {
		IParser parser = gestionmodelosconsultas.diagram_VIEWMODEL.providers.GestionModelosConsultasParserProvider
				.getParser(
						gestionmodelosconsultas.diagram_VIEWMODEL.providers.GestionModelosConsultasElementTypes.Contacto_2021,
						view.getElement() != null ? view.getElement() : view,
						gestionmodelosconsultas.diagram_VIEWMODEL.part.GestionModelosConsultasVisualIDRegistry
								.getType(gestionmodelosconsultas.diagram_VIEWMODEL.edit.parts.ContactoNombreEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(
					view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			gestionmodelosconsultas.diagram_VIEWMODEL.part.GestionModelosConsultasDiagramEditorPlugin
					.getInstance().logError(
							"Parser was not found for label " + 5037); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getDeposito_2022Text(View view) {
		IParser parser = gestionmodelosconsultas.diagram_VIEWMODEL.providers.GestionModelosConsultasParserProvider
				.getParser(
						gestionmodelosconsultas.diagram_VIEWMODEL.providers.GestionModelosConsultasElementTypes.Deposito_2022,
						view.getElement() != null ? view.getElement() : view,
						gestionmodelosconsultas.diagram_VIEWMODEL.part.GestionModelosConsultasVisualIDRegistry
								.getType(gestionmodelosconsultas.diagram_VIEWMODEL.edit.parts.DepositoNombreEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(
					view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			gestionmodelosconsultas.diagram_VIEWMODEL.part.GestionModelosConsultasDiagramEditorPlugin
					.getInstance().logError(
							"Parser was not found for label " + 5038); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getDisco_2023Text(View view) {
		IParser parser = gestionmodelosconsultas.diagram_VIEWMODEL.providers.GestionModelosConsultasParserProvider
				.getParser(
						gestionmodelosconsultas.diagram_VIEWMODEL.providers.GestionModelosConsultasElementTypes.Disco_2023,
						view.getElement() != null ? view.getElement() : view,
						gestionmodelosconsultas.diagram_VIEWMODEL.part.GestionModelosConsultasVisualIDRegistry
								.getType(gestionmodelosconsultas.diagram_VIEWMODEL.edit.parts.DiscoNombreEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(
					view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			gestionmodelosconsultas.diagram_VIEWMODEL.part.GestionModelosConsultasDiagramEditorPlugin
					.getInstance().logError(
							"Parser was not found for label " + 5039); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getInstanciaProceso_2024Text(View view) {
		IParser parser = gestionmodelosconsultas.diagram_VIEWMODEL.providers.GestionModelosConsultasParserProvider
				.getParser(
						gestionmodelosconsultas.diagram_VIEWMODEL.providers.GestionModelosConsultasElementTypes.InstanciaProceso_2024,
						view.getElement() != null ? view.getElement() : view,
						gestionmodelosconsultas.diagram_VIEWMODEL.part.GestionModelosConsultasVisualIDRegistry
								.getType(gestionmodelosconsultas.diagram_VIEWMODEL.edit.parts.InstanciaProcesoNombreEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(
					view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			gestionmodelosconsultas.diagram_VIEWMODEL.part.GestionModelosConsultasDiagramEditorPlugin
					.getInstance().logError(
							"Parser was not found for label " + 5040); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getQuien_2025Text(View view) {
		IParser parser = gestionmodelosconsultas.diagram_VIEWMODEL.providers.GestionModelosConsultasParserProvider
				.getParser(
						gestionmodelosconsultas.diagram_VIEWMODEL.providers.GestionModelosConsultasElementTypes.Quien_2025,
						view.getElement() != null ? view.getElement() : view,
						gestionmodelosconsultas.diagram_VIEWMODEL.part.GestionModelosConsultasVisualIDRegistry
								.getType(gestionmodelosconsultas.diagram_VIEWMODEL.edit.parts.QuienNombreEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(
					view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			gestionmodelosconsultas.diagram_VIEWMODEL.part.GestionModelosConsultasDiagramEditorPlugin
					.getInstance().logError(
							"Parser was not found for label " + 5041); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getRol_2026Text(View view) {
		IParser parser = gestionmodelosconsultas.diagram_VIEWMODEL.providers.GestionModelosConsultasParserProvider
				.getParser(
						gestionmodelosconsultas.diagram_VIEWMODEL.providers.GestionModelosConsultasElementTypes.Rol_2026,
						view.getElement() != null ? view.getElement() : view,
						gestionmodelosconsultas.diagram_VIEWMODEL.part.GestionModelosConsultasVisualIDRegistry
								.getType(gestionmodelosconsultas.diagram_VIEWMODEL.edit.parts.RolNombreEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(
					view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			gestionmodelosconsultas.diagram_VIEWMODEL.part.GestionModelosConsultasDiagramEditorPlugin
					.getInstance().logError(
							"Parser was not found for label " + 5042); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getFecha_2027Text(View view) {
		IParser parser = gestionmodelosconsultas.diagram_VIEWMODEL.providers.GestionModelosConsultasParserProvider
				.getParser(
						gestionmodelosconsultas.diagram_VIEWMODEL.providers.GestionModelosConsultasElementTypes.Fecha_2027,
						view.getElement() != null ? view.getElement() : view,
						gestionmodelosconsultas.diagram_VIEWMODEL.part.GestionModelosConsultasVisualIDRegistry
								.getType(gestionmodelosconsultas.diagram_VIEWMODEL.edit.parts.FechaNombreEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(
					view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			gestionmodelosconsultas.diagram_VIEWMODEL.part.GestionModelosConsultasDiagramEditorPlugin
					.getInstance().logError(
							"Parser was not found for label " + 5043); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getRelacion_4001Text(View view) {
		Relacion domainModelElement = (Relacion) view.getElement();
		if (domainModelElement != null) {
			return domainModelElement.getNombre();
		} else {
			gestionmodelosconsultas.diagram_VIEWMODEL.part.GestionModelosConsultasDiagramEditorPlugin
					.getInstance()
					.logError(
							"No domain element for view with visualID = " + 4001); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getUnknownElementText(View view) {
		return "<UnknownElement Visual_ID = " + view.getType() + ">"; //$NON-NLS-1$  //$NON-NLS-2$
	}

	/**
	 * @generated
	 */
	private String getUnresolvedDomainElementProxyText(View view) {
		return "<Unresolved domain element Visual_ID = " + view.getType() + ">"; //$NON-NLS-1$  //$NON-NLS-2$
	}

	/**
	 * @generated
	 */
	public void init(ICommonContentExtensionSite aConfig) {
	}

	/**
	 * @generated
	 */
	public void restoreState(IMemento aMemento) {
	}

	/**
	 * @generated
	 */
	public void saveState(IMemento aMemento) {
	}

	/**
	 * @generated
	 */
	public String getDescription(Object anElement) {
		return null;
	}

	/**
	 * @generated
	 */
	private boolean isOwnView(View view) {
		return gestionmodelosconsultas.diagram_VIEWMODEL.edit.parts.ViewModelEditPart.MODEL_ID
				.equals(gestionmodelosconsultas.diagram_VIEWMODEL.part.GestionModelosConsultasVisualIDRegistry
						.getModelID(view));
	}

}
