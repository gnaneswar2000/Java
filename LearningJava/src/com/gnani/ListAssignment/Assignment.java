package com.gnani.ListAssignment;

import java.util.*;
import java.util.Scanner;

public class Assignment {

	public static void main(String[] args) {

		Solutions sol = new Solutions();

		System.out.print("Enter Problem Number: ");

		try (Scanner sc = new Scanner(System.in)) {
			int problemNumber = sc.nextInt();

			if (problemNumber == 1) {
				ArrayList<Integer> arr = new ArrayList<>();
				arr.add(4);
				arr.add(5);
				arr.add(0);
				arr.add(9);
				arr.add(8);
				arr.add(10);

				int sum = sol.sum(arr);
				int avg = sol.average(arr);

				System.out.println("Sum - " + sum + " & Average - " + avg);
			}

			else if (problemNumber == 2) {
				Vector<Integer> arr = new Vector<>();
				arr.add(4);
				arr.add(5);
				arr.add(0);
				arr.add(9);
				arr.add(8);
				arr.add(10);

				int sum = sol.problem02(arr);

				System.out.println(sum);
			}

			else if (problemNumber == 3) {
				LinkedList<Integer> arr = new LinkedList<>();
				arr.add(4);
				arr.add(9);
				arr.add(8);
				arr.add(5);
				arr.add(0);
				arr.add(10);

				Integer[] ll = new Integer[arr.size()];
				int c = 0;
				for (Integer i : arr) {
					ll[c++] = i;
				}

				LinkedList<Integer> firstHalf = sol.problem03_firstHalf(ll);
				LinkedList<Integer> secondHalf = sol.problem03_secondHalf(ll);

				System.out.println("List1 - " + firstHalf + "& List2 - " + secondHalf);
			}

			else if (problemNumber == 4) {
				LinkedList<Integer> array1 = new LinkedList<>();
				array1.add(4);
				array1.add(9);
				array1.add(8);

				LinkedList<Integer> array2 = new LinkedList<>();
				array2.add(5);
				array2.add(0);
				array2.add(10);

				LinkedList<Integer> ll = sol.problem04(array1, array2);

				System.out.println(ll);
			}

			else if (problemNumber == 5) {
				LinkedList<String> array = new LinkedList<>();
				String[] str = new String[] { "baby", "ball", "soap", "baby", "shampoo", "chalk", "soap", "makeup",
						"baby", "lotion" };
				array.add("baby");
				array.add("ball");
				array.add("soap");
				array.add("baby");
				array.add("shampoo");
				array.add("chalk");
				array.add("soap");
				array.add("makeup");
				array.add("baby");
				array.add("lotion");

				sol.problem05(array);
			}

		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
