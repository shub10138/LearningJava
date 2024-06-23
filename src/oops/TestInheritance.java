package oops;

public class TestInheritance {

	public static void main(String[] args) {
		MountainBike mb = new MountainBike(23, 3, 30);
		System.out.println(mb.printInfo() + "\n");
		mb.speedUp(50);
		mb.gear++;
		System.out.println(mb.printInfo() + "\n");
		mb.setHeight(35);
		System.out.println(mb.printInfo() + "\n");
	}

}
