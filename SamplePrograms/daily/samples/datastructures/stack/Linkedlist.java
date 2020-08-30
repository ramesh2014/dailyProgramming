package daily.samples.datastructures.stack;

//creation of node, insertion, deletion, find
public class Linkedlist {
	
	Node head;
	
	static class Node{
		int data;
		Node next;
		
		Node(int data){
			this.data = data;
			this.next = null;
		}
	}
	
	static Linkedlist insert(Linkedlist list, int data) {
		
		Node new_node = new Node(data);
		
		if(list.head == null) {
			list.head = new_node;
		}else {
			Node last = list.head;
			
			while(last.next != null) {
				last = last.next;
			}
			
			last.next = new_node;
		}
		
		return list;
	}
	
	static void printList(Linkedlist list) {
		
		if(list == null) {
			System.out.println("Linkedlist is Empty");
		}else {
			Node currNode = list.head;
			
			if ( currNode == null) {
				System.out.println("Linkedlist is Empty");
			}
			while (currNode != null) {
				System.out.println("Data in list: " + currNode.data);
				currNode = currNode.next;
			}
		}	
	}
	
/*	static Linkedlist delete(Linkedlist list, int data) {
		
		Node head = list.head;
		Node previous = head;
		boolean dataFound = false;
		
		while(head != null) {
			
			if(head.data == data) {
			
			   dataFound = true;
			   if( head == previous && head.next == null) {
				   list = null;
			   }else if( head == previous && head.next != null) {
				   list.head = head.next;
				   previous = list.head;
			   }
			   else if ( head.next == null && previous.next != null) {
				   previous.next = null;
			   }else {
				   previous.next = 	head.next;
				   head.next = null;
			   }
			   
			   System.out.println("Found the data and removed: "+ data);
			}
			
			previous = head;
			head = head.next;
		}
		
		if(!dataFound)
			System.out.println("Data not found to be removed from list: "+ data);
		
		return list;
	}
*/
	
	static Linkedlist delete(Linkedlist list, int data) {
		
		Node currNode = list.head;
		Node previous = null;
		
		//case1: if removing element is head
		if(currNode != null && currNode.data == data) {
			list.head = currNode.next;
			System.out.println("Data found and deleted: "+data);
			return list;
		}
		
		//case2: if removing element is at middle or at last
		while( currNode != null && currNode.data != data) {
			previous = currNode;
			currNode = currNode.next;
		}
		
		if(currNode != null) {
			previous.next = currNode.next;
			System.out.println("Data found and deleted: "+data);
		}else
			System.out.println("Data not found: "+data);
		return list;
	}
	
	public static void main(String[] args) {
		
		Linkedlist list = new Linkedlist();
		
		list = insert(list,1);
		list = insert(list,2);
		list = insert(list,3);
//		list = insert(list,4);
//		
//		list = delete(list,5);
		
		printList(list);
		
		list = delete(list,3);
		list = delete(list,2);
//		list = delete(list,1);
		
		
		printList(list);
		
	}

}
