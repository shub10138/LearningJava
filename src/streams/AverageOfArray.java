package streams;

import java.util.Arrays;

public class AverageOfArray {

	public static void main(String[] args) {
		int arr[] = { 10, 20, 30, 40 };

		double avg = Arrays.stream(arr).average().getAsDouble();

		System.out.println(avg);
	}

}
