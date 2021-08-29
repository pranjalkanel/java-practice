package collectionPackage;

import java.util.Stack;

public class LStack {

	
	public static void main(String [] args) {
		// Declaring stack that holds string
		Stack<String> myStack = new Stack<>();
		
		myStack.push("hi");
		myStack.push("bye");
		
		// peek only looks at the top most element without taking it out of stack
		System.out.println(myStack.peek());
		
		// pop() pops out, or takes out the top most item of the stack
		System.out.println(myStack.pop());
		System.out.println(myStack.pop());
		
	}
}
