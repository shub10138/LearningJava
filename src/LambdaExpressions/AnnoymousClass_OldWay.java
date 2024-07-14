package LambdaExpressions;

import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.function.Predicate;

public class AnnoymousClass_OldWay {

	public static void main(String[] args) {
//		Predicate<Integer> p = new Predicate<Integer>() {
//			public boolean test(Integer t) {
//				return (t % 2 == 0);
//			}
//		};

		List<Integer> list = Arrays.asList(10, 20, 30, 41, 43);
		printCond(list, new Predicate<Integer>() {
			public boolean test(Integer t) {
				return (t % 2 == 0);
			}
		});
	}

	static void printCond(Collection<Integer> c, Predicate<Integer> p) {
		c.stream().filter(x -> p.test(x)).forEach(x -> System.out.println(x + " "));
	}

}
