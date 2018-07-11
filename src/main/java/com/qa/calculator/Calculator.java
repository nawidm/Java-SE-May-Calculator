package com.qa.calculator;

public class Calculator {

	public double subtract(double num1, double num2) {
		Subtract subtractOperation = new Subtract();
		return subtractOperation.doOperation(num1, num2);
		
	}

}
