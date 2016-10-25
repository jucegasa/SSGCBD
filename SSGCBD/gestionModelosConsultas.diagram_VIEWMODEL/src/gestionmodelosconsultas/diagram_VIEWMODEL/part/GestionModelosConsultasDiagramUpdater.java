package gestionmodelosconsultas.diagram_VIEWMODEL.part;

import gestionmodelosconsultas.modeloconsultas.como.ActividadProceso;
import gestionmodelosconsultas.modeloconsultas.como.InstanciaProceso;
import gestionmodelosconsultas.modeloconsultas.cuando.Fecha;
import gestionmodelosconsultas.modeloconsultas.donde.Armario;
import gestionmodelosconsultas.modeloconsultas.donde.Deposito;
import gestionmodelosconsultas.modeloconsultas.donde.Disco;
import gestionmodelosconsultas.modeloconsultas.model.EADiagram;
import gestionmodelosconsultas.modeloconsultas.model.ElementoConsulta;
import gestionmodelosconsultas.modeloconsultas.model.ModelPackage;
import gestionmodelosconsultas.modeloconsultas.model.Relacion;
import gestionmodelosconsultas.modeloconsultas.model.ViewModel;
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
	public static List<gestionmodelosconsultas.diagram_VIEWMODEL.part.GestionModelosConsultasNodeDescriptor> getSemanticChildren(
			View view) {
		switch (gestionmodelosconsultas.diagram_VIEWMODEL.part.GestionModelosConsultasVisualIDRegistry
				.getVisualID(view)) {
		case gestionmodelosconsultas.diagram_VIEWMODEL.edit.parts.ViewModelEditPart.VISUAL_ID:
			return getViewModel_1000SemanticChildren(view);
		}
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<gestionmodelosconsultas.diagram_VIEWMODEL.part.GestionModelosConsultasNodeDescriptor> getViewModel_1000SemanticChildren(
			View view) {
		if (!view.isSetElement()) {
			return Collections.emptyList();
		}
		ViewModel modelElement = (ViewModel) view.getElement();
		LinkedList<gestionmodelosconsultas.diagram_VIEWMODEL.part.GestionModelosConsultasNodeDescriptor> result = new LinkedList<gestionmodelosconsultas.diagram_VIEWMODEL.part.GestionModelosConsultasNodeDescriptor>();
		for (Iterator<?> it = modelElement.getListElementoConsulta().iterator(); it
				.hasNext();) {
			ElementoConsulta childElement = (ElementoConsulta) it.next();
			int visualID = gestionmodelosconsultas.diagram_VIEWMODEL.part.GestionModelosConsultasVisualIDRegistry
					.getNodeVisualID(view, childElement);
			if (visualID == gestionmodelosconsultas.diagram_VIEWMODEL.edit.parts.UnidadOrganizacionalEditPart.VISUAL_ID) {
				result.add(new gestionmodelosconsultas.diagram_VIEWMODEL.part.GestionModelosConsultasNodeDescriptor(
						childElement, visualID));
				continue;
			}
			if (visualID == gestionmodelosconsultas.diagram_VIEWMODEL.edit.parts.DocumentoEditPart.VISUAL_ID) {
				result.add(new gestionmodelosconsultas.diagram_VIEWMODEL.part.GestionModelosConsultasNodeDescriptor(
						childElement, visualID));
				continue;
			}
			if (visualID == gestionmodelosconsultas.diagram_VIEWMODEL.edit.parts.ActividadEditPart.VISUAL_ID) {
				result.add(new gestionmodelosconsultas.diagram_VIEWMODEL.part.GestionModelosConsultasNodeDescriptor(
						childElement, visualID));
				continue;
			}
			if (visualID == gestionmodelosconsultas.diagram_VIEWMODEL.edit.parts.ActorEditPart.VISUAL_ID) {
				result.add(new gestionmodelosconsultas.diagram_VIEWMODEL.part.GestionModelosConsultasNodeDescriptor(
						childElement, visualID));
				continue;
			}
			if (visualID == gestionmodelosconsultas.diagram_VIEWMODEL.edit.parts.ArmarioEditPart.VISUAL_ID) {
				result.add(new gestionmodelosconsultas.diagram_VIEWMODEL.part.GestionModelosConsultasNodeDescriptor(
						childElement, visualID));
				continue;
			}
			if (visualID == gestionmodelosconsultas.diagram_VIEWMODEL.edit.parts.ComunicacionEditPart.VISUAL_ID) {
				result.add(new gestionmodelosconsultas.diagram_VIEWMODEL.part.GestionModelosConsultasNodeDescriptor(
						childElement, visualID));
				continue;
			}
			if (visualID == gestionmodelosconsultas.diagram_VIEWMODEL.edit.parts.ContactoEditPart.VISUAL_ID) {
				result.add(new gestionmodelosconsultas.diagram_VIEWMODEL.part.GestionModelosConsultasNodeDescriptor(
						childElement, visualID));
				continue;
			}
			if (visualID == gestionmodelosconsultas.diagram_VIEWMODEL.edit.parts.DepositoEditPart.VISUAL_ID) {
				result.add(new gestionmodelosconsultas.diagram_VIEWMODEL.part.GestionModelosConsultasNodeDescriptor(
						childElement, visualID));
				continue;
			}
			if (visualID == gestionmodelosconsultas.diagram_VIEWMODEL.edit.parts.DiscoEditPart.VISUAL_ID) {
				result.add(new gestionmodelosconsultas.diagram_VIEWMODEL.part.GestionModelosConsultasNodeDescriptor(
						childElement, visualID));
				continue;
			}
			if (visualID == gestionmodelosconsultas.diagram_VIEWMODEL.edit.parts.InstanciaProcesoEditPart.VISUAL_ID) {
				result.add(new gestionmodelosconsultas.diagram_VIEWMODEL.part.GestionModelosConsultasNodeDescriptor(
						childElement, visualID));
				continue;
			}
			if (visualID == gestionmodelosconsultas.diagram_VIEWMODEL.edit.parts.QuienEditPart.VISUAL_ID) {
				result.add(new gestionmodelosconsultas.diagram_VIEWMODEL.part.GestionModelosConsultasNodeDescriptor(
						childElement, visualID));
				continue;
			}
			if (visualID == gestionmodelosconsultas.diagram_VIEWMODEL.edit.parts.RolEditPart.VISUAL_ID) {
				result.add(new gestionmodelosconsultas.diagram_VIEWMODEL.part.GestionModelosConsultasNodeDescriptor(
						childElement, visualID));
				continue;
			}
			if (visualID == gestionmodelosconsultas.diagram_VIEWMODEL.edit.parts.FechaEditPart.VISUAL_ID) {
				result.add(new gestionmodelosconsultas.diagram_VIEWMODEL.part.GestionModelosConsultasNodeDescriptor(
						childElement, visualID));
				continue;
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	public static List<gestionmodelosconsultas.diagram_VIEWMODEL.part.GestionModelosConsultasLinkDescriptor> getContainedLinks(
			View view) {
		switch (gestionmodelosconsultas.diagram_VIEWMODEL.part.GestionModelosConsultasVisualIDRegistry
				.getVisualID(view)) {
		case gestionmodelosconsultas.diagram_VIEWMODEL.edit.parts.ViewModelEditPart.VISUAL_ID:
			return getViewModel_1000ContainedLinks(view);
		case gestionmodelosconsultas.diagram_VIEWMODEL.edit.parts.UnidadOrganizacionalEditPart.VISUAL_ID:
			return getUnidadOrganizacional_2015ContainedLinks(view);
		case gestionmodelosconsultas.diagram_VIEWMODEL.edit.parts.DocumentoEditPart.VISUAL_ID:
			return getDocumento_2016ContainedLinks(view);
		case gestionmodelosconsultas.diagram_VIEWMODEL.edit.parts.ActividadEditPart.VISUAL_ID:
			return getActividad_2017ContainedLinks(view);
		case gestionmodelosconsultas.diagram_VIEWMODEL.edit.parts.ActorEditPart.VISUAL_ID:
			return getActor_2018ContainedLinks(view);
		case gestionmodelosconsultas.diagram_VIEWMODEL.edit.parts.ArmarioEditPart.VISUAL_ID:
			return getArmario_2019ContainedLinks(view);
		case gestionmodelosconsultas.diagram_VIEWMODEL.edit.parts.ComunicacionEditPart.VISUAL_ID:
			return getComunicacion_2020ContainedLinks(view);
		case gestionmodelosconsultas.diagram_VIEWMODEL.edit.parts.ContactoEditPart.VISUAL_ID:
			return getContacto_2021ContainedLinks(view);
		case gestionmodelosconsultas.diagram_VIEWMODEL.edit.parts.DepositoEditPart.VISUAL_ID:
			return getDeposito_2022ContainedLinks(view);
		case gestionmodelosconsultas.diagram_VIEWMODEL.edit.parts.DiscoEditPart.VISUAL_ID:
			return getDisco_2023ContainedLinks(view);
		case gestionmodelosconsultas.diagram_VIEWMODEL.edit.parts.InstanciaProcesoEditPart.VISUAL_ID:
			return getInstanciaProceso_2024ContainedLinks(view);
		case gestionmodelosconsultas.diagram_VIEWMODEL.edit.parts.QuienEditPart.VISUAL_ID:
			return getQuien_2025ContainedLinks(view);
		case gestionmodelosconsultas.diagram_VIEWMODEL.edit.parts.RolEditPart.VISUAL_ID:
			return getRol_2026ContainedLinks(view);
		case gestionmodelosconsultas.diagram_VIEWMODEL.edit.parts.FechaEditPart.VISUAL_ID:
			return getFecha_2027ContainedLinks(view);
		case gestionmodelosconsultas.diagram_VIEWMODEL.edit.parts.RelacionEditPart.VISUAL_ID:
			return getRelacion_4001ContainedLinks(view);
		}
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<gestionmodelosconsultas.diagram_VIEWMODEL.part.GestionModelosConsultasLinkDescriptor> getIncomingLinks(
			View view) {
		switch (gestionmodelosconsultas.diagram_VIEWMODEL.part.GestionModelosConsultasVisualIDRegistry
				.getVisualID(view)) {
		case gestionmodelosconsultas.diagram_VIEWMODEL.edit.parts.UnidadOrganizacionalEditPart.VISUAL_ID:
			return getUnidadOrganizacional_2015IncomingLinks(view);
		case gestionmodelosconsultas.diagram_VIEWMODEL.edit.parts.DocumentoEditPart.VISUAL_ID:
			return getDocumento_2016IncomingLinks(view);
		case gestionmodelosconsultas.diagram_VIEWMODEL.edit.parts.ActividadEditPart.VISUAL_ID:
			return getActividad_2017IncomingLinks(view);
		case gestionmodelosconsultas.diagram_VIEWMODEL.edit.parts.ActorEditPart.VISUAL_ID:
			return getActor_2018IncomingLinks(view);
		case gestionmodelosconsultas.diagram_VIEWMODEL.edit.parts.ArmarioEditPart.VISUAL_ID:
			return getArmario_2019IncomingLinks(view);
		case gestionmodelosconsultas.diagram_VIEWMODEL.edit.parts.ComunicacionEditPart.VISUAL_ID:
			return getComunicacion_2020IncomingLinks(view);
		case gestionmodelosconsultas.diagram_VIEWMODEL.edit.parts.ContactoEditPart.VISUAL_ID:
			return getContacto_2021IncomingLinks(view);
		case gestionmodelosconsultas.diagram_VIEWMODEL.edit.parts.DepositoEditPart.VISUAL_ID:
			return getDeposito_2022IncomingLinks(view);
		case gestionmodelosconsultas.diagram_VIEWMODEL.edit.parts.DiscoEditPart.VISUAL_ID:
			return getDisco_2023IncomingLinks(view);
		case gestionmodelosconsultas.diagram_VIEWMODEL.edit.parts.InstanciaProcesoEditPart.VISUAL_ID:
			return getInstanciaProceso_2024IncomingLinks(view);
		case gestionmodelosconsultas.diagram_VIEWMODEL.edit.parts.QuienEditPart.VISUAL_ID:
			return getQuien_2025IncomingLinks(view);
		case gestionmodelosconsultas.diagram_VIEWMODEL.edit.parts.RolEditPart.VISUAL_ID:
			return getRol_2026IncomingLinks(view);
		case gestionmodelosconsultas.diagram_VIEWMODEL.edit.parts.FechaEditPart.VISUAL_ID:
			return getFecha_2027IncomingLinks(view);
		case gestionmodelosconsultas.diagram_VIEWMODEL.edit.parts.RelacionEditPart.VISUAL_ID:
			return getRelacion_4001IncomingLinks(view);
		}
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<gestionmodelosconsultas.diagram_VIEWMODEL.part.GestionModelosConsultasLinkDescriptor> getOutgoingLinks(
			View view) {
		switch (gestionmodelosconsultas.diagram_VIEWMODEL.part.GestionModelosConsultasVisualIDRegistry
				.getVisualID(view)) {
		case gestionmodelosconsultas.diagram_VIEWMODEL.edit.parts.UnidadOrganizacionalEditPart.VISUAL_ID:
			return getUnidadOrganizacional_2015OutgoingLinks(view);
		case gestionmodelosconsultas.diagram_VIEWMODEL.edit.parts.DocumentoEditPart.VISUAL_ID:
			return getDocumento_2016OutgoingLinks(view);
		case gestionmodelosconsultas.diagram_VIEWMODEL.edit.parts.ActividadEditPart.VISUAL_ID:
			return getActividad_2017OutgoingLinks(view);
		case gestionmodelosconsultas.diagram_VIEWMODEL.edit.parts.ActorEditPart.VISUAL_ID:
			return getActor_2018OutgoingLinks(view);
		case gestionmodelosconsultas.diagram_VIEWMODEL.edit.parts.ArmarioEditPart.VISUAL_ID:
			return getArmario_2019OutgoingLinks(view);
		case gestionmodelosconsultas.diagram_VIEWMODEL.edit.parts.ComunicacionEditPart.VISUAL_ID:
			return getComunicacion_2020OutgoingLinks(view);
		case gestionmodelosconsultas.diagram_VIEWMODEL.edit.parts.ContactoEditPart.VISUAL_ID:
			return getContacto_2021OutgoingLinks(view);
		case gestionmodelosconsultas.diagram_VIEWMODEL.edit.parts.DepositoEditPart.VISUAL_ID:
			return getDeposito_2022OutgoingLinks(view);
		case gestionmodelosconsultas.diagram_VIEWMODEL.edit.parts.DiscoEditPart.VISUAL_ID:
			return getDisco_2023OutgoingLinks(view);
		case gestionmodelosconsultas.diagram_VIEWMODEL.edit.parts.InstanciaProcesoEditPart.VISUAL_ID:
			return getInstanciaProceso_2024OutgoingLinks(view);
		case gestionmodelosconsultas.diagram_VIEWMODEL.edit.parts.QuienEditPart.VISUAL_ID:
			return getQuien_2025OutgoingLinks(view);
		case gestionmodelosconsultas.diagram_VIEWMODEL.edit.parts.RolEditPart.VISUAL_ID:
			return getRol_2026OutgoingLinks(view);
		case gestionmodelosconsultas.diagram_VIEWMODEL.edit.parts.FechaEditPart.VISUAL_ID:
			return getFecha_2027OutgoingLinks(view);
		case gestionmodelosconsultas.diagram_VIEWMODEL.edit.parts.RelacionEditPart.VISUAL_ID:
			return getRelacion_4001OutgoingLinks(view);
		}
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<gestionmodelosconsultas.diagram_VIEWMODEL.part.GestionModelosConsultasLinkDescriptor> getViewModel_1000ContainedLinks(
			View view) {
		ViewModel modelElement = (ViewModel) view.getElement();
		LinkedList<gestionmodelosconsultas.diagram_VIEWMODEL.part.GestionModelosConsultasLinkDescriptor> result = new LinkedList<gestionmodelosconsultas.diagram_VIEWMODEL.part.GestionModelosConsultasLinkDescriptor>();
		result.addAll(getContainedTypeModelFacetLinks_Relacion_4001(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<gestionmodelosconsultas.diagram_VIEWMODEL.part.GestionModelosConsultasLinkDescriptor> getUnidadOrganizacional_2015ContainedLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<gestionmodelosconsultas.diagram_VIEWMODEL.part.GestionModelosConsultasLinkDescriptor> getDocumento_2016ContainedLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<gestionmodelosconsultas.diagram_VIEWMODEL.part.GestionModelosConsultasLinkDescriptor> getActividad_2017ContainedLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<gestionmodelosconsultas.diagram_VIEWMODEL.part.GestionModelosConsultasLinkDescriptor> getActor_2018ContainedLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<gestionmodelosconsultas.diagram_VIEWMODEL.part.GestionModelosConsultasLinkDescriptor> getArmario_2019ContainedLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<gestionmodelosconsultas.diagram_VIEWMODEL.part.GestionModelosConsultasLinkDescriptor> getComunicacion_2020ContainedLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<gestionmodelosconsultas.diagram_VIEWMODEL.part.GestionModelosConsultasLinkDescriptor> getContacto_2021ContainedLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<gestionmodelosconsultas.diagram_VIEWMODEL.part.GestionModelosConsultasLinkDescriptor> getDeposito_2022ContainedLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<gestionmodelosconsultas.diagram_VIEWMODEL.part.GestionModelosConsultasLinkDescriptor> getDisco_2023ContainedLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<gestionmodelosconsultas.diagram_VIEWMODEL.part.GestionModelosConsultasLinkDescriptor> getInstanciaProceso_2024ContainedLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<gestionmodelosconsultas.diagram_VIEWMODEL.part.GestionModelosConsultasLinkDescriptor> getQuien_2025ContainedLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<gestionmodelosconsultas.diagram_VIEWMODEL.part.GestionModelosConsultasLinkDescriptor> getRol_2026ContainedLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<gestionmodelosconsultas.diagram_VIEWMODEL.part.GestionModelosConsultasLinkDescriptor> getFecha_2027ContainedLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<gestionmodelosconsultas.diagram_VIEWMODEL.part.GestionModelosConsultasLinkDescriptor> getRelacion_4001ContainedLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<gestionmodelosconsultas.diagram_VIEWMODEL.part.GestionModelosConsultasLinkDescriptor> getUnidadOrganizacional_2015IncomingLinks(
			View view) {
		UnidadOrganizacional modelElement = (UnidadOrganizacional) view
				.getElement();
		Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences = EcoreUtil.CrossReferencer
				.find(view.eResource().getResourceSet().getResources());
		LinkedList<gestionmodelosconsultas.diagram_VIEWMODEL.part.GestionModelosConsultasLinkDescriptor> result = new LinkedList<gestionmodelosconsultas.diagram_VIEWMODEL.part.GestionModelosConsultasLinkDescriptor>();
		result.addAll(getIncomingTypeModelFacetLinks_Relacion_4001(
				modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<gestionmodelosconsultas.diagram_VIEWMODEL.part.GestionModelosConsultasLinkDescriptor> getDocumento_2016IncomingLinks(
			View view) {
		Documento modelElement = (Documento) view.getElement();
		Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences = EcoreUtil.CrossReferencer
				.find(view.eResource().getResourceSet().getResources());
		LinkedList<gestionmodelosconsultas.diagram_VIEWMODEL.part.GestionModelosConsultasLinkDescriptor> result = new LinkedList<gestionmodelosconsultas.diagram_VIEWMODEL.part.GestionModelosConsultasLinkDescriptor>();
		result.addAll(getIncomingTypeModelFacetLinks_Relacion_4001(
				modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<gestionmodelosconsultas.diagram_VIEWMODEL.part.GestionModelosConsultasLinkDescriptor> getActividad_2017IncomingLinks(
			View view) {
		ActividadProceso modelElement = (ActividadProceso) view.getElement();
		Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences = EcoreUtil.CrossReferencer
				.find(view.eResource().getResourceSet().getResources());
		LinkedList<gestionmodelosconsultas.diagram_VIEWMODEL.part.GestionModelosConsultasLinkDescriptor> result = new LinkedList<gestionmodelosconsultas.diagram_VIEWMODEL.part.GestionModelosConsultasLinkDescriptor>();
		result.addAll(getIncomingTypeModelFacetLinks_Relacion_4001(
				modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<gestionmodelosconsultas.diagram_VIEWMODEL.part.GestionModelosConsultasLinkDescriptor> getActor_2018IncomingLinks(
			View view) {
		Actor modelElement = (Actor) view.getElement();
		Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences = EcoreUtil.CrossReferencer
				.find(view.eResource().getResourceSet().getResources());
		LinkedList<gestionmodelosconsultas.diagram_VIEWMODEL.part.GestionModelosConsultasLinkDescriptor> result = new LinkedList<gestionmodelosconsultas.diagram_VIEWMODEL.part.GestionModelosConsultasLinkDescriptor>();
		result.addAll(getIncomingTypeModelFacetLinks_Relacion_4001(
				modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<gestionmodelosconsultas.diagram_VIEWMODEL.part.GestionModelosConsultasLinkDescriptor> getArmario_2019IncomingLinks(
			View view) {
		Armario modelElement = (Armario) view.getElement();
		Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences = EcoreUtil.CrossReferencer
				.find(view.eResource().getResourceSet().getResources());
		LinkedList<gestionmodelosconsultas.diagram_VIEWMODEL.part.GestionModelosConsultasLinkDescriptor> result = new LinkedList<gestionmodelosconsultas.diagram_VIEWMODEL.part.GestionModelosConsultasLinkDescriptor>();
		result.addAll(getIncomingTypeModelFacetLinks_Relacion_4001(
				modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<gestionmodelosconsultas.diagram_VIEWMODEL.part.GestionModelosConsultasLinkDescriptor> getComunicacion_2020IncomingLinks(
			View view) {
		Comunicacion modelElement = (Comunicacion) view.getElement();
		Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences = EcoreUtil.CrossReferencer
				.find(view.eResource().getResourceSet().getResources());
		LinkedList<gestionmodelosconsultas.diagram_VIEWMODEL.part.GestionModelosConsultasLinkDescriptor> result = new LinkedList<gestionmodelosconsultas.diagram_VIEWMODEL.part.GestionModelosConsultasLinkDescriptor>();
		result.addAll(getIncomingTypeModelFacetLinks_Relacion_4001(
				modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<gestionmodelosconsultas.diagram_VIEWMODEL.part.GestionModelosConsultasLinkDescriptor> getContacto_2021IncomingLinks(
			View view) {
		Contacto modelElement = (Contacto) view.getElement();
		Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences = EcoreUtil.CrossReferencer
				.find(view.eResource().getResourceSet().getResources());
		LinkedList<gestionmodelosconsultas.diagram_VIEWMODEL.part.GestionModelosConsultasLinkDescriptor> result = new LinkedList<gestionmodelosconsultas.diagram_VIEWMODEL.part.GestionModelosConsultasLinkDescriptor>();
		result.addAll(getIncomingTypeModelFacetLinks_Relacion_4001(
				modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<gestionmodelosconsultas.diagram_VIEWMODEL.part.GestionModelosConsultasLinkDescriptor> getDeposito_2022IncomingLinks(
			View view) {
		Deposito modelElement = (Deposito) view.getElement();
		Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences = EcoreUtil.CrossReferencer
				.find(view.eResource().getResourceSet().getResources());
		LinkedList<gestionmodelosconsultas.diagram_VIEWMODEL.part.GestionModelosConsultasLinkDescriptor> result = new LinkedList<gestionmodelosconsultas.diagram_VIEWMODEL.part.GestionModelosConsultasLinkDescriptor>();
		result.addAll(getIncomingTypeModelFacetLinks_Relacion_4001(
				modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<gestionmodelosconsultas.diagram_VIEWMODEL.part.GestionModelosConsultasLinkDescriptor> getDisco_2023IncomingLinks(
			View view) {
		Disco modelElement = (Disco) view.getElement();
		Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences = EcoreUtil.CrossReferencer
				.find(view.eResource().getResourceSet().getResources());
		LinkedList<gestionmodelosconsultas.diagram_VIEWMODEL.part.GestionModelosConsultasLinkDescriptor> result = new LinkedList<gestionmodelosconsultas.diagram_VIEWMODEL.part.GestionModelosConsultasLinkDescriptor>();
		result.addAll(getIncomingTypeModelFacetLinks_Relacion_4001(
				modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<gestionmodelosconsultas.diagram_VIEWMODEL.part.GestionModelosConsultasLinkDescriptor> getInstanciaProceso_2024IncomingLinks(
			View view) {
		InstanciaProceso modelElement = (InstanciaProceso) view.getElement();
		Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences = EcoreUtil.CrossReferencer
				.find(view.eResource().getResourceSet().getResources());
		LinkedList<gestionmodelosconsultas.diagram_VIEWMODEL.part.GestionModelosConsultasLinkDescriptor> result = new LinkedList<gestionmodelosconsultas.diagram_VIEWMODEL.part.GestionModelosConsultasLinkDescriptor>();
		result.addAll(getIncomingTypeModelFacetLinks_Relacion_4001(
				modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<gestionmodelosconsultas.diagram_VIEWMODEL.part.GestionModelosConsultasLinkDescriptor> getQuien_2025IncomingLinks(
			View view) {
		Quien modelElement = (Quien) view.getElement();
		Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences = EcoreUtil.CrossReferencer
				.find(view.eResource().getResourceSet().getResources());
		LinkedList<gestionmodelosconsultas.diagram_VIEWMODEL.part.GestionModelosConsultasLinkDescriptor> result = new LinkedList<gestionmodelosconsultas.diagram_VIEWMODEL.part.GestionModelosConsultasLinkDescriptor>();
		result.addAll(getIncomingTypeModelFacetLinks_Relacion_4001(
				modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<gestionmodelosconsultas.diagram_VIEWMODEL.part.GestionModelosConsultasLinkDescriptor> getRol_2026IncomingLinks(
			View view) {
		Rol modelElement = (Rol) view.getElement();
		Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences = EcoreUtil.CrossReferencer
				.find(view.eResource().getResourceSet().getResources());
		LinkedList<gestionmodelosconsultas.diagram_VIEWMODEL.part.GestionModelosConsultasLinkDescriptor> result = new LinkedList<gestionmodelosconsultas.diagram_VIEWMODEL.part.GestionModelosConsultasLinkDescriptor>();
		result.addAll(getIncomingTypeModelFacetLinks_Relacion_4001(
				modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<gestionmodelosconsultas.diagram_VIEWMODEL.part.GestionModelosConsultasLinkDescriptor> getFecha_2027IncomingLinks(
			View view) {
		Fecha modelElement = (Fecha) view.getElement();
		Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences = EcoreUtil.CrossReferencer
				.find(view.eResource().getResourceSet().getResources());
		LinkedList<gestionmodelosconsultas.diagram_VIEWMODEL.part.GestionModelosConsultasLinkDescriptor> result = new LinkedList<gestionmodelosconsultas.diagram_VIEWMODEL.part.GestionModelosConsultasLinkDescriptor>();
		result.addAll(getIncomingTypeModelFacetLinks_Relacion_4001(
				modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<gestionmodelosconsultas.diagram_VIEWMODEL.part.GestionModelosConsultasLinkDescriptor> getRelacion_4001IncomingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<gestionmodelosconsultas.diagram_VIEWMODEL.part.GestionModelosConsultasLinkDescriptor> getUnidadOrganizacional_2015OutgoingLinks(
			View view) {
		UnidadOrganizacional modelElement = (UnidadOrganizacional) view
				.getElement();
		LinkedList<gestionmodelosconsultas.diagram_VIEWMODEL.part.GestionModelosConsultasLinkDescriptor> result = new LinkedList<gestionmodelosconsultas.diagram_VIEWMODEL.part.GestionModelosConsultasLinkDescriptor>();
		result.addAll(getOutgoingTypeModelFacetLinks_Relacion_4001(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<gestionmodelosconsultas.diagram_VIEWMODEL.part.GestionModelosConsultasLinkDescriptor> getDocumento_2016OutgoingLinks(
			View view) {
		Documento modelElement = (Documento) view.getElement();
		LinkedList<gestionmodelosconsultas.diagram_VIEWMODEL.part.GestionModelosConsultasLinkDescriptor> result = new LinkedList<gestionmodelosconsultas.diagram_VIEWMODEL.part.GestionModelosConsultasLinkDescriptor>();
		result.addAll(getOutgoingTypeModelFacetLinks_Relacion_4001(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<gestionmodelosconsultas.diagram_VIEWMODEL.part.GestionModelosConsultasLinkDescriptor> getActividad_2017OutgoingLinks(
			View view) {
		ActividadProceso modelElement = (ActividadProceso) view.getElement();
		LinkedList<gestionmodelosconsultas.diagram_VIEWMODEL.part.GestionModelosConsultasLinkDescriptor> result = new LinkedList<gestionmodelosconsultas.diagram_VIEWMODEL.part.GestionModelosConsultasLinkDescriptor>();
		result.addAll(getOutgoingTypeModelFacetLinks_Relacion_4001(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<gestionmodelosconsultas.diagram_VIEWMODEL.part.GestionModelosConsultasLinkDescriptor> getActor_2018OutgoingLinks(
			View view) {
		Actor modelElement = (Actor) view.getElement();
		LinkedList<gestionmodelosconsultas.diagram_VIEWMODEL.part.GestionModelosConsultasLinkDescriptor> result = new LinkedList<gestionmodelosconsultas.diagram_VIEWMODEL.part.GestionModelosConsultasLinkDescriptor>();
		result.addAll(getOutgoingTypeModelFacetLinks_Relacion_4001(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<gestionmodelosconsultas.diagram_VIEWMODEL.part.GestionModelosConsultasLinkDescriptor> getArmario_2019OutgoingLinks(
			View view) {
		Armario modelElement = (Armario) view.getElement();
		LinkedList<gestionmodelosconsultas.diagram_VIEWMODEL.part.GestionModelosConsultasLinkDescriptor> result = new LinkedList<gestionmodelosconsultas.diagram_VIEWMODEL.part.GestionModelosConsultasLinkDescriptor>();
		result.addAll(getOutgoingTypeModelFacetLinks_Relacion_4001(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<gestionmodelosconsultas.diagram_VIEWMODEL.part.GestionModelosConsultasLinkDescriptor> getComunicacion_2020OutgoingLinks(
			View view) {
		Comunicacion modelElement = (Comunicacion) view.getElement();
		LinkedList<gestionmodelosconsultas.diagram_VIEWMODEL.part.GestionModelosConsultasLinkDescriptor> result = new LinkedList<gestionmodelosconsultas.diagram_VIEWMODEL.part.GestionModelosConsultasLinkDescriptor>();
		result.addAll(getOutgoingTypeModelFacetLinks_Relacion_4001(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<gestionmodelosconsultas.diagram_VIEWMODEL.part.GestionModelosConsultasLinkDescriptor> getContacto_2021OutgoingLinks(
			View view) {
		Contacto modelElement = (Contacto) view.getElement();
		LinkedList<gestionmodelosconsultas.diagram_VIEWMODEL.part.GestionModelosConsultasLinkDescriptor> result = new LinkedList<gestionmodelosconsultas.diagram_VIEWMODEL.part.GestionModelosConsultasLinkDescriptor>();
		result.addAll(getOutgoingTypeModelFacetLinks_Relacion_4001(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<gestionmodelosconsultas.diagram_VIEWMODEL.part.GestionModelosConsultasLinkDescriptor> getDeposito_2022OutgoingLinks(
			View view) {
		Deposito modelElement = (Deposito) view.getElement();
		LinkedList<gestionmodelosconsultas.diagram_VIEWMODEL.part.GestionModelosConsultasLinkDescriptor> result = new LinkedList<gestionmodelosconsultas.diagram_VIEWMODEL.part.GestionModelosConsultasLinkDescriptor>();
		result.addAll(getOutgoingTypeModelFacetLinks_Relacion_4001(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<gestionmodelosconsultas.diagram_VIEWMODEL.part.GestionModelosConsultasLinkDescriptor> getDisco_2023OutgoingLinks(
			View view) {
		Disco modelElement = (Disco) view.getElement();
		LinkedList<gestionmodelosconsultas.diagram_VIEWMODEL.part.GestionModelosConsultasLinkDescriptor> result = new LinkedList<gestionmodelosconsultas.diagram_VIEWMODEL.part.GestionModelosConsultasLinkDescriptor>();
		result.addAll(getOutgoingTypeModelFacetLinks_Relacion_4001(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<gestionmodelosconsultas.diagram_VIEWMODEL.part.GestionModelosConsultasLinkDescriptor> getInstanciaProceso_2024OutgoingLinks(
			View view) {
		InstanciaProceso modelElement = (InstanciaProceso) view.getElement();
		LinkedList<gestionmodelosconsultas.diagram_VIEWMODEL.part.GestionModelosConsultasLinkDescriptor> result = new LinkedList<gestionmodelosconsultas.diagram_VIEWMODEL.part.GestionModelosConsultasLinkDescriptor>();
		result.addAll(getOutgoingTypeModelFacetLinks_Relacion_4001(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<gestionmodelosconsultas.diagram_VIEWMODEL.part.GestionModelosConsultasLinkDescriptor> getQuien_2025OutgoingLinks(
			View view) {
		Quien modelElement = (Quien) view.getElement();
		LinkedList<gestionmodelosconsultas.diagram_VIEWMODEL.part.GestionModelosConsultasLinkDescriptor> result = new LinkedList<gestionmodelosconsultas.diagram_VIEWMODEL.part.GestionModelosConsultasLinkDescriptor>();
		result.addAll(getOutgoingTypeModelFacetLinks_Relacion_4001(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<gestionmodelosconsultas.diagram_VIEWMODEL.part.GestionModelosConsultasLinkDescriptor> getRol_2026OutgoingLinks(
			View view) {
		Rol modelElement = (Rol) view.getElement();
		LinkedList<gestionmodelosconsultas.diagram_VIEWMODEL.part.GestionModelosConsultasLinkDescriptor> result = new LinkedList<gestionmodelosconsultas.diagram_VIEWMODEL.part.GestionModelosConsultasLinkDescriptor>();
		result.addAll(getOutgoingTypeModelFacetLinks_Relacion_4001(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<gestionmodelosconsultas.diagram_VIEWMODEL.part.GestionModelosConsultasLinkDescriptor> getFecha_2027OutgoingLinks(
			View view) {
		Fecha modelElement = (Fecha) view.getElement();
		LinkedList<gestionmodelosconsultas.diagram_VIEWMODEL.part.GestionModelosConsultasLinkDescriptor> result = new LinkedList<gestionmodelosconsultas.diagram_VIEWMODEL.part.GestionModelosConsultasLinkDescriptor>();
		result.addAll(getOutgoingTypeModelFacetLinks_Relacion_4001(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<gestionmodelosconsultas.diagram_VIEWMODEL.part.GestionModelosConsultasLinkDescriptor> getRelacion_4001OutgoingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	private static Collection<gestionmodelosconsultas.diagram_VIEWMODEL.part.GestionModelosConsultasLinkDescriptor> getContainedTypeModelFacetLinks_Relacion_4001(
			EADiagram container) {
		LinkedList<gestionmodelosconsultas.diagram_VIEWMODEL.part.GestionModelosConsultasLinkDescriptor> result = new LinkedList<gestionmodelosconsultas.diagram_VIEWMODEL.part.GestionModelosConsultasLinkDescriptor>();
		for (Iterator<?> links = container.getListRelacion().iterator(); links
				.hasNext();) {
			EObject linkObject = (EObject) links.next();
			if (false == linkObject instanceof Relacion) {
				continue;
			}
			Relacion link = (Relacion) linkObject;
			if (gestionmodelosconsultas.diagram_VIEWMODEL.edit.parts.RelacionEditPart.VISUAL_ID != gestionmodelosconsultas.diagram_VIEWMODEL.part.GestionModelosConsultasVisualIDRegistry
					.getLinkWithClassVisualID(link)) {
				continue;
			}
			ElementoConsulta dst = link.getTarget();
			ElementoConsulta src = link.getSource();
			result.add(new gestionmodelosconsultas.diagram_VIEWMODEL.part.GestionModelosConsultasLinkDescriptor(
					src,
					dst,
					link,
					gestionmodelosconsultas.diagram_VIEWMODEL.providers.GestionModelosConsultasElementTypes.Relacion_4001,
					gestionmodelosconsultas.diagram_VIEWMODEL.edit.parts.RelacionEditPart.VISUAL_ID));
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection<gestionmodelosconsultas.diagram_VIEWMODEL.part.GestionModelosConsultasLinkDescriptor> getIncomingTypeModelFacetLinks_Relacion_4001(
			ElementoConsulta target,
			Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences) {
		LinkedList<gestionmodelosconsultas.diagram_VIEWMODEL.part.GestionModelosConsultasLinkDescriptor> result = new LinkedList<gestionmodelosconsultas.diagram_VIEWMODEL.part.GestionModelosConsultasLinkDescriptor>();
		Collection<EStructuralFeature.Setting> settings = crossReferences
				.get(target);
		for (EStructuralFeature.Setting setting : settings) {
			if (setting.getEStructuralFeature() != ModelPackage.eINSTANCE
					.getRelacion_Target()
					|| false == setting.getEObject() instanceof Relacion) {
				continue;
			}
			Relacion link = (Relacion) setting.getEObject();
			if (gestionmodelosconsultas.diagram_VIEWMODEL.edit.parts.RelacionEditPart.VISUAL_ID != gestionmodelosconsultas.diagram_VIEWMODEL.part.GestionModelosConsultasVisualIDRegistry
					.getLinkWithClassVisualID(link)) {
				continue;
			}
			ElementoConsulta src = link.getSource();
			result.add(new gestionmodelosconsultas.diagram_VIEWMODEL.part.GestionModelosConsultasLinkDescriptor(
					src,
					target,
					link,
					gestionmodelosconsultas.diagram_VIEWMODEL.providers.GestionModelosConsultasElementTypes.Relacion_4001,
					gestionmodelosconsultas.diagram_VIEWMODEL.edit.parts.RelacionEditPart.VISUAL_ID));
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection<gestionmodelosconsultas.diagram_VIEWMODEL.part.GestionModelosConsultasLinkDescriptor> getOutgoingTypeModelFacetLinks_Relacion_4001(
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
		LinkedList<gestionmodelosconsultas.diagram_VIEWMODEL.part.GestionModelosConsultasLinkDescriptor> result = new LinkedList<gestionmodelosconsultas.diagram_VIEWMODEL.part.GestionModelosConsultasLinkDescriptor>();
		for (Iterator<?> links = container.getListRelacion().iterator(); links
				.hasNext();) {
			EObject linkObject = (EObject) links.next();
			if (false == linkObject instanceof Relacion) {
				continue;
			}
			Relacion link = (Relacion) linkObject;
			if (gestionmodelosconsultas.diagram_VIEWMODEL.edit.parts.RelacionEditPart.VISUAL_ID != gestionmodelosconsultas.diagram_VIEWMODEL.part.GestionModelosConsultasVisualIDRegistry
					.getLinkWithClassVisualID(link)) {
				continue;
			}
			ElementoConsulta dst = link.getTarget();
			ElementoConsulta src = link.getSource();
			if (src != source) {
				continue;
			}
			result.add(new gestionmodelosconsultas.diagram_VIEWMODEL.part.GestionModelosConsultasLinkDescriptor(
					src,
					dst,
					link,
					gestionmodelosconsultas.diagram_VIEWMODEL.providers.GestionModelosConsultasElementTypes.Relacion_4001,
					gestionmodelosconsultas.diagram_VIEWMODEL.edit.parts.RelacionEditPart.VISUAL_ID));
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

		public List<gestionmodelosconsultas.diagram_VIEWMODEL.part.GestionModelosConsultasNodeDescriptor> getSemanticChildren(
				View view) {
			return GestionModelosConsultasDiagramUpdater
					.getSemanticChildren(view);
		}

		/**
		 * @generated
		 */

		public List<gestionmodelosconsultas.diagram_VIEWMODEL.part.GestionModelosConsultasLinkDescriptor> getContainedLinks(
				View view) {
			return GestionModelosConsultasDiagramUpdater
					.getContainedLinks(view);
		}

		/**
		 * @generated
		 */

		public List<gestionmodelosconsultas.diagram_VIEWMODEL.part.GestionModelosConsultasLinkDescriptor> getIncomingLinks(
				View view) {
			return GestionModelosConsultasDiagramUpdater.getIncomingLinks(view);
		}

		/**
		 * @generated
		 */

		public List<gestionmodelosconsultas.diagram_VIEWMODEL.part.GestionModelosConsultasLinkDescriptor> getOutgoingLinks(
				View view) {
			return GestionModelosConsultasDiagramUpdater.getOutgoingLinks(view);
		}
	};

}
