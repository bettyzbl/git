package com.sogou.imeda.betty;

public class HammingDistance {
	public static int hammingDistance(int x, int y) {
		String dist = Integer.toBinaryString(x ^ y);
		char[] chars = new char[dist.length()];
		chars = dist.toCharArray();
		int count = 0;
		for (int i = 0; i < chars.length; i++) {
			if (String.valueOf(chars[i]).equals("1")) {
				count++;
			}
		}
		return count;
	}

	private static char[] intToCharArray(int x) {
		String xx = Integer.toBinaryString(x);
		char[] charx = new char[xx.length()];
		charx = xx.toCharArray();
		return charx;
	}

	public static void main(String[] args) {
		int a = 7;
		int b = 16;
		System.out.println(Integer.toBinaryString(a));
		System.out.println(Integer.toBinaryString(b));
		System.out.println(hammingDistance(a, b));
	}
}
