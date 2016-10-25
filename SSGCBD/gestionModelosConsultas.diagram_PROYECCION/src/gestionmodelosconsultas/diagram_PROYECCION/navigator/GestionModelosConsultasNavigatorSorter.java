package gestionmodelosconsultas.diagram_PROYECCION.navigator;

import org.eclipse.jface.viewers.ViewerSorter;

/**
 * @generated
 */
public class GestionModelosConsultasNavigatorSorter extends ViewerSorter {

	/**
	 * @generated
	 */
	private static final int GROUP_CATEGORY = 7029;

	/**
	 * @generated
	 */
	public int category(Object element) {
		if (element instanceof gestionmodelosconsultas.diagram_PROYECCION.navigator.GestionModelosConsultasNavigatorItem) {
			gestionmodelosconsultas.diagram_PROYECCION.navigator.GestionModelosConsultasNavigatorItem item = (gestionmodelosconsultas.diagram_PROYECCION.navigator.GestionModelosConsultasNavigatorItem) element;
			return gestionmodelosconsultas.diagram_PROYECCION.part.GestionModelosConsultasVisualIDRegistry
					.getVisualID(item.getView());
		}
		return GROUP_CATEGORY;
	}

}
