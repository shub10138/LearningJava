package generics;

public class FunctionTest {

	public static void main(String[] args) {
		Integer arr[] = { 1, 2, 1, 4, 1, 6, 1, 1, 1 };
		int x = 1;
		System.out.println(GenericFunction.count(arr, x));
	}

}
