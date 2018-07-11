package com.qa.calculator;

public class Calculator {
	
	Operation opp;
	
	public Calculator(Operation opp) {
		this.opp = opp;
	}
	
	public double execute(double num1, double num2) {
		return this.opp.doOperation(num1, num2);
	}
}
