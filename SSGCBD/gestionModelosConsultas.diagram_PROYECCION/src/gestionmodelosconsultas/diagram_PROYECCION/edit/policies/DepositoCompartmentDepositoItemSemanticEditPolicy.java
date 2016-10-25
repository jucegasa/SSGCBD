package gestionmodelosconsultas.diagram_PROYECCION.edit.policies;

import org.eclipse.gef.commands.Command;
import org.eclipse.gmf.runtime.emf.type.core.requests.CreateElementRequest;

/**
 * @generated
 */
public class DepositoCompartmentDepositoItemSemanticEditPolicy
		extends
		gestionmodelosconsultas.diagram_PROYECCION.edit.policies.GestionModelosConsultasBaseItemSemanticEditPolicy {

	/**
	 * @generated
	 */
	public DepositoCompartmentDepositoItemSemanticEditPolicy() {
		super(
				gestionmodelosconsultas.diagram_PROYECCION.providers.GestionModelosConsultasElementTypes.Deposito_2022);
	}

	/**
	 * @generated
	 */
	protected Command getCreateCommand(CreateElementRequest req) {
		if (gestionmodelosconsultas.diagram_PROYECCION.providers.GestionModelosConsultasElementTypes.Campo_3008 == req
				.getElementType()) {
			return getGEFWrapper(new gestionmodelosconsultas.diagram_PROYECCION.edit.commands.Campo8CreateCommand(
					req));
		}
		return super.getCreateCommand(req);
	}

}
