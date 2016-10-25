package gestionmodelosconsultas.diagram_ENTITY.navigator;

import gestionmodelosconsultas.entitymodel.SimpleRelation;

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
		gestionmodelosconsultas.diagram_ENTITY.part.GestionModelosConsultasDiagramEditorPlugin
				.getInstance()
				.getImageRegistry()
				.put("Navigator?UnknownElement", ImageDescriptor.getMissingImageDescriptor()); //$NON-NLS-1$
		gestionmodelosconsultas.diagram_ENTITY.part.GestionModelosConsultasDiagramEditorPlugin
				.getInstance()
				.getImageRegistry()
				.put("Navigator?ImageNotFound", ImageDescriptor.getMissingImageDescriptor()); //$NON-NLS-1$
	}

	/**
	 * @generated
	 */
	public void updateLabel(ViewerLabel label, TreePath elementPath) {
		Object element = elementPath.getLastSegment();
		if (element instanceof gestionmodelosconsultas.diagram_ENTITY.navigator.GestionModelosConsultasNavigatorItem
				&& !isOwnView(((gestionmodelosconsultas.diagram_ENTITY.navigator.GestionModelosConsultasNavigatorItem) element)
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
		if (element instanceof gestionmodelosconsultas.diagram_ENTITY.navigator.GestionModelosConsultasNavigatorGroup) {
			gestionmodelosconsultas.diagram_ENTITY.navigator.GestionModelosConsultasNavigatorGroup group = (gestionmodelosconsultas.diagram_ENTITY.navigator.GestionModelosConsultasNavigatorGroup) element;
			return gestionmodelosconsultas.diagram_ENTITY.part.GestionModelosConsultasDiagramEditorPlugin
					.getInstance().getBundledImage(group.getIcon());
		}

		if (element instanceof gestionmodelosconsultas.diagram_ENTITY.navigator.GestionModelosConsultasNavigatorItem) {
			gestionmodelosconsultas.diagram_ENTITY.navigator.GestionModelosConsultasNavigatorItem navigatorItem = (gestionmodelosconsultas.diagram_ENTITY.navigator.GestionModelosConsultasNavigatorItem) element;
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
		switch (gestionmodelosconsultas.diagram_ENTITY.part.GestionModelosConsultasVisualIDRegistry
				.getVisualID(view)) {
		case gestionmodelosconsultas.diagram_ENTITY.edit.parts.DiagramEntityEditPart.VISUAL_ID:
			return getImage(
					"Navigator?Diagram?http:///gestionmodelosconsultas/entitymodel.ecore?DiagramEntity", gestionmodelosconsultas.diagram_ENTITY.providers.GestionModelosConsultasElementTypes.DiagramEntity_1000); //$NON-NLS-1$
		case gestionmodelosconsultas.diagram_ENTITY.edit.parts.AssociativeEntityEditPart.VISUAL_ID:
			return getImage(
					"Navigator?TopLevelNode?http:///gestionmodelosconsultas/entitymodel.ecore?AssociativeEntity", gestionmodelosconsultas.diagram_ENTITY.providers.GestionModelosConsultasElementTypes.AssociativeEntity_2001); //$NON-NLS-1$
		case gestionmodelosconsultas.diagram_ENTITY.edit.parts.EntityEditPart.VISUAL_ID:
			return getImage(
					"Navigator?TopLevelNode?http:///gestionmodelosconsultas/entitymodel.ecore?Entity", gestionmodelosconsultas.diagram_ENTITY.providers.GestionModelosConsultasElementTypes.Entity_2002); //$NON-NLS-1$
		case gestionmodelosconsultas.diagram_ENTITY.edit.parts.AttributeEditPart.VISUAL_ID:
			return getImage(
					"Navigator?Node?http:///gestionmodelosconsultas/entitymodel.ecore?Attribute", gestionmodelosconsultas.diagram_ENTITY.providers.GestionModelosConsultasElementTypes.Attribute_3001); //$NON-NLS-1$
		case gestionmodelosconsultas.diagram_ENTITY.edit.parts.Attribute2EditPart.VISUAL_ID:
			return getImage(
					"Navigator?Node?http:///gestionmodelosconsultas/entitymodel.ecore?Attribute", gestionmodelosconsultas.diagram_ENTITY.providers.GestionModelosConsultasElementTypes.Attribute_3002); //$NON-NLS-1$
		case gestionmodelosconsultas.diagram_ENTITY.edit.parts.SimpleRelationEditPart.VISUAL_ID:
			return getImage(
					"Navigator?Link?http:///gestionmodelosconsultas/entitymodel.ecore?SimpleRelation", gestionmodelosconsultas.diagram_ENTITY.providers.GestionModelosConsultasElementTypes.SimpleRelation_4001); //$NON-NLS-1$
		}
		return getImage("Navigator?UnknownElement", null); //$NON-NLS-1$
	}

	/**
	 * @generated
	 */
	private Image getImage(String key, IElementType elementType) {
		ImageRegistry imageRegistry = gestionmodelosconsultas.diagram_ENTITY.part.GestionModelosConsultasDiagramEditorPlugin
				.getInstance().getImageRegistry();
		Image image = imageRegistry.get(key);
		if (image == null
				&& elementType != null
				&& gestionmodelosconsultas.diagram_ENTITY.providers.GestionModelosConsultasElementTypes
						.isKnownElementType(elementType)) {
			image = gestionmodelosconsultas.diagram_ENTITY.providers.GestionModelosConsultasElementTypes
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
		if (element instanceof gestionmodelosconsultas.diagram_ENTITY.navigator.GestionModelosConsultasNavigatorGroup) {
			gestionmodelosconsultas.diagram_ENTITY.navigator.GestionModelosConsultasNavigatorGroup group = (gestionmodelosconsultas.diagram_ENTITY.navigator.GestionModelosConsultasNavigatorGroup) element;
			return group.getGroupName();
		}

		if (element instanceof gestionmodelosconsultas.diagram_ENTITY.navigator.GestionModelosConsultasNavigatorItem) {
			gestionmodelosconsultas.diagram_ENTITY.navigator.GestionModelosConsultasNavigatorItem navigatorItem = (gestionmodelosconsultas.diagram_ENTITY.navigator.GestionModelosConsultasNavigatorItem) element;
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
		switch (gestionmodelosconsultas.diagram_ENTITY.part.GestionModelosConsultasVisualIDRegistry
				.getVisualID(view)) {
		case gestionmodelosconsultas.diagram_ENTITY.edit.parts.DiagramEntityEditPart.VISUAL_ID:
			return getDiagramEntity_1000Text(view);
		case gestionmodelosconsultas.diagram_ENTITY.edit.parts.AssociativeEntityEditPart.VISUAL_ID:
			return getAssociativeEntity_2001Text(view);
		case gestionmodelosconsultas.diagram_ENTITY.edit.parts.EntityEditPart.VISUAL_ID:
			return getEntity_2002Text(view);
		case gestionmodelosconsultas.diagram_ENTITY.edit.parts.AttributeEditPart.VISUAL_ID:
			return getAttribute_3001Text(view);
		case gestionmodelosconsultas.diagram_ENTITY.edit.parts.Attribute2EditPart.VISUAL_ID:
			return getAttribute_3002Text(view);
		case gestionmodelosconsultas.diagram_ENTITY.edit.parts.SimpleRelationEditPart.VISUAL_ID:
			return getSimpleRelation_4001Text(view);
		}
		return getUnknownElementText(view);
	}

	/**
	 * @generated
	 */
	private String getDiagramEntity_1000Text(View view) {
		return ""; //$NON-NLS-1$
	}

	/**
	 * @generated
	 */
	private String getAssociativeEntity_2001Text(View view) {
		IParser parser = gestionmodelosconsultas.diagram_ENTITY.providers.GestionModelosConsultasParserProvider
				.getParser(
						gestionmodelosconsultas.diagram_ENTITY.providers.GestionModelosConsultasElementTypes.AssociativeEntity_2001,
						view.getElement() != null ? view.getElement() : view,
						gestionmodelosconsultas.diagram_ENTITY.part.GestionModelosConsultasVisualIDRegistry
								.getType(gestionmodelosconsultas.diagram_ENTITY.edit.parts.AssociativeEntityNameEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(
					view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			gestionmodelosconsultas.diagram_ENTITY.part.GestionModelosConsultasDiagramEditorPlugin
					.getInstance().logError(
							"Parser was not found for label " + 5002); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getEntity_2002Text(View view) {
		IParser parser = gestionmodelosconsultas.diagram_ENTITY.providers.GestionModelosConsultasParserProvider
				.getParser(
						gestionmodelosconsultas.diagram_ENTITY.providers.GestionModelosConsultasElementTypes.Entity_2002,
						view.getElement() != null ? view.getElement() : view,
						gestionmodelosconsultas.diagram_ENTITY.part.GestionModelosConsultasVisualIDRegistry
								.getType(gestionmodelosconsultas.diagram_ENTITY.edit.parts.EntityNameEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(
					view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			gestionmodelosconsultas.diagram_ENTITY.part.GestionModelosConsultasDiagramEditorPlugin
					.getInstance().logError(
							"Parser was not found for label " + 5005); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getAttribute_3001Text(View view) {
		IParser parser = gestionmodelosconsultas.diagram_ENTITY.providers.GestionModelosConsultasParserProvider
				.getParser(
						gestionmodelosconsultas.diagram_ENTITY.providers.GestionModelosConsultasElementTypes.Attribute_3001,
						view.getElement() != null ? view.getElement() : view,
						gestionmodelosconsultas.diagram_ENTITY.part.GestionModelosConsultasVisualIDRegistry
								.getType(gestionmodelosconsultas.diagram_ENTITY.edit.parts.AttributeNameEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(
					view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			gestionmodelosconsultas.diagram_ENTITY.part.GestionModelosConsultasDiagramEditorPlugin
					.getInstance().logError(
							"Parser was not found for label " + 5001); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getAttribute_3002Text(View view) {
		IParser parser = gestionmodelosconsultas.diagram_ENTITY.providers.GestionModelosConsultasParserProvider
				.getParser(
						gestionmodelosconsultas.diagram_ENTITY.providers.GestionModelosConsultasElementTypes.Attribute_3002,
						view.getElement() != null ? view.getElement() : view,
						gestionmodelosconsultas.diagram_ENTITY.part.GestionModelosConsultasVisualIDRegistry
								.getType(gestionmodelosconsultas.diagram_ENTITY.edit.parts.AttributeName2EditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(
					view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			gestionmodelosconsultas.diagram_ENTITY.part.GestionModelosConsultasDiagramEditorPlugin
					.getInstance().logError(
							"Parser was not found for label " + 5004); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getSimpleRelation_4001Text(View view) {
		SimpleRelation domainModelElement = (SimpleRelation) view.getElement();
		if (domainModelElement != null) {
			return domainModelElement.getName();
		} else {
			gestionmodelosconsultas.diagram_ENTITY.part.GestionModelosConsultasDiagramEditorPlugin
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
		return gestionmodelosconsultas.diagram_ENTITY.edit.parts.DiagramEntityEditPart.MODEL_ID
				.equals(gestionmodelosconsultas.diagram_ENTITY.part.GestionModelosConsultasVisualIDRegistry
						.getModelID(view));
	}

}
