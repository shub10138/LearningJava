package oops;

public class TestPolymorphism {

	public static void main(String[] args) {
		// Compilation Error:- Type mismatch: cannot convert from Bike to MountainBike
		// MountainBike obj = new Bike(100, 3);
		// Reference of Child and Instance or object of parent is not allowed

		// MountainBike obj = new MountainBike(100, 3, 23); // Type I, II and Overridden
		// III accessible

		/*
		 * Substituting a subclass instance for its superclass is called "up-casting".
		 */
		// Up-casting is always safe
		Bike obj = new MountainBike(100, 3, 23); // Type I and Overridden III
		// accessible

		// In above line, if required, we can convert obj back into MountainBike as:
		// (MountainBike)obj
		// This is called "down-casting".

		// Bike obj = new Bike(100, 3); // Type I and Original III accessible

		obj.speedUp(120); // I
		obj.applyBreakes(5); // I
		// obj.setHeight(30); // II

		System.out.println(obj.printInfo()); // Overridden III
		/*
		 * obj.printInfo() :- Dynamic Binding (or Late-Binding or Run-Time Binding).
		 * When method is invoked, the code to be executed is only determined at the
		 * run-time.
		 */
	}

}
