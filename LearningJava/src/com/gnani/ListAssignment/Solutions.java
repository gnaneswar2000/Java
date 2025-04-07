package com.gnani.ListAssignment;

import java.util.*;

import com.gnani.pojoExample.Employee;

public class Solutions {

	/*
	 * Problem 01
	 */

	public int sum(ArrayList<Integer> arr) {
		int temp = 0;
		for (Integer i : arr) {
			temp += i;
		}
		return temp;
	}

	public int average(ArrayList<Integer> arr) {
		int sum = sum(arr);
		return sum / arr.size();
	}

	/*
	 * Problem 02
	 */

	public int problem02(Vector<Integer> vec) {
		int temp = 0;
		for (Integer i : vec) {
			if (i % 2 == 0)
				temp += i;
		}
		return temp;
	}

	/*
	 * Problem 03
	 */

	public LinkedList<Integer> problem03_firstHalf(Integer[] ll) {
		LinkedList<Integer> arr = new LinkedList<>();
		for (int i = 0; i < ll.length / 2; i++) {
			arr.add(ll[i]);
		}
		return arr;
	}

	public LinkedList<Integer> problem03_secondHalf(Integer[] ll) {
		LinkedList<Integer> arr = new LinkedList<>();
		for (int i = ll.length / 2; i < ll.length; i++) {
			arr.add(ll[i]);
		}
		return arr;
	}

	/*
	 * Problem 04
	 */

	public LinkedList<Integer> problem04(LinkedList<Integer> ll1, LinkedList<Integer> ll2) {
		LinkedList<Integer> arr = new LinkedList<>();
		arr.addAll(ll1);
		arr.addAll(ll2);
		return arr;
	}

	/*
	 * Problem 05
	 */

	public void problem05(ArrayList<String> ll) {

		Vector<String> name = new Vector<>();
		Vector<Integer> count = new Vector<>();

		for (int i = 0; i < ll.size(); i++) {
			if (i == ll.size() - 1)
				break;
			int c = 1;
			for (int j = i + 1; j < ll.size(); j++) {
				String first = ll.get(i);
				String second = ll.get(j);
				if (first.equalsIgnoreCase(second)) {
					c += 1;
					ll.remove(j);
				}
			}
			if (c > 1) {
				count.add(c);
				name.add(ll.get(i));
			}
		}

		// Print the output.
		for (int i = 0; i < count.size(); i++) {
			if (i == count.size() - 1)
				System.out.print(name.get(i) + " - " + count.get(i));
			else
				System.out.print(name.get(i) + " - " + count.get(i) + " & ");
		}
	}

	/*
	 * Problem 06
	 */

	public void problem06(ArrayList<Integer> ll) {

		Vector<Integer> name = new Vector<>();
		Vector<Integer> count = new Vector<>();

		for (int i = 0; i < ll.size(); i++) {
			if (i == ll.size())
				break;
			int c = 1;
			for (int j = i + 1; j < ll.size(); j++) {
				Integer first = ll.get(i);
				Integer second = ll.get(j);
				if (first == second) {
					c += 1;
					ll.remove(j);
				}
			}
			if (c > 1) {
				count.add(c);
				name.add(ll.get(i));
			}
		}
		System.out.println(count);
		System.out.println(name);

	}

	/*
	 * Problem 07
	 */

	public void problem07(ArrayList<Integer> ll) {

		for (int i = 0; i < ll.size(); i++) {
			if (i == ll.size())
				break;
			for (int j = i + 1; j < ll.size(); j++) {
				Integer first = ll.get(i);
				Integer second = ll.get(j);
				if (first == second) {
					ll.remove(first);
					ll.remove(second);
				}
			}

		}
		System.out.println(ll);
	}

	/*
	 * Problem 08
	 */

	public LinkedList<Integer> problem08(LinkedList<Integer> array1, LinkedList<Integer> array2) {
		LinkedList<Integer> common = new LinkedList<>();

		for (int i = 0; i < array1.size(); i++) {
			for (int j = 0; j < array2.size(); j++) {
				if (array1.get(i) == array2.get(j)) {
					common.add(array1.get(i));
					break;
				}
			}

		}
		return common;
	}

	/*
	 * Problem 09
	 */

	public LinkedList<Integer> problem09(int inp) {

		return null;
	}

	/*
	 * Problem 10
	 */

	public Integer[] problem10(ArrayList<Integer> array) {
		Integer[] arr = new Integer[array.size()];
		int j = 0;
		for (Integer i : array) {
			arr[j++] = i;
		}
		return arr;
	}

	/*
	 * Problem 11
	 */

	public ArrayList<Integer> problem11(ArrayList<Integer> array1, ArrayList<Integer> array2) {
		for (int i = 0; i < array1.size(); i++) {
			for (int j = 0; j < array2.size(); j++) {
				if (array1.get(i) == array2.get(j)) {
					array2.remove(array2.get(j));
				}
			}
		}
		return array2;
	}

	/*
	 * Problem 12
	 */

	public int problem12(ArrayList<Integer> array, int num) {
		int res = array.indexOf(num) + 1;
		return res;
	}

	/*
	 * Problem 13
	 */

	public ArrayList<Integer> problem13(ArrayList<Integer> array) {
		ArrayList<Integer> arr = new ArrayList<Integer>();
		for (int i = array.size() - 1; i < array.size(); i--) {
			if (i == 0) {
				arr.add(array.get(i));
				break;
			}
			arr.add(array.get(i));

		}
		return arr;
	}

	/*
	 * Problem 14
	 */

	public ArrayList<Integer> problem14_AO(ArrayList<Integer> array) {
		ArrayList<Integer> sorted = new ArrayList<>(array); // create a copy
		Collections.sort(sorted);
		return sorted;
	}

	public ArrayList<Integer> problem14_DO(ArrayList<Integer> array) {
		ArrayList<Integer> sorted = new ArrayList<>(array); // create a copy
		Collections.sort(sorted, Collections.reverseOrder());
		return sorted;
	}

	/*
	 * Problem 15
	 */

	public void problem15(ArrayList<Integer> array) {

		for (int i = 0; i < array.size(); i++) {
			if (i == array.size())
				break;
			int c = 1;
			for (int j = i + 1; j < array.size(); j++) {
				Integer first = array.get(i);
				Integer second = array.get(j);
				if (first != second) {
					c++;
					if (i + c == array.size()) {
						System.out.println(array.get(i));
						return;
					}

				}
			}

		}
	}

	/*
	 * Problem 19
	 */

	public void problem19(String str) {
		int sum = 0;
		for (char s : str.toCharArray()) {
			if (s == '{')
				sum += 1;
			else if (s == '}')
				sum -= 1;
			else if (s == '[')
				sum += 5;
			else if (s == ']')
				sum -= 5;
			else if (s == '(')
				sum += 15;
			else if (s == ')')
				sum -= 15;
		}

		if (sum == 0)
			System.out.println("Yes");
		else
			System.out.println("No");
	}

	
	/*
	 * Problem 20
	 */
	public void problem20() {
		Scanner sc = new Scanner(System.in);
		boolean b = true;
		String str1 = "https://www.youtube.com/c/gnani";
		String str2 = "https://www.gnani.com/";

		while (b == true) {
			
			
			System.out.println("Input: ");
			String str = sc.next();
			
			if (str.equalsIgnoreCase("back"))
				System.out.println(str1);
			
			else if (str.equalsIgnoreCase("forward"))
				System.out.println(str2);
			
			else if (str.equalsIgnoreCase("end"))
				b = false;
		}
	}

}