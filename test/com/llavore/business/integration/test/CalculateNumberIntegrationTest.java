package com.llavore.business.integration.test;

import static org.junit.Assert.*;

import org.junit.Test;

import com.llavore.Bussines.CalculateNumber.*;

public class CalculateNumberIntegrationTest {

	@Test
	public void testCalculateParNumberArray() {
		CalculateNumber calculate = new CalculateNumber();
		assertEquals(calculate.calculateParNumberArray(),2500);
		
	}

}
