package com.gnani.interfacePackage;
import java.lang.Math;

public class Average implements MathOperations, ScientificOperations {

	
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

	@Override
	public double sine(int angle) {
		// TODO Auto-generated method stub
		return Math.sin(angle);
	}

	@Override
	public double cosine(int angle) {
		// TODO Auto-generated method stub
		return Math.cos(angle);
	}

	@Override
	public double tan(int angle) {
		// TODO Auto-generated method stub
		return Math.tan(angle);
	}

}
