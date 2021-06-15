package learn.ds.singlylinkedlist;

import learn.ds.node.Node;

public class SinglyLinkedList {
	private Node first;

	public SinglyLinkedList() {
		first = null;
	}

	public void insertData(int data) {
		Node node = new Node();
		node.data = data;
		node.next = first;
		first = node;
	}

	public Node deleteFirst() {
		Node temp = first;
		if(first!=null)
		first = first.next;
		return temp;
	}

	public void display() {
		System.out.println("Print SinglyLinkedList");
		Node current = first;
		while (current != null) {
			current.display();
			current = current.next;
		}
		System.out.println();
	}

}
