/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package reportes.tests;

import junit.framework.Test;
import junit.framework.TestSuite;

import junit.textui.TestRunner;

import reportes.ui.tests.UiTests;

/**
 * <!-- begin-user-doc -->
 * A test suite for the '<em><b>Reportes</b></em>' model.
 * <!-- end-user-doc -->
 * @generated
 */
public class ReportesAllTests extends TestSuite {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(suite());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static Test suite() {
		TestSuite suite = new ReportesAllTests("Reportes Tests");
		suite.addTest(UiTests.suite());
		return suite;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ReportesAllTests(String name) {
		super(name);
	}

} //ReportesAllTests
