package com.sogou.imeda.betty;

public class QuickSort {
	public static void main(String[] args) {
		int[] arr = { 7, 8, 6, 3, 4, 11, 1, 3, 5, 9 };
		System.out.println(toString(arr));
		sort1(arr, 0, arr.length - 1);
		System.out.println(toString(arr));
	}

	private static void sort1(int[] arr, int start, int end) {
		if (start < end) {
			int q = partition1(arr, start, end);
			sort1(arr, start, q - 1);
			sort1(arr, q + 1, end);
		}
	}

	private static int partition1(int[] arr, int start, int end) {
		int l = start;
		int last = arr[end];// standard
		while (arr[l] < last) {
			l++;
		}

		for (int i = l + 1; i < end; i++) {
			if (arr[i] < last) {
				swap(arr, l, i);
				l++;
			}
		}
		swap(arr, l, end);
		return l;
	}

	private static void sort2(int[] arr, int start, int end) {
		if (start < end) {
			int q = partition(arr, start, end);
			sort2(arr, start, q - 1);
			sort2(arr, q + 1, end);
		}
	}

	private static int partition(int[] arr, int start, int end) {
		// int x = arr[end];
		// int i = start - 1;
		// for (int j = start; j <= end; j++) {
		// while (arr[j] <= x) {
		// i++;
		// }
		// swap(arr, i, j);
		// }
		//
		// return 0;

		int s = start;
		while (arr[s] < arr[end])
			s++;
		for (int i = s + 1; i < end; i++)
			if (arr[i] < arr[end])
				swap(arr, i, s++);
		swap(arr, s, end);
		return s;
	}

	private static void swap(int[] arr, int start, int end) {
		int tmp = arr[start];
		arr[start] = arr[end];
		arr[end] = tmp;
	}

	private static String toString(int[] arr) {
		String line = "";
		for (int a : arr) {
			line += "," + a;
		}
		return line.substring(1);
	}
}
