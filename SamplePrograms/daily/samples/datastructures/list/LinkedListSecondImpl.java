package daily.samples.datastructures.list;

public class LinkedListSecondImpl {

	static class Node{
		Node next;
		int data;
		
		Node(int data){
			this.next = null;
			this.data = data;
		}
	}
	
	Node head;
	
	static LinkedListSecondImpl add(LinkedListSecondImpl li, int num) {
		
		Node node = new Node(num);
		
		if(li.head == null) {
			li.head = node;
			System.out.println("Inserted head data: "+num+" successfully");
		}else {
			Node last = li.head;
			
			while(last.next != null) {
				last = last.next;
			}
			
			last.next = node;
			System.out.println("Inserted data: "+num+" successfully");
		}
		
		return li;
	}
	
	static void printList(LinkedListSecondImpl li) {
		
		Node curr_node = li.head;
		
		if(li == null || curr_node == null) {
			System.out.println("Linked list is empty");
			return;
		}else {
			while(curr_node != null) {
				System.out.println("Data in linkedlist: "+curr_node.data);
				curr_node = curr_node.next;
			}
		}
	}
	
	static LinkedListSecondImpl remove(LinkedListSecondImpl li,int num) {
		
		Node curr_node = li.head;
		Node prev = null;
		
		if(li == null || curr_node == null) {
			System.out.println("Linked list is empty");
			return li;
		}
		
		if(curr_node != null && curr_node.data == num) {
			li.head = curr_node.next;
			System.out.println("Data "+num+" removed successfully");
			return li;
		}
		
		while(curr_node != null && curr_node.data != num) {
			prev = curr_node;
			curr_node = curr_node.next;
		}
		
		if(curr_node.data != num) {
			System.out.println("Data "+num+" not found in list");
		}else {
			prev.next = curr_node.next;
			System.out.println("Data "+num+" removed successfully");
		}
		return li;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		LinkedListSecondImpl li = new LinkedListSecondImpl();
		
		li = add(li, 10);
		li = add(li, 20);
		li = add(li, 30);
		
		printList(li);
		
		li = remove(li, 20);
		
		printList(li);
	}

}
