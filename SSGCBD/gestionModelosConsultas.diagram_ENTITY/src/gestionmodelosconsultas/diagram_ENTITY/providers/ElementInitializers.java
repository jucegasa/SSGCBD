package gestionmodelosconsultas.diagram_ENTITY.providers;

/**
 * @generated
 */
public class ElementInitializers {

	protected ElementInitializers() {
		// use #getInstance to access cached instance
	}

	/**
	 * @generated
	 */
	public static ElementInitializers getInstance() {
		ElementInitializers cached = gestionmodelosconsultas.diagram_ENTITY.part.GestionModelosConsultasDiagramEditorPlugin
				.getInstance().getElementInitializers();
		if (cached == null) {
			gestionmodelosconsultas.diagram_ENTITY.part.GestionModelosConsultasDiagramEditorPlugin
					.getInstance().setElementInitializers(
							cached = new ElementInitializers());
		}
		return cached;
	}
}
