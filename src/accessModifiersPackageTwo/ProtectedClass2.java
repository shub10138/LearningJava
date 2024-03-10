package accessModifiersPackageTwo;

public class ProtectedClass2 {

	protected int marks;
	// protected can be accessed with in the same package and in the
	// extended(inherited classes)

	protected void printMarks(int marks) {
		this.marks = marks;
		System.out.println("You got " + marks);
	}

	public void anyOneCanPrintMarks(int marks) {
		this.marks = marks;
		System.out.println("You got " + marks);
	}

}
