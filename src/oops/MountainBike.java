package oops;

public class MountainBike extends Bike {

	int seatHight;
	String hidingField = "20";

	// Mandatory to add a constructor if we have overridden the default constructor
	// of the parent class
	public MountainBike(int speed, int gear, int startHight) {
		super(speed, gear); // Should be first statement in here
		seatHight += startHight;
	}

	// II
	public void setHeight(int newHight) {
		seatHight += newHight;
	}

	// Overriden III
	@Override
	public String printInfo() {
		System.out.println("Hiding Field Value of parent class: " + super.hidingField);
		System.out.println("Hiding Field Value of Child class: " + hidingField);
		return (super.printInfo() + "\n" + "Seat Hight : " + seatHight);
	}
}
