package accessModifiersPackageOne;

import java.util.Scanner;

public class PrivateClass1 {

	public static void main(String[] args) {

		PrivateClass2 p2 = new PrivateClass2();
		// p2.name = "Shubham";
		// can't access name directly as it is private and can only be accessed with in
		// the same declared class only

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your name");
		String name = sc.next();
		p2.nameInput(name);

		sc.close();
	}

}
