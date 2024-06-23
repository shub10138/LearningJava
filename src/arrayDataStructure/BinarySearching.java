package arrayDataStructure;

public class BinarySearching {

	public static int BinarySearch(int arr[], int l, int r, int a) {

		if (r >= l) {
			int mid = l + (r - l) / 2;

			if (arr[mid] == a)
				return mid;

			if (arr[mid] > a)
				return BinarySearch(arr, l, mid - 1, a);

			return BinarySearch(arr, mid + 1, r, a);
		}

		return -1;
	}
}
