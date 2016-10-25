package gestionmodelosconsultas.diagram_VIEWMODEL.preferences;

import org.eclipse.core.runtime.preferences.AbstractPreferenceInitializer;
import org.eclipse.jface.preference.IPreferenceStore;

/**
 * @generated
 */
public class DiagramPreferenceInitializer extends AbstractPreferenceInitializer {

	/**
	 * @generated
	 */
	public void initializeDefaultPreferences() {
		IPreferenceStore store = getPreferenceStore();
		gestionmodelosconsultas.diagram_VIEWMODEL.preferences.DiagramGeneralPreferencePage
				.initDefaults(store);
		gestionmodelosconsultas.diagram_VIEWMODEL.preferences.DiagramAppearancePreferencePage
				.initDefaults(store);
		gestionmodelosconsultas.diagram_VIEWMODEL.preferences.DiagramConnectionsPreferencePage
				.initDefaults(store);
		gestionmodelosconsultas.diagram_VIEWMODEL.preferences.DiagramPrintingPreferencePage
				.initDefaults(store);
		gestionmodelosconsultas.diagram_VIEWMODEL.preferences.DiagramRulersAndGridPreferencePage
				.initDefaults(store);

	}

	/**
	 * @generated
	 */
	protected IPreferenceStore getPreferenceStore() {
		return gestionmodelosconsultas.diagram_VIEWMODEL.part.GestionModelosConsultasDiagramEditorPlugin
				.getInstance().getPreferenceStore();
	}
}
