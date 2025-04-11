package com.gnani.leetCode;

import java.util.*;
import java.util.Map.Entry;

public class Solution {

	public static void main(String[] args) {

		Solution s = new Solution();

		int[] array1 = new int[] { 1, 2, 4 };
		int sol = s.maxProfit(array1);
		System.out.println(sol);

	}

	public int removeDuplicates(int[] nums) {
		int j = 0;

		for (int i = 0; i < nums.length - 1; i++) {
			if (nums[i] == nums[i + 1]) {
				nums[j++] = nums[i];
			}
		}
		System.out.println(Arrays.toString((Arrays.copyOf(nums, j))));
		return j;
	}

	public void merge(int[] nums1, int m, int[] nums2, int n) {
		for (int i = m; i < m + n; i++) {
			nums1[i] = nums2[i - m];
		}
		Arrays.sort(nums1);
		System.out.println(Arrays.toString(nums1));
	}

	public int removeElement(int[] nums, int val) {
		int j = 0;

		for (int i = 0; i < nums.length; i++) {
			if (nums[i] != val) {
				nums[j++] = nums[i];
			}
		}

		System.out.println(Arrays.toString((Arrays.copyOf(nums, j))));
		return j;
	}

	public int majorityElement(int[] nums) {
		int res = 0;
		if (nums.length == 1)
			return nums[0];
		for (int i = 0; i < nums.length; i++) {
			int count = 1;
			if (i == nums.length)
				break;
			for (int j = i + 1; j < nums.length; j++) {
				int first = nums[i];
				int second = nums[j];
				if (first == second) {
					count++;
					if (count > nums.length / 2) {
						res = nums[i];
						return nums[i];
					}
				}
			}
		}
		return res;
	}

	public void rotate(int[] nums, int k) {

		int[] arr = new int[nums.length];
		int j = 0;
		for (int i = nums.length - k; i < nums.length + (nums.length - k); i++) {
			if (i >= nums.length)
				arr[j++] = nums[Math.abs(i - nums.length)];
			else
				arr[j++] = nums[i];
		}
		System.out.println(Arrays.toString(arr));
	}

	public int maxProfit(int[] prices) {

		HashMap<Integer, Integer> map = new HashMap<>();
		ArrayList<Integer> arr = new ArrayList<Integer>();
		if (prices.length == 2) {
			if (prices[1] - prices[0] < 0)
				return 0;
			else
				return prices[1] - prices[0];
		} else {
			for (int i = 0; i < prices.length; i++) {
				if (i == prices.length)
					break;
				for (int j = i + 1; j < prices.length; j++) {
					map.put(j, prices[j] - prices[i]);
				}
				int maxVal = Integer.MIN_VALUE;

				for (Entry<Integer, Integer> entry : map.entrySet()) {
					if (entry.getValue() > maxVal) {
						maxVal = entry.getValue();
					}
				}
				arr.add(maxVal);
			}

			arr.sort(Collections.reverseOrder());
			if (arr.get(0) < 0)
				return 0;
			else
				return arr.get(0);
		}
	}

}
