package gestionmodelosconsultas.diagram_ENTITY.edit.policies;

import org.eclipse.emf.transaction.TransactionalEditingDomain;
import org.eclipse.gef.commands.Command;
import org.eclipse.gmf.runtime.diagram.ui.editparts.IGraphicalEditPart;
import org.eclipse.gmf.runtime.emf.commands.core.commands.DuplicateEObjectsCommand;
import org.eclipse.gmf.runtime.emf.type.core.requests.CreateElementRequest;
import org.eclipse.gmf.runtime.emf.type.core.requests.DuplicateElementsRequest;

/**
 * @generated
 */
public class DiagramEntityItemSemanticEditPolicy
		extends
		gestionmodelosconsultas.diagram_ENTITY.edit.policies.GestionModelosConsultasBaseItemSemanticEditPolicy {

	/**
	 * @generated
	 */
	public DiagramEntityItemSemanticEditPolicy() {
		super(
				gestionmodelosconsultas.diagram_ENTITY.providers.GestionModelosConsultasElementTypes.DiagramEntity_1000);
	}

	/**
	 * @generated
	 */
	protected Command getCreateCommand(CreateElementRequest req) {
		if (gestionmodelosconsultas.diagram_ENTITY.providers.GestionModelosConsultasElementTypes.AssociativeEntity_2001 == req
				.getElementType()) {
			return getGEFWrapper(new gestionmodelosconsultas.diagram_ENTITY.edit.commands.AssociativeEntityCreateCommand(
					req));
		}
		if (gestionmodelosconsultas.diagram_ENTITY.providers.GestionModelosConsultasElementTypes.Entity_2002 == req
				.getElementType()) {
			return getGEFWrapper(new gestionmodelosconsultas.diagram_ENTITY.edit.commands.EntityCreateCommand(
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
