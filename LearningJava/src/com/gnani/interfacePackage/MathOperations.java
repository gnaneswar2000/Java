package com.gnani.interfacePackage;

public interface MathOperations {
	public int sum(int a, int b);
	public int subraction(int a, int b);
	public float division(int a, int b);
	public int multiply(int a, int b);
	default float mean (int a, int b) {
		return average(a,b);
	}
	
	private float average(int a, int b) {
		float avg = sum(a, b) / 2;
		return avg;
	}


}
