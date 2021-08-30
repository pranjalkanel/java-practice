package collectionPackage;

import java.util.Comparator;
import java.util.PriorityQueue;

public class PQueue {
	
	public static void main (String [] args) {
		
		// declare comparator for priority behavior
		PriorityQueue<Integer> myQueue = new PriorityQueue<>(Comparator.reverseOrder());
		
		myQueue.add(100);
		myQueue.add(102);
		myQueue.add(3);
		myQueue.add(4);
		myQueue.add(5);
		myQueue.add(12);
		
		System.out.println(myQueue);
		
		myQueue.poll();
		
		System.out.println(myQueue);
	}
}
