package threading;

public class ThreadOne implements Runnable{
	
	// Implementing runnable interface must override the run method
	
	@Override
	public void run() {
		for (int i = 0; i<5; i++) {
			System.out.println("First Thread");
			try {Thread.sleep(500);}catch(Exception e) {}
		}
	}
	
	
}
