package ds.datastructure;

class Node {
	Node next;
	int data;

	Node(int value) {
		this.data = value;
		this.next = null;
	}
}

public class LinkedList{
	Node head;
	int size;
LinkedList(){
	this.head=null;
}
	void insertAtfirst(int value) {
	Node n = new Node(value);
			n.next=head;
			head=n;
			size++;
		}		
				
	void printLL() {
		Node temp = this.head;
		while(temp!=null){
		System.out.print( " --> " +temp.data );
		temp=temp.next;
	}
	}
	public static void main(String[] args) {
		LinkedList LL= new LinkedList();
		LL.insertAtfirst(70);
		LL.insertAtfirst(30);
		LL.insertAtfirst(56);
		LL.printLL();
		
	}
	}
