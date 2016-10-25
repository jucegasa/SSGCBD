package gestionmodelosconsultas.diagram_PROYECCION.edit.parts;

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
			switch (gestionmodelosconsultas.diagram_PROYECCION.part.GestionModelosConsultasVisualIDRegistry
					.getVisualID(view)) {

			case gestionmodelosconsultas.diagram_PROYECCION.edit.parts.ProyeccionEditPart.VISUAL_ID:
				return new gestionmodelosconsultas.diagram_PROYECCION.edit.parts.ProyeccionEditPart(
						view);

			case gestionmodelosconsultas.diagram_PROYECCION.edit.parts.UnidadOrganizacionalEditPart.VISUAL_ID:
				return new gestionmodelosconsultas.diagram_PROYECCION.edit.parts.UnidadOrganizacionalEditPart(
						view);

			case gestionmodelosconsultas.diagram_PROYECCION.edit.parts.UnidadOrganizacionalNombreEditPart.VISUAL_ID:
				return new gestionmodelosconsultas.diagram_PROYECCION.edit.parts.UnidadOrganizacionalNombreEditPart(
						view);

			case gestionmodelosconsultas.diagram_PROYECCION.edit.parts.DocumentoEditPart.VISUAL_ID:
				return new gestionmodelosconsultas.diagram_PROYECCION.edit.parts.DocumentoEditPart(
						view);

			case gestionmodelosconsultas.diagram_PROYECCION.edit.parts.DocumentoNombreEditPart.VISUAL_ID:
				return new gestionmodelosconsultas.diagram_PROYECCION.edit.parts.DocumentoNombreEditPart(
						view);

			case gestionmodelosconsultas.diagram_PROYECCION.edit.parts.ActividadEditPart.VISUAL_ID:
				return new gestionmodelosconsultas.diagram_PROYECCION.edit.parts.ActividadEditPart(
						view);

			case gestionmodelosconsultas.diagram_PROYECCION.edit.parts.ActividadNombreEditPart.VISUAL_ID:
				return new gestionmodelosconsultas.diagram_PROYECCION.edit.parts.ActividadNombreEditPart(
						view);

			case gestionmodelosconsultas.diagram_PROYECCION.edit.parts.ActorEditPart.VISUAL_ID:
				return new gestionmodelosconsultas.diagram_PROYECCION.edit.parts.ActorEditPart(
						view);

			case gestionmodelosconsultas.diagram_PROYECCION.edit.parts.ActorNombreEditPart.VISUAL_ID:
				return new gestionmodelosconsultas.diagram_PROYECCION.edit.parts.ActorNombreEditPart(
						view);

			case gestionmodelosconsultas.diagram_PROYECCION.edit.parts.ArmarioEditPart.VISUAL_ID:
				return new gestionmodelosconsultas.diagram_PROYECCION.edit.parts.ArmarioEditPart(
						view);

			case gestionmodelosconsultas.diagram_PROYECCION.edit.parts.ArmarioNombreEditPart.VISUAL_ID:
				return new gestionmodelosconsultas.diagram_PROYECCION.edit.parts.ArmarioNombreEditPart(
						view);

			case gestionmodelosconsultas.diagram_PROYECCION.edit.parts.ComunicacionEditPart.VISUAL_ID:
				return new gestionmodelosconsultas.diagram_PROYECCION.edit.parts.ComunicacionEditPart(
						view);

			case gestionmodelosconsultas.diagram_PROYECCION.edit.parts.ComunicacionNombreEditPart.VISUAL_ID:
				return new gestionmodelosconsultas.diagram_PROYECCION.edit.parts.ComunicacionNombreEditPart(
						view);

			case gestionmodelosconsultas.diagram_PROYECCION.edit.parts.ContactoEditPart.VISUAL_ID:
				return new gestionmodelosconsultas.diagram_PROYECCION.edit.parts.ContactoEditPart(
						view);

			case gestionmodelosconsultas.diagram_PROYECCION.edit.parts.ContactoNombreEditPart.VISUAL_ID:
				return new gestionmodelosconsultas.diagram_PROYECCION.edit.parts.ContactoNombreEditPart(
						view);

			case gestionmodelosconsultas.diagram_PROYECCION.edit.parts.DepositoEditPart.VISUAL_ID:
				return new gestionmodelosconsultas.diagram_PROYECCION.edit.parts.DepositoEditPart(
						view);

			case gestionmodelosconsultas.diagram_PROYECCION.edit.parts.DepositoNombreEditPart.VISUAL_ID:
				return new gestionmodelosconsultas.diagram_PROYECCION.edit.parts.DepositoNombreEditPart(
						view);

			case gestionmodelosconsultas.diagram_PROYECCION.edit.parts.DiscoEditPart.VISUAL_ID:
				return new gestionmodelosconsultas.diagram_PROYECCION.edit.parts.DiscoEditPart(
						view);

			case gestionmodelosconsultas.diagram_PROYECCION.edit.parts.DiscoNombreEditPart.VISUAL_ID:
				return new gestionmodelosconsultas.diagram_PROYECCION.edit.parts.DiscoNombreEditPart(
						view);

			case gestionmodelosconsultas.diagram_PROYECCION.edit.parts.InstanciaProcesoEditPart.VISUAL_ID:
				return new gestionmodelosconsultas.diagram_PROYECCION.edit.parts.InstanciaProcesoEditPart(
						view);

			case gestionmodelosconsultas.diagram_PROYECCION.edit.parts.InstanciaProcesoNombreEditPart.VISUAL_ID:
				return new gestionmodelosconsultas.diagram_PROYECCION.edit.parts.InstanciaProcesoNombreEditPart(
						view);

			case gestionmodelosconsultas.diagram_PROYECCION.edit.parts.QuienEditPart.VISUAL_ID:
				return new gestionmodelosconsultas.diagram_PROYECCION.edit.parts.QuienEditPart(
						view);

			case gestionmodelosconsultas.diagram_PROYECCION.edit.parts.QuienNombreEditPart.VISUAL_ID:
				return new gestionmodelosconsultas.diagram_PROYECCION.edit.parts.QuienNombreEditPart(
						view);

			case gestionmodelosconsultas.diagram_PROYECCION.edit.parts.RolEditPart.VISUAL_ID:
				return new gestionmodelosconsultas.diagram_PROYECCION.edit.parts.RolEditPart(
						view);

			case gestionmodelosconsultas.diagram_PROYECCION.edit.parts.RolNombreEditPart.VISUAL_ID:
				return new gestionmodelosconsultas.diagram_PROYECCION.edit.parts.RolNombreEditPart(
						view);

			case gestionmodelosconsultas.diagram_PROYECCION.edit.parts.FechaEditPart.VISUAL_ID:
				return new gestionmodelosconsultas.diagram_PROYECCION.edit.parts.FechaEditPart(
						view);

			case gestionmodelosconsultas.diagram_PROYECCION.edit.parts.FechaNombreEditPart.VISUAL_ID:
				return new gestionmodelosconsultas.diagram_PROYECCION.edit.parts.FechaNombreEditPart(
						view);

			case gestionmodelosconsultas.diagram_PROYECCION.edit.parts.FechaDiaEditPart.VISUAL_ID:
				return new gestionmodelosconsultas.diagram_PROYECCION.edit.parts.FechaDiaEditPart(
						view);

			case gestionmodelosconsultas.diagram_PROYECCION.edit.parts.FechaMesEditPart.VISUAL_ID:
				return new gestionmodelosconsultas.diagram_PROYECCION.edit.parts.FechaMesEditPart(
						view);

			case gestionmodelosconsultas.diagram_PROYECCION.edit.parts.FechaAnoEditPart.VISUAL_ID:
				return new gestionmodelosconsultas.diagram_PROYECCION.edit.parts.FechaAnoEditPart(
						view);

			case gestionmodelosconsultas.diagram_PROYECCION.edit.parts.CampoEditPart.VISUAL_ID:
				return new gestionmodelosconsultas.diagram_PROYECCION.edit.parts.CampoEditPart(
						view);

			case gestionmodelosconsultas.diagram_PROYECCION.edit.parts.CampoNombreCampoEditPart.VISUAL_ID:
				return new gestionmodelosconsultas.diagram_PROYECCION.edit.parts.CampoNombreCampoEditPart(
						view);

			case gestionmodelosconsultas.diagram_PROYECCION.edit.parts.Campo2EditPart.VISUAL_ID:
				return new gestionmodelosconsultas.diagram_PROYECCION.edit.parts.Campo2EditPart(
						view);

			case gestionmodelosconsultas.diagram_PROYECCION.edit.parts.CampoNombreCampo2EditPart.VISUAL_ID:
				return new gestionmodelosconsultas.diagram_PROYECCION.edit.parts.CampoNombreCampo2EditPart(
						view);

			case gestionmodelosconsultas.diagram_PROYECCION.edit.parts.Campo3EditPart.VISUAL_ID:
				return new gestionmodelosconsultas.diagram_PROYECCION.edit.parts.Campo3EditPart(
						view);

			case gestionmodelosconsultas.diagram_PROYECCION.edit.parts.CampoNombreCampo3EditPart.VISUAL_ID:
				return new gestionmodelosconsultas.diagram_PROYECCION.edit.parts.CampoNombreCampo3EditPart(
						view);

			case gestionmodelosconsultas.diagram_PROYECCION.edit.parts.Campo4EditPart.VISUAL_ID:
				return new gestionmodelosconsultas.diagram_PROYECCION.edit.parts.Campo4EditPart(
						view);

			case gestionmodelosconsultas.diagram_PROYECCION.edit.parts.CampoNombreCampo4EditPart.VISUAL_ID:
				return new gestionmodelosconsultas.diagram_PROYECCION.edit.parts.CampoNombreCampo4EditPart(
						view);

			case gestionmodelosconsultas.diagram_PROYECCION.edit.parts.Campo5EditPart.VISUAL_ID:
				return new gestionmodelosconsultas.diagram_PROYECCION.edit.parts.Campo5EditPart(
						view);

			case gestionmodelosconsultas.diagram_PROYECCION.edit.parts.CampoNombreCampo5EditPart.VISUAL_ID:
				return new gestionmodelosconsultas.diagram_PROYECCION.edit.parts.CampoNombreCampo5EditPart(
						view);

			case gestionmodelosconsultas.diagram_PROYECCION.edit.parts.Campo6EditPart.VISUAL_ID:
				return new gestionmodelosconsultas.diagram_PROYECCION.edit.parts.Campo6EditPart(
						view);

			case gestionmodelosconsultas.diagram_PROYECCION.edit.parts.CampoNombreCampo6EditPart.VISUAL_ID:
				return new gestionmodelosconsultas.diagram_PROYECCION.edit.parts.CampoNombreCampo6EditPart(
						view);

			case gestionmodelosconsultas.diagram_PROYECCION.edit.parts.Campo7EditPart.VISUAL_ID:
				return new gestionmodelosconsultas.diagram_PROYECCION.edit.parts.Campo7EditPart(
						view);

			case gestionmodelosconsultas.diagram_PROYECCION.edit.parts.CampoNombreCampo7EditPart.VISUAL_ID:
				return new gestionmodelosconsultas.diagram_PROYECCION.edit.parts.CampoNombreCampo7EditPart(
						view);

			case gestionmodelosconsultas.diagram_PROYECCION.edit.parts.Campo8EditPart.VISUAL_ID:
				return new gestionmodelosconsultas.diagram_PROYECCION.edit.parts.Campo8EditPart(
						view);

			case gestionmodelosconsultas.diagram_PROYECCION.edit.parts.CampoNombreCampo8EditPart.VISUAL_ID:
				return new gestionmodelosconsultas.diagram_PROYECCION.edit.parts.CampoNombreCampo8EditPart(
						view);

			case gestionmodelosconsultas.diagram_PROYECCION.edit.parts.Campo9EditPart.VISUAL_ID:
				return new gestionmodelosconsultas.diagram_PROYECCION.edit.parts.Campo9EditPart(
						view);

			case gestionmodelosconsultas.diagram_PROYECCION.edit.parts.CampoNombreCampo9EditPart.VISUAL_ID:
				return new gestionmodelosconsultas.diagram_PROYECCION.edit.parts.CampoNombreCampo9EditPart(
						view);

			case gestionmodelosconsultas.diagram_PROYECCION.edit.parts.Campo10EditPart.VISUAL_ID:
				return new gestionmodelosconsultas.diagram_PROYECCION.edit.parts.Campo10EditPart(
						view);

			case gestionmodelosconsultas.diagram_PROYECCION.edit.parts.CampoNombreCampo10EditPart.VISUAL_ID:
				return new gestionmodelosconsultas.diagram_PROYECCION.edit.parts.CampoNombreCampo10EditPart(
						view);

			case gestionmodelosconsultas.diagram_PROYECCION.edit.parts.Campo11EditPart.VISUAL_ID:
				return new gestionmodelosconsultas.diagram_PROYECCION.edit.parts.Campo11EditPart(
						view);

			case gestionmodelosconsultas.diagram_PROYECCION.edit.parts.CampoNombreCampo11EditPart.VISUAL_ID:
				return new gestionmodelosconsultas.diagram_PROYECCION.edit.parts.CampoNombreCampo11EditPart(
						view);

			case gestionmodelosconsultas.diagram_PROYECCION.edit.parts.Campo12EditPart.VISUAL_ID:
				return new gestionmodelosconsultas.diagram_PROYECCION.edit.parts.Campo12EditPart(
						view);

			case gestionmodelosconsultas.diagram_PROYECCION.edit.parts.CampoNombreCampo12EditPart.VISUAL_ID:
				return new gestionmodelosconsultas.diagram_PROYECCION.edit.parts.CampoNombreCampo12EditPart(
						view);

			case gestionmodelosconsultas.diagram_PROYECCION.edit.parts.UnidadOrganizacionalCompartmentUnidadOrganizacionalEditPart.VISUAL_ID:
				return new gestionmodelosconsultas.diagram_PROYECCION.edit.parts.UnidadOrganizacionalCompartmentUnidadOrganizacionalEditPart(
						view);

			case gestionmodelosconsultas.diagram_PROYECCION.edit.parts.DocumentoCompartmentDocumentoEditPart.VISUAL_ID:
				return new gestionmodelosconsultas.diagram_PROYECCION.edit.parts.DocumentoCompartmentDocumentoEditPart(
						view);

			case gestionmodelosconsultas.diagram_PROYECCION.edit.parts.ActividadCompartmentActividadEditPart.VISUAL_ID:
				return new gestionmodelosconsultas.diagram_PROYECCION.edit.parts.ActividadCompartmentActividadEditPart(
						view);

			case gestionmodelosconsultas.diagram_PROYECCION.edit.parts.ActorCompartmentActorEditPart.VISUAL_ID:
				return new gestionmodelosconsultas.diagram_PROYECCION.edit.parts.ActorCompartmentActorEditPart(
						view);

			case gestionmodelosconsultas.diagram_PROYECCION.edit.parts.ArmarioCompartmentArmarioEditPart.VISUAL_ID:
				return new gestionmodelosconsultas.diagram_PROYECCION.edit.parts.ArmarioCompartmentArmarioEditPart(
						view);

			case gestionmodelosconsultas.diagram_PROYECCION.edit.parts.ComunicacionCompartmentComunicacionEditPart.VISUAL_ID:
				return new gestionmodelosconsultas.diagram_PROYECCION.edit.parts.ComunicacionCompartmentComunicacionEditPart(
						view);

			case gestionmodelosconsultas.diagram_PROYECCION.edit.parts.ContactoCompartmentContactoEditPart.VISUAL_ID:
				return new gestionmodelosconsultas.diagram_PROYECCION.edit.parts.ContactoCompartmentContactoEditPart(
						view);

			case gestionmodelosconsultas.diagram_PROYECCION.edit.parts.DepositoCompartmentDepositoEditPart.VISUAL_ID:
				return new gestionmodelosconsultas.diagram_PROYECCION.edit.parts.DepositoCompartmentDepositoEditPart(
						view);

			case gestionmodelosconsultas.diagram_PROYECCION.edit.parts.DiscoCompartmentDiscoEditPart.VISUAL_ID:
				return new gestionmodelosconsultas.diagram_PROYECCION.edit.parts.DiscoCompartmentDiscoEditPart(
						view);

			case gestionmodelosconsultas.diagram_PROYECCION.edit.parts.InstanciaProcesoCompartmentInstanciaProcesoEditPart.VISUAL_ID:
				return new gestionmodelosconsultas.diagram_PROYECCION.edit.parts.InstanciaProcesoCompartmentInstanciaProcesoEditPart(
						view);

			case gestionmodelosconsultas.diagram_PROYECCION.edit.parts.QuienCompartmentQuienEditPart.VISUAL_ID:
				return new gestionmodelosconsultas.diagram_PROYECCION.edit.parts.QuienCompartmentQuienEditPart(
						view);

			case gestionmodelosconsultas.diagram_PROYECCION.edit.parts.RolCompartmentRolEditPart.VISUAL_ID:
				return new gestionmodelosconsultas.diagram_PROYECCION.edit.parts.RolCompartmentRolEditPart(
						view);

			case gestionmodelosconsultas.diagram_PROYECCION.edit.parts.FechaCompartmentFechaEditPart.VISUAL_ID:
				return new gestionmodelosconsultas.diagram_PROYECCION.edit.parts.FechaCompartmentFechaEditPart(
						view);

			case gestionmodelosconsultas.diagram_PROYECCION.edit.parts.RelacionEditPart.VISUAL_ID:
				return new gestionmodelosconsultas.diagram_PROYECCION.edit.parts.RelacionEditPart(
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
