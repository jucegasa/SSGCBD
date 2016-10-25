package gestionmodelosconsultas.diagram_ENTITY.providers;

import gestionmodelosconsultas.entitymodel.EntitymodelPackage;

import org.eclipse.core.runtime.IAdaptable;
import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.gmf.runtime.common.core.service.AbstractProvider;
import org.eclipse.gmf.runtime.common.core.service.IOperation;
import org.eclipse.gmf.runtime.common.ui.services.parser.GetParserOperation;
import org.eclipse.gmf.runtime.common.ui.services.parser.IParser;
import org.eclipse.gmf.runtime.common.ui.services.parser.IParserProvider;
import org.eclipse.gmf.runtime.common.ui.services.parser.ParserService;
import org.eclipse.gmf.runtime.emf.type.core.IElementType;
import org.eclipse.gmf.runtime.emf.ui.services.parser.ParserHintAdapter;
import org.eclipse.gmf.runtime.notation.View;

/**
 * @generated
 */
public class GestionModelosConsultasParserProvider extends AbstractProvider
		implements IParserProvider {

	/**
	 * @generated
	 */
	private IParser associativeEntityName_5002Parser;

	/**
	 * @generated
	 */
	private IParser getAssociativeEntityName_5002Parser() {
		if (associativeEntityName_5002Parser == null) {
			EAttribute[] features = new EAttribute[] { EntitymodelPackage.eINSTANCE
					.getModelElementEntity_Name() };
			gestionmodelosconsultas.diagram_ENTITY.parsers.MessageFormatParser parser = new gestionmodelosconsultas.diagram_ENTITY.parsers.MessageFormatParser(
					features);
			associativeEntityName_5002Parser = parser;
		}
		return associativeEntityName_5002Parser;
	}

	/**
	 * @generated
	 */
	private IParser associativeEntityStereotype_5003Parser;

	/**
	 * @generated
	 */
	private IParser getAssociativeEntityStereotype_5003Parser() {
		if (associativeEntityStereotype_5003Parser == null) {
			EAttribute[] features = new EAttribute[] { EntitymodelPackage.eINSTANCE
					.getModelElementEntity_Stereotype() };
			gestionmodelosconsultas.diagram_ENTITY.parsers.MessageFormatParser parser = new gestionmodelosconsultas.diagram_ENTITY.parsers.MessageFormatParser(
					features);
			associativeEntityStereotype_5003Parser = parser;
		}
		return associativeEntityStereotype_5003Parser;
	}

	/**
	 * @generated
	 */
	private IParser entityName_5005Parser;

	/**
	 * @generated
	 */
	private IParser getEntityName_5005Parser() {
		if (entityName_5005Parser == null) {
			EAttribute[] features = new EAttribute[] { EntitymodelPackage.eINSTANCE
					.getModelElementEntity_Name() };
			gestionmodelosconsultas.diagram_ENTITY.parsers.MessageFormatParser parser = new gestionmodelosconsultas.diagram_ENTITY.parsers.MessageFormatParser(
					features);
			entityName_5005Parser = parser;
		}
		return entityName_5005Parser;
	}

	/**
	 * @generated
	 */
	private IParser entityStereotype_5006Parser;

	/**
	 * @generated
	 */
	private IParser getEntityStereotype_5006Parser() {
		if (entityStereotype_5006Parser == null) {
			EAttribute[] features = new EAttribute[] { EntitymodelPackage.eINSTANCE
					.getModelElementEntity_Stereotype() };
			gestionmodelosconsultas.diagram_ENTITY.parsers.MessageFormatParser parser = new gestionmodelosconsultas.diagram_ENTITY.parsers.MessageFormatParser(
					features);
			entityStereotype_5006Parser = parser;
		}
		return entityStereotype_5006Parser;
	}

	/**
	 * @generated
	 */
	private IParser attributeName_5001Parser;

	/**
	 * @generated
	 */
	private IParser getAttributeName_5001Parser() {
		if (attributeName_5001Parser == null) {
			EAttribute[] features = new EAttribute[] { EntitymodelPackage.eINSTANCE
					.getAttribute_Name() };
			gestionmodelosconsultas.diagram_ENTITY.parsers.MessageFormatParser parser = new gestionmodelosconsultas.diagram_ENTITY.parsers.MessageFormatParser(
					features);
			attributeName_5001Parser = parser;
		}
		return attributeName_5001Parser;
	}

	/**
	 * @generated
	 */
	private IParser attributeName_5004Parser;

	/**
	 * @generated
	 */
	private IParser getAttributeName_5004Parser() {
		if (attributeName_5004Parser == null) {
			EAttribute[] features = new EAttribute[] { EntitymodelPackage.eINSTANCE
					.getAttribute_Name() };
			gestionmodelosconsultas.diagram_ENTITY.parsers.MessageFormatParser parser = new gestionmodelosconsultas.diagram_ENTITY.parsers.MessageFormatParser(
					features);
			attributeName_5004Parser = parser;
		}
		return attributeName_5004Parser;
	}

	/**
	 * @generated
	 */
	protected IParser getParser(int visualID) {
		switch (visualID) {
		case gestionmodelosconsultas.diagram_ENTITY.edit.parts.AssociativeEntityNameEditPart.VISUAL_ID:
			return getAssociativeEntityName_5002Parser();
		case gestionmodelosconsultas.diagram_ENTITY.edit.parts.AssociativeEntityStereotypeEditPart.VISUAL_ID:
			return getAssociativeEntityStereotype_5003Parser();
		case gestionmodelosconsultas.diagram_ENTITY.edit.parts.EntityNameEditPart.VISUAL_ID:
			return getEntityName_5005Parser();
		case gestionmodelosconsultas.diagram_ENTITY.edit.parts.EntityStereotypeEditPart.VISUAL_ID:
			return getEntityStereotype_5006Parser();
		case gestionmodelosconsultas.diagram_ENTITY.edit.parts.AttributeNameEditPart.VISUAL_ID:
			return getAttributeName_5001Parser();
		case gestionmodelosconsultas.diagram_ENTITY.edit.parts.AttributeName2EditPart.VISUAL_ID:
			return getAttributeName_5004Parser();
		}
		return null;
	}

	/**
	 * Utility method that consults ParserService
	 * @generated
	 */
	public static IParser getParser(IElementType type, EObject object,
			String parserHint) {
		return ParserService.getInstance().getParser(
				new HintAdapter(type, object, parserHint));
	}

	/**
	 * @generated
	 */
	public IParser getParser(IAdaptable hint) {
		String vid = (String) hint.getAdapter(String.class);
		if (vid != null) {
			return getParser(gestionmodelosconsultas.diagram_ENTITY.part.GestionModelosConsultasVisualIDRegistry
					.getVisualID(vid));
		}
		View view = (View) hint.getAdapter(View.class);
		if (view != null) {
			return getParser(gestionmodelosconsultas.diagram_ENTITY.part.GestionModelosConsultasVisualIDRegistry
					.getVisualID(view));
		}
		return null;
	}

	/**
	 * @generated
	 */
	public boolean provides(IOperation operation) {
		if (operation instanceof GetParserOperation) {
			IAdaptable hint = ((GetParserOperation) operation).getHint();
			if (gestionmodelosconsultas.diagram_ENTITY.providers.GestionModelosConsultasElementTypes
					.getElement(hint) == null) {
				return false;
			}
			return getParser(hint) != null;
		}
		return false;
	}

	/**
	 * @generated
	 */
	private static class HintAdapter extends ParserHintAdapter {

		/**
		 * @generated
		 */
		private final IElementType elementType;

		/**
		 * @generated
		 */
		public HintAdapter(IElementType type, EObject object, String parserHint) {
			super(object, parserHint);
			assert type != null;
			elementType = type;
		}

		/**
		 * @generated
		 */
		public Object getAdapter(Class adapter) {
			if (IElementType.class.equals(adapter)) {
				return elementType;
			}
			return super.getAdapter(adapter);
		}
	}

}
