package gestionmodelosconsultas.diagram_ENTITY.edit.policies;

import org.eclipse.gef.commands.Command;
import org.eclipse.gmf.runtime.emf.type.core.commands.DestroyElementCommand;
import org.eclipse.gmf.runtime.emf.type.core.requests.DestroyElementRequest;

/**
 * @generated
 */
public class SimpleRelationItemSemanticEditPolicy
		extends
		gestionmodelosconsultas.diagram_ENTITY.edit.policies.GestionModelosConsultasBaseItemSemanticEditPolicy {

	/**
	 * @generated
	 */
	public SimpleRelationItemSemanticEditPolicy() {
		super(
				gestionmodelosconsultas.diagram_ENTITY.providers.GestionModelosConsultasElementTypes.SimpleRelation_4001);
	}

	/**
	 * @generated
	 */
	protected Command getDestroyElementCommand(DestroyElementRequest req) {
		return getGEFWrapper(new DestroyElementCommand(req));
	}

}
