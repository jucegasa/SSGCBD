package gestionmodelosconsultas.diagram_VIEWMODEL.edit.parts;

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
			switch (gestionmodelosconsultas.diagram_VIEWMODEL.part.GestionModelosConsultasVisualIDRegistry
					.getVisualID(view)) {

			case gestionmodelosconsultas.diagram_VIEWMODEL.edit.parts.ViewModelEditPart.VISUAL_ID:
				return new gestionmodelosconsultas.diagram_VIEWMODEL.edit.parts.ViewModelEditPart(
						view);

			case gestionmodelosconsultas.diagram_VIEWMODEL.edit.parts.UnidadOrganizacionalEditPart.VISUAL_ID:
				return new gestionmodelosconsultas.diagram_VIEWMODEL.edit.parts.UnidadOrganizacionalEditPart(
						view);

			case gestionmodelosconsultas.diagram_VIEWMODEL.edit.parts.UnidadOrganizacionalNombreEditPart.VISUAL_ID:
				return new gestionmodelosconsultas.diagram_VIEWMODEL.edit.parts.UnidadOrganizacionalNombreEditPart(
						view);

			case gestionmodelosconsultas.diagram_VIEWMODEL.edit.parts.DocumentoEditPart.VISUAL_ID:
				return new gestionmodelosconsultas.diagram_VIEWMODEL.edit.parts.DocumentoEditPart(
						view);

			case gestionmodelosconsultas.diagram_VIEWMODEL.edit.parts.DocumentoNombreEditPart.VISUAL_ID:
				return new gestionmodelosconsultas.diagram_VIEWMODEL.edit.parts.DocumentoNombreEditPart(
						view);

			case gestionmodelosconsultas.diagram_VIEWMODEL.edit.parts.ActividadEditPart.VISUAL_ID:
				return new gestionmodelosconsultas.diagram_VIEWMODEL.edit.parts.ActividadEditPart(
						view);

			case gestionmodelosconsultas.diagram_VIEWMODEL.edit.parts.ActividadNombreEditPart.VISUAL_ID:
				return new gestionmodelosconsultas.diagram_VIEWMODEL.edit.parts.ActividadNombreEditPart(
						view);

			case gestionmodelosconsultas.diagram_VIEWMODEL.edit.parts.ActorEditPart.VISUAL_ID:
				return new gestionmodelosconsultas.diagram_VIEWMODEL.edit.parts.ActorEditPart(
						view);

			case gestionmodelosconsultas.diagram_VIEWMODEL.edit.parts.ActorNombreEditPart.VISUAL_ID:
				return new gestionmodelosconsultas.diagram_VIEWMODEL.edit.parts.ActorNombreEditPart(
						view);

			case gestionmodelosconsultas.diagram_VIEWMODEL.edit.parts.ArmarioEditPart.VISUAL_ID:
				return new gestionmodelosconsultas.diagram_VIEWMODEL.edit.parts.ArmarioEditPart(
						view);

			case gestionmodelosconsultas.diagram_VIEWMODEL.edit.parts.ArmarioNombreEditPart.VISUAL_ID:
				return new gestionmodelosconsultas.diagram_VIEWMODEL.edit.parts.ArmarioNombreEditPart(
						view);

			case gestionmodelosconsultas.diagram_VIEWMODEL.edit.parts.ComunicacionEditPart.VISUAL_ID:
				return new gestionmodelosconsultas.diagram_VIEWMODEL.edit.parts.ComunicacionEditPart(
						view);

			case gestionmodelosconsultas.diagram_VIEWMODEL.edit.parts.ComunicacionNombreEditPart.VISUAL_ID:
				return new gestionmodelosconsultas.diagram_VIEWMODEL.edit.parts.ComunicacionNombreEditPart(
						view);

			case gestionmodelosconsultas.diagram_VIEWMODEL.edit.parts.ContactoEditPart.VISUAL_ID:
				return new gestionmodelosconsultas.diagram_VIEWMODEL.edit.parts.ContactoEditPart(
						view);

			case gestionmodelosconsultas.diagram_VIEWMODEL.edit.parts.ContactoNombreEditPart.VISUAL_ID:
				return new gestionmodelosconsultas.diagram_VIEWMODEL.edit.parts.ContactoNombreEditPart(
						view);

			case gestionmodelosconsultas.diagram_VIEWMODEL.edit.parts.DepositoEditPart.VISUAL_ID:
				return new gestionmodelosconsultas.diagram_VIEWMODEL.edit.parts.DepositoEditPart(
						view);

			case gestionmodelosconsultas.diagram_VIEWMODEL.edit.parts.DepositoNombreEditPart.VISUAL_ID:
				return new gestionmodelosconsultas.diagram_VIEWMODEL.edit.parts.DepositoNombreEditPart(
						view);

			case gestionmodelosconsultas.diagram_VIEWMODEL.edit.parts.DiscoEditPart.VISUAL_ID:
				return new gestionmodelosconsultas.diagram_VIEWMODEL.edit.parts.DiscoEditPart(
						view);

			case gestionmodelosconsultas.diagram_VIEWMODEL.edit.parts.DiscoNombreEditPart.VISUAL_ID:
				return new gestionmodelosconsultas.diagram_VIEWMODEL.edit.parts.DiscoNombreEditPart(
						view);

			case gestionmodelosconsultas.diagram_VIEWMODEL.edit.parts.InstanciaProcesoEditPart.VISUAL_ID:
				return new gestionmodelosconsultas.diagram_VIEWMODEL.edit.parts.InstanciaProcesoEditPart(
						view);

			case gestionmodelosconsultas.diagram_VIEWMODEL.edit.parts.InstanciaProcesoNombreEditPart.VISUAL_ID:
				return new gestionmodelosconsultas.diagram_VIEWMODEL.edit.parts.InstanciaProcesoNombreEditPart(
						view);

			case gestionmodelosconsultas.diagram_VIEWMODEL.edit.parts.QuienEditPart.VISUAL_ID:
				return new gestionmodelosconsultas.diagram_VIEWMODEL.edit.parts.QuienEditPart(
						view);

			case gestionmodelosconsultas.diagram_VIEWMODEL.edit.parts.QuienNombreEditPart.VISUAL_ID:
				return new gestionmodelosconsultas.diagram_VIEWMODEL.edit.parts.QuienNombreEditPart(
						view);

			case gestionmodelosconsultas.diagram_VIEWMODEL.edit.parts.RolEditPart.VISUAL_ID:
				return new gestionmodelosconsultas.diagram_VIEWMODEL.edit.parts.RolEditPart(
						view);

			case gestionmodelosconsultas.diagram_VIEWMODEL.edit.parts.RolNombreEditPart.VISUAL_ID:
				return new gestionmodelosconsultas.diagram_VIEWMODEL.edit.parts.RolNombreEditPart(
						view);

			case gestionmodelosconsultas.diagram_VIEWMODEL.edit.parts.FechaEditPart.VISUAL_ID:
				return new gestionmodelosconsultas.diagram_VIEWMODEL.edit.parts.FechaEditPart(
						view);

			case gestionmodelosconsultas.diagram_VIEWMODEL.edit.parts.FechaNombreEditPart.VISUAL_ID:
				return new gestionmodelosconsultas.diagram_VIEWMODEL.edit.parts.FechaNombreEditPart(
						view);

			case gestionmodelosconsultas.diagram_VIEWMODEL.edit.parts.FechaDiaEditPart.VISUAL_ID:
				return new gestionmodelosconsultas.diagram_VIEWMODEL.edit.parts.FechaDiaEditPart(
						view);

			case gestionmodelosconsultas.diagram_VIEWMODEL.edit.parts.FechaMesEditPart.VISUAL_ID:
				return new gestionmodelosconsultas.diagram_VIEWMODEL.edit.parts.FechaMesEditPart(
						view);

			case gestionmodelosconsultas.diagram_VIEWMODEL.edit.parts.FechaAnoEditPart.VISUAL_ID:
				return new gestionmodelosconsultas.diagram_VIEWMODEL.edit.parts.FechaAnoEditPart(
						view);

			case gestionmodelosconsultas.diagram_VIEWMODEL.edit.parts.UnidadOrganizacionalCompartmentUnidadOrganizacionalEditPart.VISUAL_ID:
				return new gestionmodelosconsultas.diagram_VIEWMODEL.edit.parts.UnidadOrganizacionalCompartmentUnidadOrganizacionalEditPart(
						view);

			case gestionmodelosconsultas.diagram_VIEWMODEL.edit.parts.DocumentoCompartmentDocumentoEditPart.VISUAL_ID:
				return new gestionmodelosconsultas.diagram_VIEWMODEL.edit.parts.DocumentoCompartmentDocumentoEditPart(
						view);

			case gestionmodelosconsultas.diagram_VIEWMODEL.edit.parts.ActividadCompartmentActividadEditPart.VISUAL_ID:
				return new gestionmodelosconsultas.diagram_VIEWMODEL.edit.parts.ActividadCompartmentActividadEditPart(
						view);

			case gestionmodelosconsultas.diagram_VIEWMODEL.edit.parts.ActorCompartmentActorEditPart.VISUAL_ID:
				return new gestionmodelosconsultas.diagram_VIEWMODEL.edit.parts.ActorCompartmentActorEditPart(
						view);

			case gestionmodelosconsultas.diagram_VIEWMODEL.edit.parts.ArmarioCompartmentArmarioEditPart.VISUAL_ID:
				return new gestionmodelosconsultas.diagram_VIEWMODEL.edit.parts.ArmarioCompartmentArmarioEditPart(
						view);

			case gestionmodelosconsultas.diagram_VIEWMODEL.edit.parts.ComunicacionCompartmentComunicacionEditPart.VISUAL_ID:
				return new gestionmodelosconsultas.diagram_VIEWMODEL.edit.parts.ComunicacionCompartmentComunicacionEditPart(
						view);

			case gestionmodelosconsultas.diagram_VIEWMODEL.edit.parts.ContactoCompartmentContactoEditPart.VISUAL_ID:
				return new gestionmodelosconsultas.diagram_VIEWMODEL.edit.parts.ContactoCompartmentContactoEditPart(
						view);

			case gestionmodelosconsultas.diagram_VIEWMODEL.edit.parts.DepositoCompartmentDepositoEditPart.VISUAL_ID:
				return new gestionmodelosconsultas.diagram_VIEWMODEL.edit.parts.DepositoCompartmentDepositoEditPart(
						view);

			case gestionmodelosconsultas.diagram_VIEWMODEL.edit.parts.DiscoCompartmentDiscoEditPart.VISUAL_ID:
				return new gestionmodelosconsultas.diagram_VIEWMODEL.edit.parts.DiscoCompartmentDiscoEditPart(
						view);

			case gestionmodelosconsultas.diagram_VIEWMODEL.edit.parts.InstanciaProcesoCompartmentInstanciaProcesoEditPart.VISUAL_ID:
				return new gestionmodelosconsultas.diagram_VIEWMODEL.edit.parts.InstanciaProcesoCompartmentInstanciaProcesoEditPart(
						view);

			case gestionmodelosconsultas.diagram_VIEWMODEL.edit.parts.QuienCompartmentQuienEditPart.VISUAL_ID:
				return new gestionmodelosconsultas.diagram_VIEWMODEL.edit.parts.QuienCompartmentQuienEditPart(
						view);

			case gestionmodelosconsultas.diagram_VIEWMODEL.edit.parts.RolCompartmentRolEditPart.VISUAL_ID:
				return new gestionmodelosconsultas.diagram_VIEWMODEL.edit.parts.RolCompartmentRolEditPart(
						view);

			case gestionmodelosconsultas.diagram_VIEWMODEL.edit.parts.FechaCompartmentFechaEditPart.VISUAL_ID:
				return new gestionmodelosconsultas.diagram_VIEWMODEL.edit.parts.FechaCompartmentFechaEditPart(
						view);

			case gestionmodelosconsultas.diagram_VIEWMODEL.edit.parts.RelacionEditPart.VISUAL_ID:
				return new gestionmodelosconsultas.diagram_VIEWMODEL.edit.parts.RelacionEditPart(
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
