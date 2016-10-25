package gestionmodelosconsultas.diagram_PROYECCION.edit.policies;

import org.eclipse.gef.commands.Command;
import org.eclipse.gmf.runtime.emf.type.core.requests.CreateElementRequest;

/**
 * @generated
 */
public class ArmarioCompartmentArmarioItemSemanticEditPolicy
		extends
		gestionmodelosconsultas.diagram_PROYECCION.edit.policies.GestionModelosConsultasBaseItemSemanticEditPolicy {

	/**
	 * @generated
	 */
	public ArmarioCompartmentArmarioItemSemanticEditPolicy() {
		super(
				gestionmodelosconsultas.diagram_PROYECCION.providers.GestionModelosConsultasElementTypes.Armario_2019);
	}

	/**
	 * @generated
	 */
	protected Command getCreateCommand(CreateElementRequest req) {
		if (gestionmodelosconsultas.diagram_PROYECCION.providers.GestionModelosConsultasElementTypes.Campo_3005 == req
				.getElementType()) {
			return getGEFWrapper(new gestionmodelosconsultas.diagram_PROYECCION.edit.commands.Campo5CreateCommand(
					req));
		}
		return super.getCreateCommand(req);
	}

}
