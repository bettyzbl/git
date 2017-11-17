package com.sogou.imeda.betty;

public class NumberComplement {
	/*
	 * Given a positive integer, output its complement number. The complement
	 * strategy is to flip the bits of its binary representation.
	 * 
	 * Note: The given integer is guaranteed to fit within the range of a 32-bit
	 * signed integer. You could assume no leading zero bit in the integer¡¯s
	 * binary representation.
	 */
	public static int findComplement(int num) {
		String a = Integer.toBinaryString(num);
		int result = 0;
		int idx1 = a.indexOf("0");
		if (idx1 < 0) {
			result = 0;
		} else {
			String tmp = Integer.toBinaryString(~num).substring(31 - (a.length() - idx1));
			result = Integer.parseInt(tmp, 2);
		}
		return result;
	}

	public static void main(String[] args) {
		int a = 3;
		System.out.println(findComplement(a));
	}
}
