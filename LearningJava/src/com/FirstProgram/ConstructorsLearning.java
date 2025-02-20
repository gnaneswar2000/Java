package com.FirstProgram;

import java.util.Scanner;

public class ConstructorsLearning {
	
	public int i;

	public static void main(String[] args) {
		
		Scanner dc = new Scanner(System.in);
		
		System.out.println("Enter the number");
		int d = dc.nextInt();
		// TODO Auto-generated method stub
		ConstructorsLearning cl = new ConstructorsLearning(d);
		System.out.println("Your desired number is: "+cl.i);

	}
	
	public ConstructorsLearning() {
		i = 10;
	}

	public ConstructorsLearning(int i1) {
		i = i1 + 25;
	}

}
