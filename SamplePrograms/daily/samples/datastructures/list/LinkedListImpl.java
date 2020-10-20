package daily.samples.datastructures.list;

public class LinkedListImpl{

	Node head;
	
	static class Node{
		
		Node next;
		int data;
		
		Node(int data){
			this.data = data;
			this.next = null;
		}
		
	}
	
	static LinkedListImpl add(LinkedListImpl list, int data) {
		
		Node new_node = new Node(data);
		
		if(list.head == null) {
			list.head = new_node;
		}else {
			
			Node last = list.head;
			
			while (last.next != null) {
				last = last.next;
			}
			
			last.next = new_node;
		}
		
		return list;
	}
	
	static LinkedListImpl remove(LinkedListImpl list, int data) {
		
		Node prev = null;
		Node curr = list.head;
		
		//case1: if data is found in head node
		if( curr != null && curr.data == data) {
			list.head = curr.next;
			System.out.println("Data: "+data+" found and removed.");
			return list;
		}
		
		//case2: if data found in middle or at last
			
		while(curr != null && curr.data != data) {
			prev = curr;
			curr = curr.next;
		}
		
		if(curr != null && curr.data == data) {
			prev.next = curr.next;
			System.out.println("Data: "+data+" found and removed.");
		}else {
			System.out.println("Data: "+data+" not found.");
		}
		
		return list;
	}
	
	static void print(LinkedListImpl list) {
		
		if(list == null) {
			System.out.println("List is Empty");
		}else {
			Node last = list.head;
			
			if(last == null) {
				System.out.println("List is Empty");
			}else {
				while(last != null) {
					System.out.println("Linked list data: "+last.data);
					last = last.next;
				}
			}
		}	
	}
	
	public static void main(String[] args) {
		
		LinkedListImpl list = new LinkedListImpl();
		
		list = add(list, 10);
		list = add(list, 20);
		list = add(list, 30);
		
		list.print(list);
		
		list = remove(list, 10);
		
		list.print(list);
		
	}
}