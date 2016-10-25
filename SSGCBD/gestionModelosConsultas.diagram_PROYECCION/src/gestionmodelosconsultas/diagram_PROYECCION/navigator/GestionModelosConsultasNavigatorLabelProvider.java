package gestionmodelosconsultas.diagram_PROYECCION.navigator;

import gestionmodelosconsultas.modeloconsultas.model.Proyeccion;
import gestionmodelosconsultas.modeloconsultas.model.Relacion;

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
		gestionmodelosconsultas.diagram_PROYECCION.part.GestionModelosConsultasDiagramEditorPlugin
				.getInstance()
				.getImageRegistry()
				.put("Navigator?UnknownElement", ImageDescriptor.getMissingImageDescriptor()); //$NON-NLS-1$
		gestionmodelosconsultas.diagram_PROYECCION.part.GestionModelosConsultasDiagramEditorPlugin
				.getInstance()
				.getImageRegistry()
				.put("Navigator?ImageNotFound", ImageDescriptor.getMissingImageDescriptor()); //$NON-NLS-1$
	}

	/**
	 * @generated
	 */
	public void updateLabel(ViewerLabel label, TreePath elementPath) {
		Object element = elementPath.getLastSegment();
		if (element instanceof gestionmodelosconsultas.diagram_PROYECCION.navigator.GestionModelosConsultasNavigatorItem
				&& !isOwnView(((gestionmodelosconsultas.diagram_PROYECCION.navigator.GestionModelosConsultasNavigatorItem) element)
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
		if (element instanceof gestionmodelosconsultas.diagram_PROYECCION.navigator.GestionModelosConsultasNavigatorGroup) {
			gestionmodelosconsultas.diagram_PROYECCION.navigator.GestionModelosConsultasNavigatorGroup group = (gestionmodelosconsultas.diagram_PROYECCION.navigator.GestionModelosConsultasNavigatorGroup) element;
			return gestionmodelosconsultas.diagram_PROYECCION.part.GestionModelosConsultasDiagramEditorPlugin
					.getInstance().getBundledImage(group.getIcon());
		}

		if (element instanceof gestionmodelosconsultas.diagram_PROYECCION.navigator.GestionModelosConsultasNavigatorItem) {
			gestionmodelosconsultas.diagram_PROYECCION.navigator.GestionModelosConsultasNavigatorItem navigatorItem = (gestionmodelosconsultas.diagram_PROYECCION.navigator.GestionModelosConsultasNavigatorItem) element;
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
		switch (gestionmodelosconsultas.diagram_PROYECCION.part.GestionModelosConsultasVisualIDRegistry
				.getVisualID(view)) {
		case gestionmodelosconsultas.diagram_PROYECCION.edit.parts.ProyeccionEditPart.VISUAL_ID:
			return getImage(
					"Navigator?Diagram?http:///gestionmodelosconsultas/modeloconsultas/model.ecore?Proyeccion", gestionmodelosconsultas.diagram_PROYECCION.providers.GestionModelosConsultasElementTypes.Proyeccion_1000); //$NON-NLS-1$
		case gestionmodelosconsultas.diagram_PROYECCION.edit.parts.UnidadOrganizacionalEditPart.VISUAL_ID:
			return getImage(
					"Navigator?TopLevelNode?http:///gestionmodelosconsultas/modeloconsultas/quien.ecore?UnidadOrganizacional", gestionmodelosconsultas.diagram_PROYECCION.providers.GestionModelosConsultasElementTypes.UnidadOrganizacional_2015); //$NON-NLS-1$
		case gestionmodelosconsultas.diagram_PROYECCION.edit.parts.DocumentoEditPart.VISUAL_ID:
			return getImage(
					"Navigator?TopLevelNode?http:///gestionmodelosconsultas/modeloconsultas/que.ecore?Documento", gestionmodelosconsultas.diagram_PROYECCION.providers.GestionModelosConsultasElementTypes.Documento_2016); //$NON-NLS-1$
		case gestionmodelosconsultas.diagram_PROYECCION.edit.parts.ActividadEditPart.VISUAL_ID:
			return getImage(
					"Navigator?TopLevelNode?http:///gestionmodelosconsultas/modeloconsultas/como.ecore?Actividad", gestionmodelosconsultas.diagram_PROYECCION.providers.GestionModelosConsultasElementTypes.Actividad_2017); //$NON-NLS-1$
		case gestionmodelosconsultas.diagram_PROYECCION.edit.parts.ActorEditPart.VISUAL_ID:
			return getImage(
					"Navigator?TopLevelNode?http:///gestionmodelosconsultas/modeloconsultas/quien.ecore?Actor", gestionmodelosconsultas.diagram_PROYECCION.providers.GestionModelosConsultasElementTypes.Actor_2018); //$NON-NLS-1$
		case gestionmodelosconsultas.diagram_PROYECCION.edit.parts.ArmarioEditPart.VISUAL_ID:
			return getImage(
					"Navigator?TopLevelNode?http:///gestionmodelosconsultas/modeloconsultas/donde.ecore?Armario", gestionmodelosconsultas.diagram_PROYECCION.providers.GestionModelosConsultasElementTypes.Armario_2019); //$NON-NLS-1$
		case gestionmodelosconsultas.diagram_PROYECCION.edit.parts.ComunicacionEditPart.VISUAL_ID:
			return getImage(
					"Navigator?TopLevelNode?http:///gestionmodelosconsultas/modeloconsultas/que.ecore?Comunicacion", gestionmodelosconsultas.diagram_PROYECCION.providers.GestionModelosConsultasElementTypes.Comunicacion_2020); //$NON-NLS-1$
		case gestionmodelosconsultas.diagram_PROYECCION.edit.parts.ContactoEditPart.VISUAL_ID:
			return getImage(
					"Navigator?TopLevelNode?http:///gestionmodelosconsultas/modeloconsultas/quien.ecore?Contacto", gestionmodelosconsultas.diagram_PROYECCION.providers.GestionModelosConsultasElementTypes.Contacto_2021); //$NON-NLS-1$
		case gestionmodelosconsultas.diagram_PROYECCION.edit.parts.DepositoEditPart.VISUAL_ID:
			return getImage(
					"Navigator?TopLevelNode?http:///gestionmodelosconsultas/modeloconsultas/donde.ecore?Deposito", gestionmodelosconsultas.diagram_PROYECCION.providers.GestionModelosConsultasElementTypes.Deposito_2022); //$NON-NLS-1$
		case gestionmodelosconsultas.diagram_PROYECCION.edit.parts.DiscoEditPart.VISUAL_ID:
			return getImage(
					"Navigator?TopLevelNode?http:///gestionmodelosconsultas/modeloconsultas/donde.ecore?Disco", gestionmodelosconsultas.diagram_PROYECCION.providers.GestionModelosConsultasElementTypes.Disco_2023); //$NON-NLS-1$
		case gestionmodelosconsultas.diagram_PROYECCION.edit.parts.InstanciaProcesoEditPart.VISUAL_ID:
			return getImage(
					"Navigator?TopLevelNode?http:///gestionmodelosconsultas/modeloconsultas/como.ecore?InstanciaProceso", gestionmodelosconsultas.diagram_PROYECCION.providers.GestionModelosConsultasElementTypes.InstanciaProceso_2024); //$NON-NLS-1$
		case gestionmodelosconsultas.diagram_PROYECCION.edit.parts.QuienEditPart.VISUAL_ID:
			return getImage(
					"Navigator?TopLevelNode?http:///gestionmodelosconsultas/modeloconsultas/quien.ecore?Quien", gestionmodelosconsultas.diagram_PROYECCION.providers.GestionModelosConsultasElementTypes.Quien_2025); //$NON-NLS-1$
		case gestionmodelosconsultas.diagram_PROYECCION.edit.parts.RolEditPart.VISUAL_ID:
			return getImage(
					"Navigator?TopLevelNode?http:///gestionmodelosconsultas/modeloconsultas/quien.ecore?Rol", gestionmodelosconsultas.diagram_PROYECCION.providers.GestionModelosConsultasElementTypes.Rol_2026); //$NON-NLS-1$
		case gestionmodelosconsultas.diagram_PROYECCION.edit.parts.FechaEditPart.VISUAL_ID:
			return getImage(
					"Navigator?TopLevelNode?http:///gestionmodelosconsultas/modeloconsultas/cuando.ecore?Fecha", gestionmodelosconsultas.diagram_PROYECCION.providers.GestionModelosConsultasElementTypes.Fecha_2027); //$NON-NLS-1$
		case gestionmodelosconsultas.diagram_PROYECCION.edit.parts.CampoEditPart.VISUAL_ID:
			return getImage(
					"Navigator?Node?http:///gestionmodelosconsultas/modeloconsultas/model.ecore?Campo", gestionmodelosconsultas.diagram_PROYECCION.providers.GestionModelosConsultasElementTypes.Campo_3001); //$NON-NLS-1$
		case gestionmodelosconsultas.diagram_PROYECCION.edit.parts.Campo2EditPart.VISUAL_ID:
			return getImage(
					"Navigator?Node?http:///gestionmodelosconsultas/modeloconsultas/model.ecore?Campo", gestionmodelosconsultas.diagram_PROYECCION.providers.GestionModelosConsultasElementTypes.Campo_3002); //$NON-NLS-1$
		case gestionmodelosconsultas.diagram_PROYECCION.edit.parts.Campo3EditPart.VISUAL_ID:
			return getImage(
					"Navigator?Node?http:///gestionmodelosconsultas/modeloconsultas/model.ecore?Campo", gestionmodelosconsultas.diagram_PROYECCION.providers.GestionModelosConsultasElementTypes.Campo_3003); //$NON-NLS-1$
		case gestionmodelosconsultas.diagram_PROYECCION.edit.parts.Campo4EditPart.VISUAL_ID:
			return getImage(
					"Navigator?Node?http:///gestionmodelosconsultas/modeloconsultas/model.ecore?Campo", gestionmodelosconsultas.diagram_PROYECCION.providers.GestionModelosConsultasElementTypes.Campo_3004); //$NON-NLS-1$
		case gestionmodelosconsultas.diagram_PROYECCION.edit.parts.Campo5EditPart.VISUAL_ID:
			return getImage(
					"Navigator?Node?http:///gestionmodelosconsultas/modeloconsultas/model.ecore?Campo", gestionmodelosconsultas.diagram_PROYECCION.providers.GestionModelosConsultasElementTypes.Campo_3005); //$NON-NLS-1$
		case gestionmodelosconsultas.diagram_PROYECCION.edit.parts.Campo6EditPart.VISUAL_ID:
			return getImage(
					"Navigator?Node?http:///gestionmodelosconsultas/modeloconsultas/model.ecore?Campo", gestionmodelosconsultas.diagram_PROYECCION.providers.GestionModelosConsultasElementTypes.Campo_3006); //$NON-NLS-1$
		case gestionmodelosconsultas.diagram_PROYECCION.edit.parts.Campo7EditPart.VISUAL_ID:
			return getImage(
					"Navigator?Node?http:///gestionmodelosconsultas/modeloconsultas/model.ecore?Campo", gestionmodelosconsultas.diagram_PROYECCION.providers.GestionModelosConsultasElementTypes.Campo_3007); //$NON-NLS-1$
		case gestionmodelosconsultas.diagram_PROYECCION.edit.parts.Campo8EditPart.VISUAL_ID:
			return getImage(
					"Navigator?Node?http:///gestionmodelosconsultas/modeloconsultas/model.ecore?Campo", gestionmodelosconsultas.diagram_PROYECCION.providers.GestionModelosConsultasElementTypes.Campo_3008); //$NON-NLS-1$
		case gestionmodelosconsultas.diagram_PROYECCION.edit.parts.Campo9EditPart.VISUAL_ID:
			return getImage(
					"Navigator?Node?http:///gestionmodelosconsultas/modeloconsultas/model.ecore?Campo", gestionmodelosconsultas.diagram_PROYECCION.providers.GestionModelosConsultasElementTypes.Campo_3009); //$NON-NLS-1$
		case gestionmodelosconsultas.diagram_PROYECCION.edit.parts.Campo10EditPart.VISUAL_ID:
			return getImage(
					"Navigator?Node?http:///gestionmodelosconsultas/modeloconsultas/model.ecore?Campo", gestionmodelosconsultas.diagram_PROYECCION.providers.GestionModelosConsultasElementTypes.Campo_3010); //$NON-NLS-1$
		case gestionmodelosconsultas.diagram_PROYECCION.edit.parts.Campo11EditPart.VISUAL_ID:
			return getImage(
					"Navigator?Node?http:///gestionmodelosconsultas/modeloconsultas/model.ecore?Campo", gestionmodelosconsultas.diagram_PROYECCION.providers.GestionModelosConsultasElementTypes.Campo_3011); //$NON-NLS-1$
		case gestionmodelosconsultas.diagram_PROYECCION.edit.parts.Campo12EditPart.VISUAL_ID:
			return getImage(
					"Navigator?Node?http:///gestionmodelosconsultas/modeloconsultas/model.ecore?Campo", gestionmodelosconsultas.diagram_PROYECCION.providers.GestionModelosConsultasElementTypes.Campo_3012); //$NON-NLS-1$
		case gestionmodelosconsultas.diagram_PROYECCION.edit.parts.RelacionEditPart.VISUAL_ID:
			return getImage(
					"Navigator?Link?http:///gestionmodelosconsultas/modeloconsultas/model.ecore?Relacion", gestionmodelosconsultas.diagram_PROYECCION.providers.GestionModelosConsultasElementTypes.Relacion_4001); //$NON-NLS-1$
		}
		return getImage("Navigator?UnknownElement", null); //$NON-NLS-1$
	}

	/**
	 * @generated
	 */
	private Image getImage(String key, IElementType elementType) {
		ImageRegistry imageRegistry = gestionmodelosconsultas.diagram_PROYECCION.part.GestionModelosConsultasDiagramEditorPlugin
				.getInstance().getImageRegistry();
		Image image = imageRegistry.get(key);
		if (image == null
				&& elementType != null
				&& gestionmodelosconsultas.diagram_PROYECCION.providers.GestionModelosConsultasElementTypes
						.isKnownElementType(elementType)) {
			image = gestionmodelosconsultas.diagram_PROYECCION.providers.GestionModelosConsultasElementTypes
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
		if (element instanceof gestionmodelosconsultas.diagram_PROYECCION.navigator.GestionModelosConsultasNavigatorGroup) {
			gestionmodelosconsultas.diagram_PROYECCION.navigator.GestionModelosConsultasNavigatorGroup group = (gestionmodelosconsultas.diagram_PROYECCION.navigator.GestionModelosConsultasNavigatorGroup) element;
			return group.getGroupName();
		}

		if (element instanceof gestionmodelosconsultas.diagram_PROYECCION.navigator.GestionModelosConsultasNavigatorItem) {
			gestionmodelosconsultas.diagram_PROYECCION.navigator.GestionModelosConsultasNavigatorItem navigatorItem = (gestionmodelosconsultas.diagram_PROYECCION.navigator.GestionModelosConsultasNavigatorItem) element;
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
		switch (gestionmodelosconsultas.diagram_PROYECCION.part.GestionModelosConsultasVisualIDRegistry
				.getVisualID(view)) {
		case gestionmodelosconsultas.diagram_PROYECCION.edit.parts.ProyeccionEditPart.VISUAL_ID:
			return getProyeccion_1000Text(view);
		case gestionmodelosconsultas.diagram_PROYECCION.edit.parts.UnidadOrganizacionalEditPart.VISUAL_ID:
			return getUnidadOrganizacional_2015Text(view);
		case gestionmodelosconsultas.diagram_PROYECCION.edit.parts.DocumentoEditPart.VISUAL_ID:
			return getDocumento_2016Text(view);
		case gestionmodelosconsultas.diagram_PROYECCION.edit.parts.ActividadEditPart.VISUAL_ID:
			return getActividad_2017Text(view);
		case gestionmodelosconsultas.diagram_PROYECCION.edit.parts.ActorEditPart.VISUAL_ID:
			return getActor_2018Text(view);
		case gestionmodelosconsultas.diagram_PROYECCION.edit.parts.ArmarioEditPart.VISUAL_ID:
			return getArmario_2019Text(view);
		case gestionmodelosconsultas.diagram_PROYECCION.edit.parts.ComunicacionEditPart.VISUAL_ID:
			return getComunicacion_2020Text(view);
		case gestionmodelosconsultas.diagram_PROYECCION.edit.parts.ContactoEditPart.VISUAL_ID:
			return getContacto_2021Text(view);
		case gestionmodelosconsultas.diagram_PROYECCION.edit.parts.DepositoEditPart.VISUAL_ID:
			return getDeposito_2022Text(view);
		case gestionmodelosconsultas.diagram_PROYECCION.edit.parts.DiscoEditPart.VISUAL_ID:
			return getDisco_2023Text(view);
		case gestionmodelosconsultas.diagram_PROYECCION.edit.parts.InstanciaProcesoEditPart.VISUAL_ID:
			return getInstanciaProceso_2024Text(view);
		case gestionmodelosconsultas.diagram_PROYECCION.edit.parts.QuienEditPart.VISUAL_ID:
			return getQuien_2025Text(view);
		case gestionmodelosconsultas.diagram_PROYECCION.edit.parts.RolEditPart.VISUAL_ID:
			return getRol_2026Text(view);
		case gestionmodelosconsultas.diagram_PROYECCION.edit.parts.FechaEditPart.VISUAL_ID:
			return getFecha_2027Text(view);
		case gestionmodelosconsultas.diagram_PROYECCION.edit.parts.CampoEditPart.VISUAL_ID:
			return getCampo_3001Text(view);
		case gestionmodelosconsultas.diagram_PROYECCION.edit.parts.Campo2EditPart.VISUAL_ID:
			return getCampo_3002Text(view);
		case gestionmodelosconsultas.diagram_PROYECCION.edit.parts.Campo3EditPart.VISUAL_ID:
			return getCampo_3003Text(view);
		case gestionmodelosconsultas.diagram_PROYECCION.edit.parts.Campo4EditPart.VISUAL_ID:
			return getCampo_3004Text(view);
		case gestionmodelosconsultas.diagram_PROYECCION.edit.parts.Campo5EditPart.VISUAL_ID:
			return getCampo_3005Text(view);
		case gestionmodelosconsultas.diagram_PROYECCION.edit.parts.Campo6EditPart.VISUAL_ID:
			return getCampo_3006Text(view);
		case gestionmodelosconsultas.diagram_PROYECCION.edit.parts.Campo7EditPart.VISUAL_ID:
			return getCampo_3007Text(view);
		case gestionmodelosconsultas.diagram_PROYECCION.edit.parts.Campo8EditPart.VISUAL_ID:
			return getCampo_3008Text(view);
		case gestionmodelosconsultas.diagram_PROYECCION.edit.parts.Campo9EditPart.VISUAL_ID:
			return getCampo_3009Text(view);
		case gestionmodelosconsultas.diagram_PROYECCION.edit.parts.Campo10EditPart.VISUAL_ID:
			return getCampo_3010Text(view);
		case gestionmodelosconsultas.diagram_PROYECCION.edit.parts.Campo11EditPart.VISUAL_ID:
			return getCampo_3011Text(view);
		case gestionmodelosconsultas.diagram_PROYECCION.edit.parts.Campo12EditPart.VISUAL_ID:
			return getCampo_3012Text(view);
		case gestionmodelosconsultas.diagram_PROYECCION.edit.parts.RelacionEditPart.VISUAL_ID:
			return getRelacion_4001Text(view);
		}
		return getUnknownElementText(view);
	}

	/**
	 * @generated
	 */
	private String getProyeccion_1000Text(View view) {
		Proyeccion domainModelElement = (Proyeccion) view.getElement();
		if (domainModelElement != null) {
			return domainModelElement.getNombre();
		} else {
			gestionmodelosconsultas.diagram_PROYECCION.part.GestionModelosConsultasDiagramEditorPlugin
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
		IParser parser = gestionmodelosconsultas.diagram_PROYECCION.providers.GestionModelosConsultasParserProvider
				.getParser(
						gestionmodelosconsultas.diagram_PROYECCION.providers.GestionModelosConsultasElementTypes.UnidadOrganizacional_2015,
						view.getElement() != null ? view.getElement() : view,
						gestionmodelosconsultas.diagram_PROYECCION.part.GestionModelosConsultasVisualIDRegistry
								.getType(gestionmodelosconsultas.diagram_PROYECCION.edit.parts.UnidadOrganizacionalNombreEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(
					view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			gestionmodelosconsultas.diagram_PROYECCION.part.GestionModelosConsultasDiagramEditorPlugin
					.getInstance().logError(
							"Parser was not found for label " + 5031); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getDocumento_2016Text(View view) {
		IParser parser = gestionmodelosconsultas.diagram_PROYECCION.providers.GestionModelosConsultasParserProvider
				.getParser(
						gestionmodelosconsultas.diagram_PROYECCION.providers.GestionModelosConsultasElementTypes.Documento_2016,
						view.getElement() != null ? view.getElement() : view,
						gestionmodelosconsultas.diagram_PROYECCION.part.GestionModelosConsultasVisualIDRegistry
								.getType(gestionmodelosconsultas.diagram_PROYECCION.edit.parts.DocumentoNombreEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(
					view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			gestionmodelosconsultas.diagram_PROYECCION.part.GestionModelosConsultasDiagramEditorPlugin
					.getInstance().logError(
							"Parser was not found for label " + 5032); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getActividad_2017Text(View view) {
		IParser parser = gestionmodelosconsultas.diagram_PROYECCION.providers.GestionModelosConsultasParserProvider
				.getParser(
						gestionmodelosconsultas.diagram_PROYECCION.providers.GestionModelosConsultasElementTypes.Actividad_2017,
						view.getElement() != null ? view.getElement() : view,
						gestionmodelosconsultas.diagram_PROYECCION.part.GestionModelosConsultasVisualIDRegistry
								.getType(gestionmodelosconsultas.diagram_PROYECCION.edit.parts.ActividadNombreEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(
					view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			gestionmodelosconsultas.diagram_PROYECCION.part.GestionModelosConsultasDiagramEditorPlugin
					.getInstance().logError(
							"Parser was not found for label " + 5033); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getActor_2018Text(View view) {
		IParser parser = gestionmodelosconsultas.diagram_PROYECCION.providers.GestionModelosConsultasParserProvider
				.getParser(
						gestionmodelosconsultas.diagram_PROYECCION.providers.GestionModelosConsultasElementTypes.Actor_2018,
						view.getElement() != null ? view.getElement() : view,
						gestionmodelosconsultas.diagram_PROYECCION.part.GestionModelosConsultasVisualIDRegistry
								.getType(gestionmodelosconsultas.diagram_PROYECCION.edit.parts.ActorNombreEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(
					view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			gestionmodelosconsultas.diagram_PROYECCION.part.GestionModelosConsultasDiagramEditorPlugin
					.getInstance().logError(
							"Parser was not found for label " + 5034); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getArmario_2019Text(View view) {
		IParser parser = gestionmodelosconsultas.diagram_PROYECCION.providers.GestionModelosConsultasParserProvider
				.getParser(
						gestionmodelosconsultas.diagram_PROYECCION.providers.GestionModelosConsultasElementTypes.Armario_2019,
						view.getElement() != null ? view.getElement() : view,
						gestionmodelosconsultas.diagram_PROYECCION.part.GestionModelosConsultasVisualIDRegistry
								.getType(gestionmodelosconsultas.diagram_PROYECCION.edit.parts.ArmarioNombreEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(
					view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			gestionmodelosconsultas.diagram_PROYECCION.part.GestionModelosConsultasDiagramEditorPlugin
					.getInstance().logError(
							"Parser was not found for label " + 5035); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getComunicacion_2020Text(View view) {
		IParser parser = gestionmodelosconsultas.diagram_PROYECCION.providers.GestionModelosConsultasParserProvider
				.getParser(
						gestionmodelosconsultas.diagram_PROYECCION.providers.GestionModelosConsultasElementTypes.Comunicacion_2020,
						view.getElement() != null ? view.getElement() : view,
						gestionmodelosconsultas.diagram_PROYECCION.part.GestionModelosConsultasVisualIDRegistry
								.getType(gestionmodelosconsultas.diagram_PROYECCION.edit.parts.ComunicacionNombreEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(
					view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			gestionmodelosconsultas.diagram_PROYECCION.part.GestionModelosConsultasDiagramEditorPlugin
					.getInstance().logError(
							"Parser was not found for label " + 5036); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getContacto_2021Text(View view) {
		IParser parser = gestionmodelosconsultas.diagram_PROYECCION.providers.GestionModelosConsultasParserProvider
				.getParser(
						gestionmodelosconsultas.diagram_PROYECCION.providers.GestionModelosConsultasElementTypes.Contacto_2021,
						view.getElement() != null ? view.getElement() : view,
						gestionmodelosconsultas.diagram_PROYECCION.part.GestionModelosConsultasVisualIDRegistry
								.getType(gestionmodelosconsultas.diagram_PROYECCION.edit.parts.ContactoNombreEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(
					view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			gestionmodelosconsultas.diagram_PROYECCION.part.GestionModelosConsultasDiagramEditorPlugin
					.getInstance().logError(
							"Parser was not found for label " + 5037); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getDeposito_2022Text(View view) {
		IParser parser = gestionmodelosconsultas.diagram_PROYECCION.providers.GestionModelosConsultasParserProvider
				.getParser(
						gestionmodelosconsultas.diagram_PROYECCION.providers.GestionModelosConsultasElementTypes.Deposito_2022,
						view.getElement() != null ? view.getElement() : view,
						gestionmodelosconsultas.diagram_PROYECCION.part.GestionModelosConsultasVisualIDRegistry
								.getType(gestionmodelosconsultas.diagram_PROYECCION.edit.parts.DepositoNombreEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(
					view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			gestionmodelosconsultas.diagram_PROYECCION.part.GestionModelosConsultasDiagramEditorPlugin
					.getInstance().logError(
							"Parser was not found for label " + 5038); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getDisco_2023Text(View view) {
		IParser parser = gestionmodelosconsultas.diagram_PROYECCION.providers.GestionModelosConsultasParserProvider
				.getParser(
						gestionmodelosconsultas.diagram_PROYECCION.providers.GestionModelosConsultasElementTypes.Disco_2023,
						view.getElement() != null ? view.getElement() : view,
						gestionmodelosconsultas.diagram_PROYECCION.part.GestionModelosConsultasVisualIDRegistry
								.getType(gestionmodelosconsultas.diagram_PROYECCION.edit.parts.DiscoNombreEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(
					view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			gestionmodelosconsultas.diagram_PROYECCION.part.GestionModelosConsultasDiagramEditorPlugin
					.getInstance().logError(
							"Parser was not found for label " + 5039); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getInstanciaProceso_2024Text(View view) {
		IParser parser = gestionmodelosconsultas.diagram_PROYECCION.providers.GestionModelosConsultasParserProvider
				.getParser(
						gestionmodelosconsultas.diagram_PROYECCION.providers.GestionModelosConsultasElementTypes.InstanciaProceso_2024,
						view.getElement() != null ? view.getElement() : view,
						gestionmodelosconsultas.diagram_PROYECCION.part.GestionModelosConsultasVisualIDRegistry
								.getType(gestionmodelosconsultas.diagram_PROYECCION.edit.parts.InstanciaProcesoNombreEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(
					view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			gestionmodelosconsultas.diagram_PROYECCION.part.GestionModelosConsultasDiagramEditorPlugin
					.getInstance().logError(
							"Parser was not found for label " + 5040); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getQuien_2025Text(View view) {
		IParser parser = gestionmodelosconsultas.diagram_PROYECCION.providers.GestionModelosConsultasParserProvider
				.getParser(
						gestionmodelosconsultas.diagram_PROYECCION.providers.GestionModelosConsultasElementTypes.Quien_2025,
						view.getElement() != null ? view.getElement() : view,
						gestionmodelosconsultas.diagram_PROYECCION.part.GestionModelosConsultasVisualIDRegistry
								.getType(gestionmodelosconsultas.diagram_PROYECCION.edit.parts.QuienNombreEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(
					view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			gestionmodelosconsultas.diagram_PROYECCION.part.GestionModelosConsultasDiagramEditorPlugin
					.getInstance().logError(
							"Parser was not found for label " + 5041); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getRol_2026Text(View view) {
		IParser parser = gestionmodelosconsultas.diagram_PROYECCION.providers.GestionModelosConsultasParserProvider
				.getParser(
						gestionmodelosconsultas.diagram_PROYECCION.providers.GestionModelosConsultasElementTypes.Rol_2026,
						view.getElement() != null ? view.getElement() : view,
						gestionmodelosconsultas.diagram_PROYECCION.part.GestionModelosConsultasVisualIDRegistry
								.getType(gestionmodelosconsultas.diagram_PROYECCION.edit.parts.RolNombreEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(
					view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			gestionmodelosconsultas.diagram_PROYECCION.part.GestionModelosConsultasDiagramEditorPlugin
					.getInstance().logError(
							"Parser was not found for label " + 5042); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getFecha_2027Text(View view) {
		IParser parser = gestionmodelosconsultas.diagram_PROYECCION.providers.GestionModelosConsultasParserProvider
				.getParser(
						gestionmodelosconsultas.diagram_PROYECCION.providers.GestionModelosConsultasElementTypes.Fecha_2027,
						view.getElement() != null ? view.getElement() : view,
						gestionmodelosconsultas.diagram_PROYECCION.part.GestionModelosConsultasVisualIDRegistry
								.getType(gestionmodelosconsultas.diagram_PROYECCION.edit.parts.FechaNombreEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(
					view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			gestionmodelosconsultas.diagram_PROYECCION.part.GestionModelosConsultasDiagramEditorPlugin
					.getInstance().logError(
							"Parser was not found for label " + 5043); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getCampo_3001Text(View view) {
		IParser parser = gestionmodelosconsultas.diagram_PROYECCION.providers.GestionModelosConsultasParserProvider
				.getParser(
						gestionmodelosconsultas.diagram_PROYECCION.providers.GestionModelosConsultasElementTypes.Campo_3001,
						view.getElement() != null ? view.getElement() : view,
						gestionmodelosconsultas.diagram_PROYECCION.part.GestionModelosConsultasVisualIDRegistry
								.getType(gestionmodelosconsultas.diagram_PROYECCION.edit.parts.CampoNombreCampoEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(
					view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			gestionmodelosconsultas.diagram_PROYECCION.part.GestionModelosConsultasDiagramEditorPlugin
					.getInstance().logError(
							"Parser was not found for label " + 5001); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getCampo_3002Text(View view) {
		IParser parser = gestionmodelosconsultas.diagram_PROYECCION.providers.GestionModelosConsultasParserProvider
				.getParser(
						gestionmodelosconsultas.diagram_PROYECCION.providers.GestionModelosConsultasElementTypes.Campo_3002,
						view.getElement() != null ? view.getElement() : view,
						gestionmodelosconsultas.diagram_PROYECCION.part.GestionModelosConsultasVisualIDRegistry
								.getType(gestionmodelosconsultas.diagram_PROYECCION.edit.parts.CampoNombreCampo2EditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(
					view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			gestionmodelosconsultas.diagram_PROYECCION.part.GestionModelosConsultasDiagramEditorPlugin
					.getInstance().logError(
							"Parser was not found for label " + 5003); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getCampo_3003Text(View view) {
		IParser parser = gestionmodelosconsultas.diagram_PROYECCION.providers.GestionModelosConsultasParserProvider
				.getParser(
						gestionmodelosconsultas.diagram_PROYECCION.providers.GestionModelosConsultasElementTypes.Campo_3003,
						view.getElement() != null ? view.getElement() : view,
						gestionmodelosconsultas.diagram_PROYECCION.part.GestionModelosConsultasVisualIDRegistry
								.getType(gestionmodelosconsultas.diagram_PROYECCION.edit.parts.CampoNombreCampo3EditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(
					view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			gestionmodelosconsultas.diagram_PROYECCION.part.GestionModelosConsultasDiagramEditorPlugin
					.getInstance().logError(
							"Parser was not found for label " + 5005); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getCampo_3004Text(View view) {
		IParser parser = gestionmodelosconsultas.diagram_PROYECCION.providers.GestionModelosConsultasParserProvider
				.getParser(
						gestionmodelosconsultas.diagram_PROYECCION.providers.GestionModelosConsultasElementTypes.Campo_3004,
						view.getElement() != null ? view.getElement() : view,
						gestionmodelosconsultas.diagram_PROYECCION.part.GestionModelosConsultasVisualIDRegistry
								.getType(gestionmodelosconsultas.diagram_PROYECCION.edit.parts.CampoNombreCampo4EditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(
					view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			gestionmodelosconsultas.diagram_PROYECCION.part.GestionModelosConsultasDiagramEditorPlugin
					.getInstance().logError(
							"Parser was not found for label " + 5007); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getCampo_3005Text(View view) {
		IParser parser = gestionmodelosconsultas.diagram_PROYECCION.providers.GestionModelosConsultasParserProvider
				.getParser(
						gestionmodelosconsultas.diagram_PROYECCION.providers.GestionModelosConsultasElementTypes.Campo_3005,
						view.getElement() != null ? view.getElement() : view,
						gestionmodelosconsultas.diagram_PROYECCION.part.GestionModelosConsultasVisualIDRegistry
								.getType(gestionmodelosconsultas.diagram_PROYECCION.edit.parts.CampoNombreCampo5EditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(
					view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			gestionmodelosconsultas.diagram_PROYECCION.part.GestionModelosConsultasDiagramEditorPlugin
					.getInstance().logError(
							"Parser was not found for label " + 5009); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getCampo_3006Text(View view) {
		IParser parser = gestionmodelosconsultas.diagram_PROYECCION.providers.GestionModelosConsultasParserProvider
				.getParser(
						gestionmodelosconsultas.diagram_PROYECCION.providers.GestionModelosConsultasElementTypes.Campo_3006,
						view.getElement() != null ? view.getElement() : view,
						gestionmodelosconsultas.diagram_PROYECCION.part.GestionModelosConsultasVisualIDRegistry
								.getType(gestionmodelosconsultas.diagram_PROYECCION.edit.parts.CampoNombreCampo6EditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(
					view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			gestionmodelosconsultas.diagram_PROYECCION.part.GestionModelosConsultasDiagramEditorPlugin
					.getInstance().logError(
							"Parser was not found for label " + 5011); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getCampo_3007Text(View view) {
		IParser parser = gestionmodelosconsultas.diagram_PROYECCION.providers.GestionModelosConsultasParserProvider
				.getParser(
						gestionmodelosconsultas.diagram_PROYECCION.providers.GestionModelosConsultasElementTypes.Campo_3007,
						view.getElement() != null ? view.getElement() : view,
						gestionmodelosconsultas.diagram_PROYECCION.part.GestionModelosConsultasVisualIDRegistry
								.getType(gestionmodelosconsultas.diagram_PROYECCION.edit.parts.CampoNombreCampo7EditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(
					view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			gestionmodelosconsultas.diagram_PROYECCION.part.GestionModelosConsultasDiagramEditorPlugin
					.getInstance().logError(
							"Parser was not found for label " + 5013); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getCampo_3008Text(View view) {
		IParser parser = gestionmodelosconsultas.diagram_PROYECCION.providers.GestionModelosConsultasParserProvider
				.getParser(
						gestionmodelosconsultas.diagram_PROYECCION.providers.GestionModelosConsultasElementTypes.Campo_3008,
						view.getElement() != null ? view.getElement() : view,
						gestionmodelosconsultas.diagram_PROYECCION.part.GestionModelosConsultasVisualIDRegistry
								.getType(gestionmodelosconsultas.diagram_PROYECCION.edit.parts.CampoNombreCampo8EditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(
					view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			gestionmodelosconsultas.diagram_PROYECCION.part.GestionModelosConsultasDiagramEditorPlugin
					.getInstance().logError(
							"Parser was not found for label " + 5015); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getCampo_3009Text(View view) {
		IParser parser = gestionmodelosconsultas.diagram_PROYECCION.providers.GestionModelosConsultasParserProvider
				.getParser(
						gestionmodelosconsultas.diagram_PROYECCION.providers.GestionModelosConsultasElementTypes.Campo_3009,
						view.getElement() != null ? view.getElement() : view,
						gestionmodelosconsultas.diagram_PROYECCION.part.GestionModelosConsultasVisualIDRegistry
								.getType(gestionmodelosconsultas.diagram_PROYECCION.edit.parts.CampoNombreCampo9EditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(
					view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			gestionmodelosconsultas.diagram_PROYECCION.part.GestionModelosConsultasDiagramEditorPlugin
					.getInstance().logError(
							"Parser was not found for label " + 5017); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getCampo_3010Text(View view) {
		IParser parser = gestionmodelosconsultas.diagram_PROYECCION.providers.GestionModelosConsultasParserProvider
				.getParser(
						gestionmodelosconsultas.diagram_PROYECCION.providers.GestionModelosConsultasElementTypes.Campo_3010,
						view.getElement() != null ? view.getElement() : view,
						gestionmodelosconsultas.diagram_PROYECCION.part.GestionModelosConsultasVisualIDRegistry
								.getType(gestionmodelosconsultas.diagram_PROYECCION.edit.parts.CampoNombreCampo10EditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(
					view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			gestionmodelosconsultas.diagram_PROYECCION.part.GestionModelosConsultasDiagramEditorPlugin
					.getInstance().logError(
							"Parser was not found for label " + 5019); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getCampo_3011Text(View view) {
		IParser parser = gestionmodelosconsultas.diagram_PROYECCION.providers.GestionModelosConsultasParserProvider
				.getParser(
						gestionmodelosconsultas.diagram_PROYECCION.providers.GestionModelosConsultasElementTypes.Campo_3011,
						view.getElement() != null ? view.getElement() : view,
						gestionmodelosconsultas.diagram_PROYECCION.part.GestionModelosConsultasVisualIDRegistry
								.getType(gestionmodelosconsultas.diagram_PROYECCION.edit.parts.CampoNombreCampo11EditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(
					view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			gestionmodelosconsultas.diagram_PROYECCION.part.GestionModelosConsultasDiagramEditorPlugin
					.getInstance().logError(
							"Parser was not found for label " + 5021); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getCampo_3012Text(View view) {
		IParser parser = gestionmodelosconsultas.diagram_PROYECCION.providers.GestionModelosConsultasParserProvider
				.getParser(
						gestionmodelosconsultas.diagram_PROYECCION.providers.GestionModelosConsultasElementTypes.Campo_3012,
						view.getElement() != null ? view.getElement() : view,
						gestionmodelosconsultas.diagram_PROYECCION.part.GestionModelosConsultasVisualIDRegistry
								.getType(gestionmodelosconsultas.diagram_PROYECCION.edit.parts.CampoNombreCampo12EditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(
					view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			gestionmodelosconsultas.diagram_PROYECCION.part.GestionModelosConsultasDiagramEditorPlugin
					.getInstance().logError(
							"Parser was not found for label " + 5023); //$NON-NLS-1$
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
			gestionmodelosconsultas.diagram_PROYECCION.part.GestionModelosConsultasDiagramEditorPlugin
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
		return gestionmodelosconsultas.diagram_PROYECCION.edit.parts.ProyeccionEditPart.MODEL_ID
				.equals(gestionmodelosconsultas.diagram_PROYECCION.part.GestionModelosConsultasVisualIDRegistry
						.getModelID(view));
	}

}
