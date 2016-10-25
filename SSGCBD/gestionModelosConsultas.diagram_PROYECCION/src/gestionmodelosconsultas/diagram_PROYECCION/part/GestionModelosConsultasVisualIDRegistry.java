package gestionmodelosconsultas.diagram_PROYECCION.part;

import gestionmodelosconsultas.modeloconsultas.como.ComoPackage;
import gestionmodelosconsultas.modeloconsultas.cuando.CuandoPackage;
import gestionmodelosconsultas.modeloconsultas.donde.DondePackage;
import gestionmodelosconsultas.modeloconsultas.model.ModelPackage;
import gestionmodelosconsultas.modeloconsultas.model.Proyeccion;
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
	private static final String DEBUG_KEY = "gestionModelosConsultas.diagram_PROYECCION/debug/visualID"; //$NON-NLS-1$

	/**
	 * @generated
	 */
	public static int getVisualID(View view) {
		if (view instanceof Diagram) {
			if (gestionmodelosconsultas.diagram_PROYECCION.edit.parts.ProyeccionEditPart.MODEL_ID
					.equals(view.getType())) {
				return gestionmodelosconsultas.diagram_PROYECCION.edit.parts.ProyeccionEditPart.VISUAL_ID;
			} else {
				return -1;
			}
		}
		return gestionmodelosconsultas.diagram_PROYECCION.part.GestionModelosConsultasVisualIDRegistry
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
				gestionmodelosconsultas.diagram_PROYECCION.part.GestionModelosConsultasDiagramEditorPlugin
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
		if (ModelPackage.eINSTANCE.getProyeccion().isSuperTypeOf(
				domainElement.eClass())
				&& isDiagram((Proyeccion) domainElement)) {
			return gestionmodelosconsultas.diagram_PROYECCION.edit.parts.ProyeccionEditPart.VISUAL_ID;
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
		String containerModelID = gestionmodelosconsultas.diagram_PROYECCION.part.GestionModelosConsultasVisualIDRegistry
				.getModelID(containerView);
		if (!gestionmodelosconsultas.diagram_PROYECCION.edit.parts.ProyeccionEditPart.MODEL_ID
				.equals(containerModelID)) {
			return -1;
		}
		int containerVisualID;
		if (gestionmodelosconsultas.diagram_PROYECCION.edit.parts.ProyeccionEditPart.MODEL_ID
				.equals(containerModelID)) {
			containerVisualID = gestionmodelosconsultas.diagram_PROYECCION.part.GestionModelosConsultasVisualIDRegistry
					.getVisualID(containerView);
		} else {
			if (containerView instanceof Diagram) {
				containerVisualID = gestionmodelosconsultas.diagram_PROYECCION.edit.parts.ProyeccionEditPart.VISUAL_ID;
			} else {
				return -1;
			}
		}
		switch (containerVisualID) {
		case gestionmodelosconsultas.diagram_PROYECCION.edit.parts.ProyeccionEditPart.VISUAL_ID:
			if (QuienPackage.eINSTANCE.getUnidadOrganizacional().isSuperTypeOf(
					domainElement.eClass())) {
				return gestionmodelosconsultas.diagram_PROYECCION.edit.parts.UnidadOrganizacionalEditPart.VISUAL_ID;
			}
			if (QuePackage.eINSTANCE.getDocumento().isSuperTypeOf(
					domainElement.eClass())) {
				return gestionmodelosconsultas.diagram_PROYECCION.edit.parts.DocumentoEditPart.VISUAL_ID;
			}
			if (ComoPackage.eINSTANCE.getActividadProceso().isSuperTypeOf(
					domainElement.eClass())) {
				return gestionmodelosconsultas.diagram_PROYECCION.edit.parts.ActividadEditPart.VISUAL_ID;
			}
			if (QuienPackage.eINSTANCE.getActor().isSuperTypeOf(
					domainElement.eClass())) {
				return gestionmodelosconsultas.diagram_PROYECCION.edit.parts.ActorEditPart.VISUAL_ID;
			}
			if (DondePackage.eINSTANCE.getArmario().isSuperTypeOf(
					domainElement.eClass())) {
				return gestionmodelosconsultas.diagram_PROYECCION.edit.parts.ArmarioEditPart.VISUAL_ID;
			}
			if (QuePackage.eINSTANCE.getComunicacion().isSuperTypeOf(
					domainElement.eClass())) {
				return gestionmodelosconsultas.diagram_PROYECCION.edit.parts.ComunicacionEditPart.VISUAL_ID;
			}
			if (QuienPackage.eINSTANCE.getContacto().isSuperTypeOf(
					domainElement.eClass())) {
				return gestionmodelosconsultas.diagram_PROYECCION.edit.parts.ContactoEditPart.VISUAL_ID;
			}
			if (DondePackage.eINSTANCE.getDeposito().isSuperTypeOf(
					domainElement.eClass())) {
				return gestionmodelosconsultas.diagram_PROYECCION.edit.parts.DepositoEditPart.VISUAL_ID;
			}
			if (DondePackage.eINSTANCE.getDisco().isSuperTypeOf(
					domainElement.eClass())) {
				return gestionmodelosconsultas.diagram_PROYECCION.edit.parts.DiscoEditPart.VISUAL_ID;
			}
			if (ComoPackage.eINSTANCE.getInstanciaProceso().isSuperTypeOf(
					domainElement.eClass())) {
				return gestionmodelosconsultas.diagram_PROYECCION.edit.parts.InstanciaProcesoEditPart.VISUAL_ID;
			}
			if (QuienPackage.eINSTANCE.getQuien().isSuperTypeOf(
					domainElement.eClass())) {
				return gestionmodelosconsultas.diagram_PROYECCION.edit.parts.QuienEditPart.VISUAL_ID;
			}
			if (QuienPackage.eINSTANCE.getRol().isSuperTypeOf(
					domainElement.eClass())) {
				return gestionmodelosconsultas.diagram_PROYECCION.edit.parts.RolEditPart.VISUAL_ID;
			}
			if (CuandoPackage.eINSTANCE.getFecha().isSuperTypeOf(
					domainElement.eClass())) {
				return gestionmodelosconsultas.diagram_PROYECCION.edit.parts.FechaEditPart.VISUAL_ID;
			}
			break;
		case gestionmodelosconsultas.diagram_PROYECCION.edit.parts.UnidadOrganizacionalCompartmentUnidadOrganizacionalEditPart.VISUAL_ID:
			if (ModelPackage.eINSTANCE.getCampo().isSuperTypeOf(
					domainElement.eClass())) {
				return gestionmodelosconsultas.diagram_PROYECCION.edit.parts.CampoEditPart.VISUAL_ID;
			}
			break;
		case gestionmodelosconsultas.diagram_PROYECCION.edit.parts.DocumentoCompartmentDocumentoEditPart.VISUAL_ID:
			if (ModelPackage.eINSTANCE.getCampo().isSuperTypeOf(
					domainElement.eClass())) {
				return gestionmodelosconsultas.diagram_PROYECCION.edit.parts.Campo2EditPart.VISUAL_ID;
			}
			break;
		case gestionmodelosconsultas.diagram_PROYECCION.edit.parts.ActividadCompartmentActividadEditPart.VISUAL_ID:
			if (ModelPackage.eINSTANCE.getCampo().isSuperTypeOf(
					domainElement.eClass())) {
				return gestionmodelosconsultas.diagram_PROYECCION.edit.parts.Campo3EditPart.VISUAL_ID;
			}
			break;
		case gestionmodelosconsultas.diagram_PROYECCION.edit.parts.ActorCompartmentActorEditPart.VISUAL_ID:
			if (ModelPackage.eINSTANCE.getCampo().isSuperTypeOf(
					domainElement.eClass())) {
				return gestionmodelosconsultas.diagram_PROYECCION.edit.parts.Campo4EditPart.VISUAL_ID;
			}
			break;
		case gestionmodelosconsultas.diagram_PROYECCION.edit.parts.ArmarioCompartmentArmarioEditPart.VISUAL_ID:
			if (ModelPackage.eINSTANCE.getCampo().isSuperTypeOf(
					domainElement.eClass())) {
				return gestionmodelosconsultas.diagram_PROYECCION.edit.parts.Campo5EditPart.VISUAL_ID;
			}
			break;
		case gestionmodelosconsultas.diagram_PROYECCION.edit.parts.ComunicacionCompartmentComunicacionEditPart.VISUAL_ID:
			if (ModelPackage.eINSTANCE.getCampo().isSuperTypeOf(
					domainElement.eClass())) {
				return gestionmodelosconsultas.diagram_PROYECCION.edit.parts.Campo6EditPart.VISUAL_ID;
			}
			break;
		case gestionmodelosconsultas.diagram_PROYECCION.edit.parts.ContactoCompartmentContactoEditPart.VISUAL_ID:
			if (ModelPackage.eINSTANCE.getCampo().isSuperTypeOf(
					domainElement.eClass())) {
				return gestionmodelosconsultas.diagram_PROYECCION.edit.parts.Campo7EditPart.VISUAL_ID;
			}
			break;
		case gestionmodelosconsultas.diagram_PROYECCION.edit.parts.DepositoCompartmentDepositoEditPart.VISUAL_ID:
			if (ModelPackage.eINSTANCE.getCampo().isSuperTypeOf(
					domainElement.eClass())) {
				return gestionmodelosconsultas.diagram_PROYECCION.edit.parts.Campo8EditPart.VISUAL_ID;
			}
			break;
		case gestionmodelosconsultas.diagram_PROYECCION.edit.parts.DiscoCompartmentDiscoEditPart.VISUAL_ID:
			if (ModelPackage.eINSTANCE.getCampo().isSuperTypeOf(
					domainElement.eClass())) {
				return gestionmodelosconsultas.diagram_PROYECCION.edit.parts.Campo9EditPart.VISUAL_ID;
			}
			break;
		case gestionmodelosconsultas.diagram_PROYECCION.edit.parts.InstanciaProcesoCompartmentInstanciaProcesoEditPart.VISUAL_ID:
			if (ModelPackage.eINSTANCE.getCampo().isSuperTypeOf(
					domainElement.eClass())) {
				return gestionmodelosconsultas.diagram_PROYECCION.edit.parts.Campo10EditPart.VISUAL_ID;
			}
			break;
		case gestionmodelosconsultas.diagram_PROYECCION.edit.parts.QuienCompartmentQuienEditPart.VISUAL_ID:
			if (ModelPackage.eINSTANCE.getCampo().isSuperTypeOf(
					domainElement.eClass())) {
				return gestionmodelosconsultas.diagram_PROYECCION.edit.parts.Campo11EditPart.VISUAL_ID;
			}
			break;
		case gestionmodelosconsultas.diagram_PROYECCION.edit.parts.RolCompartmentRolEditPart.VISUAL_ID:
			if (ModelPackage.eINSTANCE.getCampo().isSuperTypeOf(
					domainElement.eClass())) {
				return gestionmodelosconsultas.diagram_PROYECCION.edit.parts.Campo12EditPart.VISUAL_ID;
			}
			break;
		}
		return -1;
	}

	/**
	 * @generated
	 */
	public static boolean canCreateNode(View containerView, int nodeVisualID) {
		String containerModelID = gestionmodelosconsultas.diagram_PROYECCION.part.GestionModelosConsultasVisualIDRegistry
				.getModelID(containerView);
		if (!gestionmodelosconsultas.diagram_PROYECCION.edit.parts.ProyeccionEditPart.MODEL_ID
				.equals(containerModelID)) {
			return false;
		}
		int containerVisualID;
		if (gestionmodelosconsultas.diagram_PROYECCION.edit.parts.ProyeccionEditPart.MODEL_ID
				.equals(containerModelID)) {
			containerVisualID = gestionmodelosconsultas.diagram_PROYECCION.part.GestionModelosConsultasVisualIDRegistry
					.getVisualID(containerView);
		} else {
			if (containerView instanceof Diagram) {
				containerVisualID = gestionmodelosconsultas.diagram_PROYECCION.edit.parts.ProyeccionEditPart.VISUAL_ID;
			} else {
				return false;
			}
		}
		switch (containerVisualID) {
		case gestionmodelosconsultas.diagram_PROYECCION.edit.parts.ProyeccionEditPart.VISUAL_ID:
			if (gestionmodelosconsultas.diagram_PROYECCION.edit.parts.UnidadOrganizacionalEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (gestionmodelosconsultas.diagram_PROYECCION.edit.parts.DocumentoEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (gestionmodelosconsultas.diagram_PROYECCION.edit.parts.ActividadEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (gestionmodelosconsultas.diagram_PROYECCION.edit.parts.ActorEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (gestionmodelosconsultas.diagram_PROYECCION.edit.parts.ArmarioEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (gestionmodelosconsultas.diagram_PROYECCION.edit.parts.ComunicacionEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (gestionmodelosconsultas.diagram_PROYECCION.edit.parts.ContactoEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (gestionmodelosconsultas.diagram_PROYECCION.edit.parts.DepositoEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (gestionmodelosconsultas.diagram_PROYECCION.edit.parts.DiscoEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (gestionmodelosconsultas.diagram_PROYECCION.edit.parts.InstanciaProcesoEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (gestionmodelosconsultas.diagram_PROYECCION.edit.parts.QuienEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (gestionmodelosconsultas.diagram_PROYECCION.edit.parts.RolEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (gestionmodelosconsultas.diagram_PROYECCION.edit.parts.FechaEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case gestionmodelosconsultas.diagram_PROYECCION.edit.parts.UnidadOrganizacionalEditPart.VISUAL_ID:
			if (gestionmodelosconsultas.diagram_PROYECCION.edit.parts.UnidadOrganizacionalNombreEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (gestionmodelosconsultas.diagram_PROYECCION.edit.parts.UnidadOrganizacionalCompartmentUnidadOrganizacionalEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case gestionmodelosconsultas.diagram_PROYECCION.edit.parts.DocumentoEditPart.VISUAL_ID:
			if (gestionmodelosconsultas.diagram_PROYECCION.edit.parts.DocumentoNombreEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (gestionmodelosconsultas.diagram_PROYECCION.edit.parts.DocumentoCompartmentDocumentoEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case gestionmodelosconsultas.diagram_PROYECCION.edit.parts.ActividadEditPart.VISUAL_ID:
			if (gestionmodelosconsultas.diagram_PROYECCION.edit.parts.ActividadNombreEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (gestionmodelosconsultas.diagram_PROYECCION.edit.parts.ActividadCompartmentActividadEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case gestionmodelosconsultas.diagram_PROYECCION.edit.parts.ActorEditPart.VISUAL_ID:
			if (gestionmodelosconsultas.diagram_PROYECCION.edit.parts.ActorNombreEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (gestionmodelosconsultas.diagram_PROYECCION.edit.parts.ActorCompartmentActorEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case gestionmodelosconsultas.diagram_PROYECCION.edit.parts.ArmarioEditPart.VISUAL_ID:
			if (gestionmodelosconsultas.diagram_PROYECCION.edit.parts.ArmarioNombreEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (gestionmodelosconsultas.diagram_PROYECCION.edit.parts.ArmarioCompartmentArmarioEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case gestionmodelosconsultas.diagram_PROYECCION.edit.parts.ComunicacionEditPart.VISUAL_ID:
			if (gestionmodelosconsultas.diagram_PROYECCION.edit.parts.ComunicacionNombreEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (gestionmodelosconsultas.diagram_PROYECCION.edit.parts.ComunicacionCompartmentComunicacionEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case gestionmodelosconsultas.diagram_PROYECCION.edit.parts.ContactoEditPart.VISUAL_ID:
			if (gestionmodelosconsultas.diagram_PROYECCION.edit.parts.ContactoNombreEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (gestionmodelosconsultas.diagram_PROYECCION.edit.parts.ContactoCompartmentContactoEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case gestionmodelosconsultas.diagram_PROYECCION.edit.parts.DepositoEditPart.VISUAL_ID:
			if (gestionmodelosconsultas.diagram_PROYECCION.edit.parts.DepositoNombreEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (gestionmodelosconsultas.diagram_PROYECCION.edit.parts.DepositoCompartmentDepositoEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case gestionmodelosconsultas.diagram_PROYECCION.edit.parts.DiscoEditPart.VISUAL_ID:
			if (gestionmodelosconsultas.diagram_PROYECCION.edit.parts.DiscoNombreEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (gestionmodelosconsultas.diagram_PROYECCION.edit.parts.DiscoCompartmentDiscoEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case gestionmodelosconsultas.diagram_PROYECCION.edit.parts.InstanciaProcesoEditPart.VISUAL_ID:
			if (gestionmodelosconsultas.diagram_PROYECCION.edit.parts.InstanciaProcesoNombreEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (gestionmodelosconsultas.diagram_PROYECCION.edit.parts.InstanciaProcesoCompartmentInstanciaProcesoEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case gestionmodelosconsultas.diagram_PROYECCION.edit.parts.QuienEditPart.VISUAL_ID:
			if (gestionmodelosconsultas.diagram_PROYECCION.edit.parts.QuienNombreEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (gestionmodelosconsultas.diagram_PROYECCION.edit.parts.QuienCompartmentQuienEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case gestionmodelosconsultas.diagram_PROYECCION.edit.parts.RolEditPart.VISUAL_ID:
			if (gestionmodelosconsultas.diagram_PROYECCION.edit.parts.RolNombreEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (gestionmodelosconsultas.diagram_PROYECCION.edit.parts.RolCompartmentRolEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case gestionmodelosconsultas.diagram_PROYECCION.edit.parts.FechaEditPart.VISUAL_ID:
			if (gestionmodelosconsultas.diagram_PROYECCION.edit.parts.FechaNombreEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (gestionmodelosconsultas.diagram_PROYECCION.edit.parts.FechaDiaEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (gestionmodelosconsultas.diagram_PROYECCION.edit.parts.FechaMesEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (gestionmodelosconsultas.diagram_PROYECCION.edit.parts.FechaAnoEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (gestionmodelosconsultas.diagram_PROYECCION.edit.parts.FechaCompartmentFechaEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case gestionmodelosconsultas.diagram_PROYECCION.edit.parts.CampoEditPart.VISUAL_ID:
			if (gestionmodelosconsultas.diagram_PROYECCION.edit.parts.CampoNombreCampoEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case gestionmodelosconsultas.diagram_PROYECCION.edit.parts.Campo2EditPart.VISUAL_ID:
			if (gestionmodelosconsultas.diagram_PROYECCION.edit.parts.CampoNombreCampo2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case gestionmodelosconsultas.diagram_PROYECCION.edit.parts.Campo3EditPart.VISUAL_ID:
			if (gestionmodelosconsultas.diagram_PROYECCION.edit.parts.CampoNombreCampo3EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case gestionmodelosconsultas.diagram_PROYECCION.edit.parts.Campo4EditPart.VISUAL_ID:
			if (gestionmodelosconsultas.diagram_PROYECCION.edit.parts.CampoNombreCampo4EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case gestionmodelosconsultas.diagram_PROYECCION.edit.parts.Campo5EditPart.VISUAL_ID:
			if (gestionmodelosconsultas.diagram_PROYECCION.edit.parts.CampoNombreCampo5EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case gestionmodelosconsultas.diagram_PROYECCION.edit.parts.Campo6EditPart.VISUAL_ID:
			if (gestionmodelosconsultas.diagram_PROYECCION.edit.parts.CampoNombreCampo6EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case gestionmodelosconsultas.diagram_PROYECCION.edit.parts.Campo7EditPart.VISUAL_ID:
			if (gestionmodelosconsultas.diagram_PROYECCION.edit.parts.CampoNombreCampo7EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case gestionmodelosconsultas.diagram_PROYECCION.edit.parts.Campo8EditPart.VISUAL_ID:
			if (gestionmodelosconsultas.diagram_PROYECCION.edit.parts.CampoNombreCampo8EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case gestionmodelosconsultas.diagram_PROYECCION.edit.parts.Campo9EditPart.VISUAL_ID:
			if (gestionmodelosconsultas.diagram_PROYECCION.edit.parts.CampoNombreCampo9EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case gestionmodelosconsultas.diagram_PROYECCION.edit.parts.Campo10EditPart.VISUAL_ID:
			if (gestionmodelosconsultas.diagram_PROYECCION.edit.parts.CampoNombreCampo10EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case gestionmodelosconsultas.diagram_PROYECCION.edit.parts.Campo11EditPart.VISUAL_ID:
			if (gestionmodelosconsultas.diagram_PROYECCION.edit.parts.CampoNombreCampo11EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case gestionmodelosconsultas.diagram_PROYECCION.edit.parts.Campo12EditPart.VISUAL_ID:
			if (gestionmodelosconsultas.diagram_PROYECCION.edit.parts.CampoNombreCampo12EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case gestionmodelosconsultas.diagram_PROYECCION.edit.parts.UnidadOrganizacionalCompartmentUnidadOrganizacionalEditPart.VISUAL_ID:
			if (gestionmodelosconsultas.diagram_PROYECCION.edit.parts.CampoEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case gestionmodelosconsultas.diagram_PROYECCION.edit.parts.DocumentoCompartmentDocumentoEditPart.VISUAL_ID:
			if (gestionmodelosconsultas.diagram_PROYECCION.edit.parts.Campo2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case gestionmodelosconsultas.diagram_PROYECCION.edit.parts.ActividadCompartmentActividadEditPart.VISUAL_ID:
			if (gestionmodelosconsultas.diagram_PROYECCION.edit.parts.Campo3EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case gestionmodelosconsultas.diagram_PROYECCION.edit.parts.ActorCompartmentActorEditPart.VISUAL_ID:
			if (gestionmodelosconsultas.diagram_PROYECCION.edit.parts.Campo4EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case gestionmodelosconsultas.diagram_PROYECCION.edit.parts.ArmarioCompartmentArmarioEditPart.VISUAL_ID:
			if (gestionmodelosconsultas.diagram_PROYECCION.edit.parts.Campo5EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case gestionmodelosconsultas.diagram_PROYECCION.edit.parts.ComunicacionCompartmentComunicacionEditPart.VISUAL_ID:
			if (gestionmodelosconsultas.diagram_PROYECCION.edit.parts.Campo6EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case gestionmodelosconsultas.diagram_PROYECCION.edit.parts.ContactoCompartmentContactoEditPart.VISUAL_ID:
			if (gestionmodelosconsultas.diagram_PROYECCION.edit.parts.Campo7EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case gestionmodelosconsultas.diagram_PROYECCION.edit.parts.DepositoCompartmentDepositoEditPart.VISUAL_ID:
			if (gestionmodelosconsultas.diagram_PROYECCION.edit.parts.Campo8EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case gestionmodelosconsultas.diagram_PROYECCION.edit.parts.DiscoCompartmentDiscoEditPart.VISUAL_ID:
			if (gestionmodelosconsultas.diagram_PROYECCION.edit.parts.Campo9EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case gestionmodelosconsultas.diagram_PROYECCION.edit.parts.InstanciaProcesoCompartmentInstanciaProcesoEditPart.VISUAL_ID:
			if (gestionmodelosconsultas.diagram_PROYECCION.edit.parts.Campo10EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case gestionmodelosconsultas.diagram_PROYECCION.edit.parts.QuienCompartmentQuienEditPart.VISUAL_ID:
			if (gestionmodelosconsultas.diagram_PROYECCION.edit.parts.Campo11EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case gestionmodelosconsultas.diagram_PROYECCION.edit.parts.RolCompartmentRolEditPart.VISUAL_ID:
			if (gestionmodelosconsultas.diagram_PROYECCION.edit.parts.Campo12EditPart.VISUAL_ID == nodeVisualID) {
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
			return gestionmodelosconsultas.diagram_PROYECCION.edit.parts.RelacionEditPart.VISUAL_ID;
		}
		return -1;
	}

	/**
	 * User can change implementation of this method to handle some specific
	 * situations not covered by default logic.
	 * 
	 * @generated
	 */
	private static boolean isDiagram(Proyeccion element) {
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
		case gestionmodelosconsultas.diagram_PROYECCION.edit.parts.UnidadOrganizacionalCompartmentUnidadOrganizacionalEditPart.VISUAL_ID:
		case gestionmodelosconsultas.diagram_PROYECCION.edit.parts.DocumentoCompartmentDocumentoEditPart.VISUAL_ID:
		case gestionmodelosconsultas.diagram_PROYECCION.edit.parts.ActividadCompartmentActividadEditPart.VISUAL_ID:
		case gestionmodelosconsultas.diagram_PROYECCION.edit.parts.ActorCompartmentActorEditPart.VISUAL_ID:
		case gestionmodelosconsultas.diagram_PROYECCION.edit.parts.ArmarioCompartmentArmarioEditPart.VISUAL_ID:
		case gestionmodelosconsultas.diagram_PROYECCION.edit.parts.ComunicacionCompartmentComunicacionEditPart.VISUAL_ID:
		case gestionmodelosconsultas.diagram_PROYECCION.edit.parts.ContactoCompartmentContactoEditPart.VISUAL_ID:
		case gestionmodelosconsultas.diagram_PROYECCION.edit.parts.DepositoCompartmentDepositoEditPart.VISUAL_ID:
		case gestionmodelosconsultas.diagram_PROYECCION.edit.parts.DiscoCompartmentDiscoEditPart.VISUAL_ID:
		case gestionmodelosconsultas.diagram_PROYECCION.edit.parts.InstanciaProcesoCompartmentInstanciaProcesoEditPart.VISUAL_ID:
		case gestionmodelosconsultas.diagram_PROYECCION.edit.parts.QuienCompartmentQuienEditPart.VISUAL_ID:
		case gestionmodelosconsultas.diagram_PROYECCION.edit.parts.RolCompartmentRolEditPart.VISUAL_ID:
		case gestionmodelosconsultas.diagram_PROYECCION.edit.parts.FechaCompartmentFechaEditPart.VISUAL_ID:
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
		case gestionmodelosconsultas.diagram_PROYECCION.edit.parts.ProyeccionEditPart.VISUAL_ID:
			return false;
		case gestionmodelosconsultas.diagram_PROYECCION.edit.parts.FechaEditPart.VISUAL_ID:
		case gestionmodelosconsultas.diagram_PROYECCION.edit.parts.CampoEditPart.VISUAL_ID:
		case gestionmodelosconsultas.diagram_PROYECCION.edit.parts.Campo2EditPart.VISUAL_ID:
		case gestionmodelosconsultas.diagram_PROYECCION.edit.parts.Campo3EditPart.VISUAL_ID:
		case gestionmodelosconsultas.diagram_PROYECCION.edit.parts.Campo4EditPart.VISUAL_ID:
		case gestionmodelosconsultas.diagram_PROYECCION.edit.parts.Campo5EditPart.VISUAL_ID:
		case gestionmodelosconsultas.diagram_PROYECCION.edit.parts.Campo6EditPart.VISUAL_ID:
		case gestionmodelosconsultas.diagram_PROYECCION.edit.parts.Campo7EditPart.VISUAL_ID:
		case gestionmodelosconsultas.diagram_PROYECCION.edit.parts.Campo8EditPart.VISUAL_ID:
		case gestionmodelosconsultas.diagram_PROYECCION.edit.parts.Campo9EditPart.VISUAL_ID:
		case gestionmodelosconsultas.diagram_PROYECCION.edit.parts.Campo10EditPart.VISUAL_ID:
		case gestionmodelosconsultas.diagram_PROYECCION.edit.parts.Campo11EditPart.VISUAL_ID:
		case gestionmodelosconsultas.diagram_PROYECCION.edit.parts.Campo12EditPart.VISUAL_ID:
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
			return gestionmodelosconsultas.diagram_PROYECCION.part.GestionModelosConsultasVisualIDRegistry
					.getVisualID(view);
		}

		/**
		 * @generated
		 */

		public String getModelID(View view) {
			return gestionmodelosconsultas.diagram_PROYECCION.part.GestionModelosConsultasVisualIDRegistry
					.getModelID(view);
		}

		/**
		 * @generated
		 */

		public int getNodeVisualID(View containerView, EObject domainElement) {
			return gestionmodelosconsultas.diagram_PROYECCION.part.GestionModelosConsultasVisualIDRegistry
					.getNodeVisualID(containerView, domainElement);
		}

		/**
		 * @generated
		 */

		public boolean checkNodeVisualID(View containerView,
				EObject domainElement, int candidate) {
			return gestionmodelosconsultas.diagram_PROYECCION.part.GestionModelosConsultasVisualIDRegistry
					.checkNodeVisualID(containerView, domainElement, candidate);
		}

		/**
		 * @generated
		 */

		public boolean isCompartmentVisualID(int visualID) {
			return gestionmodelosconsultas.diagram_PROYECCION.part.GestionModelosConsultasVisualIDRegistry
					.isCompartmentVisualID(visualID);
		}

		/**
		 * @generated
		 */

		public boolean isSemanticLeafVisualID(int visualID) {
			return gestionmodelosconsultas.diagram_PROYECCION.part.GestionModelosConsultasVisualIDRegistry
					.isSemanticLeafVisualID(visualID);
		}
	};

}
