package com.qa.calculator;

import static org.junit.Assert.*;

import org.junit.Assert;
import org.junit.Test;

public class CalculatorTest {

	@Test
	public void test() {
		Calculator calc = new Calculator();
		double actualValue = calc.subtract(4, 2);
		assertEquals(2, actualValue, 0.0001);
	}

}
