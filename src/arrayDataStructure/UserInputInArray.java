package arrayDataStructure;

import java.util.Scanner;

public class UserInputInArray {

	public static void main(String[] args) {

		System.out.println("Enter the size of Array");
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int arr[] = new int[n];

		for (int i = 0; i < arr.length; i++) {
			arr[i] = sc.nextInt();
		}
		System.out.print("Entered Array : ");
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
	}

}
