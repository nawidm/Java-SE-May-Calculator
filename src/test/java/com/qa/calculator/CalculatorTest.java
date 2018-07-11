package com.qa.calculator;

import static org.junit.Assert.*;

import org.junit.Assert;
import org.junit.Test;

public class CalculatorTest {

	@Test
	public void test() {
		Operation opp = new Add();
		Calculator calc = new Calculator(opp);
		double actualValue = calc.execute(2, 2);
		assertEquals(4, actualValue, 0.0001);
	}

}
