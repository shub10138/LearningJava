package collectionBulkOperations;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Contains_All {

	public static void main(String[] args) {

		List<Integer> list1 = new ArrayList<>();
		list1.add(10);
		list1.add(20);
		list1.add(30);

		List<Integer> list2 = new LinkedList<>();
		list2.add(10);
		list2.add(30);
		list2.add(30);
		list2.add(12);

		System.out.println(list1.containsAll(list2));
	}

}
