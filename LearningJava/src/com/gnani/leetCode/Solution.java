package com.gnani.leetCode;

import java.util.*;

public class Solution {

	public static void main(String[] args) {

		Solution s = new Solution();

		int[] array1 = new int[] { 1, 2, 3, 4, 5, 6, 7 };
		int k = 3;
		s.rotate(array1, k);

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
		for (int i = nums.length - k ; i < nums.length + (nums.length - k) ; i++) {
			if (i >= nums.length) 
				arr[j++] = nums[Math.abs(i - nums.length)]; 
			else
				arr[j++] = nums[i];
		}
		System.out.println(Arrays.toString(arr));
	}
	

}
