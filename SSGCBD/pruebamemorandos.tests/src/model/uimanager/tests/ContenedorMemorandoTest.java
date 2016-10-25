/**
 */
package model.uimanager.tests;

import junit.framework.TestCase;

import junit.textui.TestRunner;

import model.uimanager.ContenedorMemorando;
import model.uimanager.UimanagerFactory;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Contenedor Memorando</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class ContenedorMemorandoTest extends TestCase {

	/**
	 * The fixture for this Contenedor Memorando test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ContenedorMemorando fixture = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(ContenedorMemorandoTest.class);
	}

	/**
	 * Constructs a new Contenedor Memorando test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ContenedorMemorandoTest(String name) {
		super(name);
	}

	/**
	 * Sets the fixture for this Contenedor Memorando test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void setFixture(ContenedorMemorando fixture) {
		this.fixture = fixture;
	}

	/**
	 * Returns the fixture for this Contenedor Memorando test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ContenedorMemorando getFixture() {
		return fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(UimanagerFactory.eINSTANCE.createContenedorMemorando());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#tearDown()
	 * @generated
	 */
	@Override
	protected void tearDown() throws Exception {
		setFixture(null);
	}

} //ContenedorMemorandoTest
