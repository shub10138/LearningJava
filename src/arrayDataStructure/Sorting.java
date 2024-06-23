package arrayDataStructure;

public class Sorting {

	public static void main(String[] args) {
		int arr[] = { 64, 34, 25, 12, 22, 11, 90 };
		int n = arr.length;

		System.out.println("Before Sorting :");
		Printing.print(arr);

		BubbleSorting.bubbleSort(arr, n);
		System.out.println();

		System.out.println("After Sorting :");
		Printing.print(arr);

	}

}
