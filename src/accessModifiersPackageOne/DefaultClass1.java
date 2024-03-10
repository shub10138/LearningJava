package accessModifiersPackageOne;

import java.util.Scanner;

import accessModifiersPackageTwo.*;

public class DefaultClass1 {

	public static void main(String[] args) {
		DefaultClass2 d2 = new DefaultClass2();

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number");

		// d2.number = sc.nextInt();
		// number have default access that means it can only be accessed with in the
		// same package and not here

		int number = sc.nextInt();
		d2.anyNumberPrint(number);

		sc.close();
	}

}
