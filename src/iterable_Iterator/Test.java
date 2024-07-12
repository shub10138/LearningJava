package iterable_Iterator;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class Test {

	static void removeEven(Collection<Integer> c) {
		Iterator<Integer> searchEven = c.iterator();
		while (searchEven.hasNext()) {
			int x = searchEven.next(); // .next() does two things returns the next element
										// and move the iterator to next in between position
			if (x % 2 == 0)
				searchEven.remove(); // .remove() removes the previous element of iterator
		}
	}

	public static void main(String[] args) {
		Collection<Integer> c = new ArrayList<>();
		c.add(10);
		c.add(15);
		c.add(20);
		Test.removeEven(c);
		System.out.println(c.toString());
	}

}
