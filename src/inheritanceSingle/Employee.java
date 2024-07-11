package inheritanceSingle;

public class Employee extends Person {
	int salary;
	String designation;

	public void display() {
		System.out.println(toString());
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "Employee has Salary : " + salary + ", Designation : " + designation;
	}
}
