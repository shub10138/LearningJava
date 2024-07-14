package LambdaExpressions;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.function.Predicate;

public class Lambda_Expression_NewWay {

	public static void main(String[] args) {
		List<Integer> list = new ArrayList<>(Arrays.asList(10, 20, 30, 40, 51, 73, 91, 11));
		prodCond(list, x -> x % 2 == 0);

	}

	static void prodCond(Collection<Integer> c, Predicate<Integer> p) {
		c.stream().filter(x -> p.test(x)).forEach(x -> System.out.println(x + " "));
	}

}
