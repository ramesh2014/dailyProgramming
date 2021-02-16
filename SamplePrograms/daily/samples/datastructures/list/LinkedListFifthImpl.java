package daily.samples.datastructures.list;

public class LinkedListFifthImpl {

	Node head;
	
	static class Node{
		Node next;
		int data;
		
		Node(int data){
			this.data = data;
			this.next = null;
		}
	}
	
	static LinkedListFifthImpl insert(LinkedListFifthImpl li, int data) {
		
		Node new_node = new Node(data);
		Node curr_node = li.head;
		
		if (curr_node == null) {
			li.head = new_node;
		}else {
		
			while(curr_node.next != null) {
				curr_node = curr_node.next;
			}
			curr_node.next = new_node;
		}
		return li;
	}
	
	static void print(LinkedListFifthImpl li) {
		
		if(li.head == null) {
			System.out.println("List is empty");
			return;
		}else {
			
			Node last = li.head;
			
			while(last != null) {
				System.out.println("Data in list: "+last.data);
				last = last.next;
			}
		}
		
	}
	
	static LinkedListFifthImpl remove(LinkedListFifthImpl li, int data) {
		
		Node previous = null;
		Node curr_node = li.head;
		
		if(curr_node== null) {
			System.out.println("List is empty");
		}else {
		
			//case1: if removal is a head node
			if (curr_node != null && curr_node.data == data) {
				li.head = curr_node.next;
				System.out.println("Removing data from head node: "+ data);
			}else {
				//case2: if removal is not a head node
				while(curr_node.next !=null && curr_node.data != data) {
					previous = curr_node;
					curr_node = curr_node.next;
				}
				
				if(curr_node != null && curr_node.data == data) {
					System.out.println("Data found and removed: "+data);
					previous.next = curr_node.next;
				}else {
					System.out.println("Data not found: "+data);
				}
			}
		}
		return li;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		LinkedListFifthImpl li = new LinkedListFifthImpl();
		
		li = insert(li, 100);
		li = insert(li, 120);
		li = insert(li, 130);
		li = insert(li, 140);
		
		print(li);
		
		li = remove(li, 120);
		li = remove(li, 140);
		li = remove(li, 100);
		li = remove(li, 150);
		li = remove(li, 130);
		
		print(li);
	}
	

}