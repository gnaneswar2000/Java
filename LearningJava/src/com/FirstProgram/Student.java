package com.FirstProgram;

import java.util.Scanner;

public class Student {
	
    static int[] array;
    static int n;
    static String name;
    static int rollNumber;
	static Student student = new Student();

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		 Scanner scanner = new Scanner(System.in);
			
	        System.out.println("Enter your Name");
	        name = scanner.next();  
	        
	        System.out.println("Enter your Roll number");
	        rollNumber  = scanner.nextInt();  
	        
	        System.out.print("Enter the number of subjects: ");
	        n = scanner.nextInt(); // Read the size of the array
	        
	        // Create an array of the specified size
	        array = new int[n];
	        
	        // Ask the user to enter the array elements
	        System.out.println("Enter " + n + " subject marks:");
	        for (int i = 0; i < n; i++) {
	            System.out.print("Subject " + (i + 1) + ": ");
	            array[i] = scanner.nextInt(); // Read each element
	        }
	        
	        displayStudentInfo();
	}
	
	public static int addMarks(int[] newMarks) {
		int temp = 0;

		for (int i = 0; i < newMarks.length; i++) {
			temp = temp + newMarks[i]; 
		}
		
		return temp;
		
	}
	
	public static double calculateAverage() {
		
		int total = student.addMarks(array);
		double avg = total/n;
		
		return avg;
		
	}
	
	public static char calculateGrade(){
		double finalAvg = Student.calculateAverage();
		if (finalAvg>=80) {
			return 'A';
		}
		else if(finalAvg>60 && finalAvg<80) {
			return 'B';
		}
		else {
			return 'C';
		}
	}
	
	public static void displayStudentInfo() {
			
		System.out.println("Student's Name: " +name);
		System.out.println("Student's Roll number: " +rollNumber);
		double finalAvg = student.calculateAverage();
		char finalGrade = student.calculateGrade();
		int finalMarks = student.addMarks(array);
		int outOf = n * 100;
		System.out.println("Student's Total Marks: " +finalMarks+ "/" +outOf);
		System.out.println("Student's Average: " +finalAvg);
		System.out.println("Student's Grade: " +finalGrade);
	}

}
