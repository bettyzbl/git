package com.sogou.imeda.algorithm;

public class Queue {
	int[] array;
	int start;
	int end;

	public Queue(int[] array) {
		this.array = new int[array.length];
		System.arraycopy(array, 0, this.array, 0, array.length);
		start = 0;
		if (array.length == 0) {
			end = 0;
		} else {
			end = array.length - 1;
		}
	}

	/**
	 * insert a new int into queue
	 * 
	 * @param a
	 * @return
	 */
	private int enqueue(int a) {
		if (end == array.length - 1) {// extend the array
			int[] newarray = new int[array.length * 2];
			System.arraycopy(array, 0, newarray, 0, array.length);
			this.array = newarray;
			newarray[++end] = a;
		} else {
			array[++end] = a;
		}
		return end;
	}

	/**
	 * remove the head int out of the queue
	 * 
	 * @return
	 */
	private String dequeue() {
		if (start > end) {
			return "null";
		} else {
			return String.valueOf(array[start++]);
		}
	}

	private String printQueue() {
		if (array.length == 0) {
			return "null";
		}
		String queue = "";
		for (int i = start; i <= end; i++) {
			if (queue.length() == 0) {
				queue = String.valueOf(array[i]);
			} else {
				queue += "," + String.valueOf(array[i]);
			}
		}
		return queue;
	}

	public static void main(String[] args) {
		int[] array = { 5, 1, 7, 3, 8, 1 };
		Queue queue = new Queue(array);
		System.out.println(queue.enqueue(100));
		System.out.println(queue.enqueue(200));
		System.out.println("===========> start dequeue");
		System.out.println(queue.printQueue());
		for (int i = 0; i < 10; i++) {
			System.out.println(i + "\t" + queue.dequeue());
			System.out.println(queue.printQueue());
		}
		System.out.println("===========> start enqueue");
		System.out.println(queue.enqueue(1));
		System.out.println(queue.enqueue(2));
		System.out.println(queue.enqueue(3));
		System.out.println(queue.enqueue(4));
		System.out.println(queue.printQueue());
		// System.out.println("start=" + queue.start);
		// System.out.println("end=" + queue.end);
	}
}
