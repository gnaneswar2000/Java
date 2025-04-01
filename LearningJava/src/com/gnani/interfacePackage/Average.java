package com.gnani.interfacePackage;

public class Average implements MathOperations {

	
	@Override
	public int subraction(int a, int b) {
		return a-b;
	}

	@Override
	public float division(int a, int b) {
		return a/b;
	}

	@Override
	public int multiply(int a, int b) {
		return a*b;
	}

	@Override
	public int sum(int a, int b) {
		// TODO Auto-generated method stub
		return a+b;
	}

}
