package iterable_Iterator;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class RemoveByCondition {

	public static void main(String[] args) {
		Collection<Integer> c = new ArrayList<>();
		c.add(10);
		c.add(15);
		c.add(20);
		RemoveByCondition.removeByCond(c);
		System.out.println(c.toString());
	}

	static void removeByCond(Collection<?> c) {
		Iterator<?> it = c.iterator();
		while (it.hasNext()) {
			if (RemoveByCondition.cond(it.next()))
				it.remove();
		}
	}

	static boolean cond(Object i) {
		if ((Integer) i % 2 == 0)
			return true;
		else
			return false;
	}

}
