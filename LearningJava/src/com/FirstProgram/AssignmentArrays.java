package com.FirstProgram;

import java.util.Arrays;
import java.util.Scanner;

public class AssignmentArrays {
	
	static AssignmentArrays ass = new AssignmentArrays();


	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the operation:");
		
		String inp = sc.nextLine();
		
		if (inp.equalsIgnoreCase("sum")) {
			int[] array = new int[]{2,5,1,9,6};
			System.out.println("Sum of array [2,5,1,9,6] is:" +ass.sum(array));
		}
		else if(inp.equalsIgnoreCase("average")) {
			int[] array = new int[]{2,5,3,9,6};
			System.out.println("Average of array [2,5,3,9,6] is:" +ass.average(array));
		}
		else if(inp.equalsIgnoreCase("merge")) {
			String[] array1 = new String[]{"chai", "coffee"};
			String[] array2 = new String[]{"milk", "water", "coke"};

			System.out.println("Merged array is:" + Arrays.toString(ass.merge(array1, array2)));
		}
		if (inp.equalsIgnoreCase("max")) {
			int[] array = new int[]{565,656,66,444};
			System.out.println("Maximum element of array [1,2,3,4,5,6,7,8,9,10] is:" +ass.max(array));
		}
		else if(inp.equalsIgnoreCase("min length")) {
			String[] array = new String[]{"chai", "coffee", "milk", "water", "coke"};
			System.out.println("Minimum Length String of array [chai\", \"coffee\", \"milk\", \"water\", \"coke] is:" +ass.minLength(array));
		}
		else if(inp.equalsIgnoreCase("reverse")) {
			String[] array = new String[]{"true", "false", "false", "true", "false", "true"};
			System.out.println("Reverse of array [\"true\", \"false\", \"false\", \"true\", \"false\", \"true\"] is:" + Arrays.toString(ass.reverse(array)));
		}
	}
	
	
	
	public int sum(int[] i) {
		int temp = 0;
		for (int j = 0; j < i.length; j++) {
			temp = temp + i[j];
		}
		return temp;
	}
		
	
	
	public float average(int[] i) {
		int temp1 = ass.sum(i);
		float avg = temp1/i.length;
		return avg;
	}
	
	

	public String[] merge(String[] i, String[] j) {
		String[] merge = new String[i.length + j.length];
		for (int k = 0; k<merge.length; k++) {
			merge[k] = i[k];
			if(k == 1)
				break;
		}
		for (int k = 2; k<merge.length; k++) {
			merge[k] = j[k-2];
			if(k == 4)
				break;
		}
		return merge;
	}
	
	
	public int max(int[] arr) {
		int c = 0;
		outerLoop:
		for (int i = 0; i < arr.length; i++) {
			int temp = 0;
			for (int j = 0; j < arr.length; j++) {
				if (arr[i] >= arr[j]) {
					temp+=1;
					if (temp == arr.length) {
						c = arr[i];
						break outerLoop;
					}
				}	
			}
		}
		return c;
	}
	
	
	
	public String minLength(String[] arr) {
		int[] int_array = new int[arr.length];
		for (int i = 0; i < arr.length; i++) {
			int_array[i] = arr[i].length();
		}
		int c = 0;
		int d = 0;
		outerLoop:
		for (int i = 0; i < int_array.length; i++) {
			int temp = 0;
			for (int j = 0; j < int_array.length; j++) {
				if (int_array[i] <= int_array[j]) {
					temp+=1;
					if (temp == arr.length) {
						c = int_array[i];
						d = i;
						break outerLoop;
					}
				}	
			}
		}
		
		return arr[d];
		
	}
	
	
	
	public String[] reverse(String[] arr) {
		String[] string_array = new String[arr.length];
		for (int i = 0; i < arr.length; i++) {
			string_array[i] = arr[arr.length-i-1];
		}
		return string_array;
	}
}
