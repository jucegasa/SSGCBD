package gestionmodelosconsultas.diagram_ENTITY.part;

import java.util.ArrayList;
import java.util.Collections;

import org.eclipse.gef.palette.PaletteContainer;
import org.eclipse.gef.palette.PaletteDrawer;
import org.eclipse.gef.palette.PaletteRoot;
import org.eclipse.gef.palette.ToolEntry;
import org.eclipse.gmf.runtime.emf.type.core.IElementType;
import org.eclipse.gmf.tooling.runtime.part.DefaultLinkToolEntry;
import org.eclipse.gmf.tooling.runtime.part.DefaultNodeToolEntry;

/**
 * @generated
 */
public class GestionModelosConsultasPaletteFactory {

	/**
	 * @generated
	 */
	public void fillPalette(PaletteRoot paletteRoot) {
		paletteRoot.add(createEntity1Group());
		paletteRoot.add(createRealtion2Group());
	}

	/**
	 * Creates "Entity" palette tool group
	 * @generated
	 */
	private PaletteContainer createEntity1Group() {
		PaletteDrawer paletteContainer = new PaletteDrawer(
				gestionmodelosconsultas.diagram_ENTITY.part.Messages.Entity1Group_title);
		paletteContainer.setId("createEntity1Group"); //$NON-NLS-1$
		paletteContainer.add(createEntity1CreationTool());
		paletteContainer.add(createAssociativeEntity2CreationTool());
		paletteContainer.add(createAttribute3CreationTool());
		return paletteContainer;
	}

	/**
	 * Creates "Realtion" palette tool group
	 * @generated
	 */
	private PaletteContainer createRealtion2Group() {
		PaletteDrawer paletteContainer = new PaletteDrawer(
				gestionmodelosconsultas.diagram_ENTITY.part.Messages.Realtion2Group_title);
		paletteContainer.setId("createRealtion2Group"); //$NON-NLS-1$
		paletteContainer.add(createSimpleRelation1CreationTool());
		return paletteContainer;
	}

	/**
	 * @generated
	 */
	private ToolEntry createEntity1CreationTool() {
		DefaultNodeToolEntry entry = new DefaultNodeToolEntry(
				gestionmodelosconsultas.diagram_ENTITY.part.Messages.Entity1CreationTool_title,
				gestionmodelosconsultas.diagram_ENTITY.part.Messages.Entity1CreationTool_desc,
				Collections
						.singletonList(gestionmodelosconsultas.diagram_ENTITY.providers.GestionModelosConsultasElementTypes.Entity_2002));
		entry.setId("createEntity1CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(gestionmodelosconsultas.diagram_ENTITY.providers.GestionModelosConsultasElementTypes
				.getImageDescriptor(gestionmodelosconsultas.diagram_ENTITY.providers.GestionModelosConsultasElementTypes.Entity_2002));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createAssociativeEntity2CreationTool() {
		DefaultNodeToolEntry entry = new DefaultNodeToolEntry(
				gestionmodelosconsultas.diagram_ENTITY.part.Messages.AssociativeEntity2CreationTool_title,
				gestionmodelosconsultas.diagram_ENTITY.part.Messages.AssociativeEntity2CreationTool_desc,
				Collections
						.singletonList(gestionmodelosconsultas.diagram_ENTITY.providers.GestionModelosConsultasElementTypes.AssociativeEntity_2001));
		entry.setId("createAssociativeEntity2CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(gestionmodelosconsultas.diagram_ENTITY.providers.GestionModelosConsultasElementTypes
				.getImageDescriptor(gestionmodelosconsultas.diagram_ENTITY.providers.GestionModelosConsultasElementTypes.AssociativeEntity_2001));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createAttribute3CreationTool() {
		ArrayList<IElementType> types = new ArrayList<IElementType>(2);
		types.add(gestionmodelosconsultas.diagram_ENTITY.providers.GestionModelosConsultasElementTypes.Attribute_3001);
		types.add(gestionmodelosconsultas.diagram_ENTITY.providers.GestionModelosConsultasElementTypes.Attribute_3002);
		DefaultNodeToolEntry entry = new DefaultNodeToolEntry(
				gestionmodelosconsultas.diagram_ENTITY.part.Messages.Attribute3CreationTool_title,
				gestionmodelosconsultas.diagram_ENTITY.part.Messages.Attribute3CreationTool_desc,
				types);
		entry.setId("createAttribute3CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(gestionmodelosconsultas.diagram_ENTITY.providers.GestionModelosConsultasElementTypes
				.getImageDescriptor(gestionmodelosconsultas.diagram_ENTITY.providers.GestionModelosConsultasElementTypes.Attribute_3001));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createSimpleRelation1CreationTool() {
		DefaultLinkToolEntry entry = new DefaultLinkToolEntry(
				gestionmodelosconsultas.diagram_ENTITY.part.Messages.SimpleRelation1CreationTool_title,
				gestionmodelosconsultas.diagram_ENTITY.part.Messages.SimpleRelation1CreationTool_desc,
				Collections
						.singletonList(gestionmodelosconsultas.diagram_ENTITY.providers.GestionModelosConsultasElementTypes.SimpleRelation_4001));
		entry.setId("createSimpleRelation1CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(gestionmodelosconsultas.diagram_ENTITY.providers.GestionModelosConsultasElementTypes
				.getImageDescriptor(gestionmodelosconsultas.diagram_ENTITY.providers.GestionModelosConsultasElementTypes.SimpleRelation_4001));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

}
