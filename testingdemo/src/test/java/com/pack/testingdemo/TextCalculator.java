package com.pack.testingdemo;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class TextCalculator {

	Calculator c1;
	
	@Test
	public void testAdd() {
		assertEquals("Addition is not proper",40,c1.add(20, 20));
		System.out.println("Test Add");
		
	}
	
	@Test
	public void testSub() {
		assertEquals("Substraction is not proper",0,c1.sub(20, 20));
		System.out.println("Test Sub");
		
	}
	
	@Test
	public void isequal()
	{
		assertTrue("a and b are not equal",c1.compare(20, 20));
	}
	
	@Test
	public void isNotEqual()
	{
		assertFalse("a and b are equal",c1.compare(10, 20));
	}
	
	@Before
	public void createObject()
	{
		c1 = new Calculator();
		System.out.println("Object Created");
	}
	
	@After
	public void removeObject()
	{
		c1 = null;
		System.out.println("Object Dereferenced");
	}
	
	
	@BeforeClass
	public static void abc()
	{
		System.out.println("FIRST");
	}
	
	@AfterClass
	public static void xyz()
	{
		System.out.println("LAST");
	}

}
