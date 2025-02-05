package com.FirstProgram;

import java.util.Scanner;

public class Switch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the number");
		
		long num = sc.nextLong();
		
		int result = (int) num%2;
		
		System.out.println(result);
		
		switch(result) {
		case 0:
			System.out.println("Even number");
			break;
		default:
			System.out.println("Odd number");
		}
	}

}
