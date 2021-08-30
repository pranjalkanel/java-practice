package collectionPackage;

import java.util.ArrayDeque;

public class ADeque {

	public static void main (String [] args) {
		
		ArrayDeque<Integer> myDeque = new ArrayDeque<>();
		
		myDeque.offer(23);
		myDeque.offer(90);
		myDeque.offerLast(80);
		myDeque.offerFirst(49);
		
			
		System.out.println(myDeque);
		
		myDeque.poll();
		
		System.out.println(myDeque);
		
		// use peekFirst() and peekLast() to see most and least priorotized element
	
		// use pollLast() to get the least priorotized element
	}
}
