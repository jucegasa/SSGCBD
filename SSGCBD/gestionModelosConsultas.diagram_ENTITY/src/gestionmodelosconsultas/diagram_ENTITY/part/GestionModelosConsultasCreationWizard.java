package gestionmodelosconsultas.diagram_ENTITY.part;

import java.lang.reflect.InvocationTargetException;

import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.jface.dialogs.ErrorDialog;
import org.eclipse.jface.operation.IRunnableWithProgress;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.jface.wizard.Wizard;
import org.eclipse.ui.INewWizard;
import org.eclipse.ui.IWorkbench;
import org.eclipse.ui.PartInitException;
import org.eclipse.ui.actions.WorkspaceModifyOperation;

/**
 * @generated
 */
public class GestionModelosConsultasCreationWizard extends Wizard implements
		INewWizard {

	/**
	 * @generated
	 */
	private IWorkbench workbench;

	/**
	 * @generated
	 */
	protected IStructuredSelection selection;

	/**
	 * @generated
	 */
	protected gestionmodelosconsultas.diagram_ENTITY.part.GestionModelosConsultasCreationWizardPage diagramModelFilePage;

	/**
	 * @generated
	 */
	protected gestionmodelosconsultas.diagram_ENTITY.part.GestionModelosConsultasCreationWizardPage domainModelFilePage;

	/**
	 * @generated
	 */
	protected Resource diagram;

	/**
	 * @generated
	 */
	private boolean openNewlyCreatedDiagramEditor = true;

	/**
	 * @generated
	 */
	public IWorkbench getWorkbench() {
		return workbench;
	}

	/**
	 * @generated
	 */
	public IStructuredSelection getSelection() {
		return selection;
	}

	/**
	 * @generated
	 */
	public final Resource getDiagram() {
		return diagram;
	}

	/**
	 * @generated
	 */
	public final boolean isOpenNewlyCreatedDiagramEditor() {
		return openNewlyCreatedDiagramEditor;
	}

	/**
	 * @generated
	 */
	public void setOpenNewlyCreatedDiagramEditor(
			boolean openNewlyCreatedDiagramEditor) {
		this.openNewlyCreatedDiagramEditor = openNewlyCreatedDiagramEditor;
	}

	/**
	 * @generated
	 */
	public void init(IWorkbench workbench, IStructuredSelection selection) {
		this.workbench = workbench;
		this.selection = selection;
		setWindowTitle(gestionmodelosconsultas.diagram_ENTITY.part.Messages.GestionModelosConsultasCreationWizardTitle);
		setDefaultPageImageDescriptor(gestionmodelosconsultas.diagram_ENTITY.part.GestionModelosConsultasDiagramEditorPlugin
				.getBundledImageDescriptor("icons/wizban/NewEntitymodelWizard.gif")); //$NON-NLS-1$
		setNeedsProgressMonitor(true);
	}

	/**
	 * @generated
	 */
	public void addPages() {
		diagramModelFilePage = new gestionmodelosconsultas.diagram_ENTITY.part.GestionModelosConsultasCreationWizardPage(
				"DiagramModelFile", getSelection(), "gestionmodelosconsultas_diagram_ENTITY"); //$NON-NLS-1$ //$NON-NLS-2$
		diagramModelFilePage
				.setTitle(gestionmodelosconsultas.diagram_ENTITY.part.Messages.GestionModelosConsultasCreationWizard_DiagramModelFilePageTitle);
		diagramModelFilePage
				.setDescription(gestionmodelosconsultas.diagram_ENTITY.part.Messages.GestionModelosConsultasCreationWizard_DiagramModelFilePageDescription);
		addPage(diagramModelFilePage);

		domainModelFilePage = new gestionmodelosconsultas.diagram_ENTITY.part.GestionModelosConsultasCreationWizardPage(
				"DomainModelFile", getSelection(), "gestionmodelosconsultas") { //$NON-NLS-1$ //$NON-NLS-2$

			public void setVisible(boolean visible) {
				if (visible) {
					String fileName = diagramModelFilePage.getFileName();
					fileName = fileName
							.substring(
									0,
									fileName.length()
											- ".gestionmodelosconsultas_diagram_ENTITY".length()); //$NON-NLS-1$
					setFileName(gestionmodelosconsultas.diagram_ENTITY.part.GestionModelosConsultasDiagramEditorUtil
							.getUniqueFileName(getContainerFullPath(),
									fileName, "gestionmodelosconsultas")); //$NON-NLS-1$
				}
				super.setVisible(visible);
			}
		};
		domainModelFilePage
				.setTitle(gestionmodelosconsultas.diagram_ENTITY.part.Messages.GestionModelosConsultasCreationWizard_DomainModelFilePageTitle);
		domainModelFilePage
				.setDescription(gestionmodelosconsultas.diagram_ENTITY.part.Messages.GestionModelosConsultasCreationWizard_DomainModelFilePageDescription);
		addPage(domainModelFilePage);
	}

	/**
	 * @generated
	 */
	public boolean performFinish() {
		IRunnableWithProgress op = new WorkspaceModifyOperation(null) {

			protected void execute(IProgressMonitor monitor)
					throws CoreException, InterruptedException {
				diagram = gestionmodelosconsultas.diagram_ENTITY.part.GestionModelosConsultasDiagramEditorUtil
						.createDiagram(diagramModelFilePage.getURI(),
								domainModelFilePage.getURI(), monitor);
				if (isOpenNewlyCreatedDiagramEditor() && diagram != null) {
					try {
						gestionmodelosconsultas.diagram_ENTITY.part.GestionModelosConsultasDiagramEditorUtil
								.openDiagram(diagram);
					} catch (PartInitException e) {
						ErrorDialog
								.openError(
										getContainer().getShell(),
										gestionmodelosconsultas.diagram_ENTITY.part.Messages.GestionModelosConsultasCreationWizardOpenEditorError,
										null, e.getStatus());
					}
				}
			}
		};
		try {
			getContainer().run(false, true, op);
		} catch (InterruptedException e) {
			return false;
		} catch (InvocationTargetException e) {
			if (e.getTargetException() instanceof CoreException) {
				ErrorDialog
						.openError(
								getContainer().getShell(),
								gestionmodelosconsultas.diagram_ENTITY.part.Messages.GestionModelosConsultasCreationWizardCreationError,
								null, ((CoreException) e.getTargetException())
										.getStatus());
			} else {
				gestionmodelosconsultas.diagram_ENTITY.part.GestionModelosConsultasDiagramEditorPlugin
						.getInstance()
						.logError(
								"Error creating diagram", e.getTargetException()); //$NON-NLS-1$
			}
			return false;
		}
		return diagram != null;
	}
}
