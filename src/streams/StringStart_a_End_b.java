package streams;

import java.util.Arrays;

public class StringStart_a_End_b {

	public static void main(String[] args) {
		String arr[] = { "aec", "aef", "fgh", "abc" };

		Arrays.stream(arr)
				.filter(x -> x.startsWith("a"))
				.filter(x -> x.endsWith("c"))
				.sorted() // to print in lexicographic
				.forEach(System.out::println);

	}

}
