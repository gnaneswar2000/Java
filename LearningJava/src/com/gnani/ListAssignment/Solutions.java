package com.gnani.ListAssignment;

import java.util.*;

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

	public void problem05(LinkedList<String> ll) {

		Problem05 prob = new Problem05();

		for (int i = 0; i < ll.size(); i++) {
			if (i == ll.size() - 1)
				break;
			int c = 0;
			for (int j = i + 1; j < ll.size(); j++) {
				if (ll.get(i).equals(ll.get(j))) {
					c++;
					prob.setName(ll.get(i));
				}
			}
		}
		Problem05[] p = new Problem05[] { prob };
		
		System.out.println("HI");

//		String[] str = new String[p.length];
//
//
//		for (int i = 0; i < p.length; i++) {
//				str[i] = p.;
//			}
	}
}
