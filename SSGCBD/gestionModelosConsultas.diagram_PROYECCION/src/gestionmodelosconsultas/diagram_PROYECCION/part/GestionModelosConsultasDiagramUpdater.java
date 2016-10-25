package gestionmodelosconsultas.diagram_PROYECCION.part;

import gestionmodelosconsultas.modeloconsultas.como.ActividadProceso;
import gestionmodelosconsultas.modeloconsultas.como.InstanciaProceso;
import gestionmodelosconsultas.modeloconsultas.cuando.Fecha;
import gestionmodelosconsultas.modeloconsultas.donde.Armario;
import gestionmodelosconsultas.modeloconsultas.donde.Deposito;
import gestionmodelosconsultas.modeloconsultas.donde.Disco;
import gestionmodelosconsultas.modeloconsultas.model.Campo;
import gestionmodelosconsultas.modeloconsultas.model.EADiagram;
import gestionmodelosconsultas.modeloconsultas.model.ElementoConsulta;
import gestionmodelosconsultas.modeloconsultas.model.ModelPackage;
import gestionmodelosconsultas.modeloconsultas.model.Proyeccion;
import gestionmodelosconsultas.modeloconsultas.model.Relacion;
import gestionmodelosconsultas.modeloconsultas.que.Comunicacion;
import gestionmodelosconsultas.modeloconsultas.que.Documento;
import gestionmodelosconsultas.modeloconsultas.quien.Actor;
import gestionmodelosconsultas.modeloconsultas.quien.Contacto;
import gestionmodelosconsultas.modeloconsultas.quien.Quien;
import gestionmodelosconsultas.modeloconsultas.quien.Rol;
import gestionmodelosconsultas.modeloconsultas.quien.UnidadOrganizacional;

import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.gmf.runtime.notation.View;
import org.eclipse.gmf.tooling.runtime.update.DiagramUpdater;

/**
 * @generated
 */
public class GestionModelosConsultasDiagramUpdater {

