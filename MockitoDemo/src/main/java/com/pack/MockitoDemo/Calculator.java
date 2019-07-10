package com.pack.MockitoDemo;

public class Calculator {
	
	public int performCalculation(CalculatorService cs)
	{
		System.out.println("Performing Calculation");
		return cs.add(10, 20);
	}

}
