package com.sogou.imeda.algorithm;

public class OnewayLinkedList<E> {
	Node head;

	public OnewayLinkedList() {
	}

	/**
	 * create a linkedlist from array
	 * 
	 * @param a
	 */
	public void createlink(int[] a) {//这里为什么不能写E[]
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

	/**
	 * search if specified value exists in the linkedlist
	 * 
	 * @param value
	 */
	public void searcLink(E value) {
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

	/**
	 * delete the specified node
	 * 
	 * @param value
	 *            specified data of the node
	 */
	public void deleteNode(E value) {
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
		return result.substring(1);
	}

	/**
	 * insert a new node after pos node
	 * 
	 * @param pos
	 * @param value
	 */
	public void insertNode(E pos, E value) {
		Node pointer1 = this.head.getNext();
		Node pointer2 = pointer1.getNext();
		while (true) {
			if (pointer1 == null) {
				System.out.println("cannot find data:" + pos);
				break;
			}
			if (pointer1.getData() == pos) {
				Node newNode = new Node();
				newNode.setData(value);
				newNode.setNext(pointer2);
				pointer1.setNext(newNode);
				break;
			} else {
				pointer1 = pointer2;
				if (pointer2 != null)
					pointer2 = pointer2.getNext();
			}
		}
	}

	public static void main(String[] args) {
		int[] datas = { 1, 2, 3, 4, 5 };
		OnewayLinkedList<Integer> owll = new OnewayLinkedList<Integer>();
		owll.createlink(datas);
		System.out.println(owll.printList());
		owll.deleteNode(3);
		System.out.println(owll.printList());

		owll.insertNode(2, 10);
		System.out.println(owll.printList());
		owll.insertNode(5, 11);
		System.out.println(owll.printList());
		owll.insertNode(12, 12);
		System.out.println(owll.printList());
	}
}
