package ifElse;

import java.util.*;

public class SumOfNaturalNumbers {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter any natural number");
		int n = sc.nextInt();

		if (n < 0) {
			System.out.println("You have netered a wrong number");
			return;
		}
		System.out.println(n * (n + 1) / 2);
	}
}
