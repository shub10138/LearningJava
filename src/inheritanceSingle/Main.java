package inheritanceSingle;

public class Main {

	public static void main(String[] args) {
		Employee emp = new Employee();
		emp.id = 22;
		emp.name = "Shubham";
		emp.salary = 2000000;
		emp.designation = "SDE2";

		emp.display();

		Person p = new Person();
		p.id = 3;
		p.name = "Avinash";

		p.display();

	}

}
