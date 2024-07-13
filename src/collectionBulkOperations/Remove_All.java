package collectionBulkOperations;

import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class Remove_All {

	public static void main(String[] args) {
		Set<Integer> set1 = new TreeSet<>();
		set1.add(12);
		set1.add(13);
		set1.add(14);

		Set<Integer> set2 = new HashSet<>();
		set2.add(13);
		set2.add(14);

		System.out.println(set1.removeAll(set2));
		System.out.println(set1.toString());

	}

}
