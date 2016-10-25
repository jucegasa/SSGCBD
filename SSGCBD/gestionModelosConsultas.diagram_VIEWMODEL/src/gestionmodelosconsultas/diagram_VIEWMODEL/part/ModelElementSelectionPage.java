package gestionmodelosconsultas.diagram_VIEWMODEL.part;

import org.eclipse.gmf.tooling.runtime.part.DefaultModelElementSelectionPage;

/**
 * Wizard page that allows to select element from model.
 * @generated
 */
public class ModelElementSelectionPage extends DefaultModelElementSelectionPage {

	/**
	 * @generated
	 */
	public ModelElementSelectionPage(String pageName) {
		super(
				gestionmodelosconsultas.diagram_VIEWMODEL.part.GestionModelosConsultasDiagramEditorPlugin
						.getInstance().getItemProvidersAdapterFactory(),
				pageName);
	}

	/**
	 * Override to provide custom model element description.
	 * @generated
	 */
	protected String getSelectionTitle() {
		return gestionmodelosconsultas.diagram_VIEWMODEL.part.Messages.ModelElementSelectionPageMessage;
	}

}
