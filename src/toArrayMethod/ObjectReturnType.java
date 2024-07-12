package toArrayMethod;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class ObjectReturnType {

	public static void main(String[] args) {
//		List<Integer> l = new ArrayList<>();
		Set<Integer> l = new HashSet<>();
		l.add(10);
		l.add(30);
		l.add(12);
		l.add(2);

		Object arr[] = l.toArray();
		for (Object x : arr) {
			System.out.println(x);
		}

	}

}
