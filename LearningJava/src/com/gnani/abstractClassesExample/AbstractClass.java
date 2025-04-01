package com.gnani.abstractClassesExample;

import com.gnani.interfacePackage.MathOperations;

public abstract class AbstractClass implements House{
	MathOperations math = new MathOperations() {
		
		@Override
		public int subraction(int a, int b) {
			// TODO Auto-generated method stub
			return 0;
		}
		
		@Override
		public int multiply(int a, int b) {
			// TODO Auto-generated method stub
			return 0;
		}
		
		@Override
		public float division(int a, int b) {
			// TODO Auto-generated method stub
			return 0;
		}
	};
	
	public void emi() {
		System.out.println("Current EMI per month:" +MathOperations.mean(12000, 12000)/12);
	}

	public void carpentryWork() {
		System.out.println("Carpentry work is almost done");
	}
}
