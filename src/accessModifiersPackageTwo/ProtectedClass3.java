package accessModifiersPackageTwo;

import java.util.Scanner;

public class ProtectedClass3 {

	public static void main(String[] args) {

		ProtectedClass2 p2 = new ProtectedClass2();

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your marks");

		int marks = sc.nextInt();
		p2.printMarks(marks);

	}

}
