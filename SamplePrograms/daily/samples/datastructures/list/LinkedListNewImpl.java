package daily.samples.datastructures.list;

public class LinkedListNewImpl {

	Node head;
	
	static class Node{
		
		Node next;
		int data;
		
		Node(int data){
			this.data = data;
			this.next = null;
		}
	}
	
	static LinkedListNewImpl insert(LinkedListNewImpl li, int data) {
		
		Node new_node = new Node(data);
		
		if(li.head == null) {
			li.head = new_node;
			System.out.println("Inserted head data: "+data+" successfully");
		}else {
			
			Node last = li.head;
			
			while(last.next != null) {
				last = last.next;
			}
			
			last.next = new_node;
			System.out.println("Inserted data: "+data+" successfully");
		}	
		return li;
	}
	
	static LinkedListNewImpl remove(LinkedListNewImpl li, int data) {
		
		if(li == null || li.head == null) {
			System.out.println("List is empty");
			return li;
		}
		
		Node curr_node = li.head;
		Node previous = null;
		
		if(curr_node !=null && curr_node.data == data) {
			li.head = curr_node.next;
			System.out.println("Removed head data: "+data+" successfully");
			return li;
		}
		
		while(curr_node != null && curr_node.data != data) {
			previous = curr_node;
			curr_node = curr_node.next;
			
		}
		
		if(curr_node != null && curr_node.data == data) {
			previous.next = curr_node.next;
			System.out.println("Removed data: "+data+" successfully");
		}else {
			System.out.println("Data: "+data+" not found.");
		}
		
		return li;
	}
	
	static void print(LinkedListNewImpl li) {
		
		if(li == null || li.head == null) {
			System.out.println("List is empty");
		}else {
			
			Node curr_node = li.head;
		
			while(curr_node != null) {
				System.out.println("Data: "+curr_node.data);
				curr_node = curr_node.next;
			}
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		LinkedListNewImpl li = new LinkedListNewImpl();
		
		li = insert(li, 10);
		li = insert(li, 20);
		li = insert(li, 30);
		
		print(li);
		
		li = remove(li, 10);
		
		print(li);
	}

}
