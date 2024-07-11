package inheritanceSingle;

public class Person {
	int id;
	String name;

	public void display() {
		System.out.println(toString());
	}

	@Override
	public String toString() {
		return "Person has id : " + id + ", Name : " + name;
	}
}
