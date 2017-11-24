package com.sogou.imeda.datastruct;

public class Stack {
	int[] array;
	int index;

	public Stack(int[] array, int index) {
		// this.array = array;
		this.array = new int[array.length];
		System.arraycopy(array, 0, this.array, 0, array.length);
		this.index = index;
	}

	private int push(int a) {
		if (index < array.length - 1) {
			array[index + 1] = a;
			index++;
			return index;
		} else {
			int[] tmp = new int[this.array.length];
			System.arraycopy(this.array, 0, tmp, 0, this.array.length);
			this.array = new int[array.length * 2];
			System.arraycopy(tmp, 0, this.array, 0, tmp.length);
			if (index < array.length - 1) {
				array[index + 1] = a;
				index++;
			}
			return index;
		}
	}

	private String pop() {
		if (index >= 0) {
			int b = array[index];
			array[index] = Integer.MIN_VALUE;
			index--;
			return String.valueOf(b);
		} else {
			return "NULL";
		}
	}

	private String printStack() {
		String result = "";
		for (int i : array) {
			if (i != Integer.MIN_VALUE)
				result += "," + i;
		}
		if (result.length() > 0) {
			return result.substring(1);
		} else {
			return "stack is NULL";
		}
	}

	public static void main(String[] args) {
		int[] array = { 5, 1, 7, 3, 8, 1, 6, 3, 2, Integer.MIN_VALUE, Integer.MIN_VALUE, Integer.MIN_VALUE };
		int index = 8;
		Stack stack = new Stack(array, index);
		System.out.println(stack.printStack());
		// System.out.println(stack.insert(300));
		// System.out.println(stack.printStack());
		System.out.println("start insert==========");
		for (int i = 0; i < 5; i++) {
			System.out.println(stack.push(i + 100));
		}
		System.out.println("end insert==========");

		System.out.println(stack.printStack());
	}

	public static String printArray(int[] array) {
		String result = "";
		for (int i : array) {
			result += "," + i;
		}
		return result.substring(1);
	}
}
