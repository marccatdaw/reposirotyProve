package com.llavore.business.integration.test;

import static org.junit.Assert.*;

import org.junit.Test;

import com.llavore.Bussines.Calculator;

public class CalculatorIntegrationTest {

	@Test
	public void testAdd() {
		fail("Not yet implemented");	
	}

	
	@Test
	public void testSubstract() {
		Calculator calc = new Calculator();
		assertEquals(calc.substract(6, 2),4);
	}
	
	@Test
	public void testmultiply() {
		fail("Not yet implemented");	
	}
	
	@Test
	public void testDivide() {
		fail("Not yet implemented");	
	}
}

