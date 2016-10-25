package gestionmodelosconsultas.diagram_VIEWMODEL.navigator;

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
		if (element instanceof gestionmodelosconsultas.diagram_VIEWMODEL.navigator.GestionModelosConsultasNavigatorItem) {
			gestionmodelosconsultas.diagram_VIEWMODEL.navigator.GestionModelosConsultasNavigatorItem item = (gestionmodelosconsultas.diagram_VIEWMODEL.navigator.GestionModelosConsultasNavigatorItem) element;
			return gestionmodelosconsultas.diagram_VIEWMODEL.part.GestionModelosConsultasVisualIDRegistry
					.getVisualID(item.getView());
		}
		return GROUP_CATEGORY;
	}

}
