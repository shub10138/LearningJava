package arrayDataStructure;

public class LinearSearching {

	public static int LinearSearch(int arr[], int a) {
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] == a) {
				return i;
			}
		}
		return -1;
	}

}
