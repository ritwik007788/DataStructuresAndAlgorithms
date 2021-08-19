package LinkedList;

public class LlList {
	
	Node head;
	
	static class Node{
		int data;
		Node next;
		
		Node(int data){
			this.data = data;
			this.next = null;
		}
	}
	
	public void printList() {
		Node curr = head;
		while(curr!=null) {
			System.out.print(curr.data+" ");
			curr = curr.next;
		}
		System.out.println("");
	}
	
	public void addFirst(int data) {
		Node new_node = new Node(data);
		new_node.next = head;
		head = new_node;
	}
	public void insertAfter(Node prevNode , int data) {
		
		if(prevNode == null) {
			System.out.println("prevNode can't be null !");
		}
		
		Node newNode = new Node(data);
		Node nextNode = prevNode.next;
		prevNode.next = newNode;
		newNode.next = nextNode;
		
	}
	public void append(int data) {
		if(head == null) {
			head = new Node(data);
			return;
		}
		
		Node curr = head;
		
		while(curr.next!=null) {
			curr=curr.next;
		}
		
		curr.next = new Node(data);
		
		
	}

	public int size() {

		Node curr = head;
		int count = 0 ;
		while(curr!=null) {
			count++;
			curr = curr.next;
		}
		return count;
	}
	
	
	public void deleteKey(int key) {
		Node curr = head;
		
		if(curr!=null && curr.data == key) {
			head = curr.next;
			return;
		}
		
		while(curr.next!=null && curr.next.data != key) {
			curr=curr.next;
		}
		
		if(curr.next == null) {
			System.out.println("Key doesn't exist !");
			return;
		}
		
		curr.next = curr.next.next;
		
	}
	
	public void deletePos(int pos) {// 0 based indexing
		int count = 0;
		
		Node curr = head;
		Node prev = null;
		
		if(pos==0) {
			head = head.next;
			return;
		}
		
		while(curr!=null && count<pos) {
			prev = curr;
			curr = curr.next;
			count++;
		}
		prev.next = prev.next.next;
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LlList list = new LlList();
		
		list.head = new Node(1);
		
		Node second = new Node(2);
		Node third = new Node(3);
		
		list.head.next = second;
		second.next = third;
		
		list.addFirst(0);
		list.insertAfter(second , 100);
		list.append(200);
		list.printList();
//		list.deleteKey(300);
		list.deletePos(0);
		list.printList();
	
	}

}
