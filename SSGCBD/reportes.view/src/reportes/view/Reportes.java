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
import org.eclipse.swt.widgets.Group;

public class Reportes extends ViewPart {

	public static final String ID = "reportes.view.Reportes"; //$NON-NLS-1$
	private final FormToolkit toolkit = new FormToolkit(Display.getCurrent());

	ModelFactoryModel modelFactoryModel = ModelFactoryModel.getInstance();

	ModelFactory modelFactory;
	
	DataformGenerator dfGenerator;
	
	DataformDiagramGenerator dfdGenerator; 
	
	ExcelGenerator excelGenarator;
	
	whoownme.model.ModelFactoryModel modelFactoryModelGC = whoownme.model.ModelFactoryModel.getInstance();
	
	gestionmodelosconsultas.ModelFactory modelFactoryGC;
	
	String fileName;
	
	String filePath; 

	
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
		btnGenerarReporte.setBounds(30, 324, 120, 25);
		
		Button btnNewButton = new Button(container, SWT.NONE);
		btnNewButton.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) {
				ViewModelGenerator vmGenerator = new ViewModelGenerator( dfGenerator.getListComboBox());
				vmGenerator.generateViewModel();
			}
		});
		btnNewButton.setBounds(189, 324, 129, 25);
		toolkit.adapt(btnNewButton, true, true);
		btnNewButton.setText("Generar ViewModel");
		
		Group grpCicloDeVida = new Group(container, SWT.NONE);
		grpCicloDeVida.setText("Ciclo de vida del Reporte");
		grpCicloDeVida.setBounds(10, 10, 500, 153);
		toolkit.adapt(grpCicloDeVida);
		toolkit.paintBordersFor(grpCicloDeVida);
		
		Button btnGenerardataform = new Button(grpCicloDeVida, SWT.NONE);
		btnGenerardataform.setBounds(23, 43, 120, 25);
		btnGenerardataform.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) {
				JFileChooser file=new JFileChooser();
				file.showOpenDialog(null);
				fileName = file.getSelectedFile().getName();
				filePath = file.getSelectedFile().getAbsolutePath();
				Unzip unzip = new Unzip();
				unzip.unzip(filePath, fileName);
				String url = unzip.getDir(fileName);
				dfGenerator = new DataformGenerator(url, filePath);
				
				try {
					dfGenerator.generate();
					JOptionPane.showMessageDialog(null,"Se genero el Dataform");
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
		toolkit.adapt(btnGenerardataform, true, true);
		btnGenerardataform.setText("GenerarDataform");
		
		Button btnGenerarDiagrama = new Button(grpCicloDeVida, SWT.NONE);
		btnGenerarDiagrama.setBounds(185, 43, 107, 25);
		btnGenerarDiagrama.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) {
				
				dfdGenerator = new DataformDiagramGenerator(dfGenerator.modelFactory);
				dfdGenerator.generateDiagram();
			}
		});
		toolkit.adapt(btnGenerarDiagrama, true, true);
		btnGenerarDiagrama.setText("Generar Diagrama");
		
		Button btnCompilar = new Button(grpCicloDeVida, SWT.NONE);
		btnCompilar.setBounds(326, 43, 107, 25);
		btnCompilar.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) {
				
				modelFactoryGC = modelFactoryGC.cargar();
				modelFactoryModelGC.setModelFactory(modelFactoryGC);
				CompiladorProyeccion compiladorProyeccion = new CompiladorProyeccion();
				compiladorProyeccion.compilarProyeccion(modelFactoryGC);
			}
		});
		toolkit.adapt(btnCompilar, true, true);
		btnCompilar.setText("Compilar");
		
		Button btnGenetarExcel = new Button(grpCicloDeVida, SWT.NONE);
		btnGenetarExcel.setBounds(185, 105, 107, 25);
		btnGenetarExcel.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) {
				
				try {
					excelGenarator.createDataSheet();
					excelGenarator.createRelations(dfGenerator.getPosRowIniData(), dfGenerator.getPosCellIniData());
				} catch (IOException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
			}
		});
		toolkit.adapt(btnGenetarExcel, true, true);
		btnGenetarExcel.setText("Genetar Excel");
		
		Button btnNewButton_1 = new Button(grpCicloDeVida, SWT.NONE);
		btnNewButton_1.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) {
				
				try {
					excelGenarator = new ExcelGenerator(filePath, dfGenerator.getListComboBox(), 
							dfGenerator.getListComboCordinate(), modelFactoryGC);
					
					excelGenarator.writeFileColumns();
					
					JOptionPane.showConfirmDialog(null, "Puede ver las columnas del resultado de la consulta en el archivo Excel.");
					
				} catch (IOException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
			}
		});
		btnNewButton_1.setBounds(23, 105, 120, 25);
		toolkit.adapt(btnNewButton_1, true, true);
		btnNewButton_1.setText("Ver Columnas");
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
