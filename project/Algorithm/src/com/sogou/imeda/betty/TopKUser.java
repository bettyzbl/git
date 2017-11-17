package com.sogou.imeda.betty;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class TopKUser {
	public static void main(String[] args) {
		Map<String, Integer> users = new HashMap<String, Integer>();
		users.put("u1", 20);
		users.put("u2", 35);
		users.put("u3", 4);
		users.put("u4", 63);
		users.put("u5", 53);
		users.put("u6", 42);
		users.put("u7", 2);
		users.put("u8", 60);
		users.put("u9", 43);
		users.put("u10", 5);

		int k = 3;
		Map<Integer, String> topkUsers = getTopKUser(users, k);
		System.out.println(topkUsers);
	}

	private static Map<Integer, String> getTopKUser(Map<String, Integer> users, int k) {
		Map<Integer, String> result = new HashMap<Integer, String>();
		Set<String> keyset = users.keySet();
		int[] array = new int[k];
		MinRootHeap mrh = new MinRootHeap(array);
		for (String key : keyset) {
			int count = users.get(key);
			if (count > mrh.getTop()) {
				result.remove(mrh.getTop());
				mrh.replaceTop(count);
				if (!result.containsKey(count)) {
					result.put(count, key);
				}
			}
		}
		System.out.println(toString(mrh.newArray));
		return result;
	}

	private static String toString(int[] arr) {
		String line = "";
		for (int a : arr) {
			line += "," + a;
		}
		return line.substring(1);
	}
}
