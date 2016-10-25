package gestionmodelosconsultas.diagram_ENTITY.providers.assistants;

import java.util.ArrayList;
import java.util.List;

import org.eclipse.core.runtime.IAdaptable;
import org.eclipse.gmf.runtime.emf.type.core.IElementType;

/**
 * @generated
 */
public class GestionModelosConsultasModelingAssistantProviderOfDiagramEntityEditPart
		extends
		gestionmodelosconsultas.diagram_ENTITY.providers.GestionModelosConsultasModelingAssistantProvider {

	/**
	 * @generated
	 */
	@Override
	public List<IElementType> getTypesForPopupBar(IAdaptable host) {
		List<IElementType> types = new ArrayList<IElementType>(2);
		types.add(gestionmodelosconsultas.diagram_ENTITY.providers.GestionModelosConsultasElementTypes.AssociativeEntity_2001);
		types.add(gestionmodelosconsultas.diagram_ENTITY.providers.GestionModelosConsultasElementTypes.Entity_2002);
		return types;
	}

}
