package gestionmodelosconsultas.diagram_ENTITY.edit.policies;

import org.eclipse.gef.commands.Command;
import org.eclipse.gmf.runtime.emf.type.core.requests.CreateElementRequest;

/**
 * @generated
 */
public class EntityCompartmentEntityItemSemanticEditPolicy
		extends
		gestionmodelosconsultas.diagram_ENTITY.edit.policies.GestionModelosConsultasBaseItemSemanticEditPolicy {

	/**
	 * @generated
	 */
	public EntityCompartmentEntityItemSemanticEditPolicy() {
		super(
				gestionmodelosconsultas.diagram_ENTITY.providers.GestionModelosConsultasElementTypes.Entity_2002);
	}

	/**
	 * @generated
	 */
	protected Command getCreateCommand(CreateElementRequest req) {
		if (gestionmodelosconsultas.diagram_ENTITY.providers.GestionModelosConsultasElementTypes.Attribute_3002 == req
				.getElementType()) {
			return getGEFWrapper(new gestionmodelosconsultas.diagram_ENTITY.edit.commands.Attribute2CreateCommand(
					req));
		}
		return super.getCreateCommand(req);
	}

}
