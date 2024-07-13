package collectionBulkOperations;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class Add_All {

	public static void main(String[] args) {

		Set<Integer> set1 = new TreeSet<>();
		set1.add(12);
		set1.add(13);
		set1.add(14);

		Set<Integer> set2 = new HashSet<>();
		set2.add(13);
		set2.add(14);
//		set2.add(15);

		System.out.println(set1.addAll(set2));
		System.out.println(set1.toString());
	}

}
