package gestionmodelosconsultas.diagram_PROYECCION.preferences;

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
		gestionmodelosconsultas.diagram_PROYECCION.preferences.DiagramGeneralPreferencePage
				.initDefaults(store);
		gestionmodelosconsultas.diagram_PROYECCION.preferences.DiagramAppearancePreferencePage
				.initDefaults(store);
		gestionmodelosconsultas.diagram_PROYECCION.preferences.DiagramConnectionsPreferencePage
				.initDefaults(store);
		gestionmodelosconsultas.diagram_PROYECCION.preferences.DiagramPrintingPreferencePage
				.initDefaults(store);
		gestionmodelosconsultas.diagram_PROYECCION.preferences.DiagramRulersAndGridPreferencePage
				.initDefaults(store);

	}

	/**
	 * @generated
	 */
	protected IPreferenceStore getPreferenceStore() {
		return gestionmodelosconsultas.diagram_PROYECCION.part.GestionModelosConsultasDiagramEditorPlugin
				.getInstance().getPreferenceStore();
	}
}
