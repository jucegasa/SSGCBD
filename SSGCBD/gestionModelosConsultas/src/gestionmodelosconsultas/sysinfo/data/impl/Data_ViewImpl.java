/**
 */
package gestionmodelosconsultas.sysinfo.data.impl;

import gestionmodelosconsultas.sysinfo.data.DataPackage;
import gestionmodelosconsultas.sysinfo.data.Data_View;

import gestionmodelosconsultas.sysinfo.data.docmgt.Distribucion;
import gestionmodelosconsultas.sysinfo.data.docmgt.DocmgtPackage;
import gestionmodelosconsultas.sysinfo.data.docmgt.Glosario;
import gestionmodelosconsultas.sysinfo.data.docmgt.Indice;
import gestionmodelosconsultas.sysinfo.data.docmgt.Libreria;
import gestionmodelosconsultas.sysinfo.data.docmgt.Orientacion;

import gestionmodelosconsultas.sysinfo.impl.PaqueteImpl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Data View</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link gestionmodelosconsultas.sysinfo.data.impl.Data_ViewImpl#getIndice <em>Indice</em>}</li>
 *   <li>{@link gestionmodelosconsultas.sysinfo.data.impl.Data_ViewImpl#getLibreria <em>Libreria</em>}</li>
 *   <li>{@link gestionmodelosconsultas.sysinfo.data.impl.Data_ViewImpl#getOrientacion <em>Orientacion</em>}</li>
 *   <li>{@link gestionmodelosconsultas.sysinfo.data.impl.Data_ViewImpl#getGlosario <em>Glosario</em>}</li>
 *   <li>{@link gestionmodelosconsultas.sysinfo.data.impl.Data_ViewImpl#getDistribucion <em>Distribucion</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class Data_ViewImpl extends PaqueteImpl implements Data_View {
	/**
	 * The cached value of the '{@link #getIndice() <em>Indice</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIndice()
	 * @generated
	 * @ordered
	 */
	protected Indice indice;

	/**
	 * The cached value of the '{@link #getLibreria() <em>Libreria</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLibreria()
	 * @generated
	 * @ordered
	 */
	protected Libreria libreria;

	/**
	 * The cached value of the '{@link #getOrientacion() <em>Orientacion</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOrientacion()
	 * @generated
	 * @ordered
	 */
	protected Orientacion orientacion;

	/**
	 * The cached value of the '{@link #getGlosario() <em>Glosario</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGlosario()
	 * @generated
	 * @ordered
	 */
	protected Glosario glosario;

	/**
	 * The cached value of the '{@link #getDistribucion() <em>Distribucion</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDistribucion()
	 * @generated
	 * @ordered
	 */
	protected Distribucion distribucion;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Data_ViewImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return DataPackage.Literals.DATA_VIEW;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Indice getIndice() {
		return indice;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetIndice(Indice newIndice, NotificationChain msgs) {
		Indice oldIndice = indice;
		indice = newIndice;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, DataPackage.DATA_VIEW__INDICE, oldIndice, newIndice);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIndice(Indice newIndice) {
		if (newIndice != indice) {
			NotificationChain msgs = null;
			if (indice != null)
				msgs = ((InternalEObject)indice).eInverseRemove(this, DocmgtPackage.INDICE__DATA_VIEW, Indice.class, msgs);
			if (newIndice != null)
				msgs = ((InternalEObject)newIndice).eInverseAdd(this, DocmgtPackage.INDICE__DATA_VIEW, Indice.class, msgs);
			msgs = basicSetIndice(newIndice, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DataPackage.DATA_VIEW__INDICE, newIndice, newIndice));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Libreria getLibreria() {
		return libreria;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetLibreria(Libreria newLibreria, NotificationChain msgs) {
		Libreria oldLibreria = libreria;
		libreria = newLibreria;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, DataPackage.DATA_VIEW__LIBRERIA, oldLibreria, newLibreria);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLibreria(Libreria newLibreria) {
		if (newLibreria != libreria) {
			NotificationChain msgs = null;
			if (libreria != null)
				msgs = ((InternalEObject)libreria).eInverseRemove(this, DocmgtPackage.LIBRERIA__DATA_VIEW, Libreria.class, msgs);
			if (newLibreria != null)
				msgs = ((InternalEObject)newLibreria).eInverseAdd(this, DocmgtPackage.LIBRERIA__DATA_VIEW, Libreria.class, msgs);
			msgs = basicSetLibreria(newLibreria, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DataPackage.DATA_VIEW__LIBRERIA, newLibreria, newLibreria));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Orientacion getOrientacion() {
		return orientacion;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetOrientacion(Orientacion newOrientacion, NotificationChain msgs) {
		Orientacion oldOrientacion = orientacion;
		orientacion = newOrientacion;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, DataPackage.DATA_VIEW__ORIENTACION, oldOrientacion, newOrientacion);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOrientacion(Orientacion newOrientacion) {
		if (newOrientacion != orientacion) {
			NotificationChain msgs = null;
			if (orientacion != null)
				msgs = ((InternalEObject)orientacion).eInverseRemove(this, DocmgtPackage.ORIENTACION__DATA_VIEW, Orientacion.class, msgs);
			if (newOrientacion != null)
				msgs = ((InternalEObject)newOrientacion).eInverseAdd(this, DocmgtPackage.ORIENTACION__DATA_VIEW, Orientacion.class, msgs);
			msgs = basicSetOrientacion(newOrientacion, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DataPackage.DATA_VIEW__ORIENTACION, newOrientacion, newOrientacion));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Glosario getGlosario() {
		return glosario;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetGlosario(Glosario newGlosario, NotificationChain msgs) {
		Glosario oldGlosario = glosario;
		glosario = newGlosario;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, DataPackage.DATA_VIEW__GLOSARIO, oldGlosario, newGlosario);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setGlosario(Glosario newGlosario) {
		if (newGlosario != glosario) {
			NotificationChain msgs = null;
			if (glosario != null)
				msgs = ((InternalEObject)glosario).eInverseRemove(this, DocmgtPackage.GLOSARIO__DATA_VIEW, Glosario.class, msgs);
			if (newGlosario != null)
				msgs = ((InternalEObject)newGlosario).eInverseAdd(this, DocmgtPackage.GLOSARIO__DATA_VIEW, Glosario.class, msgs);
			msgs = basicSetGlosario(newGlosario, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DataPackage.DATA_VIEW__GLOSARIO, newGlosario, newGlosario));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Distribucion getDistribucion() {
		return distribucion;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDistribucion(Distribucion newDistribucion, NotificationChain msgs) {
		Distribucion oldDistribucion = distribucion;
		distribucion = newDistribucion;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, DataPackage.DATA_VIEW__DISTRIBUCION, oldDistribucion, newDistribucion);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDistribucion(Distribucion newDistribucion) {
		if (newDistribucion != distribucion) {
			NotificationChain msgs = null;
			if (distribucion != null)
				msgs = ((InternalEObject)distribucion).eInverseRemove(this, DocmgtPackage.DISTRIBUCION__DATA_VIEW, Distribucion.class, msgs);
			if (newDistribucion != null)
				msgs = ((InternalEObject)newDistribucion).eInverseAdd(this, DocmgtPackage.DISTRIBUCION__DATA_VIEW, Distribucion.class, msgs);
			msgs = basicSetDistribucion(newDistribucion, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DataPackage.DATA_VIEW__DISTRIBUCION, newDistribucion, newDistribucion));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case DataPackage.DATA_VIEW__INDICE:
				if (indice != null)
					msgs = ((InternalEObject)indice).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - DataPackage.DATA_VIEW__INDICE, null, msgs);
				return basicSetIndice((Indice)otherEnd, msgs);
			case DataPackage.DATA_VIEW__LIBRERIA:
				if (libreria != null)
					msgs = ((InternalEObject)libreria).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - DataPackage.DATA_VIEW__LIBRERIA, null, msgs);
				return basicSetLibreria((Libreria)otherEnd, msgs);
			case DataPackage.DATA_VIEW__ORIENTACION:
				if (orientacion != null)
					msgs = ((InternalEObject)orientacion).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - DataPackage.DATA_VIEW__ORIENTACION, null, msgs);
				return basicSetOrientacion((Orientacion)otherEnd, msgs);
			case DataPackage.DATA_VIEW__GLOSARIO:
				if (glosario != null)
					msgs = ((InternalEObject)glosario).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - DataPackage.DATA_VIEW__GLOSARIO, null, msgs);
				return basicSetGlosario((Glosario)otherEnd, msgs);
			case DataPackage.DATA_VIEW__DISTRIBUCION:
				if (distribucion != null)
					msgs = ((InternalEObject)distribucion).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - DataPackage.DATA_VIEW__DISTRIBUCION, null, msgs);
				return basicSetDistribucion((Distribucion)otherEnd, msgs);
		}
		return super.eInverseAdd(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case DataPackage.DATA_VIEW__INDICE:
				return basicSetIndice(null, msgs);
			case DataPackage.DATA_VIEW__LIBRERIA:
				return basicSetLibreria(null, msgs);
			case DataPackage.DATA_VIEW__ORIENTACION:
				return basicSetOrientacion(null, msgs);
			case DataPackage.DATA_VIEW__GLOSARIO:
				return basicSetGlosario(null, msgs);
			case DataPackage.DATA_VIEW__DISTRIBUCION:
				return basicSetDistribucion(null, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case DataPackage.DATA_VIEW__INDICE:
				return getIndice();
			case DataPackage.DATA_VIEW__LIBRERIA:
				return getLibreria();
			case DataPackage.DATA_VIEW__ORIENTACION:
				return getOrientacion();
			case DataPackage.DATA_VIEW__GLOSARIO:
				return getGlosario();
			case DataPackage.DATA_VIEW__DISTRIBUCION:
				return getDistribucion();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case DataPackage.DATA_VIEW__INDICE:
				setIndice((Indice)newValue);
				return;
			case DataPackage.DATA_VIEW__LIBRERIA:
				setLibreria((Libreria)newValue);
				return;
			case DataPackage.DATA_VIEW__ORIENTACION:
				setOrientacion((Orientacion)newValue);
				return;
			case DataPackage.DATA_VIEW__GLOSARIO:
				setGlosario((Glosario)newValue);
				return;
			case DataPackage.DATA_VIEW__DISTRIBUCION:
				setDistribucion((Distribucion)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case DataPackage.DATA_VIEW__INDICE:
				setIndice((Indice)null);
				return;
			case DataPackage.DATA_VIEW__LIBRERIA:
				setLibreria((Libreria)null);
				return;
			case DataPackage.DATA_VIEW__ORIENTACION:
				setOrientacion((Orientacion)null);
				return;
			case DataPackage.DATA_VIEW__GLOSARIO:
				setGlosario((Glosario)null);
				return;
			case DataPackage.DATA_VIEW__DISTRIBUCION:
				setDistribucion((Distribucion)null);
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case DataPackage.DATA_VIEW__INDICE:
				return indice != null;
			case DataPackage.DATA_VIEW__LIBRERIA:
				return libreria != null;
			case DataPackage.DATA_VIEW__ORIENTACION:
				return orientacion != null;
			case DataPackage.DATA_VIEW__GLOSARIO:
				return glosario != null;
			case DataPackage.DATA_VIEW__DISTRIBUCION:
				return distribucion != null;
		}
		return super.eIsSet(featureID);
	}

} //Data_ViewImpl
