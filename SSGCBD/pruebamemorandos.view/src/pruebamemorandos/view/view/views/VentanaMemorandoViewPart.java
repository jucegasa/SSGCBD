package pruebamemorandos.view.view.views;
import model.uimanager.UimanagerPackage.Literals;
import model.domain.*;
import model.uimanager.*;
import model.FactoryModel;
import pruebamemorandos.view.view.ModelFactoryModel;
import org.eclipse.wb.swt.SWTResourceManager;
import org.eclipse.ui.part.ViewPart;
import model.uimanager.ContenedorInformacionMemorando;
import model.uimanager.ContenedorMemorando;
import org.eclipse.jface.action.MenuManager;
import org.eclipse.jface.action.StatusLineManager;
import org.eclipse.jface.action.ToolBarManager;
import org.eclipse.jface.window.ApplicationWindow;
import org.eclipse.swt.SWT;
import org.eclipse.swt.graphics.Point;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Control;
import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.swt.widgets.Group;
import org.eclipse.swt.widgets.Table;
import org.eclipse.jface.viewers.TableViewer;
import org.eclipse.swt.widgets.TableColumn;
import org.eclipse.jface.viewers.TableViewerColumn;
import org.eclipse.swt.widgets.Combo;
import org.eclipse.jface.viewers.ComboViewer;
import org.eclipse.ui.forms.widgets.FormToolkit;
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.widgets.Text;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.events.SelectionAdapter;
import org.eclipse.swt.events.SelectionEvent;
import org.eclipse.swt.widgets.DateTime;

import org.eclipse.core.databinding.DataBindingContext;
import org.eclipse.jface.databinding.viewers.ObservableListContentProvider;
import org.eclipse.core.databinding.observable.map.IObservableMap;
import org.eclipse.emf.databinding.EMFObservables;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.jface.databinding.viewers.ObservableMapLabelProvider;
import org.eclipse.core.databinding.observable.list.IObservableList;
import org.eclipse.core.databinding.observable.Realm;
import org.eclipse.core.databinding.observable.value.IObservableValue;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.jface.databinding.swt.WidgetProperties;
import org.eclipse.swt.events.SelectionAdapter;
import org.eclipse.swt.events.SelectionEvent;

public class VentanaMemorandoViewPart  extends ViewPart {


        public static final String ID = "pruebamemorandos.view.views.VentanaMemorando";

		ModelFactoryModel mfm;
		UIManager uiManager;
		FactoryModel factoryModel;
		private DataBindingContext m_bindingContext;
		VentanaMemorandoViewModel  ventanaMemorandoViewModel;
		public Group groupInformacionMemorando; 
		ContenedorInformacionMemorando   contenedorinformacionMemorando;
		public Label lblUnidadOrganizacionalInformacionMemorando; 
		public Label lblRemitenteInformacionMemorando; 
		public Text textUnidadOInformacionMemorando; 
		public Text textRemitenteInformacionMemorando; 
		public Label lblFechaInicialInformacionMemorando; 
		public Text textFechaInformacionMemorando; 
		public Group groupMemorando; 
		ContenedorMemorando   contenedormemorando;
		public Table tableMemorando;
 		public TableViewer tableViewerMemorando;
 		MemorandoViewModel   memorandoViewModelSeleccionado; 
		private final FormToolkit formToolkit = new FormToolkit(Display.getDefault());

		public VentanaMemorandoViewPart() {
		  try {
		    mfm = ModelFactoryModel.getInstance();
		    mfm.setVentanaMemorandoViewPart(this);
		    mfm.armarDomain();
		    cargarContenedores();
} 
		   catch (Exception e) {
		     }
		  }

