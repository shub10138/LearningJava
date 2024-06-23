package arrayDataStructure;

public class BubbleSorting {

	public static void bubbleSort(int arr[], int n) {
		Boolean swapCheck;
		for (int i = 0; i < n - 1; i++) {
			swapCheck = false;
			for (int j = 0; j < n - i - 1; j++) {
				if (arr[j] > arr[j + 1]) {
					Swapping.swap(arr, j, j + 1);
					swapCheck = true;
				}
			}
			if (swapCheck == false) {
				break;
			}
		}

	}
}
