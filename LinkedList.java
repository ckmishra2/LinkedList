package ds.datastructure;

import basic.Node;

class Node {
	Node next;
	int data;

	Node(int value) {
		this.data = value;
		this.next = null;
	}
}

// creation of simple linked list
//creation of linked list by adding 30 and 56 to 70
//creation of Linked List by appending 30 and 70 to 56
//ability to insert 30 between 56 and 70
//ability to delete the first element in the linkedlist of sequence 56->30->70 
public class LinkedList {
	Node head;
	int size;

	LinkedList() {
		this.head = null;
	}

	void insertAtFirst(int value) {
		Node n = new Node(value);
		n.next = head;
		head = n;
		size++;
	}

	void insertAtLast(int value) {
		Node n = new Node(value);
		if (size == 0) {
			head = n;
			return;
		}
		Node temp = head;
		while (temp.next != null) {
			temp = temp.next;
		}
		temp.next = n;
		size++;
	}

	void insertAtanyPos(int value, int pos) {
		Node n = new Node(value);
		if (size + 1 < pos) {
			System.out.println("position is greater than size");
			return;
		}
		Node temp = head;
		int i = 1;
		while (i != pos - 1) {
			i++;
			temp = temp.next;

		}
		n.next = temp.next;
		temp.next = n;
		size++;

	}

	void popAtFirst() {
		{
			if (size == 0) // using popAtFirst method to delete the first element from linkedlist
				return;
			head = head.next;
			size--;
		}
	}
	// using popAtLast method to delete from last
	void popAtLast() {	
		{
			if(size==0)
				return;
			else if(size==1)
			{
				head = head.next;
				size--;
				return;
			}
			Node temp = head;
			
			while(temp.next.next !=null)//reach temp to second last element
			{
				temp=temp.next;
			}
			
			temp.next = temp.next.next;
			size--;
		}
	}

	void printLL() {
		Node temp = this.head;
		while (temp != null) {
			System.out.print(temp.data + " --> ");
			temp = temp.next;
		}
	}

	public static void main(String[] args) {
		LinkedList LL = new LinkedList();
		LL.insertAtFirst(56);// 56 is first created by using insertAtfirst method
		LL.insertAtanyPos(30, 2);// insert 30 by using insertAtanyPos method
		LL.insertAtLast(70);// next append 70 by using insertAtLast method
		LL.popAtLast();// delete last element from linkedlist
		LL.printLL();

	}
}
