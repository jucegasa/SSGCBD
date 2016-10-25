/**
 */
package model.uimanager.tests;

import junit.framework.TestCase;

import junit.textui.TestRunner;

import model.uimanager.UIManager;
import model.uimanager.UimanagerFactory;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>UI Manager</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class UIManagerTest extends TestCase {

	/**
	 * The fixture for this UI Manager test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected UIManager fixture = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(UIManagerTest.class);
	}

	/**
	 * Constructs a new UI Manager test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public UIManagerTest(String name) {
		super(name);
	}

	/**
	 * Sets the fixture for this UI Manager test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void setFixture(UIManager fixture) {
		this.fixture = fixture;
	}

	/**
	 * Returns the fixture for this UI Manager test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected UIManager getFixture() {
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
		setFixture(UimanagerFactory.eINSTANCE.createUIManager());
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

} //UIManagerTest
