package gestionmodelosconsultas.diagram_ENTITY.edit.policies;

import org.eclipse.gef.commands.Command;
import org.eclipse.gmf.runtime.emf.type.core.requests.CreateElementRequest;

/**
 * @generated
 */
public class AssociativeEntityCompartmentAssociativeEntityItemSemanticEditPolicy
		extends
		gestionmodelosconsultas.diagram_ENTITY.edit.policies.GestionModelosConsultasBaseItemSemanticEditPolicy {

	/**
	 * @generated
	 */
	public AssociativeEntityCompartmentAssociativeEntityItemSemanticEditPolicy() {
		super(
				gestionmodelosconsultas.diagram_ENTITY.providers.GestionModelosConsultasElementTypes.AssociativeEntity_2001);
	}

	/**
	 * @generated
	 */
	protected Command getCreateCommand(CreateElementRequest req) {
		if (gestionmodelosconsultas.diagram_ENTITY.providers.GestionModelosConsultasElementTypes.Attribute_3001 == req
				.getElementType()) {
			return getGEFWrapper(new gestionmodelosconsultas.diagram_ENTITY.edit.commands.AttributeCreateCommand(
					req));
		}
		return super.getCreateCommand(req);
	}

}
