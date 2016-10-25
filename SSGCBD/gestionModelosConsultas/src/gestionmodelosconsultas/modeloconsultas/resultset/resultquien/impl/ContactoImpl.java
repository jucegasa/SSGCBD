/**
 */
package gestionmodelosconsultas.modeloconsultas.resultset.resultquien.impl;

import gestionmodelosconsultas.modeloconsultas.resultset.impl.ElementoModeloResultadoImpl;

import gestionmodelosconsultas.modeloconsultas.resultset.resultquien.Contacto;
import gestionmodelosconsultas.modeloconsultas.resultset.resultquien.ResultquienPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Contacto</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link gestionmodelosconsultas.modeloconsultas.resultset.resultquien.impl.ContactoImpl#getIdContacto <em>Id Contacto</em>}</li>
 *   <li>{@link gestionmodelosconsultas.modeloconsultas.resultset.resultquien.impl.ContactoImpl#getUsername <em>Username</em>}</li>
 *   <li>{@link gestionmodelosconsultas.modeloconsultas.resultset.resultquien.impl.ContactoImpl#getPassword <em>Password</em>}</li>
 *   <li>{@link gestionmodelosconsultas.modeloconsultas.resultset.resultquien.impl.ContactoImpl#getTelefono <em>Telefono</em>}</li>
 *   <li>{@link gestionmodelosconsultas.modeloconsultas.resultset.resultquien.impl.ContactoImpl#getNombre <em>Nombre</em>}</li>
 *   <li>{@link gestionmodelosconsultas.modeloconsultas.resultset.resultquien.impl.ContactoImpl#getDescripcion <em>Descripcion</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ContactoImpl extends ElementoModeloResultadoImpl implements Contacto {
	/**
	 * The default value of the '{@link #getIdContacto() <em>Id Contacto</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIdContacto()
	 * @generated
	 * @ordered
	 */
	protected static final String ID_CONTACTO_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getIdContacto() <em>Id Contacto</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIdContacto()
	 * @generated
	 * @ordered
	 */
	protected String idContacto = ID_CONTACTO_EDEFAULT;

	/**
	 * The default value of the '{@link #getUsername() <em>Username</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUsername()
	 * @generated
	 * @ordered
	 */
	protected static final String USERNAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getUsername() <em>Username</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUsername()
	 * @generated
	 * @ordered
	 */
	protected String username = USERNAME_EDEFAULT;

	/**
	 * The default value of the '{@link #getPassword() <em>Password</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPassword()
	 * @generated
	 * @ordered
	 */
	protected static final String PASSWORD_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getPassword() <em>Password</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPassword()
	 * @generated
	 * @ordered
	 */
	protected String password = PASSWORD_EDEFAULT;

	/**
	 * The default value of the '{@link #getTelefono() <em>Telefono</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTelefono()
	 * @generated
	 * @ordered
	 */
	protected static final String TELEFONO_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getTelefono() <em>Telefono</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTelefono()
	 * @generated
	 * @ordered
	 */
	protected String telefono = TELEFONO_EDEFAULT;

	/**
	 * The default value of the '{@link #getNombre() <em>Nombre</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNombre()
	 * @generated
	 * @ordered
	 */
	protected static final String NOMBRE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getNombre() <em>Nombre</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNombre()
	 * @generated
	 * @ordered
	 */
	protected String nombre = NOMBRE_EDEFAULT;

	/**
	 * The default value of the '{@link #getDescripcion() <em>Descripcion</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDescripcion()
	 * @generated
	 * @ordered
	 */
	protected static final String DESCRIPCION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDescripcion() <em>Descripcion</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDescripcion()
	 * @generated
	 * @ordered
	 */
	protected String descripcion = DESCRIPCION_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ContactoImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ResultquienPackage.Literals.CONTACTO;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getIdContacto() {
		return idContacto;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIdContacto(String newIdContacto) {
		String oldIdContacto = idContacto;
		idContacto = newIdContacto;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ResultquienPackage.CONTACTO__ID_CONTACTO, oldIdContacto, idContacto));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getUsername() {
		return username;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setUsername(String newUsername) {
		String oldUsername = username;
		username = newUsername;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ResultquienPackage.CONTACTO__USERNAME, oldUsername, username));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getPassword() {
		return password;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPassword(String newPassword) {
		String oldPassword = password;
		password = newPassword;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ResultquienPackage.CONTACTO__PASSWORD, oldPassword, password));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getTelefono() {
		return telefono;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTelefono(String newTelefono) {
		String oldTelefono = telefono;
		telefono = newTelefono;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ResultquienPackage.CONTACTO__TELEFONO, oldTelefono, telefono));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getNombre() {
		return nombre;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNombre(String newNombre) {
		String oldNombre = nombre;
		nombre = newNombre;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ResultquienPackage.CONTACTO__NOMBRE, oldNombre, nombre));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getDescripcion() {
		return descripcion;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDescripcion(String newDescripcion) {
		String oldDescripcion = descripcion;
		descripcion = newDescripcion;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ResultquienPackage.CONTACTO__DESCRIPCION, oldDescripcion, descripcion));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case ResultquienPackage.CONTACTO__ID_CONTACTO:
				return getIdContacto();
			case ResultquienPackage.CONTACTO__USERNAME:
				return getUsername();
			case ResultquienPackage.CONTACTO__PASSWORD:
				return getPassword();
			case ResultquienPackage.CONTACTO__TELEFONO:
				return getTelefono();
			case ResultquienPackage.CONTACTO__NOMBRE:
				return getNombre();
			case ResultquienPackage.CONTACTO__DESCRIPCION:
				return getDescripcion();
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
			case ResultquienPackage.CONTACTO__ID_CONTACTO:
				setIdContacto((String)newValue);
				return;
			case ResultquienPackage.CONTACTO__USERNAME:
				setUsername((String)newValue);
				return;
			case ResultquienPackage.CONTACTO__PASSWORD:
				setPassword((String)newValue);
				return;
			case ResultquienPackage.CONTACTO__TELEFONO:
				setTelefono((String)newValue);
				return;
			case ResultquienPackage.CONTACTO__NOMBRE:
				setNombre((String)newValue);
				return;
			case ResultquienPackage.CONTACTO__DESCRIPCION:
				setDescripcion((String)newValue);
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
			case ResultquienPackage.CONTACTO__ID_CONTACTO:
				setIdContacto(ID_CONTACTO_EDEFAULT);
				return;
			case ResultquienPackage.CONTACTO__USERNAME:
				setUsername(USERNAME_EDEFAULT);
				return;
			case ResultquienPackage.CONTACTO__PASSWORD:
				setPassword(PASSWORD_EDEFAULT);
				return;
			case ResultquienPackage.CONTACTO__TELEFONO:
				setTelefono(TELEFONO_EDEFAULT);
				return;
			case ResultquienPackage.CONTACTO__NOMBRE:
				setNombre(NOMBRE_EDEFAULT);
				return;
			case ResultquienPackage.CONTACTO__DESCRIPCION:
				setDescripcion(DESCRIPCION_EDEFAULT);
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
			case ResultquienPackage.CONTACTO__ID_CONTACTO:
				return ID_CONTACTO_EDEFAULT == null ? idContacto != null : !ID_CONTACTO_EDEFAULT.equals(idContacto);
			case ResultquienPackage.CONTACTO__USERNAME:
				return USERNAME_EDEFAULT == null ? username != null : !USERNAME_EDEFAULT.equals(username);
			case ResultquienPackage.CONTACTO__PASSWORD:
				return PASSWORD_EDEFAULT == null ? password != null : !PASSWORD_EDEFAULT.equals(password);
			case ResultquienPackage.CONTACTO__TELEFONO:
				return TELEFONO_EDEFAULT == null ? telefono != null : !TELEFONO_EDEFAULT.equals(telefono);
			case ResultquienPackage.CONTACTO__NOMBRE:
				return NOMBRE_EDEFAULT == null ? nombre != null : !NOMBRE_EDEFAULT.equals(nombre);
			case ResultquienPackage.CONTACTO__DESCRIPCION:
				return DESCRIPCION_EDEFAULT == null ? descripcion != null : !DESCRIPCION_EDEFAULT.equals(descripcion);
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (idContacto: ");
		result.append(idContacto);
		result.append(", username: ");
		result.append(username);
		result.append(", password: ");
		result.append(password);
		result.append(", telefono: ");
		result.append(telefono);
		result.append(", nombre: ");
		result.append(nombre);
		result.append(", descripcion: ");
		result.append(descripcion);
		result.append(')');
		return result.toString();
	}

} //ContactoImpl
