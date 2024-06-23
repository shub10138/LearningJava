package oops;

import java.util.Scanner;

public class TestEncaptulation {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		// Encapsulation & data hiding
		Encapsulation en = new Encapsulation();
		System.out.println("Enter name of student");
		en.setName(sc.nextLine());
		System.out.println("Enter the CGPA");
		en.setCGPA(sc.nextFloat());
		System.out.println("Enter the number of students");
		Encapsulation.setNumberOfStudents(sc.nextInt());
		System.out.println("Name :" + en.getName() + "\n" + "CGPS :" + en.getCGPA() + "\n" + "Number of students :"
				+ Encapsulation.getNumberOfStudents());

		sc.close();
		
	}

}
