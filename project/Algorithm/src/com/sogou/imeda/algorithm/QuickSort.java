package com.sogou.imeda.algorithm;

public class QuickSort {
	public static void main(String[] args) {
		int[] array = { 10, 2, 6, 8, 1, 5, 9, 3, 0, 4, 7, 11 };
		printArray(array);
		sortRecursion(array, 0, array.length - 1);
		printArray(array);
	}

	private static void sortRecursion(int[] array, int start, int end) {
		if (start < end) {
			int mid = partition(array, start, end);// returnIndexOfLastElementSortedIntheArray
			sortRecursion(array, start, mid - 1);
			sortRecursion(array, mid + 1, end);
		}
	}

	private static int partition(int[] array, int start, int end) {
		int mid = array[end];// asStardandElement
		int i = start;
		System.out.println("-----------start partition------");
		while (array[i] < mid) {
			i++;
		}
		for (int j = i + 1; j < end; j++) {
			System.out.println("i=" + i + ";j=" + j);
			if (array[j] < mid) {
				swap(array, i, j);
				i++;
				continue;
			}
		}
		swap(array, i, end);
		return i;
	}

	private static void swap(int[] array, int i, int j) {
		int tmp = array[i];
		array[i] = array[j];
		array[j] = tmp;
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
