package com.pack.MockitoDemo;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.mockito.Mockito;

public class TestCalculator {

	
	Calculator c1 = null;
	CalculatorService cs = Mockito.mock(CalculatorService.class);
	
	@Test
	public void testOperation() {
		assertEquals(0,c1.performCalculation(cs));
		System.out.println("Tested Operation");
	}
	
	@Before
	public void createObject()
	{
		System.out.println("Object created-------");
		c1 = new Calculator();
		
	}
	
	@After
	public void removeObject()
	{
		System.out.println("Object dereferenced-------");
		c1 = null;
		
	}
	
}