         public void cargarContenedores(){
            mfm = ModelFactoryModel.getInstance(); 
            factoryModel = mfm.getFactoryModel();
            uiManager = factoryModel.getTheUIManager();
             ventanaMemorandoViewModel = uiManager.getTheVentanaMemorandoViewModel();
             contenedorinformacionMemorando = ventanaMemorandoViewModel.getTheContenedorInformacionMemorando();
             contenedormemorando = ventanaMemorandoViewModel.getTheContenedorMemorando();
      
}
      public void updateData(){
           mfm.update();
           cargarContenedores();
           try {
                initDataBindings();
         } catch (Exception e) {   
         }  
     }
		public void createPartControl(Composite parent) {
		Composite container = formToolkit.createComposite(parent, SWT.NONE);

		formToolkit.paintBordersFor(container);

		groupInformacionMemorando = new Group(container, SWT.NONE);
		groupInformacionMemorando.setBounds(18,23,711,186);
		groupInformacionMemorando.setText("Informacion Memorando");
		formToolkit.adapt(groupInformacionMemorando);
		formToolkit.paintBordersFor(groupInformacionMemorando);

        lblUnidadOrganizacionalInformacionMemorando = formToolkit.createLabel(groupInformacionMemorando,"Unidad Organizacional:",SWT.NONE);
        lblUnidadOrganizacionalInformacionMemorando.setForeground(SWTResourceManager.getColor(0, 0, 139)) ;
        lblUnidadOrganizacionalInformacionMemorando.setBounds(15,24,60,21);

        lblRemitenteInformacionMemorando = formToolkit.createLabel(groupInformacionMemorando,"Remitente:",SWT.NONE);
        lblRemitenteInformacionMemorando.setForeground(SWTResourceManager.getColor(0, 0, 139)) ;
        lblRemitenteInformacionMemorando.setBounds(20,79,60,21);

		textUnidadOInformacionMemorando = formToolkit.createText(groupInformacionMemorando, "New Text", SWT.NONE);
		textUnidadOInformacionMemorando.setText("");
		textUnidadOInformacionMemorando.setBounds(175,24,107,21);

		textRemitenteInformacionMemorando = formToolkit.createText(groupInformacionMemorando, "New Text", SWT.NONE);
		textRemitenteInformacionMemorando.setText("");
		textRemitenteInformacionMemorando.setBounds(175,74,107,21);

        lblFechaInicialInformacionMemorando = formToolkit.createLabel(groupInformacionMemorando,"Fecha Inicial:",SWT.NONE);
        lblFechaInicialInformacionMemorando.setForeground(SWTResourceManager.getColor(0, 0, 139)) ;
        lblFechaInicialInformacionMemorando.setBounds(380,29,60,21);

		textFechaInformacionMemorando = formToolkit.createText(groupInformacionMemorando, "New Text", SWT.NONE);
		textFechaInformacionMemorando.setText("");
		textFechaInformacionMemorando.setBounds(495,24,107,21);

		groupMemorando = new Group(container, SWT.NONE);
		groupMemorando.setBounds(18,228,716,251);
		groupMemorando.setText("Memorando");
		formToolkit.adapt(groupMemorando);
		formToolkit.paintBordersFor(groupMemorando);

		tableViewerMemorando = new TableViewer(groupMemorando, SWT.BORDER | SWT.FULL_SELECTION);
		tableMemorando = tableViewerMemorando.getTable();
		tableMemorando.setLinesVisible(true);
		tableMemorando.setHeaderVisible(true);
		tableMemorando.setBounds(160,34,411,161);
		formToolkit.paintBordersFor(tableMemorando);

		tableMemorando.addSelectionListener(new SelectionAdapter(){
		    public void widgetSelected(SelectionEvent e) {
		         memorandoViewModelSeleccionado  = (MemorandoViewModel)e.item.getData();
		  } 
          });
		TableViewerColumn  tableViewerColumn0Id = new TableViewerColumn(tableViewerMemorando, SWT.NONE);
		TableColumn tblclmn0Id = tableViewerColumn0Id.getColumn();
		tblclmn0Id.setWidth(100);
		tblclmn0Id .setText("id");

		TableViewerColumn  tableViewerColumn1Tipo = new TableViewerColumn(tableViewerMemorando, SWT.NONE);
		TableColumn tblclmn1Tipo = tableViewerColumn1Tipo.getColumn();
		tblclmn1Tipo.setWidth(100);
		tblclmn1Tipo .setText("tipo");

		TableViewerColumn  tableViewerColumn2Hora = new TableViewerColumn(tableViewerMemorando, SWT.NONE);
		TableColumn tblclmn2Hora = tableViewerColumn2Hora.getColumn();
		tblclmn2Hora.setWidth(100);
		tblclmn2Hora .setText("hora");

        try {
	       initDataBindings();
            }catch (Exception e) {
        }

   }      public void setFocus() {
         // Set the focus
    }
	protected DataBindingContext initDataBindings() {
		DataBindingContext bindingContext = new DataBindingContext();
		//
		IObservableValue observeTextUnidadOInformacionMemorandoObserveWidget = WidgetProperties.text(SWT.Modify).observe(textUnidadOInformacionMemorando);
		IObservableValue contenedorinformacionMemorandoUnidadOInformacionMemorandoObserveValue = EMFObservables.observeValue(contenedorinformacionMemorando, Literals.CONTENEDOR_INFORMACION_MEMORANDO__UNIDADO);
		bindingContext.bindValue(observeTextUnidadOInformacionMemorandoObserveWidget, contenedorinformacionMemorandoUnidadOInformacionMemorandoObserveValue, null, null);
		//
		IObservableValue observeTextRemitenteInformacionMemorandoObserveWidget = WidgetProperties.text(SWT.Modify).observe(textRemitenteInformacionMemorando);
		IObservableValue contenedorinformacionMemorandoRemitenteInformacionMemorandoObserveValue = EMFObservables.observeValue(contenedorinformacionMemorando, Literals.CONTENEDOR_INFORMACION_MEMORANDO__REMITENTE);
		bindingContext.bindValue(observeTextRemitenteInformacionMemorandoObserveWidget, contenedorinformacionMemorandoRemitenteInformacionMemorandoObserveValue, null, null);
		//
		IObservableValue observeTextFechaInformacionMemorandoObserveWidget = WidgetProperties.text(SWT.Modify).observe(textFechaInformacionMemorando);
		IObservableValue contenedorinformacionMemorandoFechaInformacionMemorandoObserveValue = EMFObservables.observeValue(contenedorinformacionMemorando, Literals.CONTENEDOR_INFORMACION_MEMORANDO__FECHA);
		bindingContext.bindValue(observeTextFechaInformacionMemorandoObserveWidget, contenedorinformacionMemorandoFechaInformacionMemorandoObserveValue, null, null);
		//
		ObservableListContentProvider listContentProvider = new ObservableListContentProvider();
		IObservableMap[] observeMaps = EMFObservables.observeMaps(listContentProvider.getKnownElements(), new EStructuralFeature[]{Literals.MEMORANDO_VIEW_MODEL__ID, Literals.MEMORANDO_VIEW_MODEL__TIPO, Literals.MEMORANDO_VIEW_MODEL__HORA});
		tableViewerMemorando.setLabelProvider(new ObservableMapLabelProvider(observeMaps));
		tableViewerMemorando.setContentProvider(listContentProvider);
		//
		IObservableList contenedormemorandoListMemorandoObserveList = EMFObservables.observeList(Realm.getDefault(), contenedormemorando, Literals.CONTENEDOR_MEMORANDO__LIST_MEMORANDO);
		tableViewerMemorando.setInput(contenedormemorandoListMemorandoObserveList);
		//
		return bindingContext;
	}
}
