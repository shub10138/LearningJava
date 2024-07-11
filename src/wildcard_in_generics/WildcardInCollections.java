package wildcard_in_generics;

import java.util.Collection;

public class WildcardInCollections {

	void printCollection(Collection<?> C) {
		for (Object e : C) {
			System.out.println(e + " ");
		}
	}
}
