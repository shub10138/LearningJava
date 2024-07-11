package generics;

public class testGenerics {

	public static void main(String[] args) {
		Pair<Integer, String> p = new Pair<>();
		p.x = 12;
		p.y = "Shubham";
		String str = (String) p.x; // We are getting a compiler error which is good
		// Without generic this would't give any compiler error and will run and then
		// produce runtime error
		// java.lang.Integer cannot be cast to class java.lang.String (E.x: run test
		// class)

	}

}
