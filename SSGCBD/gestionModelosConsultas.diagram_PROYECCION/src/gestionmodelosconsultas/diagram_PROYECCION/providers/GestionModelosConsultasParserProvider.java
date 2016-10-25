package gestionmodelosconsultas.diagram_PROYECCION.providers;

import gestionmodelosconsultas.modeloconsultas.model.ModelPackage;
import gestionmodelosconsultas.sysinfo.core.CorePackage;
import gestionmodelosconsultas.sysinfo.time.TimePackage;

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
import org.eclipse.gmf.tooling.runtime.parsers.EnumParser;

/**
 * @generated
 */
public class GestionModelosConsultasParserProvider extends AbstractProvider
		implements IParserProvider {

	/**
	 * @generated
	 */
	private IParser unidadOrganizacionalNombre_5031Parser;

	/**
	 * @generated
	 */
	private IParser getUnidadOrganizacionalNombre_5031Parser() {
		if (unidadOrganizacionalNombre_5031Parser == null) {
			EAttribute[] features = new EAttribute[] { CorePackage.eINSTANCE
					.getElementoModelo_Nombre() };
			gestionmodelosconsultas.diagram_PROYECCION.parsers.MessageFormatParser parser = new gestionmodelosconsultas.diagram_PROYECCION.parsers.MessageFormatParser(
					features);
			unidadOrganizacionalNombre_5031Parser = parser;
		}
		return unidadOrganizacionalNombre_5031Parser;
	}

	/**
	 * @generated
	 */
	private IParser documentoNombre_5032Parser;

	/**
	 * @generated
	 */
	private IParser getDocumentoNombre_5032Parser() {
		if (documentoNombre_5032Parser == null) {
			EAttribute[] features = new EAttribute[] { CorePackage.eINSTANCE
					.getElementoModelo_Nombre() };
			gestionmodelosconsultas.diagram_PROYECCION.parsers.MessageFormatParser parser = new gestionmodelosconsultas.diagram_PROYECCION.parsers.MessageFormatParser(
					features);
			documentoNombre_5032Parser = parser;
		}
		return documentoNombre_5032Parser;
	}

	/**
	 * @generated
	 */
	private IParser actividadNombre_5033Parser;

	/**
	 * @generated
	 */
	private IParser getActividadNombre_5033Parser() {
		if (actividadNombre_5033Parser == null) {
			EAttribute[] features = new EAttribute[] { CorePackage.eINSTANCE
					.getElementoModelo_Nombre() };
			gestionmodelosconsultas.diagram_PROYECCION.parsers.MessageFormatParser parser = new gestionmodelosconsultas.diagram_PROYECCION.parsers.MessageFormatParser(
					features);
			actividadNombre_5033Parser = parser;
		}
		return actividadNombre_5033Parser;
	}

	/**
	 * @generated
	 */
	private IParser actorNombre_5034Parser;

	/**
	 * @generated
	 */
	private IParser getActorNombre_5034Parser() {
		if (actorNombre_5034Parser == null) {
			EAttribute[] features = new EAttribute[] { CorePackage.eINSTANCE
					.getElementoModelo_Nombre() };
			gestionmodelosconsultas.diagram_PROYECCION.parsers.MessageFormatParser parser = new gestionmodelosconsultas.diagram_PROYECCION.parsers.MessageFormatParser(
					features);
			actorNombre_5034Parser = parser;
		}
		return actorNombre_5034Parser;
	}

	/**
	 * @generated
	 */
	private IParser armarioNombre_5035Parser;

	/**
	 * @generated
	 */
	private IParser getArmarioNombre_5035Parser() {
		if (armarioNombre_5035Parser == null) {
			EAttribute[] features = new EAttribute[] { CorePackage.eINSTANCE
					.getElementoModelo_Nombre() };
			gestionmodelosconsultas.diagram_PROYECCION.parsers.MessageFormatParser parser = new gestionmodelosconsultas.diagram_PROYECCION.parsers.MessageFormatParser(
					features);
			armarioNombre_5035Parser = parser;
		}
		return armarioNombre_5035Parser;
	}

	/**
	 * @generated
	 */
	private IParser comunicacionNombre_5036Parser;

	/**
	 * @generated
	 */
	private IParser getComunicacionNombre_5036Parser() {
		if (comunicacionNombre_5036Parser == null) {
			EAttribute[] features = new EAttribute[] { CorePackage.eINSTANCE
					.getElementoModelo_Nombre() };
			gestionmodelosconsultas.diagram_PROYECCION.parsers.MessageFormatParser parser = new gestionmodelosconsultas.diagram_PROYECCION.parsers.MessageFormatParser(
					features);
			comunicacionNombre_5036Parser = parser;
		}
		return comunicacionNombre_5036Parser;
	}

	/**
	 * @generated
	 */
	private IParser contactoNombre_5037Parser;

	/**
	 * @generated
	 */
	private IParser getContactoNombre_5037Parser() {
		if (contactoNombre_5037Parser == null) {
			EAttribute[] features = new EAttribute[] { CorePackage.eINSTANCE
					.getElementoModelo_Nombre() };
			gestionmodelosconsultas.diagram_PROYECCION.parsers.MessageFormatParser parser = new gestionmodelosconsultas.diagram_PROYECCION.parsers.MessageFormatParser(
					features);
			contactoNombre_5037Parser = parser;
		}
		return contactoNombre_5037Parser;
	}

	/**
	 * @generated
	 */
	private IParser depositoNombre_5038Parser;

	/**
	 * @generated
	 */
	private IParser getDepositoNombre_5038Parser() {
		if (depositoNombre_5038Parser == null) {
			EAttribute[] features = new EAttribute[] { CorePackage.eINSTANCE
					.getElementoModelo_Nombre() };
			gestionmodelosconsultas.diagram_PROYECCION.parsers.MessageFormatParser parser = new gestionmodelosconsultas.diagram_PROYECCION.parsers.MessageFormatParser(
					features);
			depositoNombre_5038Parser = parser;
		}
		return depositoNombre_5038Parser;
	}

	/**
	 * @generated
	 */
	private IParser discoNombre_5039Parser;

	/**
	 * @generated
	 */
	private IParser getDiscoNombre_5039Parser() {
		if (discoNombre_5039Parser == null) {
			EAttribute[] features = new EAttribute[] { CorePackage.eINSTANCE
					.getElementoModelo_Nombre() };
			gestionmodelosconsultas.diagram_PROYECCION.parsers.MessageFormatParser parser = new gestionmodelosconsultas.diagram_PROYECCION.parsers.MessageFormatParser(
					features);
			discoNombre_5039Parser = parser;
		}
		return discoNombre_5039Parser;
	}

	/**
	 * @generated
	 */
	private IParser instanciaProcesoNombre_5040Parser;

	/**
	 * @generated
	 */
	private IParser getInstanciaProcesoNombre_5040Parser() {
		if (instanciaProcesoNombre_5040Parser == null) {
			EAttribute[] features = new EAttribute[] { CorePackage.eINSTANCE
					.getElementoModelo_Nombre() };
			gestionmodelosconsultas.diagram_PROYECCION.parsers.MessageFormatParser parser = new gestionmodelosconsultas.diagram_PROYECCION.parsers.MessageFormatParser(
					features);
			instanciaProcesoNombre_5040Parser = parser;
		}
		return instanciaProcesoNombre_5040Parser;
	}

	/**
	 * @generated
	 */
	private IParser quienNombre_5041Parser;

	/**
	 * @generated
	 */
	private IParser getQuienNombre_5041Parser() {
		if (quienNombre_5041Parser == null) {
			EAttribute[] features = new EAttribute[] { CorePackage.eINSTANCE
					.getElementoModelo_Nombre() };
			gestionmodelosconsultas.diagram_PROYECCION.parsers.MessageFormatParser parser = new gestionmodelosconsultas.diagram_PROYECCION.parsers.MessageFormatParser(
					features);
			quienNombre_5041Parser = parser;
		}
		return quienNombre_5041Parser;
	}

	/**
	 * @generated
	 */
	private IParser rolNombre_5042Parser;

	/**
	 * @generated
	 */
	private IParser getRolNombre_5042Parser() {
		if (rolNombre_5042Parser == null) {
			EAttribute[] features = new EAttribute[] { CorePackage.eINSTANCE
					.getElementoModelo_Nombre() };
			gestionmodelosconsultas.diagram_PROYECCION.parsers.MessageFormatParser parser = new gestionmodelosconsultas.diagram_PROYECCION.parsers.MessageFormatParser(
					features);
			rolNombre_5042Parser = parser;
		}
		return rolNombre_5042Parser;
	}

	/**
	 * @generated
	 */
	private IParser fechaNombre_5043Parser;

	/**
	 * @generated
	 */
	private IParser getFechaNombre_5043Parser() {
		if (fechaNombre_5043Parser == null) {
			EAttribute[] features = new EAttribute[] { CorePackage.eINSTANCE
					.getElementoModelo_Nombre() };
			gestionmodelosconsultas.diagram_PROYECCION.parsers.MessageFormatParser parser = new gestionmodelosconsultas.diagram_PROYECCION.parsers.MessageFormatParser(
					features);
			fechaNombre_5043Parser = parser;
		}
		return fechaNombre_5043Parser;
	}

	/**
	 * @generated
	 */
	private IParser fechaDia_5044Parser;

	/**
	 * @generated
	 */
	private IParser getFechaDia_5044Parser() {
		if (fechaDia_5044Parser == null) {
			EAttribute[] features = new EAttribute[] { TimePackage.eINSTANCE
					.getFecha_Dia() };
			gestionmodelosconsultas.diagram_PROYECCION.parsers.MessageFormatParser parser = new gestionmodelosconsultas.diagram_PROYECCION.parsers.MessageFormatParser(
					features);
			fechaDia_5044Parser = parser;
		}
		return fechaDia_5044Parser;
	}

	/**
	 * @generated
	 */
	private IParser fechaMes_5045Parser;

	/**
	 * @generated
	 */
	private IParser getFechaMes_5045Parser() {
		if (fechaMes_5045Parser == null) {
			EAttribute[] features = new EAttribute[] { TimePackage.eINSTANCE
					.getFecha_Mes() };
			gestionmodelosconsultas.diagram_PROYECCION.parsers.MessageFormatParser parser = new gestionmodelosconsultas.diagram_PROYECCION.parsers.MessageFormatParser(
					features);
			fechaMes_5045Parser = parser;
		}
		return fechaMes_5045Parser;
	}

	/**
	 * @generated
	 */
	private IParser fechaAno_5046Parser;

	/**
	 * @generated
	 */
	private IParser getFechaAno_5046Parser() {
		if (fechaAno_5046Parser == null) {
			EAttribute[] features = new EAttribute[] { TimePackage.eINSTANCE
					.getFecha_Ano() };
			gestionmodelosconsultas.diagram_PROYECCION.parsers.MessageFormatParser parser = new gestionmodelosconsultas.diagram_PROYECCION.parsers.MessageFormatParser(
					features);
			fechaAno_5046Parser = parser;
		}
		return fechaAno_5046Parser;
	}

	/**
	 * @generated
	 */
	private IParser campoNombreCampo_5001Parser;

	/**
	 * @generated
	 */
	private IParser getCampoNombreCampo_5001Parser() {
		if (campoNombreCampo_5001Parser == null) {
			EAttribute editableFeature = ModelPackage.eINSTANCE
					.getCampo_NombreCampo();
			EnumParser parser = new EnumParser(editableFeature);
			campoNombreCampo_5001Parser = parser;
		}
		return campoNombreCampo_5001Parser;
	}

	/**
	 * @generated
	 */
	private IParser campoNombreCampo_5003Parser;

	/**
	 * @generated
	 */
	private IParser getCampoNombreCampo_5003Parser() {
		if (campoNombreCampo_5003Parser == null) {
			EAttribute editableFeature = ModelPackage.eINSTANCE
					.getCampo_NombreCampo();
			EnumParser parser = new EnumParser(editableFeature);
			campoNombreCampo_5003Parser = parser;
		}
		return campoNombreCampo_5003Parser;
	}

	/**
	 * @generated
	 */
	private IParser campoNombreCampo_5005Parser;

	/**
	 * @generated
	 */
	private IParser getCampoNombreCampo_5005Parser() {
		if (campoNombreCampo_5005Parser == null) {
			EAttribute editableFeature = ModelPackage.eINSTANCE
					.getCampo_NombreCampo();
			EnumParser parser = new EnumParser(editableFeature);
			campoNombreCampo_5005Parser = parser;
		}
		return campoNombreCampo_5005Parser;
	}

	/**
	 * @generated
	 */
	private IParser campoNombreCampo_5007Parser;

	/**
	 * @generated
	 */
	private IParser getCampoNombreCampo_5007Parser() {
		if (campoNombreCampo_5007Parser == null) {
			EAttribute editableFeature = ModelPackage.eINSTANCE
					.getCampo_NombreCampo();
			EnumParser parser = new EnumParser(editableFeature);
			campoNombreCampo_5007Parser = parser;
		}
		return campoNombreCampo_5007Parser;
	}

	/**
	 * @generated
	 */
	private IParser campoNombreCampo_5009Parser;

	/**
	 * @generated
	 */
	private IParser getCampoNombreCampo_5009Parser() {
		if (campoNombreCampo_5009Parser == null) {
			EAttribute editableFeature = ModelPackage.eINSTANCE
					.getCampo_NombreCampo();
			EnumParser parser = new EnumParser(editableFeature);
			campoNombreCampo_5009Parser = parser;
		}
		return campoNombreCampo_5009Parser;
	}

	/**
	 * @generated
	 */
	private IParser campoNombreCampo_5011Parser;

	/**
	 * @generated
	 */
	private IParser getCampoNombreCampo_5011Parser() {
		if (campoNombreCampo_5011Parser == null) {
			EAttribute editableFeature = ModelPackage.eINSTANCE
					.getCampo_NombreCampo();
			EnumParser parser = new EnumParser(editableFeature);
			campoNombreCampo_5011Parser = parser;
		}
		return campoNombreCampo_5011Parser;
	}

	/**
	 * @generated
	 */
	private IParser campoNombreCampo_5013Parser;

	/**
	 * @generated
	 */
	private IParser getCampoNombreCampo_5013Parser() {
		if (campoNombreCampo_5013Parser == null) {
			EAttribute editableFeature = ModelPackage.eINSTANCE
					.getCampo_NombreCampo();
			EnumParser parser = new EnumParser(editableFeature);
			campoNombreCampo_5013Parser = parser;
		}
		return campoNombreCampo_5013Parser;
	}

	/**
	 * @generated
	 */
	private IParser campoNombreCampo_5015Parser;

	/**
	 * @generated
	 */
	private IParser getCampoNombreCampo_5015Parser() {
		if (campoNombreCampo_5015Parser == null) {
			EAttribute editableFeature = ModelPackage.eINSTANCE
					.getCampo_NombreCampo();
			EnumParser parser = new EnumParser(editableFeature);
			campoNombreCampo_5015Parser = parser;
		}
		return campoNombreCampo_5015Parser;
	}

	/**
	 * @generated
	 */
	private IParser campoNombreCampo_5017Parser;

	/**
	 * @generated
	 */
	private IParser getCampoNombreCampo_5017Parser() {
		if (campoNombreCampo_5017Parser == null) {
			EAttribute editableFeature = ModelPackage.eINSTANCE
					.getCampo_NombreCampo();
			EnumParser parser = new EnumParser(editableFeature);
			campoNombreCampo_5017Parser = parser;
		}
		return campoNombreCampo_5017Parser;
	}

	/**
	 * @generated
	 */
	private IParser campoNombreCampo_5019Parser;

	/**
	 * @generated
	 */
	private IParser getCampoNombreCampo_5019Parser() {
		if (campoNombreCampo_5019Parser == null) {
			EAttribute editableFeature = ModelPackage.eINSTANCE
					.getCampo_NombreCampo();
			EnumParser parser = new EnumParser(editableFeature);
			campoNombreCampo_5019Parser = parser;
		}
		return campoNombreCampo_5019Parser;
	}

	/**
	 * @generated
	 */
	private IParser campoNombreCampo_5021Parser;

	/**
	 * @generated
	 */
	private IParser getCampoNombreCampo_5021Parser() {
		if (campoNombreCampo_5021Parser == null) {
			EAttribute editableFeature = ModelPackage.eINSTANCE
					.getCampo_NombreCampo();
			EnumParser parser = new EnumParser(editableFeature);
			campoNombreCampo_5021Parser = parser;
		}
		return campoNombreCampo_5021Parser;
	}

	/**
	 * @generated
	 */
	private IParser campoNombreCampo_5023Parser;

	/**
	 * @generated
	 */
	private IParser getCampoNombreCampo_5023Parser() {
		if (campoNombreCampo_5023Parser == null) {
			EAttribute editableFeature = ModelPackage.eINSTANCE
					.getCampo_NombreCampo();
			EnumParser parser = new EnumParser(editableFeature);
			campoNombreCampo_5023Parser = parser;
		}
		return campoNombreCampo_5023Parser;
	}

	/**
	 * @generated
	 */
	protected IParser getParser(int visualID) {
		switch (visualID) {
		case gestionmodelosconsultas.diagram_PROYECCION.edit.parts.UnidadOrganizacionalNombreEditPart.VISUAL_ID:
			return getUnidadOrganizacionalNombre_5031Parser();
		case gestionmodelosconsultas.diagram_PROYECCION.edit.parts.DocumentoNombreEditPart.VISUAL_ID:
			return getDocumentoNombre_5032Parser();
		case gestionmodelosconsultas.diagram_PROYECCION.edit.parts.ActividadNombreEditPart.VISUAL_ID:
			return getActividadNombre_5033Parser();
		case gestionmodelosconsultas.diagram_PROYECCION.edit.parts.ActorNombreEditPart.VISUAL_ID:
			return getActorNombre_5034Parser();
		case gestionmodelosconsultas.diagram_PROYECCION.edit.parts.ArmarioNombreEditPart.VISUAL_ID:
			return getArmarioNombre_5035Parser();
		case gestionmodelosconsultas.diagram_PROYECCION.edit.parts.ComunicacionNombreEditPart.VISUAL_ID:
			return getComunicacionNombre_5036Parser();
		case gestionmodelosconsultas.diagram_PROYECCION.edit.parts.ContactoNombreEditPart.VISUAL_ID:
			return getContactoNombre_5037Parser();
		case gestionmodelosconsultas.diagram_PROYECCION.edit.parts.DepositoNombreEditPart.VISUAL_ID:
			return getDepositoNombre_5038Parser();
		case gestionmodelosconsultas.diagram_PROYECCION.edit.parts.DiscoNombreEditPart.VISUAL_ID:
			return getDiscoNombre_5039Parser();
		case gestionmodelosconsultas.diagram_PROYECCION.edit.parts.InstanciaProcesoNombreEditPart.VISUAL_ID:
			return getInstanciaProcesoNombre_5040Parser();
		case gestionmodelosconsultas.diagram_PROYECCION.edit.parts.QuienNombreEditPart.VISUAL_ID:
			return getQuienNombre_5041Parser();
		case gestionmodelosconsultas.diagram_PROYECCION.edit.parts.RolNombreEditPart.VISUAL_ID:
			return getRolNombre_5042Parser();
		case gestionmodelosconsultas.diagram_PROYECCION.edit.parts.FechaNombreEditPart.VISUAL_ID:
			return getFechaNombre_5043Parser();
		case gestionmodelosconsultas.diagram_PROYECCION.edit.parts.FechaDiaEditPart.VISUAL_ID:
			return getFechaDia_5044Parser();
		case gestionmodelosconsultas.diagram_PROYECCION.edit.parts.FechaMesEditPart.VISUAL_ID:
			return getFechaMes_5045Parser();
		case gestionmodelosconsultas.diagram_PROYECCION.edit.parts.FechaAnoEditPart.VISUAL_ID:
			return getFechaAno_5046Parser();

		case gestionmodelosconsultas.diagram_PROYECCION.edit.parts.CampoNombreCampoEditPart.VISUAL_ID:
			return getCampoNombreCampo_5001Parser();

		case gestionmodelosconsultas.diagram_PROYECCION.edit.parts.CampoNombreCampo2EditPart.VISUAL_ID:
			return getCampoNombreCampo_5003Parser();

		case gestionmodelosconsultas.diagram_PROYECCION.edit.parts.CampoNombreCampo3EditPart.VISUAL_ID:
			return getCampoNombreCampo_5005Parser();

		case gestionmodelosconsultas.diagram_PROYECCION.edit.parts.CampoNombreCampo4EditPart.VISUAL_ID:
			return getCampoNombreCampo_5007Parser();

		case gestionmodelosconsultas.diagram_PROYECCION.edit.parts.CampoNombreCampo5EditPart.VISUAL_ID:
			return getCampoNombreCampo_5009Parser();

		case gestionmodelosconsultas.diagram_PROYECCION.edit.parts.CampoNombreCampo6EditPart.VISUAL_ID:
			return getCampoNombreCampo_5011Parser();

		case gestionmodelosconsultas.diagram_PROYECCION.edit.parts.CampoNombreCampo7EditPart.VISUAL_ID:
			return getCampoNombreCampo_5013Parser();

		case gestionmodelosconsultas.diagram_PROYECCION.edit.parts.CampoNombreCampo8EditPart.VISUAL_ID:
			return getCampoNombreCampo_5015Parser();

		case gestionmodelosconsultas.diagram_PROYECCION.edit.parts.CampoNombreCampo9EditPart.VISUAL_ID:
			return getCampoNombreCampo_5017Parser();

		case gestionmodelosconsultas.diagram_PROYECCION.edit.parts.CampoNombreCampo10EditPart.VISUAL_ID:
			return getCampoNombreCampo_5019Parser();

		case gestionmodelosconsultas.diagram_PROYECCION.edit.parts.CampoNombreCampo11EditPart.VISUAL_ID:
			return getCampoNombreCampo_5021Parser();

		case gestionmodelosconsultas.diagram_PROYECCION.edit.parts.CampoNombreCampo12EditPart.VISUAL_ID:
			return getCampoNombreCampo_5023Parser();
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
			return getParser(gestionmodelosconsultas.diagram_PROYECCION.part.GestionModelosConsultasVisualIDRegistry
					.getVisualID(vid));
		}
		View view = (View) hint.getAdapter(View.class);
		if (view != null) {
			return getParser(gestionmodelosconsultas.diagram_PROYECCION.part.GestionModelosConsultasVisualIDRegistry
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
			if (gestionmodelosconsultas.diagram_PROYECCION.providers.GestionModelosConsultasElementTypes
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
