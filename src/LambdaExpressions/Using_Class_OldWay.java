package LambdaExpressions;

import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.function.Predicate;

public class Using_Class_OldWay {

	public static void main(String[] args) {

		class myPredicate implements Predicate<Integer> {
			@Override
			public boolean test(Integer t) {
				return (t % 2 == 0);
			}
		}

		List<Integer> list1 = Arrays.asList(10, 20, 30, 21, 23, 27);

		printCond(list1, new myPredicate());

	}

	static void printCond(Collection<Integer> c, Predicate<Integer> p) {

		c.stream().filter(p::test).forEach(x -> System.out.print(x + " "));

	}

}
