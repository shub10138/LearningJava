package multithreading;

public class TestThread extends Thread {
	public void run() {
		for (int i = 0; i < 5; i++)
			System.out.println("Inside Test Thread");
	}
}
