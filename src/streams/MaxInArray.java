package streams;

import java.util.Arrays;

public class MaxInArray {

	public static void main(String[] args) {
		int arr[] = { 10, 100, 30, 40 };

		int max = Arrays.stream(arr).max().getAsInt();

		System.out.println(max);
	}

}
