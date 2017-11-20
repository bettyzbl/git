package com.sogou.imeda.algorithm;

public class DualLinkedList<E> {
	Node head;

	public DualLinkedList() {
		this.head = new Node();
		this.head.setNext(null);
	}

	/**
	 * create a linkedlist from array
	 * 
	 * @param a
	 */
	public void createlink(int[] a) {
		Node ptail = new Node();
		this.head = ptail;
		for (int i = 0; i < a.length; i++) {
			Node pnew = new Node();
			pnew.setData(a[i]);
			ptail.setNext(pnew);
			pnew.setPre(ptail);
			pnew.setNext(null);
			ptail = pnew;
		}
	}

	/**
	 * add element at head
	 * 
	 * @param e
	 */
	private void addFirst(E e) {
		Node node = new Node();
		node.setData(e);
		if (head.getNext() == null) {
			head.setNext(node);
			node.setPre(this.head);
		} else {
			node.setNext(head.getNext());
			node.setPre(head);
			head.getNext().setPre(node);
			head.setNext(node);
		}
	}

	/**
	 * add element at tail
	 * 
	 * @param e
	 */
	private void addLast(E e) {
		Node p = head;
		Node newNode = new Node();
		newNode.setData(e);
		while (true) {
			if (p.getNext() == null) {
				p.setNext(newNode);
				newNode.setPre(p);
				break;
			} else {
				p = p.getNext();
			}
		}
	}

	/**
	 * add element at pos
	 * 
	 * @param pos
	 * @param value
	 */
	private void insert(E pos, E value) {
		Node pointer1 = head.getNext();
		Node newnode = new Node();
		newnode.setData(value);
		while (true) {
			if (pointer1 == null) {
				System.out.println("cannot find pos" + pos);
				break;
			}
			if (pointer1.getData() == pos) {
				if (pointer1.getNext() == null) {
					addLast(value);
					break;
				} else {
					newnode.setNext(pointer1.getNext());
					newnode.setPre(pointer1);
					pointer1.getNext().setPre(newnode);
					pointer1.setNext(newnode);
					break;
				}
			} else {
				pointer1 = pointer1.getNext();
			}
		}
	}

	/**
	 * remove element value from this linked list
	 * 
	 * @param value
	 */
	private void removeElement(E value) {
		Node pointer = head;
		while (true) {
			if (pointer.getNext() == null) {
				System.out.println("cannot find value:" + value);
				break;
			}
			if (pointer.getData() == value) {
				Node pre = pointer.getPre();
				Node next = pointer.getNext();
			}
		}
	}

	/**
	 * print all the datas of this linkedlist
	 * 
	 * @return datas,split by ','
	 */
	private String printList() {
		String result = "";
		Node node = head.next;
		while (true) {
			if (node == null) {
				break;
			}
			result += "," + node.data;
			node = node.next;
		}
		if (result.length() > 0) {
			return result.substring(1);
		} else {
			return "NULL";
		}
	}

	public static void main(String[] args) {
		int[] datas = { 1, 2, 3, 4, 5 };
		DualLinkedList<Integer> dll = new DualLinkedList<Integer>();
		dll.createlink(datas);
		System.out.println(dll.printList());
		dll.insert(3, 6);
		System.out.println(dll.printList());
		dll.insert(4, 7);
		System.out.println(dll.printList());
		dll.insert(5, 8);
		System.out.println(dll.printList());
		dll.insert(10, 10);
		System.out.println(dll.printList());
	}
}
