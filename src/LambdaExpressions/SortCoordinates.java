package LambdaExpressions;

import java.util.Arrays;

public class SortCoordinates {

	public static void main(String[] args) {
		Points[] p = { new Points(10, 20), new Points(5, 30), new Points(20, 50), new Points(2, 40) };
		// here p1.x - p2.x returns negative(p1.x is smaller), zero(p1.x=p2.x) and
		// positive(p2.x is smaller) value
		Arrays.sort(p, (p1, p2) -> p1.x - p2.x);
		for (Points pt : p) {
			System.out.println(pt.x + "," + pt.y);
		}
	}

}
