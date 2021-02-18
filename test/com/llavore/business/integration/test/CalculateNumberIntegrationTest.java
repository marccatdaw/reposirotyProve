package com.llavore.business.integration.test;

import static org.junit.Assert.*;

import org.junit.Test;

import com.llavore.Bussines.Operations.*;

public class CalculateNumberIntegrationTest {

	@Test
	public void testOperateParNumberArray() {
		OperationsArray calculate = new OperationsArray();
		assertEquals(calculate.operationParNumberArray(),2500);
	}
	
	@Test
	public void testOperateParNumberArrayWithArray() {
		int[] array = new int[7];
		array[0]=2;
		array[2]=2;
		array[4]=2;
		array[6]=2;
		OperationsArray calculate = new OperationsArray();
		assertEquals(calculate.operationParNumberArray(array),8);
	}
	
	@Test
	public void testOperateNumberArray() {
		int[] array = new int[10];
		array[0]=2;
		array[3]=2;
		array[6]=2;
		array[9]=2;
		OperationsArray calculate = new OperationsArray();
		assertEquals(calculate.operationNumberArray(array,3),8);
	}

}
