package daily.samples.datastructures.stack;

public class StackImplTest {

	public static void main(String[] args) {
		
		StackImplUsingArrays stack = new StackImplUsingArrays();
		
//		stack.push(5);
//		stack.push(3);
//		stack.push(2);
		
		System.out.println("Stack pushed with elements");
		for(int i=1; i<=100;i++) {
			stack.push(i);
		}
		
//		System.out.println("Stack pop");
//		for(int i=1; i<=100;i++) {
//			System.out.println(stack.pop());
//		}
		
		if(stack.isEmpty()) {
			System.out.println("Stack is Empty");
		}else {
			System.out.println("Stack is NOT Empty");
		}
		
		System.out.println("Stack peek: "+stack.peek());
		
		//stack.display();
	}
}
