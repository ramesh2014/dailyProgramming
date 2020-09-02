package daily.samples.datastructures.stack;

/*
 * Providing 5 basic operations: POP, PUSH, ISEMPTY, SEEK, TOP, DISPLAY
 */
public class StackImplUsingArrays {

	int stackMax = 100;
	int[] stack = new int[stackMax];
	int top = -1;
	
	public void push(int value) {
		if (top == stackMax-1) {
			System.out.println("Stack Overflow");
			return;
		}else {
			top ++;
			stack[top] = value;
		}
		System.out.println("Element pushed: "+stack[top]);
	}
	
	public int pop() {
		int returnValue;
		if(top == -1) {
			System.out.println("Stack Underflow");
		}
		returnValue = stack[top];
		top --;
		return returnValue;
	}
	
	public boolean isEmpty() {
		return top == -1 ? true : false;
	}
	
	public int peek() {
		return stack[top];
	}
	
	public void display() {
		System.out.println("Displaying all values in Stack");
		for(int i=0; i<=top; i++) {
			System.out.println(stack[i]);
		}
	}
}
