package com.llavore.Bussines.CalculateNumber;

public class CalculateNumber implements ICalculateNumber {

	private int[] numberArray;
	public CalculateNumber () {
		numberArray = new int[100];
		for(int i = 0; i<numberArray.length; i++) {
			numberArray[i]=(i+1);
		}
	}
	
	@Override
	public int calculateParNumberArray() {
		int totalResult = 0;
		for(int i = 0; i<numberArray.length; i=i+2) {
			totalResult+=numberArray[i];
		}
		return totalResult;
	}

}
