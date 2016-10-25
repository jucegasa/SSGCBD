package gestionmodelosconsultas.diagram_PROYECCION.edit.policies;

import org.eclipse.gef.commands.Command;
import org.eclipse.gmf.runtime.emf.type.core.requests.CreateElementRequest;

/**
 * @generated
 */
public class ComunicacionCompartmentComunicacionItemSemanticEditPolicy
		extends
		gestionmodelosconsultas.diagram_PROYECCION.edit.policies.GestionModelosConsultasBaseItemSemanticEditPolicy {

	/**
	 * @generated
	 */
	public ComunicacionCompartmentComunicacionItemSemanticEditPolicy() {
		super(
				gestionmodelosconsultas.diagram_PROYECCION.providers.GestionModelosConsultasElementTypes.Comunicacion_2020);
	}

	/**
	 * @generated
	 */
	protected Command getCreateCommand(CreateElementRequest req) {
		if (gestionmodelosconsultas.diagram_PROYECCION.providers.GestionModelosConsultasElementTypes.Campo_3006 == req
				.getElementType()) {
			return getGEFWrapper(new gestionmodelosconsultas.diagram_PROYECCION.edit.commands.Campo6CreateCommand(
					req));
		}
		return super.getCreateCommand(req);
	}

}
