package com.llavore.Bussines.Operations;

public class OperationsArray implements IOperations {

	private int[] numberArray;
	public OperationsArray () {
		numberArray = new int[100];
		for(int i = 0; i<numberArray.length; i++) {
			numberArray[i]=(i+1);
		}
	}
	
	@Override
	public int operationParNumberArray() {
		int totalResult = 0;
		for(int i = 0; i<numberArray.length; i=i+2) {
			totalResult+=numberArray[i];
		}
		return totalResult;
	}

	@Override
	public int operationParNumberArray(int[] array) {
		int totalResult = 0;
		for(int i = 0; i<array.length; i=i+2) {
			totalResult+=array[i];
		}
		return totalResult;
	}
	
	@Override
	public int operationNumberArray(int[] array, int number) {
		int totalResult = 0;
		for(int i = 0; i<array.length; i=i+number) {
			totalResult+=array[i];
		}
		return totalResult;
	}

}
