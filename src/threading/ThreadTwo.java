package threading;

public class ThreadTwo implements Runnable {

	@Override
	public void run() {
		for (int i=0; i< 5;i++) {
			System.out.println("Second Thread");
			try {Thread.sleep(500);}catch(Exception e) {}
		}
	}
}
