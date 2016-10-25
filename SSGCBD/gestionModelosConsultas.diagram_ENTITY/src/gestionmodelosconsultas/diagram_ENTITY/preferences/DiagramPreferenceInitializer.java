package gestionmodelosconsultas.diagram_ENTITY.preferences;

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
		gestionmodelosconsultas.diagram_ENTITY.preferences.DiagramGeneralPreferencePage
				.initDefaults(store);
		gestionmodelosconsultas.diagram_ENTITY.preferences.DiagramAppearancePreferencePage
				.initDefaults(store);
		gestionmodelosconsultas.diagram_ENTITY.preferences.DiagramConnectionsPreferencePage
				.initDefaults(store);
		gestionmodelosconsultas.diagram_ENTITY.preferences.DiagramPrintingPreferencePage
				.initDefaults(store);
		gestionmodelosconsultas.diagram_ENTITY.preferences.DiagramRulersAndGridPreferencePage
				.initDefaults(store);

	}

	/**
	 * @generated
	 */
	protected IPreferenceStore getPreferenceStore() {
		return gestionmodelosconsultas.diagram_ENTITY.part.GestionModelosConsultasDiagramEditorPlugin
				.getInstance().getPreferenceStore();
	}
}
