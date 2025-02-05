package com.FirstProgram;

import java.util.Scanner;

public class Loan {
	
	public static void main(String[] args) {
		
        Scanner scanner = new Scanner(System.in);
		
        System.out.println("Enter your principle loan amount");
        double principle = scanner.nextDouble();  
        
        System.out.println("Enter your rate of intrest");
        double rate = scanner.nextDouble();  
        
        System.out.println("Enter your total time period");
        double time = scanner.nextDouble();  
        
        System.out.println("Enter your  Number of times interest is compounded per year");
        int n = scanner.nextInt();  
        
        double simpleIntrestFinal = calculateSimpleInterest(principle, rate, time);
        double compoundIntrestFinal = calculateCompundInterest(principle, rate, time, n);
        
        System.out.println("Simple Intrest for your Loan is: " +simpleIntrestFinal);
        System.out.println("Compound Intrest for your Loan is: " +compoundIntrestFinal);


	}
	
	public static double calculateSimpleInterest(double priciple, double rate, double time) {

		double simpleIntNumerator = priciple * rate * time;
		double simpInt = simpleIntNumerator/100;
		return simpInt;
		
	}

	public static double calculateCompundInterest(double priciple, double rate, double time, int n) {

		double compIntNumerator = 1 + (rate/n);
		double compInt = Math.pow(compIntNumerator, n);
		double finalCompInt = priciple * compInt;
		return finalCompInt;

	}

}

