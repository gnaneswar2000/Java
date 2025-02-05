package com.FirstProgram;

import java.util.Scanner;

public class Calculator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the number 1");
		
		long num1 = sc.nextLong();
		
		System.out.println("Enter the number 2");

		long num2= sc.nextLong();

		System.out.println("Enter the operation");

        char operator = sc.next().charAt(0);
        
        float result;
								
		switch(operator) {
		
		case '+':
			result = num1 + num2;
			System.out.println(result);
			break;
		case '-':
			result = num1 - num2;
			System.out.println(result);
			break;
		case '*':
			result = num1 * num2;
			System.out.println(result);
			break;
		case '/':
			result = num1 / num2;
			System.out.println(result);
			break;
		default:
			System.out.println("Invalid operator");
		}
	}

}
