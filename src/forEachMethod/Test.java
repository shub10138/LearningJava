package forEachMethod;

import java.util.Arrays;
import java.util.List;

public class Test {

	public static void main(String[] args) {
		List<Integer> l = Arrays.asList(10, 20, 30, 40, 50);

		l.forEach(System.out::println);
		// or
		l.forEach(x -> System.out.println(" " + x));
		// need to print line above line 13 is needs to modify the output
		l.forEach(x -> System.out.println("  " + 2 * x));

	}

}
