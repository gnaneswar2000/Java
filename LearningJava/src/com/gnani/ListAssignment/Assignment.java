package com.gnani.ListAssignment;

import java.util.*;
import java.util.Scanner;

import com.gnani.pojoExample.Employee;

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
				ArrayList<String> array = new ArrayList<>();
				array.add("baby");
				array.add("ball");
				array.add("soap");
				array.add("baby");
				array.add("shampoo");
				array.add("chalk");
				array.add("soap");
				array.add("makeup");
				array.add("baby");
				array.add("chalk");

				sol.problem05(array);
			}

			else if (problemNumber == 6) {
				ArrayList<Integer> array = new ArrayList<>();
				array.add(4);
				array.add(1);
				array.add(9);
				array.add(4);
				array.add(8);
				array.add(0);
				array.add(5);
				array.add(8);
				array.add(1);
				array.add(8);
				array.add(6);

				sol.problem06(array);
			}

			else if (problemNumber == 7) {
				ArrayList<Integer> array = new ArrayList<>();
				array.add(4);
				array.add(1);
				array.add(9);
				array.add(4);
				array.add(8);
				array.add(0);
				array.add(5);
				array.add(1);
				array.add(8);
				array.add(6);

				sol.problem07(array);
			}

			else if (problemNumber == 8) {
				LinkedList<Integer> array1 = new LinkedList<>();
				array1.add(4);
				array1.add(9);
				array1.add(8);
				array1.add(5);

				LinkedList<Integer> array2 = new LinkedList<>();
				array2.add(1);
				array2.add(8);
				array2.add(0);
				array2.add(5);
				array2.add(1);
				array2.add(6);

				LinkedList<Integer> ll = sol.problem08(array1, array2);

				System.out.println(ll);
			}

			else if (problemNumber == 9) {
				int inp = sc.nextInt();
				LinkedList<Integer> ll = sol.problem09(inp);
				System.out.println(ll);
			}

			else if (problemNumber == 10) {
				ArrayList<Integer> array = new ArrayList<>();
				array.add(4);
				array.add(9);
				array.add(8);
				array.add(5);
				array.add(0);
				array.add(10);

				Integer[] arr = sol.problem10(array);
				System.out.println(Arrays.toString(arr));
			}

			else if (problemNumber == 11) {
				ArrayList<Integer> array1 = new ArrayList<>();
				array1.add(4);
				array1.add(9);
				array1.add(8);

				ArrayList<Integer> array2 = new ArrayList<>();
				array2.add(4);
				array2.add(1);
				array2.add(9);
				array2.add(4);
				array2.add(8);
				array2.add(0);
				array2.add(5);
				array2.add(1);
				array2.add(8);
				array2.add(6);

				ArrayList<Integer> arr = sol.problem11(array1, array2);
				System.out.println(arr);
			}

			else if (problemNumber == 12) {

				ArrayList<Integer> array = new ArrayList<>();
				array.add(1);
				array.add(8);
				array.add(0);
				array.add(5);
				array.add(1);
				array.add(6);

				System.out.print("Enter number: ");
				int inp = sc.nextInt();

				int arr = sol.problem12(array, inp);
				System.out.println(arr);
			}

			else if (problemNumber == 13) {

				ArrayList<Integer> array = new ArrayList<>();
				array.add(1);
				array.add(8);
				array.add(0);
				array.add(5);
				array.add(1);
				array.add(6);

				ArrayList<Integer> arr = sol.problem13(array);
				System.out.println(arr);
			}

			else if (problemNumber == 14) {

				ArrayList<Integer> array = new ArrayList<>();
				array.add(1);
				array.add(8);
				array.add(0);
				array.add(5);
				array.add(1);
				array.add(6);

				ArrayList<Integer> asc_ord = sol.problem14_AO(array);
				ArrayList<Integer> desc_ord = sol.problem14_DO(array);

				System.out.println(asc_ord);
				System.out.println(desc_ord);

			}

			else if (problemNumber == 15) {

				ArrayList<Integer> array = new ArrayList<>();
				array.add(4);
				array.add(1);
				array.add(9);
				array.add(4);
				array.add(8);
				array.add(0);
				array.add(5);
				array.add(8);
				array.add(1);
				array.add(8);
				array.add(6);

				sol.problem15(array);

			}

			else if (problemNumber == 19) {

				System.out.print("Enter the String: ");
				String str = sc.next();
				sol.problem19(str);

			}
			
			else if (problemNumber == 20) {

				sol.problem20();

			}


		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
