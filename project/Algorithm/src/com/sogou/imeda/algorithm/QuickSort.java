package com.sogou.imeda.algorithm;

public class QuickSort {
	public static void main(String[] args) {
		int[] array = { 5, 2, 6, 8, 1, 5, 8, 3, 0, 4, 7, 2 };
		printArray(array);
		sortRecursion(array, 0, array.length - 1);
	}

	private static void sortRecursion(int[] array, int start, int end) {
		int mid = array[start];
		int midIndex = start;
		for (int i = 1; i <= end - start; i++) {
			int tmp = array[i];
			if (tmp < mid) {
				swap(array, i, midIndex);
			}
		}

	}

	private static void swap(int[] array, int i, int midIndex) {
		// TODO Auto-generated method stub
		
	}

	private static void printArray(int[] array) {
		String output = "NULL";
		for (int a : array) {
			if (output.equals("NULL")) {
				output = String.valueOf(a);
			} else {
				output += "," + String.valueOf(a);
			}
		}
		System.out.println(output);
	}
}
