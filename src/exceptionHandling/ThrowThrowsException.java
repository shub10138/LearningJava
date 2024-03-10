package exceptionHandling;

import java.util.Scanner;

public class ThrowThrowsException {

	public static void main(String[] args) {
		try {
			int result = methodA();
			System.out.println("Final result is : " + result);
		} catch (ArithmeticException ex) {
			System.out.println("Arthematic Exception detected");
			// ex.printStackTrace();
		} catch (ArrayIndexOutOfBoundsException ex) {
			System.out.println("Array Index Out Of Bound Exception detected");
			// ex.printStackTrace();
		} catch (Exception ex) {
			System.out.println("A new typr of exception is detected");
		} finally {
			System.out.println("Moving forward");
		}
		System.out.println("Next steps in the program");

	}

	public static int methodA() throws ArithmeticException, ArrayIndexOutOfBoundsException {
		int divResult = methodB();
		int arr[] = { 1, 4, 8 };
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter index of the number to be added");
		int i = sc.nextInt();
		int addMagicNumber = divResult + arr[i];
		System.out.println("End of method A");
		sc.close();
		return addMagicNumber;
	}

	public static int methodB() throws ArithmeticException {
		int a = 10, b, div;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number to devide 5 with");
		b = sc.nextInt();
		if (b == 0) {
			sc.close();
			throw new ArithmeticException();
		} else {
			div = a / b;
		}
		System.out.println("End of method B");
		sc.close();
		return div;
	}
}
