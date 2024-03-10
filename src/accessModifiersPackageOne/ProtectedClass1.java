package accessModifiersPackageOne;

import java.util.Scanner;

import accessModifiersPackageTwo.ProtectedClass2;

public class ProtectedClass1 extends ProtectedClass2 {

	public static void main(String[] args) {
		ProtectedClass2 p2 = new ProtectedClass2();

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your marks");

		int marks = sc.nextInt();
		p2.anyOneCanPrintMarks(marks);

	}

}
