package generics;

public class TestMyGen {

	public static void main(String[] args) {
		MyGen<Integer> m1 = new MyGen<>();
		MyGen<String> m2 = new MyGen<>();

		System.out.println(m1.count);
		System.out.println(m2.count);// both line 9 & 10 have same o/p because count is static(class specific)
		System.out.println(MyGen.count);
	}

}
