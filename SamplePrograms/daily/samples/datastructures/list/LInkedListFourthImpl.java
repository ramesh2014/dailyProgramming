package daily.samples.datastructures.list;

public class LInkedListFourthImpl {

	Node head;
	
	static class Node{
		Node next;
		int data;
		
		Node(int data){
			this.data = data;
			this.next = null;
		}
	}
	
	static LInkedListFourthImpl insert(LInkedListFourthImpl li, int data) {
		
		Node new_node = new Node(data);
		Node currNode = li.head;
		
		if(currNode == null) {
			li.head = new_node;
		}else {
			
			while(currNode.next != null) {
				currNode = currNode.next;
			}
			
			currNode.next = new_node;
		}
		
		return li;
	}
	
	static void print(LInkedListFourthImpl li) {
		
		Node last_node = li.head;
		
		if(last_node == null) {
			System.out.println("List is empty");
		}else {
			while( last_node != null) {
				System.out.println("Data added in list: "+last_node.data);
				last_node = last_node.next;
			}
		}
	}

	static LInkedListFourthImpl remove(LInkedListFourthImpl li, int data) {
		
		Node currNode = li.head;
		Node previousNode = null;
		
		if(currNode == null) {
			System.out.println("List is empty");
			return li;
		}
		
		if(currNode != null && currNode.data == data) {
			System.out.println("Data found in head node and deleted: "+data);
			li.head = currNode.next;
			return li;
		}else {
			
			while(currNode.next != null && currNode.data != data) {
				previousNode = currNode;
				currNode = currNode.next;
			}
		}
		
		if( currNode !=null && currNode.data == data) {
			previousNode.next = currNode.next;
			System.out.println("Data found and deleted: "+data);
		}else {
			System.out.println("Data NOT found: "+data);
		}
		return li;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		LInkedListFourthImpl li = new LInkedListFourthImpl();
		
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
