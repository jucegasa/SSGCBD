package gestionmodelosconsultas.diagram_PROYECCION.part;

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
		paletteRoot.add(createElementosQuien1Group());
		paletteRoot.add(createElementosQue2Group());
		paletteRoot.add(createElementosComo3Group());
		paletteRoot.add(createElementosDonde4Group());
		paletteRoot.add(createElementosCuando5Group());
		paletteRoot.add(createElementosCamposyRelación6Group());
	}

	/**
	 * Creates "Elementos Quien" palette tool group
	 * @generated
	 */
	private PaletteContainer createElementosQuien1Group() {
		PaletteDrawer paletteContainer = new PaletteDrawer(
				gestionmodelosconsultas.diagram_PROYECCION.part.Messages.ElementosQuien1Group_title);
		paletteContainer.setId("createElementosQuien1Group"); //$NON-NLS-1$
		paletteContainer.add(createUnidadOrganizacional1CreationTool());
		paletteContainer.add(createActor2CreationTool());
		paletteContainer.add(createRol3CreationTool());
		paletteContainer.add(createContacto4CreationTool());
		paletteContainer.add(createQuien5CreationTool());
		return paletteContainer;
	}

	/**
	 * Creates "Elementos Que" palette tool group
	 * @generated
	 */
	private PaletteContainer createElementosQue2Group() {
		PaletteDrawer paletteContainer = new PaletteDrawer(
				gestionmodelosconsultas.diagram_PROYECCION.part.Messages.ElementosQue2Group_title);
		paletteContainer.setId("createElementosQue2Group"); //$NON-NLS-1$
		paletteContainer.add(createDocumento1CreationTool());
		paletteContainer.add(createComunicacion2CreationTool());
		return paletteContainer;
	}

	/**
	 * Creates "Elementos Como" palette tool group
	 * @generated
	 */
	private PaletteContainer createElementosComo3Group() {
		PaletteDrawer paletteContainer = new PaletteDrawer(
				gestionmodelosconsultas.diagram_PROYECCION.part.Messages.ElementosComo3Group_title);
		paletteContainer.setId("createElementosComo3Group"); //$NON-NLS-1$
		paletteContainer.add(createActividad1CreationTool());
		paletteContainer.add(createInstanciaProceso2CreationTool());
		return paletteContainer;
	}

	/**
	 * Creates "Elementos Donde" palette tool group
	 * @generated
	 */
	private PaletteContainer createElementosDonde4Group() {
		PaletteDrawer paletteContainer = new PaletteDrawer(
				gestionmodelosconsultas.diagram_PROYECCION.part.Messages.ElementosDonde4Group_title);
		paletteContainer.setId("createElementosDonde4Group"); //$NON-NLS-1$
		paletteContainer.add(createDeposito1CreationTool());
		paletteContainer.add(createDisco2CreationTool());
		paletteContainer.add(createArmario3CreationTool());
		return paletteContainer;
	}

	/**
	 * Creates "Elementos Cuando" palette tool group
	 * @generated
	 */
	private PaletteContainer createElementosCuando5Group() {
		PaletteDrawer paletteContainer = new PaletteDrawer(
				gestionmodelosconsultas.diagram_PROYECCION.part.Messages.ElementosCuando5Group_title);
		paletteContainer.setId("createElementosCuando5Group"); //$NON-NLS-1$
		paletteContainer.add(createFecha1CreationTool());
		return paletteContainer;
	}

	/**
	 * Creates "Elementos Campos y Relación" palette tool group
	 * @generated
	 */
	private PaletteContainer createElementosCamposyRelación6Group() {
		PaletteDrawer paletteContainer = new PaletteDrawer(
				gestionmodelosconsultas.diagram_PROYECCION.part.Messages.ElementosCamposyRelación6Group_title);
		paletteContainer.setId("createElementosCamposyRelación6Group"); //$NON-NLS-1$
		paletteContainer.add(createCampo1CreationTool());
		paletteContainer.add(createRelacion2CreationTool());
		return paletteContainer;
	}

	/**
	 * @generated
	 */
	private ToolEntry createUnidadOrganizacional1CreationTool() {
		DefaultNodeToolEntry entry = new DefaultNodeToolEntry(
				gestionmodelosconsultas.diagram_PROYECCION.part.Messages.UnidadOrganizacional1CreationTool_title,
				gestionmodelosconsultas.diagram_PROYECCION.part.Messages.UnidadOrganizacional1CreationTool_desc,
				Collections
						.singletonList(gestionmodelosconsultas.diagram_PROYECCION.providers.GestionModelosConsultasElementTypes.UnidadOrganizacional_2015));
		entry.setId("createUnidadOrganizacional1CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(gestionmodelosconsultas.diagram_PROYECCION.providers.GestionModelosConsultasElementTypes
				.getImageDescriptor(gestionmodelosconsultas.diagram_PROYECCION.providers.GestionModelosConsultasElementTypes.UnidadOrganizacional_2015));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createActor2CreationTool() {
		DefaultNodeToolEntry entry = new DefaultNodeToolEntry(
				gestionmodelosconsultas.diagram_PROYECCION.part.Messages.Actor2CreationTool_title,
				gestionmodelosconsultas.diagram_PROYECCION.part.Messages.Actor2CreationTool_desc,
				Collections
						.singletonList(gestionmodelosconsultas.diagram_PROYECCION.providers.GestionModelosConsultasElementTypes.Actor_2018));
		entry.setId("createActor2CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(gestionmodelosconsultas.diagram_PROYECCION.providers.GestionModelosConsultasElementTypes
				.getImageDescriptor(gestionmodelosconsultas.diagram_PROYECCION.providers.GestionModelosConsultasElementTypes.Actor_2018));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createRol3CreationTool() {
		DefaultNodeToolEntry entry = new DefaultNodeToolEntry(
				gestionmodelosconsultas.diagram_PROYECCION.part.Messages.Rol3CreationTool_title,
				gestionmodelosconsultas.diagram_PROYECCION.part.Messages.Rol3CreationTool_desc,
				Collections
						.singletonList(gestionmodelosconsultas.diagram_PROYECCION.providers.GestionModelosConsultasElementTypes.Rol_2026));
		entry.setId("createRol3CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(gestionmodelosconsultas.diagram_PROYECCION.providers.GestionModelosConsultasElementTypes
				.getImageDescriptor(gestionmodelosconsultas.diagram_PROYECCION.providers.GestionModelosConsultasElementTypes.Rol_2026));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createContacto4CreationTool() {
		DefaultNodeToolEntry entry = new DefaultNodeToolEntry(
				gestionmodelosconsultas.diagram_PROYECCION.part.Messages.Contacto4CreationTool_title,
				gestionmodelosconsultas.diagram_PROYECCION.part.Messages.Contacto4CreationTool_desc,
				Collections
						.singletonList(gestionmodelosconsultas.diagram_PROYECCION.providers.GestionModelosConsultasElementTypes.Contacto_2021));
		entry.setId("createContacto4CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(gestionmodelosconsultas.diagram_PROYECCION.providers.GestionModelosConsultasElementTypes
				.getImageDescriptor(gestionmodelosconsultas.diagram_PROYECCION.providers.GestionModelosConsultasElementTypes.Contacto_2021));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createQuien5CreationTool() {
		DefaultNodeToolEntry entry = new DefaultNodeToolEntry(
				gestionmodelosconsultas.diagram_PROYECCION.part.Messages.Quien5CreationTool_title,
				gestionmodelosconsultas.diagram_PROYECCION.part.Messages.Quien5CreationTool_desc,
				Collections
						.singletonList(gestionmodelosconsultas.diagram_PROYECCION.providers.GestionModelosConsultasElementTypes.Quien_2025));
		entry.setId("createQuien5CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(gestionmodelosconsultas.diagram_PROYECCION.providers.GestionModelosConsultasElementTypes
				.getImageDescriptor(gestionmodelosconsultas.diagram_PROYECCION.providers.GestionModelosConsultasElementTypes.Quien_2025));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createDocumento1CreationTool() {
		DefaultNodeToolEntry entry = new DefaultNodeToolEntry(
				gestionmodelosconsultas.diagram_PROYECCION.part.Messages.Documento1CreationTool_title,
				gestionmodelosconsultas.diagram_PROYECCION.part.Messages.Documento1CreationTool_desc,
				Collections
						.singletonList(gestionmodelosconsultas.diagram_PROYECCION.providers.GestionModelosConsultasElementTypes.Documento_2016));
		entry.setId("createDocumento1CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(gestionmodelosconsultas.diagram_PROYECCION.providers.GestionModelosConsultasElementTypes
				.getImageDescriptor(gestionmodelosconsultas.diagram_PROYECCION.providers.GestionModelosConsultasElementTypes.Documento_2016));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createComunicacion2CreationTool() {
		DefaultNodeToolEntry entry = new DefaultNodeToolEntry(
				gestionmodelosconsultas.diagram_PROYECCION.part.Messages.Comunicacion2CreationTool_title,
				gestionmodelosconsultas.diagram_PROYECCION.part.Messages.Comunicacion2CreationTool_desc,
				Collections
						.singletonList(gestionmodelosconsultas.diagram_PROYECCION.providers.GestionModelosConsultasElementTypes.Comunicacion_2020));
		entry.setId("createComunicacion2CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(gestionmodelosconsultas.diagram_PROYECCION.providers.GestionModelosConsultasElementTypes
				.getImageDescriptor(gestionmodelosconsultas.diagram_PROYECCION.providers.GestionModelosConsultasElementTypes.Comunicacion_2020));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createActividad1CreationTool() {
		DefaultNodeToolEntry entry = new DefaultNodeToolEntry(
				gestionmodelosconsultas.diagram_PROYECCION.part.Messages.Actividad1CreationTool_title,
				gestionmodelosconsultas.diagram_PROYECCION.part.Messages.Actividad1CreationTool_desc,
				Collections
						.singletonList(gestionmodelosconsultas.diagram_PROYECCION.providers.GestionModelosConsultasElementTypes.Actividad_2017));
		entry.setId("createActividad1CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(gestionmodelosconsultas.diagram_PROYECCION.providers.GestionModelosConsultasElementTypes
				.getImageDescriptor(gestionmodelosconsultas.diagram_PROYECCION.providers.GestionModelosConsultasElementTypes.Actividad_2017));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createInstanciaProceso2CreationTool() {
		DefaultNodeToolEntry entry = new DefaultNodeToolEntry(
				gestionmodelosconsultas.diagram_PROYECCION.part.Messages.InstanciaProceso2CreationTool_title,
				gestionmodelosconsultas.diagram_PROYECCION.part.Messages.InstanciaProceso2CreationTool_desc,
				Collections
						.singletonList(gestionmodelosconsultas.diagram_PROYECCION.providers.GestionModelosConsultasElementTypes.InstanciaProceso_2024));
		entry.setId("createInstanciaProceso2CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(gestionmodelosconsultas.diagram_PROYECCION.providers.GestionModelosConsultasElementTypes
				.getImageDescriptor(gestionmodelosconsultas.diagram_PROYECCION.providers.GestionModelosConsultasElementTypes.InstanciaProceso_2024));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createDeposito1CreationTool() {
		DefaultNodeToolEntry entry = new DefaultNodeToolEntry(
				gestionmodelosconsultas.diagram_PROYECCION.part.Messages.Deposito1CreationTool_title,
				gestionmodelosconsultas.diagram_PROYECCION.part.Messages.Deposito1CreationTool_desc,
				Collections
						.singletonList(gestionmodelosconsultas.diagram_PROYECCION.providers.GestionModelosConsultasElementTypes.Deposito_2022));
		entry.setId("createDeposito1CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(gestionmodelosconsultas.diagram_PROYECCION.providers.GestionModelosConsultasElementTypes
				.getImageDescriptor(gestionmodelosconsultas.diagram_PROYECCION.providers.GestionModelosConsultasElementTypes.Deposito_2022));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createDisco2CreationTool() {
		DefaultNodeToolEntry entry = new DefaultNodeToolEntry(
				gestionmodelosconsultas.diagram_PROYECCION.part.Messages.Disco2CreationTool_title,
				gestionmodelosconsultas.diagram_PROYECCION.part.Messages.Disco2CreationTool_desc,
				Collections
						.singletonList(gestionmodelosconsultas.diagram_PROYECCION.providers.GestionModelosConsultasElementTypes.Disco_2023));
		entry.setId("createDisco2CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(gestionmodelosconsultas.diagram_PROYECCION.providers.GestionModelosConsultasElementTypes
				.getImageDescriptor(gestionmodelosconsultas.diagram_PROYECCION.providers.GestionModelosConsultasElementTypes.Disco_2023));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createArmario3CreationTool() {
		DefaultNodeToolEntry entry = new DefaultNodeToolEntry(
				gestionmodelosconsultas.diagram_PROYECCION.part.Messages.Armario3CreationTool_title,
				gestionmodelosconsultas.diagram_PROYECCION.part.Messages.Armario3CreationTool_desc,
				Collections
						.singletonList(gestionmodelosconsultas.diagram_PROYECCION.providers.GestionModelosConsultasElementTypes.Armario_2019));
		entry.setId("createArmario3CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(gestionmodelosconsultas.diagram_PROYECCION.providers.GestionModelosConsultasElementTypes
				.getImageDescriptor(gestionmodelosconsultas.diagram_PROYECCION.providers.GestionModelosConsultasElementTypes.Armario_2019));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createFecha1CreationTool() {
		DefaultNodeToolEntry entry = new DefaultNodeToolEntry(
				gestionmodelosconsultas.diagram_PROYECCION.part.Messages.Fecha1CreationTool_title,
				gestionmodelosconsultas.diagram_PROYECCION.part.Messages.Fecha1CreationTool_desc,
				Collections
						.singletonList(gestionmodelosconsultas.diagram_PROYECCION.providers.GestionModelosConsultasElementTypes.Fecha_2027));
		entry.setId("createFecha1CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(gestionmodelosconsultas.diagram_PROYECCION.providers.GestionModelosConsultasElementTypes
				.getImageDescriptor(gestionmodelosconsultas.diagram_PROYECCION.providers.GestionModelosConsultasElementTypes.Fecha_2027));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createCampo1CreationTool() {
		ArrayList<IElementType> types = new ArrayList<IElementType>(12);
		types.add(gestionmodelosconsultas.diagram_PROYECCION.providers.GestionModelosConsultasElementTypes.Campo_3001);
		types.add(gestionmodelosconsultas.diagram_PROYECCION.providers.GestionModelosConsultasElementTypes.Campo_3002);
		types.add(gestionmodelosconsultas.diagram_PROYECCION.providers.GestionModelosConsultasElementTypes.Campo_3003);
		types.add(gestionmodelosconsultas.diagram_PROYECCION.providers.GestionModelosConsultasElementTypes.Campo_3004);
		types.add(gestionmodelosconsultas.diagram_PROYECCION.providers.GestionModelosConsultasElementTypes.Campo_3005);
		types.add(gestionmodelosconsultas.diagram_PROYECCION.providers.GestionModelosConsultasElementTypes.Campo_3006);
		types.add(gestionmodelosconsultas.diagram_PROYECCION.providers.GestionModelosConsultasElementTypes.Campo_3007);
		types.add(gestionmodelosconsultas.diagram_PROYECCION.providers.GestionModelosConsultasElementTypes.Campo_3008);
		types.add(gestionmodelosconsultas.diagram_PROYECCION.providers.GestionModelosConsultasElementTypes.Campo_3009);
		types.add(gestionmodelosconsultas.diagram_PROYECCION.providers.GestionModelosConsultasElementTypes.Campo_3010);
		types.add(gestionmodelosconsultas.diagram_PROYECCION.providers.GestionModelosConsultasElementTypes.Campo_3011);
		types.add(gestionmodelosconsultas.diagram_PROYECCION.providers.GestionModelosConsultasElementTypes.Campo_3012);
		DefaultNodeToolEntry entry = new DefaultNodeToolEntry(
				gestionmodelosconsultas.diagram_PROYECCION.part.Messages.Campo1CreationTool_title,
				gestionmodelosconsultas.diagram_PROYECCION.part.Messages.Campo1CreationTool_desc,
				types);
		entry.setId("createCampo1CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(gestionmodelosconsultas.diagram_PROYECCION.providers.GestionModelosConsultasElementTypes
				.getImageDescriptor(gestionmodelosconsultas.diagram_PROYECCION.providers.GestionModelosConsultasElementTypes.Campo_3001));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createRelacion2CreationTool() {
		DefaultLinkToolEntry entry = new DefaultLinkToolEntry(
				gestionmodelosconsultas.diagram_PROYECCION.part.Messages.Relacion2CreationTool_title,
				gestionmodelosconsultas.diagram_PROYECCION.part.Messages.Relacion2CreationTool_desc,
				Collections
						.singletonList(gestionmodelosconsultas.diagram_PROYECCION.providers.GestionModelosConsultasElementTypes.Relacion_4001));
		entry.setId("createRelacion2CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(gestionmodelosconsultas.diagram_PROYECCION.providers.GestionModelosConsultasElementTypes
				.getImageDescriptor(gestionmodelosconsultas.diagram_PROYECCION.providers.GestionModelosConsultasElementTypes.Relacion_4001));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

}
