package multithreading;

import java.util.Iterator;

public class Main {

	public static void main(String[] args) throws InterruptedException {
		TestThread t1 = new TestThread();
		t1.start();
		for (int i = 0; i < 5; i++) {
			System.out.println("Inside Main Thread");
			Thread.sleep(1);
		}
		Thread t2 = new Thread(new TestRunnable());
		t2.start();
		for (int i = 0; i < 5; i++) {
			System.out.println("Inside Runnable Main Thread");
			Thread.sleep(1);
		}
	}

}
