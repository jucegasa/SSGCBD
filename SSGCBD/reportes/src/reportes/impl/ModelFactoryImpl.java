/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package reportes.impl;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.Reader;
import java.nio.Buffer;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

import reportes.ModelFactory;
import reportes.ReportesPackage;
import reportes.domain.Domain;
import reportes.domain.DomainPackage;
import reportes.ui.UI;
import reportes.ui.UiPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Model Factory</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link reportes.impl.ModelFactoryImpl#getTheDomain <em>The Domain</em>}</li>
 *   <li>{@link reportes.impl.ModelFactoryImpl#getTheUI <em>The UI</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ModelFactoryImpl extends EObjectImpl implements ModelFactory {
	/**
	 * The cached value of the '{@link #getTheDomain() <em>The Domain</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTheDomain()
	 * @generated
	 * @ordered
	 */
	protected Domain theDomain;

	/**
	 * The cached value of the '{@link #getTheUI() <em>The UI</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTheUI()
	 * @generated
	 * @ordered
	 */
	protected UI theUI;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ModelFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EClass eStaticClass() {
		return ReportesPackage.Literals.MODEL_FACTORY;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Domain getTheDomain() {
		return theDomain;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetTheDomain(Domain newTheDomain, NotificationChain msgs) {
		Domain oldTheDomain = theDomain;
		theDomain = newTheDomain;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ReportesPackage.MODEL_FACTORY__THE_DOMAIN, oldTheDomain, newTheDomain);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTheDomain(Domain newTheDomain) {
		if (newTheDomain != theDomain) {
			NotificationChain msgs = null;
			if (theDomain != null)
				msgs = ((InternalEObject)theDomain).eInverseRemove(this, DomainPackage.DOMAIN__THE_MODEL_FACTORY, Domain.class, msgs);
			if (newTheDomain != null)
				msgs = ((InternalEObject)newTheDomain).eInverseAdd(this, DomainPackage.DOMAIN__THE_MODEL_FACTORY, Domain.class, msgs);
			msgs = basicSetTheDomain(newTheDomain, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ReportesPackage.MODEL_FACTORY__THE_DOMAIN, newTheDomain, newTheDomain));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public UI getTheUI() {
		return theUI;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetTheUI(UI newTheUI, NotificationChain msgs) {
		UI oldTheUI = theUI;
		theUI = newTheUI;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ReportesPackage.MODEL_FACTORY__THE_UI, oldTheUI, newTheUI);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTheUI(UI newTheUI) {
		if (newTheUI != theUI) {
			NotificationChain msgs = null;
			if (theUI != null)
				msgs = ((InternalEObject)theUI).eInverseRemove(this, UiPackage.UI__THE_MODEL_FACTORY, UI.class, msgs);
			if (newTheUI != null)
				msgs = ((InternalEObject)newTheUI).eInverseAdd(this, UiPackage.UI__THE_MODEL_FACTORY, UI.class, msgs);
			msgs = basicSetTheUI(newTheUI, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ReportesPackage.MODEL_FACTORY__THE_UI, newTheUI, newTheUI));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ReportesPackage.MODEL_FACTORY__THE_DOMAIN:
				if (theDomain != null)
					msgs = ((InternalEObject)theDomain).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ReportesPackage.MODEL_FACTORY__THE_DOMAIN, null, msgs);
				return basicSetTheDomain((Domain)otherEnd, msgs);
			case ReportesPackage.MODEL_FACTORY__THE_UI:
				if (theUI != null)
					msgs = ((InternalEObject)theUI).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ReportesPackage.MODEL_FACTORY__THE_UI, null, msgs);
				return basicSetTheUI((UI)otherEnd, msgs);
		}
		return super.eInverseAdd(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ReportesPackage.MODEL_FACTORY__THE_DOMAIN:
				return basicSetTheDomain(null, msgs);
			case ReportesPackage.MODEL_FACTORY__THE_UI:
				return basicSetTheUI(null, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case ReportesPackage.MODEL_FACTORY__THE_DOMAIN:
				return getTheDomain();
			case ReportesPackage.MODEL_FACTORY__THE_UI:
				return getTheUI();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case ReportesPackage.MODEL_FACTORY__THE_DOMAIN:
				setTheDomain((Domain)newValue);
				return;
			case ReportesPackage.MODEL_FACTORY__THE_UI:
				setTheUI((UI)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void eUnset(int featureID) {
		switch (featureID) {
			case ReportesPackage.MODEL_FACTORY__THE_DOMAIN:
				setTheDomain((Domain)null);
				return;
			case ReportesPackage.MODEL_FACTORY__THE_UI:
				setTheUI((UI)null);
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case ReportesPackage.MODEL_FACTORY__THE_DOMAIN:
				return theDomain != null;
			case ReportesPackage.MODEL_FACTORY__THE_UI:
				return theUI != null;
		}
		return super.eIsSet(featureID);
	}
	
	/*
	 * (non-Javadoc)
	 * @see reportes.ModelFactory#cargar()
	 */
	@Override
	public ModelFactory cargar() {
		
		ModelFactory modelFactory = null;
		
		org.eclipse.emf.common.util.URI uri = org.eclipse.emf.common.util.URI.createURI("platform:/resource/Reportes/persistencia/produccion.reportes");
		org.eclipse.emf.ecore.resource.ResourceSet resourceSet= new org.eclipse.emf.ecore.resource.impl.ResourceSetImpl();
		org.eclipse.emf.ecore.resource.Resource resource = resourceSet.createResource(uri);
		try {
			resource.load(java.util.Collections.EMPTY_MAP);
			modelFactory = (ModelFactory) resource.getContents().get(0);
		} catch (java.io.IOException e) {
			// TO-DO Auto-generated catch block
			e.printStackTrace();
		}

		return modelFactory;
		
	}
	
	/*
	 * (non-Javadoc)
	 * @see reportes.ModelFactory#salvar()
	 */
	@Override
	public void salvar() {
		
		ModelFactory modelFactory = this;
		  	
		org.eclipse.emf.common.util.URI uri = org.eclipse.emf.common.util.URI.createURI("platform:/resource/Reportes/persistencia/produccion.reportes");
		org.eclipse.emf.ecore.resource.ResourceSet resourceSet= new org.eclipse.emf.ecore.resource.impl.ResourceSetImpl();
		org.eclipse.emf.ecore.resource.Resource resource = resourceSet.createResource(uri);
		resource.getContents().add(modelFactory);
		
		try {
			
			resource.save(java.util.Collections.EMPTY_MAP);
			
		} catch (java.io.IOException e) {
			// TO-DO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public void copiarProducciones() throws IOException {
		
		File origen = new File("E:/SSGCBD/rumtimePrueba/dataformmodel/persistencia/dataform.model");
		File destino = new File("E:/SSGCBD/rumtimePrueba/Reportes/persistencia/producciondataform.model");
		
		InputStream in = new FileInputStream(origen);
		OutputStream out = new FileOutputStream(destino);
		
		int c;
        while( (c = in.read() ) != -1) {
            out.write(c);
        }
        
        origen = new File("E:/SSGCBD/rumtimePrueba//GestionConsultas/modelos/produccion.gestionmodelosconsultas");
		destino = new File("E:/SSGCBD/rumtimePrueba/Reportes/persistencia/produccion.gestionmodelosconsultas");
		
		InputStream inC = new FileInputStream(origen);
		OutputStream outC = new FileOutputStream(destino);

        while( (c = inC.read() ) != -1) {
            outC.write(c);
        }
		
        in.close();
        out.close();
        inC.close();
        outC.close();
	}

	@Override
	public void copiarConsulta() throws IOException {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void copiarDF() throws IOException {
		// TODO Auto-generated method stub
		
	}
	

} //ModelFactoryImpl
