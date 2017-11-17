package com.sogou.imeda.betty;

public class TopK {
	public static void main(String[] args) {
		int[] a = { 9, 8, 4, 14, 25, 6, 3, 8, 10, 6, 34, 63, 12, 2 };
		int k = 5;
		int[] b = new int[k];
		for (int i = 0; i < k; i++) {
			b[i] = a[i];
		}
		MinRootHeap mrh = new MinRootHeap(b);
		for (int i = k; i < a.length; i++) {
			int top = mrh.newArray[1];
			if (top < a[i]) {
				mrh.newArray[1] = a[i];
				mrh.shiftDown(1);
			}
		}

		System.out.println(mrh.poll());
		System.out.println(mrh.poll());
		System.out.println(mrh.poll());
		System.out.println(mrh.poll());
		System.out.println(mrh.poll());

		System.out.println("================================");
		String string = "abc";
	}

}
