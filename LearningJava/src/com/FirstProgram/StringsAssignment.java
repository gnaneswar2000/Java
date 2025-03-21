package com.FirstProgram;

import java.util.Arrays;
import java.util.Scanner;

public class StringsAssignment {

	static StringsAssignment ass = new StringsAssignment();

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.print("Enter the Operation: ");
		String inp = sc.nextLine();

		if (inp.equalsIgnoreCase("count characters")) {

			System.out.print("Enter the String: ");
			String string = sc.nextLine();

			System.out.print("Length of the given String is: " + ass.countCharacters(string));
		}

		else if (inp.equalsIgnoreCase("count words")) {

			System.out.print("Enter the String: ");
			String string = sc.nextLine();

			System.out.println("Number of words in the given String is: " + ass.countWords(string));
		}

		else if (inp.equalsIgnoreCase("occurances")) {

			System.out.print("Enter the String: ");
			String string = sc.nextLine();

			System.out.print("Enter the charcter you want to find: ");
			char character = sc.next().charAt(0);

			System.out.print("Number of times in the given String is: " + ass.occurances(string, character));
		}

		else if (inp.equalsIgnoreCase("reverse")) {

			System.out.print("Enter the String: ");
			String string = sc.nextLine();

			System.out.println("Reversed String is: " + ass.reverse(string));
		}
		
		else if (inp.equalsIgnoreCase("trim")) {

			System.out.print("Enter the String: ");
			String string = sc.nextLine();

			System.out.println("Reversed String is: " + ass.trim(string));
		}
		
		else if (inp.equalsIgnoreCase("rew")) {

			System.out.print("Enter the String: ");
			String string = sc.nextLine();

			System.out.println("Reversed String is: " + ass.reverseEachWord(string));
		}
		
		else if (inp.equalsIgnoreCase("modify")) {

			System.out.print("Enter the String: ");
			String string = sc.nextLine();

			System.out.println("Modified String is: " + ass.modify(string));
		}
	}

	public int countCharacters(String inp) {
		return inp.length();
	}

	public int countWords(String inp) {
		String[] out = inp.split(" ");
		return out.length;
	}

	public int occurances(String inp1, char inp2) {
		String[] out = inp1.split(String.valueOf(inp2));
		return out.length - 1;
	}

	public String reverse(String inp) {
		char[] inp1 = inp.toCharArray();
		char[] finalout = new char[inp.length()];
		for (int i = inp1.length - 1; i >= 0; i--) {
			finalout[(inp1.length - 1) - i] = inp1[i];
		}
		return String.valueOf(finalout);
	}
	
	public String trim(String inp) {
		return inp.trim();
	}
	
	 public String reverseEachWord(String inp) {
		String[]  split_inp = inp.split(" ");
		 String[] out = new String[split_inp.length];

		for (int i = 0; i < split_inp.length; i++) {
			out[i] = ass.reverse(split_inp[i]);
		}
		
		String finalOutput = String.join(" ", out); 
		 return finalOutput;
	 }
	 
	 public String modify(String inp) {
		 String[] input = inp.split(" ");
		 String[] finalInput = new String[input.length];

		 for(int i = 0; i < input.length; i++) {
			 if (i%2 == 0) 
				 finalInput[i] = input[i].toUpperCase();

			 else
				 finalInput[i] = ass.reverse(input[i]);
		 }
			return String.join(" ", finalInput);
		}
	 
	 
	
}
