package com.FirstProgram;

public class LoopingStatements {

	public static void main(String[] args) {
		
		LoopingStatements ls = new LoopingStatements();
		ls.printValues();
		ls.printValues_2(200, 500);
		ls.printValues_3(150, 200);	
	}
	
	
	/**
	 * Prints 1 to 100 values
	 */
	public void printValues() {
		int i = 1;
		while(i<=100) {
			System.out.println(i);
			i++;
		}
	}
	
	/**
	 * Prints Even numbers between 200 and 500.
	 * @param a initial number
	 * @param b ending number
	 */
	public void printValues_2(int a, int b) {
		int i = a;
		while(i>=a && i<=b) {
			if(i%2 == 0)
				System.out.println(i);
			i++;
		}	
	}
	
	/**
	 * Prints numbers that are divisible by 7 in between 150 and 200.
	 * @param a initial number
	 * @param b ending number
	 */
	public void printValues_3(int a, int b) {
		int i = a;
		while(i>=a && i<=b) {
			if(i%7 == 0)
				System.out.println(i);
			i++;
		}
		
	}

}
