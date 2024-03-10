package accessModifiersPackageTwo;

import java.util.Scanner;

public class DefaultClass3 {

	public static void main(String[] args) {
		DefaultClass2 d2 = new DefaultClass2();

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number");
		d2.number = sc.nextInt();
		d2.printNumber();

		sc.close();

	}

}
