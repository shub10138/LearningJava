package toArrayMethod;

import java.util.HashSet;
import java.util.Set;

public class GenericToArray {

	public static void main(String[] args) {
		Set<Integer> s = new HashSet<>();
		s.add(10);
		s.add(30);
		s.add(12);
		s.add(1);

		Integer[] arr = new Integer[s.size()];
		arr = s.toArray(arr);

		for (Integer x : arr) {
			System.out.println(x + " ");
		}
	}

}
