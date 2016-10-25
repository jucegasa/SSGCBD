package gestionmodelosconsultas.diagram_VIEWMODEL.providers;

import gestionmodelosconsultas.modeloconsultas.como.ComoPackage;
import gestionmodelosconsultas.modeloconsultas.cuando.CuandoPackage;
import gestionmodelosconsultas.modeloconsultas.donde.DondePackage;
import gestionmodelosconsultas.modeloconsultas.model.ModelPackage;
import gestionmodelosconsultas.modeloconsultas.que.QuePackage;
import gestionmodelosconsultas.modeloconsultas.quien.QuienPackage;

import java.util.HashSet;
import java.util.IdentityHashMap;
import java.util.Map;
import java.util.Set;

import org.eclipse.core.runtime.IAdaptable;
import org.eclipse.emf.ecore.ENamedElement;
import org.eclipse.gmf.runtime.emf.type.core.ElementTypeRegistry;
import org.eclipse.gmf.runtime.emf.type.core.IElementType;
import org.eclipse.gmf.tooling.runtime.providers.DiagramElementTypeImages;
import org.eclipse.gmf.tooling.runtime.providers.DiagramElementTypes;
import org.eclipse.jface.resource.ImageDescriptor;
import org.eclipse.swt.graphics.Image;

/**
 * @generated
 */
public class GestionModelosConsultasElementTypes {

	/**
	 * @generated
	 */
	private GestionModelosConsultasElementTypes() {
	}

	/**
	 * @generated
	 */
	private static Map<IElementType, ENamedElement> elements;

	/**
	 * @generated
	 */
	private static DiagramElementTypeImages elementTypeImages = new DiagramElementTypeImages(
			gestionmodelosconsultas.diagram_VIEWMODEL.part.GestionModelosConsultasDiagramEditorPlugin
					.getInstance().getItemProvidersAdapterFactory());

	/**
	 * @generated
	 */
	private static Set<IElementType> KNOWN_ELEMENT_TYPES;

