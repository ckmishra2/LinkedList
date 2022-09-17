package ds.datastructure;

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
public class LinkedList{
	Node head;
	int size;
LinkedList(){
	this.head=null;
}
	void insertAtFirst(int value) {
	Node n = new Node(value);
			n.next=head;
			head=n;
			size++;
		}	
	void insertAtLast(int value) {
		Node n = new Node( value);
		if(size==0) {
			head=n;
			return;
		}
		Node temp=head;
		while(temp.next!=null) {
		temp= temp.next;
		}
		temp.next=n;
		size++;
		
	}
				
	void printLL() {
		Node temp = this.head;
		while(temp!=null){
		System.out.print(  temp.data +" --> " );
		temp=temp.next;
	}
	}
	public static void main(String[] args) {
		LinkedList LL= new LinkedList();
		LL.insertAtFirst(56);//
		LL.insertAtLast(30);
		LL.insertAtLast(70);
		LL.printLL();
		
	}
	}
