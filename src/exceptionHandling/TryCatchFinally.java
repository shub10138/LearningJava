package exceptionHandling;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class TryCatchFinally {
	public static void main(String[] args) {
		try {
			Scanner sc = new Scanner(new File("test.in"));
			System.out.println("Exit main()");
		} catch (FileNotFoundException ex) {
			System.out.println("File Not Found caught....");
		} finally {
			System.out.println("Finally block runs regardless of the state of exception");
		}

		System.out.println("After Try-Catch-Finally, life goes on...");
	}
}
