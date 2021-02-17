package com.llavore.business.integration.test;

import static org.junit.Assert.*;

import org.junit.Test;

import com.llavore.Bussines.Calculator;

public class CalculatorIntegrationTest {

	@Test
	public void testAdd() {
		Calculator calculator = new Calculator();
		assertEquals(calculator.add(6, 2),8);
	}

	
	@Test
	public void testSubstract() {
		Calculator calculator = new Calculator();
		assertEquals(calculator.substract(6, 2),4);
	}
	
	@Test
	public void testmultiply() {
		Calculator calculator = new Calculator();
		assertEquals(calculator.multiply(6, 2),12);
	}
	
	@Test
	public void testDivide() {
		Calculator calculator = new Calculator();
		assertEquals(calculator.divide(6, 2),3);
	}
}

