package gestionmodelosconsultas.diagram_ENTITY.part;

import gestionmodelosconsultas.entitymodel.AssociativeEntity;
import gestionmodelosconsultas.entitymodel.Attribute;
import gestionmodelosconsultas.entitymodel.DiagramEntity;
import gestionmodelosconsultas.entitymodel.Entity;
import gestionmodelosconsultas.entitymodel.EntitymodelPackage;
import gestionmodelosconsultas.entitymodel.SimpleRelation;

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
	public static List<gestionmodelosconsultas.diagram_ENTITY.part.GestionModelosConsultasNodeDescriptor> getSemanticChildren(
			View view) {
		switch (gestionmodelosconsultas.diagram_ENTITY.part.GestionModelosConsultasVisualIDRegistry
				.getVisualID(view)) {
		case gestionmodelosconsultas.diagram_ENTITY.edit.parts.DiagramEntityEditPart.VISUAL_ID:
			return getDiagramEntity_1000SemanticChildren(view);
		case gestionmodelosconsultas.diagram_ENTITY.edit.parts.AssociativeEntityCompartmentAssociativeEntityEditPart.VISUAL_ID:
			return getAssociativeEntityCompartmentAssociativeEntity_7001SemanticChildren(view);
		case gestionmodelosconsultas.diagram_ENTITY.edit.parts.EntityCompartmentEntityEditPart.VISUAL_ID:
			return getEntityCompartmentEntity_7002SemanticChildren(view);
		}
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<gestionmodelosconsultas.diagram_ENTITY.part.GestionModelosConsultasNodeDescriptor> getDiagramEntity_1000SemanticChildren(
			View view) {
		if (!view.isSetElement()) {
			return Collections.emptyList();
		}
		DiagramEntity modelElement = (DiagramEntity) view.getElement();
		LinkedList<gestionmodelosconsultas.diagram_ENTITY.part.GestionModelosConsultasNodeDescriptor> result = new LinkedList<gestionmodelosconsultas.diagram_ENTITY.part.GestionModelosConsultasNodeDescriptor>();
		for (Iterator<?> it = modelElement.getListEntity().iterator(); it
				.hasNext();) {
			Entity childElement = (Entity) it.next();
			int visualID = gestionmodelosconsultas.diagram_ENTITY.part.GestionModelosConsultasVisualIDRegistry
					.getNodeVisualID(view, childElement);
			if (visualID == gestionmodelosconsultas.diagram_ENTITY.edit.parts.AssociativeEntityEditPart.VISUAL_ID) {
				result.add(new gestionmodelosconsultas.diagram_ENTITY.part.GestionModelosConsultasNodeDescriptor(
						childElement, visualID));
				continue;
			}
			if (visualID == gestionmodelosconsultas.diagram_ENTITY.edit.parts.EntityEditPart.VISUAL_ID) {
				result.add(new gestionmodelosconsultas.diagram_ENTITY.part.GestionModelosConsultasNodeDescriptor(
						childElement, visualID));
				continue;
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	public static List<gestionmodelosconsultas.diagram_ENTITY.part.GestionModelosConsultasNodeDescriptor> getAssociativeEntityCompartmentAssociativeEntity_7001SemanticChildren(
			View view) {
		if (false == view.eContainer() instanceof View) {
			return Collections.emptyList();
		}
		View containerView = (View) view.eContainer();
		if (!containerView.isSetElement()) {
			return Collections.emptyList();
		}
		AssociativeEntity modelElement = (AssociativeEntity) containerView
				.getElement();
		LinkedList<gestionmodelosconsultas.diagram_ENTITY.part.GestionModelosConsultasNodeDescriptor> result = new LinkedList<gestionmodelosconsultas.diagram_ENTITY.part.GestionModelosConsultasNodeDescriptor>();
		for (Iterator<?> it = modelElement.getListAttributes().iterator(); it
				.hasNext();) {
			Attribute childElement = (Attribute) it.next();
			int visualID = gestionmodelosconsultas.diagram_ENTITY.part.GestionModelosConsultasVisualIDRegistry
					.getNodeVisualID(view, childElement);
			if (visualID == gestionmodelosconsultas.diagram_ENTITY.edit.parts.AttributeEditPart.VISUAL_ID) {
				result.add(new gestionmodelosconsultas.diagram_ENTITY.part.GestionModelosConsultasNodeDescriptor(
						childElement, visualID));
				continue;
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	public static List<gestionmodelosconsultas.diagram_ENTITY.part.GestionModelosConsultasNodeDescriptor> getEntityCompartmentEntity_7002SemanticChildren(
			View view) {
		if (false == view.eContainer() instanceof View) {
			return Collections.emptyList();
		}
		View containerView = (View) view.eContainer();
		if (!containerView.isSetElement()) {
			return Collections.emptyList();
		}
		Entity modelElement = (Entity) containerView.getElement();
		LinkedList<gestionmodelosconsultas.diagram_ENTITY.part.GestionModelosConsultasNodeDescriptor> result = new LinkedList<gestionmodelosconsultas.diagram_ENTITY.part.GestionModelosConsultasNodeDescriptor>();
		for (Iterator<?> it = modelElement.getListAttributes().iterator(); it
				.hasNext();) {
			Attribute childElement = (Attribute) it.next();
			int visualID = gestionmodelosconsultas.diagram_ENTITY.part.GestionModelosConsultasVisualIDRegistry
					.getNodeVisualID(view, childElement);
			if (visualID == gestionmodelosconsultas.diagram_ENTITY.edit.parts.Attribute2EditPart.VISUAL_ID) {
				result.add(new gestionmodelosconsultas.diagram_ENTITY.part.GestionModelosConsultasNodeDescriptor(
						childElement, visualID));
				continue;
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	public static List<gestionmodelosconsultas.diagram_ENTITY.part.GestionModelosConsultasLinkDescriptor> getContainedLinks(
			View view) {
		switch (gestionmodelosconsultas.diagram_ENTITY.part.GestionModelosConsultasVisualIDRegistry
				.getVisualID(view)) {
		case gestionmodelosconsultas.diagram_ENTITY.edit.parts.DiagramEntityEditPart.VISUAL_ID:
			return getDiagramEntity_1000ContainedLinks(view);
		case gestionmodelosconsultas.diagram_ENTITY.edit.parts.AssociativeEntityEditPart.VISUAL_ID:
			return getAssociativeEntity_2001ContainedLinks(view);
		case gestionmodelosconsultas.diagram_ENTITY.edit.parts.EntityEditPart.VISUAL_ID:
			return getEntity_2002ContainedLinks(view);
		case gestionmodelosconsultas.diagram_ENTITY.edit.parts.AttributeEditPart.VISUAL_ID:
			return getAttribute_3001ContainedLinks(view);
		case gestionmodelosconsultas.diagram_ENTITY.edit.parts.Attribute2EditPart.VISUAL_ID:
			return getAttribute_3002ContainedLinks(view);
		case gestionmodelosconsultas.diagram_ENTITY.edit.parts.SimpleRelationEditPart.VISUAL_ID:
			return getSimpleRelation_4001ContainedLinks(view);
		}
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<gestionmodelosconsultas.diagram_ENTITY.part.GestionModelosConsultasLinkDescriptor> getIncomingLinks(
			View view) {
		switch (gestionmodelosconsultas.diagram_ENTITY.part.GestionModelosConsultasVisualIDRegistry
				.getVisualID(view)) {
		case gestionmodelosconsultas.diagram_ENTITY.edit.parts.AssociativeEntityEditPart.VISUAL_ID:
			return getAssociativeEntity_2001IncomingLinks(view);
		case gestionmodelosconsultas.diagram_ENTITY.edit.parts.EntityEditPart.VISUAL_ID:
			return getEntity_2002IncomingLinks(view);
		case gestionmodelosconsultas.diagram_ENTITY.edit.parts.AttributeEditPart.VISUAL_ID:
			return getAttribute_3001IncomingLinks(view);
		case gestionmodelosconsultas.diagram_ENTITY.edit.parts.Attribute2EditPart.VISUAL_ID:
			return getAttribute_3002IncomingLinks(view);
		case gestionmodelosconsultas.diagram_ENTITY.edit.parts.SimpleRelationEditPart.VISUAL_ID:
			return getSimpleRelation_4001IncomingLinks(view);
		}
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<gestionmodelosconsultas.diagram_ENTITY.part.GestionModelosConsultasLinkDescriptor> getOutgoingLinks(
			View view) {
		switch (gestionmodelosconsultas.diagram_ENTITY.part.GestionModelosConsultasVisualIDRegistry
				.getVisualID(view)) {
		case gestionmodelosconsultas.diagram_ENTITY.edit.parts.AssociativeEntityEditPart.VISUAL_ID:
			return getAssociativeEntity_2001OutgoingLinks(view);
		case gestionmodelosconsultas.diagram_ENTITY.edit.parts.EntityEditPart.VISUAL_ID:
			return getEntity_2002OutgoingLinks(view);
		case gestionmodelosconsultas.diagram_ENTITY.edit.parts.AttributeEditPart.VISUAL_ID:
			return getAttribute_3001OutgoingLinks(view);
		case gestionmodelosconsultas.diagram_ENTITY.edit.parts.Attribute2EditPart.VISUAL_ID:
			return getAttribute_3002OutgoingLinks(view);
		case gestionmodelosconsultas.diagram_ENTITY.edit.parts.SimpleRelationEditPart.VISUAL_ID:
			return getSimpleRelation_4001OutgoingLinks(view);
		}
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<gestionmodelosconsultas.diagram_ENTITY.part.GestionModelosConsultasLinkDescriptor> getDiagramEntity_1000ContainedLinks(
			View view) {
		DiagramEntity modelElement = (DiagramEntity) view.getElement();
		LinkedList<gestionmodelosconsultas.diagram_ENTITY.part.GestionModelosConsultasLinkDescriptor> result = new LinkedList<gestionmodelosconsultas.diagram_ENTITY.part.GestionModelosConsultasLinkDescriptor>();
		result.addAll(getContainedTypeModelFacetLinks_SimpleRelation_4001(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<gestionmodelosconsultas.diagram_ENTITY.part.GestionModelosConsultasLinkDescriptor> getAssociativeEntity_2001ContainedLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<gestionmodelosconsultas.diagram_ENTITY.part.GestionModelosConsultasLinkDescriptor> getEntity_2002ContainedLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<gestionmodelosconsultas.diagram_ENTITY.part.GestionModelosConsultasLinkDescriptor> getAttribute_3001ContainedLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<gestionmodelosconsultas.diagram_ENTITY.part.GestionModelosConsultasLinkDescriptor> getAttribute_3002ContainedLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<gestionmodelosconsultas.diagram_ENTITY.part.GestionModelosConsultasLinkDescriptor> getSimpleRelation_4001ContainedLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<gestionmodelosconsultas.diagram_ENTITY.part.GestionModelosConsultasLinkDescriptor> getAssociativeEntity_2001IncomingLinks(
			View view) {
		AssociativeEntity modelElement = (AssociativeEntity) view.getElement();
		Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences = EcoreUtil.CrossReferencer
				.find(view.eResource().getResourceSet().getResources());
		LinkedList<gestionmodelosconsultas.diagram_ENTITY.part.GestionModelosConsultasLinkDescriptor> result = new LinkedList<gestionmodelosconsultas.diagram_ENTITY.part.GestionModelosConsultasLinkDescriptor>();
		result.addAll(getIncomingTypeModelFacetLinks_SimpleRelation_4001(
				modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<gestionmodelosconsultas.diagram_ENTITY.part.GestionModelosConsultasLinkDescriptor> getEntity_2002IncomingLinks(
			View view) {
		Entity modelElement = (Entity) view.getElement();
		Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences = EcoreUtil.CrossReferencer
				.find(view.eResource().getResourceSet().getResources());
		LinkedList<gestionmodelosconsultas.diagram_ENTITY.part.GestionModelosConsultasLinkDescriptor> result = new LinkedList<gestionmodelosconsultas.diagram_ENTITY.part.GestionModelosConsultasLinkDescriptor>();
		result.addAll(getIncomingTypeModelFacetLinks_SimpleRelation_4001(
				modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<gestionmodelosconsultas.diagram_ENTITY.part.GestionModelosConsultasLinkDescriptor> getAttribute_3001IncomingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<gestionmodelosconsultas.diagram_ENTITY.part.GestionModelosConsultasLinkDescriptor> getAttribute_3002IncomingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<gestionmodelosconsultas.diagram_ENTITY.part.GestionModelosConsultasLinkDescriptor> getSimpleRelation_4001IncomingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<gestionmodelosconsultas.diagram_ENTITY.part.GestionModelosConsultasLinkDescriptor> getAssociativeEntity_2001OutgoingLinks(
			View view) {
		AssociativeEntity modelElement = (AssociativeEntity) view.getElement();
		LinkedList<gestionmodelosconsultas.diagram_ENTITY.part.GestionModelosConsultasLinkDescriptor> result = new LinkedList<gestionmodelosconsultas.diagram_ENTITY.part.GestionModelosConsultasLinkDescriptor>();
		result.addAll(getOutgoingTypeModelFacetLinks_SimpleRelation_4001(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<gestionmodelosconsultas.diagram_ENTITY.part.GestionModelosConsultasLinkDescriptor> getEntity_2002OutgoingLinks(
			View view) {
		Entity modelElement = (Entity) view.getElement();
		LinkedList<gestionmodelosconsultas.diagram_ENTITY.part.GestionModelosConsultasLinkDescriptor> result = new LinkedList<gestionmodelosconsultas.diagram_ENTITY.part.GestionModelosConsultasLinkDescriptor>();
		result.addAll(getOutgoingTypeModelFacetLinks_SimpleRelation_4001(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<gestionmodelosconsultas.diagram_ENTITY.part.GestionModelosConsultasLinkDescriptor> getAttribute_3001OutgoingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<gestionmodelosconsultas.diagram_ENTITY.part.GestionModelosConsultasLinkDescriptor> getAttribute_3002OutgoingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<gestionmodelosconsultas.diagram_ENTITY.part.GestionModelosConsultasLinkDescriptor> getSimpleRelation_4001OutgoingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	private static Collection<gestionmodelosconsultas.diagram_ENTITY.part.GestionModelosConsultasLinkDescriptor> getContainedTypeModelFacetLinks_SimpleRelation_4001(
			DiagramEntity container) {
		LinkedList<gestionmodelosconsultas.diagram_ENTITY.part.GestionModelosConsultasLinkDescriptor> result = new LinkedList<gestionmodelosconsultas.diagram_ENTITY.part.GestionModelosConsultasLinkDescriptor>();
		for (Iterator<?> links = container.getListEntityRelation().iterator(); links
				.hasNext();) {
			EObject linkObject = (EObject) links.next();
			if (false == linkObject instanceof SimpleRelation) {
				continue;
			}
			SimpleRelation link = (SimpleRelation) linkObject;
			if (gestionmodelosconsultas.diagram_ENTITY.edit.parts.SimpleRelationEditPart.VISUAL_ID != gestionmodelosconsultas.diagram_ENTITY.part.GestionModelosConsultasVisualIDRegistry
					.getLinkWithClassVisualID(link)) {
				continue;
			}
			Entity dst = link.getTarget();
			Entity src = link.getSource();
			result.add(new gestionmodelosconsultas.diagram_ENTITY.part.GestionModelosConsultasLinkDescriptor(
					src,
					dst,
					link,
					gestionmodelosconsultas.diagram_ENTITY.providers.GestionModelosConsultasElementTypes.SimpleRelation_4001,
					gestionmodelosconsultas.diagram_ENTITY.edit.parts.SimpleRelationEditPart.VISUAL_ID));
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection<gestionmodelosconsultas.diagram_ENTITY.part.GestionModelosConsultasLinkDescriptor> getIncomingTypeModelFacetLinks_SimpleRelation_4001(
			Entity target,
			Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences) {
		LinkedList<gestionmodelosconsultas.diagram_ENTITY.part.GestionModelosConsultasLinkDescriptor> result = new LinkedList<gestionmodelosconsultas.diagram_ENTITY.part.GestionModelosConsultasLinkDescriptor>();
		Collection<EStructuralFeature.Setting> settings = crossReferences
				.get(target);
		for (EStructuralFeature.Setting setting : settings) {
			if (setting.getEStructuralFeature() != EntitymodelPackage.eINSTANCE
					.getEntityRelation_Target()
					|| false == setting.getEObject() instanceof SimpleRelation) {
				continue;
			}
			SimpleRelation link = (SimpleRelation) setting.getEObject();
			if (gestionmodelosconsultas.diagram_ENTITY.edit.parts.SimpleRelationEditPart.VISUAL_ID != gestionmodelosconsultas.diagram_ENTITY.part.GestionModelosConsultasVisualIDRegistry
					.getLinkWithClassVisualID(link)) {
				continue;
			}
			Entity src = link.getSource();
			result.add(new gestionmodelosconsultas.diagram_ENTITY.part.GestionModelosConsultasLinkDescriptor(
					src,
					target,
					link,
					gestionmodelosconsultas.diagram_ENTITY.providers.GestionModelosConsultasElementTypes.SimpleRelation_4001,
					gestionmodelosconsultas.diagram_ENTITY.edit.parts.SimpleRelationEditPart.VISUAL_ID));
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection<gestionmodelosconsultas.diagram_ENTITY.part.GestionModelosConsultasLinkDescriptor> getOutgoingTypeModelFacetLinks_SimpleRelation_4001(
			Entity source) {
		DiagramEntity container = null;
		// Find container element for the link.
		// Climb up by containment hierarchy starting from the source
		// and return the first element that is instance of the container class.
		for (EObject element = source; element != null && container == null; element = element
				.eContainer()) {
			if (element instanceof DiagramEntity) {
				container = (DiagramEntity) element;
			}
		}
		if (container == null) {
			return Collections.emptyList();
		}
		LinkedList<gestionmodelosconsultas.diagram_ENTITY.part.GestionModelosConsultasLinkDescriptor> result = new LinkedList<gestionmodelosconsultas.diagram_ENTITY.part.GestionModelosConsultasLinkDescriptor>();
		for (Iterator<?> links = container.getListEntityRelation().iterator(); links
				.hasNext();) {
			EObject linkObject = (EObject) links.next();
			if (false == linkObject instanceof SimpleRelation) {
				continue;
			}
			SimpleRelation link = (SimpleRelation) linkObject;
			if (gestionmodelosconsultas.diagram_ENTITY.edit.parts.SimpleRelationEditPart.VISUAL_ID != gestionmodelosconsultas.diagram_ENTITY.part.GestionModelosConsultasVisualIDRegistry
					.getLinkWithClassVisualID(link)) {
				continue;
			}
			Entity dst = link.getTarget();
			Entity src = link.getSource();
			if (src != source) {
				continue;
			}
			result.add(new gestionmodelosconsultas.diagram_ENTITY.part.GestionModelosConsultasLinkDescriptor(
					src,
					dst,
					link,
					gestionmodelosconsultas.diagram_ENTITY.providers.GestionModelosConsultasElementTypes.SimpleRelation_4001,
					gestionmodelosconsultas.diagram_ENTITY.edit.parts.SimpleRelationEditPart.VISUAL_ID));
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

		public List<gestionmodelosconsultas.diagram_ENTITY.part.GestionModelosConsultasNodeDescriptor> getSemanticChildren(
				View view) {
			return GestionModelosConsultasDiagramUpdater
					.getSemanticChildren(view);
		}

		/**
		 * @generated
		 */

		public List<gestionmodelosconsultas.diagram_ENTITY.part.GestionModelosConsultasLinkDescriptor> getContainedLinks(
				View view) {
			return GestionModelosConsultasDiagramUpdater
					.getContainedLinks(view);
		}

		/**
		 * @generated
		 */

		public List<gestionmodelosconsultas.diagram_ENTITY.part.GestionModelosConsultasLinkDescriptor> getIncomingLinks(
				View view) {
			return GestionModelosConsultasDiagramUpdater.getIncomingLinks(view);
		}

		/**
		 * @generated
		 */

		public List<gestionmodelosconsultas.diagram_ENTITY.part.GestionModelosConsultasLinkDescriptor> getOutgoingLinks(
				View view) {
			return GestionModelosConsultasDiagramUpdater.getOutgoingLinks(view);
		}
	};

}
