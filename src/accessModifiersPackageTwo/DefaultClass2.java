package accessModifiersPackageTwo;

public class DefaultClass2 {

	int number;

	// by default if we don't specify any access modifier it is default by name,
	// means accessed within the package only

	void printNumber() {
		System.out.println("You entered " + number);
	}

	public void anyNumberPrint(int number) {
		this.number = number;
		System.out.println("You entered " + number);
	}
}
