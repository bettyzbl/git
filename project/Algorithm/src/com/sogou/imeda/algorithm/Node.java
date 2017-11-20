package com.sogou.imeda.algorithm;

public class Node<E> {
	E data;
	Node<E> next;
	Node<E> pre;

	// one way link list
	public Node(E data, Node<E> next) {
		this.data = data;
		this.next = next;
	}

	// dual link list
	public Node(E data, Node<E> next, Node<E> pre) {
		this.data = data;
		this.next = next;
		this.pre = pre;
	}

	public Node() {
	}

	// head node
	public Node(Node<E> next) {
		this.next = next;
	}

	public E getData() {
		return this.data;
	}

	public void setData(E data) {
		this.data = data;
	}

	public Node<E> getNext() {
		return this.next;
	}

	public void setNext(Node<E> next) {
		this.next = next;
	}

	public Node<E> getPre() {
		return this.pre;
	}

	public void setPre(Node<E> pre) {
		this.pre = pre;
	}

}
