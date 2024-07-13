package collectionBulkOperations;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class Remove_If {

	public static void main(String[] args) {
		Set<Integer> set1 = new TreeSet<>();
		set1.add(12);
		set1.add(13);
		set1.add(14);
		set1.add(20);
		set1.add(11);

		set1.removeIf((n) -> (n % 2 == 0));

		System.out.println(set1.toString());

	}

}
