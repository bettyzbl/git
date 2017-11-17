package com.sogou.imeda.betty;

import java.util.ArrayList;
import java.util.List;

public class ReverseWordsInAString3 {
	/*
	 * Given a string, you need to reverse the order of characters in each word
	 * within a sentence while still preserving whitespace and initial word
	 * order.
	 */
	public static String reverseWords(String s) {
		StringBuilder sb = new StringBuilder();
		// stack
		List<String> stack = new ArrayList<String>();
		for (int i = 0; i < s.length(); i++) {
			if (String.valueOf(s.charAt(i)).equals(" ")) {
				for (int j = stack.size() - 1; j >= 0; j--) {
					sb.append(stack.get(j));
				}
				sb.append(" ");
				stack.clear();
			} else if (i == s.length() - 1) {
				stack.add(String.valueOf(s.charAt(i)));
				for (int j = stack.size() - 1; j >= 0; j--) {
					sb.append(stack.get(j));
				}
				stack.clear();
			} else {
				stack.add(String.valueOf(s.charAt(i)));
			}
		}
		return sb.toString();
	}

	public static void main(String[] args) {
		String input = "Let's take LeetCode contest";
		String output = reverseWords(input);
		System.out.println(output);
	}
}
