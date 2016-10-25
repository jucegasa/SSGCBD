package gestionmodelosconsultas.diagram_ENTITY.edit.commands;

import gestionmodelosconsultas.entitymodel.DiagramEntity;
import gestionmodelosconsultas.entitymodel.Entity;
import gestionmodelosconsultas.entitymodel.SimpleRelation;

import org.eclipse.core.commands.ExecutionException;
import org.eclipse.core.runtime.IAdaptable;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.gmf.runtime.common.core.command.CommandResult;
import org.eclipse.gmf.runtime.emf.type.core.commands.EditElementCommand;
import org.eclipse.gmf.runtime.emf.type.core.requests.ReorientRelationshipRequest;

/**
 * @generated
 */
public class SimpleRelationReorientCommand extends EditElementCommand {

	/**
	 * @generated
	 */
	private final int reorientDirection;

	/**
	 * @generated
	 */
	private final EObject oldEnd;

	/**
	 * @generated
	 */
	private final EObject newEnd;

	/**
	 * @generated
	 */
	public SimpleRelationReorientCommand(ReorientRelationshipRequest request) {
		super(request.getLabel(), request.getRelationship(), request);
		reorientDirection = request.getDirection();
		oldEnd = request.getOldRelationshipEnd();
		newEnd = request.getNewRelationshipEnd();
	}

	/**
	 * @generated
	 */
	public boolean canExecute() {
		if (false == getElementToEdit() instanceof SimpleRelation) {
			return false;
		}
		if (reorientDirection == ReorientRelationshipRequest.REORIENT_SOURCE) {
			return canReorientSource();
		}
		if (reorientDirection == ReorientRelationshipRequest.REORIENT_TARGET) {
			return canReorientTarget();
		}
		return false;
	}

	/**
	 * @generated
	 */
	protected boolean canReorientSource() {
		if (!(oldEnd instanceof Entity && newEnd instanceof Entity)) {
			return false;
		}
		Entity target = getLink().getTarget();
		if (!(getLink().eContainer() instanceof DiagramEntity)) {
			return false;
		}
		DiagramEntity container = (DiagramEntity) getLink().eContainer();
		return gestionmodelosconsultas.diagram_ENTITY.edit.policies.GestionModelosConsultasBaseItemSemanticEditPolicy
				.getLinkConstraints().canExistSimpleRelation_4001(container,
						getLink(), getNewSource(), target);
	}

	/**
	 * @generated
	 */
	protected boolean canReorientTarget() {
		if (!(oldEnd instanceof Entity && newEnd instanceof Entity)) {
			return false;
		}
		Entity source = getLink().getSource();
		if (!(getLink().eContainer() instanceof DiagramEntity)) {
			return false;
		}
		DiagramEntity container = (DiagramEntity) getLink().eContainer();
		return gestionmodelosconsultas.diagram_ENTITY.edit.policies.GestionModelosConsultasBaseItemSemanticEditPolicy
				.getLinkConstraints().canExistSimpleRelation_4001(container,
						getLink(), source, getNewTarget());
	}

	/**
	 * @generated
	 */
	protected CommandResult doExecuteWithResult(IProgressMonitor monitor,
			IAdaptable info) throws ExecutionException {
		if (!canExecute()) {
			throw new ExecutionException(
					"Invalid arguments in reorient link command"); //$NON-NLS-1$
		}
		if (reorientDirection == ReorientRelationshipRequest.REORIENT_SOURCE) {
			return reorientSource();
		}
		if (reorientDirection == ReorientRelationshipRequest.REORIENT_TARGET) {
			return reorientTarget();
		}
		throw new IllegalStateException();
	}

	/**
	 * @generated
	 */
	protected CommandResult reorientSource() throws ExecutionException {
		getLink().setSource(getNewSource());
		return CommandResult.newOKCommandResult(getLink());
	}

	/**
	 * @generated
	 */
	protected CommandResult reorientTarget() throws ExecutionException {
		getLink().setTarget(getNewTarget());
		return CommandResult.newOKCommandResult(getLink());
	}

	/**
	 * @generated
	 */
	protected SimpleRelation getLink() {
		return (SimpleRelation) getElementToEdit();
	}

	/**
	 * @generated
	 */
	protected Entity getOldSource() {
		return (Entity) oldEnd;
	}

	/**
	 * @generated
	 */
	protected Entity getNewSource() {
		return (Entity) newEnd;
	}

	/**
	 * @generated
	 */
	protected Entity getOldTarget() {
		return (Entity) oldEnd;
	}

	/**
	 * @generated
	 */
	protected Entity getNewTarget() {
		return (Entity) newEnd;
	}
}
