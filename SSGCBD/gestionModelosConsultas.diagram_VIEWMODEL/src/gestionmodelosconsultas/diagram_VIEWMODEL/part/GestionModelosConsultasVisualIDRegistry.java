package gestionmodelosconsultas.diagram_VIEWMODEL.part;

import gestionmodelosconsultas.modeloconsultas.como.ComoPackage;
import gestionmodelosconsultas.modeloconsultas.cuando.CuandoPackage;
import gestionmodelosconsultas.modeloconsultas.donde.DondePackage;
import gestionmodelosconsultas.modeloconsultas.model.ModelPackage;
import gestionmodelosconsultas.modeloconsultas.model.ViewModel;
import gestionmodelosconsultas.modeloconsultas.que.QuePackage;
import gestionmodelosconsultas.modeloconsultas.quien.QuienPackage;

import org.eclipse.core.runtime.Platform;
import org.eclipse.emf.ecore.EAnnotation;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.gmf.runtime.notation.Diagram;
import org.eclipse.gmf.runtime.notation.View;
import org.eclipse.gmf.tooling.runtime.structure.DiagramStructure;

/**
 * This registry is used to determine which type of visual object should be
 * created for the corresponding Diagram, Node, ChildNode or Link represented
 * by a domain model object.
 * 
 * @generated
 */
public class GestionModelosConsultasVisualIDRegistry {

	/**
	 * @generated
	 */
	private static final String DEBUG_KEY = "gestionModelosConsultas.diagram_VIEWMODEL/debug/visualID"; //$NON-NLS-1$

	/**
	 * @generated
	 */
	public static int getVisualID(View view) {
		if (view instanceof Diagram) {
			if (gestionmodelosconsultas.diagram_VIEWMODEL.edit.parts.ViewModelEditPart.MODEL_ID
					.equals(view.getType())) {
				return gestionmodelosconsultas.diagram_VIEWMODEL.edit.parts.ViewModelEditPart.VISUAL_ID;
			} else {
				return -1;
			}
		}
		return gestionmodelosconsultas.diagram_VIEWMODEL.part.GestionModelosConsultasVisualIDRegistry
				.getVisualID(view.getType());
	}

	/**
	 * @generated
	 */
	public static String getModelID(View view) {
		View diagram = view.getDiagram();
		while (view != diagram) {
			EAnnotation annotation = view.getEAnnotation("Shortcut"); //$NON-NLS-1$
			if (annotation != null) {
				return (String) annotation.getDetails().get("modelID"); //$NON-NLS-1$
			}
			view = (View) view.eContainer();
		}
		return diagram != null ? diagram.getType() : null;
	}

	/**
	 * @generated
	 */
	public static int getVisualID(String type) {
		try {
			return Integer.parseInt(type);
		} catch (NumberFormatException e) {
			if (Boolean.TRUE.toString().equalsIgnoreCase(
					Platform.getDebugOption(DEBUG_KEY))) {
				gestionmodelosconsultas.diagram_VIEWMODEL.part.GestionModelosConsultasDiagramEditorPlugin
						.getInstance().logError(
								"Unable to parse view type as a visualID number: "
										+ type);
			}
		}
		return -1;
	}

	/**
	 * @generated
	 */
	public static String getType(int visualID) {
		return Integer.toString(visualID);
	}

	/**
	 * @generated
	 */
	public static int getDiagramVisualID(EObject domainElement) {
		if (domainElement == null) {
			return -1;
		}
		if (ModelPackage.eINSTANCE.getViewModel().isSuperTypeOf(
				domainElement.eClass())
				&& isDiagram((ViewModel) domainElement)) {
			return gestionmodelosconsultas.diagram_VIEWMODEL.edit.parts.ViewModelEditPart.VISUAL_ID;
		}
		return -1;
	}

