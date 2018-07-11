package com.qa.calculator;

public class Calculator {

	public double add(double num1, double num2) {
		Add addOpp = new Add();
		return addOpp.doOperation(num1, num2);
	}

}
