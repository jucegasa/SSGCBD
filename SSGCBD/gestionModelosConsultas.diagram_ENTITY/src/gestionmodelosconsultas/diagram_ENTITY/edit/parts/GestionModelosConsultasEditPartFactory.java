package gestionmodelosconsultas.diagram_ENTITY.edit.parts;

import org.eclipse.gef.EditPart;
import org.eclipse.gef.EditPartFactory;
import org.eclipse.gef.tools.CellEditorLocator;
import org.eclipse.gmf.runtime.diagram.ui.editparts.ITextAwareEditPart;
import org.eclipse.gmf.runtime.notation.View;
import org.eclipse.gmf.tooling.runtime.directedit.locator.CellEditorLocatorAccess;

/**
 * @generated
 */
public class GestionModelosConsultasEditPartFactory implements EditPartFactory {

	/**
	 * @generated
	 */
	public EditPart createEditPart(EditPart context, Object model) {
		if (model instanceof View) {
			View view = (View) model;
			switch (gestionmodelosconsultas.diagram_ENTITY.part.GestionModelosConsultasVisualIDRegistry
					.getVisualID(view)) {

			case gestionmodelosconsultas.diagram_ENTITY.edit.parts.DiagramEntityEditPart.VISUAL_ID:
				return new gestionmodelosconsultas.diagram_ENTITY.edit.parts.DiagramEntityEditPart(
						view);

			case gestionmodelosconsultas.diagram_ENTITY.edit.parts.AssociativeEntityEditPart.VISUAL_ID:
				return new gestionmodelosconsultas.diagram_ENTITY.edit.parts.AssociativeEntityEditPart(
						view);

			case gestionmodelosconsultas.diagram_ENTITY.edit.parts.AssociativeEntityNameEditPart.VISUAL_ID:
				return new gestionmodelosconsultas.diagram_ENTITY.edit.parts.AssociativeEntityNameEditPart(
						view);

			case gestionmodelosconsultas.diagram_ENTITY.edit.parts.AssociativeEntityStereotypeEditPart.VISUAL_ID:
				return new gestionmodelosconsultas.diagram_ENTITY.edit.parts.AssociativeEntityStereotypeEditPart(
						view);

			case gestionmodelosconsultas.diagram_ENTITY.edit.parts.EntityEditPart.VISUAL_ID:
				return new gestionmodelosconsultas.diagram_ENTITY.edit.parts.EntityEditPart(
						view);

			case gestionmodelosconsultas.diagram_ENTITY.edit.parts.EntityNameEditPart.VISUAL_ID:
				return new gestionmodelosconsultas.diagram_ENTITY.edit.parts.EntityNameEditPart(
						view);

			case gestionmodelosconsultas.diagram_ENTITY.edit.parts.EntityStereotypeEditPart.VISUAL_ID:
				return new gestionmodelosconsultas.diagram_ENTITY.edit.parts.EntityStereotypeEditPart(
						view);

			case gestionmodelosconsultas.diagram_ENTITY.edit.parts.AttributeEditPart.VISUAL_ID:
				return new gestionmodelosconsultas.diagram_ENTITY.edit.parts.AttributeEditPart(
						view);

			case gestionmodelosconsultas.diagram_ENTITY.edit.parts.AttributeNameEditPart.VISUAL_ID:
				return new gestionmodelosconsultas.diagram_ENTITY.edit.parts.AttributeNameEditPart(
						view);

			case gestionmodelosconsultas.diagram_ENTITY.edit.parts.Attribute2EditPart.VISUAL_ID:
				return new gestionmodelosconsultas.diagram_ENTITY.edit.parts.Attribute2EditPart(
						view);

			case gestionmodelosconsultas.diagram_ENTITY.edit.parts.AttributeName2EditPart.VISUAL_ID:
				return new gestionmodelosconsultas.diagram_ENTITY.edit.parts.AttributeName2EditPart(
						view);

			case gestionmodelosconsultas.diagram_ENTITY.edit.parts.AssociativeEntityCompartmentAssociativeEntityEditPart.VISUAL_ID:
				return new gestionmodelosconsultas.diagram_ENTITY.edit.parts.AssociativeEntityCompartmentAssociativeEntityEditPart(
						view);

			case gestionmodelosconsultas.diagram_ENTITY.edit.parts.EntityCompartmentEntityEditPart.VISUAL_ID:
				return new gestionmodelosconsultas.diagram_ENTITY.edit.parts.EntityCompartmentEntityEditPart(
						view);

			case gestionmodelosconsultas.diagram_ENTITY.edit.parts.SimpleRelationEditPart.VISUAL_ID:
				return new gestionmodelosconsultas.diagram_ENTITY.edit.parts.SimpleRelationEditPart(
						view);

			}
		}
		return createUnrecognizedEditPart(context, model);
	}

	/**
	 * @generated
	 */
	private EditPart createUnrecognizedEditPart(EditPart context, Object model) {
		// Handle creation of unrecognized child node EditParts here
		return null;
	}

	/**
	 * @generated
	 */
	public static CellEditorLocator getTextCellEditorLocator(
			ITextAwareEditPart source) {
		return CellEditorLocatorAccess.INSTANCE
				.getTextCellEditorLocator(source);
	}

}