	/**
	 * @generated
	 */
	public static int getNodeVisualID(View containerView, EObject domainElement) {
		if (domainElement == null) {
			return -1;
		}
		String containerModelID = gestionmodelosconsultas.diagram_VIEWMODEL.part.GestionModelosConsultasVisualIDRegistry
				.getModelID(containerView);
		if (!gestionmodelosconsultas.diagram_VIEWMODEL.edit.parts.ViewModelEditPart.MODEL_ID
				.equals(containerModelID)) {
			return -1;
		}
		int containerVisualID;
		if (gestionmodelosconsultas.diagram_VIEWMODEL.edit.parts.ViewModelEditPart.MODEL_ID
				.equals(containerModelID)) {
			containerVisualID = gestionmodelosconsultas.diagram_VIEWMODEL.part.GestionModelosConsultasVisualIDRegistry
					.getVisualID(containerView);
		} else {
			if (containerView instanceof Diagram) {
				containerVisualID = gestionmodelosconsultas.diagram_VIEWMODEL.edit.parts.ViewModelEditPart.VISUAL_ID;
			} else {
				return -1;
			}
		}
		switch (containerVisualID) {
		case gestionmodelosconsultas.diagram_VIEWMODEL.edit.parts.ViewModelEditPart.VISUAL_ID:
			if (QuienPackage.eINSTANCE.getUnidadOrganizacional().isSuperTypeOf(
					domainElement.eClass())) {
				return gestionmodelosconsultas.diagram_VIEWMODEL.edit.parts.UnidadOrganizacionalEditPart.VISUAL_ID;
			}
			if (QuePackage.eINSTANCE.getDocumento().isSuperTypeOf(
					domainElement.eClass())) {
				return gestionmodelosconsultas.diagram_VIEWMODEL.edit.parts.DocumentoEditPart.VISUAL_ID;
			}
			if (ComoPackage.eINSTANCE.getActividadProceso().isSuperTypeOf(
					domainElement.eClass())) {
				return gestionmodelosconsultas.diagram_VIEWMODEL.edit.parts.ActividadEditPart.VISUAL_ID;
			}
			if (QuienPackage.eINSTANCE.getActor().isSuperTypeOf(
					domainElement.eClass())) {
				return gestionmodelosconsultas.diagram_VIEWMODEL.edit.parts.ActorEditPart.VISUAL_ID;
			}
			if (DondePackage.eINSTANCE.getArmario().isSuperTypeOf(
					domainElement.eClass())) {
				return gestionmodelosconsultas.diagram_VIEWMODEL.edit.parts.ArmarioEditPart.VISUAL_ID;
			}
			if (QuePackage.eINSTANCE.getComunicacion().isSuperTypeOf(
					domainElement.eClass())) {
				return gestionmodelosconsultas.diagram_VIEWMODEL.edit.parts.ComunicacionEditPart.VISUAL_ID;
			}
			if (QuienPackage.eINSTANCE.getContacto().isSuperTypeOf(
					domainElement.eClass())) {
				return gestionmodelosconsultas.diagram_VIEWMODEL.edit.parts.ContactoEditPart.VISUAL_ID;
			}
			if (DondePackage.eINSTANCE.getDeposito().isSuperTypeOf(
					domainElement.eClass())) {
				return gestionmodelosconsultas.diagram_VIEWMODEL.edit.parts.DepositoEditPart.VISUAL_ID;
			}
			if (DondePackage.eINSTANCE.getDisco().isSuperTypeOf(
					domainElement.eClass())) {
				return gestionmodelosconsultas.diagram_VIEWMODEL.edit.parts.DiscoEditPart.VISUAL_ID;
			}
			if (ComoPackage.eINSTANCE.getInstanciaProceso().isSuperTypeOf(
					domainElement.eClass())) {
				return gestionmodelosconsultas.diagram_VIEWMODEL.edit.parts.InstanciaProcesoEditPart.VISUAL_ID;
			}
			if (QuienPackage.eINSTANCE.getQuien().isSuperTypeOf(
					domainElement.eClass())) {
				return gestionmodelosconsultas.diagram_VIEWMODEL.edit.parts.QuienEditPart.VISUAL_ID;
			}
			if (QuienPackage.eINSTANCE.getRol().isSuperTypeOf(
					domainElement.eClass())) {
				return gestionmodelosconsultas.diagram_VIEWMODEL.edit.parts.RolEditPart.VISUAL_ID;
			}
			if (CuandoPackage.eINSTANCE.getFecha().isSuperTypeOf(
					domainElement.eClass())) {
				return gestionmodelosconsultas.diagram_VIEWMODEL.edit.parts.FechaEditPart.VISUAL_ID;
			}
			break;
		}
		return -1;
	}

