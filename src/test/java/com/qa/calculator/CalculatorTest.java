package com.qa.calculator;

import static org.junit.Assert.*;

import org.junit.Assert;
import org.junit.Test;

public class CalculatorTest {

	@Test
	public void test() {
		Operation opp = new Subtract();
		Calculator calc = new Calculator(opp);
		double actualValue = calc.execute(4, 2);
		assertEquals(2, actualValue, 0.0001);
	}

}
