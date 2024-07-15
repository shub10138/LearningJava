package streams;

import java.util.Arrays;

public class SumOfArray {

	public static void main(String[] args) {
		int arr[] = { 10, 20, 30, 40 };

		int sum = Arrays.stream(arr)
				        .sum();

		System.out.println(sum);

	}

}
