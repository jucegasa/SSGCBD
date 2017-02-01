package reportes.view;

import java.io.IOException;

import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.xml.parsers.ParserConfigurationException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.eclipse.emf.common.util.EList;
import org.eclipse.jface.action.IMenuManager;
import org.eclipse.jface.action.IToolBarManager;
import org.eclipse.swt.SWT;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Display;
import org.eclipse.ui.forms.widgets.FormToolkit;
import org.eclipse.ui.part.ViewPart;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.events.SelectionAdapter;
import org.eclipse.swt.events.SelectionEvent;
import org.xml.sax.SAXException;

import gestionmodelosconsultas.compilador.CompiladorProyeccion;
import gestionmodelosconsultas.modeloconsultas.model.Relacion;
import reportes.ModelFactory;
import reportes.model.ModelFactoryModel;
import reportes.ui.impl.ReporteImpl;
import tooldataform.formmodel.concreta.RelacionDataForm;

public class Reportes extends ViewPart {

	public static final String ID = "reportes.view.Reportes"; //$NON-NLS-1$
	private final FormToolkit toolkit = new FormToolkit(Display.getCurrent());

	ModelFactoryModel modelFactoryModel = ModelFactoryModel.getInstance();

	ModelFactory modelFactory;
	
	DataformGenerator dfGenerator;
	
	DataformDiagramGenerator dfdGenerator; 
	
	whoownme.model.ModelFactoryModel modelFactoryModelGC = whoownme.model.ModelFactoryModel.getInstance();
	
	gestionmodelosconsultas.ModelFactory modelFactoryGC;

	
	public Reportes() {
		inicializar();
	}
	
	public void inicializar() {
		modelFactory = modelFactoryModel.getModelFactory();
		modelFactoryGC = modelFactoryModelGC.getModelFactory();
	}

	/**
	 * Create contents of the view part.
	 * @param parent
	 */
	@Override
	public void createPartControl(Composite parent) {
		Composite container = toolkit.createComposite(parent, SWT.NONE);
		toolkit.paintBordersFor(container);
		
		Button btnGenerarReporte = toolkit.createButton(container, "Generar Reporte", SWT.NONE);
		btnGenerarReporte.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) {
				modelFactory = modelFactory.cargar();
				modelFactoryModel.setModelFactory(modelFactory);
				ReporteImpl reporteView = (ReporteImpl) modelFactory.getTheUI().getTheReporte();
				try {
					reporteView.generarReporte();
					GenerateCode generateCode = new GenerateCode();
					generateCode.getNamesViewModel();
					generateCode.crearViewModels();
					generateCode.compilarConsulta();
					//generateCode.copiarResultado();
					JOptionPane.showMessageDialog(null, "Se ejecuto la consulta");
					modelFactory.copiarProducciones();
					JOptionPane.showMessageDialog(null, "Se ha generado el reporte");
				} catch (IOException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
			}
		});
		btnGenerarReporte.setBounds(30, 132, 120, 25);
		
		Button btnGenerardataform = new Button(container, SWT.NONE);
		btnGenerardataform.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) {
				 JFileChooser file=new JFileChooser();
				   file.showOpenDialog(null);
				   String s = file.getSelectedFile().getName();
				   String root = file.getSelectedFile().getAbsolutePath();
				   Unzip unzip = new Unzip();
				   unzip.unzip(root,s);
				   String url = unzip.getDir(s);
				   dfGenerator = new DataformGenerator(url,root);
				try {
					dfGenerator.generate();
					JOptionPane.showMessageDialog(null,"se genero");
				} catch (ParserConfigurationException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				} catch (SAXException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				} catch (IOException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				} catch (EncryptedDocumentException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				} catch (InvalidFormatException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
			}
		});
		btnGenerardataform.setBounds(30, 30, 120, 25);
		toolkit.adapt(btnGenerardataform, true, true);
		btnGenerardataform.setText("GenerarDataform");
		
		Button btnGenerarDiagrama = new Button(container, SWT.NONE);
		btnGenerarDiagrama.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) {
				
				dfdGenerator = new DataformDiagramGenerator(dfGenerator.modelFactory);
				dfdGenerator.generateDiagram();
			}
		});
		btnGenerarDiagrama.setBounds(175, 30, 107, 25);
		toolkit.adapt(btnGenerarDiagrama, true, true);
		btnGenerarDiagrama.setText("Generar Diagrama");
		
		Button btnGenetarExcel = new Button(container, SWT.NONE);
		btnGenetarExcel.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) {
				
				JFileChooser file=new JFileChooser();
				file.showOpenDialog(null);
				String s = file.getSelectedFile().getName();
				String root = file.getSelectedFile().getAbsolutePath();
				try {
					ExcelGenerator excelGenarator = new ExcelGenerator(root, dfGenerator.getListComboBox(), 
							dfGenerator.getListComboCordinate(), dfGenerator.getPosRowIniData(), dfGenerator.getPosCellIniData(),modelFactoryGC);
				} catch (IOException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
			}
		});
		btnGenetarExcel.setBounds(241, 98, 101, 25);
		toolkit.adapt(btnGenetarExcel, true, true);
		btnGenetarExcel.setText("Genetar Excel");
		
		Button btnNewButton = new Button(container, SWT.NONE);
		btnNewButton.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) {
				ViewModelGenerator vmGenerator = new ViewModelGenerator( dfGenerator.getListComboBox());
				vmGenerator.generateViewModel();
			}
		});
		btnNewButton.setBounds(298, 30, 129, 25);
		toolkit.adapt(btnNewButton, true, true);
		btnNewButton.setText("Generar ViewModel");
		
		Button btnCompilar = new Button(container, SWT.NONE);
		btnCompilar.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) {
				
				modelFactoryGC = modelFactoryGC.cargar();
				modelFactoryModelGC.setModelFactory(modelFactoryGC);
				CompiladorProyeccion compiladorProyeccion = new CompiladorProyeccion();
				compiladorProyeccion.compilarProyeccion(modelFactoryGC);
			}
		});
		btnCompilar.setBounds(471, 30, 75, 25);
		toolkit.adapt(btnCompilar, true, true);
		btnCompilar.setText("Compilar");
		createActions();
		initializeToolBar();
		initializeMenu();
	}

	public void dispose() {
		toolkit.dispose();
		super.dispose();
	}

	/**
	 * Create the actions.
	 */
	private void createActions() {
		// Create the actions
	}

	/**
	 * Initialize the toolbar.
	 */
	private void initializeToolBar() {
		IToolBarManager tbm = getViewSite().getActionBars().getToolBarManager();
	}

	/**
	 * Initialize the menu.
	 */
	private void initializeMenu() {
		IMenuManager manager = getViewSite().getActionBars().getMenuManager();
	}

	@Override
	public void setFocus() {
		// Set the focus
	}
}
