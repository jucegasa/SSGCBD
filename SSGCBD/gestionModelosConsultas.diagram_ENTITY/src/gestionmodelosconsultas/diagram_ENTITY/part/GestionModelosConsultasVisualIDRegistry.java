package gestionmodelosconsultas.diagram_ENTITY.part;

import gestionmodelosconsultas.entitymodel.DiagramEntity;
import gestionmodelosconsultas.entitymodel.EntitymodelPackage;

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
	private static final String DEBUG_KEY = "gestionModelosConsultas.diagram_ENTITY/debug/visualID"; //$NON-NLS-1$

	/**
	 * @generated
	 */
	public static int getVisualID(View view) {
		if (view instanceof Diagram) {
			if (gestionmodelosconsultas.diagram_ENTITY.edit.parts.DiagramEntityEditPart.MODEL_ID
					.equals(view.getType())) {
				return gestionmodelosconsultas.diagram_ENTITY.edit.parts.DiagramEntityEditPart.VISUAL_ID;
			} else {
				return -1;
			}
		}
		return gestionmodelosconsultas.diagram_ENTITY.part.GestionModelosConsultasVisualIDRegistry
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
				gestionmodelosconsultas.diagram_ENTITY.part.GestionModelosConsultasDiagramEditorPlugin
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
		if (EntitymodelPackage.eINSTANCE.getDiagramEntity().isSuperTypeOf(
				domainElement.eClass())
				&& isDiagram((DiagramEntity) domainElement)) {
			return gestionmodelosconsultas.diagram_ENTITY.edit.parts.DiagramEntityEditPart.VISUAL_ID;
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
		String containerModelID = gestionmodelosconsultas.diagram_ENTITY.part.GestionModelosConsultasVisualIDRegistry
				.getModelID(containerView);
		if (!gestionmodelosconsultas.diagram_ENTITY.edit.parts.DiagramEntityEditPart.MODEL_ID
				.equals(containerModelID)) {
			return -1;
		}
		int containerVisualID;
		if (gestionmodelosconsultas.diagram_ENTITY.edit.parts.DiagramEntityEditPart.MODEL_ID
				.equals(containerModelID)) {
			containerVisualID = gestionmodelosconsultas.diagram_ENTITY.part.GestionModelosConsultasVisualIDRegistry
					.getVisualID(containerView);
		} else {
			if (containerView instanceof Diagram) {
				containerVisualID = gestionmodelosconsultas.diagram_ENTITY.edit.parts.DiagramEntityEditPart.VISUAL_ID;
			} else {
				return -1;
			}
		}
		switch (containerVisualID) {
		case gestionmodelosconsultas.diagram_ENTITY.edit.parts.DiagramEntityEditPart.VISUAL_ID:
			if (EntitymodelPackage.eINSTANCE.getAssociativeEntity()
					.isSuperTypeOf(domainElement.eClass())) {
				return gestionmodelosconsultas.diagram_ENTITY.edit.parts.AssociativeEntityEditPart.VISUAL_ID;
			}
			if (EntitymodelPackage.eINSTANCE.getEntity().isSuperTypeOf(
					domainElement.eClass())) {
				return gestionmodelosconsultas.diagram_ENTITY.edit.parts.EntityEditPart.VISUAL_ID;
			}
			break;
		case gestionmodelosconsultas.diagram_ENTITY.edit.parts.AssociativeEntityCompartmentAssociativeEntityEditPart.VISUAL_ID:
			if (EntitymodelPackage.eINSTANCE.getAttribute().isSuperTypeOf(
					domainElement.eClass())) {
				return gestionmodelosconsultas.diagram_ENTITY.edit.parts.AttributeEditPart.VISUAL_ID;
			}
			break;
		case gestionmodelosconsultas.diagram_ENTITY.edit.parts.EntityCompartmentEntityEditPart.VISUAL_ID:
			if (EntitymodelPackage.eINSTANCE.getAttribute().isSuperTypeOf(
					domainElement.eClass())) {
				return gestionmodelosconsultas.diagram_ENTITY.edit.parts.Attribute2EditPart.VISUAL_ID;
			}
			break;
		}
		return -1;
	}

	/**
	 * @generated
	 */
	public static boolean canCreateNode(View containerView, int nodeVisualID) {
		String containerModelID = gestionmodelosconsultas.diagram_ENTITY.part.GestionModelosConsultasVisualIDRegistry
				.getModelID(containerView);
		if (!gestionmodelosconsultas.diagram_ENTITY.edit.parts.DiagramEntityEditPart.MODEL_ID
				.equals(containerModelID)) {
			return false;
		}
		int containerVisualID;
		if (gestionmodelosconsultas.diagram_ENTITY.edit.parts.DiagramEntityEditPart.MODEL_ID
				.equals(containerModelID)) {
			containerVisualID = gestionmodelosconsultas.diagram_ENTITY.part.GestionModelosConsultasVisualIDRegistry
					.getVisualID(containerView);
		} else {
			if (containerView instanceof Diagram) {
				containerVisualID = gestionmodelosconsultas.diagram_ENTITY.edit.parts.DiagramEntityEditPart.VISUAL_ID;
			} else {
				return false;
			}
		}
		switch (containerVisualID) {
		case gestionmodelosconsultas.diagram_ENTITY.edit.parts.DiagramEntityEditPart.VISUAL_ID:
			if (gestionmodelosconsultas.diagram_ENTITY.edit.parts.AssociativeEntityEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (gestionmodelosconsultas.diagram_ENTITY.edit.parts.EntityEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case gestionmodelosconsultas.diagram_ENTITY.edit.parts.AssociativeEntityEditPart.VISUAL_ID:
			if (gestionmodelosconsultas.diagram_ENTITY.edit.parts.AssociativeEntityNameEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (gestionmodelosconsultas.diagram_ENTITY.edit.parts.AssociativeEntityStereotypeEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (gestionmodelosconsultas.diagram_ENTITY.edit.parts.AssociativeEntityCompartmentAssociativeEntityEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case gestionmodelosconsultas.diagram_ENTITY.edit.parts.EntityEditPart.VISUAL_ID:
			if (gestionmodelosconsultas.diagram_ENTITY.edit.parts.EntityNameEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (gestionmodelosconsultas.diagram_ENTITY.edit.parts.EntityStereotypeEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (gestionmodelosconsultas.diagram_ENTITY.edit.parts.EntityCompartmentEntityEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case gestionmodelosconsultas.diagram_ENTITY.edit.parts.AttributeEditPart.VISUAL_ID:
			if (gestionmodelosconsultas.diagram_ENTITY.edit.parts.AttributeNameEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case gestionmodelosconsultas.diagram_ENTITY.edit.parts.Attribute2EditPart.VISUAL_ID:
			if (gestionmodelosconsultas.diagram_ENTITY.edit.parts.AttributeName2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case gestionmodelosconsultas.diagram_ENTITY.edit.parts.AssociativeEntityCompartmentAssociativeEntityEditPart.VISUAL_ID:
			if (gestionmodelosconsultas.diagram_ENTITY.edit.parts.AttributeEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case gestionmodelosconsultas.diagram_ENTITY.edit.parts.EntityCompartmentEntityEditPart.VISUAL_ID:
			if (gestionmodelosconsultas.diagram_ENTITY.edit.parts.Attribute2EditPart.VISUAL_ID == nodeVisualID) {
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
		if (EntitymodelPackage.eINSTANCE.getSimpleRelation().isSuperTypeOf(
				domainElement.eClass())) {
			return gestionmodelosconsultas.diagram_ENTITY.edit.parts.SimpleRelationEditPart.VISUAL_ID;
		}
		return -1;
	}

	/**
	 * User can change implementation of this method to handle some specific
	 * situations not covered by default logic.
	 * 
	 * @generated
	 */
	private static boolean isDiagram(DiagramEntity element) {
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
		case gestionmodelosconsultas.diagram_ENTITY.edit.parts.AssociativeEntityCompartmentAssociativeEntityEditPart.VISUAL_ID:
		case gestionmodelosconsultas.diagram_ENTITY.edit.parts.EntityCompartmentEntityEditPart.VISUAL_ID:
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
		case gestionmodelosconsultas.diagram_ENTITY.edit.parts.DiagramEntityEditPart.VISUAL_ID:
			return false;
		case gestionmodelosconsultas.diagram_ENTITY.edit.parts.AttributeEditPart.VISUAL_ID:
		case gestionmodelosconsultas.diagram_ENTITY.edit.parts.Attribute2EditPart.VISUAL_ID:
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
			return gestionmodelosconsultas.diagram_ENTITY.part.GestionModelosConsultasVisualIDRegistry
					.getVisualID(view);
		}

		/**
		 * @generated
		 */

		public String getModelID(View view) {
			return gestionmodelosconsultas.diagram_ENTITY.part.GestionModelosConsultasVisualIDRegistry
					.getModelID(view);
		}

		/**
		 * @generated
		 */

		public int getNodeVisualID(View containerView, EObject domainElement) {
			return gestionmodelosconsultas.diagram_ENTITY.part.GestionModelosConsultasVisualIDRegistry
					.getNodeVisualID(containerView, domainElement);
		}

		/**
		 * @generated
		 */

		public boolean checkNodeVisualID(View containerView,
				EObject domainElement, int candidate) {
			return gestionmodelosconsultas.diagram_ENTITY.part.GestionModelosConsultasVisualIDRegistry
					.checkNodeVisualID(containerView, domainElement, candidate);
		}

		/**
		 * @generated
		 */

		public boolean isCompartmentVisualID(int visualID) {
			return gestionmodelosconsultas.diagram_ENTITY.part.GestionModelosConsultasVisualIDRegistry
					.isCompartmentVisualID(visualID);
		}

		/**
		 * @generated
		 */

		public boolean isSemanticLeafVisualID(int visualID) {
			return gestionmodelosconsultas.diagram_ENTITY.part.GestionModelosConsultasVisualIDRegistry
					.isSemanticLeafVisualID(visualID);
		}
	};

}
