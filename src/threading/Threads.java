package threading;

public class Threads implements Runnable {
	public static void main(String[] args) {
		
		// Declare threads with thread name as parameter in the constructor
		// This makes 'new' threads
        Thread thread1 = new Thread("threadName1");
        Thread thread2 = new Thread("threadName2");
        
        // Start method makes the thread runnable, after the thread runs, its stage is known as running 
        thread1.start();
        thread2.start();
        
        // getName method returns String, which is the name of the thread(as declared above) 
        System.out.println("Thread names are following:");
        System.out.println(thread1.getName());
        System.out.println(thread2.getName());
    }
	
    @Override
    public void run() {
    }
}
