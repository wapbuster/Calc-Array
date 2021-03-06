package com.indus.training.core;

import com.indus.training.core.impl.Calc;

import junit.framework.TestCase;

public class TestCalc extends TestCase {

	private Calc calObj = null;

	protected void setUp() throws Exception {
		calObj = new Calc();
	}

	protected void tearDown() throws Exception {
		calObj = null;
	}

	public void testAdditionSenarioArray() {
		double param[] = new double[4];
		// Input
		/*
		 * double param1 = 10.0; double param2 = 20.0;
		 */
		param[0] = 10.0;
		param[1] = 20.0;
		param[2] = 30.0;
		param[3] = 40.0;

		// Expected Output
		double expResult = 100.0;

		// Actual Output
		double actualResult = calObj.addition(param);

		// Assertion
		assertEquals(expResult, actualResult, 0);

	}

	public void testAdditionSenarioVariableAurguments() {
		// Input
		/*double param1 = 10.0;
		double param2 = 25.0;*/

		// Expected Output
		double expResult = 100.0;

		// Actual Output
		double actualResult = calObj.addition(10.0,10.0,10.0,10.0,20.0,20.0,20.0);

		// Assertion
		assertEquals(expResult, actualResult, 0);
	}

	public void testAdditionSenario3Parameters() {
		// Input
		double param1 = 20.0;
		double param2 = 20.0;
		double param3 = 10.0;

		// Expected Output
		double expResult = 50.0;

		// Actual Output
		double actualResult = calObj.addition(param1, param2, param3);

		// Assertion
		assertEquals(expResult, actualResult, 0);
	}

	public void testSubtrat() {
		// Input
		double param1 = 30.0;
		double param2 = 20.0;

		// Expected Output
		double expResult = 10.0;

		// Actual Output
		double actualResult = calObj.subtract(param1, param2);

		// Assertion
		assertEquals(expResult, actualResult, 0);
	}

	public void testMultiply() {
		// Input
		double param1 = 10.0;
		double param2 = 2.0;

		// Expected Output
		double expResult = 20.0;

		// Actual Output
		double actualResult = calObj.multiply(param1, param2);

		// Assertion
		assertEquals(expResult, actualResult, 0);
	}

	public void testDivision() {
		// Input
		double param1 = 50.0;
		double param2 = 10.0;

		// Expected Output
		double expResult = 5.0;

		// Actual Output
		double actualResult = calObj.division(param1, param2);

		// Assertion
		assertEquals(expResult, actualResult, 0);
	}

}