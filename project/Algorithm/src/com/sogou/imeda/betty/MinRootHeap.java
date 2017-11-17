package com.sogou.imeda.betty;

public class MinRootHeap {
	int[] newArray;
	int length;

	public MinRootHeap(int[] array) {
		this.length = array.length;
		this.newArray = new int[length + 1];
		System.arraycopy(array, 0, newArray, 1, length);
		for (int i = length / 2; i > 0; i--) {
			shiftDown(i);
		}
	}

	public void shiftDown(int i) {
		int min = i;
		int left = 2 * i;
		if (left <= length && newArray[left] < newArray[i]) {
			min = left;
		}
		int right = left + 1;
		if (right <= length && newArray[right] < newArray[min]) {
			min = right;
		}
		if (i != min) {
			swap(i, min);
			shiftDown(min);
		}
	}

	private void swap(int x, int y) {
		int tmp = newArray[x];
		newArray[x] = newArray[y];
		newArray[y] = tmp;
	}

	public int getTop() {
		return newArray[1];
	}

	public int replaceTop(int a) {
		newArray[1] = a;
		shiftDown(1);
		return newArray[1];
	}

	public int poll() {
		int top = newArray[1];
		if (length >= 1) {
			newArray[1] = newArray[length--];
			shiftDown(1);
			return top;
		} else {
			throw new IndexOutOfBoundsException();
		}
	}

	public static void main(String[] args) {
		int[] a = { 9, 8, 4, 14, 25, 6, 3, 8, 10, 6, 34, 63, 12, 2 };
		MinRootHeap mrh = new MinRootHeap(a);
		for (int i = 1; i <= a.length; i++) {
			System.out.println(mrh.poll());
		}
	}

}
