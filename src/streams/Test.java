package streams;

import java.util.Arrays;
import java.util.List;

public class Test {

	public static void main(String[] args) {
		List<Integer> l = Arrays.asList(10, 15, 7, 20, 40);

		l.stream().forEach(x -> System.out.println(x + " "));

		l.stream().filter(x -> x > 10).filter(x -> x % 2 == 0).forEach(x -> System.out.println(" " + x + " "));
	}

}
