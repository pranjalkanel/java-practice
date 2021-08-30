package threading;

public class MultiThreading {

	public static void main(String[] args) {
		
		// objects of thread classes are runnable since they implement the runnable interface
		Runnable obj1 = new ThreadOne();
		Runnable obj2 = new ThreadTwo();
		
		/* To run a thread, 
		 * 1 -> either implement Thread class in the custom thread
		 * 2 -> create a run method in the class that implements runnable interface
		 * 		i.e. run() contains creation of new thread object and calling the run method
		 * 3 -> call the run method from the thread object in the calling class i.e. in this case, class wtih main method
		 * 		and pass the custom-thread object (ThreadOne and ThreadTwo) 
		 * Method 3 has been implemented in this case, 
		 * For method 2, refer to the bookmark
		 * */
		
		Thread thread1 = new Thread(obj1);
		Thread thread2 = new Thread(obj2);
		
		thread1.start();
		System.out.println(thread1.getName());
		// delaying the main thread
		try {Thread.sleep(10);}catch(Exception e) {}
		thread2.start();
		System.out.println(thread2.getName());
	}
}
