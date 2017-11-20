package com.sogou.imeda.algorithm;

public class Node {
	int data;
	Node next;
	Node pre;

	// one way link list
	public Node(int data, Node next) {
		this.data = data;
		this.next = next;
	}

	// dual link list
	public Node(int data, Node next, Node pre) {
		this.data = data;
		this.next = next;
		this.pre = pre;
	}

	public Node() {
	}

	// head node
	public Node(Node next) {
		this.next = next;
	}

	public int getData() {
		return this.data;
	}

	public void setData(int data) {
		this.data = data;
	}

	public Node getNext() {
		return this.next;
	}

	public void setNext(Node next) {
		this.next = next;
	}

	public Node getPre() {
		return this.pre;
	}

	public void setPre(Node pre) {
		this.pre = pre;
	}

}