	/**
	 * @generated
	 */
	public static List<gestionmodelosconsultas.diagram_PROYECCION.part.GestionModelosConsultasNodeDescriptor> getSemanticChildren(
			View view) {
		switch (gestionmodelosconsultas.diagram_PROYECCION.part.GestionModelosConsultasVisualIDRegistry
				.getVisualID(view)) {
		case gestionmodelosconsultas.diagram_PROYECCION.edit.parts.ProyeccionEditPart.VISUAL_ID:
			return getProyeccion_1000SemanticChildren(view);
		case gestionmodelosconsultas.diagram_PROYECCION.edit.parts.UnidadOrganizacionalCompartmentUnidadOrganizacionalEditPart.VISUAL_ID:
			return getUnidadOrganizacionalCompartmentUnidadOrganizacional_7015SemanticChildren(view);
		case gestionmodelosconsultas.diagram_PROYECCION.edit.parts.DocumentoCompartmentDocumentoEditPart.VISUAL_ID:
			return getDocumentoCompartmentDocumento_7016SemanticChildren(view);
		case gestionmodelosconsultas.diagram_PROYECCION.edit.parts.ActividadCompartmentActividadEditPart.VISUAL_ID:
			return getActividadCompartmentActividad_7017SemanticChildren(view);
		case gestionmodelosconsultas.diagram_PROYECCION.edit.parts.ActorCompartmentActorEditPart.VISUAL_ID:
			return getActorCompartmentActor_7018SemanticChildren(view);
		case gestionmodelosconsultas.diagram_PROYECCION.edit.parts.ArmarioCompartmentArmarioEditPart.VISUAL_ID:
			return getArmarioCompartmentArmario_7019SemanticChildren(view);
		case gestionmodelosconsultas.diagram_PROYECCION.edit.parts.ComunicacionCompartmentComunicacionEditPart.VISUAL_ID:
			return getComunicacionCompartmentComunicacion_7020SemanticChildren(view);
		case gestionmodelosconsultas.diagram_PROYECCION.edit.parts.ContactoCompartmentContactoEditPart.VISUAL_ID:
			return getContactoCompartmentContacto_7021SemanticChildren(view);
		case gestionmodelosconsultas.diagram_PROYECCION.edit.parts.DepositoCompartmentDepositoEditPart.VISUAL_ID:
			return getDepositoCompartmentDeposito_7022SemanticChildren(view);
		case gestionmodelosconsultas.diagram_PROYECCION.edit.parts.DiscoCompartmentDiscoEditPart.VISUAL_ID:
			return getDiscoCompartmentDisco_7023SemanticChildren(view);
		case gestionmodelosconsultas.diagram_PROYECCION.edit.parts.InstanciaProcesoCompartmentInstanciaProcesoEditPart.VISUAL_ID:
			return getInstanciaProcesoCompartmentInstanciaProceso_7024SemanticChildren(view);
		case gestionmodelosconsultas.diagram_PROYECCION.edit.parts.QuienCompartmentQuienEditPart.VISUAL_ID:
			return getQuienCompartmentQuien_7025SemanticChildren(view);
		case gestionmodelosconsultas.diagram_PROYECCION.edit.parts.RolCompartmentRolEditPart.VISUAL_ID:
			return getRolCompartmentRol_7026SemanticChildren(view);
		}
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<gestionmodelosconsultas.diagram_PROYECCION.part.GestionModelosConsultasNodeDescriptor> getProyeccion_1000SemanticChildren(
			View view) {
		if (!view.isSetElement()) {
			return Collections.emptyList();
		}
		Proyeccion modelElement = (Proyeccion) view.getElement();
		LinkedList<gestionmodelosconsultas.diagram_PROYECCION.part.GestionModelosConsultasNodeDescriptor> result = new LinkedList<gestionmodelosconsultas.diagram_PROYECCION.part.GestionModelosConsultasNodeDescriptor>();
		for (Iterator<?> it = modelElement.getListElementoConsulta().iterator(); it
				.hasNext();) {
			ElementoConsulta childElement = (ElementoConsulta) it.next();
			int visualID = gestionmodelosconsultas.diagram_PROYECCION.part.GestionModelosConsultasVisualIDRegistry
					.getNodeVisualID(view, childElement);
			if (visualID == gestionmodelosconsultas.diagram_PROYECCION.edit.parts.UnidadOrganizacionalEditPart.VISUAL_ID) {
				result.add(new gestionmodelosconsultas.diagram_PROYECCION.part.GestionModelosConsultasNodeDescriptor(
						childElement, visualID));
				continue;
			}
			if (visualID == gestionmodelosconsultas.diagram_PROYECCION.edit.parts.DocumentoEditPart.VISUAL_ID) {
				result.add(new gestionmodelosconsultas.diagram_PROYECCION.part.GestionModelosConsultasNodeDescriptor(
						childElement, visualID));
				continue;
			}
			if (visualID == gestionmodelosconsultas.diagram_PROYECCION.edit.parts.ActividadEditPart.VISUAL_ID) {
				result.add(new gestionmodelosconsultas.diagram_PROYECCION.part.GestionModelosConsultasNodeDescriptor(
						childElement, visualID));
				continue;
			}
			if (visualID == gestionmodelosconsultas.diagram_PROYECCION.edit.parts.ActorEditPart.VISUAL_ID) {
				result.add(new gestionmodelosconsultas.diagram_PROYECCION.part.GestionModelosConsultasNodeDescriptor(
						childElement, visualID));
				continue;
			}
			if (visualID == gestionmodelosconsultas.diagram_PROYECCION.edit.parts.ArmarioEditPart.VISUAL_ID) {
				result.add(new gestionmodelosconsultas.diagram_PROYECCION.part.GestionModelosConsultasNodeDescriptor(
						childElement, visualID));
				continue;
			}
			if (visualID == gestionmodelosconsultas.diagram_PROYECCION.edit.parts.ComunicacionEditPart.VISUAL_ID) {
				result.add(new gestionmodelosconsultas.diagram_PROYECCION.part.GestionModelosConsultasNodeDescriptor(
						childElement, visualID));
				continue;
			}
			if (visualID == gestionmodelosconsultas.diagram_PROYECCION.edit.parts.ContactoEditPart.VISUAL_ID) {
				result.add(new gestionmodelosconsultas.diagram_PROYECCION.part.GestionModelosConsultasNodeDescriptor(
						childElement, visualID));
				continue;
			}
			if (visualID == gestionmodelosconsultas.diagram_PROYECCION.edit.parts.DepositoEditPart.VISUAL_ID) {
				result.add(new gestionmodelosconsultas.diagram_PROYECCION.part.GestionModelosConsultasNodeDescriptor(
						childElement, visualID));
				continue;
			}
			if (visualID == gestionmodelosconsultas.diagram_PROYECCION.edit.parts.DiscoEditPart.VISUAL_ID) {
				result.add(new gestionmodelosconsultas.diagram_PROYECCION.part.GestionModelosConsultasNodeDescriptor(
						childElement, visualID));
				continue;
			}
			if (visualID == gestionmodelosconsultas.diagram_PROYECCION.edit.parts.InstanciaProcesoEditPart.VISUAL_ID) {
				result.add(new gestionmodelosconsultas.diagram_PROYECCION.part.GestionModelosConsultasNodeDescriptor(
						childElement, visualID));
				continue;
			}
			if (visualID == gestionmodelosconsultas.diagram_PROYECCION.edit.parts.QuienEditPart.VISUAL_ID) {
				result.add(new gestionmodelosconsultas.diagram_PROYECCION.part.GestionModelosConsultasNodeDescriptor(
						childElement, visualID));
				continue;
			}
			if (visualID == gestionmodelosconsultas.diagram_PROYECCION.edit.parts.RolEditPart.VISUAL_ID) {
				result.add(new gestionmodelosconsultas.diagram_PROYECCION.part.GestionModelosConsultasNodeDescriptor(
						childElement, visualID));
				continue;
			}
			if (visualID == gestionmodelosconsultas.diagram_PROYECCION.edit.parts.FechaEditPart.VISUAL_ID) {
				result.add(new gestionmodelosconsultas.diagram_PROYECCION.part.GestionModelosConsultasNodeDescriptor(
						childElement, visualID));
				continue;
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	public static List<gestionmodelosconsultas.diagram_PROYECCION.part.GestionModelosConsultasNodeDescriptor> getUnidadOrganizacionalCompartmentUnidadOrganizacional_7015SemanticChildren(
			View view) {
		if (false == view.eContainer() instanceof View) {
			return Collections.emptyList();
		}
		View containerView = (View) view.eContainer();
		if (!containerView.isSetElement()) {
			return Collections.emptyList();
		}
		UnidadOrganizacional modelElement = (UnidadOrganizacional) containerView
				.getElement();
		LinkedList<gestionmodelosconsultas.diagram_PROYECCION.part.GestionModelosConsultasNodeDescriptor> result = new LinkedList<gestionmodelosconsultas.diagram_PROYECCION.part.GestionModelosConsultasNodeDescriptor>();
		for (Iterator<?> it = modelElement.getListCampos().iterator(); it
				.hasNext();) {
			Campo childElement = (Campo) it.next();
			int visualID = gestionmodelosconsultas.diagram_PROYECCION.part.GestionModelosConsultasVisualIDRegistry
					.getNodeVisualID(view, childElement);
			if (visualID == gestionmodelosconsultas.diagram_PROYECCION.edit.parts.CampoEditPart.VISUAL_ID) {
				result.add(new gestionmodelosconsultas.diagram_PROYECCION.part.GestionModelosConsultasNodeDescriptor(
						childElement, visualID));
				continue;
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	public static List<gestionmodelosconsultas.diagram_PROYECCION.part.GestionModelosConsultasNodeDescriptor> getDocumentoCompartmentDocumento_7016SemanticChildren(
			View view) {
		if (false == view.eContainer() instanceof View) {
			return Collections.emptyList();
		}
		View containerView = (View) view.eContainer();
		if (!containerView.isSetElement()) {
			return Collections.emptyList();
		}
		Documento modelElement = (Documento) containerView.getElement();
		LinkedList<gestionmodelosconsultas.diagram_PROYECCION.part.GestionModelosConsultasNodeDescriptor> result = new LinkedList<gestionmodelosconsultas.diagram_PROYECCION.part.GestionModelosConsultasNodeDescriptor>();
		for (Iterator<?> it = modelElement.getListCampos().iterator(); it
				.hasNext();) {
			Campo childElement = (Campo) it.next();
			int visualID = gestionmodelosconsultas.diagram_PROYECCION.part.GestionModelosConsultasVisualIDRegistry
					.getNodeVisualID(view, childElement);
			if (visualID == gestionmodelosconsultas.diagram_PROYECCION.edit.parts.Campo2EditPart.VISUAL_ID) {
				result.add(new gestionmodelosconsultas.diagram_PROYECCION.part.GestionModelosConsultasNodeDescriptor(
						childElement, visualID));
				continue;
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	public static List<gestionmodelosconsultas.diagram_PROYECCION.part.GestionModelosConsultasNodeDescriptor> getActividadCompartmentActividad_7017SemanticChildren(
			View view) {
		if (false == view.eContainer() instanceof View) {
			return Collections.emptyList();
		}
		View containerView = (View) view.eContainer();
		if (!containerView.isSetElement()) {
			return Collections.emptyList();
		}
		ActividadProceso modelElement = (ActividadProceso) containerView.getElement();
		LinkedList<gestionmodelosconsultas.diagram_PROYECCION.part.GestionModelosConsultasNodeDescriptor> result = new LinkedList<gestionmodelosconsultas.diagram_PROYECCION.part.GestionModelosConsultasNodeDescriptor>();
		for (Iterator<?> it = modelElement.getListCampos().iterator(); it
				.hasNext();) {
			Campo childElement = (Campo) it.next();
			int visualID = gestionmodelosconsultas.diagram_PROYECCION.part.GestionModelosConsultasVisualIDRegistry
					.getNodeVisualID(view, childElement);
			if (visualID == gestionmodelosconsultas.diagram_PROYECCION.edit.parts.Campo3EditPart.VISUAL_ID) {
				result.add(new gestionmodelosconsultas.diagram_PROYECCION.part.GestionModelosConsultasNodeDescriptor(
						childElement, visualID));
				continue;
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	public static List<gestionmodelosconsultas.diagram_PROYECCION.part.GestionModelosConsultasNodeDescriptor> getActorCompartmentActor_7018SemanticChildren(
			View view) {
		if (false == view.eContainer() instanceof View) {
			return Collections.emptyList();
		}
		View containerView = (View) view.eContainer();
		if (!containerView.isSetElement()) {
			return Collections.emptyList();
		}
		Actor modelElement = (Actor) containerView.getElement();
		LinkedList<gestionmodelosconsultas.diagram_PROYECCION.part.GestionModelosConsultasNodeDescriptor> result = new LinkedList<gestionmodelosconsultas.diagram_PROYECCION.part.GestionModelosConsultasNodeDescriptor>();
		for (Iterator<?> it = modelElement.getListCampos().iterator(); it
				.hasNext();) {
			Campo childElement = (Campo) it.next();
			int visualID = gestionmodelosconsultas.diagram_PROYECCION.part.GestionModelosConsultasVisualIDRegistry
					.getNodeVisualID(view, childElement);
			if (visualID == gestionmodelosconsultas.diagram_PROYECCION.edit.parts.Campo4EditPart.VISUAL_ID) {
				result.add(new gestionmodelosconsultas.diagram_PROYECCION.part.GestionModelosConsultasNodeDescriptor(
						childElement, visualID));
				continue;
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	public static List<gestionmodelosconsultas.diagram_PROYECCION.part.GestionModelosConsultasNodeDescriptor> getArmarioCompartmentArmario_7019SemanticChildren(
			View view) {
		if (false == view.eContainer() instanceof View) {
			return Collections.emptyList();
		}
		View containerView = (View) view.eContainer();
		if (!containerView.isSetElement()) {
			return Collections.emptyList();
		}
		Armario modelElement = (Armario) containerView.getElement();
		LinkedList<gestionmodelosconsultas.diagram_PROYECCION.part.GestionModelosConsultasNodeDescriptor> result = new LinkedList<gestionmodelosconsultas.diagram_PROYECCION.part.GestionModelosConsultasNodeDescriptor>();
		for (Iterator<?> it = modelElement.getListCampos().iterator(); it
				.hasNext();) {
			Campo childElement = (Campo) it.next();
			int visualID = gestionmodelosconsultas.diagram_PROYECCION.part.GestionModelosConsultasVisualIDRegistry
					.getNodeVisualID(view, childElement);
			if (visualID == gestionmodelosconsultas.diagram_PROYECCION.edit.parts.Campo5EditPart.VISUAL_ID) {
				result.add(new gestionmodelosconsultas.diagram_PROYECCION.part.GestionModelosConsultasNodeDescriptor(
						childElement, visualID));
				continue;
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	public static List<gestionmodelosconsultas.diagram_PROYECCION.part.GestionModelosConsultasNodeDescriptor> getComunicacionCompartmentComunicacion_7020SemanticChildren(
			View view) {
		if (false == view.eContainer() instanceof View) {
			return Collections.emptyList();
		}
		View containerView = (View) view.eContainer();
		if (!containerView.isSetElement()) {
			return Collections.emptyList();
		}
		Comunicacion modelElement = (Comunicacion) containerView.getElement();
		LinkedList<gestionmodelosconsultas.diagram_PROYECCION.part.GestionModelosConsultasNodeDescriptor> result = new LinkedList<gestionmodelosconsultas.diagram_PROYECCION.part.GestionModelosConsultasNodeDescriptor>();
		for (Iterator<?> it = modelElement.getListCampos().iterator(); it
				.hasNext();) {
			Campo childElement = (Campo) it.next();
			int visualID = gestionmodelosconsultas.diagram_PROYECCION.part.GestionModelosConsultasVisualIDRegistry
					.getNodeVisualID(view, childElement);
			if (visualID == gestionmodelosconsultas.diagram_PROYECCION.edit.parts.Campo6EditPart.VISUAL_ID) {
				result.add(new gestionmodelosconsultas.diagram_PROYECCION.part.GestionModelosConsultasNodeDescriptor(
						childElement, visualID));
				continue;
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	public static List<gestionmodelosconsultas.diagram_PROYECCION.part.GestionModelosConsultasNodeDescriptor> getContactoCompartmentContacto_7021SemanticChildren(
			View view) {
		if (false == view.eContainer() instanceof View) {
			return Collections.emptyList();
		}
		View containerView = (View) view.eContainer();
		if (!containerView.isSetElement()) {
			return Collections.emptyList();
		}
		Contacto modelElement = (Contacto) containerView.getElement();
		LinkedList<gestionmodelosconsultas.diagram_PROYECCION.part.GestionModelosConsultasNodeDescriptor> result = new LinkedList<gestionmodelosconsultas.diagram_PROYECCION.part.GestionModelosConsultasNodeDescriptor>();
		for (Iterator<?> it = modelElement.getListCampos().iterator(); it
				.hasNext();) {
			Campo childElement = (Campo) it.next();
			int visualID = gestionmodelosconsultas.diagram_PROYECCION.part.GestionModelosConsultasVisualIDRegistry
					.getNodeVisualID(view, childElement);
			if (visualID == gestionmodelosconsultas.diagram_PROYECCION.edit.parts.Campo7EditPart.VISUAL_ID) {
				result.add(new gestionmodelosconsultas.diagram_PROYECCION.part.GestionModelosConsultasNodeDescriptor(
						childElement, visualID));
				continue;
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	public static List<gestionmodelosconsultas.diagram_PROYECCION.part.GestionModelosConsultasNodeDescriptor> getDepositoCompartmentDeposito_7022SemanticChildren(
			View view) {
		if (false == view.eContainer() instanceof View) {
			return Collections.emptyList();
		}
		View containerView = (View) view.eContainer();
		if (!containerView.isSetElement()) {
			return Collections.emptyList();
		}
		Deposito modelElement = (Deposito) containerView.getElement();
		LinkedList<gestionmodelosconsultas.diagram_PROYECCION.part.GestionModelosConsultasNodeDescriptor> result = new LinkedList<gestionmodelosconsultas.diagram_PROYECCION.part.GestionModelosConsultasNodeDescriptor>();
		for (Iterator<?> it = modelElement.getListCampos().iterator(); it
				.hasNext();) {
			Campo childElement = (Campo) it.next();
			int visualID = gestionmodelosconsultas.diagram_PROYECCION.part.GestionModelosConsultasVisualIDRegistry
					.getNodeVisualID(view, childElement);
			if (visualID == gestionmodelosconsultas.diagram_PROYECCION.edit.parts.Campo8EditPart.VISUAL_ID) {
				result.add(new gestionmodelosconsultas.diagram_PROYECCION.part.GestionModelosConsultasNodeDescriptor(
						childElement, visualID));
				continue;
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	public static List<gestionmodelosconsultas.diagram_PROYECCION.part.GestionModelosConsultasNodeDescriptor> getDiscoCompartmentDisco_7023SemanticChildren(
			View view) {
		if (false == view.eContainer() instanceof View) {
			return Collections.emptyList();
		}
		View containerView = (View) view.eContainer();
		if (!containerView.isSetElement()) {
			return Collections.emptyList();
		}
		Disco modelElement = (Disco) containerView.getElement();
		LinkedList<gestionmodelosconsultas.diagram_PROYECCION.part.GestionModelosConsultasNodeDescriptor> result = new LinkedList<gestionmodelosconsultas.diagram_PROYECCION.part.GestionModelosConsultasNodeDescriptor>();
		for (Iterator<?> it = modelElement.getListCampos().iterator(); it
				.hasNext();) {
			Campo childElement = (Campo) it.next();
			int visualID = gestionmodelosconsultas.diagram_PROYECCION.part.GestionModelosConsultasVisualIDRegistry
					.getNodeVisualID(view, childElement);
			if (visualID == gestionmodelosconsultas.diagram_PROYECCION.edit.parts.Campo9EditPart.VISUAL_ID) {
				result.add(new gestionmodelosconsultas.diagram_PROYECCION.part.GestionModelosConsultasNodeDescriptor(
						childElement, visualID));
				continue;
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	public static List<gestionmodelosconsultas.diagram_PROYECCION.part.GestionModelosConsultasNodeDescriptor> getInstanciaProcesoCompartmentInstanciaProceso_7024SemanticChildren(
			View view) {
		if (false == view.eContainer() instanceof View) {
			return Collections.emptyList();
		}
		View containerView = (View) view.eContainer();
		if (!containerView.isSetElement()) {
			return Collections.emptyList();
		}
		InstanciaProceso modelElement = (InstanciaProceso) containerView
				.getElement();
		LinkedList<gestionmodelosconsultas.diagram_PROYECCION.part.GestionModelosConsultasNodeDescriptor> result = new LinkedList<gestionmodelosconsultas.diagram_PROYECCION.part.GestionModelosConsultasNodeDescriptor>();
		for (Iterator<?> it = modelElement.getListCampos().iterator(); it
				.hasNext();) {
			Campo childElement = (Campo) it.next();
			int visualID = gestionmodelosconsultas.diagram_PROYECCION.part.GestionModelosConsultasVisualIDRegistry
					.getNodeVisualID(view, childElement);
			if (visualID == gestionmodelosconsultas.diagram_PROYECCION.edit.parts.Campo10EditPart.VISUAL_ID) {
				result.add(new gestionmodelosconsultas.diagram_PROYECCION.part.GestionModelosConsultasNodeDescriptor(
						childElement, visualID));
				continue;
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	public static List<gestionmodelosconsultas.diagram_PROYECCION.part.GestionModelosConsultasNodeDescriptor> getQuienCompartmentQuien_7025SemanticChildren(
			View view) {
		if (false == view.eContainer() instanceof View) {
			return Collections.emptyList();
		}
		View containerView = (View) view.eContainer();
		if (!containerView.isSetElement()) {
			return Collections.emptyList();
		}
		Quien modelElement = (Quien) containerView.getElement();
		LinkedList<gestionmodelosconsultas.diagram_PROYECCION.part.GestionModelosConsultasNodeDescriptor> result = new LinkedList<gestionmodelosconsultas.diagram_PROYECCION.part.GestionModelosConsultasNodeDescriptor>();
		for (Iterator<?> it = modelElement.getListCampos().iterator(); it
				.hasNext();) {
			Campo childElement = (Campo) it.next();
			int visualID = gestionmodelosconsultas.diagram_PROYECCION.part.GestionModelosConsultasVisualIDRegistry
					.getNodeVisualID(view, childElement);
			if (visualID == gestionmodelosconsultas.diagram_PROYECCION.edit.parts.Campo11EditPart.VISUAL_ID) {
				result.add(new gestionmodelosconsultas.diagram_PROYECCION.part.GestionModelosConsultasNodeDescriptor(
						childElement, visualID));
				continue;
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	public static List<gestionmodelosconsultas.diagram_PROYECCION.part.GestionModelosConsultasNodeDescriptor> getRolCompartmentRol_7026SemanticChildren(
			View view) {
		if (false == view.eContainer() instanceof View) {
			return Collections.emptyList();
		}
		View containerView = (View) view.eContainer();
		if (!containerView.isSetElement()) {
			return Collections.emptyList();
		}
		Rol modelElement = (Rol) containerView.getElement();
		LinkedList<gestionmodelosconsultas.diagram_PROYECCION.part.GestionModelosConsultasNodeDescriptor> result = new LinkedList<gestionmodelosconsultas.diagram_PROYECCION.part.GestionModelosConsultasNodeDescriptor>();
		for (Iterator<?> it = modelElement.getListCampos().iterator(); it
				.hasNext();) {
			Campo childElement = (Campo) it.next();
			int visualID = gestionmodelosconsultas.diagram_PROYECCION.part.GestionModelosConsultasVisualIDRegistry
					.getNodeVisualID(view, childElement);
			if (visualID == gestionmodelosconsultas.diagram_PROYECCION.edit.parts.Campo12EditPart.VISUAL_ID) {
				result.add(new gestionmodelosconsultas.diagram_PROYECCION.part.GestionModelosConsultasNodeDescriptor(
						childElement, visualID));
				continue;
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	public static List<gestionmodelosconsultas.diagram_PROYECCION.part.GestionModelosConsultasLinkDescriptor> getContainedLinks(
			View view) {
		switch (gestionmodelosconsultas.diagram_PROYECCION.part.GestionModelosConsultasVisualIDRegistry
				.getVisualID(view)) {
		case gestionmodelosconsultas.diagram_PROYECCION.edit.parts.ProyeccionEditPart.VISUAL_ID:
			return getProyeccion_1000ContainedLinks(view);
		case gestionmodelosconsultas.diagram_PROYECCION.edit.parts.UnidadOrganizacionalEditPart.VISUAL_ID:
			return getUnidadOrganizacional_2015ContainedLinks(view);
		case gestionmodelosconsultas.diagram_PROYECCION.edit.parts.DocumentoEditPart.VISUAL_ID:
			return getDocumento_2016ContainedLinks(view);
		case gestionmodelosconsultas.diagram_PROYECCION.edit.parts.ActividadEditPart.VISUAL_ID:
			return getActividad_2017ContainedLinks(view);
		case gestionmodelosconsultas.diagram_PROYECCION.edit.parts.ActorEditPart.VISUAL_ID:
			return getActor_2018ContainedLinks(view);
		case gestionmodelosconsultas.diagram_PROYECCION.edit.parts.ArmarioEditPart.VISUAL_ID:
			return getArmario_2019ContainedLinks(view);
		case gestionmodelosconsultas.diagram_PROYECCION.edit.parts.ComunicacionEditPart.VISUAL_ID:
			return getComunicacion_2020ContainedLinks(view);
		case gestionmodelosconsultas.diagram_PROYECCION.edit.parts.ContactoEditPart.VISUAL_ID:
			return getContacto_2021ContainedLinks(view);
		case gestionmodelosconsultas.diagram_PROYECCION.edit.parts.DepositoEditPart.VISUAL_ID:
			return getDeposito_2022ContainedLinks(view);
		case gestionmodelosconsultas.diagram_PROYECCION.edit.parts.DiscoEditPart.VISUAL_ID:
			return getDisco_2023ContainedLinks(view);
		case gestionmodelosconsultas.diagram_PROYECCION.edit.parts.InstanciaProcesoEditPart.VISUAL_ID:
			return getInstanciaProceso_2024ContainedLinks(view);
		case gestionmodelosconsultas.diagram_PROYECCION.edit.parts.QuienEditPart.VISUAL_ID:
			return getQuien_2025ContainedLinks(view);
		case gestionmodelosconsultas.diagram_PROYECCION.edit.parts.RolEditPart.VISUAL_ID:
			return getRol_2026ContainedLinks(view);
		case gestionmodelosconsultas.diagram_PROYECCION.edit.parts.FechaEditPart.VISUAL_ID:
			return getFecha_2027ContainedLinks(view);
		case gestionmodelosconsultas.diagram_PROYECCION.edit.parts.CampoEditPart.VISUAL_ID:
			return getCampo_3001ContainedLinks(view);
		case gestionmodelosconsultas.diagram_PROYECCION.edit.parts.Campo2EditPart.VISUAL_ID:
			return getCampo_3002ContainedLinks(view);
		case gestionmodelosconsultas.diagram_PROYECCION.edit.parts.Campo3EditPart.VISUAL_ID:
			return getCampo_3003ContainedLinks(view);
		case gestionmodelosconsultas.diagram_PROYECCION.edit.parts.Campo4EditPart.VISUAL_ID:
			return getCampo_3004ContainedLinks(view);
		case gestionmodelosconsultas.diagram_PROYECCION.edit.parts.Campo5EditPart.VISUAL_ID:
			return getCampo_3005ContainedLinks(view);
		case gestionmodelosconsultas.diagram_PROYECCION.edit.parts.Campo6EditPart.VISUAL_ID:
			return getCampo_3006ContainedLinks(view);
		case gestionmodelosconsultas.diagram_PROYECCION.edit.parts.Campo7EditPart.VISUAL_ID:
			return getCampo_3007ContainedLinks(view);
		case gestionmodelosconsultas.diagram_PROYECCION.edit.parts.Campo8EditPart.VISUAL_ID:
			return getCampo_3008ContainedLinks(view);
		case gestionmodelosconsultas.diagram_PROYECCION.edit.parts.Campo9EditPart.VISUAL_ID:
			return getCampo_3009ContainedLinks(view);
		case gestionmodelosconsultas.diagram_PROYECCION.edit.parts.Campo10EditPart.VISUAL_ID:
			return getCampo_3010ContainedLinks(view);
		case gestionmodelosconsultas.diagram_PROYECCION.edit.parts.Campo11EditPart.VISUAL_ID:
			return getCampo_3011ContainedLinks(view);
		case gestionmodelosconsultas.diagram_PROYECCION.edit.parts.Campo12EditPart.VISUAL_ID:
			return getCampo_3012ContainedLinks(view);
		case gestionmodelosconsultas.diagram_PROYECCION.edit.parts.RelacionEditPart.VISUAL_ID:
			return getRelacion_4001ContainedLinks(view);
		}
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<gestionmodelosconsultas.diagram_PROYECCION.part.GestionModelosConsultasLinkDescriptor> getIncomingLinks(
			View view) {
		switch (gestionmodelosconsultas.diagram_PROYECCION.part.GestionModelosConsultasVisualIDRegistry
				.getVisualID(view)) {
		case gestionmodelosconsultas.diagram_PROYECCION.edit.parts.UnidadOrganizacionalEditPart.VISUAL_ID:
			return getUnidadOrganizacional_2015IncomingLinks(view);
		case gestionmodelosconsultas.diagram_PROYECCION.edit.parts.DocumentoEditPart.VISUAL_ID:
			return getDocumento_2016IncomingLinks(view);
		case gestionmodelosconsultas.diagram_PROYECCION.edit.parts.ActividadEditPart.VISUAL_ID:
			return getActividad_2017IncomingLinks(view);
		case gestionmodelosconsultas.diagram_PROYECCION.edit.parts.ActorEditPart.VISUAL_ID:
			return getActor_2018IncomingLinks(view);
		case gestionmodelosconsultas.diagram_PROYECCION.edit.parts.ArmarioEditPart.VISUAL_ID:
			return getArmario_2019IncomingLinks(view);
		case gestionmodelosconsultas.diagram_PROYECCION.edit.parts.ComunicacionEditPart.VISUAL_ID:
			return getComunicacion_2020IncomingLinks(view);
		case gestionmodelosconsultas.diagram_PROYECCION.edit.parts.ContactoEditPart.VISUAL_ID:
			return getContacto_2021IncomingLinks(view);
		case gestionmodelosconsultas.diagram_PROYECCION.edit.parts.DepositoEditPart.VISUAL_ID:
			return getDeposito_2022IncomingLinks(view);
		case gestionmodelosconsultas.diagram_PROYECCION.edit.parts.DiscoEditPart.VISUAL_ID:
			return getDisco_2023IncomingLinks(view);
		case gestionmodelosconsultas.diagram_PROYECCION.edit.parts.InstanciaProcesoEditPart.VISUAL_ID:
			return getInstanciaProceso_2024IncomingLinks(view);
		case gestionmodelosconsultas.diagram_PROYECCION.edit.parts.QuienEditPart.VISUAL_ID:
			return getQuien_2025IncomingLinks(view);
		case gestionmodelosconsultas.diagram_PROYECCION.edit.parts.RolEditPart.VISUAL_ID:
			return getRol_2026IncomingLinks(view);
		case gestionmodelosconsultas.diagram_PROYECCION.edit.parts.FechaEditPart.VISUAL_ID:
			return getFecha_2027IncomingLinks(view);
		case gestionmodelosconsultas.diagram_PROYECCION.edit.parts.CampoEditPart.VISUAL_ID:
			return getCampo_3001IncomingLinks(view);
		case gestionmodelosconsultas.diagram_PROYECCION.edit.parts.Campo2EditPart.VISUAL_ID:
			return getCampo_3002IncomingLinks(view);
		case gestionmodelosconsultas.diagram_PROYECCION.edit.parts.Campo3EditPart.VISUAL_ID:
			return getCampo_3003IncomingLinks(view);
		case gestionmodelosconsultas.diagram_PROYECCION.edit.parts.Campo4EditPart.VISUAL_ID:
			return getCampo_3004IncomingLinks(view);
		case gestionmodelosconsultas.diagram_PROYECCION.edit.parts.Campo5EditPart.VISUAL_ID:
			return getCampo_3005IncomingLinks(view);
		case gestionmodelosconsultas.diagram_PROYECCION.edit.parts.Campo6EditPart.VISUAL_ID:
			return getCampo_3006IncomingLinks(view);
		case gestionmodelosconsultas.diagram_PROYECCION.edit.parts.Campo7EditPart.VISUAL_ID:
			return getCampo_3007IncomingLinks(view);
		case gestionmodelosconsultas.diagram_PROYECCION.edit.parts.Campo8EditPart.VISUAL_ID:
			return getCampo_3008IncomingLinks(view);
		case gestionmodelosconsultas.diagram_PROYECCION.edit.parts.Campo9EditPart.VISUAL_ID:
			return getCampo_3009IncomingLinks(view);
		case gestionmodelosconsultas.diagram_PROYECCION.edit.parts.Campo10EditPart.VISUAL_ID:
			return getCampo_3010IncomingLinks(view);
		case gestionmodelosconsultas.diagram_PROYECCION.edit.parts.Campo11EditPart.VISUAL_ID:
			return getCampo_3011IncomingLinks(view);
		case gestionmodelosconsultas.diagram_PROYECCION.edit.parts.Campo12EditPart.VISUAL_ID:
			return getCampo_3012IncomingLinks(view);
		case gestionmodelosconsultas.diagram_PROYECCION.edit.parts.RelacionEditPart.VISUAL_ID:
			return getRelacion_4001IncomingLinks(view);
		}
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<gestionmodelosconsultas.diagram_PROYECCION.part.GestionModelosConsultasLinkDescriptor> getOutgoingLinks(
			View view) {
		switch (gestionmodelosconsultas.diagram_PROYECCION.part.GestionModelosConsultasVisualIDRegistry
				.getVisualID(view)) {
		case gestionmodelosconsultas.diagram_PROYECCION.edit.parts.UnidadOrganizacionalEditPart.VISUAL_ID:
			return getUnidadOrganizacional_2015OutgoingLinks(view);
		case gestionmodelosconsultas.diagram_PROYECCION.edit.parts.DocumentoEditPart.VISUAL_ID:
			return getDocumento_2016OutgoingLinks(view);
		case gestionmodelosconsultas.diagram_PROYECCION.edit.parts.ActividadEditPart.VISUAL_ID:
			return getActividad_2017OutgoingLinks(view);
		case gestionmodelosconsultas.diagram_PROYECCION.edit.parts.ActorEditPart.VISUAL_ID:
			return getActor_2018OutgoingLinks(view);
		case gestionmodelosconsultas.diagram_PROYECCION.edit.parts.ArmarioEditPart.VISUAL_ID:
			return getArmario_2019OutgoingLinks(view);
		case gestionmodelosconsultas.diagram_PROYECCION.edit.parts.ComunicacionEditPart.VISUAL_ID:
			return getComunicacion_2020OutgoingLinks(view);
		case gestionmodelosconsultas.diagram_PROYECCION.edit.parts.ContactoEditPart.VISUAL_ID:
			return getContacto_2021OutgoingLinks(view);
		case gestionmodelosconsultas.diagram_PROYECCION.edit.parts.DepositoEditPart.VISUAL_ID:
			return getDeposito_2022OutgoingLinks(view);
		case gestionmodelosconsultas.diagram_PROYECCION.edit.parts.DiscoEditPart.VISUAL_ID:
			return getDisco_2023OutgoingLinks(view);
		case gestionmodelosconsultas.diagram_PROYECCION.edit.parts.InstanciaProcesoEditPart.VISUAL_ID:
			return getInstanciaProceso_2024OutgoingLinks(view);
		case gestionmodelosconsultas.diagram_PROYECCION.edit.parts.QuienEditPart.VISUAL_ID:
			return getQuien_2025OutgoingLinks(view);
		case gestionmodelosconsultas.diagram_PROYECCION.edit.parts.RolEditPart.VISUAL_ID:
			return getRol_2026OutgoingLinks(view);
		case gestionmodelosconsultas.diagram_PROYECCION.edit.parts.FechaEditPart.VISUAL_ID:
			return getFecha_2027OutgoingLinks(view);
		case gestionmodelosconsultas.diagram_PROYECCION.edit.parts.CampoEditPart.VISUAL_ID:
			return getCampo_3001OutgoingLinks(view);
		case gestionmodelosconsultas.diagram_PROYECCION.edit.parts.Campo2EditPart.VISUAL_ID:
			return getCampo_3002OutgoingLinks(view);
		case gestionmodelosconsultas.diagram_PROYECCION.edit.parts.Campo3EditPart.VISUAL_ID:
			return getCampo_3003OutgoingLinks(view);
		case gestionmodelosconsultas.diagram_PROYECCION.edit.parts.Campo4EditPart.VISUAL_ID:
			return getCampo_3004OutgoingLinks(view);
		case gestionmodelosconsultas.diagram_PROYECCION.edit.parts.Campo5EditPart.VISUAL_ID:
			return getCampo_3005OutgoingLinks(view);
		case gestionmodelosconsultas.diagram_PROYECCION.edit.parts.Campo6EditPart.VISUAL_ID:
			return getCampo_3006OutgoingLinks(view);
		case gestionmodelosconsultas.diagram_PROYECCION.edit.parts.Campo7EditPart.VISUAL_ID:
			return getCampo_3007OutgoingLinks(view);
		case gestionmodelosconsultas.diagram_PROYECCION.edit.parts.Campo8EditPart.VISUAL_ID:
			return getCampo_3008OutgoingLinks(view);
		case gestionmodelosconsultas.diagram_PROYECCION.edit.parts.Campo9EditPart.VISUAL_ID:
			return getCampo_3009OutgoingLinks(view);
		case gestionmodelosconsultas.diagram_PROYECCION.edit.parts.Campo10EditPart.VISUAL_ID:
			return getCampo_3010OutgoingLinks(view);
		case gestionmodelosconsultas.diagram_PROYECCION.edit.parts.Campo11EditPart.VISUAL_ID:
			return getCampo_3011OutgoingLinks(view);
		case gestionmodelosconsultas.diagram_PROYECCION.edit.parts.Campo12EditPart.VISUAL_ID:
			return getCampo_3012OutgoingLinks(view);
		case gestionmodelosconsultas.diagram_PROYECCION.edit.parts.RelacionEditPart.VISUAL_ID:
			return getRelacion_4001OutgoingLinks(view);
		}
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<gestionmodelosconsultas.diagram_PROYECCION.part.GestionModelosConsultasLinkDescriptor> getProyeccion_1000ContainedLinks(
			View view) {
		Proyeccion modelElement = (Proyeccion) view.getElement();
		LinkedList<gestionmodelosconsultas.diagram_PROYECCION.part.GestionModelosConsultasLinkDescriptor> result = new LinkedList<gestionmodelosconsultas.diagram_PROYECCION.part.GestionModelosConsultasLinkDescriptor>();
		result.addAll(getContainedTypeModelFacetLinks_Relacion_4001(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<gestionmodelosconsultas.diagram_PROYECCION.part.GestionModelosConsultasLinkDescriptor> getUnidadOrganizacional_2015ContainedLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<gestionmodelosconsultas.diagram_PROYECCION.part.GestionModelosConsultasLinkDescriptor> getDocumento_2016ContainedLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<gestionmodelosconsultas.diagram_PROYECCION.part.GestionModelosConsultasLinkDescriptor> getActividad_2017ContainedLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<gestionmodelosconsultas.diagram_PROYECCION.part.GestionModelosConsultasLinkDescriptor> getActor_2018ContainedLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<gestionmodelosconsultas.diagram_PROYECCION.part.GestionModelosConsultasLinkDescriptor> getArmario_2019ContainedLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<gestionmodelosconsultas.diagram_PROYECCION.part.GestionModelosConsultasLinkDescriptor> getComunicacion_2020ContainedLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<gestionmodelosconsultas.diagram_PROYECCION.part.GestionModelosConsultasLinkDescriptor> getContacto_2021ContainedLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<gestionmodelosconsultas.diagram_PROYECCION.part.GestionModelosConsultasLinkDescriptor> getDeposito_2022ContainedLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<gestionmodelosconsultas.diagram_PROYECCION.part.GestionModelosConsultasLinkDescriptor> getDisco_2023ContainedLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<gestionmodelosconsultas.diagram_PROYECCION.part.GestionModelosConsultasLinkDescriptor> getInstanciaProceso_2024ContainedLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<gestionmodelosconsultas.diagram_PROYECCION.part.GestionModelosConsultasLinkDescriptor> getQuien_2025ContainedLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<gestionmodelosconsultas.diagram_PROYECCION.part.GestionModelosConsultasLinkDescriptor> getRol_2026ContainedLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<gestionmodelosconsultas.diagram_PROYECCION.part.GestionModelosConsultasLinkDescriptor> getFecha_2027ContainedLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<gestionmodelosconsultas.diagram_PROYECCION.part.GestionModelosConsultasLinkDescriptor> getCampo_3001ContainedLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<gestionmodelosconsultas.diagram_PROYECCION.part.GestionModelosConsultasLinkDescriptor> getCampo_3002ContainedLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<gestionmodelosconsultas.diagram_PROYECCION.part.GestionModelosConsultasLinkDescriptor> getCampo_3003ContainedLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<gestionmodelosconsultas.diagram_PROYECCION.part.GestionModelosConsultasLinkDescriptor> getCampo_3004ContainedLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<gestionmodelosconsultas.diagram_PROYECCION.part.GestionModelosConsultasLinkDescriptor> getCampo_3005ContainedLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<gestionmodelosconsultas.diagram_PROYECCION.part.GestionModelosConsultasLinkDescriptor> getCampo_3006ContainedLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<gestionmodelosconsultas.diagram_PROYECCION.part.GestionModelosConsultasLinkDescriptor> getCampo_3007ContainedLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<gestionmodelosconsultas.diagram_PROYECCION.part.GestionModelosConsultasLinkDescriptor> getCampo_3008ContainedLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<gestionmodelosconsultas.diagram_PROYECCION.part.GestionModelosConsultasLinkDescriptor> getCampo_3009ContainedLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<gestionmodelosconsultas.diagram_PROYECCION.part.GestionModelosConsultasLinkDescriptor> getCampo_3010ContainedLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<gestionmodelosconsultas.diagram_PROYECCION.part.GestionModelosConsultasLinkDescriptor> getCampo_3011ContainedLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<gestionmodelosconsultas.diagram_PROYECCION.part.GestionModelosConsultasLinkDescriptor> getCampo_3012ContainedLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<gestionmodelosconsultas.diagram_PROYECCION.part.GestionModelosConsultasLinkDescriptor> getRelacion_4001ContainedLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<gestionmodelosconsultas.diagram_PROYECCION.part.GestionModelosConsultasLinkDescriptor> getUnidadOrganizacional_2015IncomingLinks(
			View view) {
		UnidadOrganizacional modelElement = (UnidadOrganizacional) view
				.getElement();
		Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences = EcoreUtil.CrossReferencer
				.find(view.eResource().getResourceSet().getResources());
		LinkedList<gestionmodelosconsultas.diagram_PROYECCION.part.GestionModelosConsultasLinkDescriptor> result = new LinkedList<gestionmodelosconsultas.diagram_PROYECCION.part.GestionModelosConsultasLinkDescriptor>();
		result.addAll(getIncomingTypeModelFacetLinks_Relacion_4001(
				modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<gestionmodelosconsultas.diagram_PROYECCION.part.GestionModelosConsultasLinkDescriptor> getDocumento_2016IncomingLinks(
			View view) {
		Documento modelElement = (Documento) view.getElement();
		Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences = EcoreUtil.CrossReferencer
				.find(view.eResource().getResourceSet().getResources());
		LinkedList<gestionmodelosconsultas.diagram_PROYECCION.part.GestionModelosConsultasLinkDescriptor> result = new LinkedList<gestionmodelosconsultas.diagram_PROYECCION.part.GestionModelosConsultasLinkDescriptor>();
		result.addAll(getIncomingTypeModelFacetLinks_Relacion_4001(
				modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<gestionmodelosconsultas.diagram_PROYECCION.part.GestionModelosConsultasLinkDescriptor> getActividad_2017IncomingLinks(
			View view) {
		ActividadProceso modelElement = (ActividadProceso) view.getElement();
		Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences = EcoreUtil.CrossReferencer
				.find(view.eResource().getResourceSet().getResources());
		LinkedList<gestionmodelosconsultas.diagram_PROYECCION.part.GestionModelosConsultasLinkDescriptor> result = new LinkedList<gestionmodelosconsultas.diagram_PROYECCION.part.GestionModelosConsultasLinkDescriptor>();
		result.addAll(getIncomingTypeModelFacetLinks_Relacion_4001(
				modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<gestionmodelosconsultas.diagram_PROYECCION.part.GestionModelosConsultasLinkDescriptor> getActor_2018IncomingLinks(
			View view) {
		Actor modelElement = (Actor) view.getElement();
		Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences = EcoreUtil.CrossReferencer
				.find(view.eResource().getResourceSet().getResources());
		LinkedList<gestionmodelosconsultas.diagram_PROYECCION.part.GestionModelosConsultasLinkDescriptor> result = new LinkedList<gestionmodelosconsultas.diagram_PROYECCION.part.GestionModelosConsultasLinkDescriptor>();
		result.addAll(getIncomingTypeModelFacetLinks_Relacion_4001(
				modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<gestionmodelosconsultas.diagram_PROYECCION.part.GestionModelosConsultasLinkDescriptor> getArmario_2019IncomingLinks(
			View view) {
		Armario modelElement = (Armario) view.getElement();
		Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences = EcoreUtil.CrossReferencer
				.find(view.eResource().getResourceSet().getResources());
		LinkedList<gestionmodelosconsultas.diagram_PROYECCION.part.GestionModelosConsultasLinkDescriptor> result = new LinkedList<gestionmodelosconsultas.diagram_PROYECCION.part.GestionModelosConsultasLinkDescriptor>();
		result.addAll(getIncomingTypeModelFacetLinks_Relacion_4001(
				modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<gestionmodelosconsultas.diagram_PROYECCION.part.GestionModelosConsultasLinkDescriptor> getComunicacion_2020IncomingLinks(
			View view) {
		Comunicacion modelElement = (Comunicacion) view.getElement();
		Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences = EcoreUtil.CrossReferencer
				.find(view.eResource().getResourceSet().getResources());
		LinkedList<gestionmodelosconsultas.diagram_PROYECCION.part.GestionModelosConsultasLinkDescriptor> result = new LinkedList<gestionmodelosconsultas.diagram_PROYECCION.part.GestionModelosConsultasLinkDescriptor>();
		result.addAll(getIncomingTypeModelFacetLinks_Relacion_4001(
				modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<gestionmodelosconsultas.diagram_PROYECCION.part.GestionModelosConsultasLinkDescriptor> getContacto_2021IncomingLinks(
			View view) {
		Contacto modelElement = (Contacto) view.getElement();
		Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences = EcoreUtil.CrossReferencer
				.find(view.eResource().getResourceSet().getResources());
		LinkedList<gestionmodelosconsultas.diagram_PROYECCION.part.GestionModelosConsultasLinkDescriptor> result = new LinkedList<gestionmodelosconsultas.diagram_PROYECCION.part.GestionModelosConsultasLinkDescriptor>();
		result.addAll(getIncomingTypeModelFacetLinks_Relacion_4001(
				modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<gestionmodelosconsultas.diagram_PROYECCION.part.GestionModelosConsultasLinkDescriptor> getDeposito_2022IncomingLinks(
			View view) {
		Deposito modelElement = (Deposito) view.getElement();
		Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences = EcoreUtil.CrossReferencer
				.find(view.eResource().getResourceSet().getResources());
		LinkedList<gestionmodelosconsultas.diagram_PROYECCION.part.GestionModelosConsultasLinkDescriptor> result = new LinkedList<gestionmodelosconsultas.diagram_PROYECCION.part.GestionModelosConsultasLinkDescriptor>();
		result.addAll(getIncomingTypeModelFacetLinks_Relacion_4001(
				modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<gestionmodelosconsultas.diagram_PROYECCION.part.GestionModelosConsultasLinkDescriptor> getDisco_2023IncomingLinks(
			View view) {
		Disco modelElement = (Disco) view.getElement();
		Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences = EcoreUtil.CrossReferencer
				.find(view.eResource().getResourceSet().getResources());
		LinkedList<gestionmodelosconsultas.diagram_PROYECCION.part.GestionModelosConsultasLinkDescriptor> result = new LinkedList<gestionmodelosconsultas.diagram_PROYECCION.part.GestionModelosConsultasLinkDescriptor>();
		result.addAll(getIncomingTypeModelFacetLinks_Relacion_4001(
				modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<gestionmodelosconsultas.diagram_PROYECCION.part.GestionModelosConsultasLinkDescriptor> getInstanciaProceso_2024IncomingLinks(
			View view) {
		InstanciaProceso modelElement = (InstanciaProceso) view.getElement();
		Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences = EcoreUtil.CrossReferencer
				.find(view.eResource().getResourceSet().getResources());
		LinkedList<gestionmodelosconsultas.diagram_PROYECCION.part.GestionModelosConsultasLinkDescriptor> result = new LinkedList<gestionmodelosconsultas.diagram_PROYECCION.part.GestionModelosConsultasLinkDescriptor>();
		result.addAll(getIncomingTypeModelFacetLinks_Relacion_4001(
				modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<gestionmodelosconsultas.diagram_PROYECCION.part.GestionModelosConsultasLinkDescriptor> getQuien_2025IncomingLinks(
			View view) {
		Quien modelElement = (Quien) view.getElement();
		Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences = EcoreUtil.CrossReferencer
				.find(view.eResource().getResourceSet().getResources());
		LinkedList<gestionmodelosconsultas.diagram_PROYECCION.part.GestionModelosConsultasLinkDescriptor> result = new LinkedList<gestionmodelosconsultas.diagram_PROYECCION.part.GestionModelosConsultasLinkDescriptor>();
		result.addAll(getIncomingTypeModelFacetLinks_Relacion_4001(
				modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<gestionmodelosconsultas.diagram_PROYECCION.part.GestionModelosConsultasLinkDescriptor> getRol_2026IncomingLinks(
			View view) {
		Rol modelElement = (Rol) view.getElement();
		Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences = EcoreUtil.CrossReferencer
				.find(view.eResource().getResourceSet().getResources());
		LinkedList<gestionmodelosconsultas.diagram_PROYECCION.part.GestionModelosConsultasLinkDescriptor> result = new LinkedList<gestionmodelosconsultas.diagram_PROYECCION.part.GestionModelosConsultasLinkDescriptor>();
		result.addAll(getIncomingTypeModelFacetLinks_Relacion_4001(
				modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<gestionmodelosconsultas.diagram_PROYECCION.part.GestionModelosConsultasLinkDescriptor> getFecha_2027IncomingLinks(
			View view) {
		Fecha modelElement = (Fecha) view.getElement();
		Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences = EcoreUtil.CrossReferencer
				.find(view.eResource().getResourceSet().getResources());
		LinkedList<gestionmodelosconsultas.diagram_PROYECCION.part.GestionModelosConsultasLinkDescriptor> result = new LinkedList<gestionmodelosconsultas.diagram_PROYECCION.part.GestionModelosConsultasLinkDescriptor>();
		result.addAll(getIncomingTypeModelFacetLinks_Relacion_4001(
				modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<gestionmodelosconsultas.diagram_PROYECCION.part.GestionModelosConsultasLinkDescriptor> getCampo_3001IncomingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<gestionmodelosconsultas.diagram_PROYECCION.part.GestionModelosConsultasLinkDescriptor> getCampo_3002IncomingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<gestionmodelosconsultas.diagram_PROYECCION.part.GestionModelosConsultasLinkDescriptor> getCampo_3003IncomingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<gestionmodelosconsultas.diagram_PROYECCION.part.GestionModelosConsultasLinkDescriptor> getCampo_3004IncomingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<gestionmodelosconsultas.diagram_PROYECCION.part.GestionModelosConsultasLinkDescriptor> getCampo_3005IncomingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<gestionmodelosconsultas.diagram_PROYECCION.part.GestionModelosConsultasLinkDescriptor> getCampo_3006IncomingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<gestionmodelosconsultas.diagram_PROYECCION.part.GestionModelosConsultasLinkDescriptor> getCampo_3007IncomingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<gestionmodelosconsultas.diagram_PROYECCION.part.GestionModelosConsultasLinkDescriptor> getCampo_3008IncomingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<gestionmodelosconsultas.diagram_PROYECCION.part.GestionModelosConsultasLinkDescriptor> getCampo_3009IncomingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<gestionmodelosconsultas.diagram_PROYECCION.part.GestionModelosConsultasLinkDescriptor> getCampo_3010IncomingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<gestionmodelosconsultas.diagram_PROYECCION.part.GestionModelosConsultasLinkDescriptor> getCampo_3011IncomingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<gestionmodelosconsultas.diagram_PROYECCION.part.GestionModelosConsultasLinkDescriptor> getCampo_3012IncomingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<gestionmodelosconsultas.diagram_PROYECCION.part.GestionModelosConsultasLinkDescriptor> getRelacion_4001IncomingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<gestionmodelosconsultas.diagram_PROYECCION.part.GestionModelosConsultasLinkDescriptor> getUnidadOrganizacional_2015OutgoingLinks(
			View view) {
		UnidadOrganizacional modelElement = (UnidadOrganizacional) view
				.getElement();
		LinkedList<gestionmodelosconsultas.diagram_PROYECCION.part.GestionModelosConsultasLinkDescriptor> result = new LinkedList<gestionmodelosconsultas.diagram_PROYECCION.part.GestionModelosConsultasLinkDescriptor>();
		result.addAll(getOutgoingTypeModelFacetLinks_Relacion_4001(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<gestionmodelosconsultas.diagram_PROYECCION.part.GestionModelosConsultasLinkDescriptor> getDocumento_2016OutgoingLinks(
			View view) {
		Documento modelElement = (Documento) view.getElement();
		LinkedList<gestionmodelosconsultas.diagram_PROYECCION.part.GestionModelosConsultasLinkDescriptor> result = new LinkedList<gestionmodelosconsultas.diagram_PROYECCION.part.GestionModelosConsultasLinkDescriptor>();
		result.addAll(getOutgoingTypeModelFacetLinks_Relacion_4001(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<gestionmodelosconsultas.diagram_PROYECCION.part.GestionModelosConsultasLinkDescriptor> getActividad_2017OutgoingLinks(
			View view) {
		ActividadProceso modelElement = (ActividadProceso) view.getElement();
		LinkedList<gestionmodelosconsultas.diagram_PROYECCION.part.GestionModelosConsultasLinkDescriptor> result = new LinkedList<gestionmodelosconsultas.diagram_PROYECCION.part.GestionModelosConsultasLinkDescriptor>();
		result.addAll(getOutgoingTypeModelFacetLinks_Relacion_4001(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<gestionmodelosconsultas.diagram_PROYECCION.part.GestionModelosConsultasLinkDescriptor> getActor_2018OutgoingLinks(
			View view) {
		Actor modelElement = (Actor) view.getElement();
		LinkedList<gestionmodelosconsultas.diagram_PROYECCION.part.GestionModelosConsultasLinkDescriptor> result = new LinkedList<gestionmodelosconsultas.diagram_PROYECCION.part.GestionModelosConsultasLinkDescriptor>();
		result.addAll(getOutgoingTypeModelFacetLinks_Relacion_4001(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<gestionmodelosconsultas.diagram_PROYECCION.part.GestionModelosConsultasLinkDescriptor> getArmario_2019OutgoingLinks(
			View view) {
		Armario modelElement = (Armario) view.getElement();
		LinkedList<gestionmodelosconsultas.diagram_PROYECCION.part.GestionModelosConsultasLinkDescriptor> result = new LinkedList<gestionmodelosconsultas.diagram_PROYECCION.part.GestionModelosConsultasLinkDescriptor>();
		result.addAll(getOutgoingTypeModelFacetLinks_Relacion_4001(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<gestionmodelosconsultas.diagram_PROYECCION.part.GestionModelosConsultasLinkDescriptor> getComunicacion_2020OutgoingLinks(
			View view) {
		Comunicacion modelElement = (Comunicacion) view.getElement();
		LinkedList<gestionmodelosconsultas.diagram_PROYECCION.part.GestionModelosConsultasLinkDescriptor> result = new LinkedList<gestionmodelosconsultas.diagram_PROYECCION.part.GestionModelosConsultasLinkDescriptor>();
		result.addAll(getOutgoingTypeModelFacetLinks_Relacion_4001(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<gestionmodelosconsultas.diagram_PROYECCION.part.GestionModelosConsultasLinkDescriptor> getContacto_2021OutgoingLinks(
			View view) {
		Contacto modelElement = (Contacto) view.getElement();
		LinkedList<gestionmodelosconsultas.diagram_PROYECCION.part.GestionModelosConsultasLinkDescriptor> result = new LinkedList<gestionmodelosconsultas.diagram_PROYECCION.part.GestionModelosConsultasLinkDescriptor>();
		result.addAll(getOutgoingTypeModelFacetLinks_Relacion_4001(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<gestionmodelosconsultas.diagram_PROYECCION.part.GestionModelosConsultasLinkDescriptor> getDeposito_2022OutgoingLinks(
			View view) {
		Deposito modelElement = (Deposito) view.getElement();
		LinkedList<gestionmodelosconsultas.diagram_PROYECCION.part.GestionModelosConsultasLinkDescriptor> result = new LinkedList<gestionmodelosconsultas.diagram_PROYECCION.part.GestionModelosConsultasLinkDescriptor>();
		result.addAll(getOutgoingTypeModelFacetLinks_Relacion_4001(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<gestionmodelosconsultas.diagram_PROYECCION.part.GestionModelosConsultasLinkDescriptor> getDisco_2023OutgoingLinks(
			View view) {
		Disco modelElement = (Disco) view.getElement();
		LinkedList<gestionmodelosconsultas.diagram_PROYECCION.part.GestionModelosConsultasLinkDescriptor> result = new LinkedList<gestionmodelosconsultas.diagram_PROYECCION.part.GestionModelosConsultasLinkDescriptor>();
		result.addAll(getOutgoingTypeModelFacetLinks_Relacion_4001(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<gestionmodelosconsultas.diagram_PROYECCION.part.GestionModelosConsultasLinkDescriptor> getInstanciaProceso_2024OutgoingLinks(
			View view) {
		InstanciaProceso modelElement = (InstanciaProceso) view.getElement();
		LinkedList<gestionmodelosconsultas.diagram_PROYECCION.part.GestionModelosConsultasLinkDescriptor> result = new LinkedList<gestionmodelosconsultas.diagram_PROYECCION.part.GestionModelosConsultasLinkDescriptor>();
		result.addAll(getOutgoingTypeModelFacetLinks_Relacion_4001(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<gestionmodelosconsultas.diagram_PROYECCION.part.GestionModelosConsultasLinkDescriptor> getQuien_2025OutgoingLinks(
			View view) {
		Quien modelElement = (Quien) view.getElement();
		LinkedList<gestionmodelosconsultas.diagram_PROYECCION.part.GestionModelosConsultasLinkDescriptor> result = new LinkedList<gestionmodelosconsultas.diagram_PROYECCION.part.GestionModelosConsultasLinkDescriptor>();
		result.addAll(getOutgoingTypeModelFacetLinks_Relacion_4001(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<gestionmodelosconsultas.diagram_PROYECCION.part.GestionModelosConsultasLinkDescriptor> getRol_2026OutgoingLinks(
			View view) {
		Rol modelElement = (Rol) view.getElement();
		LinkedList<gestionmodelosconsultas.diagram_PROYECCION.part.GestionModelosConsultasLinkDescriptor> result = new LinkedList<gestionmodelosconsultas.diagram_PROYECCION.part.GestionModelosConsultasLinkDescriptor>();
		result.addAll(getOutgoingTypeModelFacetLinks_Relacion_4001(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<gestionmodelosconsultas.diagram_PROYECCION.part.GestionModelosConsultasLinkDescriptor> getFecha_2027OutgoingLinks(
			View view) {
		Fecha modelElement = (Fecha) view.getElement();
		LinkedList<gestionmodelosconsultas.diagram_PROYECCION.part.GestionModelosConsultasLinkDescriptor> result = new LinkedList<gestionmodelosconsultas.diagram_PROYECCION.part.GestionModelosConsultasLinkDescriptor>();
		result.addAll(getOutgoingTypeModelFacetLinks_Relacion_4001(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<gestionmodelosconsultas.diagram_PROYECCION.part.GestionModelosConsultasLinkDescriptor> getCampo_3001OutgoingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<gestionmodelosconsultas.diagram_PROYECCION.part.GestionModelosConsultasLinkDescriptor> getCampo_3002OutgoingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<gestionmodelosconsultas.diagram_PROYECCION.part.GestionModelosConsultasLinkDescriptor> getCampo_3003OutgoingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<gestionmodelosconsultas.diagram_PROYECCION.part.GestionModelosConsultasLinkDescriptor> getCampo_3004OutgoingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<gestionmodelosconsultas.diagram_PROYECCION.part.GestionModelosConsultasLinkDescriptor> getCampo_3005OutgoingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<gestionmodelosconsultas.diagram_PROYECCION.part.GestionModelosConsultasLinkDescriptor> getCampo_3006OutgoingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<gestionmodelosconsultas.diagram_PROYECCION.part.GestionModelosConsultasLinkDescriptor> getCampo_3007OutgoingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<gestionmodelosconsultas.diagram_PROYECCION.part.GestionModelosConsultasLinkDescriptor> getCampo_3008OutgoingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<gestionmodelosconsultas.diagram_PROYECCION.part.GestionModelosConsultasLinkDescriptor> getCampo_3009OutgoingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<gestionmodelosconsultas.diagram_PROYECCION.part.GestionModelosConsultasLinkDescriptor> getCampo_3010OutgoingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<gestionmodelosconsultas.diagram_PROYECCION.part.GestionModelosConsultasLinkDescriptor> getCampo_3011OutgoingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<gestionmodelosconsultas.diagram_PROYECCION.part.GestionModelosConsultasLinkDescriptor> getCampo_3012OutgoingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<gestionmodelosconsultas.diagram_PROYECCION.part.GestionModelosConsultasLinkDescriptor> getRelacion_4001OutgoingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	private static Collection<gestionmodelosconsultas.diagram_PROYECCION.part.GestionModelosConsultasLinkDescriptor> getContainedTypeModelFacetLinks_Relacion_4001(
			EADiagram container) {
		LinkedList<gestionmodelosconsultas.diagram_PROYECCION.part.GestionModelosConsultasLinkDescriptor> result = new LinkedList<gestionmodelosconsultas.diagram_PROYECCION.part.GestionModelosConsultasLinkDescriptor>();
		for (Iterator<?> links = container.getListRelacion().iterator(); links
				.hasNext();) {
			EObject linkObject = (EObject) links.next();
			if (false == linkObject instanceof Relacion) {
				continue;
			}
			Relacion link = (Relacion) linkObject;
			if (gestionmodelosconsultas.diagram_PROYECCION.edit.parts.RelacionEditPart.VISUAL_ID != gestionmodelosconsultas.diagram_PROYECCION.part.GestionModelosConsultasVisualIDRegistry
					.getLinkWithClassVisualID(link)) {
				continue;
			}
			ElementoConsulta dst = link.getTarget();
			ElementoConsulta src = link.getSource();
			result.add(new gestionmodelosconsultas.diagram_PROYECCION.part.GestionModelosConsultasLinkDescriptor(
					src,
					dst,
					link,
					gestionmodelosconsultas.diagram_PROYECCION.providers.GestionModelosConsultasElementTypes.Relacion_4001,
					gestionmodelosconsultas.diagram_PROYECCION.edit.parts.RelacionEditPart.VISUAL_ID));
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection<gestionmodelosconsultas.diagram_PROYECCION.part.GestionModelosConsultasLinkDescriptor> getIncomingTypeModelFacetLinks_Relacion_4001(
			ElementoConsulta target,
			Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences) {
		LinkedList<gestionmodelosconsultas.diagram_PROYECCION.part.GestionModelosConsultasLinkDescriptor> result = new LinkedList<gestionmodelosconsultas.diagram_PROYECCION.part.GestionModelosConsultasLinkDescriptor>();
		Collection<EStructuralFeature.Setting> settings = crossReferences
				.get(target);
		for (EStructuralFeature.Setting setting : settings) {
			if (setting.getEStructuralFeature() != ModelPackage.eINSTANCE
					.getRelacion_Target()
					|| false == setting.getEObject() instanceof Relacion) {
				continue;
			}
			Relacion link = (Relacion) setting.getEObject();
			if (gestionmodelosconsultas.diagram_PROYECCION.edit.parts.RelacionEditPart.VISUAL_ID != gestionmodelosconsultas.diagram_PROYECCION.part.GestionModelosConsultasVisualIDRegistry
					.getLinkWithClassVisualID(link)) {
				continue;
			}
			ElementoConsulta src = link.getSource();
			result.add(new gestionmodelosconsultas.diagram_PROYECCION.part.GestionModelosConsultasLinkDescriptor(
					src,
					target,
					link,
					gestionmodelosconsultas.diagram_PROYECCION.providers.GestionModelosConsultasElementTypes.Relacion_4001,
					gestionmodelosconsultas.diagram_PROYECCION.edit.parts.RelacionEditPart.VISUAL_ID));
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection<gestionmodelosconsultas.diagram_PROYECCION.part.GestionModelosConsultasLinkDescriptor> getOutgoingTypeModelFacetLinks_Relacion_4001(
			ElementoConsulta source) {
		EADiagram container = null;
		// Find container element for the link.
		// Climb up by containment hierarchy starting from the source
		// and return the first element that is instance of the container class.
		for (EObject element = source; element != null && container == null; element = element
				.eContainer()) {
			if (element instanceof EADiagram) {
				container = (EADiagram) element;
			}
		}
		if (container == null) {
			return Collections.emptyList();
		}
		LinkedList<gestionmodelosconsultas.diagram_PROYECCION.part.GestionModelosConsultasLinkDescriptor> result = new LinkedList<gestionmodelosconsultas.diagram_PROYECCION.part.GestionModelosConsultasLinkDescriptor>();
		for (Iterator<?> links = container.getListRelacion().iterator(); links
				.hasNext();) {
			EObject linkObject = (EObject) links.next();
			if (false == linkObject instanceof Relacion) {
				continue;
			}
			Relacion link = (Relacion) linkObject;
			if (gestionmodelosconsultas.diagram_PROYECCION.edit.parts.RelacionEditPart.VISUAL_ID != gestionmodelosconsultas.diagram_PROYECCION.part.GestionModelosConsultasVisualIDRegistry
					.getLinkWithClassVisualID(link)) {
				continue;
			}
			ElementoConsulta dst = link.getTarget();
			ElementoConsulta src = link.getSource();
			if (src != source) {
				continue;
			}
			result.add(new gestionmodelosconsultas.diagram_PROYECCION.part.GestionModelosConsultasLinkDescriptor(
					src,
					dst,
					link,
					gestionmodelosconsultas.diagram_PROYECCION.providers.GestionModelosConsultasElementTypes.Relacion_4001,
					gestionmodelosconsultas.diagram_PROYECCION.edit.parts.RelacionEditPart.VISUAL_ID));
		}
		return result;
	}

	/**
	 * @generated
	 */
	public static final DiagramUpdater TYPED_INSTANCE = new DiagramUpdater() {
		/**
		 * @generated
		 */

		public List<gestionmodelosconsultas.diagram_PROYECCION.part.GestionModelosConsultasNodeDescriptor> getSemanticChildren(
				View view) {
			return GestionModelosConsultasDiagramUpdater
					.getSemanticChildren(view);
		}

		/**
		 * @generated
		 */

		public List<gestionmodelosconsultas.diagram_PROYECCION.part.GestionModelosConsultasLinkDescriptor> getContainedLinks(
				View view) {
			return GestionModelosConsultasDiagramUpdater
					.getContainedLinks(view);
		}

		/**
		 * @generated
		 */

		public List<gestionmodelosconsultas.diagram_PROYECCION.part.GestionModelosConsultasLinkDescriptor> getIncomingLinks(
				View view) {
			return GestionModelosConsultasDiagramUpdater.getIncomingLinks(view);
		}

		/**
		 * @generated
		 */

		public List<gestionmodelosconsultas.diagram_PROYECCION.part.GestionModelosConsultasLinkDescriptor> getOutgoingLinks(
				View view) {
			return GestionModelosConsultasDiagramUpdater.getOutgoingLinks(view);
		}
	};

}
