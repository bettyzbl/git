package com.sogou.imeda.algorithm;

public class BinarySearch {

	public static void main(String[] args) {
		int[] a = { 2, 5, 7, 9, 10, 25, 47, 69 };
		int b = 7;
		int index = biSearch(a, 0, a.length - 1, b);
	}

	private static int biSearch(int[] a, int start, int end, int b) {

		if (start == end) {
			return -1;
		}
		int mid = a.length / 2;
		if (b == a[mid]) {
			return mid;
		}
		if (b < a[mid]) {
			biSearch(a, 0, mid - 1, b);
		} else {
			biSearch(a, mid + 1, end, b);
		}
		return null;
	}
}
