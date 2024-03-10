package exceptionHandling;

import java.util.Scanner;

public class ArrayIndexException {

	public static void main(String[] args) {

		int arr[] = { 1, 4, 8 };
		int sum;
		Scanner sc = new Scanner(System.in);
		try {
			System.out.println("Enter first number index");
			int i = sc.nextInt();
			System.out.println("Enter second number index");
			int j = sc.nextInt();
			sum = arr[i] + arr[j];
			System.out.println("Sum is : " + sum);
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("Please enter a valid index from 0 to 2");
		}

	}

}
