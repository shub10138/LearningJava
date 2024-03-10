package ifElse;

import java.util.*;

public class WhatsTheNumber {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter any number");
		int n = sc.nextInt();

		if (n == 0) {
			System.out.println("Zero");
			return;
		}

		if (n < 0) {
			System.out.print("Negative ");
		} else {
			System.out.print("Positive ");
		}

		if (n % 2 == 0) {
			System.out.println("Even");
		} else {
			System.out.println("Odd");
		}

	}

}
