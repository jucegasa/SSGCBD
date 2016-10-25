package gestionmodelosconsultas.diagram_ENTITY.providers.assistants;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

import org.eclipse.core.runtime.IAdaptable;
import org.eclipse.gmf.runtime.diagram.ui.editparts.IGraphicalEditPart;
import org.eclipse.gmf.runtime.emf.type.core.IElementType;

/**
 * @generated
 */
public class GestionModelosConsultasModelingAssistantProviderOfEntityEditPart
		extends
		gestionmodelosconsultas.diagram_ENTITY.providers.GestionModelosConsultasModelingAssistantProvider {

	/**
	 * @generated
	 */
	@Override
	public List<IElementType> getTypesForPopupBar(IAdaptable host) {
		List<IElementType> types = new ArrayList<IElementType>(1);
		types.add(gestionmodelosconsultas.diagram_ENTITY.providers.GestionModelosConsultasElementTypes.Attribute_3002);
		return types;
	}

	/**
	 * @generated
	 */
	@Override
	public List<IElementType> getRelTypesOnSource(IAdaptable source) {
		IGraphicalEditPart sourceEditPart = (IGraphicalEditPart) source
				.getAdapter(IGraphicalEditPart.class);
		return doGetRelTypesOnSource((gestionmodelosconsultas.diagram_ENTITY.edit.parts.EntityEditPart) sourceEditPart);
	}

	/**
	 * @generated
	 */
	public List<IElementType> doGetRelTypesOnSource(
			gestionmodelosconsultas.diagram_ENTITY.edit.parts.EntityEditPart source) {
		List<IElementType> types = new ArrayList<IElementType>(1);
		types.add(gestionmodelosconsultas.diagram_ENTITY.providers.GestionModelosConsultasElementTypes.SimpleRelation_4001);
		return types;
	}

	/**
	 * @generated
	 */
	@Override
	public List<IElementType> getRelTypesOnSourceAndTarget(IAdaptable source,
			IAdaptable target) {
		IGraphicalEditPart sourceEditPart = (IGraphicalEditPart) source
				.getAdapter(IGraphicalEditPart.class);
		IGraphicalEditPart targetEditPart = (IGraphicalEditPart) target
				.getAdapter(IGraphicalEditPart.class);
		return doGetRelTypesOnSourceAndTarget(
				(gestionmodelosconsultas.diagram_ENTITY.edit.parts.EntityEditPart) sourceEditPart,
				targetEditPart);
	}

	/**
	 * @generated
	 */
	public List<IElementType> doGetRelTypesOnSourceAndTarget(
			gestionmodelosconsultas.diagram_ENTITY.edit.parts.EntityEditPart source,
			IGraphicalEditPart targetEditPart) {
		List<IElementType> types = new LinkedList<IElementType>();
		if (targetEditPart instanceof gestionmodelosconsultas.diagram_ENTITY.edit.parts.AssociativeEntityEditPart) {
			types.add(gestionmodelosconsultas.diagram_ENTITY.providers.GestionModelosConsultasElementTypes.SimpleRelation_4001);
		}
		if (targetEditPart instanceof gestionmodelosconsultas.diagram_ENTITY.edit.parts.EntityEditPart) {
			types.add(gestionmodelosconsultas.diagram_ENTITY.providers.GestionModelosConsultasElementTypes.SimpleRelation_4001);
		}
		return types;
	}

	/**
	 * @generated
	 */
	@Override
	public List<IElementType> getTypesForTarget(IAdaptable source,
			IElementType relationshipType) {
		IGraphicalEditPart sourceEditPart = (IGraphicalEditPart) source
				.getAdapter(IGraphicalEditPart.class);
		return doGetTypesForTarget(
				(gestionmodelosconsultas.diagram_ENTITY.edit.parts.EntityEditPart) sourceEditPart,
				relationshipType);
	}

	/**
	 * @generated
	 */
	public List<IElementType> doGetTypesForTarget(
			gestionmodelosconsultas.diagram_ENTITY.edit.parts.EntityEditPart source,
			IElementType relationshipType) {
		List<IElementType> types = new ArrayList<IElementType>();
		if (relationshipType == gestionmodelosconsultas.diagram_ENTITY.providers.GestionModelosConsultasElementTypes.SimpleRelation_4001) {
			types.add(gestionmodelosconsultas.diagram_ENTITY.providers.GestionModelosConsultasElementTypes.AssociativeEntity_2001);
			types.add(gestionmodelosconsultas.diagram_ENTITY.providers.GestionModelosConsultasElementTypes.Entity_2002);
		}
		return types;
	}

	/**
	 * @generated
	 */
	@Override
	public List<IElementType> getRelTypesOnTarget(IAdaptable target) {
		IGraphicalEditPart targetEditPart = (IGraphicalEditPart) target
				.getAdapter(IGraphicalEditPart.class);
		return doGetRelTypesOnTarget((gestionmodelosconsultas.diagram_ENTITY.edit.parts.EntityEditPart) targetEditPart);
	}

	/**
	 * @generated
	 */
	public List<IElementType> doGetRelTypesOnTarget(
			gestionmodelosconsultas.diagram_ENTITY.edit.parts.EntityEditPart target) {
		List<IElementType> types = new ArrayList<IElementType>(1);
		types.add(gestionmodelosconsultas.diagram_ENTITY.providers.GestionModelosConsultasElementTypes.SimpleRelation_4001);
		return types;
	}

	/**
	 * @generated
	 */
	@Override
	public List<IElementType> getTypesForSource(IAdaptable target,
			IElementType relationshipType) {
		IGraphicalEditPart targetEditPart = (IGraphicalEditPart) target
				.getAdapter(IGraphicalEditPart.class);
		return doGetTypesForSource(
				(gestionmodelosconsultas.diagram_ENTITY.edit.parts.EntityEditPart) targetEditPart,
				relationshipType);
	}

	/**
	 * @generated
	 */
	public List<IElementType> doGetTypesForSource(
			gestionmodelosconsultas.diagram_ENTITY.edit.parts.EntityEditPart target,
			IElementType relationshipType) {
		List<IElementType> types = new ArrayList<IElementType>();
		if (relationshipType == gestionmodelosconsultas.diagram_ENTITY.providers.GestionModelosConsultasElementTypes.SimpleRelation_4001) {
			types.add(gestionmodelosconsultas.diagram_ENTITY.providers.GestionModelosConsultasElementTypes.AssociativeEntity_2001);
			types.add(gestionmodelosconsultas.diagram_ENTITY.providers.GestionModelosConsultasElementTypes.Entity_2002);
		}
		return types;
	}

}
