package com.sogou.imeda.datastruct;

public class MinRootHeap {
	int[] array;

	public MinRootHeap(int[] array) {
		this.array = new int[array.length + 1];
		System.arraycopy(array, 0, this.array, 1, array.length);
		this.array[0] = array.length;// the size of the heap stored in the fisrt
		// element of this array
		for (int i = this.array[0] / 2; i > 0; i--) {
			adjustDown(i);
		}
	}

	private void adjustDown(int i) {
		int left = 2 * i;
		int right = left + 1;
		int min = i;
		// left child exists
		if (left <= this.array[0] && array[left] < array[min]) {
			min = left;
		}
		// right child exists
		if (right <= this.array[0] && array[right] < array[min]) {
			min = right;
		}
		if (min != i) {
			swap(this.array, min, i);
			adjustDown(min);
		}

	}

	private int getTop() {
		return this.array[1];
	}

	private void replaceTop(int a) {
		this.array[1] = a;
		adjustDown(1);
	}

	private String pop() {
		if (this.array[0] == 0) {
			return "NULL";
		} else {
			int top = getTop();
			replaceTop(this.array[this.array[0]]);
			this.array[0] = this.array[0] - 1;
			return String.valueOf(top);
		}
	}

	private String print() {
		String result = "";
		if (this.array[0] == 0) {
			return "null";
		} else {
			for (int i = 1; i <= this.array[0]; i++) {
				result += "," + this.array[i];
			}
			return result.substring(1);
		}
	}

	private void swap(int[] array, int x, int y) {
		int tmp = array[x];
		array[x] = array[y];
		array[y] = tmp;
	}

	public static void main(String[] args) {
		int[] array = { 4, 6, 2, 7, 8, 1, 3, 9 };
		MinRootHeap mrh = new MinRootHeap(array);
		mrh.replaceTop(11);
		System.out.println(mrh.print());
	}

}
