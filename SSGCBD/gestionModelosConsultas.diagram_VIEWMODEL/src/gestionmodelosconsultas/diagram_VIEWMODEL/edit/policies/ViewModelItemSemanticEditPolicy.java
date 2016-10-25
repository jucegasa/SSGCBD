package gestionmodelosconsultas.diagram_VIEWMODEL.edit.policies;

import org.eclipse.emf.transaction.TransactionalEditingDomain;
import org.eclipse.gef.commands.Command;
import org.eclipse.gmf.runtime.diagram.ui.editparts.IGraphicalEditPart;
import org.eclipse.gmf.runtime.emf.commands.core.commands.DuplicateEObjectsCommand;
import org.eclipse.gmf.runtime.emf.type.core.requests.CreateElementRequest;
import org.eclipse.gmf.runtime.emf.type.core.requests.DuplicateElementsRequest;

/**
 * @generated
 */
public class ViewModelItemSemanticEditPolicy
		extends
		gestionmodelosconsultas.diagram_VIEWMODEL.edit.policies.GestionModelosConsultasBaseItemSemanticEditPolicy {

	/**
	 * @generated
	 */
	public ViewModelItemSemanticEditPolicy() {
		super(
				gestionmodelosconsultas.diagram_VIEWMODEL.providers.GestionModelosConsultasElementTypes.ViewModel_1000);
	}

	/**
	 * @generated
	 */
	protected Command getCreateCommand(CreateElementRequest req) {
		if (gestionmodelosconsultas.diagram_VIEWMODEL.providers.GestionModelosConsultasElementTypes.UnidadOrganizacional_2015 == req
				.getElementType()) {
			return getGEFWrapper(new gestionmodelosconsultas.diagram_VIEWMODEL.edit.commands.UnidadOrganizacionalCreateCommand(
					req));
		}
		if (gestionmodelosconsultas.diagram_VIEWMODEL.providers.GestionModelosConsultasElementTypes.Documento_2016 == req
				.getElementType()) {
			return getGEFWrapper(new gestionmodelosconsultas.diagram_VIEWMODEL.edit.commands.DocumentoCreateCommand(
					req));
		}
		if (gestionmodelosconsultas.diagram_VIEWMODEL.providers.GestionModelosConsultasElementTypes.Actividad_2017 == req
				.getElementType()) {
			return getGEFWrapper(new gestionmodelosconsultas.diagram_VIEWMODEL.edit.commands.ActividadCreateCommand(
					req));
		}
		if (gestionmodelosconsultas.diagram_VIEWMODEL.providers.GestionModelosConsultasElementTypes.Actor_2018 == req
				.getElementType()) {
			return getGEFWrapper(new gestionmodelosconsultas.diagram_VIEWMODEL.edit.commands.ActorCreateCommand(
					req));
		}
		if (gestionmodelosconsultas.diagram_VIEWMODEL.providers.GestionModelosConsultasElementTypes.Armario_2019 == req
				.getElementType()) {
			return getGEFWrapper(new gestionmodelosconsultas.diagram_VIEWMODEL.edit.commands.ArmarioCreateCommand(
					req));
		}
		if (gestionmodelosconsultas.diagram_VIEWMODEL.providers.GestionModelosConsultasElementTypes.Comunicacion_2020 == req
				.getElementType()) {
			return getGEFWrapper(new gestionmodelosconsultas.diagram_VIEWMODEL.edit.commands.ComunicacionCreateCommand(
					req));
		}
		if (gestionmodelosconsultas.diagram_VIEWMODEL.providers.GestionModelosConsultasElementTypes.Contacto_2021 == req
				.getElementType()) {
			return getGEFWrapper(new gestionmodelosconsultas.diagram_VIEWMODEL.edit.commands.ContactoCreateCommand(
					req));
		}
		if (gestionmodelosconsultas.diagram_VIEWMODEL.providers.GestionModelosConsultasElementTypes.Deposito_2022 == req
				.getElementType()) {
			return getGEFWrapper(new gestionmodelosconsultas.diagram_VIEWMODEL.edit.commands.DepositoCreateCommand(
					req));
		}
		if (gestionmodelosconsultas.diagram_VIEWMODEL.providers.GestionModelosConsultasElementTypes.Disco_2023 == req
				.getElementType()) {
			return getGEFWrapper(new gestionmodelosconsultas.diagram_VIEWMODEL.edit.commands.DiscoCreateCommand(
					req));
		}
		if (gestionmodelosconsultas.diagram_VIEWMODEL.providers.GestionModelosConsultasElementTypes.InstanciaProceso_2024 == req
				.getElementType()) {
			return getGEFWrapper(new gestionmodelosconsultas.diagram_VIEWMODEL.edit.commands.InstanciaProcesoCreateCommand(
					req));
		}
		if (gestionmodelosconsultas.diagram_VIEWMODEL.providers.GestionModelosConsultasElementTypes.Quien_2025 == req
				.getElementType()) {
			return getGEFWrapper(new gestionmodelosconsultas.diagram_VIEWMODEL.edit.commands.QuienCreateCommand(
					req));
		}
		if (gestionmodelosconsultas.diagram_VIEWMODEL.providers.GestionModelosConsultasElementTypes.Rol_2026 == req
				.getElementType()) {
			return getGEFWrapper(new gestionmodelosconsultas.diagram_VIEWMODEL.edit.commands.RolCreateCommand(
					req));
		}
		if (gestionmodelosconsultas.diagram_VIEWMODEL.providers.GestionModelosConsultasElementTypes.Fecha_2027 == req
				.getElementType()) {
			return getGEFWrapper(new gestionmodelosconsultas.diagram_VIEWMODEL.edit.commands.FechaCreateCommand(
					req));
		}
		return super.getCreateCommand(req);
	}

	/**
	 * @generated
	 */
	protected Command getDuplicateCommand(DuplicateElementsRequest req) {
		TransactionalEditingDomain editingDomain = ((IGraphicalEditPart) getHost())
				.getEditingDomain();
		return getGEFWrapper(new DuplicateAnythingCommand(editingDomain, req));
	}

	/**
	 * @generated
	 */
	private static class DuplicateAnythingCommand extends
			DuplicateEObjectsCommand {

		/**
		 * @generated
		 */
		public DuplicateAnythingCommand(
				TransactionalEditingDomain editingDomain,
				DuplicateElementsRequest req) {
			super(editingDomain, req.getLabel(), req
					.getElementsToBeDuplicated(), req
					.getAllDuplicatedElementsMap());
		}

	}

}
