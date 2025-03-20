package com.FirstProgram;

import java.util.Arrays;
import java.util.Scanner;

public class MultiDimensionalArrayAssignment {
	
	static MultiDimensionalArrayAssignment multi = new MultiDimensionalArrayAssignment();
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter the Operation name: ");
		String inp = sc.nextLine();
	
		if (inp.equalsIgnoreCase("sum")) {
			int[][] arr = {
					{1,8,4},
					{9,7,4},
					{7,6,4}
			};
			System.out.printf("Sum of elements in your array is: " +multi.sum(arr));
		}
		
		else if (inp.equalsIgnoreCase("add")) {
			int[][] array1 = {
					{1,2,1},
					{9,7,2},
					{7,6,4}
			};
			
			int[][] array2 = {{2,6,8},{0,1,3},{1,2,4}};
			int[][] array3 = multi.addElements(array1, array2);
			System.out.println("Sum of Array1 and Array2 is: ");
			multi.printMatrix(array3);
		}
		
		else if (inp.equalsIgnoreCase("square")) {
			int[][] array = {
					{2,3,5},
					{0,1,3},
					{1,2,4}
			};
			
			int[][] array3 = multi.square(array);
			System.out.println("Square of each element in array is: ");
			multi.printMatrix(array3);
		}
		
		else if (inp.equalsIgnoreCase("common")) {
			int[][] array1 = {
					{1,2,1},
					{9,7,2},
					{7,6,4}
			};
			
			int[][] array2 = {{2,6,8,6},{0,1,3,9,7},{7,2,0},{8,3}};
		multi.common(array1, array2);
		}	
		
		else if (inp.equalsIgnoreCase("create")) {
			int[][] array1 = {
					{1,2,1},
					{9,7,2},
					{7,6,4}
			};
			
			int[][] array2 = {
					{1,6,1},
					{0,7,3},
					{1,6,4}
			};		
			int[][] array3 = multi.create(array1, array2);
			System.out.println("Sum of Array1 and Array2 is: ");
			multi.printMatrix(array3);		
		}
		
		else if (inp.equalsIgnoreCase("transpose")) {
			int[][] array = {
					{1,8,4},
					{9,7,2},
					{7,6,4}
			};
			
			int[][] array3 = multi.transpose(array);
			System.out.println("Square of each element in array is: ");
			multi.printMatrix(array3);
		}
	}
	
	
	
/*
 * All Functions start here
 */
	
	
	public void printMatrix(int[][] matrix) {
	    for (int i = 0; i < matrix.length; i++) {
	        for (int j = 0; j < matrix[i].length; j++) {
	            System.out.print(matrix[i][j] + " ");
	        }
	        System.out.println();
	    }
	}

	public int sum(int[][] array) {
		int temp = 0;
		for (int i = 0; i < array.length; i++) {
			for (int j = 0; j < array[i].length; j++) {
				temp += array[i][j];
			}
		}
		return temp;	
	}
	
	public int[][] addElements(int[][] array1, int[][] array2) {
		int[][] array3 = new int[array1.length][array2.length]; 
		for (int i = 0; i < array1.length; i++) {
			for (int j = 0; j < array2.length; j++) {
				array3[i][j] = array1[i][j] + array2[i][j];
			}
		}
		return array3;	
	}
	
	public int[][] square(int[][] array1) {
		int[][] array3 = new int[array1.length][array1[0].length]; 
		for (int i = 0; i < array1.length; i++) {
			for (int j = 0; j < array1[i].length; j++) {
				array3[i][j] = array1[i][j] * array1[i][j];
			}
		}
		return array3;	
	}
	
	public void common(int[][] array1, int[][] array2) {
		int size = 0;
		for (int i = 0; i < array2.length; i++) {
			for (int j = 0; j < array2[i].length; j++) {
				size++;
			}
		}
		int[] array3 = new int[(array1.length * array1[0].length)]; 
		int[] array4 = new int[size]; 
		int[] array5 = new int[array3.length]; 

		int k = 0;
		int l = 0;
		int m = 0;

		// inserting array 1 elements in to array3 which is 1D
		for (int i = 0; i < array1.length; i++) {
			int s = array1[i].length; 
			for (int j = 0; j < array1[i].length; j++) {
				array3[k] = array1[i][j];
				k++;
			}
		}
		
		// inserting array 1 elements in to array3 which is 1D
		for (int i = 0; i < array2.length; i++) {
			for (int j = 0; j < array2[i].length; j++) {
				array4[l] = array2[i][j];
				l++;
			}
		}
	
		
		//Unique elements from Array3
        Arrays.sort(array3);
        
        // Temporary array to hold unique elements
        int[] temp = new int[array3.length];
        int a = 0;

        for (int b = 0; b < array3.length - 1; b++) {
            if (array3[b] != array3[b + 1]) {
                temp[a++] = array3[b];
            }
        }
        
        // Add the last element (since it won’t be compared)
        temp[a++] = array3[array3.length - 1];

        // Copy unique values into a new array with correct size
        int[] uniqueArray = Arrays.copyOf(temp, a);
        
        
        
        for (int i = 0; i < uniqueArray.length; i++) {
			for (int j = 0; j < array4.length; j++) {
			if (uniqueArray[i] == array4[j]) {
				System.out.print(uniqueArray[i] +" ");
				break;
			}	
		}
	}
		
	}
	
	public int[][] create(int[][] array1, int[][] array2){
		int[][] array3 = new int[array1.length][array1[0].length]; 
		for (int i = 0; i < array1.length; i++) {
			for (int j = 0; j < array1[i].length; j++) {
				if (array1[i][j] == array2[i][j])
				array3[i][j] = 1;
				else
					array3[i][j] = 0;
			}
		}
		return array3;
	}
	
	
	public int[][] transpose(int[][] array1){
		int[][] array2 = new int[array1.length][array1[0].length]; 
		for (int p = 0; p < array1.length; p++) {
			for (int q = 0; q < array1[p].length; q++) {
				array2[p][q] = array1[q][p];
			}
		}
		return array2;
	}
	
	
}
