package com.sogou.imeda.betty;

import java.util.Arrays;

public class ArrayPartition1 {
	/*
	 * Given an array of 2n integers, your task is to group these integers into
	 * n pairs of integer, say (a1, b1), (a2, b2), ..., (an, bn) which makes sum
	 * of min(ai, bi) for all i from 1 to n as large as possible.
	 */
	public static int arrayPairSum(int[] nums) {
		// 1. sort
		Arrays.sort(nums);
		// 2. get array[0,2,4,6..]--> sum()
		int sum = 0;
		for (int i = 0; i < nums.length / 2; i++) {
			sum += nums[2 * i];
		}
		return sum;
	}

	public static void main(String[] args) {
		int[] input = { 1, 4, 3, 2 };
		System.out.println(arrayPairSum(input));
	}
}
