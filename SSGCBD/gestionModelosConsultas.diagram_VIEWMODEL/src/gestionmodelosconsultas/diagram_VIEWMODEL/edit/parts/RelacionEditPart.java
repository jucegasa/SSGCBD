package gestionmodelosconsultas.diagram_VIEWMODEL.edit.parts;

import org.eclipse.draw2d.Connection;
import org.eclipse.gmf.runtime.diagram.ui.editparts.ConnectionNodeEditPart;
import org.eclipse.gmf.runtime.diagram.ui.editparts.ITreeBranchEditPart;
import org.eclipse.gmf.runtime.diagram.ui.editpolicies.EditPolicyRoles;
import org.eclipse.gmf.runtime.draw2d.ui.figures.PolylineConnectionEx;
import org.eclipse.gmf.runtime.draw2d.ui.figures.WrappingLabel;
import org.eclipse.gmf.runtime.notation.View;

/**
 * @generated
 */
public class RelacionEditPart extends ConnectionNodeEditPart implements
		ITreeBranchEditPart {

	/**
	 * @generated
	 */
	public static final int VISUAL_ID = 4001;

	/**
	 * @generated
	 */
	public RelacionEditPart(View view) {
		super(view);
	}

	/**
	 * @generated
	 */
	protected void createDefaultEditPolicies() {
		super.createDefaultEditPolicies();
		installEditPolicy(
				EditPolicyRoles.SEMANTIC_ROLE,
				new gestionmodelosconsultas.diagram_VIEWMODEL.edit.policies.RelacionItemSemanticEditPolicy());
	}

	/**
	 * Creates figure for this edit part.
	 * 
	 * Body of this method does not depend on settings in generation model
	 * so you may safely remove <i>generated</i> tag and modify it.
	 * 
	 * @generated
	 */

	protected Connection createConnectionFigure() {
		return new RelacionFigure();
	}

	/**
	 * @generated
	 */
	public RelacionFigure getPrimaryShape() {
		return (RelacionFigure) getFigure();
	}

	/**
	 * @generated
	 */
	public class RelacionFigure extends PolylineConnectionEx {

		/**
		 * @generated
		 */
		private WrappingLabel fFigureRelacionNombreFigure;

		/**
		 * @generated
		 */
		public RelacionFigure() {

			createContents();
		}

		/**
		 * @generated
		 */
		private void createContents() {

			fFigureRelacionNombreFigure = new WrappingLabel();

			fFigureRelacionNombreFigure.setText("");

			this.add(fFigureRelacionNombreFigure);

		}

		/**
		 * @generated
		 */
		public WrappingLabel getFigureRelacionNombreFigure() {
			return fFigureRelacionNombreFigure;
		}

	}

}
