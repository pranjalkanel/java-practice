package collectionPackage;

import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class LQueue {

	public static void main (String [] args) {
		Queue<Integer> myQueue = new LinkedList<>();
		
		// offer returns false if it fails to insert
		myQueue.offer(9);	
		// add throws illegal state exception if failed to insert
		myQueue.add(1);
		myQueue.add(3);
		myQueue.add(2);
		
		// get value in queue
		myQueue.poll();
	}
}