	/**
	 * @generated
	 */
	public static final IElementType ViewModel_1000 = getElementType("gestionModelosConsultas.diagram_VIEWMODEL.ViewModel_1000"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType UnidadOrganizacional_2015 = getElementType("gestionModelosConsultas.diagram_VIEWMODEL.UnidadOrganizacional_2015"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType Documento_2016 = getElementType("gestionModelosConsultas.diagram_VIEWMODEL.Documento_2016"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType Actividad_2017 = getElementType("gestionModelosConsultas.diagram_VIEWMODEL.Actividad_2017"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType Actor_2018 = getElementType("gestionModelosConsultas.diagram_VIEWMODEL.Actor_2018"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType Armario_2019 = getElementType("gestionModelosConsultas.diagram_VIEWMODEL.Armario_2019"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType Comunicacion_2020 = getElementType("gestionModelosConsultas.diagram_VIEWMODEL.Comunicacion_2020"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType Contacto_2021 = getElementType("gestionModelosConsultas.diagram_VIEWMODEL.Contacto_2021"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType Deposito_2022 = getElementType("gestionModelosConsultas.diagram_VIEWMODEL.Deposito_2022"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType Disco_2023 = getElementType("gestionModelosConsultas.diagram_VIEWMODEL.Disco_2023"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType InstanciaProceso_2024 = getElementType("gestionModelosConsultas.diagram_VIEWMODEL.InstanciaProceso_2024"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType Quien_2025 = getElementType("gestionModelosConsultas.diagram_VIEWMODEL.Quien_2025"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType Rol_2026 = getElementType("gestionModelosConsultas.diagram_VIEWMODEL.Rol_2026"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType Fecha_2027 = getElementType("gestionModelosConsultas.diagram_VIEWMODEL.Fecha_2027"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType Relacion_4001 = getElementType("gestionModelosConsultas.diagram_VIEWMODEL.Relacion_4001"); //$NON-NLS-1$

	/**
	 * @generated
	 */
	public static ImageDescriptor getImageDescriptor(ENamedElement element) {
		return elementTypeImages.getImageDescriptor(element);
	}

	/**
	 * @generated
	 */
	public static Image getImage(ENamedElement element) {
		return elementTypeImages.getImage(element);
	}

	/**
	 * @generated
	 */
	public static ImageDescriptor getImageDescriptor(IAdaptable hint) {
		return getImageDescriptor(getElement(hint));
	}

	/**
	 * @generated
	 */
	public static Image getImage(IAdaptable hint) {
		return getImage(getElement(hint));
	}

	/**
	 * Returns 'type' of the ecore object associated with the hint.
	 * 
	 * @generated
	 */
	public static ENamedElement getElement(IAdaptable hint) {
		Object type = hint.getAdapter(IElementType.class);
		if (elements == null) {
			elements = new IdentityHashMap<IElementType, ENamedElement>();

			elements.put(ViewModel_1000, ModelPackage.eINSTANCE.getViewModel());

			elements.put(UnidadOrganizacional_2015,
					QuienPackage.eINSTANCE.getUnidadOrganizacional());

			elements.put(Documento_2016, QuePackage.eINSTANCE.getDocumento());

			elements.put(Actividad_2017, ComoPackage.eINSTANCE.getActividadProceso());

			elements.put(Actor_2018, QuienPackage.eINSTANCE.getActor());

			elements.put(Armario_2019, DondePackage.eINSTANCE.getArmario());

			elements.put(Comunicacion_2020,
					QuePackage.eINSTANCE.getComunicacion());

			elements.put(Contacto_2021, QuienPackage.eINSTANCE.getContacto());

			elements.put(Deposito_2022, DondePackage.eINSTANCE.getDeposito());

			elements.put(Disco_2023, DondePackage.eINSTANCE.getDisco());

			elements.put(InstanciaProceso_2024,
					ComoPackage.eINSTANCE.getInstanciaProceso());

			elements.put(Quien_2025, QuienPackage.eINSTANCE.getQuien());

			elements.put(Rol_2026, QuienPackage.eINSTANCE.getRol());

			elements.put(Fecha_2027, CuandoPackage.eINSTANCE.getFecha());

			elements.put(Relacion_4001, ModelPackage.eINSTANCE.getRelacion());
		}
		return (ENamedElement) elements.get(type);
	}

	/**
	 * @generated
	 */
	private static IElementType getElementType(String id) {
		return ElementTypeRegistry.getInstance().getType(id);
	}

	/**
	 * @generated
	 */
	public static boolean isKnownElementType(IElementType elementType) {
		if (KNOWN_ELEMENT_TYPES == null) {
			KNOWN_ELEMENT_TYPES = new HashSet<IElementType>();
			KNOWN_ELEMENT_TYPES.add(ViewModel_1000);
			KNOWN_ELEMENT_TYPES.add(UnidadOrganizacional_2015);
			KNOWN_ELEMENT_TYPES.add(Documento_2016);
			KNOWN_ELEMENT_TYPES.add(Actividad_2017);
			KNOWN_ELEMENT_TYPES.add(Actor_2018);
			KNOWN_ELEMENT_TYPES.add(Armario_2019);
			KNOWN_ELEMENT_TYPES.add(Comunicacion_2020);
			KNOWN_ELEMENT_TYPES.add(Contacto_2021);
			KNOWN_ELEMENT_TYPES.add(Deposito_2022);
			KNOWN_ELEMENT_TYPES.add(Disco_2023);
			KNOWN_ELEMENT_TYPES.add(InstanciaProceso_2024);
			KNOWN_ELEMENT_TYPES.add(Quien_2025);
			KNOWN_ELEMENT_TYPES.add(Rol_2026);
			KNOWN_ELEMENT_TYPES.add(Fecha_2027);
			KNOWN_ELEMENT_TYPES.add(Relacion_4001);
		}
		return KNOWN_ELEMENT_TYPES.contains(elementType);
	}

	/**
	 * @generated
	 */
	public static IElementType getElementType(int visualID) {
		switch (visualID) {
		case gestionmodelosconsultas.diagram_VIEWMODEL.edit.parts.ViewModelEditPart.VISUAL_ID:
			return ViewModel_1000;
		case gestionmodelosconsultas.diagram_VIEWMODEL.edit.parts.UnidadOrganizacionalEditPart.VISUAL_ID:
			return UnidadOrganizacional_2015;
		case gestionmodelosconsultas.diagram_VIEWMODEL.edit.parts.DocumentoEditPart.VISUAL_ID:
			return Documento_2016;
		case gestionmodelosconsultas.diagram_VIEWMODEL.edit.parts.ActividadEditPart.VISUAL_ID:
			return Actividad_2017;
		case gestionmodelosconsultas.diagram_VIEWMODEL.edit.parts.ActorEditPart.VISUAL_ID:
			return Actor_2018;
		case gestionmodelosconsultas.diagram_VIEWMODEL.edit.parts.ArmarioEditPart.VISUAL_ID:
			return Armario_2019;
		case gestionmodelosconsultas.diagram_VIEWMODEL.edit.parts.ComunicacionEditPart.VISUAL_ID:
			return Comunicacion_2020;
		case gestionmodelosconsultas.diagram_VIEWMODEL.edit.parts.ContactoEditPart.VISUAL_ID:
			return Contacto_2021;
		case gestionmodelosconsultas.diagram_VIEWMODEL.edit.parts.DepositoEditPart.VISUAL_ID:
			return Deposito_2022;
		case gestionmodelosconsultas.diagram_VIEWMODEL.edit.parts.DiscoEditPart.VISUAL_ID:
			return Disco_2023;
		case gestionmodelosconsultas.diagram_VIEWMODEL.edit.parts.InstanciaProcesoEditPart.VISUAL_ID:
			return InstanciaProceso_2024;
		case gestionmodelosconsultas.diagram_VIEWMODEL.edit.parts.QuienEditPart.VISUAL_ID:
			return Quien_2025;
		case gestionmodelosconsultas.diagram_VIEWMODEL.edit.parts.RolEditPart.VISUAL_ID:
			return Rol_2026;
		case gestionmodelosconsultas.diagram_VIEWMODEL.edit.parts.FechaEditPart.VISUAL_ID:
			return Fecha_2027;
		case gestionmodelosconsultas.diagram_VIEWMODEL.edit.parts.RelacionEditPart.VISUAL_ID:
			return Relacion_4001;
		}
		return null;
	}

	/**
	 * @generated
	 */
	public static final DiagramElementTypes TYPED_INSTANCE = new DiagramElementTypes(
			elementTypeImages) {

		/**
		 * @generated
		 */
		@Override
		public boolean isKnownElementType(IElementType elementType) {
			return gestionmodelosconsultas.diagram_VIEWMODEL.providers.GestionModelosConsultasElementTypes
					.isKnownElementType(elementType);
		}

		/**
		 * @generated
		 */
		@Override
		public IElementType getElementTypeForVisualId(int visualID) {
			return gestionmodelosconsultas.diagram_VIEWMODEL.providers.GestionModelosConsultasElementTypes
					.getElementType(visualID);
		}

		/**
		 * @generated
		 */
		@Override
		public ENamedElement getDefiningNamedElement(
				IAdaptable elementTypeAdapter) {
			return gestionmodelosconsultas.diagram_VIEWMODEL.providers.GestionModelosConsultasElementTypes
					.getElement(elementTypeAdapter);
		}
	};

}
