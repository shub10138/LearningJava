package finalKeyword;

public class Test {

	public static void main(String[] args) {

		// local final variable
		final int x;
		x = 100;
		System.out.println(x);

		Base b = new Base();
		int constant = b.x;
		System.out.println(constant);

		int globalConstant = Base.MAX;
		System.out.println(globalConstant);

	}

}
