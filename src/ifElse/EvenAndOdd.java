package ifElse;

import java.util.*;

public class EvenAndOdd {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();

		if (n % 2 == 0) {
			System.out.println("The number is Even");
		} else {
			System.out.println("The number is Odd");
		}

	}

}