	/**
	 * @generated
	 */
	public static boolean canCreateNode(View containerView, int nodeVisualID) {
		String containerModelID = gestionmodelosconsultas.diagram_VIEWMODEL.part.GestionModelosConsultasVisualIDRegistry
				.getModelID(containerView);
		if (!gestionmodelosconsultas.diagram_VIEWMODEL.edit.parts.ViewModelEditPart.MODEL_ID
				.equals(containerModelID)) {
			return false;
		}
		int containerVisualID;
		if (gestionmodelosconsultas.diagram_VIEWMODEL.edit.parts.ViewModelEditPart.MODEL_ID
				.equals(containerModelID)) {
			containerVisualID = gestionmodelosconsultas.diagram_VIEWMODEL.part.GestionModelosConsultasVisualIDRegistry
					.getVisualID(containerView);
		} else {
			if (containerView instanceof Diagram) {
				containerVisualID = gestionmodelosconsultas.diagram_VIEWMODEL.edit.parts.ViewModelEditPart.VISUAL_ID;
			} else {
				return false;
			}
		}
		switch (containerVisualID) {
		case gestionmodelosconsultas.diagram_VIEWMODEL.edit.parts.ViewModelEditPart.VISUAL_ID:
			if (gestionmodelosconsultas.diagram_VIEWMODEL.edit.parts.UnidadOrganizacionalEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (gestionmodelosconsultas.diagram_VIEWMODEL.edit.parts.DocumentoEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (gestionmodelosconsultas.diagram_VIEWMODEL.edit.parts.ActividadEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (gestionmodelosconsultas.diagram_VIEWMODEL.edit.parts.ActorEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (gestionmodelosconsultas.diagram_VIEWMODEL.edit.parts.ArmarioEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (gestionmodelosconsultas.diagram_VIEWMODEL.edit.parts.ComunicacionEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (gestionmodelosconsultas.diagram_VIEWMODEL.edit.parts.ContactoEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (gestionmodelosconsultas.diagram_VIEWMODEL.edit.parts.DepositoEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (gestionmodelosconsultas.diagram_VIEWMODEL.edit.parts.DiscoEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (gestionmodelosconsultas.diagram_VIEWMODEL.edit.parts.InstanciaProcesoEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (gestionmodelosconsultas.diagram_VIEWMODEL.edit.parts.QuienEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (gestionmodelosconsultas.diagram_VIEWMODEL.edit.parts.RolEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (gestionmodelosconsultas.diagram_VIEWMODEL.edit.parts.FechaEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case gestionmodelosconsultas.diagram_VIEWMODEL.edit.parts.UnidadOrganizacionalEditPart.VISUAL_ID:
			if (gestionmodelosconsultas.diagram_VIEWMODEL.edit.parts.UnidadOrganizacionalNombreEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (gestionmodelosconsultas.diagram_VIEWMODEL.edit.parts.UnidadOrganizacionalCompartmentUnidadOrganizacionalEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case gestionmodelosconsultas.diagram_VIEWMODEL.edit.parts.DocumentoEditPart.VISUAL_ID:
			if (gestionmodelosconsultas.diagram_VIEWMODEL.edit.parts.DocumentoNombreEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (gestionmodelosconsultas.diagram_VIEWMODEL.edit.parts.DocumentoCompartmentDocumentoEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case gestionmodelosconsultas.diagram_VIEWMODEL.edit.parts.ActividadEditPart.VISUAL_ID:
			if (gestionmodelosconsultas.diagram_VIEWMODEL.edit.parts.ActividadNombreEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (gestionmodelosconsultas.diagram_VIEWMODEL.edit.parts.ActividadCompartmentActividadEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case gestionmodelosconsultas.diagram_VIEWMODEL.edit.parts.ActorEditPart.VISUAL_ID:
			if (gestionmodelosconsultas.diagram_VIEWMODEL.edit.parts.ActorNombreEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (gestionmodelosconsultas.diagram_VIEWMODEL.edit.parts.ActorCompartmentActorEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case gestionmodelosconsultas.diagram_VIEWMODEL.edit.parts.ArmarioEditPart.VISUAL_ID:
			if (gestionmodelosconsultas.diagram_VIEWMODEL.edit.parts.ArmarioNombreEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (gestionmodelosconsultas.diagram_VIEWMODEL.edit.parts.ArmarioCompartmentArmarioEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case gestionmodelosconsultas.diagram_VIEWMODEL.edit.parts.ComunicacionEditPart.VISUAL_ID:
			if (gestionmodelosconsultas.diagram_VIEWMODEL.edit.parts.ComunicacionNombreEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (gestionmodelosconsultas.diagram_VIEWMODEL.edit.parts.ComunicacionCompartmentComunicacionEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case gestionmodelosconsultas.diagram_VIEWMODEL.edit.parts.ContactoEditPart.VISUAL_ID:
			if (gestionmodelosconsultas.diagram_VIEWMODEL.edit.parts.ContactoNombreEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (gestionmodelosconsultas.diagram_VIEWMODEL.edit.parts.ContactoCompartmentContactoEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case gestionmodelosconsultas.diagram_VIEWMODEL.edit.parts.DepositoEditPart.VISUAL_ID:
			if (gestionmodelosconsultas.diagram_VIEWMODEL.edit.parts.DepositoNombreEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (gestionmodelosconsultas.diagram_VIEWMODEL.edit.parts.DepositoCompartmentDepositoEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case gestionmodelosconsultas.diagram_VIEWMODEL.edit.parts.DiscoEditPart.VISUAL_ID:
			if (gestionmodelosconsultas.diagram_VIEWMODEL.edit.parts.DiscoNombreEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (gestionmodelosconsultas.diagram_VIEWMODEL.edit.parts.DiscoCompartmentDiscoEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case gestionmodelosconsultas.diagram_VIEWMODEL.edit.parts.InstanciaProcesoEditPart.VISUAL_ID:
			if (gestionmodelosconsultas.diagram_VIEWMODEL.edit.parts.InstanciaProcesoNombreEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (gestionmodelosconsultas.diagram_VIEWMODEL.edit.parts.InstanciaProcesoCompartmentInstanciaProcesoEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case gestionmodelosconsultas.diagram_VIEWMODEL.edit.parts.QuienEditPart.VISUAL_ID:
			if (gestionmodelosconsultas.diagram_VIEWMODEL.edit.parts.QuienNombreEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (gestionmodelosconsultas.diagram_VIEWMODEL.edit.parts.QuienCompartmentQuienEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case gestionmodelosconsultas.diagram_VIEWMODEL.edit.parts.RolEditPart.VISUAL_ID:
			if (gestionmodelosconsultas.diagram_VIEWMODEL.edit.parts.RolNombreEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (gestionmodelosconsultas.diagram_VIEWMODEL.edit.parts.RolCompartmentRolEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case gestionmodelosconsultas.diagram_VIEWMODEL.edit.parts.FechaEditPart.VISUAL_ID:
			if (gestionmodelosconsultas.diagram_VIEWMODEL.edit.parts.FechaNombreEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (gestionmodelosconsultas.diagram_VIEWMODEL.edit.parts.FechaDiaEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (gestionmodelosconsultas.diagram_VIEWMODEL.edit.parts.FechaMesEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (gestionmodelosconsultas.diagram_VIEWMODEL.edit.parts.FechaAnoEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (gestionmodelosconsultas.diagram_VIEWMODEL.edit.parts.FechaCompartmentFechaEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		}
		return false;
	}

	/**
	 * @generated
	 */
	public static int getLinkWithClassVisualID(EObject domainElement) {
		if (domainElement == null) {
			return -1;
		}
		if (ModelPackage.eINSTANCE.getRelacion().isSuperTypeOf(
				domainElement.eClass())) {
			return gestionmodelosconsultas.diagram_VIEWMODEL.edit.parts.RelacionEditPart.VISUAL_ID;
		}
		return -1;
	}

	/**
	 * User can change implementation of this method to handle some specific
	 * situations not covered by default logic.
	 * 
	 * @generated
	 */
	private static boolean isDiagram(ViewModel element) {
		return true;
	}

	/**
	 * @generated
	 */
	public static boolean checkNodeVisualID(View containerView,
			EObject domainElement, int candidate) {
		if (candidate == -1) {
			//unrecognized id is always bad
			return false;
		}
		int basic = getNodeVisualID(containerView, domainElement);
		return basic == candidate;
	}

	/**
	 * @generated
	 */
	public static boolean isCompartmentVisualID(int visualID) {
		switch (visualID) {
		case gestionmodelosconsultas.diagram_VIEWMODEL.edit.parts.UnidadOrganizacionalCompartmentUnidadOrganizacionalEditPart.VISUAL_ID:
		case gestionmodelosconsultas.diagram_VIEWMODEL.edit.parts.DocumentoCompartmentDocumentoEditPart.VISUAL_ID:
		case gestionmodelosconsultas.diagram_VIEWMODEL.edit.parts.ActividadCompartmentActividadEditPart.VISUAL_ID:
		case gestionmodelosconsultas.diagram_VIEWMODEL.edit.parts.ActorCompartmentActorEditPart.VISUAL_ID:
		case gestionmodelosconsultas.diagram_VIEWMODEL.edit.parts.ArmarioCompartmentArmarioEditPart.VISUAL_ID:
		case gestionmodelosconsultas.diagram_VIEWMODEL.edit.parts.ComunicacionCompartmentComunicacionEditPart.VISUAL_ID:
		case gestionmodelosconsultas.diagram_VIEWMODEL.edit.parts.ContactoCompartmentContactoEditPart.VISUAL_ID:
		case gestionmodelosconsultas.diagram_VIEWMODEL.edit.parts.DepositoCompartmentDepositoEditPart.VISUAL_ID:
		case gestionmodelosconsultas.diagram_VIEWMODEL.edit.parts.DiscoCompartmentDiscoEditPart.VISUAL_ID:
		case gestionmodelosconsultas.diagram_VIEWMODEL.edit.parts.InstanciaProcesoCompartmentInstanciaProcesoEditPart.VISUAL_ID:
		case gestionmodelosconsultas.diagram_VIEWMODEL.edit.parts.QuienCompartmentQuienEditPart.VISUAL_ID:
		case gestionmodelosconsultas.diagram_VIEWMODEL.edit.parts.RolCompartmentRolEditPart.VISUAL_ID:
		case gestionmodelosconsultas.diagram_VIEWMODEL.edit.parts.FechaCompartmentFechaEditPart.VISUAL_ID:
			return true;
		default:
			break;
		}
		return false;
	}

	/**
	 * @generated
	 */
	public static boolean isSemanticLeafVisualID(int visualID) {
		switch (visualID) {
		case gestionmodelosconsultas.diagram_VIEWMODEL.edit.parts.ViewModelEditPart.VISUAL_ID:
			return false;
		case gestionmodelosconsultas.diagram_VIEWMODEL.edit.parts.UnidadOrganizacionalEditPart.VISUAL_ID:
		case gestionmodelosconsultas.diagram_VIEWMODEL.edit.parts.DocumentoEditPart.VISUAL_ID:
		case gestionmodelosconsultas.diagram_VIEWMODEL.edit.parts.ActividadEditPart.VISUAL_ID:
		case gestionmodelosconsultas.diagram_VIEWMODEL.edit.parts.ActorEditPart.VISUAL_ID:
		case gestionmodelosconsultas.diagram_VIEWMODEL.edit.parts.ArmarioEditPart.VISUAL_ID:
		case gestionmodelosconsultas.diagram_VIEWMODEL.edit.parts.ComunicacionEditPart.VISUAL_ID:
		case gestionmodelosconsultas.diagram_VIEWMODEL.edit.parts.ContactoEditPart.VISUAL_ID:
		case gestionmodelosconsultas.diagram_VIEWMODEL.edit.parts.DepositoEditPart.VISUAL_ID:
		case gestionmodelosconsultas.diagram_VIEWMODEL.edit.parts.DiscoEditPart.VISUAL_ID:
		case gestionmodelosconsultas.diagram_VIEWMODEL.edit.parts.InstanciaProcesoEditPart.VISUAL_ID:
		case gestionmodelosconsultas.diagram_VIEWMODEL.edit.parts.QuienEditPart.VISUAL_ID:
		case gestionmodelosconsultas.diagram_VIEWMODEL.edit.parts.RolEditPart.VISUAL_ID:
		case gestionmodelosconsultas.diagram_VIEWMODEL.edit.parts.FechaEditPart.VISUAL_ID:
			return true;
		default:
			break;
		}
		return false;
	}

	/**
	 * @generated
	 */
	public static final DiagramStructure TYPED_INSTANCE = new DiagramStructure() {
		/**
		 * @generated
		 */

		public int getVisualID(View view) {
			return gestionmodelosconsultas.diagram_VIEWMODEL.part.GestionModelosConsultasVisualIDRegistry
					.getVisualID(view);
		}

		/**
		 * @generated
		 */

		public String getModelID(View view) {
			return gestionmodelosconsultas.diagram_VIEWMODEL.part.GestionModelosConsultasVisualIDRegistry
					.getModelID(view);
		}

		/**
		 * @generated
		 */

		public int getNodeVisualID(View containerView, EObject domainElement) {
			return gestionmodelosconsultas.diagram_VIEWMODEL.part.GestionModelosConsultasVisualIDRegistry
					.getNodeVisualID(containerView, domainElement);
		}

		/**
		 * @generated
		 */

		public boolean checkNodeVisualID(View containerView,
				EObject domainElement, int candidate) {
			return gestionmodelosconsultas.diagram_VIEWMODEL.part.GestionModelosConsultasVisualIDRegistry
					.checkNodeVisualID(containerView, domainElement, candidate);
		}

		/**
		 * @generated
		 */

		public boolean isCompartmentVisualID(int visualID) {
			return gestionmodelosconsultas.diagram_VIEWMODEL.part.GestionModelosConsultasVisualIDRegistry
					.isCompartmentVisualID(visualID);
		}

		/**
		 * @generated
		 */

		public boolean isSemanticLeafVisualID(int visualID) {
			return gestionmodelosconsultas.diagram_VIEWMODEL.part.GestionModelosConsultasVisualIDRegistry
					.isSemanticLeafVisualID(visualID);
		}
	};

}
