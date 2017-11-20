package com.sogou.imeda.algorithm;

public class OnewayLinkedList {
	Node head;
	int length;

	public OnewayLinkedList() {
	}

	/*
	 * 定义一个创建链表的方法 该方法称之为 ：尾插法：新产生的节点从尾部插入链表
	 */
	public void createlink(int[] a) {
		Node pnew;
		Node ptail = new Node();
		this.head = ptail;
		for (int i = 0; i < a.length; i++) {
			pnew = new Node();
			pnew.setData(a[i]);
			ptail.setNext(pnew);
			pnew.setNext(null);
			ptail = pnew;
		}
	}

	public void searcLink(int value) {
		Node pointer = this.head.getNext();
		while (true) {
			if (pointer == null) {
				System.out.println("cannot find data:" + value);
				break;
			}
			if (pointer.getData() == value) {
				System.out.println("can find data:" + pointer.getData());
				break;
			} else {
				pointer = pointer.getNext();
			}
		}
	}

	public void deleteNode(int value) {
		Node pointer = this.head.getNext();
		Node lastPtr = this.head;
		while (true) {
			if (pointer == null) {
				System.out.println("cannot find data:" + value);
				break;
			}
			if (pointer.getData() == value) {
				lastPtr.setNext(pointer.getNext());
				break;
			} else {
				lastPtr = pointer;
				pointer = pointer.getNext();
			}
		}
	}

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
		return result.substring(1);
	}

	public static void main(String[] args) {
		int[] datas = { 1, 2, 3, 4, 5 };
		OnewayLinkedList owll = new OnewayLinkedList();
		owll.createlink(datas);
		System.out.println(owll.printList());
		owll.deleteNode(3);
		System.out.println(owll.printList());
	}
}
