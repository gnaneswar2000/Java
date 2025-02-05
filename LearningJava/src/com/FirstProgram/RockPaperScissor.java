package com.FirstProgram;

import java.util.Scanner;

public class RockPaperScissor {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Ready to play Rock Paper Scissor!!!");

		System.out.println("Enter Yes to play");
		String initial_choice = sc.nextLine();

		if (initial_choice.toLowerCase().equals("yes")) {

			System.out.println("Enter your choice");
			String user_choice = sc.nextLine();

			int rock = 1;
			int paper = 2;
			int scissor = 3;

			int randomNumber = (int) (Math.random() * 3) + 1;

			if (randomNumber == 1)
				System.out.printf("Computer's choice is %s", "Rock");
			else if (randomNumber == 2)
				System.out.printf("Computer's choice is %s", "Paper");
			else
				System.out.printf("Computer's choice is %s", "Scissor");
			System.out.println("");
			
			// Rock's probability
			if (user_choice.toLowerCase().equals("rock") && randomNumber == 1)
				System.err.println("Draw");
			else if (user_choice.toLowerCase().equals("rock") && randomNumber == 2)
				System.err.println("Computer WinsYES"
						+ "");
			else if (user_choice.toLowerCase().equals("rock") && randomNumber == 3)
				System.err.println("You Win");
			
			// Paper's probability
			else if (user_choice.toLowerCase().equals("paper") && randomNumber == 1)
				System.err.println("You Win");
			else if (user_choice.toLowerCase().equals("paper") && randomNumber == 2)
				System.err.println("Draw");
			else if (user_choice.toLowerCase().equals("paper") && randomNumber == 3)
				System.err.println("Computer Wins");

			// Scissor's probability
			else if (user_choice.toLowerCase().equals("scissor") && randomNumber == 1)
				System.err.println("Computer Wins");
			else if (user_choice.toLowerCase().equals("scissor") && randomNumber == 2)
				System.err.println("You Win");
			else if (user_choice.toLowerCase().equals("scissor") && randomNumber == 3)
				System.err.println("Draw");

		}

		else
			System.out.println("Thank you :)");
	}
}
