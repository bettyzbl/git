package com.sogou.imeda.betty;

import java.util.HashMap;
import java.util.Map;

public class SolutionTwoSum {
	public static int[] twoSum(int[] nums, int target) {
		int[] result = new int[2];
		Map<Integer, Integer> numMap = new HashMap<Integer, Integer>();
		int len = nums.length;
		for (int i = 0; i < len; i++) {
			if (numMap.containsKey(target - nums[i])) {
				result[0] = i;
				result[1] = numMap.get(target - nums[i]);
				return result;
			}
			numMap.put(nums[i], i);
		}
		return result;
	}

	public static void main(String[] args) {
		int[] nums = new int[] { 1, 2, 3, 4, 5, 6, 7 };
		int target = 6;
		int[] result = twoSum(nums, target);
		System.out.println(result[0] + "," + result[1]);
	}
}
