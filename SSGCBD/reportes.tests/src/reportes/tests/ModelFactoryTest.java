/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package reportes.tests;

import junit.framework.TestCase;

import junit.textui.TestRunner;

import reportes.ModelFactory;
import reportes.ReportesFactory;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Model Factory</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class ModelFactoryTest extends TestCase {

	/**
	 * The fixture for this Model Factory test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ModelFactory fixture = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(ModelFactoryTest.class);
	}

	/**
	 * Constructs a new Model Factory test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ModelFactoryTest(String name) {
		super(name);
	}

	/**
	 * Sets the fixture for this Model Factory test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void setFixture(ModelFactory fixture) {
		this.fixture = fixture;
	}

	/**
	 * Returns the fixture for this Model Factory test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private ModelFactory getFixture() {
		return fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	protected void setUp() throws Exception {
		setFixture(ReportesFactory.eINSTANCE.createModelFactory());
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

} //ModelFactoryTest
