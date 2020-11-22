package daily.samples.datastructures.list;

public class LinkedListThirdImpl {

	Node head;
	
	static class Node{
		
		Node next;
		int data;
		
		Node(int data){
			this.next = null;
			this.data = data;
		}
	}
	
	static LinkedListThirdImpl add(LinkedListThirdImpl li, int val) {
		
		Node new_node = new Node(val);
		
		if (li.head == null) {
			li.head = new_node;
		}else {
			Node last = li.head;
			
			while(last.next != null){
				last = last.next;
			}
			last.next = new_node;
		}
		
		return li;
	}
	
	
	static void print (LinkedListThirdImpl li) {
	
		Node last = li.head;
		
		if(last == null) {
			System.out.println("List is empty");	
		}else {
			
			while(last != null) {
				System.out.println("Data in list: "+last.data);
				last = last.next;
			}
		}
		
	}
	
	
	static LinkedListThirdImpl remove(LinkedListThirdImpl li , int val) {
		
		System.out.println("Removing data: "+val);
		Node last = li.head;
		
		if(last == null) {
			System.out.println("List is empty");
		}else if(last.data == val) {
			System.out.println("Removing data in head and moving the next node as head");
			li.head = last.next;
		}else {
		
			Node previous = last;
			while( last.next != null && last.data != val) {
				previous = last;
				last = last.next;
			}
			
			previous.next = last.next;
		}
		return li;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		LinkedListThirdImpl li = new LinkedListThirdImpl();
		
		li = add(li, 100);
		li = add(li, 120);
		li = add(li, 130);
		li = add(li, 140);
		
		print(li);
		
		
		li = remove(li, 120);
		li = remove(li, 140);
		li = remove(li, 100);
		li = remove(li, 130);
		li = remove(li, 150); //not handled
		
		print(li);
		
		
	}

}
