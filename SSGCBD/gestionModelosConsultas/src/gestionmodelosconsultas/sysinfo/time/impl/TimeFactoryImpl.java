/**
 */
package gestionmodelosconsultas.sysinfo.time.impl;

import gestionmodelosconsultas.sysinfo.time.*;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class TimeFactoryImpl extends EFactoryImpl implements TimeFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static TimeFactory init() {
		try {
			TimeFactory theTimeFactory = (TimeFactory)EPackage.Registry.INSTANCE.getEFactory(TimePackage.eNS_URI);
			if (theTimeFactory != null) {
				return theTimeFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new TimeFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TimeFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
			case TimePackage.TIME_VIEW: return createTime_View();
			case TimePackage.FECHA: return createFecha();
			case TimePackage.CALENDARIO: return createCalendario();
			case TimePackage.AGENDA: return createAgenda();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Time_View createTime_View() {
		Time_ViewImpl time_View = new Time_ViewImpl();
		return time_View;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Fecha createFecha() {
		FechaImpl fecha = new FechaImpl();
		return fecha;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Calendario createCalendario() {
		CalendarioImpl calendario = new CalendarioImpl();
		return calendario;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Agenda createAgenda() {
		AgendaImpl agenda = new AgendaImpl();
		return agenda;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TimePackage getTimePackage() {
		return (TimePackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static TimePackage getPackage() {
		return TimePackage.eINSTANCE;
	}

} //TimeFactoryImpl
