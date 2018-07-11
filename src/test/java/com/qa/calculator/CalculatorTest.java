package com.qa.calculator;

import static org.junit.Assert.*;

import org.junit.Assert;
import org.junit.Test;

public class CalculatorTest {

	@Test
	public void test() {
		Calculator calc = new Calculator();
		double actualValue = calc.add(2, 2);
		assertEquals(4, actualValue, 0.0001);
	}

}
