package oops;

public class Encapsulation {

	public String name;
	private float cGPA;
	private static int numberOfStudents;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public float getCGPA() {
		return cGPA;
	}

	public void setCGPA(float cGPA) {
		this.cGPA = cGPA;
	}

	public static int getNumberOfStudents() {
		return numberOfStudents;
	}

	public static void setNumberOfStudents(int numberOfStudents) {
		Encapsulation.numberOfStudents = numberOfStudents;
	}

}
