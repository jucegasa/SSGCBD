package gestionmodelosconsultas.diagram_ENTITY.navigator;

import org.eclipse.jface.viewers.ViewerSorter;

/**
 * @generated
 */
public class GestionModelosConsultasNavigatorSorter extends ViewerSorter {

	/**
	 * @generated
	 */
	private static final int GROUP_CATEGORY = 7004;

	/**
	 * @generated
	 */
	public int category(Object element) {
		if (element instanceof gestionmodelosconsultas.diagram_ENTITY.navigator.GestionModelosConsultasNavigatorItem) {
			gestionmodelosconsultas.diagram_ENTITY.navigator.GestionModelosConsultasNavigatorItem item = (gestionmodelosconsultas.diagram_ENTITY.navigator.GestionModelosConsultasNavigatorItem) element;
			return gestionmodelosconsultas.diagram_ENTITY.part.GestionModelosConsultasVisualIDRegistry
					.getVisualID(item.getView());
		}
		return GROUP_CATEGORY;
	}

}
