package com.qa.calculator;

import org.junit.Assert;
import org.junit.Test;

public class CalculatorTest {

	@Test
	public void test() {
		Operation opp = new Divide();
		Calculator calc = new Calculator(opp);
		double actualValue = calc.execute(5, 2);
		Assert.assertEquals(2.5, actualValue, 0.0001);
	}

}
