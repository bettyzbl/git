package com.sogou.imeda.algorithm;

public class BinarySearch {

	public static void main(String[] args) {
		int[] array = { 2, 5, 7, 9, 10, 25, 47, 69 };
		int index = biSearch(array, 0, array.length - 1, 10);
		// int index2 = binarySearch(array, 5);
		// System.out.println(index2);
		System.out.println(index);
	}

	private static int biSearch(int[] a, int start, int end, int b) {
		int mid = (end - start) / 2 + start;
		System.out.println("start=" + start + ";end=" + end + ";mid=" + mid
				+ ";b=" + b + ";a[mid]=" + a[mid]);
		if (a[mid] == b) {
			return mid;
		}
		if (start >= end) {
			return -1;
		}
		if (b < a[mid]) {
			return biSearch(a, start, mid - 1, b);
		} else if (b > a[mid]) {
			return biSearch(a, mid + 1, end, b);
		}
		return -2;
	}

	private static int binarySearch(int[] array, int key) {
		int mid = array.length / 2;
		if (array[mid] == key) {
			return mid;
		}

		int start = 0;
		int end = array.length - 1;
		while (start <= end) {
			mid = (end - start) / 2 + start;
			if (key < array[mid]) {
				end = mid - 1;
			} else if (key > array[mid]) {
				start = mid + 1;
			} else {
				return mid;
			}
		}

		return -1;
	}
}
