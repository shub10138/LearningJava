package arrayDataStructure;

import java.util.Scanner;

public class Searching {

	public static void main(String[] args) {
		int arr[] = { 2, 5, 8, 12, 16, 23, 38, 56, 72, 91 };
		System.out.println("Enter the element to be searched :");
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();

//		Linear search
//		int result = new LinearSearching().LinearSearch(arr, a);

//		Binary search
		int result = new BinarySearching().BinarySearch(arr, 0, arr.length - 1, a);

		if (result == -1) {
			System.out.println("Element Not found!!");
		} else {
			System.out.println("Element is at index : " + result);
		}

	}

}
