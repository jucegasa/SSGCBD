package reportes.view;

import java.io.IOException;
import java.sql.ResultSet;
import java.sql.SQLException;

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

import gestionconsultassqlmodels.generate.conexionBD.DataConnection;
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

	String consulta;
	
	ResultSet rs;
	
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
		
		Group grpCicloDeVida = new Group(container, SWT.NONE);
		grpCicloDeVida.setText("Ciclo de vida del Reporte");
		grpCicloDeVida.setBounds(10, 10, 500, 153);
		toolkit.adapt(grpCicloDeVida);
		toolkit.paintBordersFor(grpCicloDeVida);
		
		Button btnGenerardataform = new Button(grpCicloDeVida, SWT.NONE);
		btnGenerardataform.setBounds(30, 40, 120, 25);
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
					JOptionPane.showMessageDialog(null,"Se genero el modelo Dataform.");
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
		btnGenerarDiagrama.setBounds(180, 40, 120, 25);
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
		btnCompilar.setBounds(330, 40, 120, 25);
		btnCompilar.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) {
				
				modelFactoryGC = modelFactoryGC.cargar();
				modelFactoryModelGC.setModelFactory(modelFactoryGC);
				CompiladorProyeccion compiladorProyeccion = new CompiladorProyeccion();
				try {
					compiladorProyeccion.compilarProyeccion(modelFactoryGC);
				} catch (ClassNotFoundException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				} catch (SQLException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
				consulta = compiladorProyeccion.getCompiladorRealizacion().getConsultaGenerica().getConsultaMySql().getConsultaId();
				compiladorProyeccion.getCompiladorRealizacion().getConsultaGenerica();
				
				rs = compiladorProyeccion.getCompiladorRealizacion().getConsultaGenerica().getConsultaMySql().getRs();
				
				JOptionPane.showMessageDialog(null, "Se genero la consulta.");
			}
		});
		toolkit.adapt(btnCompilar, true, true);
		btnCompilar.setText("Compilar");
		
		Button btnGenetarExcel = new Button(grpCicloDeVida, SWT.NONE);
		btnGenetarExcel.setBounds(180, 100, 120, 25);
		btnGenetarExcel.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) {
				
				try {
					excelGenarator.createDataSheet(rs);
					if(excelGenarator.getListFilter().size() != 0)
						excelGenarator.createRelations();
					
					JOptionPane.showMessageDialog(null, "Reporte creado.");
				} catch (IOException | SQLException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
			}
		});
		toolkit.adapt(btnGenetarExcel, true, true);
		btnGenetarExcel.setText("Generar Excel");
		
		Button btnNewButton_1 = new Button(grpCicloDeVida, SWT.NONE);
		btnNewButton_1.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) {
				
				try {
					excelGenarator = new ExcelGenerator(filePath, dfGenerator.getListComboBox(), 
							dfGenerator.getListComboCordinate(), modelFactoryGC, 
							dfGenerator.getPosRowIniData(), dfGenerator.getPosCellIniData(),consulta);
					
					excelGenarator.writeFileColumns(rs);
					
					JOptionPane.showMessageDialog(null, "Puede ver las columnas del resultado de la consulta en el archivo Excel.");
					
				} catch (IOException | SQLException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
			}
		});
		btnNewButton_1.setBounds(30, 100, 120, 25);
		toolkit.adapt(btnNewButton_1, true, true);
		btnNewButton_1.setText("Ver Columnas");
		
		Button btnNewButton = new Button(container, SWT.NONE);
		btnNewButton.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) {
				JFileChooser file=new JFileChooser();
				file.showOpenDialog(null);
				fileName = file.getSelectedFile().getName();
				filePath = file.getSelectedFile().getAbsolutePath();
				
				try {
					Actualizar a = new Actualizar(fileName, filePath);
					a.refresh();
					JOptionPane.showMessageDialog(null, "Se actualizo el reporte con Exito\n");
				} catch (IOException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				} catch (SQLException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				} catch (ClassNotFoundException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
				
			}
		});
		btnNewButton.setBounds(40, 170, 120, 25);
		toolkit.adapt(btnNewButton, true, true);
		btnNewButton.setText("Actualizar");
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
