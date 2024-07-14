package LambdaExpressions;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class MethodReference {

	public static void main(String[] args) {
		List<Integer> list = new ArrayList<>();
		list.add(10);
		list.add(12);
		list.add(13);
		list.add(14);
		list.add(15);
		list.forEach(MethodReference::printSquare);

		String[] s1 = { "GfG", "IDE", "JAVA" };
		String[] s2 = { "gfg", "ide", "java" };

		if (Arrays.equals(s1, s2, String::compareToIgnoreCase))
			System.out.println("Yes");
		else
			System.out.println("No");

	}

	public static void printSquare(Integer x) {
		System.out.println(x * x);
	}
}
