package oops;

public class Bike {
	int speed;
	int gear;
	int hidingField = 10;

	Bike(int speed, int gear) {
		this.speed = speed;
		this.gear = gear;
	}

	// I
	public void applyBreakes(int decrement) {
		speed -= decrement;
	}

	// I
	public void speedUp(int increment) {
		speed += increment;
	}

	// original III
	public String printInfo() {
		return ("Number of gears : " + gear + "\n" + "speed is : " + speed);
	}

}
