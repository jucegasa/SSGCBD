/**
 */
package model.uimanager.tests;

import junit.framework.TestCase;

import junit.textui.TestRunner;

import model.uimanager.MemorandoViewModel;
import model.uimanager.UimanagerFactory;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Memorando View Model</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class MemorandoViewModelTest extends TestCase {

	/**
	 * The fixture for this Memorando View Model test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected MemorandoViewModel fixture = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(MemorandoViewModelTest.class);
	}

	/**
	 * Constructs a new Memorando View Model test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MemorandoViewModelTest(String name) {
		super(name);
	}

	/**
	 * Sets the fixture for this Memorando View Model test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void setFixture(MemorandoViewModel fixture) {
		this.fixture = fixture;
	}

	/**
	 * Returns the fixture for this Memorando View Model test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected MemorandoViewModel getFixture() {
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
		setFixture(UimanagerFactory.eINSTANCE.createMemorandoViewModel());
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

} //MemorandoViewModelTest
