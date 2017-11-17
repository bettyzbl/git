package com.sogou.imeda.betty;

public class MinHeap {
	int length;
	int[] array;

	public MinHeap(int[] array) {
		length = array.length;
		this.array = new int[length + 1];
		System.arraycopy(array, 0, this.array, 1, length);
		for (int i = length / 2; i > 0; i--) {
			shiftDown(i);
		}
	}

	public static void main(String[] args) {
		int[] array = { 5, 7, 2, 6, 8, 3, 24, 15, 10, 11 };
		// create heap(minimize root)
		MinHeap mh = new MinHeap(array);
		System.out.println(mh.poll());
		System.out.println(mh.poll());
		System.out.println(mh.poll());
		System.out.println(mh.poll());
		System.out.println(mh.poll());
		System.out.println(mh.poll());
		System.out.println(mh.poll());
		System.out.println(mh.poll());
		System.out.println(mh.poll());
		System.out.println(mh.poll());
		System.out.println(mh.poll());
		System.out.println(mh.poll());
		System.out.println(mh.poll());
		System.out.println(mh.poll());
		System.out.println(mh.poll());
		// for(int i:mh.array)
		// System.out.println(i);
		// }
		// for (int i = 1; i < array.length - 1; i++) {
		// int last = array.length - i;
		// System.out.println("===>i=" + i + ";last=" + last);
		// System.out.println(poll(array, last));
		// }
	}

	private void shiftDown(int i) {
		int left = i * 2;
		int right = left + 1;
		int smallest = i;
		if (left <= length) {
			smallest = array[left] < array[i] ? left : i;
		}
		if (right <= length) {
			smallest = array[right] < array[smallest] ? right : smallest;
		}
		if (smallest != i) {
			swap(smallest, i);
			shiftDown(smallest);
		}
		// int m = (2 * i);
		// int minimize = Integer.MAX_VALUE;
		// // 有左孩子
		// if (m < array.length && array[m] < array[i]) {
		// minimize = m;
		// } else {
		// minimize = i;
		// }
		// // 有右孩子
		// if (m + 1 < array.length && array[m + 1] < array[minimize]) {
		// minimize = m + 1;
		// }
		// if (minimize != i) {
		// swap(i, minimize);
		// shiftDown(minimize);
		// }
	}

	public void add(int[] array, int k) {

	}

	public int poll() {
		int top = array[1];
		if (length >= 1) {
			array[1] = array[length--];
			shiftDown(1);
			return top;
		} else {
			System.out.println("no element!");
			return -1;
		}
	}

	private void swap(int i, int j) {
		int temp = array[i];
		array[i] = array[j];
		array[j] = temp;
	}

}
