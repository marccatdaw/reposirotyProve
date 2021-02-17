package com.llavore.Bussines;

public class Calculator implements ICalculator {
	public int add(int num1, int num2){
		return num1 + num2;
	}
	
	public int substract(int num1, int num2) {
		return this.add(num1, num2*(-1));	
	}
	
	public int multiply (int num1, int num2){
		return num1 * num2;
	}
	
	public int divide(int num1, int num2) {
		return num1 / num2;
	}
	
}
