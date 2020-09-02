package daily.samples.datastructures.stack;

import java.lang.reflect.Array;
import java.util.Stack;

/*
 * Java Collection framework provides a Stack class which models and implements Stack data structure. 
 * The class is based on the basic principle of last-in-first-out. 
 * In addition to the basic push and pop operations, the class provides three more functions of empty, 
 * search and peek. The class can also be said to extend Vector and treats the class as a stack with the 
 * five mentioned functions. The class can also be referred to as the subclass of Vector.
 * 
 * https://www.geeksforgeeks.org/stack-class-in-java/
 */
public class StackJavaTest {

	public static void main(String[] args) {
		Stack<Integer> stack = new Stack<Integer>();
		
		//stack push
		System.out.println("Push :");
		for(int i = 0; i < 5; i++) 
        { 
            stack.push(i); 
        }
		
		//stack pop
		System.out.println("Pop :"); 
		  
        for(int i = 0; i < 5; i++) 
        { 
            Integer y = (Integer) stack.pop(); 
            System.out.println(y); 
        }
        
        //stack push
      	System.out.println("Push :");
  		for(int i = 0; i < 5; i++) 
	    { 
	          stack.push(i); 
	    }
  		
  		// Displaying element on the top of the stack 
        Integer element = (Integer) stack.peek(); 
        System.out.println("Element on stack top : " + element);
        
  		// Searching element in the stack 
  		Integer pos = (Integer) stack.search(2); 
  	  
        if(pos == -1) 
            System.out.println("Element not found"); 
        else
            System.out.println("Element is found at position " + pos);
        
        pos = (Integer) stack.search(6); 
    	  
        if(pos == -1) 
            System.out.println("Element not found: " + pos); 
        else
            System.out.println("Element is found at position " + pos);
        

//        public static void main(String[] args) {
//        	String[][] strarr = (String[][]) Array.newInstance(String.class, 3,3);  
//        	  
//            Array.set(strarr[0], 0, "javaTpoint");  
//            Array.set(strarr[1], 1, ".Net");  
//            Array.set(strarr[2], 2, "c#");  
//
//            System.out.println("Array[0][0] = " + Array.get(strarr[0], 0));  
//            System.out.println("Array[1][1] = " + Array.get(strarr[1], 1));  
//            System.out.println("Array[2][2] = " + Array.get(strarr[2], 2));  
//        	}
//		}
	}
}
