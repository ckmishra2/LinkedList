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
public class LinkedList{
	Node head;
	int size;
LinkedList(){
	this.head=null;
}
	void insert(int value) {
	Node n = new Node(value);
			n.next=head;
			head=n;
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
		LL.insert(70);//
		LL.insert(30);
		LL.insert(56);
		LL.printLL();
		
	}
	}
