package forEachLoop;

import java.util.Arrays;
import java.util.List;

public class Test {

	public static void main(String[] args) {
		List<Integer> al = Arrays.asList(10, 20, 13, 5, 40);

		for (Integer e : al) {
			e *= 2;
			System.out.print(e + " ");
		}
	}

}
