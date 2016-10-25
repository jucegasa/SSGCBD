/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package reportes.ui.tests;

import junit.framework.TestCase;

import junit.textui.TestRunner;

import reportes.ui.UI;
import reportes.ui.UiFactory;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>UI</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class UITest extends TestCase {

	/**
	 * The fixture for this UI test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected UI fixture = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(UITest.class);
	}

	/**
	 * Constructs a new UI test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public UITest(String name) {
		super(name);
	}

	/**
	 * Sets the fixture for this UI test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void setFixture(UI fixture) {
		this.fixture = fixture;
	}

	/**
	 * Returns the fixture for this UI test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private UI getFixture() {
		return fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	protected void setUp() throws Exception {
		setFixture(UiFactory.eINSTANCE.createUI());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#tearDown()
	 * @generated
	 */
	protected void tearDown() throws Exception {
		setFixture(null);
	}

} //UITest
