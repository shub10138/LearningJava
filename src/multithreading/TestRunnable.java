package multithreading;

public class TestRunnable implements Runnable {

	public void run() {
		for (int i = 0; i < 5; i++)
			System.out.println("Inside Runnable Test Thread");
	}
}
